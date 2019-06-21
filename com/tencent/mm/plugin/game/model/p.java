package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.LinkedList;
import java.util.Map;

public final class p
{
  public static String I(Map<String, String> paramMap)
  {
    AppMethodBeat.i(111301);
    paramMap = bo.bc((String)paramMap.get(".sysmsg.gamecenter.formatcontent"), "");
    AppMethodBeat.o(111301);
    return paramMap;
  }

  public static long J(Map<String, String> paramMap)
  {
    AppMethodBeat.i(111309);
    long l = bo.getLong((String)paramMap.get(".sysmsg.game_control_info.control_flag"), 0L);
    AppMethodBeat.o(111309);
    return l;
  }

  public static void a(n paramn)
  {
    AppMethodBeat.i(111300);
    if (bo.isNullOrNil(paramn.field_rawXML))
    {
      ab.e("MicroMsg.GameMessageParser", "msg content is null");
      AppMethodBeat.o(111300);
    }
    while (true)
    {
      return;
      Map localMap = br.z(paramn.field_rawXML, "sysmsg");
      if ((localMap == null) || (localMap.size() == 0))
      {
        ab.e("MicroMsg.GameMessageParser", "Parse failed");
        AppMethodBeat.o(111300);
      }
      else if (!"gamecenter".equalsIgnoreCase((String)localMap.get(".sysmsg.$type")))
      {
        ab.e("MicroMsg.GameMessageParser", "Type not matched");
        AppMethodBeat.o(111300);
      }
      else
      {
        a(localMap, paramn);
        b(localMap, paramn);
        e(localMap, paramn);
        f(localMap, paramn);
        g(localMap, paramn);
        h(localMap, paramn);
        i(localMap, paramn);
        k(localMap, paramn);
        d(localMap, paramn);
        n(localMap, paramn);
        c(localMap, paramn);
        AppMethodBeat.o(111300);
      }
    }
  }

  private static void a(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111302);
    paramn.mWC = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.wifi_flag"), 0);
    AppMethodBeat.o(111302);
  }

  private static void b(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111303);
    paramn.kYQ = I(paramMap);
    paramn.mWh = bo.bc((String)paramMap.get(".sysmsg.gamecenter.url"), "");
    paramn.mWv = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_picture_url"), "");
    paramn.mWi = bo.bc((String)paramMap.get(".sysmsg.gamecenter.message_bubble_info.message_bubble_url"), "");
    if (bo.isNullOrNil(paramn.mWi))
      paramn.mWi = bo.bc((String)paramMap.get(".sysmsg.gamecenter.url"), "");
    paramn.mXa = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.notify_type"), 0);
    AppMethodBeat.o(111303);
  }

  private static void c(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111304);
    switch (paramn.field_msgType)
    {
    case 3:
    case 7:
    case 8:
    case 9:
    default:
      ab.e("MicroMsg.GameMessageParser", "error gamecenter type: " + paramn.field_msgType);
      AppMethodBeat.o(111304);
    case 10:
    case 11:
    case 2:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      return;
      AppMethodBeat.o(111304);
      continue;
      j(paramMap, paramn);
      ab.i("MicroMsg.GameMessageParser", "Received a ShareMsg: %s", new Object[] { paramn.field_appId });
      AppMethodBeat.o(111304);
      continue;
      AppMethodBeat.o(111304);
      continue;
      l(paramMap, paramn);
      AppMethodBeat.o(111304);
      continue;
      m(paramMap, paramn);
      AppMethodBeat.o(111304);
    }
  }

  private static void d(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111305);
    paramn.mWw = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.message_bubble_info.message_bubble_action"), 0);
    paramn.mWt.mXj = bo.bc((String)paramMap.get(".sysmsg.gamecenter.message_bubble_info.message_bubble_icon_url"), "");
    paramn.mWt.eeO = bo.bc((String)paramMap.get(".sysmsg.gamecenter.message_bubble_info.message_bubble_desc"), "");
    AppMethodBeat.o(111305);
  }

  private static void e(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111306);
    paramn.mAppName = bo.bc((String)paramMap.get(".sysmsg.gamecenter.appinfo.appname2"), "");
    if (bo.isNullOrNil(paramn.mAppName))
      paramn.mAppName = bo.bc((String)paramMap.get(".sysmsg.gamecenter.appinfo.appname"), "");
    if (paramn.field_msgType == 6)
    {
      paramn.mWn = bo.bc((String)paramMap.get(".sysmsg.gamecenter.appinfo.groupname"), "");
      paramn.mWo = bo.bc((String)paramMap.get(".sysmsg.gamecenter.appinfo.groupurl"), "");
    }
    while (true)
    {
      paramn.mWj = bo.bc((String)paramMap.get(".sysmsg.gamecenter.appinfo.iconurl"), "");
      paramn.mWk = bo.bc((String)paramMap.get(".sysmsg.gamecenter.appinfo.android_downloadurl"), "");
      paramn.mWl = bo.bc((String)paramMap.get(".sysmsg.gamecenter.appinfo.android_apk_md5"), "");
      paramn.mWm = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.appinfo.android_apk_size"), 0);
      AppMethodBeat.o(111306);
      return;
      paramn.mWn = paramn.mAppName;
    }
  }

  private static void f(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111307);
    paramn.mWp.clear();
    int i = 0;
    if (i == 0);
    for (String str = ".sysmsg.gamecenter.userinfo"; ; str = ".sysmsg.gamecenter.userinfo" + i)
    {
      if (!paramMap.containsKey(str))
        break label277;
      n.i locali = new n.i();
      locali.userName = bo.bc((String)paramMap.get(str + ".username"), "");
      locali.bCu = bo.bc((String)paramMap.get(str + ".nickname"), "");
      locali.mXu = bo.bc((String)paramMap.get(str + ".usericon"), "");
      locali.mXw = bo.bc((String)paramMap.get(str + ".badge_icon"), "");
      locali.mXx = bo.bc((String)paramMap.get(str + ".$jump_id"), "");
      paramn.mWp.add(locali);
      i++;
      break;
    }
    label277: AppMethodBeat.o(111307);
  }

  private static void g(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111308);
    paramn.mXc = bo.bc((String)paramMap.get(".sysmsg.gamecenter.noticeid"), "");
    AppMethodBeat.o(111308);
  }

  private static void h(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111310);
    paramn.mWD = J(paramMap);
    AppMethodBeat.o(111310);
  }

  private static void i(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111311);
    paramn.mWr.mXl = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.badge_display_type"), 0);
    paramn.mWr.mXj = bo.bc((String)paramMap.get(".sysmsg.gamecenter.showiconurl"), "");
    paramn.mWr.mText = bo.bc((String)paramMap.get(".sysmsg.gamecenter.entrancetext"), "");
    AppMethodBeat.o(111311);
  }

  private static void j(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111312);
    paramn.mWx = bo.getInt((String)paramMap.get(".sysmsg.gameshare.share_message_info.share_msg_type"), 1);
    paramn.mWy = bo.getInt((String)paramMap.get(".sysmsg.game_control_info.display_name_type"), 1);
    paramn.mWz = bo.bc((String)paramMap.get(".sysmsg.gameshare.share_message_info.share_msg_title"), "");
    paramn.mWA = bo.bc((String)paramMap.get(".sysmsg.gameshare.share_message_info.share_msg_content"), "");
    paramn.mWB = bo.bc((String)paramMap.get(".sysmsg.gameshare.share_message_info.media_url"), "");
    paramn.mWv = bo.bc((String)paramMap.get(".sysmsg.gameshare.share_message_info.thumb_url"), "");
    AppMethodBeat.o(111312);
  }

  public static void k(Map<String, String> paramMap, n paramn)
  {
    boolean bool1 = true;
    AppMethodBeat.i(111313);
    paramn.mWG.url = bo.bc((String)paramMap.get(".sysmsg.gamecenter.floatlayer.open_url"), "");
    n.a locala = paramn.mWG;
    if (bo.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.full_screen"), 0) == 1)
    {
      bool2 = true;
      locala.mTC = bool2;
      paramn.mWG.orientation = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.orientation"), 0);
      paramn = paramn.mWG;
      if (bo.getInt((String)paramMap.get(".sysmsg.gamecenter.floatlayer.is_transparent"), 0) != 1)
        break label136;
    }
    label136: for (boolean bool2 = bool1; ; bool2 = false)
    {
      paramn.mXg = bool2;
      AppMethodBeat.o(111313);
      return;
      bool2 = false;
      break;
    }
  }

  private static void l(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111314);
    paramn.mWL = bo.bc((String)paramMap.get(".sysmsg.gamepraise.praise_message_info.praise_content"), "");
    paramn.mWM = bo.bc((String)paramMap.get(".sysmsg.gamepraise.praise_message_info.praise_jumpurl"), "");
    paramn.mWN = bo.bc((String)paramMap.get(".sysmsg.gamepraise.praise_message_info.praise_iconurl"), "");
    AppMethodBeat.o(111314);
  }

  private static void m(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111315);
    paramn.mWH = bo.bc((String)paramMap.get(".sysmsg.gamecenter.topic.reply_content"), "");
    paramn.mWI = bo.bc((String)paramMap.get(".sysmsg.gamecenter.topic.replied_content"), "");
    paramn.mWK = bo.bc((String)paramMap.get(".sysmsg.gamecenter.topic.topic_title"), "");
    paramn.mWJ = bo.bc((String)paramMap.get(".sysmsg.gamecenter.topic.topic_url"), "");
    AppMethodBeat.o(111315);
  }

  private static void n(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111316);
    paramn.mXd = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.message_card.message_card_jump_type"), 0);
    paramn.mXe = bo.bc((String)paramMap.get(".sysmsg.gamecenter.message_card.message_card_jump_url"), "");
    AppMethodBeat.o(111316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.p
 * JD-Core Version:    0.6.2
 */