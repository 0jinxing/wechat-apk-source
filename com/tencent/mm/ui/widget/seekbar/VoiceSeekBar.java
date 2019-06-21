package com.tencent.mm.ui.widget.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class VoiceSeekBar extends RelativeLayout
{
  protected View contentView;
  protected ImageView qyl;
  protected ImageView qym;
  protected ImageView zTE;
  protected float zTF;
  protected int zTG;

  public VoiceSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112965);
    this.contentView = null;
    this.qym = null;
    this.zTE = null;
    this.zTF = 0.0F;
    this.zTG = 0;
    init();
    AppMethodBeat.o(112965);
  }

  public VoiceSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(112966);
    this.contentView = null;
    this.qym = null;
    this.zTE = null;
    this.zTF = 0.0F;
    this.zTG = 0;
    init();
    AppMethodBeat.o(112966);
  }

  private void init()
  {
    AppMethodBeat.i(112967);
    this.contentView = View.inflate(getContext(), 2130971024, this);
    this.qyl = ((ImageView)this.contentView.findViewById(2131828475));
    this.qym = ((ImageView)this.contentView.findViewById(2131828474));
    this.zTE = ((ImageView)this.contentView.findViewById(2131828476));
    this.qym.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
    {
      public final boolean onPreDraw()
      {
        AppMethodBeat.i(112964);
        VoiceSeekBar.this.qym.getViewTreeObserver().removeOnPreDrawListener(this);
        VoiceSeekBar.this.zTG = VoiceSeekBar.this.qym.getHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)VoiceSeekBar.this.qyl.getLayoutParams();
        localLayoutParams.topMargin = ((int)((1.0F - VoiceSeekBar.this.zTF) * VoiceSeekBar.this.zTG));
        VoiceSeekBar.this.qyl.setLayoutParams(localLayoutParams);
        VoiceSeekBar.this.requestLayout();
        AppMethodBeat.o(112964);
        return false;
      }
    });
    AppMethodBeat.o(112967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.seekbar.VoiceSeekBar
 * JD-Core Version:    0.6.2
 */