package com.tencent.mm.plugin.appbrand.ui.collection;

import a.f.a.a;
import a.f.b.j;
import a.f.b.t;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.h.c.b;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.af.a;
import com.tencent.mm.plugin.appbrand.appusage.s;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListViewHolder$IEnterWxaListener;", "()V", "mCollectionStorageListener", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "mDataProcessThread", "Lcom/tencent/mm/sdk/platformtools/MMHandlerThread;", "mHadEnterWxa", "", "mList", "Landroid/support/v7/widget/RecyclerView;", "mListAdapter", "Lcom/tencent/mm/plugin/appbrand/ui/collection/CollectionVerticalListAdapter;", "mRefreshOnResume", "mWxaAttrsStorageListener", "sceneFor13801", "", "getSceneFor13801", "()I", "sceneFor13801$delegate", "Lkotlin/Lazy;", "sceneIdFor13801", "", "getSceneIdFor13801", "()Ljava/lang/String;", "sceneIdFor13801$delegate", "getLayoutId", "hideLoading", "", "initView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onEnter", "onResume", "onTitleDoubleTap", "onViewCreated", "view", "Landroid/view/View;", "queryDataList", "", "Lcom/tencent/mm/plugin/appbrand/appusage/LocalUsageInfo;", "refreshDataList", "replace", "lazyCallback", "Lkotlin/Function0;", "Ljava/lang/Runnable;", "removeStorageListeners", "setupStorageListeners", "showLoading", "updateDataListUsingDiffs", "plugin-appbrand-integration_release"})
public final class AppBrandCollectionDisplayVerticalList extends AppBrandLauncherUI.Fragment
  implements m.a
{
  private RecyclerView iKX;
  private k iKY;
  private boolean iKZ;
  private al iLa;
  private boolean iLb;
  private final a.f iLc;
  private final a.f iLd;
  private final k.a iLe;
  private final k.a iLf;

  static
  {
    AppMethodBeat.i(135020);
    eQB = new a.i.k[] { (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(AppBrandCollectionDisplayVerticalList.class), "sceneFor13801", "getSceneFor13801()I")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(AppBrandCollectionDisplayVerticalList.class), "sceneIdFor13801", "getSceneIdFor13801()Ljava/lang/String;")) };
    AppMethodBeat.o(135020);
  }

  public AppBrandCollectionDisplayVerticalList()
  {
    AppMethodBeat.i(135030);
    this.iLc = a.g.g((a)new AppBrandCollectionDisplayVerticalList.h(this));
    this.iLd = a.g.g((a)new AppBrandCollectionDisplayVerticalList.i(this));
    this.iLe = ((k.a)new AppBrandCollectionDisplayVerticalList.b(this));
    this.iLf = ((k.a)new AppBrandCollectionDisplayVerticalList.c(this));
    AppMethodBeat.o(135030);
  }

  private final void a(boolean paramBoolean, a<? extends Runnable> parama)
  {
    AppMethodBeat.i(135022);
    parama = (Runnable)new AppBrandCollectionDisplayVerticalList.g(this, paramBoolean, parama);
    al localal = this.iLa;
    if (localal == null)
      j.dWJ();
    if (localal.doO())
    {
      parama.run();
      AppMethodBeat.o(135022);
    }
    while (true)
    {
      return;
      localal = this.iLa;
      if (localal == null)
        j.dWJ();
      localal.aa(parama);
      AppMethodBeat.o(135022);
    }
  }

  private static List<LocalUsageInfo> aMU()
  {
    AppMethodBeat.i(135021);
    Object localObject1 = ((af)com.tencent.mm.kernel.g.K(af.class)).a(2147483647, af.a.haK);
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = (List)a.a.v.AUP;
    localObject1 = (Iterable)localObject2;
    localObject2 = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    label103: 
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject3 = ((Iterator)localObject1).next();
      if ((LocalUsageInfo)localObject3 != null);
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label103;
        ((Collection)localObject2).add(localObject3);
        break;
      }
    }
    localObject2 = (List)localObject2;
    AppMethodBeat.o(135021);
    return localObject2;
  }

  public final void aMV()
  {
    this.iLb = true;
  }

  public final void aMf()
  {
    AppMethodBeat.i(135028);
    RecyclerView localRecyclerView = this.iKX;
    if (localRecyclerView != null)
    {
      localRecyclerView.smoothScrollToPosition(0);
      AppMethodBeat.o(135028);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135028);
    }
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    AppMethodBeat.i(135027);
    Object localObject1 = new RecyclerView((Context)getActivity());
    getActivity();
    ((RecyclerView)localObject1).setLayoutManager((RecyclerView.i)new AppBrandCollectionDisplayVerticalList.a(this));
    Object localObject2 = new k(new ArrayList(), (m.a)this);
    this.iKY = ((k)localObject2);
    ((RecyclerView)localObject1).setAdapter((RecyclerView.a)localObject2);
    ((RecyclerView)localObject1).setBackgroundColor(-1);
    ((RecyclerView)localObject1).b((RecyclerView.h)new l());
    ((RecyclerView)localObject1).setItemAnimator(null);
    this.iKX = ((RecyclerView)localObject1);
    localObject1 = getContentView();
    if (localObject1 == null)
    {
      localObject1 = new a.v("null cannot be cast to non-null type android.widget.FrameLayout");
      AppMethodBeat.o(135027);
      throw ((Throwable)localObject1);
    }
    localObject2 = (FrameLayout)localObject1;
    localObject1 = this.iKX;
    if (localObject1 == null)
      j.dWJ();
    ((FrameLayout)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
    AppMethodBeat.o(135027);
  }

  public final void onActivityCreated(Bundle paramBundle)
  {
    AppMethodBeat.i(135024);
    super.onActivityCreated(paramBundle);
    FragmentActivity localFragmentActivity = getActivity();
    paramBundle = localFragmentActivity;
    if (!(localFragmentActivity instanceof MMActivity))
      paramBundle = null;
    paramBundle = (MMActivity)paramBundle;
    if (paramBundle != null)
    {
      paramBundle.a(0, getString(2131296849), (MenuItem.OnMenuItemClickListener)new AppBrandCollectionDisplayVerticalList.d(this), q.b.ymw);
      AppMethodBeat.o(135024);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135024);
    }
  }

  public final void onDestroyView()
  {
    AppMethodBeat.i(135029);
    super.onDestroyView();
    ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).d(this.iLe);
    com.tencent.mm.plugin.appbrand.app.f.auO().d(this.iLf);
    al localal = this.iLa;
    if (localal != null)
    {
      localal.quit();
      AppMethodBeat.o(135029);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135029);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(135025);
    super.onResume();
    if (this.iKZ)
    {
      a(this);
      this.iKZ = false;
    }
    if (this.iLb)
    {
      c.pG(2);
      this.iLb = false;
    }
    AppMethodBeat.o(135025);
  }

  public final void onViewCreated(View paramView, Bundle paramBundle)
  {
    AppMethodBeat.i(135026);
    j.p(paramView, "view");
    super.onViewCreated(paramView, paramBundle);
    this.iLa = new al("AppBrandLauncherCollectionList");
    a(false, (a)new AppBrandCollectionDisplayVerticalList.e(this));
    AppMethodBeat.o(135026);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/appbrand/ui/collection/AppBrandCollectionDisplayVerticalList$updateDataListUsingDiffs$2$1"})
  static final class j
    implements Runnable
  {
    j(c.b paramb, AppBrandCollectionDisplayVerticalList paramAppBrandCollectionDisplayVerticalList, List paramList)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(135018);
      k localk = AppBrandCollectionDisplayVerticalList.b(this.iLg);
      if (localk != null)
      {
        localk.aO(this.gYO);
        this.iLn.a((RecyclerView.a)localk);
        AppMethodBeat.o(135018);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(135018);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.collection.AppBrandCollectionDisplayVerticalList
 * JD-Core Version:    0.6.2
 */