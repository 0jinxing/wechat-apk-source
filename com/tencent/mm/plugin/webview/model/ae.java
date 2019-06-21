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
import com.tencent.mm.protocal.protobuf.cmq;
import com.tencent.mm.protocal.protobuf.cmr;
import com.tencent.mm.sdk.platformtools.ab;

public final class ae extends m
  implements k
{
  private f ehi;
  public final b fAT;

  public ae(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6656);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cmq();
    ((b.a)localObject).fsK = new cmr();
    ((b.a)localObject).uri = "/cgi-bin/mmo2o-bin/verifybeaconjspermission";
    ((b.a)localObject).fsI = 1702;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.fAT = ((b.a)localObject).acD();
    localObject = (cmq)this.fAT.fsG.fsP;
    ((cmq)localObject).Url = paramString1;
    ((cmq)localObject).csB = paramString2;
    ((cmq)localObject).cxb = paramString3;
    AppMethodBeat.o(6656);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6657);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(6657);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6658);
    ab.i("MicroMsg.NetSceneVerifyBeaconJsPermission", "[oneliang][NetSceneVerifyBeaconJsPermission]:netId:%s,errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      ab.d("MicroMsg.NetSceneVerifyBeaconJsPermission", "[oneliang][NetSceneVerifyBeaconJsPermission]:net end ok");
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(6658);
      return;
      ab.d("MicroMsg.NetSceneVerifyBeaconJsPermission", "[oneliang][NetSceneVerifyBeaconJsPermission]:net end not ok");
    }
  }

  public final int getType()
  {
    return 1702;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ae
 * JD-Core Version:    0.6.2
 */