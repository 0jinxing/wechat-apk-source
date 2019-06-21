package com.tencent.luggage.i.a;

import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkExtendPluginClient;
import org.xwalk.core.XWalkView;

public final class e extends XWalkExtendPluginClient
{
  public a bSf;

  public e(XWalkView paramXWalkView)
  {
    super(paramXWalkView);
  }

  public final void onPluginDestroy(String paramString, int paramInt)
  {
    AppMethodBeat.i(117327);
    super.onPluginDestroy(paramString, paramInt);
    if (this.bSf != null)
      this.bSf.onPluginDestroy(paramString, paramInt);
    AppMethodBeat.o(117327);
  }

  public final void onPluginReady(String paramString, int paramInt, SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(117326);
    super.onPluginReady(paramString, paramInt, paramSurfaceTexture);
    if (this.bSf != null)
      this.bSf.onPluginReady(paramString, paramInt, paramSurfaceTexture);
    AppMethodBeat.o(117326);
  }

  public final void onPluginTouch(String paramString, int paramInt, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(117328);
    super.onPluginTouch(paramString, paramInt, paramMotionEvent);
    if (this.bSf != null)
      this.bSf.onPluginTouch(paramString, paramInt, paramMotionEvent);
    AppMethodBeat.o(117328);
  }

  public final void setPluginTextureScale(String paramString, int paramInt, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(117329);
    super.setPluginTextureScale(paramString, paramInt, paramFloat1, paramFloat2);
    AppMethodBeat.o(117329);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.i.a.e
 * JD-Core Version:    0.6.2
 */