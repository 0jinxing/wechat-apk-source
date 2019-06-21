package com.tencent.mm.view.e;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.debug.EmojiDebugUI;

public final class a$3
  implements View.OnLongClickListener
{
  public a$3(a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(63025);
    paramView = new Intent(a.g(this.AdQ), EmojiDebugUI.class);
    a.g(this.AdQ).startActivity(paramView);
    AppMethodBeat.o(63025);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.e.a.3
 * JD-Core Version:    0.6.2
 */