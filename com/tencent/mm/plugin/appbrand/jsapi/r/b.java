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

public final class b extends a
{
  private static final int CTRL_INDEX = 580;
  private static final String NAME = "hideVirtualBottomNavigationBar";

  private void w(c paramc)
  {
    AppMethodBeat.i(74810);
    paramc = d.cY(paramc.getContext());
    if (paramc == null)
    {
      ab.i("JsApiHideVirtualBottomNavigationBar", "null == activity");
      AppMethodBeat.o(74810);
    }
    while (true)
    {
      return;
      paramc = paramc.getWindow();
      if (paramc == null)
      {
        ab.i("JsApiHideVirtualBottomNavigationBar", "null == window");
        AppMethodBeat.o(74810);
      }
      else
      {
        int i = paramc.getDecorView().getSystemUiVisibility();
        int j = i;
        if (Build.VERSION.SDK_INT >= 20)
          j = i | 0x200 | 0x2;
        i = j;
        if (Build.VERSION.SDK_INT >= 19)
          i = j | 0x1000;
        j = i | 0x100;
        paramc.getDecorView().setSystemUiVisibility(j);
        paramc.getDecorView().setOnSystemUiVisibilityChangeListener(new b.2(this, paramc, j));
        AppMethodBeat.o(74810);
      }
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(74808);
    c(paramc, paramInt);
    AppMethodBeat.o(74808);
  }

  final void c(c paramc, int paramInt)
  {
    AppMethodBeat.i(74809);
    if (!al.isMainThread())
    {
      al.d(new b.1(this, paramc, paramInt));
      AppMethodBeat.o(74809);
    }
    while (true)
    {
      return;
      ab.i("JsApiHideVirtualBottomNavigationBar", "hide");
      w(paramc);
      paramc.M(paramInt, j("ok", null));
      AppMethodBeat.o(74809);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.r.b
 * JD-Core Version:    0.6.2
 */