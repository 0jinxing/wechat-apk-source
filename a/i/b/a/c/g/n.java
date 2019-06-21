package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class n extends AbstractList<String>
  implements o, RandomAccess
{
  public static final o BAf;
  private final List<Object> list;

  static
  {
    AppMethodBeat.i(121566);
    BAf = new n().eiA();
    AppMethodBeat.o(121566);
  }

  public n()
  {
    AppMethodBeat.i(121551);
    this.list = new ArrayList();
    AppMethodBeat.o(121551);
  }

  public n(o paramo)
  {
    AppMethodBeat.i(121552);
    this.list = new ArrayList(paramo.size());
    addAll(paramo);
    AppMethodBeat.o(121552);
  }

  private static String dO(Object paramObject)
  {
    AppMethodBeat.i(121559);
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      AppMethodBeat.o(121559);
    }
    while (true)
    {
      return paramObject;
      if ((paramObject instanceof d))
      {
        paramObject = ((d)paramObject).dlY();
        AppMethodBeat.o(121559);
      }
      else
      {
        paramObject = j.cB((byte[])paramObject);
        AppMethodBeat.o(121559);
      }
    }
  }

  public final d UC(int paramInt)
  {
    AppMethodBeat.i(121558);
    Object localObject = this.list.get(paramInt);
    d locald;
    if ((localObject instanceof d))
      locald = (d)localObject;
    while (true)
    {
      if (locald != localObject)
        this.list.set(paramInt, locald);
      AppMethodBeat.o(121558);
      return locald;
      if ((localObject instanceof String))
        locald = d.awc((String)localObject);
      else
        locald = d.cx((byte[])localObject);
    }
  }

  public final boolean addAll(int paramInt, Collection<? extends String> paramCollection)
  {
    AppMethodBeat.i(121555);
    Object localObject = paramCollection;
    if ((paramCollection instanceof o))
      localObject = ((o)paramCollection).eiz();
    boolean bool = this.list.addAll(paramInt, (Collection)localObject);
    this.modCount += 1;
    AppMethodBeat.o(121555);
    return bool;
  }

  public final boolean addAll(Collection<? extends String> paramCollection)
  {
    AppMethodBeat.i(121554);
    boolean bool = addAll(size(), paramCollection);
    AppMethodBeat.o(121554);
    return bool;
  }

  public final void clear()
  {
    AppMethodBeat.i(121556);
    this.list.clear();
    this.modCount += 1;
    AppMethodBeat.o(121556);
  }

  public final void e(d paramd)
  {
    AppMethodBeat.i(121557);
    this.list.add(paramd);
    this.modCount += 1;
    AppMethodBeat.o(121557);
  }

  public final o eiA()
  {
    AppMethodBeat.i(121561);
    x localx = new x(this);
    AppMethodBeat.o(121561);
    return localx;
  }

  public final List<?> eiz()
  {
    AppMethodBeat.i(121560);
    List localList = Collections.unmodifiableList(this.list);
    AppMethodBeat.o(121560);
    return localList;
  }

  public final int size()
  {
    AppMethodBeat.i(121553);
    int i = this.list.size();
    AppMethodBeat.o(121553);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.n
 * JD-Core Version:    0.6.2
 */