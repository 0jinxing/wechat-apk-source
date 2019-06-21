package com.tencent.mm.plugin.remittance.ui;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements View.OnTouchListener
{
  private a pQE;

  public static a cfs()
  {
    AppMethodBeat.i(44802);
    a locala = new a();
    AppMethodBeat.o(44802);
    return locala;
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(44803);
    if (this.pQE == null)
      this.pQE = new a(paramView);
    TextView localTextView = (TextView)paramView;
    localTextView.setMovementMethod(null);
    Object localObject = localTextView.getText();
    localObject = Spannable.Factory.getInstance().newSpannable((CharSequence)localObject);
    int i = paramMotionEvent.getAction();
    if ((i == 0) || (i == 1))
    {
      int j = (int)paramMotionEvent.getX();
      int k = (int)paramMotionEvent.getY();
      int m = localTextView.getTotalPaddingLeft();
      int n = localTextView.getTotalPaddingTop();
      int i1 = localTextView.getScrollX();
      int i2 = localTextView.getScrollY();
      paramMotionEvent = localTextView.getLayout();
      m = paramMotionEvent.getOffsetForHorizontal(paramMotionEvent.getLineForVertical(k - n + i2), j - m + i1);
      paramMotionEvent = (ClickableSpan[])((Spannable)localObject).getSpans(m, m, ClickableSpan.class);
      if (paramMotionEvent.length == 0)
        break label222;
      if (i == 0)
      {
        paramView.postDelayed(this.pQE, ViewConfiguration.getLongPressTimeout());
        AppMethodBeat.o(44803);
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      paramView.removeCallbacks(this.pQE);
      paramMotionEvent[0].onClick(localTextView);
      break;
      if (i == 3)
        paramView.removeCallbacks(this.pQE);
      label222: AppMethodBeat.o(44803);
    }
  }

  static final class a
    implements Runnable
  {
    private View view;

    a(View paramView)
    {
      this.view = paramView;
    }

    public final void run()
    {
      AppMethodBeat.i(44801);
      View localView = this.view;
      for (boolean bool = localView.performLongClick(); !bool; bool = localView.performLongClick())
      {
        localView = (View)localView.getParent();
        if (localView == null)
          break;
      }
      AppMethodBeat.o(44801);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.a
 * JD-Core Version:    0.6.2
 */