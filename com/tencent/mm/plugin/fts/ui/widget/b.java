package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends Drawable
{
  private Paint aFY;
  private Context context;
  int currentState;
  private int mMA;
  private int mMB;
  boolean mMC;
  private int mMD;
  int mME;
  private int mMF;
  private Drawable mMt;
  private Drawable mMu;
  private int mMv;
  private int mMw;
  private int mMx;
  private int mMy;
  private int mMz;

  public b(Context paramContext)
  {
    AppMethodBeat.i(62159);
    this.mMv = 0;
    this.mMw = 0;
    this.aFY = new Paint(1);
    this.mMB = 0;
    this.mMC = false;
    this.currentState = 2;
    this.mME = 0;
    this.mMF = 0;
    this.context = paramContext;
    this.mMv = a.i(paramContext, 2131690683);
    this.mMw = a.i(paramContext, 2131690691);
    this.mMt = paramContext.getResources().getDrawable(2130838872);
    this.mMu = paramContext.getResources().getDrawable(2130838873);
    this.mMB = a.fromDPToPix(paramContext, 24);
    this.mMx = a.i(paramContext, 2131690610);
    this.mMA = a.i(paramContext, 2131690611);
    this.mMD = a.fromDPToPix(paramContext, 47);
    this.mMy = a.fromDPToPix(paramContext, 47);
    this.mMz = a.fromDPToPix(paramContext, 60);
    this.mMF = 4;
    ab.d("MicroMsg.FTSVoiceInputDrawable", "waveStep %s", new Object[] { Integer.valueOf(this.mMF) });
    AppMethodBeat.o(62159);
  }

  private void d(Canvas paramCanvas, boolean paramBoolean)
  {
    AppMethodBeat.i(62162);
    if ((this.mMt == null) || (j(paramCanvas)))
    {
      AppMethodBeat.o(62162);
      return;
    }
    Drawable localDrawable;
    if (paramBoolean)
      localDrawable = this.mMu;
    for (int i = this.mMv; ; i = this.mMw)
    {
      int j = paramCanvas.getWidth() / 2;
      int k = paramCanvas.getHeight() / 2;
      int m = localDrawable.getIntrinsicWidth() / 2;
      int n = localDrawable.getIntrinsicHeight() / 2;
      this.aFY.setShader(null);
      this.aFY.setStyle(Paint.Style.FILL);
      this.aFY.setColor(i);
      paramCanvas.drawCircle(j, k, this.mMB, this.aFY);
      localDrawable.setBounds(j - m, k - n, j + m, k + n);
      localDrawable.draw(paramCanvas);
      AppMethodBeat.o(62162);
      break;
      localDrawable = this.mMt;
    }
  }

  private static boolean j(Canvas paramCanvas)
  {
    AppMethodBeat.i(62164);
    boolean bool;
    if ((paramCanvas == null) || (paramCanvas.getWidth() == 0) || (paramCanvas.getHeight() == 0))
    {
      bool = true;
      AppMethodBeat.o(62164);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62164);
    }
  }

  public static boolean wh(int paramInt)
  {
    if (paramInt < 10);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void bBx()
  {
    AppMethodBeat.i(62160);
    ab.d("MicroMsg.FTSVoiceInputDrawable", "readyState %s", new Object[] { Integer.valueOf(this.currentState) });
    this.currentState = 2;
    this.mME = 0;
    invalidateSelf();
    AppMethodBeat.o(62160);
  }

  public final void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(62161);
    int i;
    int j;
    if (((this.currentState == 6) || (this.currentState == 7)) && (!j(paramCanvas)))
    {
      i = paramCanvas.getWidth() >> 1;
      j = paramCanvas.getHeight() >> 1;
      this.aFY.setShader(null);
      this.aFY.setStyle(Paint.Style.FILL);
      this.aFY.setColor(this.mMx);
      if (this.currentState != 7)
        break label261;
      if (this.mMC)
      {
        this.mMD -= this.mMF;
        this.mMD = Math.min(Math.max(this.mMy, this.mMD), this.mMz);
        paramCanvas.drawCircle(i, j, this.mMD, this.aFY);
      }
    }
    else
    {
      label142: if ((this.currentState != 6) && (this.currentState != 7))
        break label281;
      d(paramCanvas, true);
    }
    while (true)
    {
      if (((this.currentState == 6) || (this.currentState == 7)) && (!j(paramCanvas)))
      {
        this.aFY.setStyle(Paint.Style.FILL);
        this.aFY.setColor(this.mMA);
        paramCanvas.drawCircle(paramCanvas.getWidth() >> 1, paramCanvas.getHeight() >> 1, this.mMB, this.aFY);
      }
      AppMethodBeat.o(62161);
      return;
      this.mMD += this.mMF;
      break;
      label261: paramCanvas.drawCircle(i, j, this.mMy, this.aFY);
      break label142;
      label281: d(paramCanvas, false);
    }
  }

  public final int getIntrinsicHeight()
  {
    return this.mMB * 2;
  }

  public final int getIntrinsicWidth()
  {
    AppMethodBeat.i(62163);
    int i;
    if (this.context == null)
    {
      i = 0;
      AppMethodBeat.o(62163);
    }
    while (true)
    {
      return i;
      i = a.gd(this.context);
      AppMethodBeat.o(62163);
    }
  }

  public final int getOpacity()
  {
    return -3;
  }

  public final void setAlpha(int paramInt)
  {
  }

  public final void setColorFilter(ColorFilter paramColorFilter)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.b
 * JD-Core Version:    0.6.2
 */