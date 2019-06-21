package com.tencent.mm.ui.tools;

import android.graphics.Matrix;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class MMGestureGallery$j extends MMGestureGallery.a
{
  float[] v;

  public MMGestureGallery$j(MMGestureGallery paramMMGestureGallery)
  {
    super(paramMMGestureGallery);
    AppMethodBeat.i(107672);
    this.v = new float[9];
    AppMethodBeat.o(107672);
  }

  public final void play()
  {
    AppMethodBeat.i(107673);
    MMGestureGallery.c(this.zFK).post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(107671);
        MMGestureGallery.a(MMGestureGallery.j.this.zFK).getImageMatrix().getValues(MMGestureGallery.j.this.v);
        float f1 = MMGestureGallery.a(MMGestureGallery.j.this.zFK).getScale();
        float f2 = MMGestureGallery.a(MMGestureGallery.j.this.zFK).getImageWidth() * f1;
        float f3 = MMGestureGallery.j.this.v[2];
        f1 = MMGestureGallery.b(MMGestureGallery.j.this.zFK);
        if (f2 < MMGestureGallery.b(MMGestureGallery.j.this.zFK))
          f1 = MMGestureGallery.b(MMGestureGallery.j.this.zFK) / 2.0F + f2 / 2.0F;
        f1 -= f3 + f2;
        if (f1 <= 0.0F)
          MMGestureGallery.j.this.cco = true;
        while (true)
        {
          MMGestureGallery.a(MMGestureGallery.j.this.zFK).aj(f1, 0.0F);
          AppMethodBeat.o(107671);
          return;
          if (Math.abs(f1) <= 5.0F)
            MMGestureGallery.j.this.cco = true;
          else
            f1 = (float)(Math.abs(f1) - Math.pow(Math.sqrt(Math.abs(f1)) - 1.0D, 2.0D)) * 2.0F;
        }
      }
    });
    AppMethodBeat.o(107673);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MMGestureGallery.j
 * JD-Core Version:    0.6.2
 */