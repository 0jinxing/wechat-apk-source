package com.tencent.mm.plugin.facedetect.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.model.FaceCharacteristicsResult;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ay;
import java.util.Timer;

public final class c
  implements b
{
  private static String TAG = "MicroMsg.NormalFaceMotion";
  private static long lVc = 500L;
  private boolean lVd;
  private boolean lVe;
  private View lVf;
  private View lVg;
  private String lVh;
  private long lVi;
  private final Object lVj;
  private Timer lVk;
  private volatile boolean lVl;
  private Animation lVm;
  private volatile boolean lVn;
  private volatile boolean lVo;

  public c(String paramString, long paramLong)
  {
    AppMethodBeat.i(300);
    this.lVd = false;
    this.lVe = false;
    this.lVf = null;
    this.lVg = null;
    this.lVj = new Object();
    this.lVk = null;
    this.lVl = false;
    this.lVn = false;
    this.lVo = false;
    this.lVh = paramString;
    this.lVi = paramLong;
    this.lVm = AnimationUtils.loadAnimation(ah.getContext(), 2131034265);
    AppMethodBeat.o(300);
  }

  public final void a(Context paramContext, ViewGroup paramViewGroup1, ViewGroup paramViewGroup2)
  {
    AppMethodBeat.i(303);
    this.lVf = LayoutInflater.from(paramContext).inflate(2130969461, paramViewGroup1);
    this.lVg = LayoutInflater.from(paramContext).inflate(2130969462, paramViewGroup2);
    this.lVg.setVisibility(4);
    if (bta() != null)
      bta().setText(this.lVh);
    long l = this.lVi;
    ab.i(TAG, "hy: starting tween timer: tween: %d", new Object[] { Long.valueOf(l) });
    if (this.lVk != null)
      this.lVk.cancel();
    this.lVk = new Timer("FaceDetect_hint", true);
    this.lVl = true;
    this.lVk.scheduleAtFixedRate(new c.2(this), 0L, l);
    AppMethodBeat.o(303);
  }

  public final boolean a(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    AppMethodBeat.i(304);
    boolean bool;
    if ((this.lVd) && (paramFaceCharacteristicsResult != null) && (paramFaceCharacteristicsResult.errCode == 18))
    {
      ab.d(TAG, "hy: ignore too active");
      bool = true;
      AppMethodBeat.o(304);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(304);
    }
  }

  public final boolean b(FaceCharacteristicsResult paramFaceCharacteristicsResult)
  {
    AppMethodBeat.i(305);
    if (paramFaceCharacteristicsResult.errCode == -1)
    {
      this.lVd = true;
      if (!this.lVn)
      {
        ay.au(ah.getContext(), 2131302091);
        TextView localTextView = (TextView)this.lVf.findViewById(2131823775);
        paramFaceCharacteristicsResult = AnimationUtils.loadAnimation(ah.getContext(), 2131034173);
        Animation localAnimation = AnimationUtils.loadAnimation(ah.getContext(), 2131034180);
        paramFaceCharacteristicsResult.setDuration(lVc);
        localAnimation.setDuration(lVc);
        localTextView.startAnimation(paramFaceCharacteristicsResult);
        localTextView.setVisibility(4);
        this.lVg.setVisibility(0);
        this.lVg.startAnimation(localAnimation);
        this.lVg.findViewById(2131823776).setOnClickListener(new c.1(this));
        this.lVn = true;
        AppMethodBeat.o(305);
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      AppMethodBeat.o(305);
    }
  }

  public final boolean bsV()
  {
    if ((this.lVd) && (this.lVe));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bsW()
  {
    return false;
  }

  public final void bsX()
  {
    AppMethodBeat.i(306);
    this.lVl = false;
    if (this.lVk != null)
      this.lVk.cancel();
    this.lVd = false;
    this.lVn = false;
    this.lVo = false;
    this.lVe = false;
    AppMethodBeat.o(306);
  }

  public final b.b bsY()
  {
    AppMethodBeat.i(307);
    b.b localb;
    if (this.lVd)
    {
      localb = new b.b(90025, "user cancelled in intermediate page");
      AppMethodBeat.o(307);
    }
    while (true)
    {
      return localb;
      localb = new b.b(90004, "user cancelled in processing");
      AppMethodBeat.o(307);
    }
  }

  public final b.a bsZ()
  {
    AppMethodBeat.i(308);
    b.a locala;
    if ((this.lVd) && (!this.lVo))
    {
      this.lVo = true;
      locala = new b.a();
      AppMethodBeat.o(308);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(308);
    }
  }

  public final TextView bta()
  {
    AppMethodBeat.i(301);
    TextView localTextView;
    if ((!this.lVd) && (this.lVf != null))
    {
      localTextView = (TextView)this.lVf.findViewById(2131823775);
      AppMethodBeat.o(301);
    }
    while (true)
    {
      return localTextView;
      if ((this.lVd) && (this.lVg != null))
      {
        localTextView = (TextView)this.lVg.findViewById(2131823775);
        AppMethodBeat.o(301);
      }
      else
      {
        localTextView = null;
        AppMethodBeat.o(301);
      }
    }
  }

  public final void setBusinessTip(String paramString)
  {
    AppMethodBeat.i(302);
    String str = TAG;
    StringBuilder localStringBuilder = new StringBuilder("getHintMsgTv() == null : ");
    boolean bool;
    if (bta() == null)
    {
      bool = true;
      ab.d(str, bool);
      if (bta() != null)
        break label63;
      AppMethodBeat.o(302);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label63: bta().setText(paramString);
      AppMethodBeat.o(302);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.c
 * JD-Core Version:    0.6.2
 */