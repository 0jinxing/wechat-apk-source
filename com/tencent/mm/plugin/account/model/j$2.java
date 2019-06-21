package com.tencent.mm.plugin.account.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.g.a.a.b;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class j$2
  implements o
{
  j$2(j paramj)
  {
  }

  public final void onNewXmlReceived(String paramString, Map<String, String> paramMap, e.a parama)
  {
    AppMethodBeat.i(124699);
    if ((bo.nullAsNil(paramString).equals("ChangeLaunchImage")) && (paramMap != null))
    {
      paramString = (String)paramMap.get(".sysmsg.ChangeLaunchImage.BeginTime");
      parama = (String)paramMap.get(".sysmsg.ChangeLaunchImage.EndTime");
      paramMap = (String)paramMap.get(".sysmsg.ChangeLaunchImage.ResId.SubType");
      ab.i("MicroMsg.SubCoreAccountSync", "beginTime:%s,endTime:%s,subtype:%s", new Object[] { paramString, parama, paramMap });
      if (!bo.Q(new String[] { paramString, parama, paramMap }))
      {
        h.pYm.a(723L, 5L, 1L, false);
        int i = bo.ank(paramMap);
        if (i > 0)
        {
          paramMap = ah.getContext().getSharedPreferences("system_config_prefs", 0);
          paramMap.edit().putLong("new_launch_image_begin_time", bo.anl(paramString)).apply();
          paramMap.edit().putInt("new_launch_image_sub_type", i).apply();
          paramMap.edit().putLong("new_launch_image_end_time", bo.anl(parama)).commit();
          b.c.dif();
          j.wp(b.gM(43, i));
        }
      }
    }
    AppMethodBeat.o(124699);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.j.2
 * JD-Core Version:    0.6.2
 */