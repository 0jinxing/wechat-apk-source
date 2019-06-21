package a.i.b.a.c.f;

import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public final b BcW;
  public final b ByN;
  public final boolean ByO;

  static
  {
    AppMethodBeat.i(121362);
    if (!a.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(121362);
      return;
    }
  }

  public a(b paramb1, b paramb2, boolean paramBoolean)
  {
    AppMethodBeat.i(121349);
    this.BcW = paramb1;
    if ((!$assertionsDisabled) && (paramb2.ByQ.ByV.isEmpty()))
    {
      paramb2 = new StringBuilder("Class name must not be root: ").append(paramb1);
      if (paramBoolean);
      for (paramb1 = " (local)"; ; paramb1 = "")
      {
        paramb1 = new AssertionError(paramb1);
        AppMethodBeat.o(121349);
        throw paramb1;
      }
    }
    this.ByN = paramb2;
    this.ByO = paramBoolean;
    AppMethodBeat.o(121349);
  }

  public a(b paramb, f paramf)
  {
    this(paramb, b.s(paramf), false);
    AppMethodBeat.i(121350);
    AppMethodBeat.o(121350);
  }

  public static a avW(String paramString)
  {
    AppMethodBeat.i(121356);
    paramString = cv(paramString, false);
    AppMethodBeat.o(121356);
    return paramString;
  }

  public static a cv(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(121357);
    String str = m.jg(paramString, "").replace('/', '.');
    paramString = m.a(paramString, '/', paramString);
    paramString = new a(new b(str), new b(paramString), paramBoolean);
    AppMethodBeat.o(121357);
    return paramString;
  }

  public static a n(b paramb)
  {
    AppMethodBeat.i(121348);
    paramb = new a(paramb.ehG(), paramb.ByQ.ehK());
    AppMethodBeat.o(121348);
    return paramb;
  }

  public final f ehB()
  {
    AppMethodBeat.i(138678);
    f localf = this.ByN.ByQ.ehK();
    AppMethodBeat.o(138678);
    return localf;
  }

  public final a ehC()
  {
    AppMethodBeat.i(121353);
    Object localObject = this.ByN.ehG();
    if (((b)localObject).ByQ.ByV.isEmpty())
    {
      localObject = null;
      AppMethodBeat.o(121353);
    }
    while (true)
    {
      return localObject;
      localObject = new a(this.BcW, (b)localObject, this.ByO);
      AppMethodBeat.o(121353);
    }
  }

  public final boolean ehD()
  {
    AppMethodBeat.i(121354);
    boolean bool;
    if (!this.ByN.ehG().ByQ.ByV.isEmpty())
    {
      bool = true;
      AppMethodBeat.o(121354);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121354);
    }
  }

  public final b ehE()
  {
    AppMethodBeat.i(121355);
    b localb;
    if (this.BcW.ByQ.ByV.isEmpty())
    {
      localb = this.ByN;
      AppMethodBeat.o(121355);
    }
    while (true)
    {
      return localb;
      localb = new b(this.BcW.ByQ.ByV + "." + this.ByN.ByQ.ByV);
      AppMethodBeat.o(121355);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(121359);
    if (this == paramObject)
      AppMethodBeat.o(121359);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(121359);
        bool = false;
      }
      else
      {
        paramObject = (a)paramObject;
        if ((this.BcW.equals(paramObject.BcW)) && (this.ByN.equals(paramObject.ByN)) && (this.ByO == paramObject.ByO))
        {
          AppMethodBeat.o(121359);
        }
        else
        {
          AppMethodBeat.o(121359);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(121360);
    int i = this.BcW.hashCode();
    int j = this.ByN.hashCode();
    int k = Boolean.valueOf(this.ByO).hashCode();
    AppMethodBeat.o(121360);
    return (i * 31 + j) * 31 + k;
  }

  public final a p(f paramf)
  {
    AppMethodBeat.i(121352);
    paramf = new a(this.BcW, this.ByN.q(paramf), this.ByO);
    AppMethodBeat.o(121352);
    return paramf;
  }

  public final String pq()
  {
    AppMethodBeat.i(121358);
    String str;
    if (this.BcW.ByQ.ByV.isEmpty())
    {
      str = this.ByN.ByQ.ByV;
      AppMethodBeat.o(121358);
    }
    while (true)
    {
      return str;
      str = this.BcW.ByQ.ByV.replace('.', '/') + "/" + this.ByN.ByQ.ByV;
      AppMethodBeat.o(121358);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(121361);
    String str;
    if (this.BcW.ByQ.ByV.isEmpty())
    {
      str = "/" + pq();
      AppMethodBeat.o(121361);
    }
    while (true)
    {
      return str;
      str = pq();
      AppMethodBeat.o(121361);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.f.a
 * JD-Core Version:    0.6.2
 */