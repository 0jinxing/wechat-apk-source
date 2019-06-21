package com.tencent.mm.plugin.facedetect.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.facedetect.ui.FaceDetectPrepareUI;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public enum f
{
  private static al lTN;
  public FaceDetectProcessService lTM = null;

  static
  {
    AppMethodBeat.i(213);
    lTL = new f("INSTANCE");
    lTO = new f[] { lTL };
    lTN = new al("face_process");
    AppMethodBeat.o(213);
  }

  public static void V(Runnable paramRunnable)
  {
    AppMethodBeat.i(202);
    lTN.aa(paramRunnable);
    AppMethodBeat.o(202);
  }

  public static boolean a(Context paramContext, Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(208);
    ab.i("MicroMsg.FaceDetectManager", "start wx internal face verify");
    boolean bool;
    if ((paramContext == null) || (paramBundle == null))
    {
      bool = false;
      AppMethodBeat.o(208);
    }
    while (true)
    {
      return bool;
      Intent localIntent = new Intent(paramContext, FaceDetectPrepareUI.class);
      localIntent.putExtras(paramBundle);
      ((Activity)paramContext).startActivityForResult(localIntent, paramInt);
      bool = true;
      AppMethodBeat.o(208);
    }
  }

  public static ak bsA()
  {
    AppMethodBeat.i(204);
    ak localak = lTN.doN();
    AppMethodBeat.o(204);
    return localak;
  }

  public static boolean bsB()
  {
    AppMethodBeat.i(138376);
    boolean bool = p.bsN();
    AppMethodBeat.o(138376);
    return bool;
  }

  public static int bsE()
  {
    AppMethodBeat.i(211);
    int i = FaceProNative.engineVersion();
    AppMethodBeat.o(211);
    return i;
  }

  public static void bsz()
  {
    AppMethodBeat.i(203);
    lTN.doN().removeCallbacksAndMessages(null);
    AppMethodBeat.o(203);
  }

  static boolean dL(Context paramContext)
  {
    AppMethodBeat.i(207);
    boolean bool = paramContext.getPackageManager().hasSystemFeature("android.hardware.camera.front");
    AppMethodBeat.o(207);
    return bool;
  }

  public static boolean ha(boolean paramBoolean)
  {
    boolean bool1 = true;
    AppMethodBeat.i(205);
    ab.i("MicroMsg.FaceDetectManager", "alvinluo: face detect isCheckDynCfg: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    boolean bool2 = dL(ah.getContext());
    boolean bool3 = p.bsN();
    if (paramBoolean)
      if (bo.getInt(((a)com.tencent.mm.kernel.g.K(a.class)).Nu().getValue("BioSigFaceEntry"), 0) == 1)
      {
        paramBoolean = true;
        ab.i("MicroMsg.FaceDetectManager", "hy: face config support: %b, hardware support: %b, isModelFileValid: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
        if ((!paramBoolean) || (!(bool2 & bool3)))
          break label126;
        AppMethodBeat.o(205);
        paramBoolean = bool1;
      }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      break;
      label126: AppMethodBeat.o(205);
      paramBoolean = false;
      continue;
      ab.i("MicroMsg.FaceDetectManager", "hy: hardware support: %b, isModelFileValid: %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
      if ((bool3) && (bool2))
      {
        AppMethodBeat.o(205);
        paramBoolean = bool1;
      }
      else
      {
        AppMethodBeat.o(205);
        paramBoolean = false;
      }
    }
  }

  public final int bsC()
  {
    AppMethodBeat.i(209);
    g localg = this.lTM.lVR;
    int i;
    if (localg.lTP == null)
    {
      ab.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
      i = -3;
      AppMethodBeat.o(209);
    }
    while (true)
    {
      return i;
      i = localg.lTP.engineReleaseCurrMotion();
      AppMethodBeat.o(209);
    }
  }

  public final int bsD()
  {
    AppMethodBeat.i(210);
    g localg = this.lTM.lVR;
    int i;
    if (localg.lTP == null)
    {
      ab.e("MicroMsg.FaceDetectNativeManager", "hy: getCurrentMotion not init");
      i = -1;
      AppMethodBeat.o(210);
    }
    while (true)
    {
      return i;
      i = localg.lTP.engineGetCurrMotion();
      AppMethodBeat.o(210);
    }
  }

  public final int bsF()
  {
    AppMethodBeat.i(212);
    g localg = this.lTM.lVR;
    int i;
    if (localg.lTP == null)
    {
      ab.e("MicroMsg.FaceDetectNativeManager", "hy: startRecord not init");
      i = -1;
      AppMethodBeat.o(212);
    }
    while (true)
    {
      return i;
      i = localg.lTP.engineGroupChange();
      AppMethodBeat.o(212);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.f
 * JD-Core Version:    0.6.2
 */