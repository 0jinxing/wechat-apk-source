package com.tencent.mm.plugin.appbrand.ui.autofill;

import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppBrandIDCardShowFrag$2
  implements CompoundButton.OnCheckedChangeListener
{
  AppBrandIDCardShowFrag$2(AppBrandIDCardShowFrag paramAppBrandIDCardShowFrag)
  {
  }

  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    AppMethodBeat.i(133203);
    if (AppBrandIDCardShowFrag.b(this.iJY) != null)
      AppBrandIDCardShowFrag.b(this.iJY).setEnabled(paramBoolean);
    AppMethodBeat.o(133203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardShowFrag.2
 * JD-Core Version:    0.6.2
 */