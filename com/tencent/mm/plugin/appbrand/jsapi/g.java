package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class g
  implements f
{
  public final Set<f.e> hvU;
  public final Set<f.b> hvV;
  public final Set<f.d> hvW;
  public final Set<f.c> hvX;
  public final Set<f.a> hvY;
  public final Set<f.f> hvZ;

  public g()
  {
    AppMethodBeat.i(91017);
    this.hvU = Collections.newSetFromMap(new ConcurrentHashMap());
    this.hvV = Collections.newSetFromMap(new ConcurrentHashMap());
    this.hvW = Collections.newSetFromMap(new ConcurrentHashMap());
    this.hvX = Collections.newSetFromMap(new ConcurrentHashMap());
    this.hvY = Collections.newSetFromMap(new ConcurrentHashMap());
    this.hvZ = Collections.newSetFromMap(new ConcurrentHashMap());
    AppMethodBeat.o(91017);
  }

  public final void a(f.b paramb)
  {
    AppMethodBeat.i(91021);
    this.hvV.add(paramb);
    AppMethodBeat.o(91021);
  }

  public final void a(f.c paramc)
  {
    AppMethodBeat.i(91025);
    this.hvX.add(paramc);
    AppMethodBeat.o(91025);
  }

  public final void a(f.d paramd)
  {
    AppMethodBeat.i(91023);
    this.hvW.add(paramd);
    AppMethodBeat.o(91023);
  }

  public final void a(f.e parame)
  {
    AppMethodBeat.i(91019);
    this.hvU.add(parame);
    AppMethodBeat.o(91019);
  }

  public final void a(f.f paramf)
  {
    AppMethodBeat.i(91018);
    this.hvZ.add(paramf);
    AppMethodBeat.o(91018);
  }

  public final void b(f.b paramb)
  {
    AppMethodBeat.i(91022);
    this.hvV.remove(paramb);
    AppMethodBeat.o(91022);
  }

  public final void b(f.c paramc)
  {
    AppMethodBeat.i(91026);
    this.hvX.remove(paramc);
    AppMethodBeat.o(91026);
  }

  public final void b(f.d paramd)
  {
    AppMethodBeat.i(91024);
    this.hvW.remove(paramd);
    AppMethodBeat.o(91024);
  }

  public final void b(f.e parame)
  {
    AppMethodBeat.i(91020);
    this.hvU.remove(parame);
    AppMethodBeat.o(91020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.g
 * JD-Core Version:    0.6.2
 */