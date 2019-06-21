package com.tencent.mm.plugin.appbrand.service;

import android.content.Context;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import java.util.List;

public abstract interface g extends a
{
  public abstract void C(Context paramContext, int paramInt);

  public abstract void a(Context paramContext, String paramString1, String paramString2, List<WxaAttributes.WxaEntryInfo> paramList);

  public abstract void b(Context paramContext, int paramInt, boolean paramBoolean);

  public abstract void cB(Context paramContext);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.service.g
 * JD-Core Version:    0.6.2
 */