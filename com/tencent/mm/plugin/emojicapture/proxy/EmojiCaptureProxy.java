package com.tencent.mm.plugin.emojicapture.proxy;

import a.f.b.j;
import a.k.m;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.c;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.model.c.i;
import com.tencent.mm.pluginsdk.g.a.a.b;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.bs;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.storage.emotion.EmojiInfo.b;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.a.e.a;
import com.tencent.mm.ui.widget.a.e.c;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureProxy;", "Lcom/tencent/mm/remoteservice/BaseClientRequest;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "(Lcom/tencent/mm/remoteservice/RemoteServiceProxy;)V", "RESULT_KEY", "", "getServerProxy", "()Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "checkResUpdate", "", "subType", "", "version", "checkResUpdateRemote", "checkUseCPUCrop", "", "createEmojiInfo", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "createEmojiInfoRemote", "bundle", "Landroid/os/Bundle;", "deleteEmojiInfoByEnterTime", "timeEnter", "", "deleteEmojiInfoByEnterTimeRemote", "deleteEmojiInfoByMd5", "md5", "deleteEmojiInfoByMd5Remote", "getConfigStorage", "", "_key", "defval", "getDeviceInfoConfig", "getDeviceInfoConfigRemote", "getDynamicConfig", "key", "getDynamicConfigInMM", "getEnableAutoRotate", "getEnableAutoRotateRemote", "getForbidLensId", "getInt", "Lcom/tencent/mm/storage/ConstantsStorage$BusinessInfoKey;", "defva", "getUseGpuSegment", "getUseGpuSegmentRemote", "isSpringFestivalEnable", "isSpringFestivalEnableRemote", "objectsToBundle", "params", "", "([Ljava/lang/Object;)Landroid/os/Bundle;", "onCallback", "methodName", "data", "clientCall", "postUploadTask", "filePath", "mixingMd5", "postUploadTaskRemote", "showImitateDialog", "showImitateDialogRemote", "updateEmojiInfo", "updateEmojiInfoRemote", "useCPUCrop", "Companion", "plugin-emojicapture_release"})
public final class EmojiCaptureProxy extends com.tencent.mm.remoteservice.a
{
  private static int exv;
  private static boolean exw;
  private static EmojiCaptureProxy lkL;
  public static final EmojiCaptureProxy.a lkM;
  private final String RESULT_KEY;
  private final com.tencent.mm.remoteservice.d ext;

  static
  {
    AppMethodBeat.i(2837);
    lkM = new EmojiCaptureProxy.a((byte)0);
    lkL = new EmojiCaptureProxy(new com.tencent.mm.remoteservice.d(ah.getContext()));
    exw = true;
    AppMethodBeat.o(2837);
  }

  public EmojiCaptureProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
    this.ext = paramd;
    this.RESULT_KEY = "result_key";
  }

  public final void checkResUpdate(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2826);
    REMOTE_CALL("checkResUpdateRemote", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(2826);
  }

  @f
  public final void checkResUpdateRemote(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2827);
    Object localObject = com.tencent.mm.plugin.emojicapture.model.a.g.lik;
    ab.i(com.tencent.mm.plugin.emojicapture.model.a.g.TAG, "checkResUpdate: ".concat(String.valueOf(paramInt1)));
    b.did();
    String str = b.gM(59, paramInt1);
    if (com.tencent.mm.vfs.e.ct(str))
    {
      localObject = com.tencent.mm.plugin.emojicapture.model.a.e.lii;
      bo.hU(str, com.tencent.mm.plugin.emojicapture.model.a.e.bnA());
      localObject = com.tencent.mm.plugin.emojicapture.model.a.e.lii;
      if (com.tencent.mm.plugin.emojicapture.model.a.e.ux(paramInt1).ljI > paramInt2)
      {
        com.tencent.mm.plugin.emojicapture.model.a.g.uy(paramInt1);
        AppMethodBeat.o(2827);
      }
    }
    while (true)
    {
      return;
      b.did();
      b.Ky(59);
      AppMethodBeat.o(2827);
      continue;
      b.did();
      b.Ky(59);
      AppMethodBeat.o(2827);
    }
  }

  @f
  public final boolean checkUseCPUCrop()
  {
    AppMethodBeat.i(2825);
    ab.c("MicroMsg.EmojiCaptureProxy", "checkUseCPUCrop", new Object[0]);
    boolean bool = ((com.tencent.mm.plugin.emojicapture.b.a.a)com.tencent.mm.plugin.emojicapture.b.a.lhc.Uw()).fau;
    AppMethodBeat.o(2825);
    return bool;
  }

  public final void createEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(2807);
    j.p(paramEmojiInfo, "emojiInfo");
    ab.i("MicroMsg.EmojiCaptureProxy", "createEmojiInfo: " + paramEmojiInfo.Aq());
    Bundle localBundle = new Bundle();
    localBundle.setClassLoader(EmojiInfo.class.getClassLoader());
    localBundle.putParcelable("emoji", (Parcelable)paramEmojiInfo);
    REMOTE_CALL("createEmojiInfoRemote", new Object[] { localBundle });
    AppMethodBeat.o(2807);
  }

  @f
  public final void createEmojiInfoRemote(Bundle paramBundle)
  {
    AppMethodBeat.i(2815);
    j.p(paramBundle, "bundle");
    paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
    EmojiInfo localEmojiInfo = (EmojiInfo)paramBundle.getParcelable("emoji");
    StringBuilder localStringBuilder = new StringBuilder("createEmojiInfoRemote: ");
    if (localEmojiInfo != null)
    {
      paramBundle = localEmojiInfo.Aq();
      ab.i("MicroMsg.EmojiCaptureProxy", paramBundle);
      if (localEmojiInfo == null)
        break label182;
      paramBundle = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
      j.o(paramBundle, "MMKernel.plugin(IPluginEmoji::class.java)");
      ((com.tencent.mm.plugin.emoji.b.d)paramBundle).getEmojiMgr().j(localEmojiInfo.Aq(), 0, EmojiInfo.yan, localEmojiInfo.field_size);
      paramBundle = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
      j.o(paramBundle, "MMKernel.plugin(IPluginEmoji::class.java)");
      ((com.tencent.mm.plugin.emoji.b.d)paramBundle).getEmojiMgr().updateEmojiInfo(localEmojiInfo);
      paramBundle = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
      j.o(paramBundle, "MMKernel.plugin(IPluginEmoji::class.java)");
      ((com.tencent.mm.plugin.emoji.b.d)paramBundle).getEmojiMgr().q(localEmojiInfo);
      AppMethodBeat.o(2815);
    }
    while (true)
    {
      return;
      paramBundle = null;
      break;
      label182: EmojiCaptureReporter.up(31);
      paramBundle = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bnn();
      AppMethodBeat.o(2815);
    }
  }

  public final void deleteEmojiInfoByEnterTime(long paramLong)
  {
    AppMethodBeat.i(2818);
    ab.i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfoByEnterTime: ".concat(String.valueOf(paramLong)));
    REMOTE_CALL("deleteEmojiInfoByEnterTimeRemote", new Object[] { Long.valueOf(paramLong) });
    AppMethodBeat.o(2818);
  }

  @f
  public final void deleteEmojiInfoByEnterTimeRemote(long paramLong)
  {
    AppMethodBeat.i(2819);
    ab.i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfoByEnterTimeRemote: ".concat(String.valueOf(paramLong)));
    Object localObject = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
    j.o(localObject, "MMKernel.plugin(IPluginEmoji::class.java)");
    localObject = ((com.tencent.mm.plugin.emoji.b.d)localObject).getEmojiStorageMgr();
    j.o(localObject, "MMKernel.plugin(IPluginE…ass.java).emojiStorageMgr");
    ((at)localObject).aUp().mV(paramLong);
    AppMethodBeat.o(2819);
  }

  public final void deleteEmojiInfoByMd5(String paramString)
  {
    AppMethodBeat.i(2816);
    j.p(paramString, "md5");
    ab.i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfo: ".concat(String.valueOf(paramString)));
    REMOTE_CALL("deleteEmojiInfoByMd5Remote", new Object[] { paramString });
    AppMethodBeat.o(2816);
  }

  @f
  public final void deleteEmojiInfoByMd5Remote(String paramString)
  {
    AppMethodBeat.i(2817);
    j.p(paramString, "md5");
    ab.i("MicroMsg.EmojiCaptureProxy", "deleteEmojiInfoByMd5Remote: ".concat(String.valueOf(paramString)));
    Object localObject = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
    j.o(localObject, "MMKernel.plugin(IPluginEmoji::class.java)");
    localObject = ((com.tencent.mm.plugin.emoji.b.d)localObject).getEmojiStorageMgr();
    j.o(localObject, "MMKernel.plugin(IPluginE…ass.java).emojiStorageMgr");
    ((at)localObject).aUp().aqj(paramString);
    AppMethodBeat.o(2817);
  }

  @f
  public final Object getConfigStorage(int paramInt, Object paramObject)
  {
    AppMethodBeat.i(2833);
    j.p(paramObject, "defval");
    ac.a locala = ((ac.a[])ac.a.class.getEnumConstants())[paramInt];
    ab.i("MicroMsg.EmojiCaptureProxy", "getConfigStorage, %s %s", new Object[] { locala, paramObject });
    paramObject = com.tencent.mm.kernel.g.RP().Ry().get(locala, paramObject);
    AppMethodBeat.o(2833);
    return paramObject;
  }

  public final String getDeviceInfoConfig()
  {
    AppMethodBeat.i(2813);
    Object localObject = REMOTE_CALL("getDeviceInfoConfigRemote", new Object[0]);
    if ((localObject instanceof String))
    {
      localObject = (String)localObject;
      AppMethodBeat.o(2813);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(2813);
    }
  }

  @f
  public final String getDeviceInfoConfigRemote()
  {
    AppMethodBeat.i(2832);
    String str = com.tencent.mm.kernel.g.RP().Rz().dur();
    j.o(str, "storage().getServerCfgIn…RINFO_SERVER_CONFIG_INFO)");
    AppMethodBeat.o(2832);
    return str;
  }

  public final String getDynamicConfig(String paramString)
  {
    AppMethodBeat.i(2808);
    j.p(paramString, "key");
    Object localObject = REMOTE_CALL("getDynamicConfigInMM", new Object[] { paramString });
    ab.i("MicroMsg.EmojiCaptureProxy", "getDynamicConfig, key: %s, value: %s", new Object[] { paramString, localObject });
    if (localObject == null)
    {
      paramString = "";
      AppMethodBeat.o(2808);
    }
    while (true)
    {
      return paramString;
      paramString = (String)localObject;
      AppMethodBeat.o(2808);
    }
  }

  @f
  public final String getDynamicConfigInMM(String paramString)
  {
    AppMethodBeat.i(2830);
    j.p(paramString, "key");
    paramString = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue(paramString);
    AppMethodBeat.o(2830);
    return paramString;
  }

  public final boolean getEnableAutoRotate()
  {
    AppMethodBeat.i(2809);
    boolean bool = j.j(REMOTE_CALL("getEnableAutoRotateRemote", new Object[0]), Boolean.TRUE);
    AppMethodBeat.o(2809);
    return bool;
  }

  @f
  public final boolean getEnableAutoRotateRemote()
  {
    return q.etc.erC;
  }

  public final String getForbidLensId()
  {
    AppMethodBeat.i(2811);
    Object localObject = REMOTE_CALL("getDynamicConfigInMM", new Object[] { "EmotionSpringFestivalPendantBlockedIdList" });
    if ((localObject instanceof String))
    {
      localObject = (String)localObject;
      AppMethodBeat.o(2811);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(2811);
    }
  }

  public final int getInt(ac.a parama, int paramInt)
  {
    AppMethodBeat.i(2810);
    j.p(parama, "key");
    ab.i("MicroMsg.EmojiCaptureProxy", "getInt %s %s", new Object[] { parama, Integer.valueOf(paramInt) });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, Integer.valueOf(paramInt) });
    ab.i("MicroMsg.EmojiCaptureProxy", "getInt %s %s and get val %s", new Object[] { parama, Integer.valueOf(paramInt), localObject });
    if (localObject == null)
      AppMethodBeat.o(2810);
    while (true)
    {
      return paramInt;
      paramInt = bo.getInt(localObject.toString(), paramInt);
      AppMethodBeat.o(2810);
    }
  }

  public final com.tencent.mm.remoteservice.d getServerProxy()
  {
    return this.ext;
  }

  public final int getUseGpuSegment()
  {
    AppMethodBeat.i(2814);
    Object localObject = REMOTE_CALL("getUseGpuSegmentRemote", new Object[0]);
    int i;
    if ((localObject instanceof Integer))
    {
      i = ((Number)localObject).intValue();
      AppMethodBeat.o(2814);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(2814);
      i = 0;
    }
  }

  @f
  public final int getUseGpuSegmentRemote()
  {
    AppMethodBeat.i(2834);
    try
    {
      i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lIO, 1);
      AppMethodBeat.o(2834);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 1;
    }
  }

  public final boolean isSpringFestivalEnable()
  {
    AppMethodBeat.i(2812);
    boolean bool = j.j(REMOTE_CALL("isSpringFestivalEnableRemote", new Object[0]), Boolean.TRUE);
    AppMethodBeat.o(2812);
    return bool;
  }

  @f
  public final boolean isSpringFestivalEnableRemote()
  {
    AppMethodBeat.i(2831);
    boolean bool = com.tencent.mm.emoji.a.e.isSpringFestivalEnable();
    AppMethodBeat.o(2831);
    return bool;
  }

  public final Bundle objectsToBundle(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(2835);
    j.p(paramArrayOfObject, "params");
    Bundle localBundle = new Bundle();
    int i = paramArrayOfObject.length;
    int j = 0;
    if (j < i)
    {
      Object localObject;
      if ((paramArrayOfObject[j] instanceof Bundle))
      {
        localObject = paramArrayOfObject[j];
        if (localObject == null)
        {
          paramArrayOfObject = new v("null cannot be cast to non-null type android.os.Bundle");
          AppMethodBeat.o(2835);
          throw paramArrayOfObject;
        }
        localBundle.putBundle(String.valueOf(j), (Bundle)localObject);
      }
      while (true)
      {
        j++;
        break;
        if ((paramArrayOfObject[j] instanceof Parcelable))
        {
          localObject = paramArrayOfObject[j];
          if (localObject == null)
          {
            paramArrayOfObject = new v("null cannot be cast to non-null type android.os.Parcelable");
            AppMethodBeat.o(2835);
            throw paramArrayOfObject;
          }
          localBundle.putParcelable(String.valueOf(j), (Parcelable)localObject);
        }
        else if ((paramArrayOfObject[j] instanceof ac.a))
        {
          localObject = paramArrayOfObject[j];
          if (localObject == null)
          {
            paramArrayOfObject = new v("null cannot be cast to non-null type com.tencent.mm.storage.ConstantsStorage.BusinessInfoKey");
            AppMethodBeat.o(2835);
            throw paramArrayOfObject;
          }
          ab.i("MicroMsg.EmojiCaptureProxy", "objectsToBundle: %s", new Object[] { Integer.valueOf(((ac.a)localObject).ordinal()) });
          localObject = paramArrayOfObject[j];
          if (localObject == null)
          {
            paramArrayOfObject = new v("null cannot be cast to non-null type com.tencent.mm.storage.ConstantsStorage.BusinessInfoKey");
            AppMethodBeat.o(2835);
            throw paramArrayOfObject;
          }
          localBundle.putInt(String.valueOf(j), ((ac.a)localObject).ordinal());
        }
        else
        {
          localObject = paramArrayOfObject[j];
          if (localObject == null)
          {
            paramArrayOfObject = new v("null cannot be cast to non-null type java.io.Serializable");
            AppMethodBeat.o(2835);
            throw paramArrayOfObject;
          }
          localBundle.putSerializable(String.valueOf(j), (Serializable)localObject);
        }
      }
    }
    AppMethodBeat.o(2835);
    return localBundle;
  }

  public final void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(2836);
    j.p(paramString, "methodName");
    j.p(paramBundle, "data");
    ab.i("MicroMsg.EmojiCaptureProxy", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject1 = null;
    try
    {
      Method[] arrayOfMethod = getClass().getMethods();
      int i = arrayOfMethod.length;
      int j = 0;
      Object localObject2 = localObject1;
      if (j < i)
      {
        localObject2 = arrayOfMethod[j];
        j.o(localObject2, "mth");
        if (!m.I(((Method)localObject2).getName(), paramString, true));
      }
      else
      {
        if (localObject2 == null)
          break label292;
        if (!paramBoolean)
          break label209;
        localObject1 = com.tencent.mm.remoteservice.e.class;
        label126: if (!((Method)localObject2).isAnnotationPresent((Class)localObject1))
          break label292;
        localObject1 = getArgs(paramBundle);
        localObject1 = ((Method)localObject2).invoke(this, Arrays.copyOf((Object[])localObject1, localObject1.length));
        if (!(j.j(((Method)localObject2).getReturnType(), Void.TYPE) ^ true))
          break label292;
        if (!(localObject1 instanceof Parcelable))
          break label217;
        paramBundle.putParcelable(this.RESULT_KEY, (Parcelable)localObject1);
        AppMethodBeat.o(2836);
      }
      while (true)
      {
        return;
        j++;
        break;
        label209: localObject1 = f.class;
        break label126;
        label217: if (j.j("getConfigStorage", paramString))
          ab.i("MicroMsg.EmojiCaptureProxy", "put result as Serializable: %s", new Object[] { (Serializable)localObject1 });
        paramBundle.putSerializable(this.RESULT_KEY, (Serializable)localObject1);
        AppMethodBeat.o(2836);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.EmojiCaptureProxy", "exception:%s", new Object[] { bo.l((Throwable)paramString) });
        label292: AppMethodBeat.o(2836);
      }
    }
  }

  public final void postUploadTask(String paramString1, String paramString2)
  {
    AppMethodBeat.i(2822);
    j.p(paramString1, "filePath");
    j.p(paramString2, "mixingMd5");
    ab.i("MicroMsg.EmojiCaptureProxy", "postUploadTask: " + paramString1 + ", " + paramString2);
    REMOTE_CALL("postUploadTaskRemote", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(2822);
  }

  @f
  public final void postUploadTaskRemote(String paramString1, String paramString2)
  {
    AppMethodBeat.i(2823);
    j.p(paramString1, "filePath");
    j.p(paramString2, "mixingMd5");
    ab.i("MicroMsg.EmojiCaptureProxy", "postUploadTaskRemote: " + paramString1 + ", " + paramString2);
    int i = (int)com.tencent.mm.vfs.e.asZ(paramString1);
    Object localObject = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
    j.o(localObject, "MMKernel.plugin(IPluginEmoji::class.java)");
    paramString2 = ((com.tencent.mm.plugin.emoji.b.d)localObject).getEmojiMgr().Jd(paramString2);
    if (paramString2 == null)
      AppMethodBeat.o(2823);
    while (true)
    {
      return;
      if (i <= 0)
      {
        paramString2.a(EmojiInfo.b.yaU);
        paramString2.a(EmojiInfo.a.yaE);
        paramString1 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
        j.o(paramString1, "MMKernel.plugin(IPluginEmoji::class.java)");
        ((com.tencent.mm.plugin.emoji.b.d)paramString1).getEmojiMgr().updateEmojiInfo(paramString2);
        EmojiCaptureReporter.h(paramString2.field_captureEnterTime, 4, paramString2.field_captureScene);
        AppMethodBeat.o(2823);
      }
      else
      {
        localObject = com.tencent.mm.vfs.e.atg(paramString1);
        String str = EmojiInfo.dvg() + (String)localObject;
        com.tencent.mm.vfs.e.aQ(paramString1, str);
        ab.i("MicroMsg.EmojiCaptureProxy", "upload file " + str + " length is " + i);
        paramString1 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
        j.o(paramString1, "MMKernel.plugin(IPluginEmoji::class.java)");
        paramString1 = ((com.tencent.mm.plugin.emoji.b.d)paramString1).getEmojiStorageMgr();
        j.o(paramString1, "MMKernel.plugin(IPluginE…ass.java).emojiStorageMgr");
        paramString1.aUp().aqj(paramString2.Aq());
        paramString2.vS((String)localObject);
        paramString2.a(EmojiInfo.a.yaF);
        paramString2.setSize((int)com.tencent.mm.vfs.e.asZ(str));
        if (r.amp(str))
          paramString2.field_wxamMd5 = ((String)localObject);
        paramString1 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
        j.o(paramString1, "MMKernel.plugin(IPluginEmoji::class.java)");
        paramString1 = ((com.tencent.mm.plugin.emoji.b.d)paramString1).getEmojiStorageMgr();
        j.o(paramString1, "MMKernel.plugin(IPluginE…ass.java).emojiStorageMgr");
        paramString1.aUp().E(paramString2);
        paramString1 = com.tencent.mm.emoji.d.d.eAh;
        com.tencent.mm.emoji.d.d.k(paramString2);
        AppMethodBeat.o(2823);
      }
    }
  }

  public final void showImitateDialog()
  {
    AppMethodBeat.i(2828);
    REMOTE_CALL("showImitateDialogRemote", new Object[0]);
    AppMethodBeat.o(2828);
  }

  @f
  public final void showImitateDialogRemote()
  {
    AppMethodBeat.i(2829);
    Object localObject = ah.getContext();
    j.o(localObject, "MMApplicationContext.getContext()");
    localObject = ((Context)localObject).getResources().getString(2131298894);
    new e.a(ah.getContext()).asL((String)localObject).Qg(2131298893).b((e.c)EmojiCaptureProxy.b.lkN).show();
    AppMethodBeat.o(2829);
  }

  public final void updateEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(2820);
    j.p(paramEmojiInfo, "emojiInfo");
    ab.i("MicroMsg.EmojiCaptureProxy", "updateEmojiInfo: " + paramEmojiInfo.Aq());
    Bundle localBundle = new Bundle();
    localBundle.setClassLoader(EmojiInfo.class.getClassLoader());
    localBundle.putParcelable("emoji", (Parcelable)paramEmojiInfo);
    REMOTE_CALL("updateEmojiInfoRemote", new Object[] { localBundle });
    AppMethodBeat.o(2820);
  }

  @f
  public final void updateEmojiInfoRemote(Bundle paramBundle)
  {
    AppMethodBeat.i(2821);
    j.p(paramBundle, "bundle");
    paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
    EmojiInfo localEmojiInfo = (EmojiInfo)paramBundle.getParcelable("emoji");
    StringBuilder localStringBuilder = new StringBuilder("updateEmojiInfoRemote: ");
    if (localEmojiInfo != null)
    {
      paramBundle = localEmojiInfo.Aq();
      ab.i("MicroMsg.EmojiCaptureProxy", paramBundle);
      if (localEmojiInfo == null)
        break label112;
      paramBundle = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
      j.o(paramBundle, "MMKernel.plugin(IPluginEmoji::class.java)");
      ((com.tencent.mm.plugin.emoji.b.d)paramBundle).getEmojiMgr().updateEmojiInfo(localEmojiInfo);
      AppMethodBeat.o(2821);
    }
    while (true)
    {
      return;
      paramBundle = null;
      break;
      label112: EmojiCaptureReporter.up(31);
      paramBundle = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bnn();
      AppMethodBeat.o(2821);
    }
  }

  public final boolean useCPUCrop()
  {
    AppMethodBeat.i(2824);
    ab.c("MicroMsg.EmojiCaptureProxy", "useCPUCrop", new Object[0]);
    Object localObject = REMOTE_CALL("checkUseCPUCrop", new Object[0]);
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type kotlin.Boolean");
      AppMethodBeat.o(2824);
      throw ((Throwable)localObject);
    }
    boolean bool = ((Boolean)localObject).booleanValue();
    AppMethodBeat.o(2824);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy
 * JD-Core Version:    0.6.2
 */