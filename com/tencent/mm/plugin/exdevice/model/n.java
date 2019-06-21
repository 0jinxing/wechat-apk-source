package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.atr;
import com.tencent.mm.protocal.protobuf.cim;
import com.tencent.mm.protocal.protobuf.cin;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  public String ceI;
  b ehh;
  private f ehi;
  public int ltE;

  public n(atr paramatr, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(19319);
    this.ehi = null;
    this.ehh = null;
    this.ceI = null;
    this.ltE = 0;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cim();
    ((b.a)localObject).fsK = new cin();
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/transfermsgtodevice";
    ((b.a)localObject).fsI = 1717;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cim)this.ehh.fsG.fsP;
    ((cim)localObject).vIk = paramString1;
    ((cim)localObject).wbq = paramString2;
    ((cim)localObject).xhs = paramatr;
    ((cim)localObject).xht = paramInt;
    this.ceI = paramString2;
    this.ltE = paramInt;
    AppMethodBeat.o(19319);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19321);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19321);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19320);
    ab.i("MicroMsg.exdevice.NetSceneGetAppMsgInfo", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19320);
  }

  public final int getType()
  {
    return 1717;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.n
 * JD-Core Version:    0.6.2
 */