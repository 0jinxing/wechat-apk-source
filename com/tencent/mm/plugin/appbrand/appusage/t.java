package com.tencent.mm.plugin.appbrand.appusage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.mm.protocal.protobuf.arj;
import com.tencent.mm.protocal.protobuf.ark;
import com.tencent.mm.protocal.protobuf.cwq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public enum t
{
  private static Integer hai;
  private static final long haj;

  static
  {
    AppMethodBeat.i(129662);
    hak = new t[0];
    hai = null;
    haj = TimeUnit.DAYS.toSeconds(1L);
    AppMethodBeat.o(129662);
  }

  static void a(int paramInt1, int paramInt2, int paramInt3, String paramString, b paramb, Long paramLong)
  {
    AppMethodBeat.i(129661);
    if (paramb == null)
    {
      ab.e("MicroMsg.AppBrandStarListLogic[collection]", "onResp, NULL CommReqResp");
      AppMethodBeat.o(129661);
    }
    while (true)
    {
      return;
      if ((((arj)paramb.fsG.fsP).condition & 0x2) != 0)
        break;
      AppMethodBeat.o(129661);
    }
    paramb = (ark)paramb.fsH.fsP;
    ab.i("MicroMsg.AppBrandStarListLogic[collection]", "onResp, errType %d, errCode %d, errMsg %s, ticket %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, paramLong });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramb != null))
    {
      if (f.E(s.class) != null)
      {
        ((s)f.E(s.class)).a(cwq.class, paramb.wvv, paramLong);
        u.a(paramInt1, paramb.wvv);
      }
      paramLong = g.RP().Ry();
      paramString = ac.a.xNY;
      if ((paramb.status & 0x1) <= 0)
        break label191;
    }
    label191: for (boolean bool = true; ; bool = false)
    {
      paramLong.set(paramString, Boolean.valueOf(bool));
      AppMethodBeat.o(129661);
      break;
    }
  }

  public static boolean axG()
  {
    return true;
  }

  public static boolean axH()
  {
    return true;
  }

  public static int axI()
  {
    AppMethodBeat.i(129660);
    int i;
    if (hai != null)
    {
      i = hai.intValue();
      AppMethodBeat.o(129660);
    }
    while (true)
    {
      return i;
      i = AppBrandGlobalSystemConfig.ayC().hfR;
      AppMethodBeat.o(129660);
    }
  }

  public static void nC(int paramInt)
  {
    AppMethodBeat.i(129659);
    hai = Integer.valueOf(paramInt);
    s locals = (s)f.E(s.class);
    Object localObject1 = locals.hae;
    Object localObject2 = String.format(Locale.US, "%s desc limit %d offset %d", new Object[] { "orderSequence", Long.valueOf(9223372036854775807L), Integer.valueOf(axI()) });
    localObject2 = ((h)localObject1).query("AppBrandStarApp", new String[] { "rowid" }, null, null, null, null, (String)localObject2);
    if (localObject2 == null)
    {
      AppMethodBeat.o(129659);
      return;
    }
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new LinkedList();
      do
        ((LinkedList)localObject1).add(String.valueOf(((Cursor)localObject2).getLong(0)));
      while (((Cursor)localObject2).moveToNext());
    }
    while (true)
    {
      ((Cursor)localObject2).close();
      if (!bo.ek((List)localObject1))
      {
        localObject2 = new String[1];
        long l = locals.hae.iV(Thread.currentThread().getId());
        localObject1 = ((LinkedList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2[0] = ((String)((Iterator)localObject1).next());
          locals.hae.delete("AppBrandStarApp", "rowid=?", (String[])localObject2);
        }
        locals.hae.mB(l);
        locals.b("batch", 5, null);
      }
      AppMethodBeat.o(129659);
      break;
      localObject1 = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.t
 * JD-Core Version:    0.6.2
 */