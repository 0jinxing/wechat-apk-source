package com.tencent.mm.compatible.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.PrivilegedAction;

public final class i
  implements PrivilegedAction
{
  private String evI;
  private String evJ;

  public i(String paramString)
  {
    this.evI = paramString;
  }

  public final Object run()
  {
    AppMethodBeat.i(93097);
    String str = System.getProperty(this.evI);
    if (str == null)
    {
      str = this.evJ;
      AppMethodBeat.o(93097);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(93097);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.i
 * JD-Core Version:    0.6.2
 */