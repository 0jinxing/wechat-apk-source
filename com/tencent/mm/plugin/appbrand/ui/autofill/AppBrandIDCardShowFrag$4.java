package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bzo;
import com.tencent.mm.protocal.protobuf.gb;

final class AppBrandIDCardShowFrag$4
  implements View.OnClickListener
{
  AppBrandIDCardShowFrag$4(AppBrandIDCardShowFrag paramAppBrandIDCardShowFrag, bzo parambzo)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133205);
    if (AppBrandIDCardShowFrag.a(this.iJY) != null)
      AppBrandIDCardShowFrag.a(this.iJY).DW(this.iJZ.wYG.url);
    AppMethodBeat.o(133205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag.4
 * JD-Core Version:    0.6.2
 */