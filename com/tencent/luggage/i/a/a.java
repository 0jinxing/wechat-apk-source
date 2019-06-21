package com.tencent.luggage.i.a;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;

public abstract interface a
{
  public abstract void a(e parame);

  public abstract void onPluginDestroy(String paramString, int paramInt);

  public abstract void onPluginReady(String paramString, int paramInt, SurfaceTexture paramSurfaceTexture);

  public abstract void onPluginTouch(String paramString, int paramInt, MotionEvent paramMotionEvent);

  public abstract e yp();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.i.a.a
 * JD-Core Version:    0.6.2
 */