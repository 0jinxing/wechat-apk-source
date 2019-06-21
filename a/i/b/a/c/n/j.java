package a.i.b.a.c.n;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j
{
  private static final Object AYw;
  public static volatile boolean BNx;

  static
  {
    AppMethodBeat.i(122978);
    AYw = new j.1();
    BNx = false;
    AppMethodBeat.o(122978);
  }

  public static <V> Object dW(V paramV)
  {
    Object localObject = paramV;
    if (paramV == null)
      localObject = AYw;
    return localObject;
  }

  public static <V> V dX(Object paramObject)
  {
    AppMethodBeat.i(122976);
    paramObject = dY(paramObject);
    if (paramObject == AYw)
    {
      paramObject = null;
      AppMethodBeat.o(122976);
    }
    while (true)
    {
      return paramObject;
      AppMethodBeat.o(122976);
    }
  }

  public static <V> V dY(Object paramObject)
  {
    AppMethodBeat.i(122977);
    if ((paramObject instanceof j.a))
    {
      paramObject = ((j.a)paramObject).xEP;
      if ((BNx) && (c.r(paramObject)))
      {
        paramObject = new j.b(paramObject);
        AppMethodBeat.o(122977);
        throw paramObject;
      }
      a.f.b.j.p(paramObject, "e");
      AppMethodBeat.o(122977);
      throw paramObject;
    }
    AppMethodBeat.o(122977);
    return paramObject;
  }

  public static Object s(Throwable paramThrowable)
  {
    AppMethodBeat.i(122975);
    paramThrowable = new j.a(paramThrowable, (byte)0);
    AppMethodBeat.o(122975);
    return paramThrowable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.j
 * JD-Core Version:    0.6.2
 */