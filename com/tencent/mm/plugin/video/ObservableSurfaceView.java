package com.tencent.mm.plugin.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class ObservableSurfaceView extends SurfaceView
  implements SurfaceHolder.Callback
{
  protected SurfaceHolder hei;
  private a sKK;
  protected boolean sKL;
  protected boolean sKM;
  protected boolean sKN;

  public ObservableSurfaceView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(50956);
    this.sKK = null;
    this.sKL = false;
    this.sKM = false;
    this.sKN = false;
    init();
    AppMethodBeat.o(50956);
  }

  public ObservableSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(50957);
    this.sKK = null;
    this.sKL = false;
    this.sKM = false;
    this.sKN = false;
    init();
    AppMethodBeat.o(50957);
  }

  public ObservableSurfaceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(50958);
    this.sKK = null;
    this.sKL = false;
    this.sKM = false;
    this.sKN = false;
    init();
    AppMethodBeat.o(50958);
  }

  private void init()
  {
    AppMethodBeat.i(50959);
    this.hei = getHolder();
    this.hei.addCallback(this);
    AppMethodBeat.o(50959);
  }

  public final boolean cHK()
  {
    return this.sKL;
  }

  public SurfaceHolder getSurfaceHolder()
  {
    return this.hei;
  }

  public void setNeedSetType(boolean paramBoolean)
  {
    AppMethodBeat.i(50960);
    this.sKN = paramBoolean;
    if (this.sKN)
      this.hei.setType(3);
    AppMethodBeat.o(50960);
  }

  public void setSurfaceChangeCallback(a parama)
  {
    AppMethodBeat.i(50961);
    this.sKK = parama;
    if (this.sKN)
      this.hei.setType(3);
    AppMethodBeat.o(50961);
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(50962);
    ab.d("MicroMsg.ObservableSurfaceView", "surfaceChanged");
    this.sKM = true;
    try
    {
      this.hei.removeCallback(this);
      label27: this.hei = paramSurfaceHolder;
      this.hei.addCallback(this);
      if (this.sKK != null)
        this.sKK.a(this.hei);
      AppMethodBeat.o(50962);
      return;
    }
    catch (Exception localException)
    {
      break label27;
    }
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.sKL = true;
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.sKL = false;
    this.sKM = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.video.ObservableSurfaceView
 * JD-Core Version:    0.6.2
 */