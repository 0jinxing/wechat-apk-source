package org.b.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.OutputStream;

public final class a
{
  public final String BYE;
  public final String BYF;
  public final String BYG;
  public final h BYI;
  private final OutputStream BYJ;
  public final String scope;

  public a(String paramString1, String paramString2, String paramString3, h paramh, String paramString4, OutputStream paramOutputStream)
  {
    this.BYE = paramString1;
    this.BYF = paramString2;
    this.BYG = paramString3;
    this.BYI = paramh;
    this.scope = paramString4;
    this.BYJ = paramOutputStream;
  }

  public final boolean emX()
  {
    if (this.scope != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void log(String paramString)
  {
    AppMethodBeat.i(77275);
    if (this.BYJ != null)
      paramString = paramString + "\n";
    while (true)
    {
      try
      {
        this.BYJ.write(paramString.getBytes("UTF8"));
        AppMethodBeat.o(77275);
        return;
      }
      catch (Exception paramString)
      {
        paramString = new RuntimeException("there were problems while writting to the debug stream", paramString);
        AppMethodBeat.o(77275);
        throw paramString;
      }
      AppMethodBeat.o(77275);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     org.b.d.a
 * JD-Core Version:    0.6.2
 */