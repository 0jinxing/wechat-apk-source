package a.i.b.a.c.l;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class af extends i
  implements aw
{
  private final w BJD;
  private final ad BpK;

  public af(ad paramad, w paramw)
  {
    AppMethodBeat.i(122627);
    this.BpK = paramad;
    this.BJD = paramw;
    AppMethodBeat.o(122627);
  }

  public final ad d(g paramg)
  {
    AppMethodBeat.i(122623);
    j.p(paramg, "newAnnotations");
    paramg = ax.b(((az)this.BpK).b(paramg), this.BJD);
    if (paramg == null)
    {
      paramg = new v("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
      AppMethodBeat.o(122623);
      throw paramg;
    }
    paramg = (ad)paramg;
    AppMethodBeat.o(122623);
    return paramg;
  }

  protected final ad eby()
  {
    return this.BpK;
  }

  public final az ekk()
  {
    return (az)this.BpK;
  }

  public final w ekl()
  {
    return this.BJD;
  }

  public final ad rL(boolean paramBoolean)
  {
    AppMethodBeat.i(122625);
    Object localObject = ax.b(((az)this.BpK).rK(paramBoolean), (w)this.BJD.ekn().rK(paramBoolean));
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
      AppMethodBeat.o(122625);
      throw ((Throwable)localObject);
    }
    localObject = (ad)localObject;
    AppMethodBeat.o(122625);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.af
 * JD-Core Version:    0.6.2
 */