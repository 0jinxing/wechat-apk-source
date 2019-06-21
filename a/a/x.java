package a.a;

import a.f.b.a.a;
import a.f.b.f;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/EmptySet;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "hashCode", "isEmpty", "iterator", "", "readResolve", "toString", "", "kotlin-stdlib"})
public final class x
  implements a, Serializable, Set
{
  public static final x AUR;

  static
  {
    AppMethodBeat.i(56169);
    AUR = new x();
    AppMethodBeat.o(56169);
  }

  private final Object readResolve()
  {
    return AUR;
  }

  public final boolean addAll(Collection paramCollection)
  {
    AppMethodBeat.i(56170);
    paramCollection = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56170);
    throw paramCollection;
  }

  public final void clear()
  {
    AppMethodBeat.i(56171);
    UnsupportedOperationException localUnsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56171);
    throw localUnsupportedOperationException;
  }

  public final boolean contains(Object paramObject)
  {
    AppMethodBeat.i(56167);
    if (!(paramObject instanceof Void))
      AppMethodBeat.o(56167);
    while (true)
    {
      return false;
      j.p((Void)paramObject, "element");
      AppMethodBeat.o(56167);
    }
  }

  public final boolean containsAll(Collection paramCollection)
  {
    AppMethodBeat.i(56168);
    j.p(paramCollection, "elements");
    boolean bool = paramCollection.isEmpty();
    AppMethodBeat.o(56168);
    return bool;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56166);
    boolean bool;
    if (((paramObject instanceof Set)) && (((Set)paramObject).isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(56166);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56166);
    }
  }

  public final int hashCode()
  {
    return 0;
  }

  public final boolean isEmpty()
  {
    return true;
  }

  public final Iterator iterator()
  {
    return (Iterator)u.AUO;
  }

  public final boolean remove(Object paramObject)
  {
    AppMethodBeat.i(56172);
    paramObject = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56172);
    throw paramObject;
  }

  public final boolean removeAll(Collection paramCollection)
  {
    AppMethodBeat.i(56173);
    paramCollection = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56173);
    throw paramCollection;
  }

  public final boolean retainAll(Collection paramCollection)
  {
    AppMethodBeat.i(56174);
    paramCollection = new UnsupportedOperationException("Operation is not supported for read-only collection");
    AppMethodBeat.o(56174);
    throw paramCollection;
  }

  public final Object[] toArray()
  {
    AppMethodBeat.i(56176);
    Object[] arrayOfObject = f.j(this);
    AppMethodBeat.o(56176);
    return arrayOfObject;
  }

  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    AppMethodBeat.i(56177);
    paramArrayOfT = f.a(this, paramArrayOfT);
    AppMethodBeat.o(56177);
    return paramArrayOfT;
  }

  public final String toString()
  {
    return "[]";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.a.x
 * JD-Core Version:    0.6.2
 */