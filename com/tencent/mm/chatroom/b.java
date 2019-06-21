package com.tencent.mm.chatroom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.kj;
import com.tencent.mm.g.a.kk;
import com.tencent.mm.g.a.kl;
import com.tencent.mm.g.a.km;
import com.tencent.mm.g.a.kq;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.bz;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.a.e;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import java.util.HashMap;

public class b
  implements at
{
  private static com.tencent.mm.chatroom.b.a egR;
  private com.tencent.mm.pluginsdk.c.c<kj> egL;
  private com.tencent.mm.pluginsdk.c.c<km> egM;
  private com.tencent.mm.pluginsdk.c.c<kl> egN;
  private com.tencent.mm.pluginsdk.c.c<kq> egO;
  private com.tencent.mm.pluginsdk.c.c<kk> egP;
  private com.tencent.mm.sdk.b.c egQ;

  public b()
  {
    AppMethodBeat.i(103886);
    this.egL = new b.1(this);
    this.egM = new com.tencent.mm.pluginsdk.c.c()
    {
      public final int Jy()
      {
        return 551;
      }
    };
    this.egN = new b.3(this);
    this.egO = new com.tencent.mm.pluginsdk.c.c()
    {
      public final int Jy()
      {
        return 700;
      }
    };
    this.egP = new b.5(this);
    this.egQ = new b.6(this);
    AppMethodBeat.o(103886);
  }

  private static b Jv()
  {
    AppMethodBeat.i(103887);
    b localb = (b)q.Y(b.class);
    AppMethodBeat.o(103887);
    return localb;
  }

  private static com.tencent.mm.chatroom.b.a Jw()
  {
    AppMethodBeat.i(103888);
    g.RN().QU();
    Jv();
    if (egR == null)
    {
      Jv();
      egR = new com.tencent.mm.chatroom.b.a();
    }
    Jv();
    com.tencent.mm.chatroom.b.a locala = egR;
    AppMethodBeat.o(103888);
    return locala;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(103889);
    com.tencent.mm.roomsdk.a.b.a("@chatroom", new a());
    com.tencent.mm.sdk.b.a.xxA.c(this.egQ);
    com.tencent.mm.sdk.b.a.xxA.c(this.egL);
    com.tencent.mm.sdk.b.a.xxA.c(this.egP);
    com.tencent.mm.sdk.b.a.xxA.c(this.egM);
    com.tencent.mm.sdk.b.a.xxA.c(this.egN);
    com.tencent.mm.sdk.b.a.xxA.c(this.egO);
    com.tencent.mm.chatroom.b.a locala = Jw();
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("NewXmlChatRoomAccessVerifyApplication", locala.ehc, true);
    ((p)g.M(p.class)).getSysCmdMsgExtension().a("NewXmlChatRoomAccessVerifyApproval", locala.ehc, true);
    ((e)g.K(e.class)).a("link_admin_explain", locala);
    AppMethodBeat.o(103889);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(103890);
    com.tencent.mm.sdk.b.a.xxA.d(this.egQ);
    com.tencent.mm.sdk.b.a.xxA.d(this.egL);
    com.tencent.mm.sdk.b.a.xxA.d(this.egP);
    com.tencent.mm.sdk.b.a.xxA.d(this.egM);
    com.tencent.mm.sdk.b.a.xxA.d(this.egN);
    com.tencent.mm.sdk.b.a.xxA.d(this.egO);
    com.tencent.mm.chatroom.b.a locala = Jw();
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("NewXmlChatRoomAccessVerifyApplication", locala.ehc, true);
    ((p)g.M(p.class)).getSysCmdMsgExtension().b("NewXmlChatRoomAccessVerifyApproval", locala.ehc, true);
    ((e)g.K(e.class)).QB("link_admin_explain");
    AppMethodBeat.o(103890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.b
 * JD-Core Version:    0.6.2
 */