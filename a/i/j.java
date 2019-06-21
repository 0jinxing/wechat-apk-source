package a.i;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "index", "", "getIndex", "()I", "isOptional", "", "()Z", "isVararg", "isVararg$annotations", "()V", "kind", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "name", "", "getName", "()Ljava/lang/String;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "Kind", "kotlin-stdlib"})
public abstract interface j
{
  public abstract String getName();

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/reflect/KParameter$Kind;", "", "(Ljava/lang/String;I)V", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"})
  public static enum a
  {
    static
    {
      AppMethodBeat.i(56001);
      a locala1 = new a("INSTANCE", 0);
      AVR = locala1;
      a locala2 = new a("EXTENSION_RECEIVER", 1);
      AVS = locala2;
      a locala3 = new a("VALUE", 2);
      AVT = locala3;
      AVU = new a[] { locala1, locala2, locala3 };
      AppMethodBeat.o(56001);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.j
 * JD-Core Version:    0.6.2
 */