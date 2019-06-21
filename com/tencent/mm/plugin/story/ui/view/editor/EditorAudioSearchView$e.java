package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.bd;
import com.tencent.mm.plugin.story.model.audio.b;
import com.tencent.mm.plugin.story.model.audio.b.a;
import com.tencent.mm.plugin.story.ui.a.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorAudioSearchView$e
  implements View.OnClickListener
{
  EditorAudioSearchView$e(EditorAudioSearchView paramEditorAudioSearchView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110478);
    paramView = EditorAudioSearchView.c(this.skR);
    if (paramView != null)
    {
      if ((EditorAudioSearchView.d(this.skR) != -1) && (EditorAudioSearchView.d(this.skR) < paramView.getItemCount()))
      {
        EditorAudioSearchView.a locala = this.skR.getCallback();
        if (locala != null)
          locala.b(paramView.Fg(EditorAudioSearchView.d(this.skR)));
        EditorAudioSearchView.f(this.skR);
        paramView = b.rUx;
        b.cyT().cH(0L);
        paramView = b.rUx;
        b.a.cyU();
        this.skR.reset();
      }
    }
    else
    {
      paramView = EditorAudioSearchView.a(this.skR);
      if (paramView == null)
        break label174;
      paramView.clearFocus();
      AppMethodBeat.o(110478);
    }
    while (true)
    {
      return;
      paramView = this.skR.getCallback();
      if (paramView != null)
        paramView.b(null);
      EditorAudioSearchView.f(this.skR);
      paramView = b.rUx;
      b.cyT().cH(1L);
      paramView = b.rUx;
      b.a.cyU();
      break;
      label174: AppMethodBeat.o(110478);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioSearchView.e
 * JD-Core Version:    0.6.2
 */