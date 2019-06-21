package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$aa extends e
{
  public int AmJ = 0;
  public int AmX = 0;
  public a.at Amz = null;
  public a.av[] AnQ = a.av.dPH();
  public a.o[] AnR = a.o.dPB();
  public a.aw[] AnS = a.aw.dPI();
  public int AnT = 0;
  public int[] AnU = g.bxu;
  public a.o[] AnV = a.o.dPB();
  public int AnW = 0;
  public int AnX = 0;
  public a.o[] AnY = a.o.dPB();
  public int AnZ = 0;
  public a.as Ane = null;
  public int Ang = 0;
  public a.av[] Ank = a.av.dPH();
  public int Aoa = 0;
  public int Aob = 0;
  public byte[] Aoc = g.bxA;
  public int[] Aod = g.bxu;
  public String groupId = "";
  public int sQS = 0;
  public long sQT = 0L;
  public int wbi = -1;

  public a$aa()
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
    if ((this.AnQ != null) && (this.AnQ.length > 0))
      for (j = 0; j < this.AnQ.length; j++)
      {
        localObject = this.AnQ[j];
        if (localObject != null)
          paramb.a(5, (e)localObject);
      }
    if (this.Ane != null)
      paramb.a(6, this.Ane);
    if (this.AnT != 0)
      paramb.bq(7, this.AnT);
    if ((this.AnU != null) && (this.AnU.length > 0))
      for (j = 0; j < this.AnU.length; j++)
        paramb.bq(8, this.AnU[j]);
    if (this.AmJ != 0)
      paramb.bq(9, this.AmJ);
    if ((this.AnS != null) && (this.AnS.length > 0))
      for (j = 0; j < this.AnS.length; j++)
      {
        localObject = this.AnS[j];
        if (localObject != null)
          paramb.a(10, (e)localObject);
      }
    if (this.Amz != null)
      paramb.a(11, this.Amz);
    if (this.AmX != 0)
      paramb.br(12, this.AmX);
    if ((this.AnV != null) && (this.AnV.length > 0))
      for (j = 0; j < this.AnV.length; j++)
      {
        localObject = this.AnV[j];
        if (localObject != null)
          paramb.a(13, (e)localObject);
      }
    if ((this.AnY != null) && (this.AnY.length > 0))
      for (j = 0; j < this.AnY.length; j++)
      {
        localObject = this.AnY[j];
        if (localObject != null)
          paramb.a(14, (e)localObject);
      }
    if (this.AnZ != 0)
      paramb.bq(15, this.AnZ);
    if (this.Aoa != 0)
      paramb.bq(16, this.Aoa);
    if (this.Aob != 0)
      paramb.bq(17, this.Aob);
    if (!Arrays.equals(this.Aoc, g.bxA))
      paramb.b(18, this.Aoc);
    if (this.wbi != -1)
      paramb.bq(19, this.wbi);
    if ((this.Aod != null) && (this.Aod.length > 0))
      for (j = 0; j < this.Aod.length; j++)
        paramb.br(20, this.Aod[j]);
    if (this.Ang != 0)
      paramb.br(21, this.Ang);
    if (this.AnW != 0)
      paramb.br(100, this.AnW);
    if (this.AnX != 0)
      paramb.br(101, this.AnX);
    if ((this.Ank != null) && (this.Ank.length > 0))
      for (j = i; j < this.Ank.length; j++)
      {
        localObject = this.Ank[j];
        if (localObject != null)
          paramb.a(102, (e)localObject);
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
    int m = k;
    if (this.sQS != 0)
      m = k + b.bs(2, this.sQS);
    j = m;
    if (this.sQT != 0L)
      j = m + b.o(3, this.sQT);
    k = j;
    Object localObject;
    if (this.AnR != null)
    {
      k = j;
      if (this.AnR.length > 0)
      {
        m = 0;
        for (k = j; m < this.AnR.length; k = j)
        {
          localObject = this.AnR[m];
          j = k;
          if (localObject != null)
            j = k + b.b(4, (e)localObject);
          m++;
        }
      }
    }
    m = k;
    if (this.AnQ != null)
    {
      m = k;
      if (this.AnQ.length > 0)
      {
        j = 0;
        while (j < this.AnQ.length)
        {
          localObject = this.AnQ[j];
          m = k;
          if (localObject != null)
            m = k + b.b(5, (e)localObject);
          j++;
          k = m;
        }
        m = k;
      }
    }
    j = m;
    if (this.Ane != null)
      j = m + b.b(6, this.Ane);
    k = j;
    if (this.AnT != 0)
      k = j + b.bs(7, this.AnT);
    j = k;
    if (this.AnU != null)
    {
      j = k;
      if (this.AnU.length > 0)
      {
        m = 0;
        j = 0;
        while (m < this.AnU.length)
        {
          j += b.ft(this.AnU[m]);
          m++;
        }
        j = k + j + this.AnU.length * 1;
      }
    }
    k = j;
    if (this.AmJ != 0)
      k = j + b.bs(9, this.AmJ);
    m = k;
    if (this.AnS != null)
    {
      m = k;
      if (this.AnS.length > 0)
      {
        m = 0;
        while (m < this.AnS.length)
        {
          localObject = this.AnS[m];
          j = k;
          if (localObject != null)
            j = k + b.b(10, (e)localObject);
          m++;
          k = j;
        }
        m = k;
      }
    }
    j = m;
    if (this.Amz != null)
      j = m + b.b(11, this.Amz);
    k = j;
    if (this.AmX != 0)
      k = j + b.bt(12, this.AmX);
    j = k;
    if (this.AnV != null)
    {
      j = k;
      if (this.AnV.length > 0)
      {
        j = 0;
        while (j < this.AnV.length)
        {
          localObject = this.AnV[j];
          m = k;
          if (localObject != null)
            m = k + b.b(13, (e)localObject);
          j++;
          k = m;
        }
        j = k;
      }
    }
    k = j;
    if (this.AnY != null)
    {
      k = j;
      if (this.AnY.length > 0)
      {
        m = 0;
        k = j;
        j = m;
        while (j < this.AnY.length)
        {
          localObject = this.AnY[j];
          m = k;
          if (localObject != null)
            m = k + b.b(14, (e)localObject);
          j++;
          k = m;
        }
      }
    }
    j = k;
    if (this.AnZ != 0)
      j = k + b.bs(15, this.AnZ);
    k = j;
    if (this.Aoa != 0)
      k = j + b.bs(16, this.Aoa);
    j = k;
    if (this.Aob != 0)
      j = k + b.bs(17, this.Aob);
    m = j;
    if (!Arrays.equals(this.Aoc, g.bxA))
      m = j + b.c(18, this.Aoc);
    k = m;
    if (this.wbi != -1)
      k = m + b.bs(19, this.wbi);
    j = k;
    if (this.Aod != null)
    {
      j = k;
      if (this.Aod.length > 0)
      {
        m = 0;
        j = 0;
        while (m < this.Aod.length)
        {
          j += b.fx(this.Aod[m]);
          m++;
        }
        j = k + j + this.Aod.length * 2;
      }
    }
    k = j;
    if (this.Ang != 0)
      k = j + b.bt(21, this.Ang);
    j = k;
    if (this.AnW != 0)
      j = k + b.bt(100, this.AnW);
    k = j;
    if (this.AnX != 0)
      k = j + b.bt(101, this.AnX);
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
            m = k + b.b(102, (e)localObject);
          j++;
          k = m;
        }
      }
    }
    return m;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.aa
 * JD-Core Version:    0.6.2
 */