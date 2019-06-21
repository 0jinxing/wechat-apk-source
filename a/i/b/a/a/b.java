package a.i.b.a.a;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.f.b.r;
import a.g;
import a.i.k;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"createAnnotationInstance", "T", "", "annotationClass", "Ljava/lang/Class;", "values", "", "", "methods", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", "", "index", "", "name", "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflect-api", "hashCode", "toString"})
public final class b
{
  static
  {
    AppMethodBeat.i(118966);
    eQB = new k[] { (k)a.f.b.v.a(new r(a.f.b.v.f(b.class, "kotlin-reflect-api"), "hashCode", "<v#0>")), (k)a.f.b.v.a(new r(a.f.b.v.f(b.class, "kotlin-reflect-api"), "toString", "<v#1>")) };
    AppMethodBeat.o(118966);
  }

  public static final <T> T a(Class<T> paramClass, Map<String, ? extends Object> paramMap, List<Method> paramList)
  {
    AppMethodBeat.i(118967);
    j.p(paramClass, "annotationClass");
    j.p(paramMap, "values");
    j.p(paramList, "methods");
    b.a locala = new b.a(paramClass, paramList, paramMap);
    f localf1 = g.g((a)new b.b(paramMap));
    k localk1 = eQB[0];
    f localf2 = g.g((a)new b.d(paramClass, paramMap));
    k localk2 = eQB[1];
    paramList = paramClass.getClassLoader();
    paramMap = (InvocationHandler)new b.c(paramClass, localf2, localk2, localf1, localk1, locala, paramMap);
    paramClass = Proxy.newProxyInstance(paramList, new Class[] { paramClass }, paramMap);
    if (paramClass == null)
    {
      paramClass = new a.v("null cannot be cast to non-null type T");
      AppMethodBeat.o(118967);
      throw paramClass;
    }
    AppMethodBeat.o(118967);
    return paramClass;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.a.b
 * JD-Core Version:    0.6.2
 */