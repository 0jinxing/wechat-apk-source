package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.a.m;
import a.f.a.q;
import a.f.b.j;
import a.f.b.t;
import a.i.k;
import a.l;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.a.d;
import com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandLauncherRecommendList;", "Lcom/tencent/mm/plugin/appbrand/ui/AppBrandLauncherUI$Fragment;", "()V", "uiLogic", "Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;", "getUiLogic", "()Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;", "uiLogic$delegate", "Lkotlin/Lazy;", "getLayoutId", "", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onTitleDoubleTap", "Companion", "plugin-appbrand-integration_release"})
public final class AppBrandLauncherRecommendList extends AppBrandLauncherUI.Fragment
{
  private static final String TAG = "MicroMsg.AppBrandLauncherRecommendsList";
  public static final AppBrandLauncherRecommendList.a iPt;
  private final a.f iPs;

  static
  {
    AppMethodBeat.i(135143);
    eQB = new k[] { (k)a.f.b.v.a(new t(a.f.b.v.aN(AppBrandLauncherRecommendList.class), "uiLogic", "getUiLogic()Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendUILogic;")) };
    iPt = new AppBrandLauncherRecommendList.a((byte)0);
    TAG = "MicroMsg.AppBrandLauncherRecommendsList";
    AppMethodBeat.o(135143);
  }

  public AppBrandLauncherRecommendList()
  {
    AppMethodBeat.i(135150);
    this.iPs = a.g.g((a.f.a.a)new AppBrandLauncherRecommendList.b(this));
    AppMethodBeat.o(135150);
  }

  private final g aNA()
  {
    AppMethodBeat.i(135144);
    g localg = (g)this.iPs.getValue();
    AppMethodBeat.o(135144);
    return localg;
  }

  public final void aMf()
  {
    AppMethodBeat.i(135147);
    super.aMf();
    ab.i(TAG, "onTitleDoubleTap");
    aNA().aNL().smoothScrollToPosition(0);
    AppMethodBeat.o(135147);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    boolean bool1 = true;
    AppMethodBeat.i(135146);
    Object localObject1 = aNA();
    ((g)localObject1).aNL().setLayoutManager((RecyclerView.i)((g)localObject1).iQm);
    Object localObject2 = ((g)localObject1).getContentView();
    if (localObject2 == null)
    {
      localObject1 = new a.v("null cannot be cast to non-null type android.widget.FrameLayout");
      AppMethodBeat.o(135146);
      throw ((Throwable)localObject1);
    }
    ((FrameLayout)localObject2).addView((View)((g)localObject1).aNL(), new ViewGroup.LayoutParams(-1, -1));
    ((g)localObject1).iQk.jR();
    localObject2 = ((g)localObject1).iQk;
    Object localObject3 = (m)new g.m((g)localObject1);
    j.p(localObject3, "<set-?>");
    ((a)localObject2).iPy = ((m)localObject3);
    localObject2 = ((g)localObject1).iQk;
    localObject3 = (m)new g.n((g)localObject1);
    j.p(localObject3, "<set-?>");
    ((a)localObject2).iPA = ((m)localObject3);
    localObject2 = ((g)localObject1).iQk;
    localObject3 = (m)new g.o((g)localObject1);
    j.p(localObject3, "<set-?>");
    ((a)localObject2).iPz = ((m)localObject3);
    ((g)localObject1).aNL().setAdapter((RecyclerView.a)((g)localObject1).iQk);
    if (((g)localObject1).aNC())
    {
      ((g)localObject1).aNL().addHeaderView(((g)localObject1).iQn.aNi());
      localObject2 = ((g)localObject1).iQn.aNi();
      if (localObject2 != null)
        ((View)localObject2).setVisibility(8);
      ((g)localObject1).iQn.aNh();
      ((g)localObject1).iQn.pS(0);
      ((g)localObject1).iQn.pT(0);
    }
    localObject2 = LayoutInflater.from(((g)localObject1).context).inflate(2130968726, (ViewGroup)((g)localObject1).aNL(), false);
    ((g)localObject1).aNL().addHeaderView((View)localObject2);
    localObject3 = ((View)localObject2).findViewById(2131821350);
    if (localObject3 == null)
    {
      localObject1 = new a.v("null cannot be cast to non-null type android.widget.TextView");
      AppMethodBeat.o(135146);
      throw ((Throwable)localObject1);
    }
    ((TextView)localObject3).setText((CharSequence)((g)localObject1).aNB());
    ((View)localObject2).setOnLongClickListener((View.OnLongClickListener)g.g.iQI);
    ((g)localObject1).aNL().setLoadingView(((g)localObject1).aNN().aNi());
    h.a((g)localObject1, false);
    h.b((g)localObject1, false);
    ((g)localObject1).aNN();
    ((g)localObject1).aNN().aNr();
    ((g)localObject1).iQl.fQk = ((g)localObject1).aNM().hbm;
    localObject2 = ((g)localObject1).iQl;
    if (((g)localObject1).aNM().hbl > 0)
    {
      bool2 = true;
      ((g.b)localObject2).iQz = bool2;
      ((g)localObject1).aNM().hbs = ((q)new g.f((g)localObject1));
      if ((((g)localObject1).aNM().axY().isEmpty()) || (!((g)localObject1).aNM().hbn))
        break label529;
    }
    label529: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((g)localObject1).eL(bool2);
      if (!bool2)
        e.pX(2);
      ((g)localObject1).aNL().setOnLoadingStateChangedListener((LoadMoreRecyclerView.a)new g.h((g)localObject1));
      ((g)localObject1).aNL().a((RecyclerView.m)((g)localObject1).iQw);
      ((g)localObject1).iQo.aNG();
      ((g)localObject1).iQk.notifyDataSetChanged();
      AppMethodBeat.o(135146);
      return;
      bool2 = false;
      break;
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(135145);
    super.onCreate(paramBundle);
    ab.i(TAG, "onCreate");
    getLifecycle().addObserver((LifecycleObserver)aNA());
    AppMethodBeat.o(135145);
  }

  public final void onDestroyView()
  {
    AppMethodBeat.i(135148);
    super.onDestroyView();
    ab.i(TAG, "onDestroyView");
    Lifecycle localLifecycle = getLifecycle();
    j.o(localLifecycle, "lifecycle");
    localLifecycle.getCurrentState();
    AppMethodBeat.o(135148);
  }

  public final void onPause()
  {
    AppMethodBeat.i(135149);
    super.onPause();
    ab.i(TAG, "onPause");
    AppMethodBeat.o(135149);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandLauncherRecommendList
 * JD-Core Version:    0.6.2
 */