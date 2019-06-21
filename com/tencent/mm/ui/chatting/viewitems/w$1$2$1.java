package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelappbrand.s;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.protocal.protobuf.cya;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;

final class w$1$2$1
  implements f
{
  w$1$2$1(w.1.2 param2)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(33124);
    aw.Rg().b(1198, this);
    ab.d("MicroMsg.ChattingItemDyeingTemplate", "onSceneEnd(errType : %d, errCode : %d, errMsg : %s, toBan : %s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.FALSE });
    if (w.a(this.zeZ.zeX.zeW) != null)
    {
      w.a(this.zeZ.zeX.zeW).dismiss();
      w.a(this.zeZ.zeX.zeW, null);
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      t.makeText(this.zeZ.mqd.getContext(), 2131301843, 0).show();
      AppMethodBeat.o(33124);
    }
    while (true)
    {
      return;
      paramString = ((s)paramm).abK();
      if (paramString == null)
      {
        t.makeText(this.zeZ.mqd.getContext(), 2131301843, 0).show();
        AppMethodBeat.o(33124);
      }
      else
      {
        paramString = paramString.xtv;
        ab.i("MicroMsg.ChattingItemDyeingTemplate", "more view clicked, menu item COMPLAIN_APP_BRAND selected, sync attr username %s", new Object[] { this.zeZ.uHr });
        ((d)g.K(d.class)).a(this.zeZ.uHr, new w.1.2.1.1(this, paramString));
        AppMethodBeat.o(33124);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.1.2.1
 * JD-Core Version:    0.6.2
 */