package com.tencent.mm.memory;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class g extends a<byte[]>
{
  public static final g fdE;

  static
  {
    AppMethodBeat.i(115377);
    fdE = new g();
    AppMethodBeat.o(115377);
  }

  protected final long WW()
  {
    return 5242880L;
  }

  protected final long WX()
  {
    return 1048576L;
  }

  public final void g(byte[] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(115372);
      Arrays.fill(paramArrayOfByte, (byte)0);
      super.aR(paramArrayOfByte);
      AppMethodBeat.o(115372);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.memory.g
 * JD-Core Version:    0.6.2
 */