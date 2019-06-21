package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.os.Handler;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import java.util.Map;

public abstract interface c
{
  public abstract <T extends com.tencent.luggage.a.b> T B(Class<T> paramClass);

  public abstract void B(Runnable paramRunnable);

  public abstract void M(int paramInt, String paramString);

  public abstract void a(ah paramah);

  public abstract void a(String paramString1, String paramString2, int[] paramArrayOfInt);

  public abstract int aBw();

  public abstract i aBx();

  public abstract Handler aBy();

  public abstract <T extends j> T aa(Class<T> paramClass);

  public abstract com.tencent.mm.plugin.appbrand.b.b asD();

  public abstract p asE();

  public abstract k asF();

  public abstract i aua();

  public abstract Map<String, m> aub();

  public abstract void b(ah paramah);

  public abstract void bX(String paramString1, String paramString2);

  public abstract String getAppId();

  public abstract Context getContext();

  public abstract boolean isRunning();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.c
 * JD-Core Version:    0.6.2
 */