package com.tencent.mm.plugin.voip.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

public final class e
  implements TextureView.SurfaceTextureListener
{
  int mWidth;
  public MMTextureView mdt;
  private final String sZV;
  public SurfaceTexture sZW;
  int sZX;

  public e()
  {
    AppMethodBeat.i(5057);
    this.sZV = "DecodeTextureView";
    this.mWidth = 320;
    this.sZX = 240;
    ab.d("DecodeTextureView", "steve:  new DecodeTextureView instance");
    AppMethodBeat.o(5057);
  }

  public final void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5058);
    ab.i("DecodeTextureView", "onSurfaceTextureAvailable size=" + paramInt1 + "x" + paramInt2 + ", st=" + paramSurfaceTexture);
    if (this.sZW == null)
    {
      this.sZW = paramSurfaceTexture;
      v2protocal.sVL = new Surface(paramSurfaceTexture);
      ab.i("DecodeTextureView", "steve: pass decoder surface successfully!");
      v2protocal.a(this);
    }
    AppMethodBeat.o(5058);
  }

  public final boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(5060);
    ab.i("DecodeTextureView", "onSurfaceTextureDestroyed st=".concat(String.valueOf(paramSurfaceTexture)));
    boolean bool;
    if (this.sZW == null)
    {
      bool = true;
      AppMethodBeat.o(5060);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(5060);
    }
  }

  public final void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5059);
    ab.d("DecodeTextureView", "onSurfaceTextureSizeChanged size=" + paramInt1 + "x" + paramInt2 + ", st=" + paramSurfaceTexture);
    AppMethodBeat.o(5059);
  }

  public final void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.e
 * JD-Core Version:    0.6.2
 */