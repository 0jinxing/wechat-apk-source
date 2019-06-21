package a.i.b.a.c.n;

import TT;;
import a.a.ad;
import a.a.e;
import a.f.b.j;
import a.f.b.z;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class i<T> extends AbstractSet<T>
{
  private static final int BNu = 5;
  public static final i.b BNv;
  private Object data;
  private int size;

  static
  {
    AppMethodBeat.i(122972);
    BNv = new i.b((byte)0);
    BNu = 5;
    AppMethodBeat.o(122972);
  }

  public static final <T> i<T> ekD()
  {
    AppMethodBeat.i(122973);
    i locali = i.b.ekD();
    AppMethodBeat.o(122973);
    return locali;
  }

  public final boolean add(T paramT)
  {
    AppMethodBeat.i(122970);
    boolean bool;
    if (size() == 0)
    {
      this.data = paramT;
      this.size = (size() + 1);
      AppMethodBeat.o(122970);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (size() == 1)
      {
        if (j.j(this.data, paramT))
        {
          AppMethodBeat.o(122970);
          bool = false;
          continue;
        }
        this.data = new Object[] { this.data, paramT };
        break;
      }
      Object localObject;
      if (size() < BNu)
      {
        localObject = this.data;
        if (localObject == null)
        {
          paramT = new v("null cannot be cast to non-null type kotlin.Array<T>");
          AppMethodBeat.o(122970);
          throw paramT;
        }
        localObject = (Object[])localObject;
        if (e.contains((Object[])localObject, paramT))
        {
          AppMethodBeat.o(122970);
          bool = false;
        }
        else
        {
          if (size() == BNu - 1)
          {
            localObject = Arrays.copyOf((Object[])localObject, localObject.length);
            j.p(localObject, "elements");
            localObject = (LinkedHashSet)e.a((Object[])localObject, (Collection)new LinkedHashSet(ad.SI(localObject.length)));
            ((LinkedHashSet)localObject).add(paramT);
          }
          for (paramT = (TT)localObject; ; paramT = (TT)localObject)
          {
            this.data = paramT;
            break;
            localObject = Arrays.copyOf((Object[])localObject, size() + 1);
            localObject[(localObject.length - 1)] = paramT;
          }
        }
      }
      else
      {
        localObject = this.data;
        if (localObject == null)
        {
          paramT = new v("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
          AppMethodBeat.o(122970);
          throw paramT;
        }
        if (z.dr(localObject).add(paramT))
          break;
        AppMethodBeat.o(122970);
        bool = false;
      }
    }
  }

  public final void clear()
  {
    this.data = null;
    this.size = 0;
  }

  public final boolean contains(Object paramObject)
  {
    AppMethodBeat.i(122971);
    boolean bool;
    if (size() == 0)
    {
      bool = false;
      AppMethodBeat.o(122971);
    }
    while (true)
    {
      return bool;
      if (size() == 1)
      {
        bool = j.j(this.data, paramObject);
        AppMethodBeat.o(122971);
      }
      else
      {
        Object localObject;
        if (size() < BNu)
        {
          localObject = this.data;
          if (localObject == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.Array<T>");
            AppMethodBeat.o(122971);
            throw paramObject;
          }
          bool = e.contains((Object[])localObject, paramObject);
          AppMethodBeat.o(122971);
        }
        else
        {
          localObject = this.data;
          if (localObject == null)
          {
            paramObject = new v("null cannot be cast to non-null type kotlin.collections.Set<T>");
            AppMethodBeat.o(122971);
            throw paramObject;
          }
          bool = ((Set)localObject).contains(paramObject);
          AppMethodBeat.o(122971);
        }
      }
    }
  }

  public final Iterator<T> iterator()
  {
    AppMethodBeat.i(122969);
    Object localObject;
    if (size() == 0)
    {
      localObject = Collections.emptySet().iterator();
      AppMethodBeat.o(122969);
    }
    while (true)
    {
      return localObject;
      if (size() == 1)
      {
        localObject = (Iterator)new i.c(this.data);
        AppMethodBeat.o(122969);
      }
      else if (size() < BNu)
      {
        localObject = this.data;
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type kotlin.Array<T>");
          AppMethodBeat.o(122969);
          throw ((Throwable)localObject);
        }
        localObject = (Iterator)new i.a((Object[])localObject);
        AppMethodBeat.o(122969);
      }
      else
      {
        localObject = this.data;
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type kotlin.collections.MutableSet<T>");
          AppMethodBeat.o(122969);
          throw ((Throwable)localObject);
        }
        localObject = z.dr(localObject).iterator();
        AppMethodBeat.o(122969);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.i
 * JD-Core Version:    0.6.2
 */