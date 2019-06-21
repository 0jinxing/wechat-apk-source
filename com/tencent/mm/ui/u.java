package com.tencent.mm.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.jl;
import com.tencent.mm.g.a.x;
import com.tencent.mm.m.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.pluginsdk.f.i;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.applet.SecurityImage;
import java.util.Map;

public final class u
{
  static ProgressDialog ehJ = null;
  static SecurityImage gue;
  private static boolean ymX = false;

  static
  {
    gue = null;
  }

  public static com.tencent.mm.ui.widget.a.c a(Activity paramActivity, String paramString1, String paramString2, Intent paramIntent)
  {
    AppMethodBeat.i(29610);
    jl localjl = new jl();
    localjl.cEK.status = 0;
    localjl.cEK.boZ = 1;
    com.tencent.mm.sdk.b.a.xxA.m(localjl);
    paramActivity = com.tencent.mm.ui.base.h.a(paramActivity, paramString1, paramActivity.getString(2131297061), new u.1(paramString2, paramActivity, paramIntent), new u.2(paramString2, paramActivity, paramIntent));
    AppMethodBeat.o(29610);
    return paramActivity;
  }

  public static boolean a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(29609);
    boolean bool;
    if (paramInt1 != 4)
    {
      AppMethodBeat.o(29609);
      bool = false;
      return bool;
    }
    ab.d("MicroMsg.MMErrorProcessor", "errType = " + paramInt1 + " errCode = " + paramInt2);
    switch (paramInt2)
    {
    default:
    case -205:
    case -72:
    case -9:
    case -4:
    case -3:
    case -100:
    case -75:
    case -140:
    case -104:
    }
    while (true)
    {
      AppMethodBeat.o(29609);
      bool = false;
      break;
      ab.e("MicroMsg.MMErrorProcessor", "account expired=".concat(String.valueOf(paramInt2)));
      com.tencent.mm.ui.base.h.a(paramActivity, 2131301296, 2131297061, new u.6(paramIntent, paramActivity));
      AppMethodBeat.o(29609);
      bool = true;
      break;
      String str = aw.QH();
      ab.e("MicroMsg.MMErrorProcessor", "account expired=" + paramInt2 + " lastKickReason=" + str);
      paramString = new x();
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      com.tencent.mm.kernel.a.hold();
      paramString = new jl();
      paramString.cEK.status = 0;
      paramString.cEK.boZ = 1;
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      ah.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
      if (ymX)
      {
        if (bo.isNullOrNil(str));
        for (paramActivity = ""; ; paramActivity = str)
        {
          ab.i("MicroMsg.MMErrorProcessor", "already show kickout dialog before, ignore. lastKickReason[%s]", new Object[] { paramActivity });
          AppMethodBeat.o(29609);
          bool = true;
          break;
        }
      }
      if (!bo.isNullOrNil(str))
      {
        paramString = com.tencent.mm.h.a.jY(str);
        if (paramString != null)
        {
          ab.i("MicroMsg.MMErrorProcessor", "account expired br showType[%d]", new Object[] { Integer.valueOf(paramString.showType) });
          if (((paramString.showType == 3) || (paramString.showType == 4)) && (paramString.a(paramActivity, new u.7(paramIntent, paramActivity, paramString), new u.8(paramIntent, paramActivity))))
          {
            ymX = true;
            ab.i("MicroMsg.MMErrorProcessor", "show kickout dialog by new logic.");
            AppMethodBeat.o(29609);
            bool = true;
            break;
          }
        }
      }
      paramString = str;
      Map localMap;
      if (!bo.isNullOrNil(str))
      {
        paramString = str;
        if (str.startsWith("<"))
        {
          localMap = br.z(str, "e");
          paramString = str;
          if (localMap != null)
          {
            paramString = str;
            if (!bo.isNullOrNil((String)localMap.get(".e.Content")))
            {
              paramString = (String)localMap.get(".e.Content");
              ab.i("MicroMsg.MMErrorProcessor", "account expired summerauthkick errmsg=" + paramString + " |v=" + localMap);
            }
          }
        }
      }
      ab.i("MicroMsg.MMErrorProcessor", "account expired lastKickReason[%s]", new Object[] { paramString });
      str = paramString;
      if (bo.isNullOrNil(paramString))
        str = com.tencent.mm.bz.a.an(paramActivity, 2131301294);
      com.tencent.mm.ui.base.h.a(paramActivity, str, paramActivity.getString(2131297061), new u.9(paramIntent, paramActivity), new u.10(paramIntent, paramActivity));
      ymX = true;
      ab.i("MicroMsg.MMErrorProcessor", "show kickout dialog by old logic.");
      AppMethodBeat.o(29609);
      bool = true;
      break;
      ab.e("MicroMsg.MMErrorProcessor", "account expired=".concat(String.valueOf(paramInt2)));
      com.tencent.mm.ui.base.h.a(paramActivity, 2131296515, 2131297061, new u.11(paramIntent, paramActivity));
      AppMethodBeat.o(29609);
      bool = true;
      break;
      ab.e("MicroMsg.MMErrorProcessor", "accout errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), paramString });
      if ((!bo.isNullOrNil(paramString)) && (paramString.startsWith("autoauth_errmsg_")))
        str = paramString.substring(16);
      do
      {
        paramString = str;
        if (!bo.isNullOrNil(str))
        {
          paramString = str;
          if (str.startsWith("<"))
          {
            localMap = br.z(str, "e");
            paramString = str;
            if (localMap != null)
            {
              paramString = str;
              if (!bo.isNullOrNil((String)localMap.get(".e.Content")))
                paramString = (String)localMap.get(".e.Content");
            }
          }
        }
        str = paramString;
        if (bo.isNullOrNil(paramString))
          str = ah.getContext().getString(2131301296);
        com.tencent.mm.ui.base.h.a(paramActivity, str, ah.getContext().getString(2131297061), new u.12(paramIntent, paramActivity));
        AppMethodBeat.o(29609);
        bool = true;
        break;
        str = paramString;
      }
      while (paramInt2 != -104);
      ab.i("MicroMsg.MMErrorProcessor", "MM_ERR_LOGIC but not autoauth showMsg[%s] break", new Object[] { paramString });
    }
  }

  public static boolean as(Activity paramActivity)
  {
    int i = 1;
    boolean bool = false;
    AppMethodBeat.i(29611);
    if (bo.ank(com.tencent.mm.m.g.Nu().getValue("SilentDownloadApkAtWiFi")) != 0)
      AppMethodBeat.o(29611);
    while (true)
    {
      return bool;
      aw.ZK();
      int j;
      if ((((Integer)com.tencent.mm.model.c.Ry().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
      {
        j = 1;
        label64: if ((!at.isWifi(paramActivity)) || (j == 0))
          break label124;
        j = i;
        label77: if ((com.tencent.mm.sdk.platformtools.g.cdh & 0x1) == 0)
          break label129;
        ab.d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
        j = 0;
      }
      while (true)
      {
        if ((j == 0) || (!i.dhX()))
          break label140;
        bool = at(paramActivity);
        AppMethodBeat.o(29611);
        break;
        j = 0;
        break label64;
        label124: j = 0;
        break label77;
        label129: ab.d("MicroMsg.MMErrorProcessor", "not channel pack.");
      }
      label140: AppMethodBeat.o(29611);
    }
  }

  private static boolean at(Activity paramActivity)
  {
    boolean bool = true;
    AppMethodBeat.i(29614);
    com.tencent.mm.pluginsdk.model.app.a locala = com.tencent.mm.pluginsdk.model.app.a.dhs();
    if (locala != null)
    {
      locala.dhv();
      ab.i("MicroMsg.MMErrorProcessor", "alpha download in silence.");
      AppMethodBeat.o(29614);
    }
    while (true)
    {
      return bool;
      if (com.tencent.mm.plugin.p.d.bQU() != null)
      {
        com.tencent.mm.plugin.p.d.bQU().ey(paramActivity).update(2);
        AppMethodBeat.o(29614);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(29614);
      }
    }
  }

  public static boolean c(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29613);
    ab.w("MicroMsg.MMErrorProcessor", "updateRequired [%d,%d] current version:%d  channel:%d updateMode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(com.tencent.mm.protocal.d.vxo), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdf), Integer.valueOf(com.tencent.mm.sdk.platformtools.g.cdh) });
    boolean bool;
    if (paramInt1 != 4)
    {
      bool = false;
      AppMethodBeat.o(29613);
    }
    while (true)
    {
      return bool;
      switch (paramInt2)
      {
      default:
        bool = false;
        AppMethodBeat.o(29613);
        break;
      case -16:
        if (com.tencent.mm.plugin.p.d.bQU() != null)
        {
          paramActivity = com.tencent.mm.plugin.p.d.bQU().d(paramActivity, new u.4(paramActivity));
          com.tencent.mm.plugin.report.service.h.pYm.a(405L, 36L, 1L, true);
          paramActivity.update(1);
          bool = true;
          AppMethodBeat.o(29613);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(29613);
        }
        break;
      case -17:
        long l = ah.getContext().getSharedPreferences("system_config_prefs", 0).getLong("recomended_update_ignore", -1L);
        ab.i("MicroMsg.MMErrorProcessor", "updateRequired last:%d  now:%d", new Object[] { Long.valueOf(l), Long.valueOf(bo.fp(l)) });
        if ((l != -1L) && (bo.fp(l) < 86400L))
        {
          bool = true;
          AppMethodBeat.o(29613);
        }
        else if ((com.tencent.mm.sdk.platformtools.g.cdh & 0x2) != 0)
        {
          ab.d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
          bool = true;
          AppMethodBeat.o(29613);
        }
        else
        {
          ab.d("MicroMsg.MMErrorProcessor", "not channel pack.");
          String str = com.tencent.mm.m.g.Nu().getValue("SilentDownloadApkAtWiFi");
          aw.ZK();
          if ((((Integer)com.tencent.mm.model.c.Ry().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
          {
            paramInt1 = 1;
            label337: if ((paramInt1 == 0) || ((!bo.isNullOrNil(str)) && (bo.ank(str) != 0)))
              break label477;
            bool = true;
            label359: if ((com.tencent.mm.sdk.platformtools.g.cdh & 0x1) == 0)
              break label482;
            ab.d("MicroMsg.MMErrorProcessor", "channel pack, not silence download.");
            bool = false;
          }
          while (true)
          {
            if (bo.ank(str) != 0)
              ab.d("MicroMsg.MMErrorProcessor", "dynaCfg close silence wifi download.");
            ab.d("MicroMsg.MMErrorProcessor", "summerupdate updateRequired silenceDownload[%b]", new Object[] { Boolean.valueOf(bool) });
            if (bool)
              break label504;
            if (com.tencent.mm.plugin.p.d.bQU() == null)
              break label493;
            paramActivity = com.tencent.mm.plugin.p.d.bQU().d(paramActivity, new u.5(paramActivity));
            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 38L, 1L, true);
            paramActivity.update(2);
            bool = true;
            AppMethodBeat.o(29613);
            break;
            paramInt1 = 0;
            break label337;
            label477: bool = false;
            break label359;
            label482: ab.d("MicroMsg.MMErrorProcessor", "not channel pack.");
          }
          label493: bool = false;
          AppMethodBeat.o(29613);
          continue;
          label504: com.tencent.mm.plugin.report.service.h.pYm.a(405L, 40L, 1L, true);
          bool = at(paramActivity);
          AppMethodBeat.o(29613);
        }
        break;
      }
    }
  }

  public static boolean ht(final Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(29612);
    final String str = i.dhU();
    int i = i.dhV();
    ab.i("MicroMsg.MMErrorProcessor", "installRequired %s, updateType: %d", new Object[] { str, Integer.valueOf(i) });
    if ((!bo.isNullOrNil(str)) && (!i.dhW()))
    {
      aw.RS().aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(29597);
          if ((this.ymZ == 4) && (com.tencent.mm.pluginsdk.model.app.a.dhs() == null))
          {
            ab.w("MicroMsg.MMErrorProcessor", "alphaUpdateInfo expired");
            AppMethodBeat.o(29597);
          }
          while (true)
          {
            return;
            if ((com.tencent.mm.plugin.p.d.bQU() != null) && (com.tencent.mm.plugin.p.d.bQU().RP(str) != null))
              al.d(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(29596);
                  if (com.tencent.mm.plugin.p.d.bQU() != null)
                    com.tencent.mm.plugin.p.d.bQU().ez(u.3.this.val$context);
                  AppMethodBeat.o(29596);
                }
              });
            AppMethodBeat.o(29597);
          }
        }
      });
      AppMethodBeat.o(29612);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(29612);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.u
 * JD-Core Version:    0.6.2
 */