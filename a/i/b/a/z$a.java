package a.i.b.a;

import a.f.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.SoftReference;

public final class z$a<T> extends z.c<T>
{
  private final a<T> AUr;
  private SoftReference<Object> AYv;

  public z$a(T paramT, a<T> parama)
  {
    AppMethodBeat.i(118897);
    this.AYv = null;
    this.AUr = parama;
    if (paramT != null)
      this.AYv = new SoftReference(du(paramT));
    AppMethodBeat.o(118897);
  }

  public final T invoke()
  {
    AppMethodBeat.i(118898);
    Object localObject = this.AYv;
    if (localObject != null)
    {
      localObject = ((SoftReference)localObject).get();
      if (localObject != null)
      {
        localObject = dv(localObject);
        AppMethodBeat.o(118898);
      }
    }
    while (true)
    {
      return localObject;
      localObject = this.AUr.invoke();
      this.AYv = new SoftReference(du(localObject));
      AppMethodBeat.o(118898);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.z.a
 * JD-Core Version:    0.6.2
 */