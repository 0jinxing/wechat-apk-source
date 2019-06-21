package a.i.b.a;

import a.a.e;
import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflect-api"})
public final class c$a extends c
{
  private final Class<?> AVA;
  final List<Method> AWf;

  public c$a(Class<?> paramClass)
  {
    super((byte)0);
    AppMethodBeat.i(118670);
    this.AVA = paramClass;
    paramClass = this.AVA.getDeclaredMethods();
    a.f.b.j.o(paramClass, "jClass.declaredMethods");
    Comparator localComparator = (Comparator)new c.a.a();
    a.f.b.j.p(paramClass, "receiver$0");
    a.f.b.j.p(localComparator, "comparator");
    a.f.b.j.p(paramClass, "receiver$0");
    a.f.b.j.p(localComparator, "comparator");
    if (paramClass.length == 0)
      i = 1;
    if (i != 0);
    while (true)
    {
      this.AWf = e.asList(paramClass);
      AppMethodBeat.o(118670);
      return;
      paramClass = Arrays.copyOf(paramClass, paramClass.length);
      a.f.b.j.o(paramClass, "java.util.Arrays.copyOf(this, size)");
      e.a(paramClass, localComparator);
    }
  }

  public final String pq()
  {
    AppMethodBeat.i(118669);
    String str = a.a.j.a((Iterable)this.AWf, (CharSequence)"", (CharSequence)"<init>(", (CharSequence)")V", 0, null, (b)c.a.b.AWg, 24);
    AppMethodBeat.o(118669);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a
 * JD-Core Version:    0.6.2
 */