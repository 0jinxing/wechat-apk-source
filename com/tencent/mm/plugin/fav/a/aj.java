package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.abm;
import com.tencent.mm.protocal.protobuf.abn;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

public final class aj extends m
  implements k
{
  final com.tencent.mm.ai.b ehh;
  f ehi;
  private int fHJ;
  private aj.a mgj;
  long mgk;
  public boolean mgl;

  public aj()
  {
    AppMethodBeat.i(102736);
    this.ehi = null;
    this.fHJ = 1;
    this.mgj = new aj.a(this);
    this.mgk = -1L;
    this.mgl = false;
    ab.i("MicroMsg.Fav.NetSceneFavSync", "NetSceneFavSync");
    b.a locala = new b.a();
    locala.fsJ = new abm();
    locala.fsK = new abn();
    locala.uri = "/cgi-bin/micromsg-bin/favsync";
    locala.fsI = 400;
    locala.fsL = 195;
    locala.fsM = 1000000195;
    locala.fsN = false;
    this.ehh = locala.acD();
    AppMethodBeat.o(102736);
  }

  public aj(int paramInt)
  {
    AppMethodBeat.i(102737);
    this.ehi = null;
    this.fHJ = 1;
    this.mgj = new aj.a(this);
    this.mgk = -1L;
    this.mgl = false;
    ab.i("MicroMsg.Fav.NetSceneFavSync", "NetSceneFavSync %d", new Object[] { Integer.valueOf(paramInt) });
    b.a locala = new b.a();
    locala.fsJ = new abm();
    locala.fsK = new abn();
    locala.uri = "/cgi-bin/micromsg-bin/favsync";
    locala.fsI = 400;
    locala.fsL = 195;
    locala.fsM = 1000000195;
    locala.fsN = false;
    this.ehh = locala.acD();
    this.fHJ = paramInt;
    AppMethodBeat.o(102737);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(102738);
    this.ehi = paramf;
    abm localabm = (abm)this.ehh.fsG.fsP;
    localabm.vTN = this.fHJ;
    paramf = ((ae)g.M(ae.class)).getFavConfigStorage().buP();
    if (this.fHJ == 2)
      paramf = new byte[0];
    localabm.vTO = com.tencent.mm.platformtools.aa.ad(paramf);
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(102738);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102739);
    ab.i("MicroMsg.Fav.NetSceneFavSync", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if (((ae)g.M(ae.class)).getSendService().ame())
    {
      ab.w("MicroMsg.Fav.NetSceneFavSync", "sending item, skip sync onGYNetEnd");
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(102739);
    }
    abn localabn;
    while (true)
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(102739);
      }
      else
      {
        localabn = (abn)((com.tencent.mm.ai.b)paramq).fsH.fsP;
        paramArrayOfByte = localabn.vTR.jBw;
        if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
          break;
        ab.i("MicroMsg.Fav.NetSceneFavSync", "cmdList size:" + paramArrayOfByte.size());
        if (this.fHJ != 2)
        {
          paramString = this.mgj;
          paramString.mgm = paramArrayOfByte;
          if ((paramString.mgm != null) && (paramString.mgm.size() > 0))
          {
            paramq = new ak();
            g.Rg().a(paramq, 0);
          }
          paramString.mgn.sendEmptyMessage(0);
          AppMethodBeat.o(102739);
        }
        else
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(102739);
        }
      }
    }
    if (localabn.vTO.getBuffer() != null)
    {
      paramArrayOfByte = localabn.vTO.getBuffer().toByteArray();
      paramq = com.tencent.mm.protocal.aa.j(((abm)((com.tencent.mm.ai.b)paramq).fsG.fsP).vTO.getBuffer().toByteArray(), paramArrayOfByte);
      if ((paramq != null) && (paramq.length > 0))
        ((ae)g.M(ae.class)).getFavConfigStorage().aV(paramq);
    }
    while (true)
    {
      g.RP().Ry().set(8217, Integer.valueOf(1));
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(102739);
      break;
      ab.e("MicroMsg.Fav.NetSceneFavSync", "merge key should not be null");
    }
  }

  public final boolean acI()
  {
    return true;
  }

  public final int acn()
  {
    return 50;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 400;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.aj
 * JD-Core Version:    0.6.2
 */