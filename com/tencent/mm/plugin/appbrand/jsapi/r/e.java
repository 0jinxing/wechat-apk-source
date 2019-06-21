package com.tencent.mm.plugin.appbrand.jsapi.r;

import android.app.Activity;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.statusbar.d;
import org.json.JSONObject;

public final class e extends a<c>
{
  private static final int CTRL_INDEX = 580;
  private static final String NAME = "showVirtualBottomNavigationBar";

  private static void w(c paramc)
  {
    AppMethodBeat.i(74817);
    paramc = d.cY(paramc.getContext());
    if (paramc == null)
    {
      ab.i("JsApiShowVirtualBottomNavigationBar", "null == activity");
      AppMethodBeat.o(74817);
    }
    while (true)
    {
      return;
      paramc = paramc.getWindow();
      if (paramc == null)
      {
        ab.i("JsApiShowVirtualBottomNavigationBar", "null == window");
        AppMethodBeat.o(74817);
      }
      else
      {
        int i = paramc.getDecorView().getSystemUiVisibility();
        int j = i;
        if (Build.VERSION.SDK_INT >= 20)
          j = i & 0xFFFFFDFF & 0xFFFFFFFD;
        i = j;
        if (Build.VERSION.SDK_INT >= 19)
          i = j & 0xFFFFEFFF;
        paramc.getDecorView().setSystemUiVisibility(i & 0xFFFFFEFF);
        paramc.getDecorView().setOnSystemUiVisibilityChangeListener(null);
        AppMethodBeat.o(74817);
      }
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(74815);
    c(paramc, paramInt);
    AppMethodBeat.o(74815);
  }

  final void c(c paramc, int paramInt)
  {
    AppMethodBeat.i(74816);
    if (!al.isMainThread())
    {
      al.d(new e.1(this, paramc, paramInt));
      AppMethodBeat.o(74816);
    }
    while (true)
    {
      return;
      ab.i("JsApiShowVirtualBottomNavigationBar", "show");
      w(paramc);
      paramc.M(paramInt, j("ok", null));
      AppMethodBeat.o(74816);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.r.e
 * JD-Core Version:    0.6.2
 */