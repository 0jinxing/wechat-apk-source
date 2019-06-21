package com.tencent.mm.plugin.emojicapture.ui.b;

import a.f.a.a;
import a.l;
import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/graphics/SurfaceTexture;", "kotlin.jvm.PlatformType", "onFrameAvailable"})
final class d$c
  implements SurfaceTexture.OnFrameAvailableListener
{
  d$c(d paramd)
  {
  }

  public final void onFrameAvailable(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(3158);
    paramSurfaceTexture = this.loZ;
    ab.i(paramSurfaceTexture.TAG, "onVideoSurfaceFrameAvailable");
    paramSurfaceTexture.b((a)new d.d(paramSurfaceTexture));
    AppMethodBeat.o(3158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.b.d.c
 * JD-Core Version:    0.6.2
 */