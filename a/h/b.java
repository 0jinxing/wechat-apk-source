package a.h;

import a.d.c;
import a.f.b.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"})
public class b
  implements a, Iterable<Integer>
{
  public static final b.a AVL;
  public final int AVJ;
  public final int AVK;
  public final int hzv;

  static
  {
    AppMethodBeat.i(56000);
    AVL = new b.a((byte)0);
    AppMethodBeat.o(56000);
  }

  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(55999);
    if (paramInt3 == 0)
    {
      localThrowable = (Throwable)new IllegalArgumentException("Step must be non-zero.");
      AppMethodBeat.o(55999);
      throw localThrowable;
    }
    if (paramInt3 == -2147483648)
    {
      localThrowable = (Throwable)new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
      AppMethodBeat.o(55999);
      throw localThrowable;
    }
    this.AVJ = paramInt1;
    int i;
    if (paramInt3 > 0)
      if (paramInt1 >= paramInt2)
        i = paramInt2;
    while (true)
    {
      this.AVK = i;
      this.hzv = paramInt3;
      AppMethodBeat.o(55999);
      return;
      i = paramInt2 - c.aO(paramInt2, paramInt1, paramInt3);
      continue;
      if (paramInt3 >= 0)
        break;
      i = paramInt2;
      if (paramInt1 > paramInt2)
        i = paramInt2 + c.aO(paramInt1, paramInt2, -paramInt3);
    }
    Throwable localThrowable = (Throwable)new IllegalArgumentException("Step is zero.");
    AppMethodBeat.o(55999);
    throw localThrowable;
  }

  public boolean equals(Object paramObject)
  {
    AppMethodBeat.i(55996);
    boolean bool;
    if (((paramObject instanceof b)) && (((isEmpty()) && (((b)paramObject).isEmpty())) || ((this.AVJ == ((b)paramObject).AVJ) && (this.AVK == ((b)paramObject).AVK) && (this.hzv == ((b)paramObject).hzv))))
    {
      bool = true;
      AppMethodBeat.o(55996);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55996);
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(55997);
    int i;
    if (isEmpty())
    {
      i = -1;
      AppMethodBeat.o(55997);
    }
    while (true)
    {
      return i;
      i = (this.AVJ * 31 + this.AVK) * 31 + this.hzv;
      AppMethodBeat.o(55997);
    }
  }

  public boolean isEmpty()
  {
    boolean bool = true;
    if (this.hzv > 0)
      if (this.AVJ <= this.AVK);
    while (true)
    {
      return bool;
      bool = false;
      continue;
      if (this.AVJ >= this.AVK)
        bool = false;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(55998);
    String str;
    if (this.hzv > 0)
    {
      str = this.AVJ + ".." + this.AVK + " step " + this.hzv;
      AppMethodBeat.o(55998);
    }
    while (true)
    {
      return str;
      str = this.AVJ + " downTo " + this.AVK + " step " + -this.hzv;
      AppMethodBeat.o(55998);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.h.b
 * JD-Core Version:    0.6.2
 */