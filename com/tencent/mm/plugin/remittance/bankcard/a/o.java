package com.tencent.mm.plugin.remittance.bankcard.a;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bss;
import com.tencent.mm.protocal.protobuf.bst;
import com.tencent.mm.protocal.protobuf.dc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.i;

public final class o extends b
  implements i
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public bst pLG;

  public o(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4, int paramInt3, int paramInt4, String paramString5, String paramString6, com.tencent.mm.bt.b paramb, int paramInt5)
  {
    AppMethodBeat.i(44482);
    this.TAG = "MicroMsg.NetSceneBankRemitRequestOrder";
    ab.i("MicroMsg.NetSceneBankRemitRequestOrder", "unique_id:%s last_transfer_bill_id:%s unpay_type:%s", new Object[] { bo.nullAsNil(paramString6), Base64.encodeToString(paramb.toByteArray(), 2), Integer.valueOf(paramInt5) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bss();
    ((b.a)localObject).fsK = new bst();
    ((b.a)localObject).fsI = 1380;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/request_tsbc";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bss)this.ehh.fsG.fsP;
    ((bss)localObject).pMd = paramString1;
    ((bss)localObject).pMe = paramString2;
    ((bss)localObject).pbn = paramString3;
    ((bss)localObject).pLQ = paramInt1;
    ((bss)localObject).wUL = paramInt2;
    ((bss)localObject).wUM = paramString4;
    ((bss)localObject).wUN = paramInt3;
    ((bss)localObject).wUO = paramInt4;
    ((bss)localObject).vHu = paramString5;
    ((bss)localObject).wKQ = paramString6;
    ((bss)localObject).wUP = paramb;
    ((bss)localObject).vPy = paramInt5;
    AppMethodBeat.o(44482);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44483);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(44483);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44484);
    ab.i("MicroMsg.NetSceneBankRemitRequestOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pLG = ((bst)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBankRemitRequestOrder", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.pLG.kCl), this.pLG.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44484);
  }

  public final boolean bgR()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.pLG.wUQ != null)
    {
      bool2 = bool1;
      if (this.pLG.wUQ.bJt == 1)
        bool2 = false;
    }
    return bool2;
  }

  public final void f(q paramq)
  {
    paramq = (bst)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1380;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.bankcard.a.o
 * JD-Core Version:    0.6.2
 */