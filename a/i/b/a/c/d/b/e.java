package a.i.b.a.c.d.b;

import a.a.aj;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.am;
import a.i.b.a.c.d.b.a.a.a;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.s;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.b.a.g;
import a.i.b.a.c.g.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

public final class e
{
  private static final Set<a.a> Brm;
  private static final Set<a.a> Brn;
  private static final g Bro;
  private static final g Brp;
  private static final g Brq;
  public static final e.a Brr;
  public a.i.b.a.c.j.a.i Brl;

  static
  {
    AppMethodBeat.i(120260);
    Brr = new e.a((byte)0);
    Brm = aj.setOf(a.a.Bsk);
    Brn = aj.setOf(new a.a[] { a.a.Bsl, a.a.Bso });
    Bro = new g(new int[] { 1, 1, 2 });
    Brp = new g(new int[] { 1, 1, 11 });
    Brq = new g(new int[] { 1, 1, 13 });
    AppMethodBeat.o(120260);
  }

  private static String[] a(n paramn, Set<? extends a.a> paramSet)
  {
    AppMethodBeat.i(120259);
    a.f.b.j.p(paramn, "kotlinClass");
    a.f.b.j.p(paramSet, "expectedKinds");
    a.i.b.a.c.d.b.a.a locala = paramn.dXA();
    String[] arrayOfString = locala.Bsf;
    paramn = arrayOfString;
    if (arrayOfString == null)
      paramn = locala.Bsg;
    if (paramn != null)
      if (paramSet.contains(locala.Bsc))
        AppMethodBeat.o(120259);
    while (true)
    {
      return paramn;
      AppMethodBeat.o(120259);
      paramn = null;
      continue;
      AppMethodBeat.o(120259);
      paramn = null;
    }
  }

  private final a.i.b.a.c.j.a.o<g> b(n paramn)
  {
    AppMethodBeat.i(120256);
    ecq();
    if (paramn.dXA().Bsd.ehy())
    {
      paramn = null;
      AppMethodBeat.o(120256);
    }
    while (true)
    {
      return paramn;
      paramn = new a.i.b.a.c.j.a.o((a.i.b.a.c.e.a.a)paramn.dXA().Bsd, (a.i.b.a.c.e.a.a)g.Byu, paramn.getLocation(), paramn.dWY());
      AppMethodBeat.o(120256);
    }
  }

  private final boolean c(n paramn)
  {
    AppMethodBeat.i(120257);
    if (this.Brl == null)
      a.f.b.j.avw("components");
    boolean bool;
    if (d(paramn))
    {
      bool = true;
      AppMethodBeat.o(120257);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(120257);
    }
  }

  private final boolean d(n paramn)
  {
    AppMethodBeat.i(120258);
    if (this.Brl == null)
      a.f.b.j.avw("components");
    boolean bool;
    if ((paramn.dXA().ecw()) && (a.f.b.j.j(paramn.dXA().Bsd, Brp)))
    {
      bool = true;
      AppMethodBeat.o(120258);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(120258);
    }
  }

  private final boolean ecq()
  {
    AppMethodBeat.i(120253);
    if (this.Brl == null)
      a.f.b.j.avw("components");
    AppMethodBeat.o(120253);
    return false;
  }

  public final a.i.b.a.c.i.e.h a(ab paramab, n paramn)
  {
    AppMethodBeat.i(120255);
    a.f.b.j.p(paramab, "descriptor");
    a.f.b.j.p(paramn, "kotlinClass");
    Object localObject1 = a(paramn, Brn);
    if (localObject1 == null)
    {
      AppMethodBeat.o(120255);
      paramab = null;
    }
    while (true)
    {
      return paramab;
      Object localObject2 = paramn.dXA().strings;
      if (localObject2 == null)
      {
        AppMethodBeat.o(120255);
        paramab = null;
      }
      else
      {
        try
        {
          localObject1 = a.i.b.a.c.e.b.a.j.e((String[])localObject1, (String[])localObject2);
          if (localObject1 == null)
          {
            AppMethodBeat.o(120255);
            paramab = null;
          }
        }
        catch (k localk)
        {
          localObject3 = new java/lang/IllegalStateException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("Could not read data from ");
          ((IllegalStateException)localObject3).<init>(paramn.getLocation(), (Throwable)localk);
          Throwable localThrowable1 = (Throwable)localObject3;
          AppMethodBeat.o(120255);
          throw localThrowable1;
        }
        catch (Throwable localThrowable2)
        {
          while (true)
          {
            ecq();
            if (paramn.dXA().Bsd.ehy())
            {
              AppMethodBeat.o(120255);
              throw localThrowable2;
            }
            locals = null;
          }
          localObject2 = (a.i.b.a.c.e.b.a.h)locals.first;
          a.s locals = (a.s)locals.second;
          Object localObject3 = new i(paramn, locals, (c)localObject2, b(paramn), c(paramn));
          localObject2 = (c)localObject2;
          paramn = (a.i.b.a.c.e.a.a)paramn.dXA().Bsd;
          a.i.b.a.c.j.a.a.e locale = (a.i.b.a.c.j.a.a.e)localObject3;
          localObject3 = this.Brl;
          if (localObject3 == null)
            a.f.b.j.avw("components");
          paramab = (a.i.b.a.c.i.e.h)new a.i.b.a.c.j.a.a.h(paramab, locals, (c)localObject2, paramn, locale, (a.i.b.a.c.j.a.i)localObject3, (a.f.a.a)e.b.Brs);
          AppMethodBeat.o(120255);
        }
      }
    }
  }

  public final a.i.b.a.c.j.a.e a(n paramn)
  {
    AppMethodBeat.i(120254);
    a.f.b.j.p(paramn, "kotlinClass");
    Object localObject1 = a(paramn, Brm);
    if (localObject1 == null)
    {
      AppMethodBeat.o(120254);
      paramn = null;
    }
    while (true)
    {
      return paramn;
      Object localObject2 = paramn.dXA().strings;
      if (localObject2 == null)
      {
        AppMethodBeat.o(120254);
        paramn = null;
      }
      else
      {
        try
        {
          localObject2 = a.i.b.a.c.e.b.a.j.d((String[])localObject1, (String[])localObject2);
          if (localObject2 == null)
          {
            AppMethodBeat.o(120254);
            paramn = null;
          }
        }
        catch (k localk)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>("Could not read data from ");
          ((IllegalStateException)localObject1).<init>(paramn.getLocation(), (Throwable)localk);
          Throwable localThrowable1 = (Throwable)localObject1;
          AppMethodBeat.o(120254);
          throw localThrowable1;
        }
        catch (Throwable localThrowable2)
        {
          while (true)
          {
            ecq();
            if (paramn.dXA().Bsd.ehy())
            {
              AppMethodBeat.o(120254);
              throw localThrowable2;
            }
            localp = null;
          }
          localObject1 = (a.i.b.a.c.e.b.a.h)localp.first;
          Object localObject3 = (a.c)localp.second;
          p localp = new p(paramn, b(paramn), c(paramn));
          paramn = new a.i.b.a.c.j.a.e((c)localObject1, (a.c)localObject3, (a.i.b.a.c.e.a.a)paramn.dXA().Bsd, (am)localp);
          AppMethodBeat.o(120254);
        }
      }
    }
  }

  public final a.i.b.a.c.j.a.i ecp()
  {
    AppMethodBeat.i(120252);
    a.i.b.a.c.j.a.i locali = this.Brl;
    if (locali == null)
      a.f.b.j.avw("components");
    AppMethodBeat.o(120252);
    return locali;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.e
 * JD-Core Version:    0.6.2
 */