package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;

public class g extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
    AppMethodBeat.i(6287);
    ab.i("MicroMsg.JsApiChooseImage", "invoke");
    Object localObject1 = parama.bPa.bOf;
    Object localObject2 = ((JSONObject)localObject1).optJSONArray("sourceType");
    int i;
    int j;
    if (localObject2 != null)
    {
      ab.i("MicroMsg.JsApiChooseImage", "sourceType = " + ((JSONArray)localObject2).toString());
      i = 0;
      j = 0;
      if (i < ((JSONArray)localObject2).length())
      {
        if (((JSONArray)localObject2).optString(i).equals("album"))
          k = j | 0x1;
        while (true)
        {
          i++;
          j = k;
          break;
          k = j;
          if (((JSONArray)localObject2).optString(i).equals("camera"))
            k = j | 0x2;
        }
      }
    }
    for (int k = j; ; k = 0)
    {
      if (k == 0);
      for (j = 3; ; j = k)
      {
        ab.i("MicroMsg.JsApiChooseImage", "real scene = %d", new Object[] { Integer.valueOf(j) });
        if ((j == 2) || (j == 3))
        {
          boolean bool = b.a((Activity)((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext, "android.permission.CAMERA", 113, "", "");
          ab.d("MicroMsg.JsApiChooseImage", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            parama.a("android_permission_denied", null);
            AppMethodBeat.o(6287);
            return;
          }
        }
        i = ((JSONObject)localObject1).optInt("count", 0);
        localObject2 = Boolean.FALSE;
        Object localObject3 = Boolean.FALSE;
        JSONArray localJSONArray = ((JSONObject)localObject1).optJSONArray("sizeType");
        localObject1 = localObject3;
        Object localObject4 = localObject2;
        if (localJSONArray != null)
        {
          k = 0;
          localObject1 = localObject3;
          localObject4 = localObject2;
          if (k < localJSONArray.length())
          {
            if (localJSONArray.optString(k).equals("original"))
              localObject1 = Boolean.TRUE;
            while (true)
            {
              k++;
              localObject2 = localObject1;
              break;
              localObject1 = localObject2;
              if (localJSONArray.optString(k).equals("compressed"))
              {
                localObject3 = Boolean.TRUE;
                localObject1 = localObject2;
              }
            }
          }
        }
        if ((localObject4.booleanValue()) && (!((Boolean)localObject1).booleanValue()))
        {
          k = 7;
          localObject2 = Boolean.TRUE;
        }
        while (true)
        {
          localObject3 = new Intent();
          ((Intent)localObject3).putExtra("key_pick_local_pic_capture", j);
          ((Intent)localObject3).putExtra("key_pick_local_pic_count", i);
          ((Intent)localObject3).putExtra("key_pick_local_pic_query_source_type", k);
          ((Intent)localObject3).putExtra("key_pick_local_pic_send_raw", (Serializable)localObject2);
          ((Intent)localObject3).putExtra("query_media_type", 1);
          ab.i("MicroMsg.JsApiChooseImage", "doChooseImage: realScene: %d, count: %d, querySourceType: %d, sendRaw: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(k), localObject2 });
          ((MMActivity)((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext).ifE = new g.1(this, parama);
          com.tencent.mm.bp.d.a(((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext, "webview", ".ui.tools.OpenFileChooserUI", (Intent)localObject3, hashCode() & 0xFFFF, false);
          AppMethodBeat.o(6287);
          break;
          if ((!localObject4.booleanValue()) && (((Boolean)localObject1).booleanValue()))
          {
            k = 7;
            localObject2 = Boolean.FALSE;
          }
          else
          {
            k = 8;
            localObject2 = Boolean.FALSE;
          }
        }
      }
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "chooseImage";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.g
 * JD-Core Version:    0.6.2
 */