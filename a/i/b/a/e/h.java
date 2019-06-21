package a.i.b.a.e;

import a.f.b.j;
import a.i.b.a.c.d.a.e.e;
import a.i.b.a.c.f.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayAnnotationArgument;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationArgument;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayAnnotationArgument;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "values", "", "(Lorg/jetbrains/kotlin/name/Name;[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getElements", "", "descriptors.runtime"})
public final class h extends d
  implements e
{
  private final Object[] akP;

  public h(f paramf, Object[] paramArrayOfObject)
  {
    super(paramf);
    AppMethodBeat.i(123038);
    this.akP = paramArrayOfObject;
    AppMethodBeat.o(123038);
  }

  public final List<d> ebD()
  {
    AppMethodBeat.i(123037);
    Object[] arrayOfObject = this.akP;
    Object localObject1 = (Collection)new ArrayList(arrayOfObject.length);
    int i = arrayOfObject.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject2 = arrayOfObject[j];
      if (localObject2 == null)
        j.dWJ();
      ((Collection)localObject1).add(d.a.a(localObject2, null));
    }
    localObject1 = (List)localObject1;
    AppMethodBeat.o(123037);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.h
 * JD-Core Version:    0.6.2
 */