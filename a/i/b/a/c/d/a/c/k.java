package a.i.b.a.c.d.a.c;

import a.f.b.j;
import a.i.b.a.c.d.a.a.a;
import a.i.b.a.c.d.a.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;

public final class k
{
  public final h BnC;
  public final Collection<a.a> BnD;

  public k(h paramh, Collection<? extends a.a> paramCollection)
  {
    AppMethodBeat.i(119846);
    this.BnC = paramh;
    this.BnD = paramCollection;
    AppMethodBeat.o(119846);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(119849);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof k))
      {
        paramObject = (k)paramObject;
        if ((!j.j(this.BnC, paramObject.BnC)) || (!j.j(this.BnD, paramObject.BnD)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(119849);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119849);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(119848);
    Object localObject = this.BnC;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.BnD;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(119848);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(119847);
    String str = "NullabilityQualifierWithApplicability(nullabilityQualifier=" + this.BnC + ", qualifierApplicabilityTypes=" + this.BnD + ")";
    AppMethodBeat.o(119847);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.k
 * JD-Core Version:    0.6.2
 */