package com.tencent.mm.plugin.voip.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
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
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.openim.room.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.a.d;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.video.CaptureView;
import com.tencent.mm.plugin.voip.video.OpenGlRender;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.t;
import java.lang.ref.WeakReference;
import java.util.Timer;

public class VoipVoiceFragment extends VoipBaseFragment
{
  private Runnable lmq;
  private boolean mIsMute;
  private Timer mTimer;
  private TextView nGB;
  private int sRr;
  private boolean sXJ;
  private boolean sXL;
  private Button sXh;
  private RelativeLayout sYA;
  private MMCheckBox sYB;
  private TextView sYC;
  private RelativeLayout sYD;
  private MMCheckBox sYE;
  private TextView sYF;
  private TextView sYG;
  private TextView sYH;
  private VoipBigIconButton sYI;
  private VoipBigIconButton sYJ;
  private VoipBigIconButton sYK;
  private VoipBigIconButton sYL;
  private VoipSmallIconButton sYM;
  private boolean sYN;
  private OpenGlRender sYO;
  private View.OnClickListener sYP;
  private View.OnClickListener sYQ;
  private View.OnClickListener sYR;
  private View.OnClickListener sYS;
  private View.OnClickListener sYT;
  private View.OnClickListener sYU;
  private View.OnClickListener sYg;
  private View.OnClickListener sYh;
  private View sYs;
  private ImageView sYt;
  private TextView sYu;
  private TextView sYv;
  private TextView sYw;
  private TextView sYx;
  private TextView sYy;
  private View sYz;

  public VoipVoiceFragment()
  {
    AppMethodBeat.i(4949);
    this.sRr = 1;
    this.mIsMute = false;
    this.sXJ = false;
    this.sXL = false;
    this.sYN = false;
    this.sYg = new VoipVoiceFragment.1(this);
    this.sYh = new VoipVoiceFragment.3(this);
    this.sYP = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(4942);
        boolean bool = VoipVoiceFragment.a(VoipVoiceFragment.this).isChecked();
        ab.i("MicroMsg.VoipVoiceFragment", "onSpeakerClick, status: %b", new Object[] { Boolean.valueOf(bool) });
        VoipVoiceFragment.a(VoipVoiceFragment.this).setEnabled(false);
        if ((VoipVoiceFragment.this.sVY != null) && (VoipVoiceFragment.this.sVY.get() != null))
          ((c)VoipVoiceFragment.this.sVY.get()).ms(bool);
        paramAnonymousView = VoipVoiceFragment.this;
        if (bool);
        for (int i = 1; ; i = 2)
        {
          VoipVoiceFragment.a(paramAnonymousView, i);
          VoipVoiceFragment.a(VoipVoiceFragment.this).setEnabled(true);
          AppMethodBeat.o(4942);
          return;
        }
      }
    };
    this.sYQ = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(4943);
        boolean bool = VoipVoiceFragment.b(VoipVoiceFragment.this).isChecked();
        ab.i("MicroMsg.VoipVoiceFragment", "onMicClick, status: %b", new Object[] { Boolean.valueOf(bool) });
        VoipVoiceFragment.b(VoipVoiceFragment.this).setEnabled(false);
        if ((VoipVoiceFragment.this.sVY != null) && (VoipVoiceFragment.this.sVY.get() != null))
          ((c)VoipVoiceFragment.this.sVY.get()).jg(bool);
        VoipVoiceFragment.a(VoipVoiceFragment.this, bool);
        VoipVoiceFragment.b(VoipVoiceFragment.this).setEnabled(true);
        AppMethodBeat.o(4943);
      }
    };
    this.sYR = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(4944);
        ab.i("MicroMsg.VoipVoiceFragment", "click accept voice invite button");
        h.pYm.a(11526, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(2) });
        if ((VoipVoiceFragment.this.sVY != null) && (VoipVoiceFragment.this.sVY.get() != null) && (((c)VoipVoiceFragment.this.sVY.get()).cJq()))
        {
          VoipVoiceFragment.c(VoipVoiceFragment.this).setEnabled(false);
          VoipVoiceFragment.d(VoipVoiceFragment.this).setText(2131304498);
          VoipVoiceFragment.this.sWv.a(VoipVoiceFragment.e(VoipVoiceFragment.this), VoipBaseFragment.sWo);
          VoipVoiceFragment.f(VoipVoiceFragment.this).setVisibility(0);
          VoipVoiceFragment.g(VoipVoiceFragment.this).setVisibility(8);
          VoipVoiceFragment.c(VoipVoiceFragment.this).setVisibility(8);
          VoipVoiceFragment.h(VoipVoiceFragment.this).setVisibility(8);
          VoipVoiceFragment.i(VoipVoiceFragment.this).setVisibility(0);
        }
        AppMethodBeat.o(4944);
      }
    };
    this.sYS = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(4945);
        ab.i("MicroMsg.VoipVoiceFragment", "click reject voice invite button");
        h.pYm.a(11526, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().cJZ()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cKa()), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().cIK()), Integer.valueOf(5) });
        if ((VoipVoiceFragment.this.sVY != null) && (VoipVoiceFragment.this.sVY.get() != null) && (((c)VoipVoiceFragment.this.sVY.get()).cJp()))
        {
          VoipVoiceFragment.h(VoipVoiceFragment.this).setEnabled(false);
          VoipVoiceFragment.c(VoipVoiceFragment.this).setEnabled(false);
          VoipVoiceFragment.this.fZ(2131304459, -1);
          if (VoipVoiceFragment.this.sWu != null)
            VoipVoiceFragment.this.sWu.S(true, false);
        }
        AppMethodBeat.o(4945);
      }
    };
    this.sYT = new VoipVoiceFragment.8(this);
    this.sYU = new VoipVoiceFragment.9(this);
    this.lmq = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(4948);
        if ((VoipVoiceFragment.this.getActivity() == null) || (VoipVoiceFragment.this.getActivity().isFinishing()))
          AppMethodBeat.o(4948);
        while (true)
        {
          return;
          VoipVoiceFragment.k(VoipVoiceFragment.this).setVisibility(8);
          AppMethodBeat.o(4948);
        }
      }
    };
    AppMethodBeat.o(4949);
  }

  private void GE(int paramInt)
  {
    AppMethodBeat.i(4955);
    this.sYs.setVisibility(0);
    this.sYw.setVisibility(8);
    this.sYx.setText(2131304432);
    this.sWv.a(this.sYy, sWo);
    this.sYz.setVisibility(0);
    if (this.sYv != null)
    {
      if ((!ad.aox(this.edV)) || (bo.ac(this.sYv.getText())))
        break label279;
      this.sYv.setVisibility(0);
    }
    while (true)
    {
      this.sYI.setVisibility(8);
      this.sYJ.setVisibility(8);
      this.sYK.setVisibility(8);
      this.sYL.setVisibility(0);
      this.sYM.setVisibility(8);
      this.sYD.setVisibility(0);
      this.sYE.setEnabled(false);
      this.sYE.setBackgroundResource(2130840646);
      this.sYF.setTextColor(1728053247);
      cLp();
      this.sYE.setChecked(this.mIsMute);
      this.sYA.setVisibility(0);
      if ((paramInt != 4097) && (2 == this.sRr))
        fZ(2131304348, 10000);
      cLa();
      this.sYH.setVisibility(8);
      if (com.tencent.mm.plugin.voip.b.cIj().sRK != null)
      {
        this.sYH.setVisibility(0);
        this.sYH.setText(com.tencent.mm.plugin.voip.b.cIj().sRK);
      }
      if (sWt == 2)
        this.sYN = true;
      AppMethodBeat.o(4955);
      return;
      label279: this.sYv.setVisibility(8);
    }
  }

  private void arh()
  {
    AppMethodBeat.i(4966);
    if ((this.mTimer == null) || (this.sXJ))
      AppMethodBeat.o(4966);
    while (true)
    {
      return;
      if (-1L == this.sVZ)
        this.sVZ = bo.anT();
      this.sXJ = true;
      VoipVoiceFragment.2 local2 = new VoipVoiceFragment.2(this);
      this.mTimer.schedule(local2, 50L, 1000L);
      AppMethodBeat.o(4966);
    }
  }

  private void cLg()
  {
    AppMethodBeat.i(4954);
    this.sYs.setVisibility(0);
    this.sYw.setVisibility(8);
    this.sYx.setText(2131304452);
    this.sWv.a(this.sYy, sWo);
    this.sYz.setVisibility(0);
    this.sYI.setVisibility(8);
    this.sYJ.setVisibility(8);
    this.sYK.setVisibility(8);
    this.sYL.setVisibility(0);
    this.sYM.setVisibility(8);
    this.sYD.setVisibility(0);
    this.sYE.setEnabled(false);
    this.sYE.setBackgroundResource(2130840646);
    this.sYF.setTextColor(1728053247);
    this.sYH.setVisibility(8);
    if (com.tencent.mm.plugin.voip.b.cIj().sRK != null)
    {
      this.sYH.setVisibility(0);
      this.sYH.setText(com.tencent.mm.plugin.voip.b.cIj().sRK);
    }
    cLp();
    this.sYE.setChecked(this.mIsMute);
    this.sYA.setVisibility(0);
    if (2 == this.sRr)
      fZ(2131304348, 10000);
    cLa();
    AppMethodBeat.o(4954);
  }

  private void cLk()
  {
    AppMethodBeat.i(4956);
    this.sYx.setText(2131304498);
    this.sWv.a(this.sYy, sWo);
    this.sYI.setVisibility(8);
    this.sYJ.setVisibility(8);
    this.sYK.setVisibility(0);
    this.sYL.setVisibility(8);
    this.sYM.setVisibility(8);
    AppMethodBeat.o(4956);
  }

  private void cLl()
  {
    AppMethodBeat.i(4957);
    this.sWv.cLc();
    this.sYK.setEnabled(false);
    this.sYL.setEnabled(false);
    this.sYI.setEnabled(false);
    this.sYJ.setEnabled(false);
    this.sYM.setEnabled(false);
    AppMethodBeat.o(4957);
  }

  private void cLm()
  {
    AppMethodBeat.i(4958);
    this.sYs.setVisibility(0);
    this.sYz.setVisibility(0);
    this.sYx.setText(2131304433);
    this.sWv.a(this.sYy, sWo);
    if (this.sYv != null)
    {
      if ((!ad.aox(this.edV)) || (bo.ac(this.sYv.getText())))
        break label211;
      this.sYv.setVisibility(0);
    }
    while (true)
    {
      cLp();
      this.sYI.setVisibility(0);
      this.sYJ.setVisibility(0);
      this.sYK.setVisibility(8);
      this.sYL.setVisibility(8);
      if (this.sXL)
        this.sYM.setVisibility(0);
      if (sWt == 256)
      {
        this.sYN = true;
        fZ(2131304349, 10000);
      }
      cLa();
      this.sYH.setVisibility(8);
      if (com.tencent.mm.plugin.voip.b.cIj().sRK != null)
      {
        this.sYH.setVisibility(0);
        this.sYH.setText(com.tencent.mm.plugin.voip.b.cIj().sRK);
      }
      AppMethodBeat.o(4958);
      return;
      label211: this.sYv.setVisibility(8);
    }
  }

  private void cLn()
  {
    AppMethodBeat.i(4959);
    this.sYs.setVisibility(0);
    this.sYz.setVisibility(0);
    this.sYx.setText(2131304498);
    this.sWv.a(this.sYy, sWo);
    this.sYI.setVisibility(8);
    this.sYJ.setVisibility(8);
    this.sYK.setVisibility(0);
    this.sYL.setVisibility(8);
    this.sYM.setVisibility(8);
    fZ(2131304348, 10000);
    cLa();
    AppMethodBeat.o(4959);
  }

  private void cLo()
  {
    AppMethodBeat.i(4960);
    this.sYL.setVisibility(8);
    this.sYI.setVisibility(8);
    this.sYJ.setVisibility(8);
    this.sYM.setVisibility(8);
    this.sYz.setVisibility(8);
    this.sWv.cLc();
    this.sYK.setVisibility(0);
    this.sYw.setVisibility(0);
    this.sYD.setVisibility(0);
    this.sYA.setVisibility(0);
    this.sYs.setVisibility(0);
    this.sXh.setVisibility(0);
    this.sYE.setEnabled(true);
    this.sYE.setBackgroundResource(2130840635);
    this.sYF.setTextColor(-1);
    cLp();
    this.sYE.setChecked(this.mIsMute);
    if (!this.sYN)
      fZ(2131304341, 10000);
    while (true)
    {
      cLa();
      arh();
      this.sYH.setVisibility(8);
      if (com.tencent.mm.plugin.voip.b.cIj().sRK != null)
      {
        this.sYH.setVisibility(0);
        this.sYH.setText(com.tencent.mm.plugin.voip.b.cIj().sRK);
      }
      AppMethodBeat.o(4960);
      return;
      if (2 == this.sRr)
        fZ(2131304343, 10000);
      else if (3 == this.sRr)
        fZ(2131304342, 10000);
    }
  }

  private void cLp()
  {
    boolean bool = false;
    AppMethodBeat.i(4968);
    if ((this.sYB == null) || (this.sYC == null))
    {
      ab.e("MicroMsg.VoipVoiceFragment", "speaker is null");
      AppMethodBeat.o(4968);
    }
    while (true)
    {
      return;
      if ((4 == this.sRr) || (3 == this.sRr))
      {
        this.sYB.setEnabled(false);
        this.sYC.setTextColor(1728053247);
        this.sYB.setBackgroundResource(2130840632);
        AppMethodBeat.o(4968);
      }
      else
      {
        if (this.sRr == 1)
          bool = true;
        this.sYB.setBackgroundResource(2130840636);
        this.sYB.setEnabled(true);
        this.sYC.setTextColor(-1);
        this.sYB.setChecked(bool);
        AppMethodBeat.o(4968);
      }
    }
  }

  public final void GC(int paramInt)
  {
    AppMethodBeat.i(4967);
    this.sRr = paramInt;
    cLp();
    AppMethodBeat.o(4967);
  }

  public final void a(CaptureView paramCaptureView)
  {
  }

  public final void a(byte[] paramArrayOfByte, long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
  }

  protected final void abY(String paramString)
  {
    AppMethodBeat.i(4961);
    if (this.sYH != null)
    {
      this.sYH.setVisibility(0);
      this.sYH.setText(paramString);
    }
    AppMethodBeat.o(4961);
  }

  public final void c(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public final void cJD()
  {
  }

  protected final void cKY()
  {
    AppMethodBeat.i(4964);
    if (this.nGB != null)
    {
      this.nGB.clearAnimation();
      this.nGB.setVisibility(8);
    }
    AppMethodBeat.o(4964);
  }

  public final void cKZ()
  {
  }

  public final void fY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4952);
    super.fY(paramInt1, paramInt2);
    ab.i("MicroMsg.VoipVoiceFragment", "newState: " + com.tencent.mm.plugin.voip.a.b.GK(paramInt2) + ", action: " + com.tencent.mm.plugin.voip.a.b.GK(paramInt1) + ", lastStatus: " + com.tencent.mm.plugin.voip.a.b.GK(sWt) + ", isSwitchFromVideo: " + this.sYN);
    if (this.sWp == null)
    {
      ab.i("MicroMsg.VoipVoiceFragment", "fragment no create, return first, onCreateView will call it again");
      AppMethodBeat.o(4952);
      return;
    }
    switch (paramInt2)
    {
    default:
    case 1:
    case 3:
    case 5:
    case 7:
    case 261:
    case 8:
    case 262:
    case 257:
    case 259:
    }
    while (true)
    {
      AppMethodBeat.o(4952);
      break;
      cLg();
      AppMethodBeat.o(4952);
      break;
      GE(paramInt1);
      AppMethodBeat.o(4952);
      break;
      cLk();
      AppMethodBeat.o(4952);
      break;
      cLo();
      AppMethodBeat.o(4952);
      break;
      cLl();
      AppMethodBeat.o(4952);
      break;
      cLm();
      AppMethodBeat.o(4952);
      break;
      cLn();
    }
  }

  protected final void fZ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4962);
    if (this.sYG == null)
      AppMethodBeat.o(4962);
    while (true)
    {
      return;
      this.sYG.setText(paramInt1);
      this.sYG.setVisibility(0);
      this.sYG.setShadowLayer(0.0F, 0.0F, 0.0F, 0);
      this.sYG.setBackgroundResource(2130840637);
      this.sYG.setCompoundDrawables(null, null, null, null);
      this.sYG.setCompoundDrawablePadding(0);
      this.iGP.removeCallbacks(this.lmq);
      if (-1 != paramInt2)
        this.iGP.postDelayed(this.lmq, paramInt2);
      AppMethodBeat.o(4962);
    }
  }

  public final OpenGlRender getFilterData()
  {
    return this.sYO;
  }

  protected final void mz(boolean paramBoolean)
  {
    AppMethodBeat.i(4963);
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
      AppMethodBeat.o(4963);
      return;
      label49: this.nGB.setText(2131306059);
    }
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(4951);
    paramBundle = new DisplayMetrics();
    ((WindowManager)paramLayoutInflater.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(paramBundle);
    ab.i("MicroMsg.VoipVoiceFragment", "dpi: " + paramBundle.heightPixels / paramBundle.density);
    if (paramBundle.heightPixels / paramBundle.density <= 540.0F)
    {
      this.sWp = ((RelativeLayout)paramLayoutInflater.inflate(2130971035, paramViewGroup, false));
      this.sWq = ((ImageView)this.sWp.findViewById(2131828511));
      this.sYs = this.sWp.findViewById(2131828548);
      this.sYt = ((ImageView)this.sWp.findViewById(2131828549));
      a.b.a(this.sYt, this.edV, 0.0375F, true);
      this.sYu = ((TextView)this.sWp.findViewById(2131828551));
      this.sYu.setText(com.tencent.mm.pluginsdk.ui.e.j.b(getActivity(), s.mJ(this.edV), this.sYu.getTextSize()));
      this.sYv = ((TextView)this.sWp.findViewById(2131828552));
      this.sYw = ((TextView)this.sWp.findViewById(2131828564));
      this.sYx = ((TextView)this.sWp.findViewById(2131828554));
      this.sYy = ((TextView)this.sWp.findViewById(2131828555));
      this.sYz = this.sWp.findViewById(2131828553);
      this.sYG = ((TextView)this.sWp.findViewById(2131828563));
      this.sYH = ((TextView)this.sWp.findViewById(2131828562));
      this.nGB = ((TextView)this.sWp.findViewById(2131825090));
      j(this.sYy);
      this.sYD = ((RelativeLayout)this.sWp.findViewById(2131828565));
      this.sYE = ((MMCheckBox)this.sWp.findViewById(2131828566));
      this.sYE.setChecked(this.mIsMute);
      this.sYF = ((TextView)this.sWp.findViewById(2131828567));
      this.sYF.setText(2131304439);
      this.sYA = ((RelativeLayout)this.sWp.findViewById(2131828568));
      this.sYB = ((MMCheckBox)this.sWp.findViewById(2131828569));
      this.sYC = ((TextView)this.sWp.findViewById(2131828570));
      this.sYC.setText(2131304469);
      cLp();
      this.sYI = ((VoipBigIconButton)this.sWp.findViewById(2131828558));
      this.sYI.setOnClickListener(this.sYR);
      this.sYJ = ((VoipBigIconButton)this.sWp.findViewById(2131828557));
      this.sYJ.setOnClickListener(this.sYS);
      this.sYK = ((VoipBigIconButton)this.sWp.findViewById(2131828560));
      this.sYK.setOnClickListener(this.sYT);
      this.sYL = ((VoipBigIconButton)this.sWp.findViewById(2131828561));
      this.sYL.setOnClickListener(this.sYU);
      if (d.vn("VOIPBlockIgnoreButton") != 0)
        break label908;
    }
    label908: for (boolean bool = true; ; bool = false)
    {
      this.sXL = bool;
      this.sYM = ((VoipSmallIconButton)this.sWp.findViewById(2131828559));
      this.sYM.setOnClickListener(this.sYh);
      if (!this.sXL)
        this.sYM.setVisibility(8);
      this.sYB.setOnClickListener(this.sYP);
      this.sYE.setOnClickListener(this.sYQ);
      this.sXh = ((Button)this.sWp.findViewById(2131828517));
      this.sXh.setOnClickListener(this.sYg);
      int i = t.hF(getActivity());
      ab.d("MicroMsg.VoipVoiceFragment", "statusHeight: ".concat(String.valueOf(i)));
      ae(this.sXh, i);
      if ((this.sRm) && (2 == this.sRr))
        fZ(2131304348, 10000);
      paramLayoutInflater = a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(this.edV));
      if (!bo.isNullOrNil(paramLayoutInflater))
        this.sYv.setText(paramLayoutInflater);
      this.mTimer = new Timer();
      fY(this.sWs, this.mStatus);
      paramLayoutInflater = this.sWp;
      AppMethodBeat.o(4951);
      return paramLayoutInflater;
      this.sWp = ((RelativeLayout)paramLayoutInflater.inflate(2130971034, paramViewGroup, false));
      if (!Build.MANUFACTURER.equalsIgnoreCase("meizu"))
        break;
      ((RelativeLayout)this.sWp.findViewById(2131828556)).setPadding(0, 0, 0, BackwardSupportUtil.b.b(getActivity(), 40.0F));
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(4950);
    this.sXJ = false;
    super.onDestroy();
    AppMethodBeat.o(4950);
  }

  public final void setHWDecMode(int paramInt)
  {
  }

  public final void setMute(boolean paramBoolean)
  {
    AppMethodBeat.i(4965);
    this.mIsMute = paramBoolean;
    if ((this.sYE != null) && (this.sYF != null))
      this.sYE.setChecked(paramBoolean);
    AppMethodBeat.o(4965);
  }

  public final void setVoipBeauty(int paramInt)
  {
  }

  public final void uninit()
  {
    AppMethodBeat.i(4953);
    if (this.mTimer != null)
    {
      this.mTimer.cancel();
      this.mTimer = null;
    }
    super.uninit();
    AppMethodBeat.o(4953);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipVoiceFragment
 * JD-Core Version:    0.6.2
 */