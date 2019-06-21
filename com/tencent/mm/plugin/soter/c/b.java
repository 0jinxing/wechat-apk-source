package com.tencent.mm.plugin.soter.c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AlertController;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.soter.d.j;
import com.tencent.mm.plugin.soter.d.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.soter.a.g.b.a;
import java.lang.ref.WeakReference;

public final class b extends c
{
  TextView iqw;
  Handler mMainHandler;
  com.tencent.soter.a.d.a mrV;
  boolean rNN;
  android.support.v7.app.b rNO;
  ImageView rNP;
  private final int rNQ;
  private int rNR;
  private final long rNS;
  Animation rNT;
  Animation rNU;
  Runnable rNV;

  public b(WeakReference<Activity> paramWeakReference, j paramj, k paramk, Handler paramHandler)
  {
    super(paramWeakReference, paramj, paramk, paramHandler);
    AppMethodBeat.i(73881);
    this.rNN = false;
    this.mrV = null;
    this.rNO = null;
    this.rNP = null;
    this.iqw = null;
    this.rNQ = 3;
    this.rNR = 0;
    this.rNS = 500L;
    this.rNT = null;
    this.rNU = null;
    this.mMainHandler = new Handler(Looper.getMainLooper());
    this.rNV = new b.9(this);
    AppMethodBeat.o(73881);
  }

  private boolean cvG()
  {
    AppMethodBeat.i(73883);
    cvI();
    ab.i("MicroMsg.SoterControllerFingerprint", "hy: auth key not valid or auth key not valid");
    b.1 local1 = new b.1(this);
    ab.i("MicroMsg.SoterControllerFingerprint", "hy:mscene:" + this.gOW);
    com.tencent.soter.a.a.a(local1, false, this.gOW, this.rOc, this.rOd);
    AppMethodBeat.o(73883);
    return false;
  }

  private void cvH()
  {
    AppMethodBeat.i(73885);
    this.mrV = new com.tencent.soter.a.d.a();
    b.3 local3 = new b.3(this);
    b.4 local4 = new b.4(this);
    b.a locala = new b.a().Rj(this.gOW).iW(ah.getContext()).a(this.mrV).aug(this.rOa.msn);
    locala.Awk.Awg = null;
    com.tencent.soter.a.a.a(local3, locala.a(local4).Awk);
    AppMethodBeat.o(73885);
  }

  public static Animation eS(Context paramContext)
  {
    AppMethodBeat.i(73888);
    if (paramContext == null)
    {
      ab.e("MicroMsg.SoterControllerFingerprint", "hy: context is null.");
      paramContext = null;
      AppMethodBeat.o(73888);
    }
    while (true)
    {
      return paramContext;
      paramContext = AnimationUtils.loadAnimation(paramContext, 2131034129);
      if (-1L > 0L)
        paramContext.setDuration(-1L);
      paramContext.setInterpolator(new DecelerateInterpolator());
      AppMethodBeat.o(73888);
    }
  }

  @TargetApi(23)
  public final void fj()
  {
    AppMethodBeat.i(73882);
    if (!com.tencent.soter.core.a.iR(ah.getContext()))
    {
      this.rOb.errCode = 90011;
      this.rOb.aIm = "no fingerprint enrolled";
      cvM();
    }
    try
    {
      if (ah.getContext().checkSelfPermission("android.permission.USE_FINGERPRINT") != 0)
      {
        G(new String[] { "android.permission.USE_FINGERPRINT" });
        AppMethodBeat.o(73882);
      }
      while (true)
      {
        return;
        this.rNN = true;
        AppMethodBeat.o(73882);
      }
    }
    catch (NoSuchMethodError localNoSuchMethodError)
    {
      while (true)
      {
        ab.i("MicroMsg.SoterControllerFingerprint", "hy: not implements the checkSelfPermission. permission already given");
        this.rNN = true;
        AppMethodBeat.o(73882);
      }
    }
  }

  @TargetApi(16)
  public final void onPause()
  {
    AppMethodBeat.i(73887);
    if ((this.rNN) && (this.mrV != null))
      this.mrV.rr(true);
    if ((this.rNO != null) && (this.rNO.isShowing()))
      this.rNO.dismiss();
    AppMethodBeat.o(73887);
  }

  public final void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(73884);
    if (paramInt == 0)
      if ((paramArrayOfString.length > 0) && (paramArrayOfInt.length > 0) && ("android.permission.USE_FINGERPRINT".equals(paramArrayOfString[0])) && (paramArrayOfInt[0] == 0))
      {
        ab.i("MicroMsg.SoterControllerFingerprint", "hy: permission granted");
        cvG();
        this.rNN = true;
        AppMethodBeat.o(73884);
      }
    while (true)
    {
      return;
      ab.w("MicroMsg.SoterControllerFingerprint", "hy: permission not granted");
      this.rOb.errCode = 90002;
      this.rOb.aIm = "user not grant to use fingerprint";
      cvM();
      AppMethodBeat.o(73884);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(73886);
    if (this.rNN)
      cvG();
    AppMethodBeat.o(73886);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.c.b
 * JD-Core Version:    0.6.2
 */