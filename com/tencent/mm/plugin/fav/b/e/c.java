package com.tencent.mm.plugin.fav.b.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.t;
import com.tencent.mm.plugin.fav.a.u;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.protocal.protobuf.aav;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.protocal.protobuf.bca;
import com.tencent.mm.protocal.protobuf.bcd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
  implements com.tencent.mm.ai.f, u
{
  public Map<String, c.a> mhd;

  public c()
  {
    AppMethodBeat.i(5366);
    this.mhd = new HashMap();
    com.tencent.mm.kernel.g.Rg().a(426, this);
    com.tencent.mm.kernel.g.Rg().a(401, this);
    AppMethodBeat.o(5366);
  }

  public static String x(long paramLong, int paramInt)
  {
    AppMethodBeat.i(5369);
    String str = paramLong + "&&" + paramInt;
    AppMethodBeat.o(5369);
    return str;
  }

  public final void a(long paramLong, LinkedList<bca> paramLinkedList, LinkedList<bcd> paramLinkedList1, int paramInt)
  {
    AppMethodBeat.i(5370);
    ab.i("MicroMsg.Fav.FavEditService", "addTag %d", new Object[] { Long.valueOf(paramLong) });
    com.tencent.mm.plugin.fav.a.f localf = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavEditInfoStorage().iD(paramLong);
    if (localf == null)
      localf = new com.tencent.mm.plugin.fav.a.f();
    for (int i = 1; ; i = 0)
    {
      localf.field_localId = paramLong;
      aav localaav = new aav();
      localaav.mgt = paramLinkedList;
      localaav.wie = paramLinkedList1;
      localf.field_modItem = localaav;
      localf.field_time = bo.anU();
      localf.field_type = 0;
      localf.field_scene = paramInt;
      if (i != 0)
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavEditInfoStorage().a(localf);
      while (true)
      {
        run();
        AppMethodBeat.o(5370);
        return;
        ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavEditInfoStorage().a(localf, new String[] { "localId" });
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(5367);
    if (paramm == null)
      AppMethodBeat.o(5367);
    while (true)
    {
      return;
      ab.i("MicroMsg.Fav.FavEditService", "on edit service scene end, errType=%d errCode=%d, %s, scene type %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
      if (paramm.getType() == 401)
      {
        ab.i("MicroMsg.Fav.FavEditService", "on add fav item scene end, try mod item");
        run();
        AppMethodBeat.o(5367);
      }
      else
      {
        paramString = (com.tencent.mm.plugin.fav.a.al)paramm;
        if (paramString.type != 0)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            paramm = x(paramString.bvg(), paramString.bvh());
            ab.i("MicroMsg.Fav.FavEditService", "clear job, key %s", new Object[] { paramm });
            this.mhd.remove(paramm);
            ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavEditInfoStorage().s(paramString.bvg(), paramString.bvh());
            paramm = ((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().iE(paramString.bvg());
            if (paramm != null)
            {
              l = paramm.field_id;
              paramInt2 = paramm.field_tagProto.wiJ.size();
              if (paramString.mgr != null)
                break label253;
            }
            label253: for (paramInt1 = 1; ; paramInt1 = paramString.mgr.field_scene)
            {
              h.k(l, paramInt2, paramInt1);
              AppMethodBeat.o(5367);
              break;
            }
          }
          long l = paramString.bvg();
          paramInt1 = paramString.bvh();
          paramString = x(l, paramInt1);
          ab.i("MicroMsg.Fav.FavEditService", "retry job, key %s", new Object[] { paramString });
          paramString = (c.a)this.mhd.get(paramString);
          if (paramString == null)
          {
            ab.w("MicroMsg.Fav.FavEditService", "want to retry mod item, localid %d, type %d", new Object[] { Long.valueOf(l), Integer.valueOf(paramInt1) });
            AppMethodBeat.o(5367);
          }
          else
          {
            com.tencent.mm.kernel.g.RS().m(new c.2(this, paramString), 3000L);
          }
        }
        else
        {
          AppMethodBeat.o(5367);
        }
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(5368);
    com.tencent.mm.kernel.g.RS().aa(new c.1(this));
    AppMethodBeat.o(5368);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.c
 * JD-Core Version:    0.6.2
 */