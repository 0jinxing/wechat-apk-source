package a.a;

import a.h.d;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"kotlin/collections/ArraysKt___ArraysJvmKt$asList$3", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Integer;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"})
public final class h$a extends b<Integer>
  implements RandomAccess
{
  h$a(int[] paramArrayOfInt)
  {
  }

  public final boolean contains(Object paramObject)
  {
    AppMethodBeat.i(56215);
    boolean bool;
    if (!(paramObject instanceof Integer))
    {
      bool = false;
      AppMethodBeat.o(56215);
    }
    while (true)
    {
      return bool;
      int i = ((Number)paramObject).intValue();
      bool = e.contains(this.AUI, i);
      AppMethodBeat.o(56215);
    }
  }

  public final int getSize()
  {
    return this.AUI.length;
  }

  public final int indexOf(Object paramObject)
  {
    AppMethodBeat.i(56217);
    int i;
    if (!(paramObject instanceof Integer))
    {
      i = -1;
      AppMethodBeat.o(56217);
    }
    while (true)
    {
      return i;
      i = ((Number)paramObject).intValue();
      i = e.k(this.AUI, i);
      AppMethodBeat.o(56217);
    }
  }

  public final boolean isEmpty()
  {
    if (this.AUI.length == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int lastIndexOf(Object paramObject)
  {
    AppMethodBeat.i(56218);
    int i;
    if (!(paramObject instanceof Integer))
    {
      AppMethodBeat.o(56218);
      i = -1;
    }
    while (true)
    {
      return i;
      int j = ((Number)paramObject).intValue();
      paramObject = this.AUI;
      a.f.b.j.p(paramObject, "receiver$0");
      a.f.b.j.p(paramObject, "receiver$0");
      Iterator localIterator = j.l((Iterable)new d(0, e.J(paramObject))).iterator();
      while (true)
        if (localIterator.hasNext())
        {
          i = ((Number)localIterator.next()).intValue();
          if (j == paramObject[i])
          {
            AppMethodBeat.o(56218);
            break;
          }
        }
      AppMethodBeat.o(56218);
      i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.a.h.a
 * JD-Core Version:    0.6.2
 */