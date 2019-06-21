package com.tencent.mm.plugin.walletlock.fingerprint.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bhe;
import com.tencent.mm.protocal.protobuf.bhf;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;

  public f(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(51481);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bhe();
    ((b.a)localObject).fsK = new bhf();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/opensotertouchlock";
    ((b.a)localObject).fsI = 1967;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bhe)this.ehh.fsG.fsP;
    ab.d("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo json: %s, signature: %s, token: %s", new Object[] { paramString1, paramString2, paramString3 });
    ((bhe)localObject).wKv = paramString1;
    ((bhe)localObject).signature = paramString2;
    ((bhe)localObject).tuu = paramString3;
    AppMethodBeat.o(51481);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(51482);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(51482);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(51483);
    ab.i("MicroMsg.NetSceneOpenSoterFingerprintLock", "alvinluo open soter fingerprint lock errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(51483);
  }

  public final int getType()
  {
    return 1967;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.fingerprint.a.f
 * JD-Core Version:    0.6.2
 */