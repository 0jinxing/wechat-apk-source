package com.tencent.mm.plugin.scanner.util;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.card.c.b;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class r
{
  public static String qiQ = "title";
  public static String qiR = "tip";
  public static String qiS = "buttonTitle";

  public static boolean Q(ArrayList<r.a> paramArrayList)
  {
    boolean bool = false;
    AppMethodBeat.i(81498);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      ab.e("MicroMsg.ScannerUtil", "list == null || list.size() == 0");
      AppMethodBeat.o(81498);
    }
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayList.size())
          break label81;
        r.a locala = (r.a)paramArrayList.get(i);
        if ((locala != null) && (sP(locala.iAd)))
        {
          bool = true;
          AppMethodBeat.o(81498);
          break;
        }
      }
      label81: AppMethodBeat.o(81498);
    }
  }

  public static int Ws(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(81494);
    if (paramString == null)
      AppMethodBeat.o(81494);
    while (true)
    {
      return i;
      if (("EAN-13".equals(paramString)) || ("EAN_13".equals(paramString)))
      {
        i = 4;
        AppMethodBeat.o(81494);
      }
      else if (("EAN-8".equals(paramString)) || ("EAN_8".equals(paramString)))
      {
        i = 3;
        AppMethodBeat.o(81494);
      }
      else if ("EAN-2".equals(paramString))
      {
        i = 1;
        AppMethodBeat.o(81494);
      }
      else if ("EAN-5".equals(paramString))
      {
        i = 2;
        AppMethodBeat.o(81494);
      }
      else if (("UPC-A".equals(paramString)) || ("UPC_A".equals(paramString)))
      {
        i = 5;
        AppMethodBeat.o(81494);
      }
      else if (("UPC-E".equals(paramString)) || ("UPC_E".equals(paramString)))
      {
        i = 6;
        AppMethodBeat.o(81494);
      }
      else if (("CODE-39".equals(paramString)) || ("CODE_39".equals(paramString)))
      {
        i = 9;
        AppMethodBeat.o(81494);
      }
      else if (("CODE-93".equals(paramString)) || ("CODE_93".equals(paramString)))
      {
        i = 10;
        AppMethodBeat.o(81494);
      }
      else if (("CODE-128".equals(paramString)) || ("CODE_128".equals(paramString)))
      {
        i = 11;
        AppMethodBeat.o(81494);
      }
      else if ("COMPOSITE".equals(paramString))
      {
        i = 12;
        AppMethodBeat.o(81494);
      }
      else if (("I/25".equals(paramString)) || ("ITF".equals(paramString)))
      {
        i = 13;
        AppMethodBeat.o(81494);
      }
      else if ("DATABAR".equals(paramString))
      {
        i = 7;
        AppMethodBeat.o(81494);
      }
      else if ("DATABAR-EXP".equals(paramString))
      {
        i = 8;
        AppMethodBeat.o(81494);
      }
      else if ("RSS_14".equals(paramString))
      {
        i = 15;
        AppMethodBeat.o(81494);
      }
      else if ("RSS_EXPANDED".equals(paramString))
      {
        i = 16;
        AppMethodBeat.o(81494);
      }
      else if ("MAXICODE".equals(paramString))
      {
        i = 18;
        AppMethodBeat.o(81494);
      }
      else if ("PDF_417".equals(paramString))
      {
        i = 20;
        AppMethodBeat.o(81494);
      }
      else if ("QR_CODE".equals(paramString))
      {
        i = 19;
        AppMethodBeat.o(81494);
      }
      else if ("CODABAR".equals(paramString))
      {
        i = 17;
        AppMethodBeat.o(81494);
      }
      else if ("ISBN10".equals(paramString))
      {
        i = 14;
        AppMethodBeat.o(81494);
      }
      else if ("DATA_MATRIX".equals(paramString))
      {
        i = 21;
        AppMethodBeat.o(81494);
      }
      else if ("WX_CODE".equals(paramString))
      {
        i = 22;
        AppMethodBeat.o(81494);
      }
      else
      {
        AppMethodBeat.o(81494);
      }
    }
  }

  public static r.a Wt(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(81496);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(81496);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = new com/tencent/mm/plugin/scanner/util/r$a;
        paramString.<init>();
        paramString.kbU = localJSONObject.optString("card_tp_id");
        paramString.iAd = localJSONObject.optInt("card_type");
        paramString.cMD = localJSONObject.optString("card_ext");
        AppMethodBeat.o(81496);
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ScannerUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(81496);
        paramString = localObject;
      }
    }
  }

  public static ArrayList<r.a> Wu(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(81497);
    if (TextUtils.isEmpty(paramString))
    {
      AppMethodBeat.o(81497);
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
          ab.e("MicroMsg.ScannerUtil", "parseCardListItemArray cardItemListJson is null");
          AppMethodBeat.o(81497);
          paramString = localObject;
        }
        else
        {
          paramString = new java/util/ArrayList;
          paramString.<init>();
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            localJSONObject = localJSONArray.optJSONObject(i);
            r.a locala = new com/tencent/mm/plugin/scanner/util/r$a;
            locala.<init>();
            locala.kbU = localJSONObject.optString("card_tp_id");
            locala.iAd = localJSONObject.optInt("card_type");
            locala.cMD = localJSONObject.optString("card_ext");
            paramString.add(locala);
          }
          AppMethodBeat.o(81497);
        }
      }
      catch (JSONException paramString)
      {
        ab.printErrStackTrace("MicroMsg.ScannerUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(81497);
        paramString = localObject;
      }
    }
  }

  public static void aQ(Context paramContext, String paramString)
  {
    AppMethodBeat.i(81499);
    h.a(paramContext, paramString, null, false, new r.1());
    AppMethodBeat.o(81499);
  }

  public static boolean cio()
  {
    boolean bool1 = true;
    AppMethodBeat.i(81501);
    int i = ((a)com.tencent.mm.kernel.g.K(a.class)).Nu().getInt("EnableNewOCRTranslation", 0);
    Object localObject = ((a)com.tencent.mm.kernel.g.K(a.class)).Nu().getValue("NewOCRTranslationSupportUserLanguage");
    if (i == 1)
    {
      bool2 = true;
      ab.i("MicroMsg.ScannerUtil", "enable %s, support lang %s, current lang %s", new Object[] { Boolean.valueOf(bool2), localObject, aa.dor() });
      if ((i != 1) || (bo.isNullOrNil((String)localObject)))
        break label134;
      localObject = ((String)localObject).split(";");
      if ((localObject == null) || (!Arrays.asList((Object[])localObject).contains(aa.dor())))
        break label134;
      AppMethodBeat.o(81501);
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      bool2 = false;
      break;
      label134: AppMethodBeat.o(81501);
    }
  }

  public static String fT(String paramString1, String paramString2)
  {
    AppMethodBeat.i(81500);
    Object localObject1 = com.tencent.mm.m.g.Nu().getValue("ScanBookWording");
    ab.i("MicroMsg.ScannerUtil", "scan image dynamic wording: " + bo.nullAsNil((String)localObject1));
    Object localObject2 = paramString2;
    if (!bo.isNullOrNil((String)localObject1))
    {
      localObject1 = ((String)localObject1).split("&");
      localObject2 = paramString2;
      if (localObject1 != null)
      {
        HashMap localHashMap = new HashMap();
        for (int i = 0; i < localObject1.length; i++)
        {
          localObject2 = localObject1[i].split("=");
          if (localObject2.length == 2)
            localHashMap.put(localObject2[0], localObject2[1]);
        }
        paramString1 = (String)localHashMap.get(paramString1);
        localObject2 = paramString2;
        if (!bo.isNullOrNil(paramString1))
          localObject2 = paramString1;
      }
    }
    AppMethodBeat.o(81500);
    return localObject2;
  }

  public static boolean sP(int paramInt)
  {
    AppMethodBeat.i(81495);
    b localb = (b)com.tencent.mm.kernel.g.K(b.class);
    boolean bool;
    if (localb != null)
    {
      bool = localb.sP(paramInt);
      AppMethodBeat.o(81495);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(81495);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.util.r
 * JD-Core Version:    0.6.2
 */