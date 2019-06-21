package com.tencent.smtt.export.external.jscore.interfaces;

import android.os.Looper;

public abstract interface IX5JsVirtualMachine
{
  public abstract IX5JsContext createJsContext();

  public abstract void destroy();

  public abstract Looper getLooper();

  public abstract void onPause();

  public abstract void onResume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.jscore.interfaces.IX5JsVirtualMachine
 * JD-Core Version:    0.6.2
 */