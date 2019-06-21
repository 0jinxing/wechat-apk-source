package a.i.b.a.e;

import a.i.b.a.c.f.f;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaValueParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "type", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "reflectAnnotations", "", "", "reflectName", "", "isVararg", "", "(Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;[Ljava/lang/annotation/Annotation;Ljava/lang/String;Z)V", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "isDeprecatedInJavaDoc", "()Z", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "[Ljava/lang/annotation/Annotation;", "getType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "toString", "descriptors.runtime"})
public final class y extends n
  implements a.i.b.a.c.d.a.e.y
{
  private final w BOl;
  private final Annotation[] BOm;
  private final String BOn;
  private final boolean BOo;

  public y(w paramw, Annotation[] paramArrayOfAnnotation, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(123129);
    this.BOl = paramw;
    this.BOm = paramArrayOfAnnotation;
    this.BOn = paramString;
    this.BOo = paramBoolean;
    AppMethodBeat.o(123129);
  }

  public final f dZg()
  {
    AppMethodBeat.i(123127);
    Object localObject = this.BOn;
    if (localObject != null)
    {
      localObject = f.awa((String)localObject);
      AppMethodBeat.o(123127);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(123127);
    }
  }

  public final boolean ecc()
  {
    return this.BOo;
  }

  public final String toString()
  {
    AppMethodBeat.i(123128);
    StringBuilder localStringBuilder = new StringBuilder().append(getClass().getName()).append(": ");
    if (this.BOo);
    for (String str = "vararg "; ; str = "")
    {
      str = str + dZg() + ": " + this.BOl;
      AppMethodBeat.o(123128);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.y
 * JD-Core Version:    0.6.2
 */