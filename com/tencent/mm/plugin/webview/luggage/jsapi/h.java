package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.luggage.bridge.k;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.tools.j;
import java.util.HashMap;
import org.json.JSONObject;

public class h extends bd<com.tencent.mm.plugin.webview.luggage.d>
{
  private MMActivity.a hvq;
  private MMActivity hwd;
  private a<com.tencent.mm.plugin.webview.luggage.d>.a ujY;

  public h()
  {
    AppMethodBeat.i(6292);
    this.hvq = new h.4(this);
    AppMethodBeat.o(6292);
  }

  private void aA(Intent paramIntent)
  {
    AppMethodBeat.i(6295);
    ab.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromAlbum");
    paramIntent.putExtra("key_pick_local_pic_capture", 4096);
    this.hwd.ifE = this.hvq;
    com.tencent.mm.bp.d.a(this.hwd, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 0xFFFF & hashCode(), false);
    AppMethodBeat.o(6295);
  }

  private void b(String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(6294);
    ab.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromCamera");
    if (paramString.equals("front"));
    for (int i = 16; ; i = 256)
    {
      paramIntent.putExtra("key_pick_local_pic_capture", i);
      this.hwd.ifE = this.hvq;
      com.tencent.mm.bp.d.a(this.hwd, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 0xFFFF & hashCode(), false);
      AppMethodBeat.o(6294);
      return;
    }
  }

  private void b(String paramString, HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(6296);
    if (this.ujY != null)
      this.ujY.c(paramString, paramHashMap);
    this.ujY = null;
    this.hwd = null;
    AppMethodBeat.o(6296);
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<com.tencent.mm.plugin.webview.luggage.d>.a parama)
  {
    AppMethodBeat.i(6293);
    ab.i("MicroMsg.JsApiChooseMedia", "invoke");
    this.hwd = ((MMActivity)((com.tencent.mm.plugin.webview.luggage.d)parama.bOZ).mContext);
    this.ujY = parama;
    if (this.hwd == null)
    {
      b("fail", null);
      AppMethodBeat.o(6293);
    }
    boolean bool2;
    while (true)
    {
      return;
      localObject = parama.bPa.bOf;
      boolean bool1 = b.a(this.hwd, "android.permission.CAMERA", 119, "", "");
      ab.i("MicroMsg.JsApiChooseMedia", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool1) });
      bool2 = b.a(this.hwd, "android.permission.RECORD_AUDIO", 120, "", "");
      ab.i("MicroMsg.JsApiChooseMedia", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool2) });
      if ((bool2) && (bool1))
        break;
      b("no_user_permission", null);
      AppMethodBeat.o(6293);
    }
    parama = bo.nullAsNil(((JSONObject)localObject).optString("sourceType"));
    String str1 = ((JSONObject)localObject).optString("mediaType", "");
    int i = Math.min(((JSONObject)localObject).optInt("maxDuration", 10), 10);
    String str2 = ((JSONObject)localObject).optString("camera", "");
    int j = ((JSONObject)localObject).optInt("count", 1);
    String str3 = ((JSONObject)localObject).optString("sizeType", "");
    ab.i("MicroMsg.JsApiChooseMedia", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", new Object[] { parama, str1, Integer.valueOf(i), str2, Integer.valueOf(j), str3 });
    Object localObject = new Intent();
    ((Intent)localObject).putExtra("key_pick_local_pic_count", j);
    j = i;
    if (i <= 0)
      j = 10;
    ((Intent)localObject).putExtra("key_pick_local_media_duration", j);
    ((Intent)localObject).putExtra("query_media_type", 3);
    ((Intent)localObject).putExtra("key_pick_local_media_video_type", 2);
    ((Intent)localObject).putExtra("key_pick_local_media_sight_type", str1);
    if ((str3.contains("original") ^ str3.contains("compressed")))
    {
      j = 7;
      label356: ((Intent)localObject).putExtra("key_pick_local_pic_query_source_type", j);
      if (!str3.contains("compressed"))
        break label487;
      bool2 = true;
      label378: ((Intent)localObject).putExtra("key_pick_local_pic_send_raw", Boolean.valueOf(bool2));
      if (!bo.isNullOrNil(parama))
        break label558;
      parama = "album|camera";
    }
    label558: 
    while (true)
    {
      if ((parama.contains("album")) && (parama.contains("camera")))
      {
        parama = new j(this.hwd);
        parama.b(null, new View.OnCreateContextMenuListener()
        {
          public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
          {
            AppMethodBeat.i(6288);
            paramAnonymousContextMenu.add(0, 1, 0, h.a(h.this).getString(2131296918));
            paramAnonymousContextMenu.add(0, 2, 1, h.a(h.this).getString(2131296925));
            AppMethodBeat.o(6288);
          }
        }
        , new h.2(this, str2, (Intent)localObject));
        parama.e(new h.3(this));
        parama.cuu();
        AppMethodBeat.o(6293);
        break;
        j = 8;
        break label356;
        label487: bool2 = false;
        break label378;
      }
      if (parama.contains("album"))
      {
        aA((Intent)localObject);
        AppMethodBeat.o(6293);
        break;
      }
      if (parama.contains("camera"))
      {
        b(str2, (Intent)localObject);
        AppMethodBeat.o(6293);
        break;
      }
      b("sourceType_error", null);
      AppMethodBeat.o(6293);
      break;
    }
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "chooseMedia";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.h
 * JD-Core Version:    0.6.2
 */