package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;

public final class a$a extends e
{
  public int[] Amu = g.bxu;
  public int Amv = 0;
  public String[] Amw = g.EMPTY_STRING_ARRAY;
  public String groupId = "";
  public int sQS = 0;
  public long sQT = 0L;

  public a$a()
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
    int j;
    if ((this.Amu != null) && (this.Amu.length > 0))
      for (j = 0; j < this.Amu.length; j++)
        paramb.br(4, this.Amu[j]);
    if (this.Amv != 0)
      paramb.bq(5, this.Amv);
    if ((this.Amw != null) && (this.Amw.length > 0))
      for (j = i; j < this.Amw.length; j++)
      {
        String str = this.Amw[j];
        if (str != null)
          paramb.e(100, str);
      }
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
    int k;
    if (this.Amu != null)
    {
      i = j;
      if (this.Amu.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.Amu.length)
        {
          k += b.fx(this.Amu[i]);
          i++;
        }
        i = j + k + this.Amu.length * 1;
      }
    }
    j = i;
    if (this.Amv != 0)
      j = i + b.bs(5, this.Amv);
    i = j;
    if (this.Amw != null)
    {
      i = j;
      if (this.Amw.length > 0)
      {
        i = 0;
        k = 0;
        int i1;
        for (int m = 0; i < this.Amw.length; m = i1)
        {
          String str = this.Amw[i];
          int n = k;
          i1 = m;
          if (str != null)
          {
            i1 = m + 1;
            n = k + b.bf(str);
          }
          i++;
          k = n;
        }
        i = j + k + m * 2;
      }
    }
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.a
 * JD-Core Version:    0.6.2
 */