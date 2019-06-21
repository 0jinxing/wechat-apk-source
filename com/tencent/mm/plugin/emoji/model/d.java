package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.sq;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.emoji.e.k;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements com.tencent.mm.ai.f
{
  com.tencent.mm.at.a.c.c kVd;
  public HashMap<Long, String> kVf;
  private boolean kVg;
  List<d.b> kVh;
  private sq kVi;
  public d.a kVj;
  List kVk;

  public d()
  {
    AppMethodBeat.i(53034);
    this.kVf = new HashMap();
    this.kVg = false;
    this.kVh = new LinkedList();
    this.kVk = Collections.synchronizedList(new ArrayList());
    this.kVd = new d.3(this);
    com.tencent.mm.kernel.g.RO().eJo.a(175, this);
    AppMethodBeat.o(53034);
  }

  private long a(as paramas, EmojiInfo paramEmojiInfo, e.a parama)
  {
    AppMethodBeat.i(53043);
    ab.i("MicroMsg.emoji.EmojiService", "insertEmojiMsg: %s, %s msgSvrId: %s", new Object[] { paramas.cvZ, paramEmojiInfo.field_md5, Long.valueOf(paramas.cKK) });
    long l;
    if (paramas.cKK != 0L)
    {
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Q(paramas.talker, paramas.cKK);
      if (((cy)localObject).field_msgSvrId == paramas.cKK)
      {
        l = ((cy)localObject).field_msgId;
        AppMethodBeat.o(53043);
        return l;
      }
    }
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramas.talker);
    if ((localObject == null) || ((int)((com.tencent.mm.n.a)localObject).ewQ == 0))
    {
      localObject = new ad(paramas.talker);
      ((ad)localObject).setType(2);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().Z((ad)localObject);
    }
    bi localbi = new bi();
    localbi.setType(47);
    localbi.ju(paramas.talker);
    int i;
    label221: boolean bool;
    if (com.tencent.mm.model.r.mG(paramas.fWW))
    {
      i = 1;
      localbi.hO(i);
      localbi.jv(paramEmojiInfo.Aq());
      localbi.eI(paramas.cKK);
      localObject = paramas.fWW;
      if ((paramEmojiInfo.xy()) || (paramEmojiInfo.isGif()))
        break label552;
      bool = true;
      label269: localbi.setContent(ap.a((String)localObject, 0L, bool, paramEmojiInfo.Aq(), false, paramas.xYg));
      localbi.eJ(bf.q(localbi.field_talker, paramas.createTime));
      localbi.setStatus(3);
      if (!bo.isNullOrNil(paramas.dqJ))
        localbi.ix(paramas.dqJ);
      if (parama != null)
        break label558;
      i = paramas.dqI;
      if (i != 0)
      {
        localbi.hY(i);
        if ((localbi.field_msgId == 0L) && (localbi.field_isSend == 0) && ((i & 0x2) != 0))
          localbi.eJ(paramas.createTime);
      }
      if (paramas.gag != 0)
        localbi.eL(paramas.gag);
      ab.i("MicroMsg.emoji.EmojiService", "summerbadcr insertEmojiMsg addMsgInfo is null but flag[%d], msgSeq[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramas.gag) });
    }
    while (true)
    {
      if ((this.kVf != null) && (this.kVf.containsKey(Long.valueOf(localbi.field_msgSvrId))))
      {
        ab.i("MicroMsg.emoji.EmojiService", "this msg had been revoke.");
        localbi.setContent((String)this.kVf.get(Long.valueOf(localbi.field_msgSvrId)));
        localbi.setType(10000);
        this.kVf.remove(Long.valueOf(localbi.field_msgSvrId));
      }
      l = bf.l(localbi);
      if (!com.tencent.mm.model.r.mG(paramas.fWW))
        hG(l);
      AppMethodBeat.o(53043);
      break;
      i = 0;
      break label221;
      label552: bool = false;
      break label269;
      label558: bf.a(localbi, parama);
    }
  }

  private static EmojiInfo a(as paramas)
  {
    AppMethodBeat.i(53041);
    ab.i("MicroMsg.emoji.EmojiService", "createEmojiInfo: %s", new Object[] { paramas.cvZ });
    EmojiInfo localEmojiInfo = new EmojiInfo();
    as.a(paramas, localEmojiInfo);
    localEmojiInfo.field_temp = 1;
    localEmojiInfo.field_state = EmojiInfo.yav;
    localEmojiInfo.field_catalog = EmojiInfo.yaf;
    j.getEmojiStorageMgr().xYn.E(localEmojiInfo);
    AppMethodBeat.o(53041);
    return localEmojiInfo;
  }

  private void a(as paramas, EmojiInfo paramEmojiInfo, long paramLong)
  {
    AppMethodBeat.i(53040);
    if ((this.kVk != null) && (this.kVk.contains(paramas.cvZ)))
    {
      ab.i("MicroMsg.emoji.EmojiService", "emoji md5:%s is downloading.", new Object[] { paramas.cvZ });
      AppMethodBeat.o(53040);
      return;
    }
    this.kVk.add(paramas.cvZ);
    Object localObject = paramEmojiInfo.dve();
    if (!bo.isNullOrNil(paramas.fgu))
    {
      com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
      localg.field_mediaId = ("downemoj_" + com.tencent.mm.a.g.x(paramas.fgu.getBytes()).substring(0, 16) + "_" + paramas.cKK);
      localg.field_fullpath = ((String)localObject + "_openim");
      localg.field_fileType = 19;
      localg.field_authKey = paramEmojiInfo.field_tpauthkey;
      localg.egm = paramEmojiInfo.field_tpurl;
      localg.field_priority = com.tencent.mm.i.a.efC;
      localg.egl = new d.2(this, paramas, paramEmojiInfo, paramLong);
      if (!com.tencent.mm.al.f.afx().b(localg, -1))
        ab.e("MicroMsg.emoji.EmojiService", "recv openim emoj, add task failed");
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramEmojiInfo.field_thumbUrl))
        j.bjW().a(paramEmojiInfo.field_thumbUrl, com.tencent.mm.plugin.emoji.e.g.q(paramEmojiInfo.dve() + "_cover", new Object[0]), null);
      AppMethodBeat.o(53040);
      break;
      if ((com.tencent.mm.emoji.a.e.OQ()) && (com.tencent.mm.emoji.a.e.OR()) && (!bo.isNullOrNil(paramEmojiInfo.field_externUrl)) && (!bo.isNullOrNil(paramEmojiInfo.field_externMd5)))
      {
        j.bjW().a(paramas.xYi, com.tencent.mm.plugin.emoji.e.g.r((String)localObject + "_extern", new Object[] { paramas, paramEmojiInfo, Integer.valueOf(101), Long.valueOf(paramLong) }), this.kVd);
        com.tencent.mm.plugin.emoji.c.hF(10L);
      }
      else if ((!bo.isNullOrNil(paramas.cAp)) && (!bo.isNullOrNil(paramas.aeskey)))
      {
        j.bjW().a(paramas.cAp, com.tencent.mm.plugin.emoji.e.g.r((String)localObject + "_encrypt", new Object[] { paramas, paramEmojiInfo, Integer.valueOf(102), Long.valueOf(paramLong) }), this.kVd);
        com.tencent.mm.plugin.emoji.c.hF(6L);
      }
      else if (!bo.isNullOrNil(paramas.nuk))
      {
        j.bjW().a(paramas.nuk, com.tencent.mm.plugin.emoji.e.g.q((String)localObject, new Object[] { paramas, paramEmojiInfo, Integer.valueOf(100), Long.valueOf(paramLong) }), this.kVd);
        com.tencent.mm.plugin.emoji.c.hF(1L);
      }
      else
      {
        this.kVk.remove(paramas.cvZ);
        localObject = new LinkedList();
        ((LinkedList)localObject).add(paramas.cvZ);
        com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.e((LinkedList)localObject), 0);
        ab.i("MicroMsg.emoji.EmojiService", "emoji encrypt url and cdn url is null. md5:%s try to batch emoji download for get url.", new Object[] { paramas.cvZ });
        com.tencent.mm.plugin.emoji.c.hF(9L);
      }
    }
  }

  static void b(as paramas)
  {
    AppMethodBeat.i(53044);
    if (paramas == null)
      AppMethodBeat.o(53044);
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(new h.c(paramas.talker, "update", null));
      AppMethodBeat.o(53044);
    }
  }

  private static void hG(long paramLong)
  {
    AppMethodBeat.i(53035);
    bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramLong);
    ((aq)((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification()).a(localbi);
    AppMethodBeat.o(53035);
  }

  public final void JC(String paramString)
  {
    AppMethodBeat.i(53037);
    com.tencent.mm.kernel.g.RS().aa(new d.1(this, paramString));
    AppMethodBeat.o(53037);
  }

  public final void a(as paramas, e.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(53039);
    if (paramas == null)
    {
      ab.w("MicroMsg.emoji.EmojiService", "downloadEmoji msginfo is null.");
      AppMethodBeat.o(53039);
      return;
    }
    if ((parama != null) && (parama.eAB != null) && (parama.eAB.ptF == paramas.cKK))
    {
      paramas.dqI = bf.d(parama);
      paramas.gag = parama.eAB.vEI;
      paramas.createTime = parama.eAB.pcX;
    }
    EmojiInfo localEmojiInfo = j.getEmojiStorageMgr().xYn.aqi(paramas.cvZ);
    boolean bool;
    if (localEmojiInfo == null)
    {
      bool = true;
      label105: ab.i("MicroMsg.emoji.EmojiService", "downloadEmoji: db emoji null %s", new Object[] { Boolean.valueOf(bool) });
      if (localEmojiInfo == null)
        break label1047;
      ab.i("MicroMsg.emoji.EmojiService", "downloadEmoji: db emoji info not null %s msgInfomd5 %s svrId %s", new Object[] { localEmojiInfo.field_md5, paramas.cvZ, Long.valueOf(paramas.cKK) });
      if ((bo.isNullOrNil(paramas.cwg)) || (paramas.cwg.equals(localEmojiInfo.field_groupId)))
        break label1121;
      localEmojiInfo.field_groupId = paramas.cwg;
    }
    label1047: label1075: label1112: label1121: for (int i = 1; ; i = 0)
    {
      int j = i;
      if (!bo.isNullOrNil(paramas.xYh))
      {
        j = i;
        if (!paramas.xYh.equals(localEmojiInfo.field_designerID))
        {
          localEmojiInfo.field_designerID = paramas.xYh;
          j = 1;
        }
      }
      i = j;
      if (!bo.isNullOrNil(paramas.thumbUrl))
      {
        i = j;
        if (!paramas.thumbUrl.equals(localEmojiInfo.field_thumbUrl))
        {
          localEmojiInfo.field_thumbUrl = paramas.thumbUrl;
          i = 1;
        }
      }
      j = i;
      if (!bo.isNullOrNil(paramas.cAp))
      {
        j = i;
        if (!paramas.cAp.equals(localEmojiInfo.field_encrypturl))
        {
          localEmojiInfo.field_encrypturl = paramas.cAp;
          j = 1;
        }
      }
      i = j;
      if (!bo.isNullOrNil(paramas.aeskey))
      {
        i = j;
        if (!paramas.aeskey.equals(localEmojiInfo.field_aeskey))
        {
          localEmojiInfo.field_aeskey = paramas.aeskey;
          i = 1;
        }
      }
      j = i;
      if (!bo.isNullOrNil(paramas.nuk))
      {
        j = i;
        if (!paramas.nuk.equals(localEmojiInfo.field_cdnUrl))
        {
          localEmojiInfo.field_cdnUrl = paramas.nuk;
          j = 1;
        }
      }
      int k = j;
      if (!bo.isNullOrNil(paramas.fgu))
      {
        k = j;
        if (!paramas.fgu.equals(localEmojiInfo.field_tpurl))
        {
          localEmojiInfo.field_tpurl = paramas.fgu;
          k = 1;
        }
      }
      i = k;
      if (!bo.isNullOrNil(paramas.fgA))
      {
        i = k;
        if (!paramas.fgA.equals(localEmojiInfo.field_tpauthkey))
        {
          localEmojiInfo.field_tpauthkey = paramas.fgA;
          i = 1;
        }
      }
      j = i;
      if (paramas.width > 0)
      {
        j = i;
        if (paramas.width != localEmojiInfo.field_width)
        {
          localEmojiInfo.field_width = paramas.width;
          j = 1;
        }
      }
      i = j;
      if (paramas.height > 0)
      {
        i = j;
        if (paramas.height != localEmojiInfo.field_height)
        {
          localEmojiInfo.field_height = paramas.height;
          i = 1;
        }
      }
      j = i;
      if (!bo.isNullOrNil(paramas.xYi))
      {
        j = i;
        if (!paramas.xYi.equals(localEmojiInfo.field_externUrl))
        {
          localEmojiInfo.field_externUrl = paramas.xYi;
          j = 1;
        }
      }
      i = j;
      if (!bo.isNullOrNil(paramas.xYj))
      {
        i = j;
        if (!paramas.xYj.equals(localEmojiInfo.field_externMd5))
        {
          localEmojiInfo.field_externMd5 = paramas.xYj;
          i = 1;
        }
      }
      j = i;
      if (!bo.isNullOrNil(paramas.xYl))
      {
        j = i;
        if (!paramas.xYl.equalsIgnoreCase(localEmojiInfo.field_activityid))
        {
          localEmojiInfo.field_activityid = paramas.xYl;
          j = 1;
        }
      }
      i = j;
      if (localEmojiInfo.field_state == EmojiInfo.yat)
      {
        i = j;
        if (com.tencent.mm.vfs.e.asZ(localEmojiInfo.dve()) <= 0L)
        {
          ab.i("MicroMsg.emoji.EmojiService", "emoji %s complete but file not exist", new Object[] { localEmojiInfo.Aq() });
          localEmojiInfo.field_state = EmojiInfo.yav;
          i = 1;
        }
      }
      j = i;
      if (!bo.isNullOrNil(paramas.eyJ))
      {
        localEmojiInfo.field_attachedText = paramas.eyJ;
        j = 1;
      }
      if (!bo.isNullOrNil(paramas.lgY))
      {
        localEmojiInfo.field_lensId = paramas.lgY;
        j = 1;
      }
      if (!bo.isNullOrNil(paramas.xYm))
      {
        localEmojiInfo.field_attachTextColor = paramas.xYm;
        j = 1;
      }
      if ((localEmojiInfo.field_width <= 0) || (localEmojiInfo.field_height <= 0))
      {
        localEmojiInfo.field_width = paramas.width;
        localEmojiInfo.field_height = paramas.height;
        j = 1;
      }
      if (j != 0)
      {
        j.getEmojiStorageMgr().xYn.G(localEmojiInfo);
        ab.i("MicroMsg.emoji.EmojiService", "update designer info. designer:%s thumbUrl:%s", new Object[] { localEmojiInfo.field_designerID, localEmojiInfo.field_thumbUrl });
      }
      while (true)
      {
        long l = 0L;
        if (paramas.xYk)
        {
          localEmojiInfo.duP();
          l = a(paramas, localEmojiInfo, parama);
        }
        ab.i("MicroMsg.emoji.EmojiService", "start download emoji %s, fileExist %b, download %b", new Object[] { localEmojiInfo.Aq(), Boolean.valueOf(localEmojiInfo.duP()), Boolean.valueOf(paramBoolean) });
        if (localEmojiInfo.duP())
          break label1112;
        if (!paramBoolean)
          break label1075;
        a(paramas, localEmojiInfo, l);
        AppMethodBeat.o(53039);
        break;
        bool = false;
        break label105;
        ab.i("MicroMsg.emoji.EmojiService", "downloadEmoji: create emoji info %s", new Object[] { paramas.cvZ });
        localEmojiInfo = a(paramas);
      }
      ab.i("MicroMsg.emoji.EmojiService", "cdnurl and cncrypt url is null. autodownload %b", new Object[] { Boolean.valueOf(paramBoolean) });
      this.kVk.remove(paramas.cvZ);
      b(paramas);
      AppMethodBeat.o(53039);
      break;
    }
  }

  public final void a(String paramString, EmojiInfo paramEmojiInfo, bi parambi)
  {
    AppMethodBeat.i(53036);
    if ((bo.isNullOrNil(paramString)) || (paramEmojiInfo == null))
    {
      AppMethodBeat.o(53036);
      return;
    }
    if (com.tencent.mm.vfs.e.asZ(paramEmojiInfo.dve()) <= 0L)
    {
      paramEmojiInfo.field_state = EmojiInfo.yar;
      j.getEmojiStorageMgr().xYn.G(paramEmojiInfo);
    }
    long l1 = System.currentTimeMillis();
    boolean bool1 = false;
    label101: boolean bool2;
    label140: label172: long l2;
    if (com.tencent.mm.plugin.emoji.h.b.w(paramEmojiInfo))
    {
      bool1 = j.bkm().Js(paramEmojiInfo.field_groupId);
      ab.i("MicroMsg.emoji.EmojiService", "isNeedShowRewardTip:%b", new Object[] { Boolean.valueOf(bool1) });
      if (parambi != null)
        break label391;
      parambi = new bi();
      if ((paramEmojiInfo.field_type != EmojiInfo.yap) && (paramEmojiInfo.field_type != EmojiInfo.yaq))
        break label376;
      parambi.setType(1048625);
      parambi.ju(paramString);
      parambi.hO(1);
      String str = com.tencent.mm.model.r.Yz();
      if ((paramEmojiInfo.xy()) || (paramEmojiInfo.isGif()))
        break label385;
      bool2 = true;
      parambi.setContent(ap.a(str, l1, bool2, paramEmojiInfo.Aq(), bool1, ""));
      parambi.jv(paramEmojiInfo.Aq());
      parambi.eJ(bf.oC(parambi.field_talker));
      l2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z(parambi);
    }
    while (true)
    {
      ab.i("MicroMsg.emoji.EmojiService", "NetSceneUploadEmoji: msgId = %s, md5 %s, len %s", new Object[] { Long.valueOf(l2), paramEmojiInfo.Aq(), Integer.valueOf(paramEmojiInfo.field_size) });
      this.kVh.add(new d.b(this, l2, paramString, paramEmojiInfo, String.valueOf(l1)));
      if ((!this.kVg) || (this.kVh.size() == 1))
      {
        this.kVg = true;
        com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.r(String.valueOf(l1), paramString, paramEmojiInfo, l2), 0);
      }
      JC(paramEmojiInfo.field_groupId);
      AppMethodBeat.o(53036);
      break;
      j.bkm().bkc();
      break label101;
      label376: parambi.setType(47);
      break label140;
      label385: bool2 = false;
      break label172;
      label391: l2 = parambi.field_msgId;
      parambi = ap.aps(parambi.field_content);
      if (parambi.time == 0L)
      {
        AppMethodBeat.o(53036);
        break;
      }
      l1 = parambi.time;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53042);
    ab.i("MicroMsg.emoji.EmojiService", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramm instanceof com.tencent.mm.plugin.emoji.f.r))
    {
      if (this.kVh.size() <= 0)
      {
        this.kVg = false;
        AppMethodBeat.o(53042);
        return;
      }
      paramString = (d.b)this.kVh.remove(0);
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break label283;
      com.tencent.mm.plugin.report.e.pXa.a(111L, 35L, 1L, true);
    }
    label283: for (paramInt1 = 5; ; paramInt1 = 2)
    {
      paramm = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramString.cvx);
      paramm.setStatus(paramInt1);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramString.cvx, paramm);
      if (this.kVh.size() > 0)
      {
        paramString = (d.b)this.kVh.get(0);
        com.tencent.mm.kernel.g.RO().eJo.a(new com.tencent.mm.plugin.emoji.f.r(paramString.czD, paramString.toUserName, paramString.cuc, paramString.cvx), 0);
      }
      while (true)
      {
        if (this.kVi == null)
          this.kVi = new sq();
        this.kVi.cOO.cwg = paramString.cuc.field_groupId;
        com.tencent.mm.sdk.b.a.xxA.m(this.kVi);
        AppMethodBeat.o(53042);
        break;
        this.kVg = false;
      }
    }
  }

  public final boolean s(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53038);
    as localas = as.D(paramEmojiInfo);
    if (localas == null)
    {
      ab.i("MicroMsg.emoji.EmojiService", "prepareEmoji failed. emoji msg info is null.");
      AppMethodBeat.o(53038);
      return true;
    }
    String str;
    if (paramEmojiInfo == null)
    {
      str = "";
      label39: localas.talker = str;
      localas.xYk = false;
      a(localas, null, true);
      if (paramEmojiInfo != null)
        break label84;
    }
    label84: for (paramEmojiInfo = null; ; paramEmojiInfo = paramEmojiInfo.field_groupId)
    {
      JC(paramEmojiInfo);
      AppMethodBeat.o(53038);
      break;
      str = paramEmojiInfo.talker;
      break label39;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.d
 * JD-Core Version:    0.6.2
 */