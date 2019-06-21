package com.tencent.mm.plugin.appbrand.service;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.af.j.b;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public abstract interface e extends a
{
  public abstract void a(Context paramContext, String paramString1, int paramInt, String paramString2, AppBrandStatObject paramAppBrandStatObject, String paramString3, String paramString4);

  public abstract void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject);

  public abstract void a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2, String paramString3, AppBrandStatObject paramAppBrandStatObject, String paramString4);

  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt);

  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2);

  public abstract void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, j.b paramb);

  public abstract void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, j.b paramb, Bundle paramBundle);

  public abstract void b(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.service.e
 * JD-Core Version:    0.6.2
 */