package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Scroller;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameCenterListView extends ListView
{
  static boolean nfG;
  static int nfI;
  private View abB;
  private Context mContext;
  private Scroller mScroller;
  private boolean nfC;
  private float nfD;
  private int nfE;
  private boolean nfF;
  private boolean nfH;
  private ImageView nfJ;
  private ImageView nfK;

  public GameCenterListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public static void setCanPulldown(boolean paramBoolean)
  {
    nfG = paramBoolean;
  }

  public static void setDefaultPadding(int paramInt)
  {
    nfI = paramInt;
  }

  public void computeScroll()
  {
    AppMethodBeat.i(111780);
    if (this.abB == null)
      AppMethodBeat.o(111780);
    while (true)
    {
      return;
      if (this.mScroller.computeScrollOffset())
      {
        int i = this.mScroller.getCurrY();
        this.abB.setPadding(0, i, 0, 0);
        float f = (nfI - i) / nfI * 255.0F;
        int j = (int)f;
        i = (int)f;
        this.nfK.setAlpha(255 - j);
        this.nfJ.setAlpha(i);
        invalidate();
      }
      AppMethodBeat.o(111780);
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(111779);
    boolean bool;
    if ((!nfG) || (this.abB == null))
    {
      bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(111779);
    }
    while (true)
    {
      return bool;
      switch (paramMotionEvent.getAction())
      {
      case 1:
      default:
      case 0:
      case 2:
      }
      int i;
      label223: 
      do
      {
        do
        {
          do
            while (true)
            {
              bool = super.dispatchTouchEvent(paramMotionEvent);
              AppMethodBeat.o(111779);
              break;
              this.nfH = false;
              this.nfD = paramMotionEvent.getRawY();
            }
          while (!this.nfF);
          if (this.nfH)
          {
            AppMethodBeat.o(111779);
            bool = true;
            break;
          }
          i = (int)(paramMotionEvent.getRawY() - this.nfD);
          if (this.abB.getPaddingTop() > nfI + this.nfE)
            break label223;
        }
        while ((i <= 0) || (Math.abs(i) < this.nfE));
        this.nfH = true;
        this.mScroller.startScroll(0, this.abB.getPaddingTop(), 0, -this.abB.getPaddingTop(), 500);
        this.nfJ.setClickable(true);
        invalidate();
        paramMotionEvent.setAction(3);
        super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(111779);
        bool = true;
        break;
      }
      while ((this.abB.getPaddingTop() < -this.nfE) || (i >= 0) || (Math.abs(i) < this.nfE));
      this.nfH = true;
      this.mScroller.startScroll(0, 0, 0, nfI, 500);
      invalidate();
      paramMotionEvent.setAction(3);
      super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(111779);
      bool = true;
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111777);
    super.onFinishInflate();
    this.nfE = ViewConfiguration.get(this.mContext).getScaledTouchSlop();
    this.mScroller = new Scroller(this.mContext);
    super.setOnScrollListener(new GameCenterListView.1(this));
    AppMethodBeat.o(111777);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(111778);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramBoolean) && (!this.nfC))
    {
      this.abB = getChildAt(0);
      this.nfK = ((ImageView)this.abB.findViewById(2131824535));
      this.nfJ = ((ImageView)this.abB.findViewById(2131824486));
      this.nfC = true;
    }
    AppMethodBeat.o(111778);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameCenterListView
 * JD-Core Version:    0.6.2
 */