package a.i.b.a.b;

import a.f.b.j;
import a.i.b.a.c.d.a.e.g;
import a.i.b.a.c.d.b.n;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.c;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinClassFinder;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "findBuiltInsData", "Ljava/io/InputStream;", "packageFqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "findKotlinClass", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "fqName", "", "javaClass", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "findMetadata", "hasMetadataPackage", "", "descriptors.runtime"})
public final class f
  implements a.i.b.a.c.d.b.m
{
  private final ClassLoader AZr;

  public f(ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(119044);
    this.AZr = paramClassLoader;
    AppMethodBeat.o(119044);
  }

  private final n avz(String paramString)
  {
    AppMethodBeat.i(119041);
    Class localClass = d.a(this.AZr, paramString);
    if (localClass != null)
      paramString = e.AZu;
    for (paramString = e.a.aV(localClass); ; paramString = null)
    {
      paramString = (n)paramString;
      AppMethodBeat.o(119041);
      return paramString;
    }
  }

  public final n a(g paramg)
  {
    AppMethodBeat.i(119043);
    j.p(paramg, "javaClass");
    paramg = paramg.dZF();
    if (paramg != null)
    {
      paramg = paramg.ByQ.ByV;
      if (paramg != null);
    }
    else
    {
      paramg = null;
      AppMethodBeat.o(119043);
    }
    while (true)
    {
      return paramg;
      paramg = avz(paramg);
      AppMethodBeat.o(119043);
    }
  }

  public final n b(a parama)
  {
    AppMethodBeat.i(119042);
    j.p(parama, "classId");
    String str = parama.ByN.ByQ.ByV;
    j.o(str, "relativeClassName.asString()");
    str = a.k.m.a(str, '.', '$');
    b localb = parama.BcW;
    j.o(localb, "packageFqName");
    if (localb.ByQ.ByV.isEmpty());
    for (parama = str; ; parama = parama.BcW + '.' + str)
    {
      parama = avz(parama);
      AppMethodBeat.o(119042);
      return parama;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.f
 * JD-Core Version:    0.6.2
 */