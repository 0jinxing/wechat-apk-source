package com.tencent.mm.ui.tools;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$3 extends ScaleAnimation
{
  e$3(e parame, float paramFloat1, float paramFloat2, View paramView, e.a parama)
  {
    super(1.0F, paramFloat1, 1.0F, paramFloat2);
  }

  protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    AppMethodBeat.i(107643);
    int j;
    int k;
    int n;
    int i1;
    if ((this.zFr.zES != 0) && (this.zFr.zET != 0) && (this.zFr.zEZ == 1.0F))
    {
      Rect localRect = new Rect();
      this.zFs.getGlobalVisibleRect(localRect);
      int i = (localRect.right - localRect.left) / 2;
      j = (localRect.bottom - localRect.top + this.zFr.zFd) / 2;
      k = (int)(((this.zFr.zES - this.zFr.mWidth) * (1.0F - paramFloat) + this.zFr.mWidth) / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
      int m = (int)(((this.zFr.zET - this.zFr.mHeight) * (1.0F - paramFloat) + this.zFr.mHeight) / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
      if (this.zFr.zEZ != 1.0F)
      {
        this.zFr.zEW = (this.zFr.zEX / this.zFr.zEZ);
        j = localRect.right;
        j = localRect.left;
        i = (localRect.right + localRect.left) / 2;
        j = this.zFr.zFb - localRect.top + (int)(this.zFr.zET / 2.0F);
        k = (int)(((this.zFr.zES - this.zFr.mWidth) * (1.0F - paramFloat) + this.zFr.mWidth) / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
        m = (int)(((this.zFr.zET - this.zFr.mHeight) * (1.0F - paramFloat) + this.zFr.mHeight) / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
      }
      n = (int)(i - k / 2 + this.zFr.zFe * paramFloat / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
      i1 = (int)(j - m / 2 - this.zFr.zFd * (1.0F - paramFloat) / 2.0F + this.zFr.zFg * paramFloat / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
      k = (int)(k / 2 + i - this.zFr.zFf * paramFloat / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
      j = (int)(m / 2 + j - this.zFr.zFh * paramFloat / (1.0F - (1.0F - this.zFr.zEW) * paramFloat));
      if (Build.VERSION.SDK_INT < 21)
        break label558;
      this.zFs.setClipBounds(new Rect(n, i1, k, j));
    }
    while (true)
    {
      super.applyTransformation(paramFloat, paramTransformation);
      AppMethodBeat.o(107643);
      return;
      label558: if (Build.VERSION.SDK_INT >= 18)
        if (this.zFt != null)
          this.zFt.F(n, i1, k, j);
        else
          this.zFs.setClipBounds(new Rect(n + this.zFs.getScrollX(), i1, k + this.zFs.getScrollX(), j));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.e.3
 * JD-Core Version:    0.6.2
 */