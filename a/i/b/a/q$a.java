package a.i.b.a;

import a.i.m.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "T", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "property", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "invoke", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflect-api"})
public final class q$a<T, R> extends s.c<R>
  implements m.a<T, R>
{
  private final q<T, R> AXT;

  public q$a(q<T, ? extends R> paramq)
  {
    AppMethodBeat.i(118838);
    this.AXT = paramq;
    AppMethodBeat.o(118838);
  }

  public final R am(T paramT)
  {
    AppMethodBeat.i(118837);
    paramT = this.AXT.get(paramT);
    AppMethodBeat.o(118837);
    return paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.q.a
 * JD-Core Version:    0.6.2
 */