package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.content.Context;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.g;

final class NoteEditorUI$22
  implements Runnable
{
  NoteEditorUI$22(NoteEditorUI paramNoteEditorUI, Context paramContext)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(27018);
    int i = c.dem().size();
    int j = NoteEditorUI.N(this.uTu).getChildCount();
    Object localObject;
    if (i == j)
    {
      float f1 = 0.0F;
      i = j - 1;
      if (i >= 0)
      {
        localObject = NoteEditorUI.N(this.uTu).getChildAt(i);
        float f2 = s.Y((View)localObject);
        if (f1 > ((View)localObject).getBottom() + f2);
        while (true)
        {
          i--;
          break;
          f1 = ((View)localObject).getBottom() + f2;
        }
      }
      if ((f1 < com.tencent.mm.compatible.util.j.db(this.val$context)[1]) && (f1 > 0.0F))
      {
        localObject = (RelativeLayout.LayoutParams)NoteEditorUI.b(this.uTu).getLayoutParams();
        ((RelativeLayout.LayoutParams)localObject).height = ((int)f1);
        NoteEditorUI.b(this.uTu).setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
    NoteEditorUI.b(this.uTu).setVisibility(0);
    if (NoteEditorUI.a(this.uTu) != null)
    {
      localObject = NoteEditorUI.a(this.uTu);
      int[] arrayOfInt = new int[2];
      int[] tmp184_182 = arrayOfInt;
      tmp184_182[0] = 0;
      int[] tmp188_184 = tmp184_182;
      tmp188_184[1] = 0;
      tmp188_184;
      ((g)localObject).mParentView.getLocationOnScreen(arrayOfInt);
      ((g)localObject).uPB.showAtLocation(((g)localObject).mParentView, 49, 0, arrayOfInt[1] + 50);
    }
    AppMethodBeat.o(27018);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI.22
 * JD-Core Version:    0.6.2
 */