package com.tencent.mm.emoji.debug;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class EmojiDebugUI$d$a
  implements View.OnClickListener
{
  EmojiDebugUI$d$a(EmojiDebugUI.d paramd, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(63121);
    ((EmojiDebugUI.a)EmojiDebugUI.b(this.exh.exb).get(this.exi)).onClick();
    AppMethodBeat.o(63121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.debug.EmojiDebugUI.d.a
 * JD-Core Version:    0.6.2
 */