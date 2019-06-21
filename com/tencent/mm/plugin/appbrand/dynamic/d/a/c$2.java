package com.tencent.mm.plugin.appbrand.dynamic.d.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.dynamic.h.d;
import com.tencent.mm.z.b.b;
import com.tencent.mm.z.b.b.a;
import com.tencent.mm.z.c.a;
import org.json.JSONObject;

final class c$2
  implements Runnable
{
  c$2(c paramc, String paramString1, boolean paramBoolean, String paramString2, b.a parama, String paramString3, b paramb, a parama1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10870);
    com.tencent.mm.plugin.appbrand.collector.c.l(this.hno, "parse_json_start", this.hnp);
    JSONObject localJSONObject = this.hnn.Af(this.val$data);
    if (localJSONObject == null)
    {
      this.hmJ.au(this.hnn.Q(this.hnq, "fail:invalid data"));
      AppMethodBeat.o(10870);
    }
    while (true)
    {
      return;
      Bundle localBundle = new Bundle();
      localBundle.putString("rawJsapiData", this.val$data);
      com.tencent.mm.plugin.appbrand.collector.c.l(this.hno, "parse_json_end", this.hnp);
      d.a(this.hno, this.val$data, localJSONObject);
      this.hnr.a(this.hns, localJSONObject, localBundle, this.hmJ);
      AppMethodBeat.o(10870);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a.c.2
 * JD-Core Version:    0.6.2
 */