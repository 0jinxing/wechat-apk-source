package com.tencent.mm.modelstat;

import android.content.Intent;
import android.os.Looper;
import com.tencent.mars.xlog.LogLogic;
import com.tencent.mars.xlog.Xlog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.q;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.ai.e.b;
import com.tencent.mm.ai.e.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.cf.c;
import com.tencent.mm.cf.d.a;
import com.tencent.mm.ci.f;
import com.tencent.mm.g.a.ip;
import com.tencent.mm.g.a.ub;
import com.tencent.mm.kernel.h;
import com.tencent.mm.loader.j.b;
import com.tencent.mm.modelstat.a.b.1;
import com.tencent.mm.network.a.b.a;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.File;
import java.util.Map;

public final class l extends b.a
  implements com.tencent.mm.ai.e
{
  public static long b(File paramFile, long paramLong)
  {
    AppMethodBeat.i(78748);
    long l1 = 0L;
    long l2 = l1;
    long l3;
    try
    {
      paramFile = paramFile.listFiles();
      int i = 0;
      l2 = l1;
      l3 = l1;
      if (i < paramFile.length)
      {
        l2 = l1;
        if (paramFile[i].isDirectory())
          l2 = l1;
        for (l1 += b(paramFile[i], paramLong); ; l1 += l3)
        {
          i++;
          break;
          l2 = l1;
          if (paramFile[i].length() > paramLong)
          {
            l2 = l1;
            ab.i("MicroMsg.NetStatMsgExtension", "getFolderSize filesize:%s [%s]", new Object[] { Long.valueOf(paramFile[i].length()), paramFile[i].getPath() });
          }
          l2 = l1;
          l3 = paramFile[i].length();
        }
      }
    }
    catch (Exception paramFile)
    {
      ab.e("MicroMsg.NetStatMsgExtension", "getFolderSize :%s", new Object[] { bo.l(paramFile) });
      l3 = l2;
      AppMethodBeat.o(78748);
    }
    return l3;
  }

  public static void c(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    AppMethodBeat.i(78752);
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      AppMethodBeat.o(78752);
      return;
    }
    switch (paramInt1)
    {
    case 6:
    case 7:
    default:
    case 5:
    case 4:
    case 8:
    }
    while (true)
    {
      AppMethodBeat.o(78752);
      break;
      ab.d("MicroMsg.NetStatMsgExtension", "send bytes flow:".concat(String.valueOf(paramInt3)));
      if (paramBoolean)
      {
        n.I(0, paramInt3, paramInt2);
        AppMethodBeat.o(78752);
        break;
      }
      n.J(0, paramInt3, paramInt2);
      AppMethodBeat.o(78752);
      break;
      ab.d("MicroMsg.NetStatMsgExtension", "recv bytes flow:".concat(String.valueOf(paramInt3)));
      if (paramBoolean)
      {
        n.I(paramInt3, 0, paramInt2);
        AppMethodBeat.o(78752);
        break;
      }
      n.J(paramInt3, 0, paramInt2);
      AppMethodBeat.o(78752);
      break;
      aj.amA("dns_failed_report");
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(78750);
    com.tencent.mm.kernel.g.RS().m(new l.3(this, paramInt1, paramInt2, paramString1, paramInt3, paramString2, paramBoolean), 3000L);
    AppMethodBeat.o(78750);
  }

  public final void a(e.c paramc)
  {
  }

  public final e.b b(e.a parama)
  {
    AppMethodBeat.i(78749);
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      ab.e("MicroMsg.NetStatMsgExtension", "skip ipxx stat while account not set");
      AppMethodBeat.o(78749);
    }
    while (true)
    {
      return null;
      parama = parama.eAB.vED.wVI;
      ab.d("MicroMsg.NetStatMsgExtension", "onPreAddMessage %s", new Object[] { parama });
      if (bo.isNullOrNil(parama))
      {
        AppMethodBeat.o(78749);
        continue;
      }
      ab.i("MicroMsg.NetStatMsgExtension", "get ipxx cmd=%s", new Object[] { parama });
      Object localObject1 = br.z(parama, "cmd");
      long l;
      Object localObject2;
      if (localObject1 == null)
      {
        localObject1 = br.z(parama, "ClearCache");
        if (localObject1 != null)
        {
          l = bo.getLong((String)((Map)localObject1).get(".ClearCache.androidCacheMask"), 0L);
          localObject1 = (String)((Map)localObject1).get(".ClearCache.message");
          localObject2 = new Intent();
          ((Intent)localObject2).putExtra("key_mask", l);
          ((Intent)localObject2).putExtra("key_message", (String)localObject1);
          com.tencent.mm.bp.d.f(ah.getContext(), ".ui.ClearCacheUI", (Intent)localObject2);
        }
        label171: ab.dot();
        com.tencent.mm.kernel.g.Rg().ftA.qs(parama);
      }
      try
      {
        Thread.sleep(50L, 0);
        label193: LogLogic.initIPxxLogInfo();
        MMProtocalJni.setProtocalJniLogLevel(new Xlog().getLogLevel());
        AppMethodBeat.o(78749);
        continue;
        int i = bo.getInt((String)((Map)localObject1).get(".cmd.trace.$code"), -1);
        if (i > 0)
        {
          if (i == 6)
          {
            parama = new ub();
            com.tencent.mm.sdk.b.a.xxA.m(parama);
            AppMethodBeat.o(78749);
            continue;
          }
          parama = (String)((Map)localObject1).get(".cmd.trace.$class");
          j = bo.getInt((String)((Map)localObject1).get(".cmd.trace.$size"), 0);
          int k = bo.getInt((String)((Map)localObject1).get(".cmd.trace.$type"), 0);
          com.tencent.mm.cf.d.dvV().c(new d.a(parama, i, j, k));
          AppMethodBeat.o(78749);
          continue;
        }
        int j = bo.getInt((String)((Map)localObject1).get(".cmd.hprof.$type"), -1);
        if (j > 0)
        {
          ab.d("MicroMsg.NetStatMsgExtension", "hprof type: %d", new Object[] { Integer.valueOf(j) });
          c.MK(j);
          AppMethodBeat.o(78749);
          continue;
        }
        if ("android".equalsIgnoreCase((String)((Map)localObject1).get(".cmd.prconfig.$os")))
        {
          parama = new ip();
          parama.cDI.cDJ = ((String)((Map)localObject1).get(".cmd.prconfig.xml.$url"));
          parama.cDI.cDK = ((String)((Map)localObject1).get(".cmd.prconfig.xml.$signature"));
          parama.cDI.cDL = ((String)((Map)localObject1).get(".cmd.prconfig.$url"));
          parama.cDI.cDM = ((String)((Map)localObject1).get(".cmd.prconfig.$signature"));
          com.tencent.mm.sdk.b.a.xxA.a(parama, Looper.myLooper());
          AppMethodBeat.o(78749);
          continue;
        }
        j = bo.getInt((String)((Map)localObject1).get(".cmd.clearfile.$fb"), -1);
        if (j == 1)
        {
          l = bo.getInt((String)((Map)localObject1).get(".cmd.clearfile.$ps"), 1048576);
          com.tencent.mm.kernel.g.RS().aa(new l.1(this, l));
          label588: j = bo.getInt((String)((Map)localObject1).get(".cmd.updzh.$pt"), -1);
          localObject2 = (String)((Map)localObject1).get(".cmd.updzh.$pd");
          ab.d("MicroMsg.NetStatMsgExtension", "StackReportUploader pt:%d pd:%s", new Object[] { Integer.valueOf(j), localObject2 });
          if ((j > 0) && (!bo.isNullOrNil((String)localObject2)))
            com.tencent.mm.kernel.g.RS().aa(new l.2(this, j, (String)localObject2));
          j = bo.getInt((String)((Map)localObject1).get(".cmd.uploadx5log.type"), -1);
          if (j <= 0)
            break label171;
          parama = (String)((Map)localObject1).get(".cmd.uploadx5log.date");
          localObject1 = (String)((Map)localObject1).get(".cmd.uploadx5log.process");
          ab.i("MicroMsg.UploadX5Log", "upload, date %s,process %s,type %d", new Object[] { parama, localObject1, Integer.valueOf(j) });
          if (j != 1)
            break label1131;
          if ((!bo.isNullOrNil(parama)) && (!bo.isNullOrNil((String)localObject1)))
            break label1078;
          ab.w("MicroMsg.UploadX5Log", "date or process is null,date %s,process %s", new Object[] { parama, localObject1 });
        }
        while (true)
        {
          AppMethodBeat.o(78749);
          break;
          if (j == 2)
          {
            localObject2 = (String)((Map)localObject1).get(".cmd.clearfile.$pd");
            File localFile = new File((String)localObject2);
            if (localFile.exists())
            {
              l = localFile.length();
              label849: ab.i("MicroMsg.NetStatMsgExtension", "clearfile delete :[%s] length:%s", new Object[] { localObject2, Long.valueOf(l) });
              com.tencent.mm.a.e.deleteFile((String)localObject2);
              localFile = new File((String)localObject2);
              if (!localFile.exists())
                break label938;
            }
            label938: for (l = localFile.length(); ; l = -1L)
            {
              ab.i("MicroMsg.NetStatMsgExtension", "clearfile delete finish :[%s] length:%s", new Object[] { localObject2, Long.valueOf(l) });
              break;
              l = -1L;
              break label849;
            }
          }
          if (j != 3)
            break label588;
          ab.i("MicroMsg.NetStatMsgExtension", "running  clearfile start:" + com.tencent.mm.kernel.g.RP().Rv() + ".tem");
          com.tencent.mm.a.e.deleteFile(com.tencent.mm.kernel.g.RP().Rv() + ".tem");
          com.tencent.mm.a.e.deleteFile(com.tencent.mm.kernel.g.RP().Rw() + ".tem");
          ab.i("MicroMsg.NetStatMsgExtension", "running  clearfile end:" + com.tencent.mm.kernel.g.RP().Rv() + ".tem");
          break label588;
          label1078: label1131: for (parama = String.format("%s/tencent/tbs_live_log/com.tencent.mm/com.tencent.mm_%s_%s.livelog", new Object[] { b.eSl, localObject1, parama }); ; parama = b.eSl + "/Android/data/com.tencent.mm/files/tbslog/tbslog.txt")
          {
            localObject1 = new File(parama);
            if (((File)localObject1).exists())
              break label1157;
            ab.i("MicroMsg.UploadX5Log", "upload file not exists");
            break;
          }
          label1157: parama = q.b((File)localObject1, false, parama + ".zip");
          if (parama == null)
          {
            ab.i("MicroMsg.UploadX5Log", "zipPath is null");
          }
          else
          {
            parama = new File(parama);
            if (!parama.exists())
              ab.i("MicroMsg.UploadX5Log", "upload zip file not exists");
            else
              com.tencent.mm.ci.g.da(parama).h(new b.1(j));
          }
        }
      }
      catch (Exception parama)
      {
        break label193;
      }
    }
  }

  public final void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(78751);
    if (!com.tencent.mm.kernel.g.RN().QY())
      AppMethodBeat.o(78751);
    while (true)
    {
      return;
      if (com.tencent.mm.kernel.g.RQ().eKi.eKC)
        break;
      ab.i("MicroMsg.NetStatMsgExtension", "kernel has not startup");
      AppMethodBeat.o(78751);
    }
    ab.i("MicroMsg.NetStatMsgExtension", "reportNetFlow wifi[%d, %d] mobile[%d, %d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if (paramInt1 > 0)
    {
      label96: if (paramInt2 <= 0)
        break label136;
      label100: n.I(paramInt1, paramInt2, 0);
      if (paramInt3 <= 0)
        break label141;
      label110: if (paramInt4 <= 0)
        break label146;
    }
    while (true)
    {
      n.J(paramInt3, paramInt4, 0);
      AppMethodBeat.o(78751);
      break;
      paramInt1 = 0;
      break label96;
      label136: paramInt2 = 0;
      break label100;
      label141: paramInt3 = 0;
      break label110;
      label146: paramInt4 = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.l
 * JD-Core Version:    0.6.2
 */