package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.s;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.s.a.a.a;
import com.tencent.mm.protocal.protobuf.azf;
import com.tencent.mm.protocal.protobuf.azg;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class an
  implements com.tencent.mm.ai.f, t
{
  private static an vcV;
  public String lang;
  public boolean vcW;
  public boolean vcX;
  private List<String> vcY;
  public long vcZ;
  private final int vda;
  private int vdb;
  public boolean vdc;
  private long vdd;

  private an()
  {
    AppMethodBeat.i(79397);
    this.vcW = false;
    this.vcX = false;
    this.vcY = new LinkedList();
    this.vda = 20;
    this.vdb = 0;
    this.vdc = false;
    AppMethodBeat.o(79397);
  }

  private static void a(f paramf, azg paramazg)
  {
    AppMethodBeat.i(79406);
    paramf.field_appName = paramazg.kKY;
    paramf.field_appName_en = paramazg.wDa;
    paramf.field_appName_tw = paramazg.wDb;
    paramf.field_appName_hk = paramazg.wDl;
    paramf.iu(paramazg.wDc);
    paramf.iv(paramazg.wDd);
    paramf.iw(paramazg.wDf);
    paramf.field_serviceAppInfoFlag = paramazg.wDe;
    paramf.field_serviceAppType = paramazg.kLb;
    paramf.hs(paramazg.wDg);
    paramf.field_serviceShowFlag = paramazg.wDh;
    AppMethodBeat.o(79406);
  }

  private static void a(i parami, List<String> paramList)
  {
    AppMethodBeat.i(79405);
    if ((parami == null) || (paramList == null) || (paramList.size() <= 0))
    {
      AppMethodBeat.o(79405);
      return;
    }
    ab.d("MicroMsg.SuggestionAppListLogic", "removeExpiredServiceApp");
    Object localObject = g.dhB();
    ab.i("MicroMsg.SuggestionAppListLogic", "oldList %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
    if (((List)localObject).size() > 0)
      localObject = ((List)localObject).iterator();
    label78: label206: 
    while (true)
    {
      f localf;
      if (((Iterator)localObject).hasNext())
      {
        localf = (f)((Iterator)localObject).next();
        if (localf.field_appId != null)
        {
          Iterator localIterator = paramList.iterator();
          String str;
          do
          {
            if (!localIterator.hasNext())
              break;
            str = (String)localIterator.next();
          }
          while (!localf.field_appId.equals(str));
        }
      }
      else
      {
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label206;
          boolean bool = parami.b(localf, new String[0]);
          ab.i("MicroMsg.SuggestionAppListLogic", "delete old service : %s, %s", new Object[] { localf.field_appId, Boolean.valueOf(bool) });
          break label78;
          AppMethodBeat.o(79405);
          break;
        }
      }
    }
  }

  private static void dZ(String paramString, int paramInt)
  {
    AppMethodBeat.i(79402);
    ab.i("MicroMsg.SuggestionAppListLogic", "get service app, offset = %d, lang = %s", new Object[] { Integer.valueOf(paramInt), paramString });
    paramString = new ad(paramInt, paramString);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(paramString, 0);
    AppMethodBeat.o(79402);
  }

  public static an dhQ()
  {
    AppMethodBeat.i(79398);
    if (vcV == null)
      vcV = new an();
    an localan = vcV;
    AppMethodBeat.o(79398);
    return localan;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    AppMethodBeat.i(79399);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(79399);
    while (true)
    {
      return;
      this.vcW = false;
      ab.d("MicroMsg.SuggestionAppListLogic", "Suggestion onSceneEnd errType=%s errCode=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramx == null)
      {
        ab.e("MicroMsg.SuggestionAppListLogic", "scene == null");
        AppMethodBeat.o(79399);
      }
      else
      {
        if ((paramInt1 == 0) && (paramInt2 == 0));
        switch (paramx.getType())
        {
        default:
          AppMethodBeat.o(79399);
          break;
        case 4:
          paramString = (ae)paramx;
          ab.d("MicroMsg.SuggestionAppListLogic", "get suggestion appList, AppCount = %s", new Object[] { Integer.valueOf(paramString.dhJ()) });
          paramString = paramString.vct;
          if ((paramString == null) || (paramString.size() <= 0))
          {
            ab.w("MicroMsg.SuggestionAppListLogic", "empty suggestAppList");
            AppMethodBeat.o(79399);
          }
          else
          {
            if ((ah.getContext() != null) && (a.a.bYQ() != null))
              break label196;
            ab.e("MicroMsg.SuggestionAppListLogic", "wrong environment");
            AppMethodBeat.o(79399);
          }
          break;
        }
      }
    }
    label196: Object localObject1 = new LinkedList();
    Object localObject2 = paramString.iterator();
    Object localObject3;
    if (((Iterator)localObject2).hasNext())
    {
      f localf = (f)((Iterator)localObject2).next();
      localObject3 = localf.field_appName;
      String str = localf.field_packageName;
      paramx = localf.field_signature;
      localObject4 = localf.dni;
      if (localf.dnh != null);
      for (boolean bool = true; ; bool = false)
      {
        ab.d("MicroMsg.SuggestionAppListLogic", "suggestion appName=%s, packageName=%s, signature [%s], introUrl [%s], has iconUrl [%s]", new Object[] { localObject3, str, paramx, localObject4, Boolean.valueOf(bool) });
        ((LinkedList)localObject1).add(localf.field_appId);
        break;
      }
    }
    a.a.bYQ().ah((LinkedList)localObject1);
    Object localObject4 = g.fJ(ah.getContext());
    if (((List)localObject4).size() > 0)
    {
      paramx = a.a.bYQ().bYO();
      localObject4 = ((List)localObject4).iterator();
    }
    label540: 
    while (true)
      if (((Iterator)localObject4).hasNext())
      {
        localObject1 = (f)((Iterator)localObject4).next();
        if (((f)localObject1).field_appId != null)
        {
          localObject3 = paramString.iterator();
          do
          {
            if (!((Iterator)localObject3).hasNext())
              break;
            localObject2 = (f)((Iterator)localObject3).next();
          }
          while ((((f)localObject2).field_appId == null) || (!((f)localObject1).field_appId.equals(((f)localObject2).field_appId)));
        }
      }
      else
      {
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if (paramInt1 != 0)
            break label540;
          if (g.a(ah.getContext(), (f)localObject1));
          for (((f)localObject1).field_status = 1; ; ((f)localObject1).field_status = 4)
          {
            paramx.a((f)localObject1, new String[0]);
            break;
          }
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().setLong(352275, System.currentTimeMillis());
          this.vcZ = System.currentTimeMillis();
          break;
        }
      }
  }

  public final void fL(Context paramContext)
  {
    AppMethodBeat.i(79400);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(79400);
    while (true)
    {
      return;
      if (paramContext == null)
      {
        AppMethodBeat.o(79400);
      }
      else if (this.vcX)
      {
        ab.d("MicroMsg.SuggestionAppListLogic", "ServiceAppInfo is loading, return");
        AppMethodBeat.o(79400);
      }
      else
      {
        this.vcX = true;
        if (System.currentTimeMillis() - this.vdd < 43200000L)
        {
          ab.d("MicroMsg.SuggestionAppListLogic", "getServiceAppInfo not now");
          this.vcX = false;
          AppMethodBeat.o(79400);
        }
        else
        {
          com.tencent.mm.kernel.g.RQ();
          this.vdd = com.tencent.mm.kernel.g.RP().Ry().Mm(352276);
          if (System.currentTimeMillis() - this.vdd < 43200000L)
          {
            ab.d("MicroMsg.SuggestionAppListLogic", "getServiceAppInfo not now pp");
            this.vcX = false;
            AppMethodBeat.o(79400);
          }
          else
          {
            if (this.lang == null)
              this.lang = aa.g(paramContext.getSharedPreferences(ah.doA(), 0));
            dZ(this.lang, this.vdb);
            AppMethodBeat.o(79400);
          }
        }
      }
    }
  }

  public final void fM(Context paramContext)
  {
    AppMethodBeat.i(79401);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(79401);
    while (true)
    {
      return;
      if (paramContext == null)
      {
        AppMethodBeat.o(79401);
      }
      else if (this.vcX)
      {
        ab.d("MicroMsg.SuggestionAppListLogic", "ServiceAppInfo is loading, return");
        AppMethodBeat.o(79401);
      }
      else
      {
        this.vcX = true;
        if (this.lang == null)
          this.lang = aa.g(paramContext.getSharedPreferences(ah.doA(), 0));
        ab.i("MicroMsg.SuggestionAppListLogic", "getServiceAppListImmediately");
        dZ(this.lang, this.vdb);
        AppMethodBeat.o(79401);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(79404);
    if (!com.tencent.mm.kernel.g.RK())
    {
      ab.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd account not ready");
      this.vdb = 0;
      this.vcY.clear();
      AppMethodBeat.o(79404);
    }
    while (true)
    {
      return;
      this.vcX = false;
      if (paramm == null)
      {
        ab.e("MicroMsg.SuggestionAppListLogic", "scene == null");
        this.vdb = 0;
        this.vcY.clear();
        AppMethodBeat.o(79404);
      }
      else if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        this.vdb = 0;
        this.vcY.clear();
        AppMethodBeat.o(79404);
      }
      else
      {
        ab.i("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        paramString = (ad)paramm;
        if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
        for (paramString = (azf)paramString.ehh.fsH.fsP; ; paramString = null)
        {
          if (paramString != null)
            break label252;
          ab.e("MicroMsg.SuggestionAppListLogic", "resp == null");
          this.vdb = 0;
          this.vcY.clear();
          AppMethodBeat.o(79404);
          break;
        }
        label252: if ((paramString.wCZ != null) && (paramString.wCZ.size() > 0))
          break;
        ab.e("MicroMsg.SuggestionAppListLogic", "Service_appinfo empty");
        a(a.a.bYQ().bYO(), this.vcY);
        this.vdb = 0;
        this.vcY.clear();
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().setLong(352276, System.currentTimeMillis());
        this.vdd = System.currentTimeMillis();
        AppMethodBeat.o(79404);
      }
    }
    ab.i("MicroMsg.SuggestionAppListLogic", "offset = %d, count = %s", new Object[] { Integer.valueOf(this.vdb), Integer.valueOf(paramString.wCZ.size()) });
    i locali = a.a.bYQ().bYO();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramString.wCZ.iterator();
    label643: label1451: 
    while (localIterator.hasNext())
    {
      azg localazg = (azg)localIterator.next();
      ab.i("MicroMsg.SuggestionAppListLogic", "service info: %s, %s, %s, %s, %s, %s", new Object[] { localazg.kKY, Integer.valueOf(localazg.kLb), Integer.valueOf(localazg.wDh), Integer.valueOf(localazg.wDg), Integer.valueOf(localazg.wDe), localazg.csB });
      if ((!bo.isNullOrNil(localazg.csB)) && (!bo.isNullOrNil(localazg.kKY)))
      {
        paramInt1 = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNQ, Integer.valueOf(0))).intValue();
        f localf;
        boolean bool;
        if (f.vbT.equals(localazg.csB))
        {
          localazg.wDe = (localazg.wDe ^ 0xFD ^ 0xFFFFFFFF);
          ab.d("MicroMsg.SuggestionAppListLogic", "aa change: %s", new Object[] { Integer.valueOf(localazg.wDe) });
          this.vcY.add(localazg.csB);
          localf = g.bT(localazg.csB, true);
          if (localf == null)
            break label1336;
          if (localf.field_serviceAppInfoFlag == localazg.wDe)
            break label1088;
          paramInt1 = 1;
          paramm = localf;
          if (paramInt1 != 0)
          {
            String str = localf.dnt;
            paramm = localf.dns;
            a(localf, localazg);
            bool = locali.a(localf, new String[0]);
            if (!bo.nullAsNil(str).equals(bo.nullAsNil(localazg.wDd)))
            {
              ab.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_list" + bo.nullAsNil(localazg.wDd));
              com.tencent.mm.plugin.s.a.bYH().dW(localf.field_appId, 5);
            }
            if (!bo.nullAsNil(paramm).equals(bo.nullAsNil(localazg.wDc)))
            {
              ab.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_panel" + bo.nullAsNil(localazg.wDc));
              com.tencent.mm.plugin.s.a.bYH().dW(localf.field_appId, 4);
            }
            ab.i("MicroMsg.SuggestionAppListLogic", "update app: AppID = %s, ret = %s", new Object[] { localazg.csB, Boolean.valueOf(bool) });
            paramm = localf;
          }
          label837: if (bo.isNullOrNil(paramm.field_openId))
            localLinkedList.add(localazg.csB);
          paramm = g.gJ(0, 3).iterator();
        }
        while (true)
        {
          if (!paramm.hasNext())
            break label1451;
          localf = (f)paramm.next();
          if (f.vbQ.equals(localf.field_appId))
          {
            ab.i("MicroMsg.SuggestionAppListLogic", "remittance: %s, %s", new Object[] { Integer.valueOf(localf.field_serviceShowFlag), Integer.valueOf(localf.field_appInfoFlag) });
            continue;
            if (f.vbS.equals(localazg.csB))
            {
              if (localazg.wDh > 0)
                break;
              if ((r.YI()) && (r.YG() == 0) && (paramInt1 == 1))
              {
                h.pYm.k(965L, 33L, 1L);
                break;
              }
              h.pYm.k(965L, 35L, 1L);
              break;
            }
            if ((!f.vbQ.equals(localazg.csB)) || (localazg.wDh > 0))
              break;
            if ((r.YI()) && (r.YG() == 0) && (paramInt1 == 1))
            {
              h.pYm.k(965L, 32L, 1L);
              break;
            }
            h.pYm.k(965L, 34L, 1L);
            break;
            label1088: if (localf.field_serviceAppType != localazg.kLb)
            {
              paramInt1 = 1;
              break label643;
            }
            if (localf.dnv != localazg.wDg)
            {
              paramInt1 = 1;
              break label643;
            }
            if (localf.field_serviceShowFlag != localazg.wDh)
            {
              paramInt1 = 1;
              break label643;
            }
            if (!bo.nullAsNil(localf.field_appName).equals(bo.nullAsNil(localazg.kKY)))
            {
              paramInt1 = 1;
              break label643;
            }
            if (!bo.nullAsNil(localf.field_appName_en).equals(bo.nullAsNil(localazg.wDa)))
            {
              paramInt1 = 1;
              break label643;
            }
            if (!bo.nullAsNil(localf.field_appName_tw).equals(bo.nullAsNil(localazg.wDb)))
            {
              paramInt1 = 1;
              break label643;
            }
            if (!bo.nullAsNil(localf.field_appName_hk).equals(bo.nullAsNil(localazg.wDl)))
            {
              paramInt1 = 1;
              break label643;
            }
            if (!bo.nullAsNil(localf.dnt).equals(bo.nullAsNil(localazg.wDd)))
            {
              paramInt1 = 1;
              break label643;
            }
            if (!bo.nullAsNil(localf.dns).equals(bo.nullAsNil(localazg.wDc)))
            {
              paramInt1 = 1;
              break label643;
            }
            if (!bo.nullAsNil(localf.dnu).equals(bo.nullAsNil(localazg.wDf)))
            {
              paramInt1 = 1;
              break label643;
            }
            paramInt1 = 0;
            break label643;
            label1336: paramm = new f();
            paramm.field_appId = localazg.csB;
            a(paramm, localazg);
            bool = locali.n(paramm);
            ab.i("MicroMsg.SuggestionAppListLogic", "insert app: AppID = %s, ret = %s", new Object[] { localazg.csB, Boolean.valueOf(bool) });
            break label837;
          }
          if (f.vbS.equals(localf.field_appId))
            ab.i("MicroMsg.SuggestionAppListLogic", "lucky: %s, %s", new Object[] { Integer.valueOf(localf.field_serviceShowFlag), Integer.valueOf(localf.field_appInfoFlag) });
        }
      }
    }
    if (localLinkedList.size() > 0)
    {
      ab.i("MicroMsg.SuggestionAppListLogic", "needGetOpenIdList %d", new Object[] { Integer.valueOf(localLinkedList.size()) });
      com.tencent.mm.plugin.s.a.bYL().addAll(localLinkedList);
    }
    if (paramString.wCZ.size() == 20)
    {
      this.vdb += 20;
      dZ(this.lang, this.vdb);
    }
    while (true)
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().setLong(352276, System.currentTimeMillis());
      this.vdd = System.currentTimeMillis();
      AppMethodBeat.o(79404);
      break;
      a(locali, this.vcY);
      this.vdb = 0;
      this.vcY.clear();
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(79403);
    ab.i("MicroMsg.SuggestionAppListLogic", "reset getServiceAppList");
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RP().Ry().setLong(352276, 0L);
    this.vdd = 0L;
    this.vdc = true;
    AppMethodBeat.o(79403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.an
 * JD-Core Version:    0.6.2
 */