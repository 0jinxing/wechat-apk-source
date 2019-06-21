package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ad.a.a;

public class MMVerticalTextView extends View
{
  private int direction;
  private String mText;
  private TextPaint oz;
  Rect yyd;

  public MMVerticalTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106889);
    this.yyd = new Rect();
    this.oz = new TextPaint();
    this.oz.setAntiAlias(true);
    this.oz.setTextSize(15.0F);
    this.oz.setColor(-16777216);
    this.oz.setTextAlign(Paint.Align.CENTER);
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.verticaltextview);
    int i = paramAttributeSet.getResourceId(0, 0);
    if (i != 0)
      this.mText = paramContext.getString(i);
    i = paramAttributeSet.getDimensionPixelOffset(2, 15);
    if (i > 0)
      this.oz.setTextSize(i);
    this.oz.setColor(paramAttributeSet.getColor(1, -16777216));
    this.direction = paramAttributeSet.getInt(3, 0);
    boolean bool = paramAttributeSet.getBoolean(4, false);
    this.oz.setFakeBoldText(bool);
    paramAttributeSet.recycle();
    requestLayout();
    invalidate();
    AppMethodBeat.o(106889);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(106894);
    super.onDraw(paramCanvas);
    int i = getHeight();
    Path localPath = new Path();
    int j;
    if (this.direction == 0)
    {
      j = (getWidth() >> 1) - (this.yyd.height() >> 1);
      localPath.moveTo(j, 0.0F);
      localPath.lineTo(j, i);
    }
    while (true)
    {
      paramCanvas.drawTextOnPath(this.mText, localPath, 0.0F, 0.0F, this.oz);
      AppMethodBeat.o(106894);
      return;
      j = (getWidth() >> 1) + (this.yyd.height() >> 1);
      localPath.moveTo(j, i);
      localPath.lineTo(j, 0.0F);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106893);
    this.oz.getTextBounds(this.mText, 0, this.mText.length(), this.yyd);
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    if (i == 1073741824)
      paramInt1 = j;
    label131: 
    while (true)
    {
      i = View.MeasureSpec.getMode(paramInt2);
      j = View.MeasureSpec.getSize(paramInt2);
      if (i == 1073741824)
        paramInt2 = j;
      while (true)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        AppMethodBeat.o(106893);
        return;
        paramInt1 = this.yyd.height();
        if (i != -2147483648)
          break label131;
        paramInt1 = Math.min(paramInt1, j);
        break;
        paramInt2 = this.yyd.width();
        if (i == -2147483648)
          paramInt2 = Math.min(paramInt2, j);
      }
    }
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(106890);
    this.mText = paramString;
    requestLayout();
    invalidate();
    AppMethodBeat.o(106890);
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(106892);
    this.oz.setColor(paramInt);
    invalidate();
    AppMethodBeat.o(106892);
  }

  public void setTextSize(int paramInt)
  {
    AppMethodBeat.i(106891);
    this.oz.setTextSize(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(106891);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMVerticalTextView
 * JD-Core Version:    0.6.2
 */