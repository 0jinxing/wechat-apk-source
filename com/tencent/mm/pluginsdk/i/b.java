package com.tencent.mm.pluginsdk.i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.MediaRecorder;
import android.os.Looper;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;

public final class b
{
  public Context context;
  public int fVl;
  private boolean faH;
  public int fileSize;
  public String filename;
  public MediaRecorder owh;
  public a qBs;
  public g vfT;
  public int vfU;
  private final int vfV;
  private b.a vfW;

  public b()
  {
    AppMethodBeat.i(27465);
    this.vfU = 0;
    this.vfV = 5;
    this.faH = false;
    this.vfW = new b.a(Looper.getMainLooper());
    AppMethodBeat.o(27465);
  }

  public final int b(Activity paramActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(27467);
    this.context = paramActivity;
    int i = this.vfT.a(paramActivity, this.qBs, paramBoolean);
    if (i != 0)
      AppMethodBeat.o(27467);
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(27467);
    }
  }

  public final int b(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(27469);
    int i = this.vfT.b(paramSurfaceHolder);
    AppMethodBeat.o(27469);
    return i;
  }

  public final int diG()
  {
    AppMethodBeat.i(27468);
    this.vfT.bPl();
    AppMethodBeat.o(27468);
    return 0;
  }

  public final int getPreviewHeight()
  {
    AppMethodBeat.i(27471);
    int i;
    if (this.vfT.erH.etv == null)
    {
      i = 0;
      AppMethodBeat.o(27471);
    }
    while (true)
    {
      return i;
      i = this.vfT.erH.etv.getParameters().getPreviewSize().height;
      AppMethodBeat.o(27471);
    }
  }

  public final int getPreviewWidth()
  {
    AppMethodBeat.i(27470);
    int i;
    if (this.vfT.erH.etv == null)
    {
      i = 0;
      AppMethodBeat.o(27470);
    }
    while (true)
    {
      return i;
      i = this.vfT.erH.etv.getParameters().getPreviewSize().width;
      AppMethodBeat.o(27470);
    }
  }

  @TargetApi(9)
  public final void setOrientationHint(int paramInt)
  {
    AppMethodBeat.i(27466);
    com.tencent.mm.compatible.a.a.a(9, new b.1(this, paramInt));
    AppMethodBeat.o(27466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.b
 * JD-Core Version:    0.6.2
 */