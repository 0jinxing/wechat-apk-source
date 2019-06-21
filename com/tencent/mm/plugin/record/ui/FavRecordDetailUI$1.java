package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.al;

final class FavRecordDetailUI$1
  implements k.a
{
  FavRecordDetailUI$1(FavRecordDetailUI paramFavRecordDetailUI)
  {
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(24202);
    if (paramm == null)
      AppMethodBeat.o(24202);
    while (true)
    {
      return;
      if (paramm.obj == null)
      {
        AppMethodBeat.o(24202);
      }
      else
      {
        long l = ((Long)paramm.obj).longValue();
        if (l < 0L)
        {
          AppMethodBeat.o(24202);
        }
        else
        {
          if (FavRecordDetailUI.a(this.pKi) == l)
          {
            paramm = com.tencent.mm.plugin.record.b.g.jD(FavRecordDetailUI.a(this.pKi));
            paramString = new b();
            paramString.mnW = paramm;
            if ((paramm != null) && (paramm.field_favProto != null))
            {
              paramString.pJZ = paramm.field_favProto.wiv;
              al.d(new FavRecordDetailUI.1.1(this, paramString));
            }
          }
          AppMethodBeat.o(24202);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI.1
 * JD-Core Version:    0.6.2
 */