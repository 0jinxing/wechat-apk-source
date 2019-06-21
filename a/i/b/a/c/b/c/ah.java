package a.i.b.a.c.b.c;

import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.ap.a;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.c.a;
import a.i.b.a.c.i.d;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class ah extends e
{
  private final a.f.a.b<w, Void> Bjt;
  private final List<w> Bju;
  private boolean initialized;

  private ah(l paraml, a.i.b.a.c.b.a.g paramg, boolean paramBoolean, ba paramba, f paramf, int paramInt, am paramam, ap paramap)
  {
    super(a.i.b.a.c.k.b.BIH, paraml, paramg, paramf, paramba, paramBoolean, paramInt, paramam, paramap);
    AppMethodBeat.i(119612);
    this.Bju = new ArrayList(1);
    this.initialized = false;
    this.Bjt = null;
    AppMethodBeat.o(119612);
  }

  private void M(w paramw)
  {
    AppMethodBeat.i(119617);
    if (y.an(paramw))
      AppMethodBeat.o(119617);
    while (true)
    {
      return;
      this.Bju.add(paramw);
      AppMethodBeat.o(119617);
    }
  }

  public static ar a(l paraml, a.i.b.a.c.b.a.g paramg, ba paramba, f paramf, int paramInt)
  {
    AppMethodBeat.i(119609);
    paramg = a(paraml, paramg, false, paramba, paramf, paramInt, am.BeR);
    paramg.L(a.G(paraml).dXN());
    paramg.setInitialized();
    AppMethodBeat.o(119609);
    return paramg;
  }

  public static ah a(l paraml, a.i.b.a.c.b.a.g paramg, boolean paramBoolean, ba paramba, f paramf, int paramInt, am paramam)
  {
    AppMethodBeat.i(119610);
    paraml = a(paraml, paramg, paramBoolean, paramba, paramf, paramInt, paramam, ap.a.BeT);
    AppMethodBeat.o(119610);
    return paraml;
  }

  private static ah a(l paraml, a.i.b.a.c.b.a.g paramg, boolean paramBoolean, ba paramba, f paramf, int paramInt, am paramam, ap paramap)
  {
    AppMethodBeat.i(119611);
    paraml = new ah(paraml, paramg, paramBoolean, paramba, paramf, paramInt, paramam, paramap);
    AppMethodBeat.o(119611);
    return paraml;
  }

  private void eaN()
  {
    AppMethodBeat.i(119613);
    if (this.initialized)
    {
      IllegalStateException localIllegalStateException = new IllegalStateException("Type parameter descriptor is already initialized: " + eaO());
      AppMethodBeat.o(119613);
      throw localIllegalStateException;
    }
    AppMethodBeat.o(119613);
  }

  private String eaO()
  {
    AppMethodBeat.i(119614);
    String str = this.BgZ + " declared in " + d.n(dXW());
    AppMethodBeat.o(119614);
    return str;
  }

  protected final void J(w paramw)
  {
    AppMethodBeat.i(119618);
    if (this.Bjt == null)
      AppMethodBeat.o(119618);
    while (true)
    {
      return;
      this.Bjt.am(paramw);
      AppMethodBeat.o(119618);
    }
  }

  public final void L(w paramw)
  {
    AppMethodBeat.i(119616);
    eaN();
    M(paramw);
    AppMethodBeat.o(119616);
  }

  protected final List<w> eaq()
  {
    AppMethodBeat.i(119619);
    if (!this.initialized)
    {
      localObject = new IllegalStateException("Type parameter descriptor is not initialized: " + eaO());
      AppMethodBeat.o(119619);
      throw ((Throwable)localObject);
    }
    Object localObject = this.Bju;
    AppMethodBeat.o(119619);
    return localObject;
  }

  public final void setInitialized()
  {
    AppMethodBeat.i(119615);
    eaN();
    this.initialized = true;
    AppMethodBeat.o(119615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.ah
 * JD-Core Version:    0.6.2
 */