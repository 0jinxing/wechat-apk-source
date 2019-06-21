package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.utils.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

public class AddCardToWXCardPackage$Resp extends BaseResp
{
  public List<AddCardToWXCardPackage.WXCardItem> cardArrary;

  public AddCardToWXCardPackage$Resp()
  {
  }

  public AddCardToWXCardPackage$Resp(Bundle paramBundle)
  {
    AppMethodBeat.i(128185);
    fromBundle(paramBundle);
    AppMethodBeat.o(128185);
  }

  public boolean checkArgs()
  {
    AppMethodBeat.i(128186);
    boolean bool;
    if ((this.cardArrary == null) || (this.cardArrary.size() == 0))
    {
      bool = false;
      AppMethodBeat.o(128186);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128186);
    }
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128188);
    super.fromBundle(paramBundle);
    if (this.cardArrary == null)
      this.cardArrary = new LinkedList();
    Object localObject = paramBundle.getString("_wxapi_add_card_to_wx_card_list");
    if ((localObject != null) && (((String)localObject).length() > 0));
    while (true)
    {
      try
      {
        paramBundle = new org/json/JSONTokener;
        paramBundle.<init>((String)localObject);
        paramBundle = ((JSONObject)paramBundle.nextValue()).getJSONArray("card_list");
        int i = 0;
        if (i < paramBundle.length())
        {
          localObject = paramBundle.getJSONObject(i);
          AddCardToWXCardPackage.WXCardItem localWXCardItem = new com/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;
          localWXCardItem.<init>();
          localWXCardItem.cardId = ((JSONObject)localObject).optString("card_id");
          localWXCardItem.cardExtMsg = ((JSONObject)localObject).optString("card_ext");
          localWXCardItem.cardState = ((JSONObject)localObject).optInt("is_succ");
          this.cardArrary.add(localWXCardItem);
          i++;
          continue;
        }
        AppMethodBeat.o(128188);
        return;
      }
      catch (Exception paramBundle)
      {
      }
      AppMethodBeat.o(128188);
    }
  }

  public int getType()
  {
    return 9;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128187);
    super.toBundle(paramBundle);
    JSONStringer localJSONStringer = new JSONStringer();
    AddCardToWXCardPackage.WXCardItem localWXCardItem;
    try
    {
      localJSONStringer.object();
      localJSONStringer.key("card_list");
      localJSONStringer.array();
      Iterator localIterator = this.cardArrary.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label192;
        localWXCardItem = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
        localJSONStringer.object();
        localJSONStringer.key("card_id");
        localJSONStringer.value(localWXCardItem.cardId);
        localJSONStringer.key("card_ext");
        if (localWXCardItem.cardExtMsg != null)
          break;
        String str1 = "";
        localJSONStringer.value(str1);
        localJSONStringer.key("is_succ");
        localJSONStringer.value(localWXCardItem.cardState);
        localJSONStringer.endObject();
      }
    }
    catch (Exception localException)
    {
      Log.e("MicroMsg.AddCardToWXCardPackage", "Resp.toBundle exception:" + localException.getMessage());
    }
    while (true)
    {
      paramBundle.putString("_wxapi_add_card_to_wx_card_list", localJSONStringer.toString());
      AppMethodBeat.o(128187);
      return;
      String str2 = localWXCardItem.cardExtMsg;
      break;
      label192: localJSONStringer.endArray();
      localJSONStringer.endObject();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage.Resp
 * JD-Core Version:    0.6.2
 */