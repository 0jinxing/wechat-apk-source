package com.tencent.mm.emoji.debug;

import a.l;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/MenuItem;", "kotlin.jvm.PlatformType", "onMenuItemClick"})
final class EmojiDebugUI$f
  implements MenuItem.OnMenuItemClickListener
{
  EmojiDebugUI$f(EmojiDebugUI paramEmojiDebugUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(63126);
    this.exb.finish();
    AppMethodBeat.o(63126);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.debug.EmojiDebugUI.f
 * JD-Core Version:    0.6.2
 */