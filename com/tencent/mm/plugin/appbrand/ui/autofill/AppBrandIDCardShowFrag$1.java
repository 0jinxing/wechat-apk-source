package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandIDCardShowFrag$1
  implements View.OnClickListener
{
  AppBrandIDCardShowFrag$1(AppBrandIDCardShowFrag paramAppBrandIDCardShowFrag)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133202);
    if (AppBrandIDCardShowFrag.a(this.iJY) != null)
      AppBrandIDCardShowFrag.a(this.iJY).back();
    AppMethodBeat.o(133202);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag.1
 * JD-Core Version:    0.6.2
 */