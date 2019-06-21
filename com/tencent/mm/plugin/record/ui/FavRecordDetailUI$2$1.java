package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;

final class FavRecordDetailUI$2$1
  implements n.c
{
  FavRecordDetailUI$2$1(FavRecordDetailUI.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(24203);
    ab.i("MicroMsg.FavRecordDetailUI", "favItemInfo: id %d, status %d", new Object[] { Integer.valueOf(FavRecordDetailUI.b(this.pKl.pKi).field_id), Integer.valueOf(FavRecordDetailUI.b(this.pKl.pKi).field_itemStatus) });
    if ((FavRecordDetailUI.b(this.pKl.pKi).field_id > 0) && (!FavRecordDetailUI.b(this.pKl.pKi).buw()) && (!FavRecordDetailUI.b(this.pKl.pKi).bux()) && (FavRecordDetailUI.c(this.pKl.pKi)))
      paraml.e(0, this.pKl.pKi.getString(2131299734));
    paraml.e(5, this.pKl.pKi.getString(2131299722));
    paraml.e(3, this.pKl.pKi.getString(2131299612));
    paraml.e(2, this.pKl.pKi.getString(2131296881));
    AppMethodBeat.o(24203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI.2.1
 * JD-Core Version:    0.6.2
 */