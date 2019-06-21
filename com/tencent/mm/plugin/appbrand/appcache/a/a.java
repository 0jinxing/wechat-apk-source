package com.tencent.mm.plugin.appbrand.appcache.a;

import com.tencent.mm.pluginsdk.g.a.c.l;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class a extends l
{
  public final String appId;
  public final int cBc;
  public volatile boolean gVz = true;
  public final int version;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    super(paramString1, paramString2, String.valueOf(paramInt1), "AppBrandWxaPkgDownloader", paramString3, "GET", 1, 2, 0);
    this.appId = paramString4;
    this.version = paramInt1;
    this.cBc = paramInt2;
    setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L));
    setReadTimeout((int)TimeUnit.SECONDS.toMillis(30L));
  }

  public String toShortString()
  {
    return getClass().getSimpleName() + String.format(Locale.US, "[%s|%d|%d]", new Object[] { this.appId, Integer.valueOf(this.version), Integer.valueOf(this.cBc) });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.a.a
 * JD-Core Version:    0.6.2
 */