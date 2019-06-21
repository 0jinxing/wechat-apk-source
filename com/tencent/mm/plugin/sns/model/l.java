package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bj;
import com.tencent.mm.protocal.protobuf.bk;
import com.tencent.mm.protocal.protobuf.bp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class l extends m
  implements k
{
  private b ehh;
  public f ehi;
  private LinkedList<bp> qIT;

  public l(LinkedList<bp> paramLinkedList)
  {
    AppMethodBeat.i(36242);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bj();
    ((b.a)localObject).fsK = new bk();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/ad/addatareport";
    ((b.a)localObject).fsI = 1295;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bj)this.ehh.fsG.fsP;
    ((bj)localObject).vDC = paramLinkedList;
    this.qIT = paramLinkedList;
    ab.i("MicroMsg.NetSceneSnsAdDataReport", "report %d ads", new Object[] { Integer.valueOf(((bj)localObject).vDC.size()) });
    AppMethodBeat.o(36242);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(36243);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36243);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36244);
    ab.d("MicroMsg.NetSceneSnsAdDataReport", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(36244);
  }

  public final int getType()
  {
    return 1295;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.l
 * JD-Core Version:    0.6.2
 */