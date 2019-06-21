package com.tencent.mm.plugin.music.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;
import com.tencent.mm.plugin.music.e.k;
import com.tencent.mm.plugin.music.f.a.d;

final class MusicMainUI$1
  implements View.OnClickListener
{
  MusicMainUI$1(MusicMainUI paramMusicMainUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(105089);
    MusicMainUI.a(this.oOZ);
    if (MusicMainUI.b(this.oOZ).isChecked())
    {
      a.KX();
      MusicMainUI.b(this.oOZ).setChecked(true);
      AppMethodBeat.o(105089);
      return;
    }
    MusicMainUI.c(this.oOZ);
    if (k.bUf().bTS().aig())
      k.bUf().bTS().resume();
    while (true)
    {
      MusicMainUI.b(this.oOZ).setChecked(false);
      AppMethodBeat.o(105089);
      break;
      k.bUf().p(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.ui.MusicMainUI.1
 * JD-Core Version:    0.6.2
 */