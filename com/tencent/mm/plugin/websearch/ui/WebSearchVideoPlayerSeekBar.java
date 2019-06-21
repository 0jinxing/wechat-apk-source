package com.tencent.mm.plugin.websearch.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.sdk.platformtools.ab;

public class WebSearchVideoPlayerSeekBar extends AdVideoPlayerLoadingBar
  implements g
{
  protected boolean cAW = false;
  private float hke;
  private int uck = -1;
  private int ucl = -1;
  private int ucm = -1;

  public WebSearchVideoPlayerSeekBar(Context paramContext)
  {
    super(paramContext);
  }

  public WebSearchVideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public WebSearchVideoPlayerSeekBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private int Io(int paramInt)
  {
    AppMethodBeat.i(73829);
    int i = paramInt;
    if (paramInt > getBarLen())
      i = getBarLen();
    int j = ((FrameLayout.LayoutParams)this.qym.getLayoutParams()).leftMargin;
    paramInt = getBarPointWidth();
    AppMethodBeat.o(73829);
    return j + i - (paramInt >>> 1);
  }

  private int getBarPointPaddingLeft()
  {
    AppMethodBeat.i(73821);
    if (this.ucl == -1)
      this.ucl = this.qyn.getPaddingLeft();
    int i = this.ucl;
    AppMethodBeat.o(73821);
    return i;
  }

  private int getBarPointPaddingRight()
  {
    AppMethodBeat.i(73822);
    if (this.ucm == -1)
      this.ucm = this.qyn.getPaddingRight();
    int i = this.ucm;
    AppMethodBeat.o(73822);
    return i;
  }

  private int getCurProgressBarLen()
  {
    AppMethodBeat.i(73819);
    int i = this.qyl.getWidth();
    AppMethodBeat.o(73819);
    return i;
  }

  private int getCurTimeByProgressBar()
  {
    AppMethodBeat.i(73818);
    int i = (int)(getCurProgressBarLen() * 1.0D / getBarLen() * this.qyr);
    AppMethodBeat.o(73818);
    return i;
  }

  public void Dq(int paramInt)
  {
    AppMethodBeat.i(73832);
    seek(paramInt);
    AppMethodBeat.o(73832);
  }

  protected final int Im(int paramInt)
  {
    AppMethodBeat.i(73823);
    if (paramInt <= 0)
    {
      paramInt = 0;
      AppMethodBeat.o(73823);
    }
    while (true)
    {
      return paramInt;
      if (paramInt >= this.qyr)
      {
        paramInt = getBarLen();
        AppMethodBeat.o(73823);
      }
      else
      {
        paramInt = (int)(paramInt * 1.0D / this.qyr * getBarLen());
        AppMethodBeat.o(73823);
      }
    }
  }

  protected final void In(int paramInt)
  {
    AppMethodBeat.i(73828);
    int i;
    if (paramInt > getBarLen())
      i = getBarLen();
    while (true)
    {
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.qyn.getLayoutParams();
      localLayoutParams.leftMargin = Io(i);
      this.qyn.setLayoutParams(localLayoutParams);
      localLayoutParams = (FrameLayout.LayoutParams)this.qyl.getLayoutParams();
      localLayoutParams.width = i;
      this.qyl.setLayoutParams(localLayoutParams);
      this.qyn.requestLayout();
      this.qyl.requestLayout();
      AppMethodBeat.o(73828);
      return;
      i = paramInt;
      if (paramInt < 0)
        i = 0;
    }
  }

  public void aFQ()
  {
    AppMethodBeat.i(73827);
    if (this.qyr == 0)
      AppMethodBeat.o(73827);
    while (true)
    {
      return;
      if (this.hOy)
      {
        AppMethodBeat.o(73827);
      }
      else if (this.qyn == null)
      {
        AppMethodBeat.o(73827);
      }
      else if (getBarLen() == 0)
      {
        AppMethodBeat.o(73827);
      }
      else
      {
        if (this.mPosition == this.qyr)
          ab.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "test");
        this.qyp.setText(oy(this.mPosition / 60) + ":" + oy(this.mPosition % 60));
        In(Im(this.mPosition));
        AppMethodBeat.o(73827);
      }
    }
  }

  public int getBarLen()
  {
    AppMethodBeat.i(73824);
    int i = this.qym.getWidth();
    AppMethodBeat.o(73824);
    return i;
  }

  public int getBarPointWidth()
  {
    AppMethodBeat.i(73820);
    if (this.uck == -1)
      this.uck = this.qyn.getWidth();
    int i = this.uck;
    AppMethodBeat.o(73820);
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
    AppMethodBeat.i(73817);
    this.contentView = View.inflate(getContext(), getLayoutId(), this);
    this.qyl = ((ImageView)this.contentView.findViewById(2131821425));
    this.qym = ((ImageView)this.contentView.findViewById(2131821423));
    this.qyn = ((ImageView)this.contentView.findViewById(2131821426));
    this.qyo = ((ImageView)this.contentView.findViewById(2131821279));
    this.qyp = ((TextView)this.contentView.findViewById(2131821421));
    this.qyq = ((TextView)this.contentView.findViewById(2131821427));
    this.qyn.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        AppMethodBeat.i(73814);
        if (paramAnonymousMotionEvent.getAction() == 0)
        {
          ab.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch down");
          WebSearchVideoPlayerSeekBar.a(WebSearchVideoPlayerSeekBar.this);
          WebSearchVideoPlayerSeekBar.a(WebSearchVideoPlayerSeekBar.this, paramAnonymousMotionEvent.getX());
          WebSearchVideoPlayerSeekBar.b(WebSearchVideoPlayerSeekBar.this, ((FrameLayout.LayoutParams)WebSearchVideoPlayerSeekBar.b(WebSearchVideoPlayerSeekBar.this).getLayoutParams()).leftMargin);
          if (WebSearchVideoPlayerSeekBar.c(WebSearchVideoPlayerSeekBar.this) != null)
            WebSearchVideoPlayerSeekBar.d(WebSearchVideoPlayerSeekBar.this).aFw();
        }
        while (true)
        {
          AppMethodBeat.o(73814);
          return true;
          int i;
          if (paramAnonymousMotionEvent.getAction() == 2)
          {
            float f1 = paramAnonymousMotionEvent.getX();
            ab.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "move dis %f ", new Object[] { Float.valueOf(f1 - WebSearchVideoPlayerSeekBar.e(WebSearchVideoPlayerSeekBar.this)) });
            float f2 = WebSearchVideoPlayerSeekBar.f(WebSearchVideoPlayerSeekBar.this);
            i = (int)(f1 - WebSearchVideoPlayerSeekBar.e(WebSearchVideoPlayerSeekBar.this) + f2);
            WebSearchVideoPlayerSeekBar.this.In(i);
            i = WebSearchVideoPlayerSeekBar.g(WebSearchVideoPlayerSeekBar.this);
            WebSearchVideoPlayerSeekBar.h(WebSearchVideoPlayerSeekBar.this).setText(WebSearchVideoPlayerSeekBar.oy(i / 60) + ":" + WebSearchVideoPlayerSeekBar.oy(i % 60));
            WebSearchVideoPlayerSeekBar.i(WebSearchVideoPlayerSeekBar.this);
            WebSearchVideoPlayerSeekBar.cVK();
          }
          else
          {
            ab.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "ontouch up");
            i = WebSearchVideoPlayerSeekBar.j(WebSearchVideoPlayerSeekBar.this);
            if (WebSearchVideoPlayerSeekBar.k(WebSearchVideoPlayerSeekBar.this))
              i = WebSearchVideoPlayerSeekBar.a(WebSearchVideoPlayerSeekBar.this, WebSearchVideoPlayerSeekBar.g(WebSearchVideoPlayerSeekBar.this));
            if (WebSearchVideoPlayerSeekBar.l(WebSearchVideoPlayerSeekBar.this) != null)
            {
              ab.i("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "current time : ".concat(String.valueOf(i)));
              WebSearchVideoPlayerSeekBar.m(WebSearchVideoPlayerSeekBar.this).oA(i);
            }
            WebSearchVideoPlayerSeekBar.n(WebSearchVideoPlayerSeekBar.this);
          }
        }
      }
    });
    this.qyn.addOnLayoutChangeListener(new WebSearchVideoPlayerSeekBar.2(this));
    this.qym.addOnLayoutChangeListener(new WebSearchVideoPlayerSeekBar.3(this));
    AppMethodBeat.o(73817);
  }

  public final void nF(boolean paramBoolean)
  {
    AppMethodBeat.i(73833);
    setIsPlay(paramBoolean);
    AppMethodBeat.o(73833);
  }

  public final void seek(int paramInt)
  {
    AppMethodBeat.i(73825);
    ab.d("MicroMsg.WebSearch.WebSearchVideoPlayerSeekBar", "seek position : ".concat(String.valueOf(paramInt)));
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
    AppMethodBeat.o(73825);
  }

  public void setIsPlay(boolean paramBoolean)
  {
    AppMethodBeat.i(73831);
    this.cAW = paramBoolean;
    super.setIsPlay(paramBoolean);
    AppMethodBeat.o(73831);
  }

  public void setPlayBtnOnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(73830);
    if (this.qyo != null)
      this.qyo.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(73830);
  }

  public void setVideoTotalTime(int paramInt)
  {
    AppMethodBeat.i(73826);
    this.qyr = paramInt;
    this.mPosition = 0;
    this.qyq.setText(oy(this.qyr / 60) + ":" + oy(this.qyr % 60));
    aFQ();
    AppMethodBeat.o(73826);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.ui.WebSearchVideoPlayerSeekBar
 * JD-Core Version:    0.6.2
 */