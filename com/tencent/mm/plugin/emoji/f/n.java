package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.cd.h;
import com.tencent.mm.g.a.ax;
import com.tencent.mm.g.a.ax.b;
import com.tencent.mm.g.a.cw;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.protocal.protobuf.EmotionSummary;
import com.tencent.mm.protocal.protobuf.GetEmotionListRequest;
import com.tencent.mm.protocal.protobuf.GetEmotionListResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.p;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class n extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private final int gOW;
  public byte[] kWS;
  public int kWU;
  private boolean kWV;
  private ArrayList<EmotionSummary> kWW;
  public final int mType;

  public n(int paramInt1, int paramInt2)
  {
    this(paramInt1, null, paramInt2);
  }

  public n(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    this(paramInt1, paramArrayOfByte, paramInt2, false);
  }

  public n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(53134);
    this.kWV = false;
    this.kWW = new ArrayList();
    this.kWS = null;
    b.a locala = new b.a();
    locala.fsJ = new GetEmotionListRequest();
    locala.fsK = new GetEmotionListResponse();
    locala.uri = "/cgi-bin/micromsg-bin/getemotionlist";
    locala.fsI = 411;
    locala.fsL = 210;
    locala.fsM = 1000000210;
    this.ehh = locala.acD();
    this.kWS = paramArrayOfByte;
    this.mType = paramInt1;
    this.gOW = paramInt2;
    this.kWV = paramBoolean;
    AppMethodBeat.o(53134);
  }

  public static com.tencent.mm.plugin.emoji.model.f a(GetEmotionListResponse paramGetEmotionListResponse)
  {
    AppMethodBeat.i(53137);
    ab.d("MicroMsg.emoji.NetSceneGetEmotionList", "getEmotionListModel");
    if (paramGetEmotionListResponse == null)
    {
      paramGetEmotionListResponse = null;
      AppMethodBeat.o(53137);
    }
    while (true)
    {
      return paramGetEmotionListResponse;
      com.tencent.mm.plugin.emoji.model.f localf = new com.tencent.mm.plugin.emoji.model.f();
      if (paramGetEmotionListResponse != null)
      {
        localf.kVp = paramGetEmotionListResponse.EmotionCount;
        ArrayList localArrayList = new ArrayList();
        if ((paramGetEmotionListResponse.EmotionList != null) && (!paramGetEmotionListResponse.EmotionList.isEmpty()))
        {
          localObject = paramGetEmotionListResponse.EmotionList.toArray();
          if ((localObject != null) && (localObject.length > 0))
          {
            int i = localObject.length;
            for (int j = 0; j < i; j++)
            {
              EmotionSummary localEmotionSummary = localObject[j];
              if ((localEmotionSummary != null) && ((localEmotionSummary instanceof EmotionSummary)))
              {
                localEmotionSummary = (EmotionSummary)localEmotionSummary;
                if ((localEmotionSummary != null) && (!bo.isNullOrNil(localEmotionSummary.ProductID)))
                  localArrayList.add(new com.tencent.mm.plugin.emoji.a.a.f(localEmotionSummary));
              }
            }
          }
        }
        localf.kVq = localArrayList;
        localf.kVr = paramGetEmotionListResponse.Banner;
        localf.kVs = paramGetEmotionListResponse.NewBannerList;
        Object localObject = paramGetEmotionListResponse.CellSetList;
        if (localf.kVu == null)
        {
          localf.kVu = new LinkedList();
          localf.kVu.addAll((Collection)localObject);
        }
        localf.kVt = paramGetEmotionListResponse.BannerSetList;
      }
      AppMethodBeat.o(53137);
      paramGetEmotionListResponse = localf;
    }
  }

  private void bkC()
  {
    AppMethodBeat.i(53138);
    GetEmotionListResponse localGetEmotionListResponse = bkB();
    if ((localGetEmotionListResponse != null) && (localGetEmotionListResponse.EmotionList != null) && (localGetEmotionListResponse.EmotionList.size() > 0))
    {
      this.kWW.addAll(localGetEmotionListResponse.EmotionList);
      AppMethodBeat.o(53138);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.emoji.NetSceneGetEmotionList", "addSummaryList faild. response is null or emotion list is empty.");
      AppMethodBeat.o(53138);
    }
  }

  private void y(ArrayList<EmotionSummary> paramArrayList)
  {
    AppMethodBeat.i(53139);
    com.tencent.mm.storage.emotion.a locala = j.getEmojiStorageMgr().xYo;
    if (locala == null)
    {
      ab.w("MicroMsg.emoji.NetSceneGetEmotionList", "preparedDownloadStoreEmojiList failed. get emoji group info storage failed.");
      AppMethodBeat.o(53139);
      return;
    }
    long l1 = System.currentTimeMillis();
    Object localObject1;
    long l2;
    if ((locala.bSd instanceof h))
    {
      localObject1 = (h)locala.bSd;
      l2 = ((h)localObject1).iV(Thread.currentThread().getId());
      ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "surround preparedDownloadCustomEmojiList in a transaction, ticket = %d", new Object[] { Long.valueOf(l2) });
    }
    while (true)
    {
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
        if ((paramArrayList == null) || (paramArrayList.size() <= 0))
        {
          ab.e("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary empty summary.");
          if (localObject1 != null)
          {
            ((h)localObject1).mB(l2);
            ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "end updateList transaction");
          }
          ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "[cpan] preparedDownloadCustomEmojiList use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - Long.valueOf(l1).longValue()) });
          locala.b("event_update_group", 0, bo.dpG().toString());
          if (!this.kWV)
            break label1344;
          if ((paramArrayList == null) || (paramArrayList.size() <= 0))
            break label1506;
          ab.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d force", new Object[] { Integer.valueOf(paramArrayList.size()) });
          localObject2 = new ArrayList();
          localObject1 = paramArrayList.iterator();
        }
      while (true)
      {
        if (!((Iterator)localObject1).hasNext())
          break label1307;
        paramArrayList = (EmotionSummary)((Iterator)localObject1).next();
        if ((paramArrayList != null) && (!bo.isNullOrNil(paramArrayList.ProductID)))
        {
          if (paramArrayList.ProductID.equals(String.valueOf(EmojiGroupInfo.yac)))
          {
            ((ArrayList)localObject2).add(new com.tencent.mm.plugin.emoji.sync.a.c("com.tencent.xin.emoticon.tusiji"));
            continue;
            HashMap localHashMap = locala.duA();
            ArrayList localArrayList1 = new ArrayList();
            ArrayList localArrayList2 = new ArrayList();
            int i = paramArrayList.size();
            ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "updateEmojiGroupByEmotionSummary size:%d", new Object[] { Integer.valueOf(i) });
            int j = 0;
            Object localObject3;
            while (j < i)
            {
              EmotionSummary localEmotionSummary = (EmotionSummary)paramArrayList.get(j);
              if ((localEmotionSummary == null) || (bo.isNullOrNil(localEmotionSummary.ProductID)))
              {
                ab.w("MicroMsg.emoji.EmojiGroupInfoStorage", "summary is null or product id is null.");
                j++;
              }
              else
              {
                ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "summary productID:%s", new Object[] { localEmotionSummary.ProductID });
                localArrayList1.add(localEmotionSummary.ProductID);
                if (localHashMap.containsKey(localEmotionSummary.ProductID))
                {
                  localObject3 = (EmojiGroupInfo)localHashMap.get(localEmotionSummary.ProductID);
                  localObject2 = localObject3;
                  if (localObject3 == null)
                    localObject2 = new EmojiGroupInfo();
                  ((EmojiGroupInfo)localObject2).field_productID = localEmotionSummary.ProductID;
                  label501: if (!localEmotionSummary.ProductID.equals("com.tencent.xin.emoticon.tusiji"))
                    break label939;
                  ((EmojiGroupInfo)localObject2).field_flag = 0;
                  ((EmojiGroupInfo)localObject2).field_packName = "emoji_custom_all";
                  ((EmojiGroupInfo)localObject2).field_type = EmojiGroupInfo.TYPE_SYSTEM;
                  label537: ((EmojiGroupInfo)localObject2).field_packIconUrl = localEmotionSummary.IconUrl;
                  ((EmojiGroupInfo)localObject2).field_packGrayIconUrl = localEmotionSummary.PanelUrl;
                  ((EmojiGroupInfo)localObject2).field_packCoverUrl = localEmotionSummary.CoverUrl;
                  ((EmojiGroupInfo)localObject2).field_packDesc = localEmotionSummary.PackDesc;
                  ((EmojiGroupInfo)localObject2).field_packAuthInfo = localEmotionSummary.PackAuthInfo;
                  ((EmojiGroupInfo)localObject2).field_packPrice = localEmotionSummary.PackPrice;
                  ((EmojiGroupInfo)localObject2).field_packType = localEmotionSummary.PackType;
                  ((EmojiGroupInfo)localObject2).field_packFlag = localEmotionSummary.PackFlag;
                  ((EmojiGroupInfo)localObject2).field_packExpire = localEmotionSummary.PackExpire;
                  ((EmojiGroupInfo)localObject2).field_packTimeStamp = localEmotionSummary.Timestamp;
                  ((EmojiGroupInfo)localObject2).field_sort = 1;
                  ((EmojiGroupInfo)localObject2).field_idx = j;
                  if (((EmojiGroupInfo)localObject2).field_sync == 0)
                    if ((((EmojiGroupInfo)localObject2).field_status != 7) || (((EmojiGroupInfo)localObject2).field_packStatus != 1))
                      break label960;
                }
                label939: label960: for (((EmojiGroupInfo)localObject2).field_sync = 2; ; ((EmojiGroupInfo)localObject2).field_sync = 1)
                {
                  if (((EmojiGroupInfo)localObject2).field_sync == 2)
                    ((EmojiGroupInfo)localObject2).field_status = 7;
                  if ((((EmojiGroupInfo)localObject2).field_sync == 2) && (!localEmotionSummary.ProductID.equals("com.tencent.xin.emoticon.tusiji")))
                  {
                    localObject3 = new ax();
                    ((ax)localObject3).cua.type = 1;
                    ((ax)localObject3).cua.cud = localEmotionSummary.ProductID;
                    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
                    if (!((ax)localObject3).cub.csN)
                    {
                      ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "decode failed re download product:%s.", new Object[] { localEmotionSummary.ProductID });
                      ((EmojiGroupInfo)localObject2).field_sync = 1;
                    }
                  }
                  ab.d("MicroMsg.emoji.EmojiGroupInfoStorage", "jacks updateEmojiGroupByEmotionSummary: prodcutId: %s, lasttime: %d, sort: %d", new Object[] { ((EmojiGroupInfo)localObject2).field_productID, Long.valueOf(((EmojiGroupInfo)localObject2).field_lastUseTime), Integer.valueOf(((EmojiGroupInfo)localObject2).field_sort) });
                  locala.a((com.tencent.mm.sdk.e.c)localObject2);
                  break;
                  if (localEmotionSummary.ProductID.equals("com.tencent.xin.emoticon.tusiji"))
                  {
                    localObject3 = (EmojiGroupInfo)localHashMap.get(String.valueOf(EmojiGroupInfo.yac));
                    localObject2 = localObject3;
                    if (localObject3 == null)
                      localObject2 = new EmojiGroupInfo();
                    ((EmojiGroupInfo)localObject2).field_productID = String.valueOf(EmojiGroupInfo.yac);
                    break label501;
                  }
                  localObject2 = new EmojiGroupInfo();
                  ((EmojiGroupInfo)localObject2).field_productID = localEmotionSummary.ProductID;
                  break label501;
                  ((EmojiGroupInfo)localObject2).field_packName = localEmotionSummary.PackName;
                  ((EmojiGroupInfo)localObject2).field_type = EmojiGroupInfo.xZZ;
                  break label537;
                }
              }
            }
            localObject2 = localHashMap.values().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (EmojiGroupInfo)((Iterator)localObject2).next();
              if ((localObject3 != null) && (!bo.isNullOrNil(((EmojiGroupInfo)localObject3).field_productID)) && (!((EmojiGroupInfo)localObject3).field_productID.equals(String.valueOf(EmojiGroupInfo.yad))))
                if (((EmojiGroupInfo)localObject3).field_productID.equals(String.valueOf(EmojiGroupInfo.yac)))
                {
                  if (!localArrayList1.contains("com.tencent.xin.emoticon.tusiji"))
                  {
                    ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", new Object[] { "com.tencent.xin.emoticon.tusiji" });
                    localArrayList2.add("com.tencent.xin.emoticon.tusiji");
                  }
                }
                else if (!localArrayList1.contains(((EmojiGroupInfo)localObject3).field_productID))
                {
                  ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "need to delete product id:%s", new Object[] { ((EmojiGroupInfo)localObject3).field_productID });
                  localArrayList2.add(((EmojiGroupInfo)localObject3).field_productID);
                }
            }
            if (localArrayList2.size() > 0)
            {
              localObject2 = localArrayList2.iterator();
              while (((Iterator)localObject2).hasNext())
                locala.aqd((String)((Iterator)localObject2).next());
            }
            locala.b("event_update_group", 0, bo.dpG().toString());
            break;
            localObject2 = locala.duB().iterator();
            while (((Iterator)localObject2).hasNext())
            {
              localObject3 = (EmojiGroupInfo)((Iterator)localObject2).next();
              if (((EmojiGroupInfo)localObject3).field_sync > 0)
              {
                ab.i("MicroMsg.emoji.EmojiGroupInfoStorage", "delete pid:%s", new Object[] { ((EmojiGroupInfo)localObject3).field_productID });
                locala.aqd(((EmojiGroupInfo)localObject3).field_productID);
              }
            }
            locala.aqd("com.tencent.xin.emoticon.tusiji");
            break;
          }
          ((ArrayList)localObject2).add(new com.tencent.mm.plugin.emoji.sync.a.b(paramArrayList.ProductID, (byte)0));
        }
      }
      label1307: j.bkj().z((ArrayList)localObject2);
      if (!j.bkj().kXj.kXr)
        j.bkj().kXj.bkG();
      AppMethodBeat.o(53139);
      break;
      label1344: Object localObject2 = (ArrayList)locala.duK();
      if (((ArrayList)localObject2).size() > 0)
      {
        ab.i("MicroMsg.emoji.NetSceneGetEmotionList", "try to sync store emoji list:size:%d", new Object[] { Integer.valueOf(((ArrayList)localObject2).size()) });
        paramArrayList = new ArrayList();
        localObject1 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          if (!bo.isNullOrNil((String)localObject2))
            if (((String)localObject2).equals(String.valueOf(EmojiGroupInfo.yac)))
              paramArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.c("com.tencent.xin.emoticon.tusiji"));
            else
              paramArrayList.add(new com.tencent.mm.plugin.emoji.sync.a.b((String)localObject2));
        }
        j.bkj().z(paramArrayList);
        if (!j.bkj().kXj.kXr)
          j.bkj().kXj.bkG();
      }
      label1506: AppMethodBeat.o(53139);
      break;
      l2 = -1L;
      localObject1 = null;
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(53135);
    this.ehi = paramf;
    GetEmotionListRequest localGetEmotionListRequest = (GetEmotionListRequest)this.ehh.fsG.fsP;
    if (this.kWS != null)
    {
      localGetEmotionListRequest.ReqBuf = aa.ad(this.kWS);
      if (localGetEmotionListRequest.ReqBuf != null)
        break label128;
    }
    label128: for (paramf = "Buf is NULL"; ; paramf = localGetEmotionListRequest.ReqBuf.toString())
    {
      ab.d("MicroMsg.emoji.NetSceneGetEmotionList", paramf);
      localGetEmotionListRequest.ReqType = this.mType;
      localGetEmotionListRequest.Scene = this.gOW;
      if (this.mType == 7)
        localGetEmotionListRequest.Category = this.kWU;
      int i = a(parame, this.ehh, this);
      AppMethodBeat.o(53135);
      return i;
      localGetEmotionListRequest.ReqBuf = new SKBuiltinBuffer_t();
      break;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53136);
    ab.d("MicroMsg.emoji.NetSceneGetEmotionList", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    if (this.mType == 8)
    {
      if ((paramInt2 == 0) && (paramInt3 == 0))
        g.RP().Ry().set(ac.a.xJe, Long.valueOf(System.currentTimeMillis()));
    }
    else if (this.mType == 11)
    {
      if ((paramInt2 != 0) || (paramInt3 != 0))
        break label185;
      g.RP().Ry().set(ac.a.xJi, Long.valueOf(System.currentTimeMillis()));
    }
    while (true)
    {
      j.getEmojiStorageMgr().xYq.a(this.mType, bkB());
      if ((paramInt2 == 0) || (paramInt2 == 4))
        break label214;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53136);
      return;
      g.RP().Ry().set(ac.a.xJe, Long.valueOf(System.currentTimeMillis() - 86400000L + 3600000L));
      break;
      label185: g.RP().Ry().set(ac.a.xJi, Long.valueOf(System.currentTimeMillis() - 28800000L + 600000L));
    }
    label214: paramArrayOfByte = (GetEmotionListResponse)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (paramArrayOfByte.ReqBuf != null)
      this.kWS = aa.a(paramArrayOfByte.ReqBuf);
    if (this.mType == 8)
    {
      if (paramInt3 != 0)
        break label403;
      bkC();
      y(this.kWW);
      g.RP().Ry().set(ac.a.xJe, Long.valueOf(System.currentTimeMillis()));
    }
    while (true)
    {
      if ((this.mType == 1) || (this.mType == 5) || (this.mType == 9))
      {
        paramq = j.getEmojiStorageMgr();
        paramArrayOfByte = bkB().EmotionExptConfig;
        if (!bo.isEqual(paramq.xYI, paramArrayOfByte))
        {
          paramq.xYI = paramArrayOfByte;
          g.RP().Ry().set(ac.a.xVH, paramArrayOfByte);
          com.tencent.mm.sdk.b.a.xxA.m(new cw());
        }
      }
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53136);
      break;
      label403: if (paramInt3 == 2)
      {
        bkC();
        ((GetEmotionListRequest)((com.tencent.mm.ai.b)paramq).fsG.fsP).ReqBuf = ((GetEmotionListResponse)((com.tencent.mm.ai.b)paramq).fsH.fsP).ReqBuf;
        a(this.ftf, this.ehi);
      }
      else if (paramInt3 == 3)
      {
        if (this.kWW != null)
          this.kWW.clear();
        ((GetEmotionListRequest)((com.tencent.mm.ai.b)paramq).fsG.fsP).ReqBuf = new SKBuiltinBuffer_t();
        a(this.ftf, this.ehi);
      }
    }
  }

  public final int acn()
  {
    return 100;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final GetEmotionListResponse bkB()
  {
    if (this.ehh == null);
    for (GetEmotionListResponse localGetEmotionListResponse = null; ; localGetEmotionListResponse = (GetEmotionListResponse)this.ehh.fsH.fsP)
      return localGetEmotionListResponse;
  }

  public final int getType()
  {
    return 411;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.n
 * JD-Core Version:    0.6.2
 */