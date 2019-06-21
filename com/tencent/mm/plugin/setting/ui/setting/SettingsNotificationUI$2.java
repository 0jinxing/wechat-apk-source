package com.tencent.mm.plugin.setting.ui.setting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.f;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.permission.d;
import com.tencent.mm.ui.widget.a.e.c;

final class SettingsNotificationUI$2
  implements e.c
{
  SettingsNotificationUI$2(SettingsNotificationUI paramSettingsNotificationUI)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(127353);
    if (paramBoolean)
    {
      SettingsNotificationUI.a(this.qoe, new d()
      {
        public final void Cp(int paramAnonymousInt)
        {
          AppMethodBeat.i(127352);
          if (!f.MD())
          {
            SettingsNotificationUI.2.this.qoe.initView();
            AppMethodBeat.o(127352);
          }
          while (true)
          {
            return;
            f.bL(true);
            SettingsNotificationUI.2.this.qoe.initView();
            h.pYm.a(500L, 0L, 1L, false);
            au.k(true, false);
            AppMethodBeat.o(127352);
          }
        }
      });
      AppMethodBeat.o(127353);
    }
    while (true)
    {
      return;
      this.qoe.initView();
      AppMethodBeat.o(127353);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI.2
 * JD-Core Version:    0.6.2
 */