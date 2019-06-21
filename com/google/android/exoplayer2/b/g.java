package com.google.android.exoplayer2.b;

import com.google.android.exoplayer2.i.a;
import java.util.LinkedList;

public abstract class g<I extends e, O extends f, E extends Exception>
  implements c<I, O, E>
{
  private int aSg;
  private final Thread aSm;
  private final LinkedList<I> aSn = new LinkedList();
  private final LinkedList<O> aSo = new LinkedList();
  protected final I[] aSp;
  private final O[] aSq;
  protected int aSr;
  private int aSs;
  private I aSt;
  private boolean aSu;
  private E exception;
  private final Object lock = new Object();
  private boolean released;

  protected g(I[] paramArrayOfI, O[] paramArrayOfO)
  {
    this.aSp = paramArrayOfI;
    this.aSr = 2;
    for (int j = 0; j < this.aSr; j++)
      this.aSp[j] = qR();
    this.aSq = paramArrayOfO;
    this.aSs = 2;
    for (j = i; j < this.aSs; j++)
      this.aSq[j] = qS();
    this.aSm = new g.1(this);
    this.aSm.start();
  }

  private void a(I paramI)
  {
    paramI.clear();
    e[] arrayOfe = this.aSp;
    int i = this.aSr;
    this.aSr = (i + 1);
    arrayOfe[i] = paramI;
  }

  private void b(O paramO)
  {
    paramO.clear();
    f[] arrayOff = this.aSq;
    int i = this.aSs;
    this.aSs = (i + 1);
    arrayOff[i] = paramO;
  }

  private I qM()
  {
    synchronized (this.lock)
    {
      if (this.aSt == null);
      for (boolean bool = true; ; bool = false)
      {
        a.checkState(bool);
        if (this.aSr != 0)
          break;
        localObject2 = null;
        this.aSt = ((e)localObject2);
        localObject2 = this.aSt;
        return localObject2;
      }
      Object localObject2 = this.aSp;
      int i = this.aSr - 1;
      this.aSr = i;
      localObject2 = localObject2[i];
    }
  }

  private O qN()
  {
    synchronized (this.lock)
    {
      if (this.aSo.isEmpty())
      {
        localObject2 = null;
        return localObject2;
      }
      Object localObject2 = (f)this.aSo.removeFirst();
    }
  }

  private void qO()
  {
    if (qQ())
      this.lock.notify();
  }

  private boolean qQ()
  {
    if ((!this.aSn.isEmpty()) && (this.aSs > 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected abstract E a(I paramI, O paramO, boolean paramBoolean);

  protected void a(O paramO)
  {
    synchronized (this.lock)
    {
      b(paramO);
      qO();
      return;
    }
  }

  public final void flush()
  {
    synchronized (this.lock)
    {
      this.aSu = true;
      this.aSg = 0;
      if (this.aSt != null)
      {
        a(this.aSt);
        this.aSt = null;
      }
      if (!this.aSn.isEmpty())
        a((e)this.aSn.removeFirst());
    }
    while (!this.aSo.isEmpty())
      b((f)this.aSo.removeFirst());
  }

  final boolean qP()
  {
    synchronized (this.lock)
    {
      if ((!this.released) && (!qQ()))
        this.lock.wait();
    }
    if (this.released)
    {
      bool = false;
      return bool;
    }
    e locale = (e)this.aSn.removeFirst();
    Object localObject5 = this.aSq;
    int i = this.aSs - 1;
    this.aSs = i;
    localObject5 = localObject5[i];
    boolean bool = this.aSu;
    this.aSu = false;
    if (locale.qG())
      ((f)localObject5).dB(4);
    while (true)
    {
      synchronized (this.lock)
      {
        if (this.aSu)
        {
          b((f)localObject5);
          a(locale);
          bool = true;
          break;
          if (locale.qF())
            ((f)localObject5).dB(-2147483648);
          this.exception = a(locale, (f)localObject5, bool);
          if (this.exception == null)
            continue;
          synchronized (this.lock)
          {
            bool = false;
          }
          throw localObject3;
        }
        if (((f)localObject5).qF())
        {
          this.aSg += 1;
          b((f)localObject5);
        }
      }
      ((f)localObject5).aSg = this.aSg;
      this.aSg = 0;
      this.aSo.addLast(localObject5);
    }
  }

  protected abstract I qR();

  protected abstract O qS();

  public final void release()
  {
    synchronized (this.lock)
    {
      this.released = true;
      this.lock.notify();
    }
    try
    {
      this.aSm.join();
      return;
      localObject2 = finally;
      throw localObject2;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        Thread.currentThread().interrupt();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.b.g
 * JD-Core Version:    0.6.2
 */