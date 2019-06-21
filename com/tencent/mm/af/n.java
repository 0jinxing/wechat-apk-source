package com.tencent.mm.af;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

public final class n
{
  public int fjt;
  public int fju;

  public static final n mj(String paramString)
  {
    AppMethodBeat.i(16198);
    n localn = new n();
    paramString = j.b.X(paramString, null);
    if (paramString != null)
    {
      paramString = paramString.fjf;
      if (paramString != null)
      {
        localn.fjt = bo.getInt((String)paramString.get(".msg.appmsg.xmlfulllen"), 0);
        localn.fju = bo.getInt((String)paramString.get(".msg.appmsg.realinnertype"), 0);
      }
    }
    AppMethodBeat.o(16198);
    return localn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.n
 * JD-Core Version:    0.6.2
 */