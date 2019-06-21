package a;

import a.f.a.a;
import a.f.b.j;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "lock", "", "mode", "Lkotlin/LazyThreadSafetyMode;", "kotlin-stdlib"}, dWr=1)
public class i
{
  public static final <T> f<T> a(k paramk, a<? extends T> parama)
  {
    AppMethodBeat.i(56366);
    j.p(paramk, "mode");
    j.p(parama, "initializer");
    switch (h.eQZ[paramk.ordinal()])
    {
    default:
      paramk = new m();
      AppMethodBeat.o(56366);
      throw paramk;
    case 1:
      paramk = (f)new s(parama, (byte)0);
      AppMethodBeat.o(56366);
    case 2:
    case 3:
    }
    while (true)
    {
      return paramk;
      paramk = (f)new r(parama);
      AppMethodBeat.o(56366);
      continue;
      paramk = (f)new z(parama);
      AppMethodBeat.o(56366);
    }
  }

  public static final <T> f<T> g(a<? extends T> parama)
  {
    AppMethodBeat.i(56365);
    j.p(parama, "initializer");
    parama = (f)new s(parama, (byte)0);
    AppMethodBeat.o(56365);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i
 * JD-Core Version:    0.6.2
 */