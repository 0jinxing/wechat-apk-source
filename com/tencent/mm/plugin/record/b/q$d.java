package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

final class q$d
  implements Runnable
{
  private j pJu;

  public q$d(q paramq, j paramj)
  {
    this.pJu = paramj;
  }

  private void a(aar paramaar, String paramString1, String paramString2)
  {
    AppMethodBeat.i(135739);
    ab.i("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl id:%s, mediaId:%s, path:%s", new Object[] { paramaar.mnd, paramString2, paramString1 });
    com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
    localg.field_fileType = 19;
    localg.field_authKey = paramaar.fgA;
    localg.field_aesKey = paramaar.who;
    localg.egm = paramaar.whr;
    localg.field_fullpath = paramString1;
    localg.field_mediaId = paramString2;
    localg.egl = new q.d.1(this, paramaar, paramString1);
    if (!f.afx().b(localg, -1))
      ab.e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
    AppMethodBeat.o(135739);
  }

  private void b(aar paramaar, String paramString1, String paramString2)
  {
    AppMethodBeat.i(135740);
    ab.i("MicroMsg.RecordMsgSendService", "[record] downloadTpThumbUrl id:%s, mediaId:%s, thumbPath:%s", new Object[] { paramaar.mnd, paramString2, paramString1 });
    com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
    localg.field_fileType = 19;
    localg.field_authKey = paramaar.fgA;
    localg.field_aesKey = paramaar.fgB;
    localg.egm = paramaar.fgv;
    localg.field_fullpath = paramString1;
    localg.field_mediaId = paramString2;
    localg.egl = new q.d.2(this, paramaar, paramString1);
    if (!f.afx().b(localg, -1))
      ab.e("MicroMsg.RecordMsgSendService", "recv openim record, add task failed");
    AppMethodBeat.o(135740);
  }

  public final void run()
  {
    AppMethodBeat.i(135738);
    if (this.pJu.field_dataProto == null)
    {
      ab.w("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable info.field_dataProto null");
      this.pJT.pJx = false;
      AppMethodBeat.o(135738);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.pJu.field_dataProto.wiv.iterator();
      boolean bool1 = false;
      boolean bool2 = false;
      while (localIterator.hasNext())
      {
        aar localaar = (aar)localIterator.next();
        boolean bool3;
        boolean bool4;
        String str1;
        Object localObject;
        label145: String str2;
        if (bo.isNullOrNil(localaar.wfZ))
        {
          bool3 = bool1;
          bool4 = bool2;
          if (bo.isNullOrNil(localaar.whr));
        }
        else
        {
          str1 = n.c(localaar, this.pJu.field_oriMsgId);
          localObject = n.c(localaar, this.pJu.field_msgId);
          if (com.tencent.mm.vfs.e.y(str1, (String)localObject) <= 0L)
            break label944;
          bool3 = true;
          ab.d("MicroMsg.RecordMsgSendService", "copy[%s] to [%s] result[%B]", new Object[] { str1, localObject, Boolean.valueOf(bool3) });
          bool4 = bool2;
          if (bool3)
          {
            bool4 = bool2;
            if (bo.isNullOrNil(localaar.wgq))
            {
              ab.i("MicroMsg.RecordMsgSendService", "not find full md5, try to calculate");
              localaar.akS(com.tencent.mm.a.g.cz((String)localObject));
              bool4 = true;
            }
            if (bo.isNullOrNil(localaar.wgs))
            {
              ab.i("MicroMsg.RecordMsgSendService", "not find head 256 md5, try to calculate");
              localaar.akT(com.tencent.mm.a.g.cA((String)localObject));
              bool4 = true;
            }
          }
          str1 = n.h(localaar.mnd, this.pJu.field_msgId, false);
          localObject = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH(str1);
          if (localObject != null)
            break label955;
          localObject = new i();
          ((i)localObject).field_cdnKey = localaar.wgb;
          ((i)localObject).field_cdnUrl = localaar.wfZ;
          ((i)localObject).field_dataId = localaar.mnd;
          ((i)localObject).field_mediaId = str1;
          ((i)localObject).field_totalLen = ((int)localaar.wgu);
          ((i)localObject).field_localId = ((i)localObject).field_mediaId.hashCode();
          ((i)localObject).field_path = n.c(localaar, this.pJu.field_msgId);
          ((i)localObject).field_type = 2;
          ((i)localObject).field_fileType = n.BH(localaar.dataType);
          ((i)localObject).field_recordLocalId = this.pJu.field_localId;
          ((i)localObject).field_toUser = this.pJu.field_toUser;
          ((i)localObject).field_isThumb = false;
          str2 = n.c(localaar, this.pJu.field_msgId);
          if ((bo.isNullOrNil(localaar.whr)) || (com.tencent.mm.vfs.e.ct(str2)))
            break label950;
          ((i)localObject).field_status = -1;
          a(localaar, str2, str1);
          label479: bool3 = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b((i)localObject);
          ab.i("MicroMsg.RecordMsgSendService", "[record] insert localId[%d] result[%B], recordLocalId:%d", new Object[] { Integer.valueOf(((i)localObject).field_localId), Boolean.valueOf(bool3), Integer.valueOf(((i)localObject).field_recordLocalId) });
          bool3 = bool1;
        }
        label546: if (bo.isNullOrNil(localaar.fgE))
        {
          bool1 = bool3;
          if (bo.isNullOrNil(localaar.fgv));
        }
        else
        {
          localObject = n.f(localaar, this.pJu.field_oriMsgId);
          str1 = n.f(localaar, this.pJu.field_msgId);
          label613: i locali;
          if (com.tencent.mm.vfs.e.y((String)localObject, str1) > 0L)
          {
            bool1 = true;
            ab.d("MicroMsg.RecordMsgSendService", "copy thumb[%s] to [%s] result[%B]", new Object[] { localObject, str1, Boolean.valueOf(bool1) });
            str2 = n.LA(localaar.mnd);
            localObject = n.h(str2, this.pJu.field_msgId, false);
            locali = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().VH((String)localObject);
            str1 = n.f(localaar, this.pJu.field_msgId);
            if (locali != null)
              break label1033;
            locali = new i();
            locali.field_cdnKey = localaar.wfV;
            locali.field_cdnUrl = localaar.fgE;
            locali.field_dataId = str2;
            locali.field_mediaId = ((String)localObject);
            locali.field_totalLen = ((int)localaar.wgF);
            locali.field_localId = locali.field_mediaId.hashCode();
            locali.field_path = n.f(localaar, this.pJu.field_msgId);
            locali.field_type = 2;
            locali.field_fileType = com.tencent.mm.i.a.MediaType_FULLSIZEIMAGE;
            locali.field_recordLocalId = this.pJu.field_localId;
            locali.field_toUser = this.pJu.field_toUser;
            locali.field_isThumb = true;
            if ((bo.isNullOrNil(localaar.fgv)) || (com.tencent.mm.vfs.e.ct(str1)))
              break label1028;
            locali.field_status = -1;
            b(localaar, str1, (String)localObject);
          }
          for (bool1 = bool3; ; bool1 = true)
          {
            bool3 = ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(locali);
            ab.i("MicroMsg.RecordMsgSendService", "[record] insert localId[%d] result[%B], recordLocalId:%d", new Object[] { Integer.valueOf(locali.field_localId), Boolean.valueOf(bool3), Integer.valueOf(locali.field_recordLocalId) });
            bool2 = bool4;
            break;
            label944: bool3 = false;
            break label145;
            label950: bool1 = true;
            break label479;
            label955: if (((i)localObject).field_status == -1)
              a(localaar, n.c(localaar, this.pJu.field_msgId), str1);
            if (((i)localObject).field_status == 0)
              bool1 = true;
            ab.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable cdnInfo.field_status:%s", new Object[] { Integer.valueOf(((i)localObject).field_status) });
            bool3 = bool1;
            break label546;
            bool1 = false;
            break label613;
          }
          if (locali.field_status == -1)
            b(localaar, n.f(localaar, this.pJu.field_msgId), (String)localObject);
          bool1 = bool3;
          if (locali.field_status == 0)
            bool1 = true;
          ab.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable cdnInfo.field_status:%s", new Object[] { Integer.valueOf(locali.field_status) });
        }
        label1028: label1033: bool2 = bool4;
      }
      ab.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable infochanged:%s, needRun:%s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (bool2)
      {
        ab.i("MicroMsg.RecordMsgSendService", "update record info, something changed, localid %d msgid %d, type %d", new Object[] { Integer.valueOf(this.pJu.field_localId), Long.valueOf(this.pJu.field_msgId), Integer.valueOf(this.pJu.field_type) });
        ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().c(this.pJu, new String[] { "localId" });
      }
      if (!bool1)
      {
        ab.i("MicroMsg.RecordMsgSendService", "NormalDataCopyRunnable doSendContinue");
        this.pJT.a(this.pJu, false);
        this.pJT.pJx = false;
        this.pJT.a(null);
      }
      ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNService().run();
      AppMethodBeat.o(135738);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.q.d
 * JD-Core Version:    0.6.2
 */