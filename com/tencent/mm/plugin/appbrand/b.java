package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.an;
import com.tencent.mm.plugin.appbrand.appcache.at;
import com.tencent.mm.plugin.appbrand.appcache.ax;
import com.tencent.mm.plugin.appbrand.appcache.ax.b;
import com.tencent.mm.plugin.appbrand.appcache.n.c;
import com.tencent.mm.plugin.appbrand.appcache.q;
import com.tencent.mm.plugin.appbrand.appstorage.ZipJNI;
import com.tencent.mm.plugin.appbrand.appusage.t;
import com.tencent.mm.plugin.appbrand.appusage.x;
import com.tencent.mm.plugin.appbrand.appusage.x.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.appbrand.config.p;
import com.tencent.mm.plugin.appbrand.config.r;
import com.tencent.mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.mm.plugin.appbrand.o.c;
import com.tencent.mm.plugin.appbrand.o.c.a;
import com.tencent.mm.plugin.appbrand.service.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;

public final class b
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    int i = 2;
    boolean bool1 = false;
    boolean bool2 = false;
    int j = 0;
    AppMethodBeat.i(128927);
    int k;
    if ((bp.dpL()) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_PURPLE))
    {
      k = 1;
      if (k != 0)
        break label56;
      AppMethodBeat.o(128927);
    }
    label268: label271: label428: label431: 
    while (true)
    {
      return true;
      k = 0;
      break;
      label56: if ("//enable_appbrand_monkey_test".equals(paramArrayOfString[0]))
      {
        DebuggerShell.ayV();
        AppMethodBeat.o(128927);
      }
      else if ("//disable_appbrand_monkey_test".equals(paramArrayOfString[0]))
      {
        DebuggerShell.ayW();
        AppMethodBeat.o(128927);
      }
      else
      {
        if ("//appbrand_predownload_trigger".equals(paramArrayOfString[0]))
        {
          if (paramArrayOfString.length > 1);
          for (paramContext = paramArrayOfString[1].trim(); ; paramContext = "")
          {
            ((com.tencent.mm.plugin.appbrand.service.h)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.h.class)).xO(paramContext);
            AppMethodBeat.o(128927);
            break;
          }
        }
        if ("//wxafts".equals(paramArrayOfString[0]))
        {
          if (paramArrayOfString[1].contains("delete"))
          {
            paramArrayOfString = c.a.iDD;
            paramContext = com.tencent.mm.plugin.appbrand.o.d.iDE;
            com.tencent.mm.a.e.t(new File(com.tencent.mm.plugin.appbrand.o.d.aLD()));
            ab.i("MicroMsg.WxaFTSSearchCore", "forceUnzipBasicTemplate");
            paramArrayOfString.prepare();
          }
          AppMethodBeat.o(128927);
        }
        else
        {
          if ("//xweb_video".equals(paramArrayOfString[0]))
          {
            paramContext = paramArrayOfString[1];
            switch (paramContext.hashCode())
            {
            default:
              i = -1;
              switch (i)
              {
              default:
              case 0:
              case 1:
              case 2:
              }
              break;
            case 94746189:
            case 3569038:
            case 97196323:
            }
            while (true)
            {
              AppMethodBeat.o(128927);
              break;
              if (!paramContext.equals("clear"))
                break label268;
              i = 0;
              break label271;
              if (!paramContext.equals("true"))
                break label268;
              i = 1;
              break label271;
              if (!paramContext.equals("false"))
                break label268;
              break label271;
              com.tencent.mm.plugin.appbrand.u.a.aSi();
              continue;
              com.tencent.mm.plugin.appbrand.u.a.rh(1);
              continue;
              com.tencent.mm.plugin.appbrand.u.a.rh(0);
            }
          }
          if ("//localwxalibrary".equals(paramArrayOfString[0]))
          {
            paramContext = as.amF("__appbrand_comm_lib__prefs");
            paramArrayOfString = paramArrayOfString[1];
            switch (paramArrayOfString.hashCode())
            {
            default:
              i = -1;
              switch (i)
              {
              default:
              case 0:
              case 1:
              case 2:
              }
              break;
            case 94746189:
            case 3569038:
            case 97196323:
            }
            while (true)
            {
              AppMethodBeat.o(128927);
              break;
              if (!paramArrayOfString.equals("clear"))
                break label428;
              i = 0;
              break label431;
              if (!paramArrayOfString.equals("true"))
                break label428;
              i = 1;
              break label431;
              if (!paramArrayOfString.equals("false"))
                break label428;
              break label431;
              paramContext.edit().remove("localwxalibrary").commit();
              continue;
              paramContext.edit().putBoolean("localwxalibrary", true).commit();
              continue;
              paramContext.edit().putBoolean("localwxalibrary", false).commit();
            }
          }
          if ("//getsearchshowoutwxaapp".equals(paramArrayOfString[0]))
          {
            if ((paramArrayOfString.length > 1) && (paramArrayOfString[1].contains("daily")))
            {
              paramContext = x.a.hat;
              x.axL();
            }
            while (true)
            {
              AppMethodBeat.o(128927);
              break;
              paramContext = x.a.hau;
              x.axL();
            }
          }
          if ("//callsearchshowoutwxaapp".equals(paramArrayOfString[0]))
          {
            ((i)com.tencent.mm.kernel.g.K(i.class)).axP();
            AppMethodBeat.o(128927);
          }
          else
          {
            if (!"//wagame".equals(paramArrayOfString[0]))
              break label682;
            com.tencent.mm.plugin.appbrand.game.a.g.a(paramContext, paramArrayOfString);
            AppMethodBeat.o(128927);
          }
        }
      }
    }
    label682: paramContext = paramArrayOfString[1].toLowerCase();
    i = -1;
    switch (paramContext.hashCode())
    {
    default:
      label892: switch (i)
      {
      default:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      }
      break;
    case -1155441316:
    case -1819844161:
    case -2086708598:
    case -358696710:
    case -358692799:
    case -681162920:
    case -917899243:
    case -1958532869:
    case 1127987502:
    case 3545755:
    case -1897191982:
    case 98712316:
    case -725390129:
    case -501183631:
    case -2120258717:
    case -2120258713:
    case -2094503115:
    case -78191370:
    case 424332448:
    case -1513405239:
    case -901868261:
    case 1102626508:
    case -738930766:
    }
    while (true)
    {
      AppMethodBeat.o(128927);
      break;
      if (!paramContext.equals("jnizip"))
        break label892;
      i = 0;
      break label892;
      if (!paramContext.equals("javazip"))
        break label892;
      i = 1;
      break label892;
      if (!paramContext.equals("deletebetalib"))
        break label892;
      i = 2;
      break label892;
      if (!paramContext.equals("deletelib"))
        break label892;
      i = 3;
      break label892;
      if (!paramContext.equals("deletepkg"))
        break label892;
      i = 4;
      break label892;
      if (!paramContext.equals("pkgcleanup"))
        break label892;
      i = 5;
      break label892;
      if (!paramContext.equals("deletecontact"))
        break label892;
      i = 6;
      break label892;
      if (!paramContext.equals("historycount"))
        break label892;
      i = 7;
      break label892;
      if (!paramContext.equals("resetsyncversion"))
        break label892;
      i = 8;
      break label892;
      if (!paramContext.equals("sync"))
        break label892;
      i = 9;
      break label892;
      if (!paramContext.equals("starmax"))
        break label892;
      i = 10;
      break label892;
      if (!paramContext.equals("guide"))
        break label892;
      i = 11;
      break label892;
      if (!paramContext.equals("clearguide"))
        break label892;
      i = 12;
      break label892;
      if (!paramContext.equals("releasepkghighversion"))
        break label892;
      i = 13;
      break label892;
      if (!paramContext.equals("incremental_insert_24"))
        break label892;
      i = 14;
      break label892;
      if (!paramContext.equals("incremental_insert_28"))
        break label892;
      i = 15;
      break label892;
      if (!paramContext.equals("incremental_delete_28"))
        break label892;
      i = 16;
      break label892;
      if (!paramContext.equals("incremental_delete_latest"))
        break label892;
      i = 17;
      break label892;
      if (!paramContext.equals("incremental_lib"))
        break label892;
      i = 18;
      break label892;
      if (!paramContext.equals("clear_mocklib"))
        break label892;
      i = 19;
      break label892;
      if (!paramContext.equals("force_modularizing"))
        break label892;
      i = 20;
      break label892;
      if (!paramContext.equals("disable_develop_lib"))
        break label892;
      i = 21;
      break label892;
      if (!paramContext.equals("disable_preload"))
        break label892;
      i = 22;
      break label892;
      com.tencent.mm.sdk.g.d.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(128925);
          long l = bo.anU();
          ab.i("[ZIP]", "unzip JNI %d, cost %d", new Object[] { Integer.valueOf(ZipJNI.unzip("/sdcard/test_zip.zip", "/sdcard/test_zip/", null)), Long.valueOf(bo.anU() - l) });
          AppMethodBeat.o(128925);
        }
      }
      , "TestZipJNI");
      continue;
      com.tencent.mm.sdk.g.d.post(new b.2(this), "TestZipJava");
      continue;
      paramArrayOfString = com.tencent.mm.plugin.appbrand.app.f.auV();
      paramContext = new at();
      paramContext.field_appId = "@LibraryAppId";
      paramContext.field_debugType = 999;
      paramContext.field_version = 1;
      paramArrayOfString.gVk.a(paramContext, at.gUR);
      i = an.VERSION;
      com.tencent.mm.plugin.appbrand.task.h.pN(2);
      continue;
      com.tencent.mm.plugin.appbrand.app.f.auV().ax("@LibraryAppId", 0);
      i = an.VERSION;
      com.tencent.mm.plugin.appbrand.task.h.pN(2);
      continue;
      if (paramArrayOfString.length > 2);
      for (paramContext = paramArrayOfString[2].trim(); ; paramContext = null)
      {
        i = j;
        if (paramArrayOfString.length > 3)
          i = bo.getInt(paramArrayOfString[3].trim(), 0);
        if (TextUtils.isEmpty(paramContext))
          break;
        com.tencent.mm.plugin.appbrand.app.f.auV().ax(paramContext, i);
        break;
      }
      com.tencent.mm.sdk.g.d.post(n.c.avx(), "WxaPkgCleanupByCMD");
      continue;
      p.zq(paramArrayOfString[2]);
      continue;
      if (bo.getInt(paramArrayOfString[2].trim(), 0) > 0)
        bool1 = true;
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOa, Boolean.valueOf(bool1));
      continue;
      p.zp(paramArrayOfString[2]);
      continue;
      r.zt(paramArrayOfString[2]);
      continue;
      t.nC(Math.max(0, bo.getInt(paramArrayOfString[2], 0)));
      continue;
      com.tencent.mm.bp.d.H(ah.getContext(), "appbrand", ".ui.AppBrandGuideUI");
      continue;
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xNZ, Boolean.FALSE);
      continue;
      paramArrayOfString = paramArrayOfString[2];
      try
      {
        paramContext = new com/tencent/mm/plugin/appbrand/config/WxaAttributes$e;
        paramContext.<init>();
        paramContext.axy = 1000;
        paramContext.hii = "fake";
        com.tencent.mm.plugin.appbrand.app.f.auV().a(paramArrayOfString, paramContext);
      }
      catch (Exception paramContext)
      {
      }
      continue;
      paramContext = new at();
      paramContext.field_appId = "wx4ffb369b6881ee5e";
      paramContext.field_version = 24;
      paramContext.field_versionMd5 = "a47b978d23679075cbbed1030f71b7bb";
      paramContext.field_versionState = 0;
      paramContext.field_debugType = 0;
      paramContext.field_pkgPath = "/sdcard/_276854502_24.wxapkg";
      com.tencent.mm.plugin.appbrand.app.f.auV().d(paramContext);
      continue;
      paramContext = new at();
      paramContext.field_appId = "wx4ffb369b6881ee5e";
      paramContext.field_version = 28;
      paramContext.field_versionMd5 = "5713e70880cc2d356905d6189ba37a72";
      paramContext.field_versionState = 0;
      paramContext.field_debugType = 0;
      paramContext.field_pkgPath = "/sdcard/_276854502_28.wxapkg";
      com.tencent.mm.plugin.appbrand.app.f.auV().d(paramContext);
      continue;
      paramContext = new at();
      paramContext.field_appId = "wx4ffb369b6881ee5e";
      paramContext.field_version = 28;
      paramContext.field_debugType = 0;
      com.tencent.mm.plugin.appbrand.app.f.auV().a(paramContext);
      continue;
      paramContext = com.tencent.mm.plugin.appbrand.app.f.auV();
      paramArrayOfString = paramContext.a("wx4ffb369b6881ee5e", 0, new String[] { "version" });
      if (paramArrayOfString != null)
      {
        paramContext.a(paramArrayOfString);
        continue;
        new q(bo.getInt(paramArrayOfString[2], 78), paramArrayOfString[3]).run();
        continue;
        an.avS();
        Toast.makeText(ah.getContext(), "MockLib已清除，重启微信生效", 1).show();
        continue;
        if (paramArrayOfString.length >= 3)
        {
          bool1 = bool2;
          if (paramArrayOfString[2].equalsIgnoreCase("false"));
        }
        else
        {
          bool1 = true;
        }
        com.tencent.mm.plugin.appbrand.launching.ai.iiB = bool1;
        continue;
        if (paramArrayOfString.length >= 3)
        {
          an.dD(paramArrayOfString[2].trim().contentEquals("1"));
          continue;
          if (paramArrayOfString.length >= 3)
            com.tencent.mm.plugin.appbrand.task.a.a.eC(paramArrayOfString[2].trim().contentEquals("1"));
          else
            com.tencent.mm.plugin.appbrand.task.a.a.eC(true);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.b
 * JD-Core Version:    0.6.2
 */