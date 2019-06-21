package com.tencent.mm.plugin.sns.ui.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.w;
import com.tencent.mm.pluginsdk.model.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.azu;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.vending.base.Vending.a;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public final class a extends BaseAdapter
  implements w
{
  private static HashMap<Long, a.a> rEE;
  private static boolean rEF;
  private boolean eJj;
  public au rEA;
  public com.tencent.mm.plugin.sns.ui.a.b.b rEB;
  public boolean rEC;
  public Vending.a rED;

  static
  {
    AppMethodBeat.i(39947);
    rEE = new HashMap();
    rEF = false;
    AppMethodBeat.o(39947);
  }

  public a(MMActivity paramMMActivity, ListView paramListView, com.tencent.mm.plugin.sns.ui.d.b paramb, com.tencent.mm.plugin.sns.ui.i parami, String paramString, com.tencent.mm.plugin.sns.ui.a.b.b paramb1)
  {
    AppMethodBeat.i(39933);
    this.eJj = false;
    this.rED = new Vending.a()
    {
      public final void cuN()
      {
        AppMethodBeat.i(39932);
        if (!a.a(a.this))
          a.this.notifyDataSetChanged();
        AppMethodBeat.o(39932);
      }
    };
    this.rEA = new au(paramMMActivity, paramListView, paramb, parami, this);
    this.rEA.rps = true;
    paramListView = paramb1;
    if (paramb1 == null)
      paramListView = new com.tencent.mm.plugin.sns.ui.a.b.c();
    this.rEB = paramListView;
    this.rEB.a(paramMMActivity, this.rEA, paramString);
    paramMMActivity = this.rEB;
    com.tencent.mm.vending.f.a.i("Vending.ForwardVending", "Vending.setRangeSize(%s)", new Object[] { Integer.valueOf(10) });
    paramMMActivity.a = 10;
    this.rEB.addVendingDataChangedCallback(this.rED);
    AppMethodBeat.o(39933);
  }

  public static void F(n paramn)
  {
    AppMethodBeat.i(39939);
    long l1;
    a.a locala;
    if (paramn != null)
    {
      l1 = paramn.field_snsId;
      if (!rEE.containsKey(Long.valueOf(l1)))
      {
        locala = new a.a();
        if ((paramn.cqu() != null) && (paramn.cqu().xfI != null) && (paramn.cqu().xfI.wbJ == 1) && (paramn.cqu().xfI.wbK != null) && (paramn.cqu().xfI.wbK.size() > 0))
        {
          locala.fjN = paramn.cqu().xfI.wbK.size();
          locala.rEH = new HashSet();
          locala.rEI = new HashSet();
          locala.rEJ = new HashSet();
          locala.rEK = new HashSet();
          locala.id = paramn.cqu().Id;
          locala.rEP = paramn.cqu().dtW;
        }
      }
    }
    try
    {
      cbf localcbf = aj.q(paramn);
      locala.rEN = localcbf.xao;
      locala.rEO = localcbf.xar;
    }
    catch (Exception localException)
    {
      try
      {
        while (true)
        {
          g.RQ();
          locala.mGJ = ((j)g.K(j.class)).bOr().Rp(paramn.field_userName);
          long l2 = System.currentTimeMillis();
          g.RQ();
          locala.rEM = ((l2 - ((j)g.K(j.class)).bOr().Rt(paramn.field_userName)) / 1000L);
          rEE.put(Long.valueOf(l1), locala);
          AppMethodBeat.o(39939);
          return;
          localException = localException;
          locala.rEN = 0;
          locala.rEO = 0;
        }
      }
      catch (Exception paramn)
      {
        while (true)
        {
          locala.mGJ = 0;
          locala.rEM = 0L;
        }
      }
    }
  }

  public static void b(n paramn, int paramInt)
  {
    AppMethodBeat.i(39940);
    if (paramn != null)
    {
      long l = paramn.field_snsId;
      if (rEE.containsKey(Long.valueOf(l)))
      {
        paramn = (a.a)rEE.get(Long.valueOf(l));
        if (paramn.rEL == 0)
          paramn.rEL = (paramInt + 1);
        if (paramn.rEH == null)
          paramn.rEH = new HashSet();
        paramn.rEH.add(Integer.valueOf(paramInt + 1));
      }
    }
    AppMethodBeat.o(39940);
  }

  public static void c(n paramn, int paramInt)
  {
    AppMethodBeat.i(39941);
    if (paramn != null)
    {
      long l = paramn.field_snsId;
      if (rEE.containsKey(Long.valueOf(l)))
      {
        paramn = (a.a)rEE.get(Long.valueOf(l));
        if (paramn.rEI == null)
          paramn.rEI = new HashSet();
        if (!paramn.rEI.contains(Integer.valueOf(paramInt + 1)))
          paramn.rEI.add(Integer.valueOf(paramInt + 1));
      }
    }
    AppMethodBeat.o(39941);
  }

  public static void cuM()
  {
    AppMethodBeat.i(39944);
    Iterator localIterator = rEE.entrySet().iterator();
    while (localIterator.hasNext())
    {
      a.a locala = (a.a)((Map.Entry)localIterator.next()).getValue();
      locala.networkType = com.tencent.mm.plugin.sns.data.i.cms();
      ab.d("MicroMsg.SnsTimeLineVendingAdapter", "report big pic click, picNum:%d, clickPicNum:%d, firstClickPos:%d, networkType:%d, id:%s", new Object[] { Integer.valueOf(locala.fjN), Integer.valueOf(locala.rEH.size()), Integer.valueOf(locala.rEL), Integer.valueOf(locala.networkType), locala.id });
      Object localObject1 = locala.rEI.iterator();
      for (String str = ""; ((Iterator)localObject1).hasNext(); str = str + localObject2 + "|")
        localObject2 = (Integer)((Iterator)localObject1).next();
      localObject1 = str;
      if (str.length() >= 2)
        localObject1 = str.substring(0, str.length() - 1);
      Object localObject2 = locala.rEJ.iterator();
      for (str = ""; ((Iterator)localObject2).hasNext(); str = str + localObject3 + "|")
        localObject3 = (Integer)((Iterator)localObject2).next();
      localObject2 = str;
      if (str.length() >= 2)
        localObject2 = str.substring(0, str.length() - 1);
      Object localObject3 = locala.rEK.iterator();
      Integer localInteger;
      for (str = ""; ((Iterator)localObject3).hasNext(); str = str + localInteger + "|")
        localInteger = (Integer)((Iterator)localObject3).next();
      localObject3 = str;
      if (str.length() >= 2)
        localObject3 = str.substring(0, str.length() - 1);
      com.tencent.mm.plugin.report.service.h.pYm.e(11599, new Object[] { Integer.valueOf(locala.fjN), Integer.valueOf(locala.rEH.size()), Integer.valueOf(locala.rEL), Integer.valueOf(locala.networkType), Integer.valueOf(0), locala.id, Long.valueOf(locala.rEM), Integer.valueOf(locala.mGJ), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(locala.rEN), Integer.valueOf(locala.rEO), Integer.valueOf(0), localObject1, localObject2, localObject3, Integer.valueOf(0), "", Integer.valueOf(locala.rEP) });
    }
    rEE.clear();
    AppMethodBeat.o(39944);
  }

  public static void d(n paramn, int paramInt)
  {
    AppMethodBeat.i(39942);
    if (paramn != null)
    {
      long l = paramn.field_snsId;
      if (rEE.containsKey(Long.valueOf(l)))
      {
        paramn = (a.a)rEE.get(Long.valueOf(l));
        if (paramn.rEJ == null)
          paramn.rEJ = new HashSet();
        if (!paramn.rEJ.contains(Integer.valueOf(paramInt + 1)))
          paramn.rEJ.add(Integer.valueOf(paramInt + 1));
      }
    }
    AppMethodBeat.o(39942);
  }

  public static void d(TimeLineObject paramTimeLineObject)
  {
    AppMethodBeat.i(39945);
    if (paramTimeLineObject.xfI.wbN != null);
    for (int i = paramTimeLineObject.xfI.wbN.vGc; ; i = -1)
    {
      ((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a(paramTimeLineObject.xfI.Url, i, 2, new Object[] { paramTimeLineObject.Id });
      if ((!rEF) && (i != -1) && (((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(24)))
      {
        rEF = true;
        ((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rX(2);
      }
      if ((i == 5) && (((com.tencent.mm.plugin.brandservice.a.b)g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVP()) && (paramTimeLineObject.xfI.wbN != null) && (!bo.isNullOrNil(paramTimeLineObject.xfI.wbN.lvx)))
      {
        paramTimeLineObject = paramTimeLineObject.xfI.wbN.lvx;
        String str = q.v(paramTimeLineObject, 0, "@T");
        if (!e.ct(str))
        {
          Object localObject = new c.a();
          ((c.a)localObject).ePH = true;
          ((c.a)localObject).ePJ = str;
          localObject = ((c.a)localObject).ahG();
          o.ahp().a(paramTimeLineObject, (com.tencent.mm.at.a.a.c)localObject, null);
        }
      }
      AppMethodBeat.o(39945);
      return;
    }
  }

  public static void e(n paramn, int paramInt)
  {
    AppMethodBeat.i(39943);
    if (paramn != null)
    {
      long l = paramn.field_snsId;
      if (rEE.containsKey(Long.valueOf(l)))
      {
        paramn = (a.a)rEE.get(Long.valueOf(l));
        if (paramn.rEK == null)
          paramn.rEK = new HashSet();
        if (!paramn.rEK.contains(Integer.valueOf(paramInt + 1)))
          paramn.rEK.add(Integer.valueOf(paramInt + 1));
      }
    }
    AppMethodBeat.o(39943);
  }

  public final n DP(int paramInt)
  {
    AppMethodBeat.i(39938);
    Object localObject = (av)this.rEB.get(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(39938);
    }
    while (true)
    {
      return localObject;
      localObject = ((av)localObject).qBY;
      AppMethodBeat.o(39938);
    }
  }

  public final void crP()
  {
    AppMethodBeat.i(138389);
    this.rEB.notifyVendingDataChange();
    AppMethodBeat.o(138389);
  }

  public final int getCount()
  {
    return this.rEB.c;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(39936);
    paramInt = this.rEA.getItemViewType(paramInt);
    AppMethodBeat.o(39936);
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(39935);
    paramView = this.rEA.h(paramInt, paramView);
    AppMethodBeat.o(39935);
    return paramView;
  }

  public final int getViewTypeCount()
  {
    return 15;
  }

  public final void sg()
  {
    AppMethodBeat.i(39934);
    if (this.eJj)
      AppMethodBeat.o(39934);
    while (true)
    {
      return;
      this.eJj = true;
      this.rEB.notifyVendingDataChangeSynchronize();
      AppMethodBeat.o(39934);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.a.a
 * JD-Core Version:    0.6.2
 */