package com.tencent.mm.plugin.music.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MusicSeekBar extends FrameLayout
{
  private Context context;
  boolean isLoading;
  private TextView oPd;
  private TextView oPe;
  private SeekBar oPf;
  ValueAnimator oPg;
  boolean oPh;
  c oPi;
  Drawable oPj;
  private MusicSeekBar.a oPk;

  public MusicSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MusicSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(105127);
    this.oPh = false;
    this.isLoading = false;
    this.context = paramContext;
    paramContext = LayoutInflater.from(this.context).inflate(2130970275, this);
    this.oPd = ((TextView)paramContext.findViewById(2131826269));
    this.oPe = ((TextView)paramContext.findViewById(2131824710));
    this.oPf = ((SeekBar)paramContext.findViewById(2131826270));
    this.oPd.setText("00:00");
    this.oPe.setText("--:--");
    this.oPi = new c(getResources().getDrawable(2130839641));
    this.oPj = getResources().getDrawable(2130839643);
    AppMethodBeat.o(105127);
  }

  private static String zW(int paramInt)
  {
    AppMethodBeat.i(105132);
    Object localObject = new StringBuilder();
    long l1 = paramInt / 60000;
    long l2 = ()Math.floor(paramInt % 60000 / 1000L);
    if (l1 < 10L)
      ((StringBuilder)localObject).append("0");
    ((StringBuilder)localObject).append(l1 + ":");
    if (l2 < 10L)
      ((StringBuilder)localObject).append("0");
    ((StringBuilder)localObject).append(l2);
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(105132);
    return localObject;
  }

  public final void jA(boolean paramBoolean)
  {
    AppMethodBeat.i(105128);
    if (this.oPg == null)
    {
      this.oPg = ValueAnimator.ofFloat(new float[] { 0.0F, 360.0F });
      this.oPg.setTarget(this.oPf);
      this.oPg.setRepeatCount(100);
      this.oPg.setDuration(5000L);
      this.oPg.setInterpolator(new LinearInterpolator());
      this.oPg.addUpdateListener(new MusicSeekBar.1(this));
    }
    this.isLoading = paramBoolean;
    if (paramBoolean)
    {
      this.oPg.start();
      AppMethodBeat.o(105128);
    }
    while (true)
    {
      return;
      this.oPg.cancel();
      this.oPf.setThumb(this.oPj);
      AppMethodBeat.o(105128);
    }
  }

  public void setColor(int paramInt)
  {
    AppMethodBeat.i(105129);
    this.oPd.setTextColor(paramInt);
    this.oPe.setTextColor(paramInt);
    this.oPf.getProgressDrawable().setColorFilter(paramInt, PorterDuff.Mode.MULTIPLY);
    this.oPf.getThumb().setColorFilter(paramInt, PorterDuff.Mode.MULTIPLY);
    this.oPj.setColorFilter(paramInt, PorterDuff.Mode.MULTIPLY);
    this.oPi.setColorFilter(paramInt, PorterDuff.Mode.MULTIPLY);
    this.oPf.setOnSeekBarChangeListener(new MusicSeekBar.2(this));
    AppMethodBeat.o(105129);
  }

  public void setMaxProgress(int paramInt)
  {
    AppMethodBeat.i(105131);
    this.oPe.setText(zW(paramInt));
    this.oPf.setMax(paramInt);
    AppMethodBeat.o(105131);
  }

  public void setOnSeekBarChange(MusicSeekBar.a parama)
  {
    this.oPk = parama;
  }

  public void setProgress(int paramInt)
  {
    AppMethodBeat.i(105130);
    if ((this.isLoading) || (this.oPh))
      AppMethodBeat.o(105130);
    while (true)
    {
      return;
      this.oPd.setText(zW(paramInt));
      this.oPf.setProgress(paramInt);
      AppMethodBeat.o(105130);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicSeekBar
 * JD-Core Version:    0.6.2
 */