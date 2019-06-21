package kotlinx.coroutines.android;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"getter", "Ljava/lang/reflect/Method;", "kotlinx-coroutines-android"})
public final class a
{
  private static final Method BQW;

  static
  {
    int i = 0;
    AppMethodBeat.i(118246);
    try
    {
      Method localMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
      j.o(localMethod, "it");
      int j = i;
      if (Modifier.isPublic(localMethod.getModifiers()))
      {
        boolean bool = Modifier.isStatic(localMethod.getModifiers());
        j = i;
        if (bool)
          j = 1;
      }
      if (j != 0);
      while (true)
      {
        BQW = localMethod;
        AppMethodBeat.o(118246);
        return;
        localMethod = null;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        Object localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.android.a
 * JD-Core Version:    0.6.2
 */