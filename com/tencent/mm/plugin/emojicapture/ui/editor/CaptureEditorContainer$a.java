package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.k;
import com.tencent.mm.api.t.a;
import com.tencent.mm.plugin.emojicapture.c.b.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$initSmileyPanel$1", "Lcom/tencent/mm/api/SmileyPanelCallbackWrapper$Callback;", "onHide", "", "onSelectedEmoji", "emojiInfo", "Lcom/tencent/mm/api/IEmojiInfo;", "plugin-emojicapture_release"})
public final class CaptureEditorContainer$a
  implements t.a
{
  public final void a(k paramk)
  {
    AppMethodBeat.i(3034);
    j.p(paramk, "emojiInfo");
    ab.i(CaptureEditorContainer.a(this.lnr), "[onSelectedEmoji] emojiInfo:%s", new Object[] { paramk });
    b.a locala = this.lnr.getPresenter();
    if (locala != null)
      locala.c(paramk);
    onHide();
    AppMethodBeat.o(3034);
  }

  public final void onHide()
  {
    AppMethodBeat.i(3035);
    this.lnr.gC(false);
    AppMethodBeat.o(3035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer.a
 * JD-Core Version:    0.6.2
 */