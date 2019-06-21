package com.tencent.neattextview.textview.layout;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import java.io.Serializable;

public abstract interface b extends Serializable
{
  public abstract int QU(int paramInt);

  public abstract void a(Canvas paramCanvas, TextPaint paramTextPaint, float paramFloat);

  public abstract float[] dPg();

  public abstract RectF dPh();

  public abstract RectF dPi();

  public abstract float dPj();

  public abstract boolean dPk();

  public abstract float dPl();

  public abstract float dPm();

  public abstract int getEnd();

  public abstract float getHeight();

  public abstract float getPrimaryHorizontal(int paramInt);

  public abstract int getStart();

  public abstract float getWidth();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.neattextview.textview.layout.b
 * JD-Core Version:    0.6.2
 */