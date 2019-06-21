package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.game.d.ac;
import com.tencent.mm.plugin.game.f.a.a;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.pluginsdk.model.app.aj;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class e
{
  private static String mVK = "";

  public static void N(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(111226);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putInt("game_top_banner_id", paramInt).apply();
    AppMethodBeat.o(111226);
  }

  private static String NU(String paramString)
  {
    AppMethodBeat.i(111209);
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      InputStream localInputStream = ah.getContext().getAssets().open("game_region_default.txt");
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      byte[] arrayOfByte = new byte[localInputStream.available()];
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      localInputStream.read(arrayOfByte);
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      String str3 = new java/lang/String;
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      str3.<init>(arrayOfByte);
      localObject2 = str3;
      if (localInputStream != null);
      try
      {
        localInputStream.close();
        localObject2 = str3;
        localObject1 = localObject2.trim().split("\\|");
        if (localObject1.length < 3)
        {
          ab.e("MicroMsg.GameCenterLogic", "this region default title has problem %s", new Object[] { localObject2 });
          paramString = "";
          AppMethodBeat.o(111209);
          return paramString;
        }
      }
      catch (IOException localIOException1)
      {
        while (true)
        {
          ab.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bo.l(localIOException1) });
          localObject3 = str3;
        }
      }
    }
    catch (IOException localIOException4)
    {
      while (true)
      {
        Object localObject3;
        localObject1 = localObject3;
        ab.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bo.l(localIOException4) });
        if (localObject3 == null)
          break;
        try
        {
          ((InputStream)localObject3).close();
          localObject3 = "";
        }
        catch (IOException localIOException2)
        {
          ab.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bo.l(localIOException2) });
          String str1 = "";
        }
      }
    }
    finally
    {
      while (true)
      {
        if (localObject1 != null);
        try
        {
          ((InputStream)localObject1).close();
          AppMethodBeat.o(111209);
          throw paramString;
        }
        catch (IOException localIOException3)
        {
          while (true)
            ab.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bo.l(localIOException3) });
        }
        if ("zh_CN".equalsIgnoreCase(paramString))
        {
          paramString = localObject1[0];
          AppMethodBeat.o(111209);
        }
        else if (("zh_TW".equalsIgnoreCase(paramString)) || ("zh_HK".equalsIgnoreCase(paramString)))
        {
          paramString = localObject1[1];
          AppMethodBeat.o(111209);
        }
        else
        {
          paramString = localObject1[2];
          AppMethodBeat.o(111209);
          continue;
          String str2 = "";
        }
      }
    }
  }

  public static String a(GameRegionPreference.a parama)
  {
    AppMethodBeat.i(111205);
    StringBuffer localStringBuffer = new StringBuffer();
    String str;
    if (parama != null)
    {
      str = bo.nullAsNil(aa.dor());
      if (!"zh_CN".equalsIgnoreCase(str))
        break label54;
      localStringBuffer.append(parama.nlQ);
    }
    while (true)
    {
      parama = localStringBuffer.toString();
      AppMethodBeat.o(111205);
      return parama;
      label54: if (("zh_TW".equalsIgnoreCase(str)) || ("zh_HK".equalsIgnoreCase(str)))
        localStringBuffer.append(parama.nlR);
      else
        localStringBuffer.append(parama.nlS);
    }
  }

  private static void a(Context paramContext, f paramf, String paramString1, String paramString2, aj paramaj)
  {
    AppMethodBeat.i(111202);
    if ((paramf == null) || (bo.isNullOrNil(paramf.field_appId)))
    {
      ab.e("MicroMsg.GameCenterLogic", "appinfo is null or appid is null");
      if (paramaj != null)
        paramaj.dR(false);
      AppMethodBeat.o(111202);
    }
    while (true)
    {
      return;
      if (!p.b(paramContext, paramf))
      {
        ab.e("MicroMsg.GameCenterLogic", "The app %s signature is incorrect.", new Object[] { paramf.field_appName });
        Toast.makeText(paramContext, paramContext.getString(2131300276, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(paramContext, paramf, null) }), 1).show();
        if (paramaj != null)
          paramaj.dR(false);
        AppMethodBeat.o(111202);
      }
      else
      {
        WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXAppExtendObject());
        localWXMediaMessage.sdkVer = 620954368;
        localWXMediaMessage.messageAction = paramString1;
        localWXMediaMessage.messageExt = paramString2;
        ab.d("MicroMsg.GameCenterLogic", "launch game app from wx: appid: [%s], appname:[%s], openid:[%s]", new Object[] { paramf.field_appId, paramf.field_appName, paramf.field_openId });
        if (bo.isNullOrNil(paramf.field_openId))
        {
          ab.i("MicroMsg.GameCenterLogic", "open id is null or nil, try to get from server:[%s]", new Object[] { paramf.field_appName });
          com.tencent.mm.plugin.s.a.bYL().wy(paramf.field_appId);
        }
        com.tencent.mm.ce.a.post(new e.2(paramContext, paramf, localWXMediaMessage, paramaj));
        AppMethodBeat.o(111202);
      }
    }
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, aj paramaj)
  {
    AppMethodBeat.i(111201);
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.GameCenterLogic", "null or nil appid");
      if (paramaj != null)
        paramaj.dR(false);
    }
    a(paramContext, com.tencent.mm.pluginsdk.model.app.g.bT(paramString1, true), paramString2, paramString3, paramaj);
    AppMethodBeat.o(111201);
  }

  public static void a(Context paramContext, Set<String> paramSet)
  {
    AppMethodBeat.i(111221);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putStringSet("show_download_gift_tips", paramSet).commit();
    AppMethodBeat.o(111221);
  }

  public static void ak(Context paramContext, String paramString)
  {
    AppMethodBeat.i(111200);
    a(paramContext, paramString, null, "WX_GameCenter", new e.1(paramString));
    AppMethodBeat.o(111200);
  }

  public static void ar(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(111215);
    String str1 = String.valueOf(System.currentTimeMillis() / 1000L);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("game_center_pref", 0);
    Object localObject = localSharedPreferences.getString("download_app_id_time_map", "");
    if (bo.isNullOrNil((String)localObject))
    {
      paramContext = paramString + "-" + str1;
      localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).commit();
      AppMethodBeat.o(111215);
    }
    while (true)
    {
      return;
      if (((String)localObject).contains(paramString))
      {
        paramContext = new String();
        String[] arrayOfString = ((String)localObject).split(",");
        if (i < arrayOfString.length)
        {
          String str2 = arrayOfString[i];
          localObject = str2;
          if (str2.contains(paramString))
            localObject = paramString + "-" + str1;
          if (i == arrayOfString.length - 1);
          for (paramContext = paramContext + (String)localObject; ; paramContext = paramContext + (String)localObject + ",")
          {
            i++;
            break;
          }
        }
        localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).apply();
        AppMethodBeat.o(111215);
      }
      else
      {
        paramContext = (String)localObject + "," + paramString + "-" + str1;
        localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).apply();
        AppMethodBeat.o(111215);
      }
    }
  }

  public static void as(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(111216);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("game_center_pref", 0);
    paramContext = localSharedPreferences.getString("download_app_id_time_map", "");
    if (bo.isNullOrNil(paramContext))
      AppMethodBeat.o(111216);
    while (true)
    {
      return;
      if (paramContext.contains(paramString))
      {
        Object localObject = new String();
        String[] arrayOfString = paramContext.split(",");
        if (i < arrayOfString.length)
        {
          String str = arrayOfString[i];
          paramContext = (Context)localObject;
          if (!str.contains(paramString))
            if (i != arrayOfString.length - 1)
              break label132;
          label132: for (paramContext = (String)localObject + str; ; paramContext = (String)localObject + str + ",")
          {
            i++;
            localObject = paramContext;
            break;
          }
        }
        localSharedPreferences.edit().putString("download_app_id_time_map", (String)localObject).apply();
      }
      AppMethodBeat.o(111216);
    }
  }

  public static void at(Context paramContext, String paramString)
  {
    AppMethodBeat.i(111230);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putString("game_region_code", paramString).commit();
    AppMethodBeat.o(111230);
  }

  public static LinkedList<f> bDQ()
  {
    AppMethodBeat.i(111198);
    ab.d("MicroMsg.GameCenterLogic", "getShowInGameCenterGames");
    LinkedList localLinkedList1 = new LinkedList();
    localLinkedList1.addAll(((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().mVi);
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator = localLinkedList1.iterator();
    label158: 
    while (localIterator.hasNext())
    {
      f localf = (f)localIterator.next();
      if (localf != null)
      {
        ab.i("MicroMsg.GameCenterLogic", "appinfo:[%s], appinfo flag:[%d]", new Object[] { localf.field_appId, Integer.valueOf(localf.field_appInfoFlag) });
        if ((localf.field_appInfoFlag & 0x4) <= 0);
      }
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label158;
        ab.i("MicroMsg.GameCenterLogic", "app should not show in gamecenter:[%s]", new Object[] { localf.field_appName });
        localLinkedList2.add(localf);
        break;
      }
    }
    if (localLinkedList2.size() > 0)
      localLinkedList1.removeAll(localLinkedList2);
    AppMethodBeat.o(111198);
    return localLinkedList1;
  }

  public static LinkedList<String> bDR()
  {
    AppMethodBeat.i(111199);
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(((com.tencent.mm.plugin.game.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.b.class)).bCV().mVh);
    AppMethodBeat.o(111199);
    return localLinkedList;
  }

  public static String bDS()
  {
    AppMethodBeat.i(111203);
    String str1 = bo.gQ(ah.getContext());
    String str2 = str1;
    if (bo.isNullOrNil(str1))
      str2 = "CN";
    str2 = str2.toUpperCase();
    AppMethodBeat.o(111203);
    return str2;
  }

  public static String bDT()
  {
    AppMethodBeat.i(111206);
    Object localObject = bDS();
    GameRegionPreference.a locala = (GameRegionPreference.a)a.a.bFE().bFD().get(localObject);
    localObject = new StringBuffer();
    if (locala != null)
    {
      ((StringBuffer)localObject).append(locala.nlQ);
      ((StringBuffer)localObject).append(NU("zh_CN"));
    }
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(111206);
    return localObject;
  }

  public static String bDU()
  {
    AppMethodBeat.i(111207);
    Object localObject = bDS();
    localObject = (GameRegionPreference.a)a.a.bFE().bFD().get(localObject);
    StringBuffer localStringBuffer = new StringBuffer();
    if (localObject != null)
    {
      localStringBuffer.append(((GameRegionPreference.a)localObject).nlR);
      localStringBuffer.append(NU("zh_TW"));
    }
    localObject = localStringBuffer.toString();
    AppMethodBeat.o(111207);
    return localObject;
  }

  public static String bDV()
  {
    AppMethodBeat.i(111208);
    Object localObject = bDS();
    localObject = (GameRegionPreference.a)a.a.bFE().bFD().get(localObject);
    StringBuffer localStringBuffer = new StringBuffer();
    if (localObject != null)
    {
      localStringBuffer.append(((GameRegionPreference.a)localObject).nlS);
      localStringBuffer.append(NU("en"));
    }
    localObject = localStringBuffer.toString();
    AppMethodBeat.o(111208);
    return localObject;
  }

  public static void bDW()
  {
    AppMethodBeat.i(111211);
    String str = aa.dor();
    ah.getContext().getSharedPreferences("game_center_pref", 0).edit().putString("game_center_pref_lang", str).commit();
    AppMethodBeat.o(111211);
  }

  public static String bDX()
  {
    AppMethodBeat.i(111212);
    String str = ah.getContext().getSharedPreferences("game_center_pref", 0).getString("game_center_pref_lang", aa.dor());
    AppMethodBeat.o(111212);
    return str;
  }

  public static boolean bDY()
  {
    AppMethodBeat.i(111213);
    long l = ((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xIZ, Long.valueOf(0L))).longValue();
    boolean bool;
    if (System.currentTimeMillis() - l > 86400000L)
    {
      bool = true;
      AppMethodBeat.o(111213);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(111213);
    }
  }

  public static void bDZ()
  {
    AppMethodBeat.i(111214);
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xIZ, Long.valueOf(System.currentTimeMillis()));
    AppMethodBeat.o(111214);
  }

  public static String bEa()
  {
    AppMethodBeat.i(111227);
    Object localObject = com.tencent.mm.plugin.game.commlib.a.bDf();
    if (localObject != null)
    {
      localObject = ((ac)localObject).mZj;
      AppMethodBeat.o(111227);
    }
    while (true)
    {
      return localObject;
      localObject = "";
      AppMethodBeat.o(111227);
    }
  }

  public static int bEb()
  {
    AppMethodBeat.i(111228);
    ac localac = com.tencent.mm.plugin.game.commlib.a.bDf();
    int i;
    if (localac != null)
    {
      i = localac.naz;
      AppMethodBeat.o(111228);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(111228);
    }
  }

  public static void bEc()
  {
    AppMethodBeat.i(111233);
    ah.getContext().getSharedPreferences("game_center_pref", 0).edit().putLong("game_index_last_visit_time", System.currentTimeMillis()).commit();
    AppMethodBeat.o(111233);
  }

  public static long bEd()
  {
    AppMethodBeat.i(111234);
    long l = ah.getContext().getSharedPreferences("game_center_pref", 0).getLong("game_index_last_visit_time", 0L);
    AppMethodBeat.o(111234);
    return l;
  }

  public static String bEe()
  {
    return mVK;
  }

  public static ShapeDrawable dI(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111222);
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2 }, null, null));
    localShapeDrawable.getPaint().setColor(paramInt1);
    AppMethodBeat.o(111222);
    return localShapeDrawable;
  }

  public static void dV(Context paramContext)
  {
    AppMethodBeat.i(111210);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putString("notified_game_for_yyb_download_key", "").commit();
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putInt("total_notify_times_for_yyb_download_key", 0).commit();
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("delete_message_by_time_key", false).commit();
    AppMethodBeat.o(111210);
  }

  public static GameRegionPreference.a dX(Context paramContext)
  {
    AppMethodBeat.i(111204);
    String str = ef(paramContext);
    paramContext = str;
    if (bo.isNullOrNil(str))
      paramContext = bDS();
    paramContext = (GameRegionPreference.a)a.a.bFE().bFD().get(paramContext);
    AppMethodBeat.o(111204);
    return paramContext;
  }

  public static void dY(Context paramContext)
  {
    AppMethodBeat.i(111217);
    long l = System.currentTimeMillis() / 1000L;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("game_center_pref", 0);
    Object localObject1 = localSharedPreferences.getString("download_app_id_time_map", "");
    if (bo.isNullOrNil((String)localObject1))
      AppMethodBeat.o(111217);
    while (true)
    {
      return;
      String[] arrayOfString1 = ((String)localObject1).split(",");
      localObject1 = new String();
      int i = arrayOfString1.length;
      int j = 0;
      if (j < i)
      {
        Object localObject2 = arrayOfString1[j];
        String[] arrayOfString2 = ((String)localObject2).split("-");
        String str = arrayOfString2[0];
        Object localObject3 = localObject1;
        if (!bo.isNullOrNil(str))
        {
          localObject3 = localObject1;
          if (!com.tencent.mm.pluginsdk.model.app.g.u(paramContext, str))
          {
            if (l - bo.getLong(arrayOfString2[1], 0L) >= 86400L)
              break label187;
            localObject3 = (String)localObject1 + (String)localObject2 + ",";
          }
        }
        while (true)
        {
          j++;
          localObject1 = localObject3;
          break;
          label187: localObject2 = d.bij().Ir(str);
          ab.i("MicroMsg.GameCenterLogic", "checkGameDownloadTime, status = %d, id = %d", new Object[] { Integer.valueOf(((FileDownloadTaskInfo)localObject2).status), Long.valueOf(((FileDownloadTaskInfo)localObject2).id) });
          if (((FileDownloadTaskInfo)localObject2).status == 2)
          {
            d.bij().hl(((FileDownloadTaskInfo)localObject2).id);
            localObject3 = localObject1;
          }
          else if (((FileDownloadTaskInfo)localObject2).status != 0)
          {
            localObject3 = localObject1;
            if (((FileDownloadTaskInfo)localObject2).status != 4);
          }
          else
          {
            localObject3 = localObject1;
            if (com.tencent.mm.vfs.e.ct(((FileDownloadTaskInfo)localObject2).path))
            {
              com.tencent.mm.vfs.e.deleteFile(((FileDownloadTaskInfo)localObject2).path);
              localObject3 = localObject1;
            }
          }
        }
      }
      if (bo.isNullOrNil((String)localObject1))
      {
        AppMethodBeat.o(111217);
      }
      else
      {
        paramContext = (Context)localObject1;
        if (((String)localObject1).charAt(((String)localObject1).length() - 1) == ',')
          paramContext = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
        localSharedPreferences.edit().putString("download_app_id_time_map", paramContext.toString()).apply();
        AppMethodBeat.o(111217);
      }
    }
  }

  public static boolean dZ(Context paramContext)
  {
    AppMethodBeat.i(111218);
    boolean bool = paramContext.getSharedPreferences("game_center_pref", 0).getBoolean("show_open_download_authority_tips", false);
    AppMethodBeat.o(111218);
    return bool;
  }

  public static void ea(Context paramContext)
  {
    AppMethodBeat.i(111219);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_open_download_authority_tips", true).commit();
    AppMethodBeat.o(111219);
  }

  public static Set<String> eb(Context paramContext)
  {
    AppMethodBeat.i(111220);
    paramContext = paramContext.getSharedPreferences("game_center_pref", 0).getStringSet("show_download_gift_tips", new HashSet());
    AppMethodBeat.o(111220);
    return paramContext;
  }

  public static boolean ec(Context paramContext)
  {
    AppMethodBeat.i(111223);
    boolean bool = paramContext.getSharedPreferences("game_center_pref", 0).getBoolean("show_message_tips", true);
    AppMethodBeat.o(111223);
    return bool;
  }

  public static void ed(Context paramContext)
  {
    AppMethodBeat.i(111224);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_message_tips", false).apply();
    AppMethodBeat.o(111224);
  }

  public static int ee(Context paramContext)
  {
    AppMethodBeat.i(111225);
    int i = paramContext.getSharedPreferences("game_center_pref", 0).getInt("game_top_banner_id", 0);
    AppMethodBeat.o(111225);
    return i;
  }

  public static String ef(Context paramContext)
  {
    AppMethodBeat.i(111229);
    paramContext = paramContext.getSharedPreferences("game_center_pref", 0).getString("game_region_code", "");
    AppMethodBeat.o(111229);
    return paramContext;
  }

  public static boolean eg(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(111231);
    if (paramContext.getSharedPreferences("game_center_pref", 0).getInt("game_region_confirm_mark", 0) == 1)
      AppMethodBeat.o(111231);
    while (true)
    {
      return bool;
      AppMethodBeat.o(111231);
      bool = true;
    }
  }

  public static void eh(Context paramContext)
  {
    AppMethodBeat.i(111232);
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putInt("game_region_confirm_mark", 1).commit();
    AppMethodBeat.o(111232);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.e
 * JD-Core Version:    0.6.2
 */