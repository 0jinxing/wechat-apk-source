package com.tencent.mm.plugin.appbrand.jsapi.bio.face;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.facedetect.ui.FaceTransparentStubUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public abstract class a extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    if ((paramc.getContext() instanceof MMActivity));
    for (MMActivity localMMActivity = (MMActivity)paramc.getContext(); localMMActivity == null; localMMActivity = null)
    {
      ab.e("MicroMsg.JsApiFaceAsyncBase", "JsApiFaceAsyncBase context is null, appId is %s", new Object[] { paramc.getAppId() });
      paramc.M(paramInt, j("fail", null));
      return;
    }
    Object localObject = paramJSONObject.optString("requestVerifyPreInfo");
    int i = paramJSONObject.optInt("checkAliveType");
    String str = paramc.getAppId();
    if (aCJ());
    for (int j = 1001; ; j = 1000)
    {
      paramJSONObject = new Bundle();
      paramJSONObject.putBoolean("k_need_signature", true);
      paramJSONObject.putInt("k_server_scene", 5);
      paramJSONObject.putBoolean("key_is_need_video", aCJ());
      paramJSONObject.putBoolean("is_check_dyncfg", false);
      paramJSONObject.putString("k_app_id", str);
      paramJSONObject.putString("request_verify_pre_info", (String)localObject);
      paramJSONObject.putInt("key_business_type", 4);
      paramJSONObject.putString("key_function_name", aCK());
      paramJSONObject.putInt("check_alive_type", i);
      paramJSONObject.putBoolean("key_is_need_confirm_page", aCL());
      localObject = new Intent(localMMActivity, FaceTransparentStubUI.class);
      ((Intent)localObject).putExtra("KEY_EXTRAS", paramJSONObject);
      ((Intent)localObject).putExtra("KEY_REQUEST_CODE", j);
      localMMActivity.ifE = new a.1(this, paramc, paramInt);
      localMMActivity.startActivityForResult((Intent)localObject, j);
      break;
    }
  }

  protected abstract boolean aCJ();

  protected abstract String aCK();

  protected boolean aCL()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.face.a
 * JD-Core Version:    0.6.2
 */