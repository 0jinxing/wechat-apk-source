package com.tencent.mm.media.h;

import a.f.b.j;
import a.l;
import a.v;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.h.b.b;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/render/MixRenderer;", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "textureWidth", "", "textureHeight", "drawWidth", "drawHeight", "renderOutputType", "scaleType", "(IIIIII)V", "TAG", "", "textureCropRect", "Landroid/graphics/Rect;", "doInitRenderProc", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "render", "", "bitmap", "Landroid/graphics/Bitmap;", "setBlendBitmap", "setTextureCropRect", "rect", "plugin-mediaeditor_release"})
public final class c extends a
{
  private final String TAG = "MicroMsg.MixRenderer";
  public Rect eZd;

  private c(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    super(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }

  private final void s(Bitmap paramBitmap)
  {
    AppMethodBeat.i(13089);
    if ((this.eYL instanceof b))
    {
      Object localObject = this.eYL;
      if (localObject == null)
      {
        paramBitmap = new v("null cannot be cast to non-null type com.tencent.mm.media.render.proc.GLTextureRenderProcBlend");
        AppMethodBeat.o(13089);
        throw paramBitmap;
      }
      localObject = (b)localObject;
      j.p(paramBitmap, "bitmap");
      ((b)localObject).eZt = paramBitmap;
      AppMethodBeat.o(13089);
    }
    while (true)
    {
      return;
      ab.e(this.TAG, "data don't match textureRender ");
      AppMethodBeat.o(13089);
    }
  }

  protected final com.tencent.mm.media.h.b.a Vc()
  {
    AppMethodBeat.i(13087);
    Object localObject = new b(this.eYW, this.eYX, this.eYY, this.eYZ, this.eZa, this.scaleType, (byte)0);
    ((com.tencent.mm.media.h.b.a)localObject).eZd = this.eZd;
    localObject = (com.tencent.mm.media.h.b.a)localObject;
    AppMethodBeat.o(13087);
    return localObject;
  }

  public final void Vd()
  {
    AppMethodBeat.i(13088);
    SurfaceTexture localSurfaceTexture = this.bsb;
    if (localSurfaceTexture != null)
      localSurfaceTexture.updateTexImage();
    input(this.eYN);
    super.Vd();
    AppMethodBeat.o(13088);
  }

  public final void t(Bitmap paramBitmap)
  {
    AppMethodBeat.i(13090);
    if (paramBitmap != null)
      s(paramBitmap);
    Vd();
    AppMethodBeat.o(13090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.h.c
 * JD-Core Version:    0.6.2
 */