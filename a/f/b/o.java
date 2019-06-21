package a.f.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/jvm/internal/PackageReference;", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "moduleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "getJClass", "()Ljava/lang/Class;", "members", "", "Lkotlin/reflect/KCallable;", "getMembers", "()Ljava/util/Collection;", "equals", "", "other", "", "hashCode", "", "toString", "kotlin-stdlib"})
public final class o
  implements d
{
  private final Class<?> AVA;
  private final String gTy;

  public o(Class<?> paramClass, String paramString)
  {
    AppMethodBeat.i(56239);
    this.AVA = paramClass;
    this.gTy = paramString;
    AppMethodBeat.o(56239);
  }

  public final Class<?> dWH()
  {
    return this.AVA;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56236);
    boolean bool;
    if (((paramObject instanceof o)) && (j.j(this.AVA, ((o)paramObject).AVA)))
    {
      bool = true;
      AppMethodBeat.o(56236);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56236);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(56237);
    int i = this.AVA.hashCode();
    AppMethodBeat.o(56237);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(56238);
    String str = this.AVA.toString() + " (Kotlin reflection is not available)";
    AppMethodBeat.o(56238);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.f.b.o
 * JD-Core Version:    0.6.2
 */