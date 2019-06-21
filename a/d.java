package a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/InitializedLazyImpl;", "T", "Lkotlin/Lazy;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "isInitialized", "", "toString", "", "kotlin-stdlib"})
public final class d<T>
  implements f<T>, Serializable
{
  private final T value;

  public d(T paramT)
  {
    this.value = paramT;
  }

  public final T getValue()
  {
    return this.value;
  }

  public final String toString()
  {
    AppMethodBeat.i(56015);
    String str = String.valueOf(getValue());
    AppMethodBeat.o(56015);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.d
 * JD-Core Version:    0.6.2
 */