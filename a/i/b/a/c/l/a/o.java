package a.i.b.a.c.l.a;

import a.aa;
import a.f.b.j;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.az;
import a.i.b.a.c.n.i;
import a.i.b.a.c.n.i.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayDeque;
import java.util.Set;

public final class o
{
  int BKE;
  private boolean BKF;
  ArrayDeque<ad> BKG;
  Set<ad> BKH;
  final boolean BKI;
  private final boolean BKJ;

  private o(boolean paramBoolean)
  {
    this.BKI = paramBoolean;
    this.BKJ = true;
  }

  public static o.a a(ad paramad, e parame)
  {
    AppMethodBeat.i(122779);
    j.p(paramad, "subType");
    j.p(parame, "superType");
    paramad = o.a.BKL;
    AppMethodBeat.o(122779);
    return paramad;
  }

  public static Boolean b(az paramaz1, az paramaz2)
  {
    AppMethodBeat.i(122777);
    j.p(paramaz1, "subType");
    j.p(paramaz2, "superType");
    AppMethodBeat.o(122777);
    return null;
  }

  public static boolean c(an paraman1, an paraman2)
  {
    AppMethodBeat.i(122778);
    j.p(paraman1, "a");
    j.p(paraman2, "b");
    boolean bool = j.j(paraman1, paraman2);
    AppMethodBeat.o(122778);
    return bool;
  }

  final void clear()
  {
    AppMethodBeat.i(122781);
    Object localObject = this.BKG;
    if (localObject == null)
      j.dWJ();
    ((ArrayDeque)localObject).clear();
    localObject = this.BKH;
    if (localObject == null)
      j.dWJ();
    ((Set)localObject).clear();
    this.BKF = false;
    AppMethodBeat.o(122781);
  }

  public final boolean e(az paramaz)
  {
    AppMethodBeat.i(122782);
    j.p(paramaz, "receiver$0");
    boolean bool;
    if ((this.BKJ) && ((paramaz.ejw() instanceof k)))
    {
      bool = true;
      AppMethodBeat.o(122782);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122782);
    }
  }

  final void initialize()
  {
    AppMethodBeat.i(122780);
    if (!this.BKF);
    Object localObject;
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      localObject = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(122780);
      throw ((Throwable)localObject);
    }
    this.BKF = true;
    if (this.BKG == null)
      this.BKG = new ArrayDeque(4);
    if (this.BKH == null)
    {
      localObject = i.BNv;
      this.BKH = ((Set)i.b.ekD());
    }
    AppMethodBeat.o(122780);
  }

  public static enum b
  {
    static
    {
      AppMethodBeat.i(122766);
      b localb1 = new b("TAKE_FIRST_FOR_SUBTYPING", 0);
      BKO = localb1;
      b localb2 = new b("FORCE_NOT_SUBTYPE", 1);
      BKP = localb2;
      b localb3 = new b("CHECK_ANY_OF_THEM", 2);
      BKQ = localb3;
      b localb4 = new b("INTERSECT_ARGUMENTS_AND_CHECK_AGAIN", 3);
      BKR = localb4;
      BKS = new b[] { localb1, localb2, localb3, localb4 };
      AppMethodBeat.o(122766);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.o
 * JD-Core Version:    0.6.2
 */