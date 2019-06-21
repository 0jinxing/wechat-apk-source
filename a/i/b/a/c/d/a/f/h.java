package a.i.b.a.c.d.a.f;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h
{
  public final g BpP;
  public final boolean BpQ;

  public h(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(120109);
    this.BpP = paramg;
    this.BpQ = paramBoolean;
    AppMethodBeat.o(120109);
  }

  private static h a(g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(120110);
    j.p(paramg, "qualifier");
    paramg = new h(paramg, paramBoolean);
    AppMethodBeat.o(120110);
    return paramg;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(120114);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof h))
        break label69;
      paramObject = (h)paramObject;
      if (!j.j(this.BpP, paramObject.BpP))
        break label69;
      if (this.BpQ == paramObject.BpQ)
      {
        i = 1;
        if (i == 0)
          break label69;
      }
    }
    else
    {
      AppMethodBeat.o(120114);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label69: AppMethodBeat.o(120114);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(120113);
    g localg = this.BpP;
    if (localg != null);
    for (int i = localg.hashCode(); ; i = 0)
    {
      int j = this.BpQ;
      int k = j;
      if (j != 0)
        k = 1;
      AppMethodBeat.o(120113);
      return k + i * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(120112);
    String str = "NullabilityQualifierWithMigrationStatus(qualifier=" + this.BpP + ", isForWarningOnly=" + this.BpQ + ")";
    AppMethodBeat.o(120112);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.h
 * JD-Core Version:    0.6.2
 */