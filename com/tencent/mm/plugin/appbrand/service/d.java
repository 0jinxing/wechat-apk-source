package com.tencent.mm.plugin.appbrand.service;

import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.vending.g.e;
import java.util.List;

public abstract interface d extends a
{
  public abstract void a(String paramString, a parama);

  public abstract void aE(List<String> paramList);

  public abstract void b(String paramString, a parama);

  public abstract WxaAttributes zb(String paramString);

  public abstract WxaAttributes zc(String paramString);

  public abstract e<WxaAttributes> zd(String paramString);

  public static abstract interface a
  {
    public abstract void d(WxaAttributes paramWxaAttributes);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.service.d
 * JD-Core Version:    0.6.2
 */