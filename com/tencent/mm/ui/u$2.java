package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.b;

final class u$2
  implements DialogInterface.OnCancelListener
{
  u$2(String paramString, Activity paramActivity, Intent paramIntent)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29595);
    h.pYm.a(322L, 24L, 1L, true);
    h.pYm.e(11098, new Object[] { Integer.valueOf(4024), String.format("%b|%s", new Object[] { Boolean.valueOf(bo.isNullOrNil(this.val$url)), this.val$url }) });
    this.val$activity.startActivity(this.ymY);
    b.K(this.val$activity, this.ymY);
    w.cn(this.val$activity);
    AppMethodBeat.o(29595);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u.2
 * JD-Core Version:    0.6.2
 */