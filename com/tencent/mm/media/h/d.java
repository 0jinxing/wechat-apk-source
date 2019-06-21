package com.tencent.mm.media.h;

import a.l;
import android.graphics.SurfaceTexture;
import com.tencent.mm.sdk.platformtools.ab;
import javax.microedition.khronos.opengles.GL10;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/SurfaceTextureRenderer;", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "renderOutputType", "", "(I)V", "onDrawFrame", "", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "plugin-mediaeditor_release"})
public abstract class d extends a
{
  public d()
  {
    super(0, 0, 0, 0, 1, 2);
  }

  public void onDrawFrame(GL10 paramGL10)
  {
    try
    {
      SurfaceTexture localSurfaceTexture = this.bsb;
      if (localSurfaceTexture != null)
        localSurfaceTexture.updateTexImage();
      if (this.eYO)
      {
        this.eYO = false;
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Media.AbsSurfaceRenderer", (Throwable)localException, "updateTexImage error", new Object[0]);
        continue;
        super.onDrawFrame(paramGL10);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.d
 * JD-Core Version:    0.6.2
 */