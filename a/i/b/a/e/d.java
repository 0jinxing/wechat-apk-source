package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.f.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "(Lorg/jetbrains/kotlin/name/Name;)V", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "Factory", "descriptors.runtime"})
public abstract class d
  implements a.i.b.a.c.d.a.e.b
{
  public static final a BNS = new a((byte)0);
  private final f BgZ;

  public d(f paramf)
  {
    this.BgZ = paramf;
  }

  public final f dZg()
  {
    return this.BgZ;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "value", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "descriptors.runtime"})
  public static final class a
  {
    public static d a(Object paramObject, f paramf)
    {
      AppMethodBeat.i(123030);
      j.p(paramObject, "value");
      if (b.aY(paramObject.getClass()))
      {
        paramObject = (d)new o(paramf, (Enum)paramObject);
        AppMethodBeat.o(123030);
      }
      while (true)
      {
        return paramObject;
        if ((paramObject instanceof Annotation))
        {
          paramObject = (d)new e(paramf, (Annotation)paramObject);
          AppMethodBeat.o(123030);
        }
        else if ((paramObject instanceof Object[]))
        {
          paramObject = (d)new h(paramf, (Object[])paramObject);
          AppMethodBeat.o(123030);
        }
        else if ((paramObject instanceof Class))
        {
          paramObject = (d)new k(paramf, (Class)paramObject);
          AppMethodBeat.o(123030);
        }
        else
        {
          paramObject = (d)new q(paramf, paramObject);
          AppMethodBeat.o(123030);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.d
 * JD-Core Version:    0.6.2
 */