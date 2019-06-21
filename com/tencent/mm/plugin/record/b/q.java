package com.tencent.mm.plugin.record.b;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.d.a;
import com.tencent.mm.at.o;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class q
  implements com.tencent.mm.ai.f, d, com.tencent.mm.plugin.record.a.h
{
  SparseArray<q.e> pJA;
  LinkedList<com.tencent.mm.plugin.record.a.j> pJB;
  private int pJR;
  boolean pJx;

  public q()
  {
    AppMethodBeat.i(135742);
    this.pJx = false;
    this.pJA = new SparseArray();
    this.pJB = new LinkedList();
    this.pJR = 7;
    com.tencent.mm.kernel.g.RO().eJo.a(632, this);
    ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().a(this);
    this.pJR = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIx, 7);
    AppMethodBeat.o(135742);
  }

  public final void a(int paramInt, i parami)
  {
    AppMethodBeat.i(135748);
    if (1 != paramInt)
    {
      ab.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care type %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(135748);
    }
    while (true)
    {
      return;
      if (parami == null)
      {
        ab.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo is null");
        AppMethodBeat.o(135748);
      }
      else if (2 != parami.field_type)
      {
        ab.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but cdninfo type is not upload , mediaid:%s, recordLocalId:%d, status:%d", new Object[] { parami.field_mediaId, Integer.valueOf(parami.field_recordLocalId), Integer.valueOf(parami.field_status) });
        AppMethodBeat.o(135748);
      }
      else
      {
        if ((parami.field_status != 0) && (1 != parami.field_status) && (-1 != parami.field_status))
          break;
        ab.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but not care status");
        AppMethodBeat.o(135748);
      }
    }
    Object localObject1 = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().BE(parami.field_recordLocalId);
    Object localObject2 = ((List)localObject1).iterator();
    i locali;
    while (((Iterator)localObject2).hasNext())
    {
      locali = (i)((Iterator)localObject2).next();
      if ((locali.field_status == 0) || (1 == locali.field_status) || (-1 == locali.field_status))
        ab.w("MicroMsg.RecordMsgSendService", "on cdn storage changed, but %s not finish", new Object[] { locali.field_mediaId });
    }
    for (paramInt = 0; ; paramInt = 1)
    {
      ab.i("MicroMsg.RecordMsgSendService", "on cdn storage changed cdnInfoList.size:%d,", new Object[] { Integer.valueOf(((List)localObject1).size()) });
      if (paramInt == 0)
      {
        AppMethodBeat.o(135748);
        break;
      }
      localObject2 = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().BG(parami.field_recordLocalId);
      paramInt = parami.field_recordLocalId;
      boolean bool;
      LinkedList localLinkedList;
      label579: if (localObject2 != null)
      {
        bool = true;
        ab.i("MicroMsg.RecordMsgSendService", "finish get record info, id %d result %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
        if (localObject2 == null)
          break label716;
        localLinkedList = ((com.tencent.mm.plugin.record.a.j)localObject2).field_dataProto.wiv;
        label364: parami = ((List)localObject1).iterator();
        break label579;
      }
      while (true)
      {
        if (!parami.hasNext())
          break label709;
        locali = (i)parami.next();
        ab.v("MicroMsg.RecordMsgSendService", "check dataid[%s] isThumb[%B]", new Object[] { locali.field_dataId, Boolean.valueOf(locali.field_isThumb) });
        aar localaar;
        if (locali.field_isThumb)
        {
          localIterator = localLinkedList.iterator();
          if (!localIterator.hasNext())
            continue;
          localaar = (aar)localIterator.next();
          if (!locali.field_dataId.equals(n.LA(localaar.mnd)))
            break label364;
          ab.d("MicroMsg.RecordMsgSendService", "match thumb, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]", new Object[] { localaar.wfV, locali.field_cdnKey, localaar.fgE, locali.field_cdnUrl, Long.valueOf(localaar.wgF), Integer.valueOf(locali.field_totalLen) });
          localaar.akK(locali.field_cdnKey);
          localaar.akJ(locali.field_cdnUrl);
          continue;
          bool = false;
          break;
        }
        Iterator localIterator = localLinkedList.iterator();
        if (localIterator.hasNext())
        {
          localaar = (aar)localIterator.next();
          if (!locali.field_dataId.equals(localaar.mnd))
            break label364;
          ab.d("MicroMsg.RecordMsgSendService", "match data, old key[%s] new key[%s], old url[%s] new url[%s], old size[%d] new size[%d]", new Object[] { localaar.wgb, locali.field_cdnKey, localaar.wfZ, locali.field_cdnUrl, Long.valueOf(localaar.wgu), Integer.valueOf(locali.field_totalLen) });
          localaar.akM(locali.field_cdnKey);
          localaar.akL(locali.field_cdnUrl);
        }
      }
      label709: a((com.tencent.mm.plugin.record.a.j)localObject2, true);
      label716: parami = ((List)localObject1).iterator();
      while (parami.hasNext())
      {
        localObject1 = (i)parami.next();
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().a((i)localObject1, new String[] { "localId" });
      }
      this.pJx = false;
      a(null);
      AppMethodBeat.o(135748);
      break;
    }
  }

  public final void a(com.tencent.mm.plugin.record.a.j paramj)
  {
    AppMethodBeat.i(135743);
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RS().aa(new q.1(this, paramj));
    AppMethodBeat.o(135743);
  }

  final void a(com.tencent.mm.plugin.record.a.j paramj, boolean paramBoolean)
  {
    AppMethodBeat.i(135749);
    bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramj.field_msgId);
    ab.i("MicroMsg.RecordMsgSendService", "[record] update msg content, msg null ? %B, msgId %d recordInfoId %d, recordInfo.localId:%d, afterCdnUpload %s", new Object[] { Boolean.FALSE, Long.valueOf(localbi.field_msgId), Long.valueOf(paramj.field_msgId), Integer.valueOf(paramj.field_localId), Boolean.valueOf(paramBoolean) });
    if (localbi.field_msgId == paramj.field_msgId)
    {
      localbi.setContent(n.a(paramj.field_title, paramj.field_desc, paramj.field_dataProto, paramj.field_favFrom));
      localbi.setStatus(1);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramj.field_msgId, localbi);
    }
    com.tencent.mm.af.j localj = com.tencent.mm.plugin.s.a.bYK().ma(paramj.field_msgId);
    if (localj != null)
    {
      localj.field_xml = localbi.field_content;
      com.tencent.mm.plugin.s.a.bYK().c(localj, new String[] { "msgId" });
    }
    ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().BF(paramj.field_localId);
    this.pJA.remove(paramj.field_localId);
    if (localbi.field_createTime + this.pJR * 24 * 3600 * 1000 < cb.aaE())
    {
      ab.i("MicroMsg.RecordMsgSendService", "doSendContinue, out of wait time, " + localbi.field_createTime);
      localbi.setStatus(5);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramj.field_msgId, localbi);
      AppMethodBeat.o(135749);
    }
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.record.a.f)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.record.a.f.class)).jB(paramj.field_msgId);
      AppMethodBeat.o(135749);
    }
  }

  final void b(com.tencent.mm.plugin.record.a.j paramj)
  {
    AppMethodBeat.i(135744);
    if (!this.pJB.contains(paramj))
      this.pJB.add(paramj);
    AppMethodBeat.o(135744);
  }

  final void d(long paramLong, int paramInt, String paramString)
  {
    AppMethodBeat.i(135747);
    bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramLong);
    if (localbi.field_msgId == paramLong)
    {
      localbi.setContent(paramString);
      localbi.setStatus(1);
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(paramLong, localbi);
    }
    paramString = com.tencent.mm.plugin.s.a.bYK().ma(paramLong);
    if (paramString != null)
    {
      paramString.field_xml = localbi.field_content;
      com.tencent.mm.plugin.s.a.bYK().c(paramString, new String[] { "msgId" });
    }
    ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().BF(paramInt);
    this.pJA.remove(paramInt);
    ((com.tencent.mm.plugin.record.a.f)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.record.a.f.class)).jB(paramLong);
    ab.i("MicroMsg.RecordMsgSendService", "batch tran cdn ok, msgId[%d], recordLocalId[%d], begin send appmsg", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    AppMethodBeat.o(135747);
  }

  public final void finish()
  {
    AppMethodBeat.i(135745);
    this.pJB.clear();
    this.pJA.clear();
    this.pJx = false;
    AppMethodBeat.o(135745);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(135746);
    ab.i("MicroMsg.RecordMsgSendService", "on scene end, errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (paramm == null)
    {
      ab.w("MicroMsg.RecordMsgSendService", "on scene end, scene is null");
      AppMethodBeat.o(135746);
    }
    while (true)
    {
      return;
      switch (paramm.getType())
      {
      default:
        label80: this.pJx = false;
        a(null);
        AppMethodBeat.o(135746);
      case 632:
      }
    }
    ab.i("MicroMsg.RecordMsgSendService", "batch tran cdn callback, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = (f)paramm;
    int i = paramInt1;
    int j = paramInt2;
    aar localaar;
    if (paramInt1 == 3)
    {
      paramm = paramString.pJu.field_dataProto.wiv.iterator();
      do
      {
        if (!paramm.hasNext())
          break;
        localaar = (aar)paramm.next();
      }
      while ((bo.isNullOrNil(localaar.wfZ)) && (bo.isNullOrNil(localaar.fgE)));
    }
    for (int k = 1; ; k = 0)
    {
      i = paramInt1;
      j = paramInt2;
      if (k == 0)
      {
        i = 0;
        j = 0;
      }
      if ((i == 0) && (j == 0))
      {
        d(paramString.pJu.field_msgId, paramString.pJu.field_localId, paramString.pJt);
        break label80;
      }
      ab.w("MicroMsg.RecordMsgSendService", "batch tran cdn fail, msgId[%d], recordLocalId[%d]", new Object[] { Long.valueOf(paramString.pJu.field_msgId), Integer.valueOf(paramString.pJu.field_localId) });
      ab.w("MicroMsg.RecordMsgSendService", "try upload from local");
      paramm = paramString.pJu.field_dataProto.wiv.iterator();
      while (paramm.hasNext())
      {
        localaar = (aar)paramm.next();
        String str1;
        i locali;
        boolean bool;
        if (localaar.wgu > 0L)
        {
          str1 = n.h(localaar.mnd, paramString.pJu.field_msgId, false);
          if (((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(str1) == null)
          {
            locali = new i();
            locali.field_cdnKey = localaar.wgb;
            locali.field_cdnUrl = localaar.wfZ;
            locali.field_dataId = localaar.mnd;
            locali.field_mediaId = str1;
            locali.field_totalLen = ((int)localaar.wgu);
            locali.field_localId = locali.field_mediaId.hashCode();
            locali.field_path = n.c(localaar, paramString.pJu.field_msgId);
            locali.field_type = 2;
            locali.field_fileType = n.BH(localaar.dataType);
            locali.field_recordLocalId = paramString.pJu.field_localId;
            locali.field_toUser = paramString.pJu.field_toUser;
            locali.field_isThumb = false;
            bool = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(locali);
            ab.d("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(locali.field_localId), Boolean.valueOf(bool) });
          }
        }
        if (localaar.wgF > 0L)
        {
          String str2 = n.LA(localaar.mnd);
          str1 = n.h(str2, paramString.pJu.field_msgId, false);
          if (((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(str1) == null)
          {
            locali = new i();
            locali.field_cdnKey = localaar.wfV;
            locali.field_cdnUrl = localaar.fgE;
            locali.field_dataId = str2;
            locali.field_mediaId = str1;
            locali.field_totalLen = ((int)localaar.wgF);
            locali.field_localId = locali.field_mediaId.hashCode();
            locali.field_path = n.f(localaar, paramString.pJu.field_msgId);
            locali.field_type = 2;
            locali.field_fileType = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE;
            locali.field_recordLocalId = paramString.pJu.field_localId;
            locali.field_toUser = paramString.pJu.field_toUser;
            locali.field_isThumb = true;
            bool = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(locali);
            ab.d("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(locali.field_localId), Boolean.valueOf(bool) });
          }
        }
      }
      ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNService().run();
      AppMethodBeat.o(135746);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.q
 * JD-Core Version:    0.6.2
 */