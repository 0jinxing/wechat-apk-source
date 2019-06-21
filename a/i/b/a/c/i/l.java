package a.i.b.a.c.i;

import a.aa;
import a.f.b.j;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;

public final class l
{
  public static final b n(Collection<? extends b> paramCollection)
  {
    AppMethodBeat.i(122041);
    j.p(paramCollection, "descriptors");
    if (!paramCollection.isEmpty());
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramCollection = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(122041);
      throw paramCollection;
    }
    Iterator localIterator = paramCollection.iterator();
    paramCollection = null;
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (paramCollection == null)
      {
        paramCollection = localb;
      }
      else
      {
        Integer localInteger = ay.b(paramCollection.dYf(), localb.dYf());
        if ((localInteger == null) || (localInteger.intValue() >= 0))
          break label143;
        paramCollection = localb;
      }
    }
    label143: 
    while (true)
    {
      break;
      if (paramCollection == null)
        j.dWJ();
      AppMethodBeat.o(122041);
      return paramCollection;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.l
 * JD-Core Version:    0.6.2
 */