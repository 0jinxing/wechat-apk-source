package a.i.b.a;

import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.d.a.o;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.e.a.h;
import a.i.b.a.c.e.b.a.f.a;
import a.i.b.a.c.e.b.b;
import a.i.b.a.c.e.b.b.c;
import a.i.b.a.c.e.b.b.e;
import a.i.b.a.c.f.g;
import a.i.b.a.c.g.i.c;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflect-api"})
public abstract class d
{
  public abstract String pq();

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "string", "", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "asString", "getManglingSuffix", "kotlin-reflect-api"})
  public static final class c extends d
  {
    final ah AWn;
    final a.u AWo;
    final b.e AWp;
    final c AWq;
    final h AWr;
    private final String string;

    public c(ah paramah, a.u paramu, b.e parame, c paramc, h paramh)
    {
      super();
      AppMethodBeat.i(118683);
      this.AWn = paramah;
      this.AWo = paramu;
      this.AWp = parame;
      this.AWq = paramc;
      this.AWr = paramh;
      if (this.AWp.egY())
      {
        paramu = new StringBuilder();
        paramah = this.AWq;
        parame = this.AWp.BxS;
        a.f.b.j.o(parame, "signature.getter");
        paramu = paramu.append(paramah.getString(parame.Buf));
        paramah = this.AWq;
        parame = this.AWp.BxS;
        a.f.b.j.o(parame, "signature.getter");
        paramah = paramah.getString(parame.BxN);
        this.string = paramah;
        AppMethodBeat.o(118683);
        return;
      }
      paramah = a.i.b.a.c.e.b.a.j.ByD;
      paramu = a.i.b.a.c.e.b.a.j.a(this.AWo, this.AWq, this.AWr);
      if (paramu == null)
      {
        paramah = (Throwable)new x("No field signature for property: " + this.AWn);
        AppMethodBeat.o(118683);
        throw paramah;
      }
      paramah = paramu.name;
      parame = paramu.desc;
      paramc = new StringBuilder().append(o.avJ(paramah));
      paramah = this.AWn.dXW();
      a.f.b.j.o(paramah, "descriptor.containingDeclaration");
      if ((a.f.b.j.j(this.AWn.dYf(), ay.BeZ)) && ((paramah instanceof a.i.b.a.c.j.a.a.d)))
      {
        paramah = (i.c)((a.i.b.a.c.j.a.a.d)paramah).BGD;
        paramu = b.BxH;
        a.f.b.j.o(paramu, "JvmProtoBuf.classModuleName");
        paramah = (Integer)a.i.b.a.c.e.a.f.a(paramah, paramu);
        if (paramah != null)
        {
          paramu = this.AWq.getString(((Number)paramah).intValue());
          paramah = paramu;
          if (paramu != null);
        }
        else
        {
          paramah = "main";
        }
        paramah = "$" + g.awb(paramah);
      }
      while (true)
      {
        paramah = paramah + "()" + parame;
        break;
        if ((a.f.b.j.j(this.AWn.dYf(), ay.BeW)) && ((paramah instanceof ab)))
        {
          paramah = this.AWn;
          if (paramah == null)
          {
            paramah = new v("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            AppMethodBeat.o(118683);
            throw paramah;
          }
          paramah = ((a.i.b.a.c.j.a.a.i)paramah).BHe;
          if (((paramah instanceof a.i.b.a.c.d.b.i)) && (((a.i.b.a.c.d.b.i)paramah).Bry != null))
            paramah = "$" + ((a.i.b.a.c.d.b.i)paramah).ect().name;
        }
        else
        {
          paramah = "";
        }
      }
    }

    public final String pq()
    {
      return this.string;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.d
 * JD-Core Version:    0.6.2
 */