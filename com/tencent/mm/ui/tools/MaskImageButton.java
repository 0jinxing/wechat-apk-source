package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

public class MaskImageButton extends ImageView
{
  private int a;
  private Paint aFY;
  private int b;
  public Object eSe;
  private int g;
  private int r;
  private ak rgT;
  private Runnable rgU;
  private RectF zGi;
  private int zGj;
  private int zGk;

  public MaskImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107743);
    this.zGi = new RectF();
    this.aFY = null;
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.zGj = 0;
    this.zGk = 0;
    this.aFY = new Paint();
    this.aFY.setColor(Color.argb(this.a, this.r, this.g, this.b));
    this.rgT = new ak(Looper.getMainLooper());
    this.rgU = new MaskImageButton.1(this);
    super.setOnTouchListener(new MaskImageButton.2(this));
    AppMethodBeat.o(107743);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107744);
    super.onDraw(paramCanvas);
    if (isPressed())
    {
      this.zGi.set(getPaddingLeft() + 0, getPaddingTop() + 0, this.zGj - getPaddingRight(), this.zGk - getPaddingBottom());
      paramCanvas.drawRoundRect(this.zGi, getMeasuredHeight() / 10, getMeasuredHeight() / 10, this.aFY);
    }
    AppMethodBeat.o(107744);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107745);
    super.onMeasure(paramInt1, paramInt2);
    this.zGj = getMeasuredWidth();
    this.zGk = getMeasuredHeight();
    AppMethodBeat.o(107745);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MaskImageButton
 * JD-Core Version:    0.6.2
 */