package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.cmv;
import com.tencent.mm.protocal.protobuf.cmw;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String geZ;
  public String gfi;
  public String gfj;

  public q(String paramString1, String paramString2)
  {
    AppMethodBeat.i(78881);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cmv();
    ((b.a)localObject).fsK = new cmw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyopenimcontact";
    ((b.a)localObject).fsI = 853;
    this.ehh = ((b.a)localObject).acD();
    this.geZ = paramString1;
    this.gfi = paramString2;
    localObject = (cmv)this.ehh.fsG.fsP;
    ((cmv)localObject).geZ = paramString1;
    ((cmv)localObject).gfi = paramString2;
    ab.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "tp_username: %s, verify_ticket:%s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(78881);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78883);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78883);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78882);
    ab.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.geZ });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78882);
  }

  public final int getType()
  {
    return 853;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.q
 * JD-Core Version:    0.6.2
 */