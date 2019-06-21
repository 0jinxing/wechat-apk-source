package com.tencent.pb.common.b.a;

import com.google.a.a.b;
import com.google.a.a.e;
import com.google.a.a.g;
import java.util.Arrays;

public final class a$l extends e
{
  public int AmO = 0;
  public byte[] AmP = g.bxA;
  public a.az[] AmQ = a.az.dPJ();
  public a.ao[] AmR = a.ao.dPE();
  public int AmS = 0;
  public int AmT = 0;
  public int fVl = 0;
  public String groupId = "";
  public int kyZ = -1;
  public int sQS = 0;
  public long sQT = 0L;

  public a$l()
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
    if (this.kyZ != -1)
      paramb.bq(4, this.kyZ);
    if (this.AmO != 0)
      paramb.bq(5, this.AmO);
    if (!Arrays.equals(this.AmP, g.bxA))
      paramb.b(6, this.AmP);
    int j;
    Object localObject;
    if ((this.AmQ != null) && (this.AmQ.length > 0))
      for (j = 0; j < this.AmQ.length; j++)
      {
        localObject = this.AmQ[j];
        if (localObject != null)
          paramb.a(7, (e)localObject);
      }
    if ((this.AmR != null) && (this.AmR.length > 0))
      for (j = i; j < this.AmR.length; j++)
      {
        localObject = this.AmR[j];
        if (localObject != null)
          paramb.a(8, (e)localObject);
      }
    if (this.AmS != 0)
      paramb.bq(9, this.AmS);
    if (this.AmT != 0)
      paramb.bq(10, this.AmT);
    if (this.fVl != 0)
      paramb.bq(11, this.fVl);
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
    j = k;
    if (this.kyZ != -1)
      j = k + b.bs(4, this.kyZ);
    k = j;
    if (this.AmO != 0)
      k = j + b.bs(5, this.AmO);
    j = k;
    if (!Arrays.equals(this.AmP, g.bxA))
      j = k + b.c(6, this.AmP);
    k = j;
    Object localObject;
    int m;
    if (this.AmQ != null)
    {
      k = j;
      if (this.AmQ.length > 0)
      {
        k = 0;
        while (k < this.AmQ.length)
        {
          localObject = this.AmQ[k];
          m = j;
          if (localObject != null)
            m = j + b.b(7, (e)localObject);
          k++;
          j = m;
        }
        k = j;
      }
    }
    j = k;
    if (this.AmR != null)
    {
      j = k;
      if (this.AmR.length > 0)
      {
        m = i;
        while (true)
        {
          j = k;
          if (m >= this.AmR.length)
            break;
          localObject = this.AmR[m];
          j = k;
          if (localObject != null)
            j = k + b.b(8, (e)localObject);
          m++;
          k = j;
        }
      }
    }
    k = j;
    if (this.AmS != 0)
      k = j + b.bs(9, this.AmS);
    j = k;
    if (this.AmT != 0)
      j = k + b.bs(10, this.AmT);
    k = j;
    if (this.fVl != 0)
      k = j + b.bs(11, this.fVl);
    return k;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.a.a.l
 * JD-Core Version:    0.6.2
 */