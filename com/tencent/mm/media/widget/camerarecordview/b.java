package com.tencent.mm.media.widget.camerarecordview;

import a.f.b.j;
import a.l;
import android.graphics.Point;
import android.opengl.EGLContext;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.model.a.i;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/CameraRecorderFactory;", "", "()V", "renderer", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "getRenderer", "()Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "setRenderer", "(Lcom/tencent/mm/media/render/AbsSurfaceRenderer;)V", "getAudioRecorder", "Lcom/tencent/mm/plugin/mmsight/model/encode/IMMSightAACRecorder;", "sampleRate", "", "bitrate", "getCPUMediaRecorder", "Lcom/tencent/mm/media/widget/recorder/IMediaRecorder;", "recordType", "videoPara", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "camera", "Lcom/tencent/mm/media/widget/camera/ICommonCamera;", "getGPUMediaRecorder", "videoTransPara", "eglContext", "Landroid/opengl/EGLContext;", "view", "Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "useCPUCrop", "", "plugin-mediaeditor_release"})
public final class b
{
  private static com.tencent.mm.media.h.a eXm;
  public static final b fbR;

  static
  {
    AppMethodBeat.i(13256);
    fbR = new b();
    AppMethodBeat.o(13256);
  }

  public static void Wv()
  {
    eXm = null;
  }

  public static com.tencent.mm.media.widget.b.b a(int paramInt, VideoTransPara paramVideoTransPara, com.tencent.mm.media.widget.a.e parame, EGLContext paramEGLContext, com.tencent.mm.media.widget.camerarecordview.preview.c paramc, boolean paramBoolean, com.tencent.mm.media.h.a parama)
  {
    AppMethodBeat.i(13253);
    j.p(paramVideoTransPara, "videoTransPara");
    j.p(parame, "camera");
    j.p(paramEGLContext, "eglContext");
    j.p(paramc, "view");
    if (paramInt == 2)
    {
      if (parama == null);
      for (eXm = (com.tencent.mm.media.h.a)new c(paramBoolean); ; eXm = parama)
      {
        parama = eXm;
        if ((parama != null) && (parame.Wq() != null))
        {
          parama.ch(com.tencent.mm.media.widget.a.b.getPreviewWidth(), com.tencent.mm.media.widget.a.b.getPreviewHeight());
          parama.ka(com.tencent.mm.media.widget.a.b.Wi());
          parama.ct(com.tencent.mm.media.widget.a.b.Wl());
        }
        paramVideoTransPara = (com.tencent.mm.media.widget.b.b)new com.tencent.mm.media.widget.b.c(paramVideoTransPara, eXm, paramEGLContext, paramc.getPreviewTextureId());
        AppMethodBeat.o(13253);
        return paramVideoTransPara;
      }
    }
    if (parama == null);
    for (eXm = (com.tencent.mm.media.h.a)new b.d(); ; eXm = parama)
    {
      paramEGLContext = eXm;
      if ((paramEGLContext != null) && (parame.Wq() != null))
      {
        paramc = com.tencent.mm.media.widget.a.b.Wm();
        paramEGLContext.ch(paramc.x, paramc.y);
        paramEGLContext.ka(com.tencent.mm.media.widget.a.b.Wi());
        paramEGLContext.ct(com.tencent.mm.media.widget.a.b.Wl());
      }
      paramVideoTransPara = new com.tencent.mm.media.widget.b.d(paramVideoTransPara, eXm);
      parame.a(paramVideoTransPara.getFrameDataCallback());
      paramVideoTransPara = (com.tencent.mm.media.widget.b.b)paramVideoTransPara;
      AppMethodBeat.o(13253);
      break;
    }
  }

  public static com.tencent.mm.media.widget.b.b a(int paramInt, VideoTransPara paramVideoTransPara, com.tencent.mm.media.widget.a.e parame, com.tencent.mm.media.h.a parama)
  {
    AppMethodBeat.i(13254);
    j.p(paramVideoTransPara, "videoPara");
    j.p(parame, "camera");
    Point localPoint;
    if (paramInt == 2)
    {
      if (parama == null);
      for (eXm = (com.tencent.mm.media.h.a)new b.a(); ; eXm = parama)
      {
        parama = eXm;
        if ((parama != null) && (parame.Wq() != null))
        {
          localPoint = com.tencent.mm.media.widget.a.b.Wm();
          parama.ch(localPoint.x, localPoint.y);
          parama.ka(com.tencent.mm.media.widget.a.b.Wi());
          parama.ct(com.tencent.mm.media.widget.a.b.Wl());
        }
        paramVideoTransPara = new com.tencent.mm.media.widget.b.c(paramVideoTransPara, eXm);
        parame.a(paramVideoTransPara.getFrameDataCallback());
        paramVideoTransPara = (com.tencent.mm.media.widget.b.b)paramVideoTransPara;
        AppMethodBeat.o(13254);
        return paramVideoTransPara;
      }
    }
    if (parama == null);
    for (eXm = (com.tencent.mm.media.h.a)new b.b(); ; eXm = parama)
    {
      parama = eXm;
      if ((parama != null) && (parame.Wq() != null))
      {
        localPoint = com.tencent.mm.media.widget.a.b.Wm();
        parama.ch(localPoint.x, localPoint.y);
        parama.ka(com.tencent.mm.media.widget.a.b.Wi());
        parama.ct(com.tencent.mm.media.widget.a.b.Wl());
      }
      paramVideoTransPara = new com.tencent.mm.media.widget.b.d(paramVideoTransPara, eXm);
      parame.a(paramVideoTransPara.getFrameDataCallback());
      paramVideoTransPara = (com.tencent.mm.media.widget.b.b)paramVideoTransPara;
      AppMethodBeat.o(13254);
      break;
    }
  }

  public static com.tencent.mm.plugin.mmsight.model.a.c cl(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13255);
    com.tencent.mm.plugin.mmsight.model.a.c localc = (com.tencent.mm.plugin.mmsight.model.a.c)new i(paramInt1, paramInt2);
    AppMethodBeat.o(13255);
    return localc;
  }

  public static com.tencent.mm.media.h.a getRenderer()
  {
    return eXm;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/media/widget/camerarecordview/CameraRecorderFactory$getGPUMediaRecorder$1", "Lcom/tencent/mm/media/render/SurfaceTextureRenderer;", "doInitRenderProc", "Lcom/tencent/mm/media/render/proc/GLTextureRenderProc;", "plugin-mediaeditor_release"})
  public static final class c extends com.tencent.mm.media.h.d
  {
    c(boolean paramBoolean)
    {
    }

    public final com.tencent.mm.media.h.b.a Vc()
    {
      AppMethodBeat.i(13251);
      com.tencent.mm.media.h.b.a locala;
      if (this.fbS)
      {
        locala = (com.tencent.mm.media.h.b.a)new com.tencent.mm.media.h.b.e(this.eYW, this.eYX, this.eYY, this.eYZ, this.eZa, this.scaleType);
        AppMethodBeat.o(13251);
      }
      while (true)
      {
        return locala;
        locala = (com.tencent.mm.media.h.b.a)new com.tencent.mm.media.h.b.c(this.eYW, this.eYX, this.eYY, this.eYZ, this.eZa, this.scaleType);
        AppMethodBeat.o(13251);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.b
 * JD-Core Version:    0.6.2
 */