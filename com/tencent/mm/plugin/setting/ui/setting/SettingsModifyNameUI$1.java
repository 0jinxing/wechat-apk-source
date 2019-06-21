package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.mc.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.widget.MMEditText;

final class SettingsModifyNameUI$1 extends c<mc>
{
  SettingsModifyNameUI$1(SettingsModifyNameUI paramSettingsModifyNameUI)
  {
    super(0);
    AppMethodBeat.i(127304);
    this.xxI = mc.class.getName().hashCode();
    AppMethodBeat.o(127304);
  }

  private boolean a(mc parammc)
  {
    AppMethodBeat.i(127305);
    String str1 = parammc.cHU.cHV;
    String str2 = parammc.cHU.cHW;
    int i = parammc.cHU.ret;
    if ((i != 0) && (str2 != null))
    {
      h.b(this.qnV, str2, str1, true);
      if (SettingsModifyNameUI.a(this.qnV) != null)
        ((j)g.K(j.class)).XL().d(SettingsModifyNameUI.a(this.qnV));
    }
    while (true)
    {
      if (SettingsModifyNameUI.d(this.qnV) != null)
        SettingsModifyNameUI.d(this.qnV).dismiss();
      AppMethodBeat.o(127305);
      return true;
      if ((i == 0) && (SettingsModifyNameUI.b(this.qnV)))
      {
        g.RP().Ry().set(4, SettingsModifyNameUI.c(this.qnV).getText().toString());
        this.qnV.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI.1
 * JD-Core Version:    0.6.2
 */