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
import com.tencent.mm.protocal.protobuf.ane;
import com.tencent.mm.protocal.protobuf.anf;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  private f eIc;
  public final b ehh;
  public Object tag;

  public o(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(6607);
    ab.d("MicroMsg.NetSceneGetReadingModeInfoProxy", "NetSceneSetOAuthScope doScene url[%s], userAgent[%s], width[%d], height[%d]", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ane();
    ((b.a)localObject).fsK = new anf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getreadingmodeinfo";
    ((b.a)localObject).fsI = 673;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ane)this.ehh.fsG.fsP;
    ((ane)localObject).URL = paramString1;
    ((ane)localObject).wrL = paramString2;
    ((ane)localObject).Width = paramInt1;
    ((ane)localObject).Height = paramInt2;
    AppMethodBeat.o(6607);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6609);
    ab.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6609);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6608);
    ab.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      AppMethodBeat.o(6608);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(6608);
    }
  }

  public final int getType()
  {
    return 673;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.o
 * JD-Core Version:    0.6.2
 */