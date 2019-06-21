package com.tencent.mm.plugin.game.f;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.HandlerThread;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.gz;
import com.tencent.mm.g.a.gz.b;
import com.tencent.mm.g.a.ky;
import com.tencent.mm.game.report.a.b;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vending.h.d;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class c
{
  private static int fMg;
  private static volatile al ftB;
  private static final Object iRa;
  private static int maxSize;
  private static DisplayMetrics njz;
  private static int nnx;
  private static Rect rect;

  static
  {
    AppMethodBeat.i(112322);
    maxSize = -1;
    fMg = -1;
    nnx = -1;
    iRa = new Object();
    rect = new Rect();
    AppMethodBeat.o(112322);
  }

  public static int Or(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(112303);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.GameCenterUtil", "Null or Nil packageName");
      AppMethodBeat.o(112303);
    }
    while (true)
    {
      return i;
      try
      {
        paramString = ah.getContext().getPackageManager().getPackageInfo(paramString, 0);
        if (paramString == null)
          AppMethodBeat.o(112303);
      }
      catch (Exception paramString)
      {
        while (true)
        {
          ab.w("MicroMsg.GameCenterUtil", "Exception: %s", new Object[] { paramString.toString() });
          paramString = null;
        }
        i = paramString.versionCode;
        AppMethodBeat.o(112303);
      }
    }
  }

  public static int Os(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(112304);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.GameCenterUtil", "Null or Nil path");
      AppMethodBeat.o(112304);
    }
    while (true)
    {
      return i;
      paramString = ah.getContext().getPackageManager().getPackageArchiveInfo(paramString, 0);
      if (paramString == null)
      {
        AppMethodBeat.o(112304);
      }
      else
      {
        i = paramString.versionCode;
        AppMethodBeat.o(112304);
      }
    }
  }

  public static void Ot(String paramString)
  {
    try
    {
      AppMethodBeat.i(112305);
      if (bo.isNullOrNil(paramString))
        AppMethodBeat.o(112305);
      while (true)
      {
        return;
        ab.d("MicroMsg.GameCenterUtil", "pre download entrance image : %s", new Object[] { paramString });
        gz localgz = new com/tencent/mm/g/a/gz;
        localgz.<init>();
        localgz.cBH.Cn = 1;
        localgz.cBH.url = paramString;
        com.tencent.mm.sdk.b.a.xxA.m(localgz);
        if (localgz.cBI.cBK)
        {
          Object localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          Object localObject2 = localgz.cBI.cBJ + com.tencent.mm.a.g.x(paramString.getBytes());
          localObject1 = new com/tencent/mm/at/a/a/c$a;
          ((c.a)localObject1).<init>();
          ((c.a)localObject1).ePH = true;
          ((c.a)localObject1).ePJ = ((String)localObject2);
          localObject2 = ((c.a)localObject1).ahG();
          localObject1 = o.ahp();
          c.2 local2 = new com/tencent/mm/plugin/game/f/c$2;
          local2.<init>(localgz);
          c.3 local3 = new com/tencent/mm/plugin/game/f/c$3;
          local3.<init>(localgz);
          ((com.tencent.mm.at.a.a)localObject1).a(paramString, null, (com.tencent.mm.at.a.a.c)localObject2, local2, local3);
        }
        AppMethodBeat.o(112305);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  private static boolean Ou(String paramString)
  {
    AppMethodBeat.i(112321);
    boolean bool;
    if (!((b)com.tencent.mm.kernel.g.K(b.class)).a(com.tencent.mm.plugin.expt.a.a.a.lFH))
    {
      AppMethodBeat.o(112321);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(112321);
        bool = false;
      }
      else
      {
        paramString = Uri.parse(paramString);
        if ((paramString.getHost() != null) && (paramString.getHost().equals("game.weixin.qq.com")))
        {
          bool = true;
          AppMethodBeat.o(112321);
        }
        else
        {
          AppMethodBeat.o(112321);
          bool = false;
        }
      }
    }
  }

  public static int a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle, int paramInt)
  {
    int i = 6;
    AppMethodBeat.i(112309);
    Object localObject = paramBundle;
    if (!bo.isNullOrNil(paramString1))
    {
      Bundle localBundle = paramBundle;
      if (paramBundle == null)
        localBundle = new Bundle();
      paramBundle = com.tencent.mm.plugin.game.model.a.cm(paramString1, localBundle.getInt("game_report_from_scene", 0));
      localObject = localBundle;
      if (paramBundle.bJt == 2)
      {
        localObject = localBundle;
        if (!bo.isNullOrNil(paramBundle.url))
        {
          paramInt = t(paramContext, paramBundle.url, "game_center_detail");
          AppMethodBeat.o(112309);
        }
      }
    }
    while (true)
    {
      return paramInt;
      if (!bo.isNullOrNil(paramString2))
      {
        paramInt = t(paramContext, paramString2, "game_center_detail");
        AppMethodBeat.o(112309);
      }
      else
      {
        int j = com.tencent.mm.plugin.game.model.e.bEb();
        if (j == 2)
        {
          paramInt = m(paramContext, paramString1, paramInt);
          AppMethodBeat.o(112309);
        }
        else if (j == 1)
        {
          g(paramContext, (Bundle)localObject);
          AppMethodBeat.o(112309);
          paramInt = i;
        }
        else
        {
          paramString2 = bo.gQ(paramContext);
          if ((bo.isNullOrNil(paramString2)) || (paramString2.toLowerCase().equals("cn")))
          {
            paramInt = m(paramContext, paramString1, paramInt);
            AppMethodBeat.o(112309);
          }
          else
          {
            g(paramContext, (Bundle)localObject);
            AppMethodBeat.o(112309);
            paramInt = i;
          }
        }
      }
    }
  }

  public static void a(Context paramContext, n paramn, String paramString)
  {
    AppMethodBeat.i(112300);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramn.mWG.url);
    localIntent.putExtra("finishviewifloadfailed", true);
    localIntent.putExtra("show_full_screen", paramn.mWG.mTC);
    localIntent.putExtra("disable_progress_bar", paramn.mWG.mTC);
    int i = -1;
    switch (paramn.mWG.orientation)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      localIntent.putExtra("screen_orientation", i);
      localIntent.putExtra("geta8key_scene", 32);
      localIntent.putExtra("KPublisherId", paramString);
      localIntent.putExtra("open_game_float", true);
      paramn = new ky();
      paramn.cGQ.type = 1;
      paramn.cGQ.context = paramContext;
      paramn.cGQ.intent = localIntent;
      com.tencent.mm.sdk.b.a.xxA.m(paramn);
      AppMethodBeat.o(112300);
      return;
      i = 0;
      continue;
      i = 1;
      continue;
      i = 1001;
      continue;
      i = 1002;
    }
  }

  public static boolean a(View paramView, Context paramContext)
  {
    AppMethodBeat.i(112301);
    boolean bool;
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof String)))
    {
      ab.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
      AppMethodBeat.o(112301);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramView = (String)paramView.getTag();
      if (bo.isNullOrNil(paramView))
      {
        ab.e("MicroMsg.GameCenterUtil", "Invalid Jump URL");
        AppMethodBeat.o(112301);
        bool = false;
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramView);
        localIntent.putExtra("show_bottom", false);
        w(localIntent, paramContext);
        bool = true;
        AppMethodBeat.o(112301);
      }
    }
  }

  public static void aNR()
  {
    AppMethodBeat.i(112315);
    if (ftB == null)
      AppMethodBeat.o(112315);
    while (true)
    {
      return;
      synchronized (iRa)
      {
        if (ftB != null)
        {
          com.tencent.mm.vending.h.g.asT("SubCoreGameCenter#WorkThread");
          ftB.oAl.quit();
          ftB = null;
        }
        AppMethodBeat.o(112315);
      }
    }
  }

  public static al aNS()
  {
    AppMethodBeat.i(112316);
    if (ftB == null);
    synchronized (iRa)
    {
      if (ftB == null)
      {
        Object localObject2 = new com/tencent/mm/sdk/platformtools/al;
        ((al)localObject2).<init>("SubCoreGameCenter#WorkThread");
        ftB = (al)localObject2;
        localObject2 = new com/tencent/mm/vending/h/h;
        ((com.tencent.mm.vending.h.h)localObject2).<init>(ftB.oAl.getLooper(), "SubCoreGameCenter#WorkThread");
        com.tencent.mm.vending.h.g.a("SubCoreGameCenter#WorkThread", (d)localObject2);
      }
      ??? = ftB;
      AppMethodBeat.o(112316);
      return ???;
    }
  }

  public static void ab(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(112306);
    if (bo.ek(paramLinkedList))
      AppMethodBeat.o(112306);
    while (true)
    {
      return;
      LinkedList localLinkedList = new LinkedList();
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        f localf = com.tencent.mm.pluginsdk.model.app.g.bT(str, true);
        if ((localf != null) && (bo.isNullOrNil(localf.field_openId)))
          localLinkedList.add(str);
      }
      if (!bo.ek(localLinkedList))
        com.tencent.mm.plugin.s.a.bYL().addAll(localLinkedList);
      AppMethodBeat.o(112306);
    }
  }

  public static int ax(Context paramContext, String paramString)
  {
    AppMethodBeat.i(112297);
    int i = t(paramContext, paramString, null);
    AppMethodBeat.o(112297);
    return i;
  }

  public static boolean ay(Context paramContext, String paramString)
  {
    int i = 2;
    AppMethodBeat.i(112299);
    paramString = Uri.parse(paramString).getQueryParameter("weapp");
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        Object localObject1 = Uri.parse(paramString);
        paramString = ((Uri)localObject1).getAuthority();
        if (bo.isNullOrNil(paramString))
        {
          ab.w("MicroMsg.GameCenterUtil", "targetAppId is null");
          AppMethodBeat.o(112299);
          bool = false;
          return bool;
        }
        Object localObject2 = ((Uri)localObject1).getQueryParameter("env_version");
        localObject1 = ((Uri)localObject1).getQueryParameter("path");
        localObject2 = bo.nullAsNil((String)localObject2);
        int j = -1;
        switch (((String)localObject2).hashCode())
        {
        default:
          switch (j)
          {
          default:
            i = 0;
          case 1:
            ab.i("MicroMsg.GameCenterUtil", "jumpWeApp, appId: %s, versionType: %d, path: %s", new Object[] { paramString, Integer.valueOf(i), localObject1 });
            localObject2 = new com/tencent/mm/plugin/appbrand/report/AppBrandStatObject;
            ((AppBrandStatObject)localObject2).<init>();
            ((AppBrandStatObject)localObject2).scene = 1079;
            ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, null, paramString, i, 0, (String)localObject1, (AppBrandStatObject)localObject2);
            AppMethodBeat.o(112299);
            bool = true;
          case 0:
          }
          break;
        case 1559690845:
          if (!((String)localObject2).equals("develop"))
            continue;
          j = 0;
          break;
        case 110628630:
          bool = ((String)localObject2).equals("trial");
          if (!bool)
            continue;
          j = 1;
          continue;
          i = 1;
          continue;
        }
      }
      catch (Exception paramContext)
      {
        ab.e("MicroMsg.GameCenterUtil", "checkJumpWeApp: " + paramContext.getMessage());
      }
      AppMethodBeat.o(112299);
      boolean bool = false;
    }
  }

  public static int b(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(112308);
    int i = a(paramContext, paramString1, paramString2, paramBundle, 0);
    AppMethodBeat.o(112308);
    return i;
  }

  public static LinkedList<f> bFF()
  {
    AppMethodBeat.i(112307);
    Cursor localCursor = com.tencent.mm.plugin.s.a.bYJ().dhE();
    LinkedList localLinkedList = new LinkedList();
    if (localCursor == null)
      ab.e("MicroMsg.GameCenterUtil", "getGameAppInfo failed: curosr is null");
    while (true)
    {
      AppMethodBeat.o(112307);
      return localLinkedList;
      if (localCursor.moveToFirst())
        do
        {
          f localf = new f();
          localf.d(localCursor);
          localLinkedList.add(localf);
        }
        while (localCursor.moveToNext());
      localCursor.close();
    }
  }

  public static String bFG()
  {
    AppMethodBeat.i(112320);
    Object localObject = ((b)com.tencent.mm.kernel.g.K(b.class)).a(com.tencent.mm.plugin.expt.a.a.a.lFU, "");
    if ((localObject != null) && (!bo.isNullOrNil(((String)localObject).trim())))
      if (((String)localObject).equals("native"))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(848L, 11L, 1L, false);
        AppMethodBeat.o(112320);
        localObject = null;
      }
    while (true)
    {
      return localObject;
      com.tencent.mm.plugin.report.service.h.pYm.a(848L, 10L, 1L, false);
      AppMethodBeat.o(112320);
      continue;
      localObject = com.tencent.mm.plugin.game.model.a.bDL();
      if ((((com.tencent.mm.plugin.game.model.a.a)localObject).bJt == 2) && (!bo.isNullOrNil(((com.tencent.mm.plugin.game.model.a.a)localObject).url)))
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(848L, 12L, 1L, false);
        localObject = ((com.tencent.mm.plugin.game.model.a.a)localObject).url;
        AppMethodBeat.o(112320);
      }
      else
      {
        AppMethodBeat.o(112320);
        localObject = null;
      }
    }
  }

  public static boolean eC(String paramString1, String paramString2)
  {
    AppMethodBeat.i(112318);
    paramString1 = new File(paramString1);
    String str = com.tencent.mm.a.g.v(paramString1);
    boolean bool;
    if ((bo.isNullOrNil(paramString2)) || (bo.isNullOrNil(str)))
    {
      ab.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 is null");
      bool = paramString1.exists();
      AppMethodBeat.o(112318);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.GameCenterUtil", "checkPkgMD5Valid, md5 = %s, calculateMD5 = %s", new Object[] { paramString2, str });
      bool = paramString2.equalsIgnoreCase(str);
      AppMethodBeat.o(112318);
    }
  }

  public static Dialog ej(Context paramContext)
  {
    AppMethodBeat.i(112302);
    View localView = View.inflate(paramContext, 2130969765, null);
    paramContext = new com.tencent.mm.ui.base.i(paramContext, 2131493282);
    paramContext.setContentView(localView);
    paramContext.setCancelable(true);
    paramContext.setCanceledOnTouchOutside(false);
    paramContext.setOnCancelListener(new c.1(paramContext));
    AppMethodBeat.o(112302);
    return paramContext;
  }

  public static void g(Context paramContext, Bundle paramBundle)
  {
    AppMethodBeat.i(112312);
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.tencent.mm.plugin.game.ui.GameDetailUI2");
    localIntent.putExtras(paramBundle);
    paramContext.startActivity(localIntent);
    AppMethodBeat.o(112312);
  }

  public static int getScreenWidth(Context paramContext)
  {
    AppMethodBeat.i(112296);
    int i;
    if (paramContext == null)
    {
      i = 0;
      AppMethodBeat.o(112296);
    }
    while (true)
    {
      return i;
      if (njz == null)
      {
        njz = new DisplayMetrics();
        ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(njz);
      }
      i = njz.widthPixels;
      AppMethodBeat.o(112296);
    }
  }

  public static void iQ(long paramLong)
  {
    AppMethodBeat.i(112319);
    com.tencent.mm.plugin.downloader.h.a.a(paramLong, false, null);
    AppMethodBeat.o(112319);
  }

  public static int m(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(112310);
    if (bo.isNullOrNil(paramString))
    {
      paramInt = 0;
      AppMethodBeat.o(112310);
      return paramInt;
    }
    String str = com.tencent.mm.plugin.game.model.e.bEa();
    HashMap localHashMap;
    if (!bo.isNullOrNil(str))
    {
      localHashMap = new HashMap();
      localHashMap.put("appid", paramString);
      if (paramInt > 0)
        localHashMap.put("ssid", String.valueOf(paramInt));
    }
    for (paramString = p(str, localHashMap); ; paramString = "game.weixin.qq.com/cgi-bin/h5/static/gamecenter/detail.html?appid=".concat(String.valueOf(paramString)))
    {
      paramInt = t(paramContext, paramString, "game_center_detail");
      AppMethodBeat.o(112310);
      break;
    }
  }

  private static String p(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(112311);
    if ((bo.isNullOrNil(paramString)) || (paramMap.isEmpty()))
      AppMethodBeat.o(112311);
    while (true)
    {
      return paramString;
      paramString = Uri.parse(paramString).buildUpon();
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramString.appendQueryParameter(str, (String)paramMap.get(str));
      }
      paramString = paramString.build().toString();
      AppMethodBeat.o(112311);
    }
  }

  public static int parseColor(String paramString)
  {
    AppMethodBeat.i(112317);
    int i = 0;
    try
    {
      j = Color.parseColor(paramString);
      AppMethodBeat.o(112317);
      return j;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.GameCenterUtil", "parseColor: " + paramString.getMessage());
        int j = i;
      }
    }
  }

  public static int t(Context paramContext, String paramString1, String paramString2)
  {
    int i = 0;
    AppMethodBeat.i(112298);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(112298);
    while (true)
    {
      return i;
      if (ay(paramContext, paramString1))
      {
        i = 30;
        AppMethodBeat.o(112298);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramString1);
        localIntent.putExtra("show_bottom", false);
        localIntent.putExtra("geta8key_scene", 32);
        localIntent.putExtra("KPublisherId", paramString2);
        w(localIntent, paramContext);
        i = 7;
        AppMethodBeat.o(112298);
      }
    }
  }

  public static void w(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(112313);
    if (Ou(paramIntent.getStringExtra("rawUrl")))
    {
      x(paramIntent, paramContext);
      AppMethodBeat.o(112313);
    }
    while (true)
    {
      return;
      ky localky = new ky();
      localky.cGQ.type = 0;
      localky.cGQ.context = paramContext;
      localky.cGQ.intent = paramIntent;
      com.tencent.mm.sdk.b.a.xxA.m(localky);
      AppMethodBeat.o(112313);
    }
  }

  public static void x(Intent paramIntent, Context paramContext)
  {
    AppMethodBeat.i(112314);
    ky localky = new ky();
    localky.cGQ.type = 2;
    localky.cGQ.context = paramContext;
    localky.cGQ.intent = paramIntent;
    com.tencent.mm.sdk.b.a.xxA.m(localky);
    AppMethodBeat.o(112314);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.c
 * JD-Core Version:    0.6.2
 */