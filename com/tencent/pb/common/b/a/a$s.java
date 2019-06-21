package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;

public final class a$s extends e
{
  public String AmV = "";
  public String Ann = "";
  public String Ano = "";
  public int Anp = 1;
  public long Anq = 0L;
  public int Anr = 0;
  public long Ans = 0L;
  public int Ant = 0;
  public String ffQ = "";
  public String username = "";
  public long vNx = 0L;
  public long vNy = 0L;
  public String xAF = "";

  public a$s()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    if (this.vNx != 0L)
      paramb.l(1, this.vNx);
    if (!this.Ann.equals(""))
      paramb.e(2, this.Ann);
    if (!this.Ano.equals(""))
      paramb.e(3, this.Ano);
    if (this.Anp != 1)
      paramb.bq(4, this.Anp);
    if (!this.username.equals(""))
      paramb.e(5, this.username);
    if (!this.ffQ.equals(""))
      paramb.e(6, this.ffQ);
    if (!this.AmV.equals(""))
      paramb.e(7, this.AmV);
    if (this.Anq != 0L)
      paramb.l(8, this.Anq);
    if (this.Anr != 0)
      paramb.br(9, this.Anr);
    if (!this.xAF.equals(""))
      paramb.e(10, this.xAF);
    if (this.Ans != 0L)
      paramb.l(11, this.Ans);
    if (this.Ant != 0)
      paramb.br(12, this.Ant);
    if (this.vNy != 0L)
      paramb.l(13, this.vNy);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (this.vNx != 0L)
      j = i + b.n(1, this.vNx);
    i = j;
    if (!this.Ann.equals(""))
      i = j + b.f(2, this.Ann);
    j = i;
    if (!this.Ano.equals(""))
      j = i + b.f(3, this.Ano);
    i = j;
    if (this.Anp != 1)
      i = j + b.bs(4, this.Anp);
    int k = i;
    if (!this.username.equals(""))
      k = i + b.f(5, this.username);
    j = k;
    if (!this.ffQ.equals(""))
      j = k + b.f(6, this.ffQ);
    i = j;
    if (!this.AmV.equals(""))
      i = j + b.f(7, this.AmV);
    j = i;
    if (this.Anq != 0L)
      j = i + b.n(8, this.Anq);
    i = j;
    if (this.Anr != 0)
      i = j + b.bt(9, this.Anr);
    k = i;
    if (!this.xAF.equals(""))
      k = i + b.f(10, this.xAF);
    j = k;
    if (this.Ans != 0L)
      j = k + b.n(11, this.Ans);
    i = j;
    if (this.Ant != 0)
      i = j + b.bt(12, this.Ant);
    j = i;
    if (this.vNy != 0L)
      j = i + b.n(13, this.vNy);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.s
 * JD-Core Version:    0.6.2
 */