package com.tencent.wcdb;

import android.database.ContentObserver;
import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MergeCursor extends AbstractCursor
{
  private Cursor mCursor;
  private Cursor[] mCursors;
  private DataSetObserver mObserver;

  public MergeCursor(Cursor[] paramArrayOfCursor)
  {
    AppMethodBeat.i(12191);
    this.mObserver = new MergeCursor.1(this);
    this.mCursors = paramArrayOfCursor;
    this.mCursor = paramArrayOfCursor[0];
    while (i < this.mCursors.length)
    {
      if (this.mCursors[i] != null)
        this.mCursors[i].registerDataSetObserver(this.mObserver);
      i++;
    }
    AppMethodBeat.o(12191);
  }

  public void close()
  {
    AppMethodBeat.i(12205);
    int i = this.mCursors.length;
    for (int j = 0; j < i; j++)
      if (this.mCursors[j] != null)
        this.mCursors[j].close();
    super.close();
    AppMethodBeat.o(12205);
  }

  public void deactivate()
  {
    AppMethodBeat.i(12204);
    int i = this.mCursors.length;
    for (int j = 0; j < i; j++)
      if (this.mCursors[j] != null)
        this.mCursors[j].deactivate();
    super.deactivate();
    AppMethodBeat.o(12204);
  }

  public byte[] getBlob(int paramInt)
  {
    AppMethodBeat.i(12202);
    byte[] arrayOfByte = this.mCursor.getBlob(paramInt);
    AppMethodBeat.o(12202);
    return arrayOfByte;
  }

  public String[] getColumnNames()
  {
    AppMethodBeat.i(12203);
    String[] arrayOfString;
    if (this.mCursor != null)
    {
      arrayOfString = this.mCursor.getColumnNames();
      AppMethodBeat.o(12203);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = new String[0];
      AppMethodBeat.o(12203);
    }
  }

  public int getCount()
  {
    AppMethodBeat.i(12192);
    int i = this.mCursors.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      m = k;
      if (this.mCursors[j] != null)
        m = k + this.mCursors[j].getCount();
      j++;
    }
    AppMethodBeat.o(12192);
    return k;
  }

  public double getDouble(int paramInt)
  {
    AppMethodBeat.i(12199);
    double d = this.mCursor.getDouble(paramInt);
    AppMethodBeat.o(12199);
    return d;
  }

  public float getFloat(int paramInt)
  {
    AppMethodBeat.i(12198);
    float f = this.mCursor.getFloat(paramInt);
    AppMethodBeat.o(12198);
    return f;
  }

  public int getInt(int paramInt)
  {
    AppMethodBeat.i(12196);
    paramInt = this.mCursor.getInt(paramInt);
    AppMethodBeat.o(12196);
    return paramInt;
  }

  public long getLong(int paramInt)
  {
    AppMethodBeat.i(12197);
    long l = this.mCursor.getLong(paramInt);
    AppMethodBeat.o(12197);
    return l;
  }

  public short getShort(int paramInt)
  {
    AppMethodBeat.i(12195);
    short s = this.mCursor.getShort(paramInt);
    AppMethodBeat.o(12195);
    return s;
  }

  public String getString(int paramInt)
  {
    AppMethodBeat.i(12194);
    String str = this.mCursor.getString(paramInt);
    AppMethodBeat.o(12194);
    return str;
  }

  public int getType(int paramInt)
  {
    AppMethodBeat.i(12200);
    paramInt = this.mCursor.getType(paramInt);
    AppMethodBeat.o(12200);
    return paramInt;
  }

  public boolean isNull(int paramInt)
  {
    AppMethodBeat.i(12201);
    boolean bool = this.mCursor.isNull(paramInt);
    AppMethodBeat.o(12201);
    return bool;
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(12193);
    this.mCursor = null;
    int i = this.mCursors.length;
    paramInt1 = 0;
    int j = 0;
    int k;
    boolean bool;
    if (paramInt1 < i)
    {
      k = j;
      if (this.mCursors[paramInt1] == null)
        break label115;
      if (paramInt2 < this.mCursors[paramInt1].getCount() + j)
        this.mCursor = this.mCursors[paramInt1];
    }
    else
    {
      if (this.mCursor == null)
        break label125;
      bool = this.mCursor.moveToPosition(paramInt2 - j);
      AppMethodBeat.o(12193);
    }
    while (true)
    {
      return bool;
      k = j + this.mCursors[paramInt1].getCount();
      label115: paramInt1++;
      j = k;
      break;
      label125: AppMethodBeat.o(12193);
      bool = false;
    }
  }

  public void registerContentObserver(ContentObserver paramContentObserver)
  {
    AppMethodBeat.i(12206);
    int i = this.mCursors.length;
    for (int j = 0; j < i; j++)
      if (this.mCursors[j] != null)
        this.mCursors[j].registerContentObserver(paramContentObserver);
    AppMethodBeat.o(12206);
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(12208);
    int i = this.mCursors.length;
    for (int j = 0; j < i; j++)
      if (this.mCursors[j] != null)
        this.mCursors[j].registerDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(12208);
  }

  public boolean requery()
  {
    boolean bool = false;
    AppMethodBeat.i(12210);
    int i = this.mCursors.length;
    int j = 0;
    if (j < i)
      if ((this.mCursors[j] != null) && (!this.mCursors[j].requery()))
        AppMethodBeat.o(12210);
    while (true)
    {
      return bool;
      j++;
      break;
      bool = true;
      AppMethodBeat.o(12210);
    }
  }

  public void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    AppMethodBeat.i(12207);
    int i = this.mCursors.length;
    for (int j = 0; j < i; j++)
      if (this.mCursors[j] != null)
        this.mCursors[j].unregisterContentObserver(paramContentObserver);
    AppMethodBeat.o(12207);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(12209);
    int i = this.mCursors.length;
    for (int j = 0; j < i; j++)
      if (this.mCursors[j] != null)
        this.mCursors[j].unregisterDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(12209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.MergeCursor
 * JD-Core Version:    0.6.2
 */