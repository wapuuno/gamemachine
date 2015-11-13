package io.gamemachine.routing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.gamemachine.core.GameMessageActor;
import io.gamemachine.messages.GameMessage;

public class RpcTest extends GameMessageActor {

	private static final Logger log = LoggerFactory.getLogger(RpcTest.class);
	@Override
	public void awake() {
		scheduleOnce(1000l, "tick");
		
	}

	@Override
	public void onTick(String message) {
		long startTime = System.nanoTime();
		for (int i=0; i<1;i++) {
			GameMessage gameMessage = new GameMessage();
			//GameMessage response = callRpc("GameMachine.ServerClient.RpcHandler.TestMethod", gameMessage);
			GameMessage response = RpcHandler.callRpc("GameMachine.ServerClient.RpcHandler.TestMethod", gameMessage, "unity1");
		}
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds.
		log.warn("Time "+duration);
		scheduleOnce(100l, "tick");
	}
	
	@Override
	public void onGameMessage(GameMessage gameMessage) {
		// TODO Auto-generated method stub
		
	}

}
