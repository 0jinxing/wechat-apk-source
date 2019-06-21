package com.tencent.mm.plugin.topstory.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.apv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class c$4
  implements f
{
  c$4(com.tencent.mm.plugin.topstory.a.c.d paramd)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(1531);
    g.Rg().b(this.sBq.getType(), this);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.TopStory.TopStoryUILogic", "goUserProfile failed, NetSceneTopStoryGetUsername errType:%s, errCode:%s, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(1531);
    }
    while (true)
    {
      return;
      paramm = ((apv)((com.tencent.mm.plugin.topstory.a.c.d)paramm).ehh.fsH.fsP).username;
      paramString = new Intent();
      paramString.putExtra("Contact_User", paramm);
      paramString.putExtra("Contact_Scene", 3);
      if ((paramm != null) && (paramm.length() > 0))
        com.tencent.mm.bp.d.b(ah.getContext(), "profile", ".ui.ContactInfoUI", paramString);
      AppMethodBeat.o(1531);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.c.4
 * JD-Core Version:    0.6.2
 */