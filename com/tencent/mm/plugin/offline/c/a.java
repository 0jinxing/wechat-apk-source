package com.tencent.mm.plugin.offline.c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.bk;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelpay.JumpToOfflinePay.Resp;
import com.tencent.mm.plugin.offline.a.s.f;
import com.tencent.mm.plugin.offline.a.s.h;
import com.tencent.mm.plugin.offline.j;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.Promotions;
import com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders.ShowInfo;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static String kaE;
  private static String paY;
  public static String paZ;
  public static int pba;
  public static String pbb;
  public static String pbc;
  public static String pbd;
  public static int pbe;
  public static int pbf;
  public static long pbg;
  public static boolean pbh;
  public static String pbi;
  public static String pbj;
  private static Comparator<Bankcard> pbk;
  private static Comparator<a.a> pbl;

  static
  {
    AppMethodBeat.i(43721);
    paY = "";
    paZ = "";
    pba = 1;
    pbb = "";
    pbc = "";
    pbd = "";
    pbe = 1;
    pbf = 0;
    pbg = 0L;
    pbh = false;
    kaE = "";
    pbi = "";
    pbj = "";
    pbk = new a.5();
    pbl = new a.6();
    AppMethodBeat.o(43721);
  }

  public static void AB(int paramInt)
  {
    AppMethodBeat.i(43662);
    k.bXg();
    k.aT(196640, String.valueOf(paramInt));
    AppMethodBeat.o(43662);
  }

  public static void AC(int paramInt)
  {
    AppMethodBeat.i(43663);
    k.bXg();
    k.aT(196642, String.valueOf(paramInt));
    AppMethodBeat.o(43663);
  }

  public static void AD(int paramInt)
  {
    AppMethodBeat.i(43686);
    k.bXg();
    k.aT(196644, String.valueOf(paramInt));
    AppMethodBeat.o(43686);
  }

  public static void AE(int paramInt)
  {
    AppMethodBeat.i(43714);
    int i = paramInt;
    if (paramInt < 0)
      i = 0;
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSF, Integer.valueOf(i));
    AppMethodBeat.o(43714);
  }

  public static Orders T(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43673);
    Orders localOrders = new Orders();
    Orders.Commodity localCommodity = new Orders.Commodity();
    localCommodity.pbX = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_uin"));
    localCommodity.pbY = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_name"));
    localCommodity.pbZ = ((String)paramMap.get(".sysmsg.paymsg.user_roll.sale_uin"));
    localCommodity.pca = ((String)paramMap.get(".sysmsg.paymsg.user_roll.sale_name"));
    localCommodity.cAa = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trans_id"));
    localCommodity.desc = ((String)paramMap.get(".sysmsg.paymsg.user_roll.goods_name"));
    localCommodity.kCJ = (bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.pay_num"), -1) / 100.0D);
    localCommodity.pce = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state"));
    localCommodity.pcf = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state_name"));
    localCommodity.pcj = ((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_bank_name"));
    localCommodity.pcq = ((String)paramMap.get(".sysmsg.paymsg.user_roll.discount"));
    localCommodity.pch = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.modify_timestamp"), 0);
    localCommodity.pcl = ((String)paramMap.get(".sysmsg.paymsg.user_roll.fee_type"));
    localCommodity.pcm = ((String)paramMap.get(".sysmsg.paymsg.user_roll.appusername"));
    localCommodity.pbP = ((String)paramMap.get(".sysmsg.paymsg.user_roll.app_telephone"));
    localCommodity.tAR = (bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.buy_bank_name"), -1) / 100.0D);
    Object localObject1 = new Orders.Promotions();
    ((Orders.Promotions)localObject1).name = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.nickname"));
    ((Orders.Promotions)localObject1).pcm = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.username"));
    ((Orders.Promotions)localObject1).type = Orders.tAP;
    localCommodity.tAS = ((Orders.Promotions)localObject1).pcm;
    ((Orders.Promotions)localObject1).pia = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.logo_round_url"));
    ((Orders.Promotions)localObject1).url = ((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.subscribe_biz_url"));
    int i = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.subscribe_biz_info.recommend_level"), 1);
    localCommodity.tAh = i;
    localCommodity.tAV = ((String)paramMap.get(".sysmsg.paymsg.user_roll.rateinfo"));
    localCommodity.tAW = ((String)paramMap.get(".sysmsg.paymsg.user_roll.discount_rateinfo"));
    localCommodity.tAX = ((String)paramMap.get(".sysmsg.paymsg.user_roll.original_feeinfo"));
    if (!bo.isNullOrNil(((Orders.Promotions)localObject1).name))
    {
      localCommodity.tBb = true;
      localCommodity.tBa.add(localObject1);
    }
    int j = 0;
    Orders.Promotions localPromotions;
    String str1;
    String str2;
    String str3;
    String str4;
    Object localObject2;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str10;
    String str11;
    String str12;
    String str13;
    String str14;
    String str15;
    String str16;
    if (j < 255)
    {
      localPromotions = new Orders.Promotions();
      if (j == 0)
      {
        str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.icon");
        str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.wording");
        str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.url");
        str4 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.btn_text");
        localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.type");
        str5 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.title");
        str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_type");
        str7 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_id");
        str8 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.send_record_id");
        str9 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.award_id");
        str10 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.user_record_id");
        str11 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.small_title");
        str12 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_username");
        str13 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_path");
        str14 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_mch_id");
        str15 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.activity_tinyapp_version");
        localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.get_award_params");
        str16 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record.query_award_status_params");
        label742: if (!bo.isNullOrNil(str2))
          break label2085;
        ab.i("MicroMsg.WalletOfflineUtil", "hy: activity end. total size: %d", new Object[] { Integer.valueOf(j + 1) });
      }
    }
    else
    {
      str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.link_ativity_info.text");
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.link_ativity_info.url");
      localCommodity.tBc.text = str6;
      localCommodity.tBc.url = ((String)localObject1);
      str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_name");
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_logo");
      str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_desc");
      localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_username");
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_path");
      if ((!bo.isNullOrNil(str2)) && (!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil(str6)) && (!bo.isNullOrNil((String)localObject2)))
      {
        localCommodity.tAY = new Orders.RecommendTinyAppInfo();
        localCommodity.tAY.ttf = str2;
        localCommodity.tAY.tzU = ((String)localObject1);
        localCommodity.tAY.tzV = str6;
        localCommodity.tAY.tzW = ((String)localObject2);
        localCommodity.tAY.ttg = str1;
        localCommodity.tAY.tzX = ((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_tinyapp_btn_text"));
        localCommodity.tAY.tBx = bo.getLong((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_id"), 0L);
        localCommodity.tAY.tBy = bo.getLong((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_type"), 0L);
        localCommodity.tAY.tBA = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.send_record_id"), 0);
        localCommodity.tAY.tBB = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.user_record_id"), 0);
        localCommodity.tAY.tBC = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.activity_mch_id"), 0);
        localCommodity.tAY.tBz = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.award_id"), 0);
        localCommodity.tAY.tzY = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.tinyapp_info.tinyapp_version"), 0);
      }
      localOrders.tAq = new ArrayList();
      localOrders.tAq.add(localCommodity);
      localOrders.tAA = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.is_use_new_paid_succ_page"), 0);
      localOrders.tAB = ((String)paramMap.get(".sysmsg.paymsg.user_roll.pay_succ_btn_wording"));
      localOrders.tAj = ((String)paramMap.get(".sysmsg.paymsg.user_roll.trade_state_name"));
      localOrders.tAh = i;
      localOrders.czZ = ((String)paramMap.get(".sysmsg.req_key"));
      a(localOrders, paramMap);
      localCommodity.tAR = (bo.getDouble((String)paramMap.get(".sysmsg.paymsg.user_roll.original_total_fee"), -1.0D) / 100.0D);
      if (TextUtils.isEmpty((String)paramMap.get(".sysmsg.paymsg.user_roll.discount_array.record.favor_desc")))
        break label2341;
      j = 0;
      label1301: if (j != 0)
        break label2285;
    }
    label2085: label2285: for (localObject1 = ""; ; localObject1 = String.valueOf(j))
    {
      str6 = ".sysmsg.paymsg.user_roll.discount_array.record" + (String)localObject1 + ".favor_desc";
      localObject1 = ".sysmsg.paymsg.user_roll.discount_array.record" + (String)localObject1 + ".payment_amount";
      if ((TextUtils.isEmpty((CharSequence)paramMap.get(str6))) || (TextUtils.isEmpty((CharSequence)paramMap.get(localObject1))))
        break label2294;
      localObject2 = new Orders.DiscountInfo();
      ((Orders.DiscountInfo)localObject2).pOz = ((String)paramMap.get(str6));
      ((Orders.DiscountInfo)localObject2).tBm = bo.getDouble((String)paramMap.get(localObject1), 0.0D);
      localCommodity.tAU.add(localObject2);
      j++;
      break label1301;
      str1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".icon");
      str2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".wording");
      str3 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".url");
      str4 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".btn_text");
      localObject2 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".type");
      str5 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".title");
      str6 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".activity_type");
      str7 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".activity_id");
      str8 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".send_record_id");
      str9 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".award_id");
      str10 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".user_record_id");
      str11 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".small_title");
      str12 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".activity_tinyapp_username");
      str13 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".activity_tinyapp_path");
      str14 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".activity_mch_id");
      str15 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".activity_tinyapp_version");
      localObject1 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".get_award_params");
      str16 = (String)paramMap.get(".sysmsg.paymsg.user_roll.activity_info.record" + j + ".query_award_status_params");
      break label742;
      localPromotions.pia = str1;
      localPromotions.name = str2;
      localPromotions.url = str3;
      localPromotions.tzS = str4;
      localPromotions.type = Orders.tAQ;
      localPromotions.tBn = bo.getInt((String)localObject2, 0);
      localPromotions.title = str5;
      localPromotions.tBo = bo.getInt(str6, 0);
      localPromotions.ttW = bo.getLong(str7, 0L);
      localPromotions.tzP = bo.getInt(str8, 0);
      localPromotions.tBp = bo.getInt(str9, 0);
      localPromotions.tzQ = bo.getInt(str10, 0);
      localPromotions.tBq = str11;
      localPromotions.tBr = str12;
      localPromotions.tBs = str13;
      localPromotions.tzR = bo.getLong(str14, 0L);
      localPromotions.tBt = bo.getInt(str15, 0);
      localPromotions.tBu = ((String)localObject1);
      localPromotions.tBv = str16;
      localObject1 = c(paramMap, j);
      if (localObject1 != null)
        localPromotions.tBw = ((d.a.a.c)localObject1);
      localCommodity.tBa.add(localPromotions);
      j++;
      break;
    }
    label2294: ab.e("MicroMsg.WalletOfflineUtil", "favor_desc_key is " + str6 + ", payment_amount_key is " + (String)localObject1 + ", break");
    while (true)
    {
      AppMethodBeat.o(43673);
      return localOrders;
      label2341: ab.e("MicroMsg.WalletOfflineUtil", ".sysmsg.paymsg.user_roll.discount_array.record.favor_desc value is empty");
    }
  }

  public static void U(Activity paramActivity)
  {
    AppMethodBeat.i(43681);
    a(paramActivity, "freeze", paramActivity.getString(2131305450), 0, -1);
    AppMethodBeat.o(43681);
  }

  public static void Ud(String paramString)
  {
    AppMethodBeat.i(43666);
    k.bXg();
    k.aT(196631, paramString);
    AppMethodBeat.o(43666);
  }

  public static void Ue(String paramString)
  {
    AppMethodBeat.i(43670);
    r.cPI();
    ak.acF(paramString);
    AppMethodBeat.o(43670);
  }

  public static void Uf(String paramString)
  {
    AppMethodBeat.i(43692);
    k.bXg();
    k.aT(196656, paramString);
    pbb = paramString;
    AppMethodBeat.o(43692);
  }

  public static LinkedList<a.a> Ug(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(43694);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(43694);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        paramString = t(localJSONArray);
        AppMethodBeat.o(43694);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.WalletOfflineUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(43694);
        paramString = localObject;
      }
    }
  }

  public static void Uh(String paramString)
  {
    AppMethodBeat.i(43698);
    k.bXg();
    k.aT(196616, paramString);
    AppMethodBeat.o(43698);
  }

  public static void Ui(String paramString)
  {
    AppMethodBeat.i(43702);
    k.bXg();
    k.aT(196615, paramString);
    pbd = paramString;
    AppMethodBeat.o(43702);
  }

  private static LinkedList<a.b> Uj(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(43703);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(43703);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(paramString);
        paramString = u(localJSONArray);
        AppMethodBeat.o(43703);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.WalletOfflineUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(43703);
        paramString = localObject;
      }
    }
  }

  public static String Uk(String paramString)
  {
    AppMethodBeat.i(43707);
    LinkedList localLinkedList = Uj(bYx());
    if (localLinkedList == null)
    {
      paramString = "";
      AppMethodBeat.o(43707);
      return paramString;
    }
    int i = 0;
    label30: a.b localb;
    if (i < localLinkedList.size())
    {
      localb = (a.b)localLinkedList.get(i);
      if ((localb == null) || (!paramString.equals(localb.pbn)));
    }
    for (paramString = localb.kKZ; ; paramString = "")
    {
      AppMethodBeat.o(43707);
      break;
      i++;
      break label30;
    }
  }

  public static String Ul(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(43708);
    LinkedList localLinkedList1 = Ug(bYs());
    LinkedList localLinkedList2 = Uj(bYx());
    if ((localLinkedList1 == null) || (localLinkedList2 == null) || (localLinkedList1.size() == 0) || (localLinkedList2.size() == 0))
    {
      ab.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() cardList == null || cardLogoList == null || cardList.size() == 0 || cardLogoList.size() == 0");
      paramString = "";
      AppMethodBeat.o(43708);
      return paramString;
    }
    int j = 0;
    label67: Object localObject;
    if (j < localLinkedList1.size())
    {
      localObject = (a.a)localLinkedList1.get(j);
      if ((localObject == null) || (!paramString.equals(((a.a)localObject).pbo)));
    }
    for (paramString = ((a.a)localObject).pbn; ; paramString = "")
    {
      if (TextUtils.isEmpty(paramString))
      {
        ab.e("MicroMsg.WalletOfflineUtil", "getBankLogoUrl() bank_type == null, can not find this bank_type");
        paramString = "";
        AppMethodBeat.o(43708);
        break;
        j++;
        break label67;
      }
      j = i;
      label147: if (j < localLinkedList2.size())
      {
        localObject = (a.b)localLinkedList2.get(j);
        if ((localObject == null) || (!paramString.equals(((a.b)localObject).pbn)));
      }
      for (paramString = ((a.b)localObject).kKZ; ; paramString = "")
      {
        AppMethodBeat.o(43708);
        break;
        j++;
        break label147;
      }
    }
  }

  public static void Um(String paramString)
  {
    AppMethodBeat.i(43710);
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xRS, paramString);
    AppMethodBeat.o(43710);
  }

  public static void Un(String paramString)
  {
    AppMethodBeat.i(43712);
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSE, paramString);
    AppMethodBeat.o(43712);
  }

  public static void Uo(String paramString)
  {
    AppMethodBeat.i(43716);
    com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xSG, paramString);
    AppMethodBeat.o(43716);
  }

  public static void Up(String paramString)
  {
    AppMethodBeat.i(43720);
    ab.i("MicroMsg.WalletOfflineUtil", "launch 3rd app: %s", new Object[] { paramString });
    com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, true);
    if (localf == null)
    {
      ab.w("MicroMsg.WalletOfflineUtil", "can not find app info");
      AppMethodBeat.o(43720);
    }
    while (true)
    {
      return;
      paramString = new Bundle();
      Object localObject = new JumpToOfflinePay.Resp();
      ((JumpToOfflinePay.Resp)localObject).errCode = 0;
      ((JumpToOfflinePay.Resp)localObject).toBundle(paramString);
      localObject = new MMessageActV2.Args();
      ((MMessageActV2.Args)localObject).targetPkgName = localf.field_packageName;
      ((MMessageActV2.Args)localObject).bundle = paramString;
      com.tencent.mm.pluginsdk.model.app.p.at(paramString);
      com.tencent.mm.pluginsdk.model.app.p.au(paramString);
      MMessageActV2.send(ah.getContext(), (MMessageActV2.Args)localObject);
      AppMethodBeat.o(43720);
    }
  }

  public static void V(Activity paramActivity)
  {
    AppMethodBeat.i(43682);
    g(paramActivity, -1);
    AppMethodBeat.o(43682);
  }

  public static void W(Activity paramActivity)
  {
    AppMethodBeat.i(43699);
    com.tencent.mm.ui.base.h.bQ(paramActivity, paramActivity.getResources().getString(2131305448));
    if (!TextUtils.isEmpty(bYv()))
      aL(paramActivity, bYv());
    AppMethodBeat.o(43699);
  }

  public static void a(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43678);
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.cIg = 5;
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_pay_info", localPayInfo);
    localBundle.putBoolean("key_need_bind_response", true);
    localBundle.putInt("key_bind_scene", 5);
    localBundle.putInt("key_offline_add_fee", paramInt1);
    if (paramInt2 >= 0)
      localBundle.putInt("key_entry_scene", paramInt2);
    if (!r.cPI().cQg())
      if (r.cPI().cQi())
      {
        localBundle.putBoolean("key_is_bind_bankcard", true);
        com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.d.class, localBundle);
        AppMethodBeat.o(43678);
      }
    while (true)
    {
      return;
      if (r.cPI().cQh())
      {
        localBundle.putBoolean("key_is_bind_bankcard", true);
        com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.d.class, localBundle);
        AppMethodBeat.o(43678);
      }
      else
      {
        com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.c.class, localBundle);
        AppMethodBeat.o(43678);
      }
    }
  }

  public static void a(Activity paramActivity, s.f paramf)
  {
    AppMethodBeat.i(43672);
    ab.i("MicroMsg.WalletOfflineUtil", "hy: whole pay msg coming. direct parse");
    if ((paramf == null) || (paramf.oZa == null))
    {
      ab.e("MicroMsg.WalletOfflineUtil", "order == null");
      AppMethodBeat.o(43672);
    }
    while (true)
    {
      return;
      if (!bYe())
      {
        AppMethodBeat.o(43672);
      }
      else
      {
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("key_orders", paramf.oZa);
        localBundle.putInt("key_pay_type", 2);
        if (paramf.cRz != null)
        {
          RealnameGuideHelper localRealnameGuideHelper = new RealnameGuideHelper();
          localRealnameGuideHelper.a(paramf.cRz.cRb, paramf.cRz.cRc, paramf.cRz.cRd, paramf.cRz.cRe, paramf.cRz.cRf, 8);
          localBundle.putParcelable("key_realname_guide_helper", localRealnameGuideHelper);
        }
        if ((paramActivity instanceof WalletOfflineCoinPurseUI))
        {
          paramf = paramActivity.getIntent();
          localBundle.putString("key_appid", paramf.getStringExtra("key_appid"));
          localBundle.putInt("key_from_scene", paramf.getIntExtra("key_from_scene", 0));
        }
        com.tencent.mm.wallet_core.a.a(paramActivity, j.class, localBundle);
        AppMethodBeat.o(43672);
      }
    }
  }

  public static void a(Activity paramActivity, String paramString, m paramm)
  {
    AppMethodBeat.i(43676);
    ab.i("MicroMsg.WalletOfflineUtil", "hy: only transid coming. do old way");
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.WalletOfflineUtil", "transid == null");
      AppMethodBeat.o(43676);
    }
    while (true)
    {
      return;
      if (!bYe())
      {
        AppMethodBeat.o(43676);
      }
      else
      {
        Bundle localBundle = new Bundle();
        if ((paramm instanceof com.tencent.mm.plugin.offline.a.e))
        {
          paramm = ((com.tencent.mm.plugin.offline.a.e)paramm).oYc;
          if (paramm != null)
            localBundle.putParcelable("key_realname_guide_helper", paramm);
        }
        localBundle.putString("key_trans_id", paramString);
        localBundle.putInt("key_pay_type", 2);
        if ((paramActivity instanceof WalletOfflineCoinPurseUI))
        {
          paramString = paramActivity.getIntent();
          localBundle.putString("key_appid", paramString.getStringExtra("key_appid"));
          localBundle.putInt("key_from_scene", paramString.getIntExtra("key_from_scene", 0));
        }
        com.tencent.mm.wallet_core.a.a(paramActivity, j.class, localBundle);
        AppMethodBeat.o(43676);
      }
    }
  }

  private static void a(Activity paramActivity, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(43680);
    Bundle localBundle = new Bundle();
    localBundle.putString("oper", paramString1);
    localBundle.putInt("offline_chg_fee", paramInt1);
    localBundle.putString("pwd_tips", paramString2);
    if (paramInt2 >= 0)
      localBundle.putInt("offline_from_scene", paramInt2);
    com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.offline.h.class, localBundle);
    AppMethodBeat.o(43680);
  }

  private static void a(Orders paramOrders, Map<String, String> paramMap)
  {
    AppMethodBeat.i(43675);
    if (paramMap != null)
    {
      paramOrders.tAC = bo.getInt((String)paramMap.get(".sysmsg.paymsg.user_roll.is_use_show_info"), 0);
      paramOrders.tAE = new ArrayList();
      int i = 0;
      if (i < 255)
      {
        if (i == 0);
        for (String str = ".sysmsg.paymsg.user_roll.show_info.record" + "."; ; str = ".sysmsg.paymsg.user_roll.show_info.record" + i + ".")
        {
          Orders.ShowInfo localShowInfo = new Orders.ShowInfo();
          localShowInfo.name = ((String)paramMap.get(str + "name"));
          localShowInfo.value = ((String)paramMap.get(str + "value"));
          localShowInfo.mVA = ((String)paramMap.get(str + "name_color"));
          localShowInfo.tBF = ((String)paramMap.get(str + "value_color"));
          str = str + "value_attr.";
          localShowInfo.tBG = bo.getInt((String)paramMap.get(str + "link_type"), 0);
          localShowInfo.tBH = ((String)paramMap.get(str + "link_weapp"));
          localShowInfo.tBI = ((String)paramMap.get(str + "link_addr"));
          localShowInfo.tBJ = ((String)paramMap.get(str + "link_url"));
          localShowInfo.tBK = bo.getInt((String)paramMap.get(str + "text_attr"), 0);
          if ((!bo.isNullOrNil(localShowInfo.name)) || (!bo.isNullOrNil(localShowInfo.value)))
            paramOrders.tAE.add(localShowInfo);
          i++;
          break;
        }
      }
    }
    AppMethodBeat.o(43675);
  }

  private static void aL(Context paramContext, String paramString)
  {
    AppMethodBeat.i(43668);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(43668);
  }

  public static String bYA()
  {
    AppMethodBeat.i(43711);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xRS, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      AppMethodBeat.o(43711);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(43711);
    }
  }

  public static String bYB()
  {
    AppMethodBeat.i(43713);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSE, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      AppMethodBeat.o(43713);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(43713);
    }
  }

  public static int bYC()
  {
    AppMethodBeat.i(43715);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSF, null);
    if (localObject != null);
    for (int i = ((Integer)localObject).intValue(); ; i = 0)
    {
      int j = i;
      if (i < 0)
        j = 0;
      AppMethodBeat.o(43715);
      return j;
    }
  }

  public static String bYD()
  {
    AppMethodBeat.i(43717);
    Object localObject = com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xSG, "");
    if (localObject != null)
    {
      localObject = (String)localObject;
      AppMethodBeat.o(43717);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(43717);
    }
  }

  public static boolean bYE()
  {
    AppMethodBeat.i(43719);
    boolean bool1 = false;
    Object localObject = com.tencent.mm.model.c.c.abi().ll("100232");
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      if ((((Map)localObject).containsKey("open")) && ("1".equals(((Map)localObject).get("open"))))
        ab.e("MicroMsg.WalletOfflineUtil", "deprecated abtest 100232 enabled.");
    }
    localObject = com.tencent.mm.model.c.c.abi().ll("100261");
    boolean bool2 = bool1;
    if (((com.tencent.mm.storage.c)localObject).isValid())
    {
      localObject = ((com.tencent.mm.storage.c)localObject).dru();
      bool2 = bool1;
      if (((Map)localObject).containsKey("open"))
      {
        bool2 = bool1;
        if ("1".equals(((Map)localObject).get("open")))
          bool2 = true;
      }
    }
    ab.i("MicroMsg.WalletOfflineUtil", "isPosEnabled: ".concat(String.valueOf(bool2)));
    AppMethodBeat.o(43719);
    return bool2;
  }

  public static boolean bYd()
  {
    AppMethodBeat.i(43652);
    k.bXg();
    String str = k.Ax(196630);
    boolean bool;
    if ((str != null) && (str.equals("1")))
    {
      bool = true;
      AppMethodBeat.o(43652);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43652);
    }
  }

  public static boolean bYe()
  {
    AppMethodBeat.i(43653);
    k.bXg();
    String str = k.Ax(196641);
    boolean bool;
    if ((str != null) && (str.equals("1")))
    {
      bool = true;
      AppMethodBeat.o(43653);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(43653);
    }
  }

  @Deprecated
  public static Bankcard bYf()
  {
    AppMethodBeat.i(43654);
    r.cPI();
    com.tencent.mm.kernel.g.RQ();
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(196633, null);
    ab.i("MicroMsg.WalletPayOrderMgr", "step 1 getSelectedBindBankCard %s", new Object[] { str });
    ArrayList localArrayList = r.cPI().nf(true);
    int i = 0;
    Bankcard localBankcard;
    if ((!TextUtils.isEmpty(str)) && (i < localArrayList.size()))
    {
      localBankcard = (Bankcard)localArrayList.get(i);
      if ((localBankcard != null) && (str.equals(localBankcard.field_bindSerial)))
      {
        ab.i("MicroMsg.WalletPayOrderMgr", "step 2 micropay: %s, forbidword: %s", new Object[] { Boolean.valueOf(localBankcard.field_support_micropay), localBankcard.field_forbidWord });
        if (localBankcard.field_support_micropay)
          AppMethodBeat.o(43654);
      }
    }
    while (true)
    {
      return localBankcard;
      i++;
      break;
      ab.i("MicroMsg.WalletPayOrderMgr", "step 3 clear default bindserial");
      r.cPI();
      ak.acF("");
      r.cPI();
      localBankcard = ak.cQR();
      if ((localBankcard != null) && (bo.isNullOrNil(localBankcard.field_forbidWord)))
      {
        ab.i("MicroMsg.WalletPayOrderMgr", "do change main card: %s", new Object[] { localBankcard.field_bankcardType });
        AppMethodBeat.o(43654);
      }
      else
      {
        for (i = 0; ; i++)
        {
          if (i >= localArrayList.size())
            break label297;
          localBankcard = (Bankcard)localArrayList.get(i);
          if ((localBankcard != null) && (localBankcard.field_support_micropay) && (!localBankcard.cPc()))
          {
            ab.i("MicroMsg.WalletPayOrderMgr", "do change first card: %s", new Object[] { localBankcard.field_bankcardType });
            AppMethodBeat.o(43654);
            break;
          }
        }
        label297: localBankcard = r.cPI().thy;
        if ((localBankcard != null) && (localBankcard.field_support_micropay))
        {
          ab.i("MicroMsg.WalletPayOrderMgr", "do change balance: %s", new Object[] { localBankcard.field_bankcardType });
          AppMethodBeat.o(43654);
        }
        else
        {
          localBankcard = r.cPI().tCZ;
          if ((localBankcard != null) && (localBankcard.field_support_micropay) && (bo.isNullOrNil(localBankcard.field_forbidWord)))
          {
            ab.i("MicroMsg.WalletPayOrderMgr", "do change balance: %s", new Object[] { localBankcard.field_bankcardType });
            AppMethodBeat.o(43654);
          }
          else
          {
            AppMethodBeat.o(43654);
            localBankcard = null;
          }
        }
      }
    }
  }

  public static Bankcard bYg()
  {
    AppMethodBeat.i(43655);
    Bankcard localBankcard = bYf();
    if ((localBankcard != null) && (localBankcard.field_support_micropay) && (bo.isNullOrNil(localBankcard.field_forbidWord)))
      AppMethodBeat.o(43655);
    while (true)
    {
      return localBankcard;
      ArrayList localArrayList = r.cPI().nf(true);
      for (int i = 0; ; i++)
      {
        if (i >= localArrayList.size())
          break label96;
        localBankcard = (Bankcard)localArrayList.get(i);
        if ((localBankcard != null) && (localBankcard.field_support_micropay))
        {
          AppMethodBeat.o(43655);
          break;
        }
      }
      label96: localBankcard = null;
      AppMethodBeat.o(43655);
    }
  }

  public static Bankcard bYh()
  {
    AppMethodBeat.i(43656);
    r.cPI();
    Bankcard localBankcard = ak.cQR();
    AppMethodBeat.o(43656);
    return localBankcard;
  }

  public static int bYi()
  {
    AppMethodBeat.i(43657);
    int i = r.cPI().nf(true).size();
    AppMethodBeat.o(43657);
    return i;
  }

  public static List<Bankcard> bYj()
  {
    AppMethodBeat.i(43659);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = r.cPI().cQE();
    for (int i = 0; i < localArrayList2.size(); i++)
      localArrayList1.add((Bankcard)localArrayList2.get(i));
    ab.i("MicroMsg.WalletOfflineUtil", "getOfflineBindBankCardList() list size is " + localArrayList1.size());
    AppMethodBeat.o(43659);
    return localArrayList1;
  }

  public static int bYk()
  {
    AppMethodBeat.i(43660);
    k.bXg();
    String str = k.Ax(196629);
    int i;
    if ((TextUtils.isEmpty(str)) || (!isNumeric(str)))
    {
      i = 0;
      AppMethodBeat.o(43660);
    }
    while (true)
    {
      return i;
      i = Integer.valueOf(str).intValue();
      AppMethodBeat.o(43660);
    }
  }

  private static int bYl()
  {
    AppMethodBeat.i(43661);
    k.bXg();
    String str = k.Ax(196640);
    int i;
    if ((TextUtils.isEmpty(str)) || (!isNumeric(str)))
    {
      i = 0;
      if (i <= 0)
        break label60;
      i *= 100;
    }
    while (true)
    {
      AppMethodBeat.o(43661);
      return i;
      i = Integer.valueOf(str).intValue();
      break;
      label60: i = 20000;
    }
  }

  public static String bYm()
  {
    AppMethodBeat.i(43664);
    k.bXg();
    String str = k.Ax(196632);
    AppMethodBeat.o(43664);
    return str;
  }

  public static String bYn()
  {
    AppMethodBeat.i(43665);
    k.bXg();
    String str = k.Ax(196631);
    AppMethodBeat.o(43665);
    return str;
  }

  public static void bYo()
  {
    AppMethodBeat.i(43671);
    ab.i("MicroMsg.WalletOfflineUtil", "clear offline data");
    k.bXg();
    k.aT(196630, "0");
    k.bXg();
    k.aT(196626, "");
    k.bXg();
    k.aT(196627, "");
    k.bXg();
    k.aT(196628, "");
    k.bXg();
    k.aT(196617, "");
    k.bXg();
    k.aT(196632, "");
    k.bXg();
    k.aT(196641, "");
    k.bXg();
    k.aT(196647, "");
    k.bXg();
    k.aT(196649, "");
    r("", "", "", "");
    k.bXg();
    k.aT(196629, "0");
    Ud("");
    k.bXg();
    k.bXh().oYL = null;
    k.bXg();
    k.bXj();
    k.bXg();
    String str = k.Ax(196617);
    com.tencent.mm.wallet_core.c.b.dNJ();
    com.tencent.mm.wallet_core.c.b.clearToken(str);
    Ui("");
    Uf("");
    AppMethodBeat.o(43671);
  }

  public static void bYp()
  {
    AppMethodBeat.i(43685);
    k.bXg();
    k.aT(196643, "1");
    AppMethodBeat.o(43685);
  }

  public static int bYq()
  {
    AppMethodBeat.i(43687);
    k.bXg();
    String str = k.Ax(196644);
    int i;
    if ((TextUtils.isEmpty(str)) || (!isNumeric(str)))
    {
      i = 0;
      AppMethodBeat.o(43687);
    }
    while (true)
    {
      return i;
      i = Integer.valueOf(str).intValue();
      AppMethodBeat.o(43687);
    }
  }

  public static String bYr()
  {
    AppMethodBeat.i(43690);
    String str;
    if (!TextUtils.isEmpty(paZ))
    {
      str = paZ;
      AppMethodBeat.o(43690);
    }
    while (true)
    {
      return str;
      bYt();
      if (TextUtils.isEmpty(paZ))
        ab.e("MicroMsg.WalletOfflineUtil", "offline_token_v2 is null");
      str = paZ;
      AppMethodBeat.o(43690);
    }
  }

  public static String bYs()
  {
    AppMethodBeat.i(43691);
    String str;
    if (!TextUtils.isEmpty(pbb))
    {
      str = pbb;
      AppMethodBeat.o(43691);
    }
    while (true)
    {
      return str;
      if (TextUtils.isEmpty(pbb))
      {
        k.bXg();
        str = k.Ax(196656);
        pbb = str;
        AppMethodBeat.o(43691);
      }
      else
      {
        if (TextUtils.isEmpty(pbb))
          ab.e("MicroMsg.WalletOfflineUtil", "offline_card_list is null");
        str = pbb;
        AppMethodBeat.o(43691);
      }
    }
  }

  private static void bYt()
  {
    AppMethodBeat.i(43693);
    com.tencent.mm.kernel.g.RO().eJo.a(new bk(new a.4()), 0);
    AppMethodBeat.o(43693);
  }

  public static String bYu()
  {
    AppMethodBeat.i(43696);
    k.bXg();
    String str = k.Ax(196647);
    AppMethodBeat.o(43696);
    return str;
  }

  private static String bYv()
  {
    AppMethodBeat.i(43697);
    k.bXg();
    String str = k.Ax(196616);
    AppMethodBeat.o(43697);
    return str;
  }

  public static boolean bYw()
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(43700);
    ArrayList localArrayList = r.cPI().nf(true);
    Object localObject = Ug(bYs());
    if ((localObject == null) || (localArrayList.size() != ((LinkedList)localObject).size()))
      AppMethodBeat.o(43700);
    while (true)
    {
      return bool;
      Collections.sort((List)localObject, pbl);
      Collections.sort(localArrayList, pbk);
      StringBuilder localStringBuilder = new StringBuilder();
      for (int j = 0; j < ((LinkedList)localObject).size(); j++)
        localStringBuilder.append(((a.a)((LinkedList)localObject).get(j)).pbo);
      localObject = new StringBuilder();
      for (j = i; j < localArrayList.size(); j++)
        ((StringBuilder)localObject).append(((Bankcard)localArrayList.get(j)).field_bindSerial);
      bool = ag.ck(localStringBuilder.toString()).equals(ag.ck(((StringBuilder)localObject).toString()));
      AppMethodBeat.o(43700);
    }
  }

  private static String bYx()
  {
    AppMethodBeat.i(43701);
    String str;
    if (TextUtils.isEmpty(pbd))
    {
      k.bXg();
      str = k.Ax(196615);
      pbd = str;
      AppMethodBeat.o(43701);
    }
    while (true)
    {
      return str;
      str = pbd;
      AppMethodBeat.o(43701);
    }
  }

  public static int bYy()
  {
    AppMethodBeat.i(43705);
    k.bXg();
    String str = k.Ax(196649);
    int i;
    if ((TextUtils.isEmpty(str)) || (!isNumeric(str)))
    {
      i = 0;
      AppMethodBeat.o(43705);
    }
    while (true)
    {
      return i;
      i = Integer.valueOf(str).intValue();
      AppMethodBeat.o(43705);
    }
  }

  public static boolean bYz()
  {
    boolean bool = false;
    AppMethodBeat.i(43706);
    String str = bYm();
    if (TextUtils.isEmpty(str))
      AppMethodBeat.o(43706);
    while (true)
    {
      return bool;
      long l1 = bYy();
      long l2 = Long.valueOf(str).longValue();
      if (System.currentTimeMillis() / 1000L - l2 >= l1)
      {
        bool = true;
        AppMethodBeat.o(43706);
      }
      else
      {
        AppMethodBeat.o(43706);
      }
    }
  }

  private static d.a.a.c c(Map<String, String> paramMap, int paramInt)
  {
    AppMethodBeat.i(43674);
    d.a.a.c localc;
    if (paramInt == 0)
    {
      str = ".sysmsg.paymsg.user_roll.activity_info.record.exposure_info.";
      if (paramMap == null)
        break label2403;
      localc = new d.a.a.c();
      localc.BTA = bo.getInt((String)paramMap.get(str + "is_query_others"), 0);
      localc.wdr = ((String)paramMap.get(str + "draw_lottery_params"));
      localc.wex = bo.getInt((String)paramMap.get(str + "is_show_btn"), 0);
      localObject1 = new d.a.a.a();
      localObject2 = str + "btn_info.";
      ((d.a.a.a)localObject1).BTs = ((String)paramMap.get((String)localObject2 + "btn_words"));
      ((d.a.a.a)localObject1).BTt = ((String)paramMap.get((String)localObject2 + "btn_color"));
      ((d.a.a.a)localObject1).BTu = bo.getInt((String)paramMap.get((String)localObject2 + "btn_op_type"), 0);
      ((d.a.a.a)localObject1).url = ((String)paramMap.get((String)localObject2 + "url"));
      ((d.a.a.a)localObject1).wqf = ((String)paramMap.get((String)localObject2 + "get_lottery_params"));
      localObject2 = (String)localObject2 + "mini_app_info.";
      ((d.a.a.a)localObject1).BTv = new d.a.a.f();
      ((d.a.a.a)localObject1).BTv.wMk = ((String)paramMap.get((String)localObject2 + "activity_tinyapp_username"));
      ((d.a.a.a)localObject1).BTv.wMl = ((String)paramMap.get((String)localObject2 + "activity_tinyapp_path"));
      ((d.a.a.a)localObject1).BTv.wMm = bo.getInt((String)paramMap.get((String)localObject2 + "activity_tinyapp_version"), 0);
      if ((!bo.isNullOrNil(((d.a.a.a)localObject1).BTs)) || (!bo.isNullOrNil(((d.a.a.a)localObject1).url)) || (!bo.isNullOrNil(((d.a.a.a)localObject1).wqf)) || (!bo.isNullOrNil(((d.a.a.a)localObject1).BTv.wMk)) || (!bo.isNullOrNil(((d.a.a.a)localObject1).BTv.wMl)))
        localc.wey = ((d.a.a.a)localObject1);
      localc.BTB = bo.getInt((String)paramMap.get(str + "user_opertaion_type"), 0);
      localc.BTC = bo.getInt((String)paramMap.get(str + "is_show_layer"), 0);
      localc.BTE = ((String)paramMap.get(str + "background_img_whole"));
      localc.wew = new LinkedList();
      paramInt = 0;
      label683: if (paramInt >= 255)
        break label1101;
      if (paramInt != 0)
        break label1066;
    }
    label1066: for (Object localObject1 = str + "single_exposure_info_list.record."; ; localObject1 = str + "single_exposure_info_list.record" + paramInt + ".")
    {
      localObject2 = new d.a.a.g();
      ((d.a.a.g)localObject2).pia = ((String)paramMap.get((String)localObject1 + "logo"));
      ((d.a.a.g)localObject2).BTP = ((String)paramMap.get((String)localObject1 + "award_name"));
      ((d.a.a.g)localObject2).BTQ = ((String)paramMap.get((String)localObject1 + "award_description"));
      ((d.a.a.g)localObject2).BTR = ((String)paramMap.get((String)localObject1 + "background_img"));
      ((d.a.a.g)localObject2).BTS = ((String)paramMap.get((String)localObject1 + "award_name_color"));
      ((d.a.a.g)localObject2).BTT = ((String)paramMap.get((String)localObject1 + "award_description_color"));
      if ((!bo.isNullOrNil(((d.a.a.g)localObject2).pia)) || (!bo.isNullOrNil(((d.a.a.g)localObject2).BTP)) || (!bo.isNullOrNil(((d.a.a.g)localObject2).BTQ)) || (!bo.isNullOrNil(((d.a.a.g)localObject2).BTR)) || (!bo.isNullOrNil(((d.a.a.g)localObject2).BTS)) || (!bo.isNullOrNil(((d.a.a.g)localObject2).BTT)))
        localc.wew.add(localObject2);
      if ((bo.isNullOrNil(((d.a.a.g)localObject2).BTP)) || (bo.isNullOrNil(((d.a.a.g)localObject2).BTQ)))
        break label1101;
      paramInt++;
      break label683;
      str = ".sysmsg.paymsg.user_roll.activity_info.record" + paramInt + ".exposure_info.";
      break;
    }
    label1101: localc.BTD = new d.a.a.e();
    localObject1 = str + "layer_info.";
    localc.BTD.BTG = ((String)paramMap.get((String)localObject1 + "layer_title"));
    localc.BTD.BTH = ((String)paramMap.get((String)localObject1 + "layer_logo"));
    localc.BTD.BTI = ((String)paramMap.get((String)localObject1 + "layer_type"));
    localc.BTD.BTJ = ((String)paramMap.get((String)localObject1 + "layer_name"));
    localc.BTD.BTK = ((String)paramMap.get((String)localObject1 + "layer_description"));
    localc.BTD.BTL = bo.getInt((String)paramMap.get((String)localObject1 + "is_show_layer_btn"), 0);
    localc.BTD.BTM = new d.a.a.d();
    Object localObject2 = (String)localObject1 + "layer_btn_info.";
    localc.BTD.BTM.BTs = ((String)paramMap.get((String)localObject2 + "btn_words"));
    localc.BTD.BTM.BTt = ((String)paramMap.get((String)localObject2 + "btn_color"));
    localc.BTD.BTM.BTu = bo.getInt((String)paramMap.get((String)localObject2 + "btn_op_type"), 0);
    localc.BTD.BTM.wqf = ((String)paramMap.get((String)localObject2 + "get_lottery_params"));
    localc.BTD.BTM.url = ((String)paramMap.get((String)localObject2 + "url"));
    localObject2 = (String)localObject2 + "mini_app_info.";
    localc.BTD.BTM.BTv = new d.a.a.f();
    localc.BTD.BTM.BTv.wMk = ((String)paramMap.get((String)localObject2 + "activity_tinyapp_username"));
    localc.BTD.BTM.BTv.wMl = ((String)paramMap.get((String)localObject2 + "activity_tinyapp_path"));
    localc.BTD.BTM.BTv.wMm = bo.getInt((String)paramMap.get((String)localObject2 + "activity_tinyapp_version"), 0);
    if (!bo.isNullOrNil((String)paramMap.get((String)localObject1 + "voice_url")))
      localc.BTD.BTN = new com.tencent.mm.bt.b(((String)paramMap.get((String)localObject1 + "voice_url")).getBytes());
    if (!bo.isNullOrNil((String)paramMap.get((String)localObject1 + "voice_data")))
      localc.BTD.BTO = new com.tencent.mm.bt.b(((String)paramMap.get((String)localObject1 + "voice_data")).getBytes());
    localObject1 = new d.a.a.b();
    String str = str + "draw_lottery_info.";
    ((d.a.a.b)localObject1).url = ((String)paramMap.get(str + "url"));
    ((d.a.a.b)localObject1).BTw = ((String)paramMap.get(str + "animation_wording"));
    ((d.a.a.b)localObject1).BTx = ((String)paramMap.get(str + "animation_wording_color"));
    ((d.a.a.b)localObject1).xis = bo.getInt((String)paramMap.get(str + "op_type"), 0);
    ((d.a.a.b)localObject1).BTy = ((String)paramMap.get(str + "after_animation_wording"));
    ((d.a.a.b)localObject1).BTz = ((String)paramMap.get(str + "after_animation_wording_color"));
    str = str + "mini_app_info.";
    ((d.a.a.b)localObject1).BTv = new d.a.a.f();
    ((d.a.a.b)localObject1).BTv.wMk = ((String)paramMap.get(str + "activity_tinyapp_username"));
    ((d.a.a.b)localObject1).BTv.wMl = ((String)paramMap.get(str + "activity_tinyapp_path"));
    ((d.a.a.b)localObject1).BTv.wMm = bo.getInt((String)paramMap.get(str + "activity_tinyapp_version"), 0);
    if ((!bo.isNullOrNil(((d.a.a.b)localObject1).url)) || (!bo.isNullOrNil(((d.a.a.b)localObject1).BTw)) || (!bo.isNullOrNil(((d.a.a.b)localObject1).BTx)) || (!bo.isNullOrNil(((d.a.a.b)localObject1).BTv.wMk)) || (!bo.isNullOrNil(((d.a.a.b)localObject1).BTv.wMl)))
      localc.BTF = ((d.a.a.b)localObject1);
    AppMethodBeat.o(43674);
    paramMap = localc;
    while (true)
    {
      return paramMap;
      label2403: paramMap = null;
      AppMethodBeat.o(43674);
    }
  }

  public static void c(Activity paramActivity, String paramString)
  {
    AppMethodBeat.i(43684);
    com.tencent.mm.ui.base.h.a(paramActivity, false, paramString, "", paramActivity.getString(2131305467), paramActivity.getString(2131296868), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(43646);
        a.bYo();
        a.V(this.val$activity);
        this.val$activity.finish();
        AppMethodBeat.o(43646);
      }
    }
    , new a.2(paramActivity));
    AppMethodBeat.o(43684);
  }

  public static void e(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(43677);
    a(paramActivity, paramInt, -1);
    AppMethodBeat.o(43677);
  }

  public static boolean eA(Context paramContext)
  {
    AppMethodBeat.i(43709);
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1);
    boolean bool;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      ab.d("MicroMsg.WalletOfflineUtil", "topActivity:" + ((ComponentName)localObject).flattenToString());
      if (!((ComponentName)localObject).getPackageName().equals(paramContext.getPackageName()))
      {
        ab.i("MicroMsg.WalletOfflineUtil", "is in backGround.");
        AppMethodBeat.o(43709);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      if (((KeyguardManager)ah.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode())
      {
        AppMethodBeat.o(43709);
        bool = false;
      }
      else
      {
        ab.i("MicroMsg.WalletOfflineUtil", "is in foreGround.");
        AppMethodBeat.o(43709);
        bool = true;
      }
    }
  }

  public static void eH(Context paramContext)
  {
    AppMethodBeat.i(43667);
    String str = aa.dor();
    if ("zh_CN".equals(str))
      str = paramContext.getString(2131304196);
    while (true)
    {
      aL(paramContext, str);
      AppMethodBeat.o(43667);
      return;
      if ("zh_TW".equals(str))
        str = paramContext.getString(2131306058);
      else if ("zh_HK".equals(str))
        str = paramContext.getString(2131306057);
      else
        str = paramContext.getResources().getString(2131306056);
    }
  }

  public static void f(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(43679);
    a(paramActivity, "create", paramActivity.getString(2131305447), 0, paramInt);
    AppMethodBeat.o(43679);
  }

  public static void g(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(43683);
    a(paramActivity, "create", "", bYl(), paramInt);
    AppMethodBeat.o(43683);
  }

  public static int getNetworkType(Context paramContext)
  {
    AppMethodBeat.i(43718);
    int i;
    if (at.isConnected(paramContext))
      if (at.isWifi(paramContext))
        i = 1;
    while (true)
    {
      AppMethodBeat.o(43718);
      return i;
      if (at.is2G(paramContext))
      {
        i = 2;
      }
      else if (at.is3G(paramContext))
      {
        i = 3;
      }
      else if (at.is4G(paramContext))
      {
        i = 4;
      }
      else
      {
        i = 0;
        continue;
        i = -1;
      }
    }
  }

  public static String getToken()
  {
    AppMethodBeat.i(43688);
    String str;
    if (!TextUtils.isEmpty(paY))
    {
      str = paY;
      AppMethodBeat.o(43688);
    }
    while (true)
    {
      return str;
      bYt();
      if (TextUtils.isEmpty(paY))
        ab.e("MicroMsg.WalletOfflineUtil", "token is null");
      str = paY;
      AppMethodBeat.o(43688);
    }
  }

  public static boolean isNumeric(String paramString)
  {
    AppMethodBeat.i(43669);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(43669);
    }
    while (true)
    {
      return bool;
      bool = Pattern.compile("[0-9]*").matcher(paramString).matches();
      AppMethodBeat.o(43669);
    }
  }

  public static List<Bankcard> jH(boolean paramBoolean)
  {
    AppMethodBeat.i(43658);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = r.cPI().ng(true);
    int i = 0;
    if ((localArrayList2 != null) && (i < localArrayList2.size()))
    {
      Bankcard localBankcard = (Bankcard)localArrayList2.get(i);
      if (paramBoolean)
        localArrayList1.add(localBankcard);
      while (true)
      {
        i++;
        break;
        localArrayList1.add(localBankcard);
      }
    }
    ab.i("MicroMsg.WalletOfflineUtil", "getBindBankCardList() list size is " + localArrayList1.size());
    AppMethodBeat.o(43658);
    return localArrayList1;
  }

  public static void r(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(43689);
    paY = paramString1;
    paZ = paramString2;
    pbb = paramString3;
    pbc = paramString4;
    Uf(pbb);
    com.tencent.mm.kernel.g.RO().eJo.a(new bk(new a.3()), 0);
    AppMethodBeat.o(43689);
  }

  private static LinkedList<a.a> t(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(43695);
    if (paramJSONArray.length() == 0)
    {
      paramJSONArray = null;
      AppMethodBeat.o(43695);
    }
    while (true)
    {
      return paramJSONArray;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        if (localJSONObject != null)
        {
          a.a locala = new a.a();
          locala.pbm = localJSONObject.optInt("card_id");
          locala.pbn = localJSONObject.optString("bank_type");
          locala.pbo = localJSONObject.optString("bind_serial");
          locala.pbp = localJSONObject.optString("forbid_word");
          localLinkedList.add(locala);
        }
      }
      AppMethodBeat.o(43695);
      paramJSONArray = localLinkedList;
    }
  }

  private static LinkedList<a.b> u(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(43704);
    if (paramJSONArray.length() == 0)
    {
      paramJSONArray = null;
      AppMethodBeat.o(43704);
    }
    while (true)
    {
      return paramJSONArray;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        if (localJSONObject != null)
        {
          a.b localb = new a.b();
          localb.pbn = localJSONObject.optString("bank_type");
          localb.kKZ = localJSONObject.optString("icon_url");
          localLinkedList.add(localb);
        }
      }
      AppMethodBeat.o(43704);
      paramJSONArray = localLinkedList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.c.a
 * JD-Core Version:    0.6.2
 */