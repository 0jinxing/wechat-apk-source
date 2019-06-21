package com.tencent.mm.plugin.story.ui.view.editor;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.story.d.b.a;
import com.tencent.mm.plugin.story.g.e;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EditorView$10
  implements View.OnClickListener
{
  EditorView$10(EditorView paramEditorView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110579);
    if (System.currentTimeMillis() - EditorView.g(this.smw) <= EditorView.f(this.smw))
    {
      ab.i(EditorView.b(this.smw), "onclick pass " + EditorView.g(this.smw) + " now: " + System.currentTimeMillis() + " notifySns:" + EditorView.h(this.smw));
      AppMethodBeat.o(110579);
    }
    while (true)
    {
      return;
      paramView = new a("mixView");
      EditorView.a(this.smw, System.currentTimeMillis());
      this.smw.getPresenter().cxp();
      this.smw.getPresenter().bmz();
      EditorView.a(this.smw, EditorView.i(this.smw));
      e locale = e.sbS;
      e.lC(EditorView.j(this.smw));
      locale = e.sbS;
      e.lE(EditorView.h(this.smw));
      ab.i(EditorView.b(this.smw), "onclick " + paramView.eOm.Mr());
      AppMethodBeat.o(110579);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.10
 * JD-Core Version:    0.6.2
 */