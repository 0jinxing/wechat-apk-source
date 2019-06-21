package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.d.j;
import com.tencent.mm.protocal.protobuf.gw;
import com.tencent.mm.protocal.protobuf.gx;
import com.tencent.mm.protocal.protobuf.gy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.wallet_core.c.w;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class af
{
  private static ArrayList<Bankcard> A(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(46937);
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int i = paramJSONArray.length();
      int j = 0;
      if (j < i)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(j);
        Bankcard localBankcard = new Bankcard();
        localBankcard.field_cardType |= Bankcard.twH;
        localBankcard.field_bankName = localJSONObject.getString("bank_name");
        localBankcard.field_bankcardType = localJSONObject.getString("bank_type");
        localBankcard.field_bankcardTypeName = localJSONObject.optString("bankacc_type_name");
        localBankcard.twO = localJSONObject.getString("card_id");
        localBankcard.field_bizUsername = localJSONObject.getString("app_username");
        localBankcard.field_wxcreditState = localJSONObject.getInt("card_status");
        if (localBankcard.field_wxcreditState != 2);
        for (localBankcard.field_bankcardState = 9; ; localBankcard.field_bankcardState = 0)
        {
          localBankcard.field_desc = ah.getContext().getString(2131305484, new Object[] { localBankcard.field_bankName, localBankcard.field_bankcardTail });
          localBankcard.txc = new e();
          localBankcard.txc.oRi = localJSONObject.getString("logo_url");
          localBankcard.txc.txp = localJSONObject.getString("background_logo_url");
          localBankcard.txc.txq = localJSONObject.getString("big_logo_url");
          localArrayList.add(localBankcard);
          j++;
          break;
        }
      }
    }
    AppMethodBeat.o(46937);
    return localArrayList;
  }

  private static Bankcard B(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(46938);
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      paramJSONArray = d.cPh().ar(paramJSONArray.getJSONObject(0));
      paramJSONArray.field_cardType |= Bankcard.twJ;
      AppMethodBeat.o(46938);
    }
    while (true)
    {
      return paramJSONArray;
      ab.e("MicroMsg.WalletQueryBankcardParser", "getHistroyBankcard() json == null or json.length() == 0");
      paramJSONArray = null;
      AppMethodBeat.o(46938);
    }
  }

  public static boolean Hr(int paramInt)
  {
    if ((paramInt == 9) || (paramInt == 10) || (paramInt == 11) || (paramInt == 12) || (paramInt == 13) || (paramInt == 14) || (paramInt == 15) || (paramInt == 16) || (paramInt == 17) || (paramInt == 18) || (paramInt == 19) || (paramInt == 20) || (paramInt == 21) || (paramInt == 22) || (paramInt == 23));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static Bankcard a(gw paramgw)
  {
    AppMethodBeat.i(46933);
    ab.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance from balance info %s", new Object[] { paramgw });
    Bankcard localBankcard = null;
    boolean bool;
    if (paramgw != null)
    {
      localBankcard = new Bankcard((byte)0);
      a(localBankcard, paramgw.vJs, paramgw.vJt, bo.getInt(paramgw.vJo, 0));
      localBankcard.twS = com.tencent.mm.wallet_core.ui.e.b(paramgw.vJo, "100", RoundingMode.HALF_UP);
      localBankcard.twT = paramgw.twT;
      localBankcard.twY = paramgw.twY;
      localBankcard.twZ = paramgw.twZ;
      localBankcard.twU = com.tencent.mm.wallet_core.ui.e.b(paramgw.vJq, "100", RoundingMode.HALF_UP);
      localBankcard.field_cardType |= Bankcard.twI;
      localBankcard.field_bankcardType = paramgw.vJk;
      localBankcard.field_bindSerial = paramgw.vJl;
      localBankcard.field_forbidWord = paramgw.vJm;
      if (bo.isNullOrNil(localBankcard.field_forbidWord))
        break label494;
      localBankcard.field_bankcardState = 8;
      localBankcard.field_mobile = paramgw.cFl;
      if (bo.getInt(paramgw.vJr, 0) != 1)
        break label502;
      bool = true;
      label186: localBankcard.field_support_micropay = bool;
      ab.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + paramgw.vJr);
      localBankcard.twV = paramgw.twV;
      Object localObject1 = ah.getContext().getString(2131304521);
      localBankcard.field_desc = ((String)localObject1);
      localBankcard.field_bankName = ((String)localObject1);
      localBankcard.field_bankcardTail = "10000";
      localBankcard.field_forbid_title = paramgw.vJv;
      localBankcard.field_forbid_url = paramgw.vJw;
      localObject1 = paramgw.vJy;
      if (localObject1 == null)
        break label519;
      paramgw = new JSONObject();
      try
      {
        paramgw.put("is_show_menu", ((gx)localObject1).vJz);
        Object localObject2 = ((gx)localObject1).vJA;
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          gy localgy = (gy)((Iterator)localObject2).next();
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("title", localgy.title);
          localJSONObject.put("jump_type", localgy.ttd);
          localJSONObject.put("jump_h5_url", localgy.tte);
          localJSONObject.put("tinyapp_username", localgy.tzW);
          localJSONObject.put("tinyapp_path", localgy.ttg);
          ((JSONArray)localObject1).put(localJSONObject);
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", localException, "Bankcard getBalance from balance, assemble menuInfoJson error: %s", new Object[] { localException.getMessage() });
      }
      label452: ab.d("MicroMsg.WalletQueryBankcardParser", "balance menu info: %s", new Object[] { paramgw.toString() });
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUa, paramgw.toString());
    }
    while (true)
    {
      AppMethodBeat.o(46933);
      return localBankcard;
      label494: localBankcard.field_bankcardState = 0;
      break;
      label502: bool = false;
      break label186;
      paramgw.put("balance_menu_item", localException);
      break label452;
      label519: com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUa, "");
    }
  }

  private static aj a(JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(46931);
    ab.i("MicroMsg.WalletQueryBankcardParser", "getUserInfo()");
    aj localaj = new aj();
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
    {
      localaj.field_is_reg = paramJSONObject.getInt("is_reg");
      localaj.field_true_name = paramJSONObject.optString("true_name");
      localaj.field_cre_type = paramJSONObject.optInt("cre_type", -1);
      localaj.field_main_card_bind_serialno = paramJSONObject.optString("last_card_bind_serialno");
      localaj.field_cre_name = paramJSONObject.optString("cre_name");
      localaj.field_ftf_pay_url = paramJSONObject.optString("transfer_url");
      localaj.field_reset_passwd_flag = paramJSONObject.optString("reset_passwd_flag");
      localaj.field_find_passwd_url = paramJSONObject.optString("reset_passwd_url");
      localaj.field_forget_passwd_url = paramJSONObject.optString("forget_passwd_url");
      r.cPI();
      ak.acD(localaj.field_main_card_bind_serialno);
      localaj.field_isDomesticUser = "2".equals(paramJSONObject.optString("icard_user_flag", "2"));
      JSONObject localJSONObject = paramJSONObject.optJSONObject("touch_info");
      if (localJSONObject != null)
      {
        localaj.field_is_open_touch = localJSONObject.optInt("is_open_touch", 0);
        localaj.field_soter_pay_open_type = localJSONObject.optInt("soter_pay_open_type", 0);
        ab.d("MicroMsg.WalletQueryBankcardParser", "getUserInfo field_is_open_touch() is %s, %s", new Object[] { Integer.valueOf(localaj.field_is_open_touch), Integer.valueOf(localaj.field_soter_pay_open_type) });
        localaj.field_lct_wording = paramJSONObject.optString("lct_wording");
        localaj.field_lct_url = paramJSONObject.optString("lct_url");
        ab.i("MicroMsg.WalletQueryBankcardParser", "field_lct_wording: " + localaj.field_lct_wording + ", field_lct_url:" + localaj.field_lct_url);
        localaj.field_lqt_state = paramJSONObject.optInt("lqt_state", -1);
        localJSONObject = paramJSONObject.optJSONObject("lqb_show_info");
        ab.i("MicroMsg.WalletQueryBankcardParser", "field_lqt_state: %s, lqb_show_info: %s", new Object[] { Integer.valueOf(localaj.field_lqt_state), localJSONObject });
        if (localJSONObject != null)
        {
          localaj.field_is_show_lqb = localJSONObject.optInt("is_show_lqb");
          localaj.field_is_open_lqb = localJSONObject.optInt("is_open_lqb");
          localaj.field_lqb_open_url = localJSONObject.optString("lqb_open_url");
        }
        paramJSONObject = paramJSONObject.optJSONObject("lqt_cell_info");
        ab.i("MicroMsg.WalletQueryBankcardParser", "lqt_cell_info: %s", new Object[] { paramJSONObject });
        if (paramJSONObject != null)
        {
          localaj.field_lqt_cell_is_show = paramJSONObject.optInt("is_show_cell");
          localaj.field_lqt_cell_icon = paramJSONObject.optString("cell_icon");
          localaj.field_lqt_cell_is_open_lqt = paramJSONObject.optInt("is_open_lqt");
          localaj.field_lqt_cell_lqt_open_url = paramJSONObject.optString("lqt_open_url");
          localaj.field_lqt_cell_lqt_title = paramJSONObject.optString("lqt_title");
          localaj.field_lqt_cell_lqt_wording = paramJSONObject.optString("lqt_wording");
        }
        if ((Hr(paramInt)) || (paramInt == 3) || (paramInt == 4))
        {
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTd, Integer.valueOf(localaj.field_lqt_state));
          com.tencent.mm.kernel.g.RQ();
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTe, localaj.field_lct_wording);
        }
        AppMethodBeat.o(46931);
        paramJSONObject = localaj;
      }
    }
    while (true)
    {
      return paramJSONObject;
      ab.e("MicroMsg.WalletQueryBankcardParser", "touch_info is null ");
      if (r.cPI().cQk());
      for (int i = 1; ; i = 0)
      {
        localaj.field_is_open_touch = i;
        localaj.field_soter_pay_open_type = r.cPI().cQm();
        ab.e("MicroMsg.WalletQueryBankcardParser", "old field_is_open_touch is " + localaj.field_is_open_touch);
        break;
      }
      ab.e("MicroMsg.WalletQueryBankcardParser", "getUserInfo() json == null or json.length() == 0");
      paramJSONObject = null;
      AppMethodBeat.o(46931);
    }
  }

  public static b a(JSONObject paramJSONObject, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(46934);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is null");
      paramJSONObject = null;
      AppMethodBeat.o(46934);
      return paramJSONObject;
    }
    ab.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), json is valid");
    b localb = new b();
    localb.twx = paramJSONObject.optString("fetch_charge_title");
    ab.i("MicroMsg.WalletQueryBankcardParser", "fetch_charge_title:" + localb.twx);
    if (paramBoolean)
    {
      ab.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery true");
      localb.tgP = paramJSONObject.optInt("is_cal_charge", 0);
      localb.tgO = paramJSONObject.optInt("is_show_charge", 0);
      localb.tgQ = paramJSONObject.optInt("is_full_fetch_direct", 0);
      localb.tgR = com.tencent.mm.wallet_core.ui.e.b(paramJSONObject.optString("min_charge_fee", "0"), "100", RoundingMode.HALF_UP);
      localb.pPt = com.tencent.mm.wallet_core.ui.e.b(paramJSONObject.optString("remain_fee", "0"), "100", RoundingMode.HALF_UP);
      localb.twz = paramJSONObject.optString("card_list_wording_title", "");
      localb.twA = paramJSONObject.optString("card_list_wording_content", "");
      if (paramJSONObject.has("withdraw_sector"))
        localb.twB = b.aq(paramJSONObject.optJSONObject("withdraw_sector"));
      ab.i("MicroMsg.WalletQueryBankcardParser", " is_cal_charge:" + localb.tgP + " is_show_charge:" + localb.tgO + " min_charge_fee:" + localb.tgR + " remain_fee:" + localb.pPt + " is_full_fetch_direct:" + localb.tgQ);
      paramJSONObject = paramJSONObject.optJSONArray("item");
      if ((paramJSONObject == null) || (paramJSONObject.length() <= 0))
        break label547;
      localb.twy = new LinkedList();
      label333: if (i >= paramJSONObject.length())
        break label508;
      JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
      if (localJSONObject == null)
        break label477;
      b.b localb1 = new b.b();
      localb1.key = localJSONObject.optString("key");
      localb1.value = localJSONObject.optString("value");
      ab.i("MicroMsg.WalletQueryBankcardParser", "feeItem.key is " + localb1.key + " , feeItem.value is " + localb1.value);
      if ((!TextUtils.isEmpty(localb1.key)) && (!TextUtils.isEmpty(localb1.value)))
        localb.twy.add(localb1);
    }
    while (true)
    {
      i++;
      break label333;
      ab.i("MicroMsg.WalletQueryBankcardParser", "isBindQuery false");
      break;
      label477: ab.e("MicroMsg.WalletQueryBankcardParser", "item index " + i + " is empty");
    }
    label508: ab.i("MicroMsg.WalletQueryBankcardParser", "itemsList size is " + localb.twy.size());
    while (true)
    {
      AppMethodBeat.o(46934);
      paramJSONObject = localb;
      break;
      label547: ab.e("MicroMsg.WalletQueryBankcardParser", "getBalanceFetchInfo(), itemJsonArray is null");
    }
  }

  private static void a(Bankcard paramBankcard, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(46935);
    paramBankcard = new af.1(paramLong2, paramLong1, paramInt, paramBankcard);
    com.tencent.mm.wallet_core.ui.e.a(new String[] { "wallet_balance_version", "wallet_balance_last_update_time", "wallet_balance" }, paramBankcard);
    AppMethodBeat.o(46935);
  }

  public static void a(JSONObject paramJSONObject, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(46927);
    ab.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard(): %s, %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    try
    {
      long l = paramJSONObject.optLong("time_stamp");
      if (l > 0L)
        w.setTimeStamp(String.valueOf(l));
      while (true)
      {
        localaj = a(paramJSONObject.getJSONObject("user_info"), paramInt);
        if (!paramBoolean)
          break;
        localaj.field_switchConfig = paramJSONObject.getJSONObject("switch_info").getInt("switch_bit");
        localaj.field_paymenu_use_new = paramJSONObject.optInt("paymenu_use_new");
        ab.i("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard, paymenu_use_new: %s", new Object[] { Integer.valueOf(localaj.field_paymenu_use_new) });
        Object localObject1 = paramJSONObject.optString("support_bank_word");
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJQ, bo.nullAsNil((String)localObject1));
        ArrayList localArrayList1 = z(paramJSONObject.optJSONArray("Array"));
        ArrayList localArrayList2 = A(paramJSONObject.optJSONArray("virtual_card_array"));
        Bankcard localBankcard = aG(paramJSONObject.optJSONObject("balance_info"));
        if ((localBankcard != null) && (paramInt == 10))
        {
          ab.i("MicroMsg.WalletQueryBankcardParser", "carson: entry_url: %s、entry_word：%s", new Object[] { localBankcard.twW, localBankcard.twX });
          localObject1 = paramJSONObject.optJSONObject("bill_entry");
          if (localObject1 != null)
          {
            localBankcard.twW = ((JSONObject)localObject1).optString("entry_url");
            localBankcard.twX = ((JSONObject)localObject1).optString("entry_word");
          }
        }
        int i = paramJSONObject.optInt("query_cache_time");
        ab.i("MicroMsg.WalletQueryBankcardParser", "hy: cache time: %d", new Object[] { Integer.valueOf(i) });
        localObject1 = paramJSONObject.optJSONObject("complex_switch_info");
        if (localObject1 != null)
        {
          localObject2 = ((JSONObject)localObject1).optJSONObject("bind_newcard_switch");
          ((JSONObject)localObject2).optInt("forbid_bind_card");
          ((JSONObject)localObject2).optString("forbid_word");
        }
        g.cPl().at((JSONObject)localObject1);
        Object localObject2 = B(paramJSONObject.optJSONArray("history_card_array"));
        aF(paramJSONObject);
        localObject1 = paramJSONObject.optJSONObject("bank_priority");
        if (localObject1 != null)
          localaj.field_bank_priority = ((JSONObject)localObject1).toString();
        List localList = aE((JSONObject)localObject1);
        localaj.field_unipay_order_state = paramJSONObject.optInt("unipayorderstate", 0);
        a(paramJSONObject, localaj, paramBoolean);
        paramJSONObject.optString("query_order_time");
        n localn = aH(paramJSONObject.optJSONObject("loan_entry_info"));
        Object localObject3 = paramJSONObject.optJSONObject("fetch_info");
        localObject1 = r.cPI().tCX;
        ab.d("MicroMsg.WalletQueryBankcardParser", "fetchInfo: %s", new Object[] { localObject1 });
        if (localObject3 == null)
          break label642;
        localObject1 = a((JSONObject)localObject3, true);
        localObject3 = aI(paramJSONObject.optJSONObject("lqt_info"));
        if (paramInt == 4)
        {
          ab.d("MicroMsg.WalletQueryBankcardParser", "update fetch scene data");
          r.cPI().tgW = paramJSONObject.optInt("is_use_dynamic_free_fee");
          r.cPI().tgX = paramJSONObject.optInt("dynamic_free_fee_hold_time");
        }
        r.cPI().a(localaj, localArrayList1, localArrayList2, localBankcard, (Bankcard)localObject2, localn, (b)localObject1, (Bankcard)localObject3, i, paramInt, localList);
        AppMethodBeat.o(46927);
        return;
        ab.w("MicroMsg.WalletQueryBankcardParser", "no time_stamp at WalletQueryBankcardParser.");
      }
    }
    catch (Exception paramJSONObject)
    {
      while (true)
      {
        aj localaj;
        ab.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard Exception :" + paramJSONObject.getMessage());
        ab.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", paramJSONObject, "", new Object[0]);
        AppMethodBeat.o(46927);
        continue;
        localaj.field_switchConfig = r.cPE().cRh().field_switchConfig;
        continue;
        label642: ab.e("MicroMsg.WalletQueryBankcardParser", "parseQueryBankcard() fetch_info is null");
      }
    }
  }

  private static void a(JSONObject paramJSONObject, aj paramaj, boolean paramBoolean)
  {
    AppMethodBeat.i(46929);
    if (paramBoolean)
    {
      paramJSONObject = paramJSONObject.optJSONObject("wallet_info");
      if (paramJSONObject != null)
      {
        paramaj.field_wallet_balance = paramJSONObject.optLong("wallet_balance", -1L);
        paramaj.field_wallet_entrance_balance_switch_state = paramJSONObject.optInt("wallet_entrance_balance_switch_state", -1);
      }
      AppMethodBeat.o(46929);
    }
    while (true)
    {
      return;
      paramaj.field_wallet_balance = r.cPE().cRh().field_wallet_balance;
      paramaj.field_wallet_entrance_balance_switch_state = r.cPE().cRh().field_wallet_entrance_balance_switch_state;
      AppMethodBeat.o(46929);
    }
  }

  public static List<c> aE(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46928);
    ArrayList localArrayList = new ArrayList();
    if (paramJSONObject != null)
      try
      {
        paramJSONObject = paramJSONObject.optJSONArray("bankinfo_array");
        if (paramJSONObject != null)
        {
          int i = paramJSONObject.length();
          for (int j = 0; j < i; j++)
          {
            c localc = new com/tencent/mm/plugin/wallet_core/model/c;
            localc.<init>();
            JSONObject localJSONObject = paramJSONObject.getJSONObject(j);
            localc.pbo = localJSONObject.optString("bind_serial");
            localc.twE = localJSONObject.optString("polling_forbid_word");
            localArrayList.add(localc);
          }
        }
      }
      catch (Exception paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.WalletQueryBankcardParser", paramJSONObject, "", new Object[0]);
      }
    AppMethodBeat.o(46928);
    return localArrayList;
  }

  private static void aF(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46930);
    JSONArray localJSONArray = paramJSONObject.optJSONArray("balance_notice");
    Object localObject = paramJSONObject.optJSONArray("fetch_notice");
    if (localJSONArray != null)
    {
      paramJSONObject = bo.bc(localJSONArray.toString(), "");
      if (localObject == null)
        break label133;
    }
    label133: for (localObject = bo.bc(((JSONArray)localObject).toString(), ""); ; localObject = "")
    {
      ab.i("MicroMsg.WalletQueryBankcardParser", "hy: balance notice: %s, fetchNotice: %s", new Object[] { paramJSONObject, localObject });
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJO, paramJSONObject);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJP, localObject);
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().dsb();
      AppMethodBeat.o(46930);
      return;
      paramJSONObject = "";
      break;
    }
  }

  private static Bankcard aG(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46932);
    Object localObject;
    label219: boolean bool;
    if (paramJSONObject == null)
    {
      localObject = "";
      ab.i("MicroMsg.WalletQueryBankcardParser", "Bankcard getBalance %s", new Object[] { localObject });
      if ((paramJSONObject == null) || (paramJSONObject.length() <= 0))
        break label460;
      localObject = new Bankcard((byte)0);
      a((Bankcard)localObject, paramJSONObject.optLong("balance_version", -1L), paramJSONObject.optLong("time_out", 7200L), paramJSONObject.optInt("avail_balance"));
      ((Bankcard)localObject).twS = com.tencent.mm.wallet_core.ui.e.b(paramJSONObject.optString("avail_balance", "0"), "100", RoundingMode.HALF_UP);
      ((Bankcard)localObject).twT = paramJSONObject.optString("balance_show_wording");
      ((Bankcard)localObject).twY = paramJSONObject.optString("max_fetch_wording");
      ((Bankcard)localObject).twZ = paramJSONObject.optString("avail_fetch_wording");
      ((Bankcard)localObject).twU = com.tencent.mm.wallet_core.ui.e.b(paramJSONObject.optString("fetch_balance", "0"), "100", RoundingMode.HALF_UP);
      ((Bankcard)localObject).field_cardType |= Bankcard.twI;
      ((Bankcard)localObject).field_bankcardType = paramJSONObject.optString("balance_bank_type");
      ((Bankcard)localObject).field_bindSerial = paramJSONObject.optString("balance_bind_serial");
      ((Bankcard)localObject).field_forbidWord = paramJSONObject.optString("balance_forbid_word");
      if (bo.isNullOrNil(((Bankcard)localObject).field_forbidWord))
        break label429;
      ((Bankcard)localObject).field_bankcardState = 8;
      ((Bankcard)localObject).field_fetchArriveTime = paramJSONObject.optLong("fetch_arrive_time");
      ((Bankcard)localObject).field_mobile = paramJSONObject.optString("mobile");
      if (paramJSONObject.optInt("support_micropay", 0) != 1)
        break label437;
      bool = true;
      label255: ((Bankcard)localObject).field_support_micropay = bool;
      ab.i("MicroMsg.WalletQueryBankcardParser", "getBalance() support_micropay:" + paramJSONObject.optInt("support_micropay", 0));
      ((Bankcard)localObject).twV = paramJSONObject.optString("balance_list_url");
      ab.i("MicroMsg.WalletQueryBankcardParser", "carson balance_list_url: %s", new Object[] { ((Bankcard)localObject).twV });
      String str = ah.getContext().getString(2131304521);
      ((Bankcard)localObject).field_desc = str;
      ((Bankcard)localObject).field_bankName = str;
      ((Bankcard)localObject).field_bankcardTail = "10000";
      ((Bankcard)localObject).field_forbid_title = paramJSONObject.optString("forbid_title");
      ((Bankcard)localObject).field_forbid_url = paramJSONObject.optString("forbid_url");
      paramJSONObject = paramJSONObject.optJSONObject("balance_menu_info");
      if (paramJSONObject == null)
        break label442;
      paramJSONObject = paramJSONObject.toString();
      ab.d("MicroMsg.WalletQueryBankcardParser", "balance menu info: %s", new Object[] { paramJSONObject });
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUa, paramJSONObject);
      label414: AppMethodBeat.o(46932);
      paramJSONObject = (JSONObject)localObject;
    }
    while (true)
    {
      return paramJSONObject;
      localObject = paramJSONObject;
      break;
      label429: ((Bankcard)localObject).field_bankcardState = 0;
      break label219;
      label437: bool = false;
      break label255;
      label442: com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xUa, "");
      break label414;
      label460: ab.i("MicroMsg.WalletQueryBankcardParser", "getBalance() json == null or json.length() == 0");
      paramJSONObject = null;
      AppMethodBeat.o(46932);
    }
  }

  private static n aH(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46939);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo json is null");
      paramJSONObject = null;
      AppMethodBeat.o(46939);
    }
    while (true)
    {
      return paramJSONObject;
      ab.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo()");
      n localn = new n();
      localn.field_title = paramJSONObject.optString("title");
      localn.field_loan_jump_url = paramJSONObject.optString("loan_jump_url");
      ab.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_loan_jump_url:" + localn.field_loan_jump_url);
      localn.field_is_show_entry = paramJSONObject.optInt("is_show_entry", 0);
      localn.field_tips = paramJSONObject.optString("tips");
      localn.field_is_overdue = paramJSONObject.optInt("is_overdue", 0);
      if (paramJSONObject.has("available_otb"))
        localn.field_available_otb = com.tencent.mm.wallet_core.ui.e.e(paramJSONObject.optDouble("available_otb") / 100.0D, "CNY");
      if (paramJSONObject.has("index"))
        localn.field_red_dot_index = paramJSONObject.optInt("index");
      ab.i("MicroMsg.WalletQueryBankcardParser", "getLoanEntryInfo() field_index:" + localn.field_red_dot_index + "  field_is_overdue:" + localn.field_is_overdue + "  field_is_show_entry:" + localn.field_is_show_entry);
      AppMethodBeat.o(46939);
      paramJSONObject = localn;
    }
  }

  private static Bankcard aI(JSONObject paramJSONObject)
  {
    boolean bool = true;
    AppMethodBeat.i(46940);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.WalletQueryBankcardParser", "getLqtInfo, json object is null!");
      paramJSONObject = null;
      AppMethodBeat.o(46940);
      return paramJSONObject;
    }
    ab.i("MicroMsg.WalletQueryBankcardParser", "now get getLqtInfo: %s", new Object[] { paramJSONObject.toString() });
    Bankcard localBankcard = new Bankcard((byte)0);
    localBankcard.field_bankcardType = paramJSONObject.optString("lqt_bank_type");
    localBankcard.field_bindSerial = paramJSONObject.optString("lqt_bind_serial");
    localBankcard.field_bankName = paramJSONObject.optString("lqt_bank_name");
    localBankcard.twS = (paramJSONObject.optLong("total_balance") / 100.0D);
    localBankcard.twU = (paramJSONObject.optLong("avail_balance") / 100.0D);
    localBankcard.txc = new e();
    localBankcard.txc.oRi = paramJSONObject.optString("lqt_logo_url");
    localBankcard.field_forbidWord = paramJSONObject.optString("lqt_forbid_word");
    localBankcard.field_forbid_title = paramJSONObject.optString("forbid_title");
    localBankcard.field_forbid_url = paramJSONObject.optString("forbid_url");
    localBankcard.twT = paramJSONObject.optString("lqt_show_wording");
    localBankcard.field_mobile = paramJSONObject.optString("mobile");
    if (paramJSONObject.optInt("support_micropay", 0) == 1)
    {
      label215: localBankcard.field_support_micropay = bool;
      localBankcard.field_cardType |= Bankcard.twL;
      if (bo.isNullOrNil(localBankcard.field_bankName))
        localBankcard.field_bankName = ah.getContext().getString(2131305016);
      localBankcard.field_desc = localBankcard.field_bankName;
      if (bo.isNullOrNil(localBankcard.field_forbidWord))
        break label295;
    }
    label295: for (localBankcard.field_bankcardState = 8; ; localBankcard.field_bankcardState = 0)
    {
      AppMethodBeat.o(46940);
      paramJSONObject = localBankcard;
      break;
      bool = false;
      break label215;
    }
  }

  private static ArrayList<Bankcard> z(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(46936);
    ab.i("MicroMsg.WalletQueryBankcardParser", "getBankcards()");
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() > 0))
    {
      int i = paramJSONArray.length();
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramJSONArray.getJSONObject(j);
        localObject = d.cPh().ar((JSONObject)localObject);
        if (localObject != null)
        {
          d.e((Bankcard)localObject);
          localArrayList.add(localObject);
        }
      }
    }
    AppMethodBeat.o(46936);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.af
 * JD-Core Version:    0.6.2
 */