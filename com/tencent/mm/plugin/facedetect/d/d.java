package com.tencent.mm.plugin.facedetect.d;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.plugin.facedetect.model.f;
import com.tencent.mm.plugin.facedetect.views.FaceNumberItemView;
import com.tencent.mm.plugin.facedetect.views.FaceNumberView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class d
  implements b
{
  boolean eTf;
  private View kSh;
  private a.b lUS;
  boolean lVA;
  boolean lVB;
  boolean lVC;
  boolean lVD;
  private Animation lVE;
  private Animation lVF;
  private AnimationSet lVG;
  private Animation lVH;
  final Object lVI;
  boolean lVJ;
  b.a lVK;
  ak lVL;
  private CountDownTimer lVM;
  Runnable lVN;
  boolean lVd;
  private View lVf;
  private String lVr;
  private int lVs;
  a lVt;
  String[] lVu;
  int lVv;
  int lVw;
  private FaceNumberView lVx;
  private long lVy;
  private long lVz;

  public d(String paramString)
  {
    AppMethodBeat.i(321);
    this.lVr = null;
    this.lVs = 0;
    this.lVt = null;
    this.lVu = null;
    this.lVv = 0;
    this.lVw = 0;
    this.kSh = null;
    this.lVx = null;
    this.lVd = false;
    this.lVy = -1L;
    this.lVz = -1L;
    this.lVA = false;
    this.lVB = false;
    this.lVC = false;
    this.lVD = false;
    this.lVI = new Object();
    this.eTf = false;
    this.lVJ = false;
    this.lVK = null;
    this.lVL = new d.1(this, Looper.getMainLooper());
    this.lVM = new d.2(this);
    this.lVN = new d.3(this);
    this.lUS = new d.9(this);
    this.lVt = new a();
    this.lVt.lUS = this.lUS;
    this.lVE = AnimationUtils.loadAnimation(ah.getContext(), 2131034265);
    this.lVF = AnimationUtils.loadAnimation(ah.getContext(), 2131034167);
    this.lVH = AnimationUtils.loadAnimation(ah.getContext(), 2131034180);
    this.lVH.setDuration(250L);
    this.lVH.setFillAfter(true);
    this.lVr = paramString;
    int i;
    if (this.lVr == null)
    {
      i = 0;
      this.lVs = i;
      btc();
      if (!btb())
        break label367;
    }
    label367: for (this.lVG = ((AnimationSet)AnimationUtils.loadAnimation(ah.getContext(), 2131034168)); ; this.lVG = ((AnimationSet)AnimationUtils.loadAnimation(ah.getContext(), 2131034169)))
    {
      paramString = new TranslateAnimation(0.0F, 0.0F, 0.0F, ah.getResources().getDimensionPixelSize(2131428390));
      paramString.setDuration(ah.getContext().getResources().getInteger(2131623945));
      this.lVG.addAnimation(paramString);
      ab.i("MicroMsg.NumberFaceMotion", "hy: starting read number: %s", new Object[] { this.lVr });
      AppMethodBeat.o(321);
      return;
      i = this.lVr.length();
      break;
    }
  }

  private TextView bta()
  {
    AppMethodBeat.i(323);
    TextView localTextView;
    if (this.kSh != null)
    {
      localTextView = (TextView)this.kSh.findViewById(2131823775);
      AppMethodBeat.o(323);
    }
    while (true)
    {
      return localTextView;
      localTextView = null;
      AppMethodBeat.o(323);
    }
  }

  private boolean btb()
  {
    if (this.lVs >= 6);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void btc()
  {
    int i = 0;
    AppMethodBeat.i(322);
    if ((!bo.isNullOrNil(this.lVr)) && (btb()))
    {
      ab.i("MicroMsg.NumberFaceMotion", "hy: data too long. need to split into %d rounds", new Object[] { Integer.valueOf(2) });
      this.lVu = new String[2];
      int j = this.lVs / 2;
      while (i < 2)
      {
        this.lVu[i] = this.lVr.substring(j * i, (i + 1) * j);
        i++;
      }
      AppMethodBeat.o(322);
    }
    while (true)
    {
      return;
      this.lVu = new String[1];
      this.lVu[0] = this.lVr;
      AppMethodBeat.o(322);
    }
  }

  private void eb(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(327);
    ab.i("MicroMsg.NumberFaceMotion", "alvinluo groupIndex: %d, itemDataLength: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
    TextView localTextView;
    if (bta() != null)
    {
      if (paramInt1 == 1)
      {
        bta().setText(ah.getContext().getString(2131299500));
        AppMethodBeat.o(327);
        return;
      }
      localTextView = bta();
      if (paramInt2 != -1)
        break label146;
    }
    label146: for (String str = ah.getContext().getString(2131299499, new Object[] { vq(paramInt1) }); ; str = ah.getContext().getString(2131299498, new Object[] { vp(this.lVv + 1) }))
    {
      localTextView.setText(str);
      if (paramInt2 > 0)
      {
        ab.i("MicroMsg.NumberFaceMotion", "alvinluo start %d group number", new Object[] { Integer.valueOf(paramInt2 + 1) });
        f.lTL.bsF();
      }
      AppMethodBeat.o(327);
      break;
    }
  }

  private static String vp(int paramInt)
  {
    AppMethodBeat.i(326);
    String str;
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.NumberFaceMotion", "hy: unknown length!!");
      str = "";
      AppMethodBeat.o(326);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return str;
      str = ah.getContext().getString(2131299493);
      AppMethodBeat.o(326);
      continue;
      str = ah.getContext().getString(2131299494);
      AppMethodBeat.o(326);
      continue;
      str = ah.getContext().getString(2131299496);
      AppMethodBeat.o(326);
      continue;
      str = ah.getContext().getString(2131299497);
      AppMethodBeat.o(326);
    }
  }

  private static String vq(int paramInt)
  {
    AppMethodBeat.i(330);
    String str;
    switch (paramInt)
    {
    default:
      str = vp(paramInt);
      AppMethodBeat.o(330);
    case 2:
    }
    while (true)
    {
      return str;
      str = ah.getContext().getString(2131299495);
      AppMethodBeat.o(330);
    }
  }

  public final void a(Context paramContext, ViewGroup paramViewGroup1, ViewGroup paramViewGroup2)
  {
    AppMethodBeat.i(325);
    ab.d("MicroMsg.NumberFaceMotion", "hy: on number init motion");
    this.kSh = LayoutInflater.from(paramContext).inflate(2130969463, paramViewGroup2);
    this.lVx = ((FaceNumberView)this.kSh.findViewById(2131823777));
    this.lVf = LayoutInflater.from(paramContext).inflate(2130969461, paramViewGroup1);
    eb(this.lVu.length, -1);
    bta().startAnimation(this.lVE);
    if (this.lVx != null)
    {
      this.lVx.setVisibility(0);
      this.lVx.startAnimation(this.lVE);
      this.lVv = 0;
      hb(false);
      this.lVw = -1;
      btd();
      this.lVy = bo.yz();
      this.lVz = bo.yz();
      this.eTf = false;
    }
    AppMethodBeat.o(325);
  }

  public final boolean a(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    this.lVB = true;
    return this.lVJ;
  }

  public final boolean b(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    this.lVB = false;
    return this.lVJ;
  }

  public final boolean bsV()
  {
    return this.lVd;
  }

  public final boolean bsW()
  {
    this.lVB = true;
    return this.lVJ;
  }

  public final void bsX()
  {
    AppMethodBeat.i(331);
    this.eTf = true;
    this.lVJ = false;
    Object localObject1 = this.lVt;
    ((a)localObject1).lUT = true;
    ab.i("MicroMsg.FaceVoiceRecordLogic", "hy: face start reset");
    while (true)
    {
      try
      {
        if (((a)localObject1).coZ != null)
        {
          ((a)localObject1).coZ.EB();
          ((a)localObject1).coZ = null;
        }
        if (((a)localObject1).gaY != null)
        {
          ((a)localObject1).gaY.Fe();
          ((a)localObject1).gaY = null;
        }
        Object localObject2 = ((a)localObject1).gbh;
        if (localObject2 != null);
        try
        {
          ((a)localObject1).gbh.release();
          ((a)localObject1).gbh = null;
          ((a)localObject1).gbH = true;
          ((a)localObject1).gaT = 0;
          localObject1 = this.lVt;
          ab.i("MicroMsg.FaceVoiceRecordLogic", "hy: recycling voice.");
          ((a)localObject1).lUS = null;
          this.lVt.bsT();
          if ((com.tencent.mm.plugin.facedetect.e.a.btw().lZc) && (com.tencent.mm.plugin.facedetect.e.a.btw().isStarted()))
          {
            localObject1 = this.lVt;
            localObject2 = com.tencent.mm.plugin.facedetect.e.a.btw().btx();
            ((a)localObject1).lUV.remove(localObject2);
            if (this.lVd)
              com.tencent.mm.plugin.facedetect.e.a.btw().a(null);
          }
          else
          {
            this.lVM.cancel();
            this.lVL.removeCallbacksAndMessages(null);
            if (this.lVx != null)
            {
              localObject1 = this.lVx;
              if ((((FaceNumberView)localObject1).mbk != null) && (((FaceNumberView)localObject1).mbk.length > 0))
                break label303;
            }
            if (this.kSh != null)
            {
              this.lVd = false;
              this.lVy = -1L;
              this.kSh = null;
              this.lVx = null;
            }
            AppMethodBeat.o(331);
            return;
          }
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.FaceVoiceRecordLogic", localException, "mVoiceSilentDetectAPI.release error", new Object[0]);
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(331);
      }
      com.tencent.mm.plugin.facedetect.e.a.btw().bty();
      continue;
      label303: for (int i = 0; i < ((FaceNumberView)localObject1).mbk.length; i++)
        localObject1.mbk[i].btK();
    }
  }

  public final b.b bsY()
  {
    AppMethodBeat.i(332);
    b.b localb = new b.b(90004, "user cancelled in processing");
    AppMethodBeat.o(332);
    return localb;
  }

  public final b.a bsZ()
  {
    return this.lVK;
  }

  final void btd()
  {
    AppMethodBeat.i(329);
    if (this.lVx != null)
      if (this.lVv >= 0)
      {
        this.lVx.Lw(this.lVu[this.lVv].substring(0, this.lVw + 1));
        AppMethodBeat.o(329);
      }
    while (true)
    {
      return;
      this.lVx.Lw(null);
      AppMethodBeat.o(329);
    }
  }

  final void bte()
  {
    AppMethodBeat.i(333);
    this.lVM.start();
    AppMethodBeat.o(333);
  }

  final void hb(boolean paramBoolean)
  {
    AppMethodBeat.i(328);
    if (this.lVx != null)
    {
      eb(this.lVu.length, this.lVv);
      this.lVx.setNumberLengthAndInflate(this.lVu[this.lVv].length());
      this.lVD = false;
      if (paramBoolean)
      {
        this.lVE.setAnimationListener(new d.4(this));
        if (this.kSh == null)
          break label108;
        this.kSh.startAnimation(this.lVE);
        AppMethodBeat.o(328);
      }
    }
    while (true)
    {
      return;
      al.n(new d.5(this), 500L);
      label108: AppMethodBeat.o(328);
    }
  }

  public final void setBusinessTip(String paramString)
  {
    AppMethodBeat.i(324);
    ((TextView)this.lVf.findViewById(2131823775)).setText(paramString);
    AppMethodBeat.o(324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.d
 * JD-Core Version:    0.6.2
 */