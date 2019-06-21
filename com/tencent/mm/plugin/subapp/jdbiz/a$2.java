package com.tencent.mm.plugin.subapp.jdbiz;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.z;

final class a$2
  implements Runnable
{
  a$2(a parama, b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25189);
    a locala = this.sso;
    b localb = this.ssp;
    aw.ZK();
    int i = ((Integer)com.tencent.mm.model.c.Ry().get(15, Integer.valueOf(0))).intValue();
    Object localObject;
    if ((aw.Rg().foreground) && (1 == i))
    {
      localObject = c.dn(localb.jumpUrl, 5);
      JDRemindDialog.a(ah.getContext(), localb.ssB, localb.ssC, localb.ssD, (String)localObject, localb.ssr);
      h.pYm.e(11178, new Object[] { localObject, c.cDr().cDw().ssr, Integer.valueOf(5) });
      AppMethodBeat.o(25189);
    }
    while (true)
    {
      return;
      String str = c.dn(localb.jumpUrl, 4);
      localObject = new Bundle();
      ((Bundle)localObject).putString("activity_id", localb.ssr);
      ((Bundle)localObject).putString("jump_url", str);
      ((aq)aw.getNotification()).a(37, ah.getContext().getString(2131297025), localb.ssA, str, "bizjd", (Bundle)localObject);
      com.tencent.mm.sdk.b.a.xxA.c(locala.ssn);
      h.pYm.e(11178, new Object[] { str, c.cDr().cDw().ssr, Integer.valueOf(4) });
      AppMethodBeat.o(25189);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.jdbiz.a.2
 * JD-Core Version:    0.6.2
 */