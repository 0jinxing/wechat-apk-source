package com.tencent.mm.api;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s$a$a
{
  public s.c ccR;
  public boolean ccS;
  public boolean ccU = true;
  public Rect ccV;
  public String path;

  public final s.a AB()
  {
    AppMethodBeat.i(73802);
    s.a locala = new s.a(this.path, this.ccR, this.ccS, this.ccU, this.ccV);
    AppMethodBeat.o(73802);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.api.s.a.a
 * JD-Core Version:    0.6.2
 */