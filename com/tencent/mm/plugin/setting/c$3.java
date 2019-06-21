package com.tencent.mm.plugin.setting;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.e.j;
import java.util.Map;

final class c$3
  implements o
{
  c$3(c paramc)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(126827);
    if (paramMap != null)
    {
      paramString = (String)paramMap.get(".sysmsg.showtrustedfriends.wording");
      if (!bo.isNullOrNil(paramString))
      {
        paramMap = new Intent();
        paramMap.putExtra(e.j.ygc, paramString);
        d.b(ah.getContext(), "setting", ".ui.setting.SettingsTrustFriendUI", paramMap);
      }
    }
    AppMethodBeat.o(126827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.c.3
 * JD-Core Version:    0.6.2
 */