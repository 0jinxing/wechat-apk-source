package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.rc;
import com.tencent.mm.protocal.protobuf.rd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class b extends p
{
  private final String TAG;
  public rd nqy;
  public String username;

  public b(String paramString, int paramInt)
  {
    AppMethodBeat.i(41719);
    this.TAG = "MicroMsg.NetSceneCheckHoneyUser";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new rc();
    ((b.a)localObject).fsK = new rd();
    ((b.a)localObject).fsI = 2926;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/checkhoneyuser";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (rc)this.ehh.fsG.fsP;
    ((rc)localObject).vYh = paramString;
    ((rc)localObject).iAd = paramInt;
    this.username = paramString;
    AppMethodBeat.o(41719);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41720);
    ab.i("MicroMsg.NetSceneCheckHoneyUser", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqy = ((rd)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneCheckHoneyUser", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqy.kdT), this.nqy.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41720);
  }

  public final void f(q paramq)
  {
    paramq = (rd)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2926;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.b
 * JD-Core Version:    0.6.2
 */