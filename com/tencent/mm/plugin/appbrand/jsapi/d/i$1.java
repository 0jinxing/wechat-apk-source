package com.tencent.mm.plugin.appbrand.jsapi.d;

import android.graphics.Rect;
import android.view.View;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.widget.input.aj;
import com.tencent.mm.plugin.appbrand.widget.input.c;
import com.tencent.mm.plugin.appbrand.widget.input.d.f;
import com.tencent.mm.plugin.appbrand.widget.input.d.h;
import com.tencent.mm.plugin.appbrand.widget.input.g;
import com.tencent.mm.plugin.appbrand.widget.input.j;
import com.tencent.mm.plugin.appbrand.widget.input.j.1;
import com.tencent.mm.plugin.appbrand.widget.input.j.a;
import com.tencent.mm.plugin.appbrand.widget.input.o;
import com.tencent.mm.plugin.appbrand.widget.input.y;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Locale;

final class i$1
  implements Runnable
{
  i$1(i parami, u paramu, int paramInt1, h paramh, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123561);
    Object localObject1 = j.a.aQJ();
    u localu = this.hCx;
    int i = this.hKt;
    Object localObject2 = this.hKD;
    localObject1 = com.tencent.mm.plugin.appbrand.widget.input.e.a(localu, new j.1((j)localObject1, i));
    if ((localObject1 instanceof c))
    {
      localObject1 = (c)localObject1;
      if (localObject1 == null)
        break label201;
      if (((h)localObject2).jjo != null)
        ((c)localObject1).EG(((h)localObject2).jjo);
      ((c)localObject1).a((h)localObject2);
      localObject2 = ((c)localObject1).aQl();
      if (localObject2 != null)
      {
        localu = (u)((c)localObject1).jdm.get();
        if ((localu != null) && (localu.aJz() != null))
          break label151;
      }
      label113: i = 1;
      label115: if (i == 0)
        break label206;
      this.hCx.M(this.eIl, this.hKE.j("ok", null));
      AppMethodBeat.o(123561);
    }
    while (true)
    {
      return;
      localObject1 = null;
      break;
      label151: g localg = (g)localu.aAY();
      if (localg == null)
        break label113;
      localObject1 = ((c)localObject1).aQm();
      localg.c(localu.aJz(), (View)localObject2, ((Rect)localObject1).width(), ((Rect)localObject1).height(), ((Rect)localObject1).left, ((Rect)localObject1).top);
      break label113;
      label201: i = 0;
      break label115;
      label206: localObject1 = o.a(this.hCx, this.hKt);
      if ((localObject1 instanceof com.tencent.mm.plugin.appbrand.widget.input.i))
      {
        localObject1 = (com.tencent.mm.plugin.appbrand.widget.input.i)localObject1;
        localObject2 = this.hKD;
        if ((((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS == null) || (((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdV == null));
        do
        {
          this.hCx.M(this.eIl, this.hKE.j("ok", null));
          AppMethodBeat.o(123561);
          break;
          ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS.a((f)localObject2);
        }
        while ((!((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS.jjm) && ((((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS.jjq == null) || (((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS.jjq.intValue() <= 0)));
        ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdV.setWillNotDraw(true);
        ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).aQz();
        if (((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS.jjo != null)
          ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdV.B(bo.nullAsNil(((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS.jjo));
        if (!aj.g(((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS.jjH))
          ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).b(((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdV, ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdS);
        while (true)
        {
          ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdV.setWillNotDraw(false);
          ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).jdV.invalidate();
          break;
          ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).aQy();
          ((com.tencent.mm.plugin.appbrand.widget.input.i)localObject1).aQA();
        }
      }
      d.e("MicroMsg.AppBrand.JsApiUpdateInput", String.format(Locale.US, "AppBrandInputInvokeHandler with inputID(%d) 404", new Object[] { Integer.valueOf(this.hKt) }));
      this.hCx.M(this.eIl, this.hKE.j(String.format(Locale.US, "fail found no input with %d", new Object[] { Integer.valueOf(this.hKt) }), null));
      AppMethodBeat.o(123561);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d.i.1
 * JD-Core Version:    0.6.2
 */