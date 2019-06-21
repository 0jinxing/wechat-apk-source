package com.tencent.mm.pluginsdk.g.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.pluginsdk.g.a.c.t;
import com.tencent.mm.pluginsdk.g.a.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.Set;

final class h
  implements com.tencent.mm.pluginsdk.g.a.c.h
{
  private static void a(s params, boolean paramBoolean)
  {
    AppMethodBeat.i(79522);
    q.a.diy().AH(params.field_urlKey);
    a.ajj(params.field_filePath);
    a.ajj(params.field_filePath + ".decompressed");
    a.ajj(params.field_filePath + ".decrypted");
    if ((2 == params.field_status) && (!paramBoolean))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "delete completed but invalid file, but forceDL = false, skip this downloading");
      AppMethodBeat.o(79522);
    }
    while (true)
    {
      return;
      if ((params.field_maxRetryTimes > 0) && (params.field_retryTimes <= 0))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record_maxRetryTimes = %d, record_retryTimes = %d, retry times out, skip ", new Object[] { Integer.valueOf(params.field_maxRetryTimes), Integer.valueOf(params.field_retryTimes) });
        AppMethodBeat.o(79522);
      }
      else
      {
        params.field_retryTimes -= 1;
        params.field_fileUpdated = true;
        q.a.diy().h(params);
        j.z(params.field_reportId, 12L);
        ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "post network task");
        params = c.d(params);
        params.ufy = false;
        q.a.diy().d(params);
        AppMethodBeat.o(79522);
      }
    }
  }

  private static boolean e(s params)
  {
    AppMethodBeat.i(79521);
    boolean bool = bo.nullAsNil(g.cz(params.field_filePath)).equals(params.field_md5);
    AppMethodBeat.o(79521);
    return bool;
  }

  private static void f(s params)
  {
    AppMethodBeat.i(79523);
    if ((!params.field_fileCompress) && (!params.field_fileEncrypt))
    {
      b.c.dif().e(params.field_resType, params.field_subType, params.field_filePath, bo.getInt(params.field_fileVersion, 0));
      AppMethodBeat.o(79523);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "send query and decrypt request");
      b.c.dif().b(params);
      AppMethodBeat.o(79523);
    }
  }

  public final void a(s params, int paramInt)
  {
    AppMethodBeat.i(79520);
    Object localObject1;
    Object localObject2;
    if ((params.field_expireTime != 0L) && (params.field_expireTime <= bo.anT()))
    {
      ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "urlKey(%s) exceed expire time(%d), delete", new Object[] { params.field_urlKey, Long.valueOf(params.field_expireTime) });
      localObject1 = q.a.diy();
      localObject2 = params.field_urlKey;
      if (((q)localObject1).hrm)
        ((q)localObject1).vfx.pI((String)localObject2);
      a.ajj(params.field_filePath);
      a.ajj(params.field_filePath + ".decompressed");
      a.ajj(params.field_filePath + ".decrypted");
      q.a.diy().AH(params.field_urlKey);
      AppMethodBeat.o(79520);
    }
    while (true)
    {
      return;
      if (paramInt == 0)
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network unavailable, skip");
        AppMethodBeat.o(79520);
      }
      else if ((2 == paramInt) && (1 == params.field_networkType))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "network type = gprs, record network type = wifi, skip this ");
        AppMethodBeat.o(79520);
      }
      else if (params.field_deleted)
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "record(%s), should have been deleted", new Object[] { params.field_urlKey });
        a.ajj(params.field_filePath);
        a.ajj(params.field_filePath + ".decompressed");
        a.ajj(params.field_filePath + ".decrypted");
        AppMethodBeat.o(79520);
      }
      else if (!params.field_needRetry)
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", new Object[] { Integer.valueOf(params.field_resType), Integer.valueOf(params.field_subType), params.field_fileVersion });
        AppMethodBeat.o(79520);
      }
      else if (params.field_status == 2)
      {
        long l = a.ek(params.field_filePath);
        if (params.field_contentLength > l)
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "content-length > fileSize, resume download");
          if (0L == l)
          {
            if (!params.field_needRetry)
            {
              ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "no need retry, resType %d, subType %d, version %s", new Object[] { Integer.valueOf(params.field_resType), Integer.valueOf(params.field_subType), params.field_fileVersion });
              AppMethodBeat.o(79520);
            }
            else if (1 != paramInt)
            {
              ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "fileSize = 0, completed file may be deleted by user, skip this because it's not wifi");
              AppMethodBeat.o(79520);
            }
            else
            {
              localObject1 = b.c.dif().dic().iterator();
              while (true)
              {
                boolean bool;
                if (((Iterator)localObject1).hasNext())
                {
                  localObject2 = (b.b)((Iterator)localObject1).next();
                  bo.getInt(params.field_fileVersion, 0);
                  if (((b.b)localObject2).die())
                  {
                    ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "filterNotRetry by %s, resType %d, subType %d, version %s", new Object[] { localObject2.getClass().getName(), Integer.valueOf(params.field_resType), Integer.valueOf(params.field_subType), params.field_fileVersion });
                    AppMethodBeat.o(79520);
                    break;
                  }
                }
              }
              params.field_fileUpdated = true;
              b.c.dif().g(params.field_resType, params.field_subType, 0, bo.nullAsNil(params.field_groupId2).equals("NewXml"));
              q.a.diy().h(params);
            }
          }
          else
          {
            q.a.diy().d(c.d(params));
            AppMethodBeat.o(79520);
          }
        }
        else
        {
          if (!e(params))
          {
            ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
            if (1 == paramInt);
            for (bool = true; ; bool = false)
            {
              a(params, bool);
              AppMethodBeat.o(79520);
              break;
            }
          }
          ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 check ok, file download complete, throw event to do decrypt");
          f(params);
          AppMethodBeat.o(79520);
        }
      }
      else if ((params.field_status == 1) || (params.field_status == 0))
      {
        ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "db status: downloading or waiting, db content-length %d", new Object[] { Long.valueOf(params.field_contentLength) });
        if (!q.a.diy().ajh(params.field_urlKey))
        {
          ab.d("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "check md5");
          if (e(params))
          {
            ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 match, request complete, throw event to do decrypt");
            params.field_status = 2;
            params.field_contentLength = a.ek(params.field_filePath);
            q.a.diy().h(params);
            f(params);
            AppMethodBeat.o(79520);
          }
          else
          {
            if (0L == a.ek(params.field_filePath))
            {
              params.field_fileUpdated = true;
              q.a.diy().h(params);
              b.c.dif().g(params.field_resType, params.field_subType, 0, bo.nullAsNil(params.field_groupId2).equals("NewXml"));
            }
            ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "md5 not match,  download");
            q.a.diy().d(c.d(params));
            AppMethodBeat.o(79520);
          }
        }
        else
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "request already in downloading queue");
          AppMethodBeat.o(79520);
        }
      }
      else
      {
        if ((params.field_status == 4) || (params.field_status == 3))
        {
          ab.i("MicroMsg.ResDownloader.CheckResUpdateResumeRecordHandler", "file invalid, re-download");
          params.field_status = 0;
          a(params, true);
        }
        AppMethodBeat.o(79520);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.a.h
 * JD-Core Version:    0.6.2
 */