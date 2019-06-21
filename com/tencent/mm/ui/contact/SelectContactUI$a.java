package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectContactUI$a
{
  TextView iqU;
  private AlphaAnimation zoZ;
  private AlphaAnimation zpa;
  boolean zpb = false;

  final void aw(Activity paramActivity)
  {
    AppMethodBeat.i(33870);
    if (this.iqU == null)
      this.iqU = ((TextView)paramActivity.findViewById(2131820905));
    if (this.iqU.getVisibility() == 8)
      AppMethodBeat.o(33870);
    while (true)
    {
      return;
      if (this.zpa == null)
      {
        this.zpa = new AlphaAnimation(1.0F, 0.0F);
        this.zpa.setAnimationListener(new SelectContactUI.a.2(this));
      }
      this.zpa.setDuration(300L);
      if (this.zoZ != null)
        this.zoZ.cancel();
      this.iqU.startAnimation(this.zpa);
      AppMethodBeat.o(33870);
    }
  }

  public final void e(Activity paramActivity, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(33869);
    if ((paramInt2 > 0) && (paramInt1 == paramInt2 + 1) && (!this.zpb))
    {
      if (this.iqU == null)
        this.iqU = ((TextView)paramActivity.findViewById(2131820905));
      if (this.iqU.getVisibility() != 0)
      {
        this.iqU.setText(2131302504);
        this.iqU.setOnClickListener(new SelectContactUI.a.1(this, paramActivity));
        if (this.zoZ == null)
          this.zoZ = new AlphaAnimation(0.0F, 1.0F);
        this.zoZ.setDuration(300L);
        if (this.zpa != null)
          this.zpa.cancel();
        this.iqU.setVisibility(0);
        this.iqU.startAnimation(this.zoZ);
      }
      AppMethodBeat.o(33869);
    }
    while (true)
    {
      return;
      if (paramInt1 < paramInt2)
      {
        aw(paramActivity);
        this.zpb = false;
      }
      AppMethodBeat.o(33869);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SelectContactUI.a
 * JD-Core Version:    0.6.2
 */