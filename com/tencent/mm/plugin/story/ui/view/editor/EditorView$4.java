package com.tencent.mm.plugin.story.ui.view.editor;

import a.k.m;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer;
import com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer.b;
import com.tencent.mm.plugin.story.ui.view.editor.item.f;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorView$12", "Lcom/tencent/mm/plugin/story/ui/view/editor/EditorInputView$AddTextCallback;", "onCancel", "", "onConfirm", "text", "", "color", "", "bgColor", "plugin-story_release"})
public final class EditorView$4
  implements EditorInputView.a
{
  public final void e(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(138928);
    f localf;
    if (EditorView.e(this.smw) != null)
    {
      localf = EditorView.e(this.smw);
      if (localf != null)
        localf.setVisibility(0);
      localf = EditorView.e(this.smw);
      if (localf != null)
        localf.setText(paramCharSequence, paramInt1, paramInt2);
      EditorView.a(this.smw, null);
    }
    label250: 
    while (true)
    {
      this.smw.a(false, null, 0, 0);
      AppMethodBeat.o(138928);
      return;
      EditorItemContainer localEditorItemContainer = EditorView.c(this.smw);
      if ((paramCharSequence == null) || (m.ar(paramCharSequence)));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label250;
        localf = new f(localEditorItemContainer.getContext());
        Object localObject = new RelativeLayout.LayoutParams(-1, -1);
        localEditorItemContainer.lnI.addView((View)localf, (ViewGroup.LayoutParams)localObject);
        localObject = com.tencent.mm.plugin.story.f.l.sac;
        localf.setSafeArea(com.tencent.mm.plugin.story.f.l.czI());
        localf.setValidArea(localEditorItemContainer.smH);
        localf.setStateResolve((EditorItemContainer.b)localEditorItemContainer.smU);
        localf.setText(paramCharSequence, paramInt1, paramInt2);
        localf.setOnClickListener(localEditorItemContainer.smT);
        localEditorItemContainer.r((View)localf, true);
        localEditorItemContainer.removeCallbacks(localEditorItemContainer.lnN);
        localEditorItemContainer.postDelayed(localEditorItemContainer.lnN, 1500L);
        break;
      }
    }
  }

  public final void onCancel()
  {
    AppMethodBeat.i(138929);
    f localf = EditorView.e(this.smw);
    if (localf != null)
      localf.setVisibility(0);
    EditorView.a(this.smw, null);
    this.smw.a(false, null, 0, 0);
    AppMethodBeat.o(138929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.4
 * JD-Core Version:    0.6.2
 */