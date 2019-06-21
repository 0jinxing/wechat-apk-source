package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.mm.ai.a.a;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ci.f;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.btd;

public abstract class a<Req extends bsr, Resp extends btd>
{
  private com.tencent.mm.ai.a nRJ;
  Req nRK;
  private Resp nRL;

  protected abstract int ZU();

  public final <T> f<T> b(com.tencent.mm.vending.c.a<T, a.a<Resp>> parama)
  {
    boolean bool1 = true;
    bKS();
    this.nRL = bKR();
    this.nRJ = new com.tencent.mm.ai.a();
    com.tencent.mm.ai.a locala = this.nRJ;
    bsr localbsr = this.nRK;
    btd localbtd = this.nRL;
    if ((localbsr == null) || (localbtd == null))
    {
      parama = new StringBuilder("CgiBase called withoud req or resp req?[");
      if (localbsr == null)
      {
        bool2 = true;
        parama = parama.append(bool2).append("] resp?[");
        if (localbtd != null)
          break label118;
      }
      label118: for (boolean bool2 = bool1; ; bool2 = false)
      {
        throw new IllegalStateException(bool2 + "]");
        bool2 = false;
        break;
      }
    }
    b.a locala1 = new b.a();
    locala1.fsI = ZU();
    locala1.uri = getUri();
    locala1.fsJ = localbsr;
    locala1.fsK = localbtd;
    locala.ehh = locala1.acD();
    return this.nRJ.acy().g(new a.1(this)).b(parama);
  }

  protected abstract Resp bKR();

  protected void bKS()
  {
  }

  protected void bKT()
  {
  }

  protected abstract String getUri();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.a.a
 * JD-Core Version:    0.6.2
 */