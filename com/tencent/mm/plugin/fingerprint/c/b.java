package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.protobuf.ccs;
import com.tencent.mm.protocal.protobuf.cct;
import com.tencent.mm.sdk.platformtools.ab;
import com.tenpay.android.wechat.TenpayUtil;

public final class b extends d
  implements k
{
  public final com.tencent.mm.ai.b ehh;
  private f ehi;
  private int msp;

  public b(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    AppMethodBeat.i(41573);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ccs();
    ((b.a)localObject).fsK = new cct();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/soteropenfppayment";
    ((b.a)localObject).fsI = 1638;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ccs)this.ehh.fsG.fsP;
    ((ccs)localObject).wKv = paramString1;
    ((ccs)localObject).signature = paramString2;
    ((ccs)localObject).xcb = paramString3;
    ((ccs)localObject).cDo = TenpayUtil.signWith3Des("passwd=" + ((ccs)localObject).xcb);
    ((ccs)localObject).xbY = paramInt;
    ((ccs)localObject).xbZ = 1;
    this.msp = paramInt;
    ab.i("MicroMsg.NetSceneSoterOpenTouchPay", "soter type: %s", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(41573);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(41577);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41577);
    return i;
  }

  public final void bxO()
  {
    AppMethodBeat.i(41575);
    ab.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: authkey required");
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    AppMethodBeat.o(41575);
  }

  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41574);
    ab.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay success");
      if (this.msp == 1)
      {
        ((l)g.K(l.class)).hq(true);
        ((l)g.K(l.class)).hr(false);
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt1, paramInt2, "", this);
      AppMethodBeat.o(41574);
      return;
      ((l)g.K(l.class)).hr(true);
      ((l)g.K(l.class)).hq(false);
      continue;
      ab.e("MicroMsg.NetSceneSoterOpenTouchPay", "open fingerprintpay failed");
    }
  }

  public final int getType()
  {
    return 1638;
  }

  public final void vL(int paramInt)
  {
    AppMethodBeat.i(41576);
    ab.i("MicroMsg.NetSceneSoterOpenTouchPay", "hy: onError: errType: %d, errcode: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(4, -1, "", this);
    AppMethodBeat.o(41576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.c.b
 * JD-Core Version:    0.6.2
 */