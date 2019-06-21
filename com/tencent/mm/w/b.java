package com.tencent.mm.w;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends com.tencent.mm.plugin.fts.a.b
{
  m eAX;
  a eAY;
  private n.b eAZ;

  public b()
  {
    AppMethodBeat.i(124486);
    this.eAZ = new b.1(this);
    AppMethodBeat.o(124486);
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(124488);
    ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg().b(this.eAZ);
    AppMethodBeat.o(124488);
    return true;
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(i parami)
  {
    AppMethodBeat.i(124489);
    parami = new b.g(this, parami);
    parami = this.eAX.a(-65536, parami);
    AppMethodBeat.o(124489);
    return parami;
  }

  public final String getName()
  {
    return "FTS5SearchFriendLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(124487);
    boolean bool;
    if (!((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchFriendLogic", "Create Fail!");
      AppMethodBeat.o(124487);
      bool = false;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchFriendLogic", "Create Success!");
      this.eAY = ((a)((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSIndexStorage(1280));
      this.eAX = ((com.tencent.mm.plugin.fts.a.n)g.M(com.tencent.mm.plugin.fts.a.n.class)).getFTSTaskDaemon();
      this.eAX.a(131172, new b.b(this, (byte)0));
      ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getAddrUploadStg().a(this.eAZ);
      bool = true;
      AppMethodBeat.o(124487);
    }
  }

  static final class a
  {
    String bCu;
    String cFl;
    String eBb;
    String eBc;
    String eBd;
    String eBe;
    String eBf;
    long id;
    int status;
    int type;
    String userName;

    a()
    {
    }

    a(com.tencent.mm.plugin.account.friend.a.a parama)
    {
      AppMethodBeat.i(124475);
      this.id = com.tencent.mm.plugin.account.friend.a.a.vR(parama.Aq());
      this.eBb = parama.apA();
      this.eBc = parama.apC();
      this.eBd = parama.apB();
      this.bCu = parama.apD();
      this.eBe = parama.apF();
      this.eBf = parama.apE();
      this.userName = parama.getUsername();
      this.cFl = parama.apG();
      this.type = parama.type;
      this.status = parama.status;
      AppMethodBeat.o(124475);
    }
  }

  final class d extends com.tencent.mm.plugin.fts.a.a.a
  {
    private int eBl;
    private String eBm;

    public d(String arg2)
    {
      Object localObject;
      this.eBm = localObject;
      this.eBl = 0;
    }

    public final boolean execute()
    {
      AppMethodBeat.i(124481);
      ab.d("MicroMsg.FTS.FTS5SearchFriendLogic", "[DeleteFriendTask mEntityId: %s, mFriendType: %s]", new Object[] { this.eBm, Integer.valueOf(this.eBl) });
      if (this.eBl == 0)
      {
        long l = com.tencent.mm.plugin.account.friend.a.a.vR(this.eBm);
        b.this.eAY.c(c.mCm, l);
      }
      AppMethodBeat.o(124481);
      return true;
    }

    public final String toString()
    {
      AppMethodBeat.i(124482);
      String str = "DeleteFriend(\"" + this.eBm + "\", " + this.eBl + ")";
      AppMethodBeat.o(124482);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.b
 * JD-Core Version:    0.6.2
 */