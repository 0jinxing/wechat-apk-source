package com.tencent.mm.plugin.story.c.a;

import a.f.b.j;
import a.l;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.c.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryCameraElementConfig;", "Lcom/tencent/mm/plugin/story/config/StoryElementConfig;", "Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryCameraElementConfig$CameraPreviewConfig;", "()V", "CPU_CROP_AVAILABLE", "", "CPU_CROP_MMKV_KEY", "", "CPU_CROP_NOT_AVAILABLE", "RECORDER_CAPTURE_RESOLUTION_1080P", "RECORDER_CAPTURE_RESOLUTION_540P", "RECORDER_CAPTURE_RESOLUTION_720P", "RESOLUTION", "StoryCropSizeWithCPU", "StoryCropSizeWithGPU", "TAG", "USECPUCROP", "USE_HIGHEST_RESOLUTION_MEMORYCLASS_LIMIT_MB", "USE_HIGHEST_RESOLUTION_MEMORY_LIMIT_MB", "USE_HIGHEST_RESOLUTION_MEMORY_LIMIT_MB_BUFFER", "", "getElementName", "Lcom/tencent/mm/plugin/story/config/StoryConfigConstant$ElementName;", "initDefaultConfig", "loadConfig", "", "loadCropTypeConfig", "loadDeviceResolutionConfig", "", "loadResolutionConfig", "markCpuCropNotAvailable", "setServerUseCpuCrop", "tryUse1080Preview", "use720Preview", "CameraPreviewConfig", "plugin-story_release"})
public final class b extends com.tencent.mm.plugin.story.c.b<a>
{
  public static final b rRj;

  static
  {
    AppMethodBeat.i(108956);
    rRj = new b();
    AppMethodBeat.o(108956);
  }

  public final void Uv()
  {
    int i = 1;
    AppMethodBeat.i(108955);
    boolean bool;
    int k;
    Object localObject1;
    label120: Object localObject2;
    if (L("VideoRecordUseCpuCrop", 0) == 1)
    {
      bool = true;
      j = q.etk.etK;
      k = as.amF(a.b.rQX.name()).getInt("use_cpu_crop", 0);
      ab.i("MicroMsg.StoryCameraElementConfig", "setServerUseCpuCrop, serverConfigUseCpuCrop:" + bool + ", deviceConfigUseCpuCrop:" + j + ", localCpuCropConfig:" + k);
      if (bool)
        ((a)Ut()).fau = true;
      if (j != -1)
      {
        localObject1 = (a)Ut();
        if (j != 1)
          break label458;
        bool = true;
        ((a)localObject1).fau = bool;
      }
      ab.i("MicroMsg.StoryCameraElementConfig", "final set useCpuCrop:" + ((a)Ut()).fau);
      if (bp.dpL())
      {
        localObject2 = (a)Ut();
        localObject1 = g.RP();
        j.o(localObject1, "MMKernel.storage()");
        if (((e)localObject1).Ry().getInt(ac.a.xUM, 2) != 1)
          break label463;
        bool = true;
        label201: ((a)localObject2).fau = bool;
        ab.i("MicroMsg.StoryCameraElementConfig", "cameraPreviewConfig.useCpuCrop debug : " + ((a)Ut()).fau);
      }
      if (q.etk.etG == -1)
        break label502;
      localObject1 = (a)Ut();
      switch (q.etk.etG)
      {
      default:
        j = 1080;
        label300: ((a)localObject1).lhd = j;
        ab.i("MicroMsg.StoryCameraElementConfig", "loadDeviceResolutionConfig " + ((a)Ut()).lhd + "  value " + q.etk.etG);
        j = 1;
      case 3:
      case 2:
      case 4:
      case 5:
      case 6:
      }
    }
    while (true)
      if (j == 0)
      {
        localObject2 = com.tencent.mm.plugin.mmsight.d.bPg();
        k = L("Sight1080pRecordMinApiLevel", 19);
        ab.i("MicroMsg.StoryCameraElementConfig", "record1080pApiLevel: " + k + "  screenSize x " + ((Point)localObject2).x + " y " + ((Point)localObject2).y);
        localObject1 = ah.getContext().getSystemService("activity");
        if (localObject1 == null)
        {
          localObject1 = new a.v("null cannot be cast to non-null type android.app.ActivityManager");
          AppMethodBeat.o(108955);
          throw ((Throwable)localObject1);
          bool = false;
          break;
          label458: bool = false;
          break label120;
          label463: bool = false;
          break label201;
          if (((a)Ut()).fau)
          {
            j = 540;
            break label300;
          }
          j = 720;
          break label300;
          j = 720;
          break label300;
          label502: j = 0;
          continue;
        }
        j = ((ActivityManager)localObject1).getLargeMemoryClass();
        double d = com.tencent.mm.plugin.mmsight.d.ev(ah.getContext());
        if (((q.etk.etF != -1) && ((q.etk.etF & 0x1) == 0)) || (!com.tencent.mm.compatible.util.d.iW(k)) || (j < 512) || (d < 1725.0D) || (Math.min(((Point)localObject2).x, ((Point)localObject2).y) < 1080))
          break label627;
        ((a)Ut()).lhd = 1080;
      }
    for (int j = i; ; j = 0)
    {
      if (j == 0)
        ((a)Ut()).lhd = 720;
      AppMethodBeat.o(108955);
      return;
      label627: ab.i("MicroMsg.StoryCameraElementConfig", "currentRecorderCaptureResolution is :" + (a)Ut() + ".resolution");
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryCameraElementConfig$CameraPreviewConfig;", "", "resolution", "", "useCpuCrop", "", "(IZ)V", "getResolution", "()I", "setResolution", "(I)V", "getUseCpuCrop", "()Z", "setUseCpuCrop", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "plugin-story_release"})
  public static final class a
  {
    public boolean fau = false;
    public int lhd = 720;

    public final boolean equals(Object paramObject)
    {
      boolean bool1 = false;
      boolean bool2;
      if (this != paramObject)
      {
        bool2 = bool1;
        if (!(paramObject instanceof a))
          break label65;
        paramObject = (a)paramObject;
        if (this.lhd != paramObject.lhd)
          break label67;
        i = 1;
        bool2 = bool1;
        if (i == 0)
          break label65;
        if (this.fau != paramObject.fau)
          break label73;
      }
      label65: label67: label73: for (int i = 1; ; i = 0)
      {
        bool2 = bool1;
        if (i != 0)
          bool2 = true;
        return bool2;
        i = 0;
        break;
      }
    }

    public final int hashCode()
    {
      int i = this.lhd;
      int j = this.fau;
      int k = j;
      if (j != 0)
        k = 1;
      return k + i * 31;
    }

    public final String toString()
    {
      AppMethodBeat.i(108953);
      String str = "CameraPreviewConfig(resolution=" + this.lhd + ", useCpuCrop=" + this.fau + ")";
      AppMethodBeat.o(108953);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.b
 * JD-Core Version:    0.6.2
 */