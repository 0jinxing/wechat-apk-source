package com.tencent.xweb.c;

import android.webkit.ValueCallback;
import java.net.URL;
import java.nio.ByteBuffer;

public abstract interface f
{
  public abstract void a(com.tencent.xweb.f paramf);

  public abstract void addJavascriptInterface(Object paramObject, String paramString);

  public abstract void cleanup();

  public abstract boolean dTW();

  public abstract boolean dUA();

  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);

  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback, URL paramURL);

  public abstract ByteBuffer getNativeBuffer(int paramInt);

  public abstract int getNativeBufferId();

  public abstract void init(int paramInt);

  public abstract void pause();

  public abstract void resume();

  public abstract void setNativeBuffer(int paramInt, ByteBuffer paramByteBuffer);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.c.f
 * JD-Core Version:    0.6.2
 */