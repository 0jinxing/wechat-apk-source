package a.i.b.a.c.g;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$a
{
  private final int number;
  private final Object object;

  g$a(Object paramObject, int paramInt)
  {
    this.object = paramObject;
    this.number = paramInt;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (!(paramObject instanceof a))
      bool2 = bool1;
    while (true)
    {
      return bool2;
      paramObject = (a)paramObject;
      bool2 = bool1;
      if (this.object == paramObject.object)
      {
        bool2 = bool1;
        if (this.number == paramObject.number)
          bool2 = true;
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(121491);
    int i = System.identityHashCode(this.object);
    int j = this.number;
    AppMethodBeat.o(121491);
    return i * 65535 + j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.g.g.a
 * JD-Core Version:    0.6.2
 */