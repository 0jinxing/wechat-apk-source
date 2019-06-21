package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import com.tencent.mm.ui.widget.a.c;

final class k$1$1
  implements Runnable
{
  k$1$1(k.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131354);
    b localb = new b(this.hRg.hJo.getContext());
    localb.setTitle(2131297120);
    localb.ykW.setVisibility(0);
    localb.ykU.setVisibility(0);
    localb.ykU.setText(2131297119);
    localb.setCanceledOnTouchOutside(false);
    localb.a(2131296994, new k.1.1.1(this));
    this.hRg.hJo.getRuntime().gNG.b(localb);
    AppMethodBeat.o(131354);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k.1.1
 * JD-Core Version:    0.6.2
 */