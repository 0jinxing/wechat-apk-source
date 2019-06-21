package a.i.b.a.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"tryLoadClass", "Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "fqName", "", "descriptors.runtime"})
public final class d
{
  public static final Class<?> a(ClassLoader paramClassLoader, String paramString)
  {
    AppMethodBeat.i(119031);
    j.p(paramClassLoader, "receiver$0");
    j.p(paramString, "fqName");
    try
    {
      paramClassLoader = paramClassLoader.loadClass(paramString);
      AppMethodBeat.o(119031);
      return paramClassLoader;
    }
    catch (ClassNotFoundException paramClassLoader)
    {
      while (true)
        paramClassLoader = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.b.d
 * JD-Core Version:    0.6.2
 */