package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class NoteEditorVoiceBaseView extends TextView
  implements a.a
{
  public int cAO;
  private Context context;
  private int duration;
  private boolean isRunning;
  private AlphaAnimation mhK;
  private AnimationDrawable mhL;
  public String path;

  public NoteEditorVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27189);
    this.isRunning = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(27189);
  }

  public NoteEditorVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(27190);
    this.isRunning = false;
    this.duration = -1;
    this.path = "";
    this.context = paramContext;
    bvA();
    AppMethodBeat.o(27190);
  }

  private void bvA()
  {
    AppMethodBeat.i(27191);
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
    AppMethodBeat.o(27191);
  }

  public final void ahs(String paramString)
  {
    AppMethodBeat.i(27194);
    ab.d("MicroMsg.NoteEditorVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bo.bc(paramString, "").equals(this.path))
      ceT();
    AppMethodBeat.o(27194);
  }

  public final void ceT()
  {
    AppMethodBeat.i(27192);
    if ((this.mhK != null) && (this.mhK.isInitialized()))
      setAnimation(null);
    this.isRunning = false;
    setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(2131231077), null, null, null);
    this.mhL.stop();
    AppMethodBeat.o(27192);
  }

  public final void dfX()
  {
    AppMethodBeat.i(27195);
    ceT();
    AppMethodBeat.o(27195);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(27193);
    super.onFinishInflate();
    setOnClickListener(new NoteEditorVoiceBaseView.1(this));
    AppMethodBeat.o(27193);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView
 * JD-Core Version:    0.6.2
 */