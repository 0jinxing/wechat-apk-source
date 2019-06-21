package com.tencent.mm.al;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.i.b.a;
import com.tencent.mm.i.g.a;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;

public final class b
  implements com.tencent.mm.ai.f, com.tencent.mm.i.b, b.a, n.b
{
  private int fyG;
  ak fyH;
  private com.tencent.mm.sdk.b.c<jm> fyI;
  private com.tencent.mm.network.n fyJ;
  Queue<String> fyK;
  public Map<String, com.tencent.mm.i.g> fyL;
  public Map<String, com.tencent.mm.i.g> fyM;
  public Map<String, Integer> fyN;
  private String fyO;
  private long fyP;
  public HashSet<String> fyQ;

  public b()
  {
    AppMethodBeat.i(78046);
    this.fyG = -1;
    this.fyH = new b.1(this, Looper.getMainLooper());
    this.fyI = new b.2(this);
    this.fyJ = new b.3(this);
    this.fyK = new LinkedList();
    this.fyL = new HashMap();
    this.fyM = new ConcurrentHashMap();
    this.fyN = new HashMap();
    this.fyO = "";
    this.fyP = 0L;
    this.fyQ = new HashSet();
    com.tencent.mm.kernel.g.RO().a(this.fyJ);
    if (com.tencent.mm.kernel.g.RN().QY())
      com.tencent.mm.kernel.g.RP().Ry().a(this);
    com.tencent.mm.kernel.g.Rg().a(379, this);
    com.tencent.mm.sdk.b.a.xxA.c(this.fyI);
    ab.i("MicroMsg.CdnTransportService", "summersafecdn CdnTransportService init[%s] stack[%s]", new Object[] { Integer.valueOf(hashCode()), bo.dpG() });
    AppMethodBeat.o(78046);
  }

  public static boolean lg(int paramInt)
  {
    AppMethodBeat.i(78045);
    com.tencent.mm.kernel.g.RN();
    int i;
    boolean bool;
    if (com.tencent.mm.kernel.a.QX())
    {
      i = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(144385, null), 0);
      ab.d("MicroMsg.CdnTransportService", "summersafecdn cdntra cdnBitSet:%d grayScaleFlag:%d res:%d Test.forceCDNTrans:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(i & paramInt), Boolean.valueOf(ae.git) });
      if (ae.git)
      {
        AppMethodBeat.o(78045);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      if ((i & paramInt) > 0)
      {
        AppMethodBeat.o(78045);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(78045);
        bool = false;
        continue;
        AppMethodBeat.o(78045);
        bool = true;
      }
    }
  }

  public final int a(final String paramString, final com.tencent.mm.i.c paramc, final com.tencent.mm.i.d paramd)
  {
    int i = 0;
    AppMethodBeat.i(78055);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CdnTransportService", "cdn callback mediaid is null");
      i = -1;
      AppMethodBeat.o(78055);
    }
    while (true)
    {
      return i;
      if ((paramc == null) && (paramd == null))
      {
        ab.e("MicroMsg.CdnTransportService", "cdn callback info all null");
        i = -2;
        AppMethodBeat.o(78055);
      }
      else
      {
        if (paramc != null)
          ab.d("MicroMsg.CdnTransportService", "CDN progress. total:%d, cur:%d, canshow:%b", new Object[] { Integer.valueOf(paramc.field_toltalLength), Integer.valueOf(paramc.field_finishedLength), Boolean.valueOf(paramc.field_mtlnotify) });
        this.fyP = bo.anU();
        this.fyO = paramString;
        com.tencent.mm.sdk.g.d.xDH.a(new Runnable()
        {
          public final void run()
          {
            int i = 0;
            AppMethodBeat.i(78040);
            Object localObject = (com.tencent.mm.i.g)b.this.fyM.get(paramString);
            if (localObject == null)
            {
              ab.d("MicroMsg.CdnTransportService", " task in jni get info failed mediaid[%s] hash[%s]", new Object[] { paramString, Integer.valueOf(b.this.hashCode()) });
              com.tencent.mm.plugin.report.service.h.pYm.a(594L, 7L, 1L, true);
              AppMethodBeat.o(78040);
            }
            long l;
            while (true)
            {
              return;
              if (paramc != null)
              {
                paramc.cHr = paramString;
                ab.i("MicroMsg.CdnTransportService", "MTL: total:%d, cur:%d, mtl:%b", new Object[] { Integer.valueOf(paramc.field_toltalLength), Integer.valueOf(paramc.field_finishedLength), Boolean.valueOf(paramc.field_mtlnotify) });
              }
              if (paramd != null)
                paramd.cHr = paramString;
              if (((com.tencent.mm.i.g)localObject).egl == null)
                break label253;
              l = bo.anU();
              if ((paramd != null) || (paramc == null) || (paramc.field_mtlnotify) || (at.getNetWorkType(ah.getContext()) != -1))
                break;
              AppMethodBeat.o(78040);
            }
            ((com.tencent.mm.i.g)localObject).field_lastProgressCallbackTime = l;
            ((com.tencent.mm.i.g)localObject).egl.a(paramString, 0, paramc, paramd, ((com.tencent.mm.i.g)localObject).field_onlycheckexist);
            label253: if ((localObject instanceof com.tencent.mm.i.f));
            for (localObject = (com.tencent.mm.i.f)localObject; ; localObject = null)
            {
              com.tencent.mm.i.c localc = paramc;
              if ((localc != null) && (localc.field_finishedLength != localc.field_toltalLength));
              while (true)
              {
                if ((i != 0) && ((localObject == null) || (((com.tencent.mm.i.f)localObject).Jo())))
                  b.this.fyN.remove(paramString);
                if (paramd != null)
                {
                  if ((localObject == null) || (((com.tencent.mm.i.f)localObject).Jo()))
                    b.this.fyM.remove(paramString);
                  if (paramd.field_retCode == -5103011)
                  {
                    ab.i("MicroMsg.CdnTransportService", "summersafecdn ERR_VALIDATE_AUTHKEY");
                    com.tencent.mm.plugin.report.service.h.pYm.a(546L, 4L, 1L, true);
                    f.afy().keep_OnRequestDoGetCdnDnsInfo(999);
                  }
                }
                AppMethodBeat.o(78040);
                break;
                i = 1;
              }
            }
          }

          public final String toString()
          {
            AppMethodBeat.i(78041);
            String str = super.toString() + "|callback";
            AppMethodBeat.o(78041);
            return str;
          }
        }
        , "MicroMsg.CdnTransportService");
        AppMethodBeat.o(78055);
      }
    }
  }

  public final void a(int paramInt, com.tencent.mm.sdk.e.n paramn, Object paramObject)
  {
    AppMethodBeat.i(78043);
    if (!com.tencent.mm.kernel.g.RN().QY())
      AppMethodBeat.o(78043);
    while (true)
    {
      return;
      int i = bo.g(paramObject, 0);
      ab.d("MicroMsg.CdnTransportService", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramn });
      if ((paramn != com.tencent.mm.kernel.g.RP().Ry()) || (i <= 0))
      {
        ab.e("MicroMsg.CdnTransportService", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramn });
        AppMethodBeat.o(78043);
      }
      else if (i != 144385)
      {
        AppMethodBeat.o(78043);
      }
      else
      {
        f.afu().li(10);
        AppMethodBeat.o(78043);
      }
    }
  }

  public final void a(String paramString, com.tencent.mm.i.d paramd)
  {
    AppMethodBeat.i(78058);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(78058);
    while (true)
    {
      return;
      com.tencent.mm.sdk.g.d.xDH.a(new b.8(this, paramString, paramd), "MicroMsg.CdnTransportService");
      AppMethodBeat.o(78058);
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(78056);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CdnTransportService", "cdn callback getauthbuf mediaid is null");
      AppMethodBeat.o(78056);
    }
    while (true)
    {
      return;
      com.tencent.mm.i.g localg = (com.tencent.mm.i.g)this.fyM.get(paramString);
      if (localg == null)
      {
        ab.e("MicroMsg.CdnTransportService", " getauthbuf task in jni get info failed mediaid:%s", new Object[] { paramString });
        AppMethodBeat.o(78056);
      }
      else if (localg.egl != null)
      {
        localg.egl.a(paramString, paramByteArrayOutputStream);
        AppMethodBeat.o(78056);
      }
      else
      {
        ab.e("MicroMsg.CdnTransportService", "getCdnAuthInfo fail, null taskcallback.");
        AppMethodBeat.o(78056);
      }
    }
  }

  public final void afs()
  {
    AppMethodBeat.i(78054);
    com.tencent.mm.kernel.g.RN();
    a.b localb;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    if (com.tencent.mm.kernel.a.QX())
    {
      localb = f.afy().afr();
      str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableCDNUploadImg");
      str2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableCDNVerifyConnect");
      str3 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableCDNVideoRedirectOC");
      str4 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableStreamUploadVideo");
      str5 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("C2COverloadDelaySeconds");
      str6 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("SNSOverloadDelaySeconds");
      str7 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableSnsStreamDownload");
      str8 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableSnsImageDownload");
      str9 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ApprovedVideoPrivateProtocolHosts");
    }
    try
    {
      if (!bo.isNullOrNil(str1))
        localb.field_UseStreamCDN = Integer.valueOf(str1).intValue();
      if (!bo.isNullOrNil(str2))
        localb.field_EnableCDNVerifyConnect = Integer.valueOf(str2).intValue();
      if (!bo.isNullOrNil(str3))
        localb.field_EnableCDNVideoRedirectOC = Integer.valueOf(str3).intValue();
      if (!bo.isNullOrNil(str4))
        localb.field_EnableStreamUploadVideo = Integer.valueOf(str4).intValue();
      if (!bo.isNullOrNil(str5))
        localb.field_C2COverloadDelaySeconds = Integer.valueOf(str5).intValue();
      if (!bo.isNullOrNil(str6))
        localb.field_SNSOverloadDelaySeconds = Integer.valueOf(str6).intValue();
      if (!bo.isNullOrNil(str7))
        localb.field_EnableSnsStreamDownload = Integer.valueOf(str7).intValue();
      if (!bo.isNullOrNil(str8))
        localb.field_EnableSnsImageDownload = Integer.valueOf(str8).intValue();
      if (!bo.isNullOrNil(str9))
        localb.field_ApprovedVideoHosts = str9;
      f.afx();
      if (lg(256))
      {
        i = 1;
        localb.field_EnableSafeCDN = i;
        if (localb.field_UseStreamCDN != 0)
        {
          str7 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ProgJPEGUploadSizeLimitWifi");
          str3 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ProgJPEGUploadSizeLimit3G");
          str8 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ProgJPEGDownloadSizeLimit");
          str2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ProgJPEGOnlyRecvPTL");
          str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("EnableJPEGDyncmicETL");
          if (!bo.isNullOrNil(str7))
            localb.field_WifiEtl = Integer.valueOf(str7).intValue();
          if (!bo.isNullOrNil(str3))
            localb.field_noWifiEtl = Integer.valueOf(str3).intValue();
          if (!bo.isNullOrNil(str8))
            localb.field_Ptl = Integer.valueOf(str8).intValue();
          if (!bo.isNullOrNil(str2))
            if (Integer.valueOf(str2).intValue() == 0)
              break label875;
        }
      }
      label875: for (boolean bool = true; ; bool = false)
      {
        localb.field_onlyrecvPtl = bool;
        if (!bo.isNullOrNil(str1))
          localb.field_UseDynamicETL = Integer.valueOf(str1).intValue();
        ab.i("MicroMsg.CdnTransportService", "summersafecdn streamcdn config[SVR]:%s", new Object[] { localb });
        if (this.fyG != -1)
        {
          ab.w("MicroMsg.CdnTransportService", "cmd set snsimage flag: %d", new Object[] { Integer.valueOf(this.fyG) });
          localb.field_EnableSnsImageDownload = this.fyG;
        }
        f.afy();
        a.a(localb);
        if (ae.giS)
        {
          ab.w("MicroMsg.CdnTransportService", "use cdn debug configure.");
          if (!ae.giO)
            break label896;
          i = 1;
          localb.field_UseStreamCDN = i;
          if (localb.field_UseStreamCDN != 0)
          {
            localb.field_onlysendETL = ae.giP;
            localb.field_onlyrecvPtl = ae.giQ;
            if (!bo.isNullOrNil(ae.giL))
              localb.field_WifiEtl = Integer.valueOf(ae.giL).intValue();
            if (!bo.isNullOrNil(ae.giM))
              localb.field_noWifiEtl = Integer.valueOf(ae.giM).intValue();
            if (!bo.isNullOrNil(ae.giN))
              localb.field_Ptl = Integer.valueOf(ae.giN).intValue();
          }
          if (!ae.giT)
            break label902;
          i = 1;
          localb.field_EnableCDNVerifyConnect = i;
          if (!ae.giU)
            break label908;
          i = 1;
          localb.field_EnableCDNVideoRedirectOC = i;
          ab.i("MicroMsg.CdnTransportService", "streamcdn config[DEBUG]:%s", new Object[] { localb });
          f.afy();
          a.a(localb);
        }
        AppMethodBeat.o(78054);
        return;
        i = 0;
        break;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      while (true)
      {
        ab.e("MicroMsg.CdnTransportService", localNumberFormatException.toString());
        continue;
        label896: int i = 0;
        continue;
        label902: i = 0;
        continue;
        label908: i = 0;
      }
    }
  }

  public final boolean b(com.tencent.mm.i.g paramg, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(78048);
    if (paramg == null)
    {
      ab.e("MicroMsg.CdnTransportService", "addRecvTask task info is null");
      AppMethodBeat.o(78048);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramg.field_mediaId))
      {
        ab.e("MicroMsg.CdnTransportService", "addRecvTask mediaId is null");
        AppMethodBeat.o(78048);
      }
      else
      {
        if (paramg.field_fileId == null)
          paramg.field_fileId = "";
        if (paramg.field_aesKey == null)
          paramg.field_aesKey = "";
        paramg.cRY = false;
        com.tencent.mm.sdk.g.d.xDH.a(new b.5(this, paramInt, paramg), "MicroMsg.CdnTransportService");
        bool = true;
        AppMethodBeat.o(78048);
      }
    }
  }

  public final void cK(boolean paramBoolean)
  {
    AppMethodBeat.i(78053);
    if ((!paramBoolean) && (f.afy().afq()))
    {
      com.tencent.mm.kernel.g.RN();
      if (com.tencent.mm.kernel.a.QX())
      {
        ab.w("MicroMsg.CdnTransportService", "summersafecdn cdntra Not init cdn dnsinfo , will retry after set info");
        f.afu().li(4);
        AppMethodBeat.o(78053);
      }
    }
    label82: Object localObject1;
    Object localObject2;
    while (true)
    {
      return;
      afs();
      ab.i("MicroMsg.CdnTransportService", "summersafecdn tryStart queue:%d", new Object[] { Integer.valueOf(this.fyK.size()) });
      if (this.fyK.isEmpty())
        break label1643;
      localObject1 = (String)this.fyK.poll();
      localObject2 = (com.tencent.mm.i.g)this.fyL.remove(localObject1);
      if (localObject2 != null)
        break;
      ab.e("MicroMsg.CdnTransportService", "summersafecdn task queue is empty , maybe bug here");
      AppMethodBeat.o(78053);
    }
    ab.i("MicroMsg.CdnTransportService", "summersafecdn id:%s cdnautostart :%s chatroom:%s", new Object[] { ((com.tencent.mm.i.g)localObject2).field_mediaId, Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_autostart), Integer.valueOf(((com.tencent.mm.i.g)localObject2).field_chattype) });
    ((com.tencent.mm.i.g)localObject2).field_startTime = bo.anU();
    label205: int j;
    label215: Object localObject3;
    if (((com.tencent.mm.i.g)localObject2).cRY)
    {
      String str;
      if (((com.tencent.mm.i.g)localObject2).field_fullpath == null)
      {
        i = -1;
        if (((com.tencent.mm.i.g)localObject2).field_thumbpath != null)
          break label554;
        j = -1;
        ab.i("MicroMsg.CdnTransportService", "summersafecdn tryStart send file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b] largesvideo[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(j), bo.anv(((com.tencent.mm.i.g)localObject2).field_svr_signature), bo.anv(((com.tencent.mm.i.g)localObject2).field_aesKey), Integer.valueOf(((com.tencent.mm.i.g)localObject2).field_fileType), ((com.tencent.mm.i.g)localObject2).field_mediaId, Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_onlycheckexist), Integer.valueOf(((com.tencent.mm.i.g)localObject2).field_largesvideo) });
        if (((com.tencent.mm.i.g)localObject2).field_fullpath == null)
          ((com.tencent.mm.i.g)localObject2).field_fullpath = "";
        if (((com.tencent.mm.i.g)localObject2).field_thumbpath == null)
          ((com.tencent.mm.i.g)localObject2).field_thumbpath = "";
        localObject1 = (com.tencent.mm.i.g)this.fyM.put(((com.tencent.mm.i.g)localObject2).field_mediaId, localObject2);
        localObject3 = (com.tencent.mm.i.g)this.fyM.get(((com.tencent.mm.i.g)localObject2).field_mediaId);
        if (localObject3 == null)
          com.tencent.mm.plugin.report.service.h.pYm.a(594L, 5L, 1L, true);
        i = f.afy().b((com.tencent.mm.i.g)localObject2);
        str = ((com.tencent.mm.i.g)localObject2).field_mediaId;
        if (localObject1 != null)
          break label566;
        localObject1 = null;
        label405: if (localObject3 != null)
          break label574;
      }
      label554: label566: label574: for (localObject3 = null; ; localObject3 = ((com.tencent.mm.i.g)localObject3).field_mediaId)
      {
        ab.i("MicroMsg.CdnTransportService", "summersafecdn startupUploadMedia ok, field_mediaId[%s] ret[%s, %s, %s] hash[%s]", new Object[] { str, Integer.valueOf(i), localObject1, localObject3, Integer.valueOf(hashCode()) });
        if (i == 0)
          break;
        localObject1 = (com.tencent.mm.i.g)this.fyM.remove(((com.tencent.mm.i.g)localObject2).field_mediaId);
        ab.e("MicroMsg.CdnTransportService", "summersafecdn startupUploadMedia error:%d clientid:%s remove[%s]", new Object[] { Integer.valueOf(i), ((com.tencent.mm.i.g)localObject2).field_mediaId, localObject1 });
        if (((com.tencent.mm.i.g)localObject2).egl == null)
          break;
        ((com.tencent.mm.i.g)localObject2).egl.a(((com.tencent.mm.i.g)localObject2).field_mediaId, i, null, null, ((com.tencent.mm.i.g)localObject2).field_onlycheckexist);
        break;
        i = ((com.tencent.mm.i.g)localObject2).field_fullpath.length();
        break label205;
        j = ((com.tencent.mm.i.g)localObject2).field_thumbpath.length();
        break label215;
        localObject1 = ((com.tencent.mm.i.g)localObject1).field_mediaId;
        break label405;
      }
    }
    int i = -1;
    if (((com.tencent.mm.i.g)localObject2).field_fileType == 40001)
      i = f.afy().a(((com.tencent.mm.i.g)localObject2).field_mediaId, ((com.tencent.mm.i.g)localObject2).egm, ((com.tencent.mm.i.g)localObject2).field_fullpath, ((com.tencent.mm.i.g)localObject2).field_fileType, ((com.tencent.mm.i.g)localObject2).field_aesKey, ((com.tencent.mm.i.g)localObject2).field_authKey);
    while (true)
    {
      if (i != 0)
      {
        ab.e("MicroMsg.CdnTransportService", "summersafecdn startupDownloadMedia error:%d clientid:%s", new Object[] { Integer.valueOf(i), ((com.tencent.mm.i.g)localObject2).field_mediaId });
        if (((com.tencent.mm.i.g)localObject2).egl == null)
          break label82;
        ((com.tencent.mm.i.g)localObject2).egl.a(((com.tencent.mm.i.g)localObject2).field_mediaId, i, null, null, ((com.tencent.mm.i.g)localObject2).field_onlycheckexist);
        break label82;
        if (((com.tencent.mm.i.g)localObject2).field_fileType == 19)
        {
          i = f.afy().a(((com.tencent.mm.i.g)localObject2).field_mediaId, ((com.tencent.mm.i.g)localObject2).egm, ((com.tencent.mm.i.g)localObject2).field_fullpath, ((com.tencent.mm.i.g)localObject2).field_fileType, ((com.tencent.mm.i.g)localObject2).field_aesKey, ((com.tencent.mm.i.g)localObject2).field_authKey);
          continue;
        }
        if ((((com.tencent.mm.i.g)localObject2).field_fileType == com.tencent.mm.i.a.efP) || (((com.tencent.mm.i.g)localObject2).field_fileType == com.tencent.mm.i.a.efR))
        {
          j = i;
          if (((com.tencent.mm.i.g)localObject2).field_fullpath != null)
          {
            j = i;
            if (!((com.tencent.mm.i.g)localObject2).field_fullpath.isEmpty())
              j = f.afy().a(((com.tencent.mm.i.g)localObject2).field_mediaId, ((com.tencent.mm.i.g)localObject2).egm, ((com.tencent.mm.i.g)localObject2).field_fullpath, ((com.tencent.mm.i.g)localObject2).field_fileType, ((com.tencent.mm.i.g)localObject2).egn, ((com.tencent.mm.i.g)localObject2).ego, ((com.tencent.mm.i.g)localObject2).egp, ((com.tencent.mm.i.g)localObject2).egq);
          }
          if (((com.tencent.mm.i.g)localObject2).field_fullpath == null);
          for (i = -1; ; i = ((com.tencent.mm.i.g)localObject2).field_fullpath.length())
          {
            ab.i("MicroMsg.CdnTransportService", "url download tryStart recv file:%d field_mediaId[%s], download_url[%s], filetype:[%d]", new Object[] { Integer.valueOf(i), ((com.tencent.mm.i.g)localObject2).field_mediaId, ((com.tencent.mm.i.g)localObject2).egm, Integer.valueOf(((com.tencent.mm.i.g)localObject2).field_fileType) });
            i = j;
            break;
          }
        }
        if (((com.tencent.mm.i.g)localObject2).egs)
        {
          j = i;
          if (((com.tencent.mm.i.g)localObject2).field_fullpath != null)
          {
            j = i;
            if (!((com.tencent.mm.i.g)localObject2).field_fullpath.isEmpty())
              j = f.afy().a(((com.tencent.mm.i.g)localObject2).field_mediaId, ((com.tencent.mm.i.g)localObject2).field_fullpath, ((com.tencent.mm.i.g)localObject2).egm, ((com.tencent.mm.i.g)localObject2).egt, ((com.tencent.mm.i.g)localObject2).egu, ((com.tencent.mm.i.g)localObject2).allow_mobile_net_download, ((com.tencent.mm.i.g)localObject2).egn, ((com.tencent.mm.i.g)localObject2).ego, ((com.tencent.mm.i.g)localObject2).is_resume_task, ((com.tencent.mm.i.g)localObject2).egr, ((com.tencent.mm.i.g)localObject2).egp);
          }
          if (((com.tencent.mm.i.g)localObject2).field_fullpath == null);
          for (i = -1; ; i = ((com.tencent.mm.i.g)localObject2).field_fullpath.length())
          {
            ab.i("MicroMsg.CdnTransportService", "game package download tryStart recv file:%d field_mediaId[%s], download_url[%s] https url[%s]", new Object[] { Integer.valueOf(i), ((com.tencent.mm.i.g)localObject2).field_mediaId, ((com.tencent.mm.i.g)localObject2).egm, ((com.tencent.mm.i.g)localObject2).egt });
            i = j;
            break;
          }
        }
        if (((com.tencent.mm.i.g)localObject2).egv)
        {
          if ((localObject2 instanceof com.tencent.mm.i.f))
          {
            localObject1 = (com.tencent.mm.i.f)localObject2;
            i = f.afy().a((com.tencent.mm.i.f)localObject1);
            continue;
          }
          if (!(localObject2 instanceof com.tencent.mm.i.e))
            break label1652;
          localObject1 = (com.tencent.mm.i.e)localObject2;
          i = f.afy().a(((com.tencent.mm.i.e)localObject1).field_mediaId, ((com.tencent.mm.i.e)localObject1).url, ((com.tencent.mm.i.e)localObject1).referer, ((com.tencent.mm.i.e)localObject1).egd, ((com.tencent.mm.i.e)localObject1).ege, ((com.tencent.mm.i.e)localObject1).egf, ((com.tencent.mm.i.e)localObject1).egg, ((com.tencent.mm.i.e)localObject1).egh, ((com.tencent.mm.i.e)localObject1).isColdSnsData, ((com.tencent.mm.i.e)localObject1).signalQuality, ((com.tencent.mm.i.e)localObject1).snsScene, ((com.tencent.mm.i.e)localObject1).snsCipherKey, ((com.tencent.mm.i.e)localObject1).duk, ((com.tencent.mm.i.e)localObject1).egi, ((com.tencent.mm.i.e)localObject1).fileType);
          continue;
        }
        if (((com.tencent.mm.i.g)localObject2).field_fullpath == null)
        {
          j = -1;
          label1173: if (((com.tencent.mm.i.g)localObject2).field_thumbpath != null)
            break label1306;
        }
        label1306: for (int k = -1; ; k = ((com.tencent.mm.i.g)localObject2).field_thumbpath.length())
        {
          ab.i("MicroMsg.CdnTransportService", "summersafecdn tryStart recv file:%d thumb:%d, field_svr_signature[%s], field_aesKey[%s], field_fileType[%d], field_mediaId[%s], onlycheckexist[%b]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), ((com.tencent.mm.i.g)localObject2).field_svr_signature, ((com.tencent.mm.i.g)localObject2).field_aesKey, Integer.valueOf(((com.tencent.mm.i.g)localObject2).field_fileType), ((com.tencent.mm.i.g)localObject2).field_mediaId, Boolean.valueOf(((com.tencent.mm.i.g)localObject2).field_onlycheckexist) });
          if (((com.tencent.mm.i.g)localObject2).egx != 2)
            break label1493;
          if (!(localObject2 instanceof com.tencent.mm.i.h))
            break label1652;
          localObject1 = (com.tencent.mm.i.h)localObject2;
          if (!((com.tencent.mm.i.h)localObject1).Jr())
            break label1318;
          i = f.afy().a((com.tencent.mm.i.g)localObject2, 2);
          break;
          j = ((com.tencent.mm.i.g)localObject2).field_fullpath.length();
          break label1173;
        }
        label1318: if (((com.tencent.mm.i.h)localObject1).Jp())
        {
          i = f.afy().a(((com.tencent.mm.i.h)localObject1).field_mediaId, ((com.tencent.mm.i.h)localObject1).url, ((com.tencent.mm.i.h)localObject1).referer, ((com.tencent.mm.i.h)localObject1).field_fullpath, ((com.tencent.mm.i.h)localObject1).egD, ((com.tencent.mm.i.h)localObject1).ege, ((com.tencent.mm.i.h)localObject1).isColdSnsData, ((com.tencent.mm.i.h)localObject1).signalQuality, ((com.tencent.mm.i.h)localObject1).snsScene, ((com.tencent.mm.i.h)localObject1).field_preloadRatio, ((com.tencent.mm.i.h)localObject1).field_requestVideoFormat, 1);
          continue;
        }
        if (((com.tencent.mm.i.h)localObject1).Jq())
        {
          i = f.afy().a(((com.tencent.mm.i.h)localObject1).field_mediaId, ((com.tencent.mm.i.h)localObject1).url, ((com.tencent.mm.i.h)localObject1).referer, ((com.tencent.mm.i.h)localObject1).field_fullpath, ((com.tencent.mm.i.h)localObject1).egD, ((com.tencent.mm.i.h)localObject1).field_preloadRatio, ((com.tencent.mm.i.h)localObject1).concurrentCount);
          continue;
        }
        if (((com.tencent.mm.i.h)localObject1).Jt())
          i = f.afy().b(((com.tencent.mm.i.h)localObject1).field_mediaId, ((com.tencent.mm.i.h)localObject1).url, ((com.tencent.mm.i.h)localObject1).referer, ((com.tencent.mm.i.h)localObject1).field_fullpath, ((com.tencent.mm.i.h)localObject1).egD, ((com.tencent.mm.i.h)localObject1).ege, ((com.tencent.mm.i.h)localObject1).isColdSnsData, ((com.tencent.mm.i.h)localObject1).signalQuality, ((com.tencent.mm.i.h)localObject1).snsScene, ((com.tencent.mm.i.h)localObject1).field_preloadRatio, ((com.tencent.mm.i.h)localObject1).field_requestVideoFormat, ((com.tencent.mm.i.h)localObject1).connectionCount);
        continue;
        label1493: i = f.afy().c((com.tencent.mm.i.g)localObject2);
        continue;
      }
      localObject1 = (com.tencent.mm.i.g)this.fyM.put(((com.tencent.mm.i.g)localObject2).field_mediaId, localObject2);
      localObject3 = (com.tencent.mm.i.g)this.fyM.get(((com.tencent.mm.i.g)localObject2).field_mediaId);
      if (localObject3 == null)
        com.tencent.mm.plugin.report.service.h.pYm.a(594L, 6L, 1L, true);
      localObject2 = ((com.tencent.mm.i.g)localObject2).field_mediaId;
      if (localObject1 == null)
      {
        localObject1 = null;
        label1571: if (localObject3 != null)
          break label1633;
      }
      label1633: for (localObject3 = null; ; localObject3 = ((com.tencent.mm.i.g)localObject3).field_mediaId)
      {
        ab.i("MicroMsg.CdnTransportService", "summersafecdn startupDownloadMedia ok, field_mediaId[%s] ret[%s, %s, %s] hash[%s]", new Object[] { localObject2, Integer.valueOf(i), localObject1, localObject3, Integer.valueOf(hashCode()) });
        break;
        localObject1 = ((com.tencent.mm.i.g)localObject1).field_mediaId;
        break label1571;
      }
      label1643: AppMethodBeat.o(78053);
      break;
      label1652: i = -1;
    }
  }

  public final boolean d(com.tencent.mm.i.g paramg)
  {
    AppMethodBeat.i(78049);
    boolean bool = b(paramg, -1);
    AppMethodBeat.o(78049);
    return bool;
  }

  public final boolean e(com.tencent.mm.i.g paramg)
  {
    boolean bool = true;
    AppMethodBeat.i(78050);
    if (bo.isNullOrNil(paramg.field_mediaId))
    {
      ab.e("MicroMsg.CdnTransportService", "summersafecdn addSendTask mediaId is null");
      bool = false;
      AppMethodBeat.o(78050);
    }
    while (true)
    {
      return bool;
      if (paramg.field_fileId == null)
        paramg.field_fileId = "";
      if (paramg.field_aesKey == null)
        paramg.field_aesKey = "";
      paramg.cRY = true;
      com.tencent.mm.sdk.g.d.xDH.a(new b.6(this, paramg), "MicroMsg.CdnTransportService");
      AppMethodBeat.o(78050);
    }
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78057);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.CdnTransportService", "cdn callback decodePrepareResponse mediaid is null");
      AppMethodBeat.o(78057);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      com.tencent.mm.i.g localg = (com.tencent.mm.i.g)this.fyM.get(paramString);
      if (localg == null)
      {
        ab.e("MicroMsg.CdnTransportService", " decodePrepareResponse task in jni get info failed mediaid:%s", new Object[] { paramString });
        AppMethodBeat.o(78057);
        paramString = null;
      }
      else if (localg.egl != null)
      {
        paramString = localg.egl.l(paramString, paramArrayOfByte);
        AppMethodBeat.o(78057);
      }
      else
      {
        ab.e("MicroMsg.CdnTransportService", "decodePrepareResponse fail, null taskcallback.");
        AppMethodBeat.o(78057);
        paramString = null;
      }
    }
  }

  public final void lh(int paramInt)
  {
    this.fyG = paramInt;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78044);
    if (paramm.getType() != 379)
      AppMethodBeat.o(78044);
    while (true)
    {
      return;
      ab.d("MicroMsg.CdnTransportService", "cdntra onSceneEnd it will tryStart sceneType:%d [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (com.tencent.mm.kernel.g.RN().QY())
        com.tencent.mm.sdk.g.d.xDH.a(new b.4(this), "MicroMsg.CdnTransportService");
      AppMethodBeat.o(78044);
    }
  }

  public final boolean rN(String paramString)
  {
    AppMethodBeat.i(78051);
    com.tencent.mm.i.g localg = (com.tencent.mm.i.g)this.fyM.remove(paramString);
    if (localg != null)
    {
      f.afy();
      a.rF(paramString);
      com.tencent.mm.plugin.report.service.h.pYm.e(10769, new Object[] { Integer.valueOf(c.fzh), Integer.valueOf(localg.field_fileType), Long.valueOf(bo.anU() - localg.field_startTime) });
    }
    this.fyL.remove(paramString);
    ab.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelSendTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramString, localg, Integer.valueOf(0) });
    AppMethodBeat.o(78051);
    return true;
  }

  public final boolean rO(String paramString)
  {
    AppMethodBeat.i(78052);
    com.tencent.mm.i.g localg = (com.tencent.mm.i.g)this.fyM.remove(paramString);
    if (localg != null)
    {
      if ((localg.field_fileType != com.tencent.mm.i.a.efP) && (localg.field_fileType != com.tencent.mm.i.a.efR))
        break label156;
      f.afy();
      a.rK(paramString);
    }
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(10769, new Object[] { Integer.valueOf(c.fzg), Integer.valueOf(localg.field_fileType), Long.valueOf(bo.anU() - localg.field_startTime) });
      this.fyL.remove(paramString);
      this.fyN.remove(paramString);
      ab.i("MicroMsg.CdnTransportService", "summersafecdn cdntra cancelRecvTask mediaid:%s mapremove:%s engine ret:%d", new Object[] { paramString, localg, Integer.valueOf(0) });
      AppMethodBeat.o(78052);
      return true;
      label156: if (localg.egs)
      {
        f.afy();
        a.rL(paramString);
      }
      else
      {
        f.afy();
        a.rG(paramString);
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(78047);
    if (com.tencent.mm.kernel.g.RN().QY())
      com.tencent.mm.kernel.g.RP().Ry().b(this);
    this.fyH.removeCallbacksAndMessages(null);
    com.tencent.mm.kernel.g.RO().b(this.fyJ);
    com.tencent.mm.kernel.g.RO().eJo.b(379, this);
    com.tencent.mm.sdk.b.a.xxA.d(this.fyI);
    AppMethodBeat.o(78047);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.b
 * JD-Core Version:    0.6.2
 */