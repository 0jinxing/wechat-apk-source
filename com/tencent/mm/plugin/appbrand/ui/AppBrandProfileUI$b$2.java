package com.tencent.mm.plugin.appbrand.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class AppBrandProfileUI$b$2
  implements Runnable
{
  AppBrandProfileUI$b$2(AppBrandProfileUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133052);
    AppBrandProfileUI localAppBrandProfileUI;
    if ((this.iIp.iIm != null) && (this.iIp.iIm.get() != null))
    {
      localAppBrandProfileUI = (AppBrandProfileUI)this.iIp.iIm.get();
      if (AppBrandProfileUI.n(localAppBrandProfileUI))
      {
        Toast.makeText(localAppBrandProfileUI, 2131296786, 0).show();
        AppBrandProfileUI.a(localAppBrandProfileUI, 17, 2);
        AppMethodBeat.o(133052);
      }
    }
    while (true)
    {
      return;
      Toast.makeText(localAppBrandProfileUI, 2131296783, 0).show();
      AppBrandProfileUI.a(localAppBrandProfileUI, 18, 2);
      AppMethodBeat.o(133052);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.b.2
 * JD-Core Version:    0.6.2
 */