package com.tencent.mm.plugin.emojicapture.model;

import a.f.b.j;
import a.k.m;
import a.l;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.api.b.a;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.a.c.a;
import com.tencent.ttpic.VideoModule;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.ttpic.device.DeviceUtils;
import com.tencent.ttpic.util.FilterUtils;
import com.tencent.ttpic.util.ResourcePathMapper;
import com.tencent.ttpic.util.ResourcePathMapper.MODE;
import com.tencent.view.raw.FilterRawGet;
import com.tencent.view.raw.FilterRawGet.GetInputStream;
import com.tencent.ytcommon.util.YTCommonInterface;
import java.io.File;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/PluginEmojiCapture;", "Lcom/tencent/mm/kernel/plugin/Plugin;", "Lcom/tencent/mm/plugin/emojicapture/api/IPluginEmojiCapture;", "Lcom/tencent/mm/kernel/api/ICoreAccountCallback;", "()V", "TAG", "", "TAG$1", "isInit", "", "()Z", "setInit", "(Z)V", "cameraCheck", "context", "Landroid/content/Context;", "execute", "", "profile", "Lcom/tencent/mm/kernel/plugin/ProcessProfile;", "firstOpenCheck", "onResult", "Lcom/tencent/mm/plugin/emojicapture/api/IPluginEmojiCapture$CheckCallback;", "getExternalFilesDir", "Ljava/io/File;", "folder", "getRes", "Lcom/tencent/mm/plugin/emojicapture/api/IEmojiStickerRes;", "getVideoLutFileDir", "getYtDetectModelBackupFileDir", "getYtDetectModelFileDir", "initCheck", "initLibrary", "name", "onAccountInitialized", "upgrade", "Lcom/tencent/mm/kernel/CoreStorage$UpgradeInfo;", "onAccountRelease", "overSizeCheck", "preCheck", "scene", "", "Companion", "plugin-emojicapture_release"})
public final class PluginEmojiCapture extends f
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.plugin.emojicapture.api.b
{
  private static final int MIN_STORAGE_SIZE = 52428800;
  private static final String TAG = "MicroMsg.PlguinEmojiCapture.Companion";
  private static final String lhB = "weishi_video_lut";
  private static final String lhC = "weishi_yt_model";
  private static final String lhD = "weishi_yt_backup_model";
  public static final PluginEmojiCapture.a lhE;
  private boolean bZi;
  private final String eZe = "MicroMsg.PluginEmojiCapture";

  static
  {
    AppMethodBeat.i(2634);
    lhE = new PluginEmojiCapture.a((byte)0);
    TAG = "MicroMsg.PlguinEmojiCapture.Companion";
    MIN_STORAGE_SIZE = 52428800;
    lhB = "weishi_video_lut";
    lhC = "weishi_yt_model";
    lhD = "weishi_yt_backup_model";
    AppMethodBeat.o(2634);
  }

  private final boolean cameraCheck(Context paramContext)
  {
    AppMethodBeat.i(2629);
    boolean bool;
    if ((com.tencent.mm.plugin.voip.e.bI(paramContext)) || (com.tencent.mm.plugin.voip.e.bJ(paramContext)) || (com.tencent.mm.bg.e.bH(paramContext)))
    {
      ab.i(this.eZe, "camera check false");
      bool = false;
      AppMethodBeat.o(2629);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(2629);
    }
  }

  private final void firstOpenCheck(Context paramContext, b.a parama)
  {
    AppMethodBeat.i(2627);
    Object localObject = com.tencent.mm.kernel.g.RP();
    j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ry().i(ac.a.xVw);
    if ((localObject != null) && ((localObject instanceof Boolean)) && (((Boolean)localObject).booleanValue()))
    {
      parama.gA(true);
      AppMethodBeat.o(2627);
    }
    while (true)
    {
      return;
      localObject = com.tencent.mm.ao.b.afY();
      j.o(localObject, "FontResLogic.getInstance()");
      if (!((com.tencent.mm.ao.b)localObject).afZ())
        h.pYm.z(933L, 2L);
      localObject = BitmapFactory.decodeResource(paramContext.getResources(), 2130838549);
      new c.a(paramContext).PV(2131298896).a((Bitmap)localObject, false, 0).PZ(2131298895).Qc(2131298893).a((DialogInterface.OnDismissListener)new PluginEmojiCapture.b(parama)).aMb().show();
      paramContext = com.tencent.mm.kernel.g.RP();
      j.o(paramContext, "MMKernel.storage()");
      paramContext.Ry().set(ac.a.xVw, Boolean.TRUE);
      ab.i(this.eZe, "first open check false");
      AppMethodBeat.o(2627);
    }
  }

  private final void initCheck()
  {
    AppMethodBeat.i(2622);
    int i;
    int j;
    if (!this.bZi)
    {
      i = -1;
      j = i;
    }
    while (true)
    {
      try
      {
        initLibrary();
        j = i;
        VideoModule.init(ah.getContext(), getVideoLutFileDir(), getYtDetectModelFileDir(), getYtDetectModelBackupFileDir());
        j = i;
        ResourcePathMapper.init(ResourcePathMapper.MODE.LOCAL);
        j = i;
        FilterUtils.checkLibraryInit();
        j = i;
        i = YTCommonInterface.initAuth(ah.getContext(), "rel_wechat.lic", 0, false);
        j = i;
        ab.i(this.eZe, "init VideoModule initAuth: %s", new Object[] { Integer.valueOf(i) });
        j = i;
        if (j != 0)
        {
          EmojiCaptureReporter.up(17);
          d locald = d.lhz;
          d.bnk();
          this.bZi = false;
          AppMethodBeat.o(2622);
          return;
        }
      }
      catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
      {
        ab.printErrStackTrace(this.eZe, (Throwable)localUnsatisfiedLinkError, "init error", new Object[0]);
        continue;
        FilterRawGet.setGetInputStream((FilterRawGet.GetInputStream)new PluginEmojiCapture.c(this));
      }
      try
      {
        j = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIN, 1);
        ab.i(this.eZe, "enableLog:".concat(String.valueOf(j)));
        if (j == 0)
        {
          ab.i(this.eZe, "disable renderUtils log");
          com.tencent.view.g.dSP();
        }
        this.bZi = true;
        AppMethodBeat.o(2622);
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace(this.eZe, (Throwable)localException, "get enable log error", new Object[0]);
      }
    }
  }

  private final void initLibrary()
  {
    AppMethodBeat.i(2623);
    ab.i(this.eZe, "init load pt library");
    k.a("image_filter_common", PluginEmojiCapture.class.getClassLoader());
    k.a("image_filter_gpu", PluginEmojiCapture.class.getClassLoader());
    k.a("format_convert", PluginEmojiCapture.class.getClassLoader());
    k.a("YTCommon", PluginEmojiCapture.class.getClassLoader());
    k.a("YTFaceTrackPro", PluginEmojiCapture.class.getClassLoader());
    k.a("algo_youtu_jni", PluginEmojiCapture.class.getClassLoader());
    k.a("pitu_tools", PluginEmojiCapture.class.getClassLoader());
    Object localObject = EmojiCaptureProxy.lkM;
    EmojiCaptureProxy.a.bnL();
    localObject = EmojiCaptureProxy.lkM;
    localObject = EmojiCaptureProxy.access$getInstance$cp().getServerProxy();
    if (localObject != null)
    {
      ((com.tencent.mm.remoteservice.d)localObject).connect((Runnable)new d(this));
      AppMethodBeat.o(2623);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2623);
    }
  }

  private final boolean overSizeCheck(Context paramContext)
  {
    AppMethodBeat.i(2628);
    com.tencent.mm.emoji.a.b localb = com.tencent.mm.emoji.a.b.eyD;
    boolean bool;
    if (com.tencent.mm.emoji.a.b.OF())
    {
      new c.a(paramContext).PV(2131298900).PZ(2131298899).Qc(2131298898).a((DialogInterface.OnClickListener)new PluginEmojiCapture.e(paramContext)).Qd(2131298897).aMb().show();
      ab.i(this.eZe, "over size check false");
      bool = false;
      AppMethodBeat.o(2628);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(2628);
    }
  }

  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(2621);
    ab.i(this.eZe, "Plugin EmojiCapture Execute");
    if (paramg != null);
    for (paramg = Boolean.valueOf(paramg.lQ(":tools")); ; paramg = null)
    {
      if (paramg == null)
        j.dWJ();
      if (paramg.booleanValue())
        initCheck();
      AppMethodBeat.o(2621);
      return;
    }
  }

  public final File getExternalFilesDir(Context paramContext, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(2633);
    j.p(paramContext, "context");
    j.p(paramString, "folder");
    Object localObject3 = localObject1;
    if (DeviceUtils.isExternalStorageAvailable())
    {
      localObject3 = localObject1;
      if (!DeviceUtils.isExternalStorageSpaceEnough(MIN_STORAGE_SIZE));
    }
    try
    {
      localObject3 = paramContext.getExternalFilesDir(null);
      if (localObject3 == null)
      {
        localObject3 = "/Android/data/" + paramContext.getPackageName() + "/files/";
        localObject2 = localObject3;
        if (TextUtils.isEmpty((CharSequence)localObject3))
        {
          paramContext = paramContext.getFilesDir();
          j.o(paramContext, "context.filesDir");
          localObject2 = paramContext.getPath();
        }
        paramString = new File((String)localObject2 + File.separator + paramString);
      }
    }
    catch (Exception localException)
    {
      try
      {
        while (true)
        {
          if ((paramString.exists()) && (paramString.isFile()))
            paramString.delete();
          if (!paramString.exists())
            paramString.mkdirs();
          AppMethodBeat.o(2633);
          return paramString;
          localException = localException;
          ab.printErrStackTrace(this.eZe, (Throwable)localException, "", new Object[0]);
          localObject4 = localObject2;
        }
        Object localObject4 = ((File)localObject4).getPath();
      }
      catch (Exception paramContext)
      {
        while (true)
          LogUtils.e((Throwable)paramContext);
      }
    }
  }

  public final com.tencent.mm.plugin.emojicapture.api.a getRes()
  {
    return (com.tencent.mm.plugin.emojicapture.api.a)com.tencent.mm.plugin.emojicapture.model.a.e.lii;
  }

  public final String getVideoLutFileDir()
  {
    AppMethodBeat.i(2630);
    Object localObject = ah.getContext();
    j.o(localObject, "MMApplicationContext.getContext()");
    localObject = getExternalFilesDir((Context)localObject, lhB).getPath();
    j.o(localObject, "getExternalFilesDir(MMAp… VIDEO_LUT_FILE_DIR).path");
    AppMethodBeat.o(2630);
    return localObject;
  }

  public final String getYtDetectModelBackupFileDir()
  {
    AppMethodBeat.i(2632);
    Object localObject = ah.getContext();
    j.o(localObject, "MMApplicationContext.getContext()");
    localObject = getExternalFilesDir((Context)localObject, lhD).getPath();
    j.o(localObject, "getExternalFilesDir(MMAp…DEL_BACKUP_FILE_DIR).path");
    AppMethodBeat.o(2632);
    return localObject;
  }

  public final String getYtDetectModelFileDir()
  {
    AppMethodBeat.i(2631);
    Object localObject = Environment.getExternalStorageDirectory();
    j.o(localObject, "Environment.getExternalStorageDirectory()");
    localObject = ((File)localObject).getPath();
    File localFile = new File((String)localObject + File.separator + lhC);
    if (!localFile.isDirectory())
      localFile.mkdirs();
    if (DeviceUtils.canWriteFile(localFile.getAbsolutePath()))
    {
      localObject = localFile.getAbsolutePath();
      j.o(localObject, "dir.absolutePath");
      AppMethodBeat.o(2631);
    }
    while (true)
    {
      return localObject;
      j.o(localObject, "root");
      AppMethodBeat.o(2631);
    }
  }

  public final boolean isInit()
  {
    return this.bZi;
  }

  public final String name()
  {
    return "plugin-emojicapture";
  }

  public final void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(2625);
    ab.i(this.eZe, "onAccountInitialized: ");
    com.tencent.mm.pluginsdk.cmd.b.a((com.tencent.mm.pluginsdk.cmd.a)new b(), new String[] { "//emojicapture" });
    paramc = com.tencent.mm.plugin.emojicapture.model.a.g.lik;
    com.tencent.mm.plugin.emojicapture.model.a.g.init();
    AppMethodBeat.o(2625);
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(2626);
    ab.i(this.eZe, "onAccountRelease: ");
    com.tencent.mm.pluginsdk.cmd.b.N(new String[] { "//emojicapture" });
    com.tencent.mm.plugin.emojicapture.model.a.g localg = com.tencent.mm.plugin.emojicapture.model.a.g.lik;
    com.tencent.mm.plugin.emojicapture.model.a.g.destroy();
    AppMethodBeat.o(2626);
  }

  public final void preCheck(Context paramContext, int paramInt, b.a parama)
  {
    AppMethodBeat.i(2624);
    j.p(paramContext, "context");
    j.p(parama, "onResult");
    com.tencent.mm.ao.b.afY();
    com.tencent.mm.ao.b.aga();
    if ((cameraCheck(paramContext)) && (overSizeCheck(paramContext)))
      if (paramInt != 2)
      {
        parama.gA(true);
        AppMethodBeat.o(2624);
      }
    while (true)
    {
      return;
      firstOpenCheck(paramContext, parama);
      AppMethodBeat.o(2624);
      continue;
      parama.gA(false);
      AppMethodBeat.o(2624);
    }
  }

  public final void setInit(boolean paramBoolean)
  {
    this.bZi = paramBoolean;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class d
    implements Runnable
  {
    d(PluginEmojiCapture paramPluginEmojiCapture)
    {
    }

    public final void run()
    {
      boolean bool1 = true;
      AppMethodBeat.i(2619);
      ab.i(PluginEmojiCapture.access$getTAG$p(this.lhG), "initLibrary: on connect");
      EmojiCaptureProxy.a locala = EmojiCaptureProxy.lkM;
      q.ku(EmojiCaptureProxy.access$getInstance$cp().getDeviceInfoConfig());
      if ((m.I(Build.MODEL, "OPPO R9tm", true)) || (q.etj.etO == 1) || (com.tencent.mm.compatible.util.d.fP(21)))
      {
        ab.i(PluginEmojiCapture.access$getTAG$p(this.lhG), "use small model");
        com.tencent.ttpic.fabby.FabbyManager.USE_SMALL_MODEL = true;
        com.tencent.ttpic.fabby.FabbyManager.USE_SMALL_IMAGE = true;
      }
      locala = EmojiCaptureProxy.lkM;
      int i = EmojiCaptureProxy.access$getInstance$cp().getUseGpuSegment();
      locala = EmojiCaptureProxy.lkM;
      if (EmojiCaptureProxy.access$getInstance$cp().getUseGpuSegment() > 0)
      {
        ab.i(PluginEmojiCapture.access$getTAG$p(this.lhG), "choose gpu segment. x ".concat(String.valueOf(i)));
        if (i == 1)
        {
          bool2 = true;
          com.tencent.ttpic.fabby.FabbyManager.sChooseGPU_Segment = bool2;
        }
      }
      else
      {
        i = q.etj.etP;
        if (i != -1)
        {
          ab.i(PluginEmojiCapture.access$getTAG$p(this.lhG), "choose gpu segment ".concat(String.valueOf(i)));
          if (i != 1)
            break label203;
        }
      }
      label203: for (boolean bool2 = bool1; ; bool2 = false)
      {
        com.tencent.ttpic.fabby.FabbyManager.sChooseGPU_Segment = bool2;
        locala = EmojiCaptureProxy.lkM;
        EmojiCaptureProxy.a.bnM();
        AppMethodBeat.o(2619);
        return;
        bool2 = false;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.PluginEmojiCapture
 * JD-Core Version:    0.6.2
 */