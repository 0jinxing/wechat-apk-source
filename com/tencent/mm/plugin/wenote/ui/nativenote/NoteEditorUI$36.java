package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.g;
import com.tencent.mm.sdk.platformtools.ak;

final class NoteEditorUI$36
  implements View.OnTouchListener
{
  NoteEditorUI$36(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(27047);
    if (paramMotionEvent.getAction() == 0)
    {
      NoteEditorUI.a(this.uTu, paramMotionEvent.getX());
      NoteEditorUI.b(this.uTu, paramMotionEvent.getY());
    }
    float f1;
    float f2;
    if ((paramMotionEvent.getAction() == 1) && (NoteEditorUI.N(this.uTu).x(paramMotionEvent.getX(), paramMotionEvent.getY()) == null))
    {
      f1 = Math.abs(NoteEditorUI.Q(this.uTu) - paramMotionEvent.getX());
      f2 = Math.abs(NoteEditorUI.R(this.uTu) - paramMotionEvent.getY());
      if ((f1 < 30.0F) && (f2 < 30.0F))
      {
        if (NoteEditorUI.b(this.uTu).getVisibility() == 8)
          break label172;
        if (NoteEditorUI.a(this.uTu) != null)
          NoteEditorUI.a(this.uTu).uPB.dismiss();
        NoteEditorUI.b(this.uTu).setVisibility(8);
      }
    }
    while (true)
    {
      AppMethodBeat.o(27047);
      return false;
      label172: int i = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().size();
      paramView = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(i - 1);
      if (paramView != null)
      {
        boolean bool = paramView.uNT;
        com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().dep();
        paramView.uNT = true;
        paramView.uNZ = false;
        paramView.uNV = -1;
        NoteEditorUI.S(this.uTu).cg(i - 1);
        this.uTu.g(true, 50L);
        this.uTu.af(1, 0L);
        if ((NoteEditorUI.J(this.uTu)) && (bool))
        {
          NoteEditorUI.A(this.uTu).postDelayed(new NoteEditorUI.36.1(this), 100L);
          continue;
          if (paramMotionEvent.getAction() == 2)
          {
            f2 = Math.abs(NoteEditorUI.Q(this.uTu) - paramMotionEvent.getX());
            f1 = Math.abs(NoteEditorUI.R(this.uTu) - paramMotionEvent.getY());
            if ((f2 > 120.0F) || (f1 > 120.0F))
              if (NoteEditorUI.J(this.uTu))
              {
                if (e.dfb().dfa() == 1)
                {
                  this.uTu.deb();
                  e.dfb().dff();
                }
              }
              else if (!NoteEditorUI.T(this.uTu))
                this.uTu.deb();
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.36
 * JD-Core Version:    0.6.2
 */