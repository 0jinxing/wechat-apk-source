package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Writer;

final class GameGLSurfaceView$m extends Writer
{
  private StringBuilder mBuilder;

  GameGLSurfaceView$m()
  {
    AppMethodBeat.i(134089);
    this.mBuilder = new StringBuilder();
    AppMethodBeat.o(134089);
  }

  private void flushBuilder()
  {
    AppMethodBeat.i(134093);
    if (this.mBuilder.length() > 0)
    {
      c.c.v("GLSurfaceView", this.mBuilder.toString(), new Object[0]);
      this.mBuilder.delete(0, this.mBuilder.length());
    }
    AppMethodBeat.o(134093);
  }

  public final void close()
  {
    AppMethodBeat.i(134090);
    flushBuilder();
    AppMethodBeat.o(134090);
  }

  public final void flush()
  {
    AppMethodBeat.i(134091);
    flushBuilder();
    AppMethodBeat.o(134091);
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134092);
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n')
        flushBuilder();
      while (true)
      {
        i++;
        break;
        this.mBuilder.append(c);
      }
    }
    AppMethodBeat.o(134092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.GameGLSurfaceView.m
 * JD-Core Version:    0.6.2
 */