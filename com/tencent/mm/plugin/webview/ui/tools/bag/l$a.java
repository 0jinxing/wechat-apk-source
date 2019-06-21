package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import org.json.JSONException;
import org.json.JSONObject;

public final class l$a
{
  String cIY;
  long fAx;
  String id;
  int scene;
  public String url;
  int uzA;
  int uzB;
  JSONObject uzC;

  public l$a()
  {
    AppMethodBeat.i(8216);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xVp, null);
    ab.i("MicroMsg.WebViewBagMgr", "BagInfo#load %s", new Object[] { str });
    if (bo.isNullOrNil(str))
    {
      this.id = null;
      this.url = null;
      this.cIY = null;
      this.uzB = (a.gd(ah.getContext()) - b.uyj - b.uyk);
      this.uzA = (b.uyi + ah.getContext().getResources().getDimensionPixelSize(2131428770));
      this.uzC = new JSONObject();
      ab.i("MicroMsg.WebViewBagMgr", "BAG_INIT_X:%d BAG_INIT_Y:%d", new Object[] { Integer.valueOf(this.uzB), Integer.valueOf(this.uzA) });
      AppMethodBeat.o(8216);
    }
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        this.url = localJSONObject.getString("url");
        this.id = localJSONObject.optString("id", ag.ck(String.format("bagId#%d#%s", new Object[] { Long.valueOf(System.currentTimeMillis()), this.url })));
        this.cIY = localJSONObject.getString("icon");
        this.uzA = localJSONObject.getInt("pos_y");
        this.uzB = localJSONObject.getInt("pos_x");
        this.fAx = localJSONObject.getLong("last_active_time");
        this.uzC = localJSONObject.getJSONObject("extras");
        this.scene = localJSONObject.optInt("scene", 0);
        AppMethodBeat.o(8216);
      }
      catch (JSONException localJSONException)
      {
        ab.e("MicroMsg.WebViewBagMgr", "BagInfo#load exp:%s", new Object[] { localJSONException });
        AppMethodBeat.o(8216);
      }
    }
  }

  final void save()
  {
    AppMethodBeat.i(8217);
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("id", bo.nullAsNil(this.id));
      ((JSONObject)localObject).put("url", bo.nullAsNil(this.url));
      ((JSONObject)localObject).put("icon", bo.nullAsNil(this.cIY));
      ((JSONObject)localObject).put("pos_y", this.uzA);
      ((JSONObject)localObject).put("pos_x", this.uzB);
      ((JSONObject)localObject).put("last_active_time", this.fAx);
      ((JSONObject)localObject).put("extras", this.uzC);
      ((JSONObject)localObject).put("scene", this.scene);
      localObject = ((JSONObject)localObject).toString();
      g.RQ();
      g.RP().Ry().set(ac.a.xVp, localObject);
      AppMethodBeat.o(8217);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewBagMgr", "BagInfo#save exp:%s", new Object[] { localJSONException });
        AppMethodBeat.o(8217);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.l.a
 * JD-Core Version:    0.6.2
 */