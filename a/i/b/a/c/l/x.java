package a.i.b.a.c.l;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class x
{
  public static final x BJI;

  static
  {
    AppMethodBeat.i(122609);
    BJI = new x();
    AppMethodBeat.o(122609);
  }

  public static final ad a(g paramg, e parame, List<? extends ap> paramList)
  {
    AppMethodBeat.i(122607);
    j.p(paramg, "annotations");
    j.p(parame, "descriptor");
    j.p(paramList, "arguments");
    parame = parame.dXY();
    j.o(parame, "descriptor.typeConstructor");
    paramg = c(paramg, parame, paramList, false);
    AppMethodBeat.o(122607);
    return paramg;
  }

  public static final ad a(g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean, a.i.b.a.c.i.e.h paramh)
  {
    AppMethodBeat.i(122606);
    j.p(paramg, "annotations");
    j.p(paraman, "constructor");
    j.p(paramList, "arguments");
    j.p(paramh, "memberScope");
    paraman = new ae(paraman, paramList, paramBoolean, paramh);
    if (paramg.isEmpty())
    {
      paramg = (ad)paraman;
      AppMethodBeat.o(122606);
    }
    while (true)
    {
      return paramg;
      paramg = (ad)new d((ad)paraman, paramg);
      AppMethodBeat.o(122606);
    }
  }

  public static final az a(ad paramad1, ad paramad2)
  {
    AppMethodBeat.i(122608);
    j.p(paramad1, "lowerBound");
    j.p(paramad2, "upperBound");
    if (j.j(paramad1, paramad2))
    {
      paramad1 = (az)paramad1;
      AppMethodBeat.o(122608);
    }
    while (true)
    {
      return paramad1;
      paramad1 = (az)new r(paramad1, paramad2);
      AppMethodBeat.o(122608);
    }
  }

  public static final ad c(g paramg, an paraman, List<? extends ap> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(122605);
    j.p(paramg, "annotations");
    j.p(paraman, "constructor");
    j.p(paramList, "arguments");
    if ((paramg.isEmpty()) && (paramList.isEmpty()) && (!paramBoolean) && (paraman.dYs() != null))
    {
      paramg = paraman.dYs();
      if (paramg == null)
        j.dWJ();
      j.o(paramg, "constructor.declarationDescriptor!!");
      paramg = paramg.dZf();
      j.o(paramg, "constructor.declarationDescriptor!!.defaultType");
      AppMethodBeat.o(122605);
      return paramg;
    }
    Object localObject = paraman.dYs();
    if ((localObject instanceof ar))
      localObject = ((a.i.b.a.c.b.h)localObject).dZf().dXR();
    while (true)
    {
      paramg = a(paramg, paraman, paramList, paramBoolean, (a.i.b.a.c.i.e.h)localObject);
      AppMethodBeat.o(122605);
      break;
      if ((localObject instanceof e))
      {
        if (paramList.isEmpty())
        {
          localObject = ((e)localObject).dZf().dXR();
        }
        else
        {
          e locale = (e)localObject;
          localObject = ao.BJQ;
          localObject = locale.a(ao.a.a(paraman, paramList));
          j.o(localObject, "descriptor.getMemberScop…(constructor, arguments))");
        }
      }
      else
      {
        if (!(localObject instanceof aq))
          break label260;
        localObject = p.cw("Scope for abbreviation: " + ((aq)localObject).dZg(), true);
        j.o(localObject, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
      }
    }
    label260: paramg = (Throwable)new IllegalStateException("Unsupported classifier: " + localObject + " for constructor: " + paraman);
    AppMethodBeat.o(122605);
    throw paramg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.x
 * JD-Core Version:    0.6.2
 */