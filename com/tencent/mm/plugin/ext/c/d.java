package com.tencent.mm.plugin.ext.c;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  private static SparseArray<byte[]> lQW;

  static
  {
    AppMethodBeat.i(20416);
    lQW = new SparseArray(1);
    AppMethodBeat.o(20416);
  }

  private static int aR(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[3] & 0xFF | (paramArrayOfByte[2] & 0xFF) << 8 | (paramArrayOfByte[1] & 0xFF) << 16 | (paramArrayOfByte[0] & 0xFF) << 24;
  }

  static d.c brV()
  {
    AppMethodBeat.i(20414);
    d.a locala = new d.a();
    AppMethodBeat.o(20414);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.d
 * JD-Core Version:    0.6.2
 */