package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.t;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.Preference;

final class NormalUserFooterPreference$j$2
  implements View.OnClickListener
{
  NormalUserFooterPreference$j$2(NormalUserFooterPreference.j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23727);
    if (NormalUserFooterPreference.a(this.ppd.poR).Oa())
    {
      t.j(NormalUserFooterPreference.a(this.ppd.poR));
      NormalUserFooterPreference.a(this.ppd.poR).NE();
      this.ppd.cbn();
      AppMethodBeat.o(23727);
      return;
    }
    paramView = this.ppd.poR.mContext;
    Context localContext = this.ppd.poR.mContext;
    if (ad.aox(NormalUserFooterPreference.a(this.ppd.poR).field_username));
    for (int i = 2131298596; ; i = 2131298595)
    {
      h.a(paramView, localContext.getString(i), this.ppd.poR.mContext.getString(2131298594), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(23726);
          t.i(NormalUserFooterPreference.a(NormalUserFooterPreference.j.2.this.ppd.poR));
          NormalUserFooterPreference.a(NormalUserFooterPreference.j.2.this.ppd.poR).ND();
          NormalUserFooterPreference.j.2.this.ppd.cbn();
          AppMethodBeat.o(23726);
        }
      }
      , null);
      AppMethodBeat.o(23727);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.j.2
 * JD-Core Version:    0.6.2
 */