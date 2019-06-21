package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.view.LayoutInflater;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ci.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bih;
import com.tencent.mm.protocal.protobuf.bii;
import com.tencent.mm.protocal.protobuf.bij;
import com.tencent.mm.protocal.protobuf.bik;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListUI;", "Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "()V", "firstLoad", "", "getMktTicketHomePage", "Lcom/tencent/mm/plugin/card/model/v2/CgiGetMktTicketHomePage;", "isAll", "isLoading", "jumpList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListModel;", "licenseList", "mEmptyView", "Landroid/view/ViewGroup;", "mFooterView", "mTicketAdapter", "Lcom/tencent/mm/plugin/card/ui/v2/CardTicketAdapter;", "mTicketRv", "Lcom/tencent/mm/plugin/appbrand/widget/recyclerview/LoadMoreRecyclerView;", "offset", "", "reqNum", "ticketList", "adjustFooterView", "", "doDeleteTicket", "cardId", "", "doGetTicketHomePage", "getLayoutId", "gotoCardDetailUI", "initView", "loadSnapshot", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFinishLocationThings", "ret", "isLocationOk", "saveSnapshot", "updateModelList", "Lcom/tencent/mm/protocal/protobuf/PageTicketJumpList;", "Lcom/tencent/mm/protocal/protobuf/PageTicketList;", "Companion", "plugin-card_release"})
public final class CardTicketListUI extends CardNewBaseUI
{
  public static final a kqg;
  private boolean exX;
  private boolean isLoading;
  private int koB;
  private boolean koC;
  private ViewGroup kox;
  private ViewGroup koy;
  private LoadMoreRecyclerView kpF;
  private c kpG;
  private final ArrayList<d> kpW;
  private final ArrayList<d> kpX;
  private final ArrayList<d> kpY;
  private com.tencent.mm.plugin.card.model.a.j kqf;
  private int offset;

  static
  {
    AppMethodBeat.i(89319);
    kqg = new a((byte)0);
    AppMethodBeat.o(89319);
  }

  public CardTicketListUI()
  {
    AppMethodBeat.i(89318);
    this.koB = 10;
    this.exX = true;
    this.kpW = new ArrayList();
    this.kpX = new ArrayList();
    this.kpY = new ArrayList();
    AppMethodBeat.o(89318);
  }

  private final void Hc(final String paramString)
  {
    AppMethodBeat.i(89316);
    ab.i("MicroMsg.CardTicketListUI", "do delete ticket: %s", new Object[] { paramString });
    new com.tencent.mm.plugin.card.model.a.d(paramString).acy().b((com.tencent.mm.vending.c.a)new c(this, paramString));
    AppMethodBeat.o(89316);
  }

  private final void a(bij parambij, bik parambik1, bik parambik2)
  {
    AppMethodBeat.i(89315);
    Object localObject;
    int i;
    if (parambij != null)
    {
      this.kpY.clear();
      localObject = parambij.wLM;
      a.f.b.j.o(localObject, "page_ticket_jump_element");
      if (!((Collection)localObject).isEmpty());
      for (i = 1; i != 0; i = 0)
      {
        Iterator localIterator = parambij.wLM.iterator();
        while (localIterator.hasNext())
        {
          localObject = (bii)localIterator.next();
          parambij = new d();
          parambij.kqd = ((bii)localObject);
          parambij.type = 1;
          this.kpY.add(parambij);
        }
      }
    }
    if (parambik1 != null)
    {
      parambij = parambik1.wLN;
      a.f.b.j.o(parambij, "page_ticket_element");
      if (!((Collection)parambij).isEmpty());
      for (i = 1; i != 0; i = 0)
      {
        parambij = parambik1.wLN.iterator();
        while (parambij.hasNext())
        {
          parambik1 = (bih)parambij.next();
          localObject = new d();
          ((d)localObject).kqe = parambik1;
          ((d)localObject).type = 2;
          this.kpW.add(localObject);
        }
      }
    }
    if (parambik2 != null)
    {
      parambij = parambik2.wLN;
      a.f.b.j.o(parambij, "page_ticket_element");
      if (!((Collection)parambij).isEmpty());
      for (i = 1; i != 0; i = 0)
      {
        parambik2 = parambik2.wLN.iterator();
        while (parambik2.hasNext())
        {
          parambik1 = (bih)parambik2.next();
          parambij = new d();
          parambij.kqe = parambik1;
          parambij.type = 2;
          this.kpX.add(parambij);
        }
      }
    }
    if (!((Collection)this.kpY).isEmpty())
    {
      i = 1;
      if (i == 0)
      {
        if (((Collection)this.kpW).isEmpty())
          break label502;
        i = 1;
        label361: if (i == 0)
          break label514;
      }
      if (((Collection)this.kpX).isEmpty())
        break label508;
      i = 1;
      label384: if (i == 0)
        break label514;
      parambik1 = this.kpG;
      if (parambik1 == null)
        a.f.b.j.avw("mTicketAdapter");
      parambij = getString(2131298009);
      a.f.b.j.o(parambij, "getString(R.string.card_ticket_section_title)");
      parambik1.Ha(parambij);
      parambik1 = this.kpG;
      if (parambik1 == null)
        a.f.b.j.avw("mTicketAdapter");
      parambij = getString(2131297900);
      a.f.b.j.o(parambij, "getString(R.string.card_license_section_title)");
      parambik1.Hb(parambij);
    }
    while (true)
    {
      parambij = this.kpG;
      if (parambij == null)
        a.f.b.j.avw("mTicketAdapter");
      parambij.a(this.kpY, this.kpW, this.kpX);
      AppMethodBeat.o(89315);
      return;
      i = 0;
      break;
      label502: i = 0;
      break label361;
      label508: i = 0;
      break label384;
      label514: parambij = this.kpG;
      if (parambij == null)
        a.f.b.j.avw("mTicketAdapter");
      parambij.Ha("");
      parambij = this.kpG;
      if (parambij == null)
        a.f.b.j.avw("mTicketAdapter");
      parambij.Hb("");
    }
  }

  private final void beq()
  {
    AppMethodBeat.i(89317);
    ab.i("MicroMsg.CardTicketListUI", "do get ticket: %s, %s, %s, %s", new Object[] { Integer.valueOf(this.offset), Integer.valueOf(this.koB), Boolean.valueOf(this.koC), Boolean.valueOf(this.isLoading) });
    if ((!this.koC) && (!this.isLoading))
    {
      this.isLoading = true;
      this.kqf = new com.tencent.mm.plugin.card.model.a.j(this.offset, this.koB, this.cEB, this.cGm);
      com.tencent.mm.plugin.card.model.a.j localj = this.kqf;
      if (localj == null)
        a.f.b.j.dWJ();
      localj.acy().b((com.tencent.mm.vending.c.a)new CardTicketListUI.d(this));
    }
    AppMethodBeat.o(89317);
  }

  public final void P(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(89314);
    ab.i("MicroMsg.CardTicketListUI", "location finish: [%s, %s], ret: %s, isOk: %s", new Object[] { Float.valueOf(this.cEB), Float.valueOf(this.cGm), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (this.exX)
    {
      beq();
      AppMethodBeat.o(89314);
    }
    while (true)
    {
      return;
      if (!paramBoolean)
        bep();
      AppMethodBeat.o(89314);
    }
  }

  public final int getLayoutId()
  {
    return 2130968995;
  }

  public final void initView()
  {
    AppMethodBeat.i(89311);
    Object localObject1 = findViewById(2131822330);
    a.f.b.j.o(localObject1, "findViewById(R.id.ctlu_rv)");
    this.kpF = ((LoadMoreRecyclerView)localObject1);
    this.kpG = new c();
    localObject1 = this.kpF;
    if (localObject1 == null)
      a.f.b.j.avw("mTicketRv");
    Object localObject2 = this.kpG;
    if (localObject2 == null)
      a.f.b.j.avw("mTicketAdapter");
    ((LoadMoreRecyclerView)localObject1).setAdapter((RecyclerView.a)localObject2);
    localObject1 = this.kpF;
    if (localObject1 == null)
      a.f.b.j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setLayoutManager((RecyclerView.i)new LinearLayoutManager());
    localObject1 = new android.support.v7.widget.z((Context)this);
    ((android.support.v7.widget.z)localObject1).setDrawable(getResources().getDrawable(2130838085));
    localObject2 = this.kpF;
    if (localObject2 == null)
      a.f.b.j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject2).b((RecyclerView.h)localObject1);
    localObject1 = this.kpF;
    if (localObject1 == null)
      a.f.b.j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setLoadingView(2130968937);
    localObject2 = LayoutInflater.from((Context)this);
    localObject1 = this.kpF;
    if (localObject1 == null)
      a.f.b.j.avw("mTicketRv");
    localObject1 = ((LayoutInflater)localObject2).inflate(2130968935, (ViewGroup)localObject1, false);
    if (localObject1 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type android.view.ViewGroup");
      AppMethodBeat.o(89311);
      throw ((Throwable)localObject1);
    }
    this.kox = ((ViewGroup)localObject1);
    localObject1 = this.kox;
    if (localObject1 == null)
      a.f.b.j.avw("mFooterView");
    ((TextView)((ViewGroup)localObject1).findViewById(2131822165)).setOnClickListener((View.OnClickListener)new CardTicketListUI.e(this));
    localObject2 = this.kpF;
    if (localObject2 == null)
      a.f.b.j.avw("mTicketRv");
    localObject1 = this.kox;
    if (localObject1 == null)
      a.f.b.j.avw("mFooterView");
    ((LoadMoreRecyclerView)localObject2).addFooterView((View)localObject1);
    localObject1 = this.kox;
    if (localObject1 == null)
      a.f.b.j.avw("mFooterView");
    ((ViewGroup)localObject1).setVisibility(8);
    localObject1 = findViewById(2131822163);
    a.f.b.j.o(localObject1, "findViewById(R.id.chpe_root_layout)");
    this.koy = ((ViewGroup)localObject1);
    localObject2 = this.kpF;
    if (localObject2 == null)
      a.f.b.j.avw("mTicketRv");
    localObject1 = this.koy;
    if (localObject1 == null)
      a.f.b.j.avw("mEmptyView");
    ((LoadMoreRecyclerView)localObject2).setEmptyView((View)localObject1);
    localObject1 = this.kpF;
    if (localObject1 == null)
      a.f.b.j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setOnLoadingStateChangedListener((LoadMoreRecyclerView.a)new CardTicketListUI.f(this));
    localObject1 = this.kpF;
    if (localObject1 == null)
      a.f.b.j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setOnItemClickListener((MRecyclerView.a)new CardTicketListUI.g(this));
    localObject1 = this.kpF;
    if (localObject1 == null)
      a.f.b.j.avw("mTicketRv");
    ((LoadMoreRecyclerView)localObject1).setOnItemLongClickListener((MRecyclerView.b)new CardTicketListUI.h(this));
    AppMethodBeat.o(89311);
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = null;
    AppMethodBeat.i(89313);
    Object localObject2;
    if ((paramInt1 == 256) && (paramInt2 == -1))
    {
      if (paramIntent == null)
        break label62;
      localObject2 = Integer.valueOf(paramIntent.getIntExtra("key_finish_action", -1));
      if (localObject2 != null)
        break label68;
    }
    label62: label68: 
    while (((Integer)localObject2).intValue() != 1)
    {
      if (localObject2 != null)
        break label110;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(89313);
      return;
      localObject2 = null;
      break;
    }
    while (true)
    {
      localObject2 = localObject1;
      if (paramIntent != null)
        localObject2 = paramIntent.getStringExtra("key_card_id");
      a.f.b.j.o(localObject2, "cardId");
      Hc((String)localObject2);
      break;
      label110: if (((Integer)localObject2).intValue() != 2)
        break;
    }
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(89310);
    dxR();
    super.onCreate(paramBundle);
    xE(Color.parseColor("#f3f3f3"));
    dyb();
    initView();
    paramBundle = new bij();
    bik localbik1 = new bik();
    bik localbik2 = new bik();
    Object localObject1 = com.tencent.mm.plugin.card.model.a.a.kfc;
    a.f.b.j.p(paramBundle, "jumpList");
    a.f.b.j.p(localbik1, "ticketList");
    a.f.b.j.p(localbik2, "licenseList");
    ab.d(com.tencent.mm.plugin.card.model.a.a.access$getTAG$cp(), "load ticket page snapshot");
    localObject1 = g.RP();
    a.f.b.j.o(localObject1, "MMKernel.storage()");
    localObject1 = (String)((e)localObject1).Ry().i(ac.a.xWg);
    if (localObject1 != null)
    {
      localObject2 = a.k.d.ISO_8859_1;
      if (localObject1 == null)
      {
        paramBundle = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(89310);
        throw paramBundle;
      }
      localObject1 = ((String)localObject1).getBytes((Charset)localObject2);
      a.f.b.j.o(localObject1, "(this as java.lang.String).getBytes(charset)");
      paramBundle.parseFrom((byte[])localObject1);
    }
    localObject1 = g.RP();
    a.f.b.j.o(localObject1, "MMKernel.storage()");
    localObject1 = (String)((e)localObject1).Ry().i(ac.a.xWh);
    if (localObject1 != null)
    {
      localObject2 = a.k.d.ISO_8859_1;
      if (localObject1 == null)
      {
        paramBundle = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(89310);
        throw paramBundle;
      }
      localObject1 = ((String)localObject1).getBytes((Charset)localObject2);
      a.f.b.j.o(localObject1, "(this as java.lang.String).getBytes(charset)");
      localbik1.parseFrom((byte[])localObject1);
    }
    localObject1 = g.RP();
    a.f.b.j.o(localObject1, "MMKernel.storage()");
    Object localObject2 = (String)((e)localObject1).Ry().i(ac.a.xWi);
    if (localObject2 != null)
    {
      localObject1 = a.k.d.ISO_8859_1;
      if (localObject2 == null)
      {
        paramBundle = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(89310);
        throw paramBundle;
      }
      localObject1 = ((String)localObject2).getBytes((Charset)localObject1);
      a.f.b.j.o(localObject1, "(this as java.lang.String).getBytes(charset)");
      localbik2.parseFrom((byte[])localObject1);
    }
    a(paramBundle, localbik1, localbik2);
    setMMTitle(2131304053);
    setBackBtn((MenuItem.OnMenuItemClickListener)new CardTicketListUI.i(this));
    h.pYm.e(16322, new Object[] { Integer.valueOf(6) });
    AppMethodBeat.o(89310);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(89312);
    super.onDestroy();
    Object localObject1 = this.kqf;
    if (localObject1 != null)
      ((com.tencent.mm.plugin.card.model.a.j)localObject1).cancel();
    ab.i("MicroMsg.CardTicketListUI", "do save snapshot");
    Object localObject2 = new bij();
    ((bij)localObject2).wLM = new LinkedList();
    Object localObject3 = this.kpY.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = ((d)((Iterator)localObject3).next()).kqd;
      if (localObject1 != null)
        ((bij)localObject2).wLM.add(localObject1);
    }
    localObject3 = new bik();
    ((bik)localObject3).wLN = new LinkedList();
    localObject1 = this.kpW.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = ((d)((Iterator)localObject1).next()).kqe;
      if (localObject4 != null)
        ((bik)localObject3).wLN.add(localObject4);
    }
    localObject1 = new bik();
    ((bik)localObject1).wLN = new LinkedList();
    Object localObject4 = this.kpX.iterator();
    while (((Iterator)localObject4).hasNext())
    {
      bih localbih = ((d)((Iterator)localObject4).next()).kqe;
      if (localbih != null)
        ((bik)localObject1).wLN.add(localbih);
    }
    localObject4 = com.tencent.mm.plugin.card.model.a.a.kfc;
    a.f.b.j.p(localObject2, "jumpList");
    a.f.b.j.p(localObject3, "ticketList");
    a.f.b.j.p(localObject1, "licenseList");
    ab.d(com.tencent.mm.plugin.card.model.a.a.access$getTAG$cp(), "save ticket page snapshot");
    localObject2 = ((bij)localObject2).toByteArray();
    a.f.b.j.o(localObject2, "jumpList.toByteArray()");
    localObject2 = new String((byte[])localObject2, a.k.d.ISO_8859_1);
    localObject4 = g.RP();
    a.f.b.j.o(localObject4, "MMKernel.storage()");
    ((e)localObject4).Ry().set(ac.a.xWg, localObject2);
    localObject3 = ((bik)localObject3).toByteArray();
    a.f.b.j.o(localObject3, "ticketList.toByteArray()");
    localObject2 = new String((byte[])localObject3, a.k.d.ISO_8859_1);
    localObject3 = g.RP();
    a.f.b.j.o(localObject3, "MMKernel.storage()");
    ((e)localObject3).Ry().set(ac.a.xWh, localObject2);
    localObject1 = ((bik)localObject1).toByteArray();
    a.f.b.j.o(localObject1, "licenseList.toByteArray()");
    localObject1 = new String((byte[])localObject1, a.k.d.ISO_8859_1);
    localObject3 = g.RP();
    a.f.b.j.o(localObject3, "MMKernel.storage()");
    ((e)localObject3).Ry().set(ac.a.xWi, localObject1);
    AppMethodBeat.o(89312);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/card/ui/v2/CardTicketListUI$Companion;", "", "()V", "REQ_CARD_DETAIL", "", "TAG", "", "plugin-card_release"})
  public static final class a
  {
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class b
    implements Runnable
  {
    b(CardTicketListUI paramCardTicketListUI)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(89298);
      Object localObject = (ViewGroup)this.kqh.findViewById(2131820884);
      if (localObject == null)
      {
        AppMethodBeat.o(89298);
        return;
      }
      int i = ((ViewGroup)localObject).getHeight();
      int j = CardTicketListUI.d(this.kqh).computeVerticalScrollRange();
      ab.d("MicroMsg.CardTicketListUI", "range: %s, extent: %s, contentHeight: %s", new Object[] { Integer.valueOf(j), Integer.valueOf(CardTicketListUI.d(this.kqh).computeVerticalScrollExtent()), Integer.valueOf(i) });
      if (i > j)
      {
        i -= j;
        if (i >= 0)
        {
          j = CardTicketListUI.e(this.kqh).getPaddingTop();
          int k = CardTicketListUI.e(this.kqh).getPaddingBottom();
          CardTicketListUI.e(this.kqh).setPadding(0, i + j, 0, k);
        }
      }
      while (true)
      {
        localObject = (TextView)CardTicketListUI.e(this.kqh).findViewById(2131822165);
        a.f.b.j.o(localObject, "faqTv");
        ((TextView)localObject).setText((CharSequence)this.kqh.getString(2131304052));
        ((TextView)localObject).setVisibility(0);
        AppMethodBeat.o(89298);
        break;
        CardTicketListUI.e(this.kqh).setPadding(0, com.tencent.mm.bz.a.fromDPToPix((Context)this.kqh.dxU(), 48), 0, com.tencent.mm.bz.a.fromDPToPix((Context)this.kqh.dxU(), 24));
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/modelbase/Cgi$CgiBack;", "Lcom/tencent/mm/protocal/protobuf/DeleteCardInTicketListResponse;", "call"})
  static final class c<_Ret, _Var>
    implements com.tencent.mm.vending.c.a<_Ret, _Var>
  {
    c(CardTicketListUI paramCardTicketListUI, String paramString)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardTicketListUI
 * JD-Core Version:    0.6.2
 */