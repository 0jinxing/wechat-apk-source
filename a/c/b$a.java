package a.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"})
final class b$a
  implements Serializable
{
  public static final a AVa;
  private final e[] AUZ;

  static
  {
    AppMethodBeat.i(56372);
    AVa = new a((byte)0);
    AppMethodBeat.o(56372);
  }

  public b$a(e[] paramArrayOfe)
  {
    AppMethodBeat.i(56371);
    this.AUZ = paramArrayOfe;
    AppMethodBeat.o(56371);
  }

  private final Object readResolve()
  {
    AppMethodBeat.i(56370);
    e[] arrayOfe = this.AUZ;
    Object localObject = f.AVg;
    int i = arrayOfe.length;
    for (int j = 0; j < i; j++)
    {
      e locale = arrayOfe[j];
      localObject = ((e)localObject).plus(locale);
    }
    AppMethodBeat.o(56370);
    return localObject;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.c.b.a
 * JD-Core Version:    0.6.2
 */