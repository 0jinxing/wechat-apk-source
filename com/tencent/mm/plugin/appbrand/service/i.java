package com.tencent.mm.plugin.appbrand.service;

import android.content.Context;
import com.tencent.mm.kernel.c.a;
import java.util.List;

public abstract interface i extends a
{
  public abstract void a(Context paramContext, i.c paramc, String paramString);

  public abstract void a(Context paramContext, String paramString, i.a parama);

  public abstract b axP();

  public static final class b
  {
    public String cEh;
    public int iDI;
    public List<i.c> items;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.service.i
 * JD-Core Version:    0.6.2
 */