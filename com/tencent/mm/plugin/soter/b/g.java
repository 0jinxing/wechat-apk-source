package com.tencent.mm.plugin.soter.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.f.b;
import com.tencent.soter.a.f.e.b;

public final class g extends m
  implements k, com.tencent.soter.a.f.e
{
  private f ehi;
  private q ftU;
  private b<e.b> msq = null;

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(59314);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(59314);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59315);
    ab.i("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.i("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa successfully");
      if (this.msq == null)
        break label132;
      this.msq.dd(new e.b(true));
      AppMethodBeat.o(59315);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa failed");
      if (this.msq != null)
        this.msq.dd(new e.b(false));
      label132: AppMethodBeat.o(59315);
    }
  }

  public final void a(b<e.b> paramb)
  {
    this.msq = paramb;
  }

  public final int acn()
  {
    return 3;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final void execute()
  {
    AppMethodBeat.i(59316);
    ab.v("MicroMsg.NetSceneUploadSoterASKRsa", "alvinluo NetSceneUploadSoterASKRsa doScene");
    com.tencent.mm.kernel.g.Rg().a(this, 0);
    AppMethodBeat.o(59316);
  }

  public final int getType()
  {
    return 627;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.b.g
 * JD-Core Version:    0.6.2
 */