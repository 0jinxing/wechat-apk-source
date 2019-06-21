package com.tencent.mm.plugin.mmsight.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.c.b;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.sdk.platformtools.ab;

final class b$11
  implements c.b
{
  b$11(b paramb)
  {
  }

  public final void U(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(55157);
    if (b.f(this.oBV) == null)
      AppMethodBeat.o(55157);
    while (true)
    {
      return;
      int i = b.d(this.oBV);
      b.a(this.oBV, Math.round(i * paramFloat1));
      b.b(this.oBV, Math.round(i * paramFloat2));
      ab.i("MicroMsg.MMSightVideoEditor", "onRecyclerChanged, start: %s, end: %s %s %s", new Object[] { Integer.valueOf(b.s(this.oBV)), Integer.valueOf(b.c(this.oBV)), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
      b.f(this.oBV).d(b.s(this.oBV), true);
      AppMethodBeat.o(55157);
    }
  }

  public final void V(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(55159);
    if (b.f(this.oBV) == null)
      AppMethodBeat.o(55159);
    while (true)
    {
      return;
      int i = b.d(this.oBV);
      b.a(this.oBV, Math.round(i * paramFloat1));
      b.b(this.oBV, Math.round(i * paramFloat2));
      if (b.c(this.oBV) <= 0)
        b.b(this.oBV, 1000);
      b.f(this.oBV).d(b.s(this.oBV), true);
      ab.i("MicroMsg.MMSightVideoEditor", "onUp, start: %s, end: %s %s %s", new Object[] { Integer.valueOf(b.s(this.oBV)), Integer.valueOf(b.c(this.oBV)), Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) });
      AppMethodBeat.o(55159);
    }
  }

  public final void W(float paramFloat1, float paramFloat2)
  {
  }

  public final void bQc()
  {
    AppMethodBeat.i(55158);
    if (b.f(this.oBV) == null)
      AppMethodBeat.o(55158);
    while (true)
    {
      return;
      b.f(this.oBV).pause();
      AppMethodBeat.o(55158);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.11
 * JD-Core Version:    0.6.2
 */