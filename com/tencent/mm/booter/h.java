package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.f.a;
import com.tencent.mm.ba.i;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.webwx.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;

public final class h
{
  public static void run()
  {
    AppMethodBeat.i(15851);
    Object localObject1 = com.tencent.mm.sdk.platformtools.ah.getContext();
    Object localObject4 = new h.1();
    if (localObject1 != null);
    try
    {
      localObject1 = ((Context)localObject1).getSharedPreferences("crash_status_file", 4);
      localObject5 = ((SharedPreferences)localObject1).getString("crashlist", "").split(";");
      if (localObject5 != null)
      {
        i = localObject5.length;
        if (i > 0);
      }
      else
      {
        localObject1 = com.tencent.mm.sdk.platformtools.ah.getContext();
        i = com.tencent.mm.m.g.Nu().getInt("AndroidGooglePlayCrashUploadSizeLimit", 3072);
        if ((localObject1 != null) && (i > 0))
          break label983;
        aw.ZK();
        if (com.tencent.mm.platformtools.ah.gb(com.tencent.mm.platformtools.ah.d((Long)c.Ry().get(ac.a.xIF, null))) > 21600000L)
        {
          com.tencent.mm.plugin.report.service.h.pYm.a(279L, com.tencent.mm.m.g.Nu().getInt("AndroidDynamicConfigVer", 0) % 16, 1L, false);
          aw.ZK();
          c.Ry().set(ac.a.xIF, Long.valueOf(com.tencent.mm.platformtools.ah.anU()));
        }
        aw.ZK();
        if (com.tencent.mm.platformtools.ah.gb(com.tencent.mm.platformtools.ah.d((Long)c.Ry().get(ac.a.xIG, null))) > 21600000L)
        {
          aw.ZK();
          c.Ry().set(ac.a.xIG, Long.valueOf(com.tencent.mm.platformtools.ah.anU()));
          localObject4 = o.all();
          localObject1 = new int[6];
          localObject1[0] = 0;
          localObject1[1] = 0;
          localObject1[2] = 0;
          localObject1[3] = 0;
          localObject1[4] = 0;
          localObject1[5] = 0;
          localObject1;
          try
          {
            localObject5 = "select status, videofuncflag, human from videoinfo2 where lastmodifytime > ".concat(String.valueOf(bo.anT() - 21600L));
            ab.i("MicroMsg.VideoInfoStorage", "reportVideoMsgCount sql:%s", new Object[] { localObject5 });
            localObject4 = ((t)localObject4).fni.a((String)localObject5, null, 2);
            while (true)
            {
              if (!((Cursor)localObject4).moveToNext())
                break label1109;
              i = ((Cursor)localObject4).getInt(0);
              j = ((Cursor)localObject4).getInt(1);
              localObject5 = ((Cursor)localObject4).getString(2);
              if (111 != i)
                break label1044;
              if (j != 3)
                break;
              i = 0;
              localObject1[i] += 1;
            }
          }
          catch (Exception localException)
          {
          }
        }
        long l = bo.a((Long)com.tencent.mm.kernel.g.RP().Ry().get(81939, null), 0L);
        if (bo.anU() - l <= 86400000L)
          break label1196;
        i = 1;
        if (i != 0)
          new i();
        l = System.currentTimeMillis();
        aw.ZK();
        bool = ((Boolean)c.Ry().get(233475, Boolean.FALSE)).booleanValue();
        aw.ZK();
        if (c.XM().dsw() > 0)
          break label1201;
        if (!bool)
        {
          aw.ZK();
          c.XR().aoX("officialaccounts");
          aw.ZK();
          c.Ry().set(233475, Boolean.TRUE);
        }
        com.tencent.mm.plugin.webwx.a.g.ddf().ddh().ddd();
        ab.i("MicroMsg.PostTaskLightweightJob", "use time %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        AppMethodBeat.o(15851);
        return;
      }
      Object localObject2 = localException.edit();
      ((SharedPreferences.Editor)localObject2).putString("crashlist", "");
      ((SharedPreferences.Editor)localObject2).commit();
      i = 0;
      label533: if (i < localObject5.length)
      {
        if (localObject5[i] != null)
          break label583;
        localObject2 = null;
        label547: if ((localObject2 != null) && (localObject2.length >= 2))
        {
          if (!localObject2[1].equals("anr"))
            break label596;
          ((f.a)localObject4).gj(10);
        }
      }
      while (true)
      {
        i++;
        break label533;
        break;
        label583: localObject2 = localObject5[i].split(",");
        break label547;
        label596: ((f.a)localObject4).gj(11);
        if ("com.tencent.mm".equals(localObject2[0]))
          ((f.a)localObject4).gj(14);
        if ("com.tencent.mm:push".equals(localObject2[0]))
          ((f.a)localObject4).gj(17);
        if ("com.tencent.mm:tools".equals(localObject2[0]))
          ((f.a)localObject4).gj(20);
        if ("com.tencent.mm:toolsmp".equals(localObject2[0]))
          ((f.a)localObject4).gj(20);
        if (localObject2[1].equals("java"))
        {
          ((f.a)localObject4).gj(12);
          if ("com.tencent.mm".equals(localObject2[0]))
            ((f.a)localObject4).gj(15);
          if ("com.tencent.mm:push".equals(localObject2[0]))
            ((f.a)localObject4).gj(18);
          if ("com.tencent.mm:tools".equals(localObject2[0]))
            ((f.a)localObject4).gj(21);
          if ("com.tencent.mm:toolsmp".equals(localObject2[0]))
            ((f.a)localObject4).gj(21);
        }
        if (localObject2[1].equals("jni"))
        {
          ((f.a)localObject4).gj(13);
          if ("com.tencent.mm".equals(localObject2[0]))
            ((f.a)localObject4).gj(16);
          if ("com.tencent.mm:push".equals(localObject2[0]))
            ((f.a)localObject4).gj(19);
          if ("com.tencent.mm:tools".equals(localObject2[0]))
            ((f.a)localObject4).gj(22);
          if ("com.tencent.mm:toolsmp".equals(localObject2[0]))
            ((f.a)localObject4).gj(22);
        }
        if (localObject2[1].equals("first"))
        {
          if ("com.tencent.mm".equals(localObject2[0]))
            ((f.a)localObject4).gj(23);
          if ("com.tencent.mm:push".equals(localObject2[0]))
            ((f.a)localObject4).gj(24);
          if ("com.tencent.mm:tools".equals(localObject2[0]))
            ((f.a)localObject4).gj(25);
          if ("com.tencent.mm:toolsmp".equals(localObject2[0]))
            ((f.a)localObject4).gj(25);
        }
      }
    }
    catch (Throwable localThrowable1)
    {
      while (true)
      {
        Object localObject5;
        int j;
        boolean bool;
        continue;
        try
        {
          label983: Object localObject3 = localThrowable1.getSharedPreferences("crash_status_file", 4);
          if (((SharedPreferences)localObject3).getInt("googleplaysizelimit", 3072) == i)
            continue;
          localObject3 = ((SharedPreferences)localObject3).edit();
          ((SharedPreferences.Editor)localObject3).putInt("googleplaysizelimit", i);
          ((SharedPreferences.Editor)localObject3).commit();
        }
        catch (Throwable localThrowable2)
        {
        }
        continue;
        int i = 3;
        continue;
        label1044: if (199 == i)
        {
          if (r.Yz().equals(localObject5))
          {
            if (j == 3);
            for (i = 1; ; i = 4)
            {
              localThrowable2[i] += 1;
              break;
            }
          }
          if (j == 3);
          for (i = 2; ; i = 5)
          {
            localThrowable2[i] += 1;
            break;
          }
          label1109: ((Cursor)localObject4).close();
          com.tencent.mm.plugin.report.service.h.pYm.e(12696, new Object[] { Integer.valueOf(10010), Integer.valueOf(localThrowable2[0]), Integer.valueOf(localThrowable2[1]), Integer.valueOf(localThrowable2[2]), Integer.valueOf(localThrowable2[3]), Integer.valueOf(localThrowable2[4]), Integer.valueOf(localThrowable2[5]) });
          continue;
          label1196: i = 0;
          continue;
          label1201: if (bool)
          {
            aw.ZK();
            c.Ry().set(233475, Boolean.FALSE);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.h
 * JD-Core Version:    0.6.2
 */