package com.tencent.mm.plugin.appbrand.jsapi.g.a;

import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class a$7
  implements Runnable
{
  a$7(a parama, ImageView paramImageView, FrameLayout.LayoutParams paramLayoutParams)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138417);
    ((ViewGroup)this.hNv.hMS).addView(this.hNy, this.hNA);
    synchronized (this.hNv.hNj)
    {
      ArrayList localArrayList2 = this.hNv.hNj;
      a.b localb = new com/tencent/mm/plugin/appbrand/jsapi/g/a/a$b;
      localb.<init>(this.hNv, this.hNy);
      localArrayList2.add(localb);
      AppMethodBeat.o(138417);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g.a.a.7
 * JD-Core Version:    0.6.2
 */