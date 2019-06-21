package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.a;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.aor;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class ad extends m
  implements k
{
  f ehi;
  public final q ftU;

  public ad(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    AppMethodBeat.i(108457);
    this.ehi = null;
    this.ftU = new ad.a();
    t.a locala = (t.a)this.ftU.acF();
    locala.gvI.wsI = paramString1;
    locala.gvI.wsJ = paramString2;
    locala.gvI.jCH = paramString3;
    locala.gvI.wsK = paramString4;
    locala.gvI.wsL = paramString5;
    locala.gvI.wsM = paramString6;
    locala.gvI.wsN = paramInt;
    locala.gvI.luQ = com.tencent.mm.sdk.platformtools.aa.dor();
    paramString1 = locala.gvI;
    g.RN();
    paramString1.vIj = a.Rb();
    AppMethodBeat.o(108457);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108458);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(108458);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108459);
    if ((paramInt2 == 4) && (paramInt3 == -102))
    {
      paramInt1 = paramq.acF().vyj.ver;
      ab.d("MicroMsg.NetSceneGetSuggestAlias", "summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      g.RS().aa(new ad.1(this, paramInt1));
      AppMethodBeat.o(108459);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(108459);
    }
  }

  public final void a(m.a parama)
  {
  }

  public final int acn()
  {
    return 3;
  }

  public final String ajn()
  {
    AppMethodBeat.i(108461);
    String str = ((t.b)this.ftU.ZS()).gvJ.wsL;
    AppMethodBeat.o(108461);
    return str;
  }

  public final byte[] ajo()
  {
    AppMethodBeat.i(108460);
    byte[] arrayOfByte = com.tencent.mm.platformtools.aa.a(((t.b)this.ftU.ZS()).gvJ.wsO, new byte[0]);
    AppMethodBeat.o(108460);
    return arrayOfByte;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 429;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.ad
 * JD-Core Version:    0.6.2
 */