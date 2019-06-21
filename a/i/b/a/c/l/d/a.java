package a.i.b.a.c.l.d;

import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a<T>
{
  final T BLm;
  public final T BLn;

  public a(T paramT1, T paramT2)
  {
    this.BLm = paramT1;
    this.BLn = paramT2;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(122829);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((!j.j(this.BLm, paramObject.BLm)) || (!j.j(this.BLn, paramObject.BLn)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(122829);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122829);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(122828);
    Object localObject = this.BLm;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.BLn;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(122828);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122827);
    String str = "ApproximationBounds(lower=" + this.BLm + ", upper=" + this.BLn + ")";
    AppMethodBeat.o(122827);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.d.a
 * JD-Core Version:    0.6.2
 */