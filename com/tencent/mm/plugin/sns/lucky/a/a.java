package com.tencent.mm.plugin.sns.lucky.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.memory.n;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

public final class a
{
  public static n a(Bitmap paramBitmap, String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35878);
    paramBitmap = n.w(d.e(paramBitmap, paramInt2));
    if (paramBitmap == null)
      ab.e("MicroMsg.BlurHelper", "returnBitmap error2 ");
    if (paramBitmap != null)
      new Canvas(paramBitmap.Xh()).drawColor(paramInt1);
    try
    {
      d.a(paramBitmap.Xh(), 70, Bitmap.CompressFormat.JPEG, paramString, false);
      ab.i("MicroMsg.BlurHelper", "blur done bitmap  ".concat(String.valueOf(paramBitmap)));
      AppMethodBeat.o(35878);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.BlurHelper", "error for exception " + paramString.getMessage());
        ab.printErrStackTrace("MicroMsg.BlurHelper", paramString, "", new Object[0]);
      }
    }
  }

  public static n fV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(35877);
    int i = Color.argb(51, 255, 255, 255);
    paramString1 = i.Xi(paramString1);
    if (paramString1 == null)
    {
      ab.e("MicroMsg.BlurHelper", "returnBitmap error1 ");
      paramString1 = null;
      AppMethodBeat.o(35877);
    }
    while (true)
    {
      return paramString1;
      paramString1 = a(paramString1.Xh(), paramString2, i, 55);
      AppMethodBeat.o(35877);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.lucky.a.a
 * JD-Core Version:    0.6.2
 */