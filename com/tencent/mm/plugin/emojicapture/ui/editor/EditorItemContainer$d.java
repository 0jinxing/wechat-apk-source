package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import a.v;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class EditorItemContainer$d
  implements Runnable
{
  EditorItemContainer$d(EditorItemContainer paramEditorItemContainer)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(3074);
    if (EditorItemContainer.a(this.lnQ) != null)
    {
      Object localObject = EditorItemContainer.a(this.lnQ);
      if (localObject == null)
        j.dWJ();
      if (!((a)localObject).bob())
      {
        localObject = EditorItemContainer.c(this.lnQ);
        a locala = EditorItemContainer.a(this.lnQ);
        if (locala == null)
        {
          localObject = new v("null cannot be cast to non-null type android.view.View");
          AppMethodBeat.o(3074);
          throw ((Throwable)localObject);
        }
        ((ViewGroup)localObject).removeView((View)locala);
      }
    }
    EditorItemContainer.b(this.lnQ);
    EditorItemContainer.e(this.lnQ);
    AppMethodBeat.o(3074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer.d
 * JD-Core Version:    0.6.2
 */