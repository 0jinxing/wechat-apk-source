package com.tencent.mm.vending.app;

import android.content.Context;
import android.os.Looper;
import com.tencent.mm.vending.base.Vending;
import com.tencent.mm.vending.e.b;
import com.tencent.mm.vending.h.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a
  implements b
{
  Map<Class, a.a> c = new ConcurrentHashMap();
  byte[] d = new byte[0];
  private AtomicBoolean f = new AtomicBoolean(false);
  volatile boolean g = false;
  Context j;
  private com.tencent.mm.vending.e.c zWX = new com.tencent.mm.vending.e.c();
  public com.tencent.mm.vending.e.c<Vending> zWY = new com.tencent.mm.vending.e.c();
  com.tencent.mm.vending.base.a<Object> zXc = new a.1(this);
  Map<Class, com.tencent.mm.vending.b.c<a.b>> zXd = new HashMap();
  public com.tencent.mm.vending.d.a zXe;

  public a()
  {
    this.zWY.keep(this.zXc);
    this.zXc.addVendingDataResolvedCallback(new a.2(this));
  }

  private void c()
  {
    if ((Looper.myLooper() == this.zXc.getLooper()) && (!this.f.get()))
      com.tencent.mm.vending.f.a.e("Vending.Interactor", "This interactor has not call onCreate() yet! Interactor : %s", new Object[] { this });
  }

  protected final <_Struct> void a(Class<_Struct> paramClass, a.a<_Struct> parama)
  {
    c();
    this.c.put(paramClass, parama);
  }

  public final <_Struct> void a(Class<_Struct> paramClass, a.b<_Struct> paramb)
  {
    com.tencent.mm.vending.b.c localc = (com.tencent.mm.vending.b.c)this.zXd.get(paramClass);
    Object localObject = localc;
    if (localc == null)
    {
      localObject = new a.3(this, d.zYp);
      this.zXd.put(paramClass, localObject);
    }
    ((com.tencent.mm.vending.b.c)localObject).aD(paramb);
    paramClass = this.zXc.peek(paramClass);
    if (paramClass != null)
      paramb.bj(paramClass);
  }

  public final void aG(Class<?> paramClass)
  {
    c();
    this.zXc.request(paramClass);
  }

  public void keep(com.tencent.mm.vending.e.a parama)
  {
    this.zWX.keep(parama);
  }

  protected void onCreate()
  {
    this.f.set(true);
  }

  protected void onDestroy()
  {
    this.zWX.dead();
    this.zWY.dead();
  }

  public final <_Struct> _Struct x(Class<_Struct> paramClass)
  {
    c();
    if ((Looper.myLooper() == Looper.getMainLooper()) && (!this.g));
    synchronized (this.d)
    {
      boolean bool = this.g;
      if (!bool);
      try
      {
        this.d.wait();
        return this.zXc.get(paramClass);
      }
      catch (InterruptedException localInterruptedException)
      {
        while (true)
          com.tencent.mm.vending.f.a.printErrStackTrace("Vending.Interactor", localInterruptedException, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.app.a
 * JD-Core Version:    0.6.2
 */