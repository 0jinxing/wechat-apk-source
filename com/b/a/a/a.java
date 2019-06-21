package com.b.a.a;

import android.content.Context;
import android.os.Handler;

abstract class a extends d
  implements m
{
  private final d[] bCF;
  private final Handler[] bCG;
  private final d.a[] bCH;

  a(d[] paramArrayOfd)
  {
    this.bCF = paramArrayOfd;
    this.bCG = new Handler[this.bCF.length];
    this.bCH = new d.a[this.bCG.length];
  }

  void a(Context paramContext, Handler paramHandler, d.a parama)
  {
    a(paramHandler, this.bCG);
    a(parama, this.bCH);
    int i = 0;
    while (true)
    {
      if (i >= this.bCF.length)
        return;
      try
      {
        this.bCF[i].a(this.bCG[i], this.bCH[i]);
        label56: i++;
      }
      catch (Exception paramContext)
      {
        break label56;
      }
    }
  }

  abstract void a(Handler paramHandler, Handler[] paramArrayOfHandler);

  abstract void a(d.a parama, d.a[] paramArrayOfa);

  final void at(Context paramContext)
  {
    int i = 0;
    d[] arrayOfd = this.bCF;
    int j = arrayOfd.length;
    while (true)
    {
      if (i >= j)
        return;
      d locald = arrayOfd[i];
      try
      {
        locald.a(paramContext, new m[] { this });
        label37: i++;
      }
      catch (Exception localException)
      {
        break label37;
      }
    }
  }

  final void au(Context paramContext)
  {
    paramContext = this.bCF;
    int i = paramContext.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      paramContext[j].stop();
    }
  }

  final void vV()
  {
    d[] arrayOfd = this.bCF;
    int i = arrayOfd.length;
    for (int j = 0; ; j++)
    {
      if (j >= i)
        return;
      arrayOfd[j].vY();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.b.a.a.a
 * JD-Core Version:    0.6.2
 */