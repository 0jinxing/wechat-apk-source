package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.g.b.a.bj;
import com.tencent.mm.plugin.walletlock.c.i;
import com.tencent.mm.plugin.walletlock.gesture.a.e;
import com.tencent.mm.plugin.walletlock.gesture.a.f;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.a;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bfo;
import com.tencent.mm.protocal.protobuf.bfp;
import com.tencent.mm.protocal.protobuf.bil;
import com.tencent.mm.protocal.protobuf.bim;
import com.tencent.mm.protocal.protobuf.bqz;
import com.tencent.mm.protocal.protobuf.bra;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class GestureGuardLogicUI extends MMActivity
  implements View.OnClickListener, PatternLockView.a
{
  private String gtl;
  private ak mHandler;
  private int mStatus;
  private int tVF;
  private int tVG;
  private int tVH;
  private a[] tVI;
  private Animation tVJ;
  private List<f> tVK;
  private List<f> tVL;
  private boolean tVM;
  private int tVN;
  private m tVO;
  private m tVP;
  private String tVQ;
  private ViewFlipper tVR;
  private Dialog tVS;
  private boolean tVT;
  private boolean tVU;
  private String tVV;
  private int tVw;

  public GestureGuardLogicUI()
  {
    AppMethodBeat.i(51614);
    this.tVF = 0;
    this.tVG = 0;
    this.tVH = 0;
    this.tVI = null;
    this.tVJ = null;
    this.tVK = null;
    this.tVL = null;
    this.tVM = false;
    this.tVN = 0;
    this.tVO = null;
    this.tVP = null;
    this.gtl = null;
    this.tVQ = null;
    this.tVR = null;
    this.mHandler = new ak(Looper.getMainLooper());
    this.tVS = null;
    this.tVT = true;
    this.tVU = false;
    this.tVw = -1;
    AppMethodBeat.o(51614);
  }

  private void a(String paramString, GestureGuardLogicUI.a parama)
  {
    AppMethodBeat.i(51634);
    TextView localTextView = this.tVI[this.tVH].tWc;
    localTextView.getText().toString();
    localTextView.setText(paramString);
    localTextView.setTextColor(this.tVG);
    localTextView.startAnimation(this.tVJ);
    this.tVJ.setAnimationListener(new GestureGuardLogicUI.15(this, parama));
    AppMethodBeat.o(51634);
  }

  private void a(String paramString, List<f> paramList, w.a parama)
  {
    AppMethodBeat.i(51626);
    c(new GestureGuardLogicUI.4(this));
    if (paramString == null)
    {
      aDw();
      parama.a(3, -6, getString(2131300389), null, null);
      AppMethodBeat.o(51626);
    }
    while (true)
    {
      return;
      Object localObject = new b.a();
      ((b.a)localObject).fsJ = new bqz();
      ((b.a)localObject).fsK = new bra();
      ((b.a)localObject).fsI = 688;
      ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registernewpatternlock";
      com.tencent.mm.ai.b localb = ((b.a)localObject).acD();
      localObject = (bqz)localb.fsG.fsP;
      ((bqz)localObject).wTq = new SKBuiltinBuffer_t().setBuffer(paramString.getBytes());
      ((bqz)localObject).wTr = new SKBuiltinBuffer_t().setBuffer(e.dX(paramList));
      w.a(localb, new GestureGuardLogicUI.5(this, parama), false);
      AppMethodBeat.o(51626);
    }
  }

  private void a(List<f> paramList, w.a parama)
  {
    AppMethodBeat.i(51628);
    c(new GestureGuardLogicUI.10(this));
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bfo();
    ((b.a)localObject).fsK = new bfp();
    ((b.a)localObject).fsI = 689;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/oppatternlock";
    com.tencent.mm.ai.b localb = ((b.a)localObject).acD();
    localObject = (bfo)localb.fsG.fsP;
    ((bfo)localObject).Cn = 3;
    ((bfo)localObject).wJu = new SKBuiltinBuffer_t().setBuffer(e.dX(paramList));
    w.a(localb, new GestureGuardLogicUI.11(this, parama), false);
    AppMethodBeat.o(51628);
  }

  private void a(List<f> paramList1, List<f> paramList2, w.a parama)
  {
    AppMethodBeat.i(51627);
    Object localObject = new b.a();
    c(new GestureGuardLogicUI.8(this));
    ((b.a)localObject).fsJ = new bfo();
    ((b.a)localObject).fsK = new bfp();
    ((b.a)localObject).fsI = 689;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/oppatternlock";
    localObject = ((b.a)localObject).acD();
    bfo localbfo = (bfo)((com.tencent.mm.ai.b)localObject).fsG.fsP;
    localbfo.Cn = 1;
    localbfo.wJu = new SKBuiltinBuffer_t().setBuffer(e.dX(paramList1));
    localbfo.wJv = new SKBuiltinBuffer_t().setBuffer(e.dX(paramList2));
    w.a((com.tencent.mm.ai.b)localObject, new GestureGuardLogicUI.9(this, parama), false);
    AppMethodBeat.o(51627);
  }

  private void aDw()
  {
    AppMethodBeat.i(51639);
    if ((this.tVS != null) && (this.tVS.isShowing()))
      this.tVS.dismiss();
    AppMethodBeat.o(51639);
  }

  private void aq(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(51633);
    int i = paramInt - this.tVH;
    if (i == 0)
      AppMethodBeat.o(51633);
    while (true)
    {
      return;
      this.tVH = paramInt;
      if (paramBoolean)
        if (i > 0)
        {
          this.tVR.setInAnimation(this, 2131034265);
          this.tVR.setOutAnimation(this, 2131034262);
        }
      while (true)
      {
        paramInt = i;
        if (i <= 0)
          break label138;
        for (paramInt = 0; paramInt < i; paramInt++)
          this.tVR.showNext();
        this.tVR.setInAnimation(this, 2131034261);
        this.tVR.setOutAnimation(this, 2131034266);
        continue;
        this.tVR.setInAnimation(null);
        this.tVR.setOutAnimation(null);
      }
      AppMethodBeat.o(51633);
      continue;
      label138: 
      while (paramInt < 0)
      {
        this.tVR.showPrevious();
        paramInt++;
      }
      AppMethodBeat.o(51633);
    }
  }

  private void c(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(51638);
    if (this.tVS == null)
    {
      this.tVS = com.tencent.mm.ui.base.h.b(this, getString(2131300392), false, paramOnCancelListener);
      AppMethodBeat.o(51638);
    }
    while (true)
    {
      return;
      this.tVS.show();
      AppMethodBeat.o(51638);
    }
  }

  private boolean cTJ()
  {
    boolean bool = true;
    AppMethodBeat.i(51623);
    if ((this.mStatus != 20) && (this.mStatus != 0) && (this.mStatus != 2) && (this.mStatus != 1))
      if (this.tVT)
      {
        cTP();
        AppMethodBeat.o(51623);
      }
    while (true)
    {
      return bool;
      cTO();
      break;
      cTM();
      bool = false;
      AppMethodBeat.o(51623);
    }
  }

  private void cTK()
  {
    AppMethodBeat.i(51624);
    Object localObject1 = this.tVI[this.tVH];
    switch (this.mStatus)
    {
    default:
    case 20:
    case 16:
    case 17:
    case 18:
    case 19:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      label96: AppMethodBeat.o(51624);
      while (true)
      {
        label102: return;
        setMMTitle(getString(2131300401));
        setMMTitle(getString(2131300402));
        if (this.tVw == 1)
        {
          localObject2 = new bj();
          ((bj)localObject2).cVT = 8L;
          ((bj)localObject2).dcm = 1L;
          ((bj)localObject2).ajK();
        }
        while (true)
        {
          this.tVM = true;
          ((a)localObject1).tWe.setEnableInput(false);
          ((a)localObject1).tWe.setOnPatternListener(null);
          l = ()Math.ceil((600L - com.tencent.mm.plugin.walletlock.gesture.a.d.cTB().tVE / 1000L) / 60.0D);
          ((a)localObject1).tWc.setText(String.format(getString(2131300394), new Object[] { Long.valueOf(l) }));
          ((a)localObject1).tWc.setTextColor(getResources().getColor(2131690133));
          AppMethodBeat.o(51624);
          break;
          if (this.tVw == 2)
          {
            localObject2 = new bj();
            ((bj)localObject2).cVT = 10L;
            ((bj)localObject2).dcm = 1L;
            ((bj)localObject2).ajK();
          }
        }
        Object localObject2 = getIntent().getStringExtra("next_action");
        if ("next_action.modify_pattern".equals(localObject2))
        {
          setMMTitle(getString(2131300402));
          localObject2 = new bj();
          ((bj)localObject2).cVT = 5L;
          ((bj)localObject2).dcm = 1L;
          ((bj)localObject2).ajK();
        }
        while (true)
        {
          this.tVM = false;
          ((a)localObject1).tWe.setEnableInput(true);
          ((a)localObject1).tWe.setOnPatternListener(this);
          ((a)localObject1).tWc.setText(getString(2131300398));
          ((a)localObject1).tWc.setTextColor(getResources().getColor(2131690132));
          if (((a)localObject1).tWf.getVisibility() == 8)
            break;
          ((a)localObject1).tWf.setVisibility(8);
          AppMethodBeat.o(51624);
          break label102;
          if ("next_action.switch_on_pattern".equals(localObject2))
          {
            setMMTitle(getString(2131300403));
            localObject2 = new bj();
            ((bj)localObject2).cVT = 4L;
            ((bj)localObject2).dcm = 1L;
            ((bj)localObject2).ajK();
          }
          else
          {
            setMMTitle(getString(2131300402));
            localObject2 = new bj();
            ((bj)localObject2).cVT = 5L;
            ((bj)localObject2).dcm = 1L;
            ((bj)localObject2).ajK();
          }
        }
        ((a)localObject1).tWc.setText(getResources().getString(2131300396));
        ((a)localObject1).tWc.setTextColor(this.tVF);
        ((a)localObject1).tWe.cTT();
        ((a)localObject1).tWe.setEnableInput(true);
        if (((a)localObject1).tWf.getVisibility() == 8)
          break label96;
        ((a)localObject1).tWf.setVisibility(8);
        AppMethodBeat.o(51624);
        continue;
        localObject1 = getIntent().getStringExtra("next_action");
        if ("next_action.modify_pattern".equals(localObject1))
        {
          if (this.tVU)
          {
            this.tVU = false;
            a(this.gtl, this.tVK, new GestureGuardLogicUI.21(this));
            AppMethodBeat.o(51624);
          }
          else
          {
            a(this.tVL, this.tVK, new GestureGuardLogicUI.22(this));
            AppMethodBeat.o(51624);
          }
        }
        else if ("next_action.switch_on_pattern".equals(localObject1))
        {
          a(this.gtl, this.tVK, new GestureGuardLogicUI.23(this));
          AppMethodBeat.o(51624);
        }
        else
        {
          if (!"next_action.goto_protected_page".equals(localObject1))
            break label96;
          a(this.gtl, this.tVK, new GestureGuardLogicUI.24(this));
          AppMethodBeat.o(51624);
          continue;
          ((a)localObject1).tWe.setEnableInput(false);
          ((a)localObject1).tWe.setDisplayMode(PatternLockView.b.tWJ);
          a(getResources().getString(2131300397), new GestureGuardLogicUI.25(this, (a)localObject1));
          AppMethodBeat.o(51624);
          continue;
          setMMTitle(getString(2131300401));
          this.tVM = false;
          ((a)localObject1).tWe.setEnableInput(true);
          ((a)localObject1).tWe.setOnPatternListener(this);
          if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action")))
            if (!bo.isNullOrNil(this.tVV))
              ((a)localObject1).tWc.setText(this.tVV);
          while (true)
          {
            ((a)localObject1).tWc.setTextColor(this.tVF);
            if (((a)localObject1).tWf.getVisibility() == 0)
              break;
            ((a)localObject1).tWf.setVisibility(0);
            AppMethodBeat.o(51624);
            break label102;
            ((a)localObject1).tWc.setText(getString(2131300400));
            continue;
            ((a)localObject1).tWc.setText(getString(2131300399));
          }
          localObject2 = getIntent().getStringExtra("next_action");
          if ("next_action.modify_pattern".equals(localObject2))
          {
            ((a)localObject1).tWe.cTT();
            aq(1, true);
            this.mStatus = 16;
            break;
          }
          if ("next_action.switch_off_pattern".equals(localObject2))
          {
            a(this.tVL, new GestureGuardLogicUI.26(this));
            AppMethodBeat.o(51624);
          }
          else
          {
            if (!"next_action.goto_protected_page".equals(localObject2))
              break label96;
            com.tencent.mm.plugin.walletlock.gesture.a.d.lK(SystemClock.elapsedRealtime());
            cTL();
            com.tencent.mm.plugin.walletlock.c.h.am(this.tVw, 1, 0);
            AppMethodBeat.o(51624);
          }
        }
      }
      long l = SystemClock.elapsedRealtime();
      com.tencent.mm.plugin.walletlock.gesture.a.d.ad(l, 0L);
      com.tencent.mm.plugin.walletlock.gesture.a.d.HD(this.tVN);
      com.tencent.mm.plugin.walletlock.gesture.a.d.cTq();
      if (this.tVN == 5)
      {
        this.tVM = true;
        com.tencent.mm.plugin.walletlock.gesture.a.d.ac(l, 0L);
        ((a)localObject1).tWe.cTT();
        ((a)localObject1).tWe.setEnableInput(false);
        this.mStatus = 20;
        cTK();
        cTN();
      }
      while (true)
      {
        localObject1 = getIntent().getStringExtra("next_action");
        ab.i("MicroMsg.GestureGuardLogicUI", "alvinluo nextAction: %s", new Object[] { localObject1 });
        if (!"next_action.goto_protected_page".equals(localObject1))
          break;
        if (this.tVN != 5)
          break label1265;
        com.tencent.mm.plugin.walletlock.c.h.am(this.tVw, 1, 2);
        AppMethodBeat.o(51624);
        break label102;
        ((a)localObject1).tWe.setEnableInput(false);
        ((a)localObject1).tWe.setDisplayMode(PatternLockView.b.tWJ);
        a(String.format(getResources().getString(2131300390), new Object[] { Integer.valueOf(5 - this.tVN) }), new GestureGuardLogicUI.a()
        {
          public final void onDone()
          {
            AppMethodBeat.i(51613);
            GestureGuardLogicUI.a(GestureGuardLogicUI.this, 0);
            this.tWa.tWe.cTT();
            this.tWa.tWe.setEnableInput(true);
            AppMethodBeat.o(51613);
          }
        });
      }
      label1265: com.tencent.mm.plugin.walletlock.c.h.am(this.tVw, 1, 1);
    }
  }

  private void cTL()
  {
    AppMethodBeat.i(51629);
    Intent localIntent = (Intent)getIntent().getParcelableExtra("page_intent");
    if (localIntent != null)
    {
      i.tXc.nB(true);
      i.tXc.nC(true);
      localIntent.addFlags(131072);
      startActivity(localIntent);
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(51629);
      return;
      ab.i("MicroMsg.GestureGuardLogicUI", "Protected page's intent not found, finish myself only.");
    }
  }

  private void cTM()
  {
    AppMethodBeat.i(51630);
    String str = getIntent().getStringExtra("next_action");
    if ((this.mStatus == 20) || ("next_action.goto_protected_page".equals(str)))
      i.tXc.cUg();
    AppMethodBeat.o(51630);
  }

  private void cTN()
  {
    AppMethodBeat.i(51635);
    c.a locala = new c.a(this);
    locala.rc(false).asE(String.format(getString(2131300383), new Object[] { Long.valueOf(10L) }));
    locala.Qc(2131300379).a(new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(51601);
        paramAnonymousDialogInterface.dismiss();
        GestureGuardLogicUI.this.onClick(GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].tWf);
        AppMethodBeat.o(51601);
      }
    });
    locala.Qd(2131300378).b(new GestureGuardLogicUI.17(this));
    locala.aMb().show();
    AppMethodBeat.o(51635);
  }

  private void cTO()
  {
    AppMethodBeat.i(51636);
    new c.a(this).rc(true).PZ(2131300386).Qc(2131300381).a(new GestureGuardLogicUI.18(this)).aMb().show();
    AppMethodBeat.o(51636);
  }

  private void cTP()
  {
    AppMethodBeat.i(51637);
    String str = getIntent().getStringExtra("next_action");
    if ((!"next_action.modify_pattern".equals(str)) && ("next_action.switch_on_pattern".equals(str)));
    for (str = getString(2131300385); ; str = getString(2131300384))
    {
      new c.a(this).rc(false).asE(str).Qc(2131300382).a(new GestureGuardLogicUI.20(this)).Qd(2131300380).b(new GestureGuardLogicUI.19(this)).aMb().show();
      AppMethodBeat.o(51637);
      return;
    }
  }

  private void w(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(51622);
    ab.i("MicroMsg.GestureGuardLogicUI", "alvinluo gesture finishWithResult");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_err_code", paramInt2);
    localIntent.putExtra("key_err_msg", paramString);
    setResult(paramInt1, localIntent);
    finish();
    AppMethodBeat.o(51622);
  }

  public final void a(PatternLockView paramPatternLockView)
  {
    AppMethodBeat.i(51632);
    paramPatternLockView.setDisplayMode(PatternLockView.b.tWI);
    AppMethodBeat.o(51632);
  }

  public final void a(final PatternLockView paramPatternLockView, List<f> paramList)
  {
    boolean bool1 = true;
    AppMethodBeat.i(51625);
    if (this.mStatus == 16)
    {
      if (paramList.size() < 4)
      {
        paramPatternLockView.setEnableInput(false);
        paramPatternLockView.setDisplayMode(PatternLockView.b.tWJ);
        a(String.format(getString(2131300391), new Object[] { Integer.valueOf(4) }), new GestureGuardLogicUI.a()
        {
          public final void onDone()
          {
            AppMethodBeat.i(51587);
            paramPatternLockView.cTT();
            paramPatternLockView.setEnableInput(true);
            AppMethodBeat.o(51587);
          }
        });
        AppMethodBeat.o(51625);
        return;
      }
      this.tVK = paramList;
      paramPatternLockView.cTT();
      this.mStatus = 17;
      aq(2, true);
    }
    while (true)
    {
      cTK();
      label388: label522: 
      do
      {
        AppMethodBeat.o(51625);
        break;
        if (this.mStatus == 0)
        {
          paramPatternLockView = new GestureGuardLogicUI.3(this, paramList);
          Object localObject1 = com.tencent.mm.plugin.walletlock.gesture.a.d.cTG();
          Object localObject2 = com.tencent.mm.plugin.walletlock.gesture.a.d.cTF();
          com.tencent.mm.plugin.report.service.h.pYm.e(11453, new Object[0]);
          c(new GestureGuardLogicUI.6(this));
          boolean bool2 = e.b((bim)localObject1);
          boolean bool3 = e.b((bil)localObject2);
          if (bool3)
            if (bool2)
              if (((bil)localObject2).version < ((bim)localObject1).wLR)
                bool4 = true;
          while (true)
          {
            ab.i("MicroMsg.GestureGuardLogicUI", String.format("isInfoValid:%b, isBuffValid:%b, verify by server:%b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4) }));
            if (!bool4)
              break label388;
            localObject1 = new b.a();
            ((b.a)localObject1).fsJ = new bfo();
            ((b.a)localObject1).fsK = new bfp();
            ((b.a)localObject1).fsI = 689;
            ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/oppatternlock";
            localObject2 = ((b.a)localObject1).acD();
            localObject1 = (bfo)((com.tencent.mm.ai.b)localObject2).fsG.fsP;
            ((bfo)localObject1).Cn = 2;
            ((bfo)localObject1).wJu = new SKBuiltinBuffer_t().setBuffer(e.dX(paramList));
            w.a((com.tencent.mm.ai.b)localObject2, new GestureGuardLogicUI.7(this, paramPatternLockView), false);
            AppMethodBeat.o(51625);
            break;
            bool4 = false;
            continue;
            bool4 = false;
            continue;
            bool4 = true;
          }
          aDw();
          localObject2 = com.tencent.mm.plugin.walletlock.gesture.a.d.cTF();
          if (localObject2 == null);
          for (boolean bool4 = bool1; ; bool4 = new String(((bil)localObject2).wLO.getBufferToBytes()).equals(com.tencent.mm.a.g.x(((StringBuilder)localObject1).toString().getBytes())))
          {
            if (!bool4)
              break label522;
            paramPatternLockView.a(3, 0, null, null, null);
            AppMethodBeat.o(51625);
            break;
            localObject1 = new StringBuilder();
            com.tencent.mm.kernel.g.RN();
            ((StringBuilder)localObject1).append(new com.tencent.mm.a.p(com.tencent.mm.kernel.a.QF()).longValue());
            ((StringBuilder)localObject1).append('_');
            ((StringBuilder)localObject1).append(new String(e.dX(paramList)));
          }
          paramPatternLockView.a(3, -3, null, null, null);
          AppMethodBeat.o(51625);
          break;
        }
      }
      while (this.mStatus != 17);
      if (this.tVK.equals(paramList))
      {
        paramPatternLockView.cTT();
        this.tVM = false;
        this.tVN = 0;
        com.tencent.mm.plugin.walletlock.gesture.a.d.cTI();
        com.tencent.mm.plugin.walletlock.gesture.a.d.cTC();
        com.tencent.mm.plugin.walletlock.gesture.a.d.cTE();
        com.tencent.mm.plugin.walletlock.gesture.a.d.cTq();
        this.mStatus = 18;
      }
      else
      {
        this.mStatus = 19;
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public final void initView()
  {
    AppMethodBeat.i(51618);
    aqX();
    setMMSubTitle(2131305624);
    this.tVJ = AnimationUtils.loadAnimation(this, 2131034248);
    this.tVF = getResources().getColor(2131690132);
    this.tVG = getResources().getColor(2131690133);
    Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("action");
    localIntent.getStringExtra("next_action");
    if ("action.switch_on_pattern".equals(str))
    {
      this.mStatus = 16;
      aq(1, false);
    }
    while (!"action.verify_pattern".equals(str))
    {
      setBackBtn(new GestureGuardLogicUI.1(this));
      ab.i("MicroMsg.GestureGuardLogicUI", String.format("GuestureGuardLogicUI, initView done, before doRestBehavior. mStatus=%d", new Object[] { Integer.valueOf(this.mStatus) }));
      cTK();
      AppMethodBeat.o(51618);
      return;
    }
    if (com.tencent.mm.plugin.walletlock.gesture.a.b.cTA())
      this.tVM = true;
    for (this.mStatus = 20; ; this.mStatus = 0)
    {
      aq(0, false);
      break;
      this.tVM = false;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(51619);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == -1)
      if (paramIntent == null)
      {
        ab.e("MicroMsg.GestureGuardLogicUI", "hy: Intent data is null.");
        AppMethodBeat.o(51619);
      }
    while (true)
    {
      return;
      paramInt1 = paramIntent.getIntExtra("key_err_code", 0);
      if (paramInt1 == 0)
      {
        this.gtl = paramIntent.getStringExtra("key_token");
        this.tVQ = paramIntent.getStringExtra("key_type");
        paramIntent = getIntent().getStringExtra("next_action");
        if (("next_action.goto_protected_page".equals(paramIntent)) || ("next_action.modify_pattern".equals(paramIntent)))
        {
          if ("next_action.modify_pattern".equals(paramIntent))
            this.tVU = true;
          this.tVT = false;
          setBackBtn(null);
          pP(false);
          this.mStatus = 16;
          aq(1, false);
        }
        while (true)
        {
          cTK();
          AppMethodBeat.o(51619);
          break;
          if ("next_action.switch_off_pattern".equals(paramIntent))
          {
            paramIntent = this.gtl;
            w.a local12 = new w.a()
            {
              public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.b paramAnonymousb, m paramAnonymousm)
              {
                AppMethodBeat.i(51597);
                if (paramAnonymousInt2 == 0)
                {
                  com.tencent.mm.plugin.walletlock.gesture.a.d.cTI();
                  com.tencent.mm.plugin.walletlock.gesture.a.d.cTC();
                  com.tencent.mm.plugin.walletlock.gesture.a.d.cTE();
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(2131300405), 0).show();
                }
                while (true)
                {
                  GestureGuardLogicUI.b(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.c(GestureGuardLogicUI.this);
                  GestureGuardLogicUI.this.finish();
                  AppMethodBeat.o(51597);
                  return 0;
                  Toast.makeText(GestureGuardLogicUI.this, GestureGuardLogicUI.this.getString(2131300387), 0).show();
                }
              }
            };
            c(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                AppMethodBeat.i(51598);
                GestureGuardLogicUI.l(GestureGuardLogicUI.this)[GestureGuardLogicUI.m(GestureGuardLogicUI.this)].tWe.cTT();
                if ((GestureGuardLogicUI.n(GestureGuardLogicUI.this) != null) && (!GestureGuardLogicUI.n(GestureGuardLogicUI.this).bqV))
                  com.tencent.mm.kernel.g.Rg().c(GestureGuardLogicUI.n(GestureGuardLogicUI.this));
                AppMethodBeat.o(51598);
              }
            });
            if (paramIntent == null)
            {
              aDw();
              local12.a(3, -6, getString(2131300389), null, null);
            }
            else
            {
              Object localObject = new b.a();
              ((b.a)localObject).fsJ = new bqz();
              ((b.a)localObject).fsK = new bra();
              ((b.a)localObject).fsI = 688;
              ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registernewpatternlock";
              localObject = ((b.a)localObject).acD();
              bqz localbqz = (bqz)((com.tencent.mm.ai.b)localObject).fsG.fsP;
              localbqz.wTq = new SKBuiltinBuffer_t().setBuffer(paramIntent.getBytes());
              localbqz.Cn = 3;
              w.a((com.tencent.mm.ai.b)localObject, new GestureGuardLogicUI.14(this, local12), false);
            }
          }
          else
          {
            this.mStatus = 1;
          }
        }
      }
      if (paramInt1 == -1)
        Toast.makeText(this, getString(2131300387), 0).show();
      AppMethodBeat.o(51619);
    }
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(51620);
    if (paramView.getId() == 2131825012)
    {
      paramView = new Intent();
      paramView.putExtra("action", "action.verify_paypwd");
      paramView.putExtra("key_wallet_lock_type", 1);
      com.tencent.mm.bp.d.b(this, "wallet", ".pwd.ui.WalletLockCheckPwdUI", paramView, 1001);
    }
    AppMethodBeat.o(51620);
  }

  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    AppMethodBeat.i(51615);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if ((!ah.getPackageName().equals(paramBundle.getPackage())) || (bo.isNullOrNil(paramBundle.getStringExtra("action"))) || (bo.isNullOrNil(paramBundle.getStringExtra("next_action"))))
    {
      ab.w("MicroMsg.GestureGuardLogicUI", "Intent started this activity has no valid action desc.");
      finish();
      AppMethodBeat.o(51615);
    }
    while (true)
    {
      return;
      this.tVR = new ViewFlipper(this);
      this.tVI = new a[] { new a(this), new a(this), new a(this) };
      a[] arrayOfa = this.tVI;
      int j = arrayOfa.length;
      while (i < j)
      {
        paramBundle = arrayOfa[i];
        this.tVR.addView(paramBundle.mView);
        paramBundle.tWe.setOnPatternListener(this);
        paramBundle.tWf.setOnClickListener(this);
        i++;
      }
      setContentView(this.tVR);
      this.gtl = getIntent().getStringExtra("token");
      this.tVQ = getIntent().getStringExtra("type");
      this.tVV = getIntent().getStringExtra("verify_title");
      this.tVw = getIntent().getIntExtra("scene", -1);
      if ("next_action.goto_protected_page".equals(getIntent().getStringExtra("next_action")))
        com.tencent.mm.plugin.walletlock.c.h.cUc();
      initView();
      AppMethodBeat.o(51615);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(51617);
    super.onDestroy();
    if (this.tVO != null)
    {
      com.tencent.mm.kernel.g.Rg().c(this.tVO);
      this.tVO = null;
    }
    if (this.tVP != null)
    {
      com.tencent.mm.kernel.g.Rg().c(this.tVP);
      this.tVP = null;
    }
    if ((this.tVS != null) && (this.tVS.isShowing()))
      this.tVS.dismiss();
    if (this.tVR != null)
    {
      this.tVR.removeAllViews();
      this.tVR = null;
    }
    for (int i = 0; i < this.tVI.length; i++)
    {
      a locala = this.tVI[i];
      locala.tWe.setOnClickListener(null);
      locala.tWf.setOnClickListener(null);
      locala.mView = null;
      locala.tWc = null;
      locala.tWd = null;
      locala.tWe = null;
      locala.tWf = null;
      this.tVI[i] = null;
    }
    this.tVI = null;
    AppMethodBeat.o(51617);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(51621);
    if (paramInt == 4)
      if (cTJ())
        AppMethodBeat.o(51621);
    while (true)
    {
      return bool;
      w(0, 4, "user cancel when setting gesture");
      AppMethodBeat.o(51621);
      continue;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(51621);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(51616);
    super.onResume();
    if (this.mStatus == 0)
    {
      com.tencent.mm.plugin.walletlock.gesture.a.g localg = com.tencent.mm.plugin.walletlock.gesture.a.d.cTD();
      if (localg.tVD == -1L)
        break label98;
      e.a(localg);
      if (localg.tVE / 1000L >= 600L)
        break label95;
      com.tencent.mm.plugin.walletlock.gesture.a.d.ad(localg.tVD, localg.tVE);
    }
    label95: label98: for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.tVN = com.tencent.mm.plugin.walletlock.gesture.a.d.cTH();
        if (this.tVN != -1);
      }
      else
      {
        this.tVN = 0;
      }
      AppMethodBeat.o(51616);
      return;
      com.tencent.mm.plugin.walletlock.gesture.a.d.cTE();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(51631);
    Object localObject = this.tVI[this.tVH];
    if (((a)localObject).tWe != null)
    {
      localObject = ((a)localObject).tWe;
      if ((!paramBoolean) || (this.tVM))
        break label58;
    }
    label58: for (boolean bool = true; ; bool = false)
    {
      ((PatternLockView)localObject).setEnableInput(bool);
      AppMethodBeat.at(this, paramBoolean);
      AppMethodBeat.o(51631);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI
 * JD-Core Version:    0.6.2
 */