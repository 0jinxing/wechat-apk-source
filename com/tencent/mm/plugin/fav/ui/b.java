package com.tencent.mm.plugin.fav.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.al;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.bca;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public static void B(com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(73921);
    paramg.field_updateTime = System.currentTimeMillis();
    if (!com.tencent.mm.plugin.fav.a.b.k(paramg))
      paramg.field_localId = System.currentTimeMillis();
    C(paramg);
    com.tencent.mm.plugin.fav.a.b.j(paramg);
    AppMethodBeat.o(73921);
  }

  private static void C(com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(73922);
    h.iw(paramg.field_localId);
    if (paramg.field_favProto.wiv.size() > 0)
    {
      d.post(new b.a(paramg), "AddFavService_copy");
      AppMethodBeat.o(73922);
      return;
    }
    paramg.field_itemStatus = 9;
    if (!com.tencent.mm.plugin.fav.a.b.k(paramg))
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().y(paramg);
    while (true)
    {
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getSendService().run();
      AppMethodBeat.o(73922);
      break;
      ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().a(paramg, new String[0]);
    }
  }

  private static boolean D(com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(73924);
    boolean bool;
    if ((paramg.field_sourceId == null) || (paramg.field_sourceId.equals("")))
    {
      AppMethodBeat.o(73924);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramg = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().LS(paramg.field_sourceId);
      if ((paramg != null) && (paramg.field_id > 0))
        vB(paramg.field_id);
      if (paramg != null)
      {
        bool = true;
        AppMethodBeat.o(73924);
      }
      else
      {
        AppMethodBeat.o(73924);
        bool = false;
      }
    }
  }

  public static boolean a(cl paramcl)
  {
    AppMethodBeat.i(73919);
    aar localaar;
    boolean bool;
    if ((paramcl.cvA.cvC != null) && (paramcl.cvA.cvC.wiv != null))
    {
      paramcl = paramcl.cvA.cvC.wiv.iterator();
      while (true)
        if (paramcl.hasNext())
        {
          localaar = (aar)paramcl.next();
          int i = localaar.dataType;
          if (((i == 2) || (i == 4) || (i == 15) || (i == 8)) && (bo.isNullOrNil(localaar.wfZ)))
            if (bo.isNullOrNil(localaar.wgx))
            {
              AppMethodBeat.o(73919);
              bool = false;
            }
        }
    }
    while (true)
    {
      return bool;
      if (e.ct(localaar.wgx))
        break;
      AppMethodBeat.o(73919);
      bool = false;
      continue;
      bool = true;
      AppMethodBeat.o(73919);
    }
  }

  static int b(cl paramcl)
  {
    AppMethodBeat.i(73920);
    com.tencent.mm.plugin.fav.a.g localg = new com.tencent.mm.plugin.fav.a.g();
    localg.field_favProto = paramcl.cvA.cvC;
    localg.field_sessionId = paramcl.cvA.cvF;
    if (!b(localg, paramcl.cvA.cvH))
    {
      paramcl = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().LS(localg.field_sourceId);
      if (paramcl != null)
        com.tencent.mm.plugin.fav.a.b.it(paramcl.field_localId);
      AppMethodBeat.o(73920);
      return 0;
    }
    localg.field_flag = 0;
    localg.field_updateTime = System.currentTimeMillis();
    localg.field_localId = System.currentTimeMillis();
    com.tencent.mm.plugin.fav.a.b.it(localg.field_localId);
    localg.field_type = paramcl.cvA.type;
    if ((paramcl.cvA.desc != null) && (paramcl.cvA.desc.length() >= 10001))
    {
      ab.w("MicroMsg.Fav.FavAddService", "length more than 10000, do cut desc");
      localg.field_favProto.alC(paramcl.cvA.desc.substring(0, 10001));
    }
    while (true)
    {
      localg.field_xml = com.tencent.mm.plugin.fav.a.g.s(localg);
      C(localg);
      com.tencent.mm.plugin.fav.a.b.j(localg);
      localg.LI("MicroMsg.Fav.FavAddService");
      AppMethodBeat.o(73920);
      break;
      localg.field_favProto.alC(paramcl.cvA.desc);
    }
  }

  private static boolean b(com.tencent.mm.plugin.fav.a.g paramg, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(73923);
    abl localabl = paramg.field_favProto.wit;
    if (localabl != null)
    {
      paramg.field_sourceId = localabl.wiC;
      if (D(paramg))
      {
        ab.w("MicroMsg.Fav.FavAddService", "handleEvent, msg already exist, do not insert");
        AppMethodBeat.o(73923);
        return bool;
      }
      switch (localabl.cvp)
      {
      case 2:
      default:
        paramg.field_sourceType = localabl.cvp;
      case 1:
      case 3:
      }
    }
    while (true)
    {
      paramg.field_fromUser = localabl.cEV;
      paramg.field_toUser = localabl.toUser;
      paramg.field_sourceId = localabl.wiC;
      paramg.field_sourceCreateTime = localabl.createTime;
      ab.i("MicroMsg.Fav.FavAddService", "deal with source item, fromUser is %s, toUser %s, sourceId %s, sourceType %d", new Object[] { paramg.field_fromUser, paramg.field_toUser, paramg.field_sourceId, Integer.valueOf(paramg.field_sourceType) });
      AppMethodBeat.o(73923);
      bool = true;
      break;
      if (t.mZ(paramg.field_fromUser))
      {
        paramg.field_sourceType = 23;
      }
      else if (t.kH(paramg.field_fromUser))
      {
        paramg.field_sourceType = 22;
      }
      else
      {
        paramg.field_sourceType = 21;
        continue;
        if (paramInt == 1)
          paramg.field_sourceType = 24;
        else if (paramInt == 2)
          paramg.field_sourceType = 25;
        else if (paramInt == 3)
          paramg.field_sourceType = 26;
        else
          paramg.field_sourceType = localabl.cvp;
      }
    }
  }

  private static void vB(int paramInt)
  {
    AppMethodBeat.i(73925);
    if (paramInt <= 0)
    {
      ab.e("MicroMsg.Fav.FavAddService", "modUpdateTime favId illegal:%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(73925);
    }
    while (true)
    {
      return;
      Object localObject = new LinkedList();
      bca localbca = new bca();
      localbca.wGC = 1;
      localbca.wGD = ((int)(System.currentTimeMillis() / 1000L));
      ((LinkedList)localObject).add(localbca);
      localObject = new al(paramInt, (LinkedList)localObject, null);
      com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
      AppMethodBeat.o(73925);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.b
 * JD-Core Version:    0.6.2
 */