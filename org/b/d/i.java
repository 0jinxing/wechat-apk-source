package org.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import org.b.g.d;

public final class i
  implements Serializable
{
  private final String rawResponse;
  public final String token;
  public final String wFn;

  public i(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }

  public i(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(77267);
    d.r(paramString1, "Token can't be null");
    d.r(paramString2, "Secret can't be null");
    this.token = paramString1;
    this.wFn = paramString2;
    this.rawResponse = paramString3;
    AppMethodBeat.o(77267);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(77269);
    if (this == paramObject)
      AppMethodBeat.o(77269);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(77269);
        bool = false;
      }
      else
      {
        paramObject = (i)paramObject;
        if ((this.token.equals(paramObject.token)) && (this.wFn.equals(paramObject.wFn)))
        {
          AppMethodBeat.o(77269);
        }
        else
        {
          AppMethodBeat.o(77269);
          bool = false;
        }
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(77270);
    int i = this.token.hashCode();
    int j = this.wFn.hashCode();
    AppMethodBeat.o(77270);
    return i * 31 + j;
  }

  public final String toString()
  {
    AppMethodBeat.i(77268);
    String str = String.format("Token[%s , %s]", new Object[] { this.token, this.wFn });
    AppMethodBeat.o(77268);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     org.b.d.i
 * JD-Core Version:    0.6.2
 */