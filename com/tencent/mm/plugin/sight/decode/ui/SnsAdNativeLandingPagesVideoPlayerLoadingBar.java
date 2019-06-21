package com.tencent.mm.plugin.sight.decode.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SnsAdNativeLandingPagesVideoPlayerLoadingBar extends RelativeLayout
  implements a
{
  private boolean cAW;
  private View contentView;
  private boolean hOy;
  private int mPosition;
  private b qyk;
  private ImageView qyl;
  private ImageView qym;
  private ImageView qyn;
  private ImageView qyo;
  private TextView qyp;
  private TextView qyq;
  private int qyr;
  private int qys;
  private float qyu;
  private int qyv;
  private int qyw;
  private int qyx;
  private int qyy;

  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(70293);
    this.qyk = null;
    this.contentView = null;
    this.qym = null;
    this.qyn = null;
    this.qyo = null;
    this.qyr = 0;
    this.mPosition = 0;
    this.qys = 0;
    this.hOy = false;
    this.qyu = 0.0F;
    this.cAW = false;
    this.qyv = -1;
    this.qyw = -1;
    this.qyx = -1;
    this.qyy = -1;
    init();
    AppMethodBeat.o(70293);
  }

  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(70294);
    this.qyk = null;
    this.contentView = null;
    this.qym = null;
    this.qyn = null;
    this.qyo = null;
    this.qyr = 0;
    this.mPosition = 0;
    this.qys = 0;
    this.hOy = false;
    this.qyu = 0.0F;
    this.cAW = false;
    this.qyv = -1;
    this.qyw = -1;
    this.qyx = -1;
    this.qyy = -1;
    init();
    AppMethodBeat.o(70294);
  }

  public SnsAdNativeLandingPagesVideoPlayerLoadingBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(70295);
    this.qyk = null;
    this.contentView = null;
    this.qym = null;
    this.qyn = null;
    this.qyo = null;
    this.qyr = 0;
    this.mPosition = 0;
    this.qys = 0;
    this.hOy = false;
    this.qyu = 0.0F;
    this.cAW = false;
    this.qyv = -1;
    this.qyw = -1;
    this.qyx = -1;
    this.qyy = -1;
    init();
    AppMethodBeat.o(70295);
  }

  private void aFQ()
  {
    AppMethodBeat.i(70304);
    if (this.qyr == 0)
      AppMethodBeat.o(70304);
    while (true)
    {
      return;
      if (this.hOy)
      {
        AppMethodBeat.o(70304);
      }
      else if (this.qyn == null)
      {
        AppMethodBeat.o(70304);
      }
      else if (getBarLen() == 0)
      {
        AppMethodBeat.o(70304);
      }
      else
      {
        int i = (this.qyn.getWidth() - this.qyn.getPaddingLeft() - this.qyn.getPaddingRight()) / 2;
        this.qyp.setText(oy(this.mPosition / 60) + ":" + oy(this.mPosition % 60));
        int j = ((FrameLayout.LayoutParams)this.qym.getLayoutParams()).leftMargin;
        int k = this.qyn.getPaddingLeft();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyn.getLayoutParams();
        localLayoutParams.leftMargin = (j - k + (int)(this.mPosition * 1.0D / this.qyr * getBarLen()) - i);
        this.qyn.setLayoutParams(localLayoutParams);
        localLayoutParams = (FrameLayout.LayoutParams)this.qyl.getLayoutParams();
        localLayoutParams.width = ((int)(this.mPosition * 1.0D / this.qyr * getBarLen()));
        this.qyl.setLayoutParams(localLayoutParams);
        AppMethodBeat.o(70304);
      }
    }
  }

  private int getBarLen()
  {
    AppMethodBeat.i(70303);
    this.qys = this.qym.getWidth();
    int i = this.qys;
    AppMethodBeat.o(70303);
    return i;
  }

  private int getCurrentTimeByBarPoint()
  {
    AppMethodBeat.i(70300);
    int i = ((FrameLayout.LayoutParams)this.qym.getLayoutParams()).leftMargin;
    int j = this.qyn.getPaddingLeft();
    i = (int)((((FrameLayout.LayoutParams)this.qyn.getLayoutParams()).leftMargin - (i - j)) * 1.0D / getBarLen() * this.qyr);
    j = i;
    if (i < 0)
      j = 0;
    AppMethodBeat.o(70300);
    return j;
  }

  private void init()
  {
    AppMethodBeat.i(70296);
    this.contentView = View.inflate(getContext(), 2130970737, this);
    this.qyl = ((ImageView)this.contentView.findViewById(2131821425));
    this.qym = ((ImageView)this.contentView.findViewById(2131821423));
    this.qyn = ((ImageView)this.contentView.findViewById(2131821426));
    this.qyo = ((ImageView)this.contentView.findViewById(2131821279));
    this.qyp = ((TextView)this.contentView.findViewById(2131821421));
    this.qyq = ((TextView)this.contentView.findViewById(2131821427));
    this.qyn.setOnTouchListener(new SnsAdNativeLandingPagesVideoPlayerLoadingBar.1(this));
    AppMethodBeat.o(70296);
  }

  public static String oy(int paramInt)
  {
    AppMethodBeat.i(70305);
    String str;
    if (paramInt < 10)
    {
      str = "0".concat(String.valueOf(paramInt));
      AppMethodBeat.o(70305);
    }
    while (true)
    {
      return str;
      str = String.valueOf(paramInt);
      AppMethodBeat.o(70305);
    }
  }

  public final void clm()
  {
    this.qys = 0;
  }

  public boolean getIsPlay()
  {
    return this.cAW;
  }

  public int getVideoTotalTime()
  {
    return this.qyr;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(70297);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != this.qyv) || (paramInt2 != this.qyw) || (paramInt3 != this.qyx) || (paramInt4 != this.qyy))
      aFQ();
    this.qyv = paramInt1;
    this.qyw = paramInt2;
    this.qyx = paramInt3;
    this.qyy = paramInt4;
    AppMethodBeat.o(70297);
  }

  public final void seek(int paramInt)
  {
    AppMethodBeat.i(70301);
    this.mPosition = paramInt;
    aFQ();
    AppMethodBeat.o(70301);
  }

  public void setIplaySeekCallback(b paramb)
  {
    this.qyk = paramb;
  }

  public void setIsPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(70299);
    this.cAW = paramBoolean;
    if (paramBoolean)
    {
      this.qyo.setImageResource(2131231584);
      AppMethodBeat.o(70299);
    }
    while (true)
    {
      return;
      this.qyo.setImageResource(2131231585);
      AppMethodBeat.o(70299);
    }
  }

  public void setOnPlayButtonClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(70298);
    this.qyo.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(70298);
  }

  public void setVideoTotalTime(int paramInt)
  {
    AppMethodBeat.i(70302);
    if ((this.qyn.isShown()) && (this.qyn.getWidth() == 0))
    {
      post(new SnsAdNativeLandingPagesVideoPlayerLoadingBar.2(this, paramInt));
      AppMethodBeat.o(70302);
    }
    while (true)
    {
      return;
      this.qyr = paramInt;
      this.mPosition = 0;
      this.qyq.setText(oy(this.qyr / 60) + ":" + oy(this.qyr % 60));
      aFQ();
      AppMethodBeat.o(70302);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar
 * JD-Core Version:    0.6.2
 */