package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.c.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer$7", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorChangeTextView$AddTextCallback;", "onCancel", "", "onConfirm", "text", "", "color", "", "plugin-emojicapture_release"})
public final class CaptureEditorContainer$7
  implements EditorChangeTextView.a
{
  public final void i(CharSequence paramCharSequence, int paramInt)
  {
    AppMethodBeat.i(3031);
    if (paramCharSequence != null);
    for (paramCharSequence = paramCharSequence.toString(); ; paramCharSequence = null)
    {
      Object localObject = paramCharSequence;
      if (paramCharSequence != null)
      {
        localObject = paramCharSequence;
        if (paramCharSequence.length() > 50)
        {
          localObject = paramCharSequence.substring(0, 50);
          j.o(localObject, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
      }
      paramCharSequence = this.lnr.getPresenter();
      if (paramCharSequence != null)
        paramCharSequence.n((String)localObject, paramInt, true);
      CaptureEditorContainer.l(this.lnr).setShow(false);
      AppMethodBeat.o(3031);
      return;
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(3032);
    b.a locala = this.lnr.getPresenter();
    if (locala != null)
      locala.n(null, 0, false);
    CaptureEditorContainer.l(this.lnr).setShow(false);
    AppMethodBeat.o(3032);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer.7
 * JD-Core Version:    0.6.2
 */