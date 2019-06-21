package kotlinx.coroutines.a;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/ArrayQueue;", "T", "", "()V", "elements", "", "[Ljava/lang/Object;", "head", "", "isEmpty", "", "()Z", "tail", "addLast", "", "element", "(Ljava/lang/Object;)V", "clear", "ensureCapacity", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"})
public final class b<T>
{
  private Object[] BRf;
  private int BRg;
  private int uBV;

  public b()
  {
    AppMethodBeat.i(118440);
    this.BRf = new Object[16];
    AppMethodBeat.o(118440);
  }

  private final void elF()
  {
    AppMethodBeat.i(118439);
    int i = this.BRf.length;
    Object[] arrayOfObject = new Object[i << 1];
    int j = this.BRf.length - this.BRg;
    a.a(this.BRf, this.BRg, arrayOfObject, 0, j);
    a.a(this.BRf, 0, arrayOfObject, j, this.BRg);
    this.BRf = arrayOfObject;
    this.BRg = 0;
    this.uBV = i;
    AppMethodBeat.o(118439);
  }

  public final void addLast(T paramT)
  {
    AppMethodBeat.i(118437);
    j.p(paramT, "element");
    this.BRf[this.uBV] = paramT;
    this.uBV = (this.uBV + 1 & this.BRf.length - 1);
    if (this.uBV == this.BRg)
      elF();
    AppMethodBeat.o(118437);
  }

  public final void clear()
  {
    this.BRg = 0;
    this.uBV = 0;
    this.BRf = new Object[this.BRf.length];
  }

  public final T elE()
  {
    Object localObject = null;
    AppMethodBeat.i(118438);
    if (this.BRg == this.uBV)
      AppMethodBeat.o(118438);
    while (true)
    {
      return localObject;
      localObject = this.BRf[this.BRg];
      this.BRf[this.BRg] = null;
      this.BRg = (this.BRg + 1 & this.BRf.length - 1);
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type T");
        AppMethodBeat.o(118438);
        throw ((Throwable)localObject);
      }
      AppMethodBeat.o(118438);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.b
 * JD-Core Version:    0.6.2
 */