package a.i.b.a.c.d.a.f;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c<T>
{
  final g BpA;
  final T result;

  public c(T paramT, g paramg)
  {
    this.result = paramT;
    this.BpA = paramg;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(120093);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof c))
      {
        paramObject = (c)paramObject;
        if ((!j.j(this.result, paramObject.result)) || (!j.j(this.BpA, paramObject.BpA)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(120093);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(120093);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(120092);
    Object localObject = this.result;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.BpA;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(120092);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(120091);
    String str = "EnhancementResult(result=" + this.result + ", enhancementAnnotations=" + this.BpA + ")";
    AppMethodBeat.o(120091);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.c
 * JD-Core Version:    0.6.2
 */