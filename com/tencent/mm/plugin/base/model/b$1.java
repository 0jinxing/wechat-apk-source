package com.tencent.mm.plugin.base.model;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.b;

final class b$1
  implements e.b
{
  b$1(e.a parama, Activity paramActivity)
  {
  }

  public final void s(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(79061);
    this.imH.gud.dismiss();
    if (paramBoolean2)
      this.val$activity.getSharedPreferences(ah.doA(), 0).edit().putBoolean("no_more_show_add_short_cut_dialog", true).apply();
    AppMethodBeat.o(79061);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.model.b.1
 * JD-Core Version:    0.6.2
 */