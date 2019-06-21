package com.tencent.mm.plugin.account.friend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class e$1
  implements e.a
{
  e$1(e parame)
  {
  }

  public final void d(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(108589);
    ab.d("MicroMsg.QQFriendAdapter", "[cpan] postion:%d qq:%s status:%d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    ao localao = (ao)this.gxJ.getItem(paramInt1);
    if (localao == null)
    {
      ab.e("MicroMsg.QQFriendAdapter", "[cpan] qq friend is null. qq:%s", new Object[] { paramString });
      AppMethodBeat.o(108589);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(localao.getUsername()))
      {
        ab.e("MicroMsg.QQFriendAdapter", "[cpan] qq friend username is null. qq:%s", new Object[] { paramString });
        AppMethodBeat.o(108589);
      }
      else
      {
        ab.d("MicroMsg.QQFriendAdapter", "qq friend:%s", new Object[] { localao.toString() });
        if (localao.gwD == 0)
        {
          paramInt1 = p.cB(localao.gwC);
          paramString = new g(e.a(this.gxJ), new e.1.1(this), (byte)0);
          paramString.m(new int[] { paramInt1 });
          paramString.gyj = localao.gwC;
          localao.frT = 1;
          ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(localao.gwC, localao);
          this.gxJ.KC();
          AppMethodBeat.o(108589);
        }
        else
        {
          if (localao.gwD == 1)
          {
            paramString = new com.tencent.mm.pluginsdk.ui.applet.a(e.a(this.gxJ), new e.1.2(this));
            paramString.gyj = localao.gwC;
            paramString.vjO = false;
            LinkedList localLinkedList = new LinkedList();
            localLinkedList.add(Integer.valueOf(12));
            paramString.b(localao.getUsername(), localLinkedList, true);
            localao.frT = 1;
            ((ap)((com.tencent.mm.plugin.account.a.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(localao.gwC, localao);
            this.gxJ.KC();
          }
          AppMethodBeat.o(108589);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.e.1
 * JD-Core Version:    0.6.2
 */