package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cs;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.m;
import com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle;
import com.tencent.mm.plugin.appbrand.r.k;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.protocal.protobuf.ay;
import com.tencent.mm.protocal.protobuf.bhm;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class aa extends cs
{
  static final c.a gSs;
  public transient boolean ihY;

  static
  {
    AppMethodBeat.i(131924);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "appIdHash";
    locala.xDd.put("appIdHash", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" appIdHash INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.xDc = "appIdHash";
    locala.columns[1] = "appId";
    locala.xDd.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "launchAction";
    locala.xDd.put("launchAction", "BLOB");
    localStringBuilder.append(" launchAction BLOB");
    localStringBuilder.append(", ");
    locala.columns[3] = "jsapiInfo";
    locala.xDd.put("jsapiInfo", "BLOB");
    localStringBuilder.append(" jsapiInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[4] = "hostInfo";
    locala.xDd.put("hostInfo", "BLOB");
    localStringBuilder.append(" hostInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[5] = "actionsheetInfo";
    locala.xDd.put("actionsheetInfo", "BLOB");
    localStringBuilder.append(" actionsheetInfo BLOB");
    localStringBuilder.append(", ");
    locala.columns[6] = "operationInfo";
    locala.xDd.put("operationInfo", "BLOB");
    localStringBuilder.append(" operationInfo BLOB");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    gSs = locala;
    AppMethodBeat.o(131924);
  }

  public final c.a Ag()
  {
    return gSs;
  }

  public final boolean Cj(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(131922);
    if ((this.field_operationInfo != null) && (!bo.isNullOrNil(this.field_operationInfo.wKM)));
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(this.field_operationInfo.wKM);
        boolean bool2 = localJSONObject.has("jumpWeAppFromLongPressCodeBanInfo");
        if (!bool2)
        {
          AppMethodBeat.o(131922);
          return bool1;
        }
        localJSONObject = localJSONObject.getJSONObject("jumpWeAppFromLongPressCodeBanInfo");
        bool2 = localJSONObject.has(paramString);
        if (!bool2)
        {
          AppMethodBeat.o(131922);
          continue;
        }
        if (localJSONObject.optInt(paramString, 0) == 1)
        {
          AppMethodBeat.o(131922);
          bool1 = true;
          continue;
        }
        AppMethodBeat.o(131922);
        continue;
      }
      catch (JSONException paramString)
      {
        ab.e("MicroMsg.AppBrand.LaunchWxaAppInfo", "[banjump] shouldBanJumpInternal fail", new Object[] { paramString });
      }
      AppMethodBeat.o(131922);
    }
  }

  public final void a(AppBrandSysConfigWC paramAppBrandSysConfigWC)
  {
    boolean bool1 = true;
    AppMethodBeat.i(131921);
    boolean bool2;
    if ((this.field_actionsheetInfo != null) && (this.field_actionsheetInfo.vCK))
      bool2 = true;
    while (true)
    {
      paramAppBrandSysConfigWC.hhg = bool2;
      label50: int i;
      if ((this.field_actionsheetInfo != null) && (this.field_actionsheetInfo.vCL))
      {
        bool2 = true;
        paramAppBrandSysConfigWC.hhh = bool2;
        if (this.field_actionsheetInfo == null)
          break label206;
        i = this.field_actionsheetInfo.vCM;
        label71: paramAppBrandSysConfigWC.hhi = i;
        paramAppBrandSysConfigWC.bQt = new AppRuntimeApiPermissionBundle(this.field_jsapiInfo);
        if ((this.field_operationInfo != null) && (!bo.isNullOrNil(this.field_operationInfo.wKM)))
          paramAppBrandSysConfigWC.bQu = this.field_operationInfo.wKM;
      }
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramAppBrandSysConfigWC.bQu);
        localJSONObject = localJSONObject.getJSONObject("privacy");
        if (localJSONObject.getInt("banLocationIfEmptyDesc") == 1)
        {
          bool2 = true;
          label159: paramAppBrandSysConfigWC.hgZ = bool2;
          if (localJSONObject.getInt("banGetWifiListIfEmptyDesc") != 1)
            break label217;
        }
        label206: label217: for (bool2 = bool1; ; bool2 = false)
        {
          paramAppBrandSysConfigWC.hha = bool2;
          m.a(paramAppBrandSysConfigWC, paramAppBrandSysConfigWC.bQu);
          AppMethodBeat.o(131921);
          return;
          bool2 = false;
          break;
          bool2 = false;
          break label50;
          i = 0;
          break label71;
          bool2 = false;
          break label159;
        }
      }
      catch (JSONException localJSONException)
      {
        while (true)
        {
          paramAppBrandSysConfigWC.hgZ = false;
          paramAppBrandSysConfigWC.hha = false;
        }
      }
    }
  }

  public final void a(axr paramaxr)
  {
    this.field_launchAction = paramaxr.wBI;
    this.field_jsapiInfo = paramaxr.wBJ;
    this.field_hostInfo = paramaxr.wBK;
    this.field_actionsheetInfo = paramaxr.wBM;
    this.field_operationInfo = paramaxr.wBN;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(131923);
    if ((paramObject instanceof aa))
    {
      paramObject = (aa)paramObject;
      if ((this.field_appId.equals(paramObject.field_appId)) && (this.field_launchAction != null) && (k.a(this.field_launchAction, paramObject.field_launchAction)) && (this.field_jsapiInfo != null) && (k.a(this.field_jsapiInfo, paramObject.field_jsapiInfo)) && (this.field_hostInfo != null) && (k.a(this.field_hostInfo, paramObject.field_hostInfo)) && (this.field_actionsheetInfo != null) && (k.a(this.field_actionsheetInfo, paramObject.field_actionsheetInfo)) && (this.field_operationInfo != null) && (k.a(this.field_operationInfo, paramObject.field_operationInfo)))
      {
        bool = true;
        AppMethodBeat.o(131923);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(131923);
      continue;
      AppMethodBeat.o(131923);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.aa
 * JD-Core Version:    0.6.2
 */