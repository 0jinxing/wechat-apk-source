package com.tencent.mm.plugin.appbrand.config;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class WxaExposedParams$a
{
  public String appId = "";
  public int from = 0;
  public int gVt = -1;
  public int gVu = -1;
  public String hiv = "";
  public String hiw = "";
  public String iconUrl = "";
  public String nickname = "";
  public String pageId = "";
  public String username = "";

  public final WxaExposedParams ayP()
  {
    AppMethodBeat.i(114914);
    WxaExposedParams localWxaExposedParams = new WxaExposedParams(this, (byte)0);
    AppMethodBeat.o(114914);
    return localWxaExposedParams;
  }

  public final a nF(int paramInt)
  {
    this.from = paramInt;
    return this;
  }

  public final a zC(String paramString)
  {
    this.appId = paramString;
    return this;
  }

  public final a zD(String paramString)
  {
    this.username = paramString;
    return this;
  }

  public final a zE(String paramString)
  {
    this.nickname = paramString;
    return this;
  }

  public final a zF(String paramString)
  {
    this.iconUrl = paramString;
    return this;
  }

  public final a zG(String paramString)
  {
    this.pageId = paramString;
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a
 * JD-Core Version:    0.6.2
 */