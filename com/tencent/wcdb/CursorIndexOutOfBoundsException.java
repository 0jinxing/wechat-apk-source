package com.tencent.wcdb;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class CursorIndexOutOfBoundsException extends IndexOutOfBoundsException
{
  public CursorIndexOutOfBoundsException(int paramInt1, int paramInt2)
  {
    super("Index " + paramInt1 + " requested, with a size of " + paramInt2);
    AppMethodBeat.i(11989);
    AppMethodBeat.o(11989);
  }

  public CursorIndexOutOfBoundsException(String paramString)
  {
    super(paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.CursorIndexOutOfBoundsException
 * JD-Core Version:    0.6.2
 */