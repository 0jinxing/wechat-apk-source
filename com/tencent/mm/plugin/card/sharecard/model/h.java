package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.plugin.card.sharecard.a.a.2;
import com.tencent.mm.protocal.protobuf.byy;
import com.tencent.mm.protocal.protobuf.byz;
import com.tencent.mm.protocal.protobuf.bza;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;

public final class h extends m
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public h()
  {
    AppMethodBeat.i(88036);
    b.a locala = new b.a();
    locala.fsJ = new byz();
    locala.fsK = new bza();
    locala.uri = "/cgi-bin/micromsg-bin/sharecardsync";
    locala.fsI = 906;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((byz)this.ehh.fsG.fsP).wYg = ((Long)g.RP().Ry().get(ac.a.xKs, Long.valueOf(0L))).longValue();
    AppMethodBeat.o(88036);
  }

  private static boolean b(byy parambyy)
  {
    AppMethodBeat.i(88039);
    boolean bool;
    if (parambyy == null)
    {
      ab.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, null cmd");
      AppMethodBeat.o(88039);
      bool = false;
      return bool;
    }
    ab.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, item card_id = %s, seq = %d", new Object[] { parambyy.cMC, Long.valueOf(parambyy.wYf) });
    while (true)
    {
      a locala;
      try
      {
        ab.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, Status = %d", new Object[] { Integer.valueOf(parambyy.kfy) });
        switch (parambyy.kfy)
        {
        default:
          ab.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(parambyy.kfy) });
          AppMethodBeat.o(88039);
          bool = false;
          break;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 7:
          am.bbd().a(parambyy);
          if ((parambyy.kfy != 0) && (parambyy.kfy != 5))
          {
            localObject = (String)g.RP().Ry().get(ac.a.xKA, "");
            bool = ((Boolean)g.RP().Ry().get(ac.a.xKB, Boolean.FALSE)).booleanValue();
            if ((!bool) || (bo.isNullOrNil((String)localObject)) || (!((String)localObject).equals(parambyy.cMC)))
              break label385;
            ab.i("MicroMsg.NetSceneShareCardSync", "need check is true, do clearRedDotAndWording()");
            com.tencent.mm.plugin.card.b.k.baK();
          }
          AppMethodBeat.o(88039);
          bool = true;
          break;
        case 6:
          locala = am.bbd();
          if (parambyy != null)
            break label306;
          ab.e("MicroMsg.ShareCardBatchGetCardMgr", "delete item is  null");
          continue;
        }
      }
      catch (Exception parambyy)
      {
        ab.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, ex = %s", new Object[] { parambyy.getMessage() });
        AppMethodBeat.o(88039);
        bool = false;
      }
      break;
      label306: ShareCardInfo localShareCardInfo = am.bbe().GK(parambyy.cMC);
      am.bbe().GJ(parambyy.cMC);
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("delete share card for id ");
      ab.i("MicroMsg.ShareCardBatchGetCardMgr", parambyy.cMC);
      if (localShareCardInfo != null)
        com.tencent.mm.plugin.card.sharecard.a.b.a(ah.getContext(), localShareCardInfo);
      while (true)
      {
        locala.aVU();
        break;
        ab.e("MicroMsg.ShareCardBatchGetCardMgr", "info is null");
      }
      label385: if (bool)
        ab.i("MicroMsg.NetSceneShareCardSync", "need check is true, but card id is diff!");
      else
        ab.i("MicroMsg.NetSceneShareCardSync", "need check is false");
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(88037);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88037);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q arg5, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88038);
    ab.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(906), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(88038);
      return;
    }
    paramArrayOfByte = (bza)this.ehh.fsH.fsP;
    if (paramArrayOfByte.fjr == null)
    {
      ??? = null;
      label122: if (??? != null)
        break label238;
      paramInt1 = 0;
      label129: ab.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card cmd list size = %d, continueFlag = %d, req = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramArrayOfByte.wYh), Long.valueOf(paramArrayOfByte.wYf) });
      if ((??? == null) || (???.size() <= 0))
        break label382;
      paramInt1 = 0;
      ??? = ???.iterator();
      label196: if (!???.hasNext())
        break label249;
      if (b((byy)???.next()))
        break label474;
      paramInt1++;
    }
    label474: 
    while (true)
    {
      break label196;
      ??? = paramArrayOfByte.fjr;
      break label122;
      label238: paramInt1 = ???.size();
      break label129;
      label249: ab.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, %d fail share cmds", new Object[] { Integer.valueOf(paramInt1) });
      am.bbd().bai();
      while (true)
      {
        g.RP().Ry().set(ac.a.xKs, Long.valueOf(paramArrayOfByte.wYf));
        am.bbd().kfq = paramArrayOfByte.kfq;
        if (paramArrayOfByte.wYh > 0)
        {
          ab.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.wYh) });
          ??? = am.bbd();
          ???.mHandler.post(new a.2(???));
        }
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(88038);
        break;
        label382: ab.i("MicroMsg.NetSceneShareCardSync", "share cmdList == null or size is 0");
        a locala = am.bbd();
        ab.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr sharecardsync retryAll, getNow = %b", new Object[] { Boolean.TRUE });
        synchronized (locala.eMl)
        {
          locala.kaA.addAll(locala.kaB);
          locala.kaB.clear();
          locala.bai();
        }
      }
    }
  }

  public final int getType()
  {
    return 906;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.h
 * JD-Core Version:    0.6.2
 */