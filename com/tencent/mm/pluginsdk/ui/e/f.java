package com.tencent.mm.pluginsdk.ui.e;

import android.text.style.CharacterStyle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.neattextview.textview.view.NeatTextView;

public class f extends com.tencent.neattextview.textview.view.b
{
  private m vrF;

  public f(NeatTextView paramNeatTextView, m paramm)
  {
    super(paramNeatTextView.getContext(), paramNeatTextView);
    AppMethodBeat.i(79812);
    this.vrF = paramm;
    AppMethodBeat.o(79812);
  }

  public final void cancel(int paramInt)
  {
    AppMethodBeat.i(79815);
    if (this.Alp != null)
    {
      CharacterStyle localCharacterStyle = this.Alp.AjW;
      if ((localCharacterStyle instanceof n))
        ((n)localCharacterStyle).ozq = false;
    }
    super.cancel(paramInt);
    AppMethodBeat.o(79815);
  }

  public boolean onDown(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(79814);
    boolean bool = super.onDown(paramMotionEvent);
    if (this.Alp != null)
    {
      paramMotionEvent = this.Alp.AjW;
      if ((paramMotionEvent instanceof n))
        ((n)paramMotionEvent).ozq = true;
      AppMethodBeat.o(79814);
      bool = true;
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(79814);
    }
  }

  public void onLongPress(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(79816);
    if ((this.Alp != null) && (this.mView != null))
      this.mView.performLongClick();
    super.onLongPress(paramMotionEvent);
    AppMethodBeat.o(79816);
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(79813);
    ai.d("MMNeatTouchListener", "onTouch", new Object[0]);
    paramView.setTag(2131820679, new int[] { (int)paramMotionEvent.getRawX(), (int)paramMotionEvent.getRawY() });
    NeatTextView localNeatTextView;
    boolean bool;
    if ((paramView instanceof NeatTextView))
    {
      localNeatTextView = (NeatTextView)paramView;
      if ((!localNeatTextView.dKA()) || (localNeatTextView.AkW))
        if ((paramMotionEvent.getAction() == 3) || (paramMotionEvent.getAction() == 1))
        {
          localNeatTextView.getWrappedTextView().setPressed(false);
          bool = this.vrF.onTouch(localNeatTextView.getWrappedTextView(), paramMotionEvent);
          AppMethodBeat.o(79813);
        }
    }
    while (true)
    {
      return bool;
      if (paramMotionEvent.getAction() != 0)
        break;
      localNeatTextView.getWrappedTextView().setPressed(true);
      break;
      bool = super.onTouch(paramView, paramMotionEvent);
      AppMethodBeat.o(79813);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.e.f
 * JD-Core Version:    0.6.2
 */