package com.tencent.mm.plugin.cdndownloader.c;

import android.content.Context;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.i.b.a;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public final class a
  implements b.a
{
  private static a kta = null;
  private al eKj;
  Queue<String> fyK;
  public Map<String, g> fyL;
  public Map<String, g> fyM;
  public Map<String, Integer> fyN;
  private String fyO;
  private long fyP;
  public HashSet<String> fyQ;
  private com.tencent.mm.al.a ktb;

  public a()
  {
    AppMethodBeat.i(879);
    this.fyK = new LinkedList();
    this.fyL = new ConcurrentHashMap();
    this.fyM = new ConcurrentHashMap();
    this.fyN = new ConcurrentHashMap();
    this.eKj = new al();
    this.ktb = null;
    this.fyO = "";
    this.fyP = 0L;
    this.fyQ = new HashSet();
    AppMethodBeat.o(879);
  }

  public static boolean HD(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(883);
    int i = CdnLogic.pauseHttpMultiSocketDownloadTask(paramString);
    ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn cdntra pauseRecvTask mediaid:%s, ret:%d", new Object[] { paramString, Integer.valueOf(i) });
    if (i == 0)
      AppMethodBeat.o(883);
    while (true)
    {
      return bool;
      AppMethodBeat.o(883);
      bool = false;
    }
  }

  public static a beU()
  {
    try
    {
      AppMethodBeat.i(880);
      if (kta == null)
      {
        locala = new com/tencent/mm/plugin/cdndownloader/c/a;
        locala.<init>();
        kta = locala;
      }
      a locala = kta;
      AppMethodBeat.o(880);
      return locala;
    }
    finally
    {
    }
  }

  public final int a(final String paramString, final c paramc, final d paramd)
  {
    int i = 0;
    AppMethodBeat.i(884);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CdnDownloadNativeService", "cdn callback mediaid is null");
      i = -1;
      AppMethodBeat.o(884);
    }
    while (true)
    {
      return i;
      if ((paramc != null) || (paramd != null))
        break;
      ab.e("MicroMsg.CdnDownloadNativeService", "cdn callback info all null");
      i = -2;
      AppMethodBeat.o(884);
    }
    if (paramc != null)
      ab.d("MicroMsg.CdnDownloadNativeService", "CDN progress. total:%d, cur:%d, canshow:%b, isUploadTask:%b", new Object[] { Integer.valueOf(paramc.field_toltalLength), Integer.valueOf(paramc.field_finishedLength), Boolean.valueOf(paramc.field_mtlnotify), Boolean.valueOf(paramc.field_isUploadTask) });
    if (paramc != null);
    for (final boolean bool = paramc.field_isUploadTask; ; bool = false)
    {
      this.fyP = bo.anU();
      this.fyO = paramString;
      this.eKj.aa(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(876);
          g localg = (g)a.d(a.this).get(paramString);
          if (localg == null)
          {
            ab.e("MicroMsg.CdnDownloadNativeService", " task in jni get info failed mediaid:%s", new Object[] { paramString });
            AppMethodBeat.o(876);
          }
          while (true)
          {
            return;
            if (paramc != null)
            {
              paramc.cHr = paramString;
              ab.i("MicroMsg.CdnDownloadNativeService", "MTL: total:%d, cur:%d, mtl:%b, isSend:%b, isUploadTask:%b(%b)", new Object[] { Integer.valueOf(paramc.field_toltalLength), Integer.valueOf(paramc.field_finishedLength), Boolean.valueOf(paramc.field_mtlnotify), Boolean.valueOf(localg.cRY), Boolean.valueOf(paramc.field_isUploadTask), Boolean.valueOf(bool) });
              if (bool != localg.cRY)
                AppMethodBeat.o(876);
            }
            else
            {
              if (paramd != null)
                paramd.cHr = paramString;
              if (localg.egl != null)
              {
                long l = bo.anU();
                if ((paramd == null) && (paramc != null) && (!paramc.field_mtlnotify) && (at.getNetWorkType(ah.getContext()) == -1))
                {
                  AppMethodBeat.o(876);
                }
                else
                {
                  localg.field_lastProgressCallbackTime = l;
                  localg.egl.a(paramString, 0, paramc, paramd, localg.field_onlycheckexist);
                }
              }
              else
              {
                if (a.a(paramc))
                  a.a(a.this).remove(paramString);
                if (paramd != null)
                {
                  a.d(a.this).remove(paramString);
                  if (paramd.field_retCode == -5103011)
                  {
                    ab.i("MicroMsg.CdnDownloadNativeService", "summersafecdn ERR_VALIDATE_AUTHKEY");
                    h.pYm.a(546L, 4L, 1L, true);
                    a.e(a.this).keep_OnRequestDoGetCdnDnsInfo(999);
                  }
                }
                AppMethodBeat.o(876);
              }
            }
          }
        }

        public final String toString()
        {
          AppMethodBeat.i(877);
          String str = super.toString() + "|callback";
          AppMethodBeat.o(877);
          return str;
        }
      });
      AppMethodBeat.o(884);
      break;
    }
  }

  public final void a(String paramString, d paramd)
  {
    AppMethodBeat.i(887);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(887);
    while (true)
    {
      return;
      this.eKj.aa(new a.3(this, paramString, paramd));
      AppMethodBeat.o(887);
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(885);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CdnDownloadNativeService", "cdn callback getauthbuf mediaid is null");
      AppMethodBeat.o(885);
    }
    while (true)
    {
      return;
      g localg = (g)this.fyM.get(paramString);
      if (localg == null)
      {
        ab.e("MicroMsg.CdnDownloadNativeService", " getauthbuf task in jni get info failed mediaid:%s", new Object[] { paramString });
        AppMethodBeat.o(885);
      }
      else if (localg.egl != null)
      {
        localg.egl.a(paramString, paramByteArrayOutputStream);
        AppMethodBeat.o(885);
      }
      else
      {
        ab.e("MicroMsg.CdnDownloadNativeService", "getCdnAuthInfo fail, null taskcallback.");
        AppMethodBeat.o(885);
      }
    }
  }

  public final com.tencent.mm.al.a afy()
  {
    AppMethodBeat.i(881);
    if (this.ktb == null)
    {
      if (!ah.bqo())
        break label46;
      ab.i("MicroMsg.CdnDownloadNativeService", "use mm process cdn engine.");
    }
    for (this.ktb = f.afy(); ; this.ktb = new com.tencent.mm.al.a(ah.getContext().getFilesDir() + "/NativeCDNInfo", this))
    {
      com.tencent.mm.al.a locala = this.ktb;
      AppMethodBeat.o(881);
      return locala;
      label46: ab.i("MicroMsg.CdnDownloadNativeService", "use new cdn engine.");
    }
  }

  public final int f(g paramg)
  {
    int i = -2;
    AppMethodBeat.i(882);
    if (bo.isNullOrNil(paramg.field_mediaId))
    {
      ab.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId is null");
      i = -1;
      AppMethodBeat.o(882);
    }
    while (true)
    {
      return i;
      if (paramg.field_fileId == null)
        paramg.field_fileId = "";
      if (paramg.field_aesKey == null)
        paramg.field_aesKey = "";
      if (this.fyK.contains(paramg.field_fileId))
      {
        ab.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in queueTask");
        AppMethodBeat.o(882);
      }
      else if (this.fyL.containsKey(paramg.field_fileId))
      {
        ab.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapWaitTask");
        AppMethodBeat.o(882);
      }
      else if (this.fyM.containsKey(paramg.field_fileId))
      {
        ab.e("MicroMsg.CdnDownloadNativeService", "addRecvTask mediaId  exists in mapTaskInJni");
        AppMethodBeat.o(882);
      }
      else
      {
        paramg.cRY = false;
        this.eKj.aa(new a.1(this, paramg));
        AppMethodBeat.o(882);
        i = 0;
      }
    }
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(886);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CdnDownloadNativeService", "cdn callback decodePrepareResponse mediaid is null");
      AppMethodBeat.o(886);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      g localg = (g)this.fyM.get(paramString);
      if (localg == null)
      {
        ab.e("MicroMsg.CdnDownloadNativeService", " decodePrepareResponse task in jni get info failed mediaid:%s", new Object[] { paramString });
        AppMethodBeat.o(886);
        paramString = null;
      }
      else if (localg.egl != null)
      {
        paramString = localg.egl.l(paramString, paramArrayOfByte);
        AppMethodBeat.o(886);
      }
      else
      {
        ab.e("MicroMsg.CdnDownloadNativeService", "decodePrepareResponse fail, null taskcallback.");
        AppMethodBeat.o(886);
        paramString = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.c.a
 * JD-Core Version:    0.6.2
 */