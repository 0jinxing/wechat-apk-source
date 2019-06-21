package com.tencent.mm.plugin.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i
{
  public static Bitmap aW(byte[] paramArrayOfByte)
  {
    Object localObject = null;
    AppMethodBeat.i(62447);
    if (bo.cb(paramArrayOfByte))
    {
      AppMethodBeat.o(62447);
      paramArrayOfByte = localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      int[] arrayOfInt1 = new int[4];
      int[] arrayOfInt2 = new int[4];
      long l = MMWXGFJNI.nativeInitWxAMDecoder();
      if (l == 0L)
        ab.w("MicroMsg.GIF.MMWXGFUtil", "Cpan init wxam decoder failed.");
      int i = MMWXGFJNI.nativeDecodeBufferHeader(l, paramArrayOfByte, paramArrayOfByte.length);
      if (i != 0)
        ab.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF decode buffer header failed. result:%d", new Object[] { Integer.valueOf(i) });
      i = MMWXGFJNI.nativeGetOption(l, paramArrayOfByte, paramArrayOfByte.length, arrayOfInt1);
      if (i != 0)
        ab.w("MicroMsg.GIF.MMWXGFUtil", "Cpan WXGF get option failed. result:%d", new Object[] { Integer.valueOf(i) });
      i = arrayOfInt1[1];
      int j = arrayOfInt1[2];
      if ((i <= 0) || (j <= 0))
      {
        AppMethodBeat.o(62447);
        paramArrayOfByte = localObject;
      }
      else
      {
        paramArrayOfByte = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
        MMWXGFJNI.nativeDecodeBufferFrame(l, null, 0, paramArrayOfByte, arrayOfInt2);
        MMWXGFJNI.nativeUninit(l);
        AppMethodBeat.o(62447);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gif.i
 * JD-Core Version:    0.6.2
 */