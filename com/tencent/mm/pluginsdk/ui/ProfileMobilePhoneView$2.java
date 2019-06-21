package com.tencent.mm.pluginsdk.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.k;

final class ProfileMobilePhoneView$2
  implements AdapterView.OnItemClickListener
{
  ProfileMobilePhoneView$2(ProfileMobilePhoneView paramProfileMobilePhoneView, k paramk, String paramString)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(27533);
    if (this.viA != null)
      this.viA.dismiss();
    if (paramInt == 0)
      if (bo.isNullOrNil(this.viz.vim))
      {
        paramView = h.pYm;
        paramAdapterView = new Object[1];
      }
    label284: for (AdapterView<?> localAdapterView = paramAdapterView; ; localAdapterView = paramAdapterView)
    {
      paramInt = 0;
      localAdapterView[0] = Integer.valueOf(paramInt);
      paramView.e(12043, paramAdapterView);
      paramAdapterView = new Intent("android.intent.action.DIAL");
      paramAdapterView.setFlags(268435456);
      paramAdapterView.setData(Uri.parse("tel:" + this.kod));
      while (true)
      {
        try
        {
          this.viz.getContext().startActivity(paramAdapterView);
          AppMethodBeat.o(27533);
          return;
          paramView = h.pYm;
          paramAdapterView = new Object[1];
          if (!this.viz.vim.equals(this.kod.trim()))
            break label284;
          paramInt = 1;
          localAdapterView = paramAdapterView;
        }
        catch (ActivityNotFoundException paramAdapterView)
        {
          ab.printErrStackTrace("MicroMsg.ProfileMobilePhoneView", paramAdapterView, "Activity not found!", new Object[0]);
          AppMethodBeat.o(27533);
          continue;
        }
        if (1 == paramInt)
        {
          h.pYm.e(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          paramAdapterView = new Intent();
          paramAdapterView.putExtra("IPCallTalkUI_phoneNumber", this.kod);
          d.b(ProfileMobilePhoneView.a(this.viz), "ipcall", ".ui.IPCallDialUI", paramAdapterView);
        }
        AppMethodBeat.o(27533);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView.2
 * JD-Core Version:    0.6.2
 */