package a.i.b.a.e;

import a.a.e;
import a.i.b.a.c.b.az;
import a.i.b.a.c.d.a.e.p;
import a.i.b.a.c.f.h;
import a.l;
import a.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;", "()V", "containingClass", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "getContainingClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "member", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "modifiers", "", "getModifiers", "()I", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "equals", "", "other", "", "getValueParameters", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "isVararg", "([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;", "hashCode", "toString", "", "descriptors.runtime"})
public abstract class r extends n
  implements p, f, t
{
  protected final List<a.i.b.a.c.d.a.e.y> a(Type[] paramArrayOfType, Annotation[][] paramArrayOfAnnotation, boolean paramBoolean)
  {
    a.f.b.j.p(paramArrayOfType, "parameterTypes");
    a.f.b.j.p(paramArrayOfAnnotation, "parameterAnnotations");
    ArrayList localArrayList = new ArrayList(paramArrayOfType.length);
    Object localObject = a.BNJ;
    List localList = a.b(dXw());
    if (localList != null);
    int k;
    w localw;
    for (int i = localList.size() - paramArrayOfType.length; ; i = 0)
    {
      int j = paramArrayOfType.length;
      k = 0;
      if (k >= j)
        break label248;
      localObject = w.BOj;
      localw = w.a.b(paramArrayOfType[k]);
      if (localList == null)
        break label236;
      localObject = (String)a.a.j.x(localList, k + i);
      if (localObject != null)
        break;
      throw ((Throwable)new IllegalStateException(("No parameter with index " + k + '+' + i + " (name=" + dZg() + " type=" + localw + ") in " + localList + "@ReflectJavaMember").toString()));
    }
    label191: if ((paramBoolean) && (k == e.P(paramArrayOfType)));
    for (boolean bool = true; ; bool = false)
    {
      localArrayList.add(new y(localw, paramArrayOfAnnotation[k], (String)localObject, bool));
      k++;
      break;
      label236: localObject = null;
      break label191;
    }
    label248: return (List)localArrayList;
  }

  public abstract Member dXw();

  public final az dYf()
  {
    return t.a.d(this);
  }

  public final a.i.b.a.c.f.f dZg()
  {
    Object localObject = dXw().getName();
    if (localObject != null)
      localObject = a.i.b.a.c.f.f.avX((String)localObject);
    while (true)
    {
      return localObject;
      localObject = h.Bzc;
      a.f.b.j.o(localObject, "SpecialNames.NO_NAME_PROVIDED");
    }
  }

  public final boolean ebX()
  {
    return t.a.a(this);
  }

  public final boolean ebY()
  {
    return t.a.c(this);
  }

  public final AnnotatedElement ekH()
  {
    Member localMember = dXw();
    if (localMember == null)
      throw new v("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    return (AnnotatedElement)localMember;
  }

  public boolean equals(Object paramObject)
  {
    if (((paramObject instanceof r)) && (a.f.b.j.j(dXw(), ((r)paramObject).dXw())));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int getModifiers()
  {
    return dXw().getModifiers();
  }

  public int hashCode()
  {
    return dXw().hashCode();
  }

  public final boolean isStatic()
  {
    return t.a.b(this);
  }

  public String toString()
  {
    return getClass().getName() + ": " + dXw();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.r
 * JD-Core Version:    0.6.2
 */