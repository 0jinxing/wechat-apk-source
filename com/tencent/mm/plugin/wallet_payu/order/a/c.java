package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bjn;
import com.tencent.mm.protocal.protobuf.bjx;
import com.tencent.mm.protocal.protobuf.bjy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.u;

public final class c extends u
{
  private b ehh;
  private f ehi;
  public bjn tTC;

  public c(String paramString)
  {
    AppMethodBeat.i(48421);
    this.tTC = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bjx();
    ((b.a)localObject).fsK = new bjy();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payuqueryuserroll";
    ((b.a)localObject).fsI = 1520;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bjx)this.ehh.fsG.fsP;
    if (!bo.isNullOrNil(paramString))
      ((bjx)localObject).pcU = paramString;
    AppMethodBeat.o(48421);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48422);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48422);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48423);
    ab.w("MicroMsg.NetScenePayUQueryUserRoll", "errType = " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (bjy)((b)paramq).fsH.fsP;
      this.tTC = paramString.wNc;
      if (paramString.wNc != null)
      {
        ab.d("MicroMsg.NetScenePayUQueryUserRoll", "rr" + paramString.wNc.pcU);
        AppMethodBeat.o(48423);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetScenePayUQueryUserRoll", "hy: user roll is null!!!");
      AppMethodBeat.o(48423);
    }
  }

  public final int getType()
  {
    return 1520;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_payu.order.a.c
 * JD-Core Version:    0.6.2
 */