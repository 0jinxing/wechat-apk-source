package com.tencent.mm.plugin.brandservice.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.d;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.t;
import com.tencent.mm.protocal.protobuf.lk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
  implements f
{
  public LinkedList<c.a> jKu;
  private boolean jKv;
  private List<lk> jKw;
  private List<lk> jKx;

  public c()
  {
    AppMethodBeat.i(13829);
    this.jKu = new LinkedList();
    this.jKv = false;
    this.jKw = new LinkedList();
    this.jKx = new LinkedList();
    g.Rg().a(387, this);
    g.Rg().a(new e(), 0);
    AppMethodBeat.o(13829);
  }

  public final void init()
  {
    AppMethodBeat.i(13830);
    long l1 = System.currentTimeMillis();
    this.jKw.clear();
    this.jKx.clear();
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("select bizinfo.brandIconURL");
    ((StringBuilder)localObject1).append(", bizinfo.type");
    ((StringBuilder)localObject1).append(", bizinfo.status");
    ((StringBuilder)localObject1).append(", rcontact.username");
    ((StringBuilder)localObject1).append(", rcontact.conRemark");
    ((StringBuilder)localObject1).append(", rcontact.nickname");
    ((StringBuilder)localObject1).append(", rcontact.alias");
    ((StringBuilder)localObject1).append(", rcontact.conRemarkPYFull");
    ((StringBuilder)localObject1).append(", rcontact.conRemarkPYShort");
    ((StringBuilder)localObject1).append(", rcontact.showHead");
    ((StringBuilder)localObject1).append(", rcontact.pyInitial");
    ((StringBuilder)localObject1).append(", rcontact.quanPin");
    ((StringBuilder)localObject1).append(" from rcontact, bizinfo");
    ((StringBuilder)localObject1).append(" where rcontact.username = bizinfo.username");
    ((StringBuilder)localObject1).append(" and (rcontact.verifyFlag & ").append(ad.dsh()).append(") != 0 ");
    ((StringBuilder)localObject1).append(" and (rcontact.type & 1) != 0 ");
    ((StringBuilder)localObject1).append(" order by showHead asc, ");
    ((StringBuilder)localObject1).append(" case when length(conRemarkPYFull) > 0 then upper(conRemarkPYFull) ");
    ((StringBuilder)localObject1).append(" else upper(quanPin) end asc, ");
    ((StringBuilder)localObject1).append(" case when length(conRemark) > 0 then upper(conRemark) ");
    ((StringBuilder)localObject1).append(" else upper(quanPin) end asc, ");
    ((StringBuilder)localObject1).append(" upper(quanPin) asc, ");
    ((StringBuilder)localObject1).append(" upper(nickname) asc");
    localObject1 = ((StringBuilder)localObject1).toString();
    ab.d("MicroMsg.BrandService.BrandServiceMgr", "sql %s", new Object[] { localObject1 });
    g.RQ();
    Object localObject2 = g.RP().eJN.a((String)localObject1, null, 2);
    localObject1 = new HashMap();
    Object localObject3;
    if (localObject2 != null)
    {
      int i = 0;
      while (((Cursor)localObject2).moveToNext())
      {
        int j = i + 1;
        localObject3 = new ad();
        ((ad)localObject3).d((Cursor)localObject2);
        d locald = new d();
        locald.d((Cursor)localObject2);
        i = j;
        if (!((ap)localObject3).field_username.equals("gh_43f2581f6fd6"))
        {
          localObject4 = new lk();
          ((lk)localObject4).userName = ((ap)localObject3).field_username;
          ((lk)localObject4).ehM = ((ad)localObject3);
          ((lk)localObject4).pkW = locald;
          i = j;
          if (!t.nl(((lk)localObject4).userName))
          {
            ((Map)localObject1).put(((lk)localObject4).userName, localObject4);
            i = j;
            if (((lk)localObject4).pkW.field_type != 3)
              if (((lk)localObject4).pkW.field_type == 2)
              {
                this.jKw.add(localObject4);
                i = j;
              }
              else if (((lk)localObject4).pkW.field_type != 1)
              {
                i = j;
                if (((lk)localObject4).pkW.field_type != 0);
              }
              else
              {
                this.jKx.add(localObject4);
                i = j;
              }
          }
        }
      }
      ab.d("MicroMsg.BrandService.BrandServiceMgr", "biz contact count %d", new Object[] { Integer.valueOf(i) });
      ((Cursor)localObject2).close();
    }
    long l2 = System.currentTimeMillis();
    localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("select username");
    ((StringBuilder)localObject2).append(" from rcontact");
    ((StringBuilder)localObject2).append(" where (verifyFlag & ").append(ad.dsh()).append(") != 0 ");
    ((StringBuilder)localObject2).append(" and (type & 1) != 0 ");
    localObject2 = ((StringBuilder)localObject2).toString();
    ab.d("MicroMsg.BrandService.BrandServiceMgr", "sql check %s", new Object[] { localObject2 });
    g.RQ();
    Object localObject4 = g.RP().eJN.a((String)localObject2, null, 0);
    if (localObject4 != null)
    {
      localObject2 = new ArrayList();
      while (((Cursor)localObject4).moveToNext())
      {
        localObject3 = ((Cursor)localObject4).getString(0);
        if (!((Map)localObject1).containsKey(localObject3))
          ((ArrayList)localObject2).add(localObject3);
      }
      ((Cursor)localObject4).close();
      ab.i("MicroMsg.BrandService.BrandServiceMgr", "need update list size is %d, {%s}", new Object[] { Integer.valueOf(((ArrayList)localObject2).size()), localObject2 });
      if (!((ArrayList)localObject2).isEmpty())
      {
        g.RQ();
        long l3 = g.RP().eJN.iV(Thread.currentThread().getId());
        localObject1 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          ao.a.flu.ai((String)localObject2, "");
        }
        g.RQ();
        g.RP().eJN.mB(l3);
      }
    }
    ab.d("MicroMsg.BrandService.BrandServiceMgr", "check use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
    ab.d("MicroMsg.BrandService.BrandServiceMgr", "service add subscribe count:%d, enterpriseFather count:%d", new Object[] { Integer.valueOf(this.jKx.size()), Integer.valueOf(this.jKw.size()) });
    ab.d("MicroMsg.BrandService.BrandServiceMgr", "init time: %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l1) });
    AppMethodBeat.o(13830);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    int i = 0;
    AppMethodBeat.i(13832);
    ab.w("MicroMsg.BrandService.BrandServiceMgr", "on scene end code(%d, %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
      AppMethodBeat.o(13832);
    while (true)
    {
      return;
      if (paramm.getType() != 387)
        break label306;
      paramString = ((e)paramm).jKy;
      if (paramString == null)
      {
        ab.e("MicroMsg.BrandService.BrandServiceMgr", "nameList is null.");
        AppMethodBeat.o(13832);
      }
      else
      {
        if ((this.jKw != null) && (this.jKx != null))
          break;
        ab.e("MicroMsg.BrandService.BrandServiceMgr", "enterpriseItemList or subscribeAndServiceItemList is null.");
        AppMethodBeat.o(13832);
      }
    }
    if (paramString.size() != this.jKw.size() + this.jKx.size())
      paramInt1 = 1;
    label306: label315: 
    while (true)
    {
      if (paramInt1 != 0)
      {
        init();
        paramString = this.jKu.iterator();
        while (true)
          if (paramString.hasNext())
          {
            ((c.a)paramString.next()).aVU();
            continue;
            paramm = this.jKw.iterator();
            do
            {
              paramInt1 = i;
              if (!paramm.hasNext())
                break;
              localObject = (lk)paramm.next();
            }
            while ((localObject != null) && (paramString.contains(((lk)localObject).userName)));
            paramInt1 = 1;
            if (paramInt1 != 0)
              break label315;
            Object localObject = this.jKx.iterator();
            do
            {
              if (!((Iterator)localObject).hasNext())
                break;
              paramm = (lk)((Iterator)localObject).next();
            }
            while ((paramm != null) && (paramString.contains(paramm.userName)));
            paramInt1 = 1;
            break;
          }
      }
      AppMethodBeat.o(13832);
      break;
    }
  }

  public final List<lk> rY(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 2:
    }
    for (List localList = this.jKx; ; localList = this.jKw)
      return localList;
  }

  public final void release()
  {
    AppMethodBeat.i(13831);
    g.Rg().b(387, this);
    if (this.jKv)
    {
      ArrayList localArrayList = new ArrayList(this.jKw.size() + this.jKx.size());
      Iterator localIterator = this.jKw.iterator();
      while (localIterator.hasNext())
        localArrayList.add((lk)localIterator.next());
      localIterator = this.jKx.iterator();
      while (localIterator.hasNext())
        localArrayList.add((lk)localIterator.next());
      g.Rg().a(new j(localArrayList), 0);
    }
    AppMethodBeat.o(13831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.c
 * JD-Core Version:    0.6.2
 */