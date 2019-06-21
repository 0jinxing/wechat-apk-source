package a.i.b.a.b;

import a.i.b.a.c.d.a.e.g;
import a.i.b.a.c.d.a.e.t;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.b;
import a.i.b.a.e.u;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findPackage", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaPackage;", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "knownClassNamesInPackage", "", "", "packageFqName", "descriptors.runtime"})
public final class c
  implements a.i.b.a.c.d.a.j
{
  private final ClassLoader AZr;

  public c(ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(119030);
    this.AZr = paramClassLoader;
    AppMethodBeat.o(119030);
  }

  public final g a(a parama)
  {
    AppMethodBeat.i(119027);
    a.f.b.j.p(parama, "classId");
    b localb = parama.BcW;
    a.f.b.j.o(localb, "classId.packageFqName");
    parama = parama.ByN.ByQ.ByV;
    a.f.b.j.o(parama, "classId.relativeClassName.asString()");
    parama = m.a(parama, '.', '$');
    if (localb.ByQ.ByV.isEmpty())
    {
      parama = d.a(this.AZr, parama);
      if (parama == null)
        break label126;
      parama = (g)new a.i.b.a.e.j(parama);
      AppMethodBeat.o(119027);
    }
    while (true)
    {
      return parama;
      parama = localb.ByQ.ByV + "." + parama;
      break;
      label126: parama = null;
      AppMethodBeat.o(119027);
    }
  }

  public final t a(b paramb)
  {
    AppMethodBeat.i(119028);
    a.f.b.j.p(paramb, "fqName");
    paramb = (t)new u(paramb);
    AppMethodBeat.o(119028);
    return paramb;
  }

  public final Set<String> b(b paramb)
  {
    AppMethodBeat.i(119029);
    a.f.b.j.p(paramb, "packageFqName");
    AppMethodBeat.o(119029);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.c
 * JD-Core Version:    0.6.2
 */