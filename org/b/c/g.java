package org.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.b.b.b;
import org.b.d.i;
import org.b.g.c;
import org.b.g.d;

public final class g
  implements a, f
{
  private static final Pattern BYK;
  private static final Pattern BYL;

  static
  {
    AppMethodBeat.i(77238);
    BYK = Pattern.compile("oauth_token=([^&]+)");
    BYL = Pattern.compile("oauth_token_secret=([^&]*)");
    AppMethodBeat.o(77238);
  }

  private static String f(String paramString, Pattern paramPattern)
  {
    AppMethodBeat.i(77240);
    paramPattern = paramPattern.matcher(paramString);
    if ((paramPattern.find()) && (paramPattern.groupCount() > 0))
    {
      paramString = c.decode(paramPattern.group(1));
      AppMethodBeat.o(77240);
      return paramString;
    }
    paramString = new b("Response body is incorrect. Can't extract token and secret from this: '" + paramString + "'", null);
    AppMethodBeat.o(77240);
    throw paramString;
  }

  public final i awU(String paramString)
  {
    AppMethodBeat.i(77239);
    d.jn(paramString, "Response body is incorrect. Can't extract a token from an empty string");
    paramString = new i(f(paramString, BYK), f(paramString, BYL), paramString);
    AppMethodBeat.o(77239);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     org.b.c.g
 * JD-Core Version:    0.6.2
 */