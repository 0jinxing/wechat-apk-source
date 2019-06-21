package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;

public class MovableVideoView extends OpenGlView
{
  private float cjG;
  private float cjH;
  private View.OnClickListener mOnClickListener;
  private int mScreenHeight = 0;
  public int mScreenWidth = 0;
  public int mWidth = 320;
  public int sZX = 240;
  private int taq = 800;
  private int tar = 480;
  private long tas;

  public MovableVideoView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MovableVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void ga(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5066);
    this.mWidth = paramInt1;
    this.sZX = paramInt2;
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    WindowManager localWindowManager = (WindowManager)getContext().getSystemService("window");
    if (this.mScreenWidth == 0)
    {
      this.mScreenWidth = localWindowManager.getDefaultDisplay().getWidth();
      this.mScreenHeight = localWindowManager.getDefaultDisplay().getHeight();
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    localLayoutParams.topMargin = (a.fromDPToPix(getContext(), 12) + t.hF(getContext()));
    localLayoutParams.leftMargin = (this.mScreenWidth - this.mWidth - localLayoutParams.topMargin + t.hF(getContext()));
    setLayoutParams(localLayoutParams);
    this.taq = (this.mScreenHeight - this.sZX);
    this.tar = (this.mScreenWidth - this.mWidth);
    localWindowManager.getDefaultDisplay().getMetrics(localDisplayMetrics);
    AppMethodBeat.o(5066);
  }

  public final void gb(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138373);
    ga(paramInt1, paramInt2);
    AppMethodBeat.o(138373);
  }

  public final void gc(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5068);
    RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)getLayoutParams();
    RelativeLayout.LayoutParams localLayoutParams2 = new RelativeLayout.LayoutParams(paramInt1, paramInt2);
    localLayoutParams2.leftMargin = localLayoutParams1.leftMargin;
    localLayoutParams2.topMargin = localLayoutParams1.topMargin;
    this.mWidth = paramInt1;
    this.sZX = paramInt2;
    setLayoutParams(localLayoutParams2);
    AppMethodBeat.o(5068);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    AppMethodBeat.i(5065);
    ab.d("MicroMsg.MovableVideoView", "event: " + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(5065);
      return true;
      this.cjG = paramMotionEvent.getRawX();
      this.cjH = paramMotionEvent.getRawY();
      this.tas = System.currentTimeMillis();
      continue;
      float f1 = paramMotionEvent.getRawX() - this.cjG;
      float f2 = paramMotionEvent.getRawY() - this.cjH;
      if ((Math.abs(f1) > 1.0F) || (Math.abs(f2) > 1.0F))
      {
        RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)getLayoutParams();
        int j = (int)(f1 + localLayoutParams.leftMargin);
        int k = (int)(f2 + localLayoutParams.topMargin);
        int m;
        if (j < 0)
        {
          m = 0;
          label178: localLayoutParams.leftMargin = m;
          if (k >= 0)
            break label247;
          m = i;
        }
        while (true)
        {
          localLayoutParams.topMargin = m;
          setLayoutParams(localLayoutParams);
          this.cjG = paramMotionEvent.getRawX();
          this.cjH = paramMotionEvent.getRawY();
          break;
          m = j;
          if (j <= this.tar)
            break label178;
          m = this.tar;
          break label178;
          label247: if (k > this.taq)
            m = this.taq;
          else
            m = k;
        }
        long l = System.currentTimeMillis();
        if ((this.tas != 0L) && (l - this.tas < 300L) && (l - this.tas >= 0L) && (this.mOnClickListener != null))
          this.mOnClickListener.onClick(this);
        h.pYm.e(11079, new Object[] { Integer.valueOf(2) });
      }
    }
  }

  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.mOnClickListener = paramOnClickListener;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.video.MovableVideoView
 * JD-Core Version:    0.6.2
 */