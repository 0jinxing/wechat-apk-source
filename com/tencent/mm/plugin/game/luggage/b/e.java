package com.tencent.mm.plugin.game.luggage.b;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader_app.a.b;
import com.tencent.mm.plugin.downloader_app.a.d;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e extends bc
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(135870);
    Object localObject = ((d)g.K(d.class)).biz();
    if (bo.ek((List)localObject))
    {
      parama.d(null, null);
      AppMethodBeat.o(135870);
    }
    while (true)
    {
      return;
      paramContext = new JSONObject();
      paramString = new JSONArray();
      localObject = ((LinkedList)localObject).iterator();
      label63: b localb;
      JSONObject localJSONObject;
      if (((Iterator)localObject).hasNext())
      {
        localb = (b)((Iterator)localObject).next();
        localJSONObject = new JSONObject();
      }
      try
      {
        localJSONObject.put("appid", localb.appId);
        localJSONObject.put("status", localb.kOe);
        localJSONObject.put("download_id", localb.crZ);
        localJSONObject.put("progress", localb.progress);
        if (localb.kNu)
          localJSONObject.put("reserve_for_wifi", 1);
        label163: paramString.put(localJSONObject);
        break label63;
        try
        {
          paramContext.put("result", paramString.toString());
          label184: parama.d(null, paramContext);
          AppMethodBeat.o(135870);
        }
        catch (JSONException paramString)
        {
          break label184;
        }
      }
      catch (JSONException localJSONException)
      {
        break label163;
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "getDownloadWidgetTaskInfos";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.b.e
 * JD-Core Version:    0.6.2
 */