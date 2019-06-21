package com.tinkerboots.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.tinker.lib.e.a.a;
import com.tencent.tinker.lib.service.AbstractResultService;
import com.tencent.tinker.lib.service.TinkerPatchService;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class a
{
  public static a ATQ;
  public final com.tencent.tinker.lib.e.a ATR;
  public final com.tinkerboots.sdk.a.a ATS;
  private final ApplicationLike cdV;

  public a(Context paramContext, ApplicationLike paramApplicationLike, com.tencent.tinker.lib.d.c paramc, com.tencent.tinker.lib.d.d paramd, com.tencent.tinker.lib.b.b paramb, com.tencent.tinker.lib.c.a parama, Class<? extends AbstractResultService> paramClass, com.tinkerboots.sdk.a.a.b paramb1)
  {
    AppMethodBeat.i(65520);
    com.tinkerboots.sdk.b.c.context = paramContext;
    this.cdV = paramApplicationLike;
    this.ATS = com.tinkerboots.sdk.a.a.a(paramb1);
    paramContext = new a.a(paramApplicationLike.getApplication());
    int i = paramApplicationLike.getTinkerFlags();
    if (paramContext.status != -1)
    {
      paramContext = new TinkerRuntimeException("tinkerFlag is already set.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    paramContext.status = i;
    if (paramc == null)
    {
      paramContext = new TinkerRuntimeException("loadReporter must not be null.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    if (paramContext.ABE != null)
    {
      paramContext = new TinkerRuntimeException("loadReporter is already set.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    paramContext.ABE = paramc;
    if (paramb == null)
    {
      paramContext = new TinkerRuntimeException("listener must not be null.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    if (paramContext.ABD != null)
    {
      paramContext = new TinkerRuntimeException("listener is already set.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    paramContext.ABD = paramb;
    if (paramd == null)
    {
      paramContext = new TinkerRuntimeException("patchReporter must not be null.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    if (paramContext.ABF != null)
    {
      paramContext = new TinkerRuntimeException("patchReporter is already set.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    paramContext.ABF = paramd;
    paramc = Boolean.valueOf(paramApplicationLike.getTinkerLoadVerifyFlag());
    if (paramc == null)
    {
      paramContext = new TinkerRuntimeException("tinkerLoadVerifyFlag must not be null.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    if (paramContext.ABN != null)
    {
      paramContext = new TinkerRuntimeException("tinkerLoadVerifyFlag is already set.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    paramContext.ABN = paramc;
    paramContext = paramContext.dSh();
    com.tencent.tinker.lib.e.a.a(paramContext);
    paramc = paramApplicationLike.getTinkerResultIntent();
    com.tencent.tinker.lib.e.a.ABB = true;
    TinkerPatchService.a(parama, paramClass);
    com.tencent.tinker.lib.util.a.i("Tinker.Tinker", "try to install tinker, isEnable: %b, version: %s", new Object[] { Boolean.valueOf(ShareTinkerInternals.Se(paramContext.tinkerFlags)), "1.9.10" });
    if (!ShareTinkerInternals.Se(paramContext.tinkerFlags))
    {
      com.tencent.tinker.lib.util.a.e("Tinker.Tinker", "tinker is disabled", new Object[0]);
      this.ATR = paramContext;
      AppMethodBeat.o(65520);
      return;
    }
    if (paramc == null)
    {
      paramContext = new TinkerRuntimeException("intentResult must not be null.");
      AppMethodBeat.o(65520);
      throw paramContext;
    }
    paramContext.ABJ = new com.tencent.tinker.lib.e.d();
    paramd = paramContext.ABJ;
    paramb = paramContext.context;
    paramApplicationLike = com.tencent.tinker.lib.e.a.iX(paramb);
    paramd.ACc = ShareIntentUtil.be(paramc);
    paramd.iBv = ShareIntentUtil.bf(paramc);
    paramd.ABS = ShareIntentUtil.w(paramc, "intent_patch_system_ota");
    paramd.ABP = ShareIntentUtil.n(paramc, "intent_patch_oat_dir");
    paramd.ABR = "interpet".equals(paramd.ABP);
    boolean bool1 = paramApplicationLike.rNw;
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerLoadResult", "parseTinkerResult loadCode:%d, process name:%s, main process:%b, systemOTA:%b, fingerPrint:%s, oatDir:%s, useInterpretMode:%b", new Object[] { Integer.valueOf(paramd.ACc), ShareTinkerInternals.aD(paramb), Boolean.valueOf(bool1), Boolean.valueOf(paramd.ABS), Build.FINGERPRINT, paramd.ABP, Boolean.valueOf(paramd.ABR) });
    paramb1 = ShareIntentUtil.n(paramc, "intent_patch_old_version");
    parama = ShareIntentUtil.n(paramc, "intent_patch_new_version");
    paramClass = paramApplicationLike.ABC;
    paramb = paramApplicationLike.ABG;
    label611: Object localObject;
    boolean bool2;
    if ((paramb1 != null) && (parama != null))
    {
      if (bool1)
      {
        paramd.ABO = parama;
        com.tencent.tinker.lib.util.a.i("Tinker.TinkerLoadResult", "parseTinkerResult oldVersion:%s, newVersion:%s, current:%s", new Object[] { paramb1, parama, paramd.ABO });
        localObject = SharePatchFileUtil.auq(paramd.ABO);
        if (!ShareTinkerInternals.isNullOrNil((String)localObject))
        {
          paramd.ABT = new File(paramClass.getAbsolutePath() + "/" + (String)localObject);
          paramd.ABU = new File(paramd.ABT.getAbsolutePath(), SharePatchFileUtil.aur(paramd.ABO));
          paramd.ABV = new File(paramd.ABT, "dex");
          paramd.ABW = new File(paramd.ABT, "lib");
          paramd.ABX = new File(paramd.ABT, "res");
          paramd.ABY = new File(paramd.ABX, "resources.apk");
        }
        paramd.patchInfo = new SharePatchInfo(paramb1, parama, false, Build.FINGERPRINT, paramd.ABP);
        if (paramb1.equals(parama))
          break label1008;
        bool2 = true;
        label846: paramd.ABQ = bool2;
      }
    }
    else
    {
      localObject = ShareIntentUtil.bg(paramc);
      if (localObject == null)
        break label1041;
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerLoadResult", "Tinker load have exception loadCode:%d", new Object[] { Integer.valueOf(paramd.ACc) });
      i = -1;
      switch (paramd.ACc)
      {
      default:
        label936: paramApplicationLike.ABE.a((Throwable)localObject, i);
      case -20:
      case -14:
      case -23:
      case -25:
      }
    }
    while (true)
    {
      paramContext.ABE.a(paramContext.ABC, paramContext.ABJ.ACc, paramContext.ABJ.iBv);
      if (paramContext.ABK)
        break;
      com.tencent.tinker.lib.util.a.w("Tinker.Tinker", "tinker load fail!", new Object[0]);
      break;
      paramd.ABO = paramb1;
      break label611;
      label1008: bool2 = false;
      break label846;
      i = -1;
      break label936;
      i = -2;
      break label936;
      i = -3;
      break label936;
      i = -4;
      break label936;
      label1041: switch (paramd.ACc)
      {
      default:
        break;
      case -10000:
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "can't get the right intent return code", new Object[0]);
        paramContext = new TinkerRuntimeException("can't get the right intent return code");
        AppMethodBeat.o(65520);
        throw paramContext;
      case -1:
        com.tencent.tinker.lib.util.a.w("Tinker.TinkerLoadResult", "tinker is disable, just return", new Object[0]);
        break;
      case -3:
      case -2:
        com.tencent.tinker.lib.util.a.w("Tinker.TinkerLoadResult", "can't find patch file, is ok, just return", new Object[0]);
        break;
      case -4:
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "path info corrupted", new Object[0]);
        paramApplicationLike.ABE.a(paramb1, parama, paramb);
        break;
      case -5:
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "path info blank, wait main process to restart", new Object[0]);
        break;
      case -6:
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch version directory not found, current version:%s", new Object[] { paramd.ABO });
        paramApplicationLike.ABE.a(paramd.ABT, 1, true);
        break;
      case -7:
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch version file not found, current version:%s", new Object[] { paramd.ABO });
        if (paramd.ABU == null)
        {
          paramContext = new TinkerRuntimeException("error load patch version file not exist, but file is null");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        paramApplicationLike.ABE.a(paramd.ABU, 1, false);
        break;
      case -8:
        com.tencent.tinker.lib.util.a.i("Tinker.TinkerLoadResult", "patch package check fail", new Object[0]);
        if (paramd.ABU == null)
        {
          paramContext = new TinkerRuntimeException("error patch package check fail , but file is null");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        i = paramc.getIntExtra("intent_patch_package_patch_check", -10000);
        paramApplicationLike.ABE.c(paramd.ABU, i);
        break;
      case -9:
        if (paramd.ABV != null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex file directory not found:%s", new Object[] { paramd.ABV.getAbsolutePath() });
          paramApplicationLike.ABE.a(paramd.ABV, 3, true);
        }
        else
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex file directory not found, warning why the path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch dex file directory not found, warning why the path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        break;
      case -10:
        paramc = ShareIntentUtil.n(paramc, "intent_patch_missing_dex_path");
        if (paramc != null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex file not found:%s", new Object[] { paramc });
          paramApplicationLike.ABE.a(new File(paramc), 3, false);
        }
        else
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex file not found, but path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch dex file not found, but path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        break;
      case -11:
        paramc = ShareIntentUtil.n(paramc, "intent_patch_missing_dex_path");
        if (paramc != null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex opt file not found:%s", new Object[] { paramc });
          paramApplicationLike.ABE.a(new File(paramc), 4, false);
        }
        else
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex opt file not found, but path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch dex opt file not found, but path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        break;
      case -17:
        if (paramd.ABT != null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch lib file directory not found:%s", new Object[] { paramd.ABW.getAbsolutePath() });
          paramApplicationLike.ABE.a(paramd.ABW, 5, true);
        }
        else
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch lib file directory not found, warning why the path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch lib file directory not found, warning why the path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        break;
      case -18:
        paramc = ShareIntentUtil.n(paramc, "intent_patch_missing_lib_path");
        if (paramc != null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch lib file not found:%s", new Object[] { paramc });
          paramApplicationLike.ABE.a(new File(paramc), 5, false);
        }
        else
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch lib file not found, but path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch lib file not found, but path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        break;
      case -12:
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex load fail, classloader is null", new Object[0]);
        break;
      case -13:
        paramc = ShareIntentUtil.n(paramc, "intent_patch_mismatch_dex_path");
        if (paramc == null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex file md5 is mismatch, but path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch dex file md5 is mismatch, but path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch dex file md5 is mismatch: %s", new Object[] { paramc });
        paramApplicationLike.ABE.b(new File(paramc), 3);
        break;
      case -19:
        com.tencent.tinker.lib.util.a.i("Tinker.TinkerLoadResult", "rewrite patch info file corrupted", new Object[0]);
        paramApplicationLike.ABE.a(paramb1, parama, paramb);
        break;
      case -21:
        if (paramd.ABT != null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch resource file directory not found:%s", new Object[] { paramd.ABX.getAbsolutePath() });
          paramApplicationLike.ABE.a(paramd.ABX, 6, true);
        }
        else
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch resource file directory not found, warning why the path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch resource file directory not found, warning why the path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        break;
      case -22:
        if (paramd.ABT != null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch resource file not found:%s", new Object[] { paramd.ABY.getAbsolutePath() });
          paramApplicationLike.ABE.a(paramd.ABY, 6, false);
        }
        else
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch resource file not found, warning why the path is null!!!!", new Object[0]);
          paramContext = new TinkerRuntimeException("patch resource file not found, warning why the path is null!!!!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        break;
      case -24:
        if (paramd.ABY == null)
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "resource file md5 mismatch, but patch resource file not found!", new Object[0]);
          paramContext = new TinkerRuntimeException("resource file md5 mismatch, but patch resource file not found!");
          AppMethodBeat.o(65520);
          throw paramContext;
        }
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerLoadResult", "patch resource file md5 is mismatch: %s", new Object[] { paramd.ABY.getAbsolutePath() });
        paramApplicationLike.ABE.b(paramd.ABY, 6);
        break;
      case -15:
        paramApplicationLike.ABE.b(1, ShareIntentUtil.bh(paramc));
        break;
      case -16:
        paramApplicationLike.ABE.b(2, ShareIntentUtil.bh(paramc));
        break;
      case 0:
        com.tencent.tinker.lib.util.a.i("Tinker.TinkerLoadResult", "oh yeah, tinker load all success", new Object[0]);
        paramApplicationLike.ABK = true;
        paramd.ABZ = ShareIntentUtil.bi(paramc);
        paramd.ACa = ShareIntentUtil.bj(paramc);
        paramd.ACb = ShareIntentUtil.bk(paramc);
        if (paramd.ABR)
          paramApplicationLike.ABE.b(0, null);
        if ((bool1) && (paramd.ABQ))
          paramApplicationLike.ABE.a(paramb1, parama, paramClass, paramd.ABT.getName());
        break;
      }
    }
  }

  public static a dWj()
  {
    AppMethodBeat.i(65521);
    if (ATQ == null)
    {
      localObject = new TinkerRuntimeException("you must init TinkerClient sdk first");
      AppMethodBeat.o(65521);
      throw ((Throwable)localObject);
    }
    Object localObject = ATQ;
    AppMethodBeat.o(65521);
    return localObject;
  }

  public final a SG(int paramInt)
  {
    AppMethodBeat.i(65524);
    a locala;
    if (this.ATS == null)
    {
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerClient", "setFetchPatchIntervalByHours, tinkerServerClient == null, just return", new Object[0]);
      locala = ATQ;
      AppMethodBeat.o(65524);
    }
    while (true)
    {
      return locala;
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerClient", "setFetchPatchIntervalByHours to %d hours", new Object[] { Integer.valueOf(paramInt) });
      this.ATS.SH(paramInt);
      locala = ATQ;
      AppMethodBeat.o(65524);
    }
  }

  public final a iN(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65523);
    if (this.ATS == null)
    {
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerClient", "setPatchCondition, tinkerServerClient == null, just return", new Object[0]);
      paramString1 = ATQ;
      AppMethodBeat.o(65523);
    }
    while (true)
    {
      return paramString1;
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerClient", "setPatchCondition %s with value %s", new Object[] { paramString1, paramString2 });
      this.ATS.iO(paramString1, paramString2);
      paramString1 = ATQ;
      AppMethodBeat.o(65523);
    }
  }

  public final a rF(boolean paramBoolean)
  {
    AppMethodBeat.i(65522);
    Object localObject;
    if ((this.ATS == null) || (this.ATR == null))
    {
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerClient", "fetchPatchUpdate, tinkerServerClient or tinkerClient is null, just return", new Object[0]);
      localObject = ATQ;
      AppMethodBeat.o(65522);
    }
    while (true)
    {
      return localObject;
      localObject = com.tinkerboots.sdk.b.c.getContext();
      if (!com.tinkerboots.sdk.b.b.jG((Context)localObject))
      {
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerClient", "fetchPatchUpdate, permission refuse, you must access INTERNET and ACCESS_NETWORK_STATE permission first", new Object[0]);
        localObject = ATQ;
        AppMethodBeat.o(65522);
      }
      else if ((!ShareTinkerInternals.Se(this.ATR.tinkerFlags)) || (!ShareTinkerInternals.jn((Context)localObject)))
      {
        com.tencent.tinker.lib.util.a.e("Tinker.TinkerClient", "fetchPatchUpdate, tinker is disable, just return", new Object[0]);
        localObject = ATQ;
        AppMethodBeat.o(65522);
      }
      else
      {
        if (this.ATR.rNw)
        {
          Looper.getMainLooper();
          Looper.myQueue().addIdleHandler(new a.1(this, paramBoolean));
        }
        localObject = ATQ;
        AppMethodBeat.o(65522);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tinkerboots.sdk.a
 * JD-Core Version:    0.6.2
 */