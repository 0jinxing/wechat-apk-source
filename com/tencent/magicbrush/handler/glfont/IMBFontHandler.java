package com.tencent.magicbrush.handler.glfont;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import java.nio.FloatBuffer;

@Keep
public abstract interface IMBFontHandler
{
  public abstract boolean checkAndFlushClearSignal();

  public abstract int[] checkAndFlushDirtySignal();

  public abstract FloatBuffer drawText(String paramString);

  public abstract void enableStroke(boolean paramBoolean);

  public abstract Bitmap getBitmapAtlas();

  public abstract float getTextLineHeight(String paramString);

  public abstract void init(int paramInt1, int paramInt2);

  public abstract String loadFont(String paramString);

  public abstract float measureText(String paramString);

  public abstract void release();

  public abstract void setStrokeWidth(float paramFloat);

  public abstract void useFont(String paramString, float paramFloat, boolean paramBoolean1, boolean paramBoolean2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.glfont.IMBFontHandler
 * JD-Core Version:    0.6.2
 */