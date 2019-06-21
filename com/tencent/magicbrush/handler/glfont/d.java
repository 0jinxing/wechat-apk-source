package com.tencent.magicbrush.handler.glfont;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d
{
  Bitmap bSR;
  private c bSS;
  Rect bST;
  int[] bSU;

  d(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(115911);
    this.bSS = new k();
    this.bST = new Rect();
    this.bSU = new int[4];
    int i = paramInt1;
    if (paramInt1 <= 0)
      i = 512;
    paramInt1 = paramInt2;
    if (paramInt2 <= 0)
      paramInt1 = 512;
    this.bSR = Bitmap.createBitmap(i, paramInt1, Bitmap.Config.ARGB_8888);
    this.bSS.init(i, paramInt1);
    this.bST.setEmpty();
    AppMethodBeat.o(115911);
  }

  final boolean b(int paramInt1, int paramInt2, Rect paramRect)
  {
    boolean bool = false;
    AppMethodBeat.i(115912);
    if (paramRect == null)
      AppMethodBeat.o(115912);
    while (true)
    {
      return bool;
      if ((paramInt1 <= 0) || (paramInt2 <= 0))
      {
        paramRect.setEmpty();
        AppMethodBeat.o(115912);
      }
      else
      {
        this.bSS.a(paramInt1, paramInt2, paramRect);
        if ((paramRect.left < 0) || (paramRect.right < 0) || (paramRect.width() <= 0) || (paramRect.height() <= 0))
        {
          AppMethodBeat.o(115912);
        }
        else
        {
          this.bST.union(paramRect);
          bool = true;
          AppMethodBeat.o(115912);
        }
      }
    }
  }

  final void clear()
  {
    AppMethodBeat.i(115913);
    this.bST.setEmpty();
    this.bSS.reset();
    if (this.bSR != null)
      this.bSR.eraseColor(0);
    AppMethodBeat.o(115913);
  }

  final int height()
  {
    AppMethodBeat.i(115915);
    int i;
    if (this.bSR != null)
    {
      i = this.bSR.getHeight();
      AppMethodBeat.o(115915);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(115915);
    }
  }

  final int width()
  {
    AppMethodBeat.i(115914);
    int i;
    if (this.bSR != null)
    {
      i = this.bSR.getWidth();
      AppMethodBeat.o(115914);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(115914);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.d
 * JD-Core Version:    0.6.2
 */