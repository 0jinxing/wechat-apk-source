package com.tencent.mm.plugin.appbrand.widget.header.a;

import android.content.res.Configuration;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.plugin.appbrand.widget.recentview.b;

public abstract interface a
{
  public abstract void a(Configuration paramConfiguration);

  public abstract void aQb();

  public abstract void aQc();

  public abstract void aQd();

  public abstract int getRecentAppBrandCount();

  public abstract int getStarAppBrandCount();

  public abstract void qu(int paramInt);

  public abstract void refresh();

  public abstract void setCollectionRefreshListener(AppBrandRecentView.e parame);

  public abstract void setIOnLaunchUIListener(a.b paramb);

  public abstract void setOnEmptyViewListener(a.a parama);

  public abstract void setReporter(b paramb);

  public abstract void setUsageRefreshListener(AppBrandRecentView.e parame);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.header.a.a
 * JD-Core Version:    0.6.2
 */