package a.i.b.a.c.b;

import a.f.b.j;
import a.i.b.a.c.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class aa$a
{
  final a BcB;
  final List<Integer> BeJ;

  public aa$a(a parama, List<Integer> paramList)
  {
    AppMethodBeat.i(119280);
    this.BcB = parama;
    this.BeJ = paramList;
    AppMethodBeat.o(119280);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(119283);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((!j.j(this.BcB, paramObject.BcB)) || (!j.j(this.BeJ, paramObject.BeJ)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(119283);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119283);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(119282);
    Object localObject = this.BcB;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.BeJ;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(119282);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(119281);
    String str = "ClassRequest(classId=" + this.BcB + ", typeParametersCount=" + this.BeJ + ")";
    AppMethodBeat.o(119281);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.aa.a
 * JD-Core Version:    0.6.2
 */