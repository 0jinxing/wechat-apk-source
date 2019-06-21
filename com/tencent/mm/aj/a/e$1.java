package com.tencent.mm.aj.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.be;

final class e$1
  implements Runnable
{
  e$1(String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11529);
    Object localObject1 = z.aeU();
    Object localObject2 = this.fxD;
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("delete from BizChatConversation");
    ((StringBuilder)localObject3).append(" where brandUserName = '").append((String)localObject2).append("' ");
    localObject3 = ((StringBuilder)localObject3).toString();
    boolean bool = ((b)localObject1).bSd.hY("BizChatConversation", (String)localObject3);
    ab.i("MicroMsg.BizConversationStorage", "deleteByBrandUserName sql %s,%s", new Object[] { localObject3, Boolean.valueOf(bool) });
    Object localObject4;
    if (bool)
    {
      localObject4 = new a();
      localObject3 = new b.a.b();
      ((b.a.b)localObject3).fxq = -1L;
      ((b.a.b)localObject3).cwz = ((String)localObject2);
      ((b.a.b)localObject3).fxp = b.a.a.fxm;
      ((b.a.b)localObject3).fxr = ((a)localObject4);
      ((b)localObject1).fuL.cF(localObject3);
      ((b)localObject1).fuL.doNotify();
    }
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XR().aoX(this.fxD);
    localObject2 = z.aeT();
    localObject1 = this.fxD;
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("delete from BizChatInfo");
    ((StringBuilder)localObject3).append(" where brandUserName = '").append((String)localObject1).append("' ");
    localObject3 = ((StringBuilder)localObject3).toString();
    bool = ((d)localObject2).bSd.hY("BizChatInfo", (String)localObject3);
    ab.i("MicroMsg.BizChatInfoStorage", "deleteByBrandUserName sql %s,%s", new Object[] { localObject3, Boolean.valueOf(bool) });
    if (bool)
    {
      localObject3 = new c();
      localObject4 = new d.a.b();
      ((d.a.b)localObject4).fxq = -1L;
      ((d.a.b)localObject4).cwz = ((String)localObject1);
      ((d.a.b)localObject4).fxA = d.a.a.fxx;
      ((d.a.b)localObject4).fxB = ((c)localObject3);
      ((d)localObject2).fuL.cF(localObject4);
      ((d)localObject2).fuL.doNotify();
    }
    com.tencent.mm.vfs.e.N(e.cC(this.fxD), true);
    if (this.fxE)
    {
      localObject1 = z.aeV();
      localObject3 = this.fxD;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("delete from BizChatUserInfo");
      ((StringBuilder)localObject2).append(" where brandUserName = '").append((String)localObject3).append("' ");
      localObject2 = ((StringBuilder)localObject2).toString();
      bool = ((k)localObject1).bSd.hY("BizChatUserInfo", (String)localObject2);
      ab.i("MicroMsg.BizChatUserInfoStorage", "deleteByBrandUserName sql %s,%s", new Object[] { localObject2, Boolean.valueOf(bool) });
      if (bool)
      {
        localObject3 = new j();
        localObject2 = new k.a.b();
        ((k.a.b)localObject2).fyc = k.a.a.fxZ;
        ((k.a.b)localObject2).fyd = ((j)localObject3);
        ((k)localObject1).fuL.cF(localObject2);
        ((k)localObject1).fuL.doNotify();
      }
      z.aeW().rB(this.fxD);
      com.tencent.mm.vfs.e.N(e.rz(this.fxD), true);
    }
    al.d(new e.1.1(this));
    AppMethodBeat.o(11529);
  }

  public final String toString()
  {
    AppMethodBeat.i(11530);
    String str = super.toString() + "|deleteMsgByTalkers";
    AppMethodBeat.o(11530);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a.e.1
 * JD-Core Version:    0.6.2
 */