package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.storage.ad;
import com.tencent.wcdb.database.SQLiteStatement;
import java.util.HashMap;
import java.util.HashSet;

final class a$i extends com.tencent.mm.plugin.fts.a.a.a
{
  private boolean mGf;
  private String username;

  public a$i(a parama, String paramString)
  {
    this.username = paramString;
  }

  public final String aAo()
  {
    AppMethodBeat.i(136681);
    String str = String.format("{username: %s isSkipped: %b}", new Object[] { this.username, Boolean.valueOf(this.mGf) });
    AppMethodBeat.o(136681);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136680);
    if (a.b(this.mFK).containsKey(this.username))
    {
      this.mGf = true;
      AppMethodBeat.o(136680);
    }
    while (true)
    {
      return true;
      if (!a.c(this.mFK).add(this.username))
      {
        this.mGf = true;
        AppMethodBeat.o(136680);
      }
      else
      {
        Object localObject = a.d(this.mFK).MU(this.username);
        if ((localObject != null) && (!this.mFK.H((ad)localObject)))
        {
          this.mGf = true;
          AppMethodBeat.o(136680);
        }
        else
        {
          localObject = a.a(this.mFK);
          String str = this.username;
          ((com.tencent.mm.plugin.fts.a.a)localObject).mBZ.bindLong(1, 2L);
          ((com.tencent.mm.plugin.fts.a.a)localObject).mBZ.bindString(2, str);
          ((com.tencent.mm.plugin.fts.a.a)localObject).mBZ.bindLong(3, 0L);
          ((com.tencent.mm.plugin.fts.a.a)localObject).mBZ.execute();
          AppMethodBeat.o(136680);
        }
      }
    }
  }

  public final String getName()
  {
    return "MarkContactTimestampTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.i
 * JD-Core Version:    0.6.2
 */