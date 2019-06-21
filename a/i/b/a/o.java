package a.i.b.a;

import a.f.b.t;
import a.f.b.v;
import a.i.b.a.c.b.ae;
import a.i.b.a.c.b.au;
import a.i.b.a.c.f.f;
import a.i.j.a;
import a.i.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "callable", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "index", "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "equals", "other", "", "hashCode", "toString", "kotlin-reflect-api"})
public final class o
  implements a.i.j
{
  private final z.a AWG;
  private final z.a AWH;
  final e<?> AXL;
  final j.a AXM;
  final int index;

  static
  {
    AppMethodBeat.i(118818);
    eQB = new k[] { (k)v.a(new t(v.aN(o.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), (k)v.a(new t(v.aN(o.class), "annotations", "getAnnotations()Ljava/util/List;")) };
    AppMethodBeat.o(118818);
  }

  public o(e<?> parame, int paramInt, j.a parama, a.f.a.a<? extends ae> parama1)
  {
    AppMethodBeat.i(118824);
    this.AXL = parame;
    this.index = paramInt;
    this.AXM = parama;
    this.AWG = z.a(null, parama1);
    this.AWH = z.a(null, (a.f.a.a)new o.a(this));
    AppMethodBeat.o(118824);
  }

  private final ae dXi()
  {
    AppMethodBeat.i(118819);
    ae localae = (ae)this.AWG.invoke();
    AppMethodBeat.o(118819);
    return localae;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118821);
    boolean bool;
    if (((paramObject instanceof o)) && (a.f.b.j.j(this.AXL, ((o)paramObject).AXL)) && (a.f.b.j.j(dXi(), ((o)paramObject).dXi())))
    {
      bool = true;
      AppMethodBeat.o(118821);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118821);
    }
  }

  public final String getName()
  {
    Object localObject1 = null;
    AppMethodBeat.i(118820);
    ae localae = dXi();
    Object localObject2 = localae;
    if (!(localae instanceof au))
      localObject2 = null;
    localObject2 = (au)localObject2;
    if (localObject2 == null)
    {
      AppMethodBeat.o(118820);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      if (((au)localObject2).dZT().dYW())
      {
        AppMethodBeat.o(118820);
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = ((au)localObject2).dZg();
        a.f.b.j.o(localObject2, "valueParameter.name");
        if (((f)localObject2).ByZ)
        {
          AppMethodBeat.o(118820);
          localObject2 = localObject1;
        }
        else
        {
          localObject2 = ((f)localObject2).name;
          AppMethodBeat.o(118820);
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(118822);
    int i = this.AXL.hashCode();
    int j = dXi().hashCode();
    AppMethodBeat.o(118822);
    return i * 31 + j;
  }

  public final String toString()
  {
    AppMethodBeat.i(118823);
    Object localObject = ab.AYy;
    localObject = ab.b(this);
    AppMethodBeat.o(118823);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.o
 * JD-Core Version:    0.6.2
 */