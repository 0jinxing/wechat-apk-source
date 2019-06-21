package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.i.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$b
{
  public final m aTw;
  public int aYA;
  public int aYB;
  public int aYC;
  public final l aYx;
  public j aYy;
  public c aYz;

  public e$b(m paramm)
  {
    AppMethodBeat.i(94961);
    this.aYx = new l();
    this.aTw = paramm;
    AppMethodBeat.o(94961);
  }

  public final void a(j paramj, c paramc)
  {
    AppMethodBeat.i(94962);
    this.aYy = ((j)a.checkNotNull(paramj));
    this.aYz = ((c)a.checkNotNull(paramc));
    this.aTw.f(paramj.aOv);
    reset();
    AppMethodBeat.o(94962);
  }

  public final void b(DrmInitData paramDrmInitData)
  {
    AppMethodBeat.i(94964);
    Object localObject = this.aYy.dZ(this.aYx.aZw.aXT);
    if (localObject != null);
    for (localObject = ((k)localObject).aZt; ; localObject = null)
    {
      this.aTw.f(this.aYy.aOv.a(paramDrmInitData.aw((String)localObject)));
      AppMethodBeat.o(94964);
      return;
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(94963);
    this.aYx.reset();
    this.aYA = 0;
    this.aYC = 0;
    this.aYB = 0;
    AppMethodBeat.o(94963);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.e.b
 * JD-Core Version:    0.6.2
 */