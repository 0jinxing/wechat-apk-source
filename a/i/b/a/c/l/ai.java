package a.i.b.a.c.l;

import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.i;
import a.i.b.a.c.b.l;
import a.i.b.a.c.i.c.a;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ai
{
  public static final w d(ar paramar)
  {
    AppMethodBeat.i(122636);
    a.f.b.j.p(paramar, "receiver$0");
    Object localObject1 = paramar.dXW();
    if (localObject1 == null)
    {
      paramar = new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
      AppMethodBeat.o(122636);
      throw paramar;
    }
    localObject1 = ((i)localObject1).dXY();
    a.f.b.j.o(localObject1, "classDescriptor.typeConstructor");
    localObject1 = ((an)localObject1).getParameters();
    a.f.b.j.o(localObject1, "classDescriptor.typeConstructor.parameters");
    Object localObject2 = (Iterable)localObject1;
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      ar localar = (ar)((Iterator)localObject2).next();
      a.f.b.j.o(localar, "it");
      ((Collection)localObject1).add(localar.dXY());
    }
    localObject1 = au.d((as)new ai.a((List)localObject1));
    localObject2 = paramar.dWP();
    a.f.b.j.o(localObject2, "this.upperBounds");
    localObject2 = ((au)localObject1).c((w)a.a.j.fJ((List)localObject2), ba.BKj);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      paramar = a.G((l)paramar).dXN();
      a.f.b.j.o(paramar, "builtIns.defaultBound");
      localObject1 = (w)paramar;
    }
    AppMethodBeat.o(122636);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.ai
 * JD-Core Version:    0.6.2
 */