package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abv;
import com.tencent.mm.protocal.protobuf.abw;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  public static LinkedList<abv> v(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(44719);
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray == null)
      AppMethodBeat.o(44719);
    while (true)
    {
      return localLinkedList;
      int i = 0;
      try
      {
        while (i < paramJSONArray.length())
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          abv localabv = new com/tencent/mm/protocal/protobuf/abv;
          localabv.<init>();
          localabv.wjd = localJSONObject.optString("favor_compose_id");
          localabv.wje = localJSONObject.optLong("show_favor_amount");
          localabv.wjf = localJSONObject.optLong("show_pay_amount");
          localabv.wjg = localJSONObject.optString("total_favor_amount");
          localabv.pOz = localJSONObject.optString("favor_desc");
          localabv.wjh = localJSONObject.optLong("compose_sort_flag");
          localabv.vWF = localJSONObject.optString("extend_str");
          localabv.vPg = w(localJSONObject.optJSONArray("favor_info_list"));
          localLinkedList.add(localabv);
          i++;
        }
      }
      catch (Exception paramJSONArray)
      {
        ab.printErrStackTrace("MicroMsg.BusiFavorInfoParser", paramJSONArray, "", new Object[0]);
        AppMethodBeat.o(44719);
      }
    }
  }

  public static LinkedList<abw> w(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(44720);
    LinkedList localLinkedList = new LinkedList();
    if (paramJSONArray == null)
      AppMethodBeat.o(44720);
    while (true)
    {
      return localLinkedList;
      int i = 0;
      try
      {
        while (i < paramJSONArray.length())
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
          abw localabw = new com/tencent/mm/protocal/protobuf/abw;
          localabw.<init>();
          localabw.wju = localJSONObject.optString("business_receipt_no");
          localabw.vWF = localJSONObject.optString("extend_str");
          localabw.wjo = localJSONObject.optString("fav_desc");
          localabw.wjm = localJSONObject.optLong("fav_id", 0L);
          localabw.wjn = localJSONObject.optString("fav_name");
          localabw.wjr = localJSONObject.optString("fav_price");
          localabw.wjk = localJSONObject.optLong("fav_property", 0L);
          localabw.wjt = localJSONObject.optInt("fav_scope_type", 0);
          localabw.wjj = localJSONObject.optLong("fav_sub_type", 0L);
          localabw.wji = localJSONObject.optLong("fav_type", 0L);
          localabw.wjq = localJSONObject.optString("favor_remarks");
          localabw.wjl = localJSONObject.optString("favor_type_desc");
          localabw.wjp = localJSONObject.optString("favor_use_manual");
          localabw.wjs = localJSONObject.optString("real_fav_fee");
          localabw.wjv = localJSONObject.optInt("unavailable");
          localLinkedList.add(localabw);
          i++;
        }
      }
      catch (Exception paramJSONArray)
      {
        ab.printErrStackTrace("MicroMsg.BusiFavorInfoParser", paramJSONArray, "", new Object[0]);
        AppMethodBeat.o(44720);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.b
 * JD-Core Version:    0.6.2
 */