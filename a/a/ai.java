package a.a;

import a.h.d;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "delegate", "", "(Ljava/util/List;)V", "size", "", "getSize", "()I", "add", "", "index", "element", "(ILjava/lang/Object;)V", "clear", "get", "(I)Ljava/lang/Object;", "removeAt", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"})
public final class ai<T> extends c<T>
{
  private final List<T> AUU;

  public ai(List<T> paramList)
  {
    AppMethodBeat.i(56036);
    this.AUU = paramList;
    AppMethodBeat.o(56036);
  }

  public final void add(int paramInt, T paramT)
  {
    AppMethodBeat.i(56035);
    List localList = this.AUU;
    int i = size();
    if (paramInt < 0);
    while (i < paramInt)
    {
      paramT = (Throwable)new IndexOutOfBoundsException("Position index " + paramInt + " must be in range [" + new d(0, size()) + "].");
      AppMethodBeat.o(56035);
      throw paramT;
    }
    localList.add(size() - paramInt, paramT);
    AppMethodBeat.o(56035);
  }

  public final void clear()
  {
    AppMethodBeat.i(56032);
    this.AUU.clear();
    AppMethodBeat.o(56032);
  }

  public final T get(int paramInt)
  {
    AppMethodBeat.i(56031);
    Object localObject = this.AUU.get(r.w(this, paramInt));
    AppMethodBeat.o(56031);
    return localObject;
  }

  public final int getSize()
  {
    AppMethodBeat.i(56030);
    int i = this.AUU.size();
    AppMethodBeat.o(56030);
    return i;
  }

  public final T removeAt(int paramInt)
  {
    AppMethodBeat.i(56033);
    Object localObject = this.AUU.remove(r.w(this, paramInt));
    AppMethodBeat.o(56033);
    return localObject;
  }

  public final T set(int paramInt, T paramT)
  {
    AppMethodBeat.i(56034);
    paramT = this.AUU.set(r.w(this, paramInt), paramT);
    AppMethodBeat.o(56034);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.a.ai
 * JD-Core Version:    0.6.2
 */