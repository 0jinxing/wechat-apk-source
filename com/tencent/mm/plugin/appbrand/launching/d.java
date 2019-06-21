package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.config.a;
import com.tencent.luggage.sdk.customize.b;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.h;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.s;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class d
  implements Runnable
{
  protected volatile String appId;
  protected final int gVu;
  protected final int har;
  protected final String hgC;
  private final a ifN;
  protected AppBrandStatObject ifO;
  protected final ActivityStarterIpcDelegate ifP;
  protected final String username;

  public d(LaunchParcel paramLaunchParcel, a parama)
  {
    this.ifN = parama;
    this.har = paramLaunchParcel.har;
    this.appId = paramLaunchParcel.appId;
    this.username = paramLaunchParcel.username;
    this.gVu = paramLaunchParcel.version;
    this.ifO = paramLaunchParcel.ijy;
    this.hgC = paramLaunchParcel.hgC;
    this.ifP = paramLaunchParcel.ifP;
  }

  protected static boolean Cf(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(102098);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(102098);
    while (true)
    {
      return bool;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = localJSONObject.optJSONArray("call_plugin_info");
        if ((paramString != null) && (paramString.length() > 0))
        {
          AppMethodBeat.o(102098);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(102098);
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(102098);
      }
    }
  }

  protected final void a(AppBrandInitConfigLU paramAppBrandInitConfigLU, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(102100);
    if (this.ifN != null)
      this.ifN.a(paramAppBrandInitConfigLU, paramAppBrandStatObject, 1);
    AppMethodBeat.o(102100);
  }

  public final void aHb()
  {
    AppMethodBeat.i(138194);
    com.tencent.mm.sdk.g.d.xDG.b(this, String.format(Locale.US, "Luggage.AppBrandPreLaunchProcess|appId[%s]", new Object[] { this.appId }));
    AppMethodBeat.o(138194);
  }

  protected Pair<WxaAttributes, Boolean> aHc()
  {
    AppMethodBeat.i(102097);
    s.ayO();
    Pair localPair = new Pair(s.zB(this.appId), Boolean.FALSE);
    AppMethodBeat.o(102097);
    return localPair;
  }

  protected boolean e(WxaAttributes paramWxaAttributes)
  {
    return false;
  }

  protected final void onError()
  {
    AppMethodBeat.i(102099);
    if (this.ifN != null)
      this.ifN.a(null, null, 2);
    AppMethodBeat.o(102099);
  }

  public void run()
  {
    AppMethodBeat.i(102096);
    Object localObject = (WxaAttributes)aHc().first;
    if (localObject == null)
    {
      ab.i("Luggage.AppBrandPreLaunchProcess", "onGetWxaAttr null return");
      onError();
      AppMethodBeat.o(102096);
    }
    while (true)
    {
      return;
      if (!e((WxaAttributes)localObject))
        break;
      onError();
      AppMethodBeat.o(102096);
    }
    AppBrandInitConfigLU localAppBrandInitConfigLU = a.xw().a((WxaAttributes)localObject);
    localAppBrandInitConfigLU.gVs = this.har;
    this.appId = localAppBrandInitConfigLU.appId;
    if (this.har == 0)
    {
      localAppBrandInitConfigLU.hfh = ((WxaAttributes)localObject).ayL().hij;
      localAppBrandInitConfigLU.bQk = ((WxaAttributes)localObject).ayL().bQk;
    }
    while (true)
    {
      localAppBrandInitConfigLU.bQg = Cf(localAppBrandInitConfigLU.bQk);
      if (this.ifO == null)
        this.ifO = new AppBrandStatObject();
      a(localAppBrandInitConfigLU, this.ifO);
      AppMethodBeat.o(102096);
      break;
      localAppBrandInitConfigLU.extInfo = ((l)((b)com.tencent.luggage.a.e.B(b.class)).E(l.class)).bn(this.appId, this.har);
      try
      {
        localObject = h.lw(localAppBrandInitConfigLU.extInfo);
        localAppBrandInitConfigLU.hfh = ((JSONObject)localObject).optString("device_orientation");
        localAppBrandInitConfigLU.bQk = ((JSONObject)localObject).optString("client_js_ext_info");
        localAppBrandInitConfigLU.bQf = ((JSONObject)localObject).optBoolean("open_remote", false);
      }
      catch (Exception localException)
      {
      }
    }
  }

  public static abstract interface a<T extends AppBrandInitConfigLU>
  {
    public abstract void a(T paramT, AppBrandStatObject paramAppBrandStatObject, int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.d
 * JD-Core Version:    0.6.2
 */