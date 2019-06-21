package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.a.e.c;

final class k$12
  implements e.c
{
  k$12(k paramk, Activity paramActivity)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(34481);
    if (paramBoolean)
    {
      h.pYm.e(15181, new Object[] { Integer.valueOf(3) });
      paramString = new Intent();
      paramString.setClassName(ah.getPackageName(), "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI");
      this.val$activity.startActivity(paramString);
      AppMethodBeat.o(34481);
    }
    while (true)
    {
      return;
      h.pYm.e(15181, new Object[] { Integer.valueOf(2) });
      AppMethodBeat.o(34481);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.k.12
 * JD-Core Version:    0.6.2
 */