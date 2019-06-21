package a.i.b.a.c.a;

import a.f.b.t;
import a.f.b.v;
import a.g;
import a.i.b.a.c.b.aa;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.y;
import a.i.b.a.c.c.a.c;
import a.i.b.a.c.i.e.h;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  public static final b Bcn;
  private final a.f Bce;
  private final i.a Bcf;
  private final i.a Bcg;
  private final i.a Bch;
  private final i.a Bci;
  private final i.a Bcj;
  private final i.a Bck;
  private final i.a Bcl;
  private final aa Bcm;

  static
  {
    AppMethodBeat.i(119108);
    eQB = new a.i.k[] { (a.i.k)v.a(new t(v.aN(i.class), "kotlinReflectScope", "getKotlinReflectScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), (a.i.k)v.a(new t(v.aN(i.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), (a.i.k)v.a(new t(v.aN(i.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), (a.i.k)v.a(new t(v.aN(i.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), (a.i.k)v.a(new t(v.aN(i.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), (a.i.k)v.a(new t(v.aN(i.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), (a.i.k)v.a(new t(v.aN(i.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), (a.i.k)v.a(new t(v.aN(i.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")) };
    Bcn = new b((byte)0);
    AppMethodBeat.o(119108);
  }

  public i(y paramy, aa paramaa)
  {
    AppMethodBeat.i(119110);
    this.Bcm = paramaa;
    this.Bce = g.a(a.k.AUm, (a.f.a.a)new c(paramy));
    this.Bcf = new i.a(1);
    this.Bcg = new i.a(1);
    this.Bch = new i.a(2);
    this.Bci = new i.a(3);
    this.Bcj = new i.a(1);
    this.Bck = new i.a(2);
    this.Bcl = new i.a(3);
    AppMethodBeat.o(119110);
  }

  public final e dXS()
  {
    AppMethodBeat.i(119109);
    Object localObject1 = this.Bcf;
    Object localObject2 = eQB[1];
    a.f.b.j.p(this, "types");
    a.f.b.j.p(localObject2, "property");
    localObject2 = m.capitalize(((a.i.k)localObject2).getName());
    int i = ((i.a)localObject1).Bco;
    a.i.b.a.c.f.f localf = a.i.b.a.c.f.f.avX((String)localObject2);
    a.f.b.j.o(localf, "Name.identifier(className)");
    localObject2 = ((h)this.Bce.getValue()).c(localf, (a.i.b.a.c.c.a.a)c.BjM);
    localObject1 = localObject2;
    if (!(localObject2 instanceof e))
      localObject1 = null;
    localObject2 = (e)localObject1;
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = this.Bcm.a(new a.i.b.a.c.f.a(j.dXT(), localf), a.a.j.listOf(Integer.valueOf(i)));
    AppMethodBeat.o(119109);
    return localObject1;
  }

  public static final class b
  {
  }

  static final class c extends a.f.b.k
    implements a.f.a.a<h>
  {
    c(y paramy)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.i
 * JD-Core Version:    0.6.2
 */