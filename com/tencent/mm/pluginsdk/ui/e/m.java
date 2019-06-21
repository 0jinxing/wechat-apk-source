package com.tencent.mm.pluginsdk.ui.e;

import android.content.Context;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kiss.widget.textview.StaticTextView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
  implements View.OnTouchListener
{
  private static boolean DEBUG;
  private static int LO;
  private static int vso;
  String hcl;
  private boolean iYA;
  private View view;
  private n vsl;
  private boolean vsm;
  private View vsn;
  private Context vsp;
  private ak vsq;
  private m.b vsr;
  private m.a vss;

  static
  {
    AppMethodBeat.i(79877);
    DEBUG = false;
    LO = ViewConfiguration.getTapTimeout();
    int i = ViewConfiguration.getLongPressTimeout();
    vso = i;
    if (i > LO * 2)
      vso -= LO;
    ab.d("MicroMsg.PressSpanTouchListener", "long press timeout:%d", new Object[] { Integer.valueOf(vso) });
    AppMethodBeat.o(79877);
  }

  public m()
  {
    AppMethodBeat.i(79870);
    this.vsl = null;
    this.vsm = false;
    this.vsn = null;
    this.iYA = false;
    this.vsp = null;
    this.vsq = new ak(Looper.getMainLooper());
    this.vsr = new m.b(this, (byte)0);
    this.vss = new m.a(this);
    AppMethodBeat.o(79870);
  }

  public m(Context paramContext)
  {
    AppMethodBeat.i(79871);
    this.vsl = null;
    this.vsm = false;
    this.vsn = null;
    this.iYA = false;
    this.vsp = null;
    this.vsq = new ak(Looper.getMainLooper());
    this.vsr = new m.b(this, (byte)0);
    this.vss = new m.a(this);
    this.vsp = paramContext;
    AppMethodBeat.o(79871);
  }

  private void L(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(79873);
    if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
      bHM();
    AppMethodBeat.o(79873);
  }

  private void Lo(int paramInt)
  {
    AppMethodBeat.i(79875);
    if (this.view != null)
      this.vsq.postDelayed(this.vss, vso - paramInt);
    AppMethodBeat.o(79875);
  }

  public final void bHM()
  {
    AppMethodBeat.i(79874);
    if (this.vsl != null)
    {
      this.vsl.ozq = false;
      this.vsl.setContext(null);
      this.vsn.invalidate();
      this.vsn = null;
      this.vsl = null;
    }
    AppMethodBeat.o(79874);
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(79872);
    if ((!(paramView instanceof TextView)) && (!(paramView instanceof StaticTextView)))
    {
      AppMethodBeat.o(79872);
      return false;
    }
    if (paramMotionEvent.getAction() == 0)
      paramView.setTag(2131820679, new int[] { (int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY() });
    this.view = paramView;
    Layout localLayout;
    CharSequence localCharSequence;
    label87: MotionEvent localMotionEvent;
    Object localObject;
    int i;
    int j;
    int k;
    if ((paramView instanceof TextView))
    {
      localLayout = ((TextView)paramView).getLayout();
      localCharSequence = ((TextView)paramView).getText();
      if (DEBUG)
        ab.d("MicroMsg.PressSpanTouchListener", "ontouch action: %d, isLongPress:%b " + localLayout + " " + (localCharSequence instanceof Spanned) + " " + bo.dpG().toString(), new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Boolean.valueOf(this.iYA) });
      localMotionEvent = MotionEvent.obtain(paramMotionEvent);
      if (((localCharSequence instanceof Spanned)) && (localLayout != null))
      {
        localObject = (Spanned)localCharSequence;
        i = localMotionEvent.getAction();
        paramView.invalidate();
        if ((paramView == null) || (localObject == null) || (!e.a(paramView, (Spanned)localObject)))
        {
          if ((i != 1) && (i != 0) && (i != 2) && (i != 3))
            break label844;
          j = (int)localMotionEvent.getX();
          i = (int)localMotionEvent.getY();
          if (!(paramView instanceof StaticTextView))
            break label457;
          if (j >= ((StaticTextView)paramView).getHorizontalDrawOffset())
          {
            k = localLayout.getWidth();
            if (j <= ((StaticTextView)paramView).getHorizontalDrawOffset() + k)
              break label415;
          }
          L(localMotionEvent);
        }
      }
    }
    label415: label457: label844: label1356: 
    while (true)
    {
      localMotionEvent.recycle();
      if (DEBUG)
        ab.d("MicroMsg.PressSpanTouchListener", "ontouch action2: %d, isLongPress:%b " + localLayout + " " + (localCharSequence instanceof Spanned) + " processResult: false " + bo.dpG().toString(), new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Boolean.valueOf(this.iYA) });
      AppMethodBeat.o(79872);
      break;
      localLayout = ((StaticTextView)paramView).getTvLayout();
      localCharSequence = ((StaticTextView)paramView).getText();
      break label87;
      if (i >= ((StaticTextView)paramView).getVerticalDrawOffset())
      {
        k = localLayout.getHeight();
        if (i <= ((StaticTextView)paramView).getVerticalDrawOffset() + k);
      }
      else
      {
        L(localMotionEvent);
        continue;
        if ((paramView instanceof TextView))
        {
          if (j >= ((TextView)paramView).getTotalPaddingLeft())
          {
            k = localLayout.getWidth();
            if (j <= ((TextView)paramView).getTotalPaddingLeft() + k);
          }
          else
          {
            L(localMotionEvent);
            continue;
          }
          if (i >= ((TextView)paramView).getTotalPaddingTop())
          {
            k = localLayout.getHeight();
            if (i <= ((TextView)paramView).getTotalPaddingTop() + k);
          }
          else
          {
            L(localMotionEvent);
            continue;
          }
        }
      }
      if ((paramView instanceof TextView))
      {
        j -= ((TextView)paramView).getTotalPaddingLeft();
        i -= ((TextView)paramView).getTotalPaddingTop();
        k = paramView.getScrollX();
        j = localLayout.getOffsetForHorizontal(localLayout.getLineForVertical(i + paramView.getScrollY()), j + k);
        i = j;
        if ((paramView instanceof TextView))
        {
          i = j;
          if (j < ((Spanned)localObject).length())
            i = j + 1;
        }
        j = localMotionEvent.getAction();
        localObject = (n[])((Spanned)localObject).getSpans(i, i, n.class);
        i = localObject.length - 1;
        if (DEBUG)
          ab.d("MicroMsg.PressSpanTouchListener", "processPress action: %d, isLongPress:%b " + localObject.length + " " + this.vsl + " " + bo.dpG().toString(), new Object[] { Integer.valueOf(localMotionEvent.getAction()), Boolean.valueOf(this.iYA) });
        if (localObject.length == 0)
          break label1308;
        if (j != 1)
          break label1041;
        this.vsq.removeCallbacks(this.vsr);
        this.vsq.removeCallbacks(this.vss);
        if (!this.iYA)
          break label934;
        bHM();
        this.iYA = false;
        paramView.setClickable(this.vsm);
        if (DEBUG)
          ab.i("MicroMsg.PressSpanTouchListener", "processPress action1 " + localMotionEvent.getAction());
      }
      while (true)
      {
        if (!DEBUG)
          break label1356;
        ab.i("MicroMsg.PressSpanTouchListener", "processTouch action2 " + localMotionEvent.getAction());
        break;
        if ((paramView instanceof StaticTextView))
        {
          j -= ((StaticTextView)paramView).getHorizontalDrawOffset();
          i -= ((StaticTextView)paramView).getVerticalDrawOffset();
          break label579;
        }
        j -= paramView.getPaddingLeft();
        i -= paramView.getPaddingTop();
        break label579;
        this.iYA = false;
        if (this.vsl != null)
        {
          this.vsl.setSessionId(this.hcl);
          if (this.vsp != null)
            this.vsl.setContext(this.vsp);
          this.vsl.onClick(paramView);
        }
        while (true)
        {
          paramView.setClickable(this.vsm);
          bHM();
          if (!DEBUG)
            break;
          ab.i("MicroMsg.PressSpanTouchListener", "processPress action2 " + localMotionEvent.getAction());
          break;
          ab.e("MicroMsg.PressSpanTouchListener", "ACTION_UP error, lastClickSpan is null");
        }
        if ((j == 0) || (j == 2))
        {
          if ((j == 0) && (vso > 0))
            Lo(0);
          if (j == 0)
            this.vsm = paramView.isClickable();
          bHM();
          this.vsl = localObject[i];
          this.vsn = paramView;
          localObject[i].setContext(null);
          localObject[i].ozq = true;
          localObject[i].mEnable = true;
          paramView.invalidate();
          if (this.iYA)
          {
            localObject[i].ozq = false;
            localObject[i].mEnable = false;
            paramView.setClickable(this.vsm);
            if (DEBUG)
              ab.i("MicroMsg.PressSpanTouchListener", "processPress action3 " + localMotionEvent.getAction());
          }
          else if (DEBUG)
          {
            ab.i("MicroMsg.PressSpanTouchListener", "processPress action4 " + localMotionEvent.getAction());
          }
        }
        else if (j == 3)
        {
          this.vsq.removeCallbacks(this.vsr);
          this.vsq.removeCallbacks(this.vss);
          paramView.setClickable(this.vsm);
          bHM();
          if (DEBUG)
          {
            ab.i("MicroMsg.PressSpanTouchListener", "processPress action5 " + localMotionEvent.getAction());
            continue;
            bHM();
          }
        }
        else
        {
          if (j == 1)
            this.iYA = false;
          if (DEBUG)
            ab.i("MicroMsg.PressSpanTouchListener", "processPress action6 " + localMotionEvent.getAction());
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.m
 * JD-Core Version:    0.6.2
 */