package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Intent;
import com.tencent.luggage.d.a.a;
import com.tencent.luggage.d.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;

final class g$1
  implements MMActivity.a
{
  g$1(g paramg, a.a parama)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(6286);
    boolean bool;
    HashMap localHashMap;
    if (paramInt1 == (this.ujX.hashCode() & 0xFFFF))
    {
      if (paramIntent != null)
        break label138;
      bool = false;
      ab.i("MicroMsg.JsApiChooseImage", "request to open file chooser, result code = %d, hasShowMemoryWarning = %b", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      localHashMap = new HashMap();
      if (bool)
        localHashMap.put("memoryWarning", Boolean.TRUE);
      switch (paramInt2)
      {
      default:
        this.mUf.c("fail", localHashMap);
      case -1:
      case 0:
      }
    }
    while (true)
    {
      label111: ((MMActivity)((d)this.mUf.bOZ).mContext).ifE = null;
      AppMethodBeat.o(6286);
      return;
      label138: bool = paramIntent.getBooleanExtra("key_pick_local_media_show_memory_warning", false);
      break;
      if (paramIntent != null);
      for (String str = paramIntent.getStringExtra("key_pick_local_pic_callback_local_ids"); !bo.isNullOrNil(str); str = null)
      {
        ab.i("MicroMsg.JsApiChooseImage", "localIds = %s", new Object[] { str });
        localHashMap.put("localIds", str);
        paramIntent = paramIntent.getStringExtra("key_pick_local_pic_source_type");
        if (paramIntent != null)
          localHashMap.put("sourceType", paramIntent);
        this.mUf.c("", localHashMap);
        break label111;
      }
      this.mUf.c("cancel", localHashMap);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.g.1
 * JD-Core Version:    0.6.2
 */