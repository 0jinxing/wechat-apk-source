package com.tencent.mm.modelsimple;

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
import com.tencent.mm.protocal.protobuf.cip;
import com.tencent.mm.protocal.protobuf.ciq;
import com.tencent.mm.protocal.protobuf.df;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class z extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public z(String paramString, int paramInt, LinkedList<df> paramLinkedList)
  {
    AppMethodBeat.i(78609);
    ab.i("MicroMsg.NetSceneTranslateLink", "ticket link = " + paramString + "; scene = " + paramInt);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cip();
    ((b.a)localObject).fsK = new ciq();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/translatelink";
    ((b.a)localObject).fsI = 1200;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cip)this.ehh.fsG.fsP;
    ((cip)localObject).link = paramString;
    ((cip)localObject).scene = paramInt;
    ((cip)localObject).xhw = paramLinkedList;
    AppMethodBeat.o(78609);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78610);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78610);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78611);
    ab.d("MicroMsg.NetSceneTranslateLink", "swap deep link with ticket onGYNetEnd:[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(78611);
  }

  public final String ajD()
  {
    Object localObject = (ciq)this.ehh.fsH.fsP;
    if (localObject == null);
    for (localObject = null; ; localObject = ((ciq)localObject).xhx)
      return localObject;
  }

  public final ciq ajE()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (ciq localciq = (ciq)this.ehh.fsH.fsP; ; localciq = null)
      return localciq;
  }

  public final int getType()
  {
    return 1200;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.z
 * JD-Core Version:    0.6.2
 */