package a.i.b.a.e;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"findAnnotation", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "", "", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "([Ljava/lang/annotation/Annotation;Lorg/jetbrains/kotlin/name/FqName;)Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "", "([Ljava/lang/annotation/Annotation;)Ljava/util/List;", "descriptors.runtime"})
public final class g
{
  public static final c a(Annotation[] paramArrayOfAnnotation, a.i.b.a.c.f.b paramb)
  {
    Object localObject = null;
    AppMethodBeat.i(123036);
    j.p(paramArrayOfAnnotation, "receiver$0");
    j.p(paramb, "fqName");
    int i = paramArrayOfAnnotation.length;
    int j = 0;
    if (j < i)
    {
      Annotation localAnnotation = paramArrayOfAnnotation[j];
      if (j.j(b.bb(a.f.a.a(a.f.a.a(localAnnotation))).ehE(), paramb))
      {
        paramArrayOfAnnotation = localAnnotation;
        label61: if (paramArrayOfAnnotation == null)
          break label92;
        paramArrayOfAnnotation = new c(paramArrayOfAnnotation);
        AppMethodBeat.o(123036);
      }
    }
    while (true)
    {
      return paramArrayOfAnnotation;
      j++;
      break;
      paramArrayOfAnnotation = null;
      break label61;
      label92: AppMethodBeat.o(123036);
      paramArrayOfAnnotation = localObject;
    }
  }

  public static final List<c> a(Annotation[] paramArrayOfAnnotation)
  {
    AppMethodBeat.i(123035);
    j.p(paramArrayOfAnnotation, "receiver$0");
    Collection localCollection = (Collection)new ArrayList(paramArrayOfAnnotation.length);
    int i = paramArrayOfAnnotation.length;
    for (int j = 0; j < i; j++)
      localCollection.add(new c(paramArrayOfAnnotation[j]));
    paramArrayOfAnnotation = (List)localCollection;
    AppMethodBeat.o(123035);
    return paramArrayOfAnnotation;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.g
 * JD-Core Version:    0.6.2
 */