package com.tencent.mm.plugin.appbrand.jsapi.s;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class c$a$1
  implements Runnable
{
  c$a$1(c.a parama, c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91067);
    if (!c.a.a(this.ibI))
    {
      ab.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but pressed is false or pointer is null.");
      AppMethodBeat.o(91067);
    }
    while (true)
    {
      return;
      Object localObject = d.co(c.a.b(this.ibI));
      if ((Math.abs(c.a.c(this.ibI).x - ((d.f)localObject).x) > 1.0F) || (Math.abs(c.a.c(this.ibI).y - ((d.f)localObject).y) > 1.0F))
      {
        ab.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but view has moved.");
        AppMethodBeat.o(91067);
        continue;
      }
      if (c.a.d(this.ibI).size() != 1)
      {
        ab.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but more then one point.");
        AppMethodBeat.o(91067);
        continue;
      }
      if ((Math.abs(c.a.e(this.ibI).x - c.a.f(this.ibI).x) > c.a.g(this.ibI)) || (Math.abs(c.a.e(this.ibI).y - c.a.f(this.ibI).y) > c.a.g(this.ibI)))
      {
        ab.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, but point has moved(%s, %s, %s, %s).", new Object[] { Float.valueOf(c.a.e(this.ibI).x), Float.valueOf(c.a.f(this.ibI).x), Float.valueOf(c.a.e(this.ibI).y), Float.valueOf(c.a.f(this.ibI).y) });
        AppMethodBeat.o(91067);
        continue;
      }
      ab.v("MicroMsg.OnTouchListenerImpl", "check long press timeout, publish event(%s, %s, %s, %s).", new Object[] { Float.valueOf(c.a.e(this.ibI).x), Float.valueOf(c.a.f(this.ibI).x), Float.valueOf(c.a.e(this.ibI).y), Float.valueOf(c.a.f(this.ibI).y) });
      localObject = new JSONObject();
      try
      {
        ((JSONObject)localObject).put("data", c.a.h(this.ibI).getString("data", ""));
        ((JSONObject)localObject).put("touch", c.a.e(this.ibI).toJSONObject());
        label405: if (!c.a.h(this.ibI).getBoolean("disableScroll", false))
        {
          c.a.a(this.ibI, MotionEvent.obtain(c.a.i(this.ibI)));
          c.a.j(this.ibI).setAction(0);
          c.a.h(this.ibI).z("fakeDownEvent", true);
          c.a.b(this.ibI).getParent().requestDisallowInterceptTouchEvent(true);
          c.a.b(this.ibI).setDuplicateParentStateEnabled(false);
          c.a.a(c.a.b(this.ibI), MotionEvent.obtain(c.a.j(this.ibI)));
        }
        c.a.b(this.hyd, new d.a(), ((JSONObject)localObject).toString());
        AppMethodBeat.o(91067);
      }
      catch (JSONException localJSONException)
      {
        break label405;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.s.c.a.1
 * JD-Core Version:    0.6.2
 */