package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends View
{
  private Matrix mMatrix;
  private Paint mPaint;
  private int mRotateAngle;
  public int np;
  public int sZY;
  public int sZZ;
  public int taa;
  private int tab;
  private int tac;
  private int tad;
  private int tae;
  private RectF taf;
  private boolean tah;

  public f(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(5061);
    this.mPaint = new Paint();
    this.mPaint.setStyle(Paint.Style.STROKE);
    this.mPaint.setColor(-65536);
    this.mPaint.setStrokeWidth(a.fromDPToPix(getContext(), 3));
    this.mMatrix = new Matrix();
    AppMethodBeat.o(5061);
  }

  private static int dW(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      paramInt1 = 0;
    while (true)
    {
      if (paramInt1 > paramInt2);
      while (true)
      {
        return paramInt2;
        paramInt2 = paramInt1;
      }
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(5063);
    if (this.taf != null)
    {
      paramCanvas.save();
      paramCanvas.rotate(0.0F);
      paramCanvas.drawRect(this.taf, this.mPaint);
      paramCanvas.restore();
    }
    AppMethodBeat.o(5063);
  }

  public final void setFaceLocation(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(5062);
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    if (paramArrayOfInt != null)
    {
      this.tab = paramArrayOfInt[0];
      this.tac = paramArrayOfInt[1];
      this.tad = paramArrayOfInt[2];
      this.tae = paramArrayOfInt[3];
      if ((this.sZZ != 0) && (this.taa != 0) && (this.np != 0) && (this.sZY != 0))
      {
        i = this.tad;
        j = this.tab;
        k = this.tae;
        m = this.tac;
        ab.d("MicroMsg.FaceRectView", "mLeftTopX:%d, mLeftTopY:%d, mRightBottomX:%d, mRightBottomY:%d", new Object[] { Integer.valueOf(this.tab), Integer.valueOf(this.tac), Integer.valueOf(this.tad), Integer.valueOf(this.tad) });
        ab.d("MicroMsg.FaceRectView", "mPicWidth:%d, mPicHeight:%d, mirror:%b, angle:%d", new Object[] { Integer.valueOf(this.sZZ), Integer.valueOf(this.taa), Boolean.valueOf(this.tah), Integer.valueOf(this.mRotateAngle) });
        n = (this.tad + this.tab) / 2;
        i1 = (this.tae + this.tac) / 2;
        if ((this.mRotateAngle != 90) && (this.mRotateAngle != 270))
          break label568;
        i2 = i1;
      }
    }
    while (true)
    {
      ab.d("MicroMsg.FaceRectView", "centerX:%d, centerY:%d", new Object[] { Integer.valueOf(i2), Integer.valueOf(n) });
      float f1;
      if ((this.mRotateAngle == 90) || (this.mRotateAngle == 270))
        f1 = this.np / this.sZZ;
      for (float f2 = this.sZY / this.taa; ; f2 = this.np / this.taa)
      {
        float f3 = Math.max(f1, f2);
        f2 = (int)((i - j) * f3);
        f1 = (int)((k - m) * f3);
        i1 = (int)(i2 * f3);
        n = (int)(n * f3);
        this.tab = dW((int)(i1 - f2 / 2.0F), this.sZY);
        this.tac = dW((int)(n - f1 / 2.0F), this.np);
        this.tad = dW((int)(i1 + f2 / 2.0F), this.sZY);
        this.tae = dW((int)(n + f1 / 2.0F), this.np);
        this.taf = new RectF(this.tab, this.tac, this.tad, this.tae);
        ab.d("MicroMsg.FaceRectView", "after translate, mLeftTopX:%.2f, mLeftTopY:%.2f, mRightBottomX:%.2f, mRightBottomY:%.2f", new Object[] { Float.valueOf(this.taf.left), Float.valueOf(this.taf.top), Float.valueOf(this.taf.right), Float.valueOf(this.taf.bottom) });
        AppMethodBeat.o(5062);
        return;
        f1 = this.sZY / this.sZZ;
      }
      label568: i2 = n;
      n = i1;
    }
  }

  public final void setMirror(boolean paramBoolean)
  {
    this.tah = paramBoolean;
  }

  public final void setRotateAngle(int paramInt)
  {
    this.mRotateAngle = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.f
 * JD-Core Version:    0.6.2
 */