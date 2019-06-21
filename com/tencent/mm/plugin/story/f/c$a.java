package com.tencent.mm.plugin.story.f;

import a.f.a.a;
import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/EditorPresenter$StoryProgressDialog;", "", "()V", "loading", "Lcom/tencent/mm/ui/base/MMProgressDialog;", "mCancel", "Lkotlin/Function0;", "", "dismiss", "setCancelable", "enable", "", "setOnCancel", "onCancel", "show", "context", "Landroid/content/Context;", "cancelAble", "cancel", "plugin-story_release"})
public final class c$a
{
  p llm;
  a<y> rYx;

  public c$a()
  {
    AppMethodBeat.i(109523);
    this.rYx = ((a)c.a.a.rYy);
    AppMethodBeat.o(109523);
  }

  public final void a(Context paramContext, boolean paramBoolean, a<y> parama)
  {
    AppMethodBeat.i(109521);
    j.p(paramContext, "context");
    j.p(parama, "cancel");
    this.rYx = parama;
    if (this.llm == null)
      this.llm = p.b(paramContext, (CharSequence)paramContext.getString(2131300968), paramBoolean, (DialogInterface.OnCancelListener)new c.a.c(this));
    AppMethodBeat.o(109521);
  }

  public final void dismiss()
  {
    AppMethodBeat.i(109522);
    p localp = this.llm;
    if (localp != null)
      localp.dismiss();
    this.llm = null;
    AppMethodBeat.o(109522);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.c.a
 * JD-Core Version:    0.6.2
 */