package com.tencent.mm.plugin.bbom;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.v.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bo.a;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.w;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.ui.LauncherUI;
import java.util.Map;

public final class n
  implements f
{
  static n jEu;

  private static void Fx(String paramString)
  {
    AppMethodBeat.i(18273);
    Context localContext = ah.getContext();
    Intent localIntent = new Intent(localContext, LauncherUI.class);
    localIntent.putExtra("Intro_Notify", true);
    localIntent.addFlags(536870912);
    localIntent.addFlags(67108864);
    String str = paramString;
    if (!bo.isNullOrNil(paramString))
    {
      str = paramString;
      if (paramString.startsWith("autoauth_errmsg_"))
        str = paramString.substring(16);
    }
    paramString = str;
    if (!bo.isNullOrNil(str))
    {
      paramString = str;
      if (str.startsWith("<"))
      {
        Map localMap = br.z(str, "e");
        paramString = str;
        if (localMap != null)
        {
          paramString = str;
          if (!bo.isNullOrNil((String)localMap.get(".e.Content")))
            paramString = (String)localMap.get(".e.Content");
        }
      }
    }
    paramString = a.bt(localContext, a.dgM()).d(paramString).e(null);
    paramString.EI = PendingIntent.getActivity(localContext, 0, localIntent, 268435456);
    paramString = paramString.build();
    paramString.icon = a.bWV();
    paramString.flags = 16;
    aw.getNotification().c(paramString);
    AppMethodBeat.o(18273);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(18272);
    if ((paramInt1 == 4) && (!aw.Rg().foreground));
    switch (paramInt2)
    {
    default:
      AppMethodBeat.o(18272);
    case -311:
    case -310:
    case -205:
    case -72:
    case -9:
    case -6:
    case -4:
    case -3:
    case -140:
    case -100:
    case -999999:
    case -17:
    case -16:
    }
    while (true)
    {
      return;
      Fx(ah.getContext().getString(2131301296));
      aw.hold();
      AppMethodBeat.o(18272);
      continue;
      ab.e("MicroMsg.NewSyncErrorProcessor", "alpha need whitelist : [%s]", new Object[] { paramString });
      if (!bo.isNullOrNil(paramString))
        Fx(paramString);
      while (true)
      {
        aw.hold();
        AppMethodBeat.o(18272);
        break;
        Fx(ah.getContext().getString(2131301296));
      }
      Fx(ah.getContext().getString(2131301294));
      w.cn(ah.getContext());
      aw.hold();
      AppMethodBeat.o(18272);
      continue;
      new ak().post(new n.1(this));
      AppMethodBeat.o(18272);
      continue;
      paramString = ah.getContext().getSharedPreferences("system_config_prefs", 0);
      long l = paramString.getLong("recomended_update_ignore", -1L);
      if ((l == -1L) || (bo.fp(l) >= 86400L))
        break;
      ab.d("MicroMsg.NewSyncErrorProcessor", "skip update notification, last check=".concat(String.valueOf(l)));
      AppMethodBeat.o(18272);
    }
    if (paramInt2 == -17);
    for (paramInt1 = 2; ; paramInt1 = 1)
    {
      Object localObject = ah.getContext();
      paramm = new Intent((Context)localObject, LauncherUI.class);
      paramm.addFlags(536870912);
      paramm.addFlags(67108864);
      paramm.putExtra("nofification_type", "update_nofification");
      paramm.putExtra("show_update_dialog", true);
      paramm.putExtra("update_type", paramInt1);
      paramm = PendingIntent.getActivity((Context)localObject, 0, paramm, 0);
      localObject = a.bt((Context)localObject, "reminder_channel_id").g(null).j(System.currentTimeMillis()).d(((Context)localObject).getString(2131297070)).e(((Context)localObject).getString(2131297028));
      ((v.c)localObject).EI = paramm;
      paramm = ((v.c)localObject).build();
      paramm.flags |= 16;
      aw.getNotification().a(34, paramm, false);
      paramString.edit().putLong("recomended_update_ignore", bo.anT()).commit();
      h.pYm.a(405L, 27L, 1L, true);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.n
 * JD-Core Version:    0.6.2
 */