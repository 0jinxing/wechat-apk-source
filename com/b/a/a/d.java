package com.b.a.a;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

abstract class d
{
  private Context Gn;
  boolean bCM;
  private Collection<WeakReference<m>> bCN;
  private d.a bCO;
  boolean isRunning;
  private Handler mHandler;

  private void b(Context paramContext, m[] paramArrayOfm)
  {
    this.Gn = paramContext;
    if (paramArrayOfm == null)
      this.bCN = null;
    while (true)
    {
      at(paramContext);
      return;
      this.bCN = new LinkedList();
      int i = paramArrayOfm.length;
      for (int j = 0; j < i; j++)
      {
        m localm = paramArrayOfm[j];
        this.bCN.add(new WeakReference(localm));
      }
    }
  }

  abstract void a(Context paramContext, Handler paramHandler, d.a parama);

  final void a(Context paramContext, m[] paramArrayOfm)
  {
    if (paramContext == null)
      try
      {
        paramContext = new java/lang/Exception;
        paramContext.<init>("Module: context cannot be null");
        throw paramContext;
      }
      finally
      {
      }
    vY();
    b(paramContext.getApplicationContext(), paramArrayOfm);
    this.bCM = true;
  }

  void a(Handler paramHandler, d.a parama)
  {
    try
    {
      stop();
      this.mHandler = paramHandler;
      this.bCO = parama;
      a(this.Gn, this.mHandler, this.bCO);
      this.isRunning = true;
      return;
    }
    finally
    {
      paramHandler = finally;
    }
    throw paramHandler;
  }

  abstract void at(Context paramContext);

  abstract void au(Context paramContext);

  final void c(p paramp)
  {
    if (!this.isRunning);
    while (true)
    {
      return;
      if (this.bCN != null)
      {
        Iterator localIterator = this.bCN.iterator();
        while (localIterator.hasNext())
        {
          m localm = (m)((WeakReference)localIterator.next()).get();
          if (localm != null)
            localm.a(paramp);
        }
      }
    }
  }

  void stop()
  {
    try
    {
      if (this.isRunning)
      {
        au(this.Gn);
        this.mHandler = null;
        this.bCO = null;
        this.isRunning = false;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  abstract void vV();

  final void vY()
  {
    try
    {
      if (this.bCM)
      {
        stop();
        vV();
        this.bCM = false;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.b.a.a.d
 * JD-Core Version:    0.6.2
 */