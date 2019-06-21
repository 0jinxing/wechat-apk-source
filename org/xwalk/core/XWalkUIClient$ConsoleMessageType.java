package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum XWalkUIClient$ConsoleMessageType
{
  static
  {
    AppMethodBeat.i(85850);
    DEBUG = new ConsoleMessageType("DEBUG", 0);
    ERROR = new ConsoleMessageType("ERROR", 1);
    LOG = new ConsoleMessageType("LOG", 2);
    INFO = new ConsoleMessageType("INFO", 3);
    WARNING = new ConsoleMessageType("WARNING", 4);
    $VALUES = new ConsoleMessageType[] { DEBUG, ERROR, LOG, INFO, WARNING };
    AppMethodBeat.o(85850);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkUIClient.ConsoleMessageType
 * JD-Core Version:    0.6.2
 */