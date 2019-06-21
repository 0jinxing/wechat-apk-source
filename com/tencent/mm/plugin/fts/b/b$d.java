package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.m;
import java.util.List;

final class b$d extends a
{
  private String path;

  public b$d(b paramb, String paramString)
  {
    this.path = paramString;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136723);
    Object localObject = b.Nl(this.path);
    this.mGm.mGl.beginTransaction();
    this.mGm.mGl.bZ((List)localObject);
    this.mGm.mGl.commit();
    this.mGm.mGl.s(c.mCe);
    this.mGm.eAX.a(131132, new b.a(this.mGm, (byte)0));
    e locale = ((PluginFTS)g.M(PluginFTS.class)).getTopHitsLogic();
    localObject = c.mCe;
    locale.mGO.g((int[])localObject, 1);
    AppMethodBeat.o(136723);
    return true;
  }

  public final String getName()
  {
    return "UpdateFeatureIndexTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.b.d
 * JD-Core Version:    0.6.2
 */