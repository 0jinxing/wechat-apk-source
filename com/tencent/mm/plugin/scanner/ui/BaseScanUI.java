package com.tencent.mm.plugin.scanner.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PreviewCallback;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.g.a.mi;
import com.tencent.mm.g.a.mi.b;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.ps;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.1;
import com.tencent.mm.plugin.scanner.util.ScanCameraLightDetector.a;
import com.tencent.mm.plugin.scanner.util.e;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.plugin.scanner.util.r;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMTextureView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@com.tencent.mm.kernel.i
@com.tencent.mm.ui.base.a(3)
public class BaseScanUI extends MMActivity
  implements Camera.AutoFocusCallback, Camera.PreviewCallback, TextureView.SurfaceTextureListener, i.b
{
  private final Object cli;
  private int cvH;
  private int[] gCr;
  private volatile boolean lZT;
  private boolean oOH;
  private final long qaT;
  private final int qaU;
  private MMTextureView qaV;
  private SurfaceTexture qaW;
  private LinearLayout qaX;
  private TextView qaY;
  private FrameLayout qaZ;
  private int qbA;
  private boolean qbB;
  private boolean qbC;
  private boolean qbD;
  private long qbE;
  private long qbF;
  private Set<Integer> qbG;
  private int qbH;
  private ValueAnimator qbI;
  private com.tencent.mm.sdk.b.c<ui> qbJ;
  private com.tencent.mm.network.n qbK;
  private com.tencent.mm.sdk.b.c<mk> qbL;
  protected ak qbM;
  private final int qbN;
  protected ak qbO;
  protected ak qbP;
  private com.tencent.mm.sdk.b.c qbQ;
  protected ak qbR;
  protected final int qbS;
  protected final int qbT;
  protected final int qbU;
  private com.tencent.mm.plugin.scanner.util.h qba;
  private Point qbb;
  private SelectScanModePanel qbc;
  private ScanMaskView qbd;
  private ScannerFlashSwitcher qbe;
  private boolean qbf;
  private boolean qbg;
  private boolean qbh;
  private i.a qbi;
  private int qbj;
  private int qbk;
  private int qbl;
  private int qbm;
  private boolean qbn;
  private Rect qbo;
  private TextView qbp;
  private View qbq;
  private boolean qbr;
  private boolean qbs;
  private boolean qbt;
  private boolean qbu;
  private e qbv;
  private TranslateAnimation qbw;
  private ImageView qbx;
  private i qby;
  private int qbz;
  private PowerManager.WakeLock wakeLock;

  public BaseScanUI()
  {
    AppMethodBeat.i(80943);
    this.qaT = 150L;
    this.qaU = 2;
    this.lZT = false;
    this.cli = new Object();
    this.qbd = null;
    this.qbf = false;
    this.qbg = false;
    this.qbh = true;
    this.qbn = true;
    this.qbo = new Rect();
    this.qbr = false;
    this.qbs = true;
    this.qbt = false;
    this.qbu = false;
    this.qbv = null;
    this.wakeLock = null;
    this.qbz = 0;
    this.cvH = 0;
    this.qbA = 0;
    this.qbB = true;
    this.qbC = false;
    this.qbD = false;
    this.gCr = new int[8];
    this.qbG = new HashSet();
    this.qbJ = new com.tencent.mm.sdk.b.c()
    {
    };
    this.qbK = new BaseScanUI.12(this);
    this.qbL = new BaseScanUI.22(this);
    this.qbM = new BaseScanUI.9(this);
    this.qbN = 2600;
    this.oOH = false;
    this.qbO = new BaseScanUI.16(this);
    this.qbP = new BaseScanUI.17(this);
    this.qbQ = new BaseScanUI.18(this);
    this.qbR = new BaseScanUI.19(this);
    this.qbS = 0;
    this.qbT = 1;
    this.qbU = 2;
    AppMethodBeat.o(80943);
  }

  private boolean Lt()
  {
    AppMethodBeat.i(80982);
    boolean bool;
    if ((7 == this.qbz) || (9 == this.qbz) || (10 == this.qbz) || (11 == this.qbz) || (com.tencent.mm.compatible.e.d.Lt()))
    {
      bool = true;
      AppMethodBeat.o(80982);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80982);
    }
  }

  private void btW()
  {
    AppMethodBeat.i(80964);
    com.tencent.mm.sdk.g.d.post(new BaseScanUI.13(this), "BaseScanUI_closeCamera");
    AppMethodBeat.o(80964);
  }

  private void bwV()
  {
    AppMethodBeat.i(80981);
    ps localps = new ps();
    localps.cLW.bJt = 1;
    com.tencent.mm.sdk.b.a.xxA.m(localps);
    setResult(0);
    finish();
    AppMethodBeat.o(80981);
  }

  private void cgV()
  {
    AppMethodBeat.i(80949);
    if ((7 == this.qbz) || (9 == this.qbz) || (10 == this.qbz) || (11 == this.qbz))
      AppMethodBeat.o(80949);
    while (true)
    {
      return;
      this.qbc.setShowRedDotModes(this.qbG);
      this.qbc.setSelectedMode(this.qbz);
      this.qbc.setOnGridItemClickCallback(new BaseScanUI.26(this));
      AppMethodBeat.o(80949);
    }
  }

  private void cgW()
  {
    AppMethodBeat.i(80950);
    if (this.qby == null)
      AppMethodBeat.o(80950);
    while (true)
    {
      return;
      che();
      AppMethodBeat.o(80950);
    }
  }

  private void cgX()
  {
    AppMethodBeat.i(80956);
    FrameLayout.LayoutParams localLayoutParams;
    if (this.qbe != null)
    {
      localLayoutParams = (FrameLayout.LayoutParams)this.qbe.getLayoutParams();
      if (this.qbz == 3)
      {
        localLayoutParams.topMargin = (this.qbc.getTop() - com.tencent.mm.bz.a.fromDPToPix(this, 70));
        ab.c("MicroMsg.scanner.BaseScanUI", "initFlashSwitcher, scanMaskRect: %s, scanLineStart: %s, scanLineEnd: %s", new Object[] { this.qbo, Integer.valueOf(this.qbl), Integer.valueOf(this.qbm) });
        this.qbe.setLayoutParams(localLayoutParams);
        this.qbe.setOnClickListener(new BaseScanUI.8(this));
        if ((this.qba == null) || (!this.qba.otY))
          break label174;
        this.qbe.setVisibility(0);
        AppMethodBeat.o(80956);
      }
    }
    while (true)
    {
      return;
      localLayoutParams.topMargin = (this.qbo.top + (this.qbo.height() - com.tencent.mm.bz.a.fromDPToPix(this, 70)));
      break;
      label174: this.qbe.setVisibility(8);
      AppMethodBeat.o(80956);
    }
  }

  private void cgY()
  {
    AppMethodBeat.i(80957);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qbx.getLayoutParams();
    if (this.qbn)
    {
      localLayoutParams.width = this.qbj;
      localLayoutParams.gravity = 1;
      this.qbx.setLayoutParams(localLayoutParams);
      this.qbx.invalidate();
      this.qbx.setVisibility(0);
      if (!this.qbn)
        break label125;
      this.qbw = new TranslateAnimation(0.0F, 0.0F, this.qbl, this.qbm);
      AppMethodBeat.o(80957);
    }
    while (true)
    {
      return;
      localLayoutParams.height = this.qbk;
      localLayoutParams.gravity = 48;
      localLayoutParams.topMargin = this.qbo.top;
      break;
      label125: this.qbw = new TranslateAnimation(this.qbl, this.qbm, 0.0F, 0.0F);
      AppMethodBeat.o(80957);
    }
  }

  private void chb()
  {
    AppMethodBeat.i(80961);
    al.n(new BaseScanUI.10(this), 25L);
    AppMethodBeat.o(80961);
  }

  private void chc()
  {
    AppMethodBeat.i(80962);
    this.qba.a(new BaseScanUI.11(this));
    AppMethodBeat.o(80962);
  }

  private void chd()
  {
    AppMethodBeat.i(80965);
    if (this.qbf)
      AppMethodBeat.o(80965);
    while (true)
    {
      return;
      this.qbf = true;
      kj(true);
      Object localObject = new mi();
      ((mi)localObject).cIm.type = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (((mi)localObject).cIn.cIl)
      {
        ab.i("MicroMsg.scanner.BaseScanUI", "Permission dialog showed");
        this.qbg = true;
        btW();
        bwV();
        overridePendingTransition(0, 0);
        AppMethodBeat.o(80965);
      }
      else
      {
        localObject = com.tencent.mm.ui.base.h.a(this, getString(2131302760), getString(2131297061), new BaseScanUI.14(this));
        if (localObject == null)
        {
          ab.d("MicroMsg.scanner.BaseScanUI", "comfirmDialog == null");
          AppMethodBeat.o(80965);
        }
        else
        {
          ((com.tencent.mm.ui.widget.a.c)localObject).setCancelable(false);
          ((com.tencent.mm.ui.widget.a.c)localObject).setCanceledOnTouchOutside(false);
          ((com.tencent.mm.ui.widget.a.c)localObject).show();
          AppMethodBeat.o(80965);
        }
      }
    }
  }

  private void chf()
  {
    AppMethodBeat.i(80968);
    Rect localRect = new Rect();
    getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
    this.qbb = new Point(localRect.width(), localRect.height());
    ab.d("MicroMsg.scanner.BaseScanUI", "update visible rect:%s", new Object[] { this.qbb });
    AppMethodBeat.o(80968);
  }

  private void e(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(80958);
    if ((this.qbl < 0) || (this.qbm <= 0) || (this.qby == null) || (!this.qby.cgT()))
    {
      cgZ();
      AppMethodBeat.o(80958);
    }
    while (true)
    {
      return;
      if (paramBoolean)
        cgY();
      this.qbM.removeMessages(1);
      if (paramLong <= 0L)
      {
        this.qbM.sendEmptyMessage(1);
        AppMethodBeat.o(80958);
      }
      else
      {
        cgZ();
        this.qbM.sendEmptyMessageDelayed(1, paramLong);
        AppMethodBeat.o(80958);
      }
    }
  }

  private void startPreview()
  {
    AppMethodBeat.i(80963);
    try
    {
      if ((this.lZT) || (this.qba == null))
      {
        ab.w("MicroMsg.scanner.BaseScanUI", "scanCamera == null, in startPreview");
        AppMethodBeat.o(80963);
      }
      while (true)
      {
        return;
        if (!this.qba.isOpen())
        {
          ab.w("MicroMsg.scanner.BaseScanUI", "camera not open");
          AppMethodBeat.o(80963);
        }
        else if (this.qaW == null)
        {
          ab.w("MicroMsg.scanner.BaseScanUI", "preview surface in null in startPreview");
          AppMethodBeat.o(80963);
        }
        else
        {
          if (!this.qba.lUE)
            break;
          ab.w("MicroMsg.scanner.BaseScanUI", "camera is previewing");
          AppMethodBeat.o(80963);
        }
      }
      ab.d("MicroMsg.scanner.BaseScanUI", "camera startPreview.");
    }
    catch (Exception localException)
    {
      synchronized (this.cli)
      {
        while (true)
        {
          chc();
          this.qba.h(this.qaW);
          ab.d("MicroMsg.scanner.BaseScanUI", "camera startPreview. done");
          this.gCr[5] = ((int)(System.currentTimeMillis() - this.qbE));
          if ((bo.isNullOrNil(this.qba.getFocusMode())) || (!this.qba.getFocusMode().equals("continuous-video")))
            break;
          this.qba.cancelAutoFocus();
          jK(0L);
          AppMethodBeat.o(80963);
          continue;
          localException = localException;
          ab.w("MicroMsg.scanner.BaseScanUI", "Exception in scanCamera.startPreview(), [%s]", new Object[] { localException.toString() });
          ab.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
          chd();
          AppMethodBeat.o(80963);
        }
        if (com.tencent.mm.compatible.e.q.etc.ers > 0L)
          jK((int)((float)com.tencent.mm.compatible.e.q.etc.ers * ae.gjj));
        jL(0L);
      }
    }
  }

  public final void X(int paramInt, long paramLong)
  {
    AppMethodBeat.i(80969);
    this.qbO.removeMessages(0);
    this.qbO.sendEmptyMessageDelayed(paramInt, paramLong);
    this.qbc.setSelectedMode(paramInt);
    AppMethodBeat.o(80969);
  }

  public final void a(i.a parama)
  {
    this.qbi = parama;
  }

  public final void a(String paramString, int paramInt1, int paramInt2, int paramInt3, e.a parama)
  {
    AppMethodBeat.i(80983);
    ab.i("MicroMsg.scanner.BaseScanUI", "dealQBarString, qbarString: %s, codeType: %s, codeVersion: %s", new Object[] { paramString, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.qbv != null)
      this.qbv.chU();
    Bundle localBundle = getIntent().getBundleExtra("_stat_obj");
    this.qbv = new e();
    this.qbv.a(this, paramString, paramInt1, paramInt2, paramInt3, parama, localBundle);
    if ((this.qbz == 1) || (this.qbz == 8) || (this.qbz == 4))
    {
      paramString = com.tencent.mm.plugin.scanner.a.m.pZK;
      paramInt1 = com.tencent.mm.plugin.scanner.a.m.pZH;
    }
    AppMethodBeat.o(80983);
  }

  public final void ah(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(80988);
    label280: 
    while (true)
    {
      synchronized (this.cli)
      {
        if ((!this.lZT) && (this.qba != null) && (this.qba.lUE))
        {
          ab.i("MicroMsg.scanner.BaseScanUI", "zoom camera,action:%d,type:%d,scale:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
          int i = this.qba.cid();
          if ((this.qbz != 1) && (this.qbz != 8) && (this.qbz != 4))
            break label252;
          if ((paramInt2 == 1) && (!((p)this.qby).chy()))
          {
            ab.d("MicroMsg.scanner.BaseScanUI", "auto zoom is disable");
            AppMethodBeat.o(80988);
            return;
          }
          if (paramInt1 != 6)
            continue;
          this.qba.Ce(paramInt3);
          if (paramInt2 == 2)
            ((p)this.qby).chx();
          if (this.qba.cid() != i)
          {
            com.tencent.mm.plugin.scanner.a.m localm = com.tencent.mm.plugin.scanner.a.m.pZK;
            this.qba.cid();
            if (paramInt2 != 1)
              break label280;
            localm.pZX |= 1;
          }
        }
        AppMethodBeat.o(80988);
        continue;
        this.qba.Cf(paramInt1);
      }
      label252: if (paramInt1 == 6)
      {
        this.qba.Ce(paramInt3);
      }
      else
      {
        this.qba.Cf(paramInt1);
        continue;
        if (paramInt2 == 2)
          localObject2.pZX |= 2;
      }
    }
  }

  public final void b(int paramInt, final View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(80977);
    if (this.qaX != null)
      if (!getIntent().getBooleanExtra("key_is_hide_right_btn", false))
      {
        if (paramOnClickListener == null)
          break label144;
        this.qaX.setVisibility(paramInt);
        this.qaX.setOnClickListener(paramOnClickListener);
        this.qaY.setBackgroundDrawable(null);
        this.qaY.setText(getString(2131302915));
        AppMethodBeat.o(80977);
      }
    while (true)
    {
      return;
      this.qaX.setVisibility(8);
      AppMethodBeat.o(80977);
      continue;
      if (!getIntent().getBooleanExtra("key_is_hide_right_btn", false))
      {
        if (paramOnClickListener != null)
        {
          addIconOptionMenu(0, 2131230740, new MenuItem.OnMenuItemClickListener()
          {
            public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
            {
              AppMethodBeat.i(138478);
              paramAnonymousMenuItem = new com.tencent.mm.ui.widget.a.d(BaseScanUI.this.mController.ylL, 1, false);
              paramAnonymousMenuItem.rBl = new BaseScanUI.20.1(this);
              paramAnonymousMenuItem.rBm = new BaseScanUI.20.2(this);
              paramAnonymousMenuItem.cpD();
              AppMethodBeat.o(138478);
              return false;
            }
          });
          AppMethodBeat.o(80977);
        }
        else
        {
          removeOptionMenu(0);
        }
      }
      else
        label144: AppMethodBeat.o(80977);
    }
  }

  public final void cgZ()
  {
    AppMethodBeat.i(80959);
    if ((this.qbx != null) && (this.qbw != null))
    {
      this.qbx.setVisibility(8);
      this.qbx.clearAnimation();
      this.qbx.setAnimation(null);
    }
    AppMethodBeat.o(80959);
  }

  public final void cha()
  {
    AppMethodBeat.i(80960);
    if (!this.qbg)
      ay.au(this, 2131302091);
    AppMethodBeat.o(80960);
  }

  public final void che()
  {
    AppMethodBeat.i(80966);
    try
    {
      chf();
      if (this.qby == null)
      {
        ab.d("MicroMsg.scanner.BaseScanUI", "initBodyByScanMode null scanMode");
        AppMethodBeat.o(80966);
        return;
      }
      this.qby.e(this.qbb);
      Rect localRect = this.qby.H(true, Lt());
      Object localObject = new android/widget/FrameLayout$LayoutParams;
      ((FrameLayout.LayoutParams)localObject).<init>(localRect.width(), localRect.height(), 3);
      ((FrameLayout.LayoutParams)localObject).leftMargin = localRect.left;
      ((FrameLayout.LayoutParams)localObject).topMargin = localRect.top;
      this.qbj = localRect.width();
      this.qbk = localRect.height();
      ab.d("MicroMsg.scanner.BaseScanUI", "mask : leftMargin=[%s], topMargin=[%s], width=[%s], height=[%s]", new Object[] { Integer.valueOf(((FrameLayout.LayoutParams)localObject).leftMargin), Integer.valueOf(((FrameLayout.LayoutParams)localObject).topMargin), Integer.valueOf(this.qbj), Integer.valueOf(this.qbk) });
      localRect = new android/graphics/Rect;
      localRect.<init>(((FrameLayout.LayoutParams)localObject).leftMargin, ((FrameLayout.LayoutParams)localObject).topMargin, ((FrameLayout.LayoutParams)localObject).leftMargin + this.qbj, ((FrameLayout.LayoutParams)localObject).topMargin + this.qbk);
      if (this.qbb.x - localRect.right < localRect.left)
      {
        ab.w("MicroMsg.scanner.BaseScanUI", "this is a special device");
        if (this.qbb.x - localRect.left > localRect.left)
          localRect.right = (this.qbb.x - localRect.left);
      }
      ScanMaskView localScanMaskView;
      if (this.qbd != null)
      {
        localObject = this.qbd.getMaskRect();
        this.qbd.cht();
        localScanMaskView = new com/tencent/mm/plugin/scanner/ui/ScanMaskView;
        localScanMaskView.<init>(this, (Rect)localObject);
      }
      for (this.qbd = localScanMaskView; ; this.qbd = ((ScanMaskView)localObject))
      {
        FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
        localLayoutParams.<init>(-1, -1);
        this.qbd.setLayoutParams(localLayoutParams);
        if ((this.qbz == 3) && (r.cio()))
        {
          localScanMaskView = this.qbd;
          localObject = new com/tencent/mm/plugin/scanner/ui/BaseScanUI$15;
          ((BaseScanUI.15)localObject).<init>(this);
          localScanMaskView.setMaskAnimaListener((ScanMaskView.a)localObject);
        }
        this.qaZ.removeAllViews();
        View.inflate(this, this.qby.cgP(), this.qaZ);
        this.qby.dw(this.qaZ.getChildAt(0));
        this.qby.cgR();
        this.qby.dx(this.qaZ);
        this.qaZ.addView(this.qbd, 0, localLayoutParams);
        this.qbd.k(localRect);
        this.qby.j(localRect);
        this.qbd.setBackgroundColor(0);
        ab.d("MicroMsg.scanner.BaseScanUI", "newRect = %s", new Object[] { localRect });
        if (!this.qbn)
          break label665;
        this.qbl = localRect.top;
        this.qbm = (localRect.bottom - BackwardSupportUtil.b.b(this, 8.0F));
        this.qbo = localRect;
        cgX();
        if ((this.qbs) && (!this.qbh))
          break label697;
        e(true, this.qbd.getMaskAnimDuration() + 150L);
        if ((this.qbp != null) && (this.qbq != null))
        {
          this.qbp.setVisibility(8);
          this.qbq.setVisibility(8);
        }
        if ((this.qba != null) && (this.qba.isOpen()))
        {
          this.qba.e(this.qbb);
          this.qby.kn(chh());
          this.qby.f(this.qba.lUF);
        }
        AppMethodBeat.o(80966);
        break;
        localObject = new com/tencent/mm/plugin/scanner/ui/ScanMaskView;
        ((ScanMaskView)localObject).<init>(this, localRect);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.scanner.BaseScanUI", localException, "", new Object[0]);
        AppMethodBeat.o(80966);
        continue;
        label665: this.qbl = localException.left;
        this.qbm = (localException.right - BackwardSupportUtil.b.b(this, 8.0F));
        this.qbo = localException;
        continue;
        label697: if ((this.qbp != null) && (this.qbq != null))
        {
          this.qbp.setText(2131302758);
          this.qbq.setVisibility(0);
          this.qbp.setVisibility(0);
        }
      }
    }
  }

  public final void chg()
  {
    AppMethodBeat.i(80974);
    Intent localIntent = new Intent();
    localIntent.putExtra("preview_ui_title", 2131302778);
    com.tencent.mm.pluginsdk.ui.tools.n.a(this, 4660, localIntent);
    AppMethodBeat.o(80974);
  }

  public final boolean chh()
  {
    AppMethodBeat.i(80978);
    boolean bool;
    if ((this.qba == null) || (!this.qba.isOpen()))
    {
      ab.d("MicroMsg.scanner.BaseScanUI", "scanCamera == null or scanCamera is not open, cameraNeedRotate return false");
      bool = false;
      AppMethodBeat.o(80978);
    }
    while (true)
    {
      return bool;
      bool = this.qba.lUI;
      AppMethodBeat.o(80978);
    }
  }

  public final void chi()
  {
    AppMethodBeat.i(80979);
    bwV();
    AppMethodBeat.o(80979);
  }

  public final void chj()
  {
    AppMethodBeat.i(80980);
    super.finish();
    AppMethodBeat.o(80980);
  }

  public final void chk()
  {
    AppMethodBeat.i(80989);
    Object localObject;
    if ((!this.lZT) && (this.qba != null) && (!this.qbg))
    {
      localObject = this.qba.getFocusMode();
      if ((!bo.isNullOrNil((String)localObject)) && (!((String)localObject).equals("auto")))
        localObject = this.qba;
    }
    try
    {
      if ((((com.tencent.mm.plugin.scanner.util.h)localObject).erH != null) && (((com.tencent.mm.plugin.scanner.util.h)localObject).lUE))
      {
        Camera.Parameters localParameters = ((com.tencent.mm.plugin.scanner.util.h)localObject).erH.getParameters();
        List localList = localParameters.getSupportedFocusModes();
        if ((localList != null) && (localList.contains("auto")) && (!bo.isNullOrNil(localParameters.getFocusMode())) && (!localParameters.getFocusMode().equals("auto")))
        {
          localParameters.setFocusMode("auto");
          ((com.tencent.mm.plugin.scanner.util.h)localObject).erH.setParameters(localParameters);
        }
      }
      jL(0L);
      AppMethodBeat.o(80989);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.scanner.ScanCamera", "setFocusModeAuto %s", new Object[] { localException.getMessage() });
    }
  }

  public View findViewById(int paramInt)
  {
    AppMethodBeat.i(80944);
    View localView = super.findViewById(paramInt);
    AppMethodBeat.o(80944);
    return localView;
  }

  public final int getForceOrientation()
  {
    AppMethodBeat.i(80946);
    int i;
    if (!Lt())
    {
      ab.d("MicroMsg.scanner.BaseScanUI", "getForceOrientation PORTRAIT");
      i = 1;
      AppMethodBeat.o(80946);
    }
    while (true)
    {
      return i;
      ab.d("MicroMsg.scanner.BaseScanUI", "getForceOrientation LANDSCAPE");
      i = 0;
      AppMethodBeat.o(80946);
    }
  }

  public final int getLayoutId()
  {
    AppMethodBeat.i(80945);
    int i;
    if (!Lt())
    {
      ab.d("MicroMsg.scanner.BaseScanUI", "getLayoutId PORTRAIT");
      i = 2130970540;
      AppMethodBeat.o(80945);
    }
    while (true)
    {
      return i;
      ab.d("MicroMsg.scanner.BaseScanUI", "getLayoutId LANDSCAPE");
      i = 2130970541;
      AppMethodBeat.o(80945);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(80948);
    if (Lt())
    {
      getWindow().setFlags(1024, 1024);
      this.mController.hideTitleView();
      ab.d("MicroMsg.scanner.BaseScanUI", "oncreate LANDSCAPE");
    }
    this.qbq = findViewById(2131827193);
    this.qbp = ((TextView)findViewById(2131827194));
    this.qaX = ((LinearLayout)findViewById(2131827204));
    this.qaY = ((TextView)findViewById(2131827205));
    this.qaZ = ((FrameLayout)findViewById(2131827192));
    this.qbe = ((ScannerFlashSwitcher)findViewById(2131827196));
    this.qaV = ((MMTextureView)findViewById(2131827191));
    this.qaV.setOpaque(false);
    this.qaV.setSurfaceTextureListener(this);
    Object localObject1;
    Object localObject2;
    if ((7 == this.qbz) || (9 == this.qbz) || (10 == this.qbz) || (11 == this.qbz))
    {
      localObject1 = (Button)findViewById(2131827206);
      ((Button)localObject1).setVisibility(0);
      findViewById(2131827198).setVisibility(8);
      findViewById(2131827201).setVisibility(8);
      if (9 != this.qbz)
      {
        localObject2 = localObject1;
        if (10 != this.qbz);
      }
      else
      {
        ViewGroup.LayoutParams localLayoutParams = ((Button)localObject1).getLayoutParams();
        localObject2 = localObject1;
        if (localLayoutParams != null)
        {
          localObject2 = localObject1;
          if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
          {
            localObject2 = (ViewGroup.MarginLayoutParams)localLayoutParams;
            ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = ((ViewGroup.MarginLayoutParams)localObject2).topMargin;
            ((Button)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
            localObject2 = localObject1;
          }
        }
      }
      if (localObject2 == null)
        break label481;
      ((Button)localObject2).setOnClickListener(new BaseScanUI.23(this));
    }
    while (true)
    {
      this.qbx = ((ImageView)findViewById(2131827195));
      this.cvH = getIntent().getIntExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
      this.qbc = ((SelectScanModePanel)findViewById(2131827197));
      this.qaZ.setVisibility(0);
      if ((7 != this.qbz) && (9 != this.qbz) && (10 != this.qbz) && (11 != this.qbz) && (Lt()))
      {
        this.qbz = 1;
        this.qbr = true;
      }
      localObject1 = getIntent().getIntArrayExtra("key_support_scan_code_type");
      localObject2 = new HashSet();
      if ((localObject1 == null) || (localObject1.length <= 0))
        break label496;
      for (i = 0; i < localObject1.length; i++)
        ((Set)localObject2).add(Integer.valueOf(localObject1[i]));
      localObject2 = (Button)findViewById(2131827202);
      break;
      label481: setBackBtn(new BaseScanUI.24(this));
    }
    label496: chf();
    setMMSubTitle(null);
    if (this.qbz == 2)
    {
      this.qby = new k(this, this.qbb);
      setMMTitle(r.fT(r.qiQ, getString(2131302746)));
      if (com.tencent.mm.x.c.PK().b(ac.a.xVK, ac.a.xVL))
        this.qbG.add(Integer.valueOf(3));
      this.qbn = this.qby.cgS();
      localObject2 = this.qbx;
      if (!this.qbn)
        break label1590;
    }
    label1409: label1426: label1580: label1590: for (int i = 2130839930; ; i = 2130839931)
    {
      ((ImageView)localObject2).setBackgroundResource(i);
      cgV();
      if (this.qba != null)
        this.qba.Cd(this.qbz);
      cgW();
      this.qbI = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.qbI.addUpdateListener(new BaseScanUI.25(this));
      this.qbI.setDuration(300L);
      xE(getResources().getColor(2131690597));
      ab.i("MicroMsg.scanner.BaseScanUI", "initView() done, fromSource=[%s], directSelectMode=[%s]", new Object[] { Integer.valueOf(this.cvH), Integer.valueOf(this.qbz) });
      AppMethodBeat.o(80948);
      return;
      if (this.qbz == 5)
      {
        this.qby = new q(this, this.qbb);
        setMMTitle(2131302738);
        this.qbC = true;
        break;
      }
      if (this.qbz == 3)
      {
        this.qby = new o(this, this.qbb);
        setMMTitle(2131302734);
        break;
      }
      if ((this.qbz == 4) && (!Lt()))
      {
        if (((Set)localObject2).isEmpty());
        for (this.qby = new p(this, this.qbb, this.cvH, 2); ; this.qby = new p(this, this.qbb, this.cvH, (Set)localObject2))
        {
          ((p)this.qby).qfn = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
          this.qbc.setVisibility(8);
          setMMTitle(2131302739);
          break;
        }
      }
      if (this.qbz == 8)
      {
        if (((Set)localObject2).isEmpty());
        for (this.qby = new p(this, this.qbb, this.cvH, 1); ; this.qby = new p(this, this.qbb, this.cvH, (Set)localObject2))
        {
          ((p)this.qby).qfn = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
          this.qbc.setVisibility(8);
          setMMTitle(2131302736);
          break;
        }
      }
      if (7 == this.qbz)
      {
        localObject2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject2);
        this.qby = new j(this, this.qbb, (DisplayMetrics)localObject2, getWindowManager().getDefaultDisplay().getRotation());
        localObject2 = (j)this.qby;
        if ((getIntent() != null) && (getIntent().getBooleanExtra("scan_bankcard_with_confirm_ui", false)));
        for (boolean bool = true; ; bool = false)
        {
          ((j)localObject2).qeB = bool;
          setMMTitle(2131302729);
          this.qbc.setVisibility(8);
          break;
        }
      }
      if (9 == this.qbz)
      {
        localObject2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject2);
        this.qby = new m(this, this.qbb, (DisplayMetrics)localObject2, getWindowManager().getDefaultDisplay().getRotation());
        setMMTitle(2131302731);
        this.qbc.setVisibility(8);
        break;
      }
      if (10 == this.qbz)
      {
        localObject2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject2);
        this.qby = new l(this, this.qbb, (DisplayMetrics)localObject2, getWindowManager().getDefaultDisplay().getRotation());
        setMMTitle(2131302730);
        this.qbc.setVisibility(8);
        break;
      }
      if (11 == this.qbz)
      {
        localObject2 = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject2);
        this.qby = new n(this, this.qbb, (DisplayMetrics)localObject2, getWindowManager().getDefaultDisplay().getRotation());
        setMMTitle(2131302732);
        this.qbc.setVisibility(8);
        break;
      }
      this.qbz = 1;
      if (((Set)localObject2).isEmpty())
      {
        localObject2 = this.qbb;
        int j = this.cvH;
        if (Lt())
        {
          i = 1;
          this.qby = new p(this, (Point)localObject2, j, i);
          ((p)this.qby).qfn = getIntent().getBooleanExtra("key_is_finish_on_scanned", false);
          if (!com.tencent.mm.au.b.ahO())
            break label1549;
          this.qbr = true;
          if (!r.cio())
            break label1537;
          this.qbc.setDisplayModes(new int[] { 1, 3 });
          this.qbc.setVisibility(0);
        }
      }
      while (true)
      {
        if (!this.qbr)
          break label1580;
        setMMTitle(2131302736);
        break;
        i = 0;
        break label1409;
        this.qby = new p(this, this.qbb, this.cvH, (Set)localObject2);
        break label1426;
        this.qbc.setVisibility(8);
        continue;
        if (getIntent().getBooleanExtra("BaseScanUI_only_scan_qrcode_with_zbar", false))
        {
          this.qbr = false;
          this.qbc.setVisibility(8);
        }
      }
      setMMTitle(2131302737);
      break;
    }
  }

  public final void jK(long paramLong)
  {
    AppMethodBeat.i(80970);
    ab.i("MicroMsg.scanner.BaseScanUI", "takeOneShotDelay: %s", new Object[] { Long.valueOf(paramLong) });
    this.qbP.removeMessages(0);
    if (!this.qbg)
    {
      this.qbP.sendEmptyMessageDelayed(0, paramLong);
      AppMethodBeat.o(80970);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.scanner.BaseScanUI", "takeOneShotDelay() scanPause");
      AppMethodBeat.o(80970);
    }
  }

  public final void jL(long paramLong)
  {
    AppMethodBeat.i(80971);
    if ((this.qba != null) && (!this.qbg) && (this.qba.lUE))
    {
      ab.d("MicroMsg.scanner.BaseScanUI", "focus delay:".concat(String.valueOf(paramLong)));
      String str = this.qba.getFocusMode();
      if ((!bo.isNullOrNil(str)) && (str.equals("continuous-video")))
      {
        jK(0L);
        AppMethodBeat.o(80971);
      }
    }
    while (true)
    {
      return;
      this.qbR.removeMessages(0);
      this.qbR.sendEmptyMessageDelayed(0, paramLong);
      AppMethodBeat.o(80971);
    }
  }

  public final void kj(boolean paramBoolean)
  {
    AppMethodBeat.i(80976);
    this.qbg = paramBoolean;
    if (paramBoolean)
    {
      cgZ();
      if (this.qbq == null)
        break label68;
      this.qbq.setVisibility(0);
      AppMethodBeat.o(80976);
    }
    while (true)
    {
      return;
      jL(0L);
      e(false, 0L);
      if (this.qbq != null)
        this.qbq.setVisibility(8);
      label68: AppMethodBeat.o(80976);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(80975);
    if (this.qbi != null)
      this.qbi.c(this, paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(80975);
  }

  public void onAutoFocus(boolean paramBoolean, Camera paramCamera)
  {
    AppMethodBeat.i(80973);
    ab.i("MicroMsg.scanner.BaseScanUI", "onAutoFocus, success: %s, camera: %s", new Object[] { Boolean.valueOf(paramBoolean), paramCamera });
    this.gCr[4] = ((int)(System.currentTimeMillis() - this.qbF));
    com.tencent.mm.compatible.e.q.etc.ers = this.gCr[4];
    if (this.qbg)
      AppMethodBeat.o(80973);
    while (true)
    {
      return;
      if (this.qby == null)
      {
        AppMethodBeat.o(80973);
      }
      else
      {
        if ((this.qba != null) && (this.qba.lUE) && (paramBoolean))
          jK(0L);
        if (this.qby.qel > 0L)
          jL(this.qby.qel);
        AppMethodBeat.o(80973);
      }
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(80984);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.scanner.BaseScanUI", "screen orientation %d", new Object[] { Integer.valueOf(paramConfiguration.orientation) });
    if ((paramConfiguration.orientation == 2) || (paramConfiguration.orientation == 1))
      al.n(new BaseScanUI.21(this), 100L);
    AppMethodBeat.o(80984);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(80947);
    this.qbz = getIntent().getIntExtra("BaseScanUI_select_scan_mode", 1);
    this.ylm = true;
    super.onCreate(paramBundle);
    com.tencent.mm.ui.q.initLanguage(this);
    getWindow().addFlags(2097280);
    getWindow().getDecorView().setSystemUiVisibility(1280);
    if ((g.Rg().acS() == 6) || (g.Rg().acS() == 4))
      this.qbh = true;
    while (true)
    {
      if ((7 == this.qbz) || (11 == this.qbz))
        this.qbs = false;
      com.tencent.mm.sdk.b.a.xxA.c(this.qbQ);
      com.tencent.mm.sdk.b.a.xxA.c(this.qbL);
      initView();
      this.qbE = System.currentTimeMillis();
      paramBundle = ScanCameraLightDetector.qia;
      try
      {
        paramBundle.qie = com.tencent.mm.sdk.g.d.anM("ScanCameraLightDetector_detectThread");
        paramBundle.qie.start();
        ScanCameraLightDetector.1 local1 = new com/tencent/mm/plugin/scanner/util/ScanCameraLightDetector$1;
        local1.<init>(paramBundle, paramBundle.qie.getLooper());
        paramBundle.handler = local1;
        ab.i("MicroMsg.ScanCameraLightDetector", "start, sensorManager: %s, lightSensor: %s, isRegister: %s", new Object[] { paramBundle.sensorManager, paramBundle.qic, Boolean.valueOf(paramBundle.qid) });
        this.qbE = System.currentTimeMillis();
        com.tencent.mm.sdk.b.a.xxA.c(this.qbJ);
        AppMethodBeat.o(80947);
        return;
        this.qbh = false;
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.ScanCameraLightDetector", localException, "start error: %s", new Object[] { localException.getMessage() });
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(80955);
    ab.i("MicroMsg.scanner.BaseScanUI", "onDestroy()");
    if (this.qby != null)
      this.qby.onDestroy();
    if (this.qbd != null)
      this.qbd.cht();
    if (this.qaV != null)
      this.qaV.setSurfaceTextureListener(null);
    com.tencent.mm.sdk.b.a.xxA.d(this.qbQ);
    com.tencent.mm.sdk.b.a.xxA.d(this.qbL);
    com.tencent.mm.sdk.b.a.xxA.d(this.qbJ);
    if (this.qbv != null)
      this.qbv.chU();
    ScanCameraLightDetector localScanCameraLightDetector = ScanCameraLightDetector.qia;
    ab.i("MicroMsg.ScanCameraLightDetector", "stop, isRegister: %s, sensorManager: %s, lightSensor: %s", new Object[] { Boolean.valueOf(localScanCameraLightDetector.qid), localScanCameraLightDetector.sensorManager, localScanCameraLightDetector.qic });
    try
    {
      localScanCameraLightDetector.qib = -1L;
      if (localScanCameraLightDetector.qie != null)
        localScanCameraLightDetector.qie.quit();
      super.onDestroy();
      AppMethodBeat.o(80955);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ScanCameraLightDetector", localException, "stop error: %s", new Object[] { localException.getMessage() });
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(80951);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
    {
      ab.d("MicroMsg.scanner.BaseScanUI", "keyCode KEYCODE_BACK");
      this.qbg = true;
      bwV();
      overridePendingTransition(0, 0);
      AppMethodBeat.o(80951);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(80951);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(80954);
    ab.i("MicroMsg.scanner.BaseScanUI", "onPause(), scanMode: %s, mQBarStringHandler: %s", new Object[] { this.qby, this.qbv });
    this.qbg = true;
    com.tencent.mm.plugin.scanner.util.m.qiz.stop();
    if (this.qby != null)
    {
      this.qby.onPause();
      if (this.qby.cgO() != null)
        this.qby.cgO().sI();
    }
    int i;
    if (this.qba != null)
    {
      String str = this.qba.getFocusMode();
      if ((!bo.isNullOrNil(str)) && (str.equals("continuous-video")))
        this.gCr[2] = 1;
    }
    else
    {
      btW();
      if (this.qbe != null)
      {
        this.qbe.chJ();
        this.qbe.hide();
      }
      if ((this.wakeLock != null) && (this.wakeLock.isHeld()))
      {
        this.wakeLock.release();
        this.wakeLock = null;
      }
      sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_DEACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
      g.RO().b(this.qbK);
      if (this.qbv != null)
        this.qbv.onPause();
      if ((this.qbz == 1) || (this.qbz == 8) || (this.qbz == 4))
      {
        com.tencent.mm.plugin.scanner.a.m.pZK.bHT();
        i = (int)(System.currentTimeMillis() - this.qbE);
        ab.i("MicroMsg.scanner.BaseScanUI", "scan cost time:".concat(String.valueOf(i)));
        if (!com.tencent.mm.plugin.scanner.a.m.pZK.pZM)
          break label493;
        this.gCr[0] = 1;
      }
    }
    while (true)
    {
      this.gCr[1] = i;
      this.gCr[3] = com.tencent.mm.plugin.scanner.a.m.pZK.pZN;
      if (com.tencent.mm.plugin.scanner.util.m.qiz.cil() > 0L)
        this.gCr[6] = ((int)(com.tencent.mm.plugin.scanner.util.m.qiz.cil() - this.qbE));
      this.gCr[7] = this.qbz;
      com.tencent.mm.plugin.report.service.h.pYm.e(14176, new Object[] { Integer.valueOf(this.gCr[0]), Integer.valueOf(this.gCr[1]), Integer.valueOf(this.gCr[2]), Integer.valueOf(this.gCr[3]), Integer.valueOf(this.gCr[4]), Integer.valueOf(this.gCr[5]), Integer.valueOf(this.gCr[6]), Integer.valueOf(this.gCr[7]) });
      super.onPause();
      AppMethodBeat.o(80954);
      return;
      this.gCr[2] = 0;
      break;
      label493: this.gCr[0] = 0;
    }
  }

  public void onPreviewFrame(byte[] paramArrayOfByte, Camera paramCamera)
  {
    AppMethodBeat.i(80972);
    boolean bool;
    if (paramArrayOfByte == null)
    {
      bool = true;
      ab.i("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, data==null: %s, camera: %s", new Object[] { Boolean.valueOf(bool), paramCamera });
      if ((!this.qbg) && (this.qby != null) && (this.qby.cgO() != null) && (this.qby.H(false, Lt()) != null))
        break label110;
      ab.w("MicroMsg.scanner.BaseScanUI", "onPreviewFrame error state, scanPause = [%s]", new Object[] { Boolean.valueOf(this.qbg) });
      AppMethodBeat.o(80972);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label110: if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        if (paramArrayOfByte == null);
        for (bool = true; ; bool = false)
        {
          ab.e("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, wrong data, data is null [%s]", new Object[] { Boolean.valueOf(bool) });
          chd();
          AppMethodBeat.o(80972);
          break;
        }
      }
      if (this.qba != null)
        break label188;
      ab.e("MicroMsg.scanner.BaseScanUI", "onPreviewFrame, scanCamera == null, finish this activity");
      AppMethodBeat.o(80972);
    }
    while (true)
    {
      label188: Rect localRect2;
      try
      {
        int i;
        Object localObject1;
        Object localObject2;
        if (this.qba != null)
        {
          paramCamera = this.qba;
          if (paramCamera.qhV < 0)
          {
            if (!paramCamera.cif())
              continue;
            i = 1;
            paramCamera.qhV = i;
          }
          if (paramCamera.qhV != 1)
            continue;
          i = 1;
          if ((i != 0) && (!this.qba.otY) && (this.qbh))
          {
            localObject1 = ScanCameraLightDetector.qia;
            j = this.qba.lUF.x;
            i = this.qba.lUF.y;
            if ((((ScanCameraLightDetector)localObject1).qib < 0L) || ((bo.az(((ScanCameraLightDetector)localObject1).qib) >= 1000L) && (((ScanCameraLightDetector)localObject1).handler != null) && (((ScanCameraLightDetector)localObject1).qie != null) && (((ScanCameraLightDetector)localObject1).qie.isAlive())))
            {
              paramCamera = new com/tencent/mm/plugin/scanner/util/ScanCameraLightDetector$a;
              paramCamera.<init>((ScanCameraLightDetector)localObject1, (byte)0);
              paramCamera.ovq = paramArrayOfByte;
              paramCamera.width = j;
              paramCamera.height = i;
              localObject2 = Message.obtain();
              ((Message)localObject2).what = 233;
              ((Message)localObject2).obj = paramCamera;
              ((ScanCameraLightDetector)localObject1).handler.sendMessage((Message)localObject2);
              ((ScanCameraLightDetector)localObject1).qib = bo.yz();
            }
          }
        }
        Rect localRect1;
        if ((this.qba != null) && (!this.qbg))
        {
          paramCamera = this.qby;
          localObject1 = this.qba.lUF;
          i = this.qba.lUJ;
          localObject2 = this.qba;
          localRect1 = this.qby.km(Lt());
          j = this.qbz;
          localRect2 = new android/graphics/Rect;
          localRect2.<init>();
          ab.i("MicroMsg.scanner.ScanCamera", "frame rect:%s, visibleResolution:%s, cameraResolution %s", new Object[] { localRect1, ((com.tencent.mm.plugin.scanner.util.h)localObject2).lUH, ((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF });
          if ((((com.tencent.mm.plugin.scanner.util.h)localObject2).lUI) && (!((com.tencent.mm.plugin.scanner.util.h)localObject2).qhS))
          {
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>(", needRotate = ");
            ab.i("MicroMsg.scanner.ScanCamera", ((com.tencent.mm.plugin.scanner.util.h)localObject2).lUI + " needLandscape = " + ((com.tencent.mm.plugin.scanner.util.h)localObject2).qhS);
            localRect2.top = ((((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.x - (int)(localRect1.height() * ((com.tencent.mm.plugin.scanner.util.h)localObject2).chY())) / 2);
            localRect2.bottom = (((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.x - localRect2.top);
            localRect2.left = ((((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.y - (int)(localRect1.width() * ((com.tencent.mm.plugin.scanner.util.h)localObject2).chX())) / 2);
            localRect2.right = (((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.y - localRect2.left);
            if ((7 == j) || (11 == j))
            {
              if ((!((com.tencent.mm.plugin.scanner.util.h)localObject2).lUI) || (((com.tencent.mm.plugin.scanner.util.h)localObject2).qhS))
                break label1072;
              if (localRect2.height() / 1.586F >= localRect2.width())
                break label1020;
              j = (int)(localRect2.height() / 1.586F);
              localRect2.left = ((localRect2.left + localRect2.right) / 2 - j / 2);
              localRect2.right = (j + localRect2.left);
            }
            ab.i("MicroMsg.scanner.ScanCamera", "resultRect %s", new Object[] { localRect2 });
            ((com.tencent.mm.plugin.scanner.util.h)localObject2).lQX = localRect2;
            ((com.tencent.mm.plugin.scanner.util.h)localObject2).cib();
            localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("scanRect:");
            ab.i("MicroMsg.scanner.ScanCamera", ((com.tencent.mm.plugin.scanner.util.h)localObject2).lQX);
            paramCamera.a(paramArrayOfByte, (Point)localObject1, i, ((com.tencent.mm.plugin.scanner.util.h)localObject2).lQX);
          }
        }
        else
        {
          AppMethodBeat.o(80972);
          break;
          i = 0;
          continue;
          i = 0;
          continue;
        }
        localRect2.left = ((int)(localRect1.left * ((com.tencent.mm.plugin.scanner.util.h)localObject2).chX()));
        localRect2.right = ((int)(localRect1.right * ((com.tencent.mm.plugin.scanner.util.h)localObject2).chX()));
        localRect2.top = ((int)(localRect1.top * ((com.tencent.mm.plugin.scanner.util.h)localObject2).chY()));
        localRect2.bottom = ((int)(localRect1.bottom * ((com.tencent.mm.plugin.scanner.util.h)localObject2).chY()));
        if (localRect2.bottom > ((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.y)
          localRect2.bottom = ((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.y;
        if (localRect2.right <= ((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.x)
          continue;
        localRect2.right = ((com.tencent.mm.plugin.scanner.util.h)localObject2).lUF.x;
        continue;
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.scanner.BaseScanUI", paramArrayOfByte, "onPreviewFrame exception", new Object[0]);
        AppMethodBeat.o(80972);
      }
      break;
      label1020: int j = (int)(localRect2.width() * 1.586F);
      localRect2.top = ((localRect2.top + localRect2.bottom) / 2 - j / 2);
      localRect2.bottom = (j + localRect2.top);
      continue;
      label1072: if (localRect2.width() * 1.0D / localRect2.height() < 1.585999965667725D)
      {
        j = (int)(localRect2.width() / 1.586F);
        localRect2.top = ((localRect2.top + localRect2.bottom) / 2 - j / 2);
        localRect2.bottom = (j + localRect2.top);
      }
      else
      {
        j = (int)(localRect2.height() * 1.586F);
        localRect2.left = ((localRect2.left + localRect2.right) / 2 - j / 2);
        localRect2.right = (j + localRect2.left);
      }
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(80953);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.scanner.BaseScanUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(80953);
      return;
    }
    ab.i("MicroMsg.scanner.BaseScanUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 16:
    case 76:
    }
    while (true)
    {
      AppMethodBeat.o(80953);
      break;
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == -1))
      {
        this.qbB = false;
        com.tencent.mm.ui.base.h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new BaseScanUI.4(this), new BaseScanUI.5(this));
        AppMethodBeat.o(80953);
        break;
        if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == -1))
        {
          this.qbC = false;
          com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131296868), false, new BaseScanUI.6(this), new BaseScanUI.7(this));
        }
      }
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(80952);
    super.onResume();
    if (!this.qbD)
    {
      com.tencent.mm.cj.c.aNX();
      this.qbD = true;
    }
    ab.i("MicroMsg.scanner.BaseScanUI", "should check camera %s, location %s", new Object[] { Boolean.valueOf(this.qbB), Boolean.valueOf(this.qbC) });
    boolean bool;
    int i;
    if ((this.qbB) || (this.qbC))
      if (this.qbB)
      {
        bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.CAMERA", 16, null, null);
        ab.i("MicroMsg.scanner.BaseScanUI", "summerper checkPermission checkCamera[%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          i = 0;
          if (i != 0)
          {
            if (com.tencent.mm.compatible.f.b.Mj())
              break label355;
            com.tencent.mm.ui.base.h.a(this, getString(2131301920), getString(2131301936), getString(2131300878), getString(2131296868), false, new BaseScanUI.27(this), new BaseScanUI.28(this));
          }
        }
      }
    while (true)
    {
      if ((!this.qbg) && ((this.qbz == 1) || (this.qbz == 8) || (this.qbz == 4)))
      {
        com.tencent.mm.plugin.scanner.a.m.pZK.reset();
        com.tencent.mm.plugin.scanner.a.m.pZK.BU(com.tencent.mm.plugin.scanner.a.m.pZH);
      }
      ??? = com.tencent.mm.plugin.scanner.util.m.qiz;
      ab.i("MicroMsg.ScanStableDetector", "start detect scan stable");
      if (((com.tencent.mm.plugin.scanner.util.m)???).bCW != null)
      {
        ((com.tencent.mm.plugin.scanner.util.m)???).qix = 0;
        ((com.tencent.mm.plugin.scanner.util.m)???).qiw[0] = 0.0F;
        ((com.tencent.mm.plugin.scanner.util.m)???).qiw[1] = 0.0F;
        ((com.tencent.mm.plugin.scanner.util.m)???).qiw[2] = 0.0F;
        ab.i("MicroMsg.ScanStableDetector", "register accelerate listener");
        ((com.tencent.mm.plugin.scanner.util.m)???).bCW.registerListener((SensorEventListener)???, ((com.tencent.mm.plugin.scanner.util.m)???).qiv, 50000);
      }
      AppMethodBeat.o(80952);
      return;
      if (this.qbC)
      {
        bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 76, null, null);
        ab.i("MicroMsg.scanner.BaseScanUI", "summerper checkPermission checkLocation [%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          i = 0;
          break;
        }
      }
      i = 1;
      break;
      label355: if ((this.qbz == 5) && (!com.tencent.mm.pluginsdk.permission.b.o(this, "android.permission.ACCESS_COARSE_LOCATION")))
      {
        com.tencent.mm.ui.base.h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131296868), false, new BaseScanUI.2(this), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(80913);
            BaseScanUI.c(BaseScanUI.this, true);
            BaseScanUI.this.finish();
            AppMethodBeat.o(80913);
          }
        });
        continue;
      }
      if ((!this.qbs) || (this.qbh))
      {
        this.qbg = false;
        e(false, 0L);
        label451: this.qbu = false;
      }
      synchronized (this.cli)
      {
        ab.d("MicroMsg.scanner.BaseScanUI", "onResume open Camera");
        com.tencent.mm.plugin.scanner.util.h localh = new com/tencent/mm/plugin/scanner/util/h;
        i = this.qbz;
        if ((7 == this.qbz) || (9 == this.qbz) || (10 == this.qbz) || (11 == this.qbz))
        {
          bool = true;
          localh.<init>(this, i, bool);
          this.qba = localh;
          chb();
          if ((this.qbz != 3) || (!r.cio()))
          {
            if (this.qby.cgO() != null)
              this.qby.cgO().chP();
            this.qby.onResume();
          }
          if (this.wakeLock == null)
          {
            this.wakeLock = ((PowerManager)getSystemService("power")).newWakeLock(10, "Scan Lock");
            this.wakeLock.acquire();
          }
          sendBroadcast(new Intent("com.tencent.mm.ui.ACTION_ACTIVE").putExtra("classname", getClass().getName()), "com.tencent.mm.permission.MM_MESSAGE");
          if (this.qbs)
            g.RO().a(this.qbK);
          if (this.qbv == null)
            continue;
          this.qbv.onResume();
          continue;
          this.qbg = true;
          cgZ();
          break label451;
        }
        bool = false;
      }
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(80967);
    super.onStart();
    AppMethodBeat.o(80967);
  }

  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80985);
    ab.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureAvailable");
    this.qaV.dAh();
    this.qaW = paramSurfaceTexture;
    this.qbt = true;
    if (this.qbu)
    {
      chb();
      this.qbu = false;
    }
    startPreview();
    AppMethodBeat.o(80985);
  }

  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    AppMethodBeat.i(80987);
    ab.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureDestroyed");
    this.qbt = false;
    AppMethodBeat.o(80987);
    return false;
  }

  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(80986);
    ab.d("MicroMsg.scanner.BaseScanUI", "onSurfaceTextureSizeChanged");
    this.qaW = paramSurfaceTexture;
    AppMethodBeat.o(80986);
  }

  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture)
  {
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI
 * JD-Core Version:    0.6.2
 */