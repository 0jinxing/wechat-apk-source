package com.tencent.mm.plugin.messenger.foundation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.az.n;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.bz;
import com.tencent.mm.modelmulti.m;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.messenger.foundation.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.plugin.messenger.foundation.a.r.a;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import com.tencent.mm.plugin.zero.PluginZero;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.al;
import com.tencent.mm.storage.ao;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bc;
import com.tencent.mm.storage.bg;
import com.tencent.mm.storage.bj;
import com.tencent.mm.storage.br;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.bw;
import com.tencent.mm.storage.cb;
import com.tencent.mm.storage.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import junit.framework.Assert;

public class PluginMessengerFoundation extends f
  implements com.tencent.mm.kernel.api.bucket.a, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.kernel.api.bucket.d, com.tencent.mm.model.aj, p
{
  private com.tencent.mm.model.e flI;
  private d oqq;
  private e oqr;
  private bz oqs;
  private com.tencent.mm.plugin.chatroom.a oqt;
  private com.tencent.mm.model.aj oqu;
  private com.tencent.mm.plugin.messenger.foundation.a.b oqv;

  public PluginMessengerFoundation()
  {
    AppMethodBeat.i(1050);
    this.flI = new com.tencent.mm.model.e();
    this.oqs = new bz();
    this.oqt = new com.tencent.mm.plugin.chatroom.a();
    AppMethodBeat.o(1050);
  }

  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    AppMethodBeat.i(1055);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf("MESSAGE_TABLE".hashCode()), new PluginMessengerFoundation.12(this));
    localHashMap.put(Integer.valueOf("CONTACT_TABLE".hashCode()), new PluginMessengerFoundation.13(this));
    localHashMap.put(Integer.valueOf("OPLOG_TABLE".hashCode()), new PluginMessengerFoundation.14(this));
    localHashMap.put(Integer.valueOf("CONVERSATION_TABLE".hashCode()), new PluginMessengerFoundation.15(this));
    localHashMap.put(Integer.valueOf("ROLEINFO_TABLE".hashCode()), new PluginMessengerFoundation.16(this));
    localHashMap.put(Integer.valueOf("STRANGER_TABLE".hashCode()), new PluginMessengerFoundation.17(this));
    localHashMap.put(Integer.valueOf("DeletedConversationInfo".hashCode()), new PluginMessengerFoundation.2(this));
    localHashMap.put(Integer.valueOf("LBSVERIFYMESSAGE_TABLE".hashCode()), new PluginMessengerFoundation.3(this));
    localHashMap.put(Integer.valueOf("SHAKEVERIFYMESSAGE_TABLE".hashCode()), new PluginMessengerFoundation.4(this));
    localHashMap.put(Integer.valueOf("VERIFY_CONTACT_TABLE".hashCode()), new PluginMessengerFoundation.5(this));
    localHashMap.put(Integer.valueOf("FMESSAGE_MSGINFO_TABLE".hashCode()), new h.d()
    {
      public final String[] Af()
      {
        return ay.fnj;
      }
    });
    localHashMap.put(Integer.valueOf("FMESSAGE_CONVERSATION_TABLE".hashCode()), new PluginMessengerFoundation.7(this));
    localHashMap.put(Integer.valueOf("CHATROOM_MSGSEQ_TABLE".hashCode()), new PluginMessengerFoundation.8(this));
    localHashMap.put(Integer.valueOf("GetSysCmdMsgInfo".hashCode()), new PluginMessengerFoundation.9(this));
    AppMethodBeat.o(1055);
    return localHashMap;
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(1053);
    ab.i("MicroMsg.TAG", "init thread pool[%s] current tid[%d] priority[%d] process[%s]", new Object[] { com.tencent.mm.sdk.g.d.xDG, Long.valueOf(Thread.currentThread().getId()), Integer.valueOf(Thread.currentThread().getPriority()), ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.RM().Rn()).eHT });
    com.tencent.mm.plugin.zero.c.vaf = new PluginMessengerFoundation.1(this);
    Object localObject = new a();
    r.a.a(2, (r)localObject);
    r.a.a(17, (r)localObject);
    r.a.a(4, (r)localObject);
    r.a.a(7, new b());
    localObject = new c();
    r.a.a(5, (r)localObject);
    r.a.a(8, (r)localObject);
    r.a.a(9, (r)localObject);
    r.a.a(1, new g());
    com.tencent.mm.kernel.g.RL().a(com.tencent.mm.plugin.messenger.foundation.a.q.class, new com.tencent.mm.kernel.c.e(new m()));
    com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.zero.a.d.class);
    if (paramg.SG())
    {
      new com.tencent.mm.plugin.zero.tasks.b().before(this);
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.messenger.foundation.a.d.class, new PluginMessengerFoundation.10(this));
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.messenger.foundation.a.i.class, new com.tencent.mm.plugin.messenger.foundation.a.i()
      {
        public final e.b a(e.a paramAnonymousa, t paramAnonymoust)
        {
          AppMethodBeat.i(1049);
          paramAnonymousa = c.a(paramAnonymousa, paramAnonymoust);
          AppMethodBeat.o(1049);
          return paramAnonymousa;
        }
      });
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.chatroom.a.c.class, this.oqt);
    }
    AppMethodBeat.o(1053);
  }

  public void dependency()
  {
    AppMethodBeat.i(1052);
    dependsOn(PluginZero.class);
    AppMethodBeat.o(1052);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(1054);
    if (paramg.SG())
    {
      this.oqq = new d();
      com.tencent.mm.kernel.g.a(j.class, new com.tencent.mm.kernel.c.e(this.oqq));
      this.oqr = new e();
      com.tencent.mm.kernel.g.a(k.class, new com.tencent.mm.kernel.c.e(this.oqr));
    }
    AppMethodBeat.o(1054);
  }

  public com.tencent.mm.plugin.messenger.foundation.a.b getBizTimeLineCallback()
  {
    return this.oqv;
  }

  public List<ai> getDataTransferList()
  {
    AppMethodBeat.i(1059);
    Object localObject;
    if (this.oqu != null)
    {
      localObject = this.oqu.getDataTransferList();
      if (((List)localObject).size() > 8)
        Assert.assertTrue("Do not add more IDataTransfer from mIDataTransferFactoryDelegate!!!!!!!!!!!", false);
      AppMethodBeat.o(1059);
    }
    while (true)
    {
      return localObject;
      localObject = new ArrayList();
      AppMethodBeat.o(1059);
    }
  }

  public bz getSysCmdMsgExtension()
  {
    return this.oqs;
  }

  public void installed()
  {
    AppMethodBeat.i(1051);
    alias(p.class);
    AppMethodBeat.o(1051);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(1056);
    e.d.a(Integer.valueOf(10000), this.flI);
    e.d.a(Integer.valueOf(1), this.flI);
    e.d.a(Integer.valueOf(10001), this.oqs);
    e.d.a(Integer.valueOf(10002), this.oqs);
    AppMethodBeat.o(1056);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(1057);
    e.d.b(Integer.valueOf(10000), this.flI);
    e.d.b(Integer.valueOf(1), this.flI);
    e.d.b(Integer.valueOf(10001), this.oqs);
    e.d.b(Integer.valueOf(10002), this.oqs);
    AppMethodBeat.o(1057);
  }

  public void onDataBaseClosed(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
  }

  public void onDataBaseOpened(com.tencent.mm.cd.h paramh1, com.tencent.mm.cd.h paramh2)
  {
    AppMethodBeat.i(1058);
    com.tencent.mm.model.q.Yx();
    paramh2 = this.oqq;
    paramh1 = com.tencent.mm.kernel.g.RP().eJN;
    com.tencent.mm.kernel.g.RP();
    paramh2.oqf = new n(new com.tencent.mm.az.i(paramh1));
    paramh2.oqg = new com.tencent.mm.az.a();
    paramh2.oqb = new com.tencent.mm.storage.aj(paramh1);
    paramh2.oqc = new bw(paramh1);
    paramh2.oqe = new al(paramh1);
    paramh2.oqd = new bj(paramh1, paramh2.oqb, paramh2.oqe);
    paramh2.oqh = new br(paramh1);
    paramh2.oqi = new ao(paramh1);
    paramh2.oqj = new ay(paramh1);
    paramh2.oqk = new aw(paramh1);
    paramh2.oql = new bg(paramh1);
    paramh2.oqm = new bu(paramh1);
    paramh2.oqn = new cb(paramh1);
    paramh2.oqo = new x(paramh1);
    paramh2.oqp = new bc(paramh1);
    AppMethodBeat.o(1058);
  }

  public void setBizTimeLineCallback(com.tencent.mm.plugin.messenger.foundation.a.b paramb)
  {
    this.oqv = paramb;
  }

  public void setIDataTransferFactoryDelegate(com.tencent.mm.model.aj paramaj)
  {
    this.oqu = paramaj;
  }

  public String toString()
  {
    return "plugin-messenger-foundation";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation
 * JD-Core Version:    0.6.2
 */