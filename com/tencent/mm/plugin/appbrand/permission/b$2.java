package com.tencent.mm.plugin.appbrand.permission;

import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.f.a;
import com.tencent.mm.plugin.appbrand.widget.f.b;
import com.tencent.mm.plugin.appbrand.widget.f.f;

final class b$2
  implements Runnable
{
  b$2(i parami, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132506);
    Object localObject = this.gOI.asV();
    b localb;
    if (localObject != null)
    {
      localObject = ((q)localObject).getCurrentPage();
      if (localObject != null)
      {
        localObject = ((n)localObject).getCurrentPageView();
        if (localObject != null)
        {
          localb = ((u)localObject).isS;
          localObject = this.val$message;
          if ((localb.jmB.aBk() == null) || (localb.jmB.mContext == null))
            AppMethodBeat.o(132506);
        }
      }
    }
    while (true)
    {
      return;
      if (localb.jmC == null)
      {
        localb.jmC = new a(localb.jmB.mContext);
        localb.jmC.a(localb.jmB.aBk());
      }
      localb.jmB.aBk().bringChildToFront(localb.jmC.getView());
      localb.jmC.EQ((String)localObject);
      AppMethodBeat.o(132506);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.b.2
 * JD-Core Version:    0.6.2
 */