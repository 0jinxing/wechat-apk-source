package com.tencent.smtt.export.external.interfaces;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ConsoleMessage$MessageLevel
{
  static
  {
    AppMethodBeat.i(63800);
    TIP = new MessageLevel("TIP", 0);
    LOG = new MessageLevel("LOG", 1);
    WARNING = new MessageLevel("WARNING", 2);
    ERROR = new MessageLevel("ERROR", 3);
    DEBUG = new MessageLevel("DEBUG", 4);
    $VALUES = new MessageLevel[] { TIP, LOG, WARNING, ERROR, DEBUG };
    AppMethodBeat.o(63800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.ConsoleMessage.MessageLevel
 * JD-Core Version:    0.6.2
 */