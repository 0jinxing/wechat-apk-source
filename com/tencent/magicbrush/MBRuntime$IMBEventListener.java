package com.tencent.magicbrush;

import android.support.annotation.Keep;

@Keep
public abstract interface MBRuntime$IMBEventListener
{
  public abstract void onConsoleOutput(String paramString);

  public abstract void onError(int paramInt);

  public abstract void onFirstFrameRendered();

  public abstract void onJsExceptionOccurred(String paramString1, String paramString2, int paramInt);

  public abstract void onMainCanvasCreated(int paramInt);

  public abstract void onMainCanvasTypeDefined(int paramInt);

  public abstract void onRendererReady(int paramInt1, int paramInt2);

  public abstract void onSystemSizeChanged(int paramInt1, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.MBRuntime.IMBEventListener
 * JD-Core Version:    0.6.2
 */