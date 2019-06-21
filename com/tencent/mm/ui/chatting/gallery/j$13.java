package com.tencent.mm.ui.chatting.gallery;

import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.sdk.platformtools.ap.a;

final class j$13
  implements ap.a
{
  j$13(j paramj)
  {
  }

  public final boolean BI()
  {
    boolean bool1 = false;
    AppMethodBeat.i(32328);
    boolean bool2;
    if (!j.f(this.yWZ).isStreaming())
    {
      AppMethodBeat.o(32328);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      k localk = this.yWZ.yTG.dFP();
      if (localk == null)
      {
        AppMethodBeat.o(32328);
        bool2 = bool1;
      }
      else if (localk.yXm == null)
      {
        AppMethodBeat.o(32328);
        bool2 = bool1;
      }
      else if (localk.dGH().yXm.getVisibility() != 0)
      {
        AppMethodBeat.o(32328);
        bool2 = bool1;
      }
      else
      {
        bool2 = true;
        if (localk.dGH().yXp.isPlaying())
          bool2 = j.b(this.yWZ, localk);
        if (bool2)
        {
          int i = localk.dGH().yXp.getCurrentPosition() / 1000;
          bool2 = j.f(this.yWZ).mm(i);
          AppMethodBeat.o(32328);
        }
        else
        {
          AppMethodBeat.o(32328);
          bool2 = bool1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.13
 * JD-Core Version:    0.6.2
 */