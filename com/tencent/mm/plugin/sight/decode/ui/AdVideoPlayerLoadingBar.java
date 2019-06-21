package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AdVideoPlayerLoadingBar extends RelativeLayout
  implements a
{
  protected View contentView;
  public boolean hOy;
  public int mPosition;
  public b qyk;
  public ImageView qyl;
  public ImageView qym;
  public ImageView qyn;
  protected ImageView qyo;
  public TextView qyp;
  protected TextView qyq;
  public int qyr;
  private int qys;
  private int qyt;
  public float qyu;
  private int qyv;
  private int qyw;
  private int qyx;
  private int qyy;

  public AdVideoPlayerLoadingBar(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(117918);
    this.qyk = null;
    this.contentView = null;
    this.qym = null;
    this.qyn = null;
    this.qyo = null;
    this.qyr = 0;
    this.mPosition = 0;
    this.qys = 0;
    this.qyt = 0;
    this.hOy = false;
    this.qyu = 0.0F;
    this.qyv = -1;
    this.qyw = -1;
    this.qyx = -1;
    this.qyy = -1;
    init();
    AppMethodBeat.o(117918);
  }

  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(117919);
    this.qyk = null;
    this.contentView = null;
    this.qym = null;
    this.qyn = null;
    this.qyo = null;
    this.qyr = 0;
    this.mPosition = 0;
    this.qys = 0;
    this.qyt = 0;
    this.hOy = false;
    this.qyu = 0.0F;
    this.qyv = -1;
    this.qyw = -1;
    this.qyx = -1;
    this.qyy = -1;
    init();
    AppMethodBeat.o(117919);
  }

  public AdVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(117920);
    this.qyk = null;
    this.contentView = null;
    this.qym = null;
    this.qyn = null;
    this.qyo = null;
    this.qyr = 0;
    this.mPosition = 0;
    this.qys = 0;
    this.qyt = 0;
    this.hOy = false;
    this.qyu = 0.0F;
    this.qyv = -1;
    this.qyw = -1;
    this.qyx = -1;
    this.qyy = -1;
    init();
    AppMethodBeat.o(117920);
  }

  public static String oy(int paramInt)
  {
    AppMethodBeat.i(117932);
    String str;
    if (paramInt < 10)
    {
      str = "0".concat(String.valueOf(paramInt));
      AppMethodBeat.o(117932);
    }
    while (true)
    {
      return str;
      str = String.valueOf(paramInt);
      AppMethodBeat.o(117932);
    }
  }

  public void aFQ()
  {
    AppMethodBeat.i(117931);
    if (this.qyr == 0)
      AppMethodBeat.o(117931);
    while (true)
    {
      return;
      if (this.hOy)
      {
        AppMethodBeat.o(117931);
      }
      else if (this.qyn == null)
      {
        AppMethodBeat.o(117931);
      }
      else if (getBarLen() == 0)
      {
        AppMethodBeat.o(117931);
      }
      else
      {
        int i = (getBarPointWidth() - this.qyn.getPaddingLeft() - this.qyn.getPaddingRight()) / 2;
        this.qyp.setText(oy(this.mPosition / 60) + ":" + oy(this.mPosition % 60));
        int j = ((FrameLayout.LayoutParams)this.qym.getLayoutParams()).leftMargin;
        int k = this.qyn.getPaddingLeft();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyn.getLayoutParams();
        localLayoutParams.leftMargin = (j - k + (int)(this.mPosition * 1.0D / this.qyr * getBarLen()) - i);
        this.qyn.setLayoutParams(localLayoutParams);
        localLayoutParams = (FrameLayout.LayoutParams)this.qyl.getLayoutParams();
        localLayoutParams.width = ((int)(this.mPosition * 1.0D / this.qyr * getBarLen()));
        this.qyl.setLayoutParams(localLayoutParams);
        AppMethodBeat.o(117931);
      }
    }
  }

  public final void cll()
  {
    AppMethodBeat.i(117928);
    this.qyq.setText(oy(this.qyr / 60) + ":" + oy(this.qyr % 60));
    aFQ();
    AppMethodBeat.o(117928);
  }

  public final void clm()
  {
    this.qys = 0;
  }

  public int getBarLen()
  {
    AppMethodBeat.i(117929);
    if (this.qys <= 0)
      this.qys = this.qym.getWidth();
    int i = this.qys;
    AppMethodBeat.o(117929);
    return i;
  }

  protected int getBarPointWidth()
  {
    AppMethodBeat.i(117930);
    if (this.qyt <= 0)
      this.qyt = this.qyn.getWidth();
    int i = this.qyt;
    AppMethodBeat.o(117930);
    return i;
  }

  protected int getCurrentTimeByBarPoint()
  {
    AppMethodBeat.i(117925);
    int i = ((FrameLayout.LayoutParams)this.qym.getLayoutParams()).leftMargin;
    int j = this.qyn.getPaddingLeft();
    j = Math.max(0, (int)((((FrameLayout.LayoutParams)this.qyn.getLayoutParams()).leftMargin - (i - j) + (getBarPointWidth() - this.qyn.getPaddingLeft() - this.qyn.getPaddingRight()) / 2) * 1.0D / getBarLen() * this.qyr));
    AppMethodBeat.o(117925);
    return j;
  }

  protected int getLayoutId()
  {
    return 2130970990;
  }

  public int getVideoTotalTime()
  {
    return this.qyr;
  }

  public int getmPosition()
  {
    return this.mPosition;
  }

  protected void init()
  {
    AppMethodBeat.i(117921);
    this.contentView = View.inflate(getContext(), getLayoutId(), this);
    this.qyl = ((ImageView)this.contentView.findViewById(2131821425));
    this.qym = ((ImageView)this.contentView.findViewById(2131821423));
    this.qyn = ((ImageView)this.contentView.findViewById(2131821426));
    this.qyo = ((ImageView)this.contentView.findViewById(2131821279));
    this.qyp = ((TextView)this.contentView.findViewById(2131821421));
    this.qyq = ((TextView)this.contentView.findViewById(2131821427));
    this.qyn.setOnTouchListener(new AdVideoPlayerLoadingBar.1(this));
    this.qyn.post(new AdVideoPlayerLoadingBar.2(this));
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyl.getLayoutParams();
    localLayoutParams.width = 0;
    this.qyl.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(117921);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(117922);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.qys = 0;
    if ((paramInt1 != this.qyv) || (paramInt2 != this.qyw) || (paramInt3 != this.qyx) || (paramInt4 != this.qyy))
      aFQ();
    this.qyv = paramInt1;
    this.qyw = paramInt2;
    this.qyx = paramInt3;
    this.qyy = paramInt4;
    AppMethodBeat.o(117922);
  }

  public void seek(int paramInt)
  {
    AppMethodBeat.i(117926);
    this.mPosition = paramInt;
    aFQ();
    AppMethodBeat.o(117926);
  }

  public void setIplaySeekCallback(b paramb)
  {
    this.qyk = paramb;
  }

  public void setIsPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(117924);
    if (paramBoolean)
    {
      this.qyo.setImageResource(2131231584);
      AppMethodBeat.o(117924);
    }
    while (true)
    {
      return;
      this.qyo.setImageResource(2131231585);
      AppMethodBeat.o(117924);
    }
  }

  public void setOnPlayButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(117923);
    this.qyo.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(117923);
  }

  public void setVideoTotalTime(int paramInt)
  {
    AppMethodBeat.i(117927);
    this.qyr = paramInt;
    if (Looper.myLooper() != Looper.getMainLooper())
    {
      post(new AdVideoPlayerLoadingBar.3(this));
      AppMethodBeat.o(117927);
    }
    while (true)
    {
      return;
      cll();
      AppMethodBeat.o(117927);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
 * JD-Core Version:    0.6.2
 */