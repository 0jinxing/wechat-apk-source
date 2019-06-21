package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class v$d extends AbstractSet<Map.Entry<K, V>>
{
  private v$d(v paramv)
  {
  }

  public final void clear()
  {
    AppMethodBeat.i(121641);
    this.BAG.clear();
    AppMethodBeat.o(121641);
  }

  public final boolean contains(Object paramObject)
  {
    AppMethodBeat.i(121639);
    Object localObject = (Map.Entry)paramObject;
    paramObject = this.BAG.get(((Map.Entry)localObject).getKey());
    localObject = ((Map.Entry)localObject).getValue();
    boolean bool;
    if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject))))
    {
      bool = true;
      AppMethodBeat.o(121639);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121639);
    }
  }

  public final Iterator<Map.Entry<K, V>> iterator()
  {
    AppMethodBeat.i(121637);
    v.c localc = new v.c(this.BAG, (byte)0);
    AppMethodBeat.o(121637);
    return localc;
  }

  public final boolean remove(Object paramObject)
  {
    AppMethodBeat.i(121640);
    paramObject = (Map.Entry)paramObject;
    boolean bool;
    if (contains(paramObject))
    {
      this.BAG.remove(paramObject.getKey());
      bool = true;
      AppMethodBeat.o(121640);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121640);
    }
  }

  public final int size()
  {
    AppMethodBeat.i(121638);
    int i = this.BAG.size();
    AppMethodBeat.o(121638);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.v.d
 * JD-Core Version:    0.6.2
 */