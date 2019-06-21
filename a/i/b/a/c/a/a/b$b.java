package a.i.b.a.c.a.a;

import a.i.b.a.c.a.g;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public enum b$b
{
  public static final b.b.a BcY;
  public final b BcW;
  public final String BcX;

  static
  {
    AppMethodBeat.i(119145);
    Object localObject1 = g.AZV;
    a.f.b.j.o(localObject1, "BUILT_INS_PACKAGE_FQ_NAME");
    localObject1 = new b("Function", 0, (b)localObject1, "Function");
    BcR = (b)localObject1;
    Object localObject2 = d.BDS;
    a.f.b.j.o(localObject2, "COROUTINES_PACKAGE_FQ_NAME_RELEASE");
    localObject2 = new b("SuspendFunction", 1, (b)localObject2, "SuspendFunction");
    BcS = (b)localObject2;
    b localb1 = new b("KFunction", 2, a.i.b.a.c.a.j.dXT(), "KFunction");
    BcT = localb1;
    b localb2 = new b("KSuspendFunction", 3, a.i.b.a.c.a.j.dXT(), "KSuspendFunction");
    BcU = localb2;
    BcV = new b[] { localObject1, localObject2, localb1, localb2 };
    BcY = new b.b.a((byte)0);
    AppMethodBeat.o(119145);
  }

  private b$b(b paramb, String paramString)
  {
    AppMethodBeat.i(119147);
    this.BcW = paramb;
    this.BcX = paramString;
    AppMethodBeat.o(119147);
  }

  public final f SN(int paramInt)
  {
    AppMethodBeat.i(119146);
    f localf = f.avX(this.BcX + paramInt);
    a.f.b.j.o(localf, "Name.identifier(\"$classNamePrefix$arity\")");
    AppMethodBeat.o(119146);
    return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.b.b
 * JD-Core Version:    0.6.2
 */