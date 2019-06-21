package com.tencent.mm.kernel.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Modifier;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  private static final d eMG;
  private ConcurrentHashMap<Class<? extends a>, c> eME;
  public a eMF;

  static
  {
    AppMethodBeat.i(51936);
    eMG = new d();
    AppMethodBeat.o(51936);
  }

  public d()
  {
    AppMethodBeat.i(51931);
    this.eME = new ConcurrentHashMap();
    this.eMF = null;
    AppMethodBeat.o(51931);
  }

  public final void L(Class<? extends a> paramClass)
  {
    AppMethodBeat.i(51935);
    paramClass = (c)this.eME.remove(paramClass);
    if ((paramClass instanceof b))
      ((b)paramClass).SI();
    if (this.eMF != null)
      this.eMF.b(paramClass);
    AppMethodBeat.o(51935);
  }

  public final <T extends a> T U(Class<T> paramClass)
  {
    AppMethodBeat.i(51932);
    c localc = (c)this.eME.get(paramClass);
    if ((!paramClass.isInterface()) && (Modifier.isAbstract(paramClass.getModifiers())))
      ab.w("MicroMsg.ServiceHub", "Did you call service by using the service implementation class ?? Use interface class instead!! Carl is warning u!");
    for (int i = 1; ; i = 0)
    {
      if (localc != null);
      for (paramClass = localc.SJ(); ; paramClass = null)
      {
        if (this.eMF != null)
          this.eMF.a(paramClass);
        AppMethodBeat.o(51932);
        return paramClass;
        ab.e("MicroMsg.ServiceHub", "Service(%s) not found!!! ", new Object[] { paramClass });
        if (i != 0)
          ab.e("MicroMsg.ServiceHub", "This error must cause by using implementation class to call service! Use interface instead! Understand?");
      }
    }
  }

  public final <T extends a, N extends T> void a(Class<T> paramClass, N paramN)
  {
    AppMethodBeat.i(51933);
    b(paramClass, new e(paramN));
    AppMethodBeat.o(51933);
  }

  public final <T extends a, N extends T> void b(Class<T> paramClass, c<N> paramc)
  {
    AppMethodBeat.i(51934);
    this.eME.put(paramClass, paramc);
    if ((paramc instanceof b))
      ((b)paramc).SH();
    if (this.eMF != null)
      this.eMF.a(paramc);
    ab.i("MicroMsg.ServiceHub", "register service %s %s", new Object[] { paramClass, paramc });
    AppMethodBeat.o(51934);
  }

  public static abstract interface a
  {
    public abstract void a(a parama);

    public abstract void a(c paramc);

    public abstract void b(c paramc);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kernel.c.d
 * JD-Core Version:    0.6.2
 */