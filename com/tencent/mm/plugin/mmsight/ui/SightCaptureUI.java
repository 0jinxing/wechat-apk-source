package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.mj;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.mm.plugin.mmsight.model.a.d.a;
import com.tencent.mm.plugin.mmsight.model.a.d.c;
import com.tencent.mm.plugin.mmsight.model.a.k;
import com.tencent.mm.plugin.mmsight.model.c.a;
import com.tencent.mm.plugin.mmsight.model.i;
import com.tencent.mm.plugin.mmsight.ui.cameraglview.MMSightCameraGLSurfaceView;
import com.tencent.mm.plugin.video.ObservableTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class SightCaptureUI extends MMActivity
  implements d.a, c.a
{
  private String cMW;
  private com.tencent.mm.remoteservice.d ext;
  private VideoTransPara fcY;
  private ObservableTextureView gLR;
  private com.tencent.mm.plugin.mmsight.model.a.d gLs;
  private com.tencent.mm.compatible.util.b gar;
  private int hGH;
  private boolean hGI;
  private long hGJ;
  private MMSightCaptureTouchView lmm;
  private View nPr;
  private TextView oCA;
  private View oCB;
  private b oCC;
  private boolean oCD;
  private baa oCE;
  private byte[] oCF;
  private int oCG;
  private int oCH;
  private int oCI;
  private int oCJ;
  private byte[] oCK;
  private int oCL;
  private com.tencent.mm.plugin.mmsight.model.c oCM;
  private boolean oCN;
  private boolean oCO;
  private boolean oCP;
  private int oCQ;
  private int oCR;
  private Thread oCS;
  private long oCT;
  private boolean oCU;
  private boolean oCV;
  private Boolean oCW;
  private Point oCX;
  private com.tencent.mm.sdk.b.c oCY;
  private Runnable oCZ;
  private int oCj;
  private boolean oCk;
  private com.tencent.mm.plugin.mmsight.model.e oCl;
  private ViewGroup oCm;
  private MMSightRecordButton oCn;
  private View oCo;
  private View oCp;
  private ViewGroup oCq;
  private ViewGroup oCr;
  private ImageView oCs;
  private ImageView oCt;
  private SurfaceTexture oCu;
  CameraFrontSightView oCv;
  private ViewGroup oCw;
  private ImageView oCx;
  private MMSightCameraGLSurfaceView oCy;
  private com.tencent.mm.plugin.mmsight.ui.cameraglview.a oCz;
  private String oDa;
  private String oDb;
  private boolean oDc;
  private Bundle oDd;
  private Runnable oDe;
  private int osJ;
  private SightParams owm;
  private VideoPlayerTextureView oxL;
  private VideoSeekBarEditorView oxM;
  private com.tencent.mm.pluginsdk.ui.tools.e.a oxS;

  public SightCaptureUI()
  {
    AppMethodBeat.i(55228);
    this.oCj = 1;
    this.osJ = 2;
    this.oCk = true;
    this.hGH = -1;
    this.oCD = true;
    this.oCE = new baa();
    this.ext = new com.tencent.mm.remoteservice.d(ah.getContext());
    this.oCN = false;
    this.oCO = false;
    this.oCP = false;
    this.oCQ = 0;
    this.hGI = false;
    this.oCR = 0;
    this.oCS = null;
    this.oCT = -1L;
    this.hGJ = -1L;
    this.oCU = false;
    this.oCV = false;
    this.cMW = "";
    this.oCW = Boolean.FALSE;
    this.oCY = new SightCaptureUI.12(this);
    this.oCZ = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(55211);
        if ((SightCaptureUI.g(SightCaptureUI.this) == 7) && (SightCaptureUI.k(SightCaptureUI.this) != null))
        {
          ab.i("MicroMsg.SightCaptureUI", "showRecoderProgressBar");
          SightCaptureUI.k(SightCaptureUI.this).bQs();
        }
        AppMethodBeat.o(55211);
      }
    };
    this.oDe = new SightCaptureUI.19(this);
    this.oxS = new SightCaptureUI.20(this);
    AppMethodBeat.o(55228);
  }

  private String aU(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(55244);
    boolean bool1 = CaptureMMProxy.getInstance().getBoolean(ac.a.xPU, true);
    boolean bool2 = CaptureMMProxy.getInstance().getBoolean(ac.a.xPV, true);
    if (paramBoolean);
    for (String str = com.tencent.mm.plugin.mmsight.d.RL("jpg"); ; str = com.tencent.mm.plugin.mmsight.d.RL("mp4"))
    {
      if (((bool1) && (paramBoolean)) || ((bool2) && (!paramBoolean)))
      {
        ab.i("MicroMsg.SightCaptureUI", "auto save src %s dest %s state %s %s", new Object[] { paramString, str, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        com.tencent.mm.vfs.e.y(paramString, str);
        com.tencent.mm.sdk.f.a.a(str, this);
      }
      AppMethodBeat.o(55244);
      return str;
    }
  }

  private void bQA()
  {
    AppMethodBeat.i(55234);
    if ((this.oCT > 0L) && (bo.az(this.oCT) <= 500L))
    {
      ab.i("MicroMsg.SightCaptureUI", "switchCameraClick, switch camera too frequently!!! ignore");
      AppMethodBeat.o(55234);
      return;
    }
    ab.v("MicroMsg.TestCaptureUiEvent", "switchCameraClick %s, currentState: %s", new Object[] { bo.dpG().toString(), Integer.valueOf(this.hGH) });
    bQG();
    this.oCN = true;
    if (this.hGH == 2)
      if ((this.gLs == null) || (!this.gLs.WP()))
        ab.i("MicroMsg.SightCaptureUI", "switchCameraClick, not write camera data!");
    while (true)
    {
      bQH();
      this.oCT = bo.yz();
      AppMethodBeat.o(55234);
      break;
      bQJ();
      this.oCO = true;
      continue;
      if (this.hGH == 1)
      {
        updateState(6);
        if (jb(true))
          updateState(1);
      }
    }
  }

  private void bQB()
  {
    AppMethodBeat.i(55236);
    try
    {
      ViewGroup.LayoutParams localLayoutParams = this.oxL.getLayoutParams();
      this.oCq.removeView(this.oxL);
      this.oCq.addView(this.oxL, 0, localLayoutParams);
      AppMethodBeat.o(55236);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.SightCaptureUI", "clearVideoPlayViewContent, error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(55236);
      }
    }
  }

  private void bQC()
  {
    AppMethodBeat.i(55237);
    updateState(0);
    this.oCR = 0;
    this.hGI = false;
    this.oCV = false;
    if (this.oxL != null)
    {
      this.oxL.stop();
      this.oxL.setVideoCallback(null);
      bQB();
    }
    if (this.oCC != null)
    {
      this.oCC.release();
      this.oCC = null;
    }
    if (this.oCy != null)
      this.oCy.setVisibility(0);
    this.oCx.setImageBitmap(null);
    bQI();
    this.oCl = new com.tencent.mm.plugin.mmsight.model.e(this.fcY, this.owm.scene);
    this.oCl.a(this.oCz.fcA);
    if (!this.oCl.v(this, this.oCD))
    {
      updateState(8);
      AppMethodBeat.o(55237);
      return;
    }
    if (this.gLR.isAvailable())
    {
      this.oCu = this.gLR.getSurfaceTexture();
      ab.i("MicroMsg.SightCaptureUI", "surface already available, directly set local surface: %s", new Object[] { this.oCu });
      if (jb(false))
        updateState(1);
    }
    while (true)
    {
      if ((this.oCA != null) && (this.oCk))
      {
        this.oCA.setAlpha(1.0F);
        this.oCA.setVisibility(0);
      }
      this.oCM.reset();
      this.oCN = false;
      this.oCO = false;
      AppMethodBeat.o(55237);
      break;
      updateState(8);
      continue;
      this.gLR.setTextureChangeCallback(new SightCaptureUI.8(this));
    }
  }

  private int bQD()
  {
    AppMethodBeat.i(55239);
    ab.i("MicroMsg.SightCaptureUI", "startRecordImpl");
    int i = this.gLs.b(this.oCl.getOrientation(), this.oCM.isLandscape(), this.oCM.getOrientation());
    ab.i("MicroMsg.SightCaptureUI", "startRecordImpl ret: %d", new Object[] { Integer.valueOf(i) });
    if (i >= 0)
      this.oCl.a(com.tencent.mm.plugin.mmsight.model.e.a.ouj);
    AppMethodBeat.o(55239);
    return i;
  }

  private void bQE()
  {
    AppMethodBeat.i(55240);
    this.oCV = true;
    updateState(8);
    if (this.gLs != null);
    while (true)
    {
      try
      {
        this.gLs.cancel();
        this.gLs = null;
        AppMethodBeat.o(55240);
        return;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.SightCaptureUI", localException, "", new Object[0]);
      }
      AppMethodBeat.o(55240);
    }
  }

  private void bQF()
  {
    AppMethodBeat.i(55241);
    updateState(7);
    this.oCn.setTouchEnable(false);
    int i = this.oCl.getPreviewWidth();
    int j = this.oCl.getPreviewHeight();
    this.gLs.v(new SightCaptureUI.10(this, i, j));
    AppMethodBeat.o(55241);
  }

  private void bQG()
  {
    AppMethodBeat.i(55242);
    k.bPR();
    if (!k.isDebug())
      AppMethodBeat.o(55242);
    while (true)
    {
      return;
      TextView localTextView = (TextView)findViewById(2131821713);
      localTextView.setVisibility(8);
      localTextView.setText("");
      AppMethodBeat.o(55242);
    }
  }

  private void bQH()
  {
    AppMethodBeat.i(55243);
    k.bPR();
    if (!k.isDebug())
      AppMethodBeat.o(55243);
    while (true)
    {
      return;
      ab.i("MicroMsg.SightCaptureUI", "test for debug " + bo.dpG().toString());
      i.S(new SightCaptureUI.14(this));
      AppMethodBeat.o(55243);
    }
  }

  private void bQI()
  {
    AppMethodBeat.i(55245);
    if (this.gLR != null)
      this.gLR.setTextureChangeCallback(null);
    if (this.oCl != null)
    {
      this.oCD = this.oCl.bPv();
      this.oCl.bPq();
      this.oCT = -1L;
      this.hGJ = -1L;
    }
    AppMethodBeat.o(55245);
  }

  private void bQJ()
  {
    AppMethodBeat.i(55246);
    int i = this.hGH;
    Object localObject;
    if (this.gLs != null)
    {
      localObject = this.gLs.WL();
      ab.i("MicroMsg.SightCaptureUI", "switchCameraOnRecord, currentStatus: %s, mediaRecorder.status: %s", new Object[] { Integer.valueOf(i), localObject });
      if ((this.hGH != 2) || (this.gLs == null) || (this.gLs.WL() != d.c.ovB))
        break label399;
      this.gLs.pause();
      this.oCl.a(this, this.oCu, false);
      this.oCD = this.oCl.bPv();
      if (this.oCz != null)
        this.oCz.ab(this.oCl.getPreviewWidth(), this.oCl.getPreviewHeight(), this.oCl.getOrientation());
      if (this.gLs.WL() == d.c.ovJ)
        break label202;
      ab.e("MicroMsg.SightCaptureUI", "switchCameraOnRecord, recorder status error: %s", new Object[] { this.gLs.WL() });
      AppMethodBeat.o(55246);
    }
    while (true)
    {
      return;
      localObject = "";
      break;
      label202: i = this.oCl.getPreviewWidth();
      int j = this.oCl.getPreviewHeight();
      int k = this.oCl.getOrientation();
      localObject = this.gLs.WN();
      int m = this.gLs.WO();
      ab.i("MicroMsg.SightCaptureUI", "switchCameraOnRecord, newPreviewSize: [%s, %s], oldPreviewSize: [%s], newOrientation: %s, oldOrientation: %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localObject, Integer.valueOf(k), Integer.valueOf(m) });
      if ((m != k) || (((Point)localObject).x != i) || (((Point)localObject).y != j))
        ab.e("MicroMsg.SightCaptureUI", "error oldOrientation! after switch, size or orientation not match");
      this.gLs.s(this.oCl.getPreviewWidth(), this.oCl.getPreviewHeight(), this.oCl.getEncodeVideoBestSize().x, this.oCl.getEncodeVideoBestSize().y);
      this.gLs.G(k, this.oCl.getEncodeVideoBestSize().x, this.oCl.getEncodeVideoBestSize().y);
      label399: AppMethodBeat.o(55246);
    }
  }

  private boolean bQK()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.hGH != 4)
    {
      bool2 = bool1;
      if (this.hGH != 3)
      {
        bool2 = bool1;
        if (this.hGH != 1)
        {
          bool2 = bool1;
          if (this.hGH != 8)
            if (this.hGH != 9)
              break label56;
        }
      }
    }
    label56: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  private boolean jb(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(55238);
    ab.b("MicroMsg.SightCaptureUI", "createRecorder, surface: %s", new Object[] { this.oCu });
    this.oCV = false;
    if (this.gLs != null)
    {
      if (this.oCl != null)
        this.oCl.b(this.gLs.getFrameDataCallback());
      this.gLs.cancel();
    }
    if (this.oCl == null)
    {
      AppMethodBeat.o(55238);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      this.oCE = new baa();
      this.oCE.wDP = true;
      this.oCE.wDO = com.tencent.mm.plugin.mmsight.model.j.ouz.ouO;
      if (this.owm != null)
        this.oCE.wDR = this.owm.scene;
      if (!paramBoolean)
      {
        if (this.oCl.a(this.oCu, true) < 0)
        {
          AppMethodBeat.o(55238);
          paramBoolean = bool;
        }
      }
      else
      {
        paramBoolean = this.oCl.a(this, this.oCu, true);
        this.oCD = this.oCl.bPv();
        if (!paramBoolean)
        {
          AppMethodBeat.o(55238);
          paramBoolean = bool;
        }
        else if (this.oCl.getEncodeVideoBestSize() == null)
        {
          AppMethodBeat.o(55238);
          paramBoolean = bool;
        }
        else
        {
          k.bPR();
          this.gLs = k.p(this.fcY);
          if (this.gLs == null)
          {
            ab.e("MicroMsg.SightCaptureUI", "create mediaRecorder error");
            this.oCV = true;
            AppMethodBeat.o(55238);
            paramBoolean = bool;
          }
          else
          {
            com.tencent.mm.plugin.mmsight.d.a(this.gLs, this.owm);
            this.gLs.a(this);
            this.oCl.a(this.gLs.getFrameDataCallback());
            if (this.oCz != null)
              this.oCz.ab(this.oCl.getPreviewWidth(), this.oCl.getPreviewHeight(), this.oCl.getOrientation());
            this.gLs.s(this.oCl.getPreviewWidth(), this.oCl.getPreviewHeight(), this.oCl.getEncodeVideoBestSize().x, this.oCl.getEncodeVideoBestSize().y);
            paramBoolean = this.gLs.ko(this.oCl.getOrientation());
            ab.i("MicroMsg.SightCaptureUI", "preInit result: %s", new Object[] { Boolean.valueOf(paramBoolean) });
            if (!paramBoolean)
              this.oCV = true;
            AppMethodBeat.o(55238);
          }
        }
      }
    }
  }

  private void jc(boolean paramBoolean)
  {
    AppMethodBeat.i(55250);
    ab.i("MicroMsg.SightCaptureUI", "[clearPhotoEditCache] isDelete:%s mLastEditPhotoPath:%s mRawEditPhotoPath:%s", new Object[] { Boolean.valueOf(paramBoolean), this.oDb, this.oDa });
    if ((!bo.isNullOrNil(this.oDb)) && (paramBoolean))
      com.tencent.mm.vfs.e.deleteFile(this.oDb);
    if (!bo.isNullOrNil(this.oDa))
      com.tencent.mm.vfs.e.deleteFile(this.oDa);
    this.oDb = null;
    this.oDa = null;
    mj localmj = new mj();
    localmj.cIo.cuy = 0;
    com.tencent.mm.sdk.b.a.xxA.m(localmj);
    AppMethodBeat.o(55250);
  }

  private void stopRecord()
  {
    AppMethodBeat.i(55235);
    ab.c("MicroMsg.SightCaptureUI", "stopRecord, currentStatus: %s", new Object[] { Integer.valueOf(this.hGH) });
    if (this.hGH == 2)
      bQF();
    AppMethodBeat.o(55235);
  }

  private void updateState(int paramInt)
  {
    AppMethodBeat.i(55249);
    ab.i("MicroMsg.SightCaptureUI", "pre state %s %s update state %s %s", new Object[] { Integer.valueOf(this.hGH), za(this.hGH), Integer.valueOf(paramInt), za(paramInt) });
    ab.i("MicroMsg.TestCaptureUiEvent", "pre state %s %s update state %s %s %s", new Object[] { Integer.valueOf(this.hGH), za(this.hGH), Integer.valueOf(paramInt), za(paramInt), bo.dpG().toString() });
    if (paramInt == this.hGH)
      AppMethodBeat.o(55249);
    while (true)
    {
      return;
      if (this.oCq == null)
      {
        AppMethodBeat.o(55249);
      }
      else
      {
        com.tencent.mm.plugin.mmsight.d.RM("TIME_RECODER_2_PLAY");
        this.hGH = paramInt;
        if (this.hGH != 7)
          al.af(this.oCZ);
        if (this.hGH == 0)
        {
          this.oCq.setVisibility(8);
          this.oCt.setVisibility(8);
          this.oCr.setVisibility(8);
          this.oCx.setVisibility(8);
          this.oCw.setVisibility(0);
          if (this.oCQ > 1)
            this.oCs.setVisibility(0);
          if (this.oCl != null)
            this.oCl.a(com.tencent.mm.plugin.mmsight.model.e.a.oui);
          com.tencent.mm.plugin.mmsight.model.a.reset();
          if (this.oCS != null)
            try
            {
              this.oCS.interrupt();
              this.oCS = null;
              AppMethodBeat.o(55249);
            }
            catch (Exception localException)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.SightCaptureUI", localException, "update to state init, interrupt failed: %s", new Object[] { localException.getMessage() });
            }
        }
        else
        {
          if ((this.hGH == 1) || (this.hGH == 2))
          {
            this.oCq.setVisibility(0);
            this.oCt.setVisibility(8);
            this.oCr.setVisibility(0);
            this.oCr.setClipChildren(false);
            this.oCo.setVisibility(8);
            this.nPr.setVisibility(8);
            this.oCp.setVisibility(0);
            this.oCn.setVisibility(0);
            this.oxL.setVisibility(8);
            if (this.hGH == 1)
              this.oCn.reset();
            while (true)
            {
              this.oCB.setVisibility(8);
              this.oCx.setVisibility(8);
              this.lmm.setVisibility(0);
              if (this.oCQ > 1)
                this.oCs.setVisibility(0);
              this.lmm.bringToFront();
              this.oCs.bringToFront();
              bQG();
              bQH();
              AppMethodBeat.o(55249);
              break;
              this.oCn.setTouchEnable(true);
              this.oCn.bQt();
            }
          }
          if ((this.hGH == 4) || (this.hGH == 3))
          {
            this.oCq.setVisibility(0);
            this.oCr.setVisibility(8);
            this.oCr.setClipChildren(false);
            this.oCo.setVisibility(0);
            this.nPr.setVisibility(0);
            this.oCp.setVisibility(8);
            this.oCn.setVisibility(8);
            if (this.hGH == 3)
            {
              this.oCt.setVisibility(0);
              this.oCx.setVisibility(0);
              this.oxL.setVisibility(8);
            }
            while (true)
            {
              this.lmm.setVisibility(8);
              AppMethodBeat.o(55249);
              break;
              this.oCx.setVisibility(8);
              this.oxL.setVisibility(0);
              this.oxL.setForceScaleFullScreen(true);
              ViewGroup.LayoutParams localLayoutParams = this.oxL.getLayoutParams();
              localLayoutParams.width = -1;
              localLayoutParams.height = -1;
              this.oxL.setLayoutParams(localLayoutParams);
              if (this.gLs.isLandscape())
                this.oCz.WB();
              this.oCw.setVisibility(8);
            }
          }
          if (this.hGH == 6)
          {
            this.oCo.setVisibility(8);
            this.nPr.setVisibility(8);
            this.oCt.setVisibility(8);
            this.oCp.setVisibility(8);
            this.oCn.setVisibility(8);
            AppMethodBeat.o(55249);
          }
          else if (this.hGH == 7)
          {
            this.oCo.setVisibility(8);
            this.nPr.setVisibility(8);
            this.oCp.setVisibility(8);
            this.oCs.setVisibility(8);
            this.oCt.setVisibility(8);
            this.oCn.setTouchEnable(false);
            al.n(this.oCZ, 1500L);
            this.oCn.bgk();
            AppMethodBeat.o(55249);
          }
          else
          {
            if (this.hGH == 8)
            {
              this.oCq.setVisibility(0);
              this.oCr.setVisibility(0);
              this.oCr.setClipChildren(false);
              this.oCo.setVisibility(8);
              this.nPr.setVisibility(8);
              this.oCt.setVisibility(8);
              this.oCp.setVisibility(0);
              if (this.oCQ > 1)
                this.oCs.setVisibility(0);
              this.oCn.setVisibility(0);
              this.lmm.setVisibility(0);
              this.oxL.setVisibility(8);
              this.oCB.setVisibility(8);
              this.oCx.setVisibility(8);
              if (this.oCV)
                Toast.makeText(this, 2131301440, 1).show();
              while (true)
              {
                this.oCn.setTouchEnable(false);
                this.oCn.setEnabled(false);
                AppMethodBeat.o(55249);
                break;
                Toast.makeText(this, 2131301445, 1).show();
              }
            }
            if (this.hGH == 9)
            {
              this.oCo.setVisibility(8);
              this.nPr.setVisibility(8);
              this.oCt.setVisibility(8);
              this.oCp.setVisibility(0);
              this.oCs.setVisibility(8);
              this.oCn.reset();
              this.oCn.setTouchEnable(false);
              this.oCn.setEnabled(false);
              Toast.makeText(this, 2131301441, 1).show();
            }
            AppMethodBeat.o(55249);
          }
        }
      }
    }
  }

  private static String za(int paramInt)
  {
    String str;
    if (paramInt == -1)
      str = "CAPTURE_STATE_BINGDING";
    while (true)
    {
      return str;
      if (paramInt == 0)
        str = "CAPTURE_STATE_INIT";
      else if (paramInt == 1)
        str = "CAPTURE_STATE_CAPTURING";
      else if (paramInt == 2)
        str = "CAPTURE_STATE_RECORDING";
      else if (paramInt == 3)
        str = "CAPTURE_STATE_PREVIEW_PICTURE";
      else if (paramInt == 4)
        str = "CAPTURE_STATE_PREVIEW_VIDEO";
      else if (paramInt == 6)
        str = "CAPTURE_STATE_SUPERMAN";
      else if (paramInt == 7)
        str = "CAPTURE_STATE_WAIT_TO_PREVIEW";
      else if (paramInt == 8)
        str = "CAPTURE_STATE_INIT_ERROR";
      else if (paramInt == 9)
        str = "CAPTURE_STATE_STOP_ERROR";
      else
        str = "UNKNOW";
    }
  }

  public final void asv()
  {
    AppMethodBeat.i(55253);
    ab.i("MicroMsg.SightCaptureUI", "onError: %s", new Object[] { Integer.valueOf(1) });
    try
    {
      if (this.gLs != null)
        this.gLs.reset();
      updateState(9);
      AppMethodBeat.o(55253);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.SightCaptureUI", "onError, reset mediaRecorder error: %s", new Object[] { localException.getMessage() });
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130968833;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(55248);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent == null)
    {
      bool = true;
      ab.i("MicroMsg.SightCaptureUI", "[onActivityResult] requestCode:%s  resultCode:%s data is null?:", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
      switch (paramInt1)
      {
      default:
      case 4369:
      }
    }
    do
    {
      AppMethodBeat.o(55248);
      return;
      bool = false;
      break;
      ab.i("MicroMsg.SightCaptureUI", "[handlePhotoEditResult] resultCode:%s", new Object[] { Integer.valueOf(paramInt2) });
    }
    while ((paramInt2 != -1) || (paramIntent == null) || (this.gLs == null));
    this.oDc = true;
    this.oDd = paramIntent.getBundleExtra("report_info");
    this.oDa = paramIntent.getStringExtra("raw_photo_path");
    this.oDb = paramIntent.getStringExtra("after_photo_edit");
    boolean bool = CaptureMMProxy.getInstance().getBoolean(ac.a.xPU, true);
    ab.i("MicroMsg.SightCaptureUI", "rawEditPhotoPath:%s lastEditPhotoPath:%s imageState:%s", new Object[] { this.oDa, this.oDb, Boolean.valueOf(bool) });
    if (!bool)
    {
      paramIntent = CaptureMMProxy.getInstance().getSubCoreImageFullPath("photoEdited_" + System.currentTimeMillis());
      ab.i("MicroMsg.SightCaptureUI", "saveFullPath:%s", new Object[] { paramIntent });
      com.tencent.mm.vfs.e.y(this.oDb, paramIntent);
      com.tencent.mm.vfs.e.deleteFile(this.oDb);
      com.tencent.mm.sdk.f.a.a(this.oDb, this);
      this.gLs.mc(paramIntent);
      this.oDb = paramIntent;
    }
    while (true)
    {
      paramIntent = new BitmapFactory.Options();
      paramIntent.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(this.oDb, paramIntent);
      ab.i("MicroMsg.SightCaptureUI", "rawW:%s rawH:%s", new Object[] { Integer.valueOf(paramIntent.outWidth), Integer.valueOf(paramIntent.outHeight) });
      paramIntent = com.tencent.mm.sdk.platformtools.d.ao(this.oDb, paramIntent.outHeight, paramIntent.outWidth);
      this.oCx.setVisibility(0);
      this.oCx.setImageBitmap(paramIntent);
      this.oCy.setVisibility(8);
      break;
      this.gLs.mc(this.oDb);
    }
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(55251);
    ab.i("MicroMsg.SightCaptureUI", "onBackPressed %d", new Object[] { Integer.valueOf(this.hGH) });
    if ((this.oCC != null) && (this.oCC.wY()))
      AppMethodBeat.o(55251);
    while (true)
    {
      return;
      if (this.oCC != null)
      {
        this.oCC.release();
        this.oCC = null;
        Ne(8);
        this.oCo.setVisibility(0);
        this.nPr.setVisibility(0);
        this.oCt.setVisibility(0);
        AppMethodBeat.o(55251);
      }
      else
      {
        if (bQK())
        {
          super.onBackPressed();
          overridePendingTransition(-1, 2131034259);
          jc(true);
        }
        AppMethodBeat.o(55251);
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(55233);
    super.onConfigurationChanged(paramConfiguration);
    if ((this.oCW.booleanValue()) && (com.tencent.mm.compatible.util.d.iW(13)))
    {
      paramConfiguration = new Point(paramConfiguration.screenWidthDp, paramConfiguration.screenHeightDp);
      if ((this.oCX == null) || (!this.oCX.equals(paramConfiguration)))
      {
        this.oCX = paramConfiguration;
        bQC();
      }
    }
    AppMethodBeat.o(55233);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(55229);
    supportRequestWindowFeature(1);
    super.onCreate(paramBundle);
    this.owm = ((SightParams)getIntent().getParcelableExtra("KEY_SIGHT_PARAMS"));
    if (this.owm == null)
    {
      ab.e("MicroMsg.SightCaptureUI", "error!!!! sightParams is null!!");
      AppMethodBeat.o(55229);
    }
    while (true)
    {
      return;
      CaptureMMProxy.createProxy(new CaptureMMProxy(this.ext));
      long l = bo.yz();
      this.ext.connect(new SightCaptureUI.1(this, l));
      com.tencent.mm.sdk.b.a.xxA.c(this.oCY);
      AppMethodBeat.o(55229);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(55247);
    super.onDestroy();
    ab.i("MicroMsg.SightCaptureUI", "onDestroy");
    this.ext.release();
    if (this.gLs != null)
    {
      this.gLs.a(null);
      this.gLs.v(null);
      this.gLs.clear();
    }
    if (this.hGH == -1);
    for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        bQI();
        if (this.oxL != null)
        {
          this.oxL.stop();
          this.oxL.setVideoCallback(null);
        }
        if (this.gar != null)
          this.gar.Mm();
        if (this.oCC != null)
        {
          this.oCC.release();
          this.oCC = null;
        }
      }
      if (this.oCM != null)
      {
        this.oCM.disable();
        this.oCM.otK = null;
        this.oCM = null;
      }
      com.tencent.mm.plugin.mmsight.model.a.j.owk.WY();
      com.tencent.mm.sdk.b.a.xxA.d(this.oCY);
      AppMethodBeat.o(55247);
      return;
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(55230);
    if ((q.etc.eqV == 1) && (paramInt == 700) && (this.oCD))
      bQA();
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(55230);
    return bool;
  }

  public void onPause()
  {
    AppMethodBeat.i(55231);
    super.onPause();
    ab.i("MicroMsg.SightCaptureUI", "onPause, currentState: %s", new Object[] { za(this.hGH) });
    if (this.hGH == 2)
      stopRecord();
    while (true)
    {
      com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(2);
      AppMethodBeat.o(55231);
      return;
      if (this.hGH == 1)
        bQI();
      else if ((this.hGH == 4) && (this.oxL != null))
        this.oxL.pause();
    }
  }

  public void onResume()
  {
    boolean bool1 = false;
    AppMethodBeat.i(55232);
    super.onResume();
    Ne(8);
    String str = za(this.hGH);
    boolean bool2 = bool1;
    if (this.gLR != null)
    {
      bool2 = bool1;
      if (this.gLR.isAvailable())
        bool2 = true;
    }
    ab.i("MicroMsg.SightCaptureUI", "onResume, currentState: %s, textureview available: %s", new Object[] { str, Boolean.valueOf(bool2) });
    if ((this.hGH == 2) || (this.hGH == 1))
      bQC();
    while (true)
    {
      com.tencent.mm.plugin.webview.ui.tools.widget.o.JV(1);
      AppMethodBeat.o(55232);
      return;
      if (this.hGH == 4)
      {
        if (this.gLR != null)
        {
          if (!this.gLR.isAvailable())
            break label153;
          this.oCz.WB();
        }
        while (true)
        {
          if (this.oxL == null)
            break label169;
          this.oxL.start();
          break;
          label153: this.gLR.setTextureChangeCallback(new SightCaptureUI.21(this));
        }
      }
      else
      {
        label169: if (this.hGH == 3)
        {
          if (this.gLR != null)
            this.gLR.setTextureChangeCallback(null);
          this.oCz.a(this.oCK, this.oCP, this.oCL);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void yR(int paramInt)
  {
    AppMethodBeat.i(55252);
    if (this.oCQ <= 1)
      AppMethodBeat.o(55252);
    while (true)
    {
      return;
      if (this.hGH == 2)
      {
        AppMethodBeat.o(55252);
      }
      else
      {
        ab.i("MicroMsg.SightCaptureUI", "onOrientationChange: %s", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt < 0)
        {
          AppMethodBeat.o(55252);
        }
        else
        {
          float f;
          if ((paramInt == 90) || (paramInt == 270))
            if (paramInt == 270)
              f = 90.0F;
          while (true)
          {
            if (this.oCs.getRotation() != f)
              break label128;
            AppMethodBeat.o(55252);
            break;
            f = -90.0F;
            continue;
            f = paramInt;
          }
          label128: this.oCs.animate().rotation(f).setDuration(100L).start();
          AppMethodBeat.o(55252);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightCaptureUI
 * JD-Core Version:    0.6.2
 */