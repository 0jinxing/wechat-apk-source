package com.tencent.mm.plugin.emojicapture.b;

import a.f.b.j;
import a.l;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.media.b.b;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.ac.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/config/EmojiCameraElementConfig;", "Lcom/tencent/mm/media/config/SimpleElementConfig;", "Lcom/tencent/mm/plugin/emojicapture/config/EmojiCameraElementConfig$CameraPreviewConfig;", "()V", "CAPTURE_PREVIEW_SIZE_HIGH", "", "CAPTURE_PREVIEW_SIZE_LOW", "RECORDER_CAPTURE_RESOLUTION_1080P", "RECORDER_CAPTURE_RESOLUTION_720P", "TAG", "", "highPerformance", "", "checkHighPerformance", "", "getIntDynamicConfig", "key", "defValue", "init", "initDefaultConfig", "loadConfig", "setPreviewConfig", "setServerUseCpuCrop", "CameraPreviewConfig", "plugin-emojicapture_release"})
public final class a extends b<a.a>
{
  private static final String TAG = "MicroMsg.EmojiCameraElementConfig";
  private static boolean lhb;
  public static final a lhc;

  static
  {
    AppMethodBeat.i(2574);
    lhc = new a();
    TAG = "MicroMsg.EmojiCameraElementConfig";
    lhb = true;
    AppMethodBeat.o(2574);
  }

  public final int L(String paramString, int paramInt)
  {
    AppMethodBeat.i(2573);
    j.p(paramString, "key");
    Object localObject;
    if (ah.bqo())
    {
      localObject = g.K(com.tencent.mm.plugin.zero.b.a.class);
      j.o(localObject, "MMKernel.service<IConfig…onfigService::class.java)");
      paramInt = bo.getInt(((com.tencent.mm.plugin.zero.b.a)localObject).Nu().getValue(paramString), paramInt);
      AppMethodBeat.o(2573);
    }
    while (true)
    {
      return paramInt;
      localObject = EmojiCaptureProxy.lkM;
      paramInt = bo.getInt(EmojiCaptureProxy.access$getInstance$cp().getDynamicConfig(paramString), paramInt);
      AppMethodBeat.o(2573);
    }
  }

  public final void Uv()
  {
    boolean bool = true;
    AppMethodBeat.i(2572);
    ((a.a)Ut()).fau = false;
    Object localObject;
    if (bp.dpL())
    {
      if (ah.bqo())
      {
        localObject = (a.a)Ut();
        bool = com.tencent.mm.emoji.a.e.OV();
        ((a.a)localObject).fau = bool;
      }
    }
    else
      if (!((a.a)Ut()).fau)
        break label164;
    label164: for (((a.a)Ut()).lhd = 720; ; ((a.a)Ut()).lhd = 1080)
    {
      ab.i(TAG, "config resolution:" + ((a.a)Ut()).lhd + ", useCpuCrop:" + ((a.a)Ut()).fau);
      AppMethodBeat.o(2572);
      return;
      a.a locala = (a.a)Ut();
      localObject = EmojiCaptureProxy.lkM;
      localObject = locala;
      if (EmojiCaptureProxy.access$getInstance$cp().getInt(ac.a.xWU, 1) == 0)
        break;
      bool = false;
      localObject = locala;
      break;
    }
  }

  public final void init()
  {
    boolean bool1 = true;
    AppMethodBeat.i(2570);
    aQ(new a.a((byte)0));
    Object localObject = ah.getContext().getSystemService("activity");
    if (localObject == null)
    {
      localObject = new a.v("null cannot be cast to non-null type android.app.ActivityManager");
      AppMethodBeat.o(2570);
      throw ((Throwable)localObject);
    }
    localObject = (ActivityManager)localObject;
    int i = ((ActivityManager)localObject).getLargeMemoryClass();
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    ((ActivityManager)localObject).getMemoryInfo(localMemoryInfo);
    long l = localMemoryInfo.totalMem / 1024L / 1024L;
    int j = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lII, 512);
    int k = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIH, 2048);
    if ((com.tencent.mm.compatible.util.d.iW(23)) && (i >= j) && (l >= k))
    {
      bool2 = true;
      lhb = bool2;
      if (!bool2)
        break label586;
      localObject = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bnl();
      label176: ab.i(TAG, "checkHighPerformance: device: " + i + ", " + l + "; high: " + j + ", " + k + "; " + lhb);
      if (!lhb)
        break label596;
      ((a.a)Ut()).lhe = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIJ, 640);
      ((a.a)Ut()).lhf = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIK, 1);
      label305: j = q.etj.etM;
      i = q.etj.etN;
      if (j != -1)
      {
        ab.i(TAG, "setPreviewConfig: use device preview ".concat(String.valueOf(j)));
        ((a.a)Ut()).lhe = j;
      }
      if (i != -1)
      {
        ab.i(TAG, "setPreviewConfig: use device sample size ".concat(String.valueOf(i)));
        ((a.a)Ut()).lhf = i;
      }
      ab.i(TAG, "setPreviewConfig: " + ((a.a)Ut()).lhe + ", " + ((a.a)Ut()).lhf);
      if (L("VideoRecordUseCpuCrop", 0) != 1)
        break label655;
      bool2 = true;
      label453: j = q.etk.etK;
      ab.i(TAG, "setServerUseCpuCrop, serverConfigUseCpuCrop:" + bool2 + ", deviceConfigUseCpuCrop:" + j);
      if (bool2)
        ((a.a)Ut()).fau = true;
      if (j != -1)
      {
        localObject = (a.a)Ut();
        if (j != 1)
          break label661;
      }
    }
    label655: label661: for (boolean bool2 = bool1; ; bool2 = false)
    {
      ((a.a)localObject).fau = bool2;
      ab.i(TAG, "final set useCpuCrop:" + ((a.a)Ut()).fau);
      AppMethodBeat.o(2570);
      return;
      bool2 = false;
      break;
      label586: localObject = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bnm();
      break label176;
      label596: ((a.a)Ut()).lhe = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIL, 480);
      ((a.a)Ut()).lhf = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIM, 1);
      break label305;
      bool2 = false;
      break label453;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.b.a
 * JD-Core Version:    0.6.2
 */