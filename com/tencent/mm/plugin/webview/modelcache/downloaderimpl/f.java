package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
{
  public final long aHW;
  public final String appId;
  public final String bqF;
  public final String cSx;
  public final String cSy;
  public final int cSz;
  public final Exception exception;
  public final String filePath;
  public final String url;
  public final String version;

  public f(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt, String paramString7, long paramLong, Exception paramException)
  {
    this.url = paramString1;
    this.filePath = paramString2;
    this.version = paramString3;
    this.appId = paramString4;
    this.cSx = paramString5;
    this.cSy = paramString6;
    this.cSz = paramInt;
    this.bqF = paramString7;
    this.aHW = paramLong;
    this.exception = paramException;
  }

  public final String toString()
  {
    AppMethodBeat.i(6909);
    String str = "WebViewCacheResponseWrapper{url='" + this.url + '\'' + ", filePath='" + this.filePath + '\'' + ", version='" + this.version + '\'' + ", appId='" + this.appId + '\'' + ", domain='" + this.cSx + '\'' + ", packageId='" + this.cSy + '\'' + ", cacheType=" + this.cSz + ", contentType='" + this.bqF + '\'' + ", contentLength=" + this.aHW + ", exception=" + this.exception + '}';
    AppMethodBeat.o(6909);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.downloaderimpl.f
 * JD-Core Version:    0.6.2
 */