package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class m extends j<l>
{
  public static final String[] fjY;
  public static final String[] fjZ;

  static
  {
    AppMethodBeat.i(70664);
    fjY = new String[] { j.a(l.fjX, "WxaWidgetInfo") };
    fjZ = new String[0];
    AppMethodBeat.o(70664);
  }

  public m(e parame)
  {
    super(parame, l.fjX, "WxaWidgetInfo", fjZ);
  }

  public final l Ev(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(70663);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(70663);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      l locall = new l();
      locall.field_appId = paramString;
      locall.field_appIdHash = paramString.hashCode();
      if (!b(locall, new String[] { "appIdHash" }))
      {
        AppMethodBeat.o(70663);
        paramString = localObject;
      }
      else
      {
        AppMethodBeat.o(70663);
        paramString = locall;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.m
 * JD-Core Version:    0.6.2
 */