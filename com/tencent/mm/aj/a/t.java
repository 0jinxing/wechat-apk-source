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
import com.tencent.mm.protocal.protobuf.aup;
import com.tencent.mm.protocal.protobuf.auq;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class t extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;
  public String fye;

  public t(String paramString1, String paramString2, LinkedList<String> paramLinkedList, Object paramObject)
  {
    AppMethodBeat.i(11630);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aup();
    ((b.a)localObject).fsK = new auq();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/initiatebizchat";
    ((b.a)localObject).fsI = 1389;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aup)this.ehh.fsG.fsP;
    ((aup)localObject).wbO = paramString1;
    paramString1 = paramString2;
    if (paramString2 == null)
      paramString1 = "";
    ((aup)localObject).wyL = paramString1;
    ((aup)localObject).wyM = paramLinkedList;
    this.data = paramObject;
    AppMethodBeat.o(11630);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11632);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneInitiateBizChat", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11632);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11631);
    ab.d("MicroMsg.NetSceneInitiateBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11631);
  }

  public final auq afo()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (auq localauq = (auq)this.ehh.fsH.fsP; ; localauq = null)
      return localauq;
  }

  public final int getType()
  {
    return 1389;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.t
 * JD-Core Version:    0.6.2
 */