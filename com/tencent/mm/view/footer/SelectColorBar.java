package com.tencent.mm.view.footer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SelectColorBar extends View
{
  public static final int[] AcD = { -1, -16777216, -707825, -17592, -16535286, -15172610, -7054596, -449092 };
  private Paint Aat;
  private boolean AcG;
  private final float Acn;
  private Rect[] Acz;
  private SelectColorBar.a Ade;
  private int Adf;
  private Paint eHe;

  public SelectColorBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(116439);
    this.Acn = getResources().getDimension(2131428403);
    this.Adf = -1;
    this.AcG = true;
    this.Aat = new Paint(1);
    this.Aat.setColor(-16711936);
    this.Acz = new Rect[AcD.length];
    this.eHe = new Paint(1);
    this.eHe.setStyle(Paint.Style.FILL);
    this.eHe.setStrokeCap(Paint.Cap.ROUND);
    AppMethodBeat.o(116439);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(116442);
    int k = (int)paramMotionEvent.getX();
    int m = (int)paramMotionEvent.getY();
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(116442);
      return true;
      do
      {
        j++;
        if (j >= this.Acz.length)
          break;
      }
      while (!this.Acz[j].contains(k, m));
      this.Adf = j;
      continue;
      do
      {
        i++;
        if ((this.Acz == null) || (i >= this.Acz.length))
          break;
      }
      while ((!this.Acz[i].contains(k, m)) || (i != this.Adf) || (this.Ade == null));
      this.Ade.Qy(AcD[i]);
      requestLayout();
      postInvalidate();
    }
  }

  public int getCurColor()
  {
    if (this.Adf == -1);
    for (int i = AcD[2]; ; i = AcD[this.Adf])
      return i;
  }

  protected int getDetailHeight()
  {
    AppMethodBeat.i(116444);
    int i = (int)getResources().getDimension(2131428230);
    AppMethodBeat.o(116444);
    return i;
  }

  public int getPaddingLeftAndRight()
  {
    return (int)(2.0F * this.Acn);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116443);
    super.onDraw(paramCanvas);
    paramCanvas.drawColor(0);
    float f1 = getResources().getDimension(2131428305);
    float f2 = (getMeasuredWidth() - getPaddingLeftAndRight() - 2.0F * f1 * AcD.length) / (AcD.length - 1);
    float f3 = getPaddingLeftAndRight() / 2 + f1 + 5.0F;
    float f4 = 1.0F * getDetailHeight() / 2.0F;
    int i = 0;
    if (i < AcD.length)
    {
      float f5 = 0.0F;
      float f6;
      if (this.Adf == i)
      {
        this.AcG = false;
        f6 = 6.0F;
      }
      while (true)
      {
        this.eHe.setColor(-1);
        paramCanvas.drawCircle(f3, f4, f1 + 5.0F + f6, this.eHe);
        this.eHe.setColor(AcD[i]);
        paramCanvas.drawCircle(f3, f4, f6 + f1, this.eHe);
        f3 += 2.0F * f1 + f2;
        i++;
        break;
        f6 = f5;
        if (this.AcG)
        {
          f6 = f5;
          if (i == 2)
            f6 = 6.0F;
        }
      }
    }
    AppMethodBeat.o(116443);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(116441);
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = getPaddingLeft();
    paramInt1 = getPaddingRight();
    paramInt2 = View.MeasureSpec.makeMeasureSpec((int)getResources().getDimension(2131428230), 1073741824);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i - j - paramInt1, 1073741824), paramInt2);
    if (this.Acz == null)
      this.Acz = new Rect[AcD.length];
    float f1 = getResources().getDimension(2131428305);
    float f2 = (getMeasuredWidth() - getPaddingLeftAndRight() - 2.0F * f1 * AcD.length) / (AcD.length - 1);
    j = (int)(2.0F * f1);
    paramInt2 = (int)(getPaddingLeftAndRight() / 2 + f1 + 5.0F);
    i = getDetailHeight() / 2;
    for (paramInt1 = 0; paramInt1 < AcD.length; paramInt1++)
    {
      this.Acz[paramInt1] = new Rect(paramInt2 - j, i - j, paramInt2 + j, i + j);
      paramInt2 = (int)(paramInt2 + (2.0F * f1 + f2));
    }
    AppMethodBeat.o(116441);
  }

  public void setSelectColor(int paramInt)
  {
    AppMethodBeat.i(116440);
    for (int i = 0; ; i++)
      if (i < AcD.length)
      {
        if (AcD[i] == paramInt)
          this.Adf = i;
      }
      else
      {
        this.AcG = false;
        postInvalidate();
        AppMethodBeat.o(116440);
        return;
      }
  }

  public void setSelectColorListener(SelectColorBar.a parama)
  {
    this.Ade = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.footer.SelectColorBar
 * JD-Core Version:    0.6.2
 */