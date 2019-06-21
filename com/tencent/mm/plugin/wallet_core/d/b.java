package com.tencent.mm.plugin.wallet_core.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.wallet_core.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.util.EncodingUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{
  private static final String kdH;
  private static Map<String, String> tDM;

  static
  {
    AppMethodBeat.i(47058);
    kdH = com.tencent.mm.compatible.util.e.eSn + "wallet";
    tDM = null;
    AppMethodBeat.o(47058);
  }

  public static String UK(String paramString)
  {
    AppMethodBeat.i(47057);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.WalletBankLogoStorage", "getStoragePath: but url is null");
      paramString = null;
      AppMethodBeat.o(47057);
    }
    while (true)
    {
      return paramString;
      paramString = String.format("%s/%s", new Object[] { kdH, com.tencent.mm.a.g.x(paramString.getBytes()) });
      AppMethodBeat.o(47057);
    }
  }

  public static boolean acL(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(47050);
    try
    {
      if (tDM == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        tDM = (Map)localObject1;
      }
      ab.d("MicroMsg.WalletBankLogoStorage", "bank logo:".concat(String.valueOf(paramString)));
      Object localObject1 = ah.getContext().getSharedPreferences("bank_logo", 0).edit();
      Object localObject2 = new org/json/JSONObject;
      ((JSONObject)localObject2).<init>(paramString);
      localObject2 = ((JSONObject)localObject2).getJSONArray("bank_urls_list");
      int i = ((JSONArray)localObject2).length();
      int j = 0;
      if (j < i)
      {
        Object localObject3 = ((JSONArray)localObject2).getJSONObject(j);
        if (r.YM());
        for (paramString = ((JSONObject)localObject3).optString("bank_desc"); ; paramString = ((JSONObject)localObject3).optString("bank_type"))
        {
          localObject3 = ((JSONObject)localObject3).toString();
          if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil((String)localObject3)))
            break label169;
          ((SharedPreferences.Editor)localObject1).putString(paramString, (String)localObject3);
          tDM.put(paramString, localObject3);
          j++;
          break;
        }
      }
      label169: ((SharedPreferences.Editor)localObject1).commit();
      ab.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      AppMethodBeat.o(47050);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramString.getMessage() });
        ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "", new Object[0]);
        AppMethodBeat.o(47050);
        bool = false;
      }
    }
  }

  public static com.tencent.mm.plugin.wallet_core.model.e acM(String paramString)
  {
    AppMethodBeat.i(47052);
    if (tDM == null)
      cRa();
    int i;
    if (!bo.isNullOrNil((String)tDM.get(paramString)))
    {
      i = 1;
      if (i != 0)
        break label52;
      AppMethodBeat.o(47052);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label52: String str = (String)tDM.get(paramString);
      if (!bo.isNullOrNil(str))
      {
        paramString = new com.tencent.mm.plugin.wallet_core.model.e();
        try
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(str);
          long l = localJSONObject.optLong("timestamp", 0L);
          paramString.oRi = localJSONObject.getString("logo2x_url");
          paramString.txp = localJSONObject.getString("bg2x_url");
          paramString.txq = localJSONObject.getString("wl2x_url");
          if (System.currentTimeMillis() / 1000L - l > 7200L);
          for (boolean bool = true; ; bool = false)
          {
            paramString.bNM = bool;
            paramString.txr = UK(paramString.oRi);
            paramString.puh = localJSONObject.optString("bank_name_pinyin", "");
            paramString.timestamp = l;
            AppMethodBeat.o(47052);
            break;
          }
        }
        catch (JSONException paramString)
        {
          ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "", new Object[0]);
          AppMethodBeat.o(47052);
          paramString = null;
        }
      }
      else
      {
        AppMethodBeat.o(47052);
        paramString = null;
      }
    }
  }

  public static boolean av(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(47051);
    long l = System.currentTimeMillis() / 1000L;
    try
    {
      Object localObject1;
      if (tDM == null)
      {
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        tDM = (Map)localObject1;
      }
      SharedPreferences.Editor localEditor = ah.getContext().getSharedPreferences("bank_logo", 0).edit();
      int i = paramLinkedList.size();
      int j = 0;
      if (j < i)
      {
        localObject1 = (String)paramLinkedList.get(j);
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        if (r.YM());
        for (localObject1 = ((JSONObject)localObject2).optString("bank_desc"); ; localObject1 = ((JSONObject)localObject2).optString("bank_type"))
        {
          ((JSONObject)localObject2).put("timestamp", l);
          localObject2 = ((JSONObject)localObject2).toString();
          if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil((String)localObject2)))
            break label170;
          localEditor.putString((String)localObject1, (String)localObject2);
          tDM.put(localObject1, localObject2);
          j++;
          break;
        }
      }
      label170: localEditor.commit();
      ab.d("MicroMsg.WalletBankLogoStorage", "update BankLogo config file. success!");
      AppMethodBeat.o(47051);
      bool = true;
      return bool;
    }
    catch (Exception paramLinkedList)
    {
      while (true)
      {
        ab.e("MicroMsg.WalletBankLogoStorage", "parse band logo error. %s", new Object[] { paramLinkedList.getMessage() });
        ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramLinkedList, "", new Object[0]);
        AppMethodBeat.o(47051);
        boolean bool = false;
      }
    }
  }

  private static com.tencent.mm.plugin.wallet_core.model.e bc(Context paramContext, String paramString)
  {
    Object localObject1 = null;
    boolean bool1 = true;
    AppMethodBeat.i(47055);
    Object localObject2;
    Object localObject3;
    int i;
    if (tDM == null)
    {
      cRa();
      localObject2 = (String)tDM.get(paramString);
      if (!bo.isNullOrNil((String)localObject2))
        break label411;
      com.tencent.mm.kernel.g.RQ();
      if (com.tencent.mm.kernel.g.RP().isSDCardAvailable())
      {
        localObject3 = new LinkedList();
        ((LinkedList)localObject3).add(paramString);
        localObject3 = new c((LinkedList)localObject3);
        com.tencent.mm.kernel.g.RQ();
        com.tencent.mm.kernel.g.RO().eJo.a((m)localObject3, 0);
      }
      acL(bd(paramContext, "config/bank_logo.xml"));
      if (tDM == null)
        break label405;
      localObject2 = (String)tDM.get(paramString);
      i = 1;
    }
    while (true)
    {
      if (!bo.isNullOrNil((String)localObject2));
      for (paramContext = new com.tencent.mm.plugin.wallet_core.model.e(); ; paramContext = null)
        try
        {
          paramString = new org/json/JSONObject;
          paramString.<init>((String)localObject2);
          long l = paramString.optLong("timestamp", 0L);
          paramContext.oRi = paramString.getString("logo2x_url");
          paramContext.txp = paramString.getString("bg2x_url");
          paramContext.txq = paramString.getString("wl2x_url");
          boolean bool2 = bool1;
          if (i == 0)
            if (System.currentTimeMillis() / 1000L - l <= 7200L)
              break label370;
          label370: for (bool2 = bool1; ; bool2 = false)
          {
            paramContext.bNM = bool2;
            paramContext.txr = UK(paramContext.oRi);
            paramContext.puh = paramString.optString("bank_name_pinyin", "");
            paramContext.timestamp = l;
            AppMethodBeat.o(47055);
            return paramContext;
            localObject3 = (String)tDM.get(paramString);
            localObject2 = localObject3;
            if (localObject3 != null)
              break;
            ab.i("MicroMsg.WalletBankLogoStorage", "can not get from bankLogoCache %s", new Object[] { paramString });
            localObject3 = ah.getContext().getSharedPreferences("bank_logo", 0).getString(paramString, "");
            localObject2 = localObject3;
            if (localObject3 == null)
              break;
            ab.w("MicroMsg.WalletBankLogoStorage", "get from sp %s", new Object[] { paramString });
            tDM.put(paramString, localObject3);
            localObject2 = localObject3;
            break;
          }
        }
        catch (JSONException paramContext)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "", new Object[0]);
            AppMethodBeat.o(47055);
            paramContext = localObject1;
          }
        }
      label405: i = 1;
      continue;
      label411: i = 0;
    }
  }

  private static String bd(Context paramContext, String paramString)
  {
    AppMethodBeat.i(47056);
    String str = "";
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      paramContext = paramContext.getAssets().open(paramString);
      localObject2 = paramContext;
      localObject1 = paramContext;
      paramString = new byte[paramContext.available()];
      localObject2 = paramContext;
      localObject1 = paramContext;
      paramContext.read(paramString);
      localObject2 = paramContext;
      localObject1 = paramContext;
      paramString = EncodingUtils.getString(paramString, "UTF-8");
      localObject2 = paramString;
      paramString = (String)localObject2;
      if (paramContext != null);
      try
      {
        paramContext.close();
        paramString = (String)localObject2;
        AppMethodBeat.o(47056);
        return paramString;
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
          paramString = (String)localObject2;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "getFromAssets", new Object[0]);
        paramString = str;
        if (localObject2 != null)
          try
          {
            ((InputStream)localObject2).close();
            paramString = str;
          }
          catch (Exception paramContext)
          {
            ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramContext, "close", new Object[0]);
            paramString = str;
          }
      }
    }
    finally
    {
      if (localObject1 == null);
    }
    try
    {
      ((InputStream)localObject1).close();
      AppMethodBeat.o(47056);
      throw paramContext;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletBankLogoStorage", paramString, "close", new Object[0]);
    }
  }

  private static void cRa()
  {
    AppMethodBeat.i(47053);
    tDM = new HashMap();
    Iterator localIterator = ah.getContext().getSharedPreferences("bank_logo", 0).getAll().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      tDM.put(localEntry.getKey(), (String)localEntry.getValue());
    }
    AppMethodBeat.o(47053);
  }

  public static String cRb()
  {
    return kdH;
  }

  public static com.tencent.mm.plugin.wallet_core.model.e i(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(47054);
    Object localObject;
    if (!paramBoolean)
    {
      localObject = bc(paramContext, paramString);
      AppMethodBeat.o(47054);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      if ("CITIC_CREDIT".equals(paramString))
      {
        com.tencent.mm.plugin.wallet_core.model.e locale = new com.tencent.mm.plugin.wallet_core.model.e();
        locale.txt = 2130840676;
        locale.txu = 2130840678;
        paramContext = bc(paramContext, paramString);
        localObject = locale;
        if (paramContext != null)
        {
          locale.oRi = paramContext.oRi;
          localObject = locale;
        }
      }
      AppMethodBeat.o(47054);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.b
 * JD-Core Version:    0.6.2
 */