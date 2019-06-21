package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorInputView$5
  implements View.OnClickListener
{
  EditorInputView$5(EditorInputView paramEditorInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110554);
    paramView = EditorInputView.d(this.slH);
    if (!EditorInputView.d(this.slH).isActivated());
    for (boolean bool = true; ; bool = false)
    {
      paramView.setActivated(bool);
      this.slH.setHasBackground(EditorInputView.d(this.slH).isActivated());
      EditorInputView.e(this.slH);
      AppMethodBeat.o(110554);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorInputView.5
 * JD-Core Version:    0.6.2
 */