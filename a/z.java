package a;

import a.f.a.a;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/UnsafeLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"})
public final class z<T>
  implements f<T>, Serializable
{
  private a<? extends T> AUr;
  private Object AUs;

  public z(a<? extends T> parama)
  {
    AppMethodBeat.i(56411);
    this.AUr = parama;
    this.AUs = w.AUx;
    AppMethodBeat.o(56411);
  }

  private final Object writeReplace()
  {
    AppMethodBeat.i(56410);
    d locald = new d(getValue());
    AppMethodBeat.o(56410);
    return locald;
  }

  public final T getValue()
  {
    AppMethodBeat.i(56408);
    if (this.AUs == w.AUx)
    {
      localObject = this.AUr;
      if (localObject == null)
        j.dWJ();
      this.AUs = ((a)localObject).invoke();
      this.AUr = null;
    }
    Object localObject = this.AUs;
    AppMethodBeat.o(56408);
    return localObject;
  }

  public final String toString()
  {
    AppMethodBeat.i(56409);
    int i;
    String str;
    if (this.AUs != w.AUx)
    {
      i = 1;
      if (i == 0)
        break label41;
      str = String.valueOf(getValue());
      AppMethodBeat.o(56409);
    }
    while (true)
    {
      return str;
      i = 0;
      break;
      label41: str = "Lazy value not initialized yet.";
      AppMethodBeat.o(56409);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.z
 * JD-Core Version:    0.6.2
 */