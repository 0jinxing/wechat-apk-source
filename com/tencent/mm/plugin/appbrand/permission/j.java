package com.tencent.mm.plugin.appbrand.permission;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.d;
import com.tencent.mm.plugin.appbrand.jsapi.audio.f;
import com.tencent.mm.plugin.appbrand.jsapi.audio.h;
import com.tencent.mm.plugin.appbrand.jsapi.audio.l;
import com.tencent.mm.plugin.appbrand.jsapi.b.e;
import com.tencent.mm.plugin.appbrand.jsapi.p.b.a;
import com.tencent.mm.plugin.appbrand.jsapi.p.c.a;
import java.util.Collection;
import java.util.HashSet;

public class j
  implements g
{
  public static final j iwZ;
  protected Collection<Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b>> ixa;
  protected Collection<Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b>> ixb;

  static
  {
    AppMethodBeat.i(102307);
    iwZ = new j();
    AppMethodBeat.o(102307);
  }

  protected j()
  {
    AppMethodBeat.i(102304);
    this.ixa = new HashSet();
    this.ixb = new HashSet();
    this.ixa.add(b.a.class);
    this.ixa.add(c.a.class);
    this.ixb.add(e.class);
    this.ixb.add(com.tencent.mm.plugin.appbrand.jsapi.k.b.class);
    this.ixb.add(f.class);
    this.ixb.add(JsApiGetMusicPlayerState.class);
    this.ixb.add(JsApiGetBackgroundAudioState.class);
    this.ixb.add(d.class);
    this.ixb.add(f.class);
    this.ixb.add(l.class);
    this.ixb.add(h.class);
    AppMethodBeat.o(102304);
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.jsapi.b paramb)
  {
    AppMethodBeat.i(102305);
    boolean bool;
    if (paramb == null)
    {
      bool = false;
      AppMethodBeat.o(102305);
    }
    while (true)
    {
      return bool;
      bool = ak(paramb.getClass());
      AppMethodBeat.o(102305);
    }
  }

  public final boolean ak(Class<? extends com.tencent.mm.plugin.appbrand.jsapi.b> paramClass)
  {
    boolean bool = false;
    AppMethodBeat.i(102306);
    if (paramClass == null)
      AppMethodBeat.o(102306);
    while (true)
    {
      return bool;
      if ((this.ixb.contains(paramClass)) || (this.ixa.contains(paramClass)))
      {
        bool = true;
        AppMethodBeat.o(102306);
      }
      else
      {
        AppMethodBeat.o(102306);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.j
 * JD-Core Version:    0.6.2
 */