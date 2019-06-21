package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.emoji.sync.EmojiSyncManager;
import com.tencent.mm.emoji.sync.EmojiSyncManager.a;
import com.tencent.mm.g.a.ny;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.hu;
import com.tencent.mm.protocal.protobuf.hv;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e extends m
  implements k
{
  public static int kWq = 0;
  public static int kWr = 1;
  public final com.tencent.mm.ai.b ehh;
  private f ehi;
  private int kWn;
  private ArrayList<String> kWp;
  private ArrayList<EmojiInfo> kWs;
  public int kWt;
  private ac.a kWu;
  private ac.a kWv;
  private LinkedList<String> kWw;
  private int mIndex;

  public e(int paramInt)
  {
    this(new LinkedList(), paramInt, kWq);
    AppMethodBeat.i(62337);
    AppMethodBeat.o(62337);
  }

  public e(LinkedList<String> paramLinkedList)
  {
    this(paramLinkedList, 0, kWr);
  }

  private e(LinkedList<String> paramLinkedList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62338);
    this.kWp = new ArrayList();
    this.kWs = new ArrayList();
    this.mIndex = 0;
    this.kWt = 0;
    this.kWw = new LinkedList();
    b.a locala = new b.a();
    locala.fsJ = new hu();
    locala.fsK = new hv();
    locala.uri = "/cgi-bin/micromsg-bin/mmbatchemojidownload";
    locala.fsI = 697;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.mIndex = 0;
    this.kWt = paramInt2;
    this.kWw = paramLinkedList;
    this.kWn = paramInt1;
    if (this.kWn == 1)
    {
      this.kWu = ac.a.xJl;
      this.kWv = ac.a.xJp;
      AppMethodBeat.o(62338);
    }
    while (true)
    {
      return;
      this.kWu = ac.a.xJk;
      this.kWv = ac.a.xJo;
      AppMethodBeat.o(62338);
    }
  }

  private void a(hv paramhv)
  {
    AppMethodBeat.i(62340);
    ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList mCustomType: %d", new Object[] { Integer.valueOf(this.kWn) });
    if (paramhv == null)
    {
      ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList response is null.");
      AppMethodBeat.o(62340);
    }
    while (true)
    {
      return;
      if ((paramhv.vKl == null) || (paramhv.vKl.size() <= 0))
      {
        ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addemojiInfoList EmojiList is null or size is empty.");
        AppMethodBeat.o(62340);
      }
      else
      {
        paramhv = paramhv.vKl.iterator();
        while (paramhv.hasNext())
        {
          xx localxx = (xx)paramhv.next();
          if (bo.isNullOrNil(localxx.Md5))
          {
            ab.w("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "addEmojiInfoList: empty md5 %s", new Object[] { localxx });
          }
          else
          {
            Object localObject = localxx.Md5.toLowerCase();
            this.kWp.add(localObject);
            localObject = new EmojiInfo();
            com.tencent.mm.plugin.emoji.h.b.a(localxx, (EmojiInfo)localObject);
            if (this.kWn == 1)
              ((EmojiInfo)localObject).field_groupId = "capture";
            while (true)
            {
              this.kWs.add(localObject);
              break;
              ((EmojiInfo)localObject).field_catalog = EmojiInfo.yal;
            }
          }
        }
        AppMethodBeat.o(62340);
      }
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(62341);
    this.ehi = paramf;
    paramf = (hu)this.ehh.fsG.fsP;
    paramf.vKj = this.mIndex;
    paramf.ReqType = this.kWt;
    paramf.vKk = this.kWw;
    paramf.vIK = this.kWn;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(62341);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(62339);
    ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.kWt == kWq)
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        h.pYm.a(164L, 1L, 1L, false);
        g.RP().Ry().set(this.kWv, Long.valueOf(System.currentTimeMillis() + 3600000L));
        AppMethodBeat.o(62339);
      }
    while (true)
    {
      return;
      paramArrayOfByte = (hv)this.ehh.fsH.fsP;
      paramq = (hu)this.ehh.fsG.fsP;
      if ((paramArrayOfByte.fJT == 0) && ((paramArrayOfByte.vII == null) || (paramArrayOfByte.vII.size() <= 0)))
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] donwload list is null");
        h.pYm.a(164L, 0L, 1L, false);
        AppMethodBeat.o(62339);
      }
      else
      {
        if (paramArrayOfByte.fJT == 1)
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          g.RP().Ry().set(this.kWv, Long.valueOf(System.currentTimeMillis() + 86400000L));
          g.RP().Ry().set(this.kWu, Boolean.FALSE);
          a(paramArrayOfByte);
          if (this.kWs == null);
          for (paramInt1 = 0; ; paramInt1 = this.kWs.size())
          {
            ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] preparedDownloadCustomEmojiList size:%s", new Object[] { Integer.valueOf(paramInt1) });
            paramString = this.kWp;
            if ((paramString != null) && (paramString.size() > 0))
              break label373;
            ab.w("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] perparedDownloadCustomEmojiList failed. list is null.");
            g.RP().Ry().set(ac.a.xJc, Boolean.FALSE);
            h.pYm.a(164L, 0L, 1L, false);
            AppMethodBeat.o(62339);
            break;
          }
          label373: if (paramString.size() < com.tencent.mm.emoji.a.e.OM())
            g.RP().Ry().set(ac.a.xJc, Boolean.FALSE);
          ((Boolean)g.RP().Ry().get(ac.a.xJf, Boolean.TRUE)).booleanValue();
          com.tencent.mm.storage.at.dsZ().xYn.m(this.kWn, this.kWs);
          g.RP().Ry().set(ac.a.xJf, Boolean.FALSE);
          paramArrayOfByte = com.tencent.mm.storage.at.dsZ().xYn;
          paramInt1 = this.kWn;
          ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] begin preparedDeleteCustomEmojiList");
          long l = System.currentTimeMillis();
          if ((paramString == null) || (paramString.size() <= 0))
          {
            ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. list is null");
            label507: paramString = (ArrayList)com.tencent.mm.storage.at.dsZ().xYn.MD(0);
            if (paramString.size() <= 0)
              break label836;
            ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "try to sync emoji downloadList:%d", new Object[] { Integer.valueOf(paramString.size()) });
            h.pYm.e(11595, new Object[] { Integer.valueOf(2), Integer.valueOf(this.kWn) });
            if (com.tencent.mm.sdk.platformtools.at.isWifi(ah.getContext()))
              h.pYm.e(11595, new Object[] { Integer.valueOf(3), Integer.valueOf(this.kWn) });
            label622: if (this.kWn != 1)
              break label863;
            com.tencent.mm.emoji.a.a.OB().cd(true);
            paramString = EmojiSyncManager.ezA;
            EmojiSyncManager.a.Ph().ch(false);
          }
          while (true)
          {
            paramString = com.tencent.mm.emoji.a.b.eyD;
            com.tencent.mm.emoji.a.b.OG();
            com.tencent.mm.sdk.b.a.xxA.m(new ny());
            break;
            Object localObject = paramArrayOfByte.MA(paramInt1);
            if (((List)localObject).size() <= 0)
            {
              ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] preparedDeleteCustomEmojiList failed. sync list is null");
              break label507;
            }
            paramq = new ArrayList();
            Iterator localIterator = ((List)localObject).iterator();
            while (localIterator.hasNext())
            {
              localObject = (String)localIterator.next();
              if (!paramString.contains(((String)localObject).toLowerCase()))
              {
                paramq.add(localObject);
                ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] delete:%s", new Object[] { localObject });
              }
            }
            paramArrayOfByte.u(paramq, paramInt1);
            ab.i("MicroMsg.emoji.EmojiInfoStorage", "[cpan] end preparedDeleteCustomEmojiList user time:%d succes. size:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(paramq.size()) });
            break label507;
            label836: g.RP().Ry().set(this.kWu, Boolean.FALSE);
            ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "no things need to download.");
            break label622;
            label863: com.tencent.mm.emoji.a.a.OB().cb(true);
            com.tencent.mm.emoji.a.a.OB().ca(true);
            paramString = EmojiSyncManager.ezA;
            EmojiSyncManager.a.Pg().ch(false);
          }
        }
        ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] do next scene. index:%d size:%d", new Object[] { Integer.valueOf(paramq.vKj), Integer.valueOf(paramArrayOfByte.vII.size()) });
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        paramq.vKj = paramArrayOfByte.vKj;
        this.mIndex = paramq.vKj;
        a(paramArrayOfByte);
        paramInt2 = a(this.ftf, this.ehi);
        if (paramInt1 < 0)
          ab.e("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "[cpan] doScene error.nextNetId:%d", new Object[] { Integer.valueOf(paramInt2) });
        AppMethodBeat.o(62339);
        continue;
        if ((paramInt2 == 0) && (paramInt3 == 0))
          break;
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(62339);
      }
    }
    paramq = (hv)this.ehh.fsH.fsP;
    if ((paramq.vKl == null) || (paramq.vKl.size() <= 0))
      ab.i("MicroMsg.emoji.NetSceneBatchEmojiDownLoad", "Change MD5 to URL failed.");
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(62339);
      break;
      com.tencent.mm.storage.at.dsZ().xYn.eL(paramq.vKl);
    }
  }

  public final int acn()
  {
    return 20;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final hv bku()
  {
    if (this.ehh == null);
    for (hv localhv = null; ; localhv = (hv)this.ehh.fsH.fsP)
      return localhv;
  }

  public final int getType()
  {
    return 697;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.e
 * JD-Core Version:    0.6.2
 */