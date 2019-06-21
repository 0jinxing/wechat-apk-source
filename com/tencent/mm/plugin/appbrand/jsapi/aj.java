package com.tencent.mm.plugin.appbrand.jsapi;

import android.util.Pair;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.r.g;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public class aj extends u<q>
{
  public static final int CTRL_INDEX = 466;
  public static final String NAME = "getMenuButtonBoundingClientRect";

  public String c(q paramq)
  {
    AppMethodBeat.i(114326);
    paramq = (String)d(paramq).first;
    AppMethodBeat.o(114326);
    return paramq;
  }

  protected final Pair<String, aj.a> d(q paramq)
  {
    AppMethodBeat.i(114327);
    Object localObject;
    try
    {
      if ((paramq instanceof q))
      {
        localObject = ((q)paramq).getCurrentPageView();
        if (localObject != null)
          break label70;
        paramq = new java/lang/IllegalStateException;
        paramq.<init>("fail:page don't exist");
        AppMethodBeat.o(114327);
        throw paramq;
      }
    }
    catch (Exception paramq)
    {
      paramq = Pair.create(j(paramq.getMessage(), null), aj.a.hwT);
      AppMethodBeat.o(114327);
    }
    while (true)
    {
      return paramq;
      localObject = null;
      break;
      label70: HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      int[] arrayOfInt = new int[2];
      ((com.tencent.mm.plugin.appbrand.page.u)localObject).getActionBar().getCapsuleView().getLocationInWindow(arrayOfInt);
      int i = g.qa(((com.tencent.mm.plugin.appbrand.page.u)localObject).getActionBar().getCapsuleView().getWidth());
      int j = g.qa(((com.tencent.mm.plugin.appbrand.page.u)localObject).getActionBar().getCapsuleView().getHeight());
      int k = g.qa(arrayOfInt[1]);
      int m = g.qa(arrayOfInt[0]);
      localHashMap.put("width", Integer.valueOf(i));
      localHashMap.put("height", Integer.valueOf(j));
      localHashMap.put("top", Integer.valueOf(k));
      localHashMap.put("right", Integer.valueOf(m + i));
      localHashMap.put("bottom", Integer.valueOf(k + j));
      localHashMap.put("left", Integer.valueOf(m));
      localObject = j("ok", localHashMap);
      ab.i("MicroMsg.JsApiGetMenuButtonBoundingClientRect", "getMenuButtonBoundingClientRect: return on JSThread appId[%s] ret[%s]", new Object[] { paramq.getAppId(), localObject });
      paramq = Pair.create(localObject, aj.a.hwT);
      AppMethodBeat.o(114327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.aj
 * JD-Core Version:    0.6.2
 */