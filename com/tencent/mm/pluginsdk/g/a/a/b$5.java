package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class b$5
  implements Runnable
{
  b$5(b paramb, String paramString, g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(79473);
    s locals1 = q.a.diy().ajg(this.vdU);
    g localg = this.vdW;
    if (locals1 == null)
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record is null");
      if ((locals1 == null) || (!locals1.field_deleted) || (localg.aiW(locals1.field_fileVersion) > 0))
        break label292;
      ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "deletedFile.version = %s, cacheReq.version = %s, this file should have been deleted, skip this cache-op", new Object[] { locals1.field_fileVersion, localg.veW });
      AppMethodBeat.o(79473);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record: urlKey = %s, url = %s, contentLength = %d, deleted = %b, eccSignature = %s, expireTime = %d, fileCompress = %b, fileEncrypt = %b, filePath = %s, fileUpdated = %b, fileVersion = %s, from = %s, keyVersion = %s, (encryptKey == null) = %b, maxRetryTimes = %d, retriedTimes = %d, sampleId = %s, dlStatus = %d", new Object[] { locals1.field_urlKey, locals1.field_url, Long.valueOf(locals1.field_contentLength), Boolean.valueOf(locals1.field_deleted), locals1.field_eccSignature, Long.valueOf(locals1.field_expireTime), Boolean.valueOf(locals1.field_fileCompress), Boolean.valueOf(locals1.field_fileEncrypt), locals1.field_filePath, Boolean.valueOf(locals1.field_fileUpdated), locals1.field_fileVersion, locals1.field_groupId2, Integer.valueOf(locals1.field_keyVersion), Boolean.valueOf(bo.isNullOrNil(locals1.field_encryptKey)), Integer.valueOf(locals1.field_maxRetryTimes), Integer.valueOf(locals1.field_retryTimes), locals1.field_sampleId, Integer.valueOf(locals1.field_status) });
      ab.d("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "queried record.encryptKey = %s", new Object[] { locals1.field_encryptKey });
      break;
      label292: s locals2;
      if (locals1 == null)
      {
        locals2 = localg.dih();
        locals2.field_fileUpdated = true;
        locals2.field_needRetry = true;
        if (bo.isNullOrNil(locals2.field_encryptKey))
          locals2.field_keyVersion = -1;
        ab.d("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "new record ".concat(String.valueOf(locals2)));
        q.a.diy().h(locals2);
        b.c.dif().g(localg.cut, localg.cuu, 0, localg.cuA);
        f.a.a(true, true, locals2, localg);
        AppMethodBeat.o(79473);
      }
      else
      {
        ab.d("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "record is not null");
        locals1.field_networkType = localg.networkType;
        if (bo.isNullOrNil(locals1.field_originalMd5))
          locals1.field_originalMd5 = localg.vdI;
        if (localg.aiW(locals1.field_fileVersion) > 0)
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "new version of file, re-download");
          locals2 = localg.dih();
          if (locals1.field_keyVersion >= localg.vdG)
          {
            locals2.field_keyVersion = locals1.field_keyVersion;
            locals2.field_encryptKey = locals1.field_encryptKey;
          }
          locals2.field_fileUpdated = true;
          locals2.field_needRetry = true;
          locals2.field_deleted = false;
          q.a.diy().h(locals2);
          b.c.dif().g(localg.cut, localg.cuu, 0, localg.cuA);
          q.a.diy().AH(localg.vdC);
          f.a.a(false, true, locals2, localg);
          AppMethodBeat.o(79473);
        }
        else if ((localg.aiW(locals1.field_fileVersion) == 0) && (!locals1.field_needRetry))
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "no need retry, resType %d, subType %d, version %s", new Object[] { Integer.valueOf(locals1.field_resType), Integer.valueOf(locals1.field_subType), locals1.field_fileVersion });
          AppMethodBeat.o(79473);
        }
        else if ((locals1.field_status == 2) || (locals1.field_status == 1) || (locals1.field_status == 0))
        {
          long l = com.tencent.mm.pluginsdk.g.a.d.a.ek(locals1.field_filePath);
          if (locals1.field_contentLength > l)
          {
            ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "content-length(%d) > fileSize(%d), resume download", new Object[] { Long.valueOf(locals1.field_contentLength), Long.valueOf(l) });
            if (0L == l)
            {
              b.c.dif().g(localg.cut, localg.cuu, 0, localg.cuA);
              f.a.a(false, true, locals1, localg);
              AppMethodBeat.o(79473);
            }
            else
            {
              f.a.a(true, false, locals1, localg);
              AppMethodBeat.o(79473);
            }
          }
          else if (!bo.nullAsNil(com.tencent.mm.a.g.cz(i.aiX(localg.vdC))).equals(locals1.field_md5))
          {
            ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download");
            f.a.a(false, true, locals1, localg);
            AppMethodBeat.o(79473);
          }
          else
          {
            ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "md5 check ok, file download complete, throw event to do decrypt %s", new Object[] { locals1.field_urlKey });
            locals1.field_status = 2;
            locals1.field_contentLength = com.tencent.mm.pluginsdk.g.a.d.a.ek(locals1.field_filePath);
            locals1.field_fileUpdated = false;
            locals1.field_reportId = localg.vdK;
            q.a.diy().h(locals1);
            j.z(locals1.field_reportId, 13L);
            j.z(locals1.field_reportId, 44L);
            j.a(locals1.field_resType, locals1.field_subType, locals1.field_url, bo.getInt(locals1.field_fileVersion, 0), j.a.veF, true, "NewXml".equalsIgnoreCase(locals1.field_groupId2), true, locals1.field_sampleId);
            if ((!localg.vei) && (!localg.vej))
            {
              b.c.dif().e(localg.cut, localg.cuu, i.aiX(localg.vdC), bo.getInt(localg.veW, 0));
              AppMethodBeat.o(79473);
            }
            else
            {
              ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "send query and decrypt request %s", new Object[] { localg.vdC });
              f.b.a(locals1, false, false);
              AppMethodBeat.o(79473);
            }
          }
        }
        else
        {
          if ((locals1.field_status == 4) || (locals1.field_status == 3))
          {
            ab.i("MicroMsg.ResDownloader.CheckResUpdate.DoCacheLogic", "file invalid, re-download %s", new Object[] { locals1.field_urlKey });
            f.a.a(false, true, locals1, localg);
          }
          AppMethodBeat.o(79473);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.b.5
 * JD-Core Version:    0.6.2
 */