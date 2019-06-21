package com.tencent.mm.view;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.widget.a.e.c;

final class SmileyGrid$4
  implements e.c
{
  SmileyGrid$4(SmileyGrid paramSmileyGrid)
  {
  }

  public final void d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(62901);
    if (paramBoolean)
    {
      paramString = new Intent();
      paramString.putExtra("key_emoji_panel_type", 1);
      d.b(this.Aaf.getContext(), "emoji", ".ui.EmojiCustomUI", paramString);
    }
    AppMethodBeat.o(62901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileyGrid.4
 * JD-Core Version:    0.6.2
 */