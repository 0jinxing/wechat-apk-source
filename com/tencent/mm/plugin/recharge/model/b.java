package com.tencent.mm.plugin.recharge.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.mm.plugin.wallet_core.model.mall.MallNews;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static String VB(String paramString)
  {
    AppMethodBeat.i(44186);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(44186);
    }
    while (true)
    {
      return paramString;
      paramString = new StringBuilder(paramString.replaceAll(" ", ""));
      int i = paramString.length();
      if (i >= 4)
      {
        paramString.insert(3, ' ');
        if (i >= 8)
          paramString.insert(8, ' ');
        paramString = paramString.toString();
        AppMethodBeat.o(44186);
      }
      else
      {
        paramString = paramString.toString();
        AppMethodBeat.o(44186);
      }
    }
  }

  public static ArrayList<MallRechargeProduct> a(String paramString, JSONArray paramJSONArray)
  {
    Object localObject = null;
    AppMethodBeat.i(44183);
    if (paramJSONArray != null);
    try
    {
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>();
      int i = paramJSONArray.length();
      for (int j = 0; ; j++)
      {
        localArrayList2 = localArrayList1;
        if (j >= i)
          break;
        localArrayList1.add(e(paramString, paramJSONArray.getJSONObject(j)));
      }
      ArrayList localArrayList2 = null;
      AppMethodBeat.o(44183);
      paramString = localArrayList2;
      return paramString;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MallLogic", paramString, "", new Object[0]);
        AppMethodBeat.o(44183);
        paramString = localObject;
      }
    }
  }

  public static boolean c(MallFunction paramMallFunction)
  {
    AppMethodBeat.i(44188);
    boolean bool;
    if ((paramMallFunction.tDn == null) || (paramMallFunction.tDn.tBn != 1) || (bo.isNullOrNil(paramMallFunction.tDn.tDC)))
    {
      AppMethodBeat.o(44188);
      bool = false;
    }
    while (true)
    {
      return bool;
      g.RQ();
      if (!((Boolean)g.RP().Ry().get(ac.a.xNR, Boolean.FALSE)).booleanValue())
      {
        AppMethodBeat.o(44188);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(44188);
        bool = false;
      }
    }
  }

  public static void ced()
  {
    AppMethodBeat.i(44187);
    g.RQ();
    g.RP().Ry().set(ac.a.xNR, Boolean.TRUE);
    AppMethodBeat.o(44187);
  }

  public static MallRechargeProduct e(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(44184);
    MallRechargeProduct localMallRechargeProduct;
    if (paramJSONObject.optInt("need_getlatestinfo", 1) == 1)
    {
      bool = true;
      localMallRechargeProduct = new MallRechargeProduct(bool);
      localMallRechargeProduct.pFP = paramString;
      localMallRechargeProduct.cwg = paramJSONObject.getString("product_id");
      localMallRechargeProduct.lcC = paramJSONObject.getString("product_name");
      localMallRechargeProduct.pFQ = paramJSONObject.optString("product_desc");
      localMallRechargeProduct.pFR = (paramJSONObject.getInt("product_min_price") / 100.0F);
      localMallRechargeProduct.pFS = (paramJSONObject.getInt("product_max_price") / 100.0F);
      localMallRechargeProduct.appId = paramJSONObject.optString("app_id");
      if (paramJSONObject.getInt("is_infinite") != 1)
        break label183;
      bool = true;
      label112: localMallRechargeProduct.pFT = bool;
      localMallRechargeProduct.pFU = paramJSONObject.getInt("left_count");
      localMallRechargeProduct.pFV = paramJSONObject.getInt("discount");
      if (paramJSONObject.optInt("is_default_choose", 0) != 1)
        break label188;
    }
    label183: label188: for (boolean bool = true; ; bool = false)
    {
      localMallRechargeProduct.isDefault = bool;
      localMallRechargeProduct.pFX = true;
      localMallRechargeProduct.fmR = paramJSONObject.optInt("product_type", 0);
      AppMethodBeat.o(44184);
      return localMallRechargeProduct;
      bool = false;
      break;
      bool = false;
      break label112;
    }
  }

  public static String ws(String paramString)
  {
    AppMethodBeat.i(44185);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(44185);
    }
    while (true)
    {
      return paramString;
      String str = paramString.replaceAll("\\D", "");
      paramString = str;
      if (str.startsWith("86"))
        paramString = str.substring(2);
      AppMethodBeat.o(44185);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.model.b
 * JD-Core Version:    0.6.2
 */