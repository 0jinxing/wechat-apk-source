package a.i.b.a;

import a.f.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class z$b<T> extends z.c<T>
{
  private final a<T> AUr;
  private Object value = null;

  public z$b(a<T> parama)
  {
    this.AUr = parama;
  }

  public final T invoke()
  {
    AppMethodBeat.i(118899);
    Object localObject = this.value;
    if (localObject != null)
    {
      localObject = dv(localObject);
      AppMethodBeat.o(118899);
    }
    while (true)
    {
      return localObject;
      localObject = this.AUr.invoke();
      this.value = du(localObject);
      AppMethodBeat.o(118899);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.z.b
 * JD-Core Version:    0.6.2
 */