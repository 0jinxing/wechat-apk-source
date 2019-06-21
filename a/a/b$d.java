package a.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.RandomAccess;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "list", "fromIndex", "", "toIndex", "(Lkotlin/collections/AbstractList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "kotlin-stdlib"})
final class b$d<E> extends b<E>
  implements RandomAccess
{
  private int AUE;
  private final b<E> AUF;
  private final int AUG;

  public b$d(b<? extends E> paramb, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(56205);
    this.AUF = paramb;
    this.AUG = paramInt1;
    paramInt1 = this.AUG;
    int i = this.AUF.size();
    if ((paramInt1 < 0) || (paramInt2 > i))
    {
      paramb = (Throwable)new IndexOutOfBoundsException("fromIndex: " + paramInt1 + ", toIndex: " + paramInt2 + ", size: " + i);
      AppMethodBeat.o(56205);
      throw paramb;
    }
    if (paramInt1 > paramInt2)
    {
      paramb = (Throwable)new IllegalArgumentException("fromIndex: " + paramInt1 + " > toIndex: " + paramInt2);
      AppMethodBeat.o(56205);
      throw paramb;
    }
    this.AUE = (paramInt2 - this.AUG);
    AppMethodBeat.o(56205);
  }

  public final E get(int paramInt)
  {
    AppMethodBeat.i(56204);
    int i = this.AUE;
    if ((paramInt < 0) || (paramInt >= i))
    {
      localObject = (Throwable)new IndexOutOfBoundsException("index: " + paramInt + ", size: " + i);
      AppMethodBeat.o(56204);
      throw ((Throwable)localObject);
    }
    Object localObject = this.AUF.get(this.AUG + paramInt);
    AppMethodBeat.o(56204);
    return localObject;
  }

  public final int getSize()
  {
    return this.AUE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.a.b.d
 * JD-Core Version:    0.6.2
 */