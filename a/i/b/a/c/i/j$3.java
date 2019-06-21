package a.i.b.a.c.i;

import a.i.b.a.c.l.a.c.a;
import a.i.b.a.c.l.an;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

final class j$3
  implements c.a
{
  j$3(j paramj, Map paramMap)
  {
  }

  public final boolean a(an paraman1, an paraman2)
  {
    AppMethodBeat.i(121996);
    boolean bool;
    if (j.a(this.BEp).a(paraman1, paraman2))
    {
      AppMethodBeat.o(121996);
      bool = true;
    }
    while (true)
    {
      return bool;
      an localan1 = (an)this.BEo.get(paraman1);
      an localan2 = (an)this.BEo.get(paraman2);
      if (((localan1 != null) && (localan1.equals(paraman2))) || ((localan2 != null) && (localan2.equals(paraman1))))
      {
        AppMethodBeat.o(121996);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(121996);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.j.3
 * JD-Core Version:    0.6.2
 */