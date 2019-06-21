package com.tencent.mm.plugin.mmsight.model;

import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.protocal.protobuf.baa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;

public final class l
{
  public static boolean a(String paramString, VideoTransPara paramVideoTransPara, baa parambaa, d paramd)
  {
    AppMethodBeat.i(60311);
    Object localObject = parambaa;
    try
    {
      bool1 = bo.isNullOrNil(paramString);
      if ((bool1) || (paramVideoTransPara == null))
      {
        bool1 = false;
        AppMethodBeat.o(60311);
      }
      while (true)
      {
        return bool1;
        baa localbaa = parambaa;
        if (parambaa == null)
        {
          localObject = parambaa;
          localbaa = new com/tencent/mm/protocal/protobuf/baa;
          localObject = parambaa;
          localbaa.<init>();
        }
        localObject = localbaa;
        ab.i("MicroMsg.SightSendVideoLogic", "check localCaptureVideo %s videoPath %s videoParams %s, finishPreSendProcess: %s", new Object[] { Boolean.valueOf(localbaa.wDP), paramString, paramVideoTransPara, Boolean.valueOf(localbaa.wDT) });
        localObject = localbaa;
        label794: if (localbaa.wDT)
        {
          localObject = localbaa;
          ab.i("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
          bool1 = false;
          AppMethodBeat.o(60311);
        }
        else
        {
          localObject = localbaa;
          int i;
          int k;
          label458: boolean bool2;
          label491: float f1;
          if (localbaa.wDP)
          {
            localObject = localbaa;
            if (!bo.isNullOrNil(paramString))
            {
              localObject = localbaa;
              SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.afF().getWeixinMeta());
              localObject = localbaa;
              if (!bo.isNullOrNil(localbaa.wDS))
              {
                localObject = localbaa;
                SightVideoJNI.tagMp4RecordInfo(paramString, localbaa.wDS);
              }
              localObject = localbaa;
              long l = bo.yz();
              localObject = localbaa;
              SightVideoJNI.optimizeMP4(paramString);
              localObject = localbaa;
              ab.i("MicroMsg.SightSendVideoLogic", "optimizeMP4 used %sms", new Object[] { Long.valueOf(bo.az(l)) });
              localObject = localbaa;
              paramd.bOc();
              localObject = localbaa;
              parambaa = new android/media/MediaMetadataRetriever;
              localObject = localbaa;
              parambaa.<init>();
              localObject = localbaa;
              parambaa.setDataSource(paramString);
              localObject = localbaa;
              i = bo.getInt(parambaa.extractMetadata(18), 0);
              localObject = localbaa;
              j = bo.getInt(parambaa.extractMetadata(19), 0);
              localObject = localbaa;
              k = bo.getInt(parambaa.extractMetadata(20), 0);
              localObject = localbaa;
              parambaa.release();
              localObject = localbaa;
              ab.i("MicroMsg.SightSendVideoLogic", "videopath %d %d %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
              localObject = localbaa;
              ab.i("MicroMsg.SightSendVideoLogic", "videoParams %s %s %s", new Object[] { Integer.valueOf(paramVideoTransPara.width), Integer.valueOf(paramVideoTransPara.height), Integer.valueOf(paramVideoTransPara.videoBitrate) });
              localObject = localbaa;
              i = Math.min(i, j);
              localObject = localbaa;
              if (q.etj.etJ != 1)
                break label687;
              bool1 = true;
              localObject = localbaa;
              if (bo.getInt(((a)g.K(a.class)).Nu().getValue("MMSightCheckSendVideoBitrate"), 0) != 1)
                break label693;
              bool2 = true;
              localObject = localbaa;
              f1 = bo.getFloat(((a)g.K(a.class)).Nu().getValue("MMSightCheckSendVideoBitrateLimit"), 1.3F);
              localObject = localbaa;
              ab.i("MicroMsg.SightSendVideoLogic", "deviceConfigCheckBitrate: %s, serverConfigCheckBitrate: %s, bitrateLimitRatio: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Float.valueOf(f1) });
              if ((!bool1) && (!bool2))
                break label699;
            }
          }
          label687: label693: label699: for (int j = 1; ; j = 0)
          {
            localObject = localbaa;
            if (i > paramVideoTransPara.width)
            {
              localObject = localbaa;
              if ((i > paramVideoTransPara.width) && (i % 16 == 0))
              {
                localObject = localbaa;
                if (Math.abs(i - paramVideoTransPara.width) < 16);
              }
              else
              {
                if (j == 0)
                  break label794;
                localObject = localbaa;
                if (k < paramVideoTransPara.videoBitrate * f1)
                  break label794;
              }
            }
            localObject = localbaa;
            bool1 = localbaa.wDO;
            if (!bool1)
              break label705;
            bool1 = true;
            AppMethodBeat.o(60311);
            break;
            bool1 = false;
            AppMethodBeat.o(60311);
            break;
            bool1 = false;
            break label458;
            bool2 = false;
            break label491;
          }
          label705: if (j != 0)
          {
            float f2 = k;
            localObject = localbaa;
            if (f2 >= paramVideoTransPara.videoBitrate * f1)
            {
              localObject = localbaa;
              ab.i("MicroMsg.SightSendVideoLogic", "exceed video bitrate, need remux video");
              localObject = localbaa;
              h.pYm.a(440L, 205L, 1L, false);
              bool1 = true;
              AppMethodBeat.o(60311);
            }
          }
          else
          {
            localObject = localbaa;
            localbaa.wDT = true;
            bool1 = false;
            AppMethodBeat.o(60311);
            continue;
            bool1 = true;
            AppMethodBeat.o(60311);
          }
        }
      }
    }
    catch (Exception paramVideoTransPara)
    {
      while (true)
      {
        ab.e("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing error: %s %s", new Object[] { paramVideoTransPara.getMessage(), paramString });
        if (localObject != null)
          ((baa)localObject).wDT = true;
        boolean bool1 = false;
        AppMethodBeat.o(60311);
      }
    }
  }

  public static int b(String paramString, VideoTransPara paramVideoTransPara, baa parambaa, d paramd)
  {
    AppMethodBeat.i(60312);
    int i;
    if ((parambaa == null) || (!parambaa.wDP) || (!com.tencent.mm.vfs.e.ct(paramString)))
    {
      i = -1;
      AppMethodBeat.o(60312);
      return i;
    }
    if (parambaa.wDT)
      ab.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
    label789: label792: 
    while (true)
    {
      try
      {
        Object localObject1 = com.tencent.mm.vfs.e.atb(paramString);
        if (((String)localObject1).endsWith("/"))
          break label792;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = (String)localObject1 + "/";
        localObject2 = new com/tencent/mm/vfs/b;
        ((b)localObject2).<init>(paramString);
        localObject2 = ((b)localObject2).getName();
        i = ((String)localObject2).lastIndexOf('.');
        if (i <= 0)
          break label789;
        localObject2 = ((String)localObject2).substring(0, i);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject4 = (String)localObject1 + (String)localObject2 + "_hd";
        localObject3 = localObject4;
        if (paramString.endsWith(".mp4"))
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = (String)localObject4 + ".mp4";
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = (String)localObject1 + (String)localObject2 + "tempRemuxing.mp4";
        com.tencent.mm.vfs.e.y(paramString, (String)localObject3);
        ab.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, dir: %s, oldFileName: %s, hdFilePath: %s, remuxingOutputFile: %s extInfotrycount %d", new Object[] { localObject1, localObject2, localObject3, localObject4, Integer.valueOf(parambaa.wDQ) });
        localObject1 = new android/media/MediaMetadataRetriever;
        ((MediaMetadataRetriever)localObject1).<init>();
        ((MediaMetadataRetriever)localObject1).setDataSource((String)localObject3);
        int j = bo.getInt(((MediaMetadataRetriever)localObject1).extractMetadata(18), 0);
        int k = bo.getInt(((MediaMetadataRetriever)localObject1).extractMetadata(19), 0);
        i = Math.min(j, k);
        int m;
        if ((i <= paramVideoTransPara.width) || ((i > paramVideoTransPara.width) && (i % 16 == 0) && (Math.abs(i - paramVideoTransPara.width) < 16)))
        {
          m = k;
          n = j;
          ab.i("MicroMsg.SightSendVideoLogic", "start remuxing %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s videoParams: %s", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(m), paramVideoTransPara });
          long l = bo.yz();
          i = SightVideoJNI.remuxing((String)localObject3, (String)localObject4, n, m, paramVideoTransPara.videoBitrate, paramVideoTransPara.fzV, 8, paramVideoTransPara.fzU, 25.0F, 30.0F, null, 0, false);
          ab.i("MicroMsg.SightSendVideoLogic", "doremuxing finish %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s duration: %s, used %sms", new Object[] { paramString, Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(n), Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(bo.az(l)) });
          com.tencent.mm.vfs.e.aQ((String)localObject4, paramString);
          l = bo.yz();
          if (parambaa.wDP)
          {
            SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.afF().getWeixinMeta());
            if (!bo.isNullOrNil(parambaa.wDS))
              SightVideoJNI.tagMp4RecordInfo(paramString, parambaa.wDS);
            SightVideoJNI.optimizeMP4(paramString);
          }
          paramd.bOc();
          ab.i("MicroMsg.SightSendVideoLogic", "tagMP4Dscp used %sms", new Object[] { Long.valueOf(bo.az(l)) });
          AppMethodBeat.o(60312);
          break;
        }
        if (j < k)
        {
          i = paramVideoTransPara.width;
          d = 1.0D * j / i;
          n = (int)(k / d);
          int i1 = n;
          if (n % 2 != 0)
            i1 = n + 1;
          n = i;
          m = i1;
          if (i % 2 == 0)
            continue;
          n = i + 1;
          m = i1;
          continue;
        }
        int n = paramVideoTransPara.width;
        double d = 1.0D * k / n;
        i = (int)(j / d);
        continue;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg error: %s", new Object[] { paramString.getMessage() });
        i = -1;
        AppMethodBeat.o(60312);
      }
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.l
 * JD-Core Version:    0.6.2
 */