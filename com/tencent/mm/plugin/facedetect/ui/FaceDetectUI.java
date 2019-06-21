package com.tencent.mm.plugin.facedetect.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.FaceProNative;
import com.tencent.mm.plugin.facedetect.d.b.b;
import com.tencent.mm.plugin.facedetect.d.b.c;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.g;
import com.tencent.mm.plugin.facedetect.model.h;
import com.tencent.mm.plugin.facedetect.model.h.a;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService;
import com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView;
import com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView.b;
import com.tencent.mm.plugin.facedetect.views.FaceDetectView;
import com.tencent.mm.plugin.facedetect.views.FaceDetectView.4;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect;
import com.tencent.mm.plugin.facedetect.views.FaceScanRect.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class FaceDetectUI extends MMActivity
  implements com.tencent.mm.plugin.facedetect.c.f, com.tencent.mm.plugin.facedetect.views.a
{
  private String edV = null;
  private int lSf = -1;
  private com.tencent.mm.plugin.facedetect.c.a lWT = null;
  private a lWU = null;
  private FaceTutorial lWV = null;
  private FaceDetectUI.b lXA = null;
  private boolean lXB = false;
  private boolean lXC = false;
  private View lXD = null;
  private RelativeLayout lXE;
  FaceDetectView lXF = null;
  FaceScanRect lXG = null;
  private TextView lXH = null;
  private Button lXI = null;
  private FaceDetectProcessService lXJ = null;
  private ServiceConnection lXK = null;
  private boolean lXL = false;
  private boolean lXM = false;
  private com.tencent.mm.plugin.facedetect.views.c lXN = null;
  private String lXd;
  h lXz = null;
  boolean lsZ = false;
  private PowerManager.WakeLock wakeLock = null;

  private void boF()
  {
    AppMethodBeat.i(474);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo unbindService, mBound: %b", new Object[] { Boolean.valueOf(this.lXL) });
    if (this.lXL)
    {
      ab.i("MicroMsg.FaceDetectUI", "alvinluo unbindService");
      com.tencent.mm.bp.d.a(this.lXK, "tools");
      this.lXL = false;
    }
    AppMethodBeat.o(474);
  }

  private void bth()
  {
    AppMethodBeat.i(488);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo onUserCancel");
    b.b localb = this.lXF.getCurrentMotionCancelInfo();
    a(1, localb.errCode, localb.aIm, null);
    AppMethodBeat.o(488);
  }

  private void btr()
  {
    AppMethodBeat.i(482);
    this.lsZ = false;
    this.lXF.hc(false);
    ab.i("MicroMsg.FaceDetectUI", "hy: stopped scan");
    AppMethodBeat.o(482);
  }

  private void bts()
  {
    AppMethodBeat.i(483);
    btr();
    stopPreview();
    AppMethodBeat.o(483);
  }

  private void f(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(489);
    setResult(-1, g(paramInt1, paramInt2, paramString, paramBundle));
    AppMethodBeat.o(489);
  }

  private static Intent g(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(490);
    Bundle localBundle = new Bundle();
    localBundle.putInt("err_type", paramInt1);
    localBundle.putInt("err_code", paramInt2);
    localBundle.putString("err_msg", paramString);
    if (paramBundle != null)
      localBundle.putAll(paramBundle);
    paramString = new Intent();
    paramString.putExtras(localBundle);
    AppMethodBeat.o(490);
    return paramString;
  }

  private void stopPreview()
  {
    AppMethodBeat.i(481);
    this.lXB = false;
    this.lXF.maA.mae.stopPreview();
    ab.i("MicroMsg.FaceDetectUI", "hy: stopped preview");
    AppMethodBeat.o(481);
  }

  private void t(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(485);
    ab.i("MicroMsg.FaceDetectUI", "onProcessingError errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(4), Integer.valueOf(paramInt), paramString1 });
    Bundle localBundle = new Bundle();
    localBundle.putString("show_err_msg", paramString2);
    bts();
    a(4, paramInt, paramString1, localBundle);
    AppMethodBeat.o(485);
  }

  public final void T(int paramInt, final String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(486);
    ab.i("MicroMsg.FaceDetectUI", "hy: face detect result: %d", new Object[] { Integer.valueOf(paramInt) });
    if (FaceCharacteristicsResult.vi(paramInt))
      if (paramInt == 3)
      {
        t(90017, "face detect time out", paramString);
        AppMethodBeat.o(486);
      }
    while (true)
    {
      return;
      if ((paramInt == 6) || (paramInt == 5))
      {
        t(90023, "face track failed or not stable", paramString);
        AppMethodBeat.o(486);
      }
      else if (paramInt == 7)
      {
        t(90009, "audio permission not granted", ah.getContext().getString(2131301928));
        AppMethodBeat.o(486);
      }
      else
      {
        t(90018, "system error", paramString);
        AppMethodBeat.o(486);
        continue;
        paramString = this.lXz;
        if (paramString.lfO >= paramString.lTR - 1)
        {
          paramInt = 1;
          label162: if (paramInt == 0)
            break label255;
          ab.i("MicroMsg.FaceDetectUI", "hy: collect data ok");
          this.lXF.hc(true);
          paramString = this.lXF.getPreviewBm();
          if (paramString != null)
            break label250;
        }
        while (true)
        {
          ab.i("MicroMsg.FaceDetectUI", "alvinluo bitmap == null: %b", new Object[] { Boolean.valueOf(bool) });
          com.tencent.mm.sdk.g.d.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(468);
              ah.getContext();
              p.n(FaceDetectUI.i(FaceDetectUI.this), paramString);
              al.d(new FaceDetectUI.8.1(this));
              AppMethodBeat.o(468);
            }
          }
          , "save_face_bitmap");
          AppMethodBeat.o(486);
          break;
          paramInt = 0;
          break label162;
          label250: bool = false;
        }
        label255: paramString = this.lXz;
        g localg = com.tencent.mm.plugin.facedetect.model.f.lTL.lTM.lVR;
        if (localg.lTP == null)
          ab.e("MicroMsg.FaceDetectNativeManager", "hy: move to next motion no instance");
        while (true)
        {
          paramString.lfO += 1;
          paramInt = h.bsI().type;
          ab.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", new Object[] { Integer.valueOf(paramInt) });
          if (!h.bsI().lTY)
            break label378;
          this.lXG.b(new FaceDetectUI.10(this));
          AppMethodBeat.o(486);
          break;
          ab.i("MicroMsg.FaceDetectNativeManager", "hy: start move next motion");
          localg.lTP.engineNextMotion();
        }
        label378: ab.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", new Object[] { Integer.valueOf(paramInt) });
        btq();
        AppMethodBeat.o(486);
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(479);
    ab.i("MicroMsg.FaceDetectUI", "finishWithResult errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) && (paramInt2 != 0) && (com.tencent.mm.plugin.facedetect.e.a.btw().isStarted()) && (com.tencent.mm.plugin.facedetect.e.a.btw().lZc))
      com.tencent.mm.plugin.facedetect.e.a.btw().bty();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("key_parcelable_reporter", FaceDetectReporter.bsJ());
    if (paramBundle != null)
      localBundle.putAll(paramBundle);
    f(paramInt1, paramInt2, paramString, localBundle);
    finish();
    AppMethodBeat.o(479);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, c paramc)
  {
    AppMethodBeat.i(484);
    if (paramBoolean1)
      bts();
    if (paramBoolean2)
    {
      ab.i("MicroMsg.FaceDetectUI", "hy: need blur");
      com.tencent.mm.sdk.g.d.post(new FaceDetectUI.7(this, this.lXF.getPreviewBm()), "FaceDetectUI_BlurBgMap");
    }
    this.lWU.a(paramc);
    AppMethodBeat.o(484);
  }

  public final void bsk()
  {
    AppMethodBeat.i(477);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo startFaceDetect ");
    Object localObject = getWindow().getAttributes();
    if (((WindowManager.LayoutParams)localObject).screenBrightness < 0.9F)
    {
      ((WindowManager.LayoutParams)localObject).screenBrightness = 0.9F;
      getWindow().setAttributes((WindowManager.LayoutParams)localObject);
    }
    this.lXG.mbN = FaceScanRect.a.mbQ;
    FaceScanRect localFaceScanRect = this.lXG;
    if (localFaceScanRect.mbN == FaceScanRect.a.mbO)
      ab.w("MicroMsg.FaceScanRect", "hy: already opened");
    while (true)
    {
      this.lXF.maB.mau = false;
      this.lXG.setVisibility(0);
      ab.d("MicroMsg.FaceDetectUI", "alvinluo %d, %d, %d, %d", new Object[] { Integer.valueOf(this.lXG.getTop()), Integer.valueOf(this.lXG.getRight()), Integer.valueOf(this.lXG.getLeft()), Integer.valueOf(this.lXG.getBottom()) });
      this.lXB = true;
      this.lsZ = false;
      this.lXA.reset();
      FaceDetectView localFaceDetectView;
      if (this.lXB)
      {
        this.lXN = new FaceDetectUI.5(this);
        ab.i("MicroMsg.FaceDetectUI", "hy: start preview");
        localObject = this.lXN;
        localFaceDetectView = this.lXF;
        localFaceDetectView.maA.a(new FaceDetectView.4(localFaceDetectView, (com.tencent.mm.plugin.facedetect.views.c)localObject));
      }
      AppMethodBeat.o(477);
      return;
      localFaceScanRect.mbM.setVisibility(0);
      localFaceScanRect.mbv.setBackgroundResource(2130838672);
      localFaceScanRect.mbM.startAnimation(localFaceScanRect.mbJ);
      for (localFaceDetectView : localFaceScanRect.mbE)
      {
        localFaceDetectView.clearAnimation();
        localFaceDetectView.setBackgroundColor(localFaceScanRect.getResources().getColor(2131690691));
      }
      localFaceScanRect.mbN = FaceScanRect.a.mbO;
    }
  }

  public final void bsm()
  {
    AppMethodBeat.i(478);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo releaseFaceDetect");
    if (!this.lXC)
    {
      this.lXN = null;
      this.lXC = true;
      if (this.lXA.lXV)
      {
        bts();
        this.lXF.maA.mae.btG();
      }
      if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
      {
        this.wakeLock.release();
        this.wakeLock = null;
      }
      com.tencent.mm.sdk.g.d.post(new FaceDetectUI.2(this), "Face_active_gc");
    }
    boF();
    AppMethodBeat.o(478);
  }

  public final void bsp()
  {
  }

  final void btq()
  {
    AppMethodBeat.i(480);
    FaceDetectView localFaceDetectView;
    Rect localRect;
    h.a locala;
    if (this.lsZ)
    {
      ab.i("MicroMsg.FaceDetectUI", "hy: start capture face");
      localFaceDetectView = this.lXF;
      localRect = new Rect(this.lXG.getLeft(), this.lXG.getTop(), this.lXG.getRight(), this.lXG.getBottom());
      locala = h.bsI();
      if (locala.type == 100)
        AppMethodBeat.o(480);
    }
    while (true)
    {
      return;
      if (localFaceDetectView.maF != null)
        localFaceDetectView.maF.bsX();
      localFaceDetectView.eTf = false;
      localFaceDetectView.isPaused = false;
      localFaceDetectView.maL = bo.yz();
      localFaceDetectView.maJ = locala.lTV;
      localFaceDetectView.maI = locala.gJH;
      ab.i("MicroMsg.FaceDetectView", "carson logic");
      ab.i("MicroMsg.FaceDetectView", "item.hintStr" + locala.gJH);
      localFaceDetectView.lTW = locala.lTW;
      localFaceDetectView.maG = true;
      localFaceDetectView.maK = locala.lTZ;
      localFaceDetectView.maF = b.c.a(locala);
      if (localFaceDetectView.maF != null)
      {
        if (localFaceDetectView.maC != null)
          localFaceDetectView.maC.removeAllViews();
        if (localFaceDetectView.maD != null)
          localFaceDetectView.maD.removeAllViews();
        localFaceDetectView.maF.a(localFaceDetectView.getContext(), localFaceDetectView.maC, localFaceDetectView.maD);
        ab.d("MicroMsg.FaceDetectView", "mBusinessTip : " + localFaceDetectView.lXd);
        localFaceDetectView.maF.setBusinessTip(localFaceDetectView.lXd);
      }
      if (localFaceDetectView.maA != null)
        localFaceDetectView.maA.a(localRect, locala.lTT);
      localFaceDetectView.maH = false;
      AppMethodBeat.o(480);
    }
  }

  public final void d(int paramInt1, int paramInt2, String paramString, Bundle paramBundle)
  {
  }

  public void finish()
  {
    AppMethodBeat.i(492);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo finish");
    if ((this.lWU != null) && (this.lWU.aFF()))
      this.lWU.dismiss();
    if (this.lWV != null)
      this.lWV.dismiss();
    ab.i("MicroMsg.FaceDetectUI", "alvinluo FaceDetectUI release");
    bsm();
    super.finish();
    AppMethodBeat.o(492);
  }

  public final int getLayoutId()
  {
    return 2130969475;
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(493);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo onBackPressed and cancel");
    bth();
    AppMethodBeat.o(493);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(473);
    super.onCreate(paramBundle);
    getWindow().addFlags(2097280);
    this.edV = getIntent().getStringExtra("k_user_name");
    this.lSf = getIntent().getIntExtra("k_server_scene", -1);
    this.lXd = getIntent().getStringExtra("business_tips");
    paramBundle = (FaceDetectReporter)getIntent().getBundleExtra("key_reporter_bundle").getParcelable("key_parcelable_reporter");
    if (paramBundle != null)
      FaceDetectReporter.bsJ().a(paramBundle);
    paramBundle = com.tencent.mm.plugin.facedetect.c.b.lTj;
    this.lWT = com.tencent.mm.plugin.facedetect.c.b.a(this, this, this.lSf, 0, getIntent().getExtras());
    p.N(this);
    this.lXI = ((Button)findViewById(2131823808));
    this.lXI.setOnClickListener(new FaceDetectUI.1(this));
    this.lXD = findViewById(2131823805);
    this.lXD.setVisibility(8);
    this.lXE = ((RelativeLayout)findViewById(2131823807));
    this.lXG = ((FaceScanRect)findViewById(2131823809));
    this.lXF = ((FaceDetectView)findViewById(2131823806));
    this.lXH = ((TextView)findViewById(2131823810));
    this.lXF.setCallback(this);
    this.lXF.setBusinessTip(this.lXd);
    FaceDetectView localFaceDetectView = this.lXF;
    RelativeLayout localRelativeLayout = this.lXE;
    paramBundle = this.lXG.getCenterHintHolder();
    localFaceDetectView.maC = localRelativeLayout;
    localFaceDetectView.maD = paramBundle;
    this.lXF.setErrTextView(this.lXH);
    this.lXF.m(true, this.edV);
    this.lXG.setOnRefreshRectListener(new FaceDetectUI.3(this));
    this.lXG.setVisibility(4);
    this.lXA = new FaceDetectUI.b(this, (byte)0);
    AppMethodBeat.o(473);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(491);
    ab.i("MicroMsg.FaceDetectUI", "hy: current %d instance not destroyed", new Object[] { Integer.valueOf(hashCode()) });
    super.onDestroy();
    AppMethodBeat.o(491);
  }

  public void onStart()
  {
    AppMethodBeat.i(475);
    super.onStart();
    ab.i("MicroMsg.FaceDetectUI", "alvinluo onStart");
    if (this.wakeLock == null)
      this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(10, "Scan Lock");
    if (!this.wakeLock.isHeld())
    {
      ab.i("MicroMsg.FaceDetectUI", "alvinluo acquire wakeLock");
      this.wakeLock.acquire();
    }
    Intent localIntent = new Intent(this, FaceDetectProcessService.class);
    localIntent.putExtra("key_face_service_connection_from", 2);
    this.lXK = new FaceDetectUI.4(this);
    ab.i("MicroMsg.FaceDetectUI", "alvinluo bindService");
    com.tencent.mm.bp.d.a(localIntent, this.lXK, "tools");
    AppMethodBeat.o(475);
  }

  public void onStop()
  {
    AppMethodBeat.i(476);
    super.onStop();
    ab.i("MicroMsg.FaceDetectUI", "hy: onStop, finish");
    boF();
    if (!this.lXM)
    {
      a(1, 90006, "cancel with on stop", null);
      AppMethodBeat.o(476);
    }
    while (true)
    {
      return;
      finish();
      AppMethodBeat.o(476);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vs(int paramInt)
  {
    AppMethodBeat.i(487);
    if (paramInt == 1)
      this.lXG.b(null);
    AppMethodBeat.o(487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceDetectUI
 * JD-Core Version:    0.6.2
 */