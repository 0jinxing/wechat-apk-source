package com.tencent.mm.plugin.card.d;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.protocal.protobuf.aci;
import com.tencent.mm.protocal.protobuf.arp;
import com.tencent.mm.protocal.protobuf.ax;
import com.tencent.mm.protocal.protobuf.bzi;
import com.tencent.mm.protocal.protobuf.cgf;
import com.tencent.mm.protocal.protobuf.cma;
import com.tencent.mm.protocal.protobuf.lh;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.nz;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.op;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.protocal.protobuf.wy;
import com.tencent.mm.protocal.protobuf.wz;
import com.tencent.mm.protocal.protobuf.xt;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
{
  private static no H(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(88858);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserCardDataInfo json is null");
      AppMethodBeat.o(88858);
      paramJSONObject = (JSONObject)localObject2;
    }
    while (true)
    {
      return paramJSONObject;
      no localno = new no();
      try
      {
        localno.status = paramJSONObject.optInt("status");
        localno.vRU = paramJSONObject.optInt("init_balance");
        localno.vRV = paramJSONObject.optInt("init_bonus");
        localObject2 = paramJSONObject.optJSONArray("cell_list0");
        if (localObject2 != null)
          localno.vRW = p((JSONArray)localObject2);
        localObject2 = paramJSONObject.optJSONArray("cell_list1");
        if (localObject2 != null)
          localno.vRX = p((JSONArray)localObject2);
        localObject2 = paramJSONObject.optJSONArray("cell_list2");
        if (localObject2 != null)
          localno.vRY = p((JSONArray)localObject2);
        JSONArray localJSONArray = paramJSONObject.optJSONArray("acceptors");
        if (localJSONArray != null)
        {
          localObject2 = localObject1;
          if (localJSONArray != null)
          {
            if (localJSONArray.length() != 0)
              break label434;
            localObject2 = localObject1;
          }
        }
        while (true)
        {
          localno.vRZ = ((LinkedList)localObject2);
          localno.vSa = paramJSONObject.optInt("avail_num");
          localno.vSb = paramJSONObject.optInt("code_type");
          localno.code = paramJSONObject.optString("code");
          localObject2 = paramJSONObject.optJSONArray("secondary_fields");
          if (localObject2 != null)
            localno.vSc = q((JSONArray)localObject2);
          localno.vSd = paramJSONObject.optLong("stock_num");
          localno.vSe = paramJSONObject.optInt("limit_num");
          localno.vSf = paramJSONObject.optString("user_report_url");
          localObject2 = paramJSONObject.optJSONObject("third_field");
          if (localObject2 != null)
            localno.vSg = K((JSONObject)localObject2);
          localno.vSh = r(paramJSONObject.optJSONArray("action_sheets"));
          localObject2 = paramJSONObject.optJSONObject("card_list_field");
          if (localObject2 != null)
            localno.vSi = K((JSONObject)localObject2);
          localObject2 = paramJSONObject.optJSONObject("operate_field");
          if (localObject2 != null)
            localno.vSj = K((JSONObject)localObject2);
          localObject2 = paramJSONObject.optJSONObject("limit_field");
          if (localObject2 != null)
            localno.vSk = K((JSONObject)localObject2);
          localObject2 = paramJSONObject.optJSONObject("detail_table");
          if (localObject2 != null)
            localno.vSl = O((JSONObject)localObject2);
          localno.vSm = paramJSONObject.optString("background_pic_url");
          localObject2 = paramJSONObject.optJSONObject("gifting_info_cell");
          if (localObject2 != null)
            localno.vSn = K((JSONObject)localObject2);
          localno.vSo = paramJSONObject.optString("sign_number");
          localObject2 = paramJSONObject.optJSONObject("unavailable_qrcode_field");
          if (localObject2 != null)
            localno.vSp = K((JSONObject)localObject2);
          localno.vSq = paramJSONObject.optBoolean("is_commom_card");
          localno.vSr = paramJSONObject.optBoolean("is_location_authorized");
          AppMethodBeat.o(88858);
          paramJSONObject = localno;
          break;
          label434: localObject2 = new java/util/LinkedList;
          ((LinkedList)localObject2).<init>();
          for (int i = 0; i < localJSONArray.length(); i++)
            ((LinkedList)localObject2).add((String)localJSONArray.get(i));
        }
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
      }
    }
  }

  public static ArrayList<ShareCardInfo> Hf(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(88851);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardInfoParser", "parseShareCardArray jsonContent is null");
      AppMethodBeat.o(88851);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        JSONArray localJSONArray = localJSONObject.optJSONArray("card_list");
        if ((localJSONArray == null) || (localJSONArray.length() == 0))
        {
          ab.e("MicroMsg.CardInfoParser", "parseShareCardArray cardItemListJson is null");
          AppMethodBeat.o(88851);
          paramString = localObject;
        }
        else
        {
          paramString = new java/util/ArrayList;
          paramString.<init>();
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            localJSONObject = localJSONArray.optJSONObject(i);
            ShareCardInfo localShareCardInfo = new com/tencent/mm/plugin/card/sharecard/model/ShareCardInfo;
            localShareCardInfo.<init>();
            a(localShareCardInfo, localJSONObject);
            paramString.add(localShareCardInfo);
          }
          AppMethodBeat.o(88851);
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88851);
        paramString = localObject;
      }
    }
  }

  public static ArrayList<CardInfo> Hg(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(88854);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardInfoParser", "parseCardArray jsonContent is null");
      AppMethodBeat.o(88854);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        JSONArray localJSONArray = ((JSONObject)localObject2).optJSONArray("card_array");
        if ((localJSONArray == null) || (localJSONArray.length() == 0))
        {
          ab.e("MicroMsg.CardInfoParser", "parseCardArray cardItemListJson is null");
          AppMethodBeat.o(88854);
          paramString = localObject1;
        }
        else
        {
          paramString = new java/util/ArrayList;
          paramString.<init>();
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            JSONObject localJSONObject = localJSONArray.optJSONObject(i);
            localObject2 = new com/tencent/mm/plugin/card/model/CardInfo;
            ((CardInfo)localObject2).<init>();
            a((CardInfo)localObject2, localJSONObject);
            paramString.add(localObject2);
          }
          AppMethodBeat.o(88854);
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.CardInfoParser", paramString, "", new Object[0]);
        AppMethodBeat.o(88854);
        paramString = localObject1;
      }
    }
  }

  private static String Hh(String paramString)
  {
    AppMethodBeat.i(88857);
    if ((TextUtils.isEmpty(paramString)) || ("null".equals(paramString)))
    {
      paramString = "";
      AppMethodBeat.o(88857);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(88857);
    }
  }

  public static oi I(JSONObject paramJSONObject)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(88860);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserCardTpInfo json is null");
      AppMethodBeat.o(88860);
      paramJSONObject = (JSONObject)localObject2;
    }
    while (true)
    {
      return paramJSONObject;
      oi localoi = new oi();
      try
      {
        localoi.kbU = paramJSONObject.optString("card_tp_id");
        localoi.kbV = paramJSONObject.optString("logo_url");
        localoi.csB = paramJSONObject.optString("appid");
        localoi.vTT = paramJSONObject.optString("app_username");
        localoi.vTU = paramJSONObject.optInt("card_category");
        localoi.iAd = paramJSONObject.optInt("card_type");
        localoi.kdg = paramJSONObject.optString("brand_name");
        localoi.title = paramJSONObject.optString("title");
        localoi.kbW = paramJSONObject.optString("sub_title");
        localoi.color = paramJSONObject.optString("color");
        localoi.kCx = paramJSONObject.optString("notice");
        localoi.vTV = paramJSONObject.optString("service_phone");
        localoi.vTY = paramJSONObject.optString("image_text_url");
        localoi.vTZ = paramJSONObject.optString("source_icon");
        localoi.source = paramJSONObject.optString("source");
        localObject2 = paramJSONObject.optJSONArray("primary_fields");
        if (localObject2 != null)
          localoi.vTW = q((JSONArray)localObject2);
        localObject2 = paramJSONObject.optJSONArray("introduce_fields");
        if (localObject2 != null)
          localoi.vTX = q((JSONArray)localObject2);
        localoi.vUa = paramJSONObject.optInt("shop_count");
        localoi.vUb = paramJSONObject.optString("limit_wording");
        localoi.kdf = paramJSONObject.optString("card_type_name");
        localoi.vUc = paramJSONObject.optString("h5_show_url");
        localoi.vUd = paramJSONObject.optInt("block_mask");
        localoi.vUe = paramJSONObject.optString("middle_icon");
        localoi.vUf = paramJSONObject.optString("accept_wording");
        localoi.vUg = paramJSONObject.optLong("control_flag");
        localoi.vUh = paramJSONObject.optString("advertise_wording");
        localoi.vUi = paramJSONObject.optString("advertise_url");
        localoi.vUj = paramJSONObject.optString("public_service_name");
        localObject3 = paramJSONObject.optJSONObject("announcement");
        if (localObject3 == null)
        {
          ab.e("MicroMsg.CardInfoParser", "parserannoucement json is null");
          localObject2 = null;
        }
        while (true)
        {
          localoi.vUk = ((nz)localObject2);
          localoi.vUl = paramJSONObject.optString("public_service_tip");
          localoi.vUm = paramJSONObject.optString("primary_sub_title");
          localoi.vUn = paramJSONObject.optInt("gen_type");
          localoi.vUo = M(paramJSONObject.optJSONObject("detail_struct"));
          localObject3 = paramJSONObject.optJSONObject("use_condition");
          if (localObject3 != null)
            break label913;
          ab.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
          localObject2 = null;
          localoi.vUp = ((cma)localObject2);
          localObject3 = paramJSONObject.optJSONObject("follow_box");
          if (localObject3 != null)
            break label1165;
          ab.e("MicroMsg.CardInfoParser", "parserFollowBox json is null");
          localObject2 = null;
          localoi.vUq = ((aci)localObject2);
          localObject3 = paramJSONObject.optJSONObject("guidance");
          if (localObject3 != null)
            break label1243;
          ab.e("MicroMsg.CardInfoParser", "parserActionSheet json is null");
          localObject2 = null;
          localoi.vUr = ((ax)localObject2);
          localoi.vUs = paramJSONObject.optInt("need_direct_jump", 0);
          localoi.vUt = paramJSONObject.optInt("is_acceptable", 0);
          localoi.vUu = paramJSONObject.optString("unacceptable_wording");
          localoi.vUv = paramJSONObject.optInt("has_hongbao", 0);
          localoi.vUw = paramJSONObject.optString("accept_ui_title");
          localoi.vUx = paramJSONObject.optInt("show_accept_view", 0);
          localObject2 = paramJSONObject.optJSONObject("brand_field");
          if (localObject2 != null)
            localoi.vUy = K((JSONObject)localObject2);
          localoi.vUz = paramJSONObject.optString("shop_name");
          localObject2 = paramJSONObject.optJSONObject("pay_and_qrcode_field");
          if (localObject2 != null)
            localoi.vUA = K((JSONObject)localObject2);
          localObject3 = paramJSONObject.optJSONObject("dynamic_qr_code_info");
          if (localObject3 != null)
          {
            if (localObject3 != null)
              break label1278;
            ab.e("MicroMsg.CardInfoParser", "parserDynamicQrCodeInfo json is null");
            localObject2 = null;
            localoi.vUB = ((xt)localObject2);
          }
          localoi.vUC = paramJSONObject.optBoolean("is_card_code_exposed");
          localoi.vUD = paramJSONObject.optInt("qrcode_correct_level");
          localoi.vUE = paramJSONObject.optBoolean("dismiss_qrcode_icon_on_card");
          localoi.vUF = paramJSONObject.optBoolean("need_location");
          localObject3 = paramJSONObject.optJSONObject("bluetooth_info");
          if (localObject3 != null)
          {
            if (localObject3 != null)
              break label1381;
            ab.e("MicroMsg.CardInfoParser", "parseBluetoothInfo json is null");
            localObject2 = localObject1;
            localoi.vUG = ((lh)localObject2);
          }
          localoi.vUH = paramJSONObject.optString("biz_nickname");
          localoi.vUI = paramJSONObject.optString("gift_title");
          ab.d("MicroMsg.CardInfoParser", "parse gift title: %s", new Object[] { localoi.vUI });
          AppMethodBeat.o(88860);
          paramJSONObject = localoi;
          break;
          localObject2 = new com/tencent/mm/protocal/protobuf/nz;
          ((nz)localObject2).<init>();
          ((nz)localObject2).type = ((JSONObject)localObject3).optInt("type");
          ((nz)localObject2).text = ((JSONObject)localObject3).optString("text");
          ((nz)localObject2).url = ((JSONObject)localObject3).optString("url");
          ((nz)localObject2).qsz = ((JSONObject)localObject3).optInt("endtime");
          ((nz)localObject2).vNm = ((JSONObject)localObject3).optInt("create_time");
          ((nz)localObject2).vTr = ((JSONObject)localObject3).optString("thumb_url");
        }
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
          continue;
          label913: localObject2 = new com/tencent/mm/protocal/protobuf/cma;
          ((cma)localObject2).<init>();
          ((cma)localObject2).title = ((JSONObject)localObject3).optString("title");
          JSONArray localJSONArray = ((JSONObject)localObject3).optJSONArray("outer_tag_list");
          Object localObject4;
          int i;
          if ((localJSONArray != null) && (localJSONArray.length() > 0))
          {
            localObject4 = new java/util/LinkedList;
            ((LinkedList)localObject4).<init>();
            ((cma)localObject2).xjK = ((LinkedList)localObject4);
            i = 0;
          }
          while (i < localJSONArray.length())
          {
            localObject4 = N(localJSONArray.optJSONObject(i));
            if (localObject4 != null)
              ((cma)localObject2).xjK.add(localObject4);
            i++;
            continue;
            ab.e("MicroMsg.CardInfoParser", "parserUseCondition outer_tag_list is null");
          }
          localJSONArray = ((JSONObject)localObject3).optJSONArray("inner_tag_list");
          if ((localJSONArray != null) && (localJSONArray.length() > 0))
          {
            localObject4 = new java/util/LinkedList;
            ((LinkedList)localObject4).<init>();
            ((cma)localObject2).xjL = ((LinkedList)localObject4);
            i = 0;
          }
          while (i < localJSONArray.length())
          {
            localObject4 = N(localJSONArray.optJSONObject(i));
            if (localObject4 != null)
              ((cma)localObject2).xjL.add(localObject4);
            i++;
            continue;
            ab.e("MicroMsg.CardInfoParser", "parserUseCondition inner_tag_list is null");
          }
          Object localObject3 = ((JSONObject)localObject3).optJSONArray("detail_field");
          if ((localObject3 != null) && (((JSONArray)localObject3).length() > 0))
          {
            ((cma)localObject2).xjM = q((JSONArray)localObject3);
          }
          else
          {
            ab.e("MicroMsg.CardInfoParser", "parserUseCondition detail_field is null");
            continue;
            label1165: localObject2 = new com/tencent/mm/protocal/protobuf/aci;
            ((aci)localObject2).<init>();
            ((aci)localObject2).text = ((JSONObject)localObject3).optString("text");
            ((aci)localObject2).wkd = ((JSONObject)localObject3).optInt("follow");
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("follow:");
            ab.i("MicroMsg.CardInfoParser", ((aci)localObject2).wkd + "　text:" + ((aci)localObject2).text);
            continue;
            label1243: localObject2 = new com/tencent/mm/protocal/protobuf/ax;
            ((ax)localObject2).<init>();
            ((ax)localObject2).text = ((JSONObject)localObject3).optString("text");
            ((ax)localObject2).url = ((JSONObject)localObject3).optString("url");
            continue;
            label1278: localObject2 = new com/tencent/mm/protocal/protobuf/xt;
            ((xt)localObject2).<init>();
            ((xt)localObject2).wdu = ((JSONObject)localObject3).optBoolean("is_dynamic");
            ((xt)localObject2).wdv = ((JSONObject)localObject3).optBoolean("can_refresh");
            ((xt)localObject2).wdw = ((JSONObject)localObject3).optString("refresh_wording");
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("is_dynamic:");
            ab.i("MicroMsg.CardInfoParser", ((xt)localObject2).wdu + "　can_refresh:" + ((xt)localObject2).wdv + "　refresh_wording:" + ((xt)localObject2).wdw);
            continue;
            label1381: localObject2 = new com/tencent/mm/protocal/protobuf/lh;
            ((lh)localObject2).<init>();
            ((lh)localObject2).name = ((JSONObject)localObject3).optString("name");
            ((lh)localObject2).vON = ((JSONObject)localObject3).optInt("report_time_interval", 0);
            ab.i("MicroMsg.CardInfoParser", "blueToothInfo.name:%s", new Object[] { ((lh)localObject2).name });
          }
        }
      }
    }
  }

  private static bzi J(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88862);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserShareInfo json is null");
      paramJSONObject = null;
      AppMethodBeat.o(88862);
    }
    while (true)
    {
      return paramJSONObject;
      bzi localbzi = new bzi();
      localbzi.wYl = paramJSONObject.optString("gift_msg_title");
      AppMethodBeat.o(88862);
      paramJSONObject = localbzi;
    }
  }

  private static tm K(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88864);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserThirdFiled json is null");
      paramJSONObject = null;
      AppMethodBeat.o(88864);
    }
    while (true)
    {
      return paramJSONObject;
      tm localtm = new tm();
      localtm.title = paramJSONObject.optString("title");
      localtm.kbX = paramJSONObject.optString("aux_title");
      localtm.kbW = paramJSONObject.optString("sub_title");
      localtm.url = paramJSONObject.optString("url");
      localtm.vUW = paramJSONObject.optLong("show_flag");
      localtm.vUX = paramJSONObject.optString("primary_color");
      localtm.vUY = paramJSONObject.optString("secondary_color");
      localtm.kKZ = paramJSONObject.optString("icon_url");
      JSONObject localJSONObject = paramJSONObject.optJSONObject("gifting_info");
      if (localJSONObject != null)
        localtm.waC = L(localJSONObject);
      localtm.vTL = paramJSONObject.optString("app_brand_user_name");
      localtm.vTM = paramJSONObject.optString("app_brand_pass");
      AppMethodBeat.o(88864);
      paramJSONObject = localtm;
    }
  }

  private static arp L(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88865);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserGiftInfo json is null");
      paramJSONObject = null;
      AppMethodBeat.o(88865);
    }
    while (true)
    {
      return paramJSONObject;
      ab.d("MicroMsg.CardInfoParser", "parserGitfInfo:%s", new Object[] { paramJSONObject });
      arp localarp = new arp();
      localarp.vBA = p.cB(paramJSONObject.optString("biz_uin"));
      localarp.vBB = paramJSONObject.optString("order_id");
      AppMethodBeat.o(88865);
      paramJSONObject = localarp;
    }
  }

  private static wy M(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88866);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserDetailStruct json is null");
      paramJSONObject = null;
      AppMethodBeat.o(88866);
      return paramJSONObject;
    }
    wy localwy = new wy();
    localwy.title = paramJSONObject.optString("title");
    localwy.url = paramJSONObject.optString("url");
    localwy.desc = paramJSONObject.optString("abstract");
    localwy.detail = paramJSONObject.optString("detail");
    localwy.wcT = paramJSONObject.optString("ad_title");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("icon_url_list");
    if ((localJSONArray != null) && (localJSONArray.length() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while (true)
        if (i < localJSONArray.length())
        {
          paramJSONObject = "";
          try
          {
            String str = localJSONArray.getString(i);
            paramJSONObject = str;
            localLinkedList.add(paramJSONObject);
            i++;
          }
          catch (JSONException localJSONException)
          {
            while (true)
            {
              ab.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
              ab.e("MicroMsg.CardInfoParser", "getMessage:" + localJSONException.getMessage());
            }
          }
        }
      localwy.wcS = localLinkedList;
    }
    while (true)
    {
      AppMethodBeat.o(88866);
      paramJSONObject = localwy;
      break;
      ab.e("MicroMsg.CardInfoParser", "parserDetailStruct icon_url_list is null");
    }
  }

  private static cgf N(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88867);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserUseCondition json is null");
      paramJSONObject = null;
      AppMethodBeat.o(88867);
    }
    while (true)
    {
      return paramJSONObject;
      cgf localcgf = new cgf();
      localcgf.tag = paramJSONObject.optString("tag");
      localcgf.color = paramJSONObject.optString("color");
      AppMethodBeat.o(88867);
      paramJSONObject = localcgf;
    }
  }

  private static wz O(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88868);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserDetailTable json is null");
      paramJSONObject = null;
      AppMethodBeat.o(88868);
      return paramJSONObject;
    }
    wz localwz = new wz();
    localwz.title = paramJSONObject.optString("title");
    localwz.kbW = paramJSONObject.optString("sub_title");
    localwz.wcU = paramJSONObject.optInt("show_num", 0);
    paramJSONObject = paramJSONObject.optJSONArray("rows");
    if ((paramJSONObject != null) && (paramJSONObject.length() > 0));
    while (true)
    {
      try
      {
        localwz.wcV = q(paramJSONObject);
        AppMethodBeat.o(88868);
        paramJSONObject = localwz;
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace("MicroMsg.CardInfoParser", paramJSONObject, "", new Object[0]);
        ab.e("MicroMsg.CardInfoParser", paramJSONObject.getMessage());
        continue;
      }
      ab.e("MicroMsg.CardInfoParser", "parserDetailTable jsonArray is  null");
    }
  }

  public static void a(CardInfo paramCardInfo, String paramString)
  {
    AppMethodBeat.i(88855);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardInfoParser", "parserCardItemJson jsonContent is null");
      AppMethodBeat.o(88855);
    }
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        a(paramCardInfo, localJSONObject);
        AppMethodBeat.o(88855);
      }
      catch (JSONException paramCardInfo)
      {
        ab.printErrStackTrace("MicroMsg.CardInfoParser", paramCardInfo, "", new Object[0]);
        AppMethodBeat.o(88855);
      }
    }
  }

  private static void a(CardInfo paramCardInfo, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88856);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserCardItemJson json is null");
      AppMethodBeat.o(88856);
    }
    while (true)
    {
      return;
      paramCardInfo.field_card_id = Hh(paramJSONObject.optString("card_id"));
      paramCardInfo.field_card_tp_id = Hh(paramJSONObject.optString("card_tp_id"));
      paramCardInfo.field_delete_state_flag = paramJSONObject.optInt("state_flag");
      paramCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
      paramCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
      paramCardInfo.field_from_username = paramJSONObject.optString("from_username");
      paramCardInfo.field_begin_time = paramJSONObject.optLong("begin_time", 0L);
      paramCardInfo.field_end_time = paramJSONObject.optLong("end_time", 0L);
      paramCardInfo.kbY = paramJSONObject.optString("encrypt_code");
      JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_data_info");
      JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_tp_info");
      paramJSONObject = paramJSONObject.optJSONObject("share_info");
      paramCardInfo.kcZ = H(localJSONObject1);
      paramCardInfo.kcY = I(localJSONObject2);
      paramCardInfo.kda = J(paramJSONObject);
      if (paramCardInfo.kcY != null)
      {
        paramCardInfo.a(paramCardInfo.kcY);
        paramCardInfo.field_block_mask = Integer.toString(paramCardInfo.kcY.vUd);
        paramCardInfo.field_card_type = paramCardInfo.kcY.iAd;
        if (TextUtils.isEmpty(paramCardInfo.field_card_tp_id))
          paramCardInfo.field_card_tp_id = paramCardInfo.kcY.kbU;
        if ((paramCardInfo.field_begin_time == 0L) && (localJSONObject2 != null))
          paramCardInfo.field_begin_time = localJSONObject2.optLong("begin_time");
        if ((paramCardInfo.field_end_time == 0L) && (localJSONObject2 != null))
          paramCardInfo.field_end_time = localJSONObject2.optLong("end_time");
        if (paramCardInfo.kcY.vUB != null)
          paramCardInfo.field_is_dynamic = paramCardInfo.kcY.vUB.wdu;
      }
      if (paramCardInfo.kcZ != null)
      {
        paramCardInfo.a(paramCardInfo.kcZ);
        paramCardInfo.field_status = paramCardInfo.kcZ.status;
      }
      if (paramCardInfo.kda != null)
        paramCardInfo.a(paramCardInfo.kda);
      paramCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
      AppMethodBeat.o(88856);
    }
  }

  public static void a(ShareCardInfo paramShareCardInfo, String paramString)
  {
    AppMethodBeat.i(88852);
    if (TextUtils.isEmpty(paramString))
    {
      ab.e("MicroMsg.CardInfoParser", "parserShareCardItemJson jsonContent is null");
      AppMethodBeat.o(88852);
    }
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        a(paramShareCardInfo, localJSONObject.optJSONObject("share_card"));
        AppMethodBeat.o(88852);
      }
      catch (JSONException paramShareCardInfo)
      {
        ab.printErrStackTrace("MicroMsg.CardInfoParser", paramShareCardInfo, "", new Object[0]);
        ab.e("MicroMsg.CardInfoParser", paramShareCardInfo.getMessage());
        AppMethodBeat.o(88852);
      }
    }
  }

  public static void a(ShareCardInfo paramShareCardInfo, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(88853);
    if (paramJSONObject == null)
    {
      ab.e("MicroMsg.CardInfoParser", "parserShareCardItemJson json is null");
      AppMethodBeat.o(88853);
    }
    while (true)
    {
      return;
      paramShareCardInfo.field_card_id = Hh(paramJSONObject.optString("card_id"));
      paramShareCardInfo.field_card_tp_id = Hh(paramJSONObject.optString("card_tp_id"));
      paramShareCardInfo.field_app_id = paramJSONObject.optString("app_id");
      paramShareCardInfo.field_consumer = paramJSONObject.optString("consumer");
      paramShareCardInfo.field_share_time = paramJSONObject.optInt("share_time");
      paramShareCardInfo.field_updateTime = paramJSONObject.optInt("update_time");
      paramShareCardInfo.field_status = paramJSONObject.optInt("state_flag");
      paramShareCardInfo.field_updateSeq = paramJSONObject.optLong("sequence");
      paramShareCardInfo.field_from_username = paramJSONObject.optString("from_user_name");
      paramShareCardInfo.field_begin_time = paramJSONObject.optLong("begin_time");
      paramShareCardInfo.field_end_time = paramJSONObject.optInt("end_time");
      JSONObject localJSONObject1 = paramJSONObject.optJSONObject("card_data_info");
      JSONObject localJSONObject2 = paramJSONObject.optJSONObject("card_tp_info");
      paramJSONObject = paramJSONObject.optJSONObject("share_info");
      paramShareCardInfo.kcZ = H(localJSONObject1);
      paramShareCardInfo.kcY = I(localJSONObject2);
      paramShareCardInfo.kda = J(paramJSONObject);
      if (paramShareCardInfo.kcZ != null)
        paramShareCardInfo.a(paramShareCardInfo.kcZ);
      if (paramShareCardInfo.kcY != null)
      {
        paramShareCardInfo.a(paramShareCardInfo.kcY);
        paramShareCardInfo.field_end_time = localJSONObject2.optInt("end_time");
        paramShareCardInfo.field_begin_time = localJSONObject2.optInt("begin_time");
      }
      if (paramShareCardInfo.kda != null)
        paramShareCardInfo.a(paramShareCardInfo.kda);
      paramShareCardInfo.field_local_updateTime = ((int)(System.currentTimeMillis() / 1000L));
      AppMethodBeat.o(88853);
    }
  }

  private static LinkedList<op> p(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(88859);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      paramJSONArray = null;
      AppMethodBeat.o(88859);
    }
    while (true)
    {
      return paramJSONArray;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        op localop = new op();
        localop.title = localJSONObject.optString("title");
        localop.kbW = localJSONObject.optString("sub_title");
        localop.kfM = localJSONObject.optString("tips");
        localop.url = localJSONObject.optString("url");
        localop.vUW = localJSONObject.optLong("show_flag");
        localop.vUX = localJSONObject.optString("primary_color");
        localop.vUY = localJSONObject.optString("secondary_color");
        localop.kKZ = localJSONObject.optString("icon_url");
        localop.vTL = localJSONObject.optString("app_brand_user_name");
        localop.vTM = localJSONObject.optString("app_brand_pass");
        localLinkedList.add(localop);
      }
      AppMethodBeat.o(88859);
      paramJSONArray = localLinkedList;
    }
  }

  private static LinkedList<tm> q(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(88861);
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
    {
      paramJSONArray = null;
      AppMethodBeat.o(88861);
    }
    while (true)
    {
      return paramJSONArray;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        tm localtm = K(paramJSONArray.getJSONObject(i));
        if (localtm != null)
          localLinkedList.add(localtm);
      }
      AppMethodBeat.o(88861);
      paramJSONArray = localLinkedList;
    }
  }

  private static LinkedList<ax> r(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(88863);
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray != null)
    {
      int i = 0;
      while (true)
        if (i < paramJSONArray.length())
          try
          {
            ax localax = new com/tencent/mm/protocal/protobuf/ax;
            localax.<init>();
            JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
            localax.text = localJSONObject.optString("text");
            localax.url = localJSONObject.optString("url");
            localLinkedList.add(localax);
            i++;
          }
          catch (JSONException localJSONException)
          {
            while (true)
              ab.printErrStackTrace("MicroMsg.CardInfoParser", localJSONException, "", new Object[0]);
          }
    }
    AppMethodBeat.o(88863);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.f
 * JD-Core Version:    0.6.2
 */