package com.tencent.mm.plugin.card.ui.v2;

import a.f.b.j;
import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.b;
import com.tencent.mm.plugin.card.model.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.protocal.protobuf.bik;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardInvalidTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "()V", "firstLoad", "", "isAll", "isLoading", "isShowClearBtn", "mInvalidTicketList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListModel;", "mTicketAdapter", "Lcom/tencent/mm/plugin/card/ui/v2/CardTicketAdapter;", "getMTicketAdapter", "()Lcom/tencent/mm/plugin/card/ui/v2/CardTicketAdapter;", "setMTicketAdapter", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketAdapter;)V", "mTicketRv", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "getMTicketRv", "()Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "setMTicketRv", "(Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;)V", "offset", "", "reqNum", "doClearInvalidTicketList", "", "doDeleteInvalidTicket", "cardId", "", "doGetInvalidTicketHomePage", "getLayoutId", "gotoCardDetailUI", "initView", "invalidTicketIds", "loadSnapshot", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinishLocationThings", "ret", "isLocationOk", "saveSnapshot", "updateModelList", "ticketList", "Lcom/tencent/mm/protocal/protobuf/PageTicketList;", "updateOptionMenu", "Companion", "plugin-card_release"})
public final class CardInvalidTicketListUI extends CardNewBaseUI
{
  public static final CardInvalidTicketListUI.a kpJ;
  private boolean exX;
  private boolean isLoading;
  private int koB;
  private boolean koC;
  public LoadMoreRecyclerView kpF;
  public c kpG;
  private ArrayList<d> kpH;
  private boolean kpI;
  private int offset;

  static
  {
    AppMethodBeat.i(89273);
    kpJ = new CardInvalidTicketListUI.a((byte)0);
    AppMethodBeat.o(89273);
  }

  public CardInvalidTicketListUI()
  {
    AppMethodBeat.i(89272);
    this.kpH = new ArrayList();
    this.koB = 10;
    this.exX = true;
    AppMethodBeat.o(89272);
  }

  private final void a(bik parambik)
  {
    AppMethodBeat.i(89270);
    if (parambik != null)
    {
      Object localObject = parambik.wLN;
      j.o(localObject, "page_ticket_element");
      if (!((Collection)localObject).isEmpty());
      for (int i = 1; i != 0; i = 0)
      {
        localObject = parambik.wLN.iterator();
        while (((Iterator)localObject).hasNext())
        {
          parambik = (bih)((Iterator)localObject).next();
          d locald = new d();
          locald.kqe = parambik;
          locald.type = 2;
          this.kpH.add(locald);
        }
      }
    }
    parambik = this.kpG;
    if (parambik == null)
      j.avw("mTicketAdapter");
    parambik.a(null, this.kpH, null);
    AppMethodBeat.o(89270);
  }

  private final void ben()
  {
    AppMethodBeat.i(89271);
    ab.i("MicroMsg.CardInvalidTicketListUI", "do get invalid ticket: %s, %s, %s, %s", new Object[] { Integer.valueOf(this.offset), Integer.valueOf(this.koB), Boolean.valueOf(this.koC), Boolean.valueOf(this.isLoading) });
    if ((!this.koC) && (!this.isLoading))
    {
      this.isLoading = true;
      new i(this.offset, this.koB, this.cEB, this.cGm).acy().b((com.tencent.mm.vending.c.a)new CardInvalidTicketListUI.d(this));
    }
    AppMethodBeat.o(89271);
  }

  public final void P(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(89269);
    ab.i("MicroMsg.CardInvalidTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", new Object[] { Float.valueOf(this.cEB), Float.valueOf(this.cGm), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (this.exX)
    {
      ben();
      AppMethodBeat.o(89269);
    }
    while (true)
    {
      return;
      if (!paramBoolean)
        bep();
      AppMethodBeat.o(89269);
    }
  }

  public final LoadMoreRecyclerView bel()
  {
    AppMethodBeat.i(89264);
    LoadMoreRecyclerView localLoadMoreRecyclerView = this.kpF;
    if (localLoadMoreRecyclerView == null)
      j.avw("mTicketRv");
    AppMethodBeat.o(89264);
    return localLoadMoreRecyclerView;
  }

  public final c bem()
  {
    AppMethodBeat.i(89265);
    c localc = this.kpG;
    if (localc == null)
      j.avw("mTicketAdapter");
    AppMethodBeat.o(89265);
    return localc;
  }

  public final int getLayoutId()
  {
    return 2130968995;
  }

  public final void initView()
  {
    AppMethodBeat.i(89267);
    Object localObject1 = findViewById(2131822330);
    j.o(localObject1, "findViewById(R.id.ctlu_rv)");
    this.kpF = ((LoadMoreRecyclerView)localObject1);
    this.kpG = new c(true);
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    Object localObject2 = this.kpG;
    if (localObject2 == null)
      j.avw("mTicketAdapter");
    ((LoadMoreRecyclerView)localObject1).setAdapter((RecyclerView.a)localObject2);
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setEmptyView(findViewById(2131822163));
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    localObject1 = (TextView)((LoadMoreRecyclerView)localObject1).getEmptyView().findViewById(2131822164);
    j.o(localObject1, "emptyTv");
    ((TextView)localObject1).setText((CharSequence)getString(2131297950));
    localObject2 = new android.support.v7.widget.z((Context)this);
    ((android.support.v7.widget.z)localObject2).setDrawable(getResources().getDrawable(2130838085));
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).b((RecyclerView.h)localObject2);
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setLoadingView(2130968937);
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setOnLoadingStateChangedListener((LoadMoreRecyclerView.a)new CardInvalidTicketListUI.e(this));
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setOnItemClickListener((MRecyclerView.a)new CardInvalidTicketListUI.f(this));
    localObject1 = this.kpF;
    if (localObject1 == null)
      j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setOnItemLongClickListener((MRecyclerView.b)new CardInvalidTicketListUI.g(this));
    AppMethodBeat.o(89267);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(89266);
    dxR();
    super.onCreate(paramBundle);
    xE(Color.parseColor("#f3f3f3"));
    dyb();
    initView();
    paramBundle = new bik();
    Object localObject = com.tencent.mm.plugin.card.model.a.a.kfc;
    j.p(paramBundle, "invalidTicketList");
    ab.d(com.tencent.mm.plugin.card.model.a.a.access$getTAG$cp(), "load invalid ticket page snapshot");
    localObject = g.RP();
    j.o(localObject, "MMKernel.storage()");
    String str = (String)((e)localObject).Ry().i(ac.a.xWj);
    if (str != null)
    {
      localObject = a.k.d.ISO_8859_1;
      if (str == null)
      {
        paramBundle = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(89266);
        throw paramBundle;
      }
      localObject = str.getBytes((Charset)localObject);
      j.o(localObject, "(this as java.lang.String).getBytes(charset)");
      paramBundle.parseFrom((byte[])localObject);
    }
    a(paramBundle);
    setMMTitle(2131304052);
    setBackBtn((MenuItem.OnMenuItemClickListener)new CardInvalidTicketListUI.h(this));
    h.pYm.e(16322, new Object[] { Integer.valueOf(9) });
    AppMethodBeat.o(89266);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(89268);
    super.onDestroy();
    Object localObject1 = new bik();
    ((bik)localObject1).wLN = new LinkedList();
    Object localObject2 = this.kpH.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      bih localbih = ((d)((Iterator)localObject2).next()).kqe;
      if (localbih != null)
        ((bik)localObject1).wLN.add(localbih);
    }
    localObject2 = com.tencent.mm.plugin.card.model.a.a.kfc;
    j.p(localObject1, "invalidTicketList");
    ab.d(com.tencent.mm.plugin.card.model.a.a.access$getTAG$cp(), "save invalid ticket snapshot");
    localObject1 = ((bik)localObject1).toByteArray();
    j.o(localObject1, "invalidTicketList.toByteArray()");
    localObject1 = new String((byte[])localObject1, a.k.d.ISO_8859_1);
    localObject2 = g.RP();
    j.o(localObject2, "MMKernel.storage()");
    ((e)localObject2).Ry().set(ac.a.xWj, localObject1);
    AppMethodBeat.o(89268);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardInvalidTicketListUI
 * JD-Core Version:    0.6.2
 */