package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.messenger.foundation.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class PluginBigBallOfMud$15
  implements l
{
  PluginBigBallOfMud$15(PluginBigBallOfMud paramPluginBigBallOfMud)
  {
  }

  public final String N(bi parambi)
  {
    AppMethodBeat.i(18296);
    int i;
    if ((parambi.field_bizChatId != -1L) && (f.kq(parambi.field_talker)))
    {
      i = 1;
      if (i == 0)
        break label91;
      parambi = parambi.field_talker + ":" + parambi.field_bizChatId;
      ab.d("MicroMsg.PluginBigBallOfMud", "mapNotifyInfo key:%s", new Object[] { parambi });
    }
    while (true)
    {
      AppMethodBeat.o(18296);
      return parambi;
      i = 0;
      break;
      label91: parambi = parambi.field_talker;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.PluginBigBallOfMud.15
 * JD-Core Version:    0.6.2
 */