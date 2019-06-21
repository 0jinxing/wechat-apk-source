package com.facebook.appevents;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum FlushResult
{
  static
  {
    AppMethodBeat.i(72009);
    SUCCESS = new FlushResult("SUCCESS", 0);
    SERVER_ERROR = new FlushResult("SERVER_ERROR", 1);
    NO_CONNECTIVITY = new FlushResult("NO_CONNECTIVITY", 2);
    UNKNOWN_ERROR = new FlushResult("UNKNOWN_ERROR", 3);
    $VALUES = new FlushResult[] { SUCCESS, SERVER_ERROR, NO_CONNECTIVITY, UNKNOWN_ERROR };
    AppMethodBeat.o(72009);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.FlushResult
 * JD-Core Version:    0.6.2
 */