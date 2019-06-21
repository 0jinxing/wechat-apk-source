package a.i.b.a.c.n;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class h$c<T>
  implements Iterator<T>
{
  private boolean BNt;

  protected abstract T ekB();

  protected abstract void ekC();

  public final boolean hasNext()
  {
    if (!this.BNt);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final T next()
  {
    if (this.BNt)
      throw new NoSuchElementException();
    this.BNt = true;
    ekC();
    return ekB();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.n.h.c
 * JD-Core Version:    0.6.2
 */