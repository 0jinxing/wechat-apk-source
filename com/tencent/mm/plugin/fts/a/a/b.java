package com.tencent.mm.plugin.fts.a.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public long mDv;
  public int mDw;
  public String mDx;
  public int type;

  public final b h(Cursor paramCursor)
  {
    AppMethodBeat.i(114235);
    this.mDv = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.mDw = paramCursor.getInt(2);
    this.mDx = paramCursor.getString(3);
    AppMethodBeat.o(114235);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.b
 * JD-Core Version:    0.6.2
 */