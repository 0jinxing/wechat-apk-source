package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;

public final class a$bb extends e
{
  public int AmC = 0;
  public a.av[] AnQ = a.av.dPH();
  public int ApO = 0;
  public String ApP = "";
  public String[] ApQ = g.EMPTY_STRING_ARRAY;
  public long ApR = 0L;
  public String Apf = "";
  public String groupId = "";
  public int sQS = 0;
  public long sQT = 0L;

  public a$bb()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    int i = 0;
    if (!this.groupId.equals(""))
      paramb.e(1, this.groupId);
    if (this.sQS != 0)
      paramb.bq(2, this.sQS);
    if (this.sQT != 0L)
      paramb.m(3, this.sQT);
    if (this.AmC != 0)
      paramb.br(4, this.AmC);
    if (this.ApO != 0)
      paramb.bq(5, this.ApO);
    if (!this.Apf.equals(""))
      paramb.e(6, this.Apf);
    int j;
    Object localObject;
    if ((this.AnQ != null) && (this.AnQ.length > 0))
      for (j = 0; j < this.AnQ.length; j++)
      {
        localObject = this.AnQ[j];
        if (localObject != null)
          paramb.a(7, (e)localObject);
      }
    if (!this.ApP.equals(""))
      paramb.e(8, this.ApP);
    if ((this.ApQ != null) && (this.ApQ.length > 0))
      for (j = i; j < this.ApQ.length; j++)
      {
        localObject = this.ApQ[j];
        if (localObject != null)
          paramb.e(9, (String)localObject);
      }
    if (this.ApR != 0L)
      paramb.l(10, this.ApR);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = super.vr();
    int j = i;
    if (!this.groupId.equals(""))
      j = i + b.f(1, this.groupId);
    i = j;
    if (this.sQS != 0)
      i = j + b.bs(2, this.sQS);
    j = i;
    if (this.sQT != 0L)
      j = i + b.o(3, this.sQT);
    i = j;
    if (this.AmC != 0)
      i = j + b.bt(4, this.AmC);
    int k = i;
    if (this.ApO != 0)
      k = i + b.bs(5, this.ApO);
    j = k;
    if (!this.Apf.equals(""))
      j = k + b.f(6, this.Apf);
    i = j;
    Object localObject;
    if (this.AnQ != null)
    {
      i = j;
      if (this.AnQ.length > 0)
      {
        i = 0;
        while (i < this.AnQ.length)
        {
          localObject = this.AnQ[i];
          k = j;
          if (localObject != null)
            k = j + b.b(7, (e)localObject);
          i++;
          j = k;
        }
        i = j;
      }
    }
    j = i;
    if (!this.ApP.equals(""))
      j = i + b.f(8, this.ApP);
    i = j;
    if (this.ApQ != null)
    {
      i = j;
      if (this.ApQ.length > 0)
      {
        i = 0;
        int m = 0;
        int i1;
        for (k = 0; i < this.ApQ.length; k = i1)
        {
          localObject = this.ApQ[i];
          int n = m;
          i1 = k;
          if (localObject != null)
          {
            i1 = k + 1;
            n = m + b.bf((String)localObject);
          }
          i++;
          m = n;
        }
        i = j + m + k * 1;
      }
    }
    j = i;
    if (this.ApR != 0L)
      j = i + b.n(10, this.ApR);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.bb
 * JD-Core Version:    0.6.2
 */