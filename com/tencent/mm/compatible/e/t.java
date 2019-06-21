package com.tencent.mm.compatible.e;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.view.SurfaceHolder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.concurrent.atomic.AtomicInteger;

public final class t
{
  private static final AtomicInteger ett;
  private static final AtomicInteger etu;
  public Camera etv;

  static
  {
    AppMethodBeat.i(93007);
    ett = new AtomicInteger(0);
    etu = new AtomicInteger(0);
    AppMethodBeat.o(93007);
  }

  public t(Camera paramCamera)
  {
    AppMethodBeat.i(92992);
    this.etv = paramCamera;
    if (paramCamera != null)
    {
      ett.incrementAndGet();
      ab.c("MicroMsg.MCamera", "init MCamera, initCount:%s, releaseCount:%s", new Object[] { ett, etu });
      if (ett.get() - etu.get() > 1)
      {
        ab.i("MicroMsg.MCamera", "MCamera leak, do report, current process:%s", new Object[] { ah.getProcessName() });
        paramCamera = a.epB;
        a.eU(61L);
        if (ah.bqo())
        {
          paramCamera = a.epB;
          a.eU(62L);
          ett.set(0);
          etu.set(0);
        }
      }
      else
      {
        AppMethodBeat.o(92992);
      }
    }
    while (true)
    {
      return;
      if (ah.doF())
      {
        paramCamera = a.epB;
        a.eU(63L);
        break;
      }
      if (!ah.isAppBrandProcess())
        break;
      paramCamera = a.epB;
      a.eU(64L);
      break;
      ab.c("MicroMsg.MCamera", "init MCamera with null camera!!!", new Object[0]);
      AppMethodBeat.o(92992);
    }
  }

  public final void addCallbackBuffer(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93006);
    if (this.etv != null)
      this.etv.addCallbackBuffer(paramArrayOfByte);
    AppMethodBeat.o(93006);
  }

  public final void autoFocus(Camera.AutoFocusCallback paramAutoFocusCallback)
  {
    AppMethodBeat.i(93000);
    if (this.etv != null)
      this.etv.autoFocus(paramAutoFocusCallback);
    AppMethodBeat.o(93000);
  }

  public final void cancelAutoFocus()
  {
    AppMethodBeat.i(93002);
    if (this.etv != null)
      this.etv.cancelAutoFocus();
    AppMethodBeat.o(93002);
  }

  public final Camera.Parameters getParameters()
  {
    AppMethodBeat.i(92993);
    Camera.Parameters localParameters;
    if (this.etv != null)
    {
      localParameters = this.etv.getParameters();
      AppMethodBeat.o(92993);
    }
    while (true)
    {
      return localParameters;
      localParameters = null;
      AppMethodBeat.o(92993);
    }
  }

  public final void release()
  {
    AppMethodBeat.i(93003);
    if (this.etv != null)
    {
      this.etv.release();
      etu.incrementAndGet();
      ab.c("MicroMsg.MCamera", "release MCamera, initCount: %s, releaseCount: %s", new Object[] { ett, etu });
    }
    AppMethodBeat.o(93003);
  }

  public final void setDisplayOrientation(int paramInt)
  {
    AppMethodBeat.i(92998);
    if (this.etv != null)
      this.etv.setDisplayOrientation(paramInt);
    AppMethodBeat.o(92998);
  }

  public final void setOneShotPreviewCallback(Camera.PreviewCallback paramPreviewCallback)
  {
    AppMethodBeat.i(93001);
    if (this.etv != null)
      this.etv.setOneShotPreviewCallback(paramPreviewCallback);
    AppMethodBeat.o(93001);
  }

  public final void setParameters(Camera.Parameters paramParameters)
  {
    AppMethodBeat.i(92994);
    if (this.etv != null)
      this.etv.setParameters(paramParameters);
    AppMethodBeat.o(92994);
  }

  public final void setPreviewCallback(Camera.PreviewCallback paramPreviewCallback)
  {
    AppMethodBeat.i(93004);
    if (this.etv != null)
      this.etv.setPreviewCallback(paramPreviewCallback);
    AppMethodBeat.o(93004);
  }

  public final void setPreviewCallbackWithBuffer(Camera.PreviewCallback paramPreviewCallback)
  {
    AppMethodBeat.i(93005);
    if (this.etv != null)
      this.etv.setPreviewCallbackWithBuffer(paramPreviewCallback);
    AppMethodBeat.o(93005);
  }

  public final void setPreviewDisplay(SurfaceHolder paramSurfaceHolder)
  {
    AppMethodBeat.i(92995);
    if (this.etv != null)
      this.etv.setPreviewDisplay(paramSurfaceHolder);
    AppMethodBeat.o(92995);
  }

  public final void setPreviewTexture(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(92996);
    if (this.etv != null)
      this.etv.setPreviewTexture(paramSurfaceTexture);
    AppMethodBeat.o(92996);
  }

  public final void startPreview()
  {
    AppMethodBeat.i(92997);
    if (this.etv != null)
      this.etv.startPreview();
    AppMethodBeat.o(92997);
  }

  public final void stopPreview()
  {
    AppMethodBeat.i(92999);
    if (this.etv != null)
      this.etv.stopPreview();
    AppMethodBeat.o(92999);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.t
 * JD-Core Version:    0.6.2
 */