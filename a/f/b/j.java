package a.f.b;

import a.e;
import a.x;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.List;

public class j
{
  public static void avw(String paramString)
  {
    AppMethodBeat.i(55864);
    paramString = (x)o(new x("lateinit property " + paramString + " has not been initialized"));
    AppMethodBeat.o(55864);
    throw paramString;
  }

  static <T extends Throwable> T b(T paramT, String paramString)
  {
    AppMethodBeat.i(55869);
    StackTraceElement[] arrayOfStackTraceElement = paramT.getStackTrace();
    int i = arrayOfStackTraceElement.length;
    int j = -1;
    for (int k = 0; k < i; k++)
      if (paramString.equals(arrayOfStackTraceElement[k].getClassName()))
        j = k;
    paramString = Arrays.asList(arrayOfStackTraceElement).subList(j + 1, i);
    paramT.setStackTrace((StackTraceElement[])paramString.toArray(new StackTraceElement[paramString.size()]));
    AppMethodBeat.o(55869);
    return paramT;
  }

  public static int compare(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2)
      paramInt1 = -1;
    while (true)
    {
      return paramInt1;
      if (paramInt1 == paramInt2)
        paramInt1 = 0;
      else
        paramInt1 = 1;
    }
  }

  public static void dWJ()
  {
    AppMethodBeat.i(55863);
    e locale = (e)o(new e());
    AppMethodBeat.o(55863);
    throw locale;
  }

  public static boolean j(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(55867);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject2 == null)
      {
        bool = true;
        AppMethodBeat.o(55867);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(55867);
      continue;
      bool = paramObject1.equals(paramObject2);
      AppMethodBeat.o(55867);
    }
  }

  private static <T extends Throwable> T o(T paramT)
  {
    AppMethodBeat.i(55868);
    paramT = b(paramT, j.class.getName());
    AppMethodBeat.o(55868);
    return paramT;
  }

  public static void o(Object paramObject, String paramString)
  {
    AppMethodBeat.i(55865);
    if (paramObject == null)
    {
      paramObject = (IllegalStateException)o(new IllegalStateException(paramString + " must not be null"));
      AppMethodBeat.o(55865);
      throw paramObject;
    }
    AppMethodBeat.o(55865);
  }

  public static void p(Object paramObject, String paramString)
  {
    AppMethodBeat.i(55866);
    if (paramObject == null)
    {
      Object localObject = java.lang.Thread.currentThread().getStackTrace()[3];
      paramObject = ((StackTraceElement)localObject).getClassName();
      localObject = ((StackTraceElement)localObject).getMethodName();
      paramObject = (IllegalArgumentException)o(new IllegalArgumentException("Parameter specified as non-null is null: method " + paramObject + "." + (String)localObject + ", parameter " + paramString));
      AppMethodBeat.o(55866);
      throw paramObject;
    }
    AppMethodBeat.o(55866);
  }

  public static String u(String paramString, Object paramObject)
  {
    AppMethodBeat.i(55862);
    paramString = paramString + paramObject;
    AppMethodBeat.o(55862);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.f.b.j
 * JD-Core Version:    0.6.2
 */