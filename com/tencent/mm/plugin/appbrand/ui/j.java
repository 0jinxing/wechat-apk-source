package com.tencent.mm.plugin.appbrand.ui;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.a.a.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.f;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.widget.actionbar.f.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.lang.ref.WeakReference;

@SuppressLint({"ViewConstructor"})
public final class j extends com.tencent.mm.ui.statusbar.b
  implements com.tencent.mm.plugin.appbrand.launching.j, q
{
  private i gPI;
  private ThreeDotsLoadingView iDW;
  private TextView iFX;
  private LinearLayout iFY;
  private com.tencent.mm.plugin.appbrand.widget.actionbar.b iFZ;
  private TextView iGc;
  private View iJh;
  private View iJi;
  private ImageView kU;

  public j(Context paramContext, i parami)
  {
    super(paramContext);
    AppMethodBeat.i(102326);
    this.gPI = parami;
    setClickable(true);
    setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    LayoutInflater.from(getContext()).inflate(2130968738, this);
    this.kU = ((ImageView)findViewById(2131821389));
    paramContext = this.kU;
    if (v.fpX != null)
    {
      parami = (Bitmap)v.fpX.get();
      if ((parami != null) && (!parami.isRecycled()));
    }
    else
    {
      v.fpX = new WeakReference(BitmapFactory.decodeResource(ah.getResources(), 2130839503));
    }
    parami = d.a(ah.getResources(), (Bitmap)v.fpX.get());
    parami.dA();
    paramContext.setImageDrawable(parami);
    this.iFX = ((TextView)findViewById(2131821390));
    this.iDW = ((ThreeDotsLoadingView)findViewById(2131821391));
    this.iFY = ((LinearLayout)findViewById(2131821386));
    this.iJi = findViewById(2131821388);
    this.iJh = findViewById(2131821387);
    this.iGc = ((TextView)findViewById(2131821378));
    this.iFZ = f.a.dh(getContext());
    this.iFY.addView(this.iFZ.getActionView());
    int i = com.tencent.mm.plugin.appbrand.widget.a.de(getContext());
    this.iFX.getLayoutParams().height = i;
    K(-1, true);
    this.iFZ.setFullscreenMode(true);
    this.iFZ.setForegroundStyle("black");
    paramContext = new j.2(this);
    this.iFZ.setCloseButtonClickListener(paramContext);
    this.iFZ.setBackButtonClickListener(paramContext);
    this.iDW.dKS();
    AppMethodBeat.o(102326);
  }

  public final void aHS()
  {
    AppMethodBeat.i(102328);
    post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(102323);
        Object localObject = j.this.getParent();
        if (!(localObject instanceof ViewGroup))
          AppMethodBeat.o(102323);
        while (true)
        {
          return;
          ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { 255, 0 });
          localValueAnimator.addUpdateListener(new j.1.1(this, (ViewParent)localObject));
          localValueAnimator.setStartDelay(Math.round((float)localValueAnimator.getDuration() * 0.8F));
          localValueAnimator.setDuration(Math.round((float)localValueAnimator.getDuration() * 0.2F));
          localValueAnimator.setInterpolator(new android.support.v4.view.b.a());
          localValueAnimator.start();
          localObject = ValueAnimator.ofFloat(new float[] { 1.0F, 0.0F });
          ((ValueAnimator)localObject).setDuration(Math.round((float)((ValueAnimator)localObject).getDuration() * 0.8F));
          ((ValueAnimator)localObject).addUpdateListener(new j.1.2(this));
          ((ValueAnimator)localObject).setInterpolator(new android.support.v4.view.b.b());
          ((ValueAnimator)localObject).start();
          AppMethodBeat.o(102323);
        }
      }
    });
    AppMethodBeat.o(102328);
  }

  public final void aHT()
  {
    AppMethodBeat.i(102329);
    this.iFZ.setNavHidden(true);
    AppMethodBeat.o(102329);
  }

  public final void cz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102327);
    com.tencent.mm.modelappbrand.a.b.abR().a(this.kU, paramString1, null, f.fqH);
    this.iFX.setText(paramString2);
    AppMethodBeat.o(102327);
  }

  public final View getView()
  {
    return this;
  }

  public final boolean hasOverlappingRendering()
  {
    return false;
  }

  public final void nm(int paramInt)
  {
    AppMethodBeat.i(102331);
    al.d(new j.3(this, paramInt));
    AppMethodBeat.o(102331);
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(102330);
    super.onAttachedToWindow();
    n.q(getContext(), false);
    AppMethodBeat.o(102330);
  }

  public final void setProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.j
 * JD-Core Version:    0.6.2
 */