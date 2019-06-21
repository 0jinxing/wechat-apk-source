package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.rtmp.TXLivePlayer;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends c
{
  private static final int CTRL_INDEX = 365;
  public static final String NAME = "updateLivePlayer";

  private static Bundle A(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96122);
    Bundle localBundle = new Bundle();
    try
    {
      if (paramJSONObject.has("playUrl"))
      {
        localBundle.putString("playUrl", paramJSONObject.getString("playUrl"));
        ab.i("MicroMsg.JsApiUpdateLivePlayer", "convertParams playUrl:%s", new Object[] { paramJSONObject.getString("playUrl") });
      }
    }
    catch (JSONException localJSONException13)
    {
      try
      {
        if (paramJSONObject.has("mode"))
          localBundle.putInt("mode", paramJSONObject.getInt("mode"));
      }
      catch (JSONException localJSONException13)
      {
        try
        {
          if (paramJSONObject.has("autoplay"))
            localBundle.putBoolean("autoplay", paramJSONObject.getBoolean("autoplay"));
        }
        catch (JSONException localJSONException13)
        {
          try
          {
            if (paramJSONObject.has("muted"))
              localBundle.putBoolean("muted", paramJSONObject.getBoolean("muted"));
          }
          catch (JSONException localJSONException13)
          {
            try
            {
              if (paramJSONObject.has("orientation"))
                localBundle.putString("orientation", paramJSONObject.getString("orientation"));
            }
            catch (JSONException localJSONException13)
            {
              try
              {
                if (paramJSONObject.has("objectFit"))
                  localBundle.putString("objectFit", paramJSONObject.getString("objectFit"));
              }
              catch (JSONException localJSONException13)
              {
                try
                {
                  if (paramJSONObject.has("backgroundMute"))
                    localBundle.putBoolean("backgroundMute", paramJSONObject.getBoolean("backgroundMute"));
                }
                catch (JSONException localJSONException13)
                {
                  try
                  {
                    if (paramJSONObject.has("minCache"))
                      localBundle.putFloat("minCache", BigDecimal.valueOf(paramJSONObject.getDouble("minCache")).floatValue());
                  }
                  catch (JSONException localJSONException13)
                  {
                    try
                    {
                      if (paramJSONObject.has("maxCache"))
                        localBundle.putFloat("maxCache", BigDecimal.valueOf(paramJSONObject.getDouble("maxCache")).floatValue());
                    }
                    catch (JSONException localJSONException13)
                    {
                      try
                      {
                        if (paramJSONObject.has("needEvent"))
                          localBundle.putBoolean("needEvent", paramJSONObject.getBoolean("needEvent"));
                      }
                      catch (JSONException localJSONException13)
                      {
                        try
                        {
                          if (paramJSONObject.has("debug"))
                            localBundle.putBoolean("debug", paramJSONObject.getBoolean("debug"));
                        }
                        catch (JSONException localJSONException13)
                        {
                          try
                          {
                            if (paramJSONObject.has("soundMode"))
                            {
                              localBundle.putString("soundMode", paramJSONObject.getString("soundMode"));
                              ab.i("MicroMsg.JsApiUpdateLivePlayer", "convertParams soundMode:%s", new Object[] { paramJSONObject.getString("soundMode") });
                            }
                          }
                          catch (JSONException localJSONException13)
                          {
                            try
                            {
                              if (paramJSONObject.has("autoPauseIfNavigate"))
                                localBundle.putBoolean("autoPauseIfNavigate", paramJSONObject.getBoolean("autoPauseIfNavigate"));
                            }
                            catch (JSONException localJSONException13)
                            {
                              try
                              {
                                while (true)
                                {
                                  if (paramJSONObject.has("autoPauseIfOpenNative"))
                                    localBundle.putBoolean("autoPauseIfOpenNative", paramJSONObject.getBoolean("autoPauseIfOpenNative"));
                                  AppMethodBeat.o(96122);
                                  return localBundle;
                                  localJSONException1 = localJSONException1;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "playUrl", localJSONException1.getLocalizedMessage() });
                                  continue;
                                  localJSONException2 = localJSONException2;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "mode", localJSONException2.getLocalizedMessage() });
                                  continue;
                                  localJSONException3 = localJSONException3;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "autoplay", localJSONException3.getLocalizedMessage() });
                                  continue;
                                  localJSONException4 = localJSONException4;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException4.getLocalizedMessage() });
                                  continue;
                                  localJSONException5 = localJSONException5;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "orientation", localJSONException5.getLocalizedMessage() });
                                  continue;
                                  localJSONException6 = localJSONException6;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "objectFit", localJSONException6.getLocalizedMessage() });
                                  continue;
                                  localJSONException7 = localJSONException7;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "backgroundMute", localJSONException7.getLocalizedMessage() });
                                  continue;
                                  localJSONException8 = localJSONException8;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "minCache", localJSONException8.getLocalizedMessage() });
                                  continue;
                                  localJSONException9 = localJSONException9;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "maxCache", localJSONException9.getLocalizedMessage() });
                                  continue;
                                  localJSONException10 = localJSONException10;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "needEvent", localJSONException10.getLocalizedMessage() });
                                  continue;
                                  localJSONException11 = localJSONException11;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "debug", localJSONException11.getLocalizedMessage() });
                                  continue;
                                  localJSONException12 = localJSONException12;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "soundMode", localJSONException12.getLocalizedMessage() });
                                  continue;
                                  localJSONException13 = localJSONException13;
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "autoPauseIfNavigate", localJSONException13.getLocalizedMessage() });
                                }
                              }
                              catch (JSONException paramJSONObject)
                              {
                                while (true)
                                  ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "autoPauseIfOpenNative", paramJSONObject.getLocalizedMessage() });
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
    AppMethodBeat.i(96121);
    ab.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView : livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiUpdateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(96121);
    }
    for (boolean bool = false; ; bool = false)
    {
      return bool;
      parame = (View)((CoverViewContainer)paramView).ah(View.class);
      if ((parame instanceof AppBrandLivePlayerView))
        break;
      ab.e("MicroMsg.JsApiUpdateLivePlayer", "targetView not AppBrandLivePlayerView");
      AppMethodBeat.o(96121);
    }
    paramView = (AppBrandLivePlayerView)parame;
    parame = A(paramJSONObject);
    paramView.hLf = parame.getBoolean("needEvent", paramView.hLf);
    paramJSONObject = paramView.hLb;
    if (!paramJSONObject.mInited);
    for (parame = new i(-3, "uninited livePlayer"); ; parame = new i())
    {
      ab.i("MicroMsg.AppBrandLivePlayerView", "onUpdate code:%d info:%s", new Object[] { Integer.valueOf(parame.errorCode), parame.hLF });
      AppMethodBeat.o(96121);
      bool = true;
      break;
      k.l("updateLivePlayer", parame);
      paramJSONObject.A(parame);
      bool = paramJSONObject.hLJ.isPlaying();
      paramView = parame.getString("playUrl", paramJSONObject.hLM);
      if ((paramView != null) && (!paramView.isEmpty()) && (paramJSONObject.hLM != null) && (!paramJSONObject.hLM.equalsIgnoreCase(paramView)) && (paramJSONObject.hLJ.isPlaying()))
      {
        ab.i("TXLivePlayerJSAdapter", "updateLivePlayer: stopPlay playUrl-old = " + paramJSONObject.hLM + " playUrl-new = " + paramView);
        paramJSONObject.hLJ.stopPlay(true);
      }
      paramJSONObject.hLM = paramView;
      paramInt = paramJSONObject.z(parame);
      if ((paramInt != paramJSONObject.hLN) && (paramJSONObject.hLJ.isPlaying()))
      {
        ab.i("TXLivePlayerJSAdapter", "updateLivePlayer: stopPlay  playType-old = " + paramJSONObject.hLN + " playType-new = " + paramInt);
        paramJSONObject.hLJ.stopPlay(true);
      }
      paramJSONObject.hLN = paramInt;
      paramJSONObject.mAutoPlay = parame.getBoolean("autoplay", paramJSONObject.mAutoPlay);
      if (((paramJSONObject.mAutoPlay) || (bool)) && (paramJSONObject.hLM != null) && (!paramJSONObject.hLM.isEmpty()) && (!paramJSONObject.hLJ.isPlaying()))
      {
        ab.i("TXLivePlayerJSAdapter", "updateLivePlayer: startPlay");
        paramJSONObject.Be(paramJSONObject.hLM);
        paramJSONObject.hLJ.startPlay(paramJSONObject.hLM, paramJSONObject.hLN);
      }
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(96120);
    int i = paramJSONObject.optInt("livePlayerId");
    AppMethodBeat.o(96120);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.g
 * JD-Core Version:    0.6.2
 */