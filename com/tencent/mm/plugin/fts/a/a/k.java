package com.tencent.mm.plugin.fts.a.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
{
  public long fob = 0L;
  public int mDw = 0;
  public String mDx = "";
  public long mEA = 0L;
  public long mEB = 0L;
  public String mEC = "";
  public long mEz = 0L;
  public String query = "";
  public long timestamp = 0L;
  public int type = 0;

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(114274);
    this.mEz = paramCursor.getLong(0);
    this.query = paramCursor.getString(1);
    this.mEA = paramCursor.getLong(2);
    this.fob = paramCursor.getLong(3);
    this.mDx = paramCursor.getString(4);
    this.mEB = paramCursor.getLong(5);
    this.type = paramCursor.getInt(6);
    this.mDw = paramCursor.getInt(7);
    this.timestamp = paramCursor.getLong(8);
    this.mEC = paramCursor.getString(9);
    AppMethodBeat.o(114274);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.k
 * JD-Core Version:    0.6.2
 */