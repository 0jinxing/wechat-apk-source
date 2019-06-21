package com.tencent.mm.plugin.game.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public class TextProgressBar extends ProgressBar
{
  private int EV;
  private int iaQ;
  private Context mContext;
  private Paint mPaint;
  private String mText;

  public TextProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  private void setText(int paramInt)
  {
    AppMethodBeat.i(112416);
    this.EV = paramInt;
    this.mText = (String.valueOf(paramInt) + "%");
    AppMethodBeat.o(112416);
  }

  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      AppMethodBeat.i(112414);
      super.onDraw(paramCanvas);
      Object localObject = new android/graphics/Paint;
      ((Paint)localObject).<init>();
      this.mPaint = ((Paint)localObject);
      this.mPaint.setAntiAlias(true);
      this.mPaint.setColor(Color.rgb(69, 192, 26));
      this.mPaint.setTextSize(this.iaQ);
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      this.mPaint.getTextBounds(this.mText, 0, this.mText.length(), (Rect)localObject);
      float f1 = getWidth() / 2 - ((Rect)localObject).centerX();
      float f2 = getHeight() / 2 - ((Rect)localObject).centerY();
      paramCanvas.drawText(this.mText, f1, f2, this.mPaint);
      float f3 = this.EV / 100.0F * getWidth();
      if (f3 > f1)
      {
        localObject = new android/graphics/Paint;
        ((Paint)localObject).<init>();
        ((Paint)localObject).setColor(-1);
        ((Paint)localObject).setAntiAlias(true);
        ((Paint)localObject).setTextSize(this.iaQ);
        RectF localRectF = new android/graphics/RectF;
        localRectF.<init>(0.0F, 0.0F, f3, getHeight());
        paramCanvas.save();
        paramCanvas.clipRect(localRectF);
        paramCanvas.drawText(this.mText, f1, f2, (Paint)localObject);
        paramCanvas.restore();
      }
      AppMethodBeat.o(112414);
      return;
    }
    finally
    {
    }
    throw paramCanvas;
  }

  public void setProgress(int paramInt)
  {
    AppMethodBeat.i(112413);
    setText(paramInt);
    super.setProgress(paramInt);
    AppMethodBeat.o(112413);
  }

  public void setTextSize(int paramInt)
  {
    AppMethodBeat.i(112415);
    this.iaQ = a.fromDPToPix(this.mContext, paramInt);
    AppMethodBeat.o(112415);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.TextProgressBar
 * JD-Core Version:    0.6.2
 */