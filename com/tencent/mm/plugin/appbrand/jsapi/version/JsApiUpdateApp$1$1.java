package com.tencent.mm.plugin.appbrand.jsapi.version;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.widget.b.b;
import com.tencent.mm.plugin.appbrand.widget.b.k;

final class JsApiUpdateApp$1$1
  implements Runnable
{
  JsApiUpdateApp$1$1(JsApiUpdateApp.1 param1, AppBrandInitConfigWC paramAppBrandInitConfigWC)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131488);
    b localb = new b(this.hXX.hsj.getContext());
    localb.setCanceledOnTouchOutside(false);
    localb.setCancelable(false);
    Object localObject = this.hXX.hsj.getContext();
    int i;
    if (this.hXX.hsj.getRuntime().xy())
    {
      i = 2131296690;
      localb.setMessage(((Context)localObject).getString(i, new Object[] { this.hXX.hsj.getRuntime().atI().cwz }));
      localObject = new JsApiUpdateApp.1.1.1(this);
      if (this.hXX.hsj.getRuntime().atH().hhd.gVt == 0)
        break label175;
      localb.a(2131296689, (DialogInterface.OnClickListener)localObject);
      localb.b(2131296687, new JsApiUpdateApp.1.1.2(this));
    }
    while (true)
    {
      this.hXX.hsj.asF().b(localb);
      AppMethodBeat.o(131488);
      return;
      i = 2131296691;
      break;
      label175: localb.a(2131296688, (DialogInterface.OnClickListener)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp.1.1
 * JD-Core Version:    0.6.2
 */