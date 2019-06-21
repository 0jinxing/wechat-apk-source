package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.protocal.protobuf.atz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class k
{
  private static com.tencent.mm.sdk.b.c ecA;
  private static d ecr;
  private static float ecs;
  private static float ect;
  private static boolean ecu;
  private static Map<String, atz> ecv;
  private static List<atz> ecw;
  private static Boolean ecx;
  private static b.a ecy;
  private static ap ecz;

  static
  {
    AppMethodBeat.i(15860);
    ecs = -85.0F;
    ect = -1000.0F;
    ecu = false;
    ecv = new ConcurrentHashMap();
    ecw = new CopyOnWriteArrayList();
    ecx = Boolean.FALSE;
    ecy = new k.1();
    ecz = new ap(Looper.getMainLooper(), new k.2(), true);
    ecA = new k.3();
    AppMethodBeat.o(15860);
  }

  public static void run()
  {
    AppMethodBeat.i(15859);
    if ((!aw.RK()) || (aw.QT()))
      AppMethodBeat.o(15859);
    while (true)
    {
      return;
      aw.ZK();
      Object localObject = Boolean.valueOf(bo.a((Boolean)com.tencent.mm.model.c.Ry().get(ac.a.xMp, null), false));
      ab.i("MicroMsg.PostTaskStartRangeForIBeacon", "the range road status is ".concat(String.valueOf(localObject)));
      if (!((Boolean)localObject).booleanValue())
      {
        AppMethodBeat.o(15859);
      }
      else
      {
        long l1 = bo.anT();
        aw.ZK();
        long l2 = bo.a((Long)com.tencent.mm.model.c.Ry().get(ac.a.xMq, null), 0L);
        aw.ZK();
        if (l1 - l2 > bo.a((Long)com.tencent.mm.model.c.Ry().get(ac.a.xMk, null), 0L))
        {
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xMp, Boolean.FALSE);
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xMo, "");
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xMn, "");
          aw.ZK();
          com.tencent.mm.model.c.QV();
          AppMethodBeat.o(15859);
        }
        else
        {
          localObject = BluetoothAdapter.getDefaultAdapter();
          if ((Build.VERSION.SDK_INT >= 18) && (localObject != null) && (((BluetoothAdapter)localObject).getState() == 12))
          {
            localObject = g.Nv().Nl();
            if (localObject != null)
            {
              Iterator localIterator = ((List)localObject).iterator();
              while (localIterator.hasNext())
              {
                localObject = (String)localIterator.next();
                ab.i("MicroMsg.PostTaskStartRangeForIBeacon", "op=true,iBeacon = %s", new Object[] { localObject });
                ds localds = new ds();
                localds.cxg.cxi = ((String)localObject);
                localds.cxg.cxf = true;
                a.xxA.m(localds);
              }
              ecr = d.agz();
              if (ecz.doT())
                ecz.ae(3000L, 3000L);
              if ((!ecu) && (ecr != null))
                ecr.a(ecy, true);
              a.xxA.c(ecA);
            }
            AppMethodBeat.o(15859);
          }
          else
          {
            aw.ZK();
            com.tencent.mm.model.c.Ry().set(ac.a.xMn, "");
            AppMethodBeat.o(15859);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.k
 * JD-Core Version:    0.6.2
 */