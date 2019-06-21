package com.tencent.wcdb;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class MatrixCursor$RowBuilder
{
  private final int endIndex;
  private int index;

  MatrixCursor$RowBuilder(MatrixCursor paramMatrixCursor, int paramInt1, int paramInt2)
  {
    this.index = paramInt1;
    this.endIndex = paramInt2;
  }

  public RowBuilder add(Object paramObject)
  {
    AppMethodBeat.i(12174);
    if (this.index == this.endIndex)
    {
      paramObject = new CursorIndexOutOfBoundsException("No more columns left.");
      AppMethodBeat.o(12174);
      throw paramObject;
    }
    Object[] arrayOfObject = MatrixCursor.access$000(this.this$0);
    int i = this.index;
    this.index = (i + 1);
    arrayOfObject[i] = paramObject;
    AppMethodBeat.o(12174);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.MatrixCursor.RowBuilder
 * JD-Core Version:    0.6.2
 */