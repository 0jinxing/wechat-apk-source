package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;

public final class a$ag extends e
{
  public a.at Amz = null;
  public a.av[] AnQ = a.av.dPH();
  public a.o[] AnR = a.o.dPB();
  public a.aw[] AnS = a.aw.dPI();
  public int AnT = 0;
  public int[] AnU = g.bxu;
  public a.as Ane = null;
  public a.av[] Ank = a.av.dPH();
  public String groupId = "";
  public int sQS = 0;
  public long sQT = 0L;

  public a$ag()
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
    Object localObject;
    if ((this.AnR != null) && (this.AnR.length > 0))
      for (j = 0; j < this.AnR.length; j++)
      {
        localObject = this.AnR[j];
        if (localObject != null)
          paramb.a(4, (e)localObject);
      }
    if (this.Ane != null)
      paramb.a(5, this.Ane);
    if (this.AnT != 0)
      paramb.bq(6, this.AnT);
    if ((this.AnU != null) && (this.AnU.length > 0))
      for (j = 0; j < this.AnU.length; j++)
        paramb.bq(7, this.AnU[j]);
    if ((this.AnQ != null) && (this.AnQ.length > 0))
      for (j = 0; j < this.AnQ.length; j++)
      {
        localObject = this.AnQ[j];
        if (localObject != null)
          paramb.a(200, (e)localObject);
      }
    if ((this.AnS != null) && (this.AnS.length > 0))
      for (j = 0; j < this.AnS.length; j++)
      {
        localObject = this.AnS[j];
        if (localObject != null)
          paramb.a(201, (e)localObject);
      }
    if (this.Amz != null)
      paramb.a(202, this.Amz);
    if ((this.Ank != null) && (this.Ank.length > 0))
      for (j = i; j < this.Ank.length; j++)
      {
        localObject = this.Ank[j];
        if (localObject != null)
          paramb.a(203, (e)localObject);
      }
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
    k = j;
    if (this.sQT != 0L)
      k = j + b.o(3, this.sQT);
    int m = k;
    Object localObject;
    if (this.AnR != null)
    {
      m = k;
      if (this.AnR.length > 0)
      {
        m = 0;
        while (m < this.AnR.length)
        {
          localObject = this.AnR[m];
          j = k;
          if (localObject != null)
            j = k + b.b(4, (e)localObject);
          m++;
          k = j;
        }
        m = k;
      }
    }
    j = m;
    if (this.Ane != null)
      j = m + b.b(5, this.Ane);
    k = j;
    if (this.AnT != 0)
      k = j + b.bs(6, this.AnT);
    j = k;
    if (this.AnU != null)
    {
      j = k;
      if (this.AnU.length > 0)
      {
        j = 0;
        m = 0;
        while (j < this.AnU.length)
        {
          m += b.ft(this.AnU[j]);
          j++;
        }
        j = k + m + this.AnU.length * 1;
      }
    }
    k = j;
    if (this.AnQ != null)
    {
      k = j;
      if (this.AnQ.length > 0)
      {
        m = 0;
        for (k = j; m < this.AnQ.length; k = j)
        {
          localObject = this.AnQ[m];
          j = k;
          if (localObject != null)
            j = k + b.b(200, (e)localObject);
          m++;
        }
      }
    }
    j = k;
    if (this.AnS != null)
    {
      j = k;
      if (this.AnS.length > 0)
      {
        m = 0;
        while (m < this.AnS.length)
        {
          localObject = this.AnS[m];
          j = k;
          if (localObject != null)
            j = k + b.b(201, (e)localObject);
          m++;
          k = j;
        }
        j = k;
      }
    }
    k = j;
    if (this.Amz != null)
      k = j + b.b(202, this.Amz);
    m = k;
    if (this.Ank != null)
    {
      m = k;
      if (this.Ank.length > 0)
      {
        j = i;
        while (true)
        {
          m = k;
          if (j >= this.Ank.length)
            break;
          localObject = this.Ank[j];
          m = k;
          if (localObject != null)
            m = k + b.b(203, (e)localObject);
          j++;
          k = m;
        }
      }
    }
    return m;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.ag
 * JD-Core Version:    0.6.2
 */