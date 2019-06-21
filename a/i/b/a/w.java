package a.i.b.a;

import a.f.a.a;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.ar;
import a.i.k;
import a.i.o;
import a.i.p;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", "", "()Z", "name", "", "getName", "()Ljava/lang/String;", "upperBounds", "", "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "", "hashCode", "", "toString", "kotlin-reflect-api"})
public final class w
  implements p
{
  private final z.a AYq;
  final ar AYr;

  static
  {
    AppMethodBeat.i(118888);
    eQB = new k[] { (k)v.a(new t(v.aN(w.class), "upperBounds", "getUpperBounds()Ljava/util/List;")) };
    AppMethodBeat.o(118888);
  }

  public w(ar paramar)
  {
    AppMethodBeat.i(118893);
    this.AYr = paramar;
    this.AYq = z.a(null, (a)new w.a(this));
    AppMethodBeat.o(118893);
  }

  public final List<o> dWP()
  {
    AppMethodBeat.i(118889);
    List localList = (List)this.AYq.invoke();
    AppMethodBeat.o(118889);
    return localList;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118890);
    boolean bool;
    if (((paramObject instanceof w)) && (j.j(this.AYr, ((w)paramObject).AYr)))
    {
      bool = true;
      AppMethodBeat.o(118890);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118890);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118891);
    int i = this.AYr.hashCode();
    AppMethodBeat.o(118891);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(118892);
    Object localObject = ab.AYy;
    localObject = ab.a(this.AYr);
    AppMethodBeat.o(118892);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.w
 * JD-Core Version:    0.6.2
 */