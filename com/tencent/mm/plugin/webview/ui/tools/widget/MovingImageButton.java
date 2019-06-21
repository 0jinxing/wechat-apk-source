package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;

public class MovingImageButton extends ImageView
{
  private int ieu;
  private int iev;
  private int itQ;
  private int itR;
  private Context mContext;
  private int nfE;
  private int uJR;
  private int uJS;
  private int uJT = 0;
  private int uJU = 0;
  private ViewGroup.MarginLayoutParams uJV;
  private final int uJW = 100;
  private int uJX;
  private boolean uJY = false;
  private boolean uJZ = true;
  private int x;
  private int y;

  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public MovingImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mContext = paramContext;
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(10056);
    super.onFinishInflate();
    this.uJX = a.fromDPToPix(this.mContext, 100);
    this.ieu = a.gd(this.mContext);
    this.iev = a.ge(this.mContext);
    this.nfE = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
    AppMethodBeat.o(10056);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(10057);
    boolean bool;
    if (!this.uJZ)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(10057);
      return bool;
    }
    if ((this.uJT == 0) || (this.uJU == 0))
    {
      Rect localRect = new Rect();
      getWindowVisibleDisplayFrame(localRect);
      this.uJT = (localRect.right - localRect.left);
      this.uJU = (localRect.bottom - localRect.top);
      ab.d("MicroMsg.MovingImageButton", "right = %d, top = %d, left = %d, bottom = %d, screenX = %d, screenY = %d", new Object[] { Integer.valueOf(localRect.right), Integer.valueOf(localRect.top), Integer.valueOf(localRect.left), Integer.valueOf(localRect.bottom), Integer.valueOf(this.uJT), Integer.valueOf(this.uJU) });
    }
    this.x = ((int)paramMotionEvent.getRawX());
    this.y = ((int)paramMotionEvent.getRawY());
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      this.itQ = this.x;
      this.itR = this.y;
      AppMethodBeat.o(10057);
      bool = true;
      break;
      this.uJR = this.x;
      this.uJS = this.y;
      continue;
      int i = this.x - this.itQ;
      int j = this.y - this.itR;
      if ((i != 0) || (j != 0))
      {
        this.uJV = ((ViewGroup.MarginLayoutParams)getLayoutParams());
        paramMotionEvent = this.uJV;
        int k = paramMotionEvent.rightMargin;
        paramMotionEvent.rightMargin = (-i + k);
        paramMotionEvent = this.uJV;
        paramMotionEvent.topMargin += j;
        if (this.uJV.rightMargin < 0)
        {
          this.uJV.rightMargin = 0;
          label344: if (this.uJV.topMargin >= 0)
            break label407;
          this.uJV.topMargin = 0;
        }
        while (true)
        {
          requestLayout();
          break;
          if (this.uJV.rightMargin <= this.uJT - getWidth())
            break label344;
          this.uJV.rightMargin = (this.uJT - getWidth());
          break label344;
          label407: if (this.uJV.topMargin > this.uJU - getHeight())
            this.uJV.topMargin = (this.uJU - getHeight());
        }
        if (Math.abs(this.uJR - this.x) + Math.abs(this.uJS - this.y) > this.nfE)
        {
          if (this.y < this.uJX)
            this.uJV.topMargin = 0;
          while (true)
          {
            requestLayout();
            break;
            if (this.y > this.uJU - this.uJX)
              this.uJV.topMargin = (this.uJU - getHeight());
            else if (this.x > this.uJT / 2)
              this.uJV.rightMargin = 0;
            else
              this.uJV.rightMargin = (this.uJT - getWidth());
          }
        }
        performClick();
      }
    }
  }

  public void setCanMove(boolean paramBoolean)
  {
    this.uJZ = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton
 * JD-Core Version:    0.6.2
 */