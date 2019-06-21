package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.a.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class FavChatVoiceView extends TextView
  implements n.a
{
  private int cAO;
  private Context context;
  private int duration;
  private boolean isRunning;
  private n mgA;
  private AlphaAnimation mhK;
  private AnimationDrawable mhL;
  private String path;

  public FavChatVoiceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(73938);
    this.isRunning = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(73938);
  }

  public FavChatVoiceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(73939);
    this.isRunning = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(73939);
  }

  private void bvA()
  {
    AppMethodBeat.i(73940);
    this.mhK = new AlphaAnimation(0.1F, 1.0F);
    this.mhK.setDuration(1000L);
    this.mhK.setRepeatCount(-1);
    this.mhK.setRepeatMode(2);
    this.mhL = new AnimationDrawable();
    Drawable localDrawable = getResources().getDrawable(2131231078);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mhL.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(2131231079);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mhL.addFrame(localDrawable, 300);
    localDrawable = getResources().getDrawable(2131231080);
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    this.mhL.addFrame(localDrawable, 300);
    this.mhL.setOneShot(false);
    this.mhL.setVisible(true, true);
    AppMethodBeat.o(73940);
  }

  public final void bI(String paramString, int paramInt)
  {
    AppMethodBeat.i(73945);
    if (!this.path.equals(paramString))
      stopPlay();
    AppMethodBeat.o(73945);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(73946);
    stopPlay();
    AppMethodBeat.o(73946);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(73941);
    super.onFinishInflate();
    setOnClickListener(new FavChatVoiceView.1(this));
    AppMethodBeat.o(73941);
  }

  public final void onPause()
  {
    AppMethodBeat.i(73947);
    stopPlay();
    AppMethodBeat.o(73947);
  }

  public void setVoiceHelper(n paramn)
  {
    AppMethodBeat.i(73944);
    this.mgA = paramn;
    this.mgA.a(this);
    AppMethodBeat.o(73944);
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(73943);
    ab.d("MicroMsg.FavChatVoiceView", "stop play");
    if ((this.mhK != null) && (this.mhK.isInitialized()))
      setAnimation(null);
    this.isRunning = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(2131231077), null, null, null);
    this.mhL.stop();
    this.mgA.stopPlay();
    AppMethodBeat.o(73943);
  }

  public final void t(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(73942);
    this.path = bo.bc(paramString1, "");
    this.cAO = paramInt;
    setText(paramString2);
    AppMethodBeat.o(73942);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavChatVoiceView
 * JD-Core Version:    0.6.2
 */