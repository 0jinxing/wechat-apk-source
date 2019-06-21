package a.k;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.regex.Pattern;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"})
final class k$b
  implements Serializable
{
  public static final k.b.a BPh;
  private final int flags;
  private final String xAK;

  static
  {
    AppMethodBeat.i(56304);
    BPh = new k.b.a((byte)0);
    AppMethodBeat.o(56304);
  }

  public k$b(String paramString, int paramInt)
  {
    AppMethodBeat.i(56303);
    this.xAK = paramString;
    this.flags = paramInt;
    AppMethodBeat.o(56303);
  }

  private final Object readResolve()
  {
    AppMethodBeat.i(56302);
    Object localObject = Pattern.compile(this.xAK, this.flags);
    j.o(localObject, "Pattern.compile(pattern, flags)");
    localObject = new k((Pattern)localObject);
    AppMethodBeat.o(56302);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.k.k.b
 * JD-Core Version:    0.6.2
 */