/******************************************************************************************
 * StartPoker.java                 PokerApp                                               *
 *                                                                                        *
 *   Revision History                                                                     *
 * +---------+----------+---------------------------------------------------------------+ *
 * | Version | DATE     | Description                                                   | *
 * +---------+----------+---------------------------------------------------------------+ *
 * |  0.95   | 09/15/04 | Initial documented release                                    | *
 * |  0.96   | 09/17/04 | Additional check when client app is closed to not generate a  | *
 * |         |          | null pointer exception.                                       | *
 * |  0.96   | 09/20/04 | Fixed so that when a player leaves the server, his reg info   | *
 * |         |          | will not continued to be saved on the server. He can join     | *
 * |         |          | the server again without getting denied because of reg.       | *
 * |  0.96   | 09/20/04 | Fixed player getting kicked off of server because of taking   | *
 * |         |          | too long to respond.                                          | *
 * |  0.97   | 10/25/04 | Use encrypted communications to send all pokerapp data across | *
 * |         |          | the network.                                                  | *
 * |  0.98   | 12/06/04 | Add possibility of starting a dedicated server via command    | *
 * |         |          | line options. This includes lots of changes because it was    | *
 * |         |          | assumed the start window would always be there.               | *
 * |  0.98   | 12/06/04 | Added to loadInputFile so that it would read the new options. | *
 * |  0.98   | 12/07/04 | Take restart out of nullifyGame.                              | *
 * |  0.98   | 12/08/04 | Update initGame for bet limit and pot limit games.            | *
 * |  0.98   | 12/09/04 | Fixed error by making dealer = null if server couldn't find   | *
 * |         |          | the next dealer.                                              | *
 * |  0.98   | 12/13/04 | Fixed many of the problems in nextDealer() by making it       | *
 * |         |          | synchronized.                                                 | *
 * |  0.98   | 12/13/04 | Added variables playedInLastGame and firstBlindGamePlayed to  | *
 * |         |          | accomodate making all newcomers pay the big blind their       | *
 * |         |          | first game in.                                                | *
 * |  0.99   | 12/18/04 | Use class NoPreferenceFactory to solve a problem with         | *
 * |         |          | java.util.prefs warnings on Linux and Unix systems.           | *
 * |  0.99   | 05/17/05 | Send END GAME message in nullifyGame function.                | *
 * |  1.00   | 05/26/05 | Modify so that a client can be started as a Java Applet       | *
 * |  1.00   | 05/26/05 | Remove init() call when a client is started.  Unnecessary.    | *
 * |  1.00   | 06/05/05 | Add logging functions.                                        | * 
 * |  1.00   | 08/19/05 | Allow blinds and antes to be selected at the same time.       | *
 * |  1.00   | 10/25/05 | Log stack trace if messageToPlayer fails.                     | *
 * |  1.00   | 07/11/07 | Prepare for open source.  Header/comments/package/etc...      | *
 * +---------+----------+---------------------------------------------------------------+ *
 *                                                                                        *
 * PokerApp Copyright (C) 2004  Dan Puperi                                                *
 *                                                                                        *
 *   This program is free software: you can redistribute it and/or modify                 *
 *   it under the terms of the GNU General Public License as published by                 *
 *   the Free Software Foundation, either version 3 of the License, or                    *
 *   (at your option) any later version.                                                  *
 *                                                                                        *
 *   This program is distributed in the hope that it will be useful,                      *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of                       *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                        *
 *   GNU General Public License for more details.                                         *
 *                                                                                        *
 *   You should have received a copy of the GNU General Public License                    *
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>                 *
 *                                                                                        *
 ******************************************************************************************/

package pl.pragmatists.legacycode.extractandoverride;

/****************************************************
 * StartPoker is the application that will start the Poker server. It can also
 * be used to start a single poker client - however, if only the client is to be
 * be run, PokerApp should be started instead.
 * 
 * @author Dan Puperi
 * @version 1.00
 * 
 **/
public final class StartPoker  {

	/***********************
	 * getCallerClassName() returns a string that was the class name of the
	 * calling class This is useful for not only debugging, but security
	 * purposes.
	 * 
	 * @return The String name of the class which called the function.
	 * 
	 **/
	public static String getCallerClassName() {
		Throwable t = new Throwable();
		t.fillInStackTrace();
		StackTraceElement[] trace = t.getStackTrace();
		return trace[2].getClassName();
	}

}