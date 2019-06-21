package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class en
  implements dj, dq
{
  private static en a;
  private Map<String, dk> b;
  private ek c;
  private Runnable d;
  private Runnable e;

  static
  {
    AppMethodBeat.i(98808);
    a = new en();
    AppMethodBeat.o(98808);
  }

  private en()
  {
    AppMethodBeat.i(98798);
    this.b = new ConcurrentHashMap();
    this.d = new ep(this);
    this.e = new eq(this);
    Object localObject = new dp();
    this.b.put(((dk)localObject).b(), localObject);
    localObject = new dn();
    this.b.put(((dk)localObject).b(), localObject);
    localObject = new dl();
    this.b.put(((dk)localObject).b(), localObject);
    localObject = this.d;
    if ((!bt.g()) && (bt.f))
    {
      cm.a().a((Runnable)localObject);
      cm.a().b((Runnable)localObject, 30000L);
    }
    localObject = this.e;
    if ((!bt.g()) && (bt.f))
    {
      cm.a().a((Runnable)localObject);
      cm.a().b((Runnable)localObject, 30000L);
    }
    AppMethodBeat.o(98798);
  }

  public static en d()
  {
    return a;
  }

  public final void a()
  {
    AppMethodBeat.i(98802);
    this.c.a();
    AppMethodBeat.o(98802);
  }

  public final void a(int paramInt)
  {
    AppMethodBeat.i(98804);
    bt.j().post(new eo(this, paramInt));
    AppMethodBeat.o(98804);
  }

  public final void a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(98807);
    Object localObject = this.d;
    long l = ce.a.a("app_ipc_timertask_gap", 0, 3600000, 60000);
    if ((!bt.g()) && (bt.f))
    {
      cm.a().a((Runnable)localObject);
      cm.a().b((Runnable)localObject, l);
    }
    localObject = this.b.values().iterator();
    while (((Iterator)localObject).hasNext())
      ((dk)((Iterator)localObject).next()).a(paramString1, paramString2);
    AppMethodBeat.o(98807);
  }

  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    AppMethodBeat.i(98806);
    Object localObject = this.e;
    long l = ce.a.a("app_ipc_timertask_gap", 0, 3600000, 60000);
    if ((!bt.g()) && (bt.f))
    {
      cm.a().a((Runnable)localObject);
      cm.a().b((Runnable)localObject, l);
    }
    localObject = this.b.values().iterator();
    while (((Iterator)localObject).hasNext())
      ((dk)((Iterator)localObject).next()).a(paramString1, paramArrayOfByte, paramString2);
    AppMethodBeat.o(98806);
  }

  public final void b()
  {
    AppMethodBeat.i(98803);
    this.c.b();
    AppMethodBeat.o(98803);
  }

  public final void c()
  {
    AppMethodBeat.i(98805);
    Iterator localIterator = this.b.values().iterator();
    while (localIterator.hasNext())
      ((dk)localIterator.next()).c();
    AppMethodBeat.o(98805);
  }

  public final el e()
  {
    AppMethodBeat.i(98799);
    el localel = (el)this.b.get("settings");
    AppMethodBeat.o(98799);
    return localel;
  }

  public final cd f()
  {
    AppMethodBeat.i(98800);
    cd localcd = (cd)this.b.get("accessscheduler");
    AppMethodBeat.o(98800);
    return localcd;
  }

  public final void g()
  {
    AppMethodBeat.i(98801);
    if (bt.g())
      this.c = em.d();
    this.c.a(this);
    this.c.e();
    AppMethodBeat.o(98801);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.en
 * JD-Core Version:    0.6.2
 */