package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h extends c
{
  private static final int CTRL_INDEX = 114;
  public static final String NAME = "operateVideoPlayer";

  public final boolean c(e parame, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126564);
    ab.i("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView : videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    if (!(paramView instanceof CoverViewContainer))
    {
      ab.w("MicroMsg.JsApiOperateVideoPlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      bool = false;
      AppMethodBeat.o(126564);
    }
    while (true)
    {
      label56: return bool;
      parame = (AppBrandVideoView)((CoverViewContainer)paramView).ah(AppBrandVideoView.class);
      if (parame != null)
        break;
      ab.e("MicroMsg.JsApiOperateVideoPlayer", "view not AppBrandVideoView");
      bool = false;
      AppMethodBeat.o(126564);
    }
    paramView = paramJSONObject.optString("type");
    ab.i("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView operateType=%s", new Object[] { paramView });
    paramInt = -1;
    switch (paramView.hashCode())
    {
    default:
    case 3443508:
    case 106440182:
    case 3540994:
    case 458133450:
    case -802181223:
    case 1355420059:
    case 3526264:
    case 1222225:
    }
    while (true)
      switch (paramInt)
      {
      default:
        ab.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView operateType not supported: %s", new Object[] { paramView });
        bool = false;
        AppMethodBeat.o(126564);
        break label56;
        if (paramView.equals("play"))
        {
          paramInt = 0;
          continue;
          if (paramView.equals("pause"))
          {
            paramInt = 1;
            continue;
            if (paramView.equals("stop"))
            {
              paramInt = 2;
              continue;
              if (paramView.equals("requestFullScreen"))
              {
                paramInt = 3;
                continue;
                if (paramView.equals("exitFullScreen"))
                {
                  paramInt = 4;
                  continue;
                  if (paramView.equals("playbackRate"))
                  {
                    paramInt = 5;
                    continue;
                    if (paramView.equals("seek"))
                    {
                      paramInt = 6;
                      continue;
                      if (paramView.equals("sendDanmu"))
                        paramInt = 7;
                    }
                  }
                }
              }
            }
          }
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
    parame.start();
    while (true)
    {
      bool = true;
      AppMethodBeat.o(126564);
      break;
      parame.pause();
      continue;
      parame.stop();
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      paramInt = -1;
      if ((paramView == null) || (paramView.length() == 0))
        ab.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView directionArr nil");
      while (true)
      {
        parame.j(true, paramInt);
        break;
        paramInt = paramView.optInt(0, -1);
      }
      parame.j(false, -1);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        ab.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        bool = false;
        AppMethodBeat.o(126564);
        break;
      }
      double d = paramView.optDouble(0, -1.0D);
      if (d < 0.0D)
      {
        ab.i("MicroMsg.JsApiOperateVideoPlayer", "rate invalid %f", new Object[] { Double.valueOf(d) });
        bool = false;
        AppMethodBeat.o(126564);
        break;
      }
      float f = (float)d;
      ab.i("MicroMsg.AppBrandVideoView", "setPlaybackRate %s", new Object[] { Float.valueOf(f) });
      parame.hYM.as(f);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        ab.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        bool = false;
        AppMethodBeat.o(126564);
        break;
      }
      d = paramView.optDouble(0, -1.0D);
      if (d < 0.0D)
      {
        ab.i("MicroMsg.JsApiOperateVideoPlayer", "pos invalid %s", new Object[] { Double.valueOf(d) });
        bool = false;
        AppMethodBeat.o(126564);
        break;
      }
      parame.d(d, false);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        ab.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        bool = false;
        AppMethodBeat.o(126564);
        break;
      }
      if (paramView.length() == 1)
        parame.co(paramView.optString(0, ""), "");
      else
        parame.co(paramView.optString(0, ""), paramView.optString(1, ""));
    }
  }

  public final int r(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(126563);
    int i = paramJSONObject.optInt("videoPlayerId");
    AppMethodBeat.o(126563);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.h
 * JD-Core Version:    0.6.2
 */