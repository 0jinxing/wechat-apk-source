package a.i.b.a.c.e.a;

import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.aa.c;
import a.i.b.a.c.e.a.ag;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h
{
  private final List<a.aa> sBc;

  public h(a.ag paramag)
  {
    AppMethodBeat.i(121096);
    Object localObject = paramag.BvM;
    Collection localCollection;
    if (paramag.efN())
    {
      int i = paramag.BvN;
      paramag = paramag.BvM;
      a.f.b.j.o(paramag, "typeTable.typeList");
      paramag = (Iterable)paramag;
      localCollection = (Collection)new ArrayList(a.a.j.d(paramag));
      int j = 0;
      Iterator localIterator = paramag.iterator();
      while (localIterator.hasNext())
      {
        paramag = localIterator.next();
        if (j < 0)
          a.a.j.dWs();
        localObject = (a.aa)paramag;
        paramag = (a.ag)localObject;
        if (j >= i)
          paramag = ((a.aa)localObject).efk().rN(true).efs();
        localCollection.add(paramag);
        j++;
      }
    }
    for (paramag = (List)localCollection; ; paramag = (a.ag)localObject)
    {
      this.sBc = paramag;
      AppMethodBeat.o(121096);
      return;
      a.f.b.j.o(localObject, "originalTypes");
    }
  }

  public final a.aa Uk(int paramInt)
  {
    AppMethodBeat.i(121095);
    a.aa localaa = (a.aa)this.sBc.get(paramInt);
    AppMethodBeat.o(121095);
    return localaa;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.h
 * JD-Core Version:    0.6.2
 */