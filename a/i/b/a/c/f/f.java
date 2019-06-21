package a.i.b.a.c.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
  implements Comparable<f>
{
  public final boolean ByZ;
  public final String name;

  private f(String paramString, boolean paramBoolean)
  {
    this.name = paramString;
    this.ByZ = paramBoolean;
  }

  public static f avX(String paramString)
  {
    AppMethodBeat.i(121393);
    paramString = new f(paramString, false);
    AppMethodBeat.o(121393);
    return paramString;
  }

  public static boolean avY(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(121394);
    if ((paramString.isEmpty()) || (paramString.startsWith("<")))
      AppMethodBeat.o(121394);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= paramString.length())
          break label78;
        int j = paramString.charAt(i);
        if ((j == 46) || (j == 47) || (j == 92))
        {
          AppMethodBeat.o(121394);
          break;
        }
      }
      label78: bool = true;
      AppMethodBeat.o(121394);
    }
  }

  public static f avZ(String paramString)
  {
    AppMethodBeat.i(121395);
    if (!paramString.startsWith("<"))
    {
      paramString = new IllegalArgumentException("special name must start with '<': ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(121395);
      throw paramString;
    }
    paramString = new f(paramString, true);
    AppMethodBeat.o(121395);
    return paramString;
  }

  public static f awa(String paramString)
  {
    AppMethodBeat.i(121396);
    if (paramString.startsWith("<"))
    {
      paramString = avZ(paramString);
      AppMethodBeat.o(121396);
    }
    while (true)
    {
      return paramString;
      paramString = avX(paramString);
      AppMethodBeat.o(121396);
    }
  }

  public final String ehN()
  {
    AppMethodBeat.i(121391);
    if (this.ByZ)
    {
      localObject = new IllegalStateException("not identifier: ".concat(String.valueOf(this)));
      AppMethodBeat.o(121391);
      throw ((Throwable)localObject);
    }
    Object localObject = this.name;
    AppMethodBeat.o(121391);
    return localObject;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(121397);
    if (this == paramObject)
      AppMethodBeat.o(121397);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof f))
      {
        AppMethodBeat.o(121397);
        bool = false;
      }
      else
      {
        paramObject = (f)paramObject;
        if (this.ByZ != paramObject.ByZ)
        {
          AppMethodBeat.o(121397);
          bool = false;
        }
        else if (!this.name.equals(paramObject.name))
        {
          AppMethodBeat.o(121397);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(121397);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(121398);
    int i = this.name.hashCode();
    if (this.ByZ);
    for (int j = 1; ; j = 0)
    {
      AppMethodBeat.o(121398);
      return j + i * 31;
    }
  }

  public final String toString()
  {
    return this.name;
  }

  public final int v(f paramf)
  {
    AppMethodBeat.i(121392);
    int i = this.name.compareTo(paramf.name);
    AppMethodBeat.o(121392);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.f.f
 * JD-Core Version:    0.6.2
 */