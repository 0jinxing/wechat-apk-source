package com.tencent.mm.plugin.appbrand.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.k;
import com.tencent.mm.protocal.protobuf.axt;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends com.tencent.mm.sdk.e.j<j>
{
  public static final String ihX;

  static
  {
    AppMethodBeat.i(70660);
    ihX = com.tencent.mm.sdk.e.j.a(j.gSs, "LaunchWxaWidgetRespData");
    AppMethodBeat.o(70660);
  }

  public i(e parame)
  {
    super(parame, j.gSs, "LaunchWxaWidgetRespData", j.diI);
  }

  private boolean a(j paramj, boolean paramBoolean)
  {
    AppMethodBeat.i(70654);
    paramj.field_appIdHash = paramj.field_appId.hashCode();
    super.a(paramj, paramBoolean);
    paramBoolean = a(paramj, new String[] { "appId" });
    AppMethodBeat.o(70654);
    return paramBoolean;
  }

  private boolean a(j paramj, boolean paramBoolean, String[] paramArrayOfString)
  {
    AppMethodBeat.i(70655);
    if (!bo.Q(paramArrayOfString));
    for (int i = 0; ; i++)
      if (i < paramArrayOfString.length)
      {
        if (paramArrayOfString[i].equals("appId"))
        {
          paramArrayOfString[i] = "appIdHash";
          paramj.field_appIdHash = paramj.field_appId.hashCode();
        }
      }
      else
      {
        paramBoolean = super.b(paramj, paramBoolean, paramArrayOfString);
        AppMethodBeat.o(70655);
        return paramBoolean;
      }
  }

  public final j L(String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = null;
    AppMethodBeat.i(70652);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(70652);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      j localj = new j();
      localj.field_appIdHash = paramString.hashCode();
      localj.field_appId = paramString;
      localj.field_pkgType = paramInt1;
      localj.field_widgetType = paramInt2;
      if (a(localj, new String[] { "appId", "pkgType", "widgetType" }))
      {
        AppMethodBeat.o(70652);
        paramString = localj;
      }
      else
      {
        AppMethodBeat.o(70652);
        paramString = localObject;
      }
    }
  }

  public final j a(String paramString, int paramInt1, int paramInt2, axt paramaxt)
  {
    AppMethodBeat.i(70651);
    if ((bo.isNullOrNil(paramString)) || (paramaxt == null))
    {
      paramString = null;
      AppMethodBeat.o(70651);
      return paramString;
    }
    j localj = new j();
    localj.field_appIdHash = paramString.hashCode();
    localj.field_appId = paramString;
    localj.field_pkgType = paramInt1;
    localj.field_widgetType = paramInt2;
    if (!a(localj, new String[] { "appId", "pkgType", "widgetType" }))
    {
      paramInt2 = 1;
      label92: if (k.a(localj.field_launchAction, paramaxt.wBP))
        break label296;
      localj.field_launchAction = paramaxt.wBP;
    }
    label266: label296: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if (!k.a(localj.field_jsApiInfo, paramaxt.wBJ))
      {
        localj.field_jsApiInfo = paramaxt.wBJ;
        paramInt1 = 1;
      }
      if (!k.a(localj.field_versionInfo, paramaxt.wBQ))
      {
        localj.field_versionInfo = paramaxt.wBQ;
        paramInt1 = 1;
      }
      if (!k.a(localj.field_widgetSetting, paramaxt.wBR))
      {
        localj.field_widgetSetting = paramaxt.wBR;
        paramInt1 = 1;
      }
      if (paramInt1 != 0)
      {
        if (paramInt2 == 0)
          break label266;
        a(localj, false);
      }
      while (true)
      {
        if (paramInt1 != 0)
          a(localj, new String[] { "appId", "pkgType", "widgetType" });
        AppMethodBeat.o(70651);
        paramString = localj;
        break;
        paramInt2 = 0;
        break label92;
        a(localj, false, new String[] { "appId", "pkgType", "widgetType" });
      }
    }
  }

  public final boolean a(j paramj, String[] paramArrayOfString)
  {
    AppMethodBeat.i(70653);
    if (!bo.Q(paramArrayOfString));
    for (int i = 0; ; i++)
      if (i < paramArrayOfString.length)
      {
        if (paramArrayOfString[i].equals("appId"))
        {
          paramArrayOfString[i] = "appIdHash";
          paramj.field_appIdHash = paramj.field_appId.hashCode();
        }
      }
      else
      {
        boolean bool = super.b(paramj, paramArrayOfString);
        AppMethodBeat.o(70653);
        return bool;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i
 * JD-Core Version:    0.6.2
 */