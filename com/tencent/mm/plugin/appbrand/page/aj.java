package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.appbrand.h.i;

public abstract interface aj extends i, ar
{
  public abstract void H(Runnable paramRunnable);

  public abstract void aAM();

  public abstract boolean aAN();

  public abstract boolean aAO();

  public abstract boolean aAP();

  public abstract void bU(String paramString1, String paramString2);

  public abstract void cE(Context paramContext);

  public abstract void destroy();

  public abstract int getContentHeight();

  public abstract View getContentView();

  public abstract int getHeight();

  public abstract String getUserAgentString();

  public abstract int getWebScrollX();

  public abstract int getWebScrollY();

  public abstract int getWidth();

  public abstract View getWrapperView();

  public abstract void setFullscreenImpl(c paramc);

  public abstract void setOnScrollChangedListener(af paramaf);

  public abstract void setOnTrimListener(ae paramae);

  public abstract void setTitle(String paramString);

  public abstract void setVerticalScrollBarEnabled(boolean paramBoolean);

  public abstract void setWebViewLayoutListener(ad paramad);

  public abstract void wU();

  public abstract void wW();

  public abstract void z(int paramInt, long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.aj
 * JD-Core Version:    0.6.2
 */