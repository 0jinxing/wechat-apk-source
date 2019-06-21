package a.i.b.a.b;

import a.f.b.j;
import a.i.b.a.c.b.am;
import a.i.b.a.c.d.b.a.a.a;
import a.i.b.a.c.d.b.n;
import a.i.b.a.c.d.b.n.a;
import a.i.b.a.c.d.b.n.c;
import a.i.b.a.c.d.b.n.e;
import a.i.b.a.c.d.b.n.f;
import a.i.b.a.c.e.b.a.d;
import a.i.b.a.c.e.b.a.g;
import a.i.b.a.c.f.f;
import a.k.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass;", "klass", "Ljava/lang/Class;", "classHeader", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/header/KotlinClassHeader;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;)V", "getClassHeader", "()Lorg/jetbrains/kotlin/load/kotlin/header/KotlinClassHeader;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "getKlass", "()Ljava/lang/Class;", "location", "", "getLocation", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "loadClassAnnotations", "", "visitor", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$AnnotationVisitor;", "cachedContents", "", "toString", "visitMembers", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/KotlinJvmBinaryClass$MemberVisitor;", "Factory", "descriptors.runtime"})
public final class e
  implements n
{
  public static final a AZu;
  public final Class<?> AZs;
  public final a.i.b.a.c.d.b.a.a AZt;

  static
  {
    AppMethodBeat.i(119040);
    AZu = new a((byte)0);
    AppMethodBeat.o(119040);
  }

  private e(Class<?> paramClass, a.i.b.a.c.d.b.a.a parama)
  {
    this.AZs = paramClass;
    this.AZt = parama;
  }

  public final void a(n.c paramc)
  {
    AppMethodBeat.i(119035);
    j.p(paramc, "visitor");
    b localb = b.AZq;
    b.a(this.AZs, paramc);
    AppMethodBeat.o(119035);
  }

  public final void a(n.e parame)
  {
    AppMethodBeat.i(119036);
    j.p(parame, "visitor");
    Object localObject1 = b.AZq;
    localObject1 = this.AZs;
    j.p(localObject1, "klass");
    j.p(parame, "memberVisitor");
    Object localObject3;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    int n;
    Object localObject8;
    for (localObject3 : ((Class)localObject1).getDeclaredMethods())
    {
      j.o(localObject3, "method");
      localObject4 = f.avX(((Method)localObject3).getName());
      j.o(localObject4, "Name.identifier(method.name)");
      localObject5 = l.AZG;
      localObject5 = parame.a((f)localObject4, l.e((Method)localObject3));
      for (localObject6 : ((Method)localObject3).getDeclaredAnnotations())
      {
        localObject7 = (n.c)localObject5;
        j.o(localObject6, "annotation");
        b.a((n.c)localObject7, (Annotation)localObject6);
      }
      localObject3 = ((Method)localObject3).getParameterAnnotations();
      j.o(localObject3, "method.parameterAnnotations");
      n = localObject3.length;
      for (??? = 0; ??? < n; ???++)
        for (localObject6 : localObject3[???])
        {
          localObject7 = a.f.a.a(a.f.a.a((Annotation)localObject6));
          localObject8 = a.i.b.a.e.b.bb((Class)localObject7);
          j.o(localObject6, "annotation");
          localObject8 = ((n.f)localObject5).a(???, (a.i.b.a.c.f.a)localObject8, (am)new a((Annotation)localObject6));
          if (localObject8 != null)
            b.AZq.a((n.a)localObject8, (Annotation)localObject6, (Class)localObject7);
        }
      ((n.f)localObject5).zn();
    }
    label462: label611: label623: for (localObject3 : ((Class)localObject1).getDeclaredConstructors())
    {
      localObject5 = f.avZ("<init>");
      j.o(localObject5, "Name.special(\"<init>\")");
      localObject4 = l.AZG;
      j.o(localObject3, "constructor");
      localObject5 = parame.a((f)localObject5, l.a((Constructor)localObject3));
      for (localObject6 : ((Constructor)localObject3).getDeclaredAnnotations())
      {
        localObject7 = (n.c)localObject5;
        j.o(localObject6, "annotation");
        b.a((n.c)localObject7, (Annotation)localObject6);
      }
      localObject4 = ((Constructor)localObject3).getParameterAnnotations();
      j.o(localObject4, "parameterAnnotations");
      int i2;
      if (((Object[])localObject4).length == 0)
      {
        ??? = 1;
        if (??? != 0)
          break label611;
        ??? = 1;
        if (??? == 0)
          break label623;
        n = ((Constructor)localObject3).getParameterTypes().length;
        i2 = ((Object[])localObject4).length;
        ??? = localObject4.length;
      }
      for (??? = 0; ; ???++)
      {
        if (??? >= ???)
          break label623;
        localObject7 = localObject4[???];
        int i3 = localObject7.length;
        ??? = 0;
        while (true)
          if (??? < i3)
          {
            localObject3 = localObject7[???];
            localObject6 = a.f.a.a(a.f.a.a((Annotation)localObject3));
            localObject8 = a.i.b.a.e.b.bb((Class)localObject6);
            j.o(localObject3, "annotation");
            localObject8 = ((n.f)localObject5).a(??? + (n - i2), (a.i.b.a.c.f.a)localObject8, (am)new a((Annotation)localObject3));
            if (localObject8 != null)
              b.AZq.a((n.a)localObject8, (Annotation)localObject3, (Class)localObject6);
            ???++;
            continue;
            ??? = 0;
            break;
            ??? = 0;
            break label462;
          }
      }
      ((n.f)localObject5).zn();
    }
    for (localObject5 : ((Class)localObject1).getDeclaredFields())
    {
      j.o(localObject5, "field");
      ??? = f.avX(((Field)localObject5).getName());
      j.o(???, "Name.identifier(field.name)");
      localObject3 = l.AZG;
      ??? = parame.b((f)???, l.d((Field)localObject5));
      for (localObject5 : ((Field)localObject5).getDeclaredAnnotations())
      {
        j.o(localObject5, "annotation");
        b.a((n.c)???, (Annotation)localObject5);
      }
      ((n.c)???).zn();
    }
    AppMethodBeat.o(119036);
  }

  public final a.i.b.a.c.f.a dWY()
  {
    AppMethodBeat.i(119034);
    a.i.b.a.c.f.a locala = a.i.b.a.e.b.bb(this.AZs);
    AppMethodBeat.o(119034);
    return locala;
  }

  public final a.i.b.a.c.d.b.a.a dXA()
  {
    return this.AZt;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(119037);
    boolean bool;
    if (((paramObject instanceof e)) && (j.j(this.AZs, ((e)paramObject).AZs)))
    {
      bool = true;
      AppMethodBeat.o(119037);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(119037);
    }
  }

  public final String getLocation()
  {
    AppMethodBeat.i(119033);
    Object localObject = new StringBuilder();
    String str = this.AZs.getName();
    j.o(str, "klass.name");
    localObject = m.a(str, '.', '/') + ".class";
    AppMethodBeat.o(119033);
    return localObject;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(119038);
    int i = this.AZs.hashCode();
    AppMethodBeat.o(119038);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(119039);
    String str = getClass().getName() + ": " + this.AZs;
    AppMethodBeat.o(119039);
    return str;
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass$Factory;", "", "()V", "create", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "klass", "Ljava/lang/Class;", "descriptors.runtime"})
  public static final class a
  {
    public static e aV(Class<?> paramClass)
    {
      int i = 1;
      AppMethodBeat.i(119032);
      j.p(paramClass, "klass");
      a.i.b.a.c.d.b.a.b localb = new a.i.b.a.c.d.b.a.b();
      Object localObject = b.AZq;
      b.a(paramClass, (n.c)localb);
      e locale = new a/i/b/a/b/e;
      if ((localb.Bsv == null) || (localb.Bsu == null))
      {
        localObject = null;
        if (localObject != null)
          break label251;
        AppMethodBeat.o(119032);
      }
      for (paramClass = null; ; paramClass = locale)
      {
        return paramClass;
        localObject = localb.Bsu;
        boolean bool;
        label85: g localg;
        label118: a.a locala;
        if ((localb.Bsi & 0x8) != 0)
        {
          bool = true;
          localg = new g((int[])localObject, bool);
          if (localg.ehy())
            break label182;
          localb.Bsg = localb.Bsf;
          localb.Bsf = null;
          locala = localb.Bsv;
          if (localb.Bse == null)
            break label244;
        }
        label182: label238: label242: label244: for (localObject = localb.Bse; ; localObject = d.Byp)
        {
          localObject = new a.i.b.a.c.d.b.a.a(locala, localg, (d)localObject, localb.Bsf, localb.Bsg, localb.strings, localb.Bsh, localb.Bsi, localb.packageName);
          break;
          bool = false;
          break label85;
          int j = i;
          if (localb.Bsv != a.a.Bsk)
          {
            j = i;
            if (localb.Bsv != a.a.Bsl)
              if (localb.Bsv != a.a.Bso)
                break label238;
          }
          for (j = i; ; j = 0)
          {
            if ((j == 0) || (localb.Bsf != null))
              break label242;
            localObject = null;
            break;
          }
          break label118;
        }
        label251: locale.<init>(paramClass, (a.i.b.a.c.d.b.a.a)localObject, (byte)0);
        AppMethodBeat.o(119032);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.e
 * JD-Core Version:    0.6.2
 */