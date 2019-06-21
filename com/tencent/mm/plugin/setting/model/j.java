package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bwf;
import com.tencent.mm.protocal.protobuf.bwg;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public j(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, 0);
  }

  public j(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(126858);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bwf();
    ((b.a)localObject).fsK = new bwg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendfeedback";
    ((b.a)localObject).fsI = 153;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bwf)this.ehh.fsG.fsP;
    ((bwf)localObject).wWV = paramString1;
    ((bwf)localObject).ncM = paramString2;
    ((bwf)localObject).wBm = paramInt;
    AppMethodBeat.o(126858);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(126859);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(126859);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126860);
    ab.d("MicroMsg.NetSendSceneFeedBack", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(126860);
  }

  public final int getType()
  {
    return 153;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.j
 * JD-Core Version:    0.6.2
 */