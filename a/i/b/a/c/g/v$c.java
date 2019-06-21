package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class v$c
  implements Iterator<Map.Entry<K, V>>
{
  private boolean BAH;
  private Iterator<Map.Entry<K, V>> BAI;
  private int pos = -1;

  private v$c(v paramv)
  {
  }

  private Iterator<Map.Entry<K, V>> eiM()
  {
    AppMethodBeat.i(121635);
    if (this.BAI == null)
      this.BAI = v.c(this.BAG).entrySet().iterator();
    Iterator localIterator = this.BAI;
    AppMethodBeat.o(121635);
    return localIterator;
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(121633);
    boolean bool;
    if ((this.pos + 1 < v.b(this.BAG).size()) || (eiM().hasNext()))
    {
      bool = true;
      AppMethodBeat.o(121633);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121633);
    }
  }

  public final void remove()
  {
    AppMethodBeat.i(121634);
    Object localObject;
    if (!this.BAH)
    {
      localObject = new IllegalStateException("remove() was called before next()");
      AppMethodBeat.o(121634);
      throw ((Throwable)localObject);
    }
    this.BAH = false;
    v.a(this.BAG);
    if (this.pos < v.b(this.BAG).size())
    {
      localObject = this.BAG;
      int i = this.pos;
      this.pos = (i - 1);
      v.a((v)localObject, i);
      AppMethodBeat.o(121634);
    }
    while (true)
    {
      return;
      eiM().remove();
      AppMethodBeat.o(121634);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.v.c
 * JD-Core Version:    0.6.2
 */