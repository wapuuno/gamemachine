require 'integration_helper'

module GameMachine
  describe "echo" do 
    context "test" do

      describe "sending messages via udp" do
        it "should do" do
          clients = java.util.concurrent.ConcurrentHashMap.new
          bytes = entity_list.to_byte_array
          puts 'starting udp client test'
          measure(10,10000) do
            Thread.current['c'] ||= Client.new(:seed01)
            Thread.current['c'].send_message(bytes)
            message = Thread.current['c'].receive_message
            Entity.parse_from(message.to_java_bytes)
          end
          puts 'udp client test done'
        end
      end

    end
  end
end
