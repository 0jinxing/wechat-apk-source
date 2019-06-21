package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.ah;
import com.tencent.mm.plugin.appbrand.page.al;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.widget.b.k;
import java.util.ArrayList;
import org.json.JSONObject;

final class b$1
  implements Runnable
{
  b$1(b paramb, q paramq, u paramu, JSONObject paramJSONObject, ArrayList paramArrayList, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(74783);
    if (!this.hsD.isRunning())
      AppMethodBeat.o(74783);
    while (true)
    {
      return;
      this.hwF.aAX().a(ah.iuU);
      Object localObject = this.hsD.ad(Activity.class);
      com.tencent.mm.plugin.appbrand.widget.b.b localb = new com.tencent.mm.plugin.appbrand.widget.b.b((Context)localObject);
      localb.setCanceledOnTouchOutside(true);
      int i = g.by(this.hsm.optString("itemColor", ""), Color.parseColor("#000000"));
      localObject = (ViewGroup)View.inflate((Context)localObject, 2130968657, null);
      localb.setContentView((View)localObject);
      localObject = (ListView)((ViewGroup)localObject).findViewById(2131821130);
      ((ListView)localObject).setAdapter(new b.a(this.ewh, i));
      ((ListView)localObject).setOnItemClickListener(new b.1.1(this, localb));
      localb.setOnCancelListener(new b.1.2(this));
      this.hsD.asF().b(localb);
      AppMethodBeat.o(74783);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.b.1
 * JD-Core Version:    0.6.2
 */