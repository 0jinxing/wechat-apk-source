package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.p;
import com.tencent.mm.ai.w;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.i;
import com.tencent.mm.plugin.bizui.widget.StoryListView;
import com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView;
import com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e.1;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.bfc;
import com.tencent.mm.protocal.protobuf.bfd;
import com.tencent.mm.protocal.protobuf.bfe;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.ao;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@i
public class BizTimeLineUI extends MMActivity
  implements h
{
  private static long jOv = 0L;
  private static long jOw = 0L;
  private static long jOx = 0L;
  private static int jOy = 0;
  private static int jOz = 0;
  private boolean cAY;
  private int ctE;
  private int cvd;
  private int ehv;
  private TextView emptyTipTv;
  private View gwR;
  private long iQc;
  private View jNV;
  BizTimeLineHotView jNo;
  private boolean jNw;
  private f jNy;
  private long jOA;
  private long jOB;
  private boolean jOC;
  private r.c jOD;
  private long jOE;
  private final long jOF;
  private boolean jOG;
  private List<com.tencent.mm.storage.q> jOH;
  private boolean jOI;
  private com.tencent.mm.sdk.b.c jOJ;
  public StoryListView jOm;
  private View jOn;
  private ImageView jOo;
  LinearLayout jOp;
  private TextView jOq;
  private TextView jOr;
  private View jOs;
  private a jOt;
  private d jOu;
  private int joI;

  public BizTimeLineUI()
  {
    AppMethodBeat.i(14203);
    this.jOA = 0L;
    this.jOB = 0L;
    this.iQc = 0L;
    this.cvd = 1;
    this.jOC = false;
    this.jNw = false;
    this.cAY = false;
    this.jOD = new BizTimeLineUI.11(this);
    this.jOE = 0L;
    this.jOF = 100L;
    this.jOG = false;
    this.jOH = new LinkedList();
    this.jOI = false;
    this.joI = -1;
    this.jOJ = new BizTimeLineUI.9(this);
    AppMethodBeat.o(14203);
  }

  private View aWA()
  {
    AppMethodBeat.i(14211);
    this.gwR = getLayoutInflater().inflate(2130968861, null);
    this.jNo = ((BizTimeLineHotView)this.gwR.findViewById(2131821813));
    View localView = this.gwR;
    AppMethodBeat.o(14211);
    return localView;
  }

  private void aWD()
  {
    AppMethodBeat.i(14214);
    if ((this.jOt == null) || (this.cAY))
      AppMethodBeat.o(14214);
    while (true)
    {
      return;
      if (this.jOt.iKa.size() > 0)
      {
        long l = ((com.tencent.mm.storage.q)this.jOt.iKa.get(0)).field_orderFlag;
        int i = com.tencent.mm.aj.z.aeX().mG(l);
        ab.d("MicroMsg.BizTimeLineUI", "updateActionBarCustomView %d", new Object[] { Integer.valueOf(i) });
        if (i > 0)
        {
          MY(8);
          if (this.jOn.getVisibility() == 8)
            this.jOn.setVisibility(4);
          this.jOr.setText(getString(2131297679, new Object[] { Integer.valueOf(i) }));
          this.jOn.post(new BizTimeLineUI.7(this, l));
          AppMethodBeat.o(14214);
        }
      }
      else
      {
        AppMethodBeat.o(14214);
        continue;
        this.jOn.setVisibility(8);
        MY(0);
        AppMethodBeat.o(14214);
      }
    }
  }

  private static int aWF()
  {
    if (jOz > 0);
    for (int i = jOz - 1; ; i = 0)
      return i;
  }

  private void aWw()
  {
    AppMethodBeat.i(14205);
    this.jOp = ((LinearLayout)findViewById(2131821814));
    this.jOq = ((TextView)findViewById(2131821816));
    this.jOo = ((ImageView)findViewById(2131821815));
    aWx();
    this.jOp.setOnClickListener(new BizTimeLineUI.1(this));
    AppMethodBeat.o(14205);
  }

  private void aWy()
  {
    AppMethodBeat.i(14207);
    this.jOm = ((StoryListView)findViewById(2131821806));
    this.jOm.addFooterView(aWz());
    this.jOm.addHeaderView(aWA());
    int i = jOz;
    long l = System.currentTimeMillis();
    int j = com.tencent.mm.m.g.Nu().getInt("BizTimeLineStayTime", 180) * 1000;
    List localList;
    if ((jOv != 0L) && (jOw != 0L) && (l - jOv < j))
    {
      localList = com.tencent.mm.aj.z.aeX().mD(jOw);
      this.jNw = true;
    }
    while (true)
    {
      ab.i("MicroMsg.BizTimeLineUI", "initListView stayTime %d %d/%d  orderFlag %d, keep %b", new Object[] { Integer.valueOf(j), Long.valueOf(jOv), Long.valueOf(l), Long.valueOf(jOw), Boolean.valueOf(this.jNw) });
      this.jOt = new a(this, localList, this.jNw, this.jNy, this.jNo);
      this.jNy.jOd = aWF();
      aWw();
      this.jOm.setAdapter(this.jOt);
      this.jOm.setFooterDividersEnabled(false);
      this.jOm.setOnScrollListener(new BizTimeLineUI.13(this));
      this.jOm.setEmptyView(this.emptyTipTv);
      this.jOm.postDelayed(new BizTimeLineUI.14(this, i, localList), 100L);
      this.jOm.addOnLayoutChangeListener(new View.OnLayoutChangeListener()
      {
        public final void onLayoutChange(View paramAnonymousView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4, int paramAnonymousInt5, int paramAnonymousInt6, int paramAnonymousInt7, int paramAnonymousInt8)
        {
          AppMethodBeat.i(14199);
          BizTimeLineUI.c(BizTimeLineUI.this).dD(BizTimeLineUI.b(BizTimeLineUI.this).getFirstVisiblePosition(), BizTimeLineUI.b(BizTimeLineUI.this).getLastVisiblePosition());
          BizTimeLineUI.b(BizTimeLineUI.this).removeOnLayoutChangeListener(this);
          AppMethodBeat.o(14199);
        }
      });
      if (localList.size() < 10)
        aWB();
      com.tencent.mm.aj.z.aeY().a(this.jOD, Looper.getMainLooper());
      AppMethodBeat.o(14207);
      return;
      this.jNw = false;
      localList = com.tencent.mm.aj.z.aeX().drH();
      aX(localList);
    }
  }

  private View aWz()
  {
    AppMethodBeat.i(14210);
    this.jNV = getLayoutInflater().inflate(2130968860, null);
    View localView = this.jNV;
    AppMethodBeat.o(14210);
    return localView;
  }

  private void aX(List<com.tencent.mm.storage.q> paramList)
  {
    AppMethodBeat.i(14208);
    Looper.myQueue().addIdleHandler(new BizTimeLineUI.16(this, paramList));
    AppMethodBeat.o(14208);
  }

  private static void aY(List<com.tencent.mm.storage.q> paramList)
  {
    AppMethodBeat.i(14221);
    if (!bo.ek(paramList))
    {
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        ((com.tencent.mm.storage.q)localIterator.next()).field_isRead = 1;
      localLinkedList.addAll(paramList);
      com.tencent.mm.aj.z.aeX().eo(localLinkedList);
    }
    AppMethodBeat.o(14221);
  }

  private void c(com.tencent.mm.storage.q paramq)
  {
    AppMethodBeat.i(14209);
    this.jOm.postDelayed(new BizTimeLineUI.17(this, paramq), 50L);
    AppMethodBeat.o(14209);
  }

  private void dE(int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(14220);
    if ((paramInt1 == 0) && (!this.jNw) && (jOz != paramInt1))
      this.jNo.aWJ();
    if ((this.jNw) || (this.jOI) || ((jOz == paramInt1) && (this.joI == paramInt2)))
      AppMethodBeat.o(14220);
    while (true)
    {
      return;
      this.joI = paramInt2;
      if (paramInt1 > 0)
        paramInt1--;
      LinkedList localLinkedList;
      while (true)
      {
        if (paramInt2 > 0)
          i = paramInt2 - 1;
        localLinkedList = new LinkedList();
        while (paramInt1 <= i)
        {
          com.tencent.mm.storage.q localq = this.jOt.sg(paramInt1);
          if ((localq != null) && (localq.field_isRead != 1))
            localLinkedList.add(localq);
          paramInt1++;
        }
        paramInt1 = 0;
      }
      this.jOH.removeAll(localLinkedList);
      aY(this.jOH);
      this.jOH.clear();
      this.jOH.addAll(localLinkedList);
      AppMethodBeat.o(14220);
    }
  }

  public final void aWB()
  {
    AppMethodBeat.i(14212);
    if ((!isFinishing()) && (this.jNV != null))
    {
      ProgressBar localProgressBar = (ProgressBar)findViewById(2131821811);
      TextView localTextView = (TextView)findViewById(2131821812);
      localProgressBar.setVisibility(8);
      localTextView.setText(getString(2131297670));
    }
    AppMethodBeat.o(14212);
  }

  public final void aWC()
  {
    AppMethodBeat.i(14213);
    long l = System.currentTimeMillis() - this.jOE;
    if ((this.jOG) && (l < 200L))
    {
      ab.d("MicroMsg.BizTimeLineUI", "DoingUpdateView return");
      AppMethodBeat.o(14213);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.BizTimeLineUI", "try2UpdateActionBarCustomView isDoingUpdateView %s,interval %s", new Object[] { Boolean.valueOf(this.jOG), Long.valueOf(l) });
      this.jOG = true;
      if (l < 100L)
      {
        al.n(new BizTimeLineUI.6(this), 100L);
        AppMethodBeat.o(14213);
      }
      else
      {
        aWD();
        this.jOE = System.currentTimeMillis();
        this.jOG = false;
        AppMethodBeat.o(14213);
      }
    }
  }

  public final void aWE()
  {
    AppMethodBeat.i(14215);
    ab.d("MicroMsg.BizTimeLineUI", "hideActionBarCustomView");
    aWC();
    AppMethodBeat.o(14215);
  }

  public final void aWv()
  {
    AppMethodBeat.i(14216);
    if (this.jOt != null)
      this.jOt.notifyDataSetChanged();
    AppMethodBeat.o(14216);
  }

  public final void aWx()
  {
    AppMethodBeat.i(14206);
    if (isFinishing())
      AppMethodBeat.o(14206);
    while (true)
    {
      return;
      int i = com.tencent.mm.aj.z.aeY().baS();
      if (i > 0)
      {
        this.jOp.setVisibility(0);
        this.jOq.setText(getString(2131297673, new Object[] { Integer.valueOf(i) }));
        com.tencent.mm.storage.q localq = com.tencent.mm.aj.z.aeY().drQ();
        if (localq != null)
        {
          this.jOo.setVisibility(0);
          a.b.b(this.jOo, localq.field_talker);
          s.mM(localq.field_msgId);
        }
        while (true)
        {
          if ((this.jOt != null) && (this.jOt.getCount() == 0))
            this.jOt.notifyDataSetChanged();
          AppMethodBeat.o(14206);
          break;
          this.jOo.setVisibility(8);
        }
      }
      this.jOp.setVisibility(8);
      AppMethodBeat.o(14206);
    }
  }

  public final int getLayoutId()
  {
    return 2130968858;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(14204);
    super.onCreate(paramBundle);
    xE(-1052684);
    setTitleBarDoubleClickListener(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(14185);
        if ((BizTimeLineUI.this.uiu) || (BizTimeLineUI.this.isFinishing()))
          AppMethodBeat.o(14185);
        while (true)
        {
          return;
          BizTimeLineUI.m(BizTimeLineUI.this);
          AppMethodBeat.o(14185);
        }
      }
    });
    paramBundle = com.tencent.mm.model.c.c.abi().ll("100045");
    boolean bool;
    if ((paramBundle.isValid()) && ("1".equals(paramBundle.dru().get("isOpenSearch"))))
    {
      bool = true;
      ab.d("MicroMsg.BizTimeLineUI", "open search entrance:%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        addIconOptionMenu(0, 2131304082, 2131230741, new BizTimeLineUI.18(this));
      addIconOptionMenu(1, 2131297680, 2131230752, new BizTimeLineUI.2(this));
      setMMTitle(2131297684);
      ta(-16777216);
      setBackBtn(new BizTimeLineUI.4(this), 2131230737);
      this.jOn = getLayoutInflater().inflate(2130968857, null);
      this.jOr = ((TextView)this.jOn.findViewById(2131821805));
      this.jOr.setTextSize(1, 14.0F);
      this.jOs = this.jOn.findViewById(2131821804);
      ((LinearLayout)this.mController.mActionBar.getCustomView()).addView(this.jOn);
      paramBundle = (LinearLayout.LayoutParams)this.jOn.getLayoutParams();
      paramBundle.width = -1;
      paramBundle.weight = 1.0F;
      this.jOn.setLayoutParams(paramBundle);
      this.jOs.setOnClickListener(new BizTimeLineUI.5(this));
      this.jOn.setVisibility(8);
      this.emptyTipTv = ((TextView)findViewById(2131821807));
      this.emptyTipTv.setText(2131297658);
      this.jOu = new d(this);
      paramBundle = this.jOu;
      com.tencent.mm.sdk.b.a.xxA.c(paramBundle.hAA);
      this.ctE = ((int)(System.currentTimeMillis() / 1000L));
      this.cvd = getIntent().getIntExtra("biz_enter_source", 1);
      this.jNy = new f(this.ctE);
      s.Mj(this.ctE);
      paramBundle = new c();
      if (!c.aWu())
        break label556;
      aWy();
    }
    while (true)
    {
      ab.d("MicroMsg.BizTimeLineMigrateImp", "migrateOldList");
      int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVm, Integer.valueOf(0))).intValue();
      if ((i & 0x4) == 0)
      {
        ((j)com.tencent.mm.kernel.g.K(j.class)).XR().apc("officialaccounts");
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVm, Integer.valueOf(i | 0x4));
      }
      com.tencent.mm.pluginsdk.f.n(this);
      this.jOA = System.currentTimeMillis();
      com.tencent.mm.sdk.b.a.xxA.c(this.jOJ);
      if (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(1))
        ((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rX(90);
      AppMethodBeat.o(14204);
      return;
      bool = false;
      break;
      label556: getString(2131297061);
      com.tencent.mm.sdk.g.d.post(new c.1(paramBundle, new BizTimeLineUI.12(this, com.tencent.mm.ui.base.h.b(this, getString(2131297086), false, null))), "BizTimeLineMigrateThread");
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(14217);
    super.onDestroy();
    Object localObject1 = this.jOu;
    com.tencent.mm.sdk.b.a.xxA.d(((d)localObject1).hAA);
    jOv = System.currentTimeMillis();
    if ((this.jOt != null) && (this.jOm != null))
    {
      localObject1 = this.jOt.aWp();
      if (localObject1 != null)
        jOw = ((com.tencent.mm.storage.q)localObject1).field_orderFlag;
      localObject1 = this.jOt.sg(aWF());
      if (localObject1 == null)
        break label461;
      jOx = ((com.tencent.mm.storage.q)localObject1).field_orderFlag;
    }
    BizTimeLineHotView localBizTimeLineHotView;
    Object localObject2;
    bfc localbfc;
    LinkedList localLinkedList;
    while (true)
    {
      localObject1 = this.jOt;
      com.tencent.mm.aj.z.aeX().a(((a)localObject1).jKp);
      ((a)localObject1).jNp.jQR.clear();
      com.tencent.mm.aj.z.aeY().a(this.jOD);
      if (this.jOA != 0L)
      {
        long l = System.currentTimeMillis();
        this.iQc += l - this.jOB;
        com.tencent.mm.plugin.report.service.h.pYm.e(13932, new Object[] { Integer.valueOf((int)(l - this.jOA) / 1000), Integer.valueOf(1), Integer.valueOf(this.ctE), Integer.valueOf((int)(this.iQc / 1000L)), Integer.valueOf(this.cvd) });
      }
      com.tencent.mm.sdk.b.a.xxA.d(this.jOJ);
      this.jNy.jOe = aWF();
      com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new f.2(this.jNy), 0L);
      com.tencent.mm.plugin.brandservice.ui.b.b.clean();
      ao.clear();
      localBizTimeLineHotView = this.jNo;
      ((j)com.tencent.mm.kernel.g.K(j.class)).XR().b(localBizTimeLineHotView);
      com.tencent.mm.sdk.b.a.xxA.d(localBizTimeLineHotView.jQq);
      localObject1 = localBizTimeLineHotView.jQg;
      localObject2 = new b.a();
      localbfc = new bfc();
      ((b.a)localObject2).fsJ = localbfc;
      ((b.a)localObject2).fsK = new bfd();
      ((b.a)localObject2).uri = "/cgi-bin/micromsg-bin/often_read_bar_report";
      ((b.a)localObject2).fsI = 2550;
      localObject2 = ((b.a)localObject2).acD();
      localbfc.vZZ = s.getSessionId();
      localbfc.wIZ = ((com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e)localObject1).jQC;
      localLinkedList = new LinkedList();
      if (((com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e)localObject1).jQB.size() <= 0)
        break;
      Iterator localIterator = ((com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e)localObject1).jQB.entrySet().iterator();
      while (localIterator.hasNext())
        localLinkedList.add((bfe)((Map.Entry)localIterator.next()).getValue());
      label461: ab.w("MicroMsg.BizTimeLineUI", "FirstVisibleItem is null %d", new Object[] { Integer.valueOf(aWF()) });
    }
    localbfc.wIY = localLinkedList;
    w.a((com.tencent.mm.ai.b)localObject2, new e.1((com.tencent.mm.plugin.brandservice.ui.timeline.offenread.e)localObject1));
    com.tencent.mm.kernel.g.Rg().b(2768, localBizTimeLineHotView);
    s.Mj(0);
    AppMethodBeat.o(14217);
  }

  public void onPause()
  {
    AppMethodBeat.i(14219);
    super.onPause();
    Object localObject = null;
    if (this.jOt != null)
    {
      localObject = this.jOt;
      ((a)localObject).jNv.stopPlay();
      ((a)localObject).cAY = true;
      ((a)localObject).jNp.jQU = true;
      localObject = this.jOt.aWq();
    }
    aY(this.jOH);
    int i;
    if (localObject != null)
    {
      com.tencent.mm.aj.z.aeX().mH(((com.tencent.mm.storage.q)localObject).field_orderFlag);
      if (this.jOm == null)
        break label168;
      localObject = this.jOm.getChildAt(0);
      if (localObject == null)
        break label163;
      i = ((View)localObject).getTop();
    }
    label98: for (jOy = i; ; jOy = 0)
    {
      this.cAY = true;
      long l = System.currentTimeMillis();
      this.iQc += l - this.jOB;
      this.jOB = l;
      WXHardCoderJNI.stopPerformance(WXHardCoderJNI.hcBizEnable, this.ehv);
      this.ehv = 0;
      AppMethodBeat.o(14219);
      return;
      com.tencent.mm.aj.z.aeX().drK();
      break;
      i = 0;
      break label98;
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(14218);
    super.onResume();
    if (this.jOC)
    {
      this.jOC = false;
      this.jNy.si(8);
    }
    if (this.jOt != null)
    {
      Object localObject = this.jOt;
      ((a)localObject).cAY = false;
      localObject = ((a)localObject).jNp;
      if (((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject).jQU)
      {
        ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject).jQU = false;
        if (((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject).jQO <= 0)
          ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject).aWR();
      }
    }
    if (this.cAY)
    {
      this.cAY = false;
      aWC();
    }
    this.jOB = System.currentTimeMillis();
    com.tencent.mm.plugin.brandservice.b.a("BrandServiceWorkerThread", new BizTimeLineUI.10(this), 500L);
    AppMethodBeat.o(14218);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI
 * JD-Core Version:    0.6.2
 */