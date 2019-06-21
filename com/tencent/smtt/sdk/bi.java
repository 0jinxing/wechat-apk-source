package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;
import com.tencent.smtt.export.external.libwebp;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.b;
import com.tencent.smtt.utils.t;
import java.util.Map;

class bi
{
  private Context a;
  private Context b;
  private String c;
  private String[] d;
  private DexLoader e;
  private String f;
  private String g;

  public bi(Context paramContext1, Context paramContext2, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, am paramam)
  {
    AppMethodBeat.i(64641);
    this.a = null;
    this.b = null;
    this.c = null;
    this.d = null;
    this.e = null;
    this.f = "TbsDexOpt";
    this.g = null;
    TbsLog.i("TbsWizard", "construction start...");
    if ((paramContext1 == null) || ((paramContext2 == null) && (TbsShareManager.getHostCorePathAppDefined() == null)) || (TextUtils.isEmpty(paramString1)) || (paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramContext1 = new Exception("TbsWizard paramter error:-1callerContext:" + paramContext1 + "hostcontext" + paramContext2 + "isEmpty" + TextUtils.isEmpty(paramString1) + "dexfileList" + paramArrayOfString);
      AppMethodBeat.o(64641);
      throw paramContext1;
    }
    this.a = paramContext1.getApplicationContext();
    if (paramContext2.getApplicationContext() != null);
    for (this.b = paramContext2.getApplicationContext(); ; this.b = paramContext2)
    {
      this.c = paramString1;
      this.d = paramArrayOfString;
      this.f = paramString2;
      if (paramam != null)
        paramam.a("load_tbs_dex", (byte)1);
      for (i = 0; i < this.d.length; i++)
        TbsLog.i("TbsWizard", "#2 mDexFileList[" + i + "]: " + this.d[i]);
    }
    TbsLog.i("TbsWizard", "new DexLoader #2 libraryPath is " + paramString3 + " mCallerAppContext is " + this.a + " dexOutPutDir is " + paramString2);
    this.e = new DexLoader(paramString3, this.a, this.d, paramString2, QbSdk.n);
    System.currentTimeMillis();
    a(paramContext1);
    if (paramam != null)
      paramam.a("load_tbs_dex", (byte)2);
    libwebp.loadWepLibraryIfNeed(paramContext2, this.c);
    if ("com.nd.android.pandahome2".equals(this.a.getApplicationInfo().packageName))
    {
      paramContext2 = this.e;
      paramString1 = this.a;
      paramContext2.invokeStaticMethod("com.tencent.tbs.common.beacon.X5CoreBeaconUploader", "getInstance", new Class[] { Context.class }, new Object[] { paramString1 });
    }
    if (QbSdk.n != null)
    {
      paramContext2 = this.e;
      paramString1 = QbSdk.n;
      paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[] { Map.class }, new Object[] { paramString1 });
    }
    if (paramam != null)
      paramam.a("init_tbs", (byte)1);
    int i = b(paramContext1);
    if (paramam != null)
      paramam.a("init_tbs", (byte)2);
    if (i < 0)
    {
      paramContext1 = new Exception("TbsWizard init error: " + i + "; msg: " + this.g);
      AppMethodBeat.o(64641);
      throw paramContext1;
    }
    TbsLog.i("TbsWizard", "construction end...");
    AppMethodBeat.o(64641);
  }

  private int b(Context paramContext)
  {
    AppMethodBeat.i(64644);
    Object localObject1 = this.e;
    Object localObject2 = b.a;
    Object localObject3 = b.b;
    Object localObject4 = b.c;
    Object localObject5 = b.d;
    ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "putInfo", new Class[] { Context.class, String.class, String.class, String.class, String.class }, new Object[] { paramContext, localObject2, localObject3, localObject4, localObject5 });
    Object localObject6;
    Object localObject7;
    int i;
    if ((this.b == null) && (TbsShareManager.getHostCorePathAppDefined() != null))
    {
      localObject2 = this.e;
      Class localClass = Integer.TYPE;
      localObject5 = this.b;
      localObject6 = this.e;
      localObject3 = this.c;
      localObject1 = this.f;
      localObject7 = QbSdk.a();
      localObject4 = TbsShareManager.getHostCorePathAppDefined();
      localObject4 = ((DexLoader)localObject2).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, localClass, String.class, String.class }, new Object[] { paramContext, localObject5, localObject6, localObject3, localObject1, "4.3.0.1057", Integer.valueOf(43644), localObject7, localObject4 });
      localObject2 = localObject4;
      if (localObject4 == null)
      {
        c();
        d();
        localObject1 = this.e;
        localObject2 = this.b;
        localObject3 = this.e;
        localObject5 = this.c;
        localObject4 = this.f;
        localObject2 = ((DexLoader)localObject1).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class }, new Object[] { paramContext, localObject2, localObject3, localObject5, localObject4 });
      }
      if (localObject2 != null)
        break label708;
      i = -3;
      label384: if (i >= 0)
        break label765;
      localObject4 = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "getLoadFailureDetails", new Class[0], new Object[0]);
      if ((localObject4 instanceof Throwable))
      {
        paramContext = (Throwable)localObject4;
        this.g = ("#" + paramContext.getMessage() + "; cause: " + paramContext.getCause() + "; th: " + paramContext);
      }
      if (!(localObject4 instanceof String));
    }
    label708: label765: for (this.g = ((String)localObject4); ; this.g = null)
    {
      AppMethodBeat.o(64644);
      return i;
      TbsLog.i("TbsWizard", "initTesRuntimeEnvironment callerContext is " + paramContext + " mHostContext is " + this.b + " mDexLoader is " + this.e + " mtbsInstallLocation is " + this.c + " mDexOptPath is " + this.f);
      localObject4 = this.e;
      localObject6 = Integer.TYPE;
      localObject1 = this.b;
      localObject7 = this.e;
      localObject3 = this.c;
      localObject5 = this.f;
      localObject2 = QbSdk.a();
      localObject4 = ((DexLoader)localObject4).invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTesRuntimeEnvironment", new Class[] { Context.class, Context.class, DexLoader.class, String.class, String.class, String.class, localObject6, String.class }, new Object[] { paramContext, localObject1, localObject7, localObject3, localObject5, "4.3.0.1057", Integer.valueOf(43644), localObject2 });
      break;
      if ((localObject2 instanceof Integer))
      {
        i = ((Integer)localObject2).intValue();
        break label384;
      }
      if ((localObject2 instanceof Throwable))
      {
        TbsCoreLoadStat.getInstance().a(this.a, 328, (Throwable)localObject2);
        i = -5;
        break label384;
      }
      i = -4;
      break label384;
    }
  }

  private void c()
  {
    AppMethodBeat.i(64645);
    this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "setTesSdkVersionName", new Class[] { String.class }, new Object[] { "4.3.0.1057" });
    AppMethodBeat.o(64645);
  }

  private void d()
  {
    AppMethodBeat.i(64646);
    this.e.setStaticField("com.tencent.tbs.tbsshell.TBSShell", "VERSION", Integer.valueOf(43644));
    AppMethodBeat.o(64646);
  }

  public String a()
  {
    String str = null;
    AppMethodBeat.i(64647);
    DexLoader localDexLoader = this.e;
    Object localObject1 = Boolean.TYPE;
    Object localObject2 = Boolean.TRUE;
    localObject1 = localDexLoader.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "invokeStaticMethod", new Class[] { localObject1, String.class, String.class, [Ljava.lang.Class.class, [Ljava.lang.Object.class }, new Object[] { localObject2, "com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0] });
    localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = this.e.invokeStaticMethod("com.tencent.smtt.util.CrashTracker", "getCrashExtraInfo", null, new Object[0]);
    if (localObject2 != null)
    {
      str = String.valueOf(localObject2);
      str = str + " ReaderPackName=" + TbsReaderView.gReaderPackName + " ReaderPackVersion=" + TbsReaderView.gReaderPackVersion;
    }
    if (str == null)
    {
      str = "X5 core get nothing...";
      AppMethodBeat.o(64647);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(64647);
    }
  }

  void a(Context paramContext)
  {
    AppMethodBeat.i(64642);
    if (Build.VERSION.SDK_INT != 21)
    {
      AppMethodBeat.o(64642);
      return;
    }
    Object localObject = QbSdk.n;
    if (localObject != null)
    {
      localObject = ((Map)localObject).get("check_tbs_validity");
      if (!(localObject instanceof Boolean));
    }
    for (boolean bool = ((Boolean)localObject).booleanValue(); ; bool = false)
    {
      if (bool)
        t.a(paramContext);
      AppMethodBeat.o(64642);
      break;
    }
  }

  public void a(Context paramContext1, Context paramContext2, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, am paramam)
  {
    AppMethodBeat.i(64643);
    this.a = paramContext1.getApplicationContext();
    if (this.b.getApplicationContext() != null)
      this.b = this.b.getApplicationContext();
    this.c = paramString1;
    this.d = paramArrayOfString;
    this.f = paramString2;
    libwebp.loadWepLibraryIfNeed(paramContext2, this.c);
    if (QbSdk.n != null)
    {
      paramContext2 = this.e;
      paramString1 = QbSdk.n;
      paramContext2.invokeStaticMethod("com.tencent.tbs.tbsshell.TBSShell", "initTbsSettings", new Class[] { Map.class }, new Object[] { paramString1 });
    }
    int i = b(paramContext1);
    if (i < 0)
    {
      paramContext1 = new Exception("continueInit init error: " + i + "; msg: " + this.g);
      AppMethodBeat.o(64643);
      throw paramContext1;
    }
    AppMethodBeat.o(64643);
  }

  public boolean a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(64648);
    paramContext = this.e.invokeStaticMethod("com.tencent.tbs.tbsshell.WebCoreProxy", "installLocalQbApk", new Class[] { Context.class, String.class, String.class, Bundle.class }, new Object[] { paramContext, paramString1, paramString2, paramBundle });
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(64648);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramContext).booleanValue();
      AppMethodBeat.o(64648);
    }
  }

  public DexLoader b()
  {
    return this.e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bi
 * JD-Core Version:    0.6.2
 */