package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.acr;
import com.tencent.mm.protocal.protobuf.un;
import com.tencent.mm.protocal.protobuf.uo;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;

  public n(String paramString, acr paramacr, Object paramObject)
  {
    AppMethodBeat.i(11612);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new un();
    ((b.a)localObject).fsK = new uo();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/createbizchatinfo";
    ((b.a)localObject).fsI = 1355;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (un)this.ehh.fsG.fsP;
    ((un)localObject).vNb = paramString;
    ((un)localObject).wcb = paramacr;
    this.data = paramObject;
    AppMethodBeat.o(11612);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11614);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11614);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11613);
    ab.d("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11613);
  }

  public final uo afm()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (uo localuo = (uo)this.ehh.fsH.fsP; ; localuo = null)
      return localuo;
  }

  public final un afn()
  {
    if ((this.ehh != null) && (this.ehh.fsG.fsP != null));
    for (un localun = (un)this.ehh.fsG.fsP; ; localun = null)
      return localun;
  }

  public final int getType()
  {
    return 1355;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.n
 * JD-Core Version:    0.6.2
 */