package com.tencent.mm.plugin.appbrand.config;

import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cnp;
import com.tencent.mm.protocal.protobuf.dp;
import com.tencent.mm.protocal.protobuf.ey;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public enum m
{
  public static String a(ey paramey)
  {
    AppMethodBeat.i(101820);
    if (paramey == null)
    {
      paramey = "AppRunningFlagInfo{null}";
      AppMethodBeat.o(101820);
    }
    while (true)
    {
      return paramey;
      paramey = "AppRunningFlagInfo{RunningFlag=" + paramey.vGQ + ", StopServiceTime" + paramey.vGR + ", AppForbiddenReason" + paramey.vGS + ", SessionOpenForbiddenReason" + paramey.vGT + ", TimelineOpenForbiddenReason" + paramey.vGU + "}";
      AppMethodBeat.o(101820);
    }
  }

  public static void a(AppBrandSysConfigLU paramAppBrandSysConfigLU, String paramString)
  {
    AppMethodBeat.i(101821);
    paramAppBrandSysConfigLU.hgY = true;
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.AppBrandSysConfigUtil", "operationInfo nil");
      AppMethodBeat.o(101821);
    }
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        if (localJSONObject.getJSONObject("bgKeepAlive").getInt("music") == 1);
        for (boolean bool = true; ; bool = false)
        {
          paramAppBrandSysConfigLU.hgY = bool;
          AppMethodBeat.o(101821);
          break;
        }
      }
      catch (JSONException paramAppBrandSysConfigLU)
      {
        ab.w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo operationInfo:%s", new Object[] { paramString });
        ab.w("MicroMsg.AppBrandSysConfigUtil", "assembleBgKeepAliveConfigByOperationInfo exp:%s", new Object[] { paramAppBrandSysConfigLU });
        AppMethodBeat.o(101821);
      }
    }
  }

  static dp m(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(101819);
    Object localObject = paramJSONObject.optJSONObject("AppConfig");
    paramJSONObject = new dp();
    if (localObject != null)
    {
      localObject = ((JSONObject)localObject).optJSONArray("VersionList");
      paramJSONObject.vFu = new LinkedList();
      if (localObject != null)
        for (int i = 0; i < ((JSONArray)localObject).length(); i++)
        {
          JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(i);
          cnp localcnp = new cnp();
          localcnp.type = localJSONObject.optInt("type");
          localcnp.version = localJSONObject.optInt("version");
          paramJSONObject.vFu.add(localcnp);
        }
    }
    AppMethodBeat.o(101819);
    return paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.m
 * JD-Core Version:    0.6.2
 */