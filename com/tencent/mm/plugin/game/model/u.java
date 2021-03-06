package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class u
{
  public static u mXG;

  public static void a(n paramn)
  {
    AppMethodBeat.i(111339);
    if (bo.isNullOrNil(paramn.field_rawXML))
    {
      ab.e("MicroMsg.GameNewMessageParser", "msg content is null");
      AppMethodBeat.o(111339);
    }
    while (true)
    {
      return;
      Map localMap = br.z(paramn.field_rawXML, "sysmsg");
      if ((localMap == null) || (localMap.size() == 0))
      {
        ab.e("MicroMsg.GameNewMessageParser", "Parse failed");
        AppMethodBeat.o(111339);
      }
      else if (!"gamecenter".equalsIgnoreCase((String)localMap.get(".sysmsg.$type")))
      {
        ab.e("MicroMsg.GameNewMessageParser", "Type not matched");
        AppMethodBeat.o(111339);
      }
      else
      {
        b(localMap, paramn);
        o(localMap, paramn);
        q(localMap, paramn);
        d(localMap, paramn);
        s(localMap, paramn);
        i(localMap, paramn);
        t(localMap, paramn);
        a(localMap, paramn);
        u(localMap, paramn);
        AppMethodBeat.o(111339);
      }
    }
  }

  private static void a(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111351);
    paramn.mWC = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.wifi_flag"), 0);
    AppMethodBeat.o(111351);
  }

  private static void b(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111340);
    paramn.mWO = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.$jump_id"), "");
    paramn.mWP = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.user_action_title"), "");
    paramn.mWQ = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.first_line_content"), "");
    paramn.mWU.mXp = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.second_line.second_line_content"), "");
    paramn.mWU.mXj = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.second_line.second_line_icon_url"), "");
    paramn.mWU.mXk = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.second_line.$jump_id"), "");
    paramn.mWR = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.content_pic"), "");
    paramn.mWS = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.content_pic.$jump_id"), "");
    p(paramMap, paramn);
    f(paramMap, paramn);
    r(paramMap, paramn);
    AppMethodBeat.o(111340);
  }

  public static u bEx()
  {
    AppMethodBeat.i(111338);
    if (mXG == null)
      mXG = new u();
    u localu = mXG;
    AppMethodBeat.o(111338);
    return localu;
  }

  private static void d(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111345);
    paramn.mWt.mXj = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url"), "");
    paramn.mWt.eeO = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc"), "");
    paramn.mWt.mXk = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_bubble_info.$jump_id"), "");
    AppMethodBeat.o(111345);
  }

  private static void f(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111343);
    paramn.mWp.clear();
    int i = 0;
    if (i == 0);
    for (String str = ".sysmsg.gamecenter.msg_center.userinfo"; ; str = ".sysmsg.gamecenter.msg_center.userinfo" + i)
    {
      if (!paramMap.containsKey(str))
        break label269;
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
    label269: AppMethodBeat.o(111343);
  }

  private static void i(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111349);
    paramn.mWr.mXl = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0);
    paramn.mWr.mXj = bo.bc((String)paramMap.get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
    paramn.mWr.mText = bo.bc((String)paramMap.get(".sysmsg.gamecenter.entrance.entrance_text"), "");
    paramn.mWr.mXm = (bo.getInt((String)paramMap.get(".sysmsg.gamecenter.entrance.entrance_icon_width"), 64) / 2);
    paramn.mWr.mXn = (bo.getInt((String)paramMap.get(".sysmsg.gamecenter.entrance.entrance_icon_height"), 64) / 2);
    AppMethodBeat.o(111349);
  }

  private static List<String> o(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(111348);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i == 0);
    for (String str = paramString; ; str = paramString + i)
    {
      if (!paramMap.containsKey(str))
        break label120;
      int j = i + 1;
      str = (String)paramMap.get(str + ".$pkg_id");
      i = j;
      if (bo.isNullOrNil(str))
        break;
      localArrayList.add(str);
      i = j;
      break;
    }
    label120: AppMethodBeat.o(111348);
    return localArrayList;
  }

  private static void o(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111341);
    paramn.mWu.clear();
    int i = 0;
    if (i == 0);
    for (String str1 = ".sysmsg.gamecenter.jump_info.jump"; ; str1 = ".sysmsg.gamecenter.jump_info.jump" + i)
    {
      if (!paramMap.containsKey(str1))
        break label200;
      String str2 = (String)paramMap.get(str1 + ".$id");
      n.e locale = new n.e();
      locale.mXo = bo.getInt((String)paramMap.get(str1 + ".jump_type"), 0);
      locale.lAF = bo.bc((String)paramMap.get(str1 + ".jump_url"), "");
      if (!bo.isNullOrNil(str2))
        paramn.mWu.put(str2, locale);
      i++;
      break;
    }
    label200: AppMethodBeat.o(111341);
  }

  private static void p(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111342);
    if (paramMap.get(".sysmsg.gamecenter.msg_center.msg_sender") != null)
    {
      paramn.mWT = new n.g();
      paramn.mWT.mXq = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.msg_sender.sender_name"), "");
      paramn.mWT.mXr = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.msg_sender.sender_icon"), "");
      paramn.mWT.mXs = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.msg_sender.badge_icon"), "");
      paramn.mWT.mXk = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.msg_sender.$jump_id"), "");
    }
    AppMethodBeat.o(111342);
  }

  public static void q(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111344);
    paramn.mXb = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.report.msg_subtype"), 0);
    paramn.mXc = bo.bc((String)paramMap.get(".sysmsg.gamecenter.report.noticeid"), "");
    AppMethodBeat.o(111344);
  }

  private static void r(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111346);
    paramn.mWV.mName = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.source_info.source_name"), "");
    n.h localh = paramn.mWV;
    if (bo.getInt((String)paramMap.get(".sysmsg.gamecenter.msg_center.source_info.source_clickable"), 0) > 0);
    for (boolean bool = true; ; bool = false)
    {
      localh.mXt = bool;
      paramn.mWV.mXk = bo.bc((String)paramMap.get(".sysmsg.gamecenter.msg_center.source_info.$jump_id"), "");
      AppMethodBeat.o(111346);
      return;
    }
  }

  public static void s(Map<String, String> paramMap, n paramn)
  {
    boolean bool1 = true;
    AppMethodBeat.i(111347);
    paramn.mWG.url = bo.bc((String)paramMap.get(".sysmsg.gamecenter.float_layer.open_url"), "");
    n.a locala = paramn.mWG;
    if (bo.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.full_screen"), 0) == 1)
    {
      bool2 = true;
      locala.mTC = bool2;
      paramn.mWG.orientation = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.orientation"), 0);
      locala = paramn.mWG;
      if (bo.getInt((String)paramMap.get(".sysmsg.gamecenter.float_layer.is_transparent"), 0) != 1)
        break label168;
    }
    label168: for (boolean bool2 = bool1; ; bool2 = false)
    {
      locala.mXg = bool2;
      paramn.mWG.mXh.clear();
      paramn.mWG.mXh.addAll(o(".sysmsg.gamecenter.float_layer.load_with_wepkg.wepkg", paramMap));
      AppMethodBeat.o(111347);
      return;
      bool2 = false;
      break;
    }
  }

  private static void t(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111350);
    paramn.mWW.mXy = bo.bc((String)paramMap.get(".sysmsg.gamecenter.display_with_wepkg.$pkg_id"), "");
    paramn.mWW.kgX = bo.getInt((String)paramMap.get(".sysmsg.gamecenter.display_with_wepkg"), 0);
    paramn.mWW.mXz = bo.getLong((String)paramMap.get(".sysmsg.gamecenter.display_with_wepkg.$always_display_after_time"), 0L);
    AppMethodBeat.o(111350);
  }

  public static void u(Map<String, String> paramMap, n paramn)
  {
    AppMethodBeat.i(111352);
    paramn.mWX.mXi = bo.bc((String)paramMap.get(".sysmsg.gamecenter.banner.$banner_id"), "");
    paramn.mWX.mXh.clear();
    paramn.mWX.mXh.addAll(o(".sysmsg.gamecenter.banner.load_with_wepkg.wepkg", paramMap));
    AppMethodBeat.o(111352);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.u
 * JD-Core Version:    0.6.2
 */