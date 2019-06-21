package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.avl;
import com.tencent.mm.protocal.protobuf.avm;
import com.tencent.mm.sdk.platformtools.ab;

public final class p extends m
  implements k
{
  private f eIc;
  public final b ehh;

  public p(String paramString1, String paramString2)
  {
    AppMethodBeat.i(6610);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new avl();
    ((b.a)localObject).fsK = new avm();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibggetuseropenid";
    ((b.a)localObject).fsI = 1566;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (avl)this.ehh.fsG.fsP;
    ((avl)localObject).jBB = paramString2;
    ((avl)localObject).fKh = paramString1;
    AppMethodBeat.o(6610);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6612);
    ab.i("MicroMsg.NetSceneGetUserOpenId", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6612);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6611);
    ab.i("MicroMsg.NetSceneGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6611);
  }

  public final int getType()
  {
    return 1566;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.p
 * JD-Core Version:    0.6.2
 */