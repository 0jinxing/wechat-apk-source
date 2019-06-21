package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cia;
import com.tencent.mm.protocal.protobuf.cib;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private b ehh;
  private f ehi;
  String msn;
  boolean tVh;

  public e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(51478);
    this.tVh = false;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cia();
    ((b.a)localObject).fsK = new cib();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/touchlockgetchallenge";
    ((b.a)localObject).fsI = 1548;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cia)this.ehh.fsG.fsP;
    ((cia)localObject).scene = 1548;
    ((cia)localObject).rOh = paramString1;
    ((cia)localObject).jSY = paramString2;
    AppMethodBeat.o(51478);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(51479);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(51479);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51480);
    ab.i("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch wallet lock challenge errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (cib)((b)paramq).fsH.fsP;
    this.msn = paramq.msn;
    ab.d("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch lock challenge: %s", new Object[] { this.msn });
    if (paramq.xca == 1);
    for (this.tVh = true; ; this.tVh = false)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(51480);
      return;
    }
  }

  public final int getType()
  {
    return 1548;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.e
 * JD-Core Version:    0.6.2
 */