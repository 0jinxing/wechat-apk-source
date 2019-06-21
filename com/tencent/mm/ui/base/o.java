package com.tencent.mm.ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;

public class o extends PopupWindow
{
  private Context mContext;
  private View.OnTouchListener yvZ;

  public o(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(112563);
    this.mContext = null;
    this.mContext = paramContext;
    super.setBackgroundDrawable(null);
    setContentView(new a(this.mContext));
    AppMethodBeat.o(112563);
  }

  public o(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(112564);
    this.mContext = null;
    super.setBackgroundDrawable(null);
    AppMethodBeat.o(112564);
  }

  public o(View paramView, int paramInt1, int paramInt2)
  {
    super(paramView, paramInt1, paramInt2);
    AppMethodBeat.i(112565);
    this.mContext = null;
    super.setBackgroundDrawable(null);
    AppMethodBeat.o(112565);
  }

  public o(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramView, paramInt1, paramInt2, paramBoolean);
    AppMethodBeat.i(112566);
    this.mContext = null;
    super.setBackgroundDrawable(null);
    AppMethodBeat.o(112566);
  }

  public void dismiss()
  {
    AppMethodBeat.i(112567);
    try
    {
      super.dismiss();
      AppMethodBeat.o(112567);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ai.e("MicroMsg.MMPopupWindow", "dismiss exception, e = " + localException.getMessage(), new Object[0]);
        AppMethodBeat.o(112567);
      }
    }
  }

  public Drawable getBackground()
  {
    Drawable localDrawable = null;
    AppMethodBeat.i(112568);
    View localView = getContentView();
    if (localView == null)
      AppMethodBeat.o(112568);
    while (true)
    {
      return localDrawable;
      if ((localView instanceof a))
      {
        localDrawable = localView.getBackground();
        AppMethodBeat.o(112568);
      }
      else
      {
        AppMethodBeat.o(112568);
      }
    }
  }

  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    int i = -2;
    AppMethodBeat.i(112570);
    View localView = getContentView();
    if (localView == null)
      AppMethodBeat.o(112570);
    Object localObject1;
    while (true)
    {
      return;
      localObject1 = localView.getContext();
      if (!(localView instanceof a))
        break;
      localView.setBackgroundDrawable(paramDrawable);
      AppMethodBeat.o(112570);
    }
    Object localObject2 = localView.getLayoutParams();
    if ((localObject2 != null) && (((ViewGroup.LayoutParams)localObject2).height == -2));
    while (true)
    {
      localObject1 = new a((Context)localObject1);
      localObject2 = new FrameLayout.LayoutParams(-1, i);
      ((a)localObject1).setBackgroundDrawable(paramDrawable);
      ((a)localObject1).addView(localView, (ViewGroup.LayoutParams)localObject2);
      super.setContentView((View)localObject1);
      AppMethodBeat.o(112570);
      break;
      i = -1;
    }
  }

  public void setContentView(View paramView)
  {
    int i = -2;
    AppMethodBeat.i(112569);
    Object localObject = getContentView();
    if (localObject == null)
    {
      super.setContentView(paramView);
      super.setContentView(paramView);
      AppMethodBeat.o(112569);
    }
    while (true)
    {
      label32: return;
      if (!(localObject instanceof a))
        break label112;
      localObject = (a)localObject;
      ((a)localObject).removeAllViews();
      if (paramView != null)
        break;
      super.setContentView((View)localObject);
      AppMethodBeat.o(112569);
    }
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if ((localLayoutParams != null) && (localLayoutParams.height == -2));
    while (true)
    {
      ((a)localObject).addView(paramView, new FrameLayout.LayoutParams(-1, i));
      super.setContentView((View)localObject);
      AppMethodBeat.o(112569);
      break label32;
      label112: break;
      i = -1;
    }
  }

  public void setTouchInterceptor(View.OnTouchListener paramOnTouchListener)
  {
    this.yvZ = paramOnTouchListener;
  }

  final class a extends FrameLayout
  {
    a(Context arg2)
    {
      super();
    }

    public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
    {
      boolean bool = true;
      AppMethodBeat.i(112559);
      if (paramKeyEvent.getKeyCode() == 4)
        if (getKeyDispatcherState() == null)
        {
          bool = super.dispatchKeyEvent(paramKeyEvent);
          AppMethodBeat.o(112559);
        }
      while (true)
      {
        return bool;
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null)
            localDispatcherState.startTracking(paramKeyEvent, this);
          AppMethodBeat.o(112559);
        }
        else if (paramKeyEvent.getAction() == 1)
        {
          localDispatcherState = getKeyDispatcherState();
          if ((localDispatcherState != null) && (localDispatcherState.isTracking(paramKeyEvent)) && (!paramKeyEvent.isCanceled()))
          {
            o.this.dismiss();
            AppMethodBeat.o(112559);
          }
        }
        else
        {
          bool = super.dispatchKeyEvent(paramKeyEvent);
          AppMethodBeat.o(112559);
          continue;
          bool = super.dispatchKeyEvent(paramKeyEvent);
          AppMethodBeat.o(112559);
        }
      }
    }

    public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
    {
      AppMethodBeat.i(112560);
      boolean bool;
      if ((o.a(o.this) != null) && (o.a(o.this).onTouch(this, paramMotionEvent)))
      {
        bool = true;
        AppMethodBeat.o(112560);
      }
      while (true)
      {
        return bool;
        bool = super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(112560);
      }
    }

    protected final int[] onCreateDrawableState(int paramInt)
    {
      AppMethodBeat.i(112558);
      int[] arrayOfInt = super.onCreateDrawableState(paramInt);
      AppMethodBeat.o(112558);
      return arrayOfInt;
    }

    public final boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      boolean bool = true;
      AppMethodBeat.i(112561);
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      if ((paramMotionEvent.getAction() == 0) && ((i < 0) || (i >= getWidth()) || (j < 0) || (j >= getHeight())))
      {
        o.this.dismiss();
        AppMethodBeat.o(112561);
      }
      while (true)
      {
        return bool;
        if (paramMotionEvent.getAction() == 4)
        {
          o.this.dismiss();
          AppMethodBeat.o(112561);
        }
        else
        {
          bool = super.onTouchEvent(paramMotionEvent);
          AppMethodBeat.o(112561);
        }
      }
    }

    public final void sendAccessibilityEvent(int paramInt)
    {
      AppMethodBeat.i(112562);
      if (getChildCount() == 1)
        getChildAt(0).sendAccessibilityEvent(paramInt);
      while (true)
      {
        super.sendAccessibilityEvent(paramInt);
        AppMethodBeat.o(112562);
        return;
        super.sendAccessibilityEvent(paramInt);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.o
 * JD-Core Version:    0.6.2
 */