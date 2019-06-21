package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cjl;
import com.tencent.mm.protocal.protobuf.cjm;
import com.tencent.mm.protocal.protobuf.kg;
import com.tencent.mm.sdk.platformtools.ab;

public final class x extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;

  public x(String paramString1, String paramString2, kg paramkg1, kg paramkg2, Object paramObject)
  {
    AppMethodBeat.i(11642);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cjl();
    ((b.a)localObject).fsK = new cjm();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/updatebizchatmemberlist";
    ((b.a)localObject).fsI = 1357;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cjl)this.ehh.fsG.fsP;
    ((cjl)localObject).vNb = paramString1;
    ((cjl)localObject).vMV = paramString2;
    ((cjl)localObject).xig = paramkg1;
    ((cjl)localObject).xih = paramkg2;
    this.data = paramObject;
    AppMethodBeat.o(11642);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11644);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11644);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11643);
    ab.d("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11643);
  }

  public final int getType()
  {
    return 1357;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.x
 * JD-Core Version:    0.6.2
 */