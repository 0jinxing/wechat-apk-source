package com.tencent.wcdb.extension.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.extension.SQLiteExtension;

public final class MMFtsTokenizer
  implements SQLiteExtension
{
  public static final SQLiteExtension EXTENSION;

  static
  {
    AppMethodBeat.i(12641);
    EXTENSION = new MMFtsTokenizer();
    AppMethodBeat.o(12641);
  }

  private static native void nativeInitialize(long paramLong1, long paramLong2);

  public final void initialize(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(12640);
    nativeInitialize(paramLong1, paramLong2);
    AppMethodBeat.o(12640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.extension.fts.MMFtsTokenizer
 * JD-Core Version:    0.6.2
 */