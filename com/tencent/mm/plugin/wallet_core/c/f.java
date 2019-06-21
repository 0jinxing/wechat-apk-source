package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.amg;
import com.tencent.mm.protocal.protobuf.amh;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  public String ttP;
  public boolean ttQ;

  public f()
  {
    AppMethodBeat.i(46503);
    this.ttP = "";
    this.ttQ = false;
    b.a locala = new b.a();
    locala.fsJ = new amg();
    locala.fsK = new amh();
    locala.uri = "/cgi-bin/mmpay-bin/getpayuserduty";
    locala.fsI = 2541;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(46503);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(46504);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46504);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46505);
    ab.d("MircoMsg.NetSceneGetPayUserDuty", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(46505);
    }
    while (true)
    {
      return;
      paramq = (amh)((b)paramq).fsH.fsP;
      this.ttP = paramq.ttP;
      this.ttQ = paramq.ttQ;
      ab.i("MircoMsg.NetSceneGetPayUserDuty", "duty_info %s need_agree_duty %s", new Object[] { this.ttP, Boolean.valueOf(this.ttQ) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(46505);
    }
  }

  public final int getType()
  {
    return 2541;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.f
 * JD-Core Version:    0.6.2
 */