package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.fu;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

final class AppBrandAuthorizeUI$7
  implements Runnable
{
  AppBrandAuthorizeUI$7(AppBrandAuthorizeUI paramAppBrandAuthorizeUI, boolean paramBoolean1, Preference paramPreference, boolean paramBoolean2, fu paramfu, f paramf)
  {
  }

  public final void run()
  {
    int i = 1;
    AppMethodBeat.i(132898);
    if (this.ejK)
    {
      ((CheckBoxPreference)this.iFO).uOT = this.ith;
      localObject = this.iFP;
      if (this.ith);
      for (i = 1; ; i = 2)
      {
        ((fu)localObject).state = i;
        this.iFQ.notifyDataSetChanged();
        AppMethodBeat.o(132898);
        return;
      }
    }
    Object localObject = (CheckBoxPreference)this.iFO;
    boolean bool;
    if (!this.ith)
    {
      bool = true;
      label84: ((CheckBoxPreference)localObject).uOT = bool;
      localObject = this.iFP;
      if (this.ith)
        break label128;
    }
    while (true)
    {
      ((fu)localObject).state = i;
      this.iFQ.notifyDataSetChanged();
      AppMethodBeat.o(132898);
      break;
      bool = false;
      break label84;
      label128: i = 2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.7
 * JD-Core Version:    0.6.2
 */