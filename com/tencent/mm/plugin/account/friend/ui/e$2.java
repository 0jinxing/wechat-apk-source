package com.tencent.mm.plugin.account.friend.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.account.a.a.a;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

final class e$2
  implements a.a
{
  e$2(e parame)
  {
  }

  public final void W(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(108591);
    if (paramBoolean)
    {
      ao localao = ((com.tencent.mm.plugin.account.friend.a.ap)((a)g.M(a.class)).getQQListStg()).wj(paramString);
      if (localao == null)
        break label109;
      localao.aqu();
      ab.d("MicroMsg.QQFriendAdapter", "user " + paramString + " qq " + localao.gwC);
      ((com.tencent.mm.plugin.account.friend.a.ap)((a)g.M(a.class)).getQQListStg()).a(localao.gwC, localao);
    }
    while (true)
    {
      this.gxJ.notifyDataSetChanged();
      AppMethodBeat.o(108591);
      return;
      label109: ab.w("MicroMsg.QQFriendAdapter", "[cpan] dealFail failed. qqlist is null. username is :%s", new Object[] { String.valueOf(paramString) });
    }
  }

  public final void wk(String paramString)
  {
    AppMethodBeat.i(108590);
    Object localObject = (com.tencent.mm.plugin.account.friend.a.ap)((a)g.M(a.class)).getQQListStg();
    ao localao = ((com.tencent.mm.plugin.account.friend.a.ap)localObject).wj(paramString);
    if (localao == null)
    {
      ab.w("MicroMsg.QQFriendAdapter", "[cpan] dealSucc failed. qqlist is null. username is :%s", new Object[] { String.valueOf(paramString) });
      AppMethodBeat.o(108590);
      return;
    }
    localao.gwD = 2;
    ((com.tencent.mm.plugin.account.friend.a.ap)localObject).a(localao.gwC, localao);
    this.gxJ.notifyDataSetChanged();
    localObject = ((j)g.K(j.class)).XM().aoO(paramString);
    if (localObject != null)
      if (((((com.tencent.mm.g.c.ap)localObject).field_conRemark == null) || (((com.tencent.mm.g.c.ap)localObject).field_conRemark.equals(""))) && (localao != null) && (localao.aqr() != null) && (!localao.aqr().equals("")))
        t.b((ad)localObject, localao.aqr());
    while (true)
    {
      bv.aaq().c(26, new Object[0]);
      AppMethodBeat.o(108590);
      break;
      localao = ((com.tencent.mm.plugin.account.friend.a.ap)((a)g.M(a.class)).getQQListStg()).wj(paramString);
      if (localao != null)
      {
        localao.aqu();
        ab.d("MicroMsg.QQFriendAdapter", "user " + paramString + " qq " + localao.gwC);
        ((com.tencent.mm.plugin.account.friend.a.ap)((a)g.M(a.class)).getQQListStg()).a(localao.gwC, localao);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.ui.e.2
 * JD-Core Version:    0.6.2
 */