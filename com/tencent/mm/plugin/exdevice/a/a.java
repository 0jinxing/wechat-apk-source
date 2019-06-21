package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class a<RequestType extends com.tencent.mm.bt.a, ResponseType extends com.tencent.mm.bt.a> extends m
  implements k
{
  private f eIc;
  protected b lqv;

  public final int a(e parame, f paramf)
  {
    this.eIc = paramf;
    if (this.lqv == null)
    {
      paramf = new b.a();
      paramf.fsI = getType();
      paramf.uri = getUri();
      paramf.fsJ = bon();
      paramf.fsK = boo();
      paramf.fsL = 0;
      paramf.fsM = 0;
      this.lqv = paramf.acD();
      g(this.lqv.fsG.fsP);
    }
    return a(parame, this.lqv, this);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    ab.i("MicroMsg.BaseNetScene", "onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
  }

  public final ResponseType aTS()
  {
    if ((this.lqv != null) && (this.lqv.fsH.fsP != null));
    for (com.tencent.mm.bt.a locala = this.lqv.fsH.fsP; ; locala = null)
      return locala;
  }

  protected abstract RequestType bon();

  protected abstract ResponseType boo();

  protected void g(RequestType paramRequestType)
  {
  }

  protected abstract String getUri();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.a.a
 * JD-Core Version:    0.6.2
 */