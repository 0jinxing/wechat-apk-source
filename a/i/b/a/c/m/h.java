package a.i.b.a.c.m;

import a.f.b.j;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.t;
import a.i.b.a.c.i.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;

final class h
  implements b
{
  public static final h BLG;
  private static final String description = "should not have varargs or parameters with default values";

  static
  {
    AppMethodBeat.i(122874);
    BLG = new h();
    description = "should not have varargs or parameters with default values";
    AppMethodBeat.o(122874);
  }

  public final String getDescription()
  {
    return description;
  }

  public final boolean h(t paramt)
  {
    AppMethodBeat.i(122873);
    j.p(paramt, "functionDescriptor");
    paramt = paramt.dYV();
    j.o(paramt, "functionDescriptor.valueParameters");
    paramt = (Iterable)paramt;
    int i;
    if ((!(paramt instanceof Collection)) || (!((Collection)paramt).isEmpty()))
    {
      Iterator localIterator = paramt.iterator();
      if (localIterator.hasNext())
      {
        paramt = (au)localIterator.next();
        j.o(paramt, "it");
        if ((!a.b(paramt)) && (paramt.dZV() == null))
        {
          i = 1;
          label98: if (i != 0)
            break label116;
          AppMethodBeat.o(122873);
        }
      }
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      i = 0;
      break label98;
      label116: break;
      AppMethodBeat.o(122873);
    }
  }

  public final String i(t paramt)
  {
    AppMethodBeat.i(122875);
    j.p(paramt, "functionDescriptor");
    paramt = b.a.a(this, paramt);
    AppMethodBeat.o(122875);
    return paramt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.h
 * JD-Core Version:    0.6.2
 */