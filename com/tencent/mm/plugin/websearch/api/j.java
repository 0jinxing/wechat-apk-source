package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import com.tencent.mm.kernel.c.a;
import java.util.Map;

public abstract interface j extends a
{
  public abstract void a(Context paramContext, int paramInt, String paramString1, String paramString2, Map<String, String> paramMap);

  public abstract void a(Context paramContext, int paramInt1, String paramString1, String paramString2, Map<String, String> paramMap, int paramInt2);

  public abstract void a(Context paramContext, int paramInt1, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3, int paramInt2);

  public abstract void a(Context paramContext, String paramString1, String paramString2, Map<String, String> paramMap);

  public abstract void aa(Context paramContext, int paramInt);

  public abstract void b(Context paramContext, int paramInt, String paramString1, String paramString2, Map<String, String> paramMap, String paramString3);

  public abstract void z(Context paramContext, String paramString1, String paramString2);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.j
 * JD-Core Version:    0.6.2
 */