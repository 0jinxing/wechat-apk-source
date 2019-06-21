package a.i.b.a.c.d.a;

import a.i.b.a.c.b.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class a$b
{
  public final c Bkl;
  private final int Bkm;

  public a$b(c paramc, int paramInt)
  {
    AppMethodBeat.i(119646);
    this.Bkl = paramc;
    this.Bkm = paramInt;
    AppMethodBeat.o(119646);
  }

  private final boolean a(a.a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(119645);
    if ((this.Bkm & 1 << parama.ordinal()) != 0)
      AppMethodBeat.o(119645);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119645);
    }
  }

  public final List<a.a> eaP()
  {
    AppMethodBeat.i(119644);
    Object localObject = a.a.values();
    Collection localCollection = (Collection)new ArrayList();
    int i = localObject.length;
    int j = 0;
    if (j < i)
    {
      a.a locala = localObject[j];
      b localb = (b)this;
      if ((localb.a(a.a.Bkj)) || (localb.a(locala)));
      for (int k = 1; ; k = 0)
      {
        if (k != 0)
          localCollection.add(locala);
        j++;
        break;
      }
    }
    localObject = (List)localCollection;
    AppMethodBeat.o(119644);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.a.b
 * JD-Core Version:    0.6.2
 */