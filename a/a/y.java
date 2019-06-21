package a.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/IndexedValue;", "T", "", "index", "", "value", "(ILjava/lang/Object;)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "equals", "", "other", "hashCode", "toString", "", "kotlin-stdlib"})
public final class y<T>
{
  public final int index;
  public final T value;

  public y(int paramInt, T paramT)
  {
    this.index = paramInt;
    this.value = paramT;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(56159);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof y))
        break label69;
      paramObject = (y)paramObject;
      if (this.index == paramObject.index)
      {
        i = 1;
        if ((i == 0) || (!j.j(this.value, paramObject.value)))
          break label69;
      }
    }
    else
    {
      AppMethodBeat.o(56159);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label69: AppMethodBeat.o(56159);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(56158);
    int i = this.index;
    Object localObject = this.value;
    if (localObject != null);
    for (int j = localObject.hashCode(); ; j = 0)
    {
      AppMethodBeat.o(56158);
      return j + i * 31;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56157);
    String str = "IndexedValue(index=" + this.index + ", value=" + this.value + ")";
    AppMethodBeat.o(56157);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.a.y
 * JD-Core Version:    0.6.2
 */