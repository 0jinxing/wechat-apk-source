package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import java.util.concurrent.Callable;

public abstract interface m extends Callable<WxaPkgWrappingInfo>
{
  public abstract void onDownloadProgress(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.m
 * JD-Core Version:    0.6.2
 */