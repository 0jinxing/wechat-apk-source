package a.i.b.a.c.k;

import a.f.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

class b$f<T> extends b.e<T>
  implements f<T>
{
  static
  {
    AppMethodBeat.i(122447);
    if (!b.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(122447);
      return;
    }
  }

  public b$f(b paramb, a<? extends T> parama)
  {
    super(paramb, parama);
  }

  public final T invoke()
  {
    AppMethodBeat.i(122446);
    Object localObject = super.invoke();
    if ((!$assertionsDisabled) && (localObject == null))
    {
      localObject = new AssertionError("compute() returned null");
      AppMethodBeat.o(122446);
      throw ((Throwable)localObject);
    }
    AppMethodBeat.o(122446);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.k.b.f
 * JD-Core Version:    0.6.2
 */