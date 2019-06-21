package com.tencent.mm.ui.tools;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MMGestureGallery$g extends MMGestureGallery.a
{
  float[] v;

  public MMGestureGallery$g(MMGestureGallery paramMMGestureGallery)
  {
    super(paramMMGestureGallery);
    AppMethodBeat.i(107663);
    this.v = new float[9];
    AppMethodBeat.o(107663);
  }

  public final void play()
  {
    AppMethodBeat.i(107664);
    MMGestureGallery.c(this.zFK).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(107662);
        MMGestureGallery.a(MMGestureGallery.g.this.zFK).getImageMatrix().getValues(MMGestureGallery.g.this.v);
        float f1 = MMGestureGallery.a(MMGestureGallery.g.this.zFK).getScale();
        float f2 = MMGestureGallery.a(MMGestureGallery.g.this.zFK).getImageHeight() * f1;
        float f3 = MMGestureGallery.g.this.v[5];
        f1 = MMGestureGallery.d(MMGestureGallery.g.this.zFK);
        if (f2 < MMGestureGallery.d(MMGestureGallery.g.this.zFK))
          f1 = MMGestureGallery.d(MMGestureGallery.g.this.zFK) / 2.0F + f2 / 2.0F;
        f1 -= f3 + f2;
        if (f1 <= 0.0F)
          MMGestureGallery.g.this.cco = true;
        while (true)
        {
          MMGestureGallery.a(MMGestureGallery.g.this.zFK).aj(0.0F, f1);
          AppMethodBeat.o(107662);
          return;
          if (Math.abs(f1) <= 5.0F)
            MMGestureGallery.g.this.cco = true;
          else
            f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
        }
      }
    });
    AppMethodBeat.o(107664);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.g
 * JD-Core Version:    0.6.2
 */