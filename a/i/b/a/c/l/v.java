package a.i.b.a.c.l;

import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.i.e.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class v
  implements an
{
  public final Set<w> BJH;
  private final int aBR;

  static
  {
    AppMethodBeat.i(122604);
    if (!v.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(122604);
      return;
    }
  }

  public v(Collection<w> paramCollection)
  {
    AppMethodBeat.i(122598);
    if ((!$assertionsDisabled) && (paramCollection.isEmpty()))
    {
      paramCollection = new AssertionError("Attempt to create an empty intersection");
      AppMethodBeat.o(122598);
      throw paramCollection;
    }
    this.BJH = new LinkedHashSet(paramCollection);
    this.aBR = this.BJH.hashCode();
    AppMethodBeat.o(122598);
  }

  public final a.i.b.a.c.b.h dYs()
  {
    return null;
  }

  public final boolean dYu()
  {
    return false;
  }

  public final g dZD()
  {
    AppMethodBeat.i(122601);
    g localg = ((w)this.BJH.iterator().next()).ejw().dZD();
    AppMethodBeat.o(122601);
    return localg;
  }

  public final Collection<w> eap()
  {
    return this.BJH;
  }

  public final a.i.b.a.c.i.e.h ekm()
  {
    AppMethodBeat.i(122600);
    a.i.b.a.c.i.e.h localh = m.a("member scope for intersection type ".concat(String.valueOf(this)), this.BJH);
    AppMethodBeat.o(122600);
    return localh;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(122603);
    if (this == paramObject)
      AppMethodBeat.o(122603);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(122603);
        bool = false;
      }
      else
      {
        paramObject = (v)paramObject;
        if (this.BJH != null)
        {
          if (this.BJH.equals(paramObject.BJH));
        }
        else
          while (paramObject.BJH != null)
          {
            AppMethodBeat.o(122603);
            bool = false;
            break;
          }
        AppMethodBeat.o(122603);
      }
    }
  }

  public final List<ar> getParameters()
  {
    AppMethodBeat.i(122599);
    List localList = Collections.emptyList();
    AppMethodBeat.o(122599);
    return localList;
  }

  public int hashCode()
  {
    return this.aBR;
  }

  public String toString()
  {
    AppMethodBeat.i(122602);
    Object localObject1 = this.BJH;
    Object localObject2 = new StringBuilder("{");
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      ((StringBuilder)localObject2).append(((w)((Iterator)localObject1).next()).toString());
      if (((Iterator)localObject1).hasNext())
        ((StringBuilder)localObject2).append(" & ");
    }
    ((StringBuilder)localObject2).append("}");
    localObject2 = ((StringBuilder)localObject2).toString();
    AppMethodBeat.o(122602);
    return localObject2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.v
 * JD-Core Version:    0.6.2
 */