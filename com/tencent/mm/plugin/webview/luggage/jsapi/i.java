package com.tencent.mm.plugin.webview.luggage.jsapi;

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
import org.json.JSONObject;

public class i extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  public static void a(a<com.tencent.mm.plugin.webview.luggage.d>.a parama, int paramInt)
  {
    AppMethodBeat.i(6303);
    MMActivity localMMActivity = (MMActivity)((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext;
    if (localMMActivity == null)
    {
      ab.e("MicroMsg.JsApiChooseVideo", "activity is null");
      AppMethodBeat.o(6303);
      return;
    }
    JSONObject localJSONObject = parama.bPa.bOf;
    Object localObject = localJSONObject.optString("sourceType", "");
    String str = localJSONObject.optString("camera", "");
    ab.i("MicroMsg.JsApiChooseVideo", "doChooseVideo sourceType = %s, camera = %s, isVideoType:%d", new Object[] { localObject, str, Integer.valueOf(paramInt) });
    int i = localJSONObject.optInt("maxDuration", 60);
    if (((String)localObject).contains("album"));
    for (int j = 4096; ; j = 0)
    {
      int k = j;
      if (((String)localObject).contains("camera"))
      {
        if (i <= 0)
        {
          parama.a("fail", null);
          AppMethodBeat.o(6303);
          break;
        }
        if (!str.equals("front"))
          break label256;
        k = j | 0x10;
      }
      label171: if (k == 0)
        k = 4352;
      while (true)
      {
        if ((k == 16) || (k == 256) || (k == 4352))
        {
          if (paramInt == 1)
          {
            bool = b.a(localMMActivity, "android.permission.CAMERA", 117, "", "");
            ab.d("MicroMsg.JsApiChooseVideo", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
            if (!bool)
            {
              AppMethodBeat.o(6303);
              break;
              label256: k = j | 0x100;
              break label171;
            }
            bool = b.a(localMMActivity, "android.permission.RECORD_AUDIO", 118, "", "");
            ab.d("MicroMsg.JsApiChooseVideo", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool) });
            if (bool)
              break label361;
            AppMethodBeat.o(6303);
            break;
          }
          boolean bool = b.a(localMMActivity, "android.permission.CAMERA", 115, "", "");
          ab.d("MicroMsg.JsApiChooseVideo", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            AppMethodBeat.o(6303);
            break;
          }
        }
        label361: j = localJSONObject.optInt("quality", 1);
        if ((j != 0) && (j != 1))
          j = 1;
        while (true)
        {
          if (i > 60)
            i = 60;
          while (true)
          {
            ab.i("MicroMsg.JsApiChooseVideo", "doChooseVideo real scene = %d, select count = %d, video quality = %d, duration = %d", new Object[] { Integer.valueOf(k), Integer.valueOf(1), Integer.valueOf(j), Integer.valueOf(i) });
            localObject = new Intent();
            ((Intent)localObject).putExtra("key_pick_local_pic_capture", k);
            ((Intent)localObject).putExtra("key_pick_local_pic_count", 1);
            ((Intent)localObject).putExtra("key_pick_local_pic_query_source_type", 7);
            ((Intent)localObject).putExtra("key_pick_local_media_quality", j);
            ((Intent)localObject).putExtra("key_pick_local_media_duration", i);
            ((Intent)localObject).putExtra("query_media_type", 2);
            ((Intent)localObject).putExtra("key_pick_local_media_video_type", paramInt);
            ab.i("MicroMsg.JsApiChooseVideo", "doChooseVideo: realScene: %d, count: %d, querySourceType: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(1), Integer.valueOf(7) });
            localMMActivity.ifE = new i.1(parama, localMMActivity);
            if (paramInt == 1)
            {
              com.tencent.mm.bp.d.a(localMMActivity, "webview", ".ui.tools.OpenFileChooserUI", (Intent)localObject, 45, false);
              AppMethodBeat.o(6303);
              break;
            }
            com.tencent.mm.bp.d.a(localMMActivity, "webview", ".ui.tools.OpenFileChooserUI", (Intent)localObject, 32, false);
            AppMethodBeat.o(6303);
            break;
          }
        }
      }
    }
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
    AppMethodBeat.i(6302);
    ab.i("MicroMsg.JsApiChooseVideo", "invokeInOwn");
    a(parama, 0);
    AppMethodBeat.o(6302);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "chooseVideo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.i
 * JD-Core Version:    0.6.2
 */