package com.tencent.mm.plugin.sns.ui;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.PLSysTextView;
import com.tencent.mm.kiss.widget.textview.SysTextView;
import com.tencent.mm.pluginsdk.ui.e.e;
import com.tencent.mm.pluginsdk.ui.e.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class aa
  implements View.OnTouchListener
{
  private static o rkp;
  private static TextView rkq;

  public static void crX()
  {
    AppMethodBeat.i(38306);
    if (rkp != null)
    {
      rkp.ozq = false;
      rkq.invalidate();
      rkq = null;
      rkp = null;
    }
    AppMethodBeat.o(38306);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(38305);
    TextView localTextView = (TextView)paramView;
    localTextView.getTag();
    CharSequence localCharSequence = localTextView.getText();
    Object localObject = localTextView.getLayout();
    paramView = (View)localObject;
    if (localObject == null)
    {
      paramView = (View)localObject;
      if ((localTextView instanceof SysTextView))
        paramView = ((SysTextView)localTextView).getTvLayout();
    }
    int i;
    if (((localCharSequence instanceof Spannable)) && (paramView != null))
    {
      localObject = (Spannable)localCharSequence;
      i = paramMotionEvent.getAction();
      paramView = localTextView.getLayout();
      if ((paramView != null) || (!(localTextView instanceof SysTextView)))
        break label661;
      paramView = ((SysTextView)localTextView).getTvLayout();
    }
    label661: 
    while (true)
    {
      localTextView.invalidate();
      boolean bool;
      if ((localTextView != null) && (localObject != null) && (e.a(localTextView, (Spanned)localObject)))
      {
        AppMethodBeat.o(38305);
        bool = false;
      }
      while (true)
      {
        return bool;
        if ((i == 1) || (i == 0) || (i == 2))
        {
          int j = (int)paramMotionEvent.getX();
          i = (int)paramMotionEvent.getY();
          int k;
          if ((localTextView instanceof PLSysTextView))
          {
            if (j >= ((PLSysTextView)localTextView).getHorizontalDrawOffset())
            {
              k = paramView.getWidth();
              if (j <= ((PLSysTextView)localTextView).getHorizontalDrawOffset() + k);
            }
            else
            {
              AppMethodBeat.o(38305);
              bool = false;
              continue;
            }
            if (i >= ((PLSysTextView)localTextView).getVerticalDrawOffset())
            {
              k = paramView.getHeight();
              if (i <= ((PLSysTextView)localTextView).getVerticalDrawOffset() + k);
            }
            else
            {
              AppMethodBeat.o(38305);
              bool = false;
            }
          }
          else if ((localTextView instanceof TextView))
          {
            if ((j < localTextView.getTotalPaddingLeft()) || (j > paramView.getWidth() + localTextView.getTotalPaddingLeft()))
            {
              AppMethodBeat.o(38305);
              bool = false;
            }
            else if ((i < localTextView.getTotalPaddingTop()) || (i > paramView.getHeight() + localTextView.getTotalPaddingTop()))
            {
              AppMethodBeat.o(38305);
              bool = false;
            }
          }
          else
          {
            if ((localTextView instanceof PLSysTextView))
            {
              j -= ((PLSysTextView)localTextView).getHorizontalDrawOffset();
              i -= ((PLSysTextView)localTextView).getVerticalDrawOffset();
              label367: k = localTextView.getScrollX();
              j = paramView.getOffsetForHorizontal(paramView.getLineForVertical(i + localTextView.getScrollY()), j + k);
              i = paramMotionEvent.getAction();
              paramView = (o[])((Spannable)localObject).getSpans(j, j, o.class);
              j = paramView.length - 1;
              ab.d("MicroMsg.MMOnTouchListener", " action span Len: " + paramView.length);
              if ((localTextView.getLayout() == null) && ((localTextView instanceof SysTextView)))
                ((SysTextView)localTextView).getTvLayout();
              if (paramView.length == 0)
                break label627;
              if (i != 1)
                break label578;
              paramView[j].onClick(localTextView);
              new ak().postDelayed(new aa.1(this), 300L);
              i = 1;
            }
            while (true)
            {
              if (i == 0)
                break label636;
              AppMethodBeat.o(38305);
              bool = true;
              break;
              if ((localTextView instanceof TextView))
              {
                j -= localTextView.getTotalPaddingLeft();
                i -= localTextView.getTotalPaddingTop();
                break label367;
              }
              j -= localTextView.getPaddingLeft();
              i -= localTextView.getPaddingTop();
              break label367;
              label578: if ((i == 0) || (i == 2) || (i == 3))
              {
                crX();
                rkp = paramView[j];
                rkq = localTextView;
                paramView[j].ozq = true;
                localTextView.invalidate();
                i = 1;
                continue;
                label627: crX();
              }
              else
              {
                i = 0;
              }
            }
          }
        }
        else
        {
          label636: crX();
          AppMethodBeat.o(38305);
          bool = false;
          continue;
          AppMethodBeat.o(38305);
          bool = false;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.aa
 * JD-Core Version:    0.6.2
 */