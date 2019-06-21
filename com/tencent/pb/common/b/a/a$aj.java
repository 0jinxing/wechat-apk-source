package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$aj extends e
{
  public a.at Amz = null;
  public a.av[] AnQ = a.av.dPH();
  public a.o[] AnR = a.o.dPB();
  public a.aw[] AnS = a.aw.dPI();
  public int AnT = 0;
  public int[] AnU = g.bxu;
  public a.o[] AnV = a.o.dPB();
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

  public a$aj()
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
    if ((this.AnS != null) && (this.AnS.length > 0))
      for (j = 0; j < this.AnS.length; j++)
      {
        localObject = this.AnS[j];
        if (localObject != null)
          paramb.a(9, (e)localObject);
      }
    if (this.Amz != null)
      paramb.a(10, this.Amz);
    if ((this.AnV != null) && (this.AnV.length > 0))
      for (j = 0; j < this.AnV.length; j++)
      {
        localObject = this.AnV[j];
        if (localObject != null)
          paramb.a(11, (e)localObject);
      }
    if ((this.Ank != null) && (this.Ank.length > 0))
      for (j = 0; j < this.Ank.length; j++)
      {
        localObject = this.Ank[j];
        if (localObject != null)
          paramb.a(12, (e)localObject);
      }
    if ((this.AnY != null) && (this.AnY.length > 0))
      for (j = 0; j < this.AnY.length; j++)
      {
        localObject = this.AnY[j];
        if (localObject != null)
          paramb.a(13, (e)localObject);
      }
    if (this.AnZ != 0)
      paramb.bq(14, this.AnZ);
    if (this.Aoa != 0)
      paramb.bq(15, this.Aoa);
    if (this.Aob != 0)
      paramb.bq(16, this.Aob);
    if (!Arrays.equals(this.Aoc, g.bxA))
      paramb.b(17, this.Aoc);
    if (this.wbi != -1)
      paramb.bq(18, this.wbi);
    if ((this.Aod != null) && (this.Aod.length > 0))
      for (j = i; j < this.Aod.length; j++)
        paramb.br(19, this.Aod[j]);
    if (this.Ang != 0)
      paramb.br(20, this.Ang);
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
    Object localObject;
    if (this.AnR != null)
    {
      i = j;
      if (this.AnR.length > 0)
      {
        i = 0;
        while (i < this.AnR.length)
        {
          localObject = this.AnR[i];
          k = j;
          if (localObject != null)
            k = j + b.b(4, (e)localObject);
          i++;
          j = k;
        }
        i = j;
      }
    }
    j = i;
    if (this.AnQ != null)
    {
      j = i;
      if (this.AnQ.length > 0)
      {
        k = 0;
        for (j = i; k < this.AnQ.length; j = i)
        {
          localObject = this.AnQ[k];
          i = j;
          if (localObject != null)
            i = j + b.b(5, (e)localObject);
          k++;
        }
      }
    }
    int k = j;
    if (this.Ane != null)
      k = j + b.b(6, this.Ane);
    i = k;
    if (this.AnT != 0)
      i = k + b.bs(7, this.AnT);
    j = i;
    if (this.AnU != null)
    {
      j = i;
      if (this.AnU.length > 0)
      {
        j = 0;
        k = 0;
        while (j < this.AnU.length)
        {
          k += b.ft(this.AnU[j]);
          j++;
        }
        j = i + k + this.AnU.length * 1;
      }
    }
    i = j;
    if (this.AnS != null)
    {
      i = j;
      if (this.AnS.length > 0)
      {
        k = 0;
        while (k < this.AnS.length)
        {
          localObject = this.AnS[k];
          i = j;
          if (localObject != null)
            i = j + b.b(9, (e)localObject);
          k++;
          j = i;
        }
        i = j;
      }
    }
    j = i;
    if (this.Amz != null)
      j = i + b.b(10, this.Amz);
    i = j;
    if (this.AnV != null)
    {
      i = j;
      if (this.AnV.length > 0)
      {
        k = 0;
        while (k < this.AnV.length)
        {
          localObject = this.AnV[k];
          i = j;
          if (localObject != null)
            i = j + b.b(11, (e)localObject);
          k++;
          j = i;
        }
        i = j;
      }
    }
    j = i;
    if (this.Ank != null)
    {
      j = i;
      if (this.Ank.length > 0)
      {
        k = 0;
        j = i;
        i = k;
        while (i < this.Ank.length)
        {
          localObject = this.Ank[i];
          k = j;
          if (localObject != null)
            k = j + b.b(12, (e)localObject);
          i++;
          j = k;
        }
      }
    }
    k = j;
    if (this.AnY != null)
    {
      k = j;
      if (this.AnY.length > 0)
      {
        i = 0;
        while (i < this.AnY.length)
        {
          localObject = this.AnY[i];
          k = j;
          if (localObject != null)
            k = j + b.b(13, (e)localObject);
          i++;
          j = k;
        }
        k = j;
      }
    }
    i = k;
    if (this.AnZ != 0)
      i = k + b.bs(14, this.AnZ);
    j = i;
    if (this.Aoa != 0)
      j = i + b.bs(15, this.Aoa);
    i = j;
    if (this.Aob != 0)
      i = j + b.bs(16, this.Aob);
    k = i;
    if (!Arrays.equals(this.Aoc, g.bxA))
      k = i + b.c(17, this.Aoc);
    j = k;
    if (this.wbi != -1)
      j = k + b.bs(18, this.wbi);
    i = j;
    if (this.Aod != null)
    {
      i = j;
      if (this.Aod.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.Aod.length)
        {
          k += b.fx(this.Aod[i]);
          i++;
        }
        i = j + k + this.Aod.length * 2;
      }
    }
    j = i;
    if (this.Ang != 0)
      j = i + b.bt(20, this.Ang);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.aj
 * JD-Core Version:    0.6.2
 */