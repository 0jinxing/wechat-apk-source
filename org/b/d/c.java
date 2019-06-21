package org.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class c extends f
{
  public Map<String, String> BYN;

  public c(j paramj, String paramString)
  {
    super(paramj, paramString);
    AppMethodBeat.i(77279);
    this.BYN = new HashMap();
    AppMethodBeat.o(77279);
  }

  public final void jl(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77280);
    Map localMap = this.BYN;
    if ((paramString1.startsWith("oauth_")) || (paramString1.equals("scope")))
    {
      localMap.put(paramString1, paramString2);
      AppMethodBeat.o(77280);
      return;
    }
    paramString1 = new IllegalArgumentException(String.format("OAuth parameters must either be '%s' or start with '%s'", new Object[] { "scope", "oauth_" }));
    AppMethodBeat.o(77280);
    throw paramString1;
  }

  public final String toString()
  {
    AppMethodBeat.i(77281);
    String str = String.format("@OAuthRequest(%s, %s)", new Object[] { super.emZ(), super.getUrl() });
    AppMethodBeat.o(77281);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     org.b.d.c
 * JD-Core Version:    0.6.2
 */