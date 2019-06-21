package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

final class b$a extends com.tencent.mm.plugin.fts.a.a.a
{
  private int mGn;
  private int mGo;

  private b$a(b paramb)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(136720);
    String str = String.format("{remove: %d add: %d}", new Object[] { Integer.valueOf(this.mGn), Integer.valueOf(this.mGo) });
    AppMethodBeat.o(136720);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136719);
    ab.i("MicroMsg.FTS.FTS5SearchFeatureLogic", "start to build feature index task");
    Object localObject1 = this.mGm.mGl;
    Object localObject2 = new ArrayList();
    Object localObject3 = String.format("SELECT * FROM Feature", new Object[0]);
    localObject1 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject3, null);
    while (((Cursor)localObject1).moveToNext())
    {
      localObject3 = new com.tencent.mm.plugin.fts.a.a.c();
      ((com.tencent.mm.plugin.fts.a.a.c)localObject3).d((Cursor)localObject1);
      ((List)localObject2).add(localObject3);
    }
    ((Cursor)localObject1).close();
    localObject1 = localObject2;
    if (((List)localObject2).size() == 0)
      localObject1 = localObject2;
    try
    {
      localObject2 = b.Nl(j.w(b.bAy().dMD()));
      localObject1 = localObject2;
      this.mGm.mGl.bZ((List)localObject2);
      localObject1 = localObject2;
      label131: Object localObject4 = this.mGm.mGl.bAI();
      localObject2 = new HashMap();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (com.tencent.mm.plugin.fts.a.a.c)((Iterator)localObject1).next();
        ((HashMap)localObject2).put(Integer.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject3).field_featureId), localObject3);
      }
      if (this.mGm.mGl.mBT.inTransaction())
        this.mGm.mGl.commit();
      this.mGm.mGl.beginTransaction();
      localObject1 = new HashSet();
      localObject3 = new HashSet();
      localObject4 = ((List)localObject4).iterator();
      Object localObject5;
      while (((Iterator)localObject4).hasNext())
      {
        localObject5 = (com.tencent.mm.plugin.fts.c.b.a)((Iterator)localObject4).next();
        com.tencent.mm.plugin.fts.a.a.c localc = (com.tencent.mm.plugin.fts.a.a.c)((HashMap)localObject2).remove(Integer.valueOf(((com.tencent.mm.plugin.fts.c.b.a)localObject5).mHi));
        if (localc != null)
        {
          if (((com.tencent.mm.plugin.fts.c.b.a)localObject5).timestamp != localc.field_timestamp)
          {
            ((HashSet)localObject3).add(localc);
            this.mGm.mGl.c(com.tencent.mm.plugin.fts.a.c.mCe, localc.field_featureId);
            ((PluginFTS)g.M(PluginFTS.class)).getTopHitsLogic().d(com.tencent.mm.plugin.fts.a.c.mCe, String.valueOf(localc.field_featureId));
          }
        }
        else
          ((HashSet)localObject1).add(Integer.valueOf(((com.tencent.mm.plugin.fts.c.b.a)localObject5).mHi));
      }
      ((HashSet)localObject3).addAll(((HashMap)localObject2).values());
      this.mGm.mGl.commit();
      this.mGm.mGl.beginTransaction();
      this.mGn = ((HashSet)localObject1).size();
      this.mGo = ((HashSet)localObject3).size();
      localObject3 = ((HashSet)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (com.tencent.mm.plugin.fts.a.a.c)((Iterator)localObject3).next();
        localObject4 = this.mGm;
        ((b)localObject4).mGl.a(262144, 1, ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_timestamp, ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_title);
        localObject5 = d.aL(((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_title, false);
        if (!bo.isNullOrNil((String)localObject5))
          ((b)localObject4).mGl.a(262144, 2, ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_timestamp, (String)localObject5);
        localObject5 = d.aL(((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_title, true);
        if (!bo.isNullOrNil((String)localObject5))
          ((b)localObject4).mGl.a(262144, 3, ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_timestamp, (String)localObject5);
        ((b)localObject4).mGl.a(262144, 4, ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId, String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId), ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_timestamp, ((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_tag);
        ((PluginFTS)g.M(PluginFTS.class)).getTopHitsLogic().Nn(String.valueOf(((com.tencent.mm.plugin.fts.a.a.c)localObject2).field_featureId));
      }
      localObject1 = ((HashSet)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Integer)((Iterator)localObject1).next();
        this.mGm.mGl.c(com.tencent.mm.plugin.fts.a.c.mCe, ((Integer)localObject2).intValue());
      }
      this.mGm.mGl.commit();
      AppMethodBeat.o(136719);
      return true;
    }
    catch (Exception localException)
    {
      break label131;
    }
  }

  public final int getId()
  {
    return 5;
  }

  public final String getName()
  {
    return "BuildFeatureIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.b.a
 * JD-Core Version:    0.6.2
 */