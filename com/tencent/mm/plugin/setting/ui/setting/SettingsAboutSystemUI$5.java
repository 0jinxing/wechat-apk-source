package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.h;
import java.util.List;

final class SettingsAboutSystemUI$5
  implements DialogInterface.OnClickListener
{
  SettingsAboutSystemUI$5(SettingsAboutSystemUI paramSettingsAboutSystemUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = 0;
    AppMethodBeat.i(127116);
    SettingsAboutSystemUI.a(this.qml, false);
    paramDialogInterface = this.qml;
    Object localObject = this.qml;
    this.qml.getString(2131297061);
    SettingsAboutSystemUI.a(paramDialogInterface, h.b((Context)localObject, this.qml.getString(2131297086), true, new SettingsAboutSystemUI.5.1(this)));
    localObject = ((j)g.K(j.class)).XR().dsO();
    if (((List)localObject).size() > 0)
    {
      paramDialogInterface = com.tencent.mm.model.m.S((List)localObject);
      if (paramDialogInterface != null)
        while (paramInt < paramDialogInterface.size())
        {
          if (((Boolean)paramDialogInterface.get(paramInt)).booleanValue())
            b.gkF.dl((String)((List)localObject).get(paramInt));
          paramInt++;
        }
    }
    bf.a(new SettingsAboutSystemUI.5.2(this));
    AppMethodBeat.o(127116);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.5
 * JD-Core Version:    0.6.2
 */