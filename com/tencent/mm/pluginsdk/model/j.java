package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.j.a.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.n;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public final class j extends Thread
{
  private static int ehv;
  private static HashMap<String, j.b> uPs;
  private static Object uPt;
  private static az uPu;
  private Context context;
  private Intent intent;
  private boolean isStop;
  private String talker;
  private List<String> uPi;
  private List<Integer> uPj;
  private List<String> uPk;
  private List<String> uPl;
  private List<Integer> uPm;
  private int vbg;
  private j.a vbh;

  static
  {
    AppMethodBeat.i(50997);
    uPs = new HashMap();
    uPt = new byte[0];
    AppMethodBeat.o(50997);
  }

  public j(Context paramContext, List<String> paramList, Intent paramIntent, String paramString, int paramInt, j.a parama)
  {
    AppMethodBeat.i(50974);
    this.context = paramContext;
    this.uPi = paramList;
    this.intent = paramIntent;
    this.uPj = new ArrayList();
    this.uPk = new ArrayList();
    this.uPl = new ArrayList();
    this.uPm = new ArrayList();
    this.vbh = parama;
    this.talker = paramString;
    this.vbg = paramInt;
    AppMethodBeat.o(50974);
  }

  private void E(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(50976);
    String str1 = t.ug((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
    o.all();
    String str2 = t.ui(str1);
    o.all();
    String str3 = t.uh(str1);
    boolean bool1 = at.is2G(ah.getContext());
    String str4 = com.tencent.mm.compatible.j.a.i(paramContext, paramIntent);
    if (bo.isNullOrNil(str4))
    {
      ab.e("MicroMsg.ImportMultiVideo", "GetVideoMetadata filed.");
      a(-50005, str1, str4, 0, null, paramIntent);
      AppMethodBeat.o(50976);
    }
    while (true)
    {
      label91: return;
      boolean bool2 = c.vC(str4);
      int i = (int)com.tencent.mm.vfs.e.asZ(str4);
      VideoTransPara localVideoTransPara;
      int j;
      if (bool2)
      {
        ab.i("MicroMsg.ImportMultiVideo", "mp4 format: %s", new Object[] { Boolean.valueOf(bool2) });
        PInt localPInt = new PInt();
        localVideoTransPara = a(str4, localPInt);
        j = localPInt.value;
      }
      while (true)
      {
        ab.i("MicroMsg.ImportMultiVideo", "check remuxing, ret %d isMp4 %b length %d", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool2), Integer.valueOf(i) });
        switch (j)
        {
        default:
          ab.e("MicroMsg.ImportMultiVideo", "unknown check type");
          a(-50001, str1, str4, 0, null, paramIntent);
          AppMethodBeat.o(50976);
          break label91;
          if (bool1);
          for (j = 10485760; ; j = 26214400)
          {
            if (i <= j)
              break label316;
            j = -5;
            localVideoTransPara = null;
            break;
          }
          label316: ab.i("MicroMsg.ImportMultiVideo", "mp4 format: %s", new Object[] { Boolean.valueOf(bool2) });
          j = 1;
          localVideoTransPara = null;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 0:
        case -1:
        case -6:
        case -4:
        case -3:
        case -2:
        case -5:
        }
      }
      if (i > 26214400)
      {
        a(-50002, str1, str4, 0, null, paramIntent);
        i = 0;
        j = -50002;
      }
      try
      {
        while (true)
        {
          paramContext = com.tencent.mm.compatible.j.a.j(paramContext, paramIntent);
          if (paramContext != null)
            break label503;
          ab.e("MicroMsg.ImportMultiVideo", "GetVideoMetadata filed.");
          a(-50005, str1, str4, 0, null, paramIntent);
          AppMethodBeat.o(50976);
          break;
          i = 0;
          j = 0;
          continue;
          i = 1;
          j = 0;
        }
        a(-50007, str1, str4, 0, null, paramIntent);
        AppMethodBeat.o(50976);
        continue;
        a(-50002, str1, str4, 0, null, paramIntent);
        AppMethodBeat.o(50976);
        continue;
        a(-50008, str1, str4, 0, null, paramIntent);
        AppMethodBeat.o(50976);
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
          paramContext = null;
        }
      }
      label503: int k;
      label533: int m;
      int n;
      if (i == 0)
      {
        com.tencent.mm.vfs.e.y(str4, str3);
        dT(str3, this.vbg);
        e(false, str4, str3);
        k = bo.mA(paramContext.duration);
        m = 1;
        n = 1;
        if (paramContext.bitmap != null)
          n = m;
      }
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramContext.bitmap, 60, Bitmap.CompressFormat.JPEG, str2, true);
        n = 0;
        m = 0;
        ou(true);
        n = m;
        if (n == 0);
      }
      catch (Exception paramContext)
      {
        try
        {
          ou(false);
          com.tencent.mm.sdk.platformtools.d.a(com.tencent.mm.sdk.platformtools.d.au(-16777216, 320, 480), 60, Bitmap.CompressFormat.JPEG, str2, true);
          n = j;
          if (i == 0)
          {
            n = j;
            if (!com.tencent.mm.vfs.e.ct(str3))
              n = -50003;
          }
          if (!com.tencent.mm.vfs.e.ct(str2))
            n = -50004;
          a(n, str1, str4, k, localVideoTransPara, paramIntent);
          AppMethodBeat.o(50976);
          continue;
          j = -50006;
          break label533;
          paramContext = paramContext;
          ab.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
        }
        catch (Exception paramContext)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.ImportMultiVideo", paramContext, "", new Object[0]);
        }
      }
    }
  }

  private static VideoTransPara a(String paramString, PInt paramPInt)
  {
    Object localObject = null;
    AppMethodBeat.i(50985);
    if (com.tencent.mm.modelcontrol.d.afF().rT(paramString))
    {
      ab.i("MicroMsg.ImportMultiVideo", "check remuxing, this video had wx meta do not remuxing. %s ", new Object[] { paramString });
      paramPInt.value = 1;
      dhg();
      AppMethodBeat.o(50985);
      paramString = localObject;
    }
    VideoTransPara localVideoTransPara2;
    while (true)
    {
      return paramString;
      VideoTransPara localVideoTransPara1 = com.tencent.mm.bj.e.uE(paramString);
      Boolean localBoolean = Boolean.valueOf(com.tencent.mm.bj.e.uD(paramString));
      ab.d("MicroMsg.ImportMultiVideo", "check remuxing old para %s", new Object[] { localVideoTransPara1 });
      localVideoTransPara2 = com.tencent.mm.modelcontrol.d.afF().b(localVideoTransPara1);
      if (localVideoTransPara2 == null)
      {
        ab.i("MicroMsg.ImportMultiVideo", "get C2C album video para is null. old para %s", new Object[] { localVideoTransPara1 });
        paramPInt.value = -5;
        AppMethodBeat.o(50985);
        paramString = localObject;
      }
      else
      {
        ab.d("MicroMsg.ImportMultiVideo", "check remuxing new para %s", new Object[] { localVideoTransPara2 });
        if ((localVideoTransPara1.videoBitrate <= 640000) || (localVideoTransPara2.videoBitrate > localVideoTransPara1.videoBitrate))
        {
          ab.i("MicroMsg.ImportMultiVideo", "new bitrate is bigger than old bitrate %s %s", new Object[] { localVideoTransPara2, localVideoTransPara1 });
          if (localBoolean.booleanValue())
          {
            paramPInt.value = 0;
            AppMethodBeat.o(50985);
            paramString = localVideoTransPara1;
          }
          else
          {
            paramPInt.value = 1;
            AppMethodBeat.o(50985);
            paramString = localObject;
          }
        }
        else if ((localVideoTransPara1.fps >= 45) && (localVideoTransPara1.duration * 1000 >= 180000))
        {
          paramPInt.value = -6;
          AppMethodBeat.o(50985);
          paramString = localObject;
        }
        else
        {
          if (!localBoolean.booleanValue())
            break;
          paramPInt.value = 0;
          AppMethodBeat.o(50985);
          paramString = localVideoTransPara2;
        }
      }
    }
    boolean bool = at.is2G(ah.getContext());
    int i = localVideoTransPara2.width;
    int j = localVideoTransPara2.height;
    int k;
    if (bool)
    {
      k = 10485760;
      label325: if (!bool)
        break label364;
    }
    label364: for (double d = 60000.0D; ; d = 300000.0D)
    {
      paramPInt.value = SightVideoJNI.shouldRemuxing(paramString, i, j, k, d, 1000000);
      break;
      k = 26214400;
      break label325;
    }
  }

  private void a(int paramInt1, String paramString1, String paramString2, int paramInt2, VideoTransPara paramVideoTransPara, Intent arg6)
  {
    AppMethodBeat.i(50978);
    ab.i("MicroMsg.ImportMultiVideo", "finish to import %s to %s | ret %d | duration %d", new Object[] { paramString2, paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    e(paramInt1, paramString1, paramString2, paramInt2);
    if (paramInt1 == -50002)
    {
      dhd();
      a(this.talker, paramString1, paramString2, ???, paramInt2, 141);
      AppMethodBeat.o(50978);
    }
    while (true)
    {
      return;
      if (paramInt1 == -50008)
      {
        dhf();
        a(this.talker, paramString1, paramString2, ???, paramInt2, 140);
        AppMethodBeat.o(50978);
      }
      else if (paramInt1 == -50006)
      {
        if (u.t(paramString1, this.talker, paramString2) < 0L)
        {
          a(this.talker, paramString1, paramString2, ???, paramInt2, 142);
          ab.e("MicroMsg.ImportMultiVideo", "prepare");
          AppMethodBeat.o(50978);
        }
        else
        {
          if (uPu == null)
            uPu = new az(5, "remuxing-thread-" + System.currentTimeMillis(), 1, Looper.getMainLooper());
          j.b localb = new j.b((byte)0);
          synchronized (uPt)
          {
            uPs.put(paramString1, localb);
            localb.fileName = paramString1;
            localb.fUG = paramString2;
            o.all();
            localb.hzq = t.uh(paramString1);
            localb.vbg = this.vbg;
            localb.toUser = this.talker;
            localb.fWR = paramVideoTransPara;
            localb.ozx = com.tencent.mm.bj.e.uD(paramString2);
            localb.vbj = new com.tencent.mm.bj.g();
            uPu.e(localb);
            AppMethodBeat.o(50978);
          }
        }
      }
      else
      {
        if (paramInt1 >= 0)
          break;
        dhe();
        a(this.talker, paramString1, paramString2, ???, paramInt2, 142);
        AppMethodBeat.o(50978);
      }
    }
    u.c(paramString1, paramInt2, this.talker, paramString2);
    u.uo(paramString1);
    if (this.vbg == 1);
    for (paramInt1 = 8; ; paramInt1 = 1)
    {
      o.all();
      paramString1 = t.uh(paramString1);
      n.alj().a(paramString2, paramString1, this.talker, "", "", paramInt1, 2);
      AppMethodBeat.o(50978);
      break;
    }
  }

  private void a(String paramString1, String paramString2, String paramString3, Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50979);
    Object localObject = new bi();
    ((bi)localObject).setStatus(5);
    ((bi)localObject).ju(paramString1);
    ((bi)localObject).eJ(bf.oC(paramString1));
    ((bi)localObject).hO(1);
    ((bi)localObject).jv(paramString2);
    ((bi)localObject).setType(43);
    long l = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().Z((bi)localObject);
    ab.i("MicroMsg.ImportMultiVideo", "after update msgInfo, localId[%d] svrId[%d] talker[%s] type[%d] isSend[%d] imgPath[%s], status[%d] createTime[%d]", new Object[] { Long.valueOf(((cy)localObject).field_msgId), Long.valueOf(((cy)localObject).field_msgSvrId), ((cy)localObject).field_talker, Integer.valueOf(((bi)localObject).getType()), Integer.valueOf(((cy)localObject).field_isSend), ((cy)localObject).field_imgPath, Integer.valueOf(((cy)localObject).field_status), Long.valueOf(((cy)localObject).field_createTime) });
    if (-1L == l)
    {
      ab.e("MicroMsg.ImportMultiVideo", "[insertErrMsg] :%s", new Object[] { paramString1 });
      AppMethodBeat.o(50979);
    }
    while (true)
    {
      return;
      int i;
      if (u.ut(paramString2) == null)
      {
        o.all();
        localObject = t.ui(paramString2);
        i = paramInt1;
      }
      try
      {
        paramIntent = com.tencent.mm.compatible.j.a.j(this.context, paramIntent);
        if (paramIntent != null)
        {
          i = paramInt1;
          if (paramIntent.bitmap != null)
          {
            i = paramInt1;
            paramInt1 = bo.mA(paramIntent.duration);
            i = paramInt1;
            com.tencent.mm.sdk.platformtools.d.a(paramIntent.bitmap, 60, Bitmap.CompressFormat.JPEG, (String)localObject, true);
          }
        }
        while (true)
        {
          int j = t.uj((String)localObject);
          o.all();
          i = t.uj(t.uh(paramString2));
          paramIntent = new s();
          paramIntent.fileName = paramString2;
          if (i <= 0)
            break label532;
          paramIntent.frO = i;
          paramIntent.fXa = j;
          paramIntent.fXd = paramInt1;
          paramIntent.cIS = paramString1;
          paramIntent.fWW = ((String)com.tencent.mm.kernel.g.RP().Ry().get(2, ""));
          paramIntent.createTime = bo.anT();
          paramIntent.fXb = bo.anT();
          paramIntent.fXj = null;
          paramIntent.fUG = paramString3;
          if (!bo.isNullOrNil(paramString3))
            paramIntent.fXh = 1;
          paramIntent.fXk = -1;
          paramIntent.status = paramInt2;
          paramIntent.fXe = ((int)l);
          if (!o.all().b(paramIntent))
            ab.e("MicroMsg.ImportMultiVideo", "[insertErrMsg] localMsgId:%s", new Object[] { Long.valueOf(l) });
          AppMethodBeat.o(50979);
          break;
          i = paramInt1;
          com.tencent.mm.sdk.platformtools.d.a(com.tencent.mm.sdk.platformtools.d.au(-16777216, 320, 480), 60, Bitmap.CompressFormat.JPEG, (String)localObject, true);
        }
      }
      catch (Exception paramIntent)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.ImportMultiVideo", paramIntent, "", new Object[0]);
          paramInt1 = i;
          continue;
          label532: i = 0;
        }
      }
    }
  }

  public static boolean aiB(String paramString)
  {
    AppMethodBeat.i(50983);
    synchronized (uPt)
    {
      boolean bool = uPs.containsKey(paramString);
      ab.i("MicroMsg.ImportMultiVideo", "check %s is remuxing, ret %B", new Object[] { paramString, Boolean.valueOf(bool) });
      AppMethodBeat.o(50983);
      return bool;
    }
  }

  public static void aiC(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(50984);
    synchronized (uPt)
    {
      if (uPs.remove(paramString) != null)
      {
        ab.i("MicroMsg.ImportMultiVideo", "remove remuxing job, filename %s, ret %B", new Object[] { paramString, Boolean.valueOf(bool) });
        AppMethodBeat.o(50984);
        return;
      }
      bool = false;
    }
  }

  public static void c(String paramString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(50980);
    try
    {
      localMediaMetadataRetriever = new android/media/MediaMetadataRetriever;
      localMediaMetadataRetriever.<init>();
    }
    finally
    {
      try
      {
        localMediaMetadataRetriever.setDataSource(paramString);
        int i = bo.getInt(localMediaMetadataRetriever.extractMetadata(18), 0);
        int j = bo.getInt(localMediaMetadataRetriever.extractMetadata(19), 0);
        paramArrayOfInt[0] = i;
        paramArrayOfInt[1] = j;
        int k = 0;
        if (k < 3)
          if ((i % 2 != 0) || (j % 2 != 0))
          {
            localMediaMetadataRetriever.release();
            if (paramArrayOfInt[0] % 2 != 0)
              paramArrayOfInt[0] += 1;
            if (paramArrayOfInt[1] % 2 != 0)
              paramArrayOfInt[1] += 1;
            AppMethodBeat.o(50980);
          }
        while (true)
        {
          return;
          if (((i >= j) && ((i <= 640) || (j <= 480))) || ((i <= j) && ((i <= 480) || (j <= 640))))
          {
            paramArrayOfInt[0] = i;
            paramArrayOfInt[1] = j;
            localMediaMetadataRetriever.release();
            if (paramArrayOfInt[0] % 2 != 0)
              paramArrayOfInt[0] += 1;
            if (paramArrayOfInt[1] % 2 != 0)
            {
              paramArrayOfInt[1] += 1;
              AppMethodBeat.o(50980);
            }
          }
          else
          {
            i /= 2;
            j /= 2;
            k++;
            break;
            localObject1 = finally;
            paramString = null;
            if (paramString != null)
              paramString.release();
            if (paramArrayOfInt[0] % 2 != 0)
              paramArrayOfInt[0] += 1;
            if (paramArrayOfInt[1] % 2 != 0)
              paramArrayOfInt[1] += 1;
            AppMethodBeat.o(50980);
            throw localObject1;
            AppMethodBeat.o(50980);
          }
        }
      }
      finally
      {
        while (true)
        {
          MediaMetadataRetriever localMediaMetadataRetriever;
          paramString = localMediaMetadataRetriever;
        }
      }
    }
  }

  private static void dT(String paramString, int paramInt)
  {
    AppMethodBeat.i(50989);
    int i;
    int j;
    if (paramInt == 1)
    {
      i = 220;
      j = 228;
    }
    for (paramInt = 219; ; paramInt = 233)
    {
      long l = com.tencent.mm.vfs.e.asZ(paramString);
      i = bo.h((Integer)com.tencent.mm.plugin.report.service.h.a((int)(l / 1024L), new int[] { 512, 1024, 2048, 5120, 8192, 10240, 15360, 20480 }, i, j));
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, i, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, paramInt, 1L, false);
      ab.d("MicroMsg.ImportMultiVideo", "report no compress video report id : " + i + " file len : " + l / 1024L + "K");
      AppMethodBeat.o(50989);
      return;
      i = 234;
      j = 242;
    }
  }

  public static void dhc()
  {
    AppMethodBeat.i(50982);
    while (true)
    {
      int i;
      synchronized (uPt)
      {
        i = uPs.size();
        uPs.clear();
        if (uPu == null)
        {
          ab.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, worker is null, setCount %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(50982);
          return;
        }
      }
      ab.i("MicroMsg.ImportMultiVideo", "do clear remuxing job, setCount %d, workerJobCount %d", new Object[] { Integer.valueOf(i), Integer.valueOf(uPu.xAV.size()) });
      uPu.xAV.clear();
      uPu = null;
      AppMethodBeat.o(50982);
    }
  }

  private void dhd()
  {
    AppMethodBeat.i(50987);
    if (this.vbg == 1);
    for (int i = 230; ; i = 245)
    {
      ab.d("MicroMsg.ImportMultiVideo", "report video too big reportId : " + i + " importType : " + this.vbg);
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, i, 1L, false);
      AppMethodBeat.o(50987);
      return;
    }
  }

  private void dhe()
  {
    AppMethodBeat.i(50988);
    if (this.vbg == 1);
    for (int i = 229; ; i = 244)
    {
      ab.d("MicroMsg.ImportMultiVideo", "report video file error reportId : " + i + " importType : " + this.vbg);
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, i, 1L, false);
      AppMethodBeat.o(50988);
      return;
    }
  }

  private static void dhf()
  {
    AppMethodBeat.i(50990);
    com.tencent.mm.plugin.report.service.h.pYm.a(106L, 210L, 1L, false);
    AppMethodBeat.o(50990);
  }

  private static void dhg()
  {
    AppMethodBeat.i(50991);
    com.tencent.mm.plugin.report.service.h.pYm.a(422L, 51L, 1L, false);
    AppMethodBeat.o(50991);
  }

  private void e(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(50981);
      this.uPj.add(Integer.valueOf(paramInt1));
      this.uPk.add(paramString1);
      this.uPl.add(paramString2);
      this.uPm.add(Integer.valueOf(paramInt2));
      AppMethodBeat.o(50981);
      return;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }

  private static void e(boolean paramBoolean, String paramString1, String paramString2)
  {
    AppMethodBeat.i(50992);
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      com.tencent.mm.modelvideo.a.j(i, paramString1, paramString2);
      AppMethodBeat.o(50992);
      return;
    }
  }

  private void ou(boolean paramBoolean)
  {
    AppMethodBeat.i(50986);
    int i;
    if (this.vbg == 1)
      if (paramBoolean)
        i = 217;
    while (true)
    {
      ab.d("MicroMsg.ImportMultiVideo", "report video thumb reportId : " + i + " had Thumb : " + paramBoolean + " importType : " + this.vbg);
      com.tencent.mm.plugin.report.service.h.pYm.a(106L, i, 1L, false);
      AppMethodBeat.o(50986);
      return;
      i = 218;
      continue;
      if (paramBoolean)
        i = 231;
      else
        i = 232;
    }
  }

  public final void dhb()
  {
    AppMethodBeat.i(50977);
    this.isStop = true;
    interrupt();
    AppMethodBeat.o(50977);
  }

  public final void run()
  {
    AppMethodBeat.i(50975);
    int i;
    if ((this.uPi != null) && (this.uPi.size() > 0))
      i = 0;
    while ((i < this.uPi.size()) && (!this.isStop))
    {
      ab.i("MicroMsg.ImportMultiVideo", "start to import %s", new Object[] { this.uPi.get(i) });
      Intent localIntent = new Intent();
      localIntent.setData(Uri.parse("file://" + (String)this.uPi.get(i)));
      E(this.context, localIntent);
      i++;
      continue;
      E(this.context, this.intent);
    }
    if ((this.vbh != null) && (!this.isStop))
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(50971);
          j.a locala = j.e(j.this);
          j.a(j.this);
          j.b(j.this);
          j.c(j.this);
          j.d(j.this);
          locala.dhi();
          AppMethodBeat.o(50971);
        }
      });
    AppMethodBeat.o(50975);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.j
 * JD-Core Version:    0.6.2
 */