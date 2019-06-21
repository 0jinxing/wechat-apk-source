package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.g.b.a.cy;
import com.tencent.mm.modelappbrand.u;
import com.tencent.mm.modelappbrand.z;
import com.tencent.mm.plugin.appbrand.dynamic.f.a;
import com.tencent.mm.plugin.appbrand.dynamic.i;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class a$1
  implements Runnable
{
  a$1(String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(10877);
    Object localObject1 = a.azT().matcher(this.hnv);
    int k;
    String str;
    if (((Matcher)localObject1).find())
    {
      com.tencent.mm.sdk.platformtools.ab.i("DrawCanvasMgr", "invalid draw data %s", new Object[] { this.hnv });
      int j = ((Matcher)localObject1).start();
      k = ((Matcher)localObject1).end();
      if (j > 30)
        i = j - 30;
      if (k >= this.hnv.length() - 30)
        break label205;
      k += 30;
      com.tencent.mm.plugin.appbrand.dynamic.f.azA();
      localObject1 = this.hmM;
      str = this.hnv.substring(i, k);
      if ((localObject1 != null) && (((String)localObject1).length() != 0))
        break label217;
    }
    while (true)
    {
      Object localObject2 = com.tencent.mm.plugin.appbrand.dynamic.h.a.aAb().Ak((String)localObject1);
      if ((localObject2 != null) && (((IPCDynamicPageView)localObject2).hpp != null))
      {
        localObject2 = (z)((IPCDynamicPageView)localObject2).hpp.px("onWidgetDrawDataInvalid");
        if (localObject2 != null)
          ((z)localObject2).pv(str);
      }
      new cy().hX("").hY(u.pr((String)localObject1)).hZ(q.encode(str)).ajK();
      AppMethodBeat.o(10877);
      return;
      label205: k = this.hnv.length();
      break;
      label217: localObject2 = new Bundle();
      ((Bundle)localObject2).putString("id", (String)localObject1);
      ((Bundle)localObject2).putInt("widgetState", 2113);
      com.tencent.mm.ipcinvoker.f.a(i.azC().zV((String)localObject1), (Parcelable)localObject2, f.a.class, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.b.a.1
 * JD-Core Version:    0.6.2
 */