package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.g.a.af;
import com.tencent.mm.model.as;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.b.b.b;
import com.tencent.mm.model.r;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.conversation.a.e;
import com.tencent.mm.ui.conversation.a.e.a;
import com.tencent.mm.ui.conversation.a.j;
import com.tencent.mm.ui.conversation.a.q;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements d.a, as, n.b
{
  Context context;
  com.tencent.mm.network.n qbK;
  View zqA;
  List<com.tencent.mm.pluginsdk.ui.b.b> zqr;
  List<com.tencent.mm.pluginsdk.ui.b.b> zqs;
  List<com.tencent.mm.pluginsdk.ui.b.b> zqt;
  List<com.tencent.mm.pluginsdk.ui.b.b> zqu;
  List<com.tencent.mm.pluginsdk.ui.b.b> zqv;
  List<com.tencent.mm.pluginsdk.ui.b.b> zqw;
  com.tencent.mm.sdk.b.c zqx;
  com.tencent.mm.sdk.b.c zqy;
  ListView zqz;

  public a()
  {
    AppMethodBeat.i(34034);
    this.zqr = new LinkedList();
    this.zqs = new LinkedList();
    this.zqt = new LinkedList();
    this.zqu = new LinkedList();
    this.zqv = new LinkedList();
    this.zqw = new LinkedList();
    AppMethodBeat.o(34034);
  }

  private static void fu(List<com.tencent.mm.pluginsdk.ui.b.b> paramList)
  {
    AppMethodBeat.i(34042);
    paramList = paramList.iterator();
    while (paramList.hasNext())
      ((com.tencent.mm.pluginsdk.ui.b.b)paramList.next()).setVisibility(8);
    AppMethodBeat.o(34042);
  }

  static void fv(List<com.tencent.mm.pluginsdk.ui.b.b> paramList)
  {
    AppMethodBeat.i(34043);
    paramList = paramList.iterator();
    while (paramList.hasNext())
      ((com.tencent.mm.pluginsdk.ui.b.b)paramList.next()).release();
    AppMethodBeat.o(34043);
  }

  static void fw(List<com.tencent.mm.pluginsdk.ui.b.b> paramList)
  {
    AppMethodBeat.i(34044);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      ((com.tencent.mm.pluginsdk.ui.b.b)localIterator.next()).destroy();
    paramList.clear();
    AppMethodBeat.o(34044);
  }

  public final void ZB()
  {
    AppMethodBeat.i(34039);
    dIn();
    AppMethodBeat.o(34039);
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(34038);
    if (aw.RK())
    {
      aw.ZK();
      if (paramn == com.tencent.mm.model.c.Ry())
      {
        paramInt = ah.bh(paramObject);
        if (8193 == paramInt)
          dIn();
        if (42 == paramInt)
          dIn();
      }
    }
    AppMethodBeat.o(34038);
  }

  public final void a(Context paramContext, ListView paramListView, View paramView)
  {
    AppMethodBeat.i(34035);
    this.context = paramContext;
    this.zqz = paramListView;
    this.zqA = paramView;
    this.zqy = new a.1(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.zqy);
    paramView = new ae();
    paramView.csY.activity = ((Activity)paramContext);
    com.tencent.mm.sdk.b.a.xxA.m(paramView);
    paramView = new af();
    paramView.csZ.ctb = ((com.tencent.mm.pluginsdk.ui.b.b)e.a(this.context, e.a.zwh, null));
    com.tencent.mm.sdk.b.a.xxA.m(paramView);
    Object localObject = (com.tencent.mm.pluginsdk.ui.b.b)e.a(this.context, e.a.zvZ, null);
    paramView = new af();
    paramView.csZ.ctb = ((com.tencent.mm.pluginsdk.ui.b.b)localObject);
    paramView.csZ.level = 1;
    com.tencent.mm.sdk.b.a.xxA.m(paramView);
    localObject = (com.tencent.mm.pluginsdk.ui.b.b)e.a(this.context, e.a.zwa, null);
    paramView = new af();
    paramView.csZ.ctb = ((com.tencent.mm.pluginsdk.ui.b.b)localObject);
    paramView.csZ.cta = false;
    paramView.csZ.level = 1;
    com.tencent.mm.sdk.b.a.xxA.m(paramView);
    paramView = (q)e.a(this.context, e.a.zwg, null);
    localObject = new af();
    ((af)localObject).csZ.ctb = paramView;
    ((af)localObject).csZ.cta = false;
    ((af)localObject).csZ.level = 2;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    paramView = (com.tencent.mm.ui.conversation.a.a)e.a(this.context, e.a.zwd, null);
    localObject = new af();
    ((af)localObject).csZ.ctb = paramView;
    ((af)localObject).csZ.cta = false;
    ((af)localObject).csZ.level = 3;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    paramView = (com.tencent.mm.ui.d.a)e.a(this.context, e.a.zwi, new Object[] { b.b.foh });
    localObject = new af();
    ((af)localObject).csZ.ctb = paramView;
    ((af)localObject).csZ.cta = true;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    paramView = (com.tencent.mm.pluginsdk.ui.b.b)e.a(this.context, e.a.zwb, null);
    localObject = new af();
    ((af)localObject).csZ.ctb = paramView;
    ((af)localObject).csZ.cta = false;
    ((af)localObject).csZ.level = 1;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.sdk.b.a.xxA.d(this.zqy);
    this.zqw.addAll(this.zqr);
    this.zqw.addAll(this.zqs);
    this.zqw.addAll(this.zqt);
    this.zqw.addAll(this.zqu);
    Collections.sort(this.zqw, new a.2(this));
    paramView = this.zqw.iterator();
    while (paramView.hasNext())
    {
      localObject = (com.tencent.mm.pluginsdk.ui.b.b)paramView.next();
      this.zqz.addHeaderView(((com.tencent.mm.pluginsdk.ui.b.b)localObject).getView());
    }
    new LinkedList();
    paramView = (com.tencent.mm.pluginsdk.ui.b.b)e.a(paramContext, e.a.zwc, null);
    if ((paramView != null) && (paramView.getView() != null))
      paramListView.addFooterView(paramView.getView());
    this.zqv.add(paramView);
    paramListView.addFooterView(new j(paramContext).getView(), null, true);
    this.zqv.add(paramView);
    this.qbK = new a.3(this);
    aw.a(this.qbK);
    this.zqx = new a.4(this);
    com.tencent.mm.sdk.b.a.xxA.c(this.zqx);
    aw.ZK();
    com.tencent.mm.model.c.a(this);
    dIn();
    AppMethodBeat.o(34035);
  }

  public final void dIn()
  {
    AppMethodBeat.i(34036);
    if ((this.context == null) || (!aw.RK()))
      AppMethodBeat.o(34036);
    while (true)
    {
      return;
      ab.i("MicroMsg.BannerHelper", "updateBanner, :%d", new Object[] { Integer.valueOf(hashCode()) });
      boolean bool1 = m(this.zqr, true);
      boolean bool2 = m(this.zqs, true);
      boolean bool3 = m(this.zqt, true);
      boolean bool4 = m(this.zqu, true);
      int i;
      if ((bool1) || (bool2) || (bool3) || (bool4))
      {
        i = 1;
        if (!bool2)
          break label233;
        fu(this.zqt);
        fu(this.zqu);
      }
      Object localObject1;
      while (true)
      {
        localObject1 = new LinkedList();
        Iterator localIterator = this.zqw.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (com.tencent.mm.pluginsdk.ui.b.b)localIterator.next();
          if (localObject2 != null)
          {
            View localView = ((ViewGroup)((com.tencent.mm.pluginsdk.ui.b.b)localObject2).getView()).getChildAt(0);
            if ((localView != null) && (localView.getVisibility() == 0))
            {
              ((com.tencent.mm.pluginsdk.ui.b.b)localObject2).nfA = false;
              ((com.tencent.mm.pluginsdk.ui.b.b)localObject2).eVH = false;
              ((List)localObject1).add(localObject2);
            }
          }
        }
        i = 0;
        break;
        label233: if (bool3)
          fu(this.zqu);
      }
      if (((List)localObject1).size() > 0)
      {
        ((com.tencent.mm.pluginsdk.ui.b.b)((LinkedList)localObject1).getFirst()).nfA = true;
        ((com.tencent.mm.pluginsdk.ui.b.b)((LinkedList)localObject1).getLast()).eVH = true;
        localObject2 = ((List)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
          ((com.tencent.mm.pluginsdk.ui.b.b)((Iterator)localObject2).next()).aMN();
      }
      if ((i != 0) && (this.zqz.getVisibility() != 0))
      {
        this.zqz.setVisibility(0);
        this.zqA.setVisibility(8);
      }
      Object localObject2 = this.zqv.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (com.tencent.mm.pluginsdk.ui.b.b)((Iterator)localObject2).next();
        if (localObject1 != null)
          ((com.tencent.mm.pluginsdk.ui.b.b)localObject1).aMN();
      }
      AppMethodBeat.o(34036);
    }
  }

  final void ft(List<com.tencent.mm.pluginsdk.ui.b.b> paramList)
  {
    AppMethodBeat.i(34040);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.pluginsdk.ui.b.b localb = (com.tencent.mm.pluginsdk.ui.b.b)paramList.next();
      if (localb.getView() != null)
        this.zqz.removeHeaderView(localb.getView());
    }
    AppMethodBeat.o(34040);
  }

  final boolean m(List<com.tencent.mm.pluginsdk.ui.b.b> paramList, boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(34041);
    Iterator localIterator = paramList.iterator();
    boolean bool2 = false;
    if (localIterator.hasNext())
    {
      com.tencent.mm.pluginsdk.ui.b.b localb = (com.tencent.mm.pluginsdk.ui.b.b)localIterator.next();
      paramList = ((ViewGroup)localb.getView()).getChildAt(0);
      if (localb.aMN())
      {
        if ((paramList != null) && (paramList.getVisibility() == 0));
        for (bool2 = true; ; bool2 = false)
        {
          ab.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[true] :%s, checkAll:%b, isVisible:%b, hc:%d", new Object[] { localb, Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Integer.valueOf(hashCode()) });
          if (paramBoolean)
            break;
          AppMethodBeat.o(34041);
          bool2 = bool1;
          label132: return bool2;
        }
      }
      if ((paramList != null) && (paramList.getVisibility() == 0))
        ab.i("MicroMsg.BannerHelper", "refreshAndReturnIsVisible[false] but visible :%s, checkAll:%b, hc:%d", new Object[] { localb, Boolean.valueOf(paramBoolean), Integer.valueOf(hashCode()) });
    }
    while (true)
    {
      break;
      AppMethodBeat.o(34041);
      break label132;
      bool2 = true;
    }
  }

  public final void qj(String paramString)
  {
    AppMethodBeat.i(34037);
    if ((aw.RK()) && (!aw.QT()) && (ah.nullAsNil(paramString).length() > 0) && (paramString.equals(r.Yz())))
      dIn();
    AppMethodBeat.o(34037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a
 * JD-Core Version:    0.6.2
 */