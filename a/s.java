package a;

import a.f.a.a;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/SynchronizedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "lock", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/Object;)V", "_value", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "kotlin-stdlib"})
final class s<T>
  implements f<T>, Serializable
{
  private a<? extends T> AUr;
  private volatile Object AUs;
  private final Object lock;

  private s(a<? extends T> parama)
  {
    AppMethodBeat.i(56256);
    this.AUr = parama;
    this.AUs = w.AUx;
    this.lock = this;
    AppMethodBeat.o(56256);
  }

  private final Object writeReplace()
  {
    AppMethodBeat.i(56255);
    d locald = new d(getValue());
    AppMethodBeat.o(56255);
    return locald;
  }

  public final T getValue()
  {
    AppMethodBeat.i(56253);
    Object localObject1 = this.AUs;
    if (localObject1 != w.AUx)
      AppMethodBeat.o(56253);
    while (true)
    {
      return localObject1;
      synchronized (this.lock)
      {
        localObject1 = this.AUs;
        w localw = w.AUx;
        if (localObject1 != localw)
        {
          AppMethodBeat.o(56253);
          continue;
        }
        localObject1 = this.AUr;
        if (localObject1 == null)
          j.dWJ();
        localObject1 = ((a)localObject1).invoke();
        this.AUs = localObject1;
        this.AUr = null;
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(56254);
    int i;
    String str;
    if (this.AUs != w.AUx)
    {
      i = 1;
      if (i == 0)
        break label41;
      str = String.valueOf(getValue());
      AppMethodBeat.o(56254);
    }
    while (true)
    {
      return str;
      i = 0;
      break;
      label41: str = "Lazy value not initialized yet.";
      AppMethodBeat.o(56254);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.s
 * JD-Core Version:    0.6.2
 */