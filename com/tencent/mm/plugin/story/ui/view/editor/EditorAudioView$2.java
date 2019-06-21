package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorAudioView$2
  implements View.OnClickListener
{
  EditorAudioView$2(EditorAudioView paramEditorAudioView, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110509);
    paramView = this.sli;
    boolean bool;
    if (!EditorAudioView.f(this.sli))
    {
      bool = true;
      EditorAudioView.e(paramView, bool);
      paramView = this.sli.getCallback();
      if (paramView != null)
        paramView.lO(EditorAudioView.f(this.sli));
      if (!EditorAudioView.f(this.sli))
        break label93;
      EditorAudioView.g(this.sli).setImageDrawable(ah.f(this.jWS, 2131232081, -1));
      AppMethodBeat.o(110509);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label93: EditorAudioView.g(this.sli).setImageDrawable(ah.f(this.jWS, 2131232080, -1));
      AppMethodBeat.o(110509);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorAudioView.2
 * JD-Core Version:    0.6.2
 */