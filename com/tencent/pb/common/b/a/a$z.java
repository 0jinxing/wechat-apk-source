package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$z extends e
{
  public int AmC = 0;
  public int AmX = 0;
  public String Amx = "";
  public a.at Amz = null;
  public a.o[] AnR = a.o.dPB();
  public a.aw[] AnS = a.aw.dPI();
  public int AnT = 0;
  public int[] AnU = g.bxu;
  public a.o[] AnV = a.o.dPB();
  public int AnW = 0;
  public int AnX = 0;
  public a.o[] AnY = a.o.dPB();
  public int AnZ = 0;
  public a.av[] And = a.av.dPH();
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

  public a$z()
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
    int j;
    Object localObject;
    if ((this.AnR != null) && (this.AnR.length > 0))
      for (j = 0; j < this.AnR.length; j++)
      {
        localObject = this.AnR[j];
        if (localObject != null)
          paramb.a(5, (e)localObject);
      }
    if ((this.AnS != null) && (this.AnS.length > 0))
      for (j = 0; j < this.AnS.length; j++)
      {
        localObject = this.AnS[j];
        if (localObject != null)
          paramb.a(6, (e)localObject);
      }
    if (this.Ane != null)
      paramb.a(7, this.Ane);
    if (!this.Amx.equals(""))
      paramb.e(8, this.Amx);
    if ((this.And != null) && (this.And.length > 0))
      for (j = 0; j < this.And.length; j++)
      {
        localObject = this.And[j];
        if (localObject != null)
          paramb.a(9, (e)localObject);
      }
    if (this.AnT != 0)
      paramb.bq(10, this.AnT);
    if ((this.AnU != null) && (this.AnU.length > 0))
      for (j = 0; j < this.AnU.length; j++)
        paramb.bq(11, this.AnU[j]);
    if (this.Amz != null)
      paramb.a(12, this.Amz);
    if (this.AmX != 0)
      paramb.br(13, this.AmX);
    if ((this.AnV != null) && (this.AnV.length > 0))
      for (j = 0; j < this.AnV.length; j++)
      {
        localObject = this.AnV[j];
        if (localObject != null)
          paramb.a(14, (e)localObject);
      }
    if (this.AnW != 0)
      paramb.br(15, this.AnW);
    if (this.AnX != 0)
      paramb.br(16, this.AnX);
    if ((this.Ank != null) && (this.Ank.length > 0))
      for (j = 0; j < this.Ank.length; j++)
      {
        localObject = this.Ank[j];
        if (localObject != null)
          paramb.a(17, (e)localObject);
      }
    if ((this.AnY != null) && (this.AnY.length > 0))
      for (j = 0; j < this.AnY.length; j++)
      {
        localObject = this.AnY[j];
        if (localObject != null)
          paramb.a(18, (e)localObject);
      }
    if (this.AnZ != 0)
      paramb.bq(19, this.AnZ);
    if (this.Aoa != 0)
      paramb.bq(20, this.Aoa);
    if (this.Aob != 0)
      paramb.bq(21, this.Aob);
    if (!Arrays.equals(this.Aoc, g.bxA))
      paramb.b(22, this.Aoc);
    if (this.wbi != -1)
      paramb.bq(23, this.wbi);
    if ((this.Aod != null) && (this.Aod.length > 0))
      for (j = i; j < this.Aod.length; j++)
        paramb.br(24, this.Aod[j]);
    if (this.Ang != 0)
      paramb.br(25, this.Ang);
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
    j = i;
    Object localObject;
    if (this.AnR != null)
    {
      j = i;
      if (this.AnR.length > 0)
      {
        k = 0;
        for (j = i; k < this.AnR.length; j = i)
        {
          localObject = this.AnR[k];
          i = j;
          if (localObject != null)
            i = j + b.b(5, (e)localObject);
          k++;
        }
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
            i = j + b.b(6, (e)localObject);
          k++;
          j = i;
        }
        i = j;
      }
    }
    int k = i;
    if (this.Ane != null)
      k = i + b.b(7, this.Ane);
    j = k;
    if (!this.Amx.equals(""))
      j = k + b.f(8, this.Amx);
    i = j;
    if (this.And != null)
    {
      i = j;
      if (this.And.length > 0)
      {
        i = 0;
        while (i < this.And.length)
        {
          localObject = this.And[i];
          k = j;
          if (localObject != null)
            k = j + b.b(9, (e)localObject);
          i++;
          j = k;
        }
        i = j;
      }
    }
    j = i;
    if (this.AnT != 0)
      j = i + b.bs(10, this.AnT);
    k = j;
    if (this.AnU != null)
    {
      k = j;
      if (this.AnU.length > 0)
      {
        i = 0;
        k = 0;
        while (i < this.AnU.length)
        {
          k += b.ft(this.AnU[i]);
          i++;
        }
        k = j + k + this.AnU.length * 1;
      }
    }
    i = k;
    if (this.Amz != null)
      i = k + b.b(12, this.Amz);
    j = i;
    if (this.AmX != 0)
      j = i + b.bt(13, this.AmX);
    i = j;
    if (this.AnV != null)
    {
      i = j;
      if (this.AnV.length > 0)
      {
        i = 0;
        while (i < this.AnV.length)
        {
          localObject = this.AnV[i];
          k = j;
          if (localObject != null)
            k = j + b.b(14, (e)localObject);
          i++;
          j = k;
        }
        i = j;
      }
    }
    j = i;
    if (this.AnW != 0)
      j = i + b.bt(15, this.AnW);
    i = j;
    if (this.AnX != 0)
      i = j + b.bt(16, this.AnX);
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
            k = j + b.b(17, (e)localObject);
          i++;
          j = k;
        }
      }
    }
    i = j;
    if (this.AnY != null)
    {
      i = j;
      if (this.AnY.length > 0)
      {
        i = 0;
        while (i < this.AnY.length)
        {
          localObject = this.AnY[i];
          k = j;
          if (localObject != null)
            k = j + b.b(18, (e)localObject);
          i++;
          j = k;
        }
        i = j;
      }
    }
    j = i;
    if (this.AnZ != 0)
      j = i + b.bs(19, this.AnZ);
    i = j;
    if (this.Aoa != 0)
      i = j + b.bs(20, this.Aoa);
    j = i;
    if (this.Aob != 0)
      j = i + b.bs(21, this.Aob);
    i = j;
    if (!Arrays.equals(this.Aoc, g.bxA))
      i = j + b.c(22, this.Aoc);
    j = i;
    if (this.wbi != -1)
      j = i + b.bs(23, this.wbi);
    i = j;
    if (this.Aod != null)
    {
      i = j;
      if (this.Aod.length > 0)
      {
        k = 0;
        i = 0;
        while (k < this.Aod.length)
        {
          i += b.fx(this.Aod[k]);
          k++;
        }
        i = j + i + this.Aod.length * 2;
      }
    }
    j = i;
    if (this.Ang != 0)
      j = i + b.bt(25, this.Ang);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.z
 * JD-Core Version:    0.6.2
 */