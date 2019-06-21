package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.chl;
import com.tencent.mm.protocal.protobuf.cz;
import com.tencent.mm.protocal.protobuf.ma;
import com.tencent.mm.protocal.protobuf.mb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.d.d;

public final class l extends m
  implements k, i, d
{
  public String czZ;
  private f ehi;
  private b gme;
  public boolean lSR;
  public mb pOY;
  public boolean pOZ;
  private ma pPa;

  public l(chl paramchl, cz paramcz, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(44747);
    this.lSR = false;
    this.pOZ = false;
    b.a locala = new b.a();
    locala.fsJ = new ma();
    locala.fsK = new mb();
    locala.fsI = 2682;
    locala.uri = "/cgi-bin/mmpay-bin/busif2fzerocallback";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.pPa = ((ma)this.gme.fsG.fsP);
    this.pPa.vPn = paramcz;
    this.pPa.vPH = paramchl;
    this.pPa.vPI = paramString1;
    this.pPa.vPV = paramInt;
    this.pPa.token = paramString2;
    this.czZ = paramString3;
    ab.i("MicroMsg.NetSceneBusiF2fZeroCallback", "NetSceneBusiF2fZeroCallback, token %s AfterPlaceOrderCommReq %s zero_pay_extend: %s", new Object[] { paramString2, a.a(paramcz), paramString1 });
    AppMethodBeat.o(44747);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44748);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44748);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44749);
    ab.i("MicroMsg.NetSceneBusiF2fZeroCallback", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pOY = ((mb)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBusiF2fZeroCallback", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pOY.kdT), this.pOY.kdU });
    if (this.ehi != null)
      if (this.pOY.vPW != 1)
        break label134;
    label134: for (boolean bool = true; ; bool = false)
    {
      this.lSR = bool;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(44749);
      return;
    }
  }

  public final boolean cfp()
  {
    return this.pOZ;
  }

  public final int getType()
  {
    return 2682;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.l
 * JD-Core Version:    0.6.2
 */