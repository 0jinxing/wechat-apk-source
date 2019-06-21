package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;

final class FavRecordDetailUI$4
  implements Runnable
{
  FavRecordDetailUI$4(FavRecordDetailUI paramFavRecordDetailUI, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24209);
    if (this.pKo == null)
      AppMethodBeat.o(24209);
    while (true)
    {
      return;
      ab.i("MicroMsg.FavRecordDetailUI", "start calc");
      Iterator localIterator = this.pKo.iterator();
      long l = 0L;
      int i = 0;
      int j = 0;
      int k = 0;
      int m = 0;
      while (localIterator.hasNext())
      {
        localObject = (aar)localIterator.next();
        if ((localObject != null) && (!FavRecordDetailUI.e(this.pKi)))
          switch (((aar)localObject).dataType)
          {
          default:
            i++;
            break;
          case 2:
            k++;
            break;
          case 1:
            m++;
            l = ((aar)localObject).desc.getBytes().length + l;
            break;
          case 4:
          case 15:
            j++;
          }
      }
      Object localObject = String.format("%s:%s:%s:%s:%s", new Object[] { Integer.valueOf(m), Long.valueOf(l), Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(i) });
      FavRecordDetailUI.a(this.pKi, (String)localObject);
      ab.v("MicroMsg.FavRecordDetailUI", "start calc finish %s", new Object[] { localObject });
      AppMethodBeat.o(24209);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI.4
 * JD-Core Version:    0.6.2
 */