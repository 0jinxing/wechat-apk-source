package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet.a.h;
import com.tencent.mm.plugin.wallet.a.i;
import com.tencent.mm.plugin.wallet.a.j;
import com.tencent.mm.plugin.wallet.a.m;
import com.tencent.mm.plugin.wallet.a.n;
import com.tencent.mm.plugin.wallet.a.o;
import com.tencent.mm.plugin.wallet.a.t;
import com.tencent.mm.protocal.protobuf.aca;
import com.tencent.mm.protocal.protobuf.cgd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Orders
  implements Parcelable
{
  public static final Parcelable.Creator<Orders> CREATOR;
  public static int tAP;
  public static int tAQ;
  public String czZ;
  public String ekv;
  public ArrayList<cgd> field_infos;
  public String lvz;
  public String nickname;
  public String oRi;
  public double pPp;
  public double pTN;
  public String pcl;
  public int tAA;
  public String tAB;
  public int tAC;
  public int tAD;
  public ArrayList<Orders.ShowInfo> tAE;
  public String tAF;
  public String tAG;
  public String tAH;
  public String tAI;
  public String tAJ;
  public String tAK;
  public String tAL;
  public String tAM;
  public int tAN;
  public Orders.SimpleCashierInfo tAO;
  public double tAa;
  public int tAb;
  public int tAc;
  public String tAd;
  public String tAe;
  public String tAf;
  public String tAg;
  public int tAh;
  public boolean tAi;
  public String tAj;
  public long tAk;
  public String tAl;
  public String tAm;
  public Set<String> tAn;
  public int tAo;
  public String tAp;
  public List<Orders.Commodity> tAq;
  public h tAr;
  public int tAs;
  public String tAt;
  public String tAu;
  public Orders.DeductInfo tAv;
  public long tAw;
  public long tAx;
  public int tAy;
  public int tAz;
  public String token;
  public int tuo;
  public String twd;
  public String tyA;
  public long tzZ;
  public String username;

  static
  {
    AppMethodBeat.i(46845);
    CREATOR = new Orders.1();
    tAP = 0;
    tAQ = 1;
    AppMethodBeat.o(46845);
  }

  public Orders()
  {
    AppMethodBeat.i(46833);
    this.czZ = "";
    this.token = "";
    this.ekv = "0";
    this.pTN = 0.0D;
    this.tAa = 0.0D;
    this.tAi = false;
    this.tAj = "";
    this.lvz = "";
    this.tAk = 0L;
    this.tAl = "";
    this.tAn = new HashSet();
    this.tAo = 0;
    this.tAp = "";
    this.tAq = new ArrayList();
    this.tAr = new h();
    this.tAs = 0;
    this.tAt = "";
    this.tAu = "";
    this.tAy = 0;
    this.tAz = 0;
    this.tAA = 0;
    this.tAB = "";
    this.tAC = 0;
    this.tAD = 0;
    this.tAE = new ArrayList();
    this.tAF = "";
    this.tAG = "";
    this.field_infos = new ArrayList();
    this.tAH = "";
    this.tAK = "";
    AppMethodBeat.o(46833);
  }

  public Orders(Parcel paramParcel)
  {
    AppMethodBeat.i(46843);
    this.czZ = "";
    this.token = "";
    this.ekv = "0";
    this.pTN = 0.0D;
    this.tAa = 0.0D;
    this.tAi = false;
    this.tAj = "";
    this.lvz = "";
    this.tAk = 0L;
    this.tAl = "";
    this.tAn = new HashSet();
    this.tAo = 0;
    this.tAp = "";
    this.tAq = new ArrayList();
    this.tAr = new h();
    this.tAs = 0;
    this.tAt = "";
    this.tAu = "";
    this.tAy = 0;
    this.tAz = 0;
    this.tAA = 0;
    this.tAB = "";
    this.tAC = 0;
    this.tAD = 0;
    this.tAE = new ArrayList();
    this.tAF = "";
    this.tAG = "";
    this.field_infos = new ArrayList();
    this.tAH = "";
    this.tAK = "";
    this.tzZ = paramParcel.readLong();
    this.czZ = paramParcel.readString();
    this.token = paramParcel.readString();
    this.ekv = paramParcel.readString();
    this.pTN = paramParcel.readDouble();
    this.tuo = paramParcel.readInt();
    this.pcl = paramParcel.readString();
    this.pPp = paramParcel.readDouble();
    this.tAa = paramParcel.readDouble();
    this.tAb = paramParcel.readInt();
    this.twd = paramParcel.readString();
    this.tyA = paramParcel.readString();
    this.tAc = paramParcel.readInt();
    this.tAd = paramParcel.readString();
    this.username = paramParcel.readString();
    this.nickname = paramParcel.readString();
    this.oRi = paramParcel.readString();
    this.tAe = paramParcel.readString();
    this.tAf = paramParcel.readString();
    this.tAg = paramParcel.readString();
    this.tAh = paramParcel.readInt();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.tAi = bool;
      this.tAj = paramParcel.readString();
      this.lvz = paramParcel.readString();
      this.tAk = paramParcel.readLong();
      this.tAl = paramParcel.readString();
      paramParcel.readTypedList(this.tAq, Orders.Commodity.CREATOR);
      this.tAm = paramParcel.readString();
      this.tAn = acx(this.tAm);
      this.tAo = paramParcel.readInt();
      this.tAp = paramParcel.readString();
      this.tAv = ((Orders.DeductInfo)paramParcel.readParcelable(Orders.DeductInfo.class.getClassLoader()));
      this.tAy = paramParcel.readInt();
      this.tAz = paramParcel.readInt();
      this.tAD = paramParcel.readInt();
      this.tAG = paramParcel.readString();
      this.tAF = paramParcel.readString();
      this.tAC = paramParcel.readInt();
      paramParcel.readTypedList(this.tAE, Orders.ShowInfo.CREATOR);
      this.tAO = ((Orders.SimpleCashierInfo)paramParcel.readParcelable(Orders.SimpleCashierInfo.class.getClassLoader()));
      AppMethodBeat.o(46843);
      return;
      bool = false;
    }
  }

  public static Orders a(JSONObject paramJSONObject, Orders paramOrders)
  {
    AppMethodBeat.i(46836);
    Object localObject1;
    if ((paramJSONObject != null) && (paramOrders != null))
      try
      {
        localObject1 = paramJSONObject.optJSONObject("appservice");
        if (localObject1 != null)
        {
          paramOrders.tAf = ((JSONObject)localObject1).optString("app_recommend_desc");
          paramOrders.tAg = ((JSONObject)localObject1).optString("app_telephone");
          paramOrders.tAh = ((JSONObject)localObject1).optInt("recommend_level", 2);
          paramOrders.lvz = ((JSONObject)localObject1).optString("share_to_friends_url");
        }
        int i = paramOrders.tAh;
        List localList = paramOrders.tAq;
        paramOrders.tAj = paramJSONObject.optString("pay_result_tips");
        localObject1 = paramJSONObject.getJSONArray("payresult");
        int j = ((JSONArray)localObject1).length();
        int k = 0;
        if (k < j)
        {
          JSONObject localJSONObject = ((JSONArray)localObject1).getJSONObject(k);
          Orders.Commodity localCommodity;
          Object localObject2;
          if ((localList != null) && (localList.size() == 1))
          {
            localCommodity = (Orders.Commodity)localList.get(0);
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            localCommodity.tBa = ((List)localObject2);
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            localCommodity.tAU = ((List)localObject2);
            localCommodity.cAa = localJSONObject.getString("transaction_id");
            a(localCommodity, localJSONObject, i);
            label208: k++;
          }
          while (true)
          {
            break;
            if (localList != null)
            {
              String str = localJSONObject.getString("transaction_id");
              localObject2 = localList.iterator();
              if (((Iterator)localObject2).hasNext())
              {
                localCommodity = (Orders.Commodity)((Iterator)localObject2).next();
                if ((str == null) || (!str.equals(localCommodity.cAa)))
                  break label208;
                a(localCommodity, localJSONObject, i);
              }
            }
          }
        }
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.Orders", paramJSONObject, "", new Object[0]);
      }
    while (true)
    {
      AppMethodBeat.o(46836);
      return paramOrders;
      localObject1 = paramJSONObject.optJSONObject("extinfo");
      if (localObject1 != null)
      {
        paramOrders.tAk = (((JSONObject)localObject1).optLong("fetch_pre_arrive_time") * 1000L);
        paramOrders.tAl = ((JSONObject)localObject1).optString("fetch_pre_arrive_time_wording");
      }
      paramOrders.tAA = paramJSONObject.optInt("is_use_new_paid_succ_page", 0);
      paramOrders.tAB = paramJSONObject.optString("pay_succ_btn_wording");
      paramOrders.tAD = paramJSONObject.optInt("is_jsapi_close_page");
      paramOrders.tAF = paramJSONObject.optString("jsapi_tinyapp_username");
      paramOrders.tAG = paramJSONObject.optString("jsapi_tinyapp_path");
      b(paramOrders, paramJSONObject);
      continue;
      ab.w("MicroMsg.Orders", "oldOrders is null");
    }
  }

  private static void a(Orders.Commodity paramCommodity, JSONObject paramJSONObject, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(46837);
    paramCommodity.pcq = paramJSONObject.optString("discount");
    paramCommodity.pce = paramJSONObject.getString("pay_status");
    paramCommodity.pcf = paramJSONObject.getString("pay_status_name");
    paramCommodity.pcj = paramJSONObject.optString("buy_bank_name");
    paramCommodity.pch = paramJSONObject.optInt("pay_timestamp");
    paramCommodity.tAT = paramJSONObject.optString("card_tail");
    paramCommodity.tAh = paramInt;
    paramCommodity.tAV = paramJSONObject.optString("rateinfo");
    paramCommodity.tAW = paramJSONObject.optString("discount_rateinfo");
    paramCommodity.tAX = paramJSONObject.optString("original_feeinfo");
    if (paramJSONObject.has("total_fee"))
      paramCommodity.kCJ = (paramJSONObject.optDouble("total_fee", 0.0D) / 100.0D);
    paramCommodity.tAR = (paramJSONObject.optDouble("original_total_fee", -1.0D) / 100.0D);
    paramCommodity.pcl = paramJSONObject.optString("fee_type", "");
    Object localObject1 = paramJSONObject.optJSONObject("subscribe_biz_info");
    if (localObject1 != null)
    {
      localObject2 = new Orders.Promotions();
      ((Orders.Promotions)localObject2).type = tAP;
      ((Orders.Promotions)localObject2).name = ((JSONObject)localObject1).optString("nickname");
      ((Orders.Promotions)localObject2).pcm = ((JSONObject)localObject1).optString("username");
      paramCommodity.tAS = ((Orders.Promotions)localObject2).pcm;
      ((Orders.Promotions)localObject2).pia = ((JSONObject)localObject1).optString("logo_round_url");
      ((Orders.Promotions)localObject2).url = ((JSONObject)localObject1).optString("subscribe_biz_url");
      if ((!bo.isNullOrNil(((Orders.Promotions)localObject2).name)) && (!bo.isNullOrNil(((Orders.Promotions)localObject2).url)))
      {
        paramCommodity.tBa.add(localObject2);
        paramCommodity.tBb = true;
      }
    }
    Object localObject2 = paramJSONObject.getJSONArray("activity_info");
    int j = ((JSONArray)localObject2).length();
    JSONObject localJSONObject;
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      localJSONObject = ((JSONArray)localObject2).getJSONObject(paramInt);
      localObject1 = new Orders.Promotions();
      ((Orders.Promotions)localObject1).type = tAQ;
      ((Orders.Promotions)localObject1).pia = localJSONObject.optString("icon");
      ((Orders.Promotions)localObject1).name = localJSONObject.optString("wording");
      ((Orders.Promotions)localObject1).url = localJSONObject.optString("url");
      ((Orders.Promotions)localObject1).tzS = localJSONObject.optString("btn_text");
      ((Orders.Promotions)localObject1).tBn = localJSONObject.optInt("type");
      ((Orders.Promotions)localObject1).title = localJSONObject.optString("title");
      ((Orders.Promotions)localObject1).ttW = localJSONObject.optLong("activity_id");
      ((Orders.Promotions)localObject1).tBo = localJSONObject.optInt("activity_type", 0);
      ((Orders.Promotions)localObject1).tBq = localJSONObject.optString("small_title");
      ((Orders.Promotions)localObject1).tBp = localJSONObject.optInt("award_id");
      ((Orders.Promotions)localObject1).tzP = localJSONObject.optInt("send_record_id");
      ((Orders.Promotions)localObject1).tzQ = localJSONObject.optInt("user_record_id");
      ((Orders.Promotions)localObject1).tBr = localJSONObject.optString("activity_tinyapp_username");
      ((Orders.Promotions)localObject1).tBs = localJSONObject.optString("activity_tinyapp_path");
      ((Orders.Promotions)localObject1).tzR = localJSONObject.optLong("activity_mch_id");
      ((Orders.Promotions)localObject1).tBt = localJSONObject.optInt("activity_tinyapp_version");
      ((Orders.Promotions)localObject1).tBu = localJSONObject.optString("get_award_params");
      ((Orders.Promotions)localObject1).tBv = localJSONObject.optString("query_award_status_params");
      a((Orders.Promotions)localObject1, localJSONObject.optJSONObject("exposure_info"));
      paramCommodity.tBa.add(localObject1);
    }
    localObject2 = paramJSONObject.optJSONObject("link_ativity_info");
    if (localObject2 != null)
    {
      paramCommodity.tBc.text = ((JSONObject)localObject2).optString("text");
      paramCommodity.tBc.url = ((JSONObject)localObject2).optString("url");
    }
    localObject2 = paramJSONObject.optJSONArray("discount_array");
    if (localObject2 != null)
    {
      j = ((JSONArray)localObject2).length();
      for (paramInt = i; paramInt < j; paramInt++)
      {
        localJSONObject = ((JSONArray)localObject2).optJSONObject(paramInt);
        localObject1 = new Orders.DiscountInfo();
        if (localJSONObject != null)
        {
          ((Orders.DiscountInfo)localObject1).tBm = localJSONObject.optDouble("payment_amount");
          ((Orders.DiscountInfo)localObject1).pOz = localJSONObject.optString("favor_desc");
          paramCommodity.tAU.add(localObject1);
        }
      }
    }
    localObject2 = paramJSONObject.optJSONObject("tinyapp_info");
    if (localObject2 != null)
    {
      if (paramCommodity.tAY == null)
        paramCommodity.tAY = new Orders.RecommendTinyAppInfo();
      paramCommodity.tAY.ttf = ((JSONObject)localObject2).optString("tinyapp_name");
      paramCommodity.tAY.tzU = ((JSONObject)localObject2).optString("tinyapp_logo");
      paramCommodity.tAY.tzV = ((JSONObject)localObject2).optString("tinyapp_desc");
      paramCommodity.tAY.tzW = ((JSONObject)localObject2).optString("tinyapp_username");
      paramCommodity.tAY.ttg = ((JSONObject)localObject2).optString("tinyapp_path");
      paramCommodity.tAY.tzX = ((JSONObject)localObject2).optString("activity_tinyapp_btn_text");
      paramCommodity.tAY.tBx = ((JSONObject)localObject2).optLong("activity_id");
      paramCommodity.tAY.tBy = ((JSONObject)localObject2).optLong("activity_type");
      paramCommodity.tAY.tBz = ((JSONObject)localObject2).optLong("award_id");
      paramCommodity.tAY.tBA = ((JSONObject)localObject2).optInt("send_record_id");
      paramCommodity.tAY.tBB = ((JSONObject)localObject2).optInt("user_record_id");
      paramCommodity.tAY.tBC = ((JSONObject)localObject2).optLong("activity_mch_id");
      paramCommodity.tAY.tzY = ((JSONObject)localObject2).optInt("tinyapp_version");
    }
    paramJSONObject = paramJSONObject.optJSONObject("remarks_info");
    if (paramJSONObject != null)
    {
      if (paramCommodity.tAZ == null)
        paramCommodity.tAZ = new Orders.RemarksInfo();
      paramCommodity.tAZ.tBD = paramJSONObject.optString("remark_title");
      paramCommodity.tAZ.tBE = paramJSONObject.optString("remark_desc");
    }
    AppMethodBeat.o(46837);
  }

  public static void a(Orders.Promotions paramPromotions, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46838);
    ab.i("MicroMsg.Orders", "parseExposureInfo: %s", new Object[] { paramJSONObject });
    if (paramJSONObject == null)
    {
      paramPromotions.tBw = null;
      AppMethodBeat.o(46838);
    }
    while (true)
    {
      return;
      try
      {
        d.a.a.c localc = new d/a/a/c;
        localc.<init>();
        Object localObject1 = paramJSONObject.optJSONArray("single_exposure_info_list");
        Object localObject3;
        if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
        {
          localObject2 = new java/util/LinkedList;
          ((LinkedList)localObject2).<init>();
          localc.wew = ((LinkedList)localObject2);
          for (int i = 0; i < ((JSONArray)localObject1).length(); i++)
          {
            localObject2 = ((JSONArray)localObject1).getJSONObject(i);
            localObject3 = new d/a/a/g;
            ((d.a.a.g)localObject3).<init>();
            ((d.a.a.g)localObject3).pia = ((JSONObject)localObject2).optString("logo");
            ((d.a.a.g)localObject3).BTP = ((JSONObject)localObject2).optString("award_name");
            ((d.a.a.g)localObject3).BTQ = ((JSONObject)localObject2).optString("award_description");
            ((d.a.a.g)localObject3).BTR = ((JSONObject)localObject2).optString("background_img");
            ((d.a.a.g)localObject3).BTT = ((JSONObject)localObject2).optString("award_description_color");
            ((d.a.a.g)localObject3).BTS = ((JSONObject)localObject2).optString("award_name_color");
            localc.wew.add(localObject3);
          }
        }
        localc.BTA = paramJSONObject.optInt("is_query_others", 0);
        localc.wdr = paramJSONObject.optString("draw_lottery_params");
        localc.wex = paramJSONObject.optInt("is_show_btn");
        localc.BTE = paramJSONObject.optString("background_img_whole");
        Object localObject2 = paramJSONObject.optJSONObject("btn_info");
        if (localObject2 != null)
        {
          localObject1 = new d/a/a/a;
          ((d.a.a.a)localObject1).<init>();
          localc.wey = ((d.a.a.a)localObject1);
          localc.wey.BTs = ((JSONObject)localObject2).optString("btn_words");
          localc.wey.BTt = ((JSONObject)localObject2).optString("btn_color");
          localc.wey.BTu = ((JSONObject)localObject2).optInt("btn_op_type");
          localc.wey.url = ((JSONObject)localObject2).optString("url");
          localc.wey.wqf = ((JSONObject)localObject2).optString("get_lottery_params");
          localObject1 = ((JSONObject)localObject2).optJSONObject("mini_app_info");
          if (localObject1 != null)
          {
            localObject2 = localc.wey;
            localObject3 = new d/a/a/f;
            ((d.a.a.f)localObject3).<init>();
            ((d.a.a.a)localObject2).BTv = ((d.a.a.f)localObject3);
            localc.wey.BTv.wMk = ((JSONObject)localObject1).optString("activity_tinyapp_username");
            localc.wey.BTv.wMl = ((JSONObject)localObject1).optString("activity_tinyapp_path");
            localc.wey.BTv.wMm = ((JSONObject)localObject1).optInt("activity_tinyapp_version");
          }
        }
        localc.wev = paramJSONObject.optString("exposure_info_modify_params");
        localc.BTB = paramJSONObject.optInt("user_opertaion_type");
        localc.BTC = paramJSONObject.optInt("is_show_layer");
        localObject1 = paramJSONObject.optJSONObject("layer_info");
        if (localObject1 != null)
        {
          localObject2 = new d/a/a/e;
          ((d.a.a.e)localObject2).<init>();
          localc.BTD = ((d.a.a.e)localObject2);
          localc.BTD.BTG = ((JSONObject)localObject1).optString("layer_title");
          localc.BTD.BTH = ((JSONObject)localObject1).optString("layer_logo");
          localc.BTD.BTI = ((JSONObject)localObject1).optString("layer_type");
          localc.BTD.BTJ = ((JSONObject)localObject1).optString("layer_name");
          localc.BTD.BTK = ((JSONObject)localObject1).optString("layer_description");
          localc.BTD.BTL = ((JSONObject)localObject1).optInt("is_show_layer_btn");
          if (!bo.isNullOrNil(((JSONObject)localObject1).optString("voice_url")))
          {
            localObject2 = localc.BTD;
            localObject3 = new com/tencent/mm/bt/b;
            ((com.tencent.mm.bt.b)localObject3).<init>(((JSONObject)localObject1).optString("voice_url").getBytes());
            ((d.a.a.e)localObject2).BTN = ((com.tencent.mm.bt.b)localObject3);
          }
          if (!bo.isNullOrNil(((JSONObject)localObject1).optString("voice_data")))
          {
            localObject2 = localc.BTD;
            localObject3 = new com/tencent/mm/bt/b;
            ((com.tencent.mm.bt.b)localObject3).<init>(((JSONObject)localObject1).optString("voice_data").getBytes());
            ((d.a.a.e)localObject2).BTO = ((com.tencent.mm.bt.b)localObject3);
          }
          localObject2 = ((JSONObject)localObject1).optJSONObject("layer_btn_info");
          if (localObject2 != null)
          {
            localObject1 = localc.BTD;
            localObject3 = new d/a/a/d;
            ((d.a.a.d)localObject3).<init>();
            ((d.a.a.e)localObject1).BTM = ((d.a.a.d)localObject3);
            localc.BTD.BTM.BTs = ((JSONObject)localObject2).optString("btn_words");
            localc.BTD.BTM.BTt = ((JSONObject)localObject2).optString("btn_color");
            localc.BTD.BTM.BTu = ((JSONObject)localObject2).optInt("btn_op_type");
            localc.BTD.BTM.wqf = ((JSONObject)localObject2).optString("get_lottery_params");
            localc.BTD.BTM.url = ((JSONObject)localObject2).optString("url");
            localObject2 = ((JSONObject)localObject2).optJSONObject("mini_app_info");
            if (localObject2 != null)
            {
              localObject3 = localc.BTD.BTM;
              localObject1 = new d/a/a/f;
              ((d.a.a.f)localObject1).<init>();
              ((d.a.a.d)localObject3).BTv = ((d.a.a.f)localObject1);
              localc.BTD.BTM.BTv.wMk = ((JSONObject)localObject2).optString("activity_tinyapp_username");
              localc.BTD.BTM.BTv.wMl = ((JSONObject)localObject2).optString("activity_tinyapp_path");
              localc.BTD.BTM.BTv.wMm = ((JSONObject)localObject2).optInt("activity_tinyapp_version");
            }
          }
        }
        localObject1 = paramJSONObject.optJSONObject("draw_lottery_info");
        if (localObject1 != null)
        {
          paramJSONObject = new d/a/a/b;
          paramJSONObject.<init>();
          localc.BTF = paramJSONObject;
          localc.BTF.url = ((JSONObject)localObject1).optString("url");
          localc.BTF.BTw = ((JSONObject)localObject1).optString("animation_wording");
          localc.BTF.BTx = ((JSONObject)localObject1).optString("animation_wording_color");
          localc.BTF.BTy = ((JSONObject)localObject1).optString("after_animation_wording");
          localc.BTF.BTz = ((JSONObject)localObject1).optString("after_animation_wording_color");
          localc.BTF.xis = ((JSONObject)localObject1).optInt("op_type");
          paramJSONObject = ((JSONObject)localObject1).optJSONObject("mini_app_info");
          if (paramJSONObject != null)
          {
            localObject1 = localc.BTF;
            localObject2 = new d/a/a/f;
            ((d.a.a.f)localObject2).<init>();
            ((d.a.a.b)localObject1).BTv = ((d.a.a.f)localObject2);
            localc.BTF.BTv.wMk = paramJSONObject.optString("activity_tinyapp_username");
            localc.BTF.BTv.wMl = paramJSONObject.optString("activity_tinyapp_path");
            localc.BTF.BTv.wMm = paramJSONObject.optInt("activity_tinyapp_version");
          }
        }
        paramPromotions.tBw = localc;
        AppMethodBeat.o(46838);
      }
      catch (Exception paramPromotions)
      {
        ab.printErrStackTrace("MicroMsg.Orders", paramPromotions, "parseExposureInfo error: %s", new Object[] { paramPromotions.getMessage() });
        AppMethodBeat.o(46838);
      }
    }
  }

  private static void a(Orders paramOrders, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46839);
    int i;
    if (paramJSONObject != null)
    {
      ab.i("MicroMsg.Orders", "parseDeductInfo json is not null");
      paramOrders.tAv = new Orders.DeductInfo();
      paramOrders.tAv.title = paramJSONObject.optString("contract_title");
      paramOrders.tAv.desc = paramJSONObject.optString("contract_desc");
      paramOrders.tAv.tpY = paramJSONObject.optInt("auto_deduct_flag", 0);
      paramOrders.tAv.tBd = paramJSONObject.optString("contract_url");
      paramOrders.tAv.tBf = paramJSONObject.optInt("is_select_pay_way", 0);
      paramOrders.tAv.tpl = paramJSONObject.optInt("deduct_show_type", 0);
      paramOrders.tAv.kdE = paramJSONObject.optString("button_wording", "");
      paramOrders.tAv.tpm = paramJSONObject.optString("deduct_rule_wording", "");
      paramOrders.tAv.tBg = paramJSONObject.optString("open_deduct_wording", "");
      paramOrders.tAv.tBh = paramJSONObject.optString("open_deduct_wording_color", "");
      paramJSONObject = paramJSONObject.optJSONArray("show_info");
      i = paramJSONObject.length();
      if (i > 0)
      {
        paramOrders.tAv.tBe = new ArrayList();
        int j = 0;
        if (j < i)
        {
          JSONObject localJSONObject = paramJSONObject.optJSONObject(j);
          if (localJSONObject != null)
          {
            Orders.DeductShowInfo localDeductShowInfo = new Orders.DeductShowInfo();
            localDeductShowInfo.name = localJSONObject.optString("name");
            localDeductShowInfo.value = localJSONObject.optString("value");
            localJSONObject = localJSONObject.optJSONObject("value_attr");
            if (localJSONObject != null)
            {
              localDeductShowInfo.tBi = localJSONObject.optInt("link_type", 0);
              localDeductShowInfo.tBj = localJSONObject.optString("link_weapp");
              localDeductShowInfo.tBk = localJSONObject.optString("link_addr");
              localDeductShowInfo.tBl = localJSONObject.optString("link_url");
            }
            paramOrders.tAv.tBe.add(localDeductShowInfo);
          }
          while (true)
          {
            j++;
            break;
            ab.e("MicroMsg.Orders", "parseDeductInfo's showInfo get a null value from json,index=".concat(String.valueOf(j)));
          }
        }
        AppMethodBeat.o(46839);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.Orders", "parseDeductInfo's showInfo len is ".concat(String.valueOf(i)));
      AppMethodBeat.o(46839);
      continue;
      ab.i("MicroMsg.Orders", "parseDeductInfo json is null");
      AppMethodBeat.o(46839);
    }
  }

  private static h aB(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46835);
    h localh = new h();
    paramJSONObject = paramJSONObject.optJSONObject("favinfo");
    if (paramJSONObject == null)
    {
      ab.d("MicroMsg.Orders", "Parse getJsonObject(favinfo) null");
      AppMethodBeat.o(46835);
    }
    while (true)
    {
      return localh;
      localh.tmR = (paramJSONObject.optLong("tradeAmount") / 100.0D);
      localh.tmS = (paramJSONObject.optLong("totalFavAmount") / 100.0D);
      localh.tmT = (paramJSONObject.optLong("afterFavorTradeAmount") / 100.0D);
      localh.tmU = paramJSONObject.optString("favorComposeId");
      localh.tmX = paramJSONObject.optInt("useNaturalDefense");
      localh.tmY = paramJSONObject.optString("discountWording");
      localh.tmZ = paramJSONObject.optString("favorRuleWording");
      localh.tna = (paramJSONObject.optDouble("showFavorAmount", 0.0D) / 100.0D);
      localh.tnb = (paramJSONObject.optDouble("invariableFavorAmount", 0.0D) / 100.0D);
      localh.tnc = paramJSONObject.optInt("isVariableFavor");
      localh.tnd = paramJSONObject.optString("invariableFavorDesc");
      localh.tne = paramJSONObject.optString("variableFavorDesc");
      Object localObject1 = paramJSONObject.optJSONArray("tradeFavList");
      int j;
      Object localObject4;
      for (int i = 0; i < ((JSONArray)localObject1).length(); i++)
      {
        localObject2 = ((JSONArray)localObject1).getJSONObject(i);
        localObject3 = new t();
        ((t)localObject3).tnJ = ((JSONObject)localObject2).optInt("favType");
        ((t)localObject3).tnK = ((JSONObject)localObject2).optInt("favSubType");
        ((t)localObject3).tnL = ((JSONObject)localObject2).optLong("favProperty");
        ((t)localObject3).tnM = ((JSONObject)localObject2).optString("favorTypeDesc");
        ((t)localObject3).tmO = ((JSONObject)localObject2).optString("favId");
        ((t)localObject3).tnN = ((JSONObject)localObject2).optString("favName");
        ((t)localObject3).tnO = ((JSONObject)localObject2).optString("favDesc");
        ((t)localObject3).tmP = ((JSONObject)localObject2).optString("favorUseManual");
        ((t)localObject3).tmQ = ((JSONObject)localObject2).optString("favorRemarks");
        ((t)localObject3).tnP = (((JSONObject)localObject2).optLong("favPrice") / 100.0D);
        ((t)localObject3).tnQ = (((JSONObject)localObject2).optLong("realFavFee") / 100.0D);
        ((t)localObject3).tnR = ((JSONObject)localObject2).optInt("needBankPay");
        ((t)localObject3).tnS = ((JSONObject)localObject2).optString("bankNo");
        ((t)localObject3).pcj = ((JSONObject)localObject2).optString("bankName");
        ((t)localObject3).tnT = ((JSONObject)localObject2).optString("bankLogoUrl");
        localObject2 = ((JSONObject)localObject2).optJSONArray("bind_serial_list");
        if ((localObject2 != null) && (((JSONArray)localObject2).length() > 0))
          for (j = 0; j < ((JSONArray)localObject2).length(); j++)
          {
            localObject4 = ((JSONArray)localObject2).optString(j);
            ((t)localObject3).tnU.add(com.tencent.mm.bt.b.bI(((String)localObject4).getBytes()));
          }
        localh.tmV.add(localObject3);
      }
      Object localObject3 = paramJSONObject.optJSONObject("favorComposeList");
      Object localObject5;
      if (localObject3 != null)
      {
        localh.tmW = new i();
        localObject3 = ((JSONObject)localObject3).optJSONArray("favorComposeInfo");
        for (i = 0; i < ((JSONArray)localObject3).length(); i++)
        {
          localObject2 = ((JSONArray)localObject3).getJSONObject(i);
          localObject1 = new j();
          ((j)localObject1).tnk = ((JSONObject)localObject2).optString("faovrComposeId");
          ((j)localObject1).tnl = (((JSONObject)localObject2).optLong("totalFavorAmount") / 100.0D);
          ((j)localObject1).tmT = (((JSONObject)localObject2).optLong("afterFavorTradeAmount") / 100.0D);
          ((j)localObject1).tna = (((JSONObject)localObject2).optDouble("showFavorAmount", 0.0D) / 100.0D);
          ((j)localObject1).tnb = (((JSONObject)localObject2).optDouble("invariableFavorAmount", 0.0D) / 100.0D);
          ((j)localObject1).tnc = ((JSONObject)localObject2).optInt("isVariableFavor");
          ((j)localObject1).tnd = ((JSONObject)localObject2).optString("invariableFavorDesc");
          ((j)localObject1).tne = ((JSONObject)localObject2).optString("variableFavorDesc");
          localObject5 = ((JSONObject)localObject2).optJSONArray("composeArray");
          for (j = 0; j < ((JSONArray)localObject5).length(); j++)
          {
            localObject4 = ((JSONArray)localObject5).getJSONObject(j);
            localObject2 = new com.tencent.mm.plugin.wallet.a.f();
            ((com.tencent.mm.plugin.wallet.a.f)localObject2).tmO = ((JSONObject)localObject4).optString("favId");
            ((com.tencent.mm.plugin.wallet.a.f)localObject2).tmP = ((JSONObject)localObject4).optString("favorUseManual");
            ((com.tencent.mm.plugin.wallet.a.f)localObject2).tmQ = ((JSONObject)localObject4).optString("favorRemarks");
            ((j)localObject1).tnm.add(localObject2);
          }
          localh.tmW.tni.add(localObject1);
        }
      }
      localObject3 = new com.tencent.mm.plugin.wallet.a.a();
      Object localObject2 = paramJSONObject.optJSONObject("bank_card_info");
      if (localObject2 != null)
      {
        localObject1 = ((JSONObject)localObject2).optJSONArray("bind_serial_favor_info_list");
        if (localObject1 != null)
          for (i = 0; i < ((JSONArray)localObject1).length(); i++)
          {
            localObject4 = new com.tencent.mm.plugin.wallet.a.c();
            localObject5 = ((JSONArray)localObject1).getJSONObject(i);
            ((com.tencent.mm.plugin.wallet.a.c)localObject4).pbo = ((JSONObject)localObject5).optString("bind_serial");
            JSONArray localJSONArray = ((JSONObject)localObject5).optJSONArray("bind_serial_favor_list");
            if ((localJSONArray != null) && (localJSONArray.length() > 0))
              for (j = 0; j < localJSONArray.length(); j++)
              {
                com.tencent.mm.plugin.wallet.a.d locald = new com.tencent.mm.plugin.wallet.a.d();
                localObject5 = localJSONArray.optJSONObject(j);
                locald.pOz = ((JSONObject)localObject5).optString("favor_desc");
                locald.tmM = ((JSONObject)localObject5).optInt("is_default_show", 0);
                ((com.tencent.mm.plugin.wallet.a.c)localObject4).tmL.add(locald);
              }
            ((com.tencent.mm.plugin.wallet.a.a)localObject3).tmA.add(localObject4);
          }
        localObject1 = ((JSONObject)localObject2).optJSONObject("new_bind_card_info").optJSONArray("new_bind_card_favor_list");
        if ((localObject1 != null) && (((JSONArray)localObject1).length() > 0))
        {
          ((com.tencent.mm.plugin.wallet.a.a)localObject3).tmB = new n();
          for (i = 0; i < ((JSONArray)localObject1).length(); i++)
          {
            localObject2 = new o();
            ((o)localObject2).pOz = ((JSONArray)localObject1).optJSONObject(i).optString("favor_desc");
            ((com.tencent.mm.plugin.wallet.a.a)localObject3).tmB.tns.add(localObject2);
          }
        }
      }
      localh.tnf = ((com.tencent.mm.plugin.wallet.a.a)localObject3);
      localObject1 = paramJSONObject.optJSONArray("favcombid_forbindcard_list");
      if (localObject1 != null)
      {
        j = ((JSONArray)localObject1).length();
        for (i = 0; i < j; i++)
        {
          localObject2 = ((JSONArray)localObject1).optJSONObject(i);
          if (localObject2 != null)
          {
            localObject3 = new com.tencent.mm.plugin.wallet.a.g();
            ((com.tencent.mm.plugin.wallet.a.g)localObject3).tmE = ((JSONObject)localObject2).optString("default_fav_comb_id");
            localObject4 = ((JSONObject)localObject2).optJSONObject("payment_channel");
            if (localObject4 != null)
            {
              localObject2 = new m();
              ((m)localObject2).pbo = ((JSONObject)localObject4).optString("bind_serial");
              ((m)localObject2).jkL = ((JSONObject)localObject4).optInt("selected");
              ((m)localObject2).tnr = ((JSONObject)localObject4).optString("bankCode");
              ((com.tencent.mm.plugin.wallet.a.g)localObject3).tmC = ((m)localObject2);
            }
            localh.tng.add(localObject3);
          }
        }
      }
      localObject3 = new com.tencent.mm.plugin.wallet.a.b();
      localObject2 = paramJSONObject.optJSONObject("bank_fav_guide");
      if (localObject2 != null)
      {
        paramJSONObject = new m();
        localObject1 = ((JSONObject)localObject2).optJSONObject("payment_channel");
        if (localObject1 != null)
        {
          paramJSONObject.tnr = ((JSONObject)localObject1).optString("bankCode");
          paramJSONObject.jkL = ((JSONObject)localObject1).optInt("selected");
          paramJSONObject.pbo = ((JSONObject)localObject1).optString("bind_serial");
          ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmC = paramJSONObject;
        }
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmD = ((JSONObject)localObject2).optInt("is_show_guide");
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmE = ((JSONObject)localObject2).optString("default_fav_comb_id");
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmF = ((JSONObject)localObject2).optString("guide_content");
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmG = ((JSONObject)localObject2).optString("guide_content_color");
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmH = ((JSONObject)localObject2).optString("guide_btn_text");
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmI = ((JSONObject)localObject2).optString("guide_btn_text_color");
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmJ = ((JSONObject)localObject2).optString("guide_btn_bg_color");
        ((com.tencent.mm.plugin.wallet.a.b)localObject3).tmK = ((JSONObject)localObject2).optString("guide_logo");
        localh.tnh = ((com.tencent.mm.plugin.wallet.a.b)localObject3);
      }
      AppMethodBeat.o(46835);
    }
  }

  private static HashSet<String> acx(String paramString)
  {
    AppMethodBeat.i(46842);
    HashSet localHashSet = new HashSet();
    if (!bo.isNullOrNil(paramString))
    {
      paramString = paramString.split("\\|");
      int i = paramString.length;
      for (int j = 0; j < i; j++)
        localHashSet.add(paramString[j]);
      if (localHashSet.size() <= 0)
        break label74;
      localHashSet.retainAll(localHashSet);
    }
    while (true)
    {
      AppMethodBeat.o(46842);
      return localHashSet;
      label74: localHashSet.clear();
    }
  }

  public static Orders ap(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46834);
    Orders localOrders = null;
    if (paramJSONObject != null)
      localOrders = new Orders();
    try
    {
      localOrders.tzZ = bo.anU();
      localOrders.pTN = com.tencent.mm.wallet_core.ui.e.b(paramJSONObject.optString("total_fee"), "100", RoundingMode.HALF_UP);
      localOrders.ekv = paramJSONObject.getString("num");
      localOrders.tuo = paramJSONObject.optInt("bank_card_tag", 1);
      localOrders.pcl = paramJSONObject.optString("fee_type", "");
      localOrders.pPp = com.tencent.mm.wallet_core.ui.e.b(paramJSONObject.optString("charge_fee"), "100", RoundingMode.HALF_UP);
      localOrders.tAa = com.tencent.mm.wallet_core.ui.e.b(paramJSONObject.optString("fetch_fee"), "100", RoundingMode.HALF_UP);
      localOrders.tAb = paramJSONObject.optInt("is_assign_userinfo_pay");
      localOrders.twd = paramJSONObject.optString("true_name");
      localOrders.tyA = paramJSONObject.optString("cre_id");
      localOrders.tAc = paramJSONObject.optInt("ce_type");
      localOrders.tAd = paramJSONObject.optString("assign_pay_info");
      localObject1 = paramJSONObject.getJSONArray("Array");
      localOrders.tAw = paramJSONObject.optLong("free_fee");
      localOrders.tAx = paramJSONObject.optLong("remain_fee");
      localOrders.tAy = paramJSONObject.optInt("not_support_bind_card", 0);
      localOrders.tAz = paramJSONObject.optInt("not_support_retry", 0);
      if (paramJSONObject.optInt("support_all_bank", 0) == 1);
      for (i = 1; ; i = 0)
      {
        if (i != 0)
        {
          localObject2 = new java/util/HashSet;
          ((HashSet)localObject2).<init>();
          localOrders.tAn = ((Set)localObject2);
        }
        int j = ((JSONArray)localObject1).length();
        for (int k = 0; k < j; k++)
        {
          JSONObject localJSONObject = ((JSONArray)localObject1).getJSONObject(k);
          Orders.Commodity localCommodity = new com/tencent/mm/plugin/wallet_core/model/Orders$Commodity;
          localCommodity.<init>();
          localCommodity.desc = localJSONObject.getString("desc");
          localCommodity.kCJ = com.tencent.mm.wallet_core.ui.e.b(localJSONObject.optString("fee"), "100", RoundingMode.HALF_UP);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localCommodity.pcc = localJSONObject.optInt("count", 1);
          localCommodity.pce = localJSONObject.getString("pay_status");
          localCommodity.pcj = localJSONObject.optString("buy_bank_name");
          localCommodity.pcf = localJSONObject.getString("pay_status_name");
          localCommodity.pbZ = localJSONObject.optString("spid");
          localCommodity.pca = localJSONObject.optString("sp_name");
          localCommodity.pch = localJSONObject.optInt("modify_timestamp");
          localCommodity.cAa = localJSONObject.getString("transaction_id");
          localCommodity.pcl = localJSONObject.optString("fee_type");
          if (bo.isNullOrNil(localOrders.pcl))
            localOrders.pcl = localCommodity.pcl;
          localCommodity.pcm = localJSONObject.optString("appusername");
          localCommodity.pbP = localJSONObject.optString("app_telephone");
          localOrders.tAq.add(localCommodity);
          if (i == 0)
          {
            localOrders.tAm = localJSONObject.optString("support_bank");
            localOrders.tAn = acx(localOrders.tAm);
          }
        }
      }
      if (paramJSONObject.has("is_open_fee_protocal"))
      {
        localOrders.tAi = com.tencent.mm.wallet_core.ui.e.n(paramJSONObject, "is_open_fee_protocal");
        localOrders.tAr = aB(paramJSONObject);
        localObject1 = paramJSONObject.optJSONObject("bindqueryresp");
        if (localObject1 != null)
          break label921;
        ab.e("MicroMsg.Orders", "bindqueryresp is null ");
        localOrders.tAs = paramJSONObject.optInt("needbindcardtoshowfavinfo");
        localOrders.tAt = paramJSONObject.optString("discount_wording");
        localOrders.tAu = paramJSONObject.optString("favor_rule_wording");
        a(localOrders, paramJSONObject.optJSONObject("entrustpayinfo"));
        localObject1 = paramJSONObject.optString("field_area_info");
        if (!bo.isNullOrNil((String)localObject1))
          localObject2 = Base64.decode((String)localObject1, 0);
      }
    }
    catch (JSONException paramJSONObject)
    {
      try
      {
        Object localObject1;
        int i;
        Object localObject2;
        while (true)
        {
          localObject1 = new com/tencent/mm/protocal/protobuf/aca;
          ((aca)localObject1).<init>();
          localObject1 = (aca)((aca)localObject1).parseFrom((byte[])localObject2);
          localOrders.field_infos.addAll(((aca)localObject1).field_info);
          localOrders.tAH = paramJSONObject.optString("price_total_fee", "0");
          localOrders.tAI = paramJSONObject.optString("price_fee_type", "");
          localOrders.tAJ = paramJSONObject.optString("price_fee_symbol", "");
          localOrders.tAK = paramJSONObject.optString("settlement_fee", "0");
          localOrders.tAL = paramJSONObject.optString("settlement_type", "");
          localOrders.tAM = paramJSONObject.optString("settlement_symbol", "");
          localOrders.tAN = paramJSONObject.optInt("is_open_field_area", 0);
          paramJSONObject = paramJSONObject.optJSONObject("bindqueryresp");
          if (paramJSONObject != null)
          {
            paramJSONObject = paramJSONObject.optJSONObject("simple_cashier_info");
            if (paramJSONObject != null)
            {
              localObject1 = new com/tencent/mm/plugin/wallet_core/model/Orders$SimpleCashierInfo;
              ((Orders.SimpleCashierInfo)localObject1).<init>();
              localOrders.tAO = ((Orders.SimpleCashierInfo)localObject1);
              localOrders.tAO.tBL = paramJSONObject.optInt("use_simple_cashier");
              localOrders.tAO.pbn = paramJSONObject.optString("bank_type");
              localOrders.tAO.pbo = paramJSONObject.optString("bind_serial");
            }
          }
          while (true)
          {
            AppMethodBeat.o(46834);
            return localOrders;
            localOrders.tAi = Bankcard.gh(localOrders.tuo, 2);
            break;
            paramJSONObject = paramJSONObject;
            ab.printErrStackTrace("MicroMsg.Orders", paramJSONObject, "", new Object[0]);
          }
          label921: localObject1 = ((JSONObject)localObject1).optJSONObject("user_info");
          if (localObject1 == null)
          {
            ab.e("MicroMsg.Orders", "user_info is null ");
          }
          else
          {
            localObject2 = ((JSONObject)localObject1).optJSONObject("touch_info");
            if (localObject2 != null)
              break;
            ab.e("MicroMsg.Orders", "touch_info is null ");
          }
        }
        if (com.tencent.mm.wallet_core.ui.e.dOL())
        {
          i = ((JSONObject)localObject2).optInt("use_touch_pay", 0);
          label987: localOrders.tAo = i;
          localOrders.tAp = ((JSONObject)localObject2).optString("touch_forbidword");
          localObject1 = ((JSONObject)localObject2).optString("touch_challenge");
          if (1 != ((JSONObject)localObject2).optInt("need_change_auth_key"))
            break label1086;
        }
        label1086: for (boolean bool = true; ; bool = false)
        {
          v.tCn.msn = ((String)localObject1);
          v.tCn.mso = bool;
          ab.i("MicroMsg.Orders", "hy: use_touch_pay is %s, challenge is: %s, is need change: %b", new Object[] { Integer.valueOf(localOrders.tAo), localObject1, Boolean.valueOf(bool) });
          break;
          i = 0;
          break label987;
        }
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Orders", localIOException, "", new Object[0]);
      }
    }
  }

  private static void b(Orders paramOrders, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(46840);
    if (paramJSONObject != null);
    while (true)
    {
      try
      {
        paramOrders.tAC = paramJSONObject.optInt("is_use_show_info", 0);
        ab.i("MicroMsg.Orders", "is_use_show_info: %s", new Object[] { Integer.valueOf(paramOrders.tAC) });
        paramJSONObject = paramJSONObject.optJSONArray("show_info");
        if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
        {
          ab.i("MicroMsg.Orders", "showInfo size: %s", new Object[] { Integer.valueOf(paramJSONObject.length()) });
          Object localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          paramOrders.tAE = ((ArrayList)localObject);
          int i = 0;
          if (i < paramJSONObject.length())
          {
            JSONObject localJSONObject = paramJSONObject.optJSONObject(i);
            if (localJSONObject != null)
            {
              localObject = new com/tencent/mm/plugin/wallet_core/model/Orders$ShowInfo;
              ((Orders.ShowInfo)localObject).<init>();
              ((Orders.ShowInfo)localObject).name = localJSONObject.optString("name");
              ((Orders.ShowInfo)localObject).value = localJSONObject.optString("value");
              ((Orders.ShowInfo)localObject).mVA = localJSONObject.optString("name_color");
              ((Orders.ShowInfo)localObject).tBF = localJSONObject.optString("value_color");
              localJSONObject = localJSONObject.optJSONObject("value_attr");
              if (localJSONObject != null)
              {
                ((Orders.ShowInfo)localObject).tBG = localJSONObject.optInt("link_type");
                ((Orders.ShowInfo)localObject).tBH = localJSONObject.optString("link_weapp");
                ((Orders.ShowInfo)localObject).tBI = localJSONObject.optString("link_addr");
                ((Orders.ShowInfo)localObject).tBJ = localJSONObject.optString("link_url");
                ((Orders.ShowInfo)localObject).tBK = localJSONObject.optInt("text_attr");
              }
              if ((!bo.isNullOrNil(((Orders.ShowInfo)localObject).name)) || (!bo.isNullOrNil(((Orders.ShowInfo)localObject).value)))
                paramOrders.tAE.add(localObject);
            }
            i++;
            continue;
          }
        }
        AppMethodBeat.o(46840);
        return;
      }
      catch (Exception paramOrders)
      {
        ab.printErrStackTrace("MicroMsg.Orders", paramOrders, "parseShowInfo error", new Object[0]);
      }
      AppMethodBeat.o(46840);
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    AppMethodBeat.i(46841);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("reqKey:").append(this.czZ).append("\n");
    ((StringBuilder)localObject).append("token").append(this.token).append("\n");
    ((StringBuilder)localObject).append("num").append(this.ekv).append("\n");
    ((StringBuilder)localObject).append("totalFee").append(this.pTN).append("\n");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(46841);
    return localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46844);
    paramParcel.writeLong(this.tzZ);
    paramParcel.writeString(this.czZ);
    paramParcel.writeString(this.token);
    paramParcel.writeString(this.ekv);
    paramParcel.writeDouble(this.pTN);
    paramParcel.writeInt(this.tuo);
    paramParcel.writeString(this.pcl);
    paramParcel.writeDouble(this.pPp);
    paramParcel.writeDouble(this.tAa);
    paramParcel.writeInt(this.tAb);
    paramParcel.writeString(this.twd);
    paramParcel.writeString(this.tyA);
    paramParcel.writeInt(this.tAc);
    paramParcel.writeString(this.tAd);
    paramParcel.writeString(this.username);
    paramParcel.writeString(this.nickname);
    paramParcel.writeString(this.oRi);
    paramParcel.writeString(this.tAe);
    paramParcel.writeString(this.tAf);
    paramParcel.writeString(this.tAg);
    paramParcel.writeInt(this.tAh);
    if (this.tAi);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.tAj);
      paramParcel.writeString(this.lvz);
      paramParcel.writeLong(this.tAk);
      paramParcel.writeString(this.tAl);
      paramParcel.writeTypedList(this.tAq);
      paramParcel.writeString(this.tAm);
      paramParcel.writeInt(this.tAo);
      paramParcel.writeString(this.tAp);
      paramParcel.writeParcelable(this.tAv, 1);
      paramParcel.writeInt(this.tAy);
      paramParcel.writeInt(this.tAz);
      paramParcel.writeInt(this.tAD);
      paramParcel.writeString(this.tAG);
      paramParcel.writeString(this.tAF);
      paramParcel.writeInt(this.tAC);
      paramParcel.writeTypedList(this.tAE);
      paramParcel.writeParcelable(this.tAO, 1);
      AppMethodBeat.o(46844);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.Orders
 * JD-Core Version:    0.6.2
 */