package a.i;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"})
public final class q
{
  private static final q AVX;
  public static final q.a AVY;
  private final r AVV;
  private final o AVW;

  static
  {
    AppMethodBeat.i(56004);
    AVY = new q.a((byte)0);
    AVX = new q(null, null);
    AppMethodBeat.o(56004);
  }

  public q(r paramr, o paramo)
  {
    this.AVV = paramr;
    this.AVW = paramo;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56007);
    boolean bool;
    if (this != paramObject)
    {
      if ((paramObject instanceof q))
      {
        paramObject = (q)paramObject;
        if ((!j.j(this.AVV, paramObject.AVV)) || (!j.j(this.AVW, paramObject.AVW)));
      }
    }
    else
    {
      bool = true;
      AppMethodBeat.o(56007);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56007);
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(56006);
    Object localObject = this.AVV;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      localObject = this.AVW;
      if (localObject != null)
        i = localObject.hashCode();
      AppMethodBeat.o(56006);
      return j * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56005);
    String str = "KTypeProjection(variance=" + this.AVV + ", type=" + this.AVW + ")";
    AppMethodBeat.o(56005);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.q
 * JD-Core Version:    0.6.2
 */