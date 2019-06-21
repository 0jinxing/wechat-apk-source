package com.tencent.mm.plugin.subapp.jdbiz;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

final class JDRemindDialog$1
  implements DialogInterface.OnClickListener
{
  JDRemindDialog$1(JDRemindDialog paramJDRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(25179);
    Object localObject1 = null;
    String str = "";
    Object localObject2 = str;
    paramDialogInterface = localObject1;
    if (this.ssm.getIntent() != null)
    {
      localObject2 = str;
      paramDialogInterface = localObject1;
      if (this.ssm.getIntent().getExtras() != null)
      {
        paramDialogInterface = this.ssm.getIntent().getExtras().getString("alertjumpurl");
        localObject2 = this.ssm.getIntent().getExtras().getString("alert_activityid");
      }
    }
    if ((((String)localObject2).equals(c.cDr().cDw().ssr)) && (c.cDr().cDs()))
    {
      c.cDr().cDv();
      c.cDr().cDu();
    }
    if (!bo.isNullOrNil(paramDialogInterface))
    {
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", paramDialogInterface);
      ((Intent)localObject2).putExtra("useJs", true);
      ((Intent)localObject2).putExtra("vertical_scroll", true);
      d.b(this.ssm, "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
      h.pYm.e(11179, new Object[] { paramDialogInterface, c.cDr().cDw().ssr, Integer.valueOf(5) });
    }
    this.ssm.finish();
    AppMethodBeat.o(25179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog.1
 * JD-Core Version:    0.6.2
 */