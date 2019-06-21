package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.k.d;
import a.l;
import a.v;
import a.y;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.s;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.b;
import com.tencent.mm.plugin.card.model.a.a.a;
import com.tencent.mm.protocal.protobuf.nq;
import com.tencent.mm.protocal.protobuf.ns;
import com.tencent.mm.protocal.protobuf.nv;
import com.tencent.mm.protocal.protobuf.nw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "()V", "adjustFooterTask", "Lkotlin/Function0;", "", "cardTitleModel", "Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$CardListModel;", "clickArea", "", "clickedCardHomePageElement", "Lcom/tencent/mm/protocal/protobuf/CardHomePageElement;", "firstLoad", "", "getCardHomePageScene", "Lcom/tencent/mm/plugin/card/model/v2/CgiGetMktCardHomePage;", "isAll", "isGotoItem", "isLoading", "mDivider", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "mEmptyView", "Landroid/view/ViewGroup;", "mFooterView", "mHomePageAdapter", "Lcom/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$HomePageAdapter;", "mLoadingView", "mLoadingView2", "mRecyclerView", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "markReloadHomePage", "offset", "reqNum", "scene", "shouldShowTicket", "showSort", "sortType", "storeModelList", "Ljava/util/ArrayList;", "ticketModel", "ticketNum", "", "tipsDialog", "Landroid/app/Dialog;", "titleSectionModel", "underModelList", "doDeleteMchInList", "merchantId", "doGetCardHomePage", "doGetMchInfo", "lastReceiveTime", "", "getLayoutId", "initFirstScreen", "initView", "loadSnapshot", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinishLocationThings", "ret", "isLocationOk", "onResume", "saveSnapshot", "showSortSheet", "updateModelList", "storePageList", "Lcom/tencent/mm/protocal/protobuf/CardHomePageStoreList;", "underPageList", "Lcom/tencent/mm/protocal/protobuf/CardHomePageUnderList;", "CardListModel", "CardSpan", "Companion", "HomePageAdapter", "HomePageVH", "plugin-card_release"})
@i
public final class CardHomePageNewUI extends CardNewBaseUI
{
  private static final int cjn;
  private static final int koR;
  private static final int koS;
  public static final CardHomePageNewUI.c koT;
  private boolean exX;
  private Dialog gnn;
  private boolean isLoading;
  private int kfk;
  private ViewGroup koA;
  private int koB;
  private boolean koC;
  private String koD;
  private final ArrayList<CardHomePageNewUI.a> koE;
  private final ArrayList<CardHomePageNewUI.a> koF;
  private CardHomePageNewUI.a koG;
  private CardHomePageNewUI.a koH;
  private CardHomePageNewUI.a koI;
  private boolean koJ;
  private int koK;
  private boolean koL;
  private int koM;
  private ns koN;
  private boolean koO;
  private final a.f.a.a<y> koP;
  private com.tencent.mm.plugin.card.model.a.h koQ;
  private LoadMoreRecyclerView kou;
  private CardHomePageNewUI.d kov;
  private ViewGroup kow;
  private ViewGroup kox;
  private ViewGroup koy;
  private RecyclerView.h koz;
  private int offset;
  private int scene;

  static
  {
    AppMethodBeat.i(89244);
    koT = new CardHomePageNewUI.c((byte)0);
    cjn = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 40);
    koR = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 1);
    koS = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 16);
    AppMethodBeat.o(89244);
  }

  public CardHomePageNewUI()
  {
    AppMethodBeat.i(89243);
    this.koB = 10;
    this.koD = "";
    this.koE = new ArrayList();
    this.koF = new ArrayList();
    this.exX = true;
    this.koK = -1;
    this.koL = true;
    this.koP = ((a.f.a.a)new f(this));
    AppMethodBeat.o(89243);
  }

  private final void bef()
  {
    AppMethodBeat.i(89239);
    if ((!beg()) && (this.koE.isEmpty()) && (this.koF.isEmpty()))
    {
      ab.i("MicroMsg.CardHomePageNewUI", "show init view");
      CardHomePageNewUI.a locala = new CardHomePageNewUI.a(this);
      locala.type = 3;
      localObject = new CardHomePageNewUI.a(this);
      ((CardHomePageNewUI.a)localObject).type = 3;
      this.koE.add(locala);
      this.koE.add(localObject);
    }
    Object localObject = this.kou;
    if (localObject == null)
      j.avw("mRecyclerView");
    ((LoadMoreRecyclerView)localObject).getAdapter().notifyDataSetChanged();
    AppMethodBeat.o(89239);
  }

  private boolean beg()
  {
    AppMethodBeat.i(89240);
    nv localnv = new nv();
    nw localnw = new nw();
    a.a locala = com.tencent.mm.plugin.card.model.a.a.kfc;
    boolean bool = a.a.a(localnv, localnw);
    b(localnv, localnw);
    AppMethodBeat.o(89240);
    return bool;
  }

  private final void beh()
  {
    AppMethodBeat.i(89242);
    ab.i("MicroMsg.CardHomePageNewUI", "do get card Home page: %s, %s", new Object[] { Boolean.valueOf(this.koC), Boolean.valueOf(this.isLoading) });
    Object localObject;
    if ((this.koO) || ((!this.koC) && (!this.isLoading)))
    {
      this.isLoading = true;
      if (this.koO)
      {
        localObject = this.koA;
        if (localObject == null)
          j.avw("mLoadingView2");
        ((ViewGroup)localObject).setVisibility(0);
        if (this.koH != null)
        {
          localObject = this.koA;
          if (localObject == null)
            j.avw("mLoadingView2");
          localObject = ((ViewGroup)localObject).getLayoutParams();
          if (localObject == null)
          {
            localObject = new v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            AppMethodBeat.o(89242);
            throw ((Throwable)localObject);
          }
          localObject = (RelativeLayout.LayoutParams)localObject;
          ((RelativeLayout.LayoutParams)localObject).topMargin = com.tencent.mm.bz.a.fromDPToPix((Context)dxU(), 80);
          ViewGroup localViewGroup = this.koA;
          if (localViewGroup == null)
            j.avw("mLoadingView2");
          localViewGroup.setLayoutParams((ViewGroup.LayoutParams)localObject);
        }
      }
      if (this.kfk != 1)
        break label347;
    }
    label347: for (int i = 100; ; i = 10)
    {
      this.koB = i;
      if (this.gnn != null)
      {
        localObject = this.gnn;
        if (localObject == null)
          j.dWJ();
        ((Dialog)localObject).dismiss();
      }
      if (this.koE.isEmpty())
      {
        localObject = (Context)dxU();
        dxU().getString(2131296899);
        this.gnn = ((Dialog)com.tencent.mm.ui.base.h.b((Context)localObject, dxU().getString(2131300968), true, null));
      }
      this.koQ = new com.tencent.mm.plugin.card.model.a.h(this.offset, this.koB, this.cEB, this.cGm, this.kfk);
      localObject = this.koQ;
      if (localObject == null)
        j.dWJ();
      ((com.tencent.mm.plugin.card.model.a.h)localObject).acy().b((com.tencent.mm.vending.c.a)new CardHomePageNewUI.h(this));
      AppMethodBeat.o(89242);
      return;
    }
  }

  public final void P(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(89238);
    ab.i("MicroMsg.CardHomePageNewUI", "location finish: [%s, %s], ret: %s, isOk: %s", new Object[] { Float.valueOf(this.cEB), Float.valueOf(this.cGm), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (this.exX)
    {
      if (paramInt == -2)
        this.kfk = 2;
      beh();
      AppMethodBeat.o(89238);
    }
    while (true)
    {
      return;
      if (!paramBoolean)
        bep();
      AppMethodBeat.o(89238);
    }
  }

  public final void b(nv paramnv, nw paramnw)
  {
    AppMethodBeat.i(89241);
    Object localObject;
    if (paramnv != null)
    {
      localObject = paramnv.vTp;
      j.o(localObject, "card_home_page_element");
      if (!((Collection)localObject).isEmpty());
      for (i = 1; i != 0; i = 0)
      {
        localObject = paramnv.vTp.iterator();
        while (((Iterator)localObject).hasNext())
        {
          paramnv = (ns)((Iterator)localObject).next();
          CardHomePageNewUI.a locala = new CardHomePageNewUI.a(this);
          locala.koU = paramnv;
          locala.type = 0;
          this.koE.add(locala);
        }
      }
    }
    if (paramnw != null)
    {
      paramnv = paramnw.vTp;
      j.o(paramnv, "card_home_page_element");
      if (!((Collection)paramnv).isEmpty());
      for (i = 1; i != 0; i = 0)
      {
        if (bo.isNullOrNil(paramnw.vTq))
          paramnw.vTq = getString(2131297879);
        if (this.koG == null)
        {
          this.koG = new CardHomePageNewUI.a(this);
          paramnv = this.koG;
          if (paramnv == null)
            j.dWJ();
          paramnv.type = 1;
        }
        paramnv = this.koG;
        if (paramnv == null)
          j.dWJ();
        localObject = paramnw.vTq;
        j.o(localObject, "section_title");
        paramnv.GV((String)localObject);
        paramnw = paramnw.vTp.iterator();
        while (paramnw.hasNext())
        {
          paramnv = (ns)paramnw.next();
          localObject = new CardHomePageNewUI.a(this);
          ((CardHomePageNewUI.a)localObject).koU = paramnv;
          ((CardHomePageNewUI.a)localObject).type = 2;
          this.koF.add(localObject);
        }
      }
    }
    if (this.scene == 0)
    {
      this.koH = new CardHomePageNewUI.a(this);
      paramnv = this.koH;
      if (paramnv == null)
        j.dWJ();
      paramnv.type = 4;
    }
    if (this.scene == 0)
      if (((Collection)this.koE).isEmpty())
        break label461;
    label461: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.koI = new CardHomePageNewUI.a(this);
        paramnv = this.koI;
        if (paramnv == null)
          j.dWJ();
        paramnv.type = 5;
      }
      if ((!this.koE.isEmpty()) || (!this.koF.isEmpty()))
        break label538;
      if (this.koH == null)
        break label511;
      paramnv = this.koy;
      if (paramnv == null)
        j.avw("mEmptyView");
      paramnv = paramnv.getLayoutParams();
      if (paramnv != null)
        break;
      paramnv = new v("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
      AppMethodBeat.o(89241);
      throw paramnv;
    }
    paramnv = (RelativeLayout.LayoutParams)paramnv;
    paramnv.topMargin = com.tencent.mm.bz.a.fromDPToPix((Context)dxU(), 80);
    paramnw = this.koy;
    if (paramnw == null)
      j.avw("mEmptyView");
    paramnw.setLayoutParams((ViewGroup.LayoutParams)paramnv);
    label511: paramnv = this.koy;
    if (paramnv == null)
      j.avw("mEmptyView");
    paramnv.setVisibility(0);
    AppMethodBeat.o(89241);
    while (true)
    {
      return;
      label538: paramnv = this.koy;
      if (paramnv == null)
        j.avw("mEmptyView");
      paramnv.setVisibility(8);
      AppMethodBeat.o(89241);
    }
  }

  public final int getLayoutId()
  {
    return 2130968940;
  }

  public final void initView()
  {
    AppMethodBeat.i(89237);
    Object localObject1 = findViewById(2131822174);
    j.o(localObject1, "findViewById(R.id.chpu_rv)");
    this.kou = ((LoadMoreRecyclerView)localObject1);
    localObject1 = this.kou;
    if (localObject1 == null)
      j.avw("mRecyclerView");
    ((LoadMoreRecyclerView)localObject1).setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    this.kov = new CardHomePageNewUI.d(this);
    Object localObject2 = this.kou;
    if (localObject2 == null)
      j.avw("mRecyclerView");
    localObject1 = this.kov;
    if (localObject1 == null)
      j.avw("mHomePageAdapter");
    ((LoadMoreRecyclerView)localObject2).setAdapter((RecyclerView.a)localObject1);
    localObject1 = findViewById(2131822163);
    j.o(localObject1, "findViewById(R.id.chpe_root_layout)");
    this.koy = ((ViewGroup)localObject1);
    localObject2 = LayoutInflater.from((Context)this);
    localObject1 = this.kou;
    if (localObject1 == null)
      j.avw("mRecyclerView");
    localObject1 = ((LayoutInflater)localObject2).inflate(2130968937, (ViewGroup)localObject1, false);
    if (localObject1 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type android.view.ViewGroup");
      AppMethodBeat.o(89237);
      throw ((Throwable)localObject1);
    }
    this.kow = ((ViewGroup)localObject1);
    localObject2 = LayoutInflater.from((Context)this);
    localObject1 = this.kou;
    if (localObject1 == null)
      j.avw("mRecyclerView");
    localObject1 = ((LayoutInflater)localObject2).inflate(2130968935, (ViewGroup)localObject1, false);
    if (localObject1 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type android.view.ViewGroup");
      AppMethodBeat.o(89237);
      throw ((Throwable)localObject1);
    }
    this.kox = ((ViewGroup)localObject1);
    localObject1 = findViewById(2131822175);
    j.o(localObject1, "findViewById(R.id.chpu_loading_layout)");
    this.koA = ((ViewGroup)localObject1);
    localObject2 = this.kou;
    if (localObject2 == null)
      j.avw("mRecyclerView");
    localObject1 = this.kow;
    if (localObject1 == null)
      j.avw("mLoadingView");
    ((LoadMoreRecyclerView)localObject2).setLoadingView((View)localObject1);
    localObject2 = this.kou;
    if (localObject2 == null)
      j.avw("mRecyclerView");
    localObject1 = this.kox;
    if (localObject1 == null)
      j.avw("mFooterView");
    ((LoadMoreRecyclerView)localObject2).addFooterView((View)localObject1);
    localObject1 = this.kox;
    if (localObject1 == null)
      j.avw("mFooterView");
    ((ViewGroup)localObject1).setVisibility(8);
    this.koz = ((RecyclerView.h)new j(this));
    localObject2 = this.kou;
    if (localObject2 == null)
      j.avw("mRecyclerView");
    localObject1 = this.koz;
    if (localObject1 == null)
      j.avw("mDivider");
    ((LoadMoreRecyclerView)localObject2).b((RecyclerView.h)localObject1);
    localObject1 = this.kou;
    if (localObject1 == null)
      j.avw("mRecyclerView");
    ((LoadMoreRecyclerView)localObject1).setOnLoadingStateChangedListener((LoadMoreRecyclerView.a)new CardHomePageNewUI.k(this));
    localObject1 = this.kou;
    if (localObject1 == null)
      j.avw("mRecyclerView");
    ((LoadMoreRecyclerView)localObject1).setOnItemClickListener((MRecyclerView.a)new CardHomePageNewUI.l(this));
    localObject1 = this.kou;
    if (localObject1 == null)
      j.avw("mRecyclerView");
    ((LoadMoreRecyclerView)localObject1).setOnItemLongClickListener((MRecyclerView.b)new CardHomePageNewUI.m(this));
    bef();
    AppMethodBeat.o(89237);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(89234);
    dxR();
    super.onCreate(paramBundle);
    xE(Color.parseColor("#ededed"));
    dyb();
    setMMTitle(2131297882);
    this.scene = getIntent().getIntExtra("key_home_page_from_scene", 0);
    initView();
    paramBundle = com.tencent.mm.kernel.g.RP();
    j.o(paramBundle, "MMKernel.storage()");
    this.koM = paramBundle.Ry().getInt(ac.a.xWm, 0);
    paramBundle = com.tencent.mm.kernel.g.RP();
    j.o(paramBundle, "MMKernel.storage()");
    this.kfk = paramBundle.Ry().getInt(ac.a.xWn, 1);
    if (this.koM == 1)
      com.tencent.mm.plugin.report.service.h.pYm.e(16322, new Object[] { Integer.valueOf(14) });
    ab.i("MicroMsg.CardHomePageNewUI", "on create, scene: %s", new Object[] { Integer.valueOf(this.scene) });
    setBackBtn((MenuItem.OnMenuItemClickListener)new CardHomePageNewUI.n(this));
    if ((this.scene == 1) && (this.koM == 1))
      addTextOptionMenu(0, getString(2131305849), (MenuItem.OnMenuItemClickListener)new CardHomePageNewUI.o(this));
    com.tencent.mm.plugin.report.service.h.pYm.e(16322, new Object[] { Integer.valueOf(4) });
    ((com.tencent.mm.pluginsdk.wallet.b)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.wallet.b.class)).eA(8, 2);
    AppMethodBeat.o(89234);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(89235);
    super.onDestroy();
    Object localObject1 = com.tencent.mm.kernel.g.RP();
    j.o(localObject1, "MMKernel.storage()");
    ((e)localObject1).Ry().set(ac.a.xWn, Integer.valueOf(this.kfk));
    if (this.koQ != null)
    {
      localObject1 = this.koQ;
      if (localObject1 == null)
        j.dWJ();
      ((com.tencent.mm.plugin.card.model.a.h)localObject1).cancel();
      this.koQ = null;
    }
    Object localObject2 = this.kou;
    if (localObject2 == null)
      j.avw("mRecyclerView");
    localObject1 = this.koP;
    if (localObject1 != null)
      localObject1 = new b((a.f.a.a)localObject1);
    while (true)
    {
      ((LoadMoreRecyclerView)localObject2).removeCallbacks((Runnable)localObject1);
      com.tencent.mm.plugin.card.b.k.baK();
      ab.i("MicroMsg.CardHomePageNewUI", "do save snap shot");
      Object localObject3 = new nv();
      ((nv)localObject3).vTp = new LinkedList();
      localObject1 = this.koE.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((CardHomePageNewUI.a)((Iterator)localObject1).next()).koU;
        if (localObject2 != null)
          ((nv)localObject3).vTp.add(localObject2);
      }
      localObject2 = new nw();
      localObject1 = this.koG;
      if (localObject1 != null);
      for (localObject1 = ((CardHomePageNewUI.a)localObject1).bek(); ; localObject1 = null)
      {
        ((nw)localObject2).vTq = ((String)localObject1);
        ((nw)localObject2).vTp = new LinkedList();
        localObject1 = this.koF.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          ns localns = ((CardHomePageNewUI.a)((Iterator)localObject1).next()).koU;
          if (localns != null)
            ((nw)localObject2).vTp.add(localns);
        }
      }
      localObject1 = com.tencent.mm.plugin.card.model.a.a.kfc;
      j.p(localObject3, "storeList");
      j.p(localObject2, "underList");
      ab.i(com.tencent.mm.plugin.card.model.a.a.access$getTAG$cp(), "save home page snapshot");
      localObject1 = ((nv)localObject3).toByteArray();
      j.o(localObject1, "storeList.toByteArray()");
      localObject3 = new String((byte[])localObject1, d.ISO_8859_1);
      localObject1 = com.tencent.mm.kernel.g.RP();
      j.o(localObject1, "MMKernel.storage()");
      ((e)localObject1).Ry().set(ac.a.xWe, localObject3);
      localObject1 = ((nw)localObject2).toByteArray();
      j.o(localObject1, "underList.toByteArray()");
      localObject2 = new String((byte[])localObject1, d.ISO_8859_1);
      localObject1 = com.tencent.mm.kernel.g.RP();
      j.o(localObject1, "MMKernel.storage()");
      ((e)localObject1).Ry().set(ac.a.xWf, localObject2);
      AppMethodBeat.o(89235);
      return;
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(89236);
    super.onResume();
    if ((this.koJ) && (this.koN != null) && (this.koK != -1))
    {
      ns localns = this.koN;
      if (localns == null)
        j.dWJ();
      String str = localns.vSR;
      j.o(str, "clickedCardHomePageElement!!.card_pack_merchant_id");
      localns = this.koN;
      if (localns == null)
        j.dWJ();
      long l = localns.vTi;
      ab.i("MicroMsg.CardHomePageNewUI", "do get mch infoset: %s", new Object[] { str });
      new com.tencent.mm.plugin.card.model.a.g(str, l, this.cEB, this.cGm, this.kfk).acy().b((com.tencent.mm.vending.c.a)new CardHomePageNewUI.i(this, str));
      this.koJ = false;
      this.koN = null;
    }
    AppMethodBeat.o(89236);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class e$a
    implements View.OnClickListener
  {
    e$a(CardHomePageNewUI.e parame, ns paramns, nq paramnq, int paramInt1, int paramInt2)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(89191);
      CardHomePageNewUI.i(this.kpp.koY);
      CardHomePageNewUI.a(this.kpp.koY, 0);
      CardHomePageNewUI.a(this.kpp.koY, this.kpq);
      paramView = this.kpp;
      String str = this.kpr.vCb;
      j.o(str, "coupon.user_card_id");
      paramView.GY(str);
      com.tencent.mm.plugin.report.service.h.pYm.e(16324, new Object[] { Integer.valueOf(1), this.kpq.vSR, Integer.valueOf(this.kps), this.kpr.vCb, Integer.valueOf(2), Integer.valueOf(this.exi), Integer.valueOf(CardHomePageNewUI.k(this.kpp.koY)) });
      AppMethodBeat.o(89191);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
  static final class e$b
    implements View.OnClickListener
  {
    e$b(CardHomePageNewUI.e parame, ns paramns, nq paramnq, int paramInt1, int paramInt2)
    {
    }

    public final void onClick(View paramView)
    {
      AppMethodBeat.i(89192);
      CardHomePageNewUI.i(this.kpp.koY);
      CardHomePageNewUI.a(this.kpp.koY, 0);
      CardHomePageNewUI.a(this.kpp.koY, this.kpq);
      paramView = this.kpp;
      String str = this.kpr.vCb;
      j.o(str, "coupon.user_card_id");
      paramView.GY(str);
      com.tencent.mm.plugin.report.service.h.pYm.e(16324, new Object[] { Integer.valueOf(1), this.kpq.vSR, Integer.valueOf(this.kps), this.kpr.vCb, Integer.valueOf(2), Integer.valueOf(this.exi), Integer.valueOf(CardHomePageNewUI.k(this.kpp.koY)) });
      AppMethodBeat.o(89192);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class f extends a.f.b.k
    implements a.f.a.a<y>
  {
    f(CardHomePageNewUI paramCardHomePageNewUI)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/card/ui/v2/CardHomePageNewUI$initView$1", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onDraw", "c", "Landroid/graphics/Canvas;", "plugin-card_release"})
  public static final class j extends RecyclerView.h
  {
    private final Paint aFY;

    j()
    {
      AppMethodBeat.i(89220);
      this.aFY = new Paint();
      this.aFY.setColor(Color.parseColor("#19000000"));
      this.aFY.setStyle(Paint.Style.FILL);
      this.aFY.setFlags(1);
      AppMethodBeat.o(89220);
    }

    public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
    {
      AppMethodBeat.i(89219);
      super.a(paramCanvas, paramRecyclerView, params);
      paramRecyclerView = CardHomePageNewUI.h(this.koY);
      if (paramRecyclerView != null)
      {
        int i = paramRecyclerView.getPaddingLeft();
        params = CardHomePageNewUI.koT;
        int j = CardHomePageNewUI.bej();
        int k = paramRecyclerView.getWidth();
        int m = paramRecyclerView.getPaddingRight();
        int n = paramRecyclerView.getChildCount();
        int i1 = 0;
        if (i1 < n - 1)
        {
          params = paramRecyclerView.getChildAt(i1);
          j.o(params, "child");
          Object localObject = params.getLayoutParams();
          if (localObject == null)
          {
            paramCanvas = new v("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
            AppMethodBeat.o(89219);
            throw paramCanvas;
          }
          localObject = (RecyclerView.LayoutParams)localObject;
          int i2 = params.getBottom() + ((RecyclerView.LayoutParams)localObject).bottomMargin;
          if (i1 == n - 1)
            params = CardHomePageNewUI.koT;
          for (int i3 = CardHomePageNewUI.bei(); ; i3 = 1)
          {
            if (paramCanvas != null)
              paramCanvas.drawRect(i + j, i2, k - m, i3 + i2, this.aFY);
            i1++;
            break;
          }
        }
        AppMethodBeat.o(89219);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(89219);
      }
    }

    public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
    {
      AppMethodBeat.i(89218);
      super.a(paramRect, paramView, paramRecyclerView, params);
      int i;
      if (paramRecyclerView != null)
      {
        paramView = Integer.valueOf(RecyclerView.bo(paramView));
        i = CardHomePageNewUI.o(this.koY).getItemCount();
        if (paramView != null)
          break label62;
        label42: if (paramRect == null)
          break label111;
        paramRect.bottom = 1;
        AppMethodBeat.o(89218);
      }
      while (true)
      {
        return;
        paramView = null;
        break;
        label62: if (paramView.intValue() != i - 1)
          break label42;
        ab.d("MicroMsg.CardHomePageNewUI", "is last");
        if (paramRect != null)
        {
          paramView = CardHomePageNewUI.koT;
          paramRect.bottom = CardHomePageNewUI.bei();
          AppMethodBeat.o(89218);
        }
        else
        {
          AppMethodBeat.o(89218);
          continue;
          label111: AppMethodBeat.o(89218);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI
 * JD-Core Version:    0.6.2
 */