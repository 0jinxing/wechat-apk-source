package com.tencent.wcdb;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class CrossProcessCursorWrapper extends CursorWrapper
  implements CrossProcessCursor
{
  public CrossProcessCursorWrapper(Cursor paramCursor)
  {
    super(paramCursor);
  }

  public void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    AppMethodBeat.i(11986);
    if ((this.mCursor instanceof CrossProcessCursor))
    {
      ((CrossProcessCursor)this.mCursor).fillWindow(paramInt, paramCursorWindow);
      AppMethodBeat.o(11986);
    }
    while (true)
    {
      return;
      DatabaseUtils.cursorFillWindow(this.mCursor, paramInt, paramCursorWindow);
      AppMethodBeat.o(11986);
    }
  }

  public CursorWindow getWindow()
  {
    AppMethodBeat.i(11987);
    CursorWindow localCursorWindow;
    if ((this.mCursor instanceof CrossProcessCursor))
    {
      localCursorWindow = ((CrossProcessCursor)this.mCursor).getWindow();
      AppMethodBeat.o(11987);
    }
    while (true)
    {
      return localCursorWindow;
      localCursorWindow = null;
      AppMethodBeat.o(11987);
    }
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(11988);
    boolean bool;
    if ((this.mCursor instanceof CrossProcessCursor))
    {
      bool = ((CrossProcessCursor)this.mCursor).onMove(paramInt1, paramInt2);
      AppMethodBeat.o(11988);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(11988);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.CrossProcessCursorWrapper
 * JD-Core Version:    0.6.2
 */