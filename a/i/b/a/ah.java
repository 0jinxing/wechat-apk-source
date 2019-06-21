package a.i.b.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "identityHashCode", "", "getIdentityHashCode", "()I", "ref", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "temporaryStrongRef", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "setTemporaryStrongRef", "equals", "", "other", "hashCode", "toString", "", "kotlin-reflect-api"})
final class ah
{
  private final int AYF;
  ClassLoader AYG;
  private final WeakReference<ClassLoader> iuM;

  public ah(ClassLoader paramClassLoader)
  {
    AppMethodBeat.i(118949);
    this.iuM = new WeakReference(paramClassLoader);
    this.AYF = System.identityHashCode(paramClassLoader);
    this.AYG = paramClassLoader;
    AppMethodBeat.o(118949);
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(118947);
    boolean bool;
    if (((paramObject instanceof ah)) && ((ClassLoader)this.iuM.get() == (ClassLoader)((ah)paramObject).iuM.get()))
    {
      bool = true;
      AppMethodBeat.o(118947);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118947);
    }
  }

  public final int hashCode()
  {
    return this.AYF;
  }

  public final String toString()
  {
    AppMethodBeat.i(118948);
    Object localObject = (ClassLoader)this.iuM.get();
    if (localObject != null)
    {
      String str = ((ClassLoader)localObject).toString();
      localObject = str;
      if (str != null);
    }
    else
    {
      localObject = "<null>";
    }
    AppMethodBeat.o(118948);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.ah
 * JD-Core Version:    0.6.2
 */