package a.i.b.a.c.d.a.f;

import a.f.b.j;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class p
{
  final w AYl;
  final d BqG;

  public p(w paramw, d paramd)
  {
    AppMethodBeat.i(120191);
    this.AYl = paramw;
    this.BqG = paramd;
    AppMethodBeat.o(120191);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(120194);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof p))
      {
        paramObject = (p)paramObject;
        if ((!j.j(this.AYl, paramObject.AYl)) || (!j.j(this.BqG, paramObject.BqG)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(120194);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(120194);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(120193);
    Object localObject = this.AYl;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.BqG;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(120193);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(120192);
    String str = "TypeAndDefaultQualifiers(type=" + this.AYl + ", defaultQualifiers=" + this.BqG + ")";
    AppMethodBeat.o(120192);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.p
 * JD-Core Version:    0.6.2
 */