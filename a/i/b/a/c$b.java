package a.i.b.a;

import a.a.e;
import a.f.a.b;
import a.f.b.j;
import a.f.b.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflect-api"})
public final class c$b extends c
{
  final Constructor<?> AWh;

  public c$b(Constructor<?> paramConstructor)
  {
    super((byte)0);
    AppMethodBeat.i(118674);
    this.AWh = paramConstructor;
    AppMethodBeat.o(118674);
  }

  public final String pq()
  {
    AppMethodBeat.i(118673);
    Object localObject = this.AWh.getParameterTypes();
    j.o(localObject, "constructor.parameterTypes");
    localObject = e.a((Object[])localObject, (CharSequence)"", (CharSequence)"<init>(", (CharSequence)")V", 0, null, (b)a.AWi, 24);
    AppMethodBeat.o(118673);
    return localObject;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"})
  static final class a extends k
    implements b<Class<?>, String>
  {
    public static final a AWi;

    static
    {
      AppMethodBeat.i(118672);
      AWi = new a();
      AppMethodBeat.o(118672);
    }

    a()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b
 * JD-Core Version:    0.6.2
 */