package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.c;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.appusage.z.b;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.al;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandLauncherCollectionList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "()V", "mCollectionStorageListener", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "mDataProcessThread", "Lcom/tencent/mm/sdk/platformtools/MMHandlerThread;", "mDragFeatureView", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionDragFeatureView;", "mList", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionRecyclerView;", "mListAdapter", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionAdapter;", "mWxaAttrsStorageListener", "getLayoutId", "", "hideLoading", "", "initView", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDestroyView", "onTitleDoubleTap", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshDataList", "replace", "", "lazyCallback", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "removeStorageListeners", "requestLayoutSpanCount", "setupStorageListeners", "showLoading", "WrapperGridLayoutManager", "plugin-appbrand-integration_release"})
public final class AppBrandLauncherCollectionList extends AppBrandLauncherUI.Fragment
{
  private al iLa;
  private final k.a iLe;
  private final k.a iLf;
  private b iLu;
  private i iLv;
  private a iLw;

  public AppBrandLauncherCollectionList()
  {
    AppMethodBeat.i(135068);
    this.iLe = ((k.a)new AppBrandLauncherCollectionList.c(this));
    this.iLf = ((k.a)AppBrandLauncherCollectionList.d.iLA);
    AppMethodBeat.o(135068);
  }

  private final void a(boolean paramBoolean, a.f.a.a<? extends Runnable> parama)
  {
    AppMethodBeat.i(135062);
    parama = (Runnable)new AppBrandLauncherCollectionList.h(this, paramBoolean, parama);
    al localal = this.iLa;
    if (localal == null)
      j.dWJ();
    if (localal.doO())
    {
      parama.run();
      AppMethodBeat.o(135062);
    }
    while (true)
    {
      return;
      localal = this.iLa;
      if (localal == null)
        j.dWJ();
      localal.aa(parama);
      AppMethodBeat.o(135062);
    }
  }

  public final void aMf()
  {
    AppMethodBeat.i(135066);
    i locali = this.iLv;
    if (locali != null)
    {
      locali.smoothScrollToPosition(0);
      AppMethodBeat.o(135066);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135066);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    AppMethodBeat.i(135065);
    Object localObject1 = new i((Context)getActivity());
    getActivity();
    Object localObject2 = new AppBrandLauncherCollectionList.a();
    ((AppBrandLauncherCollectionList.a)localObject2).jU();
    ((i)localObject1).setLayoutManager((RecyclerView.i)localObject2);
    localObject2 = new a(new ArrayList());
    this.iLw = ((a)localObject2);
    ((i)localObject1).setAdapter((RecyclerView.a)localObject2);
    ((i)localObject1).setClipToPadding(false);
    localObject2 = ((i)localObject1).getContext();
    j.o(localObject2, "context");
    int i = ((Context)localObject2).getResources().getDimensionPixelSize(2131428088);
    localObject2 = ((i)localObject1).getContext();
    j.o(localObject2, "context");
    ((i)localObject1).setPadding(0, i, 0, ((Context)localObject2).getResources().getDimensionPixelSize(2131428088));
    ((i)localObject1).setBackgroundColor(-1);
    ((i)localObject1).b((RecyclerView.h)new f());
    this.iLv = ((i)localObject1);
    localObject1 = getContentView();
    if (localObject1 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type android.widget.FrameLayout");
      AppMethodBeat.o(135065);
      throw ((Throwable)localObject1);
    }
    localObject2 = (FrameLayout)localObject1;
    localObject1 = this.iLv;
    if (localObject1 == null)
      j.dWJ();
    ((FrameLayout)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
    localObject1 = getActivity();
    if (localObject1 == null)
      j.dWJ();
    j.o(localObject1, "activity!!");
    localObject1 = (Context)localObject1;
    localObject2 = this.iLv;
    if (localObject2 == null)
      j.dWJ();
    localObject1 = new AppBrandLauncherCollectionList.b(this, (Context)localObject1, (i)localObject2);
    localObject2 = getContentView();
    if (localObject2 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type android.widget.FrameLayout");
      AppMethodBeat.o(135065);
      throw ((Throwable)localObject1);
    }
    ((FrameLayout)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
    localObject2 = this.iLv;
    if (localObject2 == null)
      j.dWJ();
    ((i)localObject2).h((DragFeatureView)localObject1);
    localObject2 = this.iLv;
    if (localObject2 == null)
      j.dWJ();
    ((AppBrandLauncherCollectionList.b)localObject1).setRecyclerView((RecyclerView)localObject2);
    this.iLu = ((b)localObject1);
    AppMethodBeat.o(135065);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(135064);
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = this.iLv;
    if (paramConfiguration != null)
    {
      paramConfiguration = paramConfiguration.getViewTreeObserver();
      if (paramConfiguration != null)
      {
        paramConfiguration.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new AppBrandLauncherCollectionList.e(this));
        AppMethodBeat.o(135064);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135064);
    }
  }

  public final void onDestroyView()
  {
    AppMethodBeat.i(135067);
    super.onDestroyView();
    ((c)g.K(c.class)).a(z.b.haB);
    ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).d(this.iLe);
    com.tencent.mm.plugin.appbrand.app.f.auO().d(this.iLf);
    al localal = this.iLa;
    if (localal != null)
    {
      localal.quit();
      AppMethodBeat.o(135067);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135067);
    }
  }

  public final void onViewCreated(View paramView, Bundle paramBundle)
  {
    AppMethodBeat.i(135063);
    j.p(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    paramView = this.iLv;
    if (paramView == null)
      j.dWJ();
    paramView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)new AppBrandLauncherCollectionList.f(this));
    this.iLa = new al("AppBrandLauncherCollectionList");
    a(false, (a.f.a.a)new AppBrandLauncherCollectionList.g(this));
    AppMethodBeat.o(135063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandLauncherCollectionList
 * JD-Core Version:    0.6.2
 */