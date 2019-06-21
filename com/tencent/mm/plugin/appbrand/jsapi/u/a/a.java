package com.tencent.mm.plugin.appbrand.jsapi.u.a;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.g.a.b;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.u.a.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.appbrand.e.e
{
  volatile b idE;
  volatile SurfaceTexture mSurfaceTexture;

  public final String a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, m paramm, int paramInt)
  {
    AppMethodBeat.i(117347);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "*** handler(%s) handleJsApi(%s), data:%s", new Object[] { wP(), paramm.getName(), paramJSONObject.toString() });
    paramJSONObject = new a.1(this, paramm, paramc, paramJSONObject, paramInt);
    if (paramc.aBy().getLooper() == Looper.myLooper())
      paramJSONObject.run();
    while (true)
    {
      AppMethodBeat.o(117347);
      return null;
      paramc.aBy().post(paramJSONObject);
    }
  }

  public final boolean a(m paramm)
  {
    if ((this.hpN) || ((paramm != null) && ((paramm instanceof com.tencent.mm.plugin.appbrand.jsapi.u.a.a.c))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final void b(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, m paramm, int paramInt)
  {
    try
    {
      AppMethodBeat.i(117349);
      if (d.h(paramc, paramJSONObject))
      {
        paramc.M(paramInt, paramm.j("ok", null));
        com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(13);
        AppMethodBeat.o(117349);
      }
      while (true)
      {
        return;
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "update fail");
        com.tencent.mm.plugin.appbrand.jsapi.g.a.e.oq(14);
        paramc.M(paramInt, paramm.j("fail:internal error", null));
        AppMethodBeat.o(117349);
      }
    }
    finally
    {
    }
    throw paramc;
  }

  public final void d(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(117345);
    super.d(paramSurfaceTexture);
    this.mSurfaceTexture = paramSurfaceTexture;
    AppMethodBeat.o(117345);
  }

  public final void m(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(117348);
    this.idE.onTouchEvent(paramMotionEvent);
    AppMethodBeat.o(117348);
  }

  public final void yr()
  {
    AppMethodBeat.i(117346);
    super.yr();
    if (this.mSurfaceTexture != null)
    {
      this.mSurfaceTexture.release();
      this.mSurfaceTexture = null;
    }
    AppMethodBeat.o(117346);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.a.a
 * JD-Core Version:    0.6.2
 */