package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$8", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer$OnStateChangeListener;", "onStateChange", "", "showDelete", "", "plugin-emojicapture_release"})
public final class CaptureEditorContainer$8
  implements EditorItemContainer.b
{
  public final void gH(boolean paramBoolean)
  {
    AppMethodBeat.i(3033);
    if (paramBoolean)
    {
      CaptureEditorContainer.m(this.lnr).setVisibility(8);
      AppMethodBeat.o(3033);
    }
    while (true)
    {
      return;
      CaptureEditorContainer.m(this.lnr).setVisibility(0);
      AppMethodBeat.o(3033);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer.8
 * JD-Core Version:    0.6.2
 */