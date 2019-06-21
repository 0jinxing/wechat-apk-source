package com.tencent.mm.plugin.fav.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.plugin.fav.ui.d.a.c;
import com.tencent.mm.plugin.fav.ui.d.d;
import com.tencent.mm.plugin.fav.ui.d.e;
import com.tencent.mm.plugin.fav.ui.d.f;
import com.tencent.mm.plugin.fav.ui.d.i;
import com.tencent.mm.plugin.fav.ui.d.j;
import com.tencent.mm.plugin.fav.ui.d.k;
import com.tencent.mm.plugin.fav.ui.d.m;
import com.tencent.mm.plugin.fav.ui.d.n;
import com.tencent.mm.plugin.fav.ui.d.o;
import com.tencent.mm.plugin.fav.ui.d.p;
import com.tencent.mm.plugin.fav.ui.d.q;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class b extends a
{
  private com.tencent.mm.sdk.b.c hAA;
  public int jSW;
  private boolean mlc;
  public List<com.tencent.mm.plugin.fav.a.g> mld;
  private List<com.tencent.mm.plugin.fav.a.g> mle;
  private List<com.tencent.mm.plugin.fav.a.g> mlf;
  public List<Long> mlg;
  public boolean mlh;
  private Map<Long, com.tencent.mm.plugin.fav.a.g> mli;
  private List<Integer> mlj;
  private List<String> mlk;
  private List<String> mll;
  private SparseArray<com.tencent.mm.plugin.fav.ui.d.a> mlm;
  private boolean mln;
  public a.c mlo;
  public boolean mlp;
  public boolean mlq;
  public ListView mlr;
  public String query;
  public int scene;

  public b(com.tencent.mm.plugin.fav.ui.l paraml, boolean paramBoolean)
  {
    AppMethodBeat.i(74294);
    this.mlc = false;
    this.mld = new ArrayList();
    this.mle = new ArrayList();
    this.mlf = new LinkedList();
    this.mlg = new ArrayList();
    this.mlh = false;
    this.mli = new TreeMap();
    this.mlj = new ArrayList();
    this.mlk = new LinkedList();
    this.mll = new LinkedList();
    this.mlm = new SparseArray();
    this.mln = false;
    this.mlp = false;
    this.mlq = false;
    this.query = "";
    this.hAA = new com.tencent.mm.sdk.b.c()
    {
    };
    this.type = -1;
    this.mlm.put(1, new m(paraml));
    this.mlm.put(2, new d(paraml));
    this.mlm.put(3, new q(paraml));
    this.mlm.put(4, new p(paraml));
    this.mlm.put(5, new o(paraml));
    this.mlm.put(6, new e(paraml));
    this.mlm.put(7, new com.tencent.mm.plugin.fav.ui.d.g(paraml));
    this.mlm.put(8, new com.tencent.mm.plugin.fav.ui.d.c(paraml));
    this.mlm.put(10, new i(paraml));
    this.mlm.put(12, new com.tencent.mm.plugin.fav.ui.d.l(paraml));
    this.mlm.put(15, new com.tencent.mm.plugin.fav.ui.d.l(paraml));
    this.mlm.put(11, new f(paraml));
    this.mlm.put(14, new j(paraml));
    this.mlm.put(16, new k(paraml));
    this.mlm.put(17, new com.tencent.mm.plugin.fav.ui.d.b(paraml));
    this.mlm.put(18, new com.tencent.mm.plugin.fav.ui.d.h(paraml));
    this.mlm.put(-2, new n(paraml));
    if (paramBoolean != this.mlp)
    {
      this.mlp = paramBoolean;
      if (paramBoolean)
        this.mli.clear();
    }
    if (!this.mlp)
      bvX();
    bvY();
    notifyDataSetChanged();
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    com.tencent.mm.sdk.b.a.xxA.c(this.hAA);
    AppMethodBeat.o(74294);
  }

  private void bP(List<com.tencent.mm.plugin.fav.a.g> paramList)
  {
    AppMethodBeat.i(74299);
    if (paramList == null)
      AppMethodBeat.o(74299);
    while (true)
    {
      return;
      ab.d("MicroMsg.FavoriteAdapter", "before do recycle, need recycle list size[%d]", new Object[] { Integer.valueOf(paramList.size()) });
      ab.d("MicroMsg.FavoriteAdapter", "after do recycle, current can reused list size[%d]", new Object[] { Integer.valueOf(this.mlf.size()) });
      paramList.clear();
      AppMethodBeat.o(74299);
    }
  }

  private void bvZ()
  {
    AppMethodBeat.i(74298);
    lV(0);
    this.mlg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().buZ();
    AppMethodBeat.o(74298);
  }

  private boolean bwa()
  {
    AppMethodBeat.i(74300);
    boolean bool;
    if ((!this.mlk.isEmpty()) || (!this.mll.isEmpty()) || (!this.mlj.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(74300);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(74300);
    }
  }

  private static List<com.tencent.mm.plugin.fav.a.g> g(List<com.tencent.mm.plugin.fav.a.g> paramList, List<Long> paramList1)
  {
    int i = 0;
    AppMethodBeat.i(74297);
    ArrayList localArrayList = new ArrayList();
    if (paramList1 == null)
      AppMethodBeat.o(74297);
    while (true)
    {
      return localArrayList;
      int j = i;
      long l;
      if (paramList != null)
      {
        j = i;
        if (paramList.size() > 0)
        {
          localArrayList.addAll(paramList);
          l = ((com.tencent.mm.plugin.fav.a.g)paramList.get(paramList.size() - 1)).field_localId;
        }
      }
      for (int k = 0; ; k++)
      {
        j = i;
        if (k < paramList1.size())
        {
          if (Long.valueOf(l).equals(paramList1.get(k)))
            j = k + 1;
        }
        else
          for (k = j; (k < j + 20) && (k < paramList1.size()); k++)
          {
            paramList = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(((Long)paramList1.get(k)).longValue());
            if (paramList != null)
              localArrayList.add(paramList);
          }
      }
      AppMethodBeat.o(74297);
    }
  }

  private void lV(int paramInt)
  {
    int i = this.jSW;
    if (paramInt == 0)
      this.jSW = 0;
    while (true)
    {
      return;
      if (i == 0)
        this.jSW = paramInt;
      else if (i != paramInt)
        this.jSW = 4;
    }
  }

  public final void a(boolean paramBoolean, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74301);
    if (paramBoolean == this.mlh)
      AppMethodBeat.o(74301);
    while (true)
    {
      return;
      this.mlh = paramBoolean;
      if (paramBoolean)
      {
        this.mli.clear();
        if (paramg != null)
        {
          paramg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramg.field_localId);
          if (paramg != null)
            this.mli.put(Long.valueOf(paramg.field_localId), paramg);
        }
      }
      notifyDataSetChanged();
      AppMethodBeat.o(74301);
    }
  }

  public final void bvX()
  {
    AppMethodBeat.i(74296);
    if (bwa())
    {
      ab.v("MicroMsg.FavoriteAdapter", "searching, do not load more data");
      AppMethodBeat.o(74296);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.fav.a.b.buo())
      {
        ab.w("MicroMsg.FavoriteAdapter", "want to load more data, but now doing batchget");
        AppMethodBeat.o(74296);
      }
      else if (!this.mlp)
      {
        try
        {
          this.lastUpdateTime = com.tencent.mm.plugin.fav.a.b.q(this.lastUpdateTime, this.type);
          AppMethodBeat.o(74296);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.FavoriteAdapter", localException, "", new Object[0]);
          AppMethodBeat.o(74296);
        }
      }
      else
      {
        this.mle = g(this.mld, this.mlg);
        this.mlc = true;
        AppMethodBeat.o(74296);
      }
    }
  }

  public final void bvY()
  {
    AppMethodBeat.i(74306);
    ab.v("MicroMsg.FavoriteAdapter", "reset data list beg");
    this.mlc = false;
    bP(this.mle);
    if (!bwa())
    {
      ab.i("MicroMsg.FavoriteAdapter", "on reset data list, last update time is %d, type is %d", new Object[] { Long.valueOf(this.lastUpdateTime), Integer.valueOf(this.type) });
      if (!this.mlp)
      {
        this.mle = com.tencent.mm.plugin.fav.a.b.a(this.lastUpdateTime, this.type, this.mkZ, this.mla);
        if ((this.mle != null) && (this.lastUpdateTime == 0L) && (this.mle.size() > 0))
          this.lastUpdateTime = ((com.tencent.mm.plugin.fav.a.g)this.mle.get(this.mle.size() - 1)).field_updateTime;
      }
      while (true)
      {
        if (this.mle == null)
        {
          ab.w("MicroMsg.FavoriteAdapter", "reset data list fail, get null list, new empty one");
          this.mle = new ArrayList();
        }
        if ((!this.mlp) && (!bwa()) && (this.mle.size() < 20) && (!((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().t(this.lastUpdateTime, this.type)))
        {
          ab.v("MicroMsg.FavoriteAdapter", "least than page count, loadMoreData");
          bvX();
        }
        this.mlc = true;
        ab.v("MicroMsg.FavoriteAdapter", "reset data list end");
        AppMethodBeat.o(74306);
        return;
        bvZ();
        this.mle = g(null, this.mlg);
      }
    }
    ab.i("MicroMsg.FavoriteAdapter", "on reset data list, do search, searchStr:%s, tagStr:%s, searchTypes:%s", new Object[] { this.mlk, this.mll, this.mlj });
    this.mle = com.tencent.mm.plugin.fav.a.b.a(this.mlk, this.mll, this.mlj, this.mlf, this.mkZ, this.mla);
    if (this.mle == null);
    for (int i = 0; ; i = this.mle.size())
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(10649, new Object[] { Integer.valueOf(i) });
      break;
    }
  }

  public final int bwb()
  {
    AppMethodBeat.i(74303);
    int i = this.mli.size();
    AppMethodBeat.o(74303);
    return i;
  }

  public final long bwc()
  {
    AppMethodBeat.i(74304);
    Iterator localIterator = this.mli.values().iterator();
    long l = 0L;
    if (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)localIterator.next();
      if (localg == null)
        break label67;
      l = localg.field_datatotalsize + l;
    }
    label67: 
    while (true)
    {
      break;
      AppMethodBeat.o(74304);
      return l;
    }
  }

  public final void c(List<Integer> paramList, List<String> paramList1, List<String> paramList2)
  {
    AppMethodBeat.i(74305);
    lV(0);
    this.mlj.clear();
    if (paramList != null)
    {
      this.mlj.addAll(paramList);
      if (!paramList.isEmpty())
        lV(2);
    }
    this.mlk.clear();
    if (paramList1 != null)
    {
      this.mlk.addAll(paramList1);
      if (!paramList1.isEmpty())
        lV(3);
    }
    this.mll.clear();
    if (paramList2 != null)
    {
      this.mll.addAll(paramList2);
      if (!paramList2.isEmpty())
        lV(1);
    }
    this.mln = true;
    bvY();
    this.mln = false;
    AppMethodBeat.o(74305);
  }

  public final void finish()
  {
    AppMethodBeat.i(74295);
    com.tencent.mm.sdk.b.a.xxA.d(this.hAA);
    AppMethodBeat.o(74295);
  }

  public final int getCount()
  {
    AppMethodBeat.i(74313);
    int i = this.mld.size();
    AppMethodBeat.o(74313);
    return i + 1;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(74309);
    if (paramInt == 0)
    {
      AppMethodBeat.o(74309);
      paramInt = i;
    }
    while (true)
    {
      return paramInt;
      com.tencent.mm.plugin.fav.a.g localg = vE(paramInt - 1);
      switch (localg.field_type)
      {
      case 9:
      case 13:
      default:
        ab.w("MicroMsg.FavoriteAdapter", "get item view type unknown, %d", new Object[] { Integer.valueOf(localg.field_type) });
        paramInt = -2;
        AppMethodBeat.o(74309);
        break;
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
        paramInt = localg.field_type;
        AppMethodBeat.o(74309);
      }
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(74311);
    if (paramInt == 0)
    {
      paramView = new View(paramViewGroup.getContext());
      paramView.setLayoutParams(new AbsListView.LayoutParams(0, 0));
      paramView.setBackgroundResource(2131690048);
      paramView.setPadding(0, 0, 0, 0);
      paramView.setEnabled(false);
      AppMethodBeat.o(74311);
    }
    while (true)
    {
      return paramView;
      com.tencent.mm.plugin.fav.a.g localg = vE(paramInt - 1);
      com.tencent.mm.plugin.fav.ui.d.a locala = (com.tencent.mm.plugin.fav.ui.d.a)this.mlm.get(localg.field_type);
      if (locala == null)
      {
        ab.w("MicroMsg.FavoriteAdapter", "unknown type %d, use unknown item creator", new Object[] { Integer.valueOf(localg.field_type) });
        locala = (com.tencent.mm.plugin.fav.ui.d.a)this.mlm.get(-2);
        bvW();
        paramView = locala.a(paramView, paramViewGroup, localg);
        AppMethodBeat.o(74311);
      }
      else
      {
        locala.moE.jLC = bwa();
        locala.moE.lastUpdateTime = this.lastUpdateTime;
        locala.moE.mlh = this.mlh;
        locala.moE.mli = this.mli;
        locala.moE.moG = this.mlo;
        locala.moE.mlp = this.mlp;
        paramView = locala.a(paramView, paramViewGroup, localg);
        AppMethodBeat.o(74311);
      }
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(74310);
    int i = this.mlm.size();
    AppMethodBeat.o(74310);
    return i + 4;
  }

  public final List<com.tencent.mm.plugin.fav.a.g> hk(boolean paramBoolean)
  {
    AppMethodBeat.i(74302);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.mli.values().iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)localIterator.next();
      if (localg != null)
        localLinkedList.add(localg);
    }
    if (paramBoolean)
      this.mli.clear();
    AppMethodBeat.o(74302);
    return localLinkedList;
  }

  public final int iK(long paramLong)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(74314);
    Object localObject = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramLong);
    if (localObject == null)
      AppMethodBeat.o(74314);
    for (j = -1; ; j = -1)
    {
      return j;
      if (this.mli.size() < 30)
        break;
      ab.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
      com.tencent.mm.ui.base.h.bQ(ah.getContext(), ah.getContext().getResources().getString(2131299664, new Object[] { Integer.valueOf(30) }));
      AppMethodBeat.o(74314);
    }
    this.mli.put(Long.valueOf(paramLong), localObject);
    if (((com.tencent.mm.plugin.fav.a.g)localObject).field_updateTime < this.lastUpdateTime)
    {
      this.lastUpdateTime = ((com.tencent.mm.plugin.fav.a.g)localObject).field_updateTime;
      bvY();
      localObject = this.mle.iterator();
      while (true)
      {
        if (!((Iterator)localObject).hasNext())
          break label226;
        if (((com.tencent.mm.plugin.fav.a.g)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          AppMethodBeat.o(74314);
          break;
        }
        j++;
      }
      label226: notifyDataSetChanged();
    }
    label301: 
    while (true)
    {
      AppMethodBeat.o(74314);
      j = -1;
      break;
      localObject = this.mld.iterator();
      for (j = i; ; j++)
      {
        if (!((Iterator)localObject).hasNext())
          break label301;
        if (((com.tencent.mm.plugin.fav.a.g)((Iterator)localObject).next()).field_localId == paramLong)
        {
          notifyDataSetChanged();
          AppMethodBeat.o(74314);
          break;
        }
      }
    }
  }

  public final boolean isEmpty()
  {
    AppMethodBeat.i(74307);
    boolean bool = this.mld.isEmpty();
    AppMethodBeat.o(74307);
    return bool;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(74308);
    ab.v("MicroMsg.FavoriteAdapter", "on notify data set changed requset, can exchange tempList[%B]", new Object[] { Boolean.valueOf(this.mlc) });
    if (this.mlc)
    {
      if ((this.mlp) && (this.mle != null) && (this.mld != null) && (this.mle.size() == this.mld.size()))
        this.mlq = true;
      List localList = this.mld;
      this.mld = this.mle;
      this.mle = localList;
      this.mlc = false;
    }
    ab.v("MicroMsg.FavoriteAdapter", "on notify data set changed end");
    super.notifyDataSetChanged();
    AppMethodBeat.o(74308);
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(74315);
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      ab.w("MicroMsg.FavoriteAdapter", "on item click, holder is null");
      AppMethodBeat.o(74315);
    }
    while (true)
    {
      return;
      if (paramAdapterView.mgf == null)
      {
        ab.w("MicroMsg.FavoriteAdapter", "on item click, info is null");
        AppMethodBeat.o(74315);
      }
      else
      {
        if ((!this.mlh) && (!this.mlp))
          break label194;
        if ((paramAdapterView.gnD.isChecked()) || (this.mli.size() < 30))
          break;
        ab.w("MicroMsg.FavoriteAdapter", "call select item, match max select count %d", new Object[] { Integer.valueOf(30) });
        com.tencent.mm.ui.base.h.bQ(ah.getContext(), ah.getContext().getResources().getString(2131299664, new Object[] { Integer.valueOf(30) }));
        AppMethodBeat.o(74315);
      }
    }
    paramView = paramAdapterView.gnD;
    if (!paramAdapterView.gnD.isChecked());
    for (boolean bool = true; ; bool = false)
    {
      paramView.setChecked(bool);
      AppMethodBeat.o(74315);
      break;
    }
    label194: com.tencent.mm.plugin.fav.ui.d.a locala = (com.tencent.mm.plugin.fav.ui.d.a)this.mlm.get(paramAdapterView.mgf.field_type);
    StringBuilder localStringBuilder;
    Object localObject;
    String str;
    if (locala != null)
    {
      localStringBuilder = new StringBuilder();
      localObject = paramAdapterView.mgf;
      str = ((com.tencent.mm.plugin.fav.a.g)localObject).field_id + "_" + System.currentTimeMillis() / 1000L;
      localObject = ((com.tencent.mm.plugin.fav.a.g)localObject).field_tagProto.wiJ;
      if (!bo.ek((List)localObject))
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
          localStringBuilder.append((String)((Iterator)localObject).next()).append(";");
      }
      localObject = new abh();
      ((abh)localObject).scene = this.scene;
      ((abh)localObject).jSW = this.jSW;
      if (this.mlr == null)
        break label447;
    }
    label447: for (((abh)localObject).index = (paramInt - this.mlr.getHeaderViewsCount()); ; ((abh)localObject).index = paramInt)
    {
      ((abh)localObject).query = this.query;
      ((abh)localObject).cvF = str;
      ((abh)localObject).mfg = localStringBuilder.toString();
      locala.a(paramView, (abh)localObject);
      ab.d("MicroMsg.FavoriteAdapter", "item click type %s", new Object[] { Integer.valueOf(paramAdapterView.mgf.field_type) });
      AppMethodBeat.o(74315);
      break;
    }
  }

  public final com.tencent.mm.plugin.fav.a.g vE(int paramInt)
  {
    AppMethodBeat.i(74312);
    com.tencent.mm.plugin.fav.a.g localg;
    if ((paramInt < 0) || (paramInt >= this.mld.size()))
    {
      ab.e("MicroMsg.FavoriteAdapter", "get item, but position error");
      localg = new com.tencent.mm.plugin.fav.a.g();
      AppMethodBeat.o(74312);
    }
    while (true)
    {
      return localg;
      localg = (com.tencent.mm.plugin.fav.a.g)this.mld.get(paramInt);
      AppMethodBeat.o(74312);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.a.b
 * JD-Core Version:    0.6.2
 */