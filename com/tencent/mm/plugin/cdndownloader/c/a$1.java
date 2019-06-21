package com.tencent.mm.plugin.cdndownloader.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.i.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;
import java.util.Queue;

final class a$1
  implements Runnable
{
  a$1(a parama, g paramg)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(874);
    if (this.fyS != -1)
      a.a(this.ktc).put(this.fyT.field_mediaId, Integer.valueOf(this.fyS));
    a.b(this.ktc).add(this.fyT.field_mediaId);
    a.c(this.ktc).put(this.fyT.field_mediaId, this.fyT);
    a locala = this.ktc;
    ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart queue:%d", new Object[] { Integer.valueOf(locala.fyK.size()) });
    Object localObject;
    g localg;
    label172: int i;
    label235: int j;
    while (true)
      if (!locala.fyK.isEmpty())
      {
        localObject = (String)locala.fyK.poll();
        localg = (g)locala.fyL.remove(localObject);
        if (localg == null)
        {
          ab.e("MicroMsg.CdnDownloadNativeService", "summersafecdn task queue is empty , maybe bug here");
          AppMethodBeat.o(874);
          return;
        }
        ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", new Object[] { localg.field_mediaId, Boolean.valueOf(localg.field_autostart), Integer.valueOf(localg.field_chattype) });
        localg.field_startTime = bo.anU();
        if (localg.cRY)
        {
          if (localg.field_fullpath == null)
          {
            i = -1;
            if (localg.field_thumbpath != null)
              break label432;
          }
          label432: for (j = -1; ; j = localg.field_thumbpath.length())
          {
            ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), bo.anv(localg.field_svr_signature), bo.anv(localg.field_aesKey), Integer.valueOf(localg.field_fileType), localg.field_mediaId, Boolean.valueOf(localg.field_onlycheckexist) });
            if (localg.field_fullpath == null)
              localg.field_fullpath = "";
            if (localg.field_thumbpath == null)
              localg.field_thumbpath = "";
            i = locala.afy().b(localg);
            if (i == 0)
              break label444;
            ab.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), localg.field_mediaId });
            if (localg.egl == null)
              break;
            localg.egl.a(localg.field_mediaId, i, null, null, localg.field_onlycheckexist);
            break;
            i = localg.field_fullpath.length();
            break label235;
          }
          label444: ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupUploadMedia ok, field_mediaId[%s]", new Object[] { localg.field_mediaId });
          locala.fyM.put(localg.field_mediaId, localg);
        }
        else
        {
          i = -1;
          if ((localg.field_fileType == com.tencent.mm.i.a.efP) || (localg.field_fileType == com.tencent.mm.i.a.efR) || (localg.field_fileType == com.tencent.mm.i.a.efS) || (localg.field_fileType == com.tencent.mm.i.a.efT) || (localg.field_fileType == com.tencent.mm.i.a.efU) || (localg.field_fileType == com.tencent.mm.i.a.efV))
          {
            j = i;
            if (localg.field_fullpath != null)
            {
              j = i;
              if (!localg.field_fullpath.isEmpty())
                j = locala.afy().a(localg.field_mediaId, localg.egm, localg.field_fullpath, localg.field_fileType, localg.egn, localg.ego, localg.egp, localg.egq);
            }
            if (localg.field_fullpath == null)
            {
              i = -1;
              label619: ab.i("MicroMsg.CdnDownloadNativeService", "url download tryStart recv file:%d field_mediaId[%s], download_url[%s], filetype:[%d], ret:%d", new Object[] { Integer.valueOf(i), localg.field_mediaId, localg.egm, Integer.valueOf(localg.field_fileType), Integer.valueOf(j) });
              i = j;
            }
          }
        }
      }
    while (true)
    {
      if (i != 0)
      {
        ab.e("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), localg.field_mediaId });
        if (localg.egl == null)
          break;
        localg.egl.a(localg.field_mediaId, i, null, null, localg.field_onlycheckexist);
        break;
        i = localg.field_fullpath.length();
        break label619;
        if (localg.egs)
        {
          j = i;
          if (localg.field_fullpath != null)
          {
            j = i;
            if (!localg.field_fullpath.isEmpty())
              j = locala.afy().a(localg.field_mediaId, localg.field_fullpath, localg.egm, localg.egt, localg.egu, localg.allow_mobile_net_download, localg.egn, localg.ego, localg.is_resume_task, localg.egr, localg.egp);
          }
          if (localg.field_fullpath == null);
          for (localObject = ""; ; localObject = localg.field_fullpath)
          {
            ab.i("MicroMsg.CdnDownloadNativeService", "game package download tryStart recv file:%s field_mediaId[%s], download_url[%s] https url[%s]", new Object[] { localObject, localg.field_mediaId, localg.egm, localg.egt });
            i = j;
            break;
          }
        }
        if (localg.field_fullpath == null)
        {
          j = -1;
          label906: if (localg.field_thumbpath != null)
            break label1040;
        }
        label1040: for (int k = -1; ; k = localg.field_thumbpath.length())
        {
          ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), localg.field_svr_signature, localg.field_aesKey, Integer.valueOf(localg.field_fileType), localg.field_mediaId, Boolean.valueOf(localg.field_onlycheckexist) });
          if (localg.egx != 2)
            break label1116;
          if (!(localg instanceof h))
            break label1175;
          localObject = (h)localg;
          if (!((h)localObject).Jr())
            break label1052;
          i = locala.afy().a(localg, 2);
          break;
          j = localg.field_fullpath.length();
          break label906;
        }
        label1052: if (((h)localObject).Jp())
          i = locala.afy().a(((h)localObject).field_mediaId, ((h)localObject).url, ((h)localObject).referer, ((h)localObject).field_fullpath, ((h)localObject).egD, ((h)localObject).ege, ((h)localObject).isColdSnsData, ((h)localObject).signalQuality, ((h)localObject).snsScene, ((h)localObject).field_preloadRatio, ((h)localObject).field_requestVideoFormat, 1);
        continue;
        label1116: i = locala.afy().c(localg);
        continue;
      }
      ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s]", new Object[] { localg.field_mediaId });
      locala.fyM.put(localg.field_mediaId, localg);
      break;
      AppMethodBeat.o(874);
      break label172;
      label1175: i = -1;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(875);
    String str = super.toString() + "|addRecvTask";
    AppMethodBeat.o(875);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.c.a.1
 * JD-Core Version:    0.6.2
 */