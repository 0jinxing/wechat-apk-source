package com.tencent.mm.plugin.emojicapture.e;

import a.f.b.u.c;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.b.b;
import com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class c$k
  implements View.OnClickListener
{
  c$k(c paramc, u.c paramc1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(2777);
    c.a(this.lkA).a(true, ((TextEditorItemView)this.lkI.AVE).getText(), ((TextEditorItemView)this.lkI.AVE).getTextColor());
    EmojiCaptureReporter.a(13, c.j(this.lkA).ezZ, 0L, 0L, 0L, 0L, 0L, 0, 0, c.j(this.lkA).scene);
    AppMethodBeat.o(2777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.e.c.k
 * JD-Core Version:    0.6.2
 */