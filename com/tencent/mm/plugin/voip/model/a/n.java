package com.tencent.mm.plugin.voip.model.a;

import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.voip.model.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public abstract class n<REQ, RESP> extends m
  implements com.tencent.mm.network.k
{
  protected b ehh;
  f ehi;
  private f mww;
  protected com.tencent.mm.plugin.voip.model.k sPK = l.cIW();

  public final int a(e parame, f paramf)
  {
    int i = cKu();
    if (i != 0);
    while (true)
    {
      return i;
      this.mww = paramf;
      this.ehi = cKt();
      i = a(parame, this.ehh, this);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    fW(paramInt2, paramInt3);
    if (this.mww != null)
      this.mww.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.ehi != null)
      al.d(new n.1(this, paramInt2, paramInt3, paramString));
  }

  public abstract f cKt();

  public int cKu()
  {
    return 0;
  }

  public final void cKw()
  {
    ab.i("MicroMsg.VoipNetSceneBase", "netscene " + getClass().getSimpleName() + '@' + Integer.toHexString(hashCode()) + " is started.");
    g.Rg().a(this, 0);
  }

  public final <RESP> RESP cKx()
  {
    return this.ehh.fsH.fsP;
  }

  public final <REQ> REQ cKy()
  {
    return this.ehh.fsG.fsP;
  }

  public void fW(int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.n
 * JD-Core Version:    0.6.2
 */