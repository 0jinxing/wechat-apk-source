package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbg;
import com.tencent.mm.protocal.protobuf.cbh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;
import java.util.Vector;

public final class q extends m
  implements k
{
  public static List<Long> qIU;
  private long cND;
  public b ehh;
  public f ehi;

  static
  {
    AppMethodBeat.i(36275);
    qIU = new Vector();
    AppMethodBeat.o(36275);
  }

  public q(long paramLong)
  {
    AppMethodBeat.i(36272);
    this.cND = paramLong;
    b.a locala = new b.a();
    locala.fsJ = new cbg();
    locala.fsK = new cbh();
    locala.uri = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
    locala.fsI = 210;
    locala.fsL = 101;
    locala.fsM = 1000000101;
    this.ehh = locala.acD();
    ((cbg)this.ehh.fsG.fsP).vQE = paramLong;
    ab.d("MicroMsg.NetSceneSnsObjectDetial", "req snsId ".concat(String.valueOf(paramLong)));
    AppMethodBeat.o(36272);
  }

  private static boolean ke(long paramLong)
  {
    AppMethodBeat.i(36271);
    qIU.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(36271);
    return true;
  }

  public static boolean kf(long paramLong)
  {
    AppMethodBeat.i(36270);
    boolean bool;
    if (qIU.contains(Long.valueOf(paramLong)))
    {
      bool = false;
      AppMethodBeat.o(36270);
    }
    while (true)
    {
      return bool;
      qIU.add(Long.valueOf(paramLong));
      bool = true;
      AppMethodBeat.o(36270);
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(36273);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(36273);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(36274);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      ke(this.cND);
      AppMethodBeat.o(36274);
    }
    while (true)
    {
      return;
      paramq = ((cbh)this.ehh.fsH.fsP).xaI;
      if (paramq != null)
        ab.i("MicroMsg.NetSceneSnsObjectDetial", "snsdetail xml " + aa.b(paramq.xam));
      aj.d(paramq);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      ke(this.cND);
      AppMethodBeat.o(36274);
    }
  }

  public final int getType()
  {
    return 210;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.q
 * JD-Core Version:    0.6.2
 */