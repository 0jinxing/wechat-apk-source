package a.i.b.a.c.b;

import a.f.b.j;
import a.i.b.a.c.c.a.a;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.c;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.h;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q
{
  public static final e a(y paramy, b paramb, a parama)
  {
    AppMethodBeat.i(119267);
    j.p(paramy, "receiver$0");
    j.p(paramb, "fqName");
    j.p(parama, "lookupLocation");
    if (paramb.ByQ.ByV.isEmpty())
      AppMethodBeat.o(119267);
    for (paramy = null; ; paramy = (y)localObject1)
    {
      return paramy;
      localObject1 = paramb.ehG();
      j.o(localObject1, "fqName.parent()");
      localObject1 = paramy.g((b)localObject1).dXR();
      Object localObject2 = paramb.ByQ.ehK();
      j.o(localObject2, "fqName.shortName()");
      localObject2 = ((h)localObject1).c((f)localObject2, parama);
      localObject1 = localObject2;
      if (!(localObject2 instanceof e))
        localObject1 = null;
      localObject1 = (e)localObject1;
      if (localObject1 == null)
        break;
      AppMethodBeat.o(119267);
    }
    Object localObject1 = paramb.ehG();
    j.o(localObject1, "fqName.parent()");
    paramy = a(paramy, (b)localObject1, parama);
    if (paramy != null)
    {
      paramy = paramy.dZk();
      if (paramy != null)
      {
        paramb = paramb.ByQ.ehK();
        j.o(paramb, "fqName.shortName()");
      }
    }
    for (paramy = paramy.c(paramb, parama); ; paramy = null)
    {
      paramb = paramy;
      if (!(paramy instanceof e))
        paramb = null;
      paramy = (e)paramb;
      AppMethodBeat.o(119267);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.q
 * JD-Core Version:    0.6.2
 */