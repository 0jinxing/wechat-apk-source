package a.a;

import a.f.b.j;
import a.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"})
public abstract class b<E> extends a<E>
  implements a.f.b.a.a, List<E>
{
  public static final b.a AUC = new b.a((byte)0);

  public void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }

  public boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }

  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == (b)this)
      bool = true;
    while (true)
    {
      return bool;
      if (!(paramObject instanceof List))
      {
        bool = false;
      }
      else
      {
        Object localObject = (Collection)this;
        paramObject = (Collection)paramObject;
        j.p(localObject, "c");
        j.p(paramObject, "other");
        if (((Collection)localObject).size() != paramObject.size())
        {
          bool = false;
        }
        else
        {
          paramObject = paramObject.iterator();
          localObject = ((Collection)localObject).iterator();
          while (true)
            if (((Iterator)localObject).hasNext())
              if ((j.j(((Iterator)localObject).next(), paramObject.next()) ^ true))
              {
                bool = false;
                break;
              }
          bool = true;
        }
      }
    }
  }

  public abstract E get(int paramInt);

  public int hashCode()
  {
    Object localObject = (Collection)this;
    j.p(localObject, "c");
    int i = 1;
    Iterator localIterator = ((Collection)localObject).iterator();
    if (localIterator.hasNext())
    {
      localObject = localIterator.next();
      if (localObject != null);
      for (int j = localObject.hashCode(); ; j = 0)
      {
        i = j + i * 31;
        break;
      }
    }
    return i;
  }

  public int indexOf(Object paramObject)
  {
    int i = 0;
    Iterator localIterator = iterator();
    if (localIterator.hasNext())
      if (!j.j(localIterator.next(), paramObject));
    while (true)
    {
      return i;
      i++;
      break;
      i = -1;
    }
  }

  public Iterator<E> iterator()
  {
    return (Iterator)new b.b(this);
  }

  public int lastIndexOf(Object paramObject)
  {
    ListIterator localListIterator = listIterator(size());
    do
      if (!localListIterator.hasPrevious())
        break;
    while (!j.j(localListIterator.previous(), paramObject));
    for (int i = localListIterator.nextIndex(); ; i = -1)
      return i;
  }

  public ListIterator<E> listIterator()
  {
    return (ListIterator)new b.c(this, 0);
  }

  public ListIterator<E> listIterator(int paramInt)
  {
    return (ListIterator)new b.c(this, paramInt);
  }

  public E remove(int paramInt)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }

  public E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }

  public List<E> subList(int paramInt1, int paramInt2)
  {
    return (List)new b.d(this, paramInt1, paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.a.b
 * JD-Core Version:    0.6.2
 */