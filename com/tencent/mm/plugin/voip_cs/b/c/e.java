package com.tencent.mm.plugin.voip_cs.b.c;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.voip.model.p;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip.video.i;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.b.d;
import com.tencent.mm.protocal.protobuf.coy;
import com.tencent.mm.protocal.protobuf.coz;
import com.tencent.mm.protocal.protobuf.cpa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class e extends m
  implements k
{
  public b ehh;
  private f ehi;

  public e(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(135383);
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new coz();
    ((b.a)localObject1).fsK = new cpa();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/csvoipreport";
    ((b.a)localObject1).fsI = 312;
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (coz)this.ehh.fsG.fsP;
    ((coz)localObject1).xeF = paramLong1;
    ((coz)localObject1).wen = paramLong2;
    Object localObject2 = ((coz)localObject1).xmJ;
    Object localObject3 = c.cMg();
    Object localObject4 = new coy();
    ((coy)localObject4).jCt = 1;
    ((coy)localObject4).xmI = ((d)localObject3).nxW;
    ab.i("MicroMsg.VoipCSReportHelper", "getVoipCSChannelReportData, result: %s", new Object[] { ((coy)localObject4).xmI });
    ((LinkedList)localObject2).add(localObject4);
    ((coz)localObject1).xmJ.add(c.cMg().cMj());
    localObject2 = ((coz)localObject1).xmJ;
    d locald = c.cMg();
    localObject3 = new coy();
    ((coy)localObject3).jCt = 3;
    locald.sUr = g.KK().Lb();
    locald.GW(com.tencent.mm.plugin.voip_cs.b.a.a.cMn().sTj.cLN());
    int i = locald.cpuFlag0 & 0xFF;
    locald.sVG = i;
    locald.sVG = i;
    locald.tds = c.cMe().tew.field_audioDuration;
    locald.tdt = c.cMe().tew.field_videoDuration;
    if ((locald.tcW != 1) && (locald.tdE != 1))
    {
      locald.tdk = 1;
      locald.tdd = com.tencent.mm.plugin.voip.a.a.getNetType(ah.getContext());
      localObject4 = c.cMe().tew;
      ((v2protocal)localObject4).setJNIAppCmd(1, ((v2protocal)localObject4).sVq, ((v2protocal)localObject4).sVq.length);
      i = (int)(v2protocal.bt(((v2protocal)localObject4).sVq) / 1000L);
      if ((locald.tdz == 0) || (i <= locald.tdz))
        break label1623;
      i -= locald.tdz;
      label406: locald.tdr = i;
      ((coy)localObject3).xmI = (locald.sUl + "," + locald.tda + "," + locald.nwv + "," + locald.tdb + "," + locald.tdc + "," + locald.sTX + "," + locald.tdd + "," + locald.tde + "," + locald.tdf + "," + locald.tdg + "," + locald.sUr + "," + locald.sUq + "," + locald.tdh + "," + locald.tdi + "," + locald.tdj + "," + locald.tdk + "," + locald.tdl + "," + locald.tdm + "," + locald.tdn + "," + locald.tdo + "," + locald.tdp + "," + locald.tdq + "," + locald.tdr + "," + locald.nxM + "," + locald.tds + "," + locald.tdt + "," + locald.channelStrategy + "," + locald.sVG + "," + locald.sUs + "," + locald.tdu + "," + locald.tdv + "," + locald.tdw + "," + locald.deviceModel + "," + locald.tdx + "," + locald.tdy);
      ab.i("MicroMsg.VoipCSReportHelper", "getVoipCSClientReportData, result: %s", new Object[] { ((coy)localObject3).xmI });
      ((LinkedList)localObject2).add(localObject3);
      localObject4 = ((coz)localObject1).xmJ;
      localObject1 = c.cMg();
      localObject3 = new coy();
      ((coy)localObject3).jCt = 4;
      ((d)localObject1).networkType = d.getNetType(ah.getContext());
      localObject2 = ((TelephonyManager)ah.getContext().getSystemService("phone")).getSimOperator();
      if (localObject2 == null)
        break label1663;
      if ((!((String)localObject2).equals("46000")) && (!((String)localObject2).equals("46002")) && (!((String)localObject2).equals("46007")))
        break label1629;
      i = 1;
      label1003: ((d)localObject1).tcX = i;
      ((d)localObject1).tcO = ((int)(System.currentTimeMillis() / 1000L));
      ((d)localObject1).tcY = d.cMk();
      ((d)localObject1).sUr = g.KK().Lb();
      localObject2 = p.cJR();
      if (((p)localObject2).sSG == 0)
        break label1669;
      i = ((p)localObject2).sSF / ((p)localObject2).sSG;
      label1068: ((d)localObject1).tcZ = i;
      if (((d)localObject1).tcZ == -1)
      {
        localObject2 = new byte[4];
        if (c.cMe().tew.setAppCmd(10, (byte[])localObject2, 4) >= 0)
          break label1675;
        ((d)localObject1).tcZ = 0;
        ab.d("MicroMsg.VoipCSReportHelper", "get netStatus failed");
      }
    }
    while (true)
    {
      ab.i("MicroMsg.VoipCSReportHelper", "getVoipCSThirdPartData Report dataType=%d, dataTime=%s, isClickClose=%d, clickCloseTime=%s, videoFps=%d, videoRate=%d, cameraPixelWidth=%d, cameraPixelHeight=%d, recordPixelWidth=%d, recordPixelHeight=%d, cameraState=%d, networkType=%s, mobileType=%s, mobileNetworkType=%s, networkQuality=%d", new Object[] { Integer.valueOf(((d)localObject1).dataType), Integer.valueOf(((d)localObject1).tcO), Integer.valueOf(((d)localObject1).tcP), Integer.valueOf(((d)localObject1).tcQ), Integer.valueOf(((d)localObject1).videoFps), Integer.valueOf(((d)localObject1).tcR), Integer.valueOf(((d)localObject1).tcS), Integer.valueOf(((d)localObject1).tcT), Integer.valueOf(((d)localObject1).tcU), Integer.valueOf(((d)localObject1).tcV), Integer.valueOf(((d)localObject1).tcW), Integer.valueOf(((d)localObject1).networkType), Integer.valueOf(((d)localObject1).tcX), Integer.valueOf(((d)localObject1).tcY), Integer.valueOf(((d)localObject1).tcZ) });
      ((coy)localObject3).xmI = (((d)localObject1).dataType + "," + ((d)localObject1).tcO + "," + ((d)localObject1).tcP + "," + ((d)localObject1).tcQ + "," + ((d)localObject1).videoFps + "," + ((d)localObject1).tcR + "," + ((d)localObject1).tcS + "," + ((d)localObject1).tcT + "," + ((d)localObject1).tcU + "," + ((d)localObject1).tcV + "," + ((d)localObject1).tcW + "," + ((d)localObject1).networkType + "," + ((d)localObject1).tcX + "," + ((d)localObject1).tcY + "," + ((d)localObject1).tcZ + "," + ((d)localObject1).tda + "," + ((d)localObject1).nwv);
      ab.d("MicroMsg.VoipCSReportHelper", "getVoipCSThirdPartData, result: " + ((coy)localObject3).xmI);
      ((LinkedList)localObject4).add(localObject3);
      AppMethodBeat.o(135383);
      return;
      if (locald.tcW != 1)
      {
        locald.tdk = 2;
        break;
      }
      if (locald.tdE != 1)
      {
        locald.tdk = 3;
        break;
      }
      locald.tdk = 0;
      break;
      label1623: i = 0;
      break label406;
      label1629: if (((String)localObject2).equals("46001"))
      {
        i = 3;
        break label1003;
      }
      if (((String)localObject2).equals("46003"))
      {
        i = 2;
        break label1003;
      }
      label1663: i = 0;
      break label1003;
      label1669: i = -1;
      break label1068;
      label1675: ((d)localObject1).tcZ = bo.bf((byte[])localObject2);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(135385);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(135385);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(135384);
    ab.i("MicroMsg.NetSceneVoipCSReport", "onGYNetEnd, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(135384);
  }

  public final int getType()
  {
    return 312;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.b.c.e
 * JD-Core Version:    0.6.2
 */