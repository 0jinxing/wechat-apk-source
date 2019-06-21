package com.tencent.mm.plugin.game.luggage.c.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask;
import com.tencent.mm.plugin.webview.luggage.q;
import com.tencent.mm.protocal.protobuf.bbb;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;

public final class d extends a
{
  public d()
  {
    super(8);
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.webview.luggage.d paramd, bbb parambbb)
  {
    AppMethodBeat.i(135901);
    parambbb = paramd.bPP.getString("shortcut_user_name");
    String str = paramd.uij.getAppId();
    if ((bo.isNullOrNil(parambbb)) || (bo.isNullOrNil(str)))
      AppMethodBeat.o(135901);
    while (true)
    {
      return;
      AddShortcutTask localAddShortcutTask = new AddShortcutTask();
      localAddShortcutTask.username = parambbb;
      localAddShortcutTask.appId = str;
      localAddShortcutTask.hww = new d.1(this, localAddShortcutTask, paramd, paramContext);
      localAddShortcutTask.aBV();
      AppBrandMainProcessService.a(localAddShortcutTask);
      AppMethodBeat.o(135901);
    }
  }

  public final void a(com.tencent.mm.plugin.webview.luggage.d paramd, l paraml, bbb parambbb)
  {
    AppMethodBeat.i(135900);
    String str1 = paramd.uij.getAppId();
    String str2 = paramd.bPP.getString("shortcut_user_name");
    if ((!paramd.bPP.getBoolean("from_shortcut", false)) && (!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
    {
      paramd = parambbb.Title + "__" + parambbb.ThumbUrl;
      paraml.e(parambbb.wkB, paramd);
    }
    AppMethodBeat.o(135900);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.c.a.d
 * JD-Core Version:    0.6.2
 */