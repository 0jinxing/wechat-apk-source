package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

final class aa$1
  implements MMActivity.a
{
  aa$1(aa paramaa, h paramh)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130373);
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
        if (paramIntent == null)
        {
          this.hwr.M(this.hws.bOs, this.hws.j("fail:internal error", null));
          ab.e("MicroMsg.JsApiAddCard", "location result is empty!");
          AppMethodBeat.o(130373);
        }
      while (true)
      {
        return;
        HashMap localHashMap = new HashMap();
        String str = paramIntent.getStringExtra("card_list");
        ab.d("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback cardList:%s", new Object[] { str });
        try
        {
          paramIntent = new org/json/JSONArray;
          paramIntent.<init>(str);
          if (paramIntent != null)
          {
            localHashMap.put("cardList", paramIntent);
            this.hwr.M(this.hws.bOs, this.hws.j("ok", localHashMap));
            AppMethodBeat.o(130373);
          }
        }
        catch (JSONException paramIntent)
        {
          while (true)
          {
            ab.e("MicroMsg.JsApiAddCard", "parse fail result:%s", new Object[] { bo.l(paramIntent) });
            paramIntent = null;
          }
          this.hwr.M(this.hws.bOs, this.hws.j("fail: cardList is empty", localHashMap));
          ab.e("MicroMsg.JsApiAddCard", "add card result is fail! cardList is empty");
          AppMethodBeat.o(130373);
        }
        continue;
        if (paramInt2 != 0)
          break;
        this.hwr.M(this.hws.bOs, this.hws.j("cancel", null));
        ab.e("MicroMsg.JsApiAddCard", "add card result is cancel!");
        AppMethodBeat.o(130373);
      }
      if (paramIntent == null)
        break label365;
    }
    label365: for (paramInt1 = paramIntent.getIntExtra("result_code", 2); ; paramInt1 = 2)
    {
      ab.i("MicroMsg.JsApiAddCard", "mmSetOnActivityResultCallback ret_code:%d", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 == 2)
      {
        this.hwr.M(this.hws.bOs, this.hws.j("fail:internal error", null));
        AppMethodBeat.o(130373);
        break;
      }
      this.hwr.M(this.hws.bOs, this.hws.j("cancel", null));
      AppMethodBeat.o(130373);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.aa.1
 * JD-Core Version:    0.6.2
 */