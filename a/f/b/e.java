package a.f.b;

import a.f.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/jvm/internal/ClassReference;", "Lkotlin/reflect/KClass;", "", "Lkotlin/jvm/internal/ClassBasedDeclarationContainer;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "constructors", "", "Lkotlin/reflect/KFunction;", "getConstructors", "()Ljava/util/Collection;", "isAbstract", "", "isAbstract$annotations", "()V", "()Z", "isCompanion", "isCompanion$annotations", "isData", "isData$annotations", "isFinal", "isFinal$annotations", "isInner", "isInner$annotations", "isOpen", "isOpen$annotations", "isSealed", "isSealed$annotations", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "sealedSubclasses$annotations", "getSealedSubclasses", "simpleName", "getSimpleName", "supertypes", "Lkotlin/reflect/KType;", "supertypes$annotations", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "typeParameters$annotations", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "visibility$annotations", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "error", "", "hashCode", "", "isInstance", "value", "toString", "kotlin-stdlib"})
public final class e
  implements d, a.i.b<Object>
{
  private final Class<?> AVA;

  public e(Class<?> paramClass)
  {
    AppMethodBeat.i(56231);
    this.AVA = paramClass;
    AppMethodBeat.o(56231);
  }

  public final Class<?> dWH()
  {
    return this.AVA;
  }

  public final String dWI()
  {
    AppMethodBeat.i(56227);
    Throwable localThrowable = (Throwable)new a.f.b();
    AppMethodBeat.o(56227);
    throw localThrowable;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(56228);
    boolean bool;
    if (((paramObject instanceof e)) && (j.j(a.c(this), a.c((a.i.b)paramObject))))
    {
      bool = true;
      AppMethodBeat.o(56228);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(56228);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(56229);
    int i = a.c(this).hashCode();
    AppMethodBeat.o(56229);
    return i;
  }

  public final String toString()
  {
    AppMethodBeat.i(56230);
    String str = this.AVA.toString() + " (Kotlin reflection is not available)";
    AppMethodBeat.o(56230);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.f.b.e
 * JD-Core Version:    0.6.2
 */