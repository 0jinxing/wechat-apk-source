package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MusicPreference$1
  implements View.OnClickListener
{
  MusicPreference$1(MusicPreference paramMusicPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81035);
    if (MusicPreference.a(this.qcB) == null)
    {
      AppMethodBeat.o(81035);
      return;
    }
    if (paramView.getId() == 2131826075)
    {
      if (!MusicPreference.b(this.qcB))
        break label85;
      MusicPreference.a(this.qcB, false);
      MusicPreference.c(this.qcB).setImageResource(2130839855);
    }
    while (true)
    {
      MusicPreference.a(this.qcB).d(this.qcB);
      AppMethodBeat.o(81035);
      break;
      label85: MusicPreference.a(this.qcB, true);
      MusicPreference.c(this.qcB).setImageResource(2130839856);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.MusicPreference.1
 * JD-Core Version:    0.6.2
 */