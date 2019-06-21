package com.tencent.mm.pluginsdk.ui.e;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.k;
import java.util.List;

final class l$7
  implements AdapterView.OnItemClickListener
{
  l$7(String paramString, List paramList, Context paramContext, k paramk, DialogInterface.OnDismissListener paramOnDismissListener, int paramInt, Bundle paramBundle)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(28139);
    paramView = this.nGr.replace(" ", "").replace("(", "").replace(")", "").replace("-", "");
    paramAdapterView = (String)this.mhY.get(paramInt);
    ab.i("MicroMsg.MailPhoneMenuHelper", paramAdapterView);
    if (this.val$context.getString(2131298201).equals(paramAdapterView))
    {
      paramAdapterView = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(paramView))));
      paramAdapterView.addFlags(268435456);
      if (bo.k(this.val$context, paramAdapterView))
        this.val$context.startActivity(paramAdapterView);
      com.tencent.mm.plugin.report.service.h.pYm.X(10112, "1");
      this.vse.dismiss();
      if (this.vsb != null)
        this.vsb.onDismiss(null);
      AppMethodBeat.o(28139);
    }
    while (true)
    {
      return;
      if (this.val$context.getString(2131298202).equals(paramAdapterView))
      {
        com.tencent.mm.plugin.report.service.h.pYm.e(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("IPCallTalkUI_phoneNumber", paramView);
        d.b(this.val$context, "ipcall", ".ui.IPCallDialUI", paramAdapterView);
        this.vse.dismiss();
        if (this.vsb != null)
          this.vsb.onDismiss(null);
        AppMethodBeat.o(28139);
      }
      else
      {
        if (this.val$context.getString(2131298193).equals(paramAdapterView))
        {
          if ((l.dlg()) && (l.dlh()))
            paramAdapterView = this.val$context.getResources().getStringArray(2131755042);
          while (true)
          {
            this.val$context.getResources().getString(2131298199);
            com.tencent.mm.ui.base.h.a(this.val$context, this.nGr, paramAdapterView, "", new l.7.1(this, paramView), new l.7.2(this));
            this.vse.dismiss();
            AppMethodBeat.o(28139);
            break;
            if (l.dlg())
            {
              paramAdapterView = new String[1];
              paramAdapterView[0] = this.val$context.getResources().getString(2131298192);
            }
            else
            {
              paramAdapterView = new String[1];
              paramAdapterView[0] = this.val$context.getResources().getString(2131298200);
            }
          }
        }
        if (this.val$context.getString(2131298195).equals(paramAdapterView))
        {
          a.b(paramView, paramView);
          com.tencent.mm.plugin.report.service.h.pYm.X(10115, "1");
          if (this.vsb != null)
            this.vsb.onDismiss(null);
          this.vse.dismiss();
          Toast.makeText(this.val$context, this.val$context.getString(2131296876), 1).show();
          AppMethodBeat.o(28139);
        }
        else if (this.val$context.getString(2131298197).equals(paramAdapterView))
        {
          ab.d("MicroMsg.MailPhoneMenuHelper", "hy: button should consume this action");
          AppMethodBeat.o(28139);
        }
        else if (l.vsa.equals(paramAdapterView))
        {
          l.a((Activity)this.val$context, this.nGr, this.vsf);
          this.vse.dismiss();
          if (this.vsb != null)
          {
            this.vsb.onDismiss(null);
            AppMethodBeat.o(28139);
          }
        }
        else
        {
          ab.e("MicroMsg.MailPhoneMenuHelper", "hy: error phone item clicked. should not happen");
          this.vse.dismiss();
          if (this.vsb != null)
            this.vsb.onDismiss(null);
          AppMethodBeat.o(28139);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.l.7
 * JD-Core Version:    0.6.2
 */