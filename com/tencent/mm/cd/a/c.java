package com.tencent.mm.cd.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CursorIndexOutOfBoundsException;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.AbstractCursor;

public final class c extends AbstractCursor
{
  final int columnCount;
  private final String[] columnNames;
  SparseArray<Object[]> ycm;
  public int ycn;
  int yco;

  private c(String[] paramArrayOfString)
  {
    AppMethodBeat.i(59136);
    this.ycn = 3000;
    this.columnNames = paramArrayOfString;
    this.columnCount = paramArrayOfString.length;
    this.ycm = new SparseArray();
    AppMethodBeat.o(59136);
  }

  public c(String[] paramArrayOfString, byte paramByte)
  {
    this(paramArrayOfString);
  }

  private Object get(int paramInt)
  {
    AppMethodBeat.i(59137);
    if ((paramInt < 0) || (paramInt >= this.columnCount))
    {
      localObject = new CursorIndexOutOfBoundsException("Requested column: " + paramInt + ", # of columns: " + this.columnCount);
      AppMethodBeat.o(59137);
      throw ((Throwable)localObject);
    }
    if (this.mPos < 0)
    {
      localObject = new CursorIndexOutOfBoundsException("Before first row.");
      AppMethodBeat.o(59137);
      throw ((Throwable)localObject);
    }
    if (this.mPos >= this.yco)
    {
      localObject = new CursorIndexOutOfBoundsException("After last row.");
      AppMethodBeat.o(59137);
      throw ((Throwable)localObject);
    }
    int i = this.mPos / this.ycn;
    int j = this.mPos;
    int k = this.ycn;
    int m = this.columnCount;
    Object localObject = ((Object[])this.ycm.get(i))[(j % k * m + paramInt)];
    AppMethodBeat.o(59137);
    return localObject;
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final byte[] getBlob(int paramInt)
  {
    AppMethodBeat.i(59145);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(59145);
    }
    while (true)
    {
      return localObject;
      localObject = (byte[])localObject;
      AppMethodBeat.o(59145);
    }
  }

  public final String[] getColumnNames()
  {
    return this.columnNames;
  }

  public final int getCount()
  {
    return this.yco;
  }

  public final double getDouble(int paramInt)
  {
    AppMethodBeat.i(59143);
    Object localObject = get(paramInt);
    double d;
    if (localObject == null)
    {
      d = 0.0D;
      AppMethodBeat.o(59143);
    }
    while (true)
    {
      return d;
      if ((localObject instanceof Number))
      {
        d = ((Number)localObject).doubleValue();
        AppMethodBeat.o(59143);
      }
      else
      {
        d = Double.parseDouble(localObject.toString());
        AppMethodBeat.o(59143);
      }
    }
  }

  public final float getFloat(int paramInt)
  {
    AppMethodBeat.i(59142);
    Object localObject = get(paramInt);
    float f;
    if (localObject == null)
    {
      f = 0.0F;
      AppMethodBeat.o(59142);
    }
    while (true)
    {
      return f;
      if ((localObject instanceof Number))
      {
        f = ((Number)localObject).floatValue();
        AppMethodBeat.o(59142);
      }
      else
      {
        f = Float.parseFloat(localObject.toString());
        AppMethodBeat.o(59142);
      }
    }
  }

  public final int getInt(int paramInt)
  {
    AppMethodBeat.i(59140);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      paramInt = 0;
      AppMethodBeat.o(59140);
    }
    while (true)
    {
      return paramInt;
      if ((localObject instanceof Number))
      {
        paramInt = ((Number)localObject).intValue();
        AppMethodBeat.o(59140);
      }
      else
      {
        paramInt = Integer.parseInt(localObject.toString());
        AppMethodBeat.o(59140);
      }
    }
  }

  public final long getLong(int paramInt)
  {
    AppMethodBeat.i(59141);
    Object localObject = get(paramInt);
    long l;
    if (localObject == null)
    {
      l = 0L;
      AppMethodBeat.o(59141);
    }
    while (true)
    {
      return l;
      if ((localObject instanceof Number))
      {
        l = ((Number)localObject).longValue();
        AppMethodBeat.o(59141);
      }
      else
      {
        l = Long.parseLong(localObject.toString());
        AppMethodBeat.o(59141);
      }
    }
  }

  public final short getShort(int paramInt)
  {
    AppMethodBeat.i(59139);
    Object localObject = get(paramInt);
    int i;
    if (localObject == null)
    {
      paramInt = 0;
      AppMethodBeat.o(59139);
      i = paramInt;
    }
    while (true)
    {
      return i;
      int j;
      if ((localObject instanceof Number))
      {
        paramInt = ((Number)localObject).shortValue();
        AppMethodBeat.o(59139);
        j = paramInt;
      }
      else
      {
        paramInt = Short.parseShort(localObject.toString());
        AppMethodBeat.o(59139);
        j = paramInt;
      }
    }
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(59138);
    Object localObject = get(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(59138);
    }
    while (true)
    {
      return localObject;
      localObject = localObject.toString();
      AppMethodBeat.o(59138);
    }
  }

  public final boolean isNull(int paramInt)
  {
    AppMethodBeat.i(59144);
    boolean bool;
    if (get(paramInt) == null)
    {
      bool = true;
      AppMethodBeat.o(59144);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(59144);
    }
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
  }

  public final class a
  {
    final int endIndex;
    int index;
    Object[] ycp;

    a(int paramInt1, int paramArrayOfObject, Object[] arg4)
    {
      this.index = paramInt1;
      this.endIndex = paramArrayOfObject;
      Object localObject;
      this.ycp = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.c
 * JD-Core Version:    0.6.2
 */