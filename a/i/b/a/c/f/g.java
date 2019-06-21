package a.i.b.a.c.f;

import a.f.b.j;
import a.k.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class g
{
  private static final k Bza;
  public static final g Bzb;

  static
  {
    AppMethodBeat.i(121401);
    Bzb = new g();
    Bza = new k("[^\\p{L}\\p{Digit}]");
    AppMethodBeat.o(121401);
  }

  public static final String awb(String paramString)
  {
    AppMethodBeat.i(121400);
    j.p(paramString, "name");
    k localk = Bza;
    paramString = (CharSequence)paramString;
    j.p(paramString, "input");
    j.p("_", "replacement");
    paramString = localk.BPf.matcher(paramString).replaceAll("_");
    j.o(paramString, "nativePattern.matcher(in…).replaceAll(replacement)");
    AppMethodBeat.o(121400);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.f.g
 * JD-Core Version:    0.6.2
 */