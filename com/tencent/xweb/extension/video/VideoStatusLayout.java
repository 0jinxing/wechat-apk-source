package com.tencent.xweb.extension.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class VideoStatusLayout extends RelativeLayout
{
  private VideoStatusLayout.a ANA;
  private VideoDotPercentIndicator ANw;
  private TextView ANx;
  private TextView ANy;
  private LinearLayout ANz;
  private int duration;
  private ImageView kla;

  public VideoStatusLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(84568);
    this.duration = 1000;
    LayoutInflater.from(paramContext).inflate(2130970674, this);
    this.kla = ((ImageView)findViewById(2131827557));
    this.ANw = ((VideoDotPercentIndicator)findViewById(2131827559));
    this.ANx = ((TextView)findViewById(2131827555));
    this.ANy = ((TextView)findViewById(2131827558));
    this.ANz = ((LinearLayout)findViewById(2131827556));
    this.ANA = new VideoStatusLayout.a(this, (byte)0);
    setVisibility(8);
    AppMethodBeat.o(84568);
  }

  public void setBrightProgress(int paramInt)
  {
    AppMethodBeat.i(84571);
    this.ANw.setProgress(paramInt);
    this.ANw.setVisibility(0);
    this.ANy.setText(2131306094);
    this.ANz.setVisibility(0);
    this.kla.setImageResource(2130840836);
    this.ANx.setVisibility(8);
    AppMethodBeat.o(84571);
  }

  public void setDuration(int paramInt)
  {
    this.duration = paramInt;
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(84573);
    this.kla.setImageResource(paramInt);
    AppMethodBeat.o(84573);
  }

  public void setVideoTimeProgress(String paramString)
  {
    AppMethodBeat.i(84572);
    this.ANx.setText(paramString);
    this.ANx.setVisibility(0);
    this.ANz.setVisibility(8);
    AppMethodBeat.o(84572);
  }

  public void setVolumnProgress(int paramInt)
  {
    AppMethodBeat.i(84570);
    this.ANw.setProgress(paramInt);
    this.ANw.setVisibility(0);
    this.ANy.setText(2131306095);
    this.ANz.setVisibility(0);
    this.kla.setImageResource(2130840846);
    this.ANx.setVisibility(8);
    AppMethodBeat.o(84570);
  }

  public final void show()
  {
    AppMethodBeat.i(84569);
    setVisibility(0);
    removeCallbacks(this.ANA);
    postDelayed(this.ANA, this.duration);
    AppMethodBeat.o(84569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.VideoStatusLayout
 * JD-Core Version:    0.6.2
 */