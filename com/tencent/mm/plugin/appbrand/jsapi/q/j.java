package com.tencent.mm.plugin.appbrand.jsapi.q;

import android.app.Activity;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class j extends a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "setKeepScreenOn";
  private static boolean hXH = false;
  private c hxS;
  PowerManager.WakeLock wakeLock;

  private boolean aEV()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(126423);
        boolean bool;
        if (this.hxS.getContext() == null)
        {
          ab.e("MicroMsg.JsApiSetKeepScreenOn", "acquire fail, server context is nul");
          bool = false;
          AppMethodBeat.o(126423);
          return bool;
        }
        ab.e("MicroMsg.JsApiSetKeepScreenOn", "acquire ok");
        Activity localActivity = (Activity)this.hxS.getContext();
        if (this.wakeLock == null)
          this.wakeLock = ((PowerManager)localActivity.getSystemService("power")).newWakeLock(536870922, "MicroMsg.JsApiSetKeepScreenOn");
        if (!this.wakeLock.isHeld())
        {
          this.wakeLock.acquire();
          ab.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock acquire");
          bool = true;
          AppMethodBeat.o(126423);
          continue;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.JsApiSetKeepScreenOn", "wakeLock has held ");
    }
  }

  private boolean isHeld()
  {
    try
    {
      AppMethodBeat.i(126425);
      boolean bool;
      if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
      {
        bool = true;
        AppMethodBeat.o(126425);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(126425);
      }
    }
    finally
    {
    }
  }

  private boolean release()
  {
    try
    {
      AppMethodBeat.i(126424);
      ab.e("MicroMsg.JsApiSetKeepScreenOn", "release");
      boolean bool;
      if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
      {
        this.wakeLock.release();
        this.wakeLock = null;
        bool = true;
        AppMethodBeat.o(126424);
      }
      while (true)
      {
        return bool;
        ab.e("MicroMsg.JsApiSetKeepScreenOn", "wakeLock is  null");
        bool = false;
        AppMethodBeat.o(126424);
      }
    }
    finally
    {
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(126422);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn data is null");
      paramc.M(paramInt, j("fail:data is null", null));
      AppMethodBeat.o(126422);
    }
    while (true)
    {
      return;
      if (paramc.getContext() == null)
      {
        ab.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is nul");
        paramc.M(paramInt, j("fail:context is null", null));
        AppMethodBeat.o(126422);
      }
      else if (!(paramc.getContext() instanceof Activity))
      {
        ab.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, server context is not activity, don't do invoke");
        paramc.M(paramInt, j("fail:context is null", null));
        AppMethodBeat.o(126422);
      }
      else
      {
        boolean bool = paramJSONObject.optBoolean("keepScreenOn", false);
        hXH = bool;
        ab.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn, keepScreenOn:%b, appId:%s", new Object[] { Boolean.valueOf(bool), paramc.getAppId() });
        while (true)
        {
          try
          {
            this.hxS = paramc;
            if (bool)
            {
              paramJSONObject = new j.1(this, paramc);
              g.a(paramc.getAppId(), paramJSONObject);
              bool = aEV();
              if (!bool)
                break label293;
              ab.i("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn ok");
              paramc.M(paramInt, j("ok", null));
              AppMethodBeat.o(126422);
              break;
            }
          }
          finally
          {
            AppMethodBeat.o(126422);
          }
          if (!isHeld())
            break label264;
          ab.i("MicroMsg.JsApiSetKeepScreenOn", "reset screen off");
          bool = release();
        }
        label264: ab.e("MicroMsg.JsApiSetKeepScreenOn", "fail, has not set screen");
        paramc.M(paramInt, j("fail:has not set screen", null));
        AppMethodBeat.o(126422);
        continue;
        label293: ab.e("MicroMsg.JsApiSetKeepScreenOn", "setKeepScreenOn fail");
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(126422);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q.j
 * JD-Core Version:    0.6.2
 */