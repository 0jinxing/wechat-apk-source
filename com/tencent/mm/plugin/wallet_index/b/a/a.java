package com.tencent.mm.plugin.wallet_index.b.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_index.ui.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;

public final class a
{
  private static void OA(String paramString)
  {
    AppMethodBeat.i(48167);
    ab.e("MicroMsg.IabResolver", "In-app billing error: ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(48167);
  }

  public static int a(Intent paramIntent, a.a parama)
  {
    AppMethodBeat.i(48166);
    b localb = new b();
    int i = ay(paramIntent);
    ab.d("MicroMsg.IabResolver", "Owned items response: " + String.valueOf(i));
    if (i != 0)
    {
      parama.a(com.tencent.mm.plugin.wallet_index.c.b.bu(i, ""), null);
      AppMethodBeat.o(48166);
    }
    while (true)
    {
      return i;
      if ((!paramIntent.hasExtra("INAPP_PURCHASE_ITEM_LIST")) || (!paramIntent.hasExtra("INAPP_PURCHASE_DATA_LIST")) || (!paramIntent.hasExtra("INAPP_DATA_SIGNATURE_LIST")))
      {
        OA("Bundle returned from getPurchases() doesn't contain required fields.");
        parama.a(com.tencent.mm.plugin.wallet_index.c.b.bu(5, ""), null);
        AppMethodBeat.o(48166);
        i = 5;
        continue;
      }
      ArrayList localArrayList1 = paramIntent.getStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST");
      ArrayList localArrayList2 = paramIntent.getStringArrayListExtra("INAPP_PURCHASE_DATA_LIST");
      ArrayList localArrayList3 = paramIntent.getStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST");
      i = 0;
      try
      {
        while (i < localArrayList2.size())
        {
          String str = (String)localArrayList2.get(i);
          paramIntent = (String)localArrayList3.get(i);
          ab.d("MicroMsg.IabResolver", "Sku is owned: ".concat(String.valueOf((String)localArrayList1.get(i))));
          c localc = new com/tencent/mm/plugin/wallet_index/b/a/c;
          localc.<init>("inapp", str, paramIntent);
          if (TextUtils.isEmpty(localc.gtl))
          {
            ab.w("MicroMsg.IabResolver", "In-app billing warning: ".concat(String.valueOf("BUG: empty/null token!")));
            ab.d("MicroMsg.IabResolver", "Purchase data: ".concat(String.valueOf(str)));
          }
          localb.tQQ.put(localc.kWz, localc);
          i++;
        }
        parama.a(com.tencent.mm.plugin.wallet_index.c.b.bu(0, ""), localb);
        AppMethodBeat.o(48166);
        i = 0;
      }
      catch (JSONException paramIntent)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.IabResolver", paramIntent, "", new Object[0]);
          parama.a(com.tencent.mm.plugin.wallet_index.c.b.bu(5, ""), localb);
        }
      }
    }
  }

  public static b a(Intent paramIntent, d paramd)
  {
    Object localObject = null;
    AppMethodBeat.i(48165);
    if (paramIntent == null)
    {
      OA("Null data in IAB activity result.");
      paramIntent = com.tencent.mm.plugin.wallet_index.c.b.bu(5, "");
      if (paramd != null)
        paramd.a(paramIntent, null);
      AppMethodBeat.o(48165);
      paramIntent = localObject;
    }
    while (true)
    {
      return paramIntent;
      int i = paramIntent.getIntExtra("RESPONSE_CODE", 0);
      String str1 = paramIntent.getStringExtra("INAPP_PURCHASE_DATA");
      String str2 = paramIntent.getStringExtra("INAPP_DATA_SIGNATURE");
      if (i == 0)
      {
        ab.d("MicroMsg.IabResolver", "Successful resultcode from purchase activity.");
        ab.d("MicroMsg.IabResolver", "Purchase data: ".concat(String.valueOf(str1)));
        ab.d("MicroMsg.IabResolver", "Data signature: ".concat(String.valueOf(str2)));
        ab.d("MicroMsg.IabResolver", "Extras: " + paramIntent.getExtras());
        if ((str1 == null) || (str2 == null))
        {
          OA("BUG: either purchaseData or dataSignature is null.");
          paramIntent = com.tencent.mm.plugin.wallet_index.c.b.bu(5, "");
          if (paramd != null)
            paramd.a(paramIntent, null);
          AppMethodBeat.o(48165);
          paramIntent = localObject;
        }
        else
        {
          try
          {
            c localc = new com/tencent/mm/plugin/wallet_index/b/a/c;
            localc.<init>("inapp", str1, str2);
            str1 = localc.kWz;
            ab.d("MicroMsg.IabResolver", "Purchase signature successfully verified.");
            if (paramd != null)
              paramd.a(com.tencent.mm.plugin.wallet_index.c.b.bu(0, ""), localc);
            paramIntent = new com/tencent/mm/plugin/wallet_index/b/a/b;
            paramIntent.<init>(str1, localc);
            AppMethodBeat.o(48165);
          }
          catch (JSONException paramIntent)
          {
            OA("Failed to parse purchase data.");
            ab.printErrStackTrace("MicroMsg.IabResolver", paramIntent, "", new Object[0]);
            paramIntent = com.tencent.mm.plugin.wallet_index.c.b.bu(5, "");
            if (paramd != null)
              paramd.a(paramIntent, null);
            AppMethodBeat.o(48165);
            paramIntent = localObject;
          }
        }
      }
      else
      {
        OA("Purchase failed. Response: ".concat(String.valueOf(i)));
        paramIntent = com.tencent.mm.plugin.wallet_index.c.b.bu(i, "");
        if (paramd != null)
          paramd.a(paramIntent, null);
        AppMethodBeat.o(48165);
        paramIntent = localObject;
      }
    }
  }

  public static int ay(Intent paramIntent)
  {
    AppMethodBeat.i(48168);
    int i;
    if (paramIntent == null)
    {
      OA("Intent with no response code, assuming OK (known issue)");
      i = 1;
      AppMethodBeat.o(48168);
    }
    while (true)
    {
      return i;
      paramIntent = paramIntent.getExtras().get("RESPONSE_CODE");
      if (paramIntent == null)
      {
        OA("Intent with no response code, assuming OK (known issue)");
        i = 0;
        AppMethodBeat.o(48168);
      }
      else if ((paramIntent instanceof Integer))
      {
        i = ((Integer)paramIntent).intValue();
        AppMethodBeat.o(48168);
      }
      else
      {
        if (!(paramIntent instanceof Long))
          break;
        i = (int)((Long)paramIntent).longValue();
        AppMethodBeat.o(48168);
      }
    }
    OA("Unexpected type for intent response code.");
    OA(paramIntent.getClass().getName());
    paramIntent = new RuntimeException("Unexpected type for intent response code: " + paramIntent.getClass().getName());
    AppMethodBeat.o(48168);
    throw paramIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.b.a.a
 * JD-Core Version:    0.6.2
 */