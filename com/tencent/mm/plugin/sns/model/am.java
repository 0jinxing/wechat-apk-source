package com.tencent.mm.plugin.sns.model;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;

public final class am
{
  private static final int qMw;

  static
  {
    AppMethodBeat.i(36596);
    qMw = com.tencent.mm.m.g.Nu().getInt("SnsUseWeiShiShootingEntranceDisplayTimes", 0);
    AppMethodBeat.o(36596);
  }

  public static boolean coc()
  {
    AppMethodBeat.i(36594);
    com.tencent.mm.kernel.g.RQ();
    int i = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xVI, Integer.valueOf(0))).intValue();
    ab.d("MicroMsg.SnsLogic", "checkWeishiExposeCount now=%d limit=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(qMw) });
    if (i < qMw)
    {
      com.tencent.mm.kernel.g.RQ();
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVI, Integer.valueOf(i + 1));
    }
    for (boolean bool = true; ; bool = false)
    {
      AppMethodBeat.o(36594);
      return bool;
    }
  }

  public static void e(ArrayList<String> paramArrayList, String paramString)
  {
    AppMethodBeat.i(36593);
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
      AppMethodBeat.o(36593);
    while (true)
    {
      return;
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        int i = bo.getInt((String)paramArrayList.next(), 0);
        if (i != 0)
        {
          n localn = af.cnF().DK(i);
          if (localn != null)
          {
            Object localObject = localn.cqu();
            if ((localObject != null) && (((TimeLineObject)localObject).xfI != null) && (((TimeLineObject)localObject).xfI.wbJ == 26))
            {
              ((TimeLineObject)localObject).xfI.wbM = paramString;
              af.cnF().b(i, localn);
              localObject = new ox();
              ((ox)localObject).cLl.cLm = i;
              a.xxA.m((b)localObject);
            }
          }
        }
      }
      AppMethodBeat.o(36593);
    }
  }

  public static boolean eO(Context paramContext)
  {
    boolean bool1 = true;
    AppMethodBeat.i(36595);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo("com.tencent.weishi", 64);
      if (paramContext != null)
      {
        byte[] arrayOfByte = paramContext.signatures[0].toByteArray();
        paramContext = MessageDigest.getInstance("MD5");
        paramContext.update(arrayOfByte);
        boolean bool2 = bo.isEqual(com.tencent.d.f.e.bytesToHexString(paramContext.digest()), "2A281593D71DF33374E6124E9106DF08");
        if (bool2)
        {
          AppMethodBeat.o(36595);
          return bool1;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.w("MicroMsg.SnsLogic", "checkWeishiInstalled Exception: %s", new Object[] { paramContext.getMessage() });
        bool1 = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.am
 * JD-Core Version:    0.6.2
 */