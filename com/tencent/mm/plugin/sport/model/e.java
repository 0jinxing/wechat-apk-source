package com.tencent.mm.plugin.sport.model;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.ctf;
import com.tencent.mm.protocal.protobuf.ctg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bs;

public final class e extends m
  implements k
{
  private com.tencent.mm.ai.f ehi;
  private b fAT;
  ctg rPu;

  public e()
  {
    AppMethodBeat.i(93660);
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 1947;
    ((b.a)localObject).uri = "/cgi-bin/mmoc-bin/hardware/getwxsportconfig";
    ((b.a)localObject).fsJ = new ctf();
    ((b.a)localObject).fsK = new ctg();
    this.fAT = ((b.a)localObject).acD();
    localObject = (ctf)this.fAT.fsG.fsP;
    ((ctf)localObject).jBF = d.DEVICE_NAME;
    ((ctf)localObject).vIk = bs.dut();
    ((ctf)localObject).vOA = Build.BRAND;
    ((ctf)localObject).vOz = Build.MODEL;
    ((ctf)localObject).xqm = d.vxk;
    ((ctf)localObject).vOB = d.vxl;
    ((ctf)localObject).vOC = d.vxm;
    ((ctf)localObject).xqn = com.tencent.mm.sdk.platformtools.f.CLIENT_VERSION;
    ((ctf)localObject).xqo = Build.MANUFACTURER;
    ab.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "request params=[%s, %s, %s, %s, %s, %s, %s, %s, %s]", new Object[] { ((ctf)localObject).vIk, ((ctf)localObject).vOA, ((ctf)localObject).vOz, ((ctf)localObject).jBF, ((ctf)localObject).vOC, ((ctf)localObject).vOB, ((ctf)localObject).vOC, ((ctf)localObject).xqn, ((ctf)localObject).xqo });
    AppMethodBeat.o(93660);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(93661);
    this.ehi = paramf;
    int i = a(parame, this.fAT, this);
    AppMethodBeat.o(93661);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93662);
    ab.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "onGYNetEnd %d %d %d %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(93662);
    }
    while (true)
    {
      return;
      this.rPu = ((ctg)this.fAT.fsH.fsP);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(93662);
    }
  }

  public final int getType()
  {
    return 1947;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.e
 * JD-Core Version:    0.6.2
 */