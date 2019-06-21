package com.tencent.mm.plugin.mmsight.ui.progressbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  ValueAnimator jcQ;
  a oDU;
  a oDV;
  boolean oDW;
  public b.a oDX;
  PointF oDY;
  PointF oDZ;
  PointF oEa;
  PointF oEb;
  PointF oEc;
  PointF oEd;
  float oEe;
  float oEf;
  float oEg;
  float oEh;
  Path oEi;
  private Paint oEj;
  float progress;

  public b(a parama1, a parama2, b.a parama)
  {
    AppMethodBeat.i(55343);
    this.progress = 0.0F;
    this.oDW = false;
    this.oEe = 0.0F;
    this.oEf = 0.0F;
    this.oEg = 0.0F;
    this.oEh = 0.0F;
    this.oEj = null;
    this.oDU = parama1;
    this.oDV = parama2;
    this.oDX = parama;
    this.oEf = (MMSightProgressBar.lEk * 2.0F);
    this.oEg = (-MMSightProgressBar.lEk * 0.5F);
    this.oEi = new Path();
    this.oEj = new Paint();
    this.oEj.setAntiAlias(true);
    this.oEj.setStyle(Paint.Style.FILL);
    AppMethodBeat.o(55343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.progressbar.b
 * JD-Core Version:    0.6.2
 */