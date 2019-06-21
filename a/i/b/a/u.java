package a.i.b.a;

import a.f.b.r;
import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.av;
import a.i.b.a.e.b;
import a.i.c;
import a.i.o;
import a.l;
import a.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Type;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "arguments", "Lkotlin/reflect/KTypeProjection;", "getArguments", "arguments$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "isMarkedNullable", "", "()Z", "javaType", "getJavaType$kotlin_reflect_api", "()Ljava/lang/reflect/Type;", "javaType$delegate", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "convert", "equals", "other", "", "hashCode", "", "toString", "", "kotlin-reflect-api", "parameterizedTypeArguments"})
public final class u
  implements o
{
  private final z.a AYi;
  private final z.a AYj;
  private final z.a AYk;
  public final a.i.b.a.c.l.w AYl;

  static
  {
    AppMethodBeat.i(118877);
    eQB = new a.i.k[] { (a.i.k)v.a(new t(v.aN(u.class), "javaType", "getJavaType$kotlin_reflect_api()Ljava/lang/reflect/Type;")), (a.i.k)v.a(new t(v.aN(u.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), (a.i.k)v.a(new t(v.aN(u.class), "arguments", "getArguments()Ljava/util/List;")), (a.i.k)v.a(new r(v.aN(u.class), "parameterizedTypeArguments", "<v#0>")) };
    AppMethodBeat.o(118877);
  }

  public u(a.i.b.a.c.l.w paramw, a.f.a.a<? extends Type> parama)
  {
    AppMethodBeat.i(118884);
    this.AYl = paramw;
    this.AYi = z.a(null, parama);
    this.AYj = z.a(null, (a.f.a.a)new b(this));
    this.AYk = z.a(null, (a.f.a.a)new u.a(this));
    AppMethodBeat.o(118884);
  }

  private final c a(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(118880);
    Object localObject = paramw.ejw().dYs();
    if ((localObject instanceof e))
    {
      localObject = af.a((e)localObject);
      if (localObject == null)
      {
        AppMethodBeat.o(118880);
        paramw = null;
      }
      while (true)
      {
        return paramw;
        if (!((Class)localObject).isArray())
          break;
        paramw = (ap)a.a.j.fO(paramw.ejt());
        if (paramw != null)
        {
          paramw = paramw.dZS();
          if (paramw != null);
        }
        else
        {
          paramw = (c)new g((Class)localObject);
          AppMethodBeat.o(118880);
          continue;
        }
        a.f.b.j.o(paramw, "type.arguments.singleOrN…return KClassImpl(jClass)");
        paramw = a(paramw);
        if (paramw == null)
        {
          paramw = (Throwable)new x("Cannot determine classifier for array element type: ".concat(String.valueOf(this)));
          AppMethodBeat.o(118880);
          throw paramw;
        }
        paramw = (c)new g(b.bd(a.f.a.a(a.i.b.a.a(paramw))));
        AppMethodBeat.o(118880);
      }
      if (!av.aB(paramw))
      {
        paramw = b.aZ((Class)localObject);
        if (paramw != null)
          break label303;
        paramw = (a.i.b.a.c.l.w)localObject;
      }
    }
    label303: 
    while (true)
    {
      paramw = (c)new g(paramw);
      AppMethodBeat.o(118880);
      break;
      paramw = (c)new g((Class)localObject);
      AppMethodBeat.o(118880);
      break;
      if ((localObject instanceof ar))
      {
        paramw = (c)new w((ar)localObject);
        AppMethodBeat.o(118880);
        break;
      }
      if ((localObject instanceof aq))
      {
        paramw = (Throwable)new n("An operation is not implemented: ".concat(String.valueOf("Type alias classifiers are not yet supported")));
        AppMethodBeat.o(118880);
        throw paramw;
      }
      AppMethodBeat.o(118880);
      paramw = null;
      break;
    }
  }

  public final c dWO()
  {
    AppMethodBeat.i(118879);
    c localc = (c)this.AYj.invoke();
    AppMethodBeat.o(118879);
    return localc;
  }

  public final Type dXu()
  {
    AppMethodBeat.i(118878);
    Type localType = (Type)this.AYi.invoke();
    AppMethodBeat.o(118878);
    return localType;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118881);
    boolean bool;
    if (((paramObject instanceof u)) && (a.f.b.j.j(this.AYl, ((u)paramObject).AYl)))
    {
      bool = true;
      AppMethodBeat.o(118881);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118881);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118882);
    int i = this.AYl.hashCode();
    AppMethodBeat.o(118882);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(118883);
    Object localObject = ab.AYy;
    localObject = ab.b(this.AYl);
    AppMethodBeat.o(118883);
    return localObject;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Lkotlin/reflect/KClassifier;", "invoke"})
  static final class b extends a.f.b.k
    implements a.f.a.a<c>
  {
    b(u paramu)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.u
 * JD-Core Version:    0.6.2
 */