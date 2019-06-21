package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;

public final class a$d extends e
{
  public int[] AmA = g.bxu;
  public a.ba AmB = null;
  public int AmC = 0;
  public int AmD = 0;
  public a.ay AmE = null;
  public String AmF = "";
  public String[] AmG = g.EMPTY_STRING_ARRAY;
  public a.m[] AmH = a.m.dPz();
  public int AmI = 0;
  public String Amx = "";
  public a.at Amz = null;
  public int netType = 0;

  public a$d()
  {
    this.bxt = -1;
  }

  public final void a(b paramb)
  {
    int i = 0;
    if (this.Amz != null)
      paramb.a(1, this.Amz);
    int j;
    if ((this.AmA != null) && (this.AmA.length > 0))
      for (j = 0; j < this.AmA.length; j++)
        paramb.br(2, this.AmA[j]);
    if (this.AmB != null)
      paramb.a(3, this.AmB);
    if (this.AmC != 0)
      paramb.br(4, this.AmC);
    if (this.AmD != 0)
      paramb.br(5, this.AmD);
    if (this.AmE != null)
      paramb.a(6, this.AmE);
    if (!this.Amx.equals(""))
      paramb.e(7, this.Amx);
    if (!this.AmF.equals(""))
      paramb.e(8, this.AmF);
    if (this.netType != 0)
      paramb.br(9, this.netType);
    Object localObject;
    if ((this.AmG != null) && (this.AmG.length > 0))
      for (j = 0; j < this.AmG.length; j++)
      {
        localObject = this.AmG[j];
        if (localObject != null)
          paramb.e(100, (String)localObject);
      }
    if ((this.AmH != null) && (this.AmH.length > 0))
      for (j = i; j < this.AmH.length; j++)
      {
        localObject = this.AmH[j];
        if (localObject != null)
          paramb.a(202, (e)localObject);
      }
    if (this.AmI != 0)
      paramb.br(240, this.AmI);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = 0;
    int j = super.vr();
    int k = j;
    if (this.Amz != null)
      k = j + b.b(1, this.Amz);
    j = k;
    if (this.AmA != null)
    {
      j = k;
      if (this.AmA.length > 0)
      {
        j = 0;
        m = 0;
        while (j < this.AmA.length)
        {
          m += b.fx(this.AmA[j]);
          j++;
        }
        j = k + m + this.AmA.length * 1;
      }
    }
    k = j;
    if (this.AmB != null)
      k = j + b.b(3, this.AmB);
    j = k;
    if (this.AmC != 0)
      j = k + b.bt(4, this.AmC);
    k = j;
    if (this.AmD != 0)
      k = j + b.bt(5, this.AmD);
    j = k;
    if (this.AmE != null)
      j = k + b.b(6, this.AmE);
    k = j;
    if (!this.Amx.equals(""))
      k = j + b.f(7, this.Amx);
    int m = k;
    if (!this.AmF.equals(""))
      m = k + b.f(8, this.AmF);
    j = m;
    if (this.netType != 0)
      j = m + b.bt(9, this.netType);
    k = j;
    Object localObject;
    if (this.AmG != null)
    {
      k = j;
      if (this.AmG.length > 0)
      {
        int n = 0;
        m = 0;
        for (int i1 = 0; n < this.AmG.length; i1 = k)
        {
          localObject = this.AmG[n];
          int i2 = m;
          k = i1;
          if (localObject != null)
          {
            k = i1 + 1;
            i2 = m + b.bf((String)localObject);
          }
          n++;
          m = i2;
        }
        k = j + m + i1 * 2;
      }
    }
    j = k;
    if (this.AmH != null)
    {
      j = k;
      if (this.AmH.length > 0)
      {
        m = i;
        while (true)
        {
          j = k;
          if (m >= this.AmH.length)
            break;
          localObject = this.AmH[m];
          j = k;
          if (localObject != null)
            j = k + b.b(202, (e)localObject);
          m++;
          k = j;
        }
      }
    }
    k = j;
    if (this.AmI != 0)
      k = j + b.bt(240, this.AmI);
    return k;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.d
 * JD-Core Version:    0.6.2
 */