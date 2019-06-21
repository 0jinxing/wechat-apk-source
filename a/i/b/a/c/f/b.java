package a.i.b.a.c.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public static final b ByP;
  public final c ByQ;
  private transient b ByR;

  static
  {
    AppMethodBeat.i(121372);
    ByP = new b("");
    AppMethodBeat.o(121372);
  }

  public b(c paramc)
  {
    this.ByQ = paramc;
  }

  private b(c paramc, b paramb)
  {
    this.ByQ = paramc;
    this.ByR = paramb;
  }

  public b(String paramString)
  {
    AppMethodBeat.i(121363);
    this.ByQ = new c(paramString, this);
    AppMethodBeat.o(121363);
  }

  public static b s(f paramf)
  {
    AppMethodBeat.i(121368);
    paramf = new b(c.u(paramf));
    AppMethodBeat.o(121368);
    return paramf;
  }

  public final boolean ehF()
  {
    AppMethodBeat.i(138679);
    boolean bool = this.ByQ.ByV.isEmpty();
    AppMethodBeat.o(138679);
    return bool;
  }

  public final b ehG()
  {
    AppMethodBeat.i(121365);
    Object localObject;
    if (this.ByR != null)
    {
      localObject = this.ByR;
      AppMethodBeat.o(121365);
    }
    while (true)
    {
      return localObject;
      if (ehF())
      {
        localObject = new IllegalStateException("root");
        AppMethodBeat.o(121365);
        throw ((Throwable)localObject);
      }
      this.ByR = new b(this.ByQ.ehJ());
      localObject = this.ByR;
      AppMethodBeat.o(121365);
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(121370);
    if (this == paramObject)
      AppMethodBeat.o(121370);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof b))
      {
        AppMethodBeat.o(121370);
        bool = false;
      }
      else
      {
        paramObject = (b)paramObject;
        if (!this.ByQ.equals(paramObject.ByQ))
        {
          AppMethodBeat.o(121370);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(121370);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(121371);
    int i = this.ByQ.hashCode();
    AppMethodBeat.o(121371);
    return i;
  }

  public final b q(f paramf)
  {
    AppMethodBeat.i(121366);
    paramf = new b(this.ByQ.t(paramf), this);
    AppMethodBeat.o(121366);
    return paramf;
  }

  public final boolean r(f paramf)
  {
    AppMethodBeat.i(121367);
    boolean bool = this.ByQ.r(paramf);
    AppMethodBeat.o(121367);
    return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(121369);
    String str = this.ByQ.toString();
    AppMethodBeat.o(121369);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.f.b
 * JD-Core Version:    0.6.2
 */