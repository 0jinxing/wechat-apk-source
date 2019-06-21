package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

final class a$d extends com.tencent.mm.plugin.fts.a.a.a
{
  private String edV;
  private int mFZ = 0;

  public a$d(a parama, String paramString)
  {
    this.edV = paramString;
  }

  public final String aAo()
  {
    AppMethodBeat.i(136671);
    String str = String.format("{username: %s mDirtyCount: %d}", new Object[] { this.edV, Integer.valueOf(this.mFZ) });
    AppMethodBeat.o(136671);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136670);
    ab.i("MicroMsg.FTS.FTS5SearchContactLogic", "Delete Contact %s", new Object[] { this.edV });
    a.a(this.mFK).b(c.mCk, this.edV);
    ((PluginFTS)g.M(PluginFTS.class)).getTopHitsLogic().d(c.mCk, this.edV);
    Object localObject1 = a.a(this.mFK).Np(this.edV);
    Object localObject2 = new HashSet();
    while (((Cursor)localObject1).moveToNext())
      ((HashSet)localObject2).add(((Cursor)localObject1).getString(0));
    ((Cursor)localObject1).close();
    localObject2 = ((HashSet)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (!a.b(this.mFK).containsKey(str))
      {
        localObject1 = a.a(this.mFK).c(c.mCk, str);
        a.b(this.mFK).put(str, localObject1);
        ((PluginFTS)g.M(PluginFTS.class)).getTopHitsLogic().Nn(str);
        this.mFZ += 1;
      }
    }
    AppMethodBeat.o(136670);
    return true;
  }

  public final String getName()
  {
    return "DeleteContactTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.d
 * JD-Core Version:    0.6.2
 */