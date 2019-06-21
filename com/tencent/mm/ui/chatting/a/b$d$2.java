package com.tencent.mm.ui.chatting.a;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.chatting.gallery.h;
import com.tencent.mm.ui.chatting.gallery.h.a;
import java.util.ArrayList;

final class b$d$2
  implements View.OnClickListener
{
  b$d$2(b.d paramd, b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(31136);
    boolean bool;
    if (!this.yNH.moo.isChecked())
    {
      bool = true;
      if (h.a.dFX().mnX.size() >= 9)
        break label142;
      this.yNH.moo.setChecked(bool);
      if (bool)
        break label128;
      this.yNH.mom.setVisibility(8);
    }
    while (true)
    {
      if (this.yNH.yND.yNC != null)
      {
        int i = ((Integer)paramView.getTag()).intValue();
        paramView = this.yNH.yND.Ox(i);
        this.yNH.yND.yNC.a(bool, paramView, i);
      }
      AppMethodBeat.o(31136);
      return;
      bool = false;
      break;
      label128: this.yNH.mom.setVisibility(0);
      continue;
      label142: if (!bool)
        this.yNH.moo.setChecked(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.b.d.2
 * JD-Core Version:    0.6.2
 */