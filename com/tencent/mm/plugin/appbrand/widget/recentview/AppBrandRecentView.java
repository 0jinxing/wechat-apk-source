package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.util.AttributeSet;

public abstract class AppBrandRecentView extends RecyclerView
{
  private AppBrandRecentView.e jaq;
  d.a jmG;

  public AppBrandRecentView(Context paramContext)
  {
    super(paramContext);
  }

  public AppBrandRecentView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public abstract RecyclerView.a getAdapter();

  public abstract int getCount();

  public abstract AppBrandRecentView.b getOnItemClickListener();

  public AppBrandRecentView.e getRefreshListener()
  {
    return this.jaq;
  }

  public d.a getSceneFactory()
  {
    return this.jmG;
  }

  public abstract void refresh();

  public abstract void release();

  public abstract void setDataQuery(AppBrandRecentView.c paramc);

  public abstract void setOnItemClickListener(AppBrandRecentView.b paramb);

  public void setRefreshListener(AppBrandRecentView.e parame)
  {
    this.jaq = parame;
  }

  public void setSceneFactory(d.a parama)
  {
    this.jmG = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView
 * JD-Core Version:    0.6.2
 */