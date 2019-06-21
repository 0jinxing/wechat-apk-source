package a.i.b.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a<E>
  implements Iterable<E>
{
  private static final a<Object> BNy;
  public final a<E> BNz;
  public final E first;
  public final int size;

  static
  {
    AppMethodBeat.i(122989);
    BNy = new a();
    AppMethodBeat.o(122989);
  }

  private a()
  {
    this.size = 0;
    this.first = null;
    this.BNz = null;
  }

  private a(E paramE, a<E> parama)
  {
    AppMethodBeat.i(122981);
    this.first = paramE;
    this.BNz = parama;
    parama.size += 1;
    AppMethodBeat.o(122981);
  }

  private Iterator<E> US(int paramInt)
  {
    AppMethodBeat.i(122984);
    a.a locala = new a.a(UU(paramInt));
    AppMethodBeat.o(122984);
    return locala;
  }

  private a<E> UU(int paramInt)
  {
    AppMethodBeat.i(122988);
    Object localObject = this;
    while (true)
    {
      if ((paramInt < 0) || (paramInt > ((a)localObject).size))
      {
        localObject = new IndexOutOfBoundsException();
        AppMethodBeat.o(122988);
        throw ((Throwable)localObject);
      }
      if (paramInt == 0)
      {
        AppMethodBeat.o(122988);
        return localObject;
      }
      localObject = ((a)localObject).BNz;
      paramInt--;
    }
  }

  private a<E> ea(Object paramObject)
  {
    AppMethodBeat.i(122986);
    if (this.size == 0)
    {
      AppMethodBeat.o(122986);
      paramObject = this;
    }
    while (true)
    {
      return paramObject;
      if (this.first.equals(paramObject))
      {
        paramObject = this.BNz;
        AppMethodBeat.o(122986);
      }
      else
      {
        paramObject = this.BNz.ea(paramObject);
        if (paramObject == this.BNz)
        {
          AppMethodBeat.o(122986);
          paramObject = this;
        }
        else
        {
          paramObject = new a(this.first, paramObject);
          AppMethodBeat.o(122986);
        }
      }
    }
  }

  public static <E> a<E> ekE()
  {
    return BNy;
  }

  private E get(int paramInt)
  {
    AppMethodBeat.i(122982);
    Object localObject;
    if ((paramInt < 0) || (paramInt > this.size))
    {
      localObject = new IndexOutOfBoundsException();
      AppMethodBeat.o(122982);
      throw ((Throwable)localObject);
    }
    try
    {
      localObject = US(paramInt).next();
      AppMethodBeat.o(122982);
      return localObject;
    }
    catch (NoSuchElementException localNoSuchElementException)
    {
      IndexOutOfBoundsException localIndexOutOfBoundsException = new IndexOutOfBoundsException("Index: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(122982);
      throw localIndexOutOfBoundsException;
    }
  }

  public final a<E> UT(int paramInt)
  {
    AppMethodBeat.i(122987);
    a locala = ea(get(paramInt));
    AppMethodBeat.o(122987);
    return locala;
  }

  public final a<E> dZ(E paramE)
  {
    AppMethodBeat.i(122985);
    paramE = new a(paramE, this);
    AppMethodBeat.o(122985);
    return paramE;
  }

  public final Iterator<E> iterator()
  {
    AppMethodBeat.i(122983);
    Iterator localIterator = US(0);
    AppMethodBeat.o(122983);
    return localIterator;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.d.a
 * JD-Core Version:    0.6.2
 */