package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;

public class VideoPlayerSeekBar extends AdVideoPlayerLoadingBar
  implements g
{
  protected boolean cAW;
  private int uck;
  private int ucl;
  private int ucm;
  private PInt vvn;

  public VideoPlayerSeekBar(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(117963);
    this.vvn = new PInt();
    this.cAW = false;
    this.uck = -1;
    this.ucl = -1;
    this.ucm = -1;
    AppMethodBeat.o(117963);
  }

  public VideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(117964);
    this.vvn = new PInt();
    this.cAW = false;
    this.uck = -1;
    this.ucl = -1;
    this.ucm = -1;
    AppMethodBeat.o(117964);
  }

  public VideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(117965);
    this.vvn = new PInt();
    this.cAW = false;
    this.uck = -1;
    this.ucl = -1;
    this.ucm = -1;
    AppMethodBeat.o(117965);
  }

  private int getBarPointPaddingLeft()
  {
    AppMethodBeat.i(117968);
    if (this.ucl == -1)
      this.ucl = this.qyn.getPaddingLeft();
    int i = this.ucl;
    AppMethodBeat.o(117968);
    return i;
  }

  private int getBarPointPaddingRight()
  {
    AppMethodBeat.i(117969);
    if (this.ucm == -1)
      this.ucm = this.qyn.getPaddingRight();
    int i = this.ucm;
    AppMethodBeat.o(117969);
    return i;
  }

  public final void Dq(int paramInt)
  {
    AppMethodBeat.i(117976);
    seek(paramInt);
    AppMethodBeat.o(117976);
  }

  public void aFQ()
  {
    AppMethodBeat.i(117973);
    if (this.qyr == 0)
      AppMethodBeat.o(117973);
    while (true)
    {
      return;
      if (this.hOy)
      {
        AppMethodBeat.o(117973);
      }
      else if (this.qyn == null)
      {
        AppMethodBeat.o(117973);
      }
      else if (getBarLen() == 0)
      {
        AppMethodBeat.o(117973);
      }
      else
      {
        this.qyp.setText(oy(this.mPosition / 60) + ":" + oy(this.mPosition % 60));
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyn.getLayoutParams();
        int i = getBarLen();
        localLayoutParams.leftMargin = gR(this.mPosition, i);
        this.qyn.setLayoutParams(localLayoutParams);
        localLayoutParams = (FrameLayout.LayoutParams)this.qyl.getLayoutParams();
        localLayoutParams.width = ((int)(this.mPosition * 1.0D / this.qyr * i));
        this.qyl.setLayoutParams(localLayoutParams);
        requestLayout();
        AppMethodBeat.o(117973);
      }
    }
  }

  public final boolean buH()
  {
    return this.cAW;
  }

  protected final int gR(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117970);
    if (paramInt1 <= 0)
    {
      this.qym.getLayoutParams();
      paramInt1 = 0;
    }
    while (true)
    {
      AppMethodBeat.o(117970);
      return paramInt1;
      if (paramInt1 >= this.qyr)
        paramInt1 = paramInt2 - (getBarPointWidth() - getBarPointPaddingLeft() - getBarPointPaddingRight()) / 2;
      else
        paramInt1 = (int)(paramInt1 * 1.0D / this.qyr * paramInt2);
    }
  }

  public int getBarPointWidth()
  {
    AppMethodBeat.i(117967);
    if (this.uck == -1)
      this.uck = this.qyn.getWidth();
    int i = this.uck;
    AppMethodBeat.o(117967);
    return i;
  }

  public int getLayoutId()
  {
    return 2130970991;
  }

  public ImageView getPlayBtn()
  {
    return this.qyo;
  }

  public TextView getPlaytimeTv()
  {
    return this.qyp;
  }

  public void init()
  {
    AppMethodBeat.i(117966);
    this.contentView = View.inflate(getContext(), getLayoutId(), this);
    this.qyl = ((ImageView)this.contentView.findViewById(2131821425));
    this.qym = ((ImageView)this.contentView.findViewById(2131821423));
    this.qyn = ((ImageView)this.contentView.findViewById(2131821426));
    this.qyo = ((ImageView)this.contentView.findViewById(2131821279));
    this.qyp = ((TextView)this.contentView.findViewById(2131821421));
    this.qyq = ((TextView)this.contentView.findViewById(2131821427));
    this.qyn.setOnTouchListener(new VideoPlayerSeekBar.1(this));
    AppMethodBeat.o(117966);
  }

  public final void nF(boolean paramBoolean)
  {
    AppMethodBeat.i(117977);
    setIsPlay(paramBoolean);
    AppMethodBeat.o(117977);
  }

  public void seek(int paramInt)
  {
    AppMethodBeat.i(117971);
    ab.d("MicroMsg.VideoPlayerSeekBar", "seek position : ".concat(String.valueOf(paramInt)));
    int i = paramInt;
    if (paramInt < 0)
      i = 0;
    paramInt = i;
    if (i >= this.qyr)
      paramInt = this.qyr;
    if (this.mPosition != paramInt)
    {
      this.mPosition = paramInt;
      aFQ();
    }
    AppMethodBeat.o(117971);
  }

  public void setIsPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(117975);
    this.cAW = paramBoolean;
    super.setIsPlay(paramBoolean);
    AppMethodBeat.o(117975);
  }

  public void setPlayBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(117974);
    if (this.qyo != null)
      this.qyo.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(117974);
  }

  public void setVideoTotalTime(int paramInt)
  {
    AppMethodBeat.i(117972);
    this.qyr = paramInt;
    this.mPosition = 0;
    this.qyq.setText(oy(this.qyr / 60) + ":" + oy(this.qyr % 60));
    aFQ();
    AppMethodBeat.o(117972);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar
 * JD-Core Version:    0.6.2
 */