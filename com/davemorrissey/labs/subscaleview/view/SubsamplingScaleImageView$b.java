package com.davemorrissey.labs.subscaleview.view;

import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class SubsamplingScaleImageView$b
{
  boolean aLa;
  int aLb;
  int aLc;
  private SubsamplingScaleImageView.d aLd;
  private final float aLe;
  private final PointF aLf;
  private final PointF aLg;
  boolean aLh;
  long duration;

  private SubsamplingScaleImageView$b(SubsamplingScaleImageView paramSubsamplingScaleImageView, float paramFloat, PointF paramPointF)
  {
    this.duration = 500L;
    this.aLb = 2;
    this.aLc = 1;
    this.aLa = true;
    this.aLh = true;
    this.aLe = paramFloat;
    this.aLf = paramPointF;
    this.aLg = null;
  }

  private SubsamplingScaleImageView$b(SubsamplingScaleImageView paramSubsamplingScaleImageView, float paramFloat, PointF paramPointF1, PointF paramPointF2)
  {
    this.duration = 500L;
    this.aLb = 2;
    this.aLc = 1;
    this.aLa = true;
    this.aLh = true;
    this.aLe = paramFloat;
    this.aLf = paramPointF1;
    this.aLg = paramPointF2;
  }

  private SubsamplingScaleImageView$b(SubsamplingScaleImageView paramSubsamplingScaleImageView, PointF paramPointF)
  {
    AppMethodBeat.i(115651);
    this.duration = 500L;
    this.aLb = 2;
    this.aLc = 1;
    this.aLa = true;
    this.aLh = true;
    this.aLe = SubsamplingScaleImageView.i(paramSubsamplingScaleImageView);
    this.aLf = paramPointF;
    this.aLg = null;
    AppMethodBeat.o(115651);
  }

  public final void start()
  {
    AppMethodBeat.i(115652);
    if ((SubsamplingScaleImageView.w(this.aKO) != null) && (SubsamplingScaleImageView.w(this.aKO).aLd != null));
    try
    {
      SubsamplingScaleImageView.w(this.aKO);
      int i = this.aKO.getPaddingLeft();
      int j = (this.aKO.getWidth() - this.aKO.getPaddingRight() - this.aKO.getPaddingLeft()) / 2;
      int k = this.aKO.getPaddingTop();
      int m = (this.aKO.getHeight() - this.aKO.getPaddingBottom() - this.aKO.getPaddingTop()) / 2;
      float f1 = SubsamplingScaleImageView.b(this.aKO, this.aLe);
      if (this.aLh)
      {
        Object localObject = SubsamplingScaleImageView.a(this.aKO, this.aLf.x, this.aLf.y, f1, new PointF());
        SubsamplingScaleImageView.a(this.aKO, new SubsamplingScaleImageView.a((byte)0));
        SubsamplingScaleImageView.w(this.aKO).aJv = SubsamplingScaleImageView.i(this.aKO);
        SubsamplingScaleImageView.w(this.aKO).aKU = f1;
        SubsamplingScaleImageView.w(this.aKO).time = System.currentTimeMillis();
        SubsamplingScaleImageView.w(this.aKO).aKX = ((PointF)localObject);
        SubsamplingScaleImageView.w(this.aKO).aKV = this.aKO.getCenter();
        SubsamplingScaleImageView.w(this.aKO).aKW = ((PointF)localObject);
        SubsamplingScaleImageView.w(this.aKO).aKY = this.aKO.c((PointF)localObject);
        SubsamplingScaleImageView.w(this.aKO).aKZ = new PointF(j + i, m + k);
        SubsamplingScaleImageView.w(this.aKO).duration = this.duration;
        SubsamplingScaleImageView.w(this.aKO).aLa = this.aLa;
        SubsamplingScaleImageView.w(this.aKO).aLb = this.aLb;
        SubsamplingScaleImageView.w(this.aKO).aLc = this.aLc;
        SubsamplingScaleImageView.w(this.aKO).time = System.currentTimeMillis();
        SubsamplingScaleImageView.w(this.aKO).aLd = this.aLd;
        if (this.aLg != null)
        {
          float f2 = this.aLg.x - SubsamplingScaleImageView.w(this.aKO).aKV.x * f1;
          float f3 = this.aLg.y - SubsamplingScaleImageView.w(this.aKO).aKV.y * f1;
          SubsamplingScaleImageView.g localg = new SubsamplingScaleImageView.g(f1, new PointF(f2, f3), (byte)0);
          SubsamplingScaleImageView.a(this.aKO, localg);
          localObject = SubsamplingScaleImageView.w(this.aKO);
          float f4 = this.aLg.x;
          f1 = localg.aJw.x;
          float f5 = this.aLg.y;
          ((SubsamplingScaleImageView.a)localObject).aKZ = new PointF(f1 - f2 + f4, localg.aJw.y - f3 + f5);
        }
        this.aKO.invalidate();
        AppMethodBeat.o(115652);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w(SubsamplingScaleImageView.l(this.aKO), "Error thrown by animation listener", new Object[] { localException });
        continue;
        PointF localPointF = this.aLf;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.b
 * JD-Core Version:    0.6.2
 */