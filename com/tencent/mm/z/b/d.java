package com.tencent.mm.z.b;

import android.webkit.ValueCallback;

public abstract interface d
{
  public abstract void cleanup();

  public abstract void evaluateJavascript(String paramString, ValueCallback<String> paramValueCallback);

  public abstract void pause();

  public abstract void resume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.b.d
 * JD-Core Version:    0.6.2
 */