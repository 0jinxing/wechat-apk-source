package com.tencent.mm.plugin.appbrand.game;

import com.tencent.luggage.g.d;
import com.tencent.magicbrush.MBRuntime.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.h.g;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.h.q;
import com.tencent.mm.plugin.appbrand.jsapi.bo;
import com.tencent.mm.plugin.appbrand.s.l;
import com.tencent.mm.plugin.appbrand.s.m;
import com.tencent.mm.sdk.platformtools.f;

public final class a$b extends MBRuntime.a
{
  public a$b(a parama)
  {
  }

  public final void onJsExceptionOccurred(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(129995);
    d.e("MicroMsg.MBRuntimeSimple", "[WAGame][AppBrand] message = [%s] stackTrace = [%s]", new Object[] { paramString1, paramString2 });
    if (this.hqk.hqf == null)
      AppMethodBeat.o(129995);
    while (true)
    {
      return;
      Object localObject = (q)this.hqk.hqf.af(q.class);
      if (paramInt == ((q)localObject).aGU().aGT())
      {
        bo.a(this.hqk.hqf, "onError", String.format("{'message':'%s', 'stack': '%s'}", new Object[] { l.Ej(paramString1), l.Ej(paramString2) }), 0);
        AppMethodBeat.o(129995);
      }
      else
      {
        localObject = ((q)localObject).oO(paramInt);
        if (localObject == null)
        {
          if (f.DEBUG)
          {
            paramString1 = new IllegalStateException("[DebugOnly] j2v8 not follow the pattern");
            AppMethodBeat.o(129995);
            throw paramString1;
          }
          AppMethodBeat.o(129995);
        }
        else
        {
          m.a((i)localObject, "onError", String.format("{'message':'%s', 'stack': '%s'}", new Object[] { l.Ej(paramString1), l.Ej(paramString2) }));
          AppMethodBeat.o(129995);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.b
 * JD-Core Version:    0.6.2
 */