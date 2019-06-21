package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.kn;
import com.tencent.mm.protocal.protobuf.ko;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class c extends m
  implements k
{
  public b ehh;
  private f ehi;

  public c(String paramString1, LinkedList<String> paramLinkedList, int paramInt, String paramString2, double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(80831);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new kn();
    ((b.a)localObject).fsK = new ko();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetactioninfo";
    ((b.a)localObject).fsI = 1068;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (kn)this.ehh.fsG.fsP;
    ((kn)localObject).ProductID = paramString1;
    ((kn)localObject).Scene = paramInt;
    ((kn)localObject).vNG = paramString2;
    ((kn)localObject).vNF = paramLinkedList;
    ((kn)localObject).vNI = paramDouble2;
    ((kn)localObject).vNH = paramDouble1;
    AppMethodBeat.o(80831);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(80833);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(80833);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80832);
    ab.i("MicroMsg.NetSceneGetActionInfo", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(80832);
  }

  public final int getType()
  {
    return 1068;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.c
 * JD-Core Version:    0.6.2
 */