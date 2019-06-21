package a;

import a.f.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/SafePublicationLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initializer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "_value", "", "final", "value", "getValue", "()Ljava/lang/Object;", "isInitialized", "", "toString", "", "writeReplace", "Companion", "kotlin-stdlib"})
final class r<T>
  implements f<T>, Serializable
{
  private static final AtomicReferenceFieldUpdater<r<?>, Object> AUu;
  public static final r.a AUv;
  private volatile a<? extends T> AUr;
  private volatile Object AUs;
  private final Object AUt;

  static
  {
    AppMethodBeat.i(55912);
    AUv = new r.a((byte)0);
    AUu = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "AUs");
    AppMethodBeat.o(55912);
  }

  public r(a<? extends T> parama)
  {
    AppMethodBeat.i(55911);
    this.AUr = parama;
    this.AUs = w.AUx;
    this.AUt = w.AUx;
    AppMethodBeat.o(55911);
  }

  private final Object writeReplace()
  {
    AppMethodBeat.i(55910);
    d locald = new d(getValue());
    AppMethodBeat.o(55910);
    return locald;
  }

  public final T getValue()
  {
    AppMethodBeat.i(55908);
    Object localObject = this.AUs;
    if (localObject != w.AUx)
      AppMethodBeat.o(55908);
    while (true)
    {
      return localObject;
      localObject = this.AUr;
      if (localObject != null)
      {
        localObject = ((a)localObject).invoke();
        if (AUu.compareAndSet(this, w.AUx, localObject))
        {
          this.AUr = null;
          AppMethodBeat.o(55908);
        }
      }
      else
      {
        localObject = this.AUs;
        AppMethodBeat.o(55908);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(55909);
    int i;
    String str;
    if (this.AUs != w.AUx)
    {
      i = 1;
      if (i == 0)
        break label41;
      str = String.valueOf(getValue());
      AppMethodBeat.o(55909);
    }
    while (true)
    {
      return str;
      i = 0;
      break;
      label41: str = "Lazy value not initialized yet.";
      AppMethodBeat.o(55909);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.r
 * JD-Core Version:    0.6.2
 */