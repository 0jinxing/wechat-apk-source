package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import java.util.ArrayList;
import java.util.List;

public class TextViewMultilineEllipse extends View
{
  private Context context;
  private String mText;
  private int nnY;
  private TextPaint oz;
  private TextViewMultilineEllipse.a rDf;
  private TextViewMultilineEllipse.a rDg;
  private int rmm;
  private String rmn;
  private String rmo;
  private boolean rmp;
  private int rmq;
  private boolean rmr;
  private boolean rms;
  private int textSize;

  public TextViewMultilineEllipse(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(39846);
    this.textSize = -1;
    this.context = paramContext;
    this.rms = false;
    this.rmp = true;
    this.rmr = false;
    this.nnY = -1;
    this.rmn = "...";
    this.rmo = "";
    this.rmq = -16776961;
    this.rDf = new TextViewMultilineEllipse.a();
    this.rDg = new TextViewMultilineEllipse.a();
    this.oz = new TextPaint();
    this.oz.setAntiAlias(true);
    if (this.textSize == -1)
    {
      this.textSize = BackwardSupportUtil.b.b(this.context, 12.0F);
      this.oz.setTextSize(this.textSize);
    }
    while (true)
    {
      this.oz.setColor(-16777216);
      this.oz.setTextAlign(Paint.Align.LEFT);
      AppMethodBeat.o(39846);
      return;
      this.oz.setTextSize(13.0F);
    }
  }

  private int DU(int paramInt)
  {
    AppMethodBeat.i(39852);
    if (this.rms);
    for (paramInt = this.rDf.a(this.mText, paramInt - getPaddingLeft() - getPaddingRight(), this.oz); ; paramInt = this.rDg.a(this.mText, this.rmn, this.rmo, this.nnY, paramInt - getPaddingLeft() - getPaddingRight(), this.oz))
    {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      AppMethodBeat.o(39852);
      return paramInt + i + j;
    }
  }

  public boolean getIsExpanded()
  {
    return this.rms;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(39851);
    super.onDraw(paramCanvas);
    TextViewMultilineEllipse.a locala;
    ArrayList localArrayList;
    float f1;
    float f2;
    int i;
    label53: int j;
    if (this.rms)
    {
      locala = this.rDf;
      localArrayList = this.rDf.rmy;
      f1 = getPaddingLeft();
      f2 = getPaddingTop() + -this.rmm;
      i = 0;
      if (i >= localArrayList.size())
        break label304;
      int[] arrayOfInt = (int[])localArrayList.get(i);
      paramCanvas.drawText(this.mText, arrayOfInt[0], arrayOfInt[1] + 1, f1, f2, this.oz);
      if ((i == localArrayList.size() - 1) && (locala.rmx))
      {
        paramCanvas.drawText(this.rmn, locala.rmz + f1, f2, this.oz);
        if (this.rmp)
        {
          j = this.oz.getColor();
          this.oz.setColor(this.rmq);
          if (!this.rmr)
            break label275;
          paramCanvas.drawText(this.rmo, paramCanvas.getWidth() - (locala.rmB + getPaddingRight() + getPaddingLeft()), f2, this.oz);
        }
      }
    }
    while (true)
    {
      this.oz.setColor(j);
      f2 += -this.rmm + this.oz.descent();
      if (f2 > paramCanvas.getHeight())
        break label304;
      i++;
      break label53;
      locala = this.rDg;
      localArrayList = this.rDg.rmy;
      break;
      label275: paramCanvas.drawText(this.rmo, locala.rmz + locala.rmA + f1, f2, this.oz);
    }
    label304: AppMethodBeat.o(39851);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39850);
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i == 1073741824)
      DU(paramInt1);
    int j;
    while (true)
    {
      j = View.MeasureSpec.getMode(paramInt2);
      i = View.MeasureSpec.getSize(paramInt2);
      this.rmm = ((int)this.oz.ascent());
      if (j != 1073741824)
        break;
      paramInt2 = i;
      setMeasuredDimension(paramInt1, paramInt2);
      AppMethodBeat.o(39850);
      return;
      if (i == -2147483648)
      {
        paramInt1 = Math.min(DU(paramInt1), paramInt1);
      }
      else
      {
        DU(paramInt1);
        paramInt1 = 0;
      }
    }
    if (this.rms);
    for (paramInt2 = this.rDf.rmy.size(); ; paramInt2 = this.rDg.rmy.size())
    {
      int k = paramInt2 * (int)(-this.rmm + this.oz.descent()) + getPaddingTop() + getPaddingBottom();
      paramInt2 = k;
      if (j != -2147483648)
        break;
      paramInt2 = Math.min(k, i);
      break;
    }
  }

  public void setColorEllpsizeMore(int paramInt)
  {
    this.rmq = paramInt;
  }

  public void setDrawEllipsizeMoreString(boolean paramBoolean)
  {
    this.rmp = paramBoolean;
  }

  public void setEllipsis(String paramString)
  {
    this.rmn = paramString;
  }

  public void setEllipsisMore(String paramString)
  {
    this.rmo = paramString;
  }

  public void setMaxLines(int paramInt)
  {
    this.nnY = paramInt;
  }

  public void setRightAlignEllipsizeMoreString(boolean paramBoolean)
  {
    this.rmr = paramBoolean;
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(39847);
    this.mText = paramString;
    requestLayout();
    invalidate();
    AppMethodBeat.o(39847);
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(39849);
    this.oz.setColor(paramInt);
    invalidate();
    AppMethodBeat.o(39849);
  }

  public void setTextSize(int paramInt)
  {
    AppMethodBeat.i(39848);
    this.oz.setTextSize(paramInt);
    requestLayout();
    invalidate();
    AppMethodBeat.o(39848);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.TextViewMultilineEllipse
 * JD-Core Version:    0.6.2
 */