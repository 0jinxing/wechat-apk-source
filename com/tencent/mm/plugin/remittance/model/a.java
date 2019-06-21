package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abv;
import com.tencent.mm.protocal.protobuf.abw;
import com.tencent.mm.protocal.protobuf.cz;
import com.tencent.mm.protocal.protobuf.lp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a
{
  public static JSONObject a(abv paramabv)
  {
    AppMethodBeat.i(44717);
    if (paramabv == null)
    {
      paramabv = new JSONObject();
      AppMethodBeat.o(44717);
    }
    while (true)
    {
      return paramabv;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("favor_compose_id", paramabv.wjd);
        LinkedList localLinkedList = paramabv.vPg;
        new abw();
        localJSONObject.put("favor_info_list,", cP(localLinkedList));
        localJSONObject.put("show_favor_amount,", paramabv.wje);
        localJSONObject.put("show_pay_amount,", paramabv.wjf);
        localJSONObject.put("total_favor_amount,", paramabv.wjg);
        localJSONObject.put("favor_desc", paramabv.pOz);
        localJSONObject.put("compose_sort_flag", paramabv.wjh);
        localJSONObject.put("extend_str", paramabv.vWF);
        AppMethodBeat.o(44717);
        paramabv = localJSONObject;
      }
      catch (Exception paramabv)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramabv, "", new Object[0]);
      }
    }
  }

  private static JSONObject a(abw paramabw)
  {
    AppMethodBeat.i(44715);
    if (paramabw == null)
    {
      paramabw = new JSONObject();
      AppMethodBeat.o(44715);
    }
    while (true)
    {
      return paramabw;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("fav_type", paramabw.wji);
        localJSONObject.put("fav_sub_type", paramabw.wjj);
        localJSONObject.put("fav_property", paramabw.wjk);
        localJSONObject.put("favor_type_desc", paramabw.wjl);
        localJSONObject.put("fav_id", paramabw.wjm);
        localJSONObject.put("fav_name", paramabw.wjn);
        localJSONObject.put("fav_desc", paramabw.wjo);
        localJSONObject.put("favor_use_manual", paramabw.wjp);
        localJSONObject.put("favor_remarks", paramabw.wjq);
        localJSONObject.put("fav_price", paramabw.wjr);
        localJSONObject.put("real_fav_fee", paramabw.wjs);
        localJSONObject.put("fav_scope_type", paramabw.wjt);
        localJSONObject.put("business_receipt_no", paramabw.wju);
        localJSONObject.put("unavailable", paramabw.wjv);
        AppMethodBeat.o(44715);
        paramabw = localJSONObject;
      }
      catch (Exception paramabw)
      {
        ab.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramabw, "", new Object[0]);
        AppMethodBeat.o(44715);
        paramabw = localJSONObject;
      }
    }
  }

  public static JSONObject a(cz paramcz)
  {
    AppMethodBeat.i(44718);
    if (paramcz == null)
    {
      paramcz = new JSONObject();
      AppMethodBeat.o(44718);
    }
    while (true)
    {
      return paramcz;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("channel", paramcz.cIb);
        localJSONObject.put("favor_compose_info", a(paramcz.vFe));
        localJSONObject.put("f2f_id", paramcz.vFb);
        localJSONObject.put("payok_checksign", paramcz.vFd);
        localJSONObject.put("receiver_openid", paramcz.pPZ);
        localJSONObject.put("receiver_username", paramcz.vFf);
        localJSONObject.put("scan_scene", paramcz.pOA);
        localJSONObject.put("scene", paramcz.scene);
        localJSONObject.put("total_amount", paramcz.vFg);
        localJSONObject.put("trans_id", paramcz.vFc);
        AppMethodBeat.o(44718);
        paramcz = localJSONObject;
      }
      catch (Exception paramcz)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramcz, "", new Object[0]);
      }
    }
  }

  public static JSONObject a(lp paramlp)
  {
    AppMethodBeat.i(44713);
    if (paramlp == null)
    {
      paramlp = new JSONObject();
      AppMethodBeat.o(44713);
    }
    while (true)
    {
      return paramlp;
      JSONObject localJSONObject = new JSONObject();
      try
      {
        LinkedList localLinkedList = paramlp.vPg;
        new abw();
        localJSONObject.put("favor_info_list", cP(localLinkedList));
        localLinkedList = paramlp.vPh;
        new abv();
        localJSONObject.put("favor_compose_result_list", cQ(localLinkedList));
        localJSONObject.put("default_fav_compose_id", paramlp.vPi);
        localJSONObject.put("favor_resp_sign", paramlp.vPj);
        localJSONObject.put("no_compose_wording", paramlp.vPk);
        AppMethodBeat.o(44713);
        paramlp = localJSONObject;
      }
      catch (Exception paramlp)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramlp, "", new Object[0]);
      }
    }
  }

  private static JSONArray cP(List<abw> paramList)
  {
    AppMethodBeat.i(44714);
    if (paramList == null)
    {
      paramList = new JSONArray();
      AppMethodBeat.o(44714);
    }
    while (true)
    {
      return paramList;
      JSONArray localJSONArray = new JSONArray();
      try
      {
        paramList = paramList.iterator();
        for (int i = 0; paramList.hasNext(); i++)
          localJSONArray.put(i, a((abw)paramList.next()));
      }
      catch (Exception paramList)
      {
        ab.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramList, "", new Object[0]);
        AppMethodBeat.o(44714);
        paramList = localJSONArray;
      }
    }
  }

  private static JSONArray cQ(List<abv> paramList)
  {
    AppMethodBeat.i(44716);
    if (paramList == null)
    {
      paramList = new JSONArray();
      AppMethodBeat.o(44716);
    }
    while (true)
    {
      return paramList;
      JSONArray localJSONArray = new JSONArray();
      try
      {
        paramList = paramList.iterator();
        for (int i = 0; paramList.hasNext(); i++)
          localJSONArray.put(i, a((abv)paramList.next()));
      }
      catch (Exception paramList)
      {
        ab.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", paramList, "", new Object[0]);
        AppMethodBeat.o(44716);
        paramList = localJSONArray;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.a
 * JD-Core Version:    0.6.2
 */