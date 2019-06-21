package a.i.b.a.e;

import a.a.e;
import a.a.v;
import a.f.b.j;
import a.i.b.a.c.d.a.e.k;
import a.i.b.a.c.d.a.e.y;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaConstructor;", "member", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getMember", "()Ljava/lang/reflect/Constructor;", "typeParameters", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "valueParameters", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "getValueParameters", "descriptors.runtime"})
public final class m extends r
  implements k
{
  public final Constructor<?> BOe;

  public m(Constructor<?> paramConstructor)
  {
    AppMethodBeat.i(123091);
    this.BOe = paramConstructor;
    AppMethodBeat.o(123091);
  }

  public final List<x> dYS()
  {
    AppMethodBeat.i(123090);
    TypeVariable[] arrayOfTypeVariable = this.BOe.getTypeParameters();
    j.o(arrayOfTypeVariable, "member.typeParameters");
    Object localObject = (Collection)new ArrayList(arrayOfTypeVariable.length);
    int i = arrayOfTypeVariable.length;
    for (int j = 0; j < i; j++)
      ((Collection)localObject).add(new x(arrayOfTypeVariable[j]));
    localObject = (List)localObject;
    AppMethodBeat.o(123090);
    return localObject;
  }

  public final List<y> dYV()
  {
    AppMethodBeat.i(123089);
    Object localObject1 = this.BOe.getGenericParameterTypes();
    j.o(localObject1, "types");
    if (localObject1.length == 0);
    for (int i = 1; i != 0; i = 0)
    {
      localObject1 = (List)v.AUP;
      AppMethodBeat.o(123089);
      return localObject1;
    }
    Object localObject2 = this.BOe.getDeclaringClass();
    j.o(localObject2, "klass");
    if ((((Class)localObject2).getDeclaringClass() != null) && (!Modifier.isStatic(((Class)localObject2).getModifiers())))
      localObject1 = (Type[])e.copyOfRange((Object[])localObject1, 1, localObject1.length);
    while (true)
    {
      localObject2 = this.BOe.getParameterAnnotations();
      if (((Object[])localObject2).length >= localObject1.length)
        break;
      localObject1 = (Throwable)new IllegalStateException("Illegal generic signature: " + this.BOe);
      AppMethodBeat.o(123089);
      throw ((Throwable)localObject1);
    }
    if (((Object[])localObject2).length > localObject1.length)
    {
      j.o(localObject2, "annotations");
      localObject2 = (Annotation[][])e.copyOfRange((Object[])localObject2, ((Object[])localObject2).length - localObject1.length, ((Object[])localObject2).length);
    }
    while (true)
    {
      j.o(localObject1, "realTypes");
      j.o(localObject2, "realAnnotations");
      localObject1 = a((Type[])localObject1, (Annotation[][])localObject2, this.BOe.isVarArgs());
      AppMethodBeat.o(123089);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.m
 * JD-Core Version:    0.6.2
 */