package a.i.b.a.e;

import a.i.b.a.c.d.a.e.a;
import a.i.b.a.c.d.a.e.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "annotations", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotation;", "getAnnotations", "()Ljava/util/Collection;", "classifier", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifier;", "getClassifier", "()Lorg/jetbrains/kotlin/load/java/structure/JavaClassifier;", "classifierQualifiedName", "", "getClassifierQualifiedName", "()Ljava/lang/String;", "isDeprecatedInJavaDoc", "", "()Z", "isRaw", "presentableText", "getPresentableText", "getReflectType", "()Ljava/lang/reflect/Type;", "typeArguments", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaType;", "getTypeArguments", "()Ljava/util/List;", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"})
public final class l extends w
  implements a.i.b.a.c.d.a.e.j
{
  final Type BNU;
  private final i BOd;

  public l(Type paramType)
  {
    AppMethodBeat.i(123088);
    this.BNU = paramType;
    paramType = ((l)this).BNU;
    if ((paramType instanceof Class))
      paramType = (i)new j((Class)paramType);
    while (true)
    {
      this.BOd = paramType;
      AppMethodBeat.o(123088);
      return;
      if ((paramType instanceof TypeVariable))
      {
        paramType = (i)new x((TypeVariable)paramType);
      }
      else
      {
        if (!(paramType instanceof ParameterizedType))
          break;
        paramType = ((ParameterizedType)paramType).getRawType();
        if (paramType == null)
        {
          paramType = new a.v("null cannot be cast to non-null type java.lang.Class<*>");
          AppMethodBeat.o(123088);
          throw paramType;
        }
        paramType = (i)new j((Class)paramType);
      }
    }
    paramType = (Throwable)new IllegalStateException("Not a classifier type (" + paramType.getClass() + "): " + paramType);
    AppMethodBeat.o(123088);
    throw paramType;
  }

  public final Collection<a> ebC()
  {
    return (Collection)a.a.v.AUP;
  }

  public final i ebL()
  {
    return this.BOd;
  }

  public final List<a.i.b.a.c.d.a.e.v> ebM()
  {
    AppMethodBeat.i(123086);
    Object localObject1 = (Iterable)b.a(this.BNU);
    Object localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(w.a.b((Type)((Iterator)localObject1).next()));
    localObject2 = (List)localObject2;
    AppMethodBeat.o(123086);
    return localObject2;
  }

  public final boolean ebN()
  {
    AppMethodBeat.i(123085);
    Object localObject = this.BNU;
    int i;
    if ((localObject instanceof Class))
    {
      localObject = ((Class)localObject).getTypeParameters();
      a.f.b.j.o(localObject, "getTypeParameters()");
      if (localObject.length == 0)
      {
        i = 1;
        if (i != 0)
          break label62;
        i = 1;
        label44: if (i == 0)
          break label67;
        AppMethodBeat.o(123085);
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
      label62: i = 0;
      break label44;
      label67: AppMethodBeat.o(123085);
    }
  }

  public final String ebO()
  {
    AppMethodBeat.i(123083);
    Throwable localThrowable = (Throwable)new UnsupportedOperationException("Type not found: " + this.BNU);
    AppMethodBeat.o(123083);
    throw localThrowable;
  }

  public final String ebP()
  {
    AppMethodBeat.i(123084);
    String str = this.BNU.toString();
    AppMethodBeat.o(123084);
    return str;
  }

  public final Type ekI()
  {
    return this.BNU;
  }

  public final a m(a.i.b.a.c.f.b paramb)
  {
    AppMethodBeat.i(123087);
    a.f.b.j.p(paramb, "fqName");
    AppMethodBeat.o(123087);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.l
 * JD-Core Version:    0.6.2
 */