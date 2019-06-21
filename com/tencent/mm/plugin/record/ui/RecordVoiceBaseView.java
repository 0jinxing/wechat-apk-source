package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.b.s;
import com.tencent.mm.plugin.record.b.s.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public class RecordVoiceBaseView extends TextView
  implements s.a
{
  public int cAO;
  private Context context;
  public int duration;
  private boolean isRunning;
  private AlphaAnimation mhK;
  private AnimationDrawable mhL;
  private s pKR;
  public String path;

  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(24325);
    this.isRunning = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(24325);
  }

  public RecordVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(24326);
    this.isRunning = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(24326);
  }

  private void bvA()
  {
    AppMethodBeat.i(24327);
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
    AppMethodBeat.o(24327);
  }

  private void ceT()
  {
    AppMethodBeat.i(24328);
    if ((this.mhK != null) && (this.mhK.isInitialized()))
      setAnimation(null);
    this.isRunning = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(2131231077), null, null, null);
    this.mhL.stop();
    AppMethodBeat.o(24328);
  }

  public final void VJ(String paramString)
  {
    AppMethodBeat.i(24332);
    ab.d("MicroMsg.RecordVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bo.bc(paramString, "").equals(this.path))
      ceT();
    AppMethodBeat.o(24332);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(24333);
    stopPlay();
    AppMethodBeat.o(24333);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(24329);
    super.onFinishInflate();
    setOnClickListener(new RecordVoiceBaseView.1(this));
    AppMethodBeat.o(24329);
  }

  public void setVoiceHelper(s params)
  {
    AppMethodBeat.i(24330);
    this.pKR = params;
    params = this.pKR;
    Iterator localIterator = params.callbacks.iterator();
    do
      if (!localIterator.hasNext())
        break;
    while (this != (s.a)localIterator.next());
    while (true)
    {
      AppMethodBeat.o(24330);
      return;
      params.callbacks.add(this);
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(24331);
    ab.d("MicroMsg.RecordVoiceBaseView", "stop play");
    ceT();
    this.pKR.stopPlay();
    AppMethodBeat.o(24331);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordVoiceBaseView
 * JD-Core Version:    0.6.2
 */