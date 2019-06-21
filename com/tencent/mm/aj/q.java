package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bh;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.protocal.protobuf.bxk;
import com.tencent.mm.protocal.protobuf.byj;
import com.tencent.mm.protocal.protobuf.cwc;
import com.tencent.mm.protocal.protobuf.sm;
import com.tencent.mm.protocal.protobuf.sn;
import com.tencent.mm.protocal.protobuf.so;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.s;
import java.util.LinkedList;

public final class q extends m
  implements k
{
  private b ehh;
  private f ehi;

  public q(String paramString1, int paramInt1, String paramString2, LinkedList<sm> paramLinkedList, int paramInt2, bxk parambxk, byj parambyj)
  {
    AppMethodBeat.i(11435);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new sn();
    ((b.a)localObject).fsK = new so();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/clickcommand";
    ((b.a)localObject).fsI = 359;
    ((b.a)localObject).fsL = 176;
    ((b.a)localObject).fsM = 1000000176;
    this.ehh = ((b.a)localObject).acD();
    localObject = (sn)this.ehh.fsG.fsP;
    ((sn)localObject).vZW = paramInt1;
    ((sn)localObject).vZX = paramString2;
    ((sn)localObject).vMR = paramString1;
    ((sn)localObject).vEG = bh.aae();
    ((sn)localObject).scene = paramInt2;
    ((sn)localObject).vZZ = s.getSessionId();
    if (paramLinkedList != null)
      ((sn)localObject).vZY = paramLinkedList;
    if (parambxk != null)
    {
      ((sn)localObject).waa = parambxk;
      ab.d("MicroMsg.NetSceneBizClickCommand", "SessionStat StayDuration=%d, UnreadCount=%d, UnreadDuration=%d, IndexInSessionList=%d, LatestMsgType=%d, MassSendUnreadCount=%d, TemplateUnreadCount=%d", new Object[] { Integer.valueOf(parambxk.wXr), Integer.valueOf(parambxk.wXt), Integer.valueOf(parambxk.wXs), Integer.valueOf(parambxk.wXv), Integer.valueOf(parambxk.wXu), Integer.valueOf(parambxk.wXw), Integer.valueOf(parambxk.wXx) });
    }
    if (parambyj != null)
    {
      ((sn)localObject).wab = parambyj;
      ab.d("MicroMsg.NetSceneBizClickCommand", "settingPageInfo Scene=%d, IsServiceWuRaoOpen=%d", new Object[] { Integer.valueOf(parambyj.Scene), Integer.valueOf(parambyj.wXG) });
    }
    ab.i("MicroMsg.NetSceneBizClickCommand", "click command : %s, type: %s, info: %s, MsgSource : %s, MsgReport size %d, scene %d", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2, ((sn)localObject).vEG, Integer.valueOf(((sn)localObject).vZY.size()), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(11435);
  }

  public q(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, (byte)0);
  }

  private q(String paramString1, String paramString2, byte paramByte)
  {
    this(paramString1, 1, paramString2, null, 0, null, null);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11437);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11437);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11436);
    so localso;
    Object localObject1;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = (sn)this.ehh.fsG.fsP;
      localso = (so)this.ehh.fsH.fsP;
      if ((paramArrayOfByte.vZW == 10) && (paramArrayOfByte.vMR != null) && (localso.wac != null) && (((j)g.K(j.class)).XR().aoZ(paramArrayOfByte.vMR) != null))
      {
        localObject1 = localso.wac;
        paramq = paramArrayOfByte.vMR;
        if ((localObject1 != null) && (!bo.isNullOrNil(((cwc)localObject1).xrZ)) && (!bo.isNullOrNil(((cwc)localObject1).xrY)))
          break label195;
        ab.w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg tips is null");
      }
    }
    while (true)
    {
      if (localso.wac != null)
        ab.d("MicroMsg.NetSceneBizClickCommand", "onGYNetEnd ClickType=%d", new Object[] { Integer.valueOf(paramArrayOfByte.vZW) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(11436);
      return;
      label195: if (((cwc)localObject1).xrX != 1)
      {
        ab.w("MicroMsg.NetSceneBizClickCommand", "insertReportLocationMsg %d", new Object[] { Integer.valueOf(((cwc)localObject1).xrX) });
      }
      else
      {
        Object localObject2 = ((cwc)localObject1).xrY;
        String str = ((cwc)localObject1).xrZ;
        localObject1 = new StringBuffer();
        ((StringBuffer)localObject1).append("<sysmsg type=\"biz_services_mute\">");
        ((StringBuffer)localObject1).append("<biz_services_mute>");
        ((StringBuffer)localObject1).append("<text><![CDATA[").append((String)localObject2).append("]]></text>");
        ((StringBuffer)localObject1).append("<link>");
        ((StringBuffer)localObject1).append("<scene>biz_services_mute</scene>");
        ((StringBuffer)localObject1).append("<text><![CDATA[").append(str).append("]]></text>");
        ((StringBuffer)localObject1).append("</link>");
        ((StringBuffer)localObject1).append("</biz_services_mute>");
        ((StringBuffer)localObject1).append("</sysmsg>");
        localObject2 = new bi();
        ((bi)localObject2).ju(paramq);
        ((bi)localObject2).hO(2);
        ((bi)localObject2).setType(10002);
        ((bi)localObject2).eJ(bf.aaa());
        ((bi)localObject2).setContent(((StringBuffer)localObject1).toString());
        bf.l((bi)localObject2);
      }
    }
  }

  public final int getType()
  {
    return 359;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.q
 * JD-Core Version:    0.6.2
 */