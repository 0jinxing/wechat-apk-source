package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.hp.b.b;
import com.tencent.mm.plugin.hp.b.b.a;
import com.tencent.mm.plugin.hp.b.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.tinker.lib.e.d;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;
import java.util.HashMap;

public final class c extends com.tencent.tinker.lib.d.a
{
  public c(Context paramContext)
  {
    super(paramContext);
  }

  private void bGp()
  {
    AppMethodBeat.i(90641);
    new a(this.context, new c.1(this));
    AppMethodBeat.o(90641);
  }

  public final void a(File paramFile, int paramInt, long paramLong)
  {
    AppMethodBeat.i(90639);
    super.a(paramFile, paramInt, paramLong);
    switch (paramInt)
    {
    default:
      if (!com.tencent.tinker.lib.e.a.iX(this.context).rNw)
      {
        com.tencent.tinker.lib.util.a.w("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad retry is not main process, just return", new Object[0]);
        label56: ab.d("Tinker.TinkerPatchLoadReporter", "onLoadResult loadcode:%d icost:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
        if (paramInt == 0)
        {
          localObject1 = com.tencent.tinker.lib.e.a.iX(this.context).ABJ;
          ab.i("Tinker.TinkerPatchLoadReporter", "onLoadResult currentVersion:%s", new Object[] { ((d)localObject1).ABO });
          if (!TextUtils.isEmpty(((d)localObject1).ABO))
          {
            paramFile = this.context;
            localObject1 = ((d)localObject1).ABO;
            paramFile.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", (String)localObject1).apply();
          }
        }
        Object localObject2 = com.tencent.tinker.lib.e.a.iX(this.context);
        if ((((com.tencent.tinker.lib.e.a)localObject2).ABJ == null) || (((com.tencent.tinker.lib.e.a)localObject2).ABJ.ACb == null))
          break label375;
        paramFile = f.CLIENT_VERSION;
        Object localObject1 = (String)((com.tencent.tinker.lib.e.a)localObject2).ABJ.ACb.get("patch.client.ver");
        localObject2 = (String)((com.tencent.tinker.lib.e.a)localObject2).ABJ.ACb.get("NEW_TINKER_ID");
        int i = b.b.nty.value;
        if (paramInt != 0)
          break label365;
        paramInt = b.a.ntv.value;
        label252: b.e(paramFile, (String)localObject1, (String)localObject2, i, paramInt);
        AppMethodBeat.o(90639);
      }
      break;
    case 0:
    }
    while (true)
    {
      return;
      b.s(paramLong, com.tencent.tinker.lib.e.a.iX(this.context).rNw);
      break;
      paramFile = new File(SharePatchFileUtil.ji(this.context), "temp.apk").getAbsolutePath();
      if ((paramFile == null) || (!new File(paramFile).exists()))
      {
        com.tencent.tinker.lib.util.a.w("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad patch file: %s is not exist, just return", new Object[] { paramFile });
        break label56;
      }
      new a(this.context, new c.2(this));
      break label56;
      label365: paramInt = b.a.ntu.value;
      break label252;
      label375: ab.i("Tinker.TinkerPatchLoadReporter", "patchCheck properties is null.");
      AppMethodBeat.o(90639);
    }
  }

  public final void a(File paramFile, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(90634);
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType:%d, isDirectory:%b", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramInt == 4)
      bGp();
    while (true)
    {
      if (paramInt == 1)
      {
        paramFile = com.tencent.tinker.lib.e.a.iX(this.context).ABJ;
        if ((paramFile.ABO != null) && ("00000000000000000000000000000000".equals(paramFile.ABO)))
        {
          com.tencent.tinker.lib.util.a.e("Tinker.TinkerPatchLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
          ShareTinkerInternals.jr(this.context);
        }
      }
      b.xc(paramInt);
      AppMethodBeat.o(90634);
      return;
      dSf();
    }
  }

  public final void a(String paramString1, String paramString2, File paramFile)
  {
    AppMethodBeat.i(90637);
    super.a(paramString1, paramString2, paramFile);
    b.bGi();
    AppMethodBeat.o(90637);
  }

  public final void a(String paramString1, String paramString2, File paramFile, String paramString3)
  {
    AppMethodBeat.i(90638);
    super.a(paramString1, paramString2, paramFile, paramString3);
    b.bGj();
    AppMethodBeat.o(90638);
  }

  public final void a(Throwable paramThrowable, int paramInt)
  {
    AppMethodBeat.i(90632);
    super.a(paramThrowable, paramInt);
    b.a(paramThrowable, paramInt);
    AppMethodBeat.o(90632);
  }

  public final void b(int paramInt, Throwable paramThrowable)
  {
    AppMethodBeat.i(90635);
    com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", new Object[] { Integer.valueOf(paramInt), paramThrowable });
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      bGp();
      b.a(paramInt, paramThrowable);
      AppMethodBeat.o(90635);
      return;
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file", new Object[0]);
      continue;
      com.tencent.tinker.lib.util.a.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error", new Object[0]);
      continue;
      com.tencent.tinker.lib.util.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret ok", new Object[0]);
    }
  }

  public final void b(File paramFile, int paramInt)
  {
    AppMethodBeat.i(90633);
    super.b(paramFile, paramInt);
    b.xd(paramInt);
    AppMethodBeat.o(90633);
  }

  public final void c(File paramFile, int paramInt)
  {
    AppMethodBeat.i(90636);
    super.c(paramFile, paramInt);
    b.t(ah.xzd, paramInt);
    AppMethodBeat.o(90636);
  }

  public final void d(File paramFile, int paramInt)
  {
    AppMethodBeat.i(90640);
    super.d(paramFile, paramInt);
    if ((paramInt == -26) || (paramInt == -5))
    {
      ShareTinkerInternals.jm(this.context);
      com.tencent.tinker.lib.e.a.iX(this.context).tinkerFlags = 0;
    }
    b.wZ(paramInt);
    AppMethodBeat.o(90640);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.tinker.c
 * JD-Core Version:    0.6.2
 */