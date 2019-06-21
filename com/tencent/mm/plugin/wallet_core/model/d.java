package com.tencent.mm.plugin.wallet_core.model;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.oq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import java.io.UnsupportedEncodingException;
import java.math.RoundingMode;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class d
{
  private static d txo = null;

  public static Bankcard a(oq paramoq)
  {
    boolean bool = true;
    AppMethodBeat.i(46718);
    ab.i("MicroMsg.BankcardParser", "parseFromBindQueryRecord %s", new Object[] { paramoq });
    Bankcard localBankcard = new Bankcard();
    try
    {
      localBankcard.field_bankName = paramoq.nuL;
      localBankcard.field_bankcardTypeName = paramoq.vJE;
      localBankcard.field_bankcardType = paramoq.pbn;
      localBankcard.field_bindSerial = paramoq.pbo;
      ab.d("MicroMsg.BankcardParser", "bind_serial: %s", new Object[] { localBankcard.field_bindSerial });
      if (2 == bo.getInt(paramoq.vJC, 2))
      {
        i = 1;
        if (i != 0)
          localBankcard.field_cardType |= Bankcard.twG;
        if ("NORMAL".equals(paramoq.vVn))
          break label602;
        i = 1;
        label124: if (i != 0)
          localBankcard.field_cardType |= Bankcard.twH;
        if (!bo.isNullOrNil(paramoq.cFl))
          localBankcard.field_mobile = URLDecoder.decode(paramoq.cFl.replaceAll("x", "%"), "utf-8");
        localBankcard.field_onceQuotaKind = e.b(paramoq.vVj, "100", RoundingMode.HALF_UP);
        localBankcard.field_onceQuotaVirtual = e.b(paramoq.vVh, "100", RoundingMode.HALF_UP);
        localBankcard.field_dayQuotaKind = e.b(paramoq.vVf, "100", RoundingMode.HALF_UP);
        localBankcard.field_dayQuotaVirtual = e.b(paramoq.vVd, "100", RoundingMode.HALF_UP);
        localBankcard.field_bankcardTail = paramoq.vJD;
        localBankcard.field_forbidWord = paramoq.pbp;
        localBankcard.field_repay_url = paramoq.uYI;
        localBankcard.field_wxcreditState = 2;
        if (bo.isNullOrNil(localBankcard.field_forbidWord))
          break label607;
      }
      for (localBankcard.field_bankcardState = 8; ; localBankcard.field_bankcardState = 1)
      {
        localBankcard.field_bankPhone = paramoq.tyH;
        localBankcard.field_fetchArriveTime = (bo.getLong(paramoq.vVs, 0L) * 1000L);
        localBankcard.field_fetchArriveTimeWording = paramoq.vVE;
        localBankcard.field_bankcardTag = bo.getInt(paramoq.vVk, 1);
        if (localBankcard.field_bankcardTag != 2)
          break label695;
        i = 1;
        if (i != 0)
          localBankcard.field_cardType |= Bankcard.twF;
        if (paramoq.vVp != 1)
          break label700;
        localBankcard.field_support_micropay = bool;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("getBalance() support_micropay:");
        ab.i("MicroMsg.BankcardParser", paramoq.vVp);
        localBankcard.field_arrive_type = paramoq.vVy;
        localBankcard.field_avail_save_wording = paramoq.vVA;
        i = paramoq.vVF;
        ab.i("MicroMsg.BankcardParser", "fetch_charge_rate:".concat(String.valueOf(i)));
        localBankcard.field_fetch_charge_rate = (i / 10000.0D);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("field_fetch_charge_rate:");
        ab.i("MicroMsg.BankcardParser", localBankcard.field_fetch_charge_rate);
        i = paramoq.vVG;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("full_fetch_charge_fee:");
        ab.i("MicroMsg.BankcardParser", localBankcard.field_full_fetch_charge_fee);
        localBankcard.field_full_fetch_charge_fee = (i / 100.0D);
        localBankcard.field_fetch_charge_info = paramoq.vVH;
        localBankcard.field_tips = paramoq.kfM;
        localBankcard.field_forbid_title = paramoq.vJv;
        localBankcard.field_forbid_url = paramoq.vJw;
        localBankcard.field_no_micro_word = paramoq.vVz;
        localBankcard.field_card_bottom_wording = paramoq.vVN;
        localBankcard.field_support_lqt_turn_in = paramoq.vVQ;
        localBankcard.field_support_lqt_turn_out = paramoq.vVR;
        localBankcard.field_is_hightlight_pre_arrive_time_wording = paramoq.vVP;
        e(localBankcard);
        AppMethodBeat.o(46718);
        paramoq = localBankcard;
        return paramoq;
        i = 0;
        break;
        label602: i = 0;
        break label124;
        label607: if (1 != bo.getInt(paramoq.vVg, 0))
          break label668;
      }
    }
    catch (Exception paramoq)
    {
      while (true)
      {
        int i;
        ab.printErrStackTrace("MicroMsg.BankcardParser", paramoq, "parseFromBindQueryRecord() error:" + paramoq.getMessage(), new Object[0]);
        paramoq = null;
        AppMethodBeat.o(46718);
        continue;
        label668: if (bo.getInt(paramoq.tyG, 1) == 0)
        {
          localBankcard.field_bankcardState = 2;
        }
        else
        {
          localBankcard.field_bankcardState = 0;
          continue;
          label695: i = 0;
          continue;
          label700: bool = false;
        }
      }
    }
  }

  public static d cPh()
  {
    AppMethodBeat.i(46715);
    if (txo == null)
      txo = new d();
    d locald = txo;
    AppMethodBeat.o(46715);
    return locald;
  }

  public static List<Bankcard> dQ(List<oq> paramList)
  {
    AppMethodBeat.i(46717);
    ArrayList localArrayList = new ArrayList();
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      ab.i("MicroMsg.BankcardParser", "record size: %s", new Object[] { Integer.valueOf(paramList.size()) });
      paramList = paramList.iterator();
      while (paramList.hasNext())
        localArrayList.add(a((oq)paramList.next()));
    }
    AppMethodBeat.o(46717);
    return localArrayList;
  }

  public static void e(Bankcard paramBankcard)
  {
    AppMethodBeat.i(46719);
    if (paramBankcard == null)
      AppMethodBeat.o(46719);
    while (true)
    {
      return;
      if (paramBankcard.cPc())
      {
        paramBankcard.field_desc = paramBankcard.field_bankName;
        AppMethodBeat.o(46719);
      }
      else if (paramBankcard.cPg())
      {
        paramBankcard.field_desc = ah.getContext().getString(2131304828, new Object[] { paramBankcard.txj, e.eL(paramBankcard.txg, 8) });
        AppMethodBeat.o(46719);
      }
      else if (paramBankcard.cPe())
      {
        paramBankcard.field_desc = ah.getContext().getString(2131304761, new Object[] { paramBankcard.field_bankName, paramBankcard.field_bankcardTail });
        AppMethodBeat.o(46719);
      }
      else if (paramBankcard.cPb())
      {
        paramBankcard.field_desc = ah.getContext().getString(2131305484, new Object[] { paramBankcard.field_bankName, paramBankcard.field_bankcardTail });
        AppMethodBeat.o(46719);
      }
      else
      {
        paramBankcard.field_desc = ah.getContext().getString(2131304781, new Object[] { paramBankcard.field_bankName, paramBankcard.field_bankcardTail });
        AppMethodBeat.o(46719);
      }
    }
  }

  public Bankcard ar(JSONObject paramJSONObject)
  {
    int i = 1;
    AppMethodBeat.i(46716);
    Object localObject1;
    if (paramJSONObject == null)
      localObject1 = "";
    while (true)
    {
      ab.i("MicroMsg.BankcardParser", "parseJson jsonBankcard %s", new Object[] { localObject1 });
      localObject1 = new Bankcard();
      try
      {
        ((Bankcard)localObject1).field_bankName = paramJSONObject.getString("bank_name");
        ((Bankcard)localObject1).field_bankcardTypeName = paramJSONObject.optString("bankacc_type_name");
        ((Bankcard)localObject1).field_bankcardType = paramJSONObject.getString("bank_type");
        ((Bankcard)localObject1).field_bindSerial = paramJSONObject.optString("bind_serial");
        ab.d("MicroMsg.BankcardParser", "bind_serial: %s", new Object[] { ((Bankcard)localObject1).field_bindSerial });
        ((Bankcard)localObject1).twQ = paramJSONObject.optString("h_bind_serialno");
        if (2 == paramJSONObject.optInt("bankacc_type", 0))
        {
          j = 1;
          label128: if (j != 0)
            ((Bankcard)localObject1).field_cardType |= Bankcard.twG;
          if ("NORMAL".equals(paramJSONObject.optString("extra_bind_flag")))
            break label978;
          j = 1;
          label163: if (j != 0)
            ((Bankcard)localObject1).field_cardType |= Bankcard.twH;
          if ("QMF".equals(((Bankcard)localObject1).field_bankcardType))
          {
            ((Bankcard)localObject1).field_cardType |= Bankcard.twM;
            localObject2 = paramJSONObject.optJSONObject("qmfCardInfo");
            if (localObject2 != null)
            {
              ((Bankcard)localObject1).txd = ((JSONObject)localObject2).optLong("total_credit_line", 0L);
              ((Bankcard)localObject1).txe = ((JSONObject)localObject2).optLong("use_credit_line", 0L);
              ((Bankcard)localObject1).txf = ((JSONObject)localObject2).optLong("unuse_credit_line", 0L);
              ((Bankcard)localObject1).txg = ((JSONObject)localObject2).optString("payer_username", "");
              ((Bankcard)localObject1).txh = ((JSONObject)localObject2).optInt("hide_credit_line", 0);
              ((Bankcard)localObject1).txi = ((JSONObject)localObject2).optInt("card_type", 0);
              ((Bankcard)localObject1).txj = ((JSONObject)localObject2).optString("card_type_name", "");
              ((Bankcard)localObject1).txk = ((JSONObject)localObject2).optString("icon_url", "");
            }
          }
          ((Bankcard)localObject1).field_mobile = URLDecoder.decode(paramJSONObject.optString("mobile").replaceAll("x", "%"), "utf-8");
          if (bo.isNullOrNil(((Bankcard)localObject1).field_mobile))
            ((Bankcard)localObject1).field_mobile = paramJSONObject.optString("mobile_mask");
          ((Bankcard)localObject1).field_onceQuotaKind = (paramJSONObject.optDouble("once_quota_3") / 100.0D);
          ((Bankcard)localObject1).field_onceQuotaVirtual = (paramJSONObject.optDouble("once_quota_1") / 100.0D);
          ((Bankcard)localObject1).field_dayQuotaKind = (paramJSONObject.optDouble("day_quota_3") / 100.0D);
          ((Bankcard)localObject1).field_dayQuotaVirtual = (paramJSONObject.optDouble("day_quota_1") / 100.0D);
          ((Bankcard)localObject1).field_bankcardTail = paramJSONObject.optString("bind_tail");
          if (bo.isNullOrNil(((Bankcard)localObject1).field_bankcardTail))
            ((Bankcard)localObject1).field_bankcardTail = paramJSONObject.optString("card_tail");
          ((Bankcard)localObject1).twO = paramJSONObject.optString("card_mask");
          ((Bankcard)localObject1).field_forbidWord = paramJSONObject.optString("forbid_word");
          ((Bankcard)localObject1).field_repay_url = paramJSONObject.optString("repay_url");
          ((Bankcard)localObject1).field_wxcreditState = 2;
          if (bo.isNullOrNil(((Bankcard)localObject1).field_forbidWord))
            break label984;
        }
        for (((Bankcard)localObject1).field_bankcardState = 8; ; ((Bankcard)localObject1).field_bankcardState = 1)
        {
          ((Bankcard)localObject1).field_bankPhone = paramJSONObject.optString("bank_phone");
          ((Bankcard)localObject1).field_fetchArriveTime = (paramJSONObject.optLong("fetch_pre_arrive_time") * 1000L);
          ((Bankcard)localObject1).field_fetchArriveTimeWording = paramJSONObject.optString("fetch_pre_arrive_time_wording");
          ((Bankcard)localObject1).field_bankcardTag = paramJSONObject.optInt("bank_card_tag", 1);
          if (((Bankcard)localObject1).field_bankcardTag != 2)
            break label1181;
          j = i;
          if (j != 0)
            ((Bankcard)localObject1).field_cardType |= Bankcard.twF;
          localObject2 = paramJSONObject.optString("support_micropay");
          if (TextUtils.isEmpty((CharSequence)localObject2))
            ((Bankcard)localObject1).field_support_micropay = true;
          if (!"1".equals(localObject2))
            break label1187;
          ((Bankcard)localObject1).field_support_micropay = true;
          ((Bankcard)localObject1).field_arrive_type = paramJSONObject.optString("arrive_type");
          ((Bankcard)localObject1).field_avail_save_wording = paramJSONObject.optString("avail_save_wording");
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("getBalance() support_micropay:");
          ab.i("MicroMsg.BankcardParser", paramJSONObject.optString("support_micropay"));
          j = paramJSONObject.optInt("fetch_charge_rate", 0);
          ab.i("MicroMsg.BankcardParser", "fetch_charge_rate:".concat(String.valueOf(j)));
          ((Bankcard)localObject1).field_fetch_charge_rate = (j / 10000.0D);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("field_fetch_charge_rate:");
          ab.i("MicroMsg.BankcardParser", ((Bankcard)localObject1).field_fetch_charge_rate);
          j = paramJSONObject.optInt("full_fetch_charge_fee", 0);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("full_fetch_charge_fee:");
          ab.i("MicroMsg.BankcardParser", ((Bankcard)localObject1).field_full_fetch_charge_fee);
          ((Bankcard)localObject1).field_full_fetch_charge_fee = (j / 100.0D);
          ((Bankcard)localObject1).field_fetch_charge_info = paramJSONObject.optString("fetch_charge_info");
          ((Bankcard)localObject1).field_tips = paramJSONObject.optString("tips");
          ((Bankcard)localObject1).field_forbid_title = paramJSONObject.optString("forbid_title");
          ((Bankcard)localObject1).field_forbid_url = paramJSONObject.optString("forbid_url");
          ((Bankcard)localObject1).field_no_micro_word = paramJSONObject.optString("no_micro_word");
          ((Bankcard)localObject1).field_card_bottom_wording = paramJSONObject.optString("card_bottom_wording");
          ((Bankcard)localObject1).field_support_lqt_turn_in = paramJSONObject.optInt("support_lqt_turn_in", 0);
          ((Bankcard)localObject1).field_support_lqt_turn_out = paramJSONObject.optInt("support_lqt_turn_out", 0);
          ((Bankcard)localObject1).field_is_hightlight_pre_arrive_time_wording = paramJSONObject.optInt("is_hightlight_pre_arrive_time_wording", 0);
          ((Bankcard)localObject1).txl = paramJSONObject.optInt("support_foreign_mobile", 0);
          ((Bankcard)localObject1).field_card_state_name = paramJSONObject.optString("card_state_name");
          ((Bankcard)localObject1).txm = paramJSONObject.optString("card_fetch_wording");
          ((Bankcard)localObject1).txn = paramJSONObject.optLong("card_min_charge_fee");
          e((Bankcard)localObject1);
          AppMethodBeat.o(46716);
          paramJSONObject = (JSONObject)localObject1;
          return paramJSONObject;
          localObject1 = paramJSONObject;
          break;
          j = 0;
          break label128;
          label978: j = 0;
          break label163;
          label984: if (1 != paramJSONObject.optInt("expired_flag", 0))
            break label1054;
        }
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
        {
          ab.i("MicroMsg.BankcardParser", "parseJson() JSONException:" + paramJSONObject.getMessage());
          ab.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
          paramJSONObject = null;
          AppMethodBeat.o(46716);
          continue;
          if (paramJSONObject.optInt("bank_flag", 1) != 0)
            break;
          ((Bankcard)localObject1).field_bankcardState = 2;
        }
      }
      catch (UnsupportedEncodingException paramJSONObject)
      {
        while (true)
        {
          ab.i("MicroMsg.BankcardParser", "parseJson() UnsupportedEncodingException :" + paramJSONObject.getMessage());
          ab.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
          paramJSONObject = null;
          AppMethodBeat.o(46716);
          continue;
          ((Bankcard)localObject1).field_bankcardState = 0;
        }
      }
      catch (Exception paramJSONObject)
      {
        while (true)
        {
          Object localObject2;
          label1054: ab.i("MicroMsg.BankcardParser", "parseJson() Exception:" + paramJSONObject.getMessage());
          ab.printErrStackTrace("MicroMsg.BankcardParser", paramJSONObject, "", new Object[0]);
          paramJSONObject = null;
          AppMethodBeat.o(46716);
          continue;
          label1181: int j = 0;
          continue;
          label1187: if ("0".equals(localObject2))
            ((Bankcard)localObject1).field_support_micropay = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.d
 * JD-Core Version:    0.6.2
 */