package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SettingsAboutSystemUI$2
  implements View.OnClickListener
{
  SettingsAboutSystemUI$2(SettingsAboutSystemUI paramSettingsAboutSystemUI, LinearLayout paramLinearLayout, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127109);
    for (int i = 0; i < this.qmm.getChildCount(); i++)
    {
      TextView localTextView = (TextView)this.qmm.getChildAt(i);
      if (2131823800 != localTextView.getId())
        localTextView.setCompoundDrawablesWithIntrinsicBounds(2131231852, 0, 0, 0);
    }
    ((TextView)paramView).setCompoundDrawablesWithIntrinsicBounds(2131231853, 0, 0, 0);
    i = ((Integer)paramView.getTag()).intValue();
    ab.i("MicroMsg.SettingsAboutSystemUI", "choice: %d, %d", new Object[] { Integer.valueOf(this.qmn), Integer.valueOf(i) });
    if (this.qmn == i)
      AppMethodBeat.o(127109);
    while (true)
    {
      return;
      paramView.post(new SettingsAboutSystemUI.2.1(this, i));
      AppMethodBeat.o(127109);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.2
 * JD-Core Version:    0.6.2
 */