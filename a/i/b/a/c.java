package a.i.b.a;

import a.f.a.b;
import a.f.b.k;
import a.i.b.a.c.e.b.a.f.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflect-api"})
public abstract class c
{
  public abstract String pq();

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"})
  static final class a$b extends k
    implements b<Method, String>
  {
    public static final b AWg;

    static
    {
      AppMethodBeat.i(118668);
      AWg = new b();
      AppMethodBeat.o(118668);
    }

    a$b()
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "_signature", "", "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;", "asString", "kotlin-reflect-api"})
  public static final class d extends c
  {
    private final String AWj;
    final f.b AWk;

    public d(f.b paramb)
    {
      super();
      AppMethodBeat.i(118677);
      this.AWk = paramb;
      this.AWj = this.AWk.pq();
      AppMethodBeat.o(118677);
    }

    public final String pq()
    {
      return this.AWj;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c
 * JD-Core Version:    0.6.2
 */