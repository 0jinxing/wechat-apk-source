package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.MovableTextureView;
import com.tencent.mm.plugin.voip.video.MovableVideoView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.plugin.voip.video.OpenGlView;
import com.tencent.mm.plugin.voip.video.f;
import com.tencent.mm.plugin.voip.widget.VoIPVideoView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.MMTextureView;
import com.tencent.mm.ui.base.t;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

public class VoipVideoFragment extends VoipBaseFragment
{
  private long iBO;
  private Runnable lmq;
  private Timer mTimer;
  private TextView nGB;
  int[] oHc;
  Bitmap oHs;
  private CaptureView sRg;
  private OpenGlView sWS;
  private OpenGlView sWT;
  private OpenGlRender sWU;
  private OpenGlRender sWV;
  private View sWW;
  private ImageView sWX;
  private TextView sWY;
  private TextView sWZ;
  private Button sXA;
  private boolean sXB;
  private int sXC;
  private int sXD;
  private int sXE;
  private int sXF;
  private int sXG;
  private int sXH;
  private boolean sXI;
  private boolean sXJ;
  private boolean sXK;
  private boolean sXL;
  public long sXM;
  private Bitmap sXN;
  private VoipVideoFragment.a sXO;
  public MMTextureView sXP;
  public MMTextureView sXQ;
  private boolean sXR;
  public int sXS;
  public int sXT;
  private int sXU;
  private int sXV;
  private HandlerThread sXW;
  private ap sXX;
  private boolean sXY;
  private View.OnClickListener sXZ;
  private TextView sXa;
  private TextView sXb;
  private View sXc;
  private TextView sXd;
  private TextView sXe;
  private TextView sXf;
  private RelativeLayout sXg;
  private Button sXh;
  private VoipSmallIconButton sXi;
  private VoipSmallIconButton sXj;
  private VoipSmallIconButton sXk;
  private VoipBigIconButton sXl;
  private VoipBigIconButton sXm;
  private VoipBigIconButton sXn;
  private VoipBigIconButton sXo;
  private VoipBigIconButton sXp;
  private VoipBigIconButton sXq;
  private TextView sXr;
  private TextView sXs;
  private TextView sXt;
  private TextView sXu;
  private TextView sXv;
  private TextView sXw;
  private VoIPVideoView sXx;
  private f sXy;
  private Button sXz;
  private View.OnClickListener sYa;
  private View.OnClickListener sYb;
  private View.OnClickListener sYc;
  private View.OnClickListener sYd;
  private View.OnClickListener sYe;
  private View.OnClickListener sYf;
  private View.OnClickListener sYg;
  private View.OnClickListener sYh;
  private View.OnClickListener sYi;
  private View.OnClickListener sYj;
  private View.OnClickListener sYk;
  private Runnable sYl;
  int sYm;

  public VoipVideoFragment()
  {
    AppMethodBeat.i(4899);
    this.sXy = null;
    this.sXz = null;
    this.sXA = null;
    this.sXB = false;
    this.sXH = 0;
    this.sXI = false;
    this.sXJ = false;
    this.sXK = false;
    this.sXM = 0L;
    this.sXN = null;
    this.sXR = false;
    this.sXS = 0;
    this.sXT = 0;
    this.sXU = 0;
    this.iBO = 0L;
    this.sXV = 0;
    this.sXW = null;
    this.sXX = null;
    this.sXY = false;
    this.sXZ = new VoipVideoFragment.1(this);
    this.sYa = new VoipVideoFragment.12(this);
    this.sYb = new VoipVideoFragment.16(this);
    this.sYc = new VoipVideoFragment.17(this);
    this.sYd = new VoipVideoFragment.18(this);
    this.sYe = new VoipVideoFragment.19(this);
    this.sYf = new VoipVideoFragment.20(this);
    this.sYg = new VoipVideoFragment.21(this);
    this.sYh = new VoipVideoFragment.22(this);
    this.sYi = new VoipVideoFragment.2(this);
    this.sYj = new VoipVideoFragment.3(this);
    this.sYk = new VoipVideoFragment.7(this);
    this.sYl = new VoipVideoFragment.8(this);
    this.lmq = new VoipVideoFragment.9(this);
    this.oHc = null;
    this.sYm = 0;
    this.oHs = null;
    AppMethodBeat.o(4899);
  }

  private void GD(int paramInt)
  {
    AppMethodBeat.i(4922);
    this.sWv.cLc();
    this.sXl.setEnabled(false);
    this.sXp.setEnabled(false);
    this.sXo.setEnabled(false);
    this.sXn.setEnabled(false);
    this.sXm.setEnabled(false);
    this.sXk.setEnabled(false);
    this.sXq.setEnabled(false);
    this.sXj.setEnabled(false);
    this.sXi.setEnabled(false);
    switch (paramInt)
    {
    default:
    case 4105:
    }
    while (true)
    {
      if (this.sWu != null)
        this.sWu.S(true, false);
      AppMethodBeat.o(4922);
      return;
      this.sXe.setVisibility(0);
      this.sXe.setText(2131304447);
    }
  }

  private void arh()
  {
    AppMethodBeat.i(4923);
    if ((this.mTimer == null) || (this.sXJ))
      AppMethodBeat.o(4923);
    while (true)
    {
      return;
      if (-1L == this.sVZ)
        this.sVZ = bo.anT();
      this.sXM = this.sVZ;
      this.sXJ = true;
      TimerTask local13 = new TimerTask()
      {
        public final void run()
        {
          AppMethodBeat.i(4883);
          VoipVideoFragment.this.iGP.post(new VoipVideoFragment.13.1(this));
          AppMethodBeat.o(4883);
        }
      };
      this.mTimer.schedule(local13, 1000L, 1000L);
      this.sXW = com.tencent.mm.sdk.g.d.anM("VoipVideoFragment_cpuStatThread");
      this.sXW.start();
      this.sXX = new ap(this.sXW.getLooper(), new ap.a()
      {
        public final boolean BI()
        {
          AppMethodBeat.i(4884);
          boolean bool;
          if (VoipVideoFragment.A(VoipVideoFragment.this))
          {
            VoipVideoFragment.B(VoipVideoFragment.this);
            bool = true;
            AppMethodBeat.o(4884);
          }
          while (true)
          {
            return bool;
            bool = false;
            AppMethodBeat.o(4884);
          }
        }
      }
      , true);
      this.sXY = true;
      this.sXX.ae(1000L, 1000L);
      AppMethodBeat.o(4923);
    }
  }

  private void b(CaptureView paramCaptureView)
  {
    AppMethodBeat.i(4925);
    if ((this.sWp == null) || (paramCaptureView == null))
      AppMethodBeat.o(4925);
    while (true)
    {
      return;
      this.sWp.removeView(this.sRg);
      this.sRg = null;
      this.sRg = paramCaptureView;
      this.sWp.addView(paramCaptureView, new RelativeLayout.LayoutParams(1, 1));
      this.sRg.setVisibility(0);
      this.sRg.setAlpha(0.0F);
      ab.d("MicroMsg.Voip.VoipVideoFragment", "CaptureView added");
      AppMethodBeat.o(4925);
    }
  }

  private void cLe()
  {
    AppMethodBeat.i(4902);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "trigger dismiss bar");
    this.sXH += 1;
    this.iGP.postDelayed(this.sYl, 10000L);
    AppMethodBeat.o(4902);
  }

  private void cLf()
  {
    AppMethodBeat.i(4913);
    this.sWS.setVisibility(0);
    if (this.sWr != null)
      cLb();
    this.sWW.setVisibility(0);
    this.sWY.setVisibility(0);
    if ((ad.aox(this.edV)) && (!bo.ac(this.sWZ.getText())))
      this.sWZ.setVisibility(0);
    while (true)
    {
      this.sXa.setText(2131304434);
      this.sXc.setVisibility(0);
      this.sWX.setVisibility(0);
      this.sWv.a(this.sXb, sWo);
      this.sXq.setVisibility(8);
      this.sXp.setVisibility(8);
      this.sXl.setVisibility(8);
      this.sXo.setVisibility(8);
      this.sXn.setVisibility(0);
      this.sXk.setVisibility(0);
      this.sXm.setVisibility(0);
      this.sXj.setVisibility(8);
      if (this.sXL)
        this.sXi.setVisibility(0);
      this.sXf.setVisibility(8);
      if (com.tencent.mm.plugin.voip.b.cIj().sRK != null)
      {
        this.sXf.setVisibility(0);
        this.sXf.setText(com.tencent.mm.plugin.voip.b.cIj().sRK);
      }
      AppMethodBeat.o(4913);
      return;
      this.sWZ.setVisibility(8);
    }
  }

  private void cLg()
  {
    AppMethodBeat.i(4914);
    this.sXc.setVisibility(0);
    this.sWS.setVisibility(0);
    this.sXa.setText(2131304432);
    if ((ad.aox(this.edV)) && (!bo.ac(this.sWZ.getText())))
      this.sWZ.setVisibility(0);
    while (true)
    {
      this.sWq.setVisibility(8);
      this.sXe.setVisibility(8);
      this.sXf.setVisibility(8);
      if (com.tencent.mm.plugin.voip.b.cIj().sRK != null)
      {
        this.sXf.setVisibility(0);
        this.sXf.setText(com.tencent.mm.plugin.voip.b.cIj().sRK);
      }
      this.sWv.a(this.sXb, sWo);
      this.sXq.setVisibility(8);
      this.sXp.setVisibility(8);
      this.sXl.setVisibility(0);
      this.sXo.setVisibility(8);
      this.sXn.setVisibility(8);
      this.sXk.setVisibility(8);
      this.sXm.setVisibility(8);
      this.sXj.setVisibility(0);
      this.sXi.setVisibility(8);
      AppMethodBeat.o(4914);
      return;
      this.sWZ.setVisibility(8);
    }
  }

  private void cLh()
  {
    boolean bool1 = true;
    AppMethodBeat.i(4915);
    if (this.sWr != null)
      this.sWr.setVisibility(8);
    if (this.sWT.getVisibility() == 0)
    {
      AppMethodBeat.o(4915);
      return;
    }
    label57: label71: Point localPoint;
    if (this.sRm)
      if (!this.sXI)
      {
        bool2 = true;
        this.sXI = bool2;
        if (this.sXI)
          break label410;
        bool2 = true;
        localPoint = mA(bool2);
        this.sWT.gc(localPoint.x, localPoint.y);
        if (ae.gjk)
        {
          this.sXr.setVisibility(0);
          this.sXs.setVisibility(0);
          this.sXt.setVisibility(0);
          this.sXu.setVisibility(0);
          this.sXv.setVisibility(0);
          this.sXw.setVisibility(0);
        }
        this.sWW.setVisibility(8);
        this.sWS.setVisibility(0);
        this.sWT.setVisibility(0);
        this.sXP.setVisibility(0);
        this.sXd.setVisibility(0);
        this.sXh.setVisibility(0);
        this.sXq.setVisibility(0);
        this.sXp.setVisibility(0);
        this.sXl.setVisibility(8);
        this.sXo.setVisibility(0);
        this.sXn.setVisibility(8);
        this.sXk.setVisibility(8);
        this.sXm.setVisibility(8);
        this.sXj.setVisibility(8);
        this.sXi.setVisibility(8);
        setHWDecMode(this.sXS);
        ab.d("MicroMsg.Voip.VoipVideoFragment", "steve: showVideoTalking decMode:%d", new Object[] { Integer.valueOf(this.sXS) });
        if (this.sXI)
          break label446;
      }
    label410: label446: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localPoint = mA(bool2);
      ((MovableVideoView)this.sWT).ga(localPoint.x, localPoint.y);
      arh();
      if (ah.doB().getBoolean("voipfaceDebug", false))
      {
        this.sXz.setVisibility(0);
        this.sXA.setVisibility(0);
      }
      cLe();
      if (this.sWs == 4102)
        fZ(2131304341, 10000);
      AppMethodBeat.o(4915);
      break;
      bool2 = false;
      break label57;
      bool2 = false;
      break label71;
      if (!this.sXI);
      for (bool2 = true; ; bool2 = false)
      {
        this.sXI = bool2;
        this.sXx.setVisibility(8);
        break;
      }
    }
  }

  private void cLi()
  {
    AppMethodBeat.i(4921);
    this.sXa.setText(2131304498);
    this.sWv.a(this.sXb, sWo);
    AppMethodBeat.o(4921);
  }

  private void cLj()
  {
    AppMethodBeat.i(4924);
    VoipVideoFragment.15 local15 = new VoipVideoFragment.15(this);
    this.sWp.setOnClickListener(local15);
    AppMethodBeat.o(4924);
  }

  private Point mA(boolean paramBoolean)
  {
    AppMethodBeat.i(4928);
    int i = (int)(getActivity().getWindowManager().getDefaultDisplay().getHeight() / 5.0D);
    float f = i;
    com.tencent.mm.plugin.voip.b.cIj();
    Point localPoint = new Point((int)(f * r.mw(paramBoolean)), i);
    AppMethodBeat.o(4928);
    return localPoint;
  }

  public final void GC(int paramInt)
  {
  }

  public final void a(CaptureView paramCaptureView)
  {
    AppMethodBeat.i(4904);
    this.sRg = paramCaptureView;
    b(this.sRg);
    AppMethodBeat.o(4904);
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    AppMethodBeat.i(4916);
    if (!this.sXK)
      AppMethodBeat.o(4916);
    while (true)
    {
      return;
      if (OpenGlRender.taQ != 1)
        break label258;
      if (this.sYm < paramInt1 * paramInt2)
        this.oHc = null;
      if (this.oHc == null)
      {
        this.sYm = (paramInt1 * paramInt2);
        this.oHc = new int[this.sYm];
      }
      if ((com.tencent.mm.plugin.voip.b.cIj().a(paramArrayOfByte, (int)paramLong, paramInt3 & 0x1F, paramInt1, paramInt2, this.oHc, true) >= 0) && (this.oHc != null))
        break;
      AppMethodBeat.o(4916);
    }
    if (this.sXI)
      this.sWU.a(this.oHc, paramInt1, paramInt2, OpenGlRender.FLAG_RGBAClip + paramInt4 + paramInt5, true);
    while (true)
    {
      this.sXD += 1;
      if (paramInt6 > 0)
        this.sXC += 1;
      paramArrayOfByte = this.sXy;
      paramArrayOfByte.sZZ = paramInt1;
      paramArrayOfByte.taa = paramInt2;
      paramArrayOfByte = this.sXy;
      paramInt2 = this.sWp.getWidth();
      paramInt1 = this.sWp.getHeight();
      paramArrayOfByte.sZY = paramInt2;
      paramArrayOfByte.np = paramInt1;
      AppMethodBeat.o(4916);
      break;
      this.sWV.a(this.oHc, paramInt1, paramInt2, OpenGlRender.FLAG_RGBAClip + paramInt4 + paramInt5, true);
      continue;
      label258: if (OpenGlRender.taQ == 2)
        if (this.sXI)
          this.sWU.c(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.FLAG_NV21 + paramInt4 + paramInt5, true);
        else
          this.sWV.c(paramArrayOfByte, paramInt1, paramInt2, OpenGlRender.FLAG_NV21 + paramInt4 + paramInt5, true);
    }
  }

  protected final void abY(String paramString)
  {
    AppMethodBeat.i(4908);
    if (this.sXf != null)
    {
      this.sXf.setVisibility(0);
      this.sXf.setText(paramString);
    }
    AppMethodBeat.o(4908);
  }

  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4918);
    if (!this.sXK)
      AppMethodBeat.o(4918);
    while (true)
    {
      return;
      this.sXE += 1;
      if (OpenGlRender.taQ == 1)
      {
        if (this.sXI)
        {
          this.sWV.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.FLAG_RGBAClip + OpenGlRender.FLAG_Angle90, false);
          AppMethodBeat.o(4918);
        }
        else
        {
          this.sWU.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.FLAG_RGBAClip + OpenGlRender.FLAG_Angle90, false);
          AppMethodBeat.o(4918);
        }
      }
      else if (this.sXI)
      {
        this.sWV.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.FLAG_YV12Edge + OpenGlRender.FLAG_Angle90, false);
        AppMethodBeat.o(4918);
      }
      else
      {
        this.sWU.a(paramArrayOfInt, paramInt1, paramInt2, OpenGlRender.FLAG_YV12Edge + OpenGlRender.FLAG_Angle90, false);
        AppMethodBeat.o(4918);
      }
    }
  }

  public final void cJD()
  {
    AppMethodBeat.i(4919);
    if (!this.sXK)
      AppMethodBeat.o(4919);
    while (true)
    {
      return;
      this.sWV.cLJ();
      this.sWU.cLJ();
      AppMethodBeat.o(4919);
    }
  }

  public final void cKT()
  {
    AppMethodBeat.i(4926);
    if (this.sRg != null)
    {
      this.sWp.removeView(this.sRg);
      this.sWp.addView(this.sRg, new RelativeLayout.LayoutParams(1, 1));
      this.sRg.setVisibility(0);
      this.sRg.setAlpha(0.0F);
      ab.i("MicroMsg.Voip.VoipVideoFragment", "resetCaptureView");
    }
    AppMethodBeat.o(4926);
  }

  protected final void cKY()
  {
    AppMethodBeat.i(4911);
    if (this.nGB != null)
    {
      this.nGB.clearAnimation();
      this.nGB.setVisibility(8);
    }
    AppMethodBeat.o(4911);
  }

  public final void cKZ()
  {
    AppMethodBeat.i(4912);
    this.sWS.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    MovableVideoView localMovableVideoView = (MovableVideoView)this.sWT;
    ab.i("MicroMsg.MovableVideoView", "refrsh view %s, %s", new Object[] { Integer.valueOf(localMovableVideoView.mWidth), Integer.valueOf(localMovableVideoView.sZX) });
    localMovableVideoView.mScreenWidth = 0;
    localMovableVideoView.ga(localMovableVideoView.mWidth, localMovableVideoView.sZX);
    AppMethodBeat.o(4912);
  }

  public final void fY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4903);
    super.fY(paramInt1, paramInt2);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "newState: " + com.tencent.mm.plugin.voip.a.b.GK(paramInt2));
    if (this.sWp == null)
    {
      ab.i("MicroMsg.Voip.VoipVideoFragment", "fragment no create, return first, onCreateView will call it again");
      AppMethodBeat.o(4903);
      return;
    }
    switch (paramInt2)
    {
    default:
    case 0:
    case 2:
    case 256:
    case 6:
    case 260:
    case 8:
    case 262:
    case 4:
    case 258:
    }
    while (true)
    {
      AppMethodBeat.o(4903);
      break;
      cLg();
      AppMethodBeat.o(4903);
      break;
      cLf();
      AppMethodBeat.o(4903);
      break;
      cLj();
      cLh();
      AppMethodBeat.o(4903);
      break;
      GD(paramInt1);
      AppMethodBeat.o(4903);
      break;
      cLi();
    }
  }

  protected final void fZ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4909);
    if (this.sXe == null)
      AppMethodBeat.o(4909);
    while (true)
    {
      return;
      this.sXe.setText(paramInt1);
      this.sXe.setVisibility(0);
      this.sXe.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      this.sXe.setBackgroundResource(2130840637);
      this.sXe.setCompoundDrawables(null, null, null, null);
      this.sXe.setCompoundDrawablePadding(0);
      this.iGP.removeCallbacks(this.lmq);
      if (-1 != paramInt2)
        this.iGP.postDelayed(this.lmq, paramInt2);
      AppMethodBeat.o(4909);
    }
  }

  public final OpenGlRender getFilterData()
  {
    if (this.sXI);
    for (OpenGlRender localOpenGlRender = this.sWU; ; localOpenGlRender = this.sWV)
      return localOpenGlRender;
  }

  protected final void mz(boolean paramBoolean)
  {
    AppMethodBeat.i(4910);
    if (this.nGB != null)
    {
      if (!paramBoolean)
        break label49;
      this.nGB.setText(2131306060);
    }
    while (true)
    {
      this.nGB.clearAnimation();
      this.nGB.setVisibility(0);
      AppMethodBeat.o(4910);
      return;
      label49: this.nGB.setText(2131306059);
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(4900);
    this.sWp = ((RelativeLayout)paramLayoutInflater.inflate(2130971033, paramViewGroup, false));
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu"))
      ((RelativeLayout)this.sWp.findViewById(2131828532)).setPadding(0, 0, 0, BackwardSupportUtil.b.b(getActivity(), 40.0F));
    this.sWq = ((ImageView)this.sWp.findViewById(2131828511));
    this.sWr = ((ImageView)this.sWp.findViewById(2131828514));
    this.sXg = ((RelativeLayout)this.sWp.findViewById(2131828516));
    this.sWS = ((OpenGlView)this.sWp.findViewById(2131828513));
    this.sWS.gb(mScreenWidth, mScreenHeight);
    this.sXP = ((MMTextureView)this.sWp.findViewById(2131828515));
    this.sXP.setVisibility(0);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "steve: onCreateView!");
    if (this.sXP != null)
      ab.i("MicroMsg.Voip.VoipVideoFragment", "hwView creat ok");
    this.sXq = ((VoipBigIconButton)this.sWp.findViewById(2131828543));
    this.sXq.setOnClickListener(this.sYk);
    this.sXp = ((VoipBigIconButton)this.sWp.findViewById(2131828542));
    this.sXp.setOnClickListener(this.sYa);
    this.sXl = ((VoipBigIconButton)this.sWp.findViewById(2131828533));
    this.sXl.setOnClickListener(this.sYf);
    this.sXo = ((VoipBigIconButton)this.sWp.findViewById(2131828539));
    this.sXo.setOnClickListener(this.sXZ);
    this.sXn = ((VoipBigIconButton)this.sWp.findViewById(2131828537));
    this.sXn.setOnClickListener(this.sYd);
    this.sXk = ((VoipSmallIconButton)this.sWp.findViewById(2131828538));
    this.sXk.setOnClickListener(this.sYc);
    this.sXm = ((VoipBigIconButton)this.sWp.findViewById(2131828535));
    this.sXm.setOnClickListener(this.sYe);
    this.sXj = ((VoipSmallIconButton)this.sWp.findViewById(2131828534));
    this.sXj.setOnClickListener(this.sYb);
    boolean bool;
    if (com.tencent.mm.plugin.voip.a.d.vn("VOIPBlockIgnoreButton") == 0)
    {
      bool = true;
      this.sXL = bool;
      this.sXi = ((VoipSmallIconButton)this.sWp.findViewById(2131828536));
      this.sXi.setOnClickListener(this.sYh);
      if (!this.sXL)
        this.sXi.setVisibility(8);
      this.sXd = ((TextView)this.sWp.findViewById(2131828541));
      this.sWW = this.sWp.findViewById(2131828518);
      this.sWX = ((ImageView)this.sWp.findViewById(2131828519));
      a.b.a(this.sWX, this.edV, 0.0588235F, true);
      this.sWY = ((TextView)this.sWp.findViewById(2131828521));
      this.sWZ = ((TextView)this.sWp.findViewById(2131828522));
      this.sXa = ((TextView)this.sWp.findViewById(2131828524));
      this.sXb = ((TextView)this.sWp.findViewById(2131828525));
      this.sXc = this.sWp.findViewById(2131828523);
      j(this.sXb);
      this.sXe = ((TextView)this.sWp.findViewById(2131828545));
      this.sXf = ((TextView)this.sWp.findViewById(2131828544));
      this.sXh = ((Button)this.sWp.findViewById(2131828517));
      this.nGB = ((TextView)this.sWp.findViewById(2131825090));
      if (ae.gjk)
      {
        this.sXr = ((TextView)this.sWp.findViewById(2131828526));
        this.sXs = ((TextView)this.sWp.findViewById(2131828527));
        this.sXt = ((TextView)this.sWp.findViewById(2131828528));
        this.sXu = ((TextView)this.sWp.findViewById(2131828529));
        this.sXv = ((TextView)this.sWp.findViewById(2131828530));
        this.sXw = ((TextView)this.sWp.findViewById(2131828531));
      }
      this.sXz = ((Button)this.sWp.findViewById(2131828546));
      this.sXA = ((Button)this.sWp.findViewById(2131828547));
      this.sXz.setVisibility(8);
      this.sXA.setVisibility(8);
      this.sXz.setOnClickListener(this.sYi);
      this.sXA.setOnClickListener(this.sYj);
      this.sXy = new f(getActivity());
      this.sWp.addView(this.sXy);
      this.sXy.setVisibility(8);
      this.sXh.setOnClickListener(this.sYg);
      b(this.sRg);
      int i = t.hF(getActivity());
      ab.d("MicroMsg.Voip.VoipVideoFragment", "statusHeight: ".concat(String.valueOf(i)));
      ae(this.sXh, i);
      ae(this.sWp.findViewById(2131828540), i);
      ae(this.sWW, i);
      this.sXD = 0;
      this.sXC = 0;
      this.sXE = 0;
      this.sXF = 0;
      this.sXG = 0;
      this.sXU = 0;
      this.sXV = 0;
      paramLayoutInflater = (WindowManager)getActivity().getSystemService("window");
      int j = paramLayoutInflater.getDefaultDisplay().getHeight() / 5;
      i = paramLayoutInflater.getDefaultDisplay().getWidth() * j / paramLayoutInflater.getDefaultDisplay().getHeight();
      this.sWT = new MovableVideoView(getActivity().getApplicationContext());
      ((MovableVideoView)this.sWT).ga(i, j);
      this.sWT.setVisibility(8);
      this.sWU = new OpenGlRender(this.sWT, OpenGlRender.RenderRemote);
      this.sWT.setRenderer(this.sWU);
      this.sWT.setRenderMode(0);
      this.sWV = new OpenGlRender(this.sWS, OpenGlRender.RenderLocal);
      this.sWS.setRenderer(this.sWV);
      this.sWS.setRenderMode(0);
      this.sWS.setVisibility(0);
      ab.i("MicroMsg.Voip.VoipVideoFragment", "steve: before AvcDecoder init");
      this.sXQ = new MovableTextureView(getActivity().getApplicationContext());
      paramBundle = (MovableTextureView)this.sXQ;
      paramBundle.mWidth = i;
      paramBundle.sZX = j;
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      paramViewGroup = (WindowManager)paramBundle.getContext().getSystemService("window");
      if (paramBundle.mScreenWidth == 0)
      {
        paramBundle.mScreenWidth = paramViewGroup.getDefaultDisplay().getWidth();
        paramBundle.mScreenHeight = paramViewGroup.getDefaultDisplay().getHeight();
      }
      paramLayoutInflater = new RelativeLayout.LayoutParams(i, j);
      paramLayoutInflater.topMargin = (com.tencent.mm.bz.a.fromDPToPix(paramBundle.getContext(), 12) + t.hF(paramBundle.getContext()));
      paramLayoutInflater.leftMargin = (paramBundle.mScreenWidth - paramBundle.mWidth - paramLayoutInflater.topMargin + t.hF(paramBundle.getContext()));
      paramBundle.setLayoutParams(paramLayoutInflater);
      paramBundle.taq = (paramBundle.mScreenHeight - paramBundle.sZX);
      paramBundle.tar = (paramBundle.mScreenWidth - paramBundle.mWidth);
      paramViewGroup.getDefaultDisplay().getMetrics(localDisplayMetrics);
      ab.i("MicroMsg.MovableTextureView", "steve: Init MovableTextureView successfully! size=" + i + " x " + j);
      this.sXQ.setVisibility(8);
      ((c)this.sVY.get()).b(this.sXP);
      if (!Build.MODEL.equals("Nexus 6"))
        break label1741;
      this.sWT.setZOrderOnTop(true);
    }
    while (true)
    {
      this.sWp.addView(this.sWT);
      this.sWT.setOnClickListener(new VoipVideoFragment.4(this));
      this.sXQ.setOnClickListener(new VoipVideoFragment.5(this));
      paramLayoutInflater = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.edV);
      this.sWY.setText(com.tencent.mm.pluginsdk.ui.e.j.b(getActivity(), s.a(paramLayoutInflater, this.edV), this.sWY.getTextSize()));
      paramLayoutInflater = com.tencent.mm.openim.room.a.a.A(paramLayoutInflater);
      if (!bo.isNullOrNil(paramLayoutInflater))
        this.sWZ.setText(paramLayoutInflater);
      if (this.sRm)
        this.iGP.postDelayed(new VoipVideoFragment.6(this), 2000L);
      this.sXx = ((VoIPVideoView)this.sWp.findViewById(2131828512));
      this.mTimer = new Timer("VoIP_video_talking_count");
      ab.i("MicroMsg.Voip.VoipVideoFragment", "onCreateView, voipBeautyMode: %s", new Object[] { Integer.valueOf(this.sXT) });
      this.sWV.setVoipBeauty(this.sXT);
      this.sWU.setVoipBeauty(this.sXT);
      this.sXK = true;
      fY(0, this.mStatus);
      paramLayoutInflater = this.sWp;
      AppMethodBeat.o(4900);
      return paramLayoutInflater;
      bool = false;
      break;
      label1741: this.sWT.setZOrderMediaOverlay(true);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(4901);
    this.sXJ = false;
    super.onDestroy();
    AppMethodBeat.o(4901);
  }

  public void onDetach()
  {
    AppMethodBeat.i(4927);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "onDetach");
    if (this.mTimer != null)
    {
      this.mTimer.cancel();
      this.mTimer = null;
    }
    if ((this.sXX != null) && (this.sXW != null))
    {
      this.sXX.stopTimer();
      this.sXW.quit();
    }
    this.sXY = false;
    super.onDetach();
    AppMethodBeat.o(4927);
  }

  public void onStart()
  {
    AppMethodBeat.i(4907);
    this.sWV.taA = true;
    this.sWU.taA = true;
    super.onStart();
    AppMethodBeat.o(4907);
  }

  public void onStop()
  {
    AppMethodBeat.i(4906);
    this.sWV.cLI();
    this.sWU.cLI();
    super.onStop();
    AppMethodBeat.o(4906);
  }

  public final void setHWDecMode(int paramInt)
  {
    AppMethodBeat.i(4917);
    boolean bool;
    if (this.iGP != null)
    {
      if ((paramInt & 0x1) == 0)
        break label73;
      bool = true;
      ab.i("MicroMsg.Voip.VoipVideoFragment", "setHWDecMode, hwdec: %s", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        break label78;
      this.iGP.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(4879);
          VoipVideoFragment.this.sXP.setVisibility(4);
          VoipVideoFragment.this.sXQ.setVisibility(4);
          VoipVideoFragment.m(VoipVideoFragment.this).setVisibility(0);
          VoipVideoFragment.m(VoipVideoFragment.this).bringToFront();
          VoipVideoFragment.n(VoipVideoFragment.this).setVisibility(0);
          AppMethodBeat.o(4879);
        }
      });
    }
    while (true)
    {
      this.sXS = paramInt;
      AppMethodBeat.o(4917);
      return;
      label73: bool = false;
      break;
      label78: ab.i("MicroMsg.Voip.VoipVideoFragment", "use hw texture");
      this.iGP.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(4880);
          if (VoipVideoFragment.l(VoipVideoFragment.this))
          {
            if (VoipVideoFragment.i(VoipVideoFragment.this))
            {
              VoipVideoFragment.this.sXQ.setVisibility(4);
              VoipVideoFragment.this.sXP.setVisibility(0);
              ab.i("MicroMsg.Voip.VoipVideoFragment", "steve: change to big hw texture view!");
              RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
              localLayoutParams.addRule(13);
              int i = VoipVideoFragment.this.sWp.indexOfChild(VoipVideoFragment.n(VoipVideoFragment.this));
              VoipVideoFragment.this.sWp.removeView(VoipVideoFragment.this.sXQ);
              VoipVideoFragment.this.sWp.addView(VoipVideoFragment.this.sXP, i + 1, localLayoutParams);
              ((c)VoipVideoFragment.this.sVY.get()).b(VoipVideoFragment.this.sXP);
            }
            VoipVideoFragment.n(VoipVideoFragment.this).setVisibility(4);
            VoipVideoFragment.m(VoipVideoFragment.this).setVisibility(0);
            VoipVideoFragment.q(VoipVideoFragment.this);
            VoipVideoFragment.this.sXP.setVisibility(0);
            ab.i("MicroMsg.Voip.VoipVideoFragment", "set big hw view visible");
            VoipVideoFragment.a(VoipVideoFragment.this, false);
            AppMethodBeat.o(4880);
          }
          while (true)
          {
            return;
            if (!VoipVideoFragment.i(VoipVideoFragment.this))
            {
              VoipVideoFragment.this.sXP.setVisibility(4);
              VoipVideoFragment.this.sWp.removeView(VoipVideoFragment.this.sXP);
              VoipVideoFragment.this.sWp.addView(VoipVideoFragment.this.sXQ);
              ((c)VoipVideoFragment.this.sVY.get()).b(VoipVideoFragment.this.sXQ);
            }
            VoipVideoFragment.m(VoipVideoFragment.this).setVisibility(4);
            VoipVideoFragment.this.sXQ.setVisibility(0);
            ab.i("MicroMsg.Voip.VoipVideoFragment", "set big hw view visible");
            VoipVideoFragment.this.sXQ.bringToFront();
            VoipVideoFragment.n(VoipVideoFragment.this).setVisibility(0);
            VoipVideoFragment.a(VoipVideoFragment.this, true);
            AppMethodBeat.o(4880);
          }
        }
      });
    }
  }

  public final void setMute(boolean paramBoolean)
  {
  }

  public final void setVoipBeauty(int paramInt)
  {
    AppMethodBeat.i(4920);
    ab.i("MicroMsg.Voip.VoipVideoFragment", "setVoipBeauty isON:%d, mInitDone:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.sXK) });
    this.sXT = paramInt;
    if (!this.sXK)
      AppMethodBeat.o(4920);
    while (true)
    {
      return;
      this.sWV.setVoipBeauty(this.sXT);
      this.sWU.setVoipBeauty(this.sXT);
      AppMethodBeat.o(4920);
    }
  }

  public final void uninit()
  {
    AppMethodBeat.i(4905);
    this.sWT.setVisibility(4);
    if (this.sRg != null)
    {
      this.sWp.removeView(this.sRg);
      this.sRg = null;
      ab.d("MicroMsg.Voip.VoipVideoFragment", "CaptureView removed");
    }
    if (this.sXO != null)
    {
      com.tencent.mm.sdk.g.d.xDG.remove(this.sXO);
      this.sXO = null;
    }
    super.uninit();
    AppMethodBeat.o(4905);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVideoFragment
 * JD-Core Version:    0.6.2
 */