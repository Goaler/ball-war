package org.goaler.ballwar.client;

import org.goaler.ballwar.msg.Msg;
import org.goaler.ballwar.msg.MsgFans;

public class GameRun implements MsgFans{
	private RoomRun roomRun;
	
	public GameRun(RoomRun roomRun) {
		this.roomRun = roomRun;
	}

	@Override
	public boolean handleMsg(Msg msg) {
		// TODO Auto-generated method stub
		return false;
	}
}
