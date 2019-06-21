package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.b.j;
import a.l;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.g.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer$itemStateResolve$1", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer$ItemStateResolve;", "handleItemTouch", "", "itemView", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "plugin-story_release"})
public final class EditorItemContainer$d
  implements EditorItemContainer.b
{
  public final void e(final View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(110634);
    j.p(paramView, "itemView");
    j.p(paramMotionEvent, "event");
    switch (paramMotionEvent.getActionMasked())
    {
    default:
      AppMethodBeat.o(110634);
    case 0:
    case 2:
      while (true)
      {
        return;
        this.smW.removeCallbacks(EditorItemContainer.f(this.smW));
        if ((paramView instanceof e))
        {
          this.smW.r(paramView, false);
          AppMethodBeat.o(110634);
        }
        else
        {
          this.smW.r(paramView, true);
          AppMethodBeat.o(110634);
          continue;
          EditorItemContainer.a(this.smW, paramView);
          EditorItemContainer.a(this.smW, paramView, paramMotionEvent);
          EditorItemContainer.a(this.smW, true);
          AppMethodBeat.o(110634);
        }
      }
    case 1:
    case 3:
    }
    if ((paramView instanceof b))
    {
      paramMotionEvent = h.scu;
      h.EU(7);
    }
    if ((paramView instanceof f))
    {
      paramMotionEvent = h.scu;
      h.EU(9);
    }
    if ((paramView instanceof e))
    {
      paramMotionEvent = h.scu;
      h.EU(11);
    }
    if (EditorItemContainer.g(this.smW) != null)
      this.smW.post((Runnable)new a(this, paramView));
    while (true)
    {
      EditorItemContainer.a(this.smW, false);
      EditorItemContainer.i(this.smW);
      EditorItemContainer.j(this.smW);
      EditorItemContainer.k(this.smW);
      EditorItemContainer.l(this.smW);
      break;
      if (EditorItemContainer.d(this.smW) != null)
        this.smW.postDelayed(EditorItemContainer.f(this.smW), 1500L);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class a
    implements Runnable
  {
    a(EditorItemContainer.d paramd, View paramView)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(110633);
      EditorItemContainer.c(this.smX.smW).removeView(EditorItemContainer.g(this.smX.smW));
      EditorItemContainer.h(this.smX.smW);
      EditorItemContainer.e(this.smX.smW);
      if ((paramView instanceof e))
        EditorItemContainer.b(this.smX.smW);
      AppMethodBeat.o(110633);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.EditorItemContainer.d
 * JD-Core Version:    0.6.2
 */