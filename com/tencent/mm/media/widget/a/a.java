package com.tencent.mm.media.widget.a;

import a.f.b.j;
import a.k.m;
import a.l;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.SurfaceHolder;
import com.tencent.mm.g.a.mi;
import com.tencent.mm.g.a.mi.b;
import com.tencent.mm.plugin.mmsight.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camera/BaseCommonCamera;", "Lcom/tencent/mm/media/widget/camera/ICommonCamera;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "CROP_PREVIEW_THRESHOLD", "", "getCROP_PREVIEW_THRESHOLD", "()I", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG_SETTING", "getTAG_SETTING", "cameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "getCameraConfig", "()Lcom/tencent/mm/media/widget/camera/CameraConfig;", "setCameraConfig", "(Lcom/tencent/mm/media/widget/camera/CameraConfig;)V", "cameraStatus", "Lcom/tencent/mm/media/widget/camera/BaseCommonCamera$CameraStatus;", "getCameraStatus", "()Lcom/tencent/mm/media/widget/camera/BaseCommonCamera$CameraStatus;", "setCameraStatus", "(Lcom/tencent/mm/media/widget/camera/BaseCommonCamera$CameraStatus;)V", "getContext", "()Landroid/content/Context;", "setContext", "hasShownErrorTip", "", "params", "Lcom/tencent/mm/plugin/mmsight/model/RecordParams;", "getParams", "()Lcom/tencent/mm/plugin/mmsight/model/RecordParams;", "setParams", "(Lcom/tencent/mm/plugin/mmsight/model/RecordParams;)V", "resolutionLimit", "getResolutionLimit", "setResolutionLimit", "(I)V", "surface", "Landroid/view/SurfaceHolder;", "getSurface", "()Landroid/view/SurfaceHolder;", "setSurface", "(Landroid/view/SurfaceHolder;)V", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "setSurfaceTexture", "(Landroid/graphics/SurfaceTexture;)V", "useBackCamera", "getUseBackCamera", "()Z", "setUseBackCamera", "(Z)V", "useCpuCrop", "getUseCpuCrop", "setUseCpuCrop", "initCamera", "useBack", "isBackCamera", "isCameraPreviewing", "release", "", "showCameraErrorTips", "startPreview", "switchCamera", "CameraStatus", "plugin-mediaeditor_release"})
public abstract class a
  implements e
{
  final String TAG;
  private SurfaceTexture bsb;
  Context context;
  final String fao;
  private final int fap;
  private boolean faq;
  boolean fas;
  private a.a fat;
  boolean fau;
  p fav;
  b faw;
  private SurfaceHolder fax;
  private int fay;

  public a(Context paramContext)
  {
    this.context = paramContext;
    this.TAG = "MicroMsg.CommonCamera1";
    this.fao = "MicroMsg.MMSightCameraSetting";
    this.fap = 8;
    this.fas = true;
    this.fat = a.a.faz;
    this.fau = true;
    paramContext = p.bPJ();
    j.o(paramContext, "RecordParams.getBigSightDefault()");
    this.fav = paramContext;
    this.faw = b.faF;
    this.fay = 40000;
  }

  protected final void Wf()
  {
    if ((this.faq) || (this.context == null));
    while (true)
    {
      return;
      if ((!m.I(Build.MANUFACTURER, "meizu", true)) || (com.tencent.mm.compatible.f.b.Mj()))
      {
        Object localObject = new mi();
        ((mi)localObject).cIm.type = 2;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        if (((mi)localObject).cIn.cIl)
        {
          this.faq = true;
        }
        else
        {
          localObject = h.g(this.context, 2131303515, 2131297061);
          if (localObject != null)
          {
            ((c)localObject).setCancelable(false);
            ((c)localObject).setCanceledOnTouchOutside(false);
            ((c)localObject).show();
            this.faq = true;
          }
        }
      }
    }
  }

  public final boolean Wg()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if ((this.bsb == null) && (this.fax == null))
      ab.e(this.TAG, " do you forget override func startPreview");
    while (true)
    {
      return bool2;
      release();
      Object localObject = this.context;
      if (localObject == null)
        j.dWJ();
      bool2 = bool1;
      if (!this.fas)
        bool2 = true;
      o((Context)localObject, bool2);
      ab.i(this.TAG, "useCpuCrop : " + this.fau + " , resolutionLimit: " + this.fay);
      if (this.bsb == null)
      {
        localObject = this.fax;
        if (localObject == null)
          j.dWJ();
        a((SurfaceHolder)localObject, this.fau, this.fay);
        bool2 = this.fas;
      }
      else
      {
        localObject = this.bsb;
        if (localObject == null)
          j.dWJ();
        a((SurfaceTexture)localObject, this.fau, this.fay);
        bool2 = this.fas;
      }
    }
  }

  public final boolean Wh()
  {
    if (this.fat == a.a.faA);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void a(SurfaceTexture paramSurfaceTexture, boolean paramBoolean, int paramInt)
  {
    this.bsb = paramSurfaceTexture;
    this.fau = paramBoolean;
    this.fay = paramInt;
  }

  public void a(SurfaceHolder paramSurfaceHolder, boolean paramBoolean, int paramInt)
  {
    this.fax = paramSurfaceHolder;
    this.fau = paramBoolean;
    this.fay = paramInt;
  }

  protected final void a(a.a parama)
  {
    j.p(parama, "<set-?>");
    this.fat = parama;
  }

  public boolean o(Context paramContext, boolean paramBoolean)
  {
    j.p(paramContext, "context");
    this.fas = paramBoolean;
    return true;
  }

  public void release()
  {
    this.fat = a.a.faz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.a
 * JD-Core Version:    0.6.2
 */