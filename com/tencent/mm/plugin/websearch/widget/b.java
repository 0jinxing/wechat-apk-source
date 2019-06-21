package com.tencent.mm.plugin.websearch.widget;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.f;
import com.tencent.mm.plugin.websearch.api.g;
import com.tencent.mm.plugin.websearch.api.h;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.plugin.websearch.api.x;
import com.tencent.mm.plugin.websearch.api.y;
import com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView;
import com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView.2;
import com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView.a;
import com.tencent.mm.plugin.websearch.widget.view.a.1;
import com.tencent.mm.plugin.websearch.widget.view.a.2;
import com.tencent.mm.plugin.websearch.widget.view.a.3;
import com.tencent.mm.plugin.websearch.widget.view.a.4;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.d;
import java.util.List;
import java.util.Map;

public final class b
  implements h
{
  public final int a(Activity paramActivity, String paramString1, String paramString2, List<y> paramList, x paramx)
  {
    AppMethodBeat.i(91430);
    com.tencent.mm.plugin.websearch.widget.view.a locala = com.tencent.mm.plugin.websearch.widget.view.a.cVT();
    d locald = new d(paramActivity, 2, true);
    int i = locald.hashCode();
    locald.zFT = new a.1(locala, paramList);
    locald.rBl = new a.2(locala, paramList, locald);
    locald.rBm = new a.3(locala, paramx, i);
    locald.zQf = new a.4(locala, paramx, i);
    paramActivity = View.inflate(paramActivity, 2130970564, null);
    if (!TextUtils.isEmpty(paramString1))
    {
      ((TextView)paramActivity.findViewById(2131820678)).setText(paramString1);
      if (TextUtils.isEmpty(paramString2))
        break label205;
      ((TextView)paramActivity.findViewById(2131821245)).setText(paramString2);
    }
    while (true)
    {
      locald.zQy = true;
      locald.F(paramActivity, false);
      locald.cpD();
      locala.udA.put(Integer.valueOf(i), locald);
      AppMethodBeat.o(91430);
      return i;
      paramActivity.findViewById(2131820678).setVisibility(8);
      break;
      label205: paramActivity.findViewById(2131821245).setVisibility(8);
    }
  }

  public final f a(Context paramContext, r paramr)
  {
    AppMethodBeat.i(91428);
    paramContext = new a(paramContext, paramr);
    AppMethodBeat.o(91428);
    return paramContext;
  }

  public final i a(LinearLayout paramLinearLayout, int paramInt, Activity paramActivity, g paramg)
  {
    AppMethodBeat.i(91429);
    paramLinearLayout = new ServiceWidgetView(paramLinearLayout, paramInt, paramActivity, paramg);
    paramActivity = LinearLayout.inflate(paramLinearLayout.jbJ.getContext(), 2130970621, paramLinearLayout.jbJ);
    paramLinearLayout.pqm = paramActivity.findViewById(2131827367);
    paramLinearLayout.rap = ((ViewPager)paramActivity.findViewById(2131823829));
    paramLinearLayout.udF = new ServiceWidgetView.a(paramLinearLayout, paramLinearLayout.hwd.getSupportFragmentManager());
    paramLinearLayout.rap.setAdapter(paramLinearLayout.udF);
    paramLinearLayout.rap.setOffscreenPageLimit(0);
    paramLinearLayout.rap.addOnPageChangeListener(new ServiceWidgetView.2(paramLinearLayout));
    AppMethodBeat.o(91429);
    return paramLinearLayout;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.b
 * JD-Core Version:    0.6.2
 */