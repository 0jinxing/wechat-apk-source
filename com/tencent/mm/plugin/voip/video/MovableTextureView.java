package com.tencent.mm.plugin.voip.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMTextureView;

public class MovableTextureView extends MMTextureView
{
  private float cjG;
  private float cjH;
  private View.OnClickListener mOnClickListener;
  public int mScreenHeight = 0;
  public int mScreenWidth = 0;
  public int mWidth = 320;
  public int sZX = 240;
  public int taq = 800;
  public int tar = 480;
  private long tas;

  public MovableTextureView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MovableTextureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 0;
    AppMethodBeat.i(5064);
    ab.d("MicroMsg.MovableTextureView", "event: " + paramMotionEvent.getAction());
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(5064);
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
 * Qualified Name:     com.tencent.mm.plugin.voip.video.MovableTextureView
 * JD-Core Version:    0.6.2
 */