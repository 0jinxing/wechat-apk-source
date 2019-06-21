package com.tencent.mm.plugin.appbrand.appcache.b.e;

import android.util.Pair;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.protocal.protobuf.rg;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.List;

public class e extends com.tencent.mm.plugin.appbrand.q.c<f>
{
  public static final String[] fjY;

  static
  {
    AppMethodBeat.i(129515);
    fjY = new String[] { j.a(f.fjX, "PredownloadIssueLaunchWxaAppResponse") };
    AppMethodBeat.o(129515);
  }

  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, f.fjX, "PredownloadIssueLaunchWxaAppResponse", f.diI);
  }

  public final boolean a(byte[] paramArrayOfByte, String paramString, List<Integer> paramList, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(129513);
    boolean bool1;
    if ((bo.cb(paramArrayOfByte)) || (bo.isNullOrNil(paramString)))
    {
      ab.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, invalid input %s", new Object[] { paramString });
      AppMethodBeat.o(129513);
      bool1 = false;
    }
    while (true)
    {
      return bool1;
      if (bo.ek(paramList))
      {
        ab.e("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, empty sceneList", new Object[] { paramString });
        AppMethodBeat.o(129513);
        bool1 = false;
      }
      else
      {
        Iterator localIterator = paramList.iterator();
        bool1 = true;
        if (localIterator.hasNext())
        {
          int i = ((Integer)localIterator.next()).intValue();
          f localf = new f();
          localf.field_appId = paramString;
          localf.field_scene = i;
          boolean bool2 = b(localf, new String[0]);
          localf.field_launchProtoBlob = paramArrayOfByte;
          localf.field_startTime = paramLong1;
          localf.field_endTime = paramLong2;
          if (bool2);
          for (bool2 = c(localf, new String[0]); ; bool2 = b(localf))
          {
            bool1 = bool2 & bool1;
            break;
          }
        }
        ab.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "setLaunchData, appId %s, sceneList %d, setOk %b", new Object[] { paramString, Integer.valueOf(paramList.size()), Boolean.valueOf(bool1) });
        AppMethodBeat.o(129513);
      }
    }
  }

  public final Pair<axr, Long> az(String paramString, int paramInt)
  {
    AppMethodBeat.i(129514);
    try
    {
      long l = bo.anT();
      Object localObject = new com/tencent/mm/plugin/appbrand/appcache/b/e/f;
      ((f)localObject).<init>();
      ((f)localObject).field_appId = paramString;
      ((f)localObject).field_scene = paramInt;
      if (b((com.tencent.mm.sdk.e.c)localObject, new String[0]))
      {
        ab.i("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "found info with appId(%s) scene(%d), [%d, %d]", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(((f)localObject).field_startTime), Long.valueOf(((f)localObject).field_endTime) });
        if ((((f)localObject).field_startTime <= l) && (l <= ((f)localObject).field_endTime))
        {
          axr localaxr = new com/tencent/mm/protocal/protobuf/axr;
          localaxr.<init>();
          localaxr.parseFrom(((f)localObject).field_launchProtoBlob);
          if (localaxr.wBJ.vYw.wR.length > 0)
          {
            localObject = Pair.create(localaxr, Long.valueOf(((f)localObject).field_reportId));
            paramString = (String)localObject;
            AppMethodBeat.o(129514);
          }
        }
      }
      while (true)
      {
        return paramString;
        ab.e("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", "found into with appId(%s) scene(%d), but jsapi_control_bytes invalid", new Object[] { paramString, Integer.valueOf(paramInt) });
        paramString = Pair.create(null, Long.valueOf(-1L));
        AppMethodBeat.o(129514);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.Predownload.DuplicateLaunchWxaAppCacheStorage", localException, "get with appId(%s) scene(%d)", new Object[] { paramString, Integer.valueOf(paramInt) });
        paramString = Pair.create(null, Long.valueOf(-1L));
        AppMethodBeat.o(129514);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.e.e
 * JD-Core Version:    0.6.2
 */