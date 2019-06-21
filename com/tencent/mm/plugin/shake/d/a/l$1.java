package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.byu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class l$1
  implements a.a
{
  l$1(l paraml)
  {
  }

  public final void b(btd parambtd, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(24656);
    ab.i("Micromsg.ShakeTVService", "hy: shake tv call back. isNetworkFail; %b", new Object[] { Boolean.valueOf(paramBoolean) });
    byu localbyu;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int i;
    if (paramLong > l.a(this.qtY))
    {
      paramLong = System.currentTimeMillis() - paramLong;
      if ((parambtd == null) || (bo.isNullOrNil(((byu)parambtd).vOt)))
        break label535;
      localbyu = (byu)parambtd;
      ab.w("Micromsg.ShakeTVService", "resCallback Type:%d, xml:%s", new Object[] { Integer.valueOf(localbyu.jCt), localbyu.vOt });
      localObject1 = null;
      localObject2 = null;
      localObject3 = localObject2;
      parambtd = localObject1;
      if (localbyu.vOt != null)
      {
        localbyu.vOt = localbyu.vOt.trim();
        i = localbyu.vOt.indexOf("<tvinfo>");
        if (i <= 0)
          break label358;
        parambtd = localbyu.vOt.substring(0, i);
        localObject3 = localbyu.vOt.substring(i);
      }
      label171: l.WF((String)localObject3);
      switch (localbyu.jCt)
      {
      default:
        ab.w("Micromsg.ShakeTVService", "parse unknown type:" + localbyu.jCt);
        l.a(this.qtY, new ArrayList());
        paramBoolean = false;
        label266: if (paramBoolean)
        {
          h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(1), Integer.valueOf((int)(System.currentTimeMillis() - l.a(this.qtY))) });
          h.pYm.k(835L, 0L, 1L);
        }
        break;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    }
    while (true)
    {
      l.Fa();
      AppMethodBeat.o(24656);
      return;
      paramLong = System.currentTimeMillis() - l.a(this.qtY);
      break;
      label358: if (i == 0)
      {
        localObject3 = localbyu.vOt;
        parambtd = localObject1;
        break label171;
      }
      parambtd = localbyu.vOt;
      localObject3 = localObject2;
      break label171;
      paramBoolean = l.a(this.qtY, parambtd);
      break label266;
      paramBoolean = l.b(this.qtY, parambtd);
      break label266;
      paramBoolean = l.c(this.qtY, parambtd);
      break label266;
      paramBoolean = l.d(this.qtY, parambtd);
      break label266;
      paramBoolean = l.e(this.qtY, parambtd);
      break label266;
      paramBoolean = l.f(this.qtY, parambtd);
      break label266;
      paramBoolean = l.g(this.qtY, parambtd);
      break label266;
      h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(5), Long.valueOf(paramLong) });
      h.pYm.k(835L, 4L, 1L);
      continue;
      label535: if (paramBoolean)
      {
        l.a(this.qtY, new ArrayList());
        h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(4), Integer.valueOf((int)paramLong) });
        h.pYm.k(835L, 3L, 1L);
      }
      else
      {
        l.a(this.qtY, new ArrayList());
        h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(3), Integer.valueOf((int)paramLong) });
        h.pYm.k(835L, 2L, 1L);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.l.1
 * JD-Core Version:    0.6.2
 */