package com.tencent.wcdb;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum CursorJoiner$Result
{
  static
  {
    AppMethodBeat.i(11993);
    RIGHT = new Result("RIGHT", 0);
    LEFT = new Result("LEFT", 1);
    BOTH = new Result("BOTH", 2);
    $VALUES = new Result[] { RIGHT, LEFT, BOTH };
    AppMethodBeat.o(11993);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.CursorJoiner.Result
 * JD-Core Version:    0.6.2
 */