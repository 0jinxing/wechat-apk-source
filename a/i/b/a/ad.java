package a.i.b.a;

import a.i.b.a.c.a.h;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ai;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.d.a.b.e;
import a.i.b.a.c.d.a.o;
import a.i.b.a.c.d.b.r;
import a.i.b.a.c.e.a.e;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.e.b.a.f.b;
import a.i.b.a.c.e.b.b.e;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.f;
import a.i.b.a.c.j.a.a.i;
import a.i.b.a.e.m;
import a.i.b.a.e.p;
import a.i.b.a.e.s;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "()V", "JAVA_LANG_VOID", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "primitiveType", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "Ljava/lang/Class;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "mapJvmClassToKotlinClassId", "klass", "mapJvmFunctionSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "mapName", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "mapPropertySignature", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "mapSignature", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "possiblySubstitutedFunction", "kotlin-reflect-api"})
public final class ad
{
  static final a.i.b.a.c.f.a AYB;
  public static final ad AYC;

  static
  {
    AppMethodBeat.i(118930);
    AYC = new ad();
    a.i.b.a.c.f.a locala = a.i.b.a.c.f.a.n(new a.i.b.a.c.f.b("java.lang.Void"));
    a.f.b.j.o(locala, "ClassId.topLevel(FqName(\"java.lang.Void\"))");
    AYB = locala;
    AppMethodBeat.o(118930);
  }

  static h aR(Class<?> paramClass)
  {
    AppMethodBeat.i(118929);
    if (paramClass.isPrimitive())
    {
      paramClass = a.i.b.a.c.i.d.c.awk(paramClass.getSimpleName());
      a.f.b.j.o(paramClass, "JvmPrimitiveType.get(simpleName)");
      paramClass = paramClass.BFq;
      AppMethodBeat.o(118929);
    }
    while (true)
    {
      return paramClass;
      paramClass = null;
      AppMethodBeat.o(118929);
    }
  }

  private static String b(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(118928);
    String str = a.i.b.a.c.d.a.t.q(paramb);
    Object localObject = str;
    if (str == null)
    {
      if (!(paramb instanceof ai))
        break label54;
      paramb = o.avJ(a.i.b.a.c.i.c.a.x(paramb).dZg().name);
    }
    while (true)
    {
      a.f.b.j.o(paramb, "when (descriptor) {\n    …name.asString()\n        }");
      localObject = paramb;
      AppMethodBeat.o(118928);
      return localObject;
      label54: if ((paramb instanceof aj))
        paramb = o.avK(a.i.b.a.c.i.c.a.x(paramb).dZg().name);
      else
        paramb = paramb.dZg().name;
    }
  }

  public static c c(a.i.b.a.c.b.t paramt)
  {
    AppMethodBeat.i(118925);
    a.f.b.j.p(paramt, "possiblySubstitutedFunction");
    paramt = a.i.b.a.c.i.d.u((a.i.b.a.c.b.b)paramt);
    a.f.b.j.o(paramt, "DescriptorUtils.unwrapFa…siblySubstitutedFunction)");
    a.i.b.a.c.b.t localt = ((a.i.b.a.c.b.t)paramt).dZp();
    a.f.b.j.o(localt, "DescriptorUtils.unwrapFa…titutedFunction).original");
    Object localObject;
    if ((localt instanceof a.i.b.a.c.j.a.a.b))
    {
      paramt = ((a.i.b.a.c.j.a.a.b)localt).ejU();
      if ((paramt instanceof a.o))
      {
        localObject = a.i.b.a.c.e.b.a.j.ByD;
        localObject = a.i.b.a.c.e.b.a.j.a((a.o)paramt, ((a.i.b.a.c.j.a.a.b)localt).ejV(), ((a.i.b.a.c.j.a.a.b)localt).ejW());
        if (localObject != null)
        {
          paramt = (c)new c.e((f.b)localObject);
          AppMethodBeat.o(118925);
        }
      }
    }
    while (true)
    {
      return paramt;
      if ((paramt instanceof a.e))
      {
        localObject = a.i.b.a.c.e.b.a.j.ByD;
        paramt = a.i.b.a.c.e.b.a.j.a((a.e)paramt, ((a.i.b.a.c.j.a.a.b)localt).ejV(), ((a.i.b.a.c.j.a.a.b)localt).ejW());
        if (paramt != null)
        {
          paramt = (c)new c.d(paramt);
          AppMethodBeat.o(118925);
        }
      }
      else
      {
        paramt = (c)d(localt);
        AppMethodBeat.o(118925);
        continue;
        if ((localt instanceof e))
        {
          localObject = ((e)localt).dYo();
          paramt = (a.i.b.a.c.b.t)localObject;
          if (!(localObject instanceof a.i.b.a.c.d.a.d.a))
            paramt = null;
          paramt = (a.i.b.a.c.d.a.d.a)paramt;
          if (paramt != null);
          for (paramt = paramt.dXC(); ; paramt = null)
          {
            localObject = paramt;
            if (!(paramt instanceof s))
              localObject = null;
            paramt = (s)localObject;
            if (paramt != null)
            {
              paramt = paramt.BOh;
              if (paramt != null)
                break;
            }
            paramt = (Throwable)new x("Incorrect resolution sequence for Java method ".concat(String.valueOf(localt)));
            AppMethodBeat.o(118925);
            throw paramt;
          }
          paramt = (c)new c.c(paramt);
          AppMethodBeat.o(118925);
        }
        else
        {
          if (!(localt instanceof a.i.b.a.c.d.a.b.c))
            break label494;
          localObject = ((a.i.b.a.c.d.a.b.c)localt).dYo();
          paramt = (a.i.b.a.c.b.t)localObject;
          if (!(localObject instanceof a.i.b.a.c.d.a.d.a))
            paramt = null;
          paramt = (a.i.b.a.c.d.a.d.a)paramt;
          if (paramt != null);
          for (paramt = paramt.dXC(); ; paramt = null)
          {
            if (!(paramt instanceof m))
              break label398;
            paramt = (c)new c.b(((m)paramt).BOe);
            AppMethodBeat.o(118925);
            break;
          }
          label398: if ((!(paramt instanceof a.i.b.a.e.j)) || (!((a.i.b.a.e.j)paramt).AZs.isAnnotation()))
            break;
          paramt = (c)new c.a(((a.i.b.a.e.j)paramt).AZs);
          AppMethodBeat.o(118925);
        }
      }
    }
    paramt = (Throwable)new x("Incorrect resolution sequence for Java constructor " + localt + " (" + paramt + ')');
    AppMethodBeat.o(118925);
    throw paramt;
    label494: if ((localt.dZg().equals(a.i.b.a.c.i.d.BDR)) && (a.i.b.a.c.i.c.g(localt)))
    {
      i = 1;
      if (i == 0)
        if ((!localt.dZg().equals(a.i.b.a.c.i.d.BDQ)) || (!a.i.b.a.c.i.c.g(localt)))
          break label571;
    }
    label518: label571: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label576;
      paramt = (c)d(localt);
      AppMethodBeat.o(118925);
      break;
      i = 0;
      break label518;
    }
    label576: paramt = (Throwable)new x("Unknown origin of " + localt + " (" + localt.getClass() + ')');
    AppMethodBeat.o(118925);
    throw paramt;
  }

  public static d c(ah paramah)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(118926);
    a.f.b.j.p(paramah, "possiblyOverriddenProperty");
    paramah = a.i.b.a.c.i.d.u((a.i.b.a.c.b.b)paramah);
    a.f.b.j.o(paramah, "DescriptorUtils.unwrapFa…ssiblyOverriddenProperty)");
    ah localah = ((ah)paramah).dZL();
    a.f.b.j.o(localah, "DescriptorUtils.unwrapFa…rriddenProperty).original");
    Object localObject3;
    if ((localah instanceof i))
    {
      paramah = ((i)localah).AWo;
      localObject2 = (i.c)paramah;
      localObject3 = a.i.b.a.c.e.b.b.BxC;
      a.f.b.j.o(localObject3, "JvmProtoBuf.propertySignature");
      localObject2 = (b.e)a.i.b.a.c.e.a.f.a((i.c)localObject2, (i.f)localObject3);
      if (localObject2 != null)
      {
        paramah = (d)new d.c(localah, paramah, (b.e)localObject2, ((i)localah).AWq, ((i)localah).AWr);
        AppMethodBeat.o(118926);
        return paramah;
      }
    }
    else if ((localah instanceof a.i.b.a.c.d.a.b.f))
    {
      localObject1 = ((a.i.b.a.c.d.a.b.f)localah).dYo();
      paramah = (ah)localObject1;
      if (!(localObject1 instanceof a.i.b.a.c.d.a.d.a))
        paramah = null;
      paramah = (a.i.b.a.c.d.a.d.a)paramah;
      if (paramah != null);
      for (paramah = paramah.dXC(); ; paramah = null)
      {
        if (!(paramah instanceof p))
          break label213;
        paramah = (d)new d.a(((p)paramah).BOg);
        AppMethodBeat.o(118926);
        break;
      }
      label213: if ((paramah instanceof s))
      {
        localObject3 = ((s)paramah).BOh;
        paramah = localah.dZJ();
        if (paramah != null)
        {
          paramah = paramah.dYo();
          label247: localObject1 = paramah;
          if (!(paramah instanceof a.i.b.a.c.d.a.d.a))
            localObject1 = null;
          paramah = (a.i.b.a.c.d.a.d.a)localObject1;
          if (paramah == null)
            break label329;
        }
        for (paramah = paramah.dXC(); ; paramah = null)
        {
          localObject1 = paramah;
          if (!(paramah instanceof s))
            localObject1 = null;
          localObject1 = (s)localObject1;
          paramah = (ah)localObject2;
          if (localObject1 != null)
            paramah = ((s)localObject1).BOh;
          paramah = (d)new d.b((Method)localObject3, paramah);
          AppMethodBeat.o(118926);
          break;
          paramah = null;
          break label247;
        }
      }
      label329: paramah = (Throwable)new x("Incorrect resolution sequence for Java field " + localah + " (source = " + paramah + ')');
      AppMethodBeat.o(118926);
      throw paramah;
    }
    paramah = localah.dZI();
    if (paramah == null)
      a.f.b.j.dWJ();
    localObject2 = d((a.i.b.a.c.b.t)paramah);
    paramah = localah.dZJ();
    if (paramah != null);
    for (paramah = d((a.i.b.a.c.b.t)paramah); ; paramah = (ah)localObject1)
    {
      paramah = (d)new d.d((c.e)localObject2, paramah);
      AppMethodBeat.o(118926);
      break;
    }
  }

  private static c.e d(a.i.b.a.c.b.t paramt)
  {
    AppMethodBeat.i(118927);
    paramt = new c.e(new f.b(b((a.i.b.a.c.b.b)paramt), r.a(paramt, false, false, 1)));
    AppMethodBeat.o(118927);
    return paramt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.ad
 * JD-Core Version:    0.6.2
 */