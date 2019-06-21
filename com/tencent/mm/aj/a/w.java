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
import com.tencent.mm.protocal.protobuf.cjn;
import com.tencent.mm.protocal.protobuf.cjo;
import com.tencent.mm.protocal.protobuf.kd;
import com.tencent.mm.sdk.platformtools.ab;

public final class w extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;

  public w(String paramString, kd paramkd, Object paramObject)
  {
    AppMethodBeat.i(11639);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cjn();
    ((b.a)localObject).fsK = new cjo();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/updatebizchat";
    ((b.a)localObject).fsI = 1356;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cjn)this.ehh.fsG.fsP;
    ((cjn)localObject).vNb = paramString;
    ((cjn)localObject).wku = paramkd;
    this.data = paramObject;
    AppMethodBeat.o(11639);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11641);
    this.ehi = paramf;
    ab.i("MicroMsg.brandservice.NetSceneUpdateBizChat", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11641);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11640);
    ab.d("MicroMsg.brandservice.NetSceneUpdateBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11640);
  }

  public final int getType()
  {
    return 1356;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.w
 * JD-Core Version:    0.6.2
 */