package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.ui.nativenote.a.b;

final class NoteEditorUI$a extends b
{
  NoteEditorUI$a(NoteEditorUI paramNoteEditorUI)
  {
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(27052);
    super.c(paramRecyclerView, paramInt);
    if (paramRecyclerView.getLayoutManager() != null)
    {
      paramRecyclerView = ((LinearLayoutManager)NoteEditorUI.N(this.uTu).getLayoutManager()).getChildAt(0);
      if (paramRecyclerView != null)
      {
        NoteEditorUI.b(this.uTu, paramRecyclerView.getTop());
        NoteEditorUI.a(this.uTu, LinearLayoutManager.bt(paramRecyclerView));
      }
    }
    AppMethodBeat.o(27052);
  }

  public final void dfS()
  {
    AppMethodBeat.i(27048);
    NoteEditorUI.aa(this.uTu);
    AppMethodBeat.o(27048);
  }

  public final void dfT()
  {
    AppMethodBeat.i(27049);
    this.uTu.dyc();
    NoteEditorUI.aa(this.uTu);
    AppMethodBeat.o(27049);
  }

  public final void dfU()
  {
    AppMethodBeat.i(27050);
    this.uTu.dyb();
    AppMethodBeat.o(27050);
  }

  public final void dfV()
  {
    AppMethodBeat.i(27051);
    NoteEditorUI.ab(this.uTu).mfe = true;
    AppMethodBeat.o(27051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.a
 * JD-Core Version:    0.6.2
 */