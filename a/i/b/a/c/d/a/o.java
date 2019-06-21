package a.i.b.a.c.d.a;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.r;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o
{
  public static final a.i.b.a.c.f.b Blj;
  public static final a.i.b.a.c.f.a Blk;

  static
  {
    AppMethodBeat.i(119716);
    Blj = new a.i.b.a.c.f.b("kotlin.jvm.JvmField");
    Blk = a.i.b.a.c.f.a.n(new a.i.b.a.c.f.b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
    AppMethodBeat.o(119716);
  }

  public static boolean avH(String paramString)
  {
    AppMethodBeat.i(119710);
    boolean bool;
    if ((paramString.startsWith("get")) || (paramString.startsWith("is")))
    {
      bool = true;
      AppMethodBeat.o(119710);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119710);
    }
  }

  public static boolean avI(String paramString)
  {
    AppMethodBeat.i(119711);
    boolean bool = paramString.startsWith("set");
    AppMethodBeat.o(119711);
    return bool;
  }

  public static String avJ(String paramString)
  {
    AppMethodBeat.i(119712);
    if (avL(paramString))
      AppMethodBeat.o(119712);
    while (true)
    {
      return paramString;
      paramString = "get" + a.i.b.a.c.m.a.a.aws(paramString);
      AppMethodBeat.o(119712);
    }
  }

  public static String avK(String paramString)
  {
    AppMethodBeat.i(119713);
    StringBuilder localStringBuilder = new StringBuilder("set");
    if (avL(paramString));
    for (paramString = paramString.substring(2); ; paramString = a.i.b.a.c.m.a.a.aws(paramString))
    {
      paramString = paramString;
      AppMethodBeat.o(119713);
      return paramString;
    }
  }

  private static boolean avL(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(119714);
    if (!paramString.startsWith("is"))
      AppMethodBeat.o(119714);
    while (true)
    {
      return bool;
      if (paramString.length() == 2)
      {
        AppMethodBeat.o(119714);
      }
      else
      {
        int i = paramString.charAt(2);
        if ((97 > i) || (i > 122))
        {
          bool = true;
          AppMethodBeat.o(119714);
        }
        else
        {
          AppMethodBeat.o(119714);
        }
      }
    }
  }

  public static boolean d(ah paramah)
  {
    AppMethodBeat.i(119715);
    boolean bool;
    if (paramah.dYZ() == b.a.Bek)
    {
      AppMethodBeat.o(119715);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = paramah.dXW();
      if ((a.i.b.a.c.i.d.u((l)localObject)) && (a.i.b.a.c.i.d.B(((l)localObject).dXW())))
      {
        e locale = (e)localObject;
        localObject = a.i.b.a.c.a.d.AZQ;
        if (a.i.b.a.c.a.d.b(locale));
      }
      for (int i = 1; ; i = 0)
      {
        if (i == 0)
          break label92;
        AppMethodBeat.o(119715);
        bool = true;
        break;
      }
      label92: if (a.i.b.a.c.i.d.u(paramah.dXW()))
      {
        if ((paramah instanceof ah))
        {
          localObject = ((ah)paramah).dZM();
          if ((localObject == null) || (!((r)localObject).dYn().j(Blj)));
        }
        for (bool = true; ; bool = paramah.dYn().j(Blj))
        {
          if (!bool)
            break label176;
          AppMethodBeat.o(119715);
          bool = true;
          break;
        }
      }
      label176: AppMethodBeat.o(119715);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.o
 * JD-Core Version:    0.6.2
 */