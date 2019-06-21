package a.i.b.a.e;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"})
final class a
{
  private static a.a BNI;
  public static final a BNJ;

  static
  {
    AppMethodBeat.i(123009);
    BNJ = new a();
    AppMethodBeat.o(123009);
  }

  private static a.a a(Member paramMember)
  {
    AppMethodBeat.i(123007);
    j.p(paramMember, "member");
    paramMember = paramMember.getClass();
    try
    {
      Method localMethod = paramMember.getMethod("getParameters", new Class[0]);
      paramMember = new a.a(localMethod, b.aX(paramMember).loadClass("java.lang.reflect.Parameter").getMethod("getName", new Class[0]));
      AppMethodBeat.o(123007);
      return paramMember;
    }
    catch (NoSuchMethodException paramMember)
    {
      while (true)
      {
        paramMember = new a.a(null, null);
        AppMethodBeat.o(123007);
      }
    }
  }

  public static List<String> b(Member paramMember)
  {
    Object localObject1 = null;
    AppMethodBeat.i(123008);
    j.p(paramMember, "member");
    Object localObject2 = BNI;
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      localObject3 = a(paramMember);
      BNI = (a.a)localObject3;
    }
    localObject2 = ((a.a)localObject3).BNK;
    if (localObject2 == null)
    {
      AppMethodBeat.o(123008);
      paramMember = localObject1;
    }
    while (true)
    {
      return paramMember;
      localObject3 = ((a.a)localObject3).BNL;
      if (localObject3 == null)
      {
        AppMethodBeat.o(123008);
        paramMember = localObject1;
      }
      else
      {
        paramMember = ((Method)localObject2).invoke(paramMember, new Object[0]);
        if (paramMember == null)
        {
          paramMember = new v("null cannot be cast to non-null type kotlin.Array<*>");
          AppMethodBeat.o(123008);
          throw paramMember;
        }
        paramMember = (Object[])paramMember;
        localObject2 = (Collection)new ArrayList(paramMember.length);
        int i = paramMember.length;
        for (int j = 0; j < i; j++)
        {
          localObject1 = ((Method)localObject3).invoke(paramMember[j], new Object[0]);
          if (localObject1 == null)
          {
            paramMember = new v("null cannot be cast to non-null type kotlin.String");
            AppMethodBeat.o(123008);
            throw paramMember;
          }
          ((Collection)localObject2).add((String)localObject1);
        }
        paramMember = (List)localObject2;
        AppMethodBeat.o(123008);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.e.a
 * JD-Core Version:    0.6.2
 */