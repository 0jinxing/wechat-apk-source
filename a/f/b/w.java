package a.f.b;

import a.i.b;
import a.i.d;
import a.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class w
{
  public a.i.e a(i parami)
  {
    return parami;
  }

  public a.i.h a(m paramm)
  {
    return paramm;
  }

  public l a(q paramq)
  {
    return paramq;
  }

  public a.i.m a(s params)
  {
    return params;
  }

  public String a(h paramh)
  {
    AppMethodBeat.i(55891);
    paramh = paramh.getClass().getGenericInterfaces()[0].toString();
    if (paramh.startsWith("kotlin.jvm.functions."))
    {
      paramh = paramh.substring(21);
      AppMethodBeat.o(55891);
    }
    while (true)
    {
      return paramh;
      AppMethodBeat.o(55891);
    }
  }

  public String a(k paramk)
  {
    AppMethodBeat.i(55890);
    paramk = a(paramk);
    AppMethodBeat.o(55890);
    return paramk;
  }

  public b aN(Class paramClass)
  {
    AppMethodBeat.i(55889);
    paramClass = new e(paramClass);
    AppMethodBeat.o(55889);
    return paramClass;
  }

  public d f(Class paramClass, String paramString)
  {
    AppMethodBeat.i(55888);
    paramClass = new o(paramClass, paramString);
    AppMethodBeat.o(55888);
    return paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.f.b.w
 * JD-Core Version:    0.6.2
 */