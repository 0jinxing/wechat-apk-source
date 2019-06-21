package com.tencent.mm.plugin.appbrand.appcache;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.task.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.protobuf.bmm;
import com.tencent.mm.protocal.protobuf.cwk;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.bo;

public enum aj
{
  public static void a(int paramInt, bmm parambmm)
  {
    AppMethodBeat.i(129421);
    cwk localcwk;
    if (parambmm != null)
    {
      localcwk = new cwk();
      localcwk.url = parambmm.url;
      localcwk.cvZ = parambmm.cvZ;
      localcwk.version = parambmm.version;
      localcwk.wPu = parambmm.wPu;
      if (!parambmm.wPt)
        break label85;
    }
    label85: for (int i = 1; ; i = 0)
    {
      localcwk.xsd = i;
      localcwk.cDL = parambmm.cDL;
      a(paramInt, localcwk, aj.a.gTN);
      AppMethodBeat.o(129421);
      return;
    }
  }

  private static void a(int paramInt, cwk paramcwk, aj.a parama)
  {
    AppMethodBeat.i(129420);
    boolean bool;
    if (f.auV() != null)
    {
      PInt localPInt = new PInt();
      f.auV().a(paramcwk, localPInt);
      if (f.auV().au("@LibraryAppId", 0) == paramcwk.version)
        if (as.p(true, true).first == as.a.gUM)
        {
          bool = true;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WxaCommLibVersionChecker", "onResp, requestUsingLibVersion %d, needDownload = %b, version = %d, forceUpdate = %d, md5 = %s, url = %s", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Integer.valueOf(paramcwk.version), Integer.valueOf(paramcwk.wPu), paramcwk.cvZ, paramcwk.url });
          if (bool)
          {
            if ((paramInt <= 0) || (bo.isNullOrNil(paramcwk.cDL)))
              break label273;
            t.gTk.E(paramInt, paramcwk.cDL);
            label152: t.gTk.dy(true);
            aa localaa = new aa();
            localaa.field_key = "@LibraryAppId";
            localaa.field_version = paramcwk.version;
            if (!f.ava().b(localaa, new String[] { "key", "version" }))
            {
              localaa.field_updateTime = bo.anT();
              localaa.field_scene = (parama.ordinal() + 1);
              f.ava().b(localaa);
            }
          }
          if ((paramcwk.wPu > 0) && (localPInt.value > 0))
            h.pN(2);
          AppMethodBeat.o(129420);
        }
    }
    while (true)
    {
      return;
      bool = false;
      break;
      bool = false;
      break;
      label273: t.gTk.E(-1, null);
      break label152;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WxaCommLibVersionChecker", "onResp, null storage");
      AppMethodBeat.o(129420);
    }
  }

  public static void a(cwk paramcwk)
  {
    AppMethodBeat.i(129422);
    a(-1, paramcwk, aj.a.gTM);
    AppMethodBeat.o(129422);
  }

  public static void dC(boolean paramBoolean)
  {
    AppMethodBeat.i(129419);
    d.post(new aj.1(paramBoolean), "WxaCommLibVersionChecker");
    AppMethodBeat.o(129419);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.aj
 * JD-Core Version:    0.6.2
 */