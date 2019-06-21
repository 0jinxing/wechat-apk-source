package a.i.b.a.b;

import a.a.e;
import a.f.b.j;
import a.i.b.a.c.a.h;
import a.i.b.a.c.b.am;
import a.i.b.a.c.d.b.n.a;
import a.i.b.a.c.d.b.n.b;
import a.i.b.a.c.d.b.n.c;
import a.i.b.a.c.d.b.n.d;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.d.c;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/ReflectClassStructure;", "", "()V", "loadClassAnnotations", "", "klass", "Ljava/lang/Class;", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "loadConstructorAnnotations", "memberVisitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "loadFieldAnnotations", "loadMethodAnnotations", "processAnnotation", "annotation", "", "processAnnotationArgumentValue", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationArgumentVisitor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "value", "processAnnotationArguments", "annotationType", "visitMembers", "classLiteralId", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$ClassLiteralId;", "descriptors.runtime"})
final class b
{
  public static final b AZq;

  static
  {
    AppMethodBeat.i(119026);
    AZq = new b();
    AppMethodBeat.o(119026);
  }

  private final void a(n.a parama, f paramf, Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(119025);
    Object localObject = paramObject.getClass();
    if (j.j(localObject, Class.class))
    {
      if (paramObject == null)
      {
        parama = new v("null cannot be cast to non-null type java.lang.Class<*>");
        AppMethodBeat.o(119025);
        throw parama;
      }
      parama.a(paramf, aU((Class)paramObject));
      AppMethodBeat.o(119025);
    }
    while (true)
    {
      return;
      if (g.dXB().contains(localObject))
      {
        parama.a(paramf, paramObject);
        AppMethodBeat.o(119025);
      }
      else if (a.i.b.a.e.b.aY((Class)localObject))
      {
        if (((Class)localObject).isEnum());
        while (true)
        {
          j.o(localObject, "(if (clazz.isEnum) clazz…lse clazz.enclosingClass)");
          localObject = a.i.b.a.e.b.bb((Class)localObject);
          if (paramObject != null)
            break;
          parama = new v("null cannot be cast to non-null type kotlin.Enum<*>");
          AppMethodBeat.o(119025);
          throw parama;
          localObject = ((Class)localObject).getEnclosingClass();
        }
        paramObject = f.avX(((Enum)paramObject).name());
        j.o(paramObject, "Name.identifier((value as Enum<*>).name)");
        parama.a(paramf, (a.i.b.a.c.f.a)localObject, paramObject);
        AppMethodBeat.o(119025);
      }
      else if (Annotation.class.isAssignableFrom((Class)localObject))
      {
        localObject = ((Class)localObject).getInterfaces();
        j.o(localObject, "clazz.interfaces");
        localObject = (Class)e.O((Object[])localObject);
        j.o(localObject, "annotationClass");
        parama = parama.a(paramf, a.i.b.a.e.b.bb((Class)localObject));
        if (parama == null)
        {
          AppMethodBeat.o(119025);
        }
        else
        {
          if (paramObject == null)
          {
            parama = new v("null cannot be cast to non-null type kotlin.Annotation");
            AppMethodBeat.o(119025);
            throw parama;
          }
          a(parama, (Annotation)paramObject, (Class)localObject);
          AppMethodBeat.o(119025);
        }
      }
      else
      {
        if (!((Class)localObject).isArray())
          break;
        parama = parama.o(paramf);
        if (parama == null)
        {
          AppMethodBeat.o(119025);
        }
        else
        {
          paramf = ((Class)localObject).getComponentType();
          j.o(paramf, "componentType");
          if (paramf.isEnum())
          {
            paramf = a.i.b.a.e.b.bb(paramf);
            if (paramObject == null)
            {
              parama = new v("null cannot be cast to non-null type kotlin.Array<*>");
              AppMethodBeat.o(119025);
              throw parama;
            }
            for (localObject : (Object[])paramObject)
            {
              if (localObject == null)
              {
                parama = new v("null cannot be cast to non-null type kotlin.Enum<*>");
                AppMethodBeat.o(119025);
                throw parama;
              }
              localObject = f.avX(((Enum)localObject).name());
              j.o(localObject, "Name.identifier((element as Enum<*>).name)");
              parama.a(paramf, (f)localObject);
            }
          }
          if (j.j(paramf, Class.class))
          {
            if (paramObject == null)
            {
              parama = new v("null cannot be cast to non-null type kotlin.Array<*>");
              AppMethodBeat.o(119025);
              throw parama;
            }
            for (paramObject : (Object[])paramObject)
            {
              if (paramObject == null)
              {
                parama = new v("null cannot be cast to non-null type java.lang.Class<*>");
                AppMethodBeat.o(119025);
                throw parama;
              }
              parama.a(aU((Class)paramObject));
            }
          }
          if (paramObject == null)
          {
            parama = new v("null cannot be cast to non-null type kotlin.Array<*>");
            AppMethodBeat.o(119025);
            throw parama;
          }
          paramf = (Object[])paramObject;
          ??? = paramf.length;
          while (i < ???)
          {
            parama.dG(paramf[i]);
            i++;
          }
          parama.zn();
          AppMethodBeat.o(119025);
        }
      }
    }
    parama = (Throwable)new UnsupportedOperationException("Unsupported annotation argument value (" + localObject + "): " + paramObject);
    AppMethodBeat.o(119025);
    throw parama;
  }

  static void a(n.c paramc, Annotation paramAnnotation)
  {
    AppMethodBeat.i(119022);
    Class localClass = a.f.a.a(a.f.a.a(paramAnnotation));
    paramc = paramc.a(a.i.b.a.e.b.bb(localClass), (am)new a(paramAnnotation));
    if (paramc != null)
    {
      AZq.a(paramc, paramAnnotation, localClass);
      AppMethodBeat.o(119022);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(119022);
    }
  }

  public static void a(Class<?> paramClass, n.c paramc)
  {
    AppMethodBeat.i(119021);
    j.p(paramClass, "klass");
    j.p(paramc, "visitor");
    for (Object localObject : paramClass.getDeclaredAnnotations())
    {
      j.o(localObject, "annotation");
      a(paramc, localObject);
    }
    paramc.zn();
    AppMethodBeat.o(119021);
  }

  private static n.d aU(Class<?> paramClass)
  {
    AppMethodBeat.i(119024);
    int i = 0;
    while (paramClass.isArray())
    {
      i++;
      paramClass = paramClass.getComponentType();
      j.o(paramClass, "currentClass.componentType");
    }
    if (!paramClass.isPrimitive())
    {
      paramClass = a.i.b.a.e.b.bb(paramClass);
      paramClass = new n.d(paramClass, i);
      AppMethodBeat.o(119024);
      return paramClass;
    }
    paramClass = c.awk(paramClass.getName());
    j.o(paramClass, "JvmPrimitiveType.get(currentClass.name)");
    paramClass = paramClass.BFq;
    j.o(paramClass, "JvmPrimitiveType.get(cur…Class.name).primitiveType");
    if (paramClass.Bcb != null);
    for (paramClass = paramClass.Bcb; ; paramClass = paramClass.Bcb)
    {
      paramClass = a.i.b.a.c.f.a.n(paramClass);
      j.o(paramClass, "ClassId.topLevel(JvmPrim…primitiveType.typeFqName)");
      break;
      paramClass.Bcb = a.i.b.a.c.a.g.AZV.q(paramClass.BbZ);
    }
  }

  final void a(n.a parama, Annotation paramAnnotation, Class<?> paramClass)
  {
    int i = 0;
    AppMethodBeat.i(119023);
    paramClass = paramClass.getDeclaredMethods();
    int j = paramClass.length;
    while (true)
    {
      Object localObject1;
      if (i < j)
        localObject1 = paramClass[i];
      try
      {
        Object localObject2 = ((Method)localObject1).invoke(paramAnnotation, new Object[0]);
        if (localObject2 == null)
          j.dWJ();
        j.o(localObject1, "method");
        localObject1 = f.avX(((Method)localObject1).getName());
        j.o(localObject1, "Name.identifier(method.name)");
        a(parama, (f)localObject1, localObject2);
        label86: i++;
        continue;
        parama.zn();
        AppMethodBeat.o(119023);
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        break label86;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.b
 * JD-Core Version:    0.6.2
 */