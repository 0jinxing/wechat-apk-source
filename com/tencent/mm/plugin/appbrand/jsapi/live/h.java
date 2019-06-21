package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.s.b;
import com.tencent.mm.plugin.appbrand.s.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigDecimal;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class h extends c
{
  private static final int CTRL_INDEX = 361;
  public static final String NAME = "updateLivePusher";

  private static Bundle A(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96127);
    Bundle localBundle = new Bundle();
    try
    {
      if (paramJSONObject.has("pushUrl"))
      {
        localBundle.putString("pushUrl", paramJSONObject.getString("pushUrl"));
        ab.i("MicroMsg.JsApiUpdateLivePusher", "convertParams pushUrl:%s", new Object[] { paramJSONObject.getString("pushUrl") });
      }
    }
    catch (JSONException localJSONException20)
    {
      try
      {
        if (paramJSONObject.has("mode"))
          localBundle.putInt("mode", paramJSONObject.getInt("mode"));
      }
      catch (JSONException localJSONException20)
      {
        try
        {
          if (paramJSONObject.has("autopush"))
            localBundle.putBoolean("autopush", paramJSONObject.getBoolean("autopush"));
        }
        catch (JSONException localJSONException20)
        {
          try
          {
            if (paramJSONObject.has("audioQuality"))
              localBundle.putString("audioQuality", paramJSONObject.getString("audioQuality"));
          }
          catch (JSONException localJSONException20)
          {
            try
            {
              if (paramJSONObject.has("muted"))
                localBundle.putBoolean("muted", paramJSONObject.getBoolean("muted"));
            }
            catch (JSONException localJSONException20)
            {
              try
              {
                if (paramJSONObject.has("enableCamera"))
                  localBundle.putBoolean("enableCamera", paramJSONObject.getBoolean("enableCamera"));
              }
              catch (JSONException localJSONException20)
              {
                try
                {
                  if (paramJSONObject.has("focusMode"))
                    localBundle.putInt("focusMode", paramJSONObject.getInt("focusMode"));
                }
                catch (JSONException localJSONException20)
                {
                  try
                  {
                    if (paramJSONObject.has("orientation"))
                      localBundle.putString("orientation", paramJSONObject.getString("orientation"));
                  }
                  catch (JSONException localJSONException20)
                  {
                    try
                    {
                      if (paramJSONObject.has("beauty"))
                        localBundle.putInt("beauty", paramJSONObject.getInt("beauty"));
                    }
                    catch (JSONException localJSONException20)
                    {
                      try
                      {
                        if (paramJSONObject.has("whiteness"))
                          localBundle.putInt("whiteness", paramJSONObject.getInt("whiteness"));
                      }
                      catch (JSONException localJSONException20)
                      {
                        try
                        {
                          if (paramJSONObject.has("aspect"))
                            localBundle.putInt("aspect", paramJSONObject.getInt("aspect"));
                        }
                        catch (JSONException localJSONException20)
                        {
                          try
                          {
                            if (paramJSONObject.has("minBitrate"))
                              localBundle.putInt("minBitrate", paramJSONObject.getInt("minBitrate"));
                          }
                          catch (JSONException localJSONException20)
                          {
                            try
                            {
                              if (paramJSONObject.has("maxBitrate"))
                                localBundle.putInt("maxBitrate", paramJSONObject.getInt("maxBitrate"));
                            }
                            catch (JSONException localJSONException20)
                            {
                              try
                              {
                                if (paramJSONObject.has("needEvent"))
                                  localBundle.putBoolean("needEvent", paramJSONObject.getBoolean("needEvent"));
                              }
                              catch (JSONException localJSONException20)
                              {
                                try
                                {
                                  if (paramJSONObject.has("debug"))
                                    localBundle.putBoolean("debug", paramJSONObject.getBoolean("debug"));
                                }
                                catch (JSONException localJSONException20)
                                {
                                  try
                                  {
                                    if (paramJSONObject.has("mirror"))
                                      localBundle.putBoolean("mirror", paramJSONObject.getBoolean("mirror"));
                                  }
                                  catch (JSONException localJSONException20)
                                  {
                                    try
                                    {
                                      if (paramJSONObject.has("watermarkLeft"))
                                        localBundle.putFloat("watermarkLeft", BigDecimal.valueOf(paramJSONObject.getDouble("watermarkLeft")).floatValue());
                                    }
                                    catch (JSONException localJSONException20)
                                    {
                                      try
                                      {
                                        if (paramJSONObject.has("watermarkTop"))
                                          localBundle.putFloat("watermarkTop", BigDecimal.valueOf(paramJSONObject.getDouble("watermarkTop")).floatValue());
                                      }
                                      catch (JSONException localJSONException20)
                                      {
                                        try
                                        {
                                          if (paramJSONObject.has("watermarkWidth"))
                                            localBundle.putFloat("watermarkWidth", BigDecimal.valueOf(paramJSONObject.getDouble("watermarkWidth")).floatValue());
                                        }
                                        catch (JSONException localJSONException20)
                                        {
                                          try
                                          {
                                            if (paramJSONObject.has("devicePosition"))
                                              localBundle.putString("devicePosition", paramJSONObject.getString("devicePosition"));
                                          }
                                          catch (JSONException localJSONException20)
                                          {
                                            try
                                            {
                                              while (true)
                                              {
                                                if (paramJSONObject.has("needBGMEvent"))
                                                  localBundle.putBoolean("needBGMEvent", paramJSONObject.getBoolean("needBGMEvent"));
                                                AppMethodBeat.o(96127);
                                                return localBundle;
                                                localJSONException1 = localJSONException1;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "pushUrl", localJSONException1.getLocalizedMessage() });
                                                continue;
                                                localJSONException2 = localJSONException2;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "mode", localJSONException2.getLocalizedMessage() });
                                                continue;
                                                localJSONException3 = localJSONException3;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "autopush", localJSONException3.getLocalizedMessage() });
                                                continue;
                                                localJSONException4 = localJSONException4;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "audioQuality", localJSONException4.getLocalizedMessage() });
                                                continue;
                                                localJSONException5 = localJSONException5;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException5.getLocalizedMessage() });
                                                continue;
                                                localJSONException6 = localJSONException6;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "enableCamera", localJSONException6.getLocalizedMessage() });
                                                continue;
                                                localJSONException7 = localJSONException7;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "focusMode", localJSONException7.getLocalizedMessage() });
                                                continue;
                                                localJSONException8 = localJSONException8;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "orientation", localJSONException8.getLocalizedMessage() });
                                                continue;
                                                localJSONException9 = localJSONException9;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "beauty", localJSONException9.getLocalizedMessage() });
                                                continue;
                                                localJSONException10 = localJSONException10;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "whiteness", localJSONException10.getLocalizedMessage() });
                                                continue;
                                                localJSONException11 = localJSONException11;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "aspect", localJSONException11.getLocalizedMessage() });
                                                continue;
                                                localJSONException12 = localJSONException12;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "minBitrate", localJSONException12.getLocalizedMessage() });
                                                continue;
                                                localJSONException13 = localJSONException13;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "maxBitrate", localJSONException13.getLocalizedMessage() });
                                                continue;
                                                localJSONException14 = localJSONException14;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "needEvent", localJSONException14.getLocalizedMessage() });
                                                continue;
                                                localJSONException15 = localJSONException15;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "debug", localJSONException15.getLocalizedMessage() });
                                                continue;
                                                localJSONException16 = localJSONException16;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "mirror", localJSONException16.getLocalizedMessage() });
                                                continue;
                                                localJSONException17 = localJSONException17;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "watermarkLeft", localJSONException17.getLocalizedMessage() });
                                                continue;
                                                localJSONException18 = localJSONException18;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "watermarkTop", localJSONException18.getLocalizedMessage() });
                                                continue;
                                                localJSONException19 = localJSONException19;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "watermarkWidth", localJSONException19.getLocalizedMessage() });
                                                continue;
                                                localJSONException20 = localJSONException20;
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "devicePosition", localJSONException20.getLocalizedMessage() });
                                              }
                                            }
                                            catch (JSONException paramJSONObject)
                                            {
                                              while (true)
                                                ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "needBGMEvent", paramJSONObject.getLocalizedMessage() });
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final boolean c(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96126);
    ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView : livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiUpdateLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96126);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramView = (View)((CoverViewContainer)paramView).ah(View.class);
      if (!(paramView instanceof AppBrandLivePusherView))
      {
        ab.e("MicroMsg.JsApiUpdateLivePusher", "targetView not AppBrandLivePusherView");
        AppMethodBeat.o(96126);
        bool = false;
        continue;
      }
      paramView = (AppBrandLivePusherView)paramView;
      paramView.y(A(paramJSONObject));
      try
      {
        if (paramJSONObject.has("backgroundImage"))
        {
          str = paramJSONObject.getString("backgroundImage");
          localObject1 = paramJSONObject.optString("backgroundMD5");
          if (!bo.isNullOrNil(str))
            break label208;
          ab.i("MicroMsg.JsApiUpdateLivePusher", "convertBackgroundImageToLocalPath, url is null");
        }
      }
      catch (JSONException localJSONException)
      {
        try
        {
          String str;
          Object localObject1;
          label154: Object localObject2;
          if (paramJSONObject.has("watermarkImage"))
          {
            localObject2 = paramJSONObject.getString("watermarkImage");
            paramJSONObject = paramJSONObject.optString("watermarkMD5");
            if (!bo.isNullOrNil((String)localObject2))
              break label264;
            ab.i("MicroMsg.JsApiUpdateLivePusher", "convertWatermarkImageToLocalPath, url is null");
          }
          while (true)
          {
            AppMethodBeat.o(96126);
            bool = true;
            break;
            label208: localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/live/h$1;
            ((1)localObject2).<init>(this, paramView, str);
            b.a(parame, str, (String)localObject1, (b.a)localObject2);
            break label154;
            localJSONException = localJSONException;
            ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "backgroundImage", localJSONException.getLocalizedMessage() });
            break label154;
            label264: localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/live/h$2;
            ((h.2)localObject1).<init>(this, paramView);
            b.a(parame, localJSONException, paramJSONObject, (b.a)localObject1);
          }
        }
        catch (JSONException parame)
        {
          while (true)
            ab.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "watermarkImage", parame.getLocalizedMessage() });
        }
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96125);
    int i = paramJSONObject.optInt("livePusherId");
    AppMethodBeat.o(96125);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.h
 * JD-Core Version:    0.6.2
 */