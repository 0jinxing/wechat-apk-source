package a.i.b.a.c.f;

import a.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public final class c
{
  private static final f ByS;
  private static final Pattern ByT;
  private static final a.f.a.b<String, f> ByU;
  public final String ByV;
  private transient b ByW;
  private transient c ByX;
  private transient f ByY;

  static
  {
    AppMethodBeat.i(121387);
    ByS = f.avZ("<root>");
    ByT = Pattern.compile("\\.");
    ByU = new c.1();
    AppMethodBeat.o(121387);
  }

  private c(String paramString)
  {
    this.ByV = paramString;
  }

  c(String paramString, b paramb)
  {
    this.ByV = paramString;
    this.ByW = paramb;
  }

  private c(String paramString, c paramc, f paramf)
  {
    this.ByV = paramString;
    this.ByX = paramc;
    this.ByY = paramf;
  }

  private void compute()
  {
    AppMethodBeat.i(121374);
    int i = this.ByV.lastIndexOf('.');
    if (i >= 0)
    {
      this.ByY = f.awa(this.ByV.substring(i + 1));
      this.ByX = new c(this.ByV.substring(0, i));
      AppMethodBeat.o(121374);
    }
    while (true)
    {
      return;
      this.ByY = f.awa(this.ByV);
      this.ByX = b.ByP.ByQ;
      AppMethodBeat.o(121374);
    }
  }

  public static c u(f paramf)
  {
    AppMethodBeat.i(121383);
    paramf = new c(paramf.name, b.ByP.ByQ, paramf);
    AppMethodBeat.o(121383);
    return paramf;
  }

  public final boolean ehH()
  {
    AppMethodBeat.i(121375);
    boolean bool;
    if ((this.ByW != null) || (this.ByV.indexOf('<') < 0))
    {
      bool = true;
      AppMethodBeat.o(121375);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121375);
    }
  }

  public final b ehI()
  {
    AppMethodBeat.i(121376);
    b localb;
    if (this.ByW != null)
    {
      localb = this.ByW;
      AppMethodBeat.o(121376);
    }
    while (true)
    {
      return localb;
      this.ByW = new b(this);
      localb = this.ByW;
      AppMethodBeat.o(121376);
    }
  }

  public final c ehJ()
  {
    AppMethodBeat.i(121377);
    Object localObject;
    if (this.ByX != null)
    {
      localObject = this.ByX;
      AppMethodBeat.o(121377);
    }
    while (true)
    {
      return localObject;
      if (this.ByV.isEmpty())
      {
        localObject = new IllegalStateException("root");
        AppMethodBeat.o(121377);
        throw ((Throwable)localObject);
      }
      compute();
      localObject = this.ByX;
      AppMethodBeat.o(121377);
    }
  }

  public final f ehK()
  {
    AppMethodBeat.i(121379);
    Object localObject;
    if (this.ByY != null)
    {
      localObject = this.ByY;
      AppMethodBeat.o(121379);
    }
    while (true)
    {
      return localObject;
      if (this.ByV.isEmpty())
      {
        localObject = new IllegalStateException("root");
        AppMethodBeat.o(121379);
        throw ((Throwable)localObject);
      }
      compute();
      localObject = this.ByY;
      AppMethodBeat.o(121379);
    }
  }

  public final f ehL()
  {
    AppMethodBeat.i(121380);
    f localf;
    if (this.ByV.isEmpty())
    {
      localf = ByS;
      AppMethodBeat.o(121380);
    }
    while (true)
    {
      return localf;
      localf = ehK();
      AppMethodBeat.o(121380);
    }
  }

  public final List<f> ehM()
  {
    AppMethodBeat.i(121381);
    List localList;
    if (this.ByV.isEmpty())
    {
      localList = Collections.emptyList();
      AppMethodBeat.o(121381);
    }
    while (true)
    {
      return localList;
      localList = e.a(ByT.split(this.ByV), ByU);
      AppMethodBeat.o(121381);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(121385);
    if (this == paramObject)
      AppMethodBeat.o(121385);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof c))
      {
        AppMethodBeat.o(121385);
        bool = false;
      }
      else
      {
        paramObject = (c)paramObject;
        if (!this.ByV.equals(paramObject.ByV))
        {
          AppMethodBeat.o(121385);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(121385);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(121386);
    int i = this.ByV.hashCode();
    AppMethodBeat.o(121386);
    return i;
  }

  public final boolean r(f paramf)
  {
    AppMethodBeat.i(121382);
    int i = this.ByV.indexOf('.');
    boolean bool;
    if (!this.ByV.isEmpty())
    {
      String str = this.ByV;
      paramf = paramf.name;
      int j = i;
      if (i == -1)
        j = this.ByV.length();
      if (str.regionMatches(0, paramf, 0, j))
      {
        bool = true;
        AppMethodBeat.o(121382);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(121382);
      bool = false;
    }
  }

  public final c t(f paramf)
  {
    AppMethodBeat.i(121378);
    if (this.ByV.isEmpty());
    for (String str = paramf.name; ; str = this.ByV + "." + paramf.name)
    {
      paramf = new c(str, this, paramf);
      AppMethodBeat.o(121378);
      return paramf;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(121384);
    String str;
    if (this.ByV.isEmpty())
    {
      str = ByS.name;
      AppMethodBeat.o(121384);
    }
    while (true)
    {
      return str;
      str = this.ByV;
      AppMethodBeat.o(121384);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.f.c
 * JD-Core Version:    0.6.2
 */