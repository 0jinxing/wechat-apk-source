package com.tencent.mm.plugin.websearch.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.ad;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$2$2$2 extends ad
{
  a$2$2$2(a.2.2 param2)
  {
  }

  public final void py(String paramString)
  {
    AppMethodBeat.i(91380);
    ab.v("FTSSearchWidgetMgr", "on widget call %s ", new Object[] { "onMakePhoneCall" });
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(paramString))));
      paramString.addFlags(268435456);
      if (bo.k(a.g(this.ucN.ucM.ucJ), paramString))
        a.g(this.ucN.ucM.ucJ).startActivity(paramString);
      AppMethodBeat.o(91380);
    }
    while (true)
    {
      return;
      ab.e("FTSSearchWidgetMgr", "onMakePhone null number");
      AppMethodBeat.o(91380);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2.2.2
 * JD-Core Version:    0.6.2
 */