package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.wallet.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class SettingsChattingUI$2
  implements DialogInterface.OnClickListener
{
  SettingsChattingUI$2(SettingsChattingUI paramSettingsChattingUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127213);
    com.tencent.mm.plugin.report.service.h.pYm.e(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(2), "" });
    com.tencent.mm.plugin.report.service.h.pYm.a(324L, 0L, 1L, false);
    SettingsChattingUI.a(this.qnb, false);
    Object localObject = this.qnb;
    paramDialogInterface = this.qnb;
    this.qnb.getString(2131297061);
    SettingsChattingUI.a((SettingsChattingUI)localObject, com.tencent.mm.ui.base.h.b(paramDialogInterface, this.qnb.getString(2131297086), true, new SettingsChattingUI.2.1(this)));
    paramDialogInterface = ((j)g.K(j.class)).bOr().bOH();
    if (paramDialogInterface != null)
    {
      ab.i("MicroMsg.WalletConvDelCheckLogic", "checkGetUnProcessorWalletConversation, msgInfoList size: %s", new Object[] { Integer.valueOf(paramDialogInterface.size()) });
      localObject = new HashSet();
      Iterator localIterator = paramDialogInterface.iterator();
      while (localIterator.hasNext())
      {
        paramDialogInterface = (bi)localIterator.next();
        if ((!((Set)localObject).contains(paramDialogInterface.field_talker)) && (((j)g.K(j.class)).XR().aoZ(paramDialogInterface.field_talker) != null) && (e.am(paramDialogInterface)))
          ((Set)localObject).add(paramDialogInterface.field_talker);
      }
      paramDialogInterface = new ArrayList();
      paramDialogInterface.addAll((Collection)localObject);
      if ((paramDialogInterface == null) || (paramDialogInterface.size() <= 0))
        break label364;
      SettingsChattingUI.a(this.qnb).dismiss();
      com.tencent.mm.ui.base.h.a(this.qnb, false, this.qnb.getString(2131304752, new Object[] { Integer.valueOf(paramDialogInterface.size()) }), null, this.qnb.getString(2131300420), this.qnb.getString(2131298335), new SettingsChattingUI.2.2(this, paramDialogInterface), new SettingsChattingUI.2.3(this), -1, 2131689665);
      AppMethodBeat.o(127213);
    }
    while (true)
    {
      return;
      paramDialogInterface = null;
      break;
      label364: SettingsChattingUI.b(this.qnb);
      AppMethodBeat.o(127213);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI.2
 * JD-Core Version:    0.6.2
 */