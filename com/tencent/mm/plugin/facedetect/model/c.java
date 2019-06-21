package com.tencent.mm.plugin.facedetect.model;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class c extends a<byte[]>
{
  private static int fXT;
  public static final c lTA;

  static
  {
    AppMethodBeat.i(171);
    lTA = new c();
    fXT = 0;
    AppMethodBeat.o(171);
  }

  public static void ea(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(161);
    ab.i("MicroMsg.FaceByteArrayPool", "preloadCameraData, width: %s, height: %s, count: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(5) });
    long l = bo.yz();
    for (int i = 0; i < 5; i++)
      lTA.g(new byte[paramInt1 * paramInt2 * 3 / 2]);
    ab.i("MicroMsg.FaceByteArrayPool", "preloadCameraData used %sms", new Object[] { Long.valueOf(bo.az(l)) });
    AppMethodBeat.o(161);
  }

  public final long WW()
  {
    AppMethodBeat.i(164);
    if (fXT <= 0)
      fXT = ((ActivityManager)ah.getContext().getSystemService("activity")).getLargeMemoryClass();
    long l;
    if (fXT >= 512)
    {
      l = 20971520L;
      AppMethodBeat.o(164);
    }
    while (true)
    {
      return l;
      l = 10485760L;
      AppMethodBeat.o(164);
    }
  }

  public final long WX()
  {
    return 20971520L;
  }

  public final void WY()
  {
    AppMethodBeat.i(165);
    super.WY();
    AppMethodBeat.o(165);
  }

  public final void g(byte[] paramArrayOfByte)
  {
    try
    {
      AppMethodBeat.i(162);
      super.aR(paramArrayOfByte);
      AppMethodBeat.o(162);
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
      AppMethodBeat.i(163);
      byte[] arrayOfByte = (byte[])super.d(paramInteger);
      if (arrayOfByte == null)
        ab.v("MicroMsg.FaceByteArrayPool", "hy: getExactSize no data");
      for (paramInteger = new byte[paramInteger.intValue()]; ; paramInteger = arrayOfByte)
      {
        AppMethodBeat.o(163);
        return paramInteger;
        ab.v("MicroMsg.FaceByteArrayPool", "hy: got exactSize data");
      }
    }
    finally
    {
    }
    throw paramInteger;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.c
 * JD-Core Version:    0.6.2
 */