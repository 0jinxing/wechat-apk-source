package com.tencent.mm.bj;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class b extends a<byte[]>
{
  public static final b fXS;
  private static int fXT;

  static
  {
    AppMethodBeat.i(50895);
    fXS = new b();
    fXT = 0;
    AppMethodBeat.o(50895);
  }

  public final long WW()
  {
    AppMethodBeat.i(50888);
    if (fXT <= 0)
      fXT = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    long l;
    if (fXT >= 512)
    {
      l = 41943040L;
      AppMethodBeat.o(50888);
    }
    while (true)
    {
      return l;
      l = 20971520L;
      AppMethodBeat.o(50888);
    }
  }

  public final long WX()
  {
    return 10485760L;
  }

  public final void WY()
  {
    AppMethodBeat.i(50889);
    super.WY();
    AppMethodBeat.o(50889);
  }

  public final void g(byte[] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(50886);
      super.aR(paramArrayOfByte);
      AppMethodBeat.o(50886);
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
    }
    throw paramArrayOfByte;
  }

  public final byte[] g(Integer paramInteger)
  {
    try
    {
      AppMethodBeat.i(50887);
      byte[] arrayOfByte1 = (byte[])super.d(paramInteger);
      byte[] arrayOfByte2 = arrayOfByte1;
      if (arrayOfByte1 == null)
        arrayOfByte2 = new byte[paramInteger.intValue()];
      AppMethodBeat.o(50887);
      return arrayOfByte2;
    }
    finally
    {
    }
    throw paramInteger;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bj.b
 * JD-Core Version:    0.6.2
 */