package a.i.b.a;

import a.f.a.b;
import a.i.b.a.c.b.a;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.t;
import a.i.b.a.c.f.f;
import a.i.b.a.c.h.c;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import a.i.j.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "()V", "renderer", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderCallable", "", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "renderFunction", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "renderLambda", "invoke", "renderParameter", "parameter", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "renderProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "renderType", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "renderTypeParameter", "typeParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "appendReceiverType", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "receiver", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "appendReceivers", "callable", "kotlin-reflect-api"})
public final class ab
{
  private static final c AYx;
  public static final ab AYy;

  static
  {
    AppMethodBeat.i(118924);
    AYy = new ab();
    AYx = c.BBL;
    AppMethodBeat.o(118924);
  }

  public static String a(ar paramar)
  {
    AppMethodBeat.i(118922);
    a.f.b.j.p(paramar, "typeParameter");
    StringBuilder localStringBuilder = new StringBuilder();
    ba localba = paramar.dZh();
    switch (ac.pCY[localba.ordinal()])
    {
    case 1:
    default:
    case 2:
    case 3:
    }
    while (true)
    {
      localStringBuilder.append(paramar.dZg());
      paramar = localStringBuilder.toString();
      a.f.b.j.o(paramar, "StringBuilder().apply(builderAction).toString()");
      AppMethodBeat.o(118922);
      return paramar;
      localStringBuilder.append("in ");
      continue;
      localStringBuilder.append("out ");
    }
  }

  public static String a(t paramt)
  {
    AppMethodBeat.i(118919);
    a.f.b.j.p(paramt, "descriptor");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fun ");
    a(localStringBuilder, (a)paramt);
    Object localObject = AYx;
    f localf = paramt.dZg();
    a.f.b.j.o(localf, "descriptor.name");
    localStringBuilder.append(((c)localObject).b(localf, true));
    localObject = paramt.dYV();
    a.f.b.j.o(localObject, "descriptor.valueParameters");
    a.a.j.a((Iterable)localObject, (Appendable)localStringBuilder, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, null, (b)ab.a.AYz, 48);
    localStringBuilder.append(": ");
    paramt = paramt.dYT();
    if (paramt == null)
      a.f.b.j.dWJ();
    a.f.b.j.o(paramt, "descriptor.returnType!!");
    localStringBuilder.append(b(paramt));
    paramt = localStringBuilder.toString();
    a.f.b.j.o(paramt, "StringBuilder().apply(builderAction).toString()");
    AppMethodBeat.o(118919);
    return paramt;
  }

  private static void a(StringBuilder paramStringBuilder, a parama)
  {
    AppMethodBeat.i(118917);
    ak localak = af.a(parama);
    parama = parama.dYQ();
    a(paramStringBuilder, localak);
    if ((localak != null) && (parama != null));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        paramStringBuilder.append("(");
      a(paramStringBuilder, parama);
      if (i != 0)
        paramStringBuilder.append(")");
      AppMethodBeat.o(118917);
      return;
    }
  }

  private static void a(StringBuilder paramStringBuilder, ak paramak)
  {
    AppMethodBeat.i(118916);
    if (paramak != null)
    {
      paramak = paramak.dZS();
      a.f.b.j.o(paramak, "receiver.type");
      paramStringBuilder.append(b(paramak));
      paramStringBuilder.append(".");
    }
    AppMethodBeat.o(118916);
  }

  public static String b(ah paramah)
  {
    AppMethodBeat.i(118918);
    a.f.b.j.p(paramah, "descriptor");
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramah.dZZ());
    for (Object localObject = "var "; ; localObject = "val ")
    {
      localStringBuilder.append((String)localObject);
      a(localStringBuilder, (a)paramah);
      c localc = AYx;
      localObject = paramah.dZg();
      a.f.b.j.o(localObject, "descriptor.name");
      localStringBuilder.append(localc.b((f)localObject, true));
      localStringBuilder.append(": ");
      paramah = paramah.dZS();
      a.f.b.j.o(paramah, "descriptor.type");
      localStringBuilder.append(b(paramah));
      paramah = localStringBuilder.toString();
      a.f.b.j.o(paramah, "StringBuilder().apply(builderAction).toString()");
      AppMethodBeat.o(118918);
      return paramah;
    }
  }

  public static String b(t paramt)
  {
    AppMethodBeat.i(118920);
    a.f.b.j.p(paramt, "invoke");
    StringBuilder localStringBuilder = new StringBuilder();
    a(localStringBuilder, (a)paramt);
    List localList = paramt.dYV();
    a.f.b.j.o(localList, "invoke.valueParameters");
    a.a.j.a((Iterable)localList, (Appendable)localStringBuilder, (CharSequence)", ", (CharSequence)"(", (CharSequence)")", 0, null, (b)ab.b.AYA, 48);
    localStringBuilder.append(" -> ");
    paramt = paramt.dYT();
    if (paramt == null)
      a.f.b.j.dWJ();
    a.f.b.j.o(paramt, "invoke.returnType!!");
    localStringBuilder.append(b(paramt));
    paramt = localStringBuilder.toString();
    a.f.b.j.o(paramt, "StringBuilder().apply(builderAction).toString()");
    AppMethodBeat.o(118920);
    return paramt;
  }

  public static String b(w paramw)
  {
    AppMethodBeat.i(118923);
    a.f.b.j.p(paramw, "type");
    paramw = AYx.b(paramw);
    AppMethodBeat.o(118923);
    return paramw;
  }

  public static String b(o paramo)
  {
    AppMethodBeat.i(118921);
    a.f.b.j.p(paramo, "parameter");
    StringBuilder localStringBuilder = new StringBuilder();
    j.a locala = paramo.AXM;
    switch (ac.eQZ[locala.ordinal()])
    {
    default:
      localStringBuilder.append(" of ");
      paramo = (a)paramo.AXL.dWT();
      if (!(paramo instanceof ah))
        break;
    case 1:
    case 2:
    case 3:
    }
    for (paramo = b((ah)paramo); ; paramo = a((t)paramo))
    {
      localStringBuilder.append(paramo);
      paramo = localStringBuilder.toString();
      a.f.b.j.o(paramo, "StringBuilder().apply(builderAction).toString()");
      AppMethodBeat.o(118921);
      return paramo;
      localStringBuilder.append("extension receiver");
      break;
      localStringBuilder.append("instance");
      break;
      localStringBuilder.append("parameter #" + paramo.index + ' ' + paramo.getName());
      break;
      if (!(paramo instanceof t))
        break label198;
    }
    label198: paramo = (Throwable)new IllegalStateException("Illegal callable: ".concat(String.valueOf(paramo)).toString());
    AppMethodBeat.o(118921);
    throw paramo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.ab
 * JD-Core Version:    0.6.2
 */