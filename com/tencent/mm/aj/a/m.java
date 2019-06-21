package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ug;
import com.tencent.mm.protocal.protobuf.uh;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends com.tencent.mm.ai.m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;
  public String fye;

  public m(String paramString1, String paramString2, String paramString3, Object paramObject)
  {
    AppMethodBeat.i(11609);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ug();
    ((b.a)localObject).fsK = new uh();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/convertbizchat";
    ((b.a)localObject).fsI = 1315;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ug)this.ehh.fsG.fsP;
    ((ug)localObject).wbO = paramString1;
    ((ug)localObject).wbQ = paramString2;
    ((ug)localObject).wbP = paramString3;
    this.data = paramObject;
    AppMethodBeat.o(11609);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11611);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneConvertBizChat", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11611);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11610);
    ab.d("MicroMsg.NetSceneConvertBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11610);
  }

  public final uh afl()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (uh localuh = (uh)this.ehh.fsH.fsP; ; localuh = null)
      return localuh;
  }

  public final int getType()
  {
    return 1315;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.m
 * JD-Core Version:    0.6.2
 */