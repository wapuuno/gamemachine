require 'rubygems'
require 'game_machine'

RSpec.configure do |config|
  config.before(:suite) do
    GameMachine::Server.instance.init!('member01', :cluster => true)
    GameMachine::Server.instance.start_actor_system
    GameMachine::Server.instance.start_game_systems
    puts "before suite"
  end

  config.before(:each) do
  end

  config.after(:each) do
  end

  config.after(:suite) do
    puts "after suite"
    GameMachine::Server.instance.stop_actor_system
  end
end

CHARS = [*('a'..'z'),*('0'..'9')].flatten
STR = Array.new(100) {|i| CHARS.sample}.join
STR2 = Array.new(1000) {|i| CHARS.sample}.join

def player
  player = Player.new
  player.set_id('2')
  player.set_authtoken('authorized')
end

def entity
  entity = Entity.new
  entity.set_id(STR.to_java_string)
  entity.player = player
  echo_test = EchoTest.new.set_message('testing')
  entity.set_echo_test(echo_test)
  entity
end

def large_entity
  entity = Entity.new
  entity.set_id(STR2.to_java_string)
  entity.set_player(player)
  echo_test = EchoTest.new.set_message('testing')
  entity.set_echo_test(echo_test)
  entity
end

def entity_list
  entity_list = EntityList.new
  entity_list.add_entity(entity)
  entity_list.set_player(player)
  entity_list
end

def large_entity_list
  entity_list = EntityList.new
  10.times do
    entity_list.add_entity(entity)
  end
  entity_list.set_player(player)
  entity_list
end

def measure(num_threads,loops, &blk)
  threads = []
  num_threads.times do |thread_id|
    threads << Thread.new do
      results = []
      loops.times do |i|
        results << Benchmark.realtime do
          yield
        end
      end
      puts "Number = #{results.number} Average #{results.mean} Standard deviation #{results.standard_deviation}"
    end
  end
  threads.map(&:join)
end

