package com.tencent.mm.plugin.appbrand.dynamic;

import android.os.Parcelable;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetRuntimeConfig;
import com.tencent.mm.plugin.appbrand.dynamic.launching.WidgetSysConfig;

public abstract interface WxaWidgetContext extends Parcelable
{
  public abstract int avn();

  public abstract WxaPkgWrappingInfo azF();

  public abstract WxaPkgWrappingInfo azG();

  public abstract int azH();

  public abstract byte[] azI();

  public abstract int azJ();

  public abstract DebuggerInfo azK();

  public abstract WidgetSysConfig azL();

  public abstract WidgetRuntimeConfig azM();

  public abstract String getAppId();

  public abstract String getId();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext
 * JD-Core Version:    0.6.2
 */