package com.tencent.mm.ui.chatting.c;

import android.content.Intent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMFragment;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.d;
import com.tencent.mm.ui.chatting.c.b.z;
import com.tencent.mm.ui.chatting.f.d.a;
import com.tencent.mm.ui.chatting.u;
import com.tencent.mm.ui.chatting.u.a;
import com.tencent.mm.ui.tools.o;
import java.util.ArrayList;

@com.tencent.mm.ui.chatting.c.a.a(dFp=z.class)
public class ag extends a
  implements z
{
  private o elS = null;
  private ListView yRA;
  private View yRB;
  private u yRC;
  public boolean yRD = false;
  private boolean yRE = true;
  private int yRF = 0;
  private boolean yRG = false;
  private View yRq;
  public boolean yRr = false;
  public boolean yRs = false;
  public boolean yRt = false;
  public boolean yRu = false;
  public boolean yRv = false;
  private long yRw = -1L;
  private ArrayList<String> yRx;
  public boolean yRy = false;
  private TextView yRz;

  public final void OD(int paramInt)
  {
    AppMethodBeat.i(31656);
    ab.i("MicroMsg.ChattingUI.SearchComponent", "search result count %d, in edit mode %B, can report %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.yRD), Boolean.valueOf(this.yRE) });
    if ((!this.yRr) && (!this.yRD))
    {
      ab.d("MicroMsg.ChattingUI.SearchComponent", "not search now");
      AppMethodBeat.o(31656);
    }
    while (true)
    {
      return;
      if ((this.yRE) && (paramInt >= 0))
      {
        this.yRE = false;
        com.tencent.mm.plugin.report.service.h.pYm.e(10811, new Object[] { Integer.valueOf(2) });
      }
      if (paramInt > 0)
      {
        this.yRA.setVisibility(0);
        this.cgL.Or(8);
        this.yRz.setVisibility(8);
        this.yRB.setVisibility(8);
        AppMethodBeat.o(31656);
      }
      else if (paramInt == 0)
      {
        this.yRA.setVisibility(8);
        this.cgL.Or(8);
        this.yRz.setVisibility(0);
        this.yRB.setVisibility(8);
        AppMethodBeat.o(31656);
      }
      else
      {
        this.yRA.setVisibility(8);
        this.cgL.Or(0);
        this.yRz.setVisibility(8);
        this.yRB.setVisibility(0);
        AppMethodBeat.o(31656);
      }
    }
  }

  public final void dDh()
  {
    AppMethodBeat.i(31658);
    super.dDh();
    this.yRG = true;
    if (this.yRC != null)
      this.yRC.bIf();
    if (this.elS != null)
      this.elS.clearFocus();
    AppMethodBeat.o(31658);
  }

  public final ArrayList<String> dEM()
  {
    return this.yRx;
  }

  public final boolean dEN()
  {
    return this.yRt;
  }

  public final void dEO()
  {
    AppMethodBeat.i(31654);
    if (this.yRq == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.v("MicroMsg.ChattingUI.SearchComponent", "enter edit search mode, search stub view is null?%B", new Object[] { Boolean.valueOf(bool) });
      this.yRD = true;
      this.cgL.Or(8);
      if (this.yRq == null)
        break;
      this.yRq.setVisibility(0);
      if (this.yRC != null)
        this.yRC.talker = this.cgL.getTalkerUserName();
      OD(-1);
      AppMethodBeat.o(31654);
      return;
    }
    i.a(this.cgL.yTx, 2131822384);
    this.yRq = this.cgL.findViewById(2131822385);
    this.yRq.setVisibility(0);
    this.yRB = this.cgL.findViewById(2131827269);
    this.cgL.getListView().setFocusable(false);
    this.cgL.getListView().setFocusableInTouchMode(false);
    this.yRB.setOnClickListener(new ag.8(this));
    this.yRB.setVisibility(8);
    this.yRz = ((TextView)this.cgL.findViewById(2131822728));
    if ((this.cgL.dFw()) || (((d)this.cgL.aF(d.class)).dDn()));
    for (bool = true; ; bool = false)
    {
      this.yRC = new u(this.cgL.yTx.getContext(), new bi(), this.cgL.getTalkerUserName(), this.cgL.dFu(), bool);
      this.yRC.yKp = new ag.9(this);
      this.yRA = ((ListView)this.cgL.findViewById(2131827268));
      this.yRA.setVisibility(0);
      this.yRA.setAdapter(this.yRC);
      this.yRA.setOnItemClickListener(new ag.10(this));
      this.yRA.setOnTouchListener(new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          AppMethodBeat.i(31644);
          ag.this.cgL.aqX();
          AppMethodBeat.o(31644);
          return false;
        }
      });
      break;
    }
  }

  public final void dEP()
  {
    AppMethodBeat.i(31655);
    ab.v("MicroMsg.ChattingUI.SearchComponent", "exit edit search mode");
    this.yRD = false;
    this.yRE = true;
    if (this.yRz != null)
      this.yRz.setVisibility(8);
    if (this.yRB != null)
      this.yRB.setVisibility(8);
    if (this.yRA != null)
      this.yRA.setVisibility(8);
    this.cgL.Or(0);
    this.cgL.aqX();
    AppMethodBeat.o(31655);
  }

  public final boolean dEQ()
  {
    return this.yRD;
  }

  public final u dER()
  {
    return this.yRC;
  }

  public final boolean dES()
  {
    return this.yRs;
  }

  public final boolean dET()
  {
    return this.yRr;
  }

  public final boolean dEU()
  {
    return this.yRu;
  }

  public final boolean dEV()
  {
    return this.yRv;
  }

  public final boolean dEW()
  {
    return this.yRy;
  }

  public final void dxB()
  {
    AppMethodBeat.i(31661);
    if (this.yRD)
    {
      dEP();
      ((com.tencent.mm.ui.chatting.c.b.i)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.i.class)).dDO();
    }
    AppMethodBeat.o(31661);
  }

  public final void dxx()
  {
    AppMethodBeat.i(31659);
    this.yRr = this.cgL.yTx.getBooleanExtra("search_chat_content", false).booleanValue();
    this.yRs = this.cgL.yTx.getBooleanExtra("show_search_chat_content_result", false).booleanValue();
    this.yRx = this.cgL.yTx.getStringArrayList("highlight_keyword_list");
    this.yRw = this.cgL.yTx.getLongExtra("msg_local_id", -1L);
    this.yRu = this.cgL.yTx.getBooleanExtra("from_global_search", false).booleanValue();
    this.yRv = this.cgL.yTx.getBooleanExtra("from_date_search", false).booleanValue();
    this.yRt = this.cgL.yTx.getBooleanExtra("img_gallery_enter_from_chatting_ui", false).booleanValue();
    AppMethodBeat.o(31659);
  }

  public final void dxy()
  {
    boolean bool1 = true;
    AppMethodBeat.i(31660);
    if ((this.yRw >= 0L) && (!this.yRG))
      al.n(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(31643);
          if (!ag.a(ag.this))
          {
            ag.b(ag.this);
            ag.c(ag.this);
            if (ag.this.cgL != null)
              ag.this.cgL.aWv();
            ab.i("MicroMsg.ChattingUI.SearchComponent", "dismiss fts highlight");
          }
          AppMethodBeat.o(31643);
        }
      }
      , 2000L);
    long l;
    com.tencent.mm.ui.chatting.c.b.h localh;
    if (this.yRr)
    {
      ab.i("MicroMsg.ChattingUI.SearchComponent", "[initSearchView]");
      com.tencent.mm.plugin.report.service.h.pYm.a(219L, 11L, 1L, true);
      i.a(this.cgL.yTx, 2131822384);
      this.yRq = this.cgL.findViewById(2131822385);
      this.yRB = this.cgL.findViewById(2131827269);
      this.cgL.getListView().setFocusable(false);
      this.cgL.getListView().setFocusableInTouchMode(false);
      this.yRB.setOnClickListener(new ag.3(this));
      if (this.yRz == null)
      {
        i.a(this.cgL.yTx, 2131822380);
        this.yRz = ((TextView)this.cgL.findViewById(2131822728));
      }
      if ((this.cgL.dFw()) || (((d)this.cgL.aF(d.class)).dDn()))
      {
        bool2 = true;
        this.yRC = new u(this.cgL.yTx.getContext(), new bi(), this.cgL.getTalkerUserName(), this.cgL.dFu(), bool2);
        this.yRC.yKp = new u.a()
        {
          public final void Oo(int paramAnonymousInt)
          {
            AppMethodBeat.i(31645);
            ag.this.OD(paramAnonymousInt);
            AppMethodBeat.o(31645);
          }
        };
        this.yRA = ((ListView)this.cgL.findViewById(2131827268));
        this.yRA.setAdapter(this.yRC);
        this.yRA.setOnItemClickListener(new ag.5(this));
        this.yRA.setOnTouchListener(new ag.6(this));
        this.elS = new o();
        this.elS.zHa = new ag.7(this);
        this.cgL.yTx.addSearchMenu(true, this.elS);
        this.elS.qQ(true);
      }
    }
    else if ((this.yRs) || (this.yRu) || (this.yRv))
    {
      l = this.cgL.yTx.getLongExtra("msg_local_id", -1L);
      localh = (com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class);
      if ((!this.yRu) || (this.yRv))
        break label470;
    }
    label470: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localh.a(l, bool2, d.a.yYw);
      AppMethodBeat.o(31660);
      return;
      bool2 = false;
      break;
    }
  }

  public final boolean ng(long paramLong)
  {
    AppMethodBeat.i(31653);
    boolean bool;
    if ((this.yRw == paramLong) && (this.yRu) && (this.yRx != null) && (this.yRx.size() > 0))
    {
      bool = true;
      AppMethodBeat.o(31653);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(31653);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(31657);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((((com.tencent.mm.ui.chatting.c.b.h)this.cgL.aF(com.tencent.mm.ui.chatting.c.b.h.class)).isInEditMode()) && (this.yRD))
      dEP();
    AppMethodBeat.o(31657);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.ag
 * JD-Core Version:    0.6.2
 */