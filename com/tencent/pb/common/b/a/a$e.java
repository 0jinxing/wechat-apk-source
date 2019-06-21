package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;

public final class a$e extends e
{
  public a.ba AmB = null;
  public int AmD = 0;
  public String[] AmG = g.EMPTY_STRING_ARRAY;
  public a.m[] AmH = a.m.dPz();
  public int AmI = 0;
  public int AmJ = 0;
  public a.s AmK = null;
  public int AmL = 0;
  public int Amv = 0;
  public a.at Amz = null;
  public String groupId = "";
  public int netType = 0;
  public int sQS = 0;
  public long sQT = 0L;

  public a$e()
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
    if (this.AmB != null)
      paramb.a(4, this.AmB);
    if (this.AmJ != 0)
      paramb.bq(5, this.AmJ);
    if (this.AmD != 0)
      paramb.br(6, this.AmD);
    if (this.Amv != 0)
      paramb.bq(7, this.Amv);
    if (this.netType != 0)
      paramb.br(8, this.netType);
    if (this.Amz != null)
      paramb.a(200, this.Amz);
    int j;
    Object localObject;
    if ((this.AmG != null) && (this.AmG.length > 0))
      for (j = 0; j < this.AmG.length; j++)
      {
        localObject = this.AmG[j];
        if (localObject != null)
          paramb.e(201, (String)localObject);
      }
    if ((this.AmH != null) && (this.AmH.length > 0))
      for (j = i; j < this.AmH.length; j++)
      {
        localObject = this.AmH[j];
        if (localObject != null)
          paramb.a(202, (e)localObject);
      }
    if (this.AmK != null)
      paramb.a(203, this.AmK);
    if (this.AmL != 0)
      paramb.br(204, this.AmL);
    if (this.AmI != 0)
      paramb.br(240, this.AmI);
    super.a(paramb);
  }

  public final int vr()
  {
    int i = 0;
    int j = super.vr();
    int k = j;
    if (!this.groupId.equals(""))
      k = j + b.f(1, this.groupId);
    j = k;
    if (this.sQS != 0)
      j = k + b.bs(2, this.sQS);
    int m = j;
    if (this.sQT != 0L)
      m = j + b.o(3, this.sQT);
    k = m;
    if (this.AmB != null)
      k = m + b.b(4, this.AmB);
    j = k;
    if (this.AmJ != 0)
      j = k + b.bs(5, this.AmJ);
    k = j;
    if (this.AmD != 0)
      k = j + b.bt(6, this.AmD);
    j = k;
    if (this.Amv != 0)
      j = k + b.bs(7, this.Amv);
    k = j;
    if (this.netType != 0)
      k = j + b.bt(8, this.netType);
    j = k;
    if (this.Amz != null)
      j = k + b.b(200, this.Amz);
    k = j;
    Object localObject;
    if (this.AmG != null)
    {
      k = j;
      if (this.AmG.length > 0)
      {
        k = 0;
        int n = 0;
        int i2;
        for (m = 0; k < this.AmG.length; m = i2)
        {
          localObject = this.AmG[k];
          int i1 = n;
          i2 = m;
          if (localObject != null)
          {
            i2 = m + 1;
            i1 = n + b.bf((String)localObject);
          }
          k++;
          n = i1;
        }
        k = j + n + m * 2;
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
    m = j;
    if (this.AmK != null)
      m = j + b.b(203, this.AmK);
    k = m;
    if (this.AmL != 0)
      k = m + b.bt(204, this.AmL);
    j = k;
    if (this.AmI != 0)
      j = k + b.bt(240, this.AmI);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.e
 * JD-Core Version:    0.6.2
 */