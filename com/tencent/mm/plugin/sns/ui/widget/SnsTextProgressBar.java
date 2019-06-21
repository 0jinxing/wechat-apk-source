package com.tencent.mm.plugin.sns.ui.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sns.i.a;

public class SnsTextProgressBar extends ProgressBar
{
  private int EV;
  private int iaQ;
  private Context mContext;
  private Paint mPaint;
  private String mText;
  private String rNl;

  public SnsTextProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(40525);
    this.mContext = paramContext;
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramAttributeSet, i.a.SnsTextProgressBar, 0, 0);
    try
    {
      setTextSize(paramContext.getInteger(0, 18));
      return;
    }
    finally
    {
      paramContext.recycle();
      AppMethodBeat.o(40525);
    }
    throw paramAttributeSet;
  }

  private void setText(int paramInt)
  {
    AppMethodBeat.i(40529);
    this.EV = paramInt;
    this.mText = (String.valueOf(paramInt) + "%");
    AppMethodBeat.o(40529);
  }

  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      AppMethodBeat.i(40527);
      super.onDraw(paramCanvas);
      Object localObject = new android/graphics/Paint;
      ((Paint)localObject).<init>();
      this.mPaint = ((Paint)localObject);
      this.mPaint.setAntiAlias(true);
      if ((this.rNl == null) || (this.rNl.length() <= 0));
      for (int i = this.mContext.getResources().getColor(2131690695); ; i = Color.parseColor(this.rNl))
      {
        this.mPaint.setColor(i);
        this.mPaint.setTextSize(this.iaQ);
        localObject = new android/graphics/Rect;
        ((Rect)localObject).<init>();
        this.mPaint.getTextBounds(this.mText, 0, this.mText.length(), (Rect)localObject);
        float f1 = getWidth() / 2 - ((Rect)localObject).centerX();
        float f2 = getHeight() / 2 - ((Rect)localObject).centerY();
        paramCanvas.drawText(this.mText, f1, f2, this.mPaint);
        AppMethodBeat.o(40527);
        return;
      }
    }
    finally
    {
    }
    throw paramCanvas;
  }

  public void setPaintColor(String paramString)
  {
    this.rNl = paramString;
  }

  public void setProgress(int paramInt)
  {
    AppMethodBeat.i(40526);
    setText(paramInt);
    super.setProgress(paramInt);
    AppMethodBeat.o(40526);
  }

  public void setTextSize(int paramInt)
  {
    AppMethodBeat.i(40528);
    this.iaQ = a.fromDPToPix(this.mContext, paramInt);
    AppMethodBeat.o(40528);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.widget.SnsTextProgressBar
 * JD-Core Version:    0.6.2
 */