package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class f$b
  implements Runnable
{
  f$b(f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110732);
    ab.d(f.access$getTAG$cp(), "MSG_STORY_LONG_PRESS_CHECK");
    if (this.soi.sof)
    {
      a locala = this.soi.soe;
      if (locala == null)
        break label64;
      if (((Boolean)locala.invoke()).booleanValue() == true)
        f.a(this.soi);
    }
    AppMethodBeat.o(110732);
    while (true)
    {
      return;
      label64: AppMethodBeat.o(110732);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.f.b
 * JD-Core Version:    0.6.2
 */