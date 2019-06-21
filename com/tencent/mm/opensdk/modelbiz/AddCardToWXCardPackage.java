package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONStringer;

public class AddCardToWXCardPackage
{
  private static final String TAG = "MicroMsg.AddCardToWXCardPackage";

  public static class Req extends BaseReq
  {
    public List<AddCardToWXCardPackage.WXCardItem> cardArrary;

    public boolean checkArgs()
    {
      AppMethodBeat.i(128174);
      boolean bool;
      if ((this.cardArrary == null) || (this.cardArrary.size() == 0) || (this.cardArrary.size() > 40))
      {
        AppMethodBeat.o(128174);
        bool = false;
      }
      while (true)
      {
        return bool;
        Iterator localIterator = this.cardArrary.iterator();
        while (true)
          if (localIterator.hasNext())
          {
            AddCardToWXCardPackage.WXCardItem localWXCardItem = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
            if ((localWXCardItem == null) || (localWXCardItem.cardId == null) || (localWXCardItem.cardId.length() > 1024) || ((localWXCardItem.cardExtMsg != null) && (localWXCardItem.cardExtMsg.length() > 1024)))
            {
              AppMethodBeat.o(128174);
              bool = false;
              break;
            }
          }
        bool = true;
        AppMethodBeat.o(128174);
      }
    }

    public int getType()
    {
      return 9;
    }

    public void toBundle(Bundle paramBundle)
    {
      AppMethodBeat.i(128175);
      super.toBundle(paramBundle);
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.object();
        localJSONStringer.key("card_list");
        localJSONStringer.array();
        Iterator localIterator = this.cardArrary.iterator();
        while (true)
        {
          if (!localIterator.hasNext())
            break label174;
          Object localObject = (AddCardToWXCardPackage.WXCardItem)localIterator.next();
          localJSONStringer.object();
          localJSONStringer.key("card_id");
          localJSONStringer.value(((AddCardToWXCardPackage.WXCardItem)localObject).cardId);
          localJSONStringer.key("card_ext");
          if (((AddCardToWXCardPackage.WXCardItem)localObject).cardExtMsg != null)
            break;
          localObject = "";
          localJSONStringer.value(localObject);
          localJSONStringer.endObject();
        }
      }
      catch (Exception localException)
      {
        Log.e("MicroMsg.AddCardToWXCardPackage", "Req.toBundle exception:" + localException.getMessage());
      }
      while (true)
      {
        paramBundle.putString("_wxapi_add_card_to_wx_card_list", localJSONStringer.toString());
        AppMethodBeat.o(128175);
        return;
        String str = localException.cardExtMsg;
        break;
        label174: localJSONStringer.endArray();
        localJSONStringer.endObject();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage
 * JD-Core Version:    0.6.2
 */