package com.tencent.mm.plugin.appbrand.luggage.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.sdk.platformtools.d;
import junit.framework.Assert;

public final class b
  implements b.f
{
  private int iJ;
  private int iK;
  private int mHeight;
  private int mWidth;

  public b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(86979);
    if (paramInt3 == 0)
    {
      bool2 = true;
      Assert.assertFalse(bool2);
      if (paramInt4 != 0)
        break label71;
    }
    label71: for (boolean bool2 = bool1; ; bool2 = false)
    {
      Assert.assertFalse(bool2);
      this.iJ = paramInt1;
      this.iK = paramInt2;
      this.mWidth = paramInt3;
      this.mHeight = paramInt4;
      AppMethodBeat.o(86979);
      return;
      bool2 = false;
      break;
    }
  }

  public final String wP()
  {
    AppMethodBeat.i(86981);
    String str = String.format("Transformation_x%s_y%s_w%s_h%s", new Object[] { Integer.valueOf(this.iJ), Integer.valueOf(this.iK), Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) });
    AppMethodBeat.o(86981);
    return str;
  }

  public final Bitmap y(Bitmap paramBitmap)
  {
    AppMethodBeat.i(86980);
    if ((paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      AppMethodBeat.o(86980);
      return paramBitmap;
    }
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    int k = this.iJ;
    int m = this.iK;
    label55: label65: int i1;
    int i2;
    if (this.iJ < 0)
    {
      k = 0;
      if (this.iK >= 0)
        break label166;
      m = 0;
      int n = this.mWidth + this.iJ - k;
      i1 = this.mHeight + this.iK - m;
      i2 = n;
      if (k + n > i)
        i2 = i - k;
      if (m + i1 <= j)
        break label248;
      j -= m;
    }
    while (true)
    {
      if ((i2 <= 0) || (j <= 0))
      {
        paramBitmap = d.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        AppMethodBeat.o(86980);
        break;
        if (this.iJ <= i)
          break label55;
        k = i;
        break label55;
        label166: if (this.iK <= j)
          break label65;
        m = j;
        break label65;
      }
      Bitmap localBitmap = d.createBitmap(i2, j, Bitmap.Config.ARGB_8888);
      new Canvas(localBitmap).drawBitmap(paramBitmap, new Rect(k, m, k + i2, m + j), new Rect(0, 0, i2, j), null);
      AppMethodBeat.o(86980);
      paramBitmap = localBitmap;
      break;
      label248: j = i1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.luggage.a.b
 * JD-Core Version:    0.6.2
 */