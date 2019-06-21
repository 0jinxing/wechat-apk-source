package com.tencent.mm.plugin.remittance.model;

import android.net.wifi.WifiInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.protobuf.abv;
import com.tencent.mm.protocal.protobuf.lu;
import com.tencent.mm.protocal.protobuf.lv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.net.URLDecoder;

public final class i extends m
  implements k, com.tencent.mm.wallet_core.c.i
{
  private f ehi;
  public b gme;
  public lv pOT;
  public String pOU;
  public fw pOV;

  public i(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, String paramString5, String paramString6, int paramInt4, int paramInt5, String paramString7, abv paramabv, String paramString8, int paramInt6, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(44738);
    this.pOV = null;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new lu();
    ((b.a)localObject1).fsK = new lv();
    ((b.a)localObject1).fsI = 1633;
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/busif2fplaceorder";
    ((b.a)localObject1).fsL = 0;
    ((b.a)localObject1).fsM = 0;
    Object localObject2 = com.tencent.mm.plugin.soter.d.d.cvQ();
    String str = ((com.tencent.mm.plugin.soter.d.e)localObject2).rOh;
    localObject2 = ((com.tencent.mm.plugin.soter.d.e)localObject2).jSY;
    this.pOU = paramString9;
    this.gme = ((b.a)localObject1).acD();
    localObject1 = (lu)this.gme.fsG.fsP;
    ((lu)localObject1).pPZ = paramString1;
    ((lu)localObject1).vPp = URLDecoder.decode(paramString2);
    ((lu)localObject1).scene = paramInt1;
    ((lu)localObject1).vPq = paramString3;
    ((lu)localObject1).pPT = paramString4;
    ((lu)localObject1).vFg = paramInt2;
    ((lu)localObject1).cIb = paramInt3;
    ((lu)localObject1).pPU = paramString5;
    ((lu)localObject1).pQa = paramString6;
    ((lu)localObject1).pPY = paramInt4;
    ((lu)localObject1).vPx = paramString13;
    ((lu)localObject1).vPz = paramInt8;
    ((lu)localObject1).vFf = paramString7;
    if (paramabv != null)
      ((lu)localObject1).vFe = paramabv;
    ((lu)localObject1).vPj = paramString8;
    ((lu)localObject1).pOA = paramInt6;
    if (paramInt5 == 1)
    {
      paramString1 = at.getWifiInfo(ah.getContext());
      if (paramString1 == null)
        break label451;
      ((lu)localObject1).vPr = paramString1.getBSSID();
    }
    while (true)
    {
      ((lu)localObject1).vPs = 0;
      ((lu)localObject1).rOh = str;
      ((lu)localObject1).jSY = ((String)localObject2);
      ((lu)localObject1).vPu = r.cPI().cQk();
      g.K(l.class);
      ((lu)localObject1).vPt = false;
      ((lu)localObject1).vPv = paramString9;
      ((lu)localObject1).pPW = paramString10;
      ((lu)localObject1).nickname = paramString11;
      ((lu)localObject1).vPy = paramInt7;
      ((lu)localObject1).pPw = paramString12;
      ab.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "dycodeurl: %s", new Object[] { paramString9 });
      ab.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "NetSceneBusiF2fPlaceOrder, scene: %s, channel: %s, total: %s, qrcode: %s, getPayWifi: %s favor_compose_info %s dynamicCodeUrl %s cancel_f2fid:%s cancel_reason:%s unpayType:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt3), Integer.valueOf(paramInt2), paramString2, Integer.valueOf(paramInt5), a.a(paramabv), paramString9, paramString13, Integer.valueOf(paramInt8), Integer.valueOf(paramInt7) });
      AppMethodBeat.o(44738);
      return;
      label451: ab.w("MicroMsg.NetSceneBusiF2fPlaceOrder", "wifi info is null");
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(44739);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44739);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44740);
    ab.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pOT = ((lv)((b)paramq).fsH.fsP);
    paramArrayOfByte = new StringBuffer();
    paramArrayOfByte.append(String.format("trans_id: %s,", new Object[] { this.pOT.vFc }));
    paramArrayOfByte.append(String.format("zero_pay_flag: %s,", new Object[] { Integer.valueOf(this.pOT.vPF) }));
    paramArrayOfByte.append(String.format("can_use_fingerprint: %s,", new Object[] { Integer.valueOf(this.pOT.vPL) }));
    paramArrayOfByte.append(String.format("payer_need_auth_flag: %s,", new Object[] { Integer.valueOf(this.pOT.vPG) }));
    paramq = new com.tencent.mm.wallet_core.c.d(paramInt2, paramInt3, paramString);
    com.tencent.mm.wallet_core.c.q.a(paramInt2, paramInt3, paramString, paramq);
    ab.i("MicroMsg.NetSceneBusiF2fPlaceOrder", "ret_code: %s, ret_msg: %s trans_id: %s f2f_id: %s re_getfavor: %s payok_checksign: %s reqKey %s ret:%s", new Object[] { Integer.valueOf(this.pOT.kdT), this.pOT.kdU, this.pOT.vFc, this.pOT.vFb, Integer.valueOf(this.pOT.vPE), this.pOT.vFd, this.pOT.cBT, paramArrayOfByte.toString() });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramq.errType, paramq.errCode, paramq.aIm, this);
    AppMethodBeat.o(44740);
  }

  public final int getType()
  {
    return 1633;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.i
 * JD-Core Version:    0.6.2
 */