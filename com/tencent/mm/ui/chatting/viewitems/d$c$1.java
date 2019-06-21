package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class d$c$1
  implements View.OnClickListener
{
  d$c$1(Boolean paramBoolean, long paramLong, String paramString1, String paramString2, bi parambi)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(32810);
    if (this.zcL.booleanValue())
    {
      l = this.cgB;
      paramView = this.zcM;
      localb = am.aUq().lZ(l);
      if (localb == null)
      {
        ab.e("MicroMsg.AppMsgLogic", "ERR:" + g.Mq() + " getinfo failed: " + paramView);
        AppMethodBeat.o(32810);
      }
      while (true)
      {
        return;
        if (localb.field_status != 101L)
        {
          ab.e("MicroMsg.AppMsgLogic", "ERR:" + g.Mq() + " get status failed: " + paramView + " status:" + localb.field_status);
          AppMethodBeat.o(32810);
        }
        else
        {
          localb.field_status = 102L;
          localb.field_lastModifyTime = bo.anT();
          am.aUq().a(localb, new String[0]);
          AppMethodBeat.o(32810);
        }
      }
    }
    long l = this.cgB;
    paramView = this.zcM;
    b localb = am.aUq().lZ(l);
    if (localb == null)
      ab.e("MicroMsg.AppMsgLogic", "ERR:" + g.Mq() + " getinfo failed: " + paramView);
    while (true)
    {
      this.fku.setStatus(5);
      aw.ZK();
      com.tencent.mm.model.c.XO().jf(this.cgB);
      AppMethodBeat.o(32810);
      break;
      if (localb.field_status == 101L)
        break label328;
      ab.e("MicroMsg.AppMsgLogic", "ERR:" + g.Mq() + " get status failed: " + paramView + " status:" + localb.field_status);
    }
    label328: if ((bo.isNullOrNil(localb.field_clientAppDataId)) && (!bo.isNullOrNil(localb.field_mediaSvrId)));
    for (localb.field_status = 102L; ; localb.field_status = 105L)
    {
      localb.field_lastModifyTime = bo.anT();
      am.aUq().a(localb, new String[0]);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.d.c.1
 * JD-Core Version:    0.6.2
 */