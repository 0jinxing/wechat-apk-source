package com.tencent.mm.plugin.voip.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.video.a.b;

final class OpenGlRender$1
  implements Runnable
{
  OpenGlRender$1(OpenGlRender paramOpenGlRender)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5069);
    if (OpenGlRender.a(this.taY) != null)
      OpenGlRender.a(this.taY).destroy();
    AppMethodBeat.o(5069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.OpenGlRender.1
 * JD-Core Version:    0.6.2
 */