package com.tencent.mm.plugin.facedetect.ui;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

public final class b extends a
{
  private Button lWA;
  private Button lWE;
  private TextView lWG;
  private ViewGroup lYe;
  private ImageView lYf;
  private RelativeLayout lYg;
  private RelativeLayout lYh;
  private RelativeLayout lYi;
  private ImageView lYj;
  private ImageView lYk;
  private ImageView lYl;
  private TextView lYm;
  private TextView lYn;
  private TextView lYo;

  b(FaceDetectPrepareUI paramFaceDetectPrepareUI)
  {
    super(paramFaceDetectPrepareUI);
  }

  public final void M(Bitmap paramBitmap)
  {
    AppMethodBeat.i(511);
    this.lYf.setImageBitmap(paramBitmap);
    AppMethodBeat.o(511);
  }

  public final void a(c paramc)
  {
    AppMethodBeat.i(509);
    ab.i("MicroMsg.FaceReflectJumper", "show config: %s", new Object[] { paramc });
    this.lYe.setVisibility(0);
    if (paramc.lYz)
    {
      if (paramc.lYP != null)
        this.lWE.setOnClickListener(paramc.lYP);
      this.lWE.setVisibility(0);
      if (!bo.isNullOrNil(paramc.lYI))
        this.lWE.setText(paramc.lYI);
      if (!paramc.lYw)
        break label267;
      if (paramc.lYM != null)
        this.lWA.setOnClickListener(paramc.lYM);
      this.lWA.setVisibility(0);
      if (!bo.isNullOrNil(paramc.lYG))
        this.lWA.setText(paramc.lYG);
      label137: if (!paramc.lYC)
        break label279;
      if (paramc.lYO != null)
      {
        this.lWG.setClickable(true);
        this.lWG.setOnClickListener(paramc.lYO);
      }
      this.lWG.setVisibility(0);
      if (!bo.isNullOrNil(paramc.lYK))
        this.lWG.setText(paramc.lYK);
      label199: if (paramc.lYE != null)
        this.lYf.setImageBitmap(paramc.lYE);
      switch (paramc.status)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      AppMethodBeat.o(509);
      while (true)
      {
        return;
        this.lWE.setVisibility(8);
        break;
        label267: this.lWA.setVisibility(8);
        break label137;
        label279: this.lWG.setVisibility(8);
        break label199;
        if (!bo.isNullOrNil(paramc.lYF))
          this.lYm.setText(paramc.lYF);
        ab.i("MicroMsg.FaceReflectJumper", "checking animation");
        this.lYg.setVisibility(0);
        this.lYh.setVisibility(8);
        this.lYi.setVisibility(8);
        this.lYj.post(new b.1(this));
        AppMethodBeat.o(509);
        continue;
        if (!bo.isNullOrNil(paramc.lYF))
          this.lYn.setText(paramc.lYF);
        ab.i("MicroMsg.FaceReflectJumper", "check success animation");
        this.lYk.clearAnimation();
        this.lYg.setVisibility(8);
        this.lYh.setVisibility(0);
        this.lYg.setVisibility(8);
        this.lYi.setVisibility(8);
        this.lYl.setScaleX(0.0F);
        this.lYl.setScaleY(0.0F);
        this.lYl.animate().scaleX(1.0F).scaleY(1.0F).setDuration(800L);
        AppMethodBeat.o(509);
      }
      if (!bo.isNullOrNil(paramc.lYF))
        this.lYo.setText(paramc.lYF);
      ab.i("MicroMsg.FaceReflectJumper", "check failed animation");
      this.lYh.setVisibility(8);
      this.lYg.setVisibility(8);
      this.lYi.setVisibility(0);
      this.lYk.clearAnimation();
      this.lYg.setVisibility(8);
    }
  }

  public final boolean aFF()
  {
    AppMethodBeat.i(513);
    boolean bool;
    if (this.lYe.getVisibility() == 0)
    {
      bool = true;
      AppMethodBeat.o(513);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(513);
    }
  }

  public final void create()
  {
    AppMethodBeat.i(508);
    synchronized ((FaceDetectPrepareUI)this.lWJ.get())
    {
      if (this.lWJ.get() != null)
      {
        this.lYe = ((ViewGroup)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823811));
        this.lYf = ((ImageView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823812));
        this.lYg = ((RelativeLayout)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823751));
        this.lYh = ((RelativeLayout)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823747));
        this.lYi = ((RelativeLayout)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823742));
        this.lYj = ((ImageView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823753));
        this.lYk = ((ImageView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823752));
        this.lYl = ((ImageView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823749));
        this.lWE = ((Button)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823815));
        this.lWA = ((Button)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823813));
        this.lWG = ((TextView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823814));
        this.lYm = ((TextView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823754));
        this.lYn = ((TextView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823750));
        this.lYo = ((TextView)((FaceDetectPrepareUI)this.lWJ.get()).findViewById(2131823744));
        this.lYe.setVisibility(8);
      }
      AppMethodBeat.o(508);
      return;
    }
  }

  public final void dismiss()
  {
    AppMethodBeat.i(510);
    ab.c("MicroMsg.FaceReflectJumper", "dismiss jumper", new Object[0]);
    if (this.lWJ.get() != null)
      ((FaceDetectPrepareUI)this.lWJ.get()).runOnUiThread(new b.2(this));
    AppMethodBeat.o(510);
  }

  public final void resetAll()
  {
    AppMethodBeat.i(512);
    this.lYg.setVisibility(8);
    this.lYh.setVisibility(8);
    this.lYi.setVisibility(8);
    this.lWE.setVisibility(8);
    this.lWG.setVisibility(8);
    this.lWA.setVisibility(8);
    AppMethodBeat.o(512);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.b
 * JD-Core Version:    0.6.2
 */