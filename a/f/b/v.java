package a.f.b;

import a.i.b;
import a.i.d;
import a.i.e;
import a.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v
{
  private static final w AVF;
  private static final b[] AVG;

  static
  {
    AppMethodBeat.i(55882);
    try
    {
      w localw1 = (w)Class.forName("a.i.b.a.aa").newInstance();
      if (localw1 != null)
      {
        AVF = localw1;
        AVG = new b[0];
        AppMethodBeat.o(55882);
        return;
      }
    }
    catch (ClassCastException localClassCastException)
    {
      while (true)
        Object localObject1 = null;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
        Object localObject2 = null;
    }
    catch (InstantiationException localInstantiationException)
    {
      while (true)
        Object localObject3 = null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      while (true)
      {
        w localw2 = null;
        continue;
        localw2 = new w();
      }
    }
  }

  public static e a(i parami)
  {
    AppMethodBeat.i(55878);
    parami = AVF.a(parami);
    AppMethodBeat.o(55878);
    return parami;
  }

  public static a.i.h a(m paramm)
  {
    AppMethodBeat.i(55881);
    paramm = AVF.a(paramm);
    AppMethodBeat.o(55881);
    return paramm;
  }

  public static l a(q paramq)
  {
    AppMethodBeat.i(55879);
    paramq = AVF.a(paramq);
    AppMethodBeat.o(55879);
    return paramq;
  }

  public static a.i.m a(s params)
  {
    AppMethodBeat.i(55880);
    params = AVF.a(params);
    AppMethodBeat.o(55880);
    return params;
  }

  public static String a(h paramh)
  {
    AppMethodBeat.i(55877);
    paramh = AVF.a(paramh);
    AppMethodBeat.o(55877);
    return paramh;
  }

  public static String a(k paramk)
  {
    AppMethodBeat.i(55876);
    paramk = AVF.a(paramk);
    AppMethodBeat.o(55876);
    return paramk;
  }

  public static b aN(Class paramClass)
  {
    AppMethodBeat.i(55875);
    paramClass = AVF.aN(paramClass);
    AppMethodBeat.o(55875);
    return paramClass;
  }

  public static d f(Class paramClass, String paramString)
  {
    AppMethodBeat.i(55874);
    paramClass = AVF.f(paramClass, paramString);
    AppMethodBeat.o(55874);
    return paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.f.b.v
 * JD-Core Version:    0.6.2
 */