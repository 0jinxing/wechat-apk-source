package com.tencent.mm.plugin.fingerprint.faceid.auth;

import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.i;

public final class b extends i
  implements LifecycleObserver
{
  private View jcl;
  TextView kGq;
  FrameAnimatorImageView mre;
  TextView mrf;
  private TextView mrg;
  ViewGroup mrh;
  private ViewGroup mri;
  private b.a mrj;

  private b(Context paramContext)
  {
    super(paramContext, 2131493213);
    AppMethodBeat.i(41415);
    initView();
    AppMethodBeat.o(41415);
  }

  private b(Context paramContext, int paramInt)
  {
    super(paramContext, 2131493213);
    AppMethodBeat.i(41416);
    initView();
    AppMethodBeat.o(41416);
  }

  public b(Context paramContext, a parama)
  {
    this(paramContext, parama, null);
  }

  public b(Context paramContext, a parama, Bundle paramBundle)
  {
    this(paramContext);
    AppMethodBeat.i(41414);
    this.mrj = new b.a(this, parama, paramBundle);
    setOnShowListener(this.mrj);
    setOnDismissListener(this.mrj);
    setOnCancelListener(this.mrj);
    setCancelable(false);
    setCanceledOnTouchOutside(false);
    AppMethodBeat.o(41414);
  }

  private void bwY()
  {
    AppMethodBeat.i(41420);
    this.jcl.setBackgroundColor(0);
    this.kGq.setTextColor(Color.parseColor("#888888"));
    AppMethodBeat.o(41420);
  }

  private void initView()
  {
    AppMethodBeat.i(41419);
    this.jcl = View.inflate(getContext(), 2130969487, null);
    this.mri = ((ViewGroup)this.jcl.findViewById(2131823855));
    this.mre = ((FrameAnimatorImageView)this.jcl.findViewById(2131823856));
    this.kGq = ((TextView)this.jcl.findViewById(2131823857));
    this.mrf = ((TextView)this.jcl.findViewById(2131823860));
    this.mrg = ((TextView)this.jcl.findViewById(2131823859));
    this.mrh = ((ViewGroup)this.jcl.findViewById(2131823858));
    bwY();
    this.mrg.setOnClickListener(new b.1(this));
    this.mrf.setOnClickListener(new b.2(this));
    AppMethodBeat.o(41419);
  }

  public final void bwZ()
  {
    AppMethodBeat.i(41421);
    getWindow().setDimAmount(0.5F);
    this.jcl.setBackgroundResource(2130839847);
    this.mri.setBackground(null);
    this.kGq.setTextColor(Color.parseColor("#111111"));
    this.kGq.setTextSize(0, getContext().getResources().getDimensionPixelSize(2131427511));
    AppMethodBeat.o(41421);
  }

  public final void bxa()
  {
    AppMethodBeat.i(41422);
    ab.d("MicroMsg.WalletFaceIdDialog", "trigger load start");
    this.mre.a(2130838737, new b.3(this));
    AppMethodBeat.o(41422);
  }

  public final void d(Animation.AnimationListener paramAnimationListener)
  {
    AppMethodBeat.i(41423);
    this.mre.setImageResource(2130838684);
    Animation localAnimation = AnimationUtils.loadAnimation(getContext(), 2131034171);
    this.mre.startAnimation(localAnimation);
    if (paramAnimationListener != null)
      localAnimation.setAnimationListener(paramAnimationListener);
    AppMethodBeat.o(41423);
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
  public final void onActivityStop()
  {
    AppMethodBeat.i(41424);
    ab.i("MicroMsg.WalletFaceIdDialog", "activity pause");
    b.a.a(this.mrj);
    dismiss();
    AppMethodBeat.o(41424);
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41417);
    super.onCreate(paramBundle);
    setContentView(this.jcl);
    AppMethodBeat.o(41417);
  }

  protected final void onStart()
  {
    AppMethodBeat.i(41418);
    super.onStart();
    AppMethodBeat.o(41418);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.faceid.auth.b
 * JD-Core Version:    0.6.2
 */