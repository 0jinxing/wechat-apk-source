package com.tencent.mm.console;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.cj.c;
import com.tencent.mm.g.a.z;
import com.tencent.mm.kernel.l;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.f.e;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.storage.ac;
import com.tencent.mm.storage.y;

final class b$12
  implements DialogInterface.OnClickListener
{
  b$12(String paramString, Context paramContext, Activity paramActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16093);
    paramDialogInterface = new y(ac.eSj + "SdcardInfo.cfg");
    paramDialogInterface.set(1, this.ewt);
    ab.i("MicroMsg.CommandProcessor", "switchsdcard reset to sdcard root: " + paramDialogInterface.get(1));
    aj.amB("welcome_page_show");
    l.m(this.ewr, true);
    paramDialogInterface = new z();
    paramDialogInterface.csU.csV = false;
    a.xxA.m(paramDialogInterface);
    WorkerProfile.Ca().cfW.BV();
    aw.getNotification().IH();
    c.atD("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
    if (e.vdx != null)
      e.vdx.bd(this.val$activity);
    this.val$activity.finish();
    AppMethodBeat.o(16093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.12
 * JD-Core Version:    0.6.2
 */