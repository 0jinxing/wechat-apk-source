package com.tencent.mm.plugin.appbrand.config;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends com.tencent.luggage.sdk.config.a
{
  private final String[] hgH;

  private f()
  {
    AppMethodBeat.i(129827);
    this.hgH = new String[] { "wx308bd2aeb83d3345" };
    AppMethodBeat.o(129827);
  }

  public static f ayD()
  {
    try
    {
      f localf = (f)bPZ;
      return localf;
    }
    finally
    {
    }
  }

  public static void init()
  {
    AppMethodBeat.i(129828);
    try
    {
      f localf = new com/tencent/mm/plugin/appbrand/config/f;
      localf.<init>();
      bPZ = localf;
      p.ayH().c(bPZ);
      return;
    }
    finally
    {
      AppMethodBeat.o(129828);
    }
  }

  public final AppBrandInitConfigWC b(WxaAttributes paramWxaAttributes)
  {
    boolean bool = true;
    AppMethodBeat.i(129830);
    Object localObject = super.a(paramWxaAttributes);
    int i;
    if (localObject != null)
    {
      localObject = new AppBrandInitConfigWC(((AppBrandInitConfigLU)localObject).xD());
      if (paramWxaAttributes.ayJ().hhS > 0)
      {
        i = 1;
        if (((i == 0) && (paramWxaAttributes.ayJ().fmr != 7)) || (org.apache.commons.b.a.contains(this.hgH, ((AppBrandInitConfigWC)localObject).appId)))
          break label93;
        label73: ((AppBrandInitConfigWC)localObject).hgJ = bool;
      }
    }
    for (paramWxaAttributes = (WxaAttributes)localObject; ; paramWxaAttributes = null)
    {
      AppMethodBeat.o(129830);
      return paramWxaAttributes;
      i = 0;
      break;
      label93: bool = false;
      break label73;
    }
  }

  public final AppBrandInitConfigWC yY(String paramString)
  {
    AppMethodBeat.i(129829);
    paramString = (AppBrandInitConfigWC)super.bM(paramString);
    AppMethodBeat.o(129829);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.f
 * JD-Core Version:    0.6.2
 */