package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandIDCardShowFrag$3
  implements View.OnClickListener
{
  AppBrandIDCardShowFrag$3(AppBrandIDCardShowFrag paramAppBrandIDCardShowFrag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133204);
    ab.i("MicroMsg.AppBrandIDCardShowFrag", "verifyPayPassword click");
    if (AppBrandIDCardShowFrag.a(this.iJY) != null)
      AppBrandIDCardShowFrag.a(this.iJY).aMF();
    AppMethodBeat.o(133204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag.3
 * JD-Core Version:    0.6.2
 */