package com.tencent.mm.plugin.fav.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.n;
import com.tencent.mm.plugin.fav.a.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public class FavVoiceBaseView extends LinearLayout
  implements n.a
{
  private int cAO;
  private int duration;
  private n mgA;
  private ViewGroup mkc;
  private TextView mkd;
  private ImageButton mke;
  private TextView mkf;
  private a mkg;
  private String path = "";

  public FavVoiceBaseView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void bI(String paramString, int paramInt)
  {
    AppMethodBeat.i(74179);
    ab.d("MicroMsg.FavVoiceBaseView", "on play, my path %s, my duration %d, play path %s", new Object[] { this.path, Integer.valueOf(this.duration), paramString });
    if (!bo.bc(paramString, "").equals(this.path))
    {
      this.mkg.stop();
      this.mkd.setKeepScreenOn(false);
      AppMethodBeat.o(74179);
    }
    while (true)
    {
      return;
      this.mkd.setKeepScreenOn(true);
      this.mkg.begin();
      AppMethodBeat.o(74179);
    }
  }

  public final boolean buJ()
  {
    AppMethodBeat.i(74178);
    ab.i("MicroMsg.FavVoiceBaseView", "pause play");
    boolean bool = this.mgA.buJ();
    a locala = this.mkg;
    locala.isPaused = true;
    locala.removeMessages(4096);
    locala.mkh.mke.setImageResource(2131232106);
    locala.mkh.mke.setContentDescription(locala.mkh.getContext().getResources().getString(2131297015));
    this.mkd.setKeepScreenOn(false);
    AppMethodBeat.o(74178);
    return bool;
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(74175);
    super.onConfigurationChanged(paramConfiguration);
    ab.i("MicroMsg.FavVoiceBaseView", "on configuration changed, is paused ? %B", new Object[] { Boolean.valueOf(this.mkg.isPaused) });
    if (this.mkg.isPaused)
      this.mkg.postDelayed(new FavVoiceBaseView.1(this), 128L);
    AppMethodBeat.o(74175);
  }

  public final void onFinish()
  {
    AppMethodBeat.i(74180);
    ab.d("MicroMsg.FavVoiceBaseView", "stop play");
    this.mgA.stopPlay();
    this.mkg.stop();
    this.mkd.setKeepScreenOn(false);
    AppMethodBeat.o(74180);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(74176);
    super.onFinishInflate();
    this.mkc = ((ViewGroup)findViewById(2131824009));
    this.mkf = ((TextView)findViewById(2131824008));
    this.mkd = ((TextView)findViewById(2131824010));
    this.mke = ((ImageButton)findViewById(2131824007));
    this.mkg = new a((byte)0);
    this.mke.setOnClickListener(new FavVoiceBaseView.2(this));
    AppMethodBeat.o(74176);
  }

  public final void onPause()
  {
    AppMethodBeat.i(74181);
    buJ();
    AppMethodBeat.o(74181);
  }

  public void setVoiceHelper(n paramn)
  {
    AppMethodBeat.i(74177);
    this.mgA = paramn;
    this.mgA.a(this);
    AppMethodBeat.o(74177);
  }

  final class a extends ak
  {
    boolean isPaused;
    float mki;
    float mkj;
    int mkk;
    int mkl;

    private a()
    {
    }

    @SuppressLint({"ResourceType"})
    private void vD(int paramInt)
    {
      AppMethodBeat.i(74170);
      this.isPaused = false;
      this.mki = b.fY(paramInt);
      this.mkj = this.mki;
      this.mkl = a.fromDPToPix(FavVoiceBaseView.this.getContext(), 3);
      FavVoiceBaseView.a(FavVoiceBaseView.this).setText(j.B(FavVoiceBaseView.this.getContext(), (int)this.mki));
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(2131232106);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(2131297015));
      FavVoiceBaseView.c(FavVoiceBaseView.this).setWidth(this.mkl);
      AppMethodBeat.o(74170);
    }

    public final void Vd()
    {
      AppMethodBeat.i(74173);
      this.mkk = ((int)((1.0F - this.mkj / this.mki) * (FavVoiceBaseView.e(FavVoiceBaseView.this).getWidth() - this.mkl)) + this.mkl);
      FavVoiceBaseView.a(FavVoiceBaseView.this).setText(j.B(FavVoiceBaseView.this.getContext(), Math.min((int)Math.ceil(this.mkj), (int)this.mki)));
      FavVoiceBaseView.c(FavVoiceBaseView.this).setWidth(this.mkk);
      AppMethodBeat.o(74173);
    }

    @SuppressLint({"ResourceType"})
    public final void begin()
    {
      AppMethodBeat.i(74171);
      stop();
      this.isPaused = false;
      FavVoiceBaseView.b(FavVoiceBaseView.this).setImageResource(2131232107);
      FavVoiceBaseView.b(FavVoiceBaseView.this).setContentDescription(FavVoiceBaseView.this.getContext().getResources().getString(2131296997));
      sendEmptyMessage(4096);
      AppMethodBeat.o(74171);
    }

    public final void handleMessage(Message paramMessage)
    {
      AppMethodBeat.i(74174);
      this.mkj = Math.max(0.0F, this.mkj - 0.256F);
      Vd();
      if (this.mkj <= 0.1F)
        AppMethodBeat.o(74174);
      while (true)
      {
        return;
        sendEmptyMessageDelayed(4096, 256L);
        AppMethodBeat.o(74174);
      }
    }

    public final void stop()
    {
      AppMethodBeat.i(74172);
      this.isPaused = false;
      removeMessages(4096);
      vD(FavVoiceBaseView.d(FavVoiceBaseView.this));
      AppMethodBeat.o(74172);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavVoiceBaseView
 * JD-Core Version:    0.6.2
 */