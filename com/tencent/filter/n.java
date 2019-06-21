package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends BaseFilter
{
  public n()
  {
    super(GLSLRender.bJG, "share_film.jpg");
    AppMethodBeat.i(86425);
    addParam(new m.b("randomCoord2", (float)Math.random(), (float)Math.random()));
    AppMethodBeat.o(86425);
  }

  public final void OnDrawFrameGLSL()
  {
    AppMethodBeat.i(86426);
    m.b localb = (m.b)getParam("randomCoord2");
    localb.x = ((float)Math.random());
    localb.y = ((float)Math.random());
    super.OnDrawFrameGLSL();
    AppMethodBeat.o(86426);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.n
 * JD-Core Version:    0.6.2
 */