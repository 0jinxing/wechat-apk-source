package com.tencent.mm.plugin.wallet_core.model.mall;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  public static int tDq = -256;
  public static int tDr = 621019136;
  public static int tDs = 637534720;

  public static ArrayList<MallNews> C(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(47007);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = paramJSONArray.length();
      for (int j = 0; j < i; j++)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(j);
        MallNews localMallNews = new com/tencent/mm/plugin/wallet_core/model/mall/MallNews;
        localMallNews.<init>(localJSONObject.optString("activity_jump_funcid"));
        localMallNews.tDx = localJSONObject.optString("activity_icon_link");
        localMallNews.tDv = localJSONObject.optString("activity_msg_content");
        localMallNews.tDz = localJSONObject.optString("activity_tips");
        localArrayList.add(localMallNews);
      }
      AppMethodBeat.o(47007);
      paramJSONArray = localArrayList;
      return paramJSONArray;
    }
    catch (JSONException paramJSONArray)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.MallLogic", paramJSONArray, "", new Object[0]);
        paramJSONArray = null;
        AppMethodBeat.o(47007);
      }
    }
  }

  public static ArrayList<a> D(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(47008);
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = paramJSONArray.length();
      for (int j = 0; j < i; j++)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(j);
        a locala = new com/tencent/mm/plugin/wallet_core/model/mall/a;
        locala.<init>();
        locala.tDi = localJSONObject.optInt("banner_id");
        locala.tDj = localJSONObject.optString("banner_title");
        locala.tDk = localJSONObject.optString("banner_link");
        localArrayList.add(locala);
      }
      AppMethodBeat.o(47008);
      paramJSONArray = localArrayList;
      return paramJSONArray;
    }
    catch (JSONException paramJSONArray)
    {
      while (true)
      {
        ab.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + paramJSONArray.getMessage());
        paramJSONArray = null;
        AppMethodBeat.o(47008);
      }
    }
  }

  public static SparseArray<String> E(JSONArray paramJSONArray)
  {
    int i = 0;
    AppMethodBeat.i(47009);
    try
    {
      SparseArray localSparseArray = new android/util/SparseArray;
      localSparseArray.<init>();
      while (i < paramJSONArray.length())
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        int j = localJSONObject.optInt("type_id", 0);
        if (j != 0)
          localSparseArray.put(j, localJSONObject.optString("type_name"));
        i++;
      }
      AppMethodBeat.o(47009);
      paramJSONArray = localSparseArray;
      return paramJSONArray;
    }
    catch (JSONException paramJSONArray)
    {
      while (true)
      {
        ab.w("MicroMsg.MallLogic", "func[parseBannerActList], exp:" + paramJSONArray.getMessage());
        paramJSONArray = null;
        AppMethodBeat.o(47009);
      }
    }
  }

  public static ArrayList<MallFunction> F(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(47012);
    Object localObject1;
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = paramJSONArray.length();
      ab.d("MicroMsg.MallLogic", "functions.jsonArray.length : ".concat(String.valueOf(i)));
      for (int j = 0; ; j++)
      {
        localObject1 = localArrayList;
        if (j >= i)
          break;
        Object localObject2 = paramJSONArray.getJSONObject(j);
        localObject1 = new com/tencent/mm/plugin/wallet_core/model/mall/MallFunction;
        ((MallFunction)localObject1).<init>();
        ((MallFunction)localObject1).pFP = ((JSONObject)localObject2).getString("func_id");
        ((MallFunction)localObject1).cOI = ((JSONObject)localObject2).getString("func_name");
        ((MallFunction)localObject1).tDl = ((JSONObject)localObject2).optString("func_icon_url");
        ((MallFunction)localObject1).olO = ((JSONObject)localObject2).optString("hd_icon_url");
        ((MallFunction)localObject1).olP = ((JSONObject)localObject2).optString("func_foregroud_icon_url");
        ((MallFunction)localObject1).cRS = ((JSONObject)localObject2).optString("native_url");
        ((MallFunction)localObject1).nmz = ((JSONObject)localObject2).optString("h5_url");
        ((MallFunction)localObject1).type = ((JSONObject)localObject2).optInt("property_type", 0);
        ((MallFunction)localObject1).tDo = ((JSONObject)localObject2).optString("third_party_disclaimer");
        ((MallFunction)localObject1).tDp = ((JSONObject)localObject2).optInt("download_restrict", 0);
        Object localObject3 = ((JSONObject)localObject2).optJSONArray("remark_name_list");
        Object localObject4;
        if (localObject3 != null)
        {
          localObject4 = new java/util/ArrayList;
          ((ArrayList)localObject4).<init>();
          ((MallFunction)localObject1).tDm = ((ArrayList)localObject4);
          int k = ((JSONArray)localObject3).length();
          for (int m = 0; m < k; m++)
            ((MallFunction)localObject1).tDm.add(((JSONArray)localObject3).getString(m));
        }
        localObject3 = ((JSONObject)localObject2).optJSONArray("activity_info_list");
        if ((localObject3 != null) && (((JSONArray)localObject3).length() != 0))
        {
          localObject4 = ((MallFunction)localObject1).pFP;
          localObject3 = ((JSONArray)localObject3).getJSONObject(0);
          localObject2 = new com/tencent/mm/plugin/wallet_core/model/mall/MallNews;
          ((MallNews)localObject2).<init>((String)localObject4);
          ((MallNews)localObject2).ssr = ((JSONObject)localObject3).optString("activity_id");
          ((MallNews)localObject2).cxb = ((JSONObject)localObject3).optString("activity_ticket");
          ((MallNews)localObject2).tDv = ((JSONObject)localObject3).optString("activity_msg_content");
          ((MallNews)localObject2).tDw = ((JSONObject)localObject3).optString("activity_link");
          ((MallNews)localObject2).tDx = ((JSONObject)localObject3).optString("activity_icon_link");
          ((MallNews)localObject2).tDy = ((JSONObject)localObject3).optInt("activity_expired_time");
          ((MallNews)localObject2).tDz = ((JSONObject)localObject3).optString("activity_tips");
          ((MallNews)localObject2).tBn = ((JSONObject)localObject3).optInt("activity_type");
          ((MallNews)localObject2).tDC = ((JSONObject)localObject3).optString("activity_url");
          ((MallNews)localObject2).tDA = ((JSONObject)localObject3).optInt("is_msg_reserved");
          ((MallFunction)localObject1).tDn = ((MallNews)localObject2);
        }
        localArrayList.add(localObject1);
      }
    }
    catch (JSONException paramJSONArray)
    {
      ab.printErrStackTrace("MicroMsg.MallLogic", paramJSONArray, "", new Object[0]);
      localObject1 = null;
      AppMethodBeat.o(47012);
    }
    return localObject1;
  }

  public static void Hs(int paramInt)
  {
    AppMethodBeat.i(47014);
    if ((d.vxo & tDq) == paramInt)
    {
      g.RQ();
      i = ((Integer)g.RP().Ry().get(270343, Integer.valueOf(0))).intValue();
      if (paramInt != i)
        ab.d("MicroMsg.MallLogic", "Mall reddot show, targetV=" + paramInt + ", clickedV=" + i);
    }
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (r.YI()))
      {
        ab.d("MicroMsg.MallLogic", "Show mall entry redot");
        c.PK().x(262156, true);
        g.RQ();
        g.RP().Ry().set(270343, Integer.valueOf(paramInt));
        g.RQ();
        g.RP().Ry().set(ac.a.xSq, Long.valueOf(System.currentTimeMillis()));
      }
      AppMethodBeat.o(47014);
      return;
    }
  }

  public static String cQS()
  {
    AppMethodBeat.i(47013);
    Object localObject = (TelephonyManager)ah.getContext().getSystemService("phone");
    if (localObject != null);
    for (localObject = ((TelephonyManager)localObject).getNetworkCountryIso(); ; localObject = "")
    {
      AppMethodBeat.o(47013);
      return localObject;
    }
  }

  public static boolean dS(List<a> paramList)
  {
    AppMethodBeat.i(47010);
    g.RQ();
    int i = ((Integer)g.RP().Ry().get(270342, Integer.valueOf(0))).intValue();
    int j;
    boolean bool;
    if (paramList != null)
    {
      j = paramList.size() - 1;
      if (j >= 0)
      {
        ab.d("MicroMsg.MallLogic", "i:" + j + ", lastClickedListMaxId:" + i + ", actId:" + ((a)paramList.get(j)).tDi);
        if (((a)paramList.get(j)).tDi > i)
        {
          bool = true;
          AppMethodBeat.o(47010);
        }
      }
    }
    while (true)
    {
      return bool;
      j--;
      break;
      AppMethodBeat.o(47010);
      bool = false;
    }
  }

  public static void dT(List<a> paramList)
  {
    AppMethodBeat.i(47011);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      ab.w("MicroMsg.MallLogic", "func[setBannerRedDotClick] actList null or empty");
      AppMethodBeat.o(47011);
    }
    while (true)
    {
      return;
      int i = ((a)paramList.get(0)).tDi;
      ab.d("MicroMsg.MallLogic", "func[setBannerRedDotClick], lastClickedListMaxId".concat(String.valueOf(i)));
      g.RQ();
      g.RP().Ry().set(270342, Integer.valueOf(i));
      g.RQ();
      g.RP().Ry().dsb();
      AppMethodBeat.o(47011);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.mall.b
 * JD-Core Version:    0.6.2
 */