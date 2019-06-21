package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.protobuf.bpj;
import com.tencent.mm.protocal.protobuf.bpl;
import com.tencent.mm.protocal.protobuf.bpm;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class e extends m
  implements k
{
  private b ehh;
  private f ehi;
  public boolean gIJ;
  public String nickname;
  public String username;

  public e(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(16734);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bpl();
    ((b.a)localObject).fsK = new bpm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoquery";
    ((b.a)localObject).fsI = 417;
    ((b.a)localObject).fsL = 202;
    ((b.a)localObject).fsM = 1000000202;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bpl)this.ehh.fsG.fsP;
    ((bpl)localObject).timestamp = 0;
    ((bpl)localObject).wRX = paramString1;
    ((bpl)localObject).csB = paramString2;
    ((bpl)localObject).scene = paramInt;
    AppMethodBeat.o(16734);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(16736);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16736);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    AppMethodBeat.i(16735);
    ab.d("MicroMsg.NetSceneRcptInfoQuery", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bpm)((b)paramq).fsH.fsP;
      this.username = paramq.lCH;
      this.nickname = paramq.wSa;
      if (paramq.wRZ != 1)
        break label198;
    }
    while (true)
    {
      this.gIJ = bool;
      if (paramq.wRK.wRN != null)
      {
        ab.d("MicroMsg.NetSceneRcptInfoQuery", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.wRK.wRN.size());
        a.arQ();
        a.arS().s(paramq.wRK.wRN);
        a.arQ();
        a.arS().arU();
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(16735);
      return;
      label198: bool = false;
    }
  }

  public final int getType()
  {
    return 417;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.e
 * JD-Core Version:    0.6.2
 */