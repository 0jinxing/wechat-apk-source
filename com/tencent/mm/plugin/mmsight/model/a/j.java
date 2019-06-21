package com.tencent.mm.plugin.mmsight.model.a;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class j extends a<byte[]>
{
  private static int fXT;
  public static final j owk;

  static
  {
    AppMethodBeat.i(60325);
    owk = new j();
    fXT = 0;
    AppMethodBeat.o(60325);
  }

  public final long WW()
  {
    AppMethodBeat.i(60318);
    if (fXT <= 0)
      fXT = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    long l;
    if (fXT >= 512)
    {
      l = 41943040L;
      AppMethodBeat.o(60318);
    }
    while (true)
    {
      return l;
      l = 20971520L;
      AppMethodBeat.o(60318);
    }
  }

  public final long WX()
  {
    return 10485760L;
  }

  public final void WY()
  {
    AppMethodBeat.i(60319);
    super.WY();
    AppMethodBeat.o(60319);
  }

  public final void g(byte[] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(60316);
      super.aR(paramArrayOfByte);
      AppMethodBeat.o(60316);
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
      AppMethodBeat.i(60317);
      byte[] arrayOfByte1 = (byte[])super.d(paramInteger);
      byte[] arrayOfByte2 = arrayOfByte1;
      if (arrayOfByte1 == null)
        arrayOfByte2 = new byte[paramInteger.intValue()];
      AppMethodBeat.o(60317);
      return arrayOfByte2;
    }
    finally
    {
    }
    throw paramInteger;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.j
 * JD-Core Version:    0.6.2
 */