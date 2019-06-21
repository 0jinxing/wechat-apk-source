package a.d;

import a.f.b.j;
import a.k.m;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"})
public final class b
{
  public static final a AVu;

  static
  {
    AppMethodBeat.i(56014);
    int i = dWA();
    Object localObject1;
    Object localObject2;
    ClassLoader localClassLoader;
    Object localObject3;
    a locala;
    if (i >= 65544)
    {
      try
      {
        localObject1 = Class.forName("kotlin.internal.jdk8.JDK8PlatformImplementations").newInstance();
        j.o(localObject1, "Class.forName(\"kotlin.in…entations\").newInstance()");
        if (localObject1 != null)
          break label493;
        try
        {
          v localv1 = new a/v;
          localv1.<init>("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
          AppMethodBeat.o(56014);
          throw localv1;
        }
        catch (ClassCastException localClassCastException1)
        {
          localObject2 = localObject1.getClass().getClassLoader();
          localClassLoader = a.class.getClassLoader();
          localObject3 = new java/lang/ClassCastException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("Instance classloader: ");
          ((ClassCastException)localObject3).<init>(localObject2 + ", base type classloader: " + localClassLoader);
          Throwable localThrowable1 = ((ClassCastException)localObject3).initCause((Throwable)localClassCastException1);
          j.o(localThrowable1, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
          AppMethodBeat.o(56014);
          throw localThrowable1;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException1)
      {
        try
        {
          localObject1 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
          j.o(localObject1, "Class.forName(\"kotlin.in…entations\").newInstance()");
          if (localObject1 != null)
            break label501;
          try
          {
            v localv2 = new a/v;
            localv2.<init>("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            AppMethodBeat.o(56014);
            throw localv2;
          }
          catch (ClassCastException localClassCastException2)
          {
            localClassLoader = localObject1.getClass().getClassLoader();
            localObject3 = a.class.getClassLoader();
            localObject2 = new java/lang/ClassCastException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Instance classloader: ");
            ((ClassCastException)localObject2).<init>(localClassLoader + ", base type classloader: " + localObject3);
            Throwable localThrowable2 = ((ClassCastException)localObject2).initCause((Throwable)localClassCastException2);
            j.o(localThrowable2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
            AppMethodBeat.o(56014);
            throw localThrowable2;
          }
        }
        catch (ClassNotFoundException localClassNotFoundException2)
        {
        }
      }
    }
    else
    {
      if (i >= 65543)
        try
        {
          localObject1 = Class.forName("a.d.a.a").newInstance();
          j.o(localObject1, "Class.forName(\"kotlin.in…entations\").newInstance()");
          if (localObject1 != null)
            break label509;
          try
          {
            v localv3 = new a/v;
            localv3.<init>("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            AppMethodBeat.o(56014);
            throw localv3;
          }
          catch (ClassCastException localClassCastException3)
          {
            localObject3 = localObject1.getClass().getClassLoader();
            localClassLoader = a.class.getClassLoader();
            localObject2 = new java/lang/ClassCastException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>("Instance classloader: ");
            ((ClassCastException)localObject2).<init>(localObject3 + ", base type classloader: " + localClassLoader);
            Throwable localThrowable3 = ((ClassCastException)localObject2).initCause((Throwable)localClassCastException3);
            j.o(localThrowable3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
            AppMethodBeat.o(56014);
            throw localThrowable3;
          }
        }
        catch (ClassNotFoundException localClassNotFoundException3)
        {
          try
          {
            localObject1 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
            j.o(localObject1, "Class.forName(\"kotlin.in…entations\").newInstance()");
            if (localObject1 != null)
              break label517;
            try
            {
              v localv4 = new a/v;
              localv4.<init>("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
              AppMethodBeat.o(56014);
              throw localv4;
            }
            catch (ClassCastException localClassCastException4)
            {
              localObject2 = localObject1.getClass().getClassLoader();
              localClassLoader = a.class.getClassLoader();
              localObject1 = new java/lang/ClassCastException;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>("Instance classloader: ");
              ((ClassCastException)localObject1).<init>(localObject2 + ", base type classloader: " + localClassLoader);
              Throwable localThrowable4 = ((ClassCastException)localObject1).initCause((Throwable)localClassCastException4);
              j.o(localThrowable4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
              AppMethodBeat.o(56014);
              throw localThrowable4;
            }
          }
          catch (ClassNotFoundException localClassNotFoundException4)
          {
          }
        }
      locala = new a();
    }
    while (true)
    {
      AVu = locala;
      AppMethodBeat.o(56014);
      return;
      label493: locala = (a)localObject1;
      continue;
      label501: locala = (a)localObject1;
      continue;
      label509: locala = (a)localObject1;
      continue;
      label517: locala = (a)localObject1;
    }
  }

  private static final int dWA()
  {
    int i = 65542;
    AppMethodBeat.i(56013);
    String str = System.getProperty("java.specification.version");
    if (str == null)
      AppMethodBeat.o(56013);
    while (true)
    {
      return i;
      int j = m.a((CharSequence)str, '.', 0, 6);
      if (j < 0)
        try
        {
          i = Integer.parseInt(str);
          i *= 65536;
          AppMethodBeat.o(56013);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          while (true)
            i = 65542;
        }
      int k = m.a((CharSequence)str, '.', j + 1, 4);
      int m = k;
      if (k < 0)
        m = str.length();
      if (str == null)
      {
        localObject = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(56013);
        throw ((Throwable)localObject);
      }
      Object localObject = str.substring(0, j);
      j.o(localObject, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      if (str == null)
      {
        localObject = new v("null cannot be cast to non-null type java.lang.String");
        AppMethodBeat.o(56013);
        throw ((Throwable)localObject);
      }
      str = str.substring(j + 1, m);
      j.o(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      try
      {
        m = Integer.parseInt((String)localObject);
        k = Integer.parseInt(str);
        i = m * 65536 + k;
        label189: AppMethodBeat.o(56013);
      }
      catch (NumberFormatException localNumberFormatException2)
      {
        break label189;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.d.b
 * JD-Core Version:    0.6.2
 */