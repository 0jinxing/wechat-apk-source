package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.e;
import com.tencent.mm.plugin.shake.b.l.a;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.protocal.protobuf.byq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class j$1
  implements a.a
{
  j$1(j paramj)
  {
  }

  public final void b(btd parambtd, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(24638);
    if (j.a(this.qtW) == null)
    {
      ab.w("Micromsg.ShakeMusicMgr", "shakeGetListener == null");
      AppMethodBeat.o(24638);
    }
    while (true)
    {
      return;
      byq localbyq = (byq)parambtd;
      if (localbyq == null)
      {
        ab.w("Micromsg.ShakeMusicMgr", "resp null & return");
        j.a(this.qtW, new ArrayList());
        AppMethodBeat.o(24638);
        continue;
      }
      label98: Object localObject;
      if (localbyq.wXX == 1)
      {
        if (paramLong > j.b(this.qtW))
        {
          paramLong = System.currentTimeMillis() - paramLong;
          if ((localbyq == null) || (bo.isNullOrNil(localbyq.wXZ)))
            break label462;
          ab.w("Micromsg.ShakeMusicMgr", "resCallback Type:%d, xml:%s", new Object[] { Integer.valueOf(localbyq.wXY), localbyq.wXZ });
          localObject = localbyq.wXZ;
          parambtd = (btd)localObject;
          if (localObject != null)
            parambtd = ((String)localObject).trim();
          switch (localbyq.wXY)
          {
          default:
            ab.w("Micromsg.ShakeMusicMgr", "parse unknown type:" + localbyq.wXY);
            j.a(this.qtW, new ArrayList());
            paramBoolean = false;
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
          }
        }
        while (true)
        {
          if (!paramBoolean)
            break label401;
          h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(1), Integer.valueOf((int)(System.currentTimeMillis() - j.b(this.qtW))) });
          h.pYm.k(835L, 0L, 1L);
          AppMethodBeat.o(24638);
          break;
          paramLong = System.currentTimeMillis() - j.b(this.qtW);
          break label98;
          paramBoolean = j.a(this.qtW, parambtd);
          continue;
          paramBoolean = j.b(this.qtW, parambtd);
          continue;
          paramBoolean = j.c(this.qtW, parambtd);
          continue;
          paramBoolean = j.d(this.qtW, parambtd);
          continue;
          paramBoolean = j.e(this.qtW, parambtd);
        }
        label401: h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(5), Long.valueOf(paramLong) });
        h.pYm.k(835L, 4L, 1L);
        AppMethodBeat.o(24638);
        continue;
        label462: if (paramBoolean)
        {
          j.a(this.qtW, new ArrayList());
          h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(4), Integer.valueOf((int)paramLong) });
          h.pYm.k(835L, 3L, 1L);
          AppMethodBeat.o(24638);
          continue;
        }
        j.a(this.qtW, new ArrayList());
        h.pYm.e(10987, new Object[] { Integer.valueOf(1), "", Integer.valueOf(3), Integer.valueOf((int)paramLong) });
        h.pYm.k(835L, 2L, 1L);
        AppMethodBeat.o(24638);
        continue;
      }
      parambtd = new ArrayList();
      if (localbyq != null)
      {
        localObject = new d();
        if ((localbyq.wXT != null) && (localbyq.wXT.getBuffer() != null))
          ((d)localObject).field_username = localbyq.wXT.getBuffer().dlY();
        if ((localbyq.wXS != null) && (localbyq.wXS.getBuffer() != null))
          ((d)localObject).field_nickname = localbyq.wXS.getBuffer().dlY();
        if ((localbyq.wXT != null) && (localbyq.wXT.getBuffer() != null))
          ((d)localObject).field_distance = localbyq.wXT.getBuffer().dlY();
        if ((localbyq.wrE != null) && (localbyq.wrE.getBuffer() != null))
          ((d)localObject).field_sns_bgurl = localbyq.wrE.getBuffer().dlY();
        ((d)localObject).field_type = 4;
        ((d)localObject).field_insertBatch = 1;
      }
      try
      {
        ((d)localObject).field_lvbuffer = localbyq.toByteArray();
        m.cjS().a((d)localObject, true);
        parambtd.add(localObject);
        j.c(this.qtW).b(parambtd, paramLong);
        AppMethodBeat.o(24638);
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.w("Micromsg.ShakeMusicMgr", "insertItem, to lvbuf error [%s]", new Object[] { localIOException.getLocalizedMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.j.1
 * JD-Core Version:    0.6.2
 */