package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

final class BaseSOSWebViewUI$2
  implements Runnable
{
  BaseSOSWebViewUI$2(BaseSOSWebViewUI paramBaseSOSWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8332);
    if (this.uAz.getJsapi() != null)
    {
      HashMap localHashMap1 = new HashMap();
      if (this.uAz.dbx() != 0)
      {
        localHashMap1.put("sugClickType", Integer.valueOf(this.uAz.dbx()));
        localHashMap1.put("sugId", this.uAz.dbw());
      }
      d locald = this.uAz.getJsapi();
      String str1 = this.uAz.getTotalQuery();
      String str2 = this.uAz.getInEditTextQuery();
      JSONArray localJSONArray = this.uAz.dbB();
      HashMap localHashMap2 = new HashMap();
      localHashMap2.putAll(localHashMap1);
      localHashMap2.put("query", str1);
      localHashMap2.put("custom", str2);
      localHashMap2.put("tagList", localJSONArray);
      locald.a("onSearchInputConfirm", localHashMap2, null);
      if (!TextUtils.isEmpty(this.uAz.getInEditTextQuery()))
        z.a(this.uAz.uAN, this.uAz.cvF, this.uAz.cIy, true, this.uAz.getInEditTextQuery(), this.uAz.uAO);
    }
    AppMethodBeat.o(8332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI.2
 * JD-Core Version:    0.6.2
 */