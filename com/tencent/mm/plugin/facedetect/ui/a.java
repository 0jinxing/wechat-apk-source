package com.tencent.mm.plugin.facedetect.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

public class a
{
  private static a.b lWK;
  private Button lWA;
  private ImageView lWB;
  private TextView lWC;
  private TextView lWD;
  private Button lWE;
  private Button lWF;
  private TextView lWG;
  private Animation lWH;
  private Animation lWI;
  protected WeakReference<FaceDetectPrepareUI> lWJ;
  private RelativeLayout lWz;

  static
  {
    AppMethodBeat.i(398);
    lWK = new a.b();
    AppMethodBeat.o(398);
  }

  a(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
    AppMethodBeat.i(386);
    this.lWz = null;
    this.lWA = null;
    this.lWB = null;
    this.lWC = null;
    this.lWD = null;
    this.lWE = null;
    this.lWF = null;
    this.lWG = null;
    this.lWH = null;
    this.lWI = null;
    this.lWJ = null;
    this.lWJ = new WeakReference(paramFaceDetectPrepareUI);
    AppMethodBeat.o(386);
  }

  public static c a(int paramInt, String paramString1, String paramString2, String paramString3, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(394);
    paramString1 = b(paramInt, paramString1, paramString2, paramString3, paramOnClickListener1, paramOnClickListener2);
    AppMethodBeat.o(394);
    return paramString1;
  }

  public static c a(Context paramContext, View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(397);
    paramOnClickListener = a(2130838626, paramContext.getString(2131299476), null, paramContext.getString(2131296868), null, paramOnClickListener);
    paramOnClickListener.lYB = true;
    paramOnClickListener.lYD = (paramContext.getString(2131299476).length() - 3);
    AppMethodBeat.o(397);
    return paramOnClickListener;
  }

  public static c a(c paramc, String paramString, View.OnClickListener paramOnClickListener)
  {
    if (paramString != null);
    for (boolean bool = true; ; bool = false)
    {
      paramc.lYC = bool;
      paramc.lYK = paramString;
      paramc.lYO = paramOnClickListener;
      return paramc;
    }
  }

  public static c b(int paramInt, String paramString1, String paramString2, String paramString3, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    AppMethodBeat.i(395);
    paramString1 = c(paramInt, paramString1, paramString2, paramString3, paramOnClickListener1, paramOnClickListener2);
    AppMethodBeat.o(395);
    return paramString1;
  }

  public static c bti()
  {
    AppMethodBeat.i(393);
    c localc = b(2130838675, null, null, null, null, null);
    AppMethodBeat.o(393);
    return localc;
  }

  private static c c(int paramInt, String paramString1, String paramString2, String paramString3, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(396);
    c localc = new c();
    localc.lYJ = paramInt;
    localc.lYF = paramString1;
    if (paramString2 != null)
    {
      bool2 = true;
      localc.lYw = bool2;
      localc.lYG = paramString2;
      localc.lYA = false;
      localc.lYH = null;
      if (paramString3 == null)
        break label136;
    }
    label136: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localc.lYz = bool2;
      localc.lYI = paramString3;
      localc.lYC = false;
      localc.lYK = null;
      localc.lYM = paramOnClickListener1;
      localc.lYN = null;
      localc.lYP = paramOnClickListener2;
      localc.lYO = null;
      AppMethodBeat.o(396);
      return localc;
      bool2 = false;
      break;
    }
  }

  public void M(Bitmap paramBitmap)
  {
    AppMethodBeat.i(389);
    this.lWz.setBackgroundDrawable(new BitmapDrawable(paramBitmap));
    AppMethodBeat.o(389);
  }

  public void a(c paramc)
  {
    AppMethodBeat.i(391);
    if (lWK != null)
      lWK.cancel();
    if (paramc == null)
    {
      AppMethodBeat.o(391);
      return;
    }
    ab.i("MicroMsg.FaceDetectJumper", "hy: request show conf: %s", new Object[] { paramc.toString() });
    label91: int i;
    label135: label179: String str;
    if (paramc.lYz)
    {
      ab.i("MicroMsg.FaceDetectJumper", " mCancelBtn VISIBLE");
      this.lWE.setVisibility(0);
      this.lWE.setText(paramc.lYI);
      this.lWE.setOnClickListener(paramc.lYP);
      if (!paramc.lYw)
        break label487;
      ab.i("MicroMsg.FaceDetectJumper", " isShowMainButton VISIBLE");
      this.lWA.setVisibility(0);
      this.lWA.setText(paramc.lYG);
      this.lWA.setOnClickListener(paramc.lYM);
      if (!paramc.lYA)
        break label498;
      ab.i("MicroMsg.FaceDetectJumper", " mSubBtn VISIBLE");
      this.lWF.setVisibility(0);
      this.lWF.setText(paramc.lYH);
      this.lWF.setOnClickListener(paramc.lYN);
      if (!paramc.lYx)
        break label612;
      ab.i("MicroMsg.FaceDetectJumper", " isShowStatusWordingTv VISIBLE");
      this.lWC.setVisibility(0);
      if (!paramc.lYB)
        break label582;
      ab.i("MicroMsg.FaceDetectJumper", " isShowOneByOne VISIBLE");
      this.lWD.setVisibility(0);
      i = paramc.lYD;
      str = paramc.lYF;
      if ((!bo.isNullOrNil(str)) && (i < str.length()) && (i >= 0))
        break label509;
      ab.e("MicroMsg.FaceDetectJumper", "hy: invalid showing one by one");
      this.lWC.setText(str);
      this.lWD.setText("");
      label276: if (!paramc.lYy)
        break label639;
      ab.i("MicroMsg.FaceDetectJumper", " mStatusIv VISIBLE");
      this.lWB.setVisibility(0);
      this.lWB.setImageResource(paramc.lYJ);
      label309: if (!paramc.lYC)
        break label650;
      ab.i("MicroMsg.FaceDetectJumper", " mFeedbackTv VISIBLE");
      this.lWG.setVisibility(0);
      this.lWG.setText(paramc.lYK);
      this.lWG.setOnClickListener(paramc.lYO);
    }
    while (true)
    {
      if (paramc.lYE != null)
      {
        ab.i("MicroMsg.FaceDetectJumper", "bgBm：：%s ", new Object[] { paramc.lYE });
        this.lWz.setBackgroundDrawable(new BitmapDrawable(paramc.lYE));
      }
      ab.i("MicroMsg.FaceDetectJumper", "show jumper, visible: %s", new Object[] { Integer.valueOf(this.lWz.getVisibility()) });
      if (this.lWz.getVisibility() != 0)
      {
        this.lWz.setVisibility(0);
        this.lWz.startAnimation(this.lWH);
        this.lWH.setAnimationListener(new a.2(this, paramc));
      }
      AppMethodBeat.o(391);
      break;
      this.lWE.setVisibility(4);
      break label91;
      label487: this.lWA.setVisibility(4);
      break label135;
      label498: this.lWF.setVisibility(4);
      break label179;
      label509: lWK.cancel();
      a.b localb = lWK;
      WeakReference localWeakReference1 = new WeakReference(this.lWC);
      WeakReference localWeakReference2 = new WeakReference(this.lWD);
      localb.lWQ = str;
      localb.lWR = i;
      localb.lWO = localWeakReference1;
      localb.lWP = localWeakReference2;
      lWK.start();
      break label276;
      label582: ab.i("MicroMsg.FaceDetectJumper", " imTweekyTv VISIBLE");
      this.lWD.setVisibility(4);
      this.lWC.setText(paramc.lYF);
      break label276;
      label612: ab.i("MicroMsg.FaceDetectJumper", " mStatusWordingTV VISIBLE");
      this.lWC.setVisibility(4);
      this.lWD.setVisibility(4);
      break label276;
      label639: this.lWB.setVisibility(4);
      break label309;
      label650: this.lWG.setVisibility(4);
    }
  }

  public boolean aFF()
  {
    AppMethodBeat.i(392);
    boolean bool;
    if (this.lWz.getVisibility() != 8)
    {
      bool = true;
      AppMethodBeat.o(392);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(392);
    }
  }

  public void create()
  {
    AppMethodBeat.i(387);
    synchronized ((FaceDetectPrepareUI)this.lWJ.get())
    {
      if (this.lWJ.get() != null)
      {
        this.lWz = ((RelativeLayout)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823797));
        this.lWA = ((Button)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131822846));
        this.lWB = ((ImageView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823799));
        this.lWC = ((TextView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823800));
        this.lWH = AnimationUtils.loadAnimation((Context)this.lWJ.get(), 2131034125);
        this.lWI = AnimationUtils.loadAnimation((Context)this.lWJ.get(), 2131034126);
        this.lWE = ((Button)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823804));
        this.lWF = ((Button)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823802));
        this.lWD = ((TextView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823801));
        this.lWG = ((TextView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823803));
        this.lWH.setDuration(500L);
        this.lWI.setDuration(500L);
      }
      AppMethodBeat.o(387);
      return;
    }
  }

  public void dismiss()
  {
    AppMethodBeat.i(388);
    ab.c("MicroMsg.FaceDetectJumper", "dismiss jumper", new Object[0]);
    lWK.cancel();
    if (this.lWz.getVisibility() == 0)
      al.d(new a.1(this));
    AppMethodBeat.o(388);
  }

  public void resetAll()
  {
    AppMethodBeat.i(390);
    if (lWK != null)
      lWK.cancel();
    this.lWE.setVisibility(4);
    this.lWA.setVisibility(4);
    this.lWF.setVisibility(4);
    this.lWD.setVisibility(4);
    this.lWC.setVisibility(4);
    AppMethodBeat.o(390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.a
 * JD-Core Version:    0.6.2
 */