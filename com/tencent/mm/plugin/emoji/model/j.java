package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.b.a;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.emoji.sync.EmojiSyncManager;
import com.tencent.mm.emoji.sync.EmojiSyncManager.a;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.emoji.e.i;
import com.tencent.mm.plugin.emoji.e.k.1;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager.ConnectivityReceiver;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.emotion.l;
import com.tencent.mm.storage.emotion.n;
import com.tencent.mm.storage.emotion.s;
import com.tencent.mm.storage.emotion.u;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class j
  implements com.tencent.mm.model.at
{
  private static HashMap<Integer, h.d> eaA;
  private d kVL;
  private aq kVM;
  private com.tencent.mm.plugin.emoji.e.h kVN;
  private k kVO;
  private g kVP;
  private e kVQ;
  private com.tencent.mm.plugin.emoji.sync.a<com.tencent.mm.plugin.emoji.sync.c> kVR;
  private volatile i kVS;
  private volatile com.tencent.mm.plugin.emoji.e.c kVT;
  private volatile com.tencent.mm.plugin.emoji.e.k kVU;
  private com.tencent.mm.at.a.a kVV;
  private c kVW;

  static
  {
    AppMethodBeat.i(53077);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("EMOJIINFO_TABLE".hashCode()), new j.1());
    eaA.put(Integer.valueOf("EMOJIGROUPINFO_TABLE".hashCode()), new j.8());
    eaA.put(Integer.valueOf("EMOJIINFODESC_TABLE".hashCode()), new j.9());
    eaA.put(Integer.valueOf("EMOTIONDETAIL_TABLE".hashCode()), new j.10());
    eaA.put(Integer.valueOf("GETEMOTIONLISTCACHE_TABLE".hashCode()), new j.11());
    eaA.put(Integer.valueOf("EmotionRewardINFO_TABLE".hashCode()), new j.12());
    eaA.put(Integer.valueOf("EmotionDesignerInfoStorage_TABLE".hashCode()), new j.13());
    eaA.put(Integer.valueOf("EmotionRewardTipStorage_TABLE".hashCode()), new j.14());
    eaA.put(Integer.valueOf("SmileyInfoStorage_TABLE".hashCode()), new j.15());
    eaA.put(Integer.valueOf("SmileyPanelConfigInfoStorage_TABLE".hashCode()), new j.2());
    eaA.put(Integer.valueOf("EmojiDescMapStorage".hashCode()), new j.3());
    eaA.put(Integer.valueOf("DELETE".hashCode()), new j.4());
    AppMethodBeat.o(53077);
  }

  public static com.tencent.mm.at.a.a bjW()
  {
    AppMethodBeat.i(53064);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVV == null)
    {
      localObject = new b.a(ah.getContext());
      ((b.a)localObject).fGV = new com.tencent.mm.plugin.emoji.d.a();
      ((b.a)localObject).fGT = new com.tencent.mm.view.d.a();
      localObject = ((b.a)localObject).ahx();
      bkg().kVV = new com.tencent.mm.at.a.a((com.tencent.mm.at.a.a.b)localObject);
    }
    Object localObject = bkg().kVV;
    AppMethodBeat.o(53064);
    return localObject;
  }

  private static j bkg()
  {
    AppMethodBeat.i(53063);
    j localj = (j)com.tencent.mm.model.q.Y(j.class);
    AppMethodBeat.o(53063);
    return localj;
  }

  public static d bkh()
  {
    AppMethodBeat.i(53065);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVL == null)
      bkg().kVL = new d();
    d locald = bkg().kVL;
    AppMethodBeat.o(53065);
    return locald;
  }

  public static com.tencent.mm.plugin.emoji.e.h bki()
  {
    AppMethodBeat.i(53067);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVN == null)
      bkg().kVN = new com.tencent.mm.plugin.emoji.e.h();
    com.tencent.mm.plugin.emoji.e.h localh = bkg().kVN;
    AppMethodBeat.o(53067);
    return localh;
  }

  public static com.tencent.mm.plugin.emoji.sync.a<com.tencent.mm.plugin.emoji.sync.c> bkj()
  {
    AppMethodBeat.i(53068);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVR == null)
      bkg().kVR = new com.tencent.mm.plugin.emoji.sync.a();
    com.tencent.mm.plugin.emoji.sync.a locala = bkg().kVR;
    AppMethodBeat.o(53068);
    return locala;
  }

  private static i bkk()
  {
    try
    {
      AppMethodBeat.i(53069);
      com.tencent.mm.kernel.g.RN().QU();
      if (bkg().kVS == null)
      {
        localObject1 = bkg();
        i locali = new com/tencent/mm/plugin/emoji/e/i;
        locali.<init>();
        ((j)localObject1).kVS = locali;
      }
      Object localObject1 = bkg().kVS;
      AppMethodBeat.o(53069);
      return localObject1;
    }
    finally
    {
    }
  }

  private static com.tencent.mm.plugin.emoji.e.c bkl()
  {
    AppMethodBeat.i(53070);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVT == null)
      bkg().kVT = new com.tencent.mm.plugin.emoji.e.c();
    com.tencent.mm.plugin.emoji.e.c localc = bkg().kVT;
    AppMethodBeat.o(53070);
    return localc;
  }

  public static com.tencent.mm.plugin.emoji.e.k bkm()
  {
    AppMethodBeat.i(53072);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVU == null)
      bkg().kVU = new com.tencent.mm.plugin.emoji.e.k();
    com.tencent.mm.plugin.emoji.e.k localk = bkg().kVU;
    AppMethodBeat.o(53072);
    return localk;
  }

  public static e bkn()
  {
    AppMethodBeat.i(53075);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVQ == null)
      bkg().kVQ = new e();
    e locale = bkg().kVQ;
    AppMethodBeat.o(53075);
    return locale;
  }

  public static c bko()
  {
    AppMethodBeat.i(53076);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVW == null)
      bkg().kVW = new c();
    c localc = bkg().kVW;
    AppMethodBeat.o(53076);
    return localc;
  }

  public static aq getEmojiDescMgr()
  {
    AppMethodBeat.i(53066);
    com.tencent.mm.kernel.g.RN().QU();
    if (bkg().kVM == null)
      bkg().kVM = new aq();
    aq localaq = bkg().kVM;
    AppMethodBeat.o(53066);
    return localaq;
  }

  public static com.tencent.mm.storage.at getEmojiStorageMgr()
  {
    AppMethodBeat.i(53071);
    com.tencent.mm.storage.at localat = com.tencent.mm.storage.at.dsZ();
    AppMethodBeat.o(53071);
    return localat;
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
    AppMethodBeat.i(53074);
    ab.i("MicroMsg.emoji.SubCoreEmoji", "[onAccountPostReset]");
    com.tencent.mm.pluginsdk.ui.chat.e.vom = new j.5(this);
    com.tencent.mm.pluginsdk.ui.chat.e.von = new j.6(this);
    Object localObject1 = com.tencent.mm.storage.at.dsZ();
    if ((com.tencent.mm.kernel.g.RP().eJN == null) || (!com.tencent.mm.kernel.g.RP().eJN.isOpen()))
      ab.w("MicroMsg.emoji.EmojiStorageMgr", "initStorage: db close %s", new Object[] { com.tencent.mm.kernel.g.RP().eJN });
    ((com.tencent.mm.storage.at)localObject1).xYn = new com.tencent.mm.storage.emotion.d(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYo = new com.tencent.mm.storage.emotion.a(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYp = new com.tencent.mm.storage.emotion.c(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYr = new com.tencent.mm.storage.emotion.j(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYs = new l(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYt = new com.tencent.mm.storage.emotion.h(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYq = new com.tencent.mm.storage.emotion.p(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYu = new n(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYv = new com.tencent.mm.storage.emotion.q(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYw = new s(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYx = new com.tencent.mm.storage.emotion.f(com.tencent.mm.kernel.g.RP().eJN);
    ((com.tencent.mm.storage.at)localObject1).xYy = new u();
    ((com.tencent.mm.storage.at)localObject1).xYz = com.tencent.mm.emoji.a.a.OB();
    ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).setEmojiMgr();
    localObject1 = bkk();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("emotionstore", ((i)localObject1).kTV, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("NewRecommendEmotion", ((i)localObject1).kTW, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("EmojiBackup", ((i)localObject1).kTX, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("EmotionBackup", ((i)localObject1).kTX, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().a("SelfieEmojiBackup", ((i)localObject1).kTX, true);
    localObject1 = bkl();
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTp);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTt);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTu);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTv);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTw);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTx);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTy);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTz);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTA);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTq);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTr);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTB);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTC);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.emoji.e.c)localObject1).kTs);
    localObject1 = com.tencent.mm.storage.at.dsZ();
    ((com.tencent.mm.storage.at)localObject1).xYn.c(((com.tencent.mm.storage.at)localObject1).xYF);
    ((com.tencent.mm.storage.at)localObject1).xYo.c(((com.tencent.mm.storage.at)localObject1).xYD);
    ((com.tencent.mm.storage.at)localObject1).xYp.c(((com.tencent.mm.storage.at)localObject1).xYE);
    com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.storage.at)localObject1).xYG);
    getEmojiDescMgr();
    localObject1 = bkm();
    Object localObject2 = com.tencent.mm.m.g.Nu().getValue("EmotionRewardTipsLimit");
    long l;
    if (!bo.isNullOrNil((String)localObject2))
    {
      ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "updateConfig dynamic config %s", new Object[] { localObject2 });
      localObject2 = ((String)localObject2).split(",");
      if ((localObject2 != null) && (localObject2.length == 3))
      {
        if (bo.getInt(localObject2[0], 0) != 0)
          break label1579;
        l = 863913600000L;
        ((com.tencent.mm.plugin.emoji.e.k)localObject1).kUD = l;
        ((com.tencent.mm.plugin.emoji.e.k)localObject1).kUE = (bo.getInt(localObject2[1], 20) - 1);
        ((com.tencent.mm.plugin.emoji.e.k)localObject1).emW = (bo.getInt(localObject2[2], 80) - 1);
      }
    }
    boolean bool1 = com.tencent.mm.emoji.a.e.OK();
    boolean bool2 = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJt, Boolean.TRUE)).booleanValue();
    boolean bool3;
    label788: int i;
    if ((bool1) && (bool2))
    {
      bool3 = true;
      ((com.tencent.mm.plugin.emoji.e.k)localObject1).kUC = bool3;
      ab.i("MicroMsg.emoji.EmojiRewardTipMgr", "init RewardTipMgr RewardTipEnable:%b isEnableRewardTip:%b isTipsEnable:%b", new Object[] { Boolean.valueOf(((com.tencent.mm.plugin.emoji.e.k)localObject1).kUC), Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      com.tencent.mm.kernel.g.RS().aa(new k.1((com.tencent.mm.plugin.emoji.e.k)localObject1));
      localObject1 = bkj().kXj;
      ab.d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg attach");
      com.tencent.mm.sdk.b.a.xxA.c(((BKGLoaderManager)localObject1).kXG);
      com.tencent.mm.sdk.b.a.xxA.c(((BKGLoaderManager)localObject1).kXH);
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("android.net.conn.CONNECTIVITY_CHANGE");
      ((BKGLoaderManager)localObject1).kXC = new BKGLoaderManager.ConnectivityReceiver((BKGLoaderManager)localObject1);
      ah.getContext().registerReceiver(((BKGLoaderManager)localObject1).kXC, (IntentFilter)localObject2);
      ab.i("MicroMsg.emoji.SubCoreEmoji", "[oneliang]initCore");
      localObject1 = com.tencent.mm.storage.at.dsZ();
      localObject2 = ah.getContext();
      if (localObject2 != null)
      {
        bool3 = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(274480, Boolean.TRUE)).booleanValue();
        ab.i("MicroMsg.emoji.EmojiStorageMgr", "[oneliang]initCore,need init emoji:%s", new Object[] { String.valueOf(bool3) });
        if (bool3)
        {
          ((com.tencent.mm.storage.at)localObject1).xYn.hi((Context)localObject2);
          ((com.tencent.mm.storage.at)localObject1).xYo.hi((Context)localObject2);
        }
        com.tencent.mm.kernel.g.RP().Ry().set(274480, Boolean.FALSE);
      }
      if (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJu, Integer.valueOf(0))).intValue() != com.tencent.mm.protocal.d.vxo)
      {
        l = System.currentTimeMillis();
        ((com.tencent.mm.storage.at)localObject1).xYo.duN();
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJu, Integer.valueOf(com.tencent.mm.protocal.d.vxo));
        ab.i("MicroMsg.emoji.EmojiStorageMgr", "recoverCustomEmojiGroup use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      }
      if (((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJv, Boolean.TRUE)).booleanValue())
      {
        l = System.currentTimeMillis();
        bool3 = ((com.tencent.mm.storage.at)localObject1).xYo.duO();
        localObject1 = com.tencent.mm.kernel.g.RP().Ry();
        localObject2 = ac.a.xJv;
        if (bool3)
          break label1602;
        bool3 = true;
        label1168: ((z)localObject1).set((ac.a)localObject2, Boolean.valueOf(bool3));
        ab.i("MicroMsg.emoji.EmojiStorageMgr", "updateEmojiGroupCount use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      }
      this.kVO = new k();
      this.kVP = new g();
      com.tencent.mm.ao.a.cM(paramBoolean);
      localObject1 = bko();
      com.tencent.mm.kernel.g.RO().eJo.a(697, (com.tencent.mm.ai.f)localObject1);
      paramBoolean = com.tencent.mm.cb.f.dqL().dqN();
      localObject2 = com.tencent.mm.cb.e.dqK();
      ab.i("MicroMsg.MergerSmileyManager", "checkNewSmiley ");
      localObject1 = ((PluginEmoji)com.tencent.mm.kernel.g.M(PluginEmoji.class)).getEmojiMgr().bjP();
      if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty()))
        break label1608;
      ((com.tencent.mm.cb.e)localObject2).aRs();
      i = 1;
      label1303: if ((paramBoolean) && (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJw, Integer.valueOf(0))).intValue() > 0))
      {
        b.c.dif().f(37, 1, -1, false);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJw, Integer.valueOf(0));
        localObject1 = new com.tencent.mm.pluginsdk.g.a.a.m(37);
        com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject1, 0);
        com.tencent.mm.plugin.report.service.h.pYm.a(165L, 10L, 1L, false);
      }
      if ((i != 0) && (((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xJx, Integer.valueOf(0))).intValue() > 0))
      {
        b.c.dif().f(37, 2, -1, false);
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xJx, Integer.valueOf(0));
        localObject1 = new com.tencent.mm.pluginsdk.g.a.a.m(37);
        com.tencent.mm.kernel.g.RO().eJo.a((com.tencent.mm.ai.m)localObject1, 0);
        com.tencent.mm.plugin.report.service.h.pYm.a(165L, 11L, 1L, false);
      }
      localObject1 = com.tencent.mm.ao.b.afY();
      ab.i("MicroMsg.FontResLogic", "init");
      ((com.tencent.mm.ao.b)localObject1).fAP.dnU();
      if (!((com.tencent.mm.ao.b)localObject1).agb())
        break label1619;
      com.tencent.mm.plugin.report.service.h.pYm.k(933L, 4L, 1L);
    }
    while (true)
    {
      localObject1 = EmojiSyncManager.ezA;
      EmojiSyncManager.a.Pg().init();
      localObject1 = EmojiSyncManager.ezA;
      EmojiSyncManager.a.Ph().init();
      localObject1 = com.tencent.mm.emoji.a.b.eyD;
      com.tencent.mm.emoji.a.b.OG();
      com.tencent.mm.sdk.g.d.xDG.execute(new j.7(this));
      AppMethodBeat.o(53074);
      return;
      label1579: l = bo.getInt(localObject2[0], 0) * 86400000L;
      break;
      bool3 = false;
      break label788;
      label1602: bool3 = false;
      break label1168;
      label1608: ((com.tencent.mm.cb.e)localObject2).aRs();
      i = 0;
      break label1303;
      label1619: com.tencent.mm.plugin.report.service.h.pYm.k(933L, 5L, 1L);
      b.c.dif();
      localObject2 = com.tencent.mm.pluginsdk.g.a.a.b.gM(57, 1);
      if (com.tencent.mm.vfs.e.ct((String)localObject2))
      {
        com.tencent.mm.plugin.report.service.h.pYm.k(933L, 6L, 1L);
        ab.i("MicroMsg.FontResLogic", "cache file exist %s", new Object[] { localObject2 });
        ((com.tencent.mm.ao.b)localObject1).e((String)localObject2, 57, 1, 1);
      }
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(53073);
    ab.i("MicroMsg.emoji.SubCoreEmoji", "onAccountRelease: ");
    Object localObject = bkk();
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("emotionstore", ((i)localObject).kTV, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("NewRecommendEmotion", ((i)localObject).kTW, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("EmojiBackup", ((i)localObject).kTX, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("EmotionBackup", ((i)localObject).kTX, true);
    ((com.tencent.mm.plugin.messenger.foundation.a.p)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.messenger.foundation.a.p.class)).getSysCmdMsgExtension().b("SelfieEmojiBackup", ((i)localObject).kTX, true);
    localObject = bkl();
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTp);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTt);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTu);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTv);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTw);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTx);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTy);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTz);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTA);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTq);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTr);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTB);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTC);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.plugin.emoji.e.c)localObject).kTs);
    localObject = com.tencent.mm.storage.at.dsZ();
    ((com.tencent.mm.storage.at)localObject).xYn.d(((com.tencent.mm.storage.at)localObject).xYF);
    ((com.tencent.mm.storage.at)localObject).xYo.d(((com.tencent.mm.storage.at)localObject).xYD);
    ((com.tencent.mm.storage.at)localObject).xYp.d(((com.tencent.mm.storage.at)localObject).xYE);
    com.tencent.mm.sdk.b.a.xxA.d(((com.tencent.mm.storage.at)localObject).xYG);
    localObject = ((com.tencent.mm.storage.at)localObject).xYz;
    if (((com.tencent.mm.emoji.a.a)localObject).eyA != null)
      ((com.tencent.mm.emoji.a.a)localObject).eyA.clear();
    if (((com.tencent.mm.emoji.a.a)localObject).eyB != null)
      ((com.tencent.mm.emoji.a.a)localObject).eyB.clear();
    getEmojiDescMgr().clear();
    ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).removeEmojiMgr();
    localObject = bkh();
    com.tencent.mm.kernel.g.RO().eJo.b(175, (com.tencent.mm.ai.f)localObject);
    ((d)localObject).kVh.clear();
    ((d)localObject).kVf.clear();
    ((d)localObject).kVk.clear();
    localObject = bkm();
    ((com.tencent.mm.plugin.emoji.e.k)localObject).kUF = null;
    if (((com.tencent.mm.plugin.emoji.e.k)localObject).kUG != null)
      ((com.tencent.mm.plugin.emoji.e.k)localObject).kUG.clear();
    localObject = bkj().kXj;
    ab.d("MicroMsg.BKGLoader.BKGLoaderManager", "bkg detach");
    ((BKGLoaderManager)localObject).bkF();
    com.tencent.mm.sdk.b.a.xxA.d(((BKGLoaderManager)localObject).kXG);
    com.tencent.mm.sdk.b.a.xxA.d(((BKGLoaderManager)localObject).kXH);
    if (((BKGLoaderManager)localObject).kXC != null)
    {
      ah.getContext().unregisterReceiver(((BKGLoaderManager)localObject).kXC);
      ((BKGLoaderManager)localObject).kXC = null;
    }
    com.tencent.mm.plugin.emoji.e.f.bjK().isRunning = false;
    if (this.kVO != null)
    {
      localObject = this.kVO;
      com.tencent.mm.sdk.b.a.xxA.d(((k)localObject).kWb);
      com.tencent.mm.sdk.b.a.xxA.d(((k)localObject).kWc);
    }
    if (this.kVP != null)
    {
      localObject = this.kVP;
      ((g)localObject).kVv.clear();
      bkh().kVj = null;
      ((g)localObject).kVw.dead();
    }
    if (this.kVV != null)
      this.kVV.detach();
    localObject = bko();
    com.tencent.mm.kernel.g.RO().eJo.b(697, (com.tencent.mm.ai.f)localObject);
    com.tencent.mm.ao.b.afY().fAP.dead();
    localObject = EmojiSyncManager.ezA;
    EmojiSyncManager.a.Pg().destroy();
    localObject = EmojiSyncManager.ezA;
    EmojiSyncManager.a.Ph().destroy();
    AppMethodBeat.o(53073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.j
 * JD-Core Version:    0.6.2
 */