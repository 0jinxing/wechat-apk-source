package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class v
{
  public String hcx;
  public String qPj;
  public String qTL;
  public int qXp;
  public boolean qXq;
  public int qXr;
  public Map<String, String> qXs;
  public String uin;

  public v()
  {
    AppMethodBeat.i(36943);
    this.qXs = new HashMap();
    AppMethodBeat.o(36943);
  }

  public final String YI(String paramString)
  {
    AppMethodBeat.i(36944);
    paramString = (String)this.qXs.get(paramString);
    AppMethodBeat.o(36944);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.v
 * JD-Core Version:    0.6.2
 */