package com.tencent.mm.plugin.music.model.e;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class d extends j<c>
{
  public e bSd;
  public f<String, c> oNq;

  public d(e parame)
  {
    super(parame, c.ccO, "PieceMusicInfo", null);
    AppMethodBeat.i(105041);
    this.bSd = parame;
    this.oNq = new com.tencent.mm.memory.a.c(20);
    AppMethodBeat.o(105041);
  }

  public final c Tq(String paramString)
  {
    AppMethodBeat.i(105042);
    if (this.oNq.get(paramString) != null)
    {
      paramString = (c)this.oNq.get(paramString);
      AppMethodBeat.o(105042);
    }
    while (true)
    {
      return paramString;
      Object localObject = String.format("Select * From PieceMusicInfo Where musicId=?", new Object[0]);
      Cursor localCursor = this.bSd.a((String)localObject, new String[] { paramString }, 2);
      if ((localCursor != null) && (localCursor.moveToFirst()))
      {
        localObject = new c();
        ((c)localObject).d(localCursor);
        localCursor.close();
        this.oNq.put(paramString, localObject);
        AppMethodBeat.o(105042);
        paramString = (String)localObject;
      }
      else
      {
        if (localCursor != null)
          localCursor.close();
        paramString = null;
        AppMethodBeat.o(105042);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.model.e.d
 * JD-Core Version:    0.6.2
 */