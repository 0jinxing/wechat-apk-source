package com.tencent.mm.cd.a;

import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.AbstractCursor;
import java.util.HashMap;

public final class e extends AbstractCursor
  implements d
{
  private DataSetObserver mObserver;
  private d ycr;
  public d[] ycs;

  public e(d[] paramArrayOfd)
  {
    AppMethodBeat.i(59148);
    this.mObserver = new e.1(this);
    this.ycs = paramArrayOfd;
    this.ycr = paramArrayOfd[0];
    while (i < this.ycs.length)
    {
      if (this.ycs[i] != null)
        this.ycs[i].registerDataSetObserver(this.mObserver);
      i++;
    }
    AppMethodBeat.o(59148);
  }

  public final boolean MF(int paramInt)
  {
    AppMethodBeat.i(59173);
    int i = this.ycs.length;
    boolean bool1 = true;
    int j = 0;
    while (j < i)
    {
      boolean bool2 = bool1;
      if (this.ycs[j] != null)
      {
        bool2 = bool1;
        if (!this.ycs[j].MF(paramInt))
          bool2 = false;
      }
      j++;
      bool1 = bool2;
    }
    AppMethodBeat.o(59173);
    return bool1;
  }

  public final a MG(int paramInt)
  {
    AppMethodBeat.i(59170);
    int i = this.ycs.length;
    int j = 0;
    int k;
    a locala;
    if (j < i)
    {
      k = this.ycs[j].getCount();
      if (paramInt < k)
      {
        locala = this.ycs[j].MG(paramInt);
        AppMethodBeat.o(59170);
      }
    }
    while (true)
    {
      return locala;
      paramInt -= k;
      j++;
      break;
      locala = null;
      AppMethodBeat.o(59170);
    }
  }

  public final void MH(int paramInt)
  {
    AppMethodBeat.i(59176);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].MH(paramInt);
    AppMethodBeat.o(59176);
  }

  public final void a(f.a parama)
  {
    AppMethodBeat.i(59167);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].a(parama);
    AppMethodBeat.o(59167);
  }

  public final boolean a(Object paramObject, a parama)
  {
    AppMethodBeat.i(59171);
    int i = this.ycs.length;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2)
    {
      bool2 = bool1;
      if (this.ycs[j] != null)
      {
        bool2 = bool1;
        if (this.ycs[j].a(paramObject, parama))
          bool2 = true;
      }
      j++;
    }
    AppMethodBeat.o(59171);
    return bool1;
  }

  public final boolean cK(Object paramObject)
  {
    AppMethodBeat.i(59174);
    int i = this.ycs.length;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2)
    {
      bool2 = bool1;
      if (this.ycs[j] != null)
      {
        bool2 = bool1;
        if (this.ycs[j].cK(paramObject))
          bool2 = true;
      }
      j++;
    }
    AppMethodBeat.o(59174);
    return bool1;
  }

  public final a cL(Object paramObject)
  {
    AppMethodBeat.i(59175);
    paramObject = this.ycr.cL(paramObject);
    AppMethodBeat.o(59175);
    return paramObject;
  }

  public final void close()
  {
    AppMethodBeat.i(59161);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].close();
    super.close();
    AppMethodBeat.o(59161);
  }

  public final void copyStringToBuffer(int paramInt, CharArrayBuffer paramCharArrayBuffer)
  {
  }

  public final void deactivate()
  {
    AppMethodBeat.i(59160);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].deactivate();
    super.deactivate();
    AppMethodBeat.o(59160);
  }

  public final SparseArray<Object>[] dvp()
  {
    AppMethodBeat.i(59172);
    int i = this.ycs.length;
    SparseArray[] arrayOfSparseArray = new SparseArray[i];
    int j = 0;
    if (j < i)
    {
      Object localObject = this.ycs[j].dvp();
      if (localObject != null);
      for (localObject = localObject[0]; ; localObject = null)
      {
        arrayOfSparseArray[j] = localObject;
        j++;
        break;
      }
    }
    AppMethodBeat.o(59172);
    return arrayOfSparseArray;
  }

  public final HashMap dvq()
  {
    return null;
  }

  public final boolean dvr()
  {
    AppMethodBeat.i(59169);
    int i = this.ycs.length;
    boolean bool1 = true;
    int j = 0;
    while (j < i)
    {
      boolean bool2 = bool1;
      if (this.ycs[j] != null)
      {
        bool2 = bool1;
        if (!this.ycs[j].dvr())
          bool2 = false;
      }
      j++;
      bool1 = bool2;
    }
    AppMethodBeat.o(59169);
    return bool1;
  }

  public final byte[] getBlob(int paramInt)
  {
    AppMethodBeat.i(59158);
    byte[] arrayOfByte = this.ycr.getBlob(paramInt);
    AppMethodBeat.o(59158);
    return arrayOfByte;
  }

  public final String[] getColumnNames()
  {
    AppMethodBeat.i(59159);
    String[] arrayOfString;
    if (this.ycr != null)
    {
      arrayOfString = this.ycr.getColumnNames();
      AppMethodBeat.o(59159);
    }
    while (true)
    {
      return arrayOfString;
      arrayOfString = new String[0];
      AppMethodBeat.o(59159);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(59149);
    int i = this.ycs.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      m = k;
      if (this.ycs[j] != null)
        m = k + this.ycs[j].getCount();
      j++;
    }
    AppMethodBeat.o(59149);
    return k;
  }

  public final double getDouble(int paramInt)
  {
    AppMethodBeat.i(59156);
    double d = this.ycr.getDouble(paramInt);
    AppMethodBeat.o(59156);
    return d;
  }

  public final float getFloat(int paramInt)
  {
    AppMethodBeat.i(59155);
    float f = this.ycr.getFloat(paramInt);
    AppMethodBeat.o(59155);
    return f;
  }

  public final int getInt(int paramInt)
  {
    AppMethodBeat.i(59153);
    paramInt = this.ycr.getInt(paramInt);
    AppMethodBeat.o(59153);
    return paramInt;
  }

  public final long getLong(int paramInt)
  {
    AppMethodBeat.i(59154);
    long l = this.ycr.getLong(paramInt);
    AppMethodBeat.o(59154);
    return l;
  }

  public final short getShort(int paramInt)
  {
    AppMethodBeat.i(59152);
    short s = this.ycr.getShort(paramInt);
    AppMethodBeat.o(59152);
    return s;
  }

  public final String getString(int paramInt)
  {
    AppMethodBeat.i(59151);
    String str = this.ycr.getString(paramInt);
    AppMethodBeat.o(59151);
    return str;
  }

  public final boolean isNull(int paramInt)
  {
    AppMethodBeat.i(59157);
    boolean bool = this.ycr.isNull(paramInt);
    AppMethodBeat.o(59157);
    return bool;
  }

  public final boolean onMove(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(59150);
    this.ycr = null;
    int i = this.ycs.length;
    paramInt1 = 0;
    int j = 0;
    int k;
    boolean bool;
    if (paramInt1 < i)
    {
      k = j;
      if (this.ycs[paramInt1] == null)
        break label113;
      if (paramInt2 < this.ycs[paramInt1].getCount() + j)
        this.ycr = this.ycs[paramInt1];
    }
    else
    {
      if (this.ycr == null)
        break label123;
      bool = this.ycr.moveToPosition(paramInt2 - j);
      AppMethodBeat.o(59150);
    }
    while (true)
    {
      return bool;
      k = j + this.ycs[paramInt1].getCount();
      label113: paramInt1++;
      j = k;
      break;
      label123: AppMethodBeat.o(59150);
      bool = false;
    }
  }

  public final void pt(boolean paramBoolean)
  {
    AppMethodBeat.i(59168);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].pt(paramBoolean);
    AppMethodBeat.o(59168);
  }

  public final void registerContentObserver(ContentObserver paramContentObserver)
  {
    AppMethodBeat.i(59162);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].registerContentObserver(paramContentObserver);
    AppMethodBeat.o(59162);
  }

  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(59164);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].registerDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(59164);
  }

  public final boolean requery()
  {
    boolean bool = false;
    AppMethodBeat.i(59166);
    int i = this.ycs.length;
    int j = 0;
    if (j < i)
      if ((this.ycs[j] != null) && (!this.ycs[j].requery()))
        AppMethodBeat.o(59166);
    while (true)
    {
      return bool;
      j++;
      break;
      bool = true;
      AppMethodBeat.o(59166);
    }
  }

  public final void unregisterContentObserver(ContentObserver paramContentObserver)
  {
    AppMethodBeat.i(59163);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].unregisterContentObserver(paramContentObserver);
    AppMethodBeat.o(59163);
  }

  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    AppMethodBeat.i(59165);
    int i = this.ycs.length;
    for (int j = 0; j < i; j++)
      if (this.ycs[j] != null)
        this.ycs[j].unregisterDataSetObserver(paramDataSetObserver);
    AppMethodBeat.o(59165);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cd.a.e
 * JD-Core Version:    0.6.2
 */