package a.i.b.a.c.h;

import a.g.b;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class j$b extends b<T>
{
  public j$b(Object paramObject1, Object paramObject2, j paramj)
  {
    super(paramObject2);
  }

  public final boolean a(k<?> paramk)
  {
    AppMethodBeat.i(121855);
    a.f.b.j.p(paramk, "property");
    if (this.BDp.aCf)
    {
      paramk = (Throwable)new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
      AppMethodBeat.o(121855);
      throw paramk;
    }
    AppMethodBeat.o(121855);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.j.b
 * JD-Core Version:    0.6.2
 */