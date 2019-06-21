package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class NoteVoiceView extends FrameLayout
  implements a.a
{
  public int cAO;
  public int duration;
  public View iVh;
  private ViewGroup mkc;
  TextView mkd;
  private ImageButton mke;
  private TextView mkf;
  public String path;
  private TextView uVj;
  public a uVk;
  public NoteVoiceView.a uVl;

  public NoteVoiceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27217);
    this.path = "";
    init(paramContext);
    AppMethodBeat.o(27217);
  }

  public NoteVoiceView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(27218);
    this.path = "";
    init(paramContext);
    AppMethodBeat.o(27218);
  }

  private void dfZ()
  {
    AppMethodBeat.i(27224);
    this.uVl.stop();
    this.mkd.setKeepScreenOn(false);
    AppMethodBeat.o(27224);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(27219);
    LayoutInflater.from(paramContext).inflate(2130970318, this, true);
    AppMethodBeat.o(27219);
  }

  public final void ahs(String paramString)
  {
    AppMethodBeat.i(27220);
    if (!this.path.equals(paramString))
      dfZ();
    AppMethodBeat.o(27220);
  }

  public final void dfX()
  {
    AppMethodBeat.i(27221);
    dfZ();
    AppMethodBeat.o(27221);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(27222);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.NoteVoiceView", "on configuration changed, is paused ? %B", new Object[] { Boolean.valueOf(this.uVl.isPaused) });
    if (this.uVl.isPaused)
      this.uVl.postDelayed(new NoteVoiceView.1(this), 128L);
    AppMethodBeat.o(27222);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(27223);
    super.onFinishInflate();
    this.mkc = ((ViewGroup)findViewById(2131824009));
    this.mkf = ((TextView)findViewById(2131824008));
    this.uVj = ((TextView)findViewById(2131824011));
    this.mkd = ((TextView)findViewById(2131824010));
    this.mke = ((ImageButton)findViewById(2131824007));
    this.iVh = findViewById(2131826423);
    this.uVl = new NoteVoiceView.a(this, (byte)0);
    this.mke.setOnClickListener(new NoteVoiceView.2(this));
    AppMethodBeat.o(27223);
  }

  public void setVoiceHelper(a parama)
  {
    AppMethodBeat.i(27225);
    this.uVk = parama;
    this.uVk.a(this);
    AppMethodBeat.o(27225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView
 * JD-Core Version:    0.6.2
 */