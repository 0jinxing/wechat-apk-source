package com.tencent.mm.plugin.appbrand.jsapi.e;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.Addr;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;

final class c$1
  implements MMActivity.a
{
  c$1(c paramc, q paramq)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(131108);
    if (paramInt1 == 1)
      if (paramInt2 == -1)
        if (paramIntent == null)
        {
          this.hsD.M(this.hKJ.bOs, this.hKJ.j("fail", null));
          ab.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
          AppMethodBeat.o(131108);
        }
    while (true)
    {
      return;
      paramIntent = (Addr)paramIntent.getParcelableExtra("key_pick_addr");
      HashMap localHashMap = new HashMap();
      if (paramIntent != null)
      {
        ab.i("MicroMsg.JsApiChooseLocation", "addr: " + paramIntent.toString());
        StringBuilder localStringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(paramIntent.fBg))
        {
          localStringBuilder.append(paramIntent.fBg);
          label132: localHashMap.put("address", localStringBuilder.toString());
          if (TextUtils.isEmpty(paramIntent.fBp))
            break label264;
          localHashMap.put("name", paramIntent.fBp);
        }
        while (true)
        {
          localHashMap.put("latitude", Float.valueOf(paramIntent.fBr));
          localHashMap.put("longitude", Float.valueOf(paramIntent.fBs));
          this.hsD.M(this.hKJ.bOs, this.hKJ.j("ok", localHashMap));
          AppMethodBeat.o(131108);
          break;
          localStringBuilder.append(paramIntent.agv());
          break label132;
          label264: localHashMap.put("name", localStringBuilder.toString());
        }
      }
      this.hsD.M(this.hKJ.bOs, this.hKJ.j("fail", null));
      ab.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
      AppMethodBeat.o(131108);
      continue;
      if (paramInt2 == 0)
      {
        this.hsD.M(this.hKJ.bOs, this.hKJ.j("cancel", null));
        ab.e("MicroMsg.JsApiChooseLocation", "location result is cancel!");
        AppMethodBeat.o(131108);
      }
      else
      {
        this.hsD.M(this.hKJ.bOs, this.hKJ.j("fail", null));
        ab.e("MicroMsg.JsApiChooseLocation", "location result is fail!");
        AppMethodBeat.o(131108);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.e.c.1
 * JD-Core Version:    0.6.2
 */