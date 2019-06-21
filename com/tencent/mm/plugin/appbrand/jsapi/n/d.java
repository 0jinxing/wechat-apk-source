package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.widget.input.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

public final class d extends a<q>
{
  private static final int CTRL_INDEX = 105;
  private static final String NAME = "showToast";
  ap gGo;
  View hVf;
  n.a hVg = null;

  private void ov(int paramInt)
  {
    AppMethodBeat.i(74799);
    LinearLayout localLinearLayout = (LinearLayout)this.hVf.findViewById(2131821369);
    LinearLayout.LayoutParams localLayoutParams1 = (LinearLayout.LayoutParams)localLinearLayout.getLayoutParams();
    LinearLayout.LayoutParams localLayoutParams2 = localLayoutParams1;
    if (localLayoutParams1 == null)
    {
      ab.w("MicroMsg.JsApiShowToast", "layoutParams is null");
      localLayoutParams2 = new LinearLayout.LayoutParams(-2, -2);
    }
    localLayoutParams2.bottomMargin = paramInt;
    localLinearLayout.setLayoutParams(localLayoutParams2);
    AppMethodBeat.o(74799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.d
 * JD-Core Version:    0.6.2
 */