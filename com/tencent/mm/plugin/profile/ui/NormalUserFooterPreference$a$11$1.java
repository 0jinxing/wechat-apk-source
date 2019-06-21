package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.base.preference.Preference;

final class NormalUserFooterPreference$a$11$1
  implements n.d
{
  NormalUserFooterPreference$a$11$1(NormalUserFooterPreference.a.11 param11)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(23686);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(23686);
    case 1:
    case 8:
      while (true)
      {
        return;
        this.poX.poS.UU(NormalUserFooterPreference.a(this.poX.poS.poR).field_username);
        AppMethodBeat.o(23686);
        continue;
        NormalUserFooterPreference.a.a(this.poX.poS);
        AppMethodBeat.o(23686);
      }
    case 5:
    }
    paramMenuItem = this.poX.poS.poR.mContext;
    Context localContext = this.poX.poS.poR.mContext;
    if (ad.aox(NormalUserFooterPreference.a(this.poX.poS.poR).field_username));
    for (paramInt = 2131298596; ; paramInt = 2131298595)
    {
      h.a(paramMenuItem, localContext.getString(paramInt), this.poX.poS.poR.mContext.getString(2131298594), new NormalUserFooterPreference.a.11.1.1(this), null);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.11.1
 * JD-Core Version:    0.6.2
 */