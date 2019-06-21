package a.i.b.a.c.a.b;

import a.f.b.j;
import a.i.b.a.c.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$a
{
  public final a Bdr;
  final a Bds;
  final a Bdt;

  public c$a(a parama1, a parama2, a parama3)
  {
    AppMethodBeat.i(119172);
    this.Bdr = parama1;
    this.Bds = parama2;
    this.Bdt = parama3;
    AppMethodBeat.o(119172);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(119175);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((!j.j(this.Bdr, paramObject.Bdr)) || (!j.j(this.Bds, paramObject.Bds)) || (!j.j(this.Bdt, paramObject.Bdt)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(119175);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119175);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(119174);
    a locala = this.Bdr;
    int j;
    if (locala != null)
    {
      j = locala.hashCode();
      locala = this.Bds;
      if (locala == null)
        break label73;
    }
    label73: for (int k = locala.hashCode(); ; k = 0)
    {
      locala = this.Bdt;
      if (locala != null)
        i = locala.hashCode();
      AppMethodBeat.o(119174);
      return (k + j * 31) * 31 + i;
      j = 0;
      break;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(119173);
    String str = "PlatformMutabilityMapping(javaClass=" + this.Bdr + ", kotlinReadOnly=" + this.Bds + ", kotlinMutable=" + this.Bdt + ")";
    AppMethodBeat.o(119173);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.b.c.a
 * JD-Core Version:    0.6.2
 */