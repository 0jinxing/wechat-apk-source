package com.tencent.mm.ui.widget.progress;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cg.a.a;
import com.tencent.mm.ui.aj;

public class RoundProgressBtn extends View
{
  private Paint aFY;
  private int htZ;
  private int lAB;
  private int max;
  private int progress;
  private float sFW;
  private float zTA;
  private int zTB;
  private int zTC;
  private int zTD;
  private int zTz;

  public RoundProgressBtn(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112959);
    this.zTB = 0;
    this.zTC = 0;
    this.zTD = aj.am(getContext(), 2131427585);
    b(paramContext, paramAttributeSet, 0);
    AppMethodBeat.o(112959);
  }

  public RoundProgressBtn(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112960);
    this.zTB = 0;
    this.zTC = 0;
    this.zTD = aj.am(getContext(), 2131427585);
    b(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.o(112960);
  }

  private void b(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    AppMethodBeat.i(112961);
    this.aFY = new Paint();
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.RoundProgressBtn, paramInt, 0);
      this.zTz = paramContext.getColor(3, getContext().getResources().getColor(2131690397));
      this.zTA = paramContext.getDimension(4, 0.0F);
      this.htZ = paramContext.getColor(2, getContext().getResources().getColor(2131690683));
      this.sFW = paramContext.getDimension(5, this.zTA);
      this.max = paramContext.getInt(1, 100);
      this.progress = paramContext.getInt(0, 0);
      this.lAB = paramContext.getInt(6, -90);
      paramContext.recycle();
    }
    AppMethodBeat.o(112961);
  }

  public int getProgress()
  {
    return this.progress;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112962);
    super.onDraw(paramCanvas);
    int i = getWidth() / 2;
    if (this.zTA == 0.0F)
      this.zTA = ((int)(getWidth() / 2 * 0.167D));
    this.sFW = this.zTA;
    this.zTB = ((int)this.zTA);
    this.zTC = ((int)(i * 0.667F));
    int j = (int)(i - this.zTA / 2.0F);
    this.aFY.setStrokeWidth(this.zTA);
    this.aFY.setColor(this.zTz);
    this.aFY.setAntiAlias(true);
    this.aFY.setStyle(Paint.Style.STROKE);
    paramCanvas.drawCircle(i, i, j, this.aFY);
    this.aFY.setStrokeWidth(this.sFW);
    this.aFY.setColor(this.htZ);
    RectF localRectF = new RectF(i - j, i - j, i + j, j + i);
    j = this.progress * 360 / this.max;
    paramCanvas.drawArc(localRectF, this.lAB, j, false, this.aFY);
    this.aFY.setStrokeWidth(0.0F);
    this.aFY.setStyle(Paint.Style.FILL);
    paramCanvas.drawRect(i - this.zTA * 1.5F, i - this.zTC / 2, i - this.zTA * 0.5F, this.zTC / 2 + i, this.aFY);
    float f1 = i;
    float f2 = this.zTB;
    float f3 = i - this.zTC / 2;
    float f4 = i;
    paramCanvas.drawRect(f2 * 0.5F + f1, f3, this.zTB * 1.5F + f4, this.zTC / 2 + i, this.aFY);
    AppMethodBeat.o(112962);
  }

  public void setProgress(int paramInt)
  {
    AppMethodBeat.i(112963);
    this.progress = Math.max(0, paramInt);
    this.progress = Math.min(paramInt, this.max);
    invalidate();
    AppMethodBeat.o(112963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.progress.RoundProgressBtn
 * JD-Core Version:    0.6.2
 */