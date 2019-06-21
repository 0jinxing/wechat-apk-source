package com.tencent.mm.plugin.account.friend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class f$1
  implements f.a
{
  f$1(f paramf)
  {
  }

  public final void d(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(108603);
    ab.d("MicroMsg.QQFriendAdapterCaseB", "[cpan] postion:%d qq:%s status:%d", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    ao localao = (ao)this.gxQ.getItem(paramInt1);
    if (localao == null)
    {
      ab.e("MicroMsg.QQFriendAdapterCaseB", "[cpan] qq friend is null. qq:%s", new Object[] { paramString });
      AppMethodBeat.o(108603);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.QQFriendAdapterCaseB", "qq friend:%s", new Object[] { localao.toString() });
      if (localao.gwD == 1)
      {
        com.tencent.mm.pluginsdk.ui.applet.a locala = new com.tencent.mm.pluginsdk.ui.applet.a(f.a(this.gxQ), new f.1.1(this));
        locala.gyj = localao.gwC;
        locala.vjO = false;
        paramString = new LinkedList();
        paramString.add(Integer.valueOf(12));
        if (bo.isNullOrNil(localao.getUsername()))
        {
          ab.w("MicroMsg.QQFriendAdapterCaseB", "[cpan] qq friend username is null.");
          AppMethodBeat.o(108603);
        }
        else
        {
          locala.b(localao.getUsername(), paramString, true);
          localao.frT = 1;
          ((ap)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(localao.gwC, localao);
          this.gxQ.KC();
        }
      }
      else
      {
        AppMethodBeat.o(108603);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.f.1
 * JD-Core Version:    0.6.2
 */