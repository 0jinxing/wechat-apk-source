package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import android.database.CursorWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Iterator;

public final class a extends CursorWrapper
{
  private static HashSet<Cursor> mAI;

  static
  {
    AppMethodBeat.i(136516);
    mAI = new HashSet();
    AppMethodBeat.o(136516);
  }

  public a(Cursor paramCursor)
  {
    super(paramCursor);
    AppMethodBeat.i(136513);
    mAI.add(paramCursor);
    ab.v("MicroMsg.FTS.FTSCursor", "add cursor %d", new Object[] { Integer.valueOf(paramCursor.hashCode()) });
    AppMethodBeat.o(136513);
  }

  public static final void bzU()
  {
    AppMethodBeat.i(136515);
    Iterator localIterator = mAI.iterator();
    while (true)
    {
      Cursor localCursor;
      if (localIterator.hasNext())
      {
        localCursor = (Cursor)localIterator.next();
        if (localCursor.isClosed())
          continue;
      }
      try
      {
        localCursor.close();
        label46: ab.e("MicroMsg.FTS.FTSCursor", "not close cursor!!! %d", new Object[] { Integer.valueOf(localCursor.hashCode()) });
        continue;
        mAI.clear();
        AppMethodBeat.o(136515);
        return;
      }
      catch (Exception localException)
      {
        break label46;
      }
    }
  }

  public final void close()
  {
    AppMethodBeat.i(136514);
    super.close();
    Cursor localCursor = getWrappedCursor();
    mAI.remove(localCursor);
    ab.v("MicroMsg.FTS.FTSCursor", "remove cursor %d", new Object[] { Integer.valueOf(localCursor.hashCode()) });
    AppMethodBeat.o(136514);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a
 * JD-Core Version:    0.6.2
 */