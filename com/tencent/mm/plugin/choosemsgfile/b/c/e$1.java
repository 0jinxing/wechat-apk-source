package com.tencent.mm.plugin.choosemsgfile.b.c;

import android.support.v7.widget.RecyclerView.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.choosemsgfile.b.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class e$1
  implements g.a
{
  e$1(e parame)
  {
  }

  public final void a(boolean paramBoolean, com.tencent.mm.plugin.choosemsgfile.b.b.a parama, RecyclerView.v paramv)
  {
    AppMethodBeat.i(54345);
    if (parama == null)
    {
      ab.e("MicroMsg.ChooseMsgFileListUIController", "[onCheck] item is null, err");
      AppMethodBeat.o(54345);
      return;
    }
    ab.i("MicroMsg.ChooseMsgFileListUIController", "[onCheck] isChecked :%b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      parama.bfq();
      e.a(this.kuZ).gX(parama.kua.field_msgId);
      b.a(parama, new e.1.1(this, parama, paramv), this.kuZ.bfA());
    }
    while (true)
    {
      parama.T(paramv);
      AppMethodBeat.o(54345);
      break;
      parama.bfu();
      e.a(this.kuZ).gY(parama.kua.field_msgId);
      e.a(this.kuZ).gV(parama.kua.field_msgId);
      if (e.a(this.kuZ).bfD())
        al.d(new e.1.2(this));
      this.kuZ.kuT.bfG();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.choosemsgfile.b.c.e.1
 * JD-Core Version:    0.6.2
 */