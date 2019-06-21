package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.a.a;

public class ap$a
  implements ap
{
  public <WIDGET extends View> WIDGET b(Context paramContext, Class<WIDGET> paramClass)
  {
    AppMethodBeat.i(87344);
    paramContext = (View)paramClass.cast(a.be(paramClass).ab(new Object[] { paramContext }).object);
    AppMethodBeat.o(87344);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ap.a
 * JD-Core Version:    0.6.2
 */