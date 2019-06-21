package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ProfileMobilePhoneView$1
  implements View.OnClickListener
{
  ProfileMobilePhoneView$1(ProfileMobilePhoneView paramProfileMobilePhoneView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(27532);
    ProfileMobilePhoneView.a(this.viz, ((TextView)paramView).getText().toString());
    AppMethodBeat.o(27532);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView.1
 * JD-Core Version:    0.6.2
 */