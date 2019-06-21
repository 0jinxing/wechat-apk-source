package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q
{
  public static int b(Bitmap paramBitmap, int paramInt, String paramString)
  {
    AppMethodBeat.i(93393);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      paramInt = -1;
      AppMethodBeat.o(93393);
    }
    while (true)
    {
      return paramInt;
      paramInt = MMJpegOptim.compressByQualityOptim(paramBitmap, paramInt, false, paramString);
      AppMethodBeat.o(93393);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.q
 * JD-Core Version:    0.6.2
 */