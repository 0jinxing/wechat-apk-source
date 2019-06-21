package com.tencent.mm.plugin.nearby.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aye;
import com.tencent.mm.protocal.protobuf.ayf;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public String gfa;
  public String oPy;

  public d(float paramFloat1, float paramFloat2, int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(55367);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aye();
    ((b.a)localObject).fsK = new ayf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/joinlbsroom";
    ((b.a)localObject).fsI = 376;
    ((b.a)localObject).fsL = 183;
    ((b.a)localObject).fsM = 1000000183;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aye)this.ehh.fsG.fsP;
    ((aye)localObject).OpCode = 1;
    ((aye)localObject).vRp = paramFloat1;
    ((aye)localObject).vRq = paramFloat2;
    ((aye)localObject).wfG = paramInt;
    ((aye)localObject).wfH = paramString1;
    ((aye)localObject).wfI = paramString2;
    ((aye)localObject).wfJ = 0;
    ab.d("MicroMsg.NetSceneLbsRoom", "Req: opcode:1 lon:" + paramFloat1 + " lat:" + paramFloat2 + " pre:" + paramInt + " gpsSource:0 mac" + paramString1 + " cell:" + paramString2);
    AppMethodBeat.o(55367);
  }

  public d(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(55368);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aye();
    ((b.a)localObject).fsK = new ayf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/joinlbsroom";
    ((b.a)localObject).fsI = 376;
    ((b.a)localObject).fsL = 183;
    ((b.a)localObject).fsM = 1000000183;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aye)this.ehh.fsG.fsP;
    ((aye)localObject).vRp = 0.0F;
    ((aye)localObject).vRq = 0.0F;
    ((aye)localObject).wfG = 0;
    ((aye)localObject).wfJ = 0;
    ((aye)localObject).wfH = "";
    ((aye)localObject).wfI = "";
    ((aye)localObject).OpCode = 2;
    ((aye)localObject).fLc = paramString;
    ((aye)localObject).wCk = paramInt1;
    ((aye)localObject).wCj = paramInt2;
    AppMethodBeat.o(55368);
  }

  public final int Ah()
  {
    return ((aye)this.ehh.fsG.fsP).OpCode;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(55369);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(55369);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(55370);
    ab.d("MicroMsg.NetSceneLbsRoom", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " opCode:" + Ah());
    paramArrayOfByte = (ayf)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (paramInt2 != 0)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(55370);
    }
    while (true)
    {
      return;
      if (Ah() == 1)
      {
        this.gfa = paramArrayOfByte.fLc;
        this.oPy = paramArrayOfByte.wCl;
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(55370);
      }
      else
      {
        if (Ah() == 2)
        {
          b.TA(((aye)((com.tencent.mm.ai.b)paramq).fsG.fsP).fLc);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        }
        AppMethodBeat.o(55370);
      }
    }
  }

  public final int getType()
  {
    return 376;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.a.d
 * JD-Core Version:    0.6.2
 */