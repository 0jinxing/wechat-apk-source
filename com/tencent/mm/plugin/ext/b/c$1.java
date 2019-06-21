package com.tencent.mm.plugin.ext.b;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.ext.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.but;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;

final class c$1
  implements com.tencent.mm.ai.f
{
  c$1(c paramc)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(20298);
    aw.Rg().b(106, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: searched data.");
      paramm = ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj();
      ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: contact count: %d", new Object[] { Integer.valueOf(paramm.wod) });
      if (paramm.wod > 0)
      {
        if (paramm.woe.isEmpty())
        {
          ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: no result is retrieved. start to search UI");
          c.a(this.lPD, paramm);
        }
        if (paramm.woe.size() <= 1);
      }
    }
    while (true)
    {
      try
      {
        paramString = new android/content/Intent;
        paramString.<init>();
        paramString.putExtra("add_more_friend_search_scene", 3);
        paramString.putExtra("result", paramm.toByteArray());
        ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: more than one contact is resolved. starting to ContactSearchResultUI");
        a.gkE.t(paramString, c.a(this.lPD));
        AppMethodBeat.o(20298);
        return;
      }
      catch (IOException paramString)
      {
        ab.printErrStackTrace("MicroMsg.RedirectToChattingByPhoneHelper", paramString, "", new Object[0]);
        AppMethodBeat.o(20298);
        continue;
      }
      c.a(this.lPD, (but)paramm.woe.getFirst());
      AppMethodBeat.o(20298);
      continue;
      ab.i("MicroMsg.RedirectToChattingByPhoneHelper", "hy: only one result is retrieved. start to chatting directly");
      c.b(this.lPD, paramm);
      AppMethodBeat.o(20298);
      continue;
      ab.w("MicroMsg.RedirectToChattingByPhoneHelper", "hy: err net.errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      c.a(this.lPD, null);
      AppMethodBeat.o(20298);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b.c.1
 * JD-Core Version:    0.6.2
 */