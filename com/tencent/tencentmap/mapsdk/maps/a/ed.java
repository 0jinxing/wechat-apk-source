package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import org.json.JSONObject;

public final class ed extends dy
{
  private final cl a;

  public ed()
  {
    AppMethodBeat.i(98776);
    this.a = new cl();
    bt.j().post(new ee(this));
    AppMethodBeat.o(98776);
  }

  private static String d()
  {
    AppMethodBeat.i(98777);
    StringBuilder localStringBuilder = new StringBuilder("Halley_Cloud_Param_Content_").append(bt.c()).append("_for_SettingsHandler");
    if (bt.b());
    for (String str = "_test"; ; str = "")
    {
      str = str;
      AppMethodBeat.o(98777);
      return str;
    }
  }

  public final void a(du paramdu)
  {
    AppMethodBeat.i(98779);
    String str = this.a.c();
    paramdu.a.put("confVersion", str);
    AppMethodBeat.o(98779);
  }

  public final void a(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(98780);
    try
    {
      paramJSONObject = paramJSONObject.optJSONObject("Setting");
      if (paramJSONObject != null)
      {
        paramJSONObject = paramJSONObject.optString("data");
        if (!TextUtils.isEmpty(paramJSONObject))
        {
          this.a.a(paramJSONObject);
          paramJSONObject = this.a.a();
          bt.a().getSharedPreferences(d(), 0).edit().putString("halley_cloud_param_content", paramJSONObject).commit();
        }
      }
      return;
    }
    catch (Throwable paramJSONObject)
    {
      while (true)
      {
        bt.j().post(new ef(this));
        AppMethodBeat.o(98780);
      }
    }
    finally
    {
      bt.j().post(new ef(this));
      AppMethodBeat.o(98780);
    }
    throw paramJSONObject;
  }

  public final void b()
  {
    AppMethodBeat.i(98778);
    bt.j().post(new ef(this));
    AppMethodBeat.o(98778);
  }

  public final String c()
  {
    return "settings";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ed
 * JD-Core Version:    0.6.2
 */