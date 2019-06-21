package com.tencent.mm.plugin.facedetect.b;

import com.tencent.mm.ai.f;
import com.tencent.mm.ai.n;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.ato;
import com.tencent.mm.protocal.protobuf.bdu;
import com.tencent.mm.protocal.protobuf.bdv;
import com.tencent.mm.protocal.protobuf.lm;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class p extends n
  implements k
{
  static String lSV = null;
  protected f ehi = null;

  public static void Lp(String paramString)
  {
    lSV = paramString;
  }

  protected static String agg()
  {
    return lSV;
  }

  abstract void Lo(String paramString);

  public final int a(e parame, f paramf)
  {
    this.ehi = paramf;
    if (!bo.isNullOrNil(lSV))
    {
      ab.i("MicroMsg.NetSceneFaceRsaBase", "hy: has ticket: %s", new Object[] { lSV });
      Lo(lSV);
    }
    for (int i = g(parame); ; i = getType())
      return i;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    ab.i("MicroMsg.NetSceneFaceRsaBase", "hy: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 4) && (paramInt2 == -102))
    {
      paramInt1 = paramq.acF().vyj.ver;
      ab.d("MicroMsg.NetSceneFaceRsaBase", "hy: summerauth auth MM_ERR_CERT_EXPIRED  getcert now  old ver:%d", new Object[] { Integer.valueOf(paramInt1) });
      g.RS().aa(new p.1(this, paramInt1));
    }
    while (true)
    {
      return;
      c(paramInt1, paramInt2, paramString, paramq);
    }
  }

  public final void acP()
  {
    if (this.ehi != null)
      this.ehi.onSceneEnd(3, -1, "", this);
  }

  public final f acQ()
  {
    return this.ehi;
  }

  public final lm c(q paramq)
  {
    paramq = g(paramq);
    if (paramq != null);
    for (paramq = paramq.vLL; ; paramq = null)
      return paramq;
  }

  abstract void c(int paramInt1, int paramInt2, String paramString, q paramq);

  public final bdu d(q paramq)
  {
    paramq = g(paramq);
    if (paramq != null);
    for (paramq = paramq.vLM; ; paramq = null)
      return paramq;
  }

  public final ato e(q paramq)
  {
    paramq = g(paramq);
    if (paramq != null);
    for (paramq = paramq.vLK; ; paramq = null)
      return paramq;
  }

  abstract int g(e parame);

  protected abstract bdv g(q paramq);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.p
 * JD-Core Version:    0.6.2
 */