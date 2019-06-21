package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.widget.textview.a.f;

public final class c$c
  implements View.OnLongClickListener
{
  private PopupWindow.OnDismissListener aaN;
  private int jLX;
  private int jLY;
  private View.OnCreateContextMenuListener pFC;
  private com.tencent.mm.ui.chatting.d.a yJI;
  com.tencent.mm.ui.widget.b.a yMt;
  private c.c.a zbC;
  private View zbD;
  a.f zbi;

  public c$c(c paramc, com.tencent.mm.ui.chatting.d.a parama)
  {
    AppMethodBeat.i(32795);
    this.aaN = new c.c.3(this);
    this.yJI = parama;
    this.pFC = new c.c.1(this, paramc);
    this.zbC = new c.c.a(this);
    AppMethodBeat.o(32795);
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(32796);
    ab.i("MicroMsg.ChattingItem", "onLongClick");
    if ((paramView.getTag(2131820679) instanceof int[]))
    {
      int[] arrayOfInt = (int[])paramView.getTag(2131820679);
      s(paramView, arrayOfInt[0], arrayOfInt[1]);
    }
    while (true)
    {
      AppMethodBeat.o(32796);
      return true;
      if (((this.jLX == 0) && (this.jLY == 0)) || (!this.zbD.equals(paramView)))
        paramView.setOnTouchListener(new c.c.2(this));
      else
        s(paramView, this.jLX, this.jLY);
    }
  }

  final void s(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(32797);
    ay localay = (ay)paramView.getTag();
    if (localay == null)
    {
      ab.w("MicroMsg.ChattingItem", "open menu but tag is null");
      AppMethodBeat.o(32797);
      return;
    }
    this.zbC.csG = localay.cKd;
    if (this.yMt != null)
    {
      this.yMt.dBX();
      this.yMt = null;
    }
    this.yMt = new com.tencent.mm.ui.widget.b.a(this.yJI.yTx.getContext());
    Object localObject = paramView.getTag(2131820672);
    if ((localObject != null) && (((Boolean)localObject).booleanValue()))
    {
      if (!a.a.dzk().dzj())
        break label206;
      this.yMt.zSb = true;
    }
    for (this.yMt.zHM = this.aaN; ; this.yMt.zHM = null)
    {
      this.yMt.zSc = true;
      if (((localay instanceof ChattingItemTranslate.a)) && (2 == ((ChattingItemTranslate.a)localay).klY) && (this.zbi != null))
        this.zbi.dismiss();
      this.yMt.a(paramView, this.pFC, this.zbC, paramInt1, paramInt2);
      AppMethodBeat.o(32797);
      break;
      label206: this.yMt.zSb = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.c.c
 * JD-Core Version:    0.6.2
 */