package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ot;
import com.tencent.mm.protocal.protobuf.ou;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;
import java.net.URLDecoder;

public final class m extends p
{
  private final String TAG;
  public ou pPb;

  public m(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    AppMethodBeat.i(44750);
    this.TAG = "MicroMsg.NetSceneF2fDynamicCode";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ot();
    ((b.a)localObject).fsK = new ou();
    ((b.a)localObject).fsI = 2736;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/f2fdynamiccode";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ot)this.ehh.fsG.fsP;
    ((ot)localObject).nUf = paramInt;
    ((ot)localObject).kfT = paramString1;
    ((ot)localObject).pPZ = paramString2;
    ((ot)localObject).vVT = URLDecoder.decode(paramString3);
    ((ot)localObject).pPH = paramString4;
    ((ot)localObject).pPI = paramString5;
    ((ot)localObject).pQc = paramString6;
    ((ot)localObject).nickname = paramString7;
    ((ot)localObject).pPw = paramString8;
    ab.i("MicroMsg.NetSceneF2fDynamicCode", "amount: %s, username: %s, transfer_code_id: %s", new Object[] { Integer.valueOf(paramInt), paramString1, URLDecoder.decode(paramString3) });
    AppMethodBeat.o(44750);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44751);
    ab.i("MicroMsg.NetSceneF2fDynamicCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pPb = ((ou)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneF2fDynamicCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pPb.kCl), this.pPb.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44751);
  }

  public final void f(q paramq)
  {
    paramq = (ou)((b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 2736;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.m
 * JD-Core Version:    0.6.2
 */