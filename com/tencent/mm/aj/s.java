package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aft;
import com.tencent.mm.protocal.protobuf.afu;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;

  public s(String paramString, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(11441);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aft();
    ((b.a)localObject).fsK = new afu();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/getbizenterpriseattr";
    ((b.a)localObject).fsI = 1343;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aft)this.ehh.fsG.fsP;
    ((aft)localObject).vNb = paramString;
    ((aft)localObject).wmV = paramInt;
    if (aa.dor().equals("zh_CN"));
    for (paramInt = 2; ; paramInt = 1)
    {
      ((aft)localObject).wmW = paramInt;
      this.data = paramObject;
      AppMethodBeat.o(11441);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11443);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneGetBizEnterpriseAttr", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11443);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11442);
    ab.d("MicroMsg.NetSceneGetBizEnterpriseAttr", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11442);
  }

  public final int getType()
  {
    return 1343;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.s
 * JD-Core Version:    0.6.2
 */