package com.tencent.mm.plugin.account;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.account.friend.a.an;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.plugin.account.friend.a.b;
import com.tencent.mm.plugin.account.friend.a.d;
import com.tencent.mm.plugin.account.friend.a.f;
import com.tencent.mm.plugin.account.friend.a.h;
import com.tencent.mm.plugin.account.friend.a.k;
import com.tencent.mm.plugin.account.friend.a.o;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.protocal.protobuf.aym;
import java.util.HashMap;
import java.util.LinkedList;

public class a
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private b gpP;
  private h gpQ;
  private k gpR;
  private an gpS;
  private ap gpT;
  private com.tencent.mm.plugin.account.friend.a.q gpU;
  private o gpV;
  private d gpW;
  private LinkedList<aym> gpX;
  private com.tencent.mm.plugin.account.friend.a.c gpY;
  private com.tencent.mm.plugin.account.friend.a.e gpZ;
  private f gqa;
  private com.tencent.mm.sdk.b.c gqb;
  private com.tencent.mm.sdk.b.c gqc;
  private com.tencent.mm.sdk.b.c gqd;
  private com.tencent.mm.sdk.b.c gqe;

  static
  {
    AppMethodBeat.i(124644);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("ADDR_UPLOAD_TABLE".hashCode()), new a.7());
    eaA.put(Integer.valueOf("FACE_BOOK_FIREND_TABLE".hashCode()), new a.8());
    eaA.put(Integer.valueOf("FRIEND_EXT_TABLE".hashCode()), new a.9());
    eaA.put(Integer.valueOf("QQ_GROUP_TABLE".hashCode()), new a.10());
    eaA.put(Integer.valueOf("QQ_LIST_TABLE".hashCode()), new a.11());
    eaA.put(Integer.valueOf("INVITEFRIENDOPEN_TABLE".hashCode()), new a.12());
    eaA.put(Integer.valueOf("GOOGLE_FRIEND_TABLE".hashCode()), new a.2());
    AppMethodBeat.o(124644);
  }

  public a()
  {
    AppMethodBeat.i(124630);
    this.gpW = new d();
    this.gpX = null;
    this.gpY = new com.tencent.mm.plugin.account.friend.a.c();
    this.gpZ = new com.tencent.mm.plugin.account.friend.a.e();
    this.gqa = new f();
    this.gqb = new a.1(this);
    this.gqc = new a.5(this);
    this.gqd = new a.6(this);
    this.gqe = new com.tencent.mm.sdk.b.c()
    {
    };
    AppMethodBeat.o(124630);
  }

  private static a aoO()
  {
    try
    {
      AppMethodBeat.i(124631);
      a locala = (a)com.tencent.mm.model.q.Y(a.class);
      AppMethodBeat.o(124631);
      return locala;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void clearFriendData()
  {
    AppMethodBeat.i(124640);
    g.RN().QU();
    aoO().gpX = null;
    AppMethodBeat.o(124640);
  }

  public static b getAddrUploadStg()
  {
    AppMethodBeat.i(124632);
    g.RN().QU();
    if (aoO().gpP == null)
      aoO().gpP = new b(g.RP().eJN);
    b localb = aoO().gpP;
    AppMethodBeat.o(124632);
    return localb;
  }

  public static h getFacebookFrdStg()
  {
    AppMethodBeat.i(124633);
    g.RN().QU();
    if (aoO().gpQ == null)
      aoO().gpQ = new h(g.RP().eJN);
    h localh = aoO().gpQ;
    AppMethodBeat.o(124633);
    return localh;
  }

  public static k getFrdExtStg()
  {
    AppMethodBeat.i(124634);
    g.RN().QU();
    if (aoO().gpR == null)
      aoO().gpR = new k(g.RP().eJN);
    k localk = aoO().gpR;
    AppMethodBeat.o(124634);
    return localk;
  }

  public static LinkedList<aym> getFriendData()
  {
    AppMethodBeat.i(124639);
    g.RN().QU();
    LinkedList localLinkedList = aoO().gpX;
    AppMethodBeat.o(124639);
    return localLinkedList;
  }

  public static o getGoogleFriendStorage()
  {
    AppMethodBeat.i(124643);
    g.RN().QU();
    if (aoO().gpV == null)
      aoO().gpV = new o(g.RP().eJN);
    o localo = aoO().gpV;
    AppMethodBeat.o(124643);
    return localo;
  }

  public static com.tencent.mm.plugin.account.friend.a.q getInviteFriendOpenStg()
  {
    AppMethodBeat.i(124636);
    g.RN().QU();
    if (aoO().gpU == null)
      aoO().gpU = new com.tencent.mm.plugin.account.friend.a.q(g.RP().eJN);
    com.tencent.mm.plugin.account.friend.a.q localq = aoO().gpU;
    AppMethodBeat.o(124636);
    return localq;
  }

  public static an getQQGroupStg()
  {
    AppMethodBeat.i(124635);
    g.RN().QU();
    if (aoO().gpS == null)
      aoO().gpS = new an(g.RP().eJN);
    an localan = aoO().gpS;
    AppMethodBeat.o(124635);
    return localan;
  }

  public static ap getQQListStg()
  {
    AppMethodBeat.i(124637);
    g.RN().QU();
    if (aoO().gpT == null)
      aoO().gpT = new ap(g.RP().eJN);
    ap localap = aoO().gpT;
    AppMethodBeat.o(124637);
    return localap;
  }

  public static void setFriendData(LinkedList<aym> paramLinkedList)
  {
    AppMethodBeat.i(124638);
    g.RN().QU();
    aoO().gpX = paramLinkedList;
    AppMethodBeat.o(124638);
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(124642);
    e.d.a(Integer.valueOf(42), this.gpW);
    e.d.a(Integer.valueOf(66), this.gpW);
    com.tencent.mm.sdk.b.a.xxA.c(this.gqe);
    com.tencent.mm.sdk.b.a.xxA.c(this.gqd);
    com.tencent.mm.sdk.b.a.xxA.c(this.gpY);
    com.tencent.mm.sdk.b.a.xxA.c(this.gpZ);
    com.tencent.mm.sdk.b.a.xxA.c(this.gqa);
    com.tencent.mm.sdk.b.a.xxA.c(this.gqb);
    com.tencent.mm.sdk.b.a.xxA.c(this.gqc);
    ((n)g.M(n.class)).getFTSTaskDaemon().a(-86016, new a.4(this));
    AppMethodBeat.o(124642);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(124641);
    com.tencent.mm.sdk.b.a.xxA.d(this.gqe);
    com.tencent.mm.sdk.b.a.xxA.d(this.gqd);
    com.tencent.mm.sdk.b.a.xxA.d(this.gpY);
    com.tencent.mm.sdk.b.a.xxA.d(this.gpZ);
    com.tencent.mm.sdk.b.a.xxA.d(this.gqa);
    com.tencent.mm.sdk.b.a.xxA.d(this.gqb);
    com.tencent.mm.sdk.b.a.xxA.d(this.gqc);
    e.d.b(Integer.valueOf(42), this.gpW);
    e.d.b(Integer.valueOf(66), this.gpW);
    this.gpX = null;
    AppMethodBeat.o(124641);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.a
 * JD-Core Version:    0.6.2
 */