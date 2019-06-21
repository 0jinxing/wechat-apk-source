package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.s;
import com.tencent.mm.modelsimple.y;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.d.1;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.d.2;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.d.3;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.f.2;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.h.1;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.h.2;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.i.1;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.j.1;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.k;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.k.1;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.m;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.m.1;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.p.1;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.p.2;
import com.tencent.mm.plugin.brandservice.ui.timeline.a.p.3;
import com.tencent.mm.plugin.brandservice.ui.timeline.offenread.BizTimeLineHotView;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.protocal.protobuf.chc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.chatting.ao;
import com.tencent.mm.ui.widget.MMNeat7extView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class a extends BaseAdapter
  implements View.OnCreateContextMenuListener
{
  public static int jNe = 0;
  public static int jNf;
  public static int jNg = 0;
  public static int jNh = 0;
  public static int jNi = 0;
  public static int jNj;
  public static int jNk;
  private static Long jNr = null;
  private static Long jNs = null;
  private static Long jNt = null;
  boolean cAY;
  List<q> iKa;
  r.c jKp;
  private int jLX;
  private int jLY;
  private com.tencent.mm.ui.widget.b.a jMO;
  public View.OnTouchListener jNA;
  private View.OnLongClickListener jNB;
  private View.OnClickListener jNC;
  private i jND;
  boolean jNE;
  private HashSet jNF;
  private BizTimeLineUI jNd;
  public q jNl;
  public int jNm;
  public int jNn;
  public BizTimeLineHotView jNo;
  public com.tencent.mm.plugin.brandservice.ui.timeline.preload.c jNp;
  private com.tencent.mm.plugin.brandservice.ui.timeline.a.g jNq;
  private long jNu;
  public g jNv;
  boolean jNw;
  private b jNx;
  public f jNy;
  private Set<String> jNz;

  public a(BizTimeLineUI paramBizTimeLineUI, List<q> paramList, boolean paramBoolean, f paramf, BizTimeLineHotView paramBizTimeLineHotView)
  {
    AppMethodBeat.i(14108);
    this.iKa = new LinkedList();
    this.jNn = 0;
    this.jLX = 0;
    this.jLY = 0;
    this.cAY = false;
    this.jNu = -1L;
    this.jNw = false;
    this.jNz = new HashSet();
    this.jKp = new a.1(this);
    this.jNA = new a.7(this);
    this.jNB = new a.8(this);
    this.jNC = new a.9(this);
    this.jND = new a.10(this);
    this.jNE = false;
    this.jNF = new HashSet();
    this.jNd = paramBizTimeLineUI;
    this.jNo = paramBizTimeLineHotView;
    this.jMO = new com.tencent.mm.ui.widget.b.a(this.jNd);
    this.jNy = paramf;
    int j;
    if (jNe == 0)
    {
      jNf = paramBizTimeLineUI.getResources().getDimensionPixelSize(2131428123);
      jNg = paramBizTimeLineUI.getResources().getDimensionPixelSize(2131428122);
      jNh = paramBizTimeLineUI.getResources().getDimensionPixelSize(2131427776);
      jNi = paramBizTimeLineUI.getResources().getDimensionPixelSize(2131427796);
      jNj = paramBizTimeLineUI.getResources().getDimensionPixelSize(2131428127);
      jNk = com.tencent.mm.bz.a.fromDPToPix(this.jNd, 2);
      int i = com.tencent.mm.bz.a.gd(paramBizTimeLineUI);
      j = com.tencent.mm.bz.a.ge(paramBizTimeLineUI);
      if (i >= j)
        break label372;
      j = i;
    }
    label372: 
    while (true)
    {
      jNe = (int)((j - (int)(com.tencent.mm.bz.a.getDensity(paramBizTimeLineUI) * 16.0F)) / 2.35F);
      z.aeX().a(this.jKp, Looper.getMainLooper());
      this.iKa = paramList;
      this.jNv = new g(this);
      this.jNw = paramBoolean;
      aWo();
      this.jNp = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.c(paramBizTimeLineUI, jNe, jNf, this.iKa);
      this.jNq = new com.tencent.mm.plugin.brandservice.ui.timeline.a.g(this, paramBizTimeLineUI);
      AppMethodBeat.o(14108);
      return;
    }
  }

  private void a(int paramInt, q paramq, View paramView1, View paramView2)
  {
    AppMethodBeat.i(14118);
    if (paramInt > 0)
    {
      paramView1.setVisibility(0);
      if (a(paramq, paramInt))
      {
        paramView2.setVisibility(0);
        ((TextView)paramView2.findViewById(2131821846)).setText(this.jNd.getString(2131297664));
      }
    }
    while (true)
    {
      a(paramq);
      AppMethodBeat.o(14118);
      return;
      if (b(paramq, paramInt))
      {
        paramView2.setVisibility(0);
        ((TextView)paramView2.findViewById(2131821846)).setText(this.jNd.getString(2131297665));
      }
      else
      {
        paramView2.setVisibility(8);
        continue;
        paramView1.setVisibility(0);
        paramView2.setVisibility(8);
      }
    }
  }

  private void a(com.tencent.mm.af.p paramp, final q paramq, int paramInt1, com.tencent.mm.af.o paramo, View paramView, boolean paramBoolean, final int paramInt2)
  {
    AppMethodBeat.i(14119);
    ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.a.class)).a(paramp, paramq, paramInt1, paramo, paramView, paramBoolean, paramInt2, this.jND);
    paramView.setOnTouchListener(this.jNA);
    paramView.setOnLongClickListener(new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        AppMethodBeat.i(14102);
        a.this.jNl = paramq;
        a.this.jNm = paramInt2;
        a.this.jNn = 1;
        a.e(a.this).a(paramAnonymousView, a.this, a.b(a.this), a.c(a.this), a.d(a.this));
        AppMethodBeat.o(14102);
        return true;
      }
    });
    if ((paramp.type == 5) && (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()))
      paramView.setOnClickListener(new a.6(this, paramInt2, paramq));
    AppMethodBeat.o(14119);
  }

  private void a(com.tencent.mm.plugin.brandservice.ui.timeline.a.e parame, q paramq)
  {
    AppMethodBeat.i(14120);
    a.b.r(parame.ejo, paramq.field_talker);
    String str = s.mJ(paramq.field_talker);
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramq.field_talker);
    if ((localObject != null) && (((ad)localObject).Oe()))
    {
      localObject = this.jNd.getResources().getDrawable(2130837943);
      int i = (int)parame.jPp.getTextSize();
      ((Drawable)localObject).setBounds(0, 0, i, i);
      com.tencent.mm.ui.widget.a locala = new com.tencent.mm.ui.widget.a((Drawable)localObject);
      localObject = new SpannableString("@");
      ((SpannableString)localObject).setSpan(locala, 0, 1, 33);
      parame.jPp.setText(TextUtils.concat(new CharSequence[] { com.tencent.mm.pluginsdk.ui.e.j.b(this.jNd, str, parame.jPp.getTextSize()) + "  ", localObject }));
      if (paramq.field_isRead != 1)
        break label319;
      parame.jPp.getPaint().setFakeBoldText(false);
      parame.jPp.setTextColor(this.jNd.getResources().getColor(2131690155));
    }
    while (true)
    {
      parame.enf.setText(com.tencent.mm.plugin.brandservice.ui.b.b.e(this.jNd, paramq.field_createTime));
      parame.jPo.setOnTouchListener(this.jNA);
      parame.jPo.setTag(paramq);
      parame.jPo.setOnLongClickListener(this.jNB);
      parame.jPo.setOnClickListener(this.jNC);
      AppMethodBeat.o(14120);
      return;
      parame.jPp.setText(com.tencent.mm.pluginsdk.ui.e.j.b(this.jNd, str, parame.jPp.getTextSize()));
      break;
      label319: parame.jPp.getPaint().setFakeBoldText(true);
      parame.jPp.setTextColor(this.jNd.getResources().getColor(2131689761));
    }
  }

  private boolean a(q paramq, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(14116);
    if (jNr != null)
      if (jNr.longValue() == paramq.field_orderFlag)
        AppMethodBeat.o(14116);
    while (true)
    {
      return bool;
      AppMethodBeat.o(14116);
      bool = false;
      continue;
      long l1 = paramq.drB();
      long l2 = 0L;
      q localq = sg(paramInt - 1);
      if (localq != null)
        l2 = localq.drB();
      if ((l1 != l2) && (jNt != null) && (l2 == jNt.longValue()))
      {
        jNr = Long.valueOf(paramq.field_orderFlag);
        AppMethodBeat.o(14116);
      }
      else
      {
        AppMethodBeat.o(14116);
        bool = false;
      }
    }
  }

  private void aWo()
  {
    AppMethodBeat.i(14109);
    aWr();
    q localq;
    long l;
    if (this.jNw)
    {
      localq = aWq();
      if ((localq != null) && (!localq.drF()))
      {
        Iterator localIterator = this.iKa.iterator();
        l = -1L;
        if (localIterator.hasNext())
        {
          localq = (q)localIterator.next();
          if ((l != -1L) && (l != localq.drB()))
          {
            jNr = Long.valueOf(localq.field_orderFlag);
            AppMethodBeat.o(14109);
          }
        }
      }
    }
    while (true)
    {
      return;
      l = localq.drB();
      break;
      AppMethodBeat.o(14109);
    }
  }

  private boolean aWs()
  {
    boolean bool = true;
    AppMethodBeat.i(14126);
    q localq = aWq();
    if (localq != null)
      if (localq.drF())
        AppMethodBeat.o(14126);
    while (true)
    {
      return bool;
      if (this.jNu < 0L)
        aWt();
      if (localq.drB() == this.jNu)
      {
        AppMethodBeat.o(14126);
      }
      else
      {
        AppMethodBeat.o(14126);
        bool = false;
        continue;
        AppMethodBeat.o(14126);
        bool = false;
      }
    }
  }

  private void aWt()
  {
    AppMethodBeat.i(14128);
    q localq = z.aeX().drJ();
    if (localq != null)
      this.jNu = localq.drB();
    AppMethodBeat.o(14128);
  }

  private boolean b(q paramq, int paramInt)
  {
    AppMethodBeat.i(14117);
    boolean bool;
    if (jNs != null)
      if ((jNr != null) && (jNr.longValue() <= jNs.longValue()))
      {
        jNs = Long.valueOf(-1L);
        bool = false;
        AppMethodBeat.o(14117);
      }
    while (true)
    {
      return bool;
      if (jNs.longValue() == paramq.field_orderFlag)
      {
        bool = true;
        AppMethodBeat.o(14117);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(14117);
        continue;
        q localq = sg(paramInt - 1);
        if (localq == null)
        {
          bool = false;
          AppMethodBeat.o(14117);
        }
        else
        {
          long l = System.currentTimeMillis();
          if ((l - paramq.field_createTime > 86400000L) && (l - localq.field_createTime <= 86400000L))
          {
            if ((!aWs()) && ((jNr == null) || (jNr.longValue() <= paramq.field_orderFlag)))
            {
              jNs = Long.valueOf(-1L);
              bool = false;
              AppMethodBeat.o(14117);
            }
            else
            {
              jNs = Long.valueOf(paramq.field_orderFlag);
              bool = true;
              AppMethodBeat.o(14117);
            }
          }
          else
          {
            bool = false;
            AppMethodBeat.o(14117);
          }
        }
      }
    }
  }

  public final void FE(String paramString)
  {
    AppMethodBeat.i(14114);
    com.tencent.mm.kernel.g.RQ();
    if ((com.tencent.mm.kernel.a.jP(com.tencent.mm.kernel.g.RN().eIV)) && (!this.jNz.contains(paramString)))
    {
      y.ab(paramString, 2);
      this.jNz.add(paramString);
    }
    AppMethodBeat.o(14114);
  }

  public final void a(q paramq)
  {
    AppMethodBeat.i(14115);
    if (paramq == null)
    {
      ab.w("MicroMsg.BizTimeLineAdapter", "updateGroupId info is null");
      AppMethodBeat.o(14115);
    }
    while (true)
    {
      return;
      long l1 = paramq.drB();
      long l2 = z.aeX().drL();
      ab.d("MicroMsg.BizTimeLineAdapter", "updateGroupId keep %b, groupId %d, maxGroupId %d", new Object[] { Boolean.valueOf(this.jNw), Long.valueOf(l1), Long.valueOf(l2) });
      if ((!this.jNw) && (l1 == l2))
      {
        l2 = paramq.field_orderFlag;
        com.tencent.mm.ci.g.da(Long.valueOf(l2)).h(new a.4(this, l2)).b(new a.3(this));
      }
      AppMethodBeat.o(14115);
    }
  }

  public final q aWp()
  {
    AppMethodBeat.i(14123);
    q localq;
    if (this.iKa.size() > 0)
    {
      localq = (q)this.iKa.get(this.iKa.size() - 1);
      AppMethodBeat.o(14123);
    }
    while (true)
    {
      return localq;
      localq = null;
      AppMethodBeat.o(14123);
    }
  }

  public final q aWq()
  {
    AppMethodBeat.i(14124);
    q localq;
    if (this.iKa.size() > 0)
    {
      localq = (q)this.iKa.get(0);
      AppMethodBeat.o(14124);
    }
    while (true)
    {
      return localq;
      localq = null;
      AppMethodBeat.o(14124);
    }
  }

  public final void aWr()
  {
    AppMethodBeat.i(14125);
    q localq = aWq();
    if (localq != null)
      jNt = Long.valueOf(localq.drB());
    jNr = null;
    jNs = null;
    AppMethodBeat.o(14125);
  }

  public final void dD(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(14129);
    ArrayList localArrayList = new ArrayList();
    if (paramInt1 <= paramInt2)
    {
      Object localObject = sg(paramInt1);
      long l;
      String str;
      if ((localObject != null) && (((q)localObject).field_type == 285212721) && (!this.jNF.contains(Long.valueOf(((q)localObject).field_msgId))))
      {
        ab.v("MicroMsg.BizTimeLineAdapter", "terry checkpreload:" + ((q)localObject).field_msgId);
        this.jNF.add(Long.valueOf(((q)localObject).field_msgId));
        l = ((q)localObject).field_msgId;
        str = ((q)localObject).field_content;
        if (!((q)localObject).field_isExpand)
          break label165;
      }
      label165: for (localObject = "-1"; ; localObject = "2")
      {
        localArrayList.add(new String[] { String.valueOf(l), str, localObject });
        paramInt1++;
        break;
      }
    }
    if (localArrayList.size() > 0)
      PreloadLogic.j(localArrayList, 90);
    AppMethodBeat.o(14129);
  }

  public final int getCount()
  {
    AppMethodBeat.i(14110);
    int i = this.iKa.size();
    AppMethodBeat.o(14110);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(14112);
    q localq = sg(paramInt);
    if (localq == null)
    {
      ab.e("MicroMsg.BizTimeLineAdapter", "getItemViewType info is null");
      AppMethodBeat.o(14112);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      switch (localq.field_type)
      {
      default:
        AppMethodBeat.o(14112);
        paramInt = i;
        break;
      case 285212721:
        paramInt = 1;
        AppMethodBeat.o(14112);
        break;
      case 1:
        paramInt = 2;
        AppMethodBeat.o(14112);
        break;
      case 34:
        paramInt = 3;
        AppMethodBeat.o(14112);
        break;
      case 3:
        paramInt = 4;
        AppMethodBeat.o(14112);
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(14113);
    q localq = sg(paramInt);
    if (localq == null)
    {
      ab.e("MicroMsg.BizTimeLineAdapter", "getView info is null");
      AppMethodBeat.o(14113);
      return paramView;
    }
    if ((paramInt == getCount() - 1) && (!this.jNE))
      al.n(new a.2(this, paramInt), 300L);
    label150: label172: Object localObject1;
    Object localObject2;
    com.tencent.mm.af.o localo;
    LinkedList localLinkedList;
    int i;
    label486: com.tencent.mm.af.p localp;
    boolean bool1;
    switch (localq.field_type)
    {
    default:
      if (paramView == null)
      {
        paramViewGroup = new com.tencent.mm.plugin.brandservice.ui.timeline.a.o();
        paramView = this.jNd;
        if (paramViewGroup.jOR != null)
        {
          paramView = paramViewGroup.jOR;
          paramView.setTag(paramViewGroup);
          a(paramViewGroup, localq);
          a(paramInt, localq, paramViewGroup.jOQ, paramViewGroup.jOP);
        }
      }
      break;
    case 285212721:
      while (true)
      {
        if ((!this.jNw) && (!this.cAY))
        {
          this.jNy.c(localq, paramInt);
          FE(localq.field_talker);
        }
        AppMethodBeat.o(14113);
        break;
        if (!this.jNw)
          com.tencent.mm.plugin.brandservice.ui.b.c.f(localq);
        if (paramView == null)
        {
          paramViewGroup = new com.tencent.mm.plugin.brandservice.ui.timeline.a.f();
          paramView = View.inflate(this.jNd, 2130968865, null);
          paramViewGroup.jPr = ((LinearLayout)paramView.findViewById(2131821829));
          paramViewGroup.jPs = ((LinearLayout)paramView.findViewById(2131821836));
          paramViewGroup.jPt = ((TextView)paramView.findViewById(2131821837));
          paramViewGroup.jOP = ((LinearLayout)paramView.findViewById(2131821845));
          paramViewGroup.jOQ = ((LinearLayout)paramView.findViewById(2131821844));
          paramViewGroup.jOR = paramView;
          paramViewGroup.aWH();
          paramView.setTag(paramViewGroup);
        }
        while (true)
        {
          paramViewGroup.b(this.jNd, this);
          localObject1 = paramViewGroup.jPu.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (com.tencent.mm.plugin.brandservice.ui.timeline.a.b)((Iterator)localObject1).next();
            ao.aj(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject2).jOR, 3);
            paramViewGroup.jPr.removeView(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject2).jOR);
          }
          paramViewGroup = (com.tencent.mm.plugin.brandservice.ui.timeline.a.f)paramView.getTag();
        }
        paramViewGroup.jPu.clear();
        localo = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.biz.a.a.class)).b(localq.field_msgId, localq.field_content);
        localLinkedList = localo.fjr;
        i = localLinkedList.size();
        if (i != 0)
          break label486;
        paramViewGroup.jPr.setVisibility(8);
        paramViewGroup.a(paramViewGroup, -1, 0);
      }
      paramViewGroup.jPr.setVisibility(0);
      localp = (com.tencent.mm.af.p)localLinkedList.get(0);
      bool1 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.c.a(localq, localp);
      if (bool1)
        if ((bo.isNullOrNil(localp.fjx)) && ((localp.type == 5) || (localp.type == 0)))
          bool1 = false;
      break;
    case 1:
    case 34:
    case 3:
    }
    label560: label590: label1620: label2388: label2518: 
    while (true)
    {
      paramViewGroup.a(paramViewGroup, -1, i);
      localq.xHT = bool1;
      localObject2 = ((Activity)paramViewGroup.mContext).getLayoutInflater();
      int j = paramViewGroup.jPu.size();
      if (j < i)
      {
        localObject1 = ao.Ot(3);
        if (localObject1 != null)
          break label5470;
        localObject1 = ((LayoutInflater)localObject2).inflate(2130968866, null);
      }
      label1755: label2652: label5470: 
      while (true)
      {
        Object localObject3 = paramViewGroup.jPm;
        Object localObject4 = paramViewGroup.mContext;
        Object localObject5 = paramViewGroup.jPr;
        localObject4 = new com.tencent.mm.plugin.brandservice.ui.timeline.a.b((a)localObject3, (Context)localObject4);
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOR = ((View)localObject1);
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOS = ((View)localObject1).findViewById(2131821838);
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOT = ((View)localObject1).findViewById(2131821839);
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOU = ((MMNeat7extView)((View)localObject1).findViewById(2131821840));
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOV = ((TextView)((View)localObject1).findViewById(2131821841));
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOW = ((View)localObject1).findViewById(2131821403);
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOX = ((ImageView)((View)localObject1).findViewById(2131821842));
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOY = ((ImageView)((View)localObject1).findViewById(2131821843));
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jOZ = ((View)localObject1).findViewById(2131821848);
        ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject4).jPa = ((TextView)((View)localObject1).findViewById(2131821849));
        ((ViewGroup)localObject5).addView((View)localObject1, ((ViewGroup)localObject5).getChildCount());
        paramViewGroup.jPu.add(localObject4);
        j++;
        break label590;
        paramViewGroup.a(paramViewGroup, ((com.tencent.mm.af.p)localLinkedList.get(0)).type, i);
        break label560;
        for (j = 0; j < paramViewGroup.jPu.size(); j++)
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)paramViewGroup.jPu.get(j)).jOR.setVisibility(8);
        label1012: boolean bool2;
        int k;
        if (bool1)
        {
          if (localp.type != 5)
            break label1804;
          localObject1 = paramViewGroup.jPw;
          localq.xHU = com.tencent.mm.plugin.brandservice.ui.timeline.offenread.d.FG(localq.field_talker);
          com.tencent.mm.plugin.brandservice.ui.timeline.a.e.N(((m)localObject1).jPn, jNe);
          if (bo.isNullOrNil(localp.title))
          {
            ((m)localObject1).jPi.setVisibility(8);
            localObject2 = com.tencent.mm.af.l.kr(localp.fjB);
            if (TextUtils.isEmpty((CharSequence)localObject2))
              break label1742;
            ((m)localObject1).jPV.setVisibility(0);
            ((m)localObject1).jPV.setText((CharSequence)localObject2);
            ((m)localObject1).jPV.setTextColor(((m)localObject1).mContext.getResources().getColor(2131690202));
            ((m)localObject1).a((com.tencent.mm.plugin.brandservice.ui.timeline.a.c)localObject1, localq, localp);
            localObject2 = ((m)localObject1).jPm;
            localObject5 = ((m)localObject1).jPn;
            if (i <= 1)
              break label1755;
            bool2 = true;
            ((a)localObject2).a(localp, localq, paramInt, localo, (View)localObject5, bool2, 0);
            ((m)localObject1).jPd.setVisibility(8);
            ((m)localObject1).jPi.setTextColor(((m)localObject1).mContext.getResources().getColor(2131690202));
            ((m)localObject1).jPa.setTextColor(((m)localObject1).mContext.getResources().getColor(2131690202));
            localObject5 = ((m)localObject1).jPm.jNp;
            localObject4 = localp.fjx;
            localObject3 = ((m)localObject1).jOX;
            j = localq.field_type;
            k = jNe;
            localObject2 = new m.1((m)localObject1, localq, paramInt);
            if (i != 1)
              break label1761;
            bool2 = true;
            ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject5).a((String)localObject4, (ImageView)localObject3, j, k, (e.a)localObject2, bool2);
            if (i != 1)
              break label1767;
            ((m)localObject1).jPe.setBackgroundResource(2130837931);
            ((m)localObject1).jPd.setBackgroundResource(2130837957);
            if (com.tencent.mm.bz.a.dm(((m)localObject1).mContext) < 1.375F)
              break label1792;
            ((m)localObject1).jPi.setMaxLines(1);
          }
        }
        else
        {
          label1246: if ((i <= 2) || (localq.field_isExpand))
            break label3487;
          paramViewGroup.jPs.setVisibility(0);
          paramViewGroup.jPt.setText(paramViewGroup.mContext.getString(2131297683, new Object[] { Integer.valueOf(i - 2) }));
          paramViewGroup.jPs.setTag(localq);
          paramViewGroup.jPs.setOnClickListener(paramViewGroup.jPB);
          if (!bool1)
            break label3499;
          j = 1;
          if ((j >= i) || ((!localq.field_isExpand) && (j > 1)))
            break label4301;
          localObject4 = (com.tencent.mm.af.p)localLinkedList.get(j);
          localObject1 = paramViewGroup.jPu;
          if (!bool1)
            break label3505;
          k = j - 1;
          label1379: localObject3 = (com.tencent.mm.plugin.brandservice.ui.timeline.a.b)((List)localObject1).get(k);
          k = localp.type;
          if (j != 0)
            break label3512;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOS.setVisibility(8);
          if (bool1)
            break label3846;
          if (j != 0)
            break label3743;
          if (i != 1)
            break label3726;
          com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT, jNh, jNg);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).a((com.tencent.mm.af.p)localObject4, localq, j, false);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).a(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOZ, ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jPa, localq, (com.tencent.mm.af.p)localObject4);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOU.ah(((com.tencent.mm.af.p)localObject4).title);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOU.setTextColor(paramViewGroup.mContext.getResources().getColor(2131689761));
          if ((((com.tencent.mm.af.p)localObject4).fjA != 0) && (((com.tencent.mm.af.p)localObject4).fjA != 1))
            break label4234;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOW.setVisibility(0);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOU.setTextColor(paramViewGroup.mContext.getResources().getColor(2131689761));
          if (((com.tencent.mm.af.p)localObject4).type != 7)
            break label3945;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOX.setVisibility(8);
          if ((bo.isNullOrNil(((com.tencent.mm.af.p)localObject4).fjz)) || (((com.tencent.mm.af.p)localObject4).type != 3))
            break label4268;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOV.setText(((com.tencent.mm.af.p)localObject4).fjz);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOV.setVisibility(0);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOR.setVisibility(0);
          localObject2 = paramViewGroup.jPm;
          localObject1 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOR;
          if (i <= 1)
            break label4281;
          bool2 = true;
          label1651: ((a)localObject2).a((com.tencent.mm.af.p)localObject4, localq, paramInt, localo, (View)localObject1, bool2, j);
          if ((j != i - 1) || (paramViewGroup.jPs.getVisibility() == 0))
            break label4287;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOR.setBackgroundResource(2130838288);
        }
        while (true)
        {
          j++;
          break label1327;
          ((m)localObject1).jPi.ah(localp.title);
          ((m)localObject1).jPi.getPaint().setFakeBoldText(true);
          ((m)localObject1).jPi.setVisibility(0);
          break;
          ((m)localObject1).jPV.setVisibility(8);
          break label1012;
          bool2 = false;
          break label1047;
          label1761: bool2 = false;
          break label1177;
          label1767: ((m)localObject1).jPe.setBackgroundResource(2130837933);
          ((m)localObject1).jPd.setBackgroundResource(2130837958);
          break label1222;
          ((m)localObject1).jPi.setMaxLines(2);
          break label1246;
          if (localp.type == 8)
          {
            localObject1 = paramViewGroup.jPx;
            com.tencent.mm.plugin.brandservice.ui.timeline.a.e.N(((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPQ, jNe);
            ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPd.setVisibility(8);
            ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPa.setTextColor(((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).mContext.getResources().getColor(2131690202));
            ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).iNr.setBackgroundResource(2131231097);
            localObject4 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPm.jNp;
            localObject3 = localp.fjx;
            localObject5 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jOX;
            j = localq.field_type;
            k = jNe;
            localObject2 = new j.1((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1, localq, paramInt);
            if (i == 1)
            {
              bool2 = true;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject4).a((String)localObject3, (ImageView)localObject5, j, k, (e.a)localObject2, bool2);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).a((com.tencent.mm.plugin.brandservice.ui.timeline.a.c)localObject1, localq, localp);
              localObject5 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPm;
              localObject2 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPn;
              if (i <= 1)
                break label2039;
            }
            label2039: for (bool2 = true; ; bool2 = false)
            {
              ((a)localObject5).a(localp, localq, paramInt, localo, (View)localObject2, bool2, 0);
              if (i != 1)
                break label2045;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPe.setBackgroundResource(2130837931);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPd.setBackgroundResource(2130837940);
              break;
              bool2 = false;
              break label1933;
            }
            label2045: ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPe.setBackgroundResource(2130837933);
            ((com.tencent.mm.plugin.brandservice.ui.timeline.a.j)localObject1).jPd.setBackgroundResource(2130837941);
            break label1246;
          }
          if (localp.type == 7)
          {
            localObject1 = paramViewGroup.jPy;
            if (bo.isNullOrNil(localp.title))
            {
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPi.setVisibility(8);
              localObject2 = com.tencent.mm.af.l.kr(localp.fjB);
              if (TextUtils.isEmpty((CharSequence)localObject2))
                break label2388;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPY.setVisibility(0);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPY.setText((CharSequence)localObject2);
              label2144: localObject2 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jOY.getDrawable();
              if (((localObject2 instanceof AnimationDrawable)) && (((AnimationDrawable)localObject2).isRunning()))
                ((AnimationDrawable)localObject2).stop();
              if (!(localq.field_msgId + "_0").equals(com.tencent.mm.plugin.brandservice.ui.b.c.aYR()))
                break label2401;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jOY.setImageResource(2130838272);
              if ((((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jOY.getDrawable() instanceof AnimationDrawable))
                ((AnimationDrawable)((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jOY.getDrawable()).start();
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).a(((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jOY, localq, 0, localp.fjx);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).a((com.tencent.mm.plugin.brandservice.ui.timeline.a.c)localObject1, localq, localp);
              localObject5 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPm;
              localObject2 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPn;
              if (i <= 1)
                break label2415;
              bool2 = true;
              ((a)localObject5).a(localp, localq, paramInt, localo, (View)localObject2, bool2, 0);
              if (i != 1)
                break label2421;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPn.setBackgroundResource(2130838288);
            }
            while (true)
            {
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPn.setPadding(jNh, jNg, jNh, jNg);
              break;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPi.setVisibility(0);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPi.ah(localp.title);
              break label2107;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPY.setVisibility(8);
              break label2144;
              label2401: ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jOY.setImageResource(2130838271);
              break label2253;
              label2415: bool2 = false;
              break label2306;
              label2421: ((com.tencent.mm.plugin.brandservice.ui.timeline.a.n)localObject1).jPn.setBackgroundResource(2130838289);
            }
          }
          if (localp.type == 6)
          {
            localObject1 = paramViewGroup.jPz;
            localObject5 = (com.tencent.mm.af.p)localLinkedList.get(0);
            if (bo.isNullOrNil(((com.tencent.mm.af.p)localObject5).title))
            {
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPi.setVisibility(8);
              if (TextUtils.isEmpty(((com.tencent.mm.af.p)localObject5).fjL))
                break label2809;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPN.setVisibility(0);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPN.setText(((com.tencent.mm.af.p)localObject5).fjL);
              if (((com.tencent.mm.af.p)localObject5).fjM != 2)
                break label2822;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPO.setImageResource(2131231089);
              label2538: ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).a(((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jOY, localq, 0, ((com.tencent.mm.af.p)localObject5).fjx);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).a((com.tencent.mm.plugin.brandservice.ui.timeline.a.c)localObject1, localq, (com.tencent.mm.af.p)localObject5);
              localObject4 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPm;
              localObject2 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPn;
              if (i <= 1)
                break label2836;
              bool2 = true;
              ((a)localObject4).a((com.tencent.mm.af.p)localObject5, localq, paramInt, localo, (View)localObject2, bool2, 0);
              if (!(localq.field_msgId + "_0").equals(com.tencent.mm.plugin.brandservice.ui.b.c.aYR()))
                break label2842;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jOY.setImageResource(2131231092);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPd.setVisibility(8);
              localObject2 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPm.jNp;
              localObject5 = ((com.tencent.mm.af.p)localObject5).fjx;
              localObject4 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jOX;
              k = localq.field_type;
              j = jNf;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject2).a((String)localObject5, (ImageView)localObject4, k, j, j, "@S", new i.1((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1, localq, paramInt));
              if (i != 1)
                break label2856;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPn.setBackgroundResource(2130838288);
            }
            while (true)
            {
              localObject1 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPn;
              if (i <= 1)
                break label2870;
              k = jNh;
              j = jNh;
              ((View)localObject1).setPadding(k, k, j, j);
              break;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPi.setVisibility(0);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPi.ah(((com.tencent.mm.af.p)localObject5).title);
              break label2485;
              label2809: ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPN.setVisibility(8);
              break label2518;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPO.setImageResource(2131231098);
              break label2538;
              bool2 = false;
              break label2591;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jOY.setImageResource(2131231095);
              break label2652;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.i)localObject1).jPn.setBackgroundResource(2130838289);
            }
            j = jNh;
            ((View)localObject1).setPadding(j, j, jNh, jNg);
            break label1246;
          }
          if (localp.type == 10)
          {
            localObject1 = paramViewGroup.jPA;
            localq.xHU = com.tencent.mm.plugin.brandservice.ui.timeline.offenread.d.FG(localq.field_talker);
            if (bo.isNullOrNil(localp.title))
            {
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPi.setVisibility(8);
              if (i <= 1)
                break label3176;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPU.setVisibility(8);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPn.setBackgroundResource(2130838289);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).a((com.tencent.mm.plugin.brandservice.ui.timeline.a.c)localObject1, localq, localp);
              localObject2 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPm;
              localObject1 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPn;
              if (i <= 1)
                break label3199;
            }
            label3166: label3176: label3199: for (bool2 = true; ; bool2 = false)
            {
              ((a)localObject2).a(localp, localq, paramInt, localo, (View)localObject1, bool2, 0);
              break;
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPi.setVisibility(0);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPi.ah(com.tencent.mm.pluginsdk.ui.e.j.a(((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).mContext, localp.title, (int)((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPi.getTextSize()));
              j = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPm.jNp.getContentWidth();
              k = (int)(com.tencent.mm.bz.a.getDensity(((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).mContext) * 48.0F);
              localObject2 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPi.QV(j - k);
              if (localObject2 != null)
              {
                j = ((com.tencent.neattextview.textview.layout.a)localObject2).dPe();
                localObject2 = (LinearLayout.LayoutParams)((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPi.getLayoutParams();
                if (j != 1)
                  break label3166;
              }
              for (((LinearLayout.LayoutParams)localObject2).gravity = 17; ; ((LinearLayout.LayoutParams)localObject2).gravity = 19)
              {
                ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPi.setLayoutParams((ViewGroup.LayoutParams)localObject2);
                break;
                j = 0;
                break label3121;
              }
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPU.setVisibility(0);
              ((com.tencent.mm.plugin.brandservice.ui.timeline.a.l)localObject1).jPn.setBackgroundResource(2130838288);
              break label2970;
            }
          }
          localObject1 = paramViewGroup.jPv;
          com.tencent.mm.plugin.brandservice.ui.timeline.a.e.N(((k)localObject1).jOX, jNe);
          ((k)localObject1).jPi.ah(localp.title);
          ((k)localObject1).jPi.getPaint().setFakeBoldText(true);
          ((k)localObject1).jOX.setVisibility(0);
          ((k)localObject1).jPi.setTextColor(((k)localObject1).mContext.getResources().getColor(2131690202));
          ((k)localObject1).jPa.setTextColor(((k)localObject1).mContext.getResources().getColor(2131690202));
          ((k)localObject1).jPS.setBackgroundResource(2130839563);
          localObject5 = ((k)localObject1).jPm.jNp;
          localObject2 = localp.fjx;
          localObject3 = ((k)localObject1).jOX;
          j = localq.field_type;
          k = jNe;
          localObject4 = new k.1((k)localObject1, i, localq, paramInt);
          if (i == 1)
          {
            bool2 = true;
            ((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject5).a((String)localObject2, (ImageView)localObject3, j, k, (e.a)localObject4, bool2);
            if (i != 1)
              break label3467;
            ((k)localObject1).jPe.setBackgroundResource(2130837931);
            ((k)localObject1).a((com.tencent.mm.plugin.brandservice.ui.timeline.a.c)localObject1, localq, localp);
            localObject2 = ((k)localObject1).jPm;
            localObject1 = ((k)localObject1).jPn;
            if (i <= 1)
              break label3481;
          }
          for (bool2 = true; ; bool2 = false)
          {
            ((a)localObject2).a(localp, localq, paramInt, localo, (View)localObject1, bool2, 0);
            break;
            bool2 = false;
            break label3372;
            ((k)localObject1).jPe.setBackgroundResource(2130837933);
            break label3406;
          }
          paramViewGroup.jPs.setVisibility(8);
          break label1319;
          j = 0;
          break label1327;
          k = j;
          break label1379;
          if ((bool1) && (j == 1) && ((k == 5) || (k == 8) || (k == 0)))
          {
            ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOS.setVisibility(8);
            break label1415;
          }
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOS.setVisibility(0);
          if ((!bool1) || (j > 1))
          {
            localObject2 = (com.tencent.mm.af.p)localLinkedList.get(j - 1);
            localObject1 = (com.tencent.mm.af.p)localLinkedList.get(j);
            if (((((com.tencent.mm.af.p)localObject2).type != 7) && (((com.tencent.mm.af.p)localObject2).type != 5) && (((com.tencent.mm.af.p)localObject2).type != 6) && (bo.isNullOrNil(((com.tencent.mm.af.p)localObject2).fjx))) || ((((com.tencent.mm.af.p)localObject1).type != 7) && (((com.tencent.mm.af.p)localObject1).type != 5) && (((com.tencent.mm.af.p)localObject1).type != 6) && (bo.isNullOrNil(((com.tencent.mm.af.p)localObject1).fjx))))
            {
              com.tencent.mm.plugin.brandservice.ui.timeline.a.f.O(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOS, jNh);
              break label1415;
            }
            com.tencent.mm.plugin.brandservice.ui.timeline.a.f.O(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOS, jNj);
            break label1415;
          }
          com.tencent.mm.plugin.brandservice.ui.timeline.a.f.O(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOS, jNh);
          break label1415;
          com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT, jNh, jNi);
          break label1445;
          if (j == 1)
          {
            if (i == 2)
            {
              com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT, jNi, jNg);
              break label1445;
            }
            localObject1 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT;
            k = jNi;
            com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r((View)localObject1, k, k);
            break label1445;
          }
          if (j == i - 1)
          {
            com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT, jNi, jNg);
            break label1445;
          }
          localObject1 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT;
          k = jNi;
          com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r((View)localObject1, k, k);
          break label1445;
          if (j == 1)
          {
            if (j == i - 1)
            {
              com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT, jNh, jNg);
              break label1445;
            }
            com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT, jNh, jNi);
            break label1445;
          }
          if (j == i - 1)
          {
            com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r(((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT, jNi, jNg);
            break label1445;
          }
          localObject1 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOT;
          k = jNi;
          com.tencent.mm.plugin.brandservice.ui.timeline.a.f.r((View)localObject1, k, k);
          break label1445;
          label3945: if (!bo.isNullOrNil(((com.tencent.mm.af.p)localObject4).fjx))
          {
            ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOX.setVisibility(0);
            localObject5 = ((com.tencent.mm.af.p)localObject4).fjx;
            localObject2 = "@S";
            if ((j == 0) && (!bo.isNullOrNil(((com.tencent.mm.af.p)localObject4).fjO)))
              localObject1 = com.tencent.mm.af.l.a((com.tencent.mm.af.p)localObject4);
            while (true)
            {
              com.tencent.mm.plugin.brandservice.ui.timeline.preload.c localc = paramViewGroup.jPm.jNp;
              localObject5 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOX;
              int m = localq.field_type;
              k = jNf;
              localc.a((String)localObject1, (ImageView)localObject5, m, k, k, (String)localObject2, new f.2(paramViewGroup, (com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3, (com.tencent.mm.af.p)localObject4, localq, j));
              break;
              localObject1 = localObject5;
              if (j == 0)
              {
                localObject2 = "@T";
                localObject1 = localObject5;
              }
            }
          }
          if ((((com.tencent.mm.af.p)localObject4).type == 5) || (((com.tencent.mm.af.p)localObject4).type == 6))
          {
            ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOX.setVisibility(0);
            localObject2 = paramViewGroup.jPm.jNp;
            localObject1 = ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOX;
            k = jNf;
            ((ImageView)localObject1).setContentDescription(((com.tencent.mm.plugin.brandservice.ui.timeline.preload.c)localObject2).jNd.getString(2131298119));
            localObject2 = com.tencent.mm.at.o.ahp();
            localObject5 = new c.a();
            ((c.a)localObject5).ePF = true;
            ((c.a)localObject5).ePT = 2131689876;
            localObject5 = ((c.a)localObject5).ct(k, k);
            ((c.a)localObject5).fHe = 4;
            ((com.tencent.mm.at.a.a)localObject2).a("2130838270", (ImageView)localObject1, ((c.a)localObject5).ahG(), null, new com.tencent.mm.pluginsdk.ui.applet.e());
            break label1578;
          }
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOW.setVisibility(8);
          break label1578;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOW.setVisibility(8);
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOU.setTextColor(paramViewGroup.mContext.getResources().getColor(2131690164));
          break label1578;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOV.setVisibility(8);
          break label1620;
          bool2 = false;
          break label1651;
          ((com.tencent.mm.plugin.brandservice.ui.timeline.a.b)localObject3).jOR.setBackgroundResource(2130838289);
        }
        paramViewGroup.jPm.a(paramInt, localq, paramViewGroup.jOQ, paramViewGroup.jOP);
        paramViewGroup.jPm.a(paramViewGroup, localq);
        break label172;
        if (paramView == null)
        {
          paramViewGroup = new com.tencent.mm.plugin.brandservice.ui.timeline.a.h();
          paramView = paramViewGroup.a(this.jNd, this);
          paramView.setTag(paramViewGroup);
          localObject1 = com.tencent.mm.pluginsdk.ui.e.j.a(paramViewGroup.mContext, localq.field_content, (int)paramViewGroup.jPi.getTextSize(), 1, null, null);
          paramViewGroup.jPi.setMaxLines(2147483647);
          paramViewGroup.jPi.ah((CharSequence)localObject1);
          k = paramViewGroup.jPm.jNp.getContentWidth();
          j = (int)(com.tencent.mm.bz.a.getDensity(paramViewGroup.mContext) * 48.0F);
          localObject1 = paramViewGroup.jPi.QV(k - j);
          if (localObject1 == null)
            break label4629;
          j = ((com.tencent.neattextview.textview.layout.a)localObject1).dPe();
          label4457: if (j <= 5)
            break label4648;
          if (!localq.field_isExpand)
            paramViewGroup.jPi.setMaxLines(5);
          paramViewGroup.jPK.setVisibility(0);
          if (!localq.field_isExpand)
            break label4635;
          paramViewGroup.jPK.setText(2131297667);
          paramViewGroup.jPK.setOnClickListener(new h.1(paramViewGroup, localq));
          localObject1 = (LinearLayout.LayoutParams)paramViewGroup.jPi.getLayoutParams();
          if (j != 1)
            break label4670;
        }
        for (((LinearLayout.LayoutParams)localObject1).gravity = 17; ; ((LinearLayout.LayoutParams)localObject1).gravity = 19)
        {
          paramViewGroup.jPi.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          paramViewGroup.jPm.a(paramViewGroup, localq);
          paramViewGroup.jPm.a(paramInt, localq, paramViewGroup.jOQ, paramViewGroup.jOP);
          paramViewGroup.jPL.setOnTouchListener(paramViewGroup.jPm.jNA);
          paramViewGroup.jPL.setOnLongClickListener(new h.2(paramViewGroup, localq));
          break;
          paramViewGroup = (com.tencent.mm.plugin.brandservice.ui.timeline.a.h)paramView.getTag();
          break label4359;
          j = 0;
          break label4457;
          paramViewGroup.jPK.setText(2131297666);
          break label4505;
          paramViewGroup.jPi.setMaxLines(2147483647);
          paramViewGroup.jPK.setVisibility(8);
          break label4522;
        }
        if (paramView == null)
        {
          paramViewGroup = new com.tencent.mm.plugin.brandservice.ui.timeline.a.p();
          paramView = paramViewGroup.a(this.jNd, this);
          paramView.setTag(paramViewGroup);
          label4707: localq.xHT = com.tencent.mm.plugin.brandservice.ui.b.a.e(localq);
          if (!localq.xHT)
            break label5048;
          paramViewGroup.jPj.setVisibility(0);
          paramViewGroup.jPk.setVisibility(8);
          localObject2 = paramViewGroup.jPi;
          localObject1 = paramViewGroup.jOY;
          localObject5 = new com.tencent.mm.modelvoice.n(localq.field_content);
          ((MMNeat7extView)localObject2).ah(com.tencent.mm.pluginsdk.f.h.formatTime("yyyy/MM/dd", System.currentTimeMillis() / 1000L));
          if (localq.xHT)
          {
            localObject2 = com.tencent.mm.af.l.kr((int)(((com.tencent.mm.modelvoice.n)localObject5).time / 1000L));
            if (TextUtils.isEmpty((CharSequence)localObject2))
              break label5121;
            paramViewGroup.jPY.setVisibility(0);
            paramViewGroup.jPY.setText((CharSequence)localObject2);
            label4834: paramViewGroup.jPL.setOnClickListener(new p.2(paramViewGroup));
            paramViewGroup.jPL.setBackgroundResource(2130838288);
            localObject2 = paramViewGroup.jPL;
            k = jNh;
            j = jNg;
            i = jNh;
            ((View)localObject2).setPadding(k, j, i, i);
          }
          localObject2 = ((ImageView)localObject1).getDrawable();
          if (((localObject2 instanceof AnimationDrawable)) && (((AnimationDrawable)localObject2).isRunning()))
            ((AnimationDrawable)localObject2).stop();
          if ((!paramViewGroup.jPm.jNv.isPlaying()) || (localq.field_msgId != paramViewGroup.jPm.jNv.jON))
            break label5133;
          ((ImageView)localObject1).setImageResource(2130838272);
          if ((((ImageView)localObject1).getDrawable() instanceof AnimationDrawable))
            ((AnimationDrawable)((ImageView)localObject1).getDrawable()).start();
        }
        while (true)
        {
          ((ImageView)localObject1).setOnClickListener(new p.3(paramViewGroup, localq, (ImageView)localObject1));
          paramViewGroup.jPm.a(paramViewGroup, localq);
          paramViewGroup.jPm.a(paramInt, localq, paramViewGroup.jOQ, paramViewGroup.jOP);
          break;
          paramViewGroup = (com.tencent.mm.plugin.brandservice.ui.timeline.a.p)paramView.getTag();
          break label4707;
          paramViewGroup.jOS.setVisibility(8);
          paramViewGroup.jPj.setVisibility(8);
          paramViewGroup.jPk.setVisibility(0);
          paramViewGroup.jQa.setVisibility(8);
          paramViewGroup.jPZ.setVisibility(0);
          localObject2 = paramViewGroup.jQb;
          localObject1 = paramViewGroup.jPZ;
          paramViewGroup.jPk.setOnClickListener(new p.1(paramViewGroup));
          break label4754;
          paramViewGroup.jPY.setVisibility(8);
          break label4834;
          ((ImageView)localObject1).setImageResource(2130838271);
        }
        if (paramView == null)
        {
          paramViewGroup = new com.tencent.mm.plugin.brandservice.ui.timeline.a.d();
          paramView = paramViewGroup.a(this.jNd, this);
          paramView.setTag(paramViewGroup);
        }
        while (true)
        {
          if (this.jNx == null)
            this.jNx = new b(this.jNd);
          localObject1 = this.jNx;
          paramViewGroup.jPm.a(paramViewGroup, localq);
          paramViewGroup.jPm.a(paramInt, localq, paramViewGroup.jOQ, paramViewGroup.jOP);
          localq.xHT = com.tencent.mm.plugin.brandservice.ui.b.a.e(localq);
          if (!localq.xHT)
            break label5359;
          paramViewGroup.jPk.setVisibility(8);
          paramViewGroup.jPj.setVisibility(0);
          com.tencent.mm.plugin.brandservice.ui.timeline.a.e.N(paramViewGroup.jPg, jNe);
          com.tencent.mm.plugin.brandservice.ui.timeline.a.e.N(paramViewGroup.jPf, jNe);
          ((b)localObject1).a(localq, paramInt, paramViewGroup.jPf, jNe);
          paramViewGroup.jPg.setOnClickListener(new d.1(paramViewGroup, localq));
          paramViewGroup.jPg.setOnTouchListener(paramViewGroup.jPm.jNA);
          paramViewGroup.jPg.setOnLongClickListener(new d.2(paramViewGroup, localq));
          break;
          paramViewGroup = (com.tencent.mm.plugin.brandservice.ui.timeline.a.d)paramView.getTag();
        }
        label5359: paramViewGroup.jPk.setVisibility(0);
        paramViewGroup.jPj.setVisibility(8);
        paramViewGroup.jOS.setVisibility(8);
        paramViewGroup.jPi.ah(paramViewGroup.mContext.getText(2131297663));
        ((b)localObject1).a(localq, paramInt, paramViewGroup.jPh, 0);
        paramViewGroup.jPk.setOnClickListener(new d.3(paramViewGroup, localq));
        break label172;
        paramViewGroup.jOR = View.inflate(paramView, 2130968878, null);
        paramViewGroup.aWH();
        paramView = paramViewGroup.jOR;
        break;
        paramViewGroup = (com.tencent.mm.plugin.brandservice.ui.timeline.a.o)paramView.getTag();
        break label150;
      }
    }
  }

  public final int getViewTypeCount()
  {
    return 5;
  }

  public final boolean isEmpty()
  {
    boolean bool = false;
    AppMethodBeat.i(14127);
    if (super.isEmpty())
      if (z.aeY().baS() > 0)
        AppMethodBeat.o(14127);
    while (true)
    {
      return bool;
      chc localchc = com.tencent.mm.plugin.brandservice.ui.timeline.offenread.d.aWL();
      if ((localchc != null) && (!bo.ek(localchc.xfW)));
      for (int i = 0; ; i = 1)
      {
        if (i != 0)
          break label70;
        AppMethodBeat.o(14127);
        break;
      }
      label70: bool = super.isEmpty();
      AppMethodBeat.o(14127);
    }
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(14122);
    super.notifyDataSetChanged();
    AppMethodBeat.o(14122);
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(14121);
    if (this.jNl == null)
    {
      ab.w("MicroMsg.BizTimeLineAdapter", "onCreateContextMenu mInfo == null");
      AppMethodBeat.o(14121);
    }
    while (true)
    {
      return;
      if (this.jNn == 0)
      {
        paramView = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.jNl.field_talker);
        if (paramView == null)
        {
          ab.e("MicroMsg.BizTimeLineAdapter", "onCreateContextMenu, contact is null, talker = " + this.jNl.field_talker);
          AppMethodBeat.o(14121);
        }
        else
        {
          paramContextMenuInfo = paramView.Oj();
          paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.e.j.b(this.jNd, paramContextMenuInfo));
          if (com.tencent.mm.n.a.jh(paramView.field_type))
          {
            paramContextMenu.add(0, 10, 0, 2131297654);
            paramContextMenu.add(0, 2, 0, 2131301280);
          }
          AppMethodBeat.o(14121);
        }
      }
      else
      {
        paramContextMenu.add(0, 11, 0, 2131297656);
        AppMethodBeat.o(14121);
      }
    }
  }

  public final q sg(int paramInt)
  {
    AppMethodBeat.i(14111);
    q localq;
    if ((paramInt < this.iKa.size()) && (paramInt >= 0))
    {
      localq = (q)this.iKa.get(paramInt);
      AppMethodBeat.o(14111);
    }
    while (true)
    {
      return localq;
      localq = null;
      AppMethodBeat.o(14111);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a
 * JD-Core Version:    0.6.2
 */