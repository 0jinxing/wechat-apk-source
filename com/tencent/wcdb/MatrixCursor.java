package com.tencent.wcdb;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public class MatrixCursor extends AbstractCursor
{
  private final int columnCount;
  private final String[] columnNames;
  private Object[] data;
  private int rowCount;

  public MatrixCursor(String[] paramArrayOfString)
  {
    this(paramArrayOfString, 16);
  }

  public MatrixCursor(String[] paramArrayOfString, int paramInt)
  {
    AppMethodBeat.i(12175);
    this.rowCount = 0;
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    int i = paramInt;
    if (paramInt <= 0)
      i = 1;
    this.data = new Object[this.columnCount * i];
    AppMethodBeat.o(12175);
  }

  private void addRow(ArrayList<?> paramArrayList, int paramInt)
  {
    AppMethodBeat.i(12180);
    int i = paramArrayList.size();
    if (i != this.columnCount)
    {
      paramArrayList = new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.size() = " + i);
      AppMethodBeat.o(12180);
      throw paramArrayList;
    }
    this.rowCount += 1;
    Object[] arrayOfObject = this.data;
    for (int j = 0; j < i; j++)
      arrayOfObject[(paramInt + j)] = paramArrayList.get(j);
    AppMethodBeat.o(12180);
  }

  private void ensureCapacity(int paramInt)
  {
    AppMethodBeat.i(12181);
    Object[] arrayOfObject;
    int i;
    if (paramInt > this.data.length)
    {
      arrayOfObject = this.data;
      i = this.data.length * 2;
      if (i >= paramInt)
        break label60;
    }
    while (true)
    {
      this.data = new Object[paramInt];
      System.arraycopy(arrayOfObject, 0, this.data, 0, arrayOfObject.length);
      AppMethodBeat.o(12181);
      return;
      label60: paramInt = i;
    }
  }

  private Object get(int paramInt)
  {
    AppMethodBeat.i(12176);
    if ((paramInt < 0) || (paramInt >= this.columnCount))
    {
      localObject = new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
      AppMethodBeat.o(12176);
      throw ((Throwable)localObject);
    }
    if (this.mPos < 0)
    {
      localObject = new CursorIndexOutOfBoundsException("Before first row.");
      AppMethodBeat.o(12176);
      throw ((Throwable)localObject);
    }
    if (this.mPos >= this.rowCount)
    {
      localObject = new CursorIndexOutOfBoundsException("After last row.");
      AppMethodBeat.o(12176);
      throw ((Throwable)localObject);
    }
    Object localObject = this.data[(this.mPos * this.columnCount + paramInt)];
    AppMethodBeat.o(12176);
    return localObject;
  }

  public void addRow(Iterable<?> paramIterable)
  {
    AppMethodBeat.i(12179);
    int i = this.rowCount * this.columnCount;
    int j = i + this.columnCount;
    ensureCapacity(j);
    if ((paramIterable instanceof ArrayList))
    {
      addRow((ArrayList)paramIterable, i);
      AppMethodBeat.o(12179);
    }
    while (true)
    {
      return;
      Object[] arrayOfObject = this.data;
      Iterator localIterator = paramIterable.iterator();
      while (localIterator.hasNext())
      {
        paramIterable = localIterator.next();
        if (i == j)
        {
          paramIterable = new IllegalArgumentException("columnValues.size() > columnNames.length");
          AppMethodBeat.o(12179);
          throw paramIterable;
        }
        arrayOfObject[i] = paramIterable;
        i++;
      }
      if (i != j)
      {
        paramIterable = new IllegalArgumentException("columnValues.size() < columnNames.length");
        AppMethodBeat.o(12179);
        throw paramIterable;
      }
      this.rowCount += 1;
      AppMethodBeat.o(12179);
    }
  }

  public void addRow(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(12178);
    if (paramArrayOfObject.length != this.columnCount)
    {
      paramArrayOfObject = new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + paramArrayOfObject.length);
      AppMethodBeat.o(12178);
      throw paramArrayOfObject;
    }
    int i = this.rowCount;
    this.rowCount = (i + 1);
    i *= this.columnCount;
    ensureCapacity(this.columnCount + i);
    System.arraycopy(paramArrayOfObject, 0, this.data, i, this.columnCount);
    AppMethodBeat.o(12178);
  }

  public void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public byte[] getBlob(int paramInt)
  {
    AppMethodBeat.i(12188);
    byte[] arrayOfByte = (byte[])get(paramInt);
    AppMethodBeat.o(12188);
    return arrayOfByte;
  }

  public String[] getColumnNames()
  {
    return this.columnNames;
  }

  public int getCount()
  {
    return this.rowCount;
  }

  public double getDouble(int paramInt)
  {
    AppMethodBeat.i(12187);
    Object localObject = get(paramInt);
    double d;
    if (localObject == null)
    {
      d = 0.0D;
      AppMethodBeat.o(12187);
    }
    while (true)
    {
      return d;
      if ((localObject instanceof Number))
      {
        d = ((Number)localObject).doubleValue();
        AppMethodBeat.o(12187);
      }
      else
      {
        d = Double.parseDouble(localObject.toString());
        AppMethodBeat.o(12187);
      }
    }
  }

  public float getFloat(int paramInt)
  {
    AppMethodBeat.i(12186);
    Object localObject = get(paramInt);
    float f;
    if (localObject == null)
    {
      f = 0.0F;
      AppMethodBeat.o(12186);
    }
    while (true)
    {
      return f;
      if ((localObject instanceof Number))
      {
        f = ((Number)localObject).floatValue();
        AppMethodBeat.o(12186);
      }
      else
      {
        f = Float.parseFloat(localObject.toString());
        AppMethodBeat.o(12186);
      }
    }
  }

  public int getInt(int paramInt)
  {
    AppMethodBeat.i(12184);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      paramInt = 0;
      AppMethodBeat.o(12184);
    }
    while (true)
    {
      return paramInt;
      if ((localObject instanceof Number))
      {
        paramInt = ((Number)localObject).intValue();
        AppMethodBeat.o(12184);
      }
      else
      {
        paramInt = Integer.parseInt(localObject.toString());
        AppMethodBeat.o(12184);
      }
    }
  }

  public long getLong(int paramInt)
  {
    AppMethodBeat.i(12185);
    Object localObject = get(paramInt);
    long l;
    if (localObject == null)
    {
      l = 0L;
      AppMethodBeat.o(12185);
    }
    while (true)
    {
      return l;
      if ((localObject instanceof Number))
      {
        l = ((Number)localObject).longValue();
        AppMethodBeat.o(12185);
      }
      else
      {
        l = Long.parseLong(localObject.toString());
        AppMethodBeat.o(12185);
      }
    }
  }

  public short getShort(int paramInt)
  {
    AppMethodBeat.i(12183);
    Object localObject = get(paramInt);
    int i;
    if (localObject == null)
    {
      paramInt = 0;
      AppMethodBeat.o(12183);
      i = paramInt;
    }
    while (true)
    {
      return i;
      int j;
      if ((localObject instanceof Number))
      {
        paramInt = ((Number)localObject).shortValue();
        AppMethodBeat.o(12183);
        j = paramInt;
      }
      else
      {
        paramInt = Short.parseShort(localObject.toString());
        AppMethodBeat.o(12183);
        j = paramInt;
      }
    }
  }

  public String getString(int paramInt)
  {
    AppMethodBeat.i(12182);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(12182);
    }
    while (true)
    {
      return localObject;
      localObject = localObject.toString();
      AppMethodBeat.o(12182);
    }
  }

  public int getType(int paramInt)
  {
    AppMethodBeat.i(12189);
    paramInt = DatabaseUtils.getTypeOfObject(get(paramInt));
    AppMethodBeat.o(12189);
    return paramInt;
  }

  public boolean isNull(int paramInt)
  {
    AppMethodBeat.i(12190);
    boolean bool;
    if (get(paramInt) == null)
    {
      bool = true;
      AppMethodBeat.o(12190);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(12190);
    }
  }

  public MatrixCursor.RowBuilder newRow()
  {
    AppMethodBeat.i(12177);
    this.rowCount += 1;
    int i = this.rowCount * this.columnCount;
    ensureCapacity(i);
    MatrixCursor.RowBuilder localRowBuilder = new MatrixCursor.RowBuilder(this, i - this.columnCount, i);
    AppMethodBeat.o(12177);
    return localRowBuilder;
  }

  public void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.MatrixCursor
 * JD-Core Version:    0.6.2
 */