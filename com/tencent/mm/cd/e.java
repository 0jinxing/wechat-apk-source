package com.tencent.mm.cd;

import android.database.AbstractCursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends AbstractCursor
{
  private final int columnCount;
  private final String[] columnNames;
  private Object[] data;
  private int rowCount;

  private e(String[] paramArrayOfString)
  {
    AppMethodBeat.i(59038);
    this.rowCount = 0;
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    this.data = new Object[this.columnCount * 16];
    AppMethodBeat.o(59038);
  }

  public e(String[] paramArrayOfString, byte paramByte)
  {
    this(paramArrayOfString);
  }

  private static int cM(Object paramObject)
  {
    int i;
    if (paramObject == null)
      i = 0;
    while (true)
    {
      return i;
      if ((paramObject instanceof byte[]))
        i = 4;
      else if (((paramObject instanceof Float)) || ((paramObject instanceof Double)))
        i = 2;
      else if (((paramObject instanceof Long)) || ((paramObject instanceof Integer)) || ((paramObject instanceof Short)) || ((paramObject instanceof Byte)))
        i = 1;
      else
        i = 3;
    }
  }

  private void ensureCapacity(int paramInt)
  {
    AppMethodBeat.i(59041);
    Object[] arrayOfObject;
    int i;
    if (paramInt > this.data.length)
    {
      arrayOfObject = this.data;
      i = this.data.length * 2;
      if (i >= paramInt)
        break label58;
    }
    while (true)
    {
      this.data = new Object[paramInt];
      System.arraycopy(arrayOfObject, 0, this.data, 0, arrayOfObject.length);
      AppMethodBeat.o(59041);
      return;
      label58: paramInt = i;
    }
  }

  private Object get(int paramInt)
  {
    AppMethodBeat.i(59039);
    if ((paramInt < 0) || (paramInt >= this.columnCount))
    {
      localObject = new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
      AppMethodBeat.o(59039);
      throw ((Throwable)localObject);
    }
    if (this.mPos < 0)
    {
      localObject = new CursorIndexOutOfBoundsException("Before first row.");
      AppMethodBeat.o(59039);
      throw ((Throwable)localObject);
    }
    if (this.mPos >= this.rowCount)
    {
      localObject = new CursorIndexOutOfBoundsException("After last row.");
      AppMethodBeat.o(59039);
      throw ((Throwable)localObject);
    }
    Object localObject = this.data[(this.mPos * this.columnCount + paramInt)];
    AppMethodBeat.o(59039);
    return localObject;
  }

  public final void addRow(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(59040);
    if (paramArrayOfObject.length != this.columnCount)
    {
      paramArrayOfObject = new IllegalArgumentException("columnNames.length = " + this.columnCount + ", columnValues.length = " + paramArrayOfObject.length);
      AppMethodBeat.o(59040);
      throw paramArrayOfObject;
    }
    int i = this.rowCount;
    this.rowCount = (i + 1);
    i *= this.columnCount;
    ensureCapacity(this.columnCount + i);
    System.arraycopy(paramArrayOfObject, 0, this.data, i, this.columnCount);
    AppMethodBeat.o(59040);
  }

  public final void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    AppMethodBeat.i(59051);
    if ((paramInt < 0) || (paramInt >= getCount()))
      AppMethodBeat.o(59051);
    while (true)
    {
      return;
      paramCursorWindow.acquireReference();
      try
      {
        int i = getPosition();
        int j = getColumnCount();
        paramCursorWindow.clear();
        paramCursorWindow.setStartPosition(paramInt);
        paramCursorWindow.setNumColumns(j);
        if (moveToPosition(paramInt))
          label62: if (!paramCursorWindow.allocRow());
        label284: for (int k = 0; ; k++)
        {
          Object localObject1;
          boolean bool;
          if (k < j)
            switch (cM(get(k)))
            {
            case 3:
            default:
              localObject1 = getString(k);
              if (localObject1 != null)
                bool = paramCursorWindow.putString((String)localObject1, paramInt, k);
              break;
            case 0:
            case 1:
            case 2:
            case 4:
            }
          while (true)
          {
            if (bool)
              break label284;
            paramCursorWindow.freeLastRow();
            paramInt++;
            if (moveToNext())
              break label62;
            moveToPosition(i);
            paramCursorWindow.releaseReference();
            AppMethodBeat.o(59051);
            break;
            bool = paramCursorWindow.putNull(paramInt, k);
            continue;
            bool = paramCursorWindow.putLong(getLong(k), paramInt, k);
            continue;
            bool = paramCursorWindow.putDouble(getDouble(k), paramInt, k);
            continue;
            localObject1 = getBlob(k);
            if (localObject1 != null)
            {
              bool = paramCursorWindow.putBlob((byte[])localObject1, paramInt, k);
            }
            else
            {
              bool = paramCursorWindow.putNull(paramInt, k);
              continue;
              bool = paramCursorWindow.putNull(paramInt, k);
            }
          }
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        paramCursorWindow.releaseReference();
        AppMethodBeat.o(59051);
      }
      finally
      {
        paramCursorWindow.releaseReference();
        AppMethodBeat.o(59051);
      }
    }
  }

  public final byte[] getBlob(int paramInt)
  {
    AppMethodBeat.i(59048);
    byte[] arrayOfByte = (byte[])get(paramInt);
    AppMethodBeat.o(59048);
    return arrayOfByte;
  }

  public final String[] getColumnNames()
  {
    return this.columnNames;
  }

  public final int getCount()
  {
    return this.rowCount;
  }

  public final double getDouble(int paramInt)
  {
    AppMethodBeat.i(59047);
    Object localObject = get(paramInt);
    double d;
    if (localObject == null)
    {
      AppMethodBeat.o(59047);
      d = 0.0D;
    }
    while (true)
    {
      return d;
      if ((localObject instanceof Number))
      {
        d = ((Number)localObject).doubleValue();
        AppMethodBeat.o(59047);
      }
      else
      {
        d = bo.getDouble(localObject.toString(), 0.0D);
        AppMethodBeat.o(59047);
      }
    }
  }

  public final float getFloat(int paramInt)
  {
    AppMethodBeat.i(59046);
    Object localObject = get(paramInt);
    float f;
    if (localObject == null)
    {
      AppMethodBeat.o(59046);
      f = 0.0F;
    }
    while (true)
    {
      return f;
      if ((localObject instanceof Number))
      {
        f = ((Number)localObject).floatValue();
        AppMethodBeat.o(59046);
      }
      else
      {
        f = bo.getFloat(localObject.toString(), 0.0F);
        AppMethodBeat.o(59046);
      }
    }
  }

  public final int getInt(int paramInt)
  {
    AppMethodBeat.i(59044);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      AppMethodBeat.o(59044);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if ((localObject instanceof Number))
      {
        paramInt = ((Number)localObject).intValue();
        AppMethodBeat.o(59044);
      }
      else
      {
        paramInt = bo.getInt(localObject.toString(), 0);
        AppMethodBeat.o(59044);
      }
    }
  }

  public final long getLong(int paramInt)
  {
    AppMethodBeat.i(59045);
    Object localObject = get(paramInt);
    long l;
    if (localObject == null)
    {
      AppMethodBeat.o(59045);
      l = 0L;
    }
    while (true)
    {
      return l;
      if ((localObject instanceof Number))
      {
        l = ((Number)localObject).longValue();
        AppMethodBeat.o(59045);
      }
      else
      {
        l = bo.getLong(localObject.toString(), 0L);
        AppMethodBeat.o(59045);
      }
    }
  }

  public final short getShort(int paramInt)
  {
    AppMethodBeat.i(59043);
    Object localObject = get(paramInt);
    int i;
    if (localObject == null)
    {
      paramInt = 0;
      AppMethodBeat.o(59043);
      i = paramInt;
    }
    while (true)
    {
      return i;
      int j;
      if ((localObject instanceof Number))
      {
        paramInt = ((Number)localObject).shortValue();
        AppMethodBeat.o(59043);
        j = paramInt;
      }
      else
      {
        paramInt = Short.parseShort(localObject.toString());
        AppMethodBeat.o(59043);
        j = paramInt;
      }
    }
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(59042);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(59042);
    }
    while (true)
    {
      return localObject;
      localObject = localObject.toString();
      AppMethodBeat.o(59042);
    }
  }

  public final int getType(int paramInt)
  {
    AppMethodBeat.i(59049);
    paramInt = cM(get(paramInt));
    AppMethodBeat.o(59049);
    return paramInt;
  }

  public final boolean isNull(int paramInt)
  {
    AppMethodBeat.i(59050);
    boolean bool;
    if (get(paramInt) == null)
    {
      bool = true;
      AppMethodBeat.o(59050);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59050);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.e
 * JD-Core Version:    0.6.2
 */