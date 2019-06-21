package com.tencent.mm.ui.base;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

final class VoiceSearchEditText$1
  implements View.OnTouchListener
{
  VoiceSearchEditText$1(VoiceSearchEditText paramVoiceSearchEditText)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(107088);
    paramView = this.yBg;
    boolean bool;
    if (paramView.getCompoundDrawables()[2] == null)
    {
      AppMethodBeat.o(107088);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramMotionEvent.getAction() != 1)
      {
        AppMethodBeat.o(107088);
        bool = true;
      }
      else
      {
        VoiceSearchEditText.a(this.yBg, true);
        if ((!VoiceSearchEditText.a(this.yBg)) || (!VoiceSearchEditText.b(this.yBg)) || (!paramView.getText().toString().equals("")))
          break label263;
        if (paramMotionEvent.getX() <= paramView.getWidth() - paramView.getPaddingRight() - this.yBg.yAZ.getIntrinsicWidth() - a.fromDPToPix(VoiceSearchEditText.c(paramView), 25))
          break;
        if (VoiceSearchEditText.d(this.yBg) == null)
          break label253;
        ab.i("MicroMsg.VoiceSearchEditText", "user clicked voice button");
        if ((this.yBg.getContext() instanceof MMActivity))
          ((MMActivity)this.yBg.getContext()).hideVKB(paramView);
        VoiceSearchEditText.d(this.yBg).onClick(this.yBg);
        AppMethodBeat.o(107088);
        bool = true;
      }
    }
    paramView.requestFocus();
    if ((this.yBg.getContext() instanceof Activity))
      MMActivity.showVKB((Activity)this.yBg.getContext());
    if (VoiceSearchEditText.d(this.yBg) != null)
      VoiceSearchEditText.d(this.yBg).onClick(null);
    while (true)
    {
      label253: AppMethodBeat.o(107088);
      bool = false;
      break;
      label263: if (paramView.getText().toString().length() > 0)
      {
        if (paramMotionEvent.getX() > paramView.getWidth() - paramView.getPaddingRight() - this.yBg.yBb.getIntrinsicWidth() - a.fromDPToPix(VoiceSearchEditText.c(paramView), 25))
        {
          paramView.setText("");
          if (VoiceSearchEditText.e(this.yBg) != null)
            VoiceSearchEditText.e(this.yBg);
          VoiceSearchEditText.f(this.yBg);
        }
        else if (!paramView.isFocused())
        {
          paramView.requestFocus();
          if ((this.yBg.getContext() instanceof Activity))
            MMActivity.showVKB((Activity)this.yBg.getContext());
        }
      }
      else if (VoiceSearchEditText.d(this.yBg) != null)
        VoiceSearchEditText.d(this.yBg).onClick(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VoiceSearchEditText.1
 * JD-Core Version:    0.6.2
 */