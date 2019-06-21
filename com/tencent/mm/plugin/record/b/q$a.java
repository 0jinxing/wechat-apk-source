package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.record.a.b;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class q$a
  implements Runnable
{
  private j pJu;

  public q$a(q paramq, j paramj)
  {
    this.pJu = paramj;
  }

  public final void run()
  {
    AppMethodBeat.i(135724);
    int i = 0;
    int j = 0;
    ab.i("MicroMsg.RecordMsgSendService", "dojob ChatDataCopyRunnable, info id:%s", new Object[] { Long.valueOf(this.pJu.field_msgId) });
    int k;
    int m;
    aar localaar;
    Object localObject1;
    Object localObject2;
    boolean bool;
    if ((this.pJu != null) && (this.pJu.field_dataProto != null) && (this.pJu.field_dataProto.wiv != null))
    {
      Iterator localIterator = this.pJu.field_dataProto.wiv.iterator();
      k = 0;
      i = j;
      m = k;
      if (!localIterator.hasNext())
        break label1175;
      localaar = (aar)localIterator.next();
      if ((bo.isNullOrNil(localaar.wfZ)) && (!com.tencent.mm.vfs.e.ct(localaar.wgx)))
        break label1343;
      localObject1 = localaar.wgx;
      localObject2 = n.c(localaar, this.pJu.field_msgId);
      if (com.tencent.mm.vfs.e.y((String)localObject1, (String)localObject2) > 0L)
      {
        bool = true;
        label164: ab.d("MicroMsg.RecordMsgSendService", "summerrecord CdnDataUrl[%s] copy[%s] to [%s] result[%B]", new Object[] { localaar.wfZ, localObject1, localObject2, Boolean.valueOf(bool) });
        m = j;
        if (!bool)
          break label1337;
        if (bo.isNullOrNil(localaar.wgq))
        {
          ab.i("MicroMsg.RecordMsgSendService", "summerrecord not find full md5, try to calculate");
          localaar.akS(com.tencent.mm.vfs.e.atg((String)localObject2));
          j = 1;
        }
        m = j;
        if (!bo.isNullOrNil(localaar.wgs))
          break label1337;
        ab.i("MicroMsg.RecordMsgSendService", "summerrecord not find head 256 md5, try to calculate");
        localObject1 = com.tencent.mm.vfs.e.e((String)localObject2, 0, 256);
        if (localObject1 != null)
          break label988;
        localObject1 = null;
        label280: localaar.akT((String)localObject1);
        j = 1;
        label290: if (com.tencent.mm.vfs.e.asZ((String)localObject2) != 0L)
          localaar.mf(com.tencent.mm.vfs.e.asZ((String)localObject2));
        localObject1 = n.h(localaar.mnd, this.pJu.field_msgId, false);
        localObject2 = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH((String)localObject1);
        if (localObject2 != null)
          break label998;
        localObject2 = new i();
        ((i)localObject2).field_cdnKey = localaar.wgb;
        ((i)localObject2).field_cdnUrl = localaar.wfZ;
        ((i)localObject2).field_dataId = localaar.mnd;
        ((i)localObject2).field_mediaId = ((String)localObject1);
        ((i)localObject2).field_totalLen = ((int)localaar.wgu);
        ((i)localObject2).field_localId = ((i)localObject2).field_mediaId.hashCode();
        ((i)localObject2).field_path = n.c(localaar, this.pJu.field_msgId);
        ((i)localObject2).field_type = 2;
        ((i)localObject2).field_fileType = n.BH(localaar.dataType);
        ((i)localObject2).field_recordLocalId = this.pJu.field_localId;
        ((i)localObject2).field_toUser = this.pJu.field_toUser;
        ((i)localObject2).field_isThumb = false;
        bool = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b((i)localObject2);
        i = 1;
        ab.i("MicroMsg.RecordMsgSendService", "summerrecord insert localId[%d] result[%B] fileType[%d], mediaId[%s]", new Object[] { Integer.valueOf(((i)localObject2).field_localId), Boolean.valueOf(bool), Integer.valueOf(((i)localObject2).field_fileType), localObject1 });
        m = j;
      }
    }
    while (true)
    {
      label565: if (bo.isNullOrNil(localaar.fgE))
      {
        k = m;
        if (!com.tencent.mm.vfs.e.ct(localaar.wgz));
      }
      else
      {
        localObject1 = localaar.wgz;
        localObject2 = n.f(localaar, this.pJu.field_msgId);
        if (com.tencent.mm.vfs.e.y((String)localObject1, (String)localObject2) > 0L);
        i locali;
        for (bool = true; ; bool = false)
        {
          ab.d("MicroMsg.RecordMsgSendService", "copy thumb[%s] to [%s] result[%B]", new Object[] { localObject1, localObject2, Boolean.valueOf(bool) });
          localaar.mg(com.tencent.mm.vfs.e.asZ((String)localObject2));
          j = m;
          if (bool)
          {
            j = m;
            if (bo.isNullOrNil(localaar.wgB))
            {
              ab.i("MicroMsg.RecordMsgSendService", "not find ThumbMd5 md5, try to calculate");
              localaar.akX(com.tencent.mm.a.g.cz((String)localObject2));
              j = 1;
            }
            if (bo.isNullOrNil(localaar.wgD))
            {
              ab.i("MicroMsg.RecordMsgSendService", "not find Thumb Head 256 Md5, try to calculate");
              localaar.akY(com.tencent.mm.a.g.cA((String)localObject2));
              j = 1;
            }
          }
          localObject1 = n.LA(localaar.mnd);
          localObject2 = n.h((String)localObject1, this.pJu.field_msgId, false);
          locali = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH((String)localObject2);
          if (locali != null)
            break label1095;
          locali = new i();
          locali.field_cdnKey = localaar.wfV;
          locali.field_cdnUrl = localaar.fgE;
          locali.field_dataId = ((String)localObject1);
          locali.field_mediaId = ((String)localObject2);
          locali.field_totalLen = ((int)localaar.wgF);
          locali.field_localId = locali.field_mediaId.hashCode();
          locali.field_path = n.f(localaar, this.pJu.field_msgId);
          locali.field_type = 2;
          locali.field_fileType = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE;
          locali.field_recordLocalId = this.pJu.field_localId;
          locali.field_toUser = this.pJu.field_toUser;
          locali.field_isThumb = true;
          bool = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(locali);
          ab.i("MicroMsg.RecordMsgSendService", "insert localId[%d] result[%B]", new Object[] { Integer.valueOf(locali.field_localId), Boolean.valueOf(bool) });
          k = 1;
          break;
          bool = false;
          break label164;
          label988: localObject1 = com.tencent.mm.a.g.x((byte[])localObject1);
          break label280;
          label998: i = k;
          m = j;
          if (((i)localObject2).field_status == 2)
            break label565;
          i = k;
          m = j;
          if (((i)localObject2).field_status == 3)
            break label565;
          i = k;
          m = j;
          if (((i)localObject2).field_status == 4)
            break label565;
          i = k;
          m = j;
          if (((i)localObject2).field_status == -1)
            break label565;
          ab.i("MicroMsg.RecordMsgSendService", "hasInsertCdn, cdnInfo status:%s", new Object[] { Integer.valueOf(((i)localObject2).field_status) });
          i = 1;
          m = j;
          break label565;
        }
        label1095: k = j;
        if (locali.field_status != 2)
        {
          k = j;
          if (locali.field_status != 3)
          {
            k = j;
            if (locali.field_status != 4)
            {
              k = j;
              if (locali.field_status != -1)
                ab.i("MicroMsg.RecordMsgSendService", "hasInsertCdn, thumb cdnInfo status:%s", new Object[] { Integer.valueOf(locali.field_status) });
            }
          }
        }
      }
      for (k = 1; ; k = i)
      {
        break;
        m = 0;
        label1175: if (i != 0)
        {
          ab.i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", new Object[] { Integer.valueOf(this.pJu.field_localId), Long.valueOf(this.pJu.field_msgId), Integer.valueOf(this.pJu.field_type) });
          ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().c(this.pJu, new String[] { "localId" });
        }
        if (m == 0)
        {
          ab.i("MicroMsg.RecordMsgSendService", "doSendContinue without cdn task");
          this.pJT.a(this.pJu, false);
          this.pJT.pJx = false;
          this.pJT.a(null);
        }
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNService().run();
        AppMethodBeat.o(135724);
        return;
        j = k;
      }
      label1337: j = m;
      break label290;
      label1343: i = k;
      m = j;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.q.a
 * JD-Core Version:    0.6.2
 */