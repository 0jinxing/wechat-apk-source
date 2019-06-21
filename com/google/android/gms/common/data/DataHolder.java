package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@KeepName
@SafeParcelable.Class(creator="DataHolderCreator", validate=true)
public final class DataHolder extends AbstractSafeParcelable
  implements Closeable
{
  public static final Parcelable.Creator<DataHolder> CREATOR;
  private static final DataHolder.Builder zznt;
  private boolean mClosed;

  @SafeParcelable.VersionField(id=1000)
  private final int zzal;

  @SafeParcelable.Field(getter="getStatusCode", id=3)
  private final int zzam;

  @SafeParcelable.Field(getter="getColumns", id=1)
  private final String[] zznm;
  private Bundle zznn;

  @SafeParcelable.Field(getter="getWindows", id=2)
  private final CursorWindow[] zzno;

  @SafeParcelable.Field(getter="getMetadata", id=4)
  private final Bundle zznp;
  private int[] zznq;
  private int zznr;
  private boolean zzns;

  static
  {
    AppMethodBeat.i(61122);
    CREATOR = new DataHolderCreator();
    zznt = new zza(new String[0], null);
    AppMethodBeat.o(61122);
  }

  @SafeParcelable.Constructor
  DataHolder(@SafeParcelable.Param(id=1000) int paramInt1, @SafeParcelable.Param(id=1) String[] paramArrayOfString, @SafeParcelable.Param(id=2) CursorWindow[] paramArrayOfCursorWindow, @SafeParcelable.Param(id=3) int paramInt2, @SafeParcelable.Param(id=4) Bundle paramBundle)
  {
    this.mClosed = false;
    this.zzns = true;
    this.zzal = paramInt1;
    this.zznm = paramArrayOfString;
    this.zzno = paramArrayOfCursorWindow;
    this.zzam = paramInt2;
    this.zznp = paramBundle;
  }

  public DataHolder(Cursor paramCursor, int paramInt, Bundle paramBundle)
  {
    this(new CursorWrapper(paramCursor), paramInt, paramBundle);
    AppMethodBeat.i(61090);
    AppMethodBeat.o(61090);
  }

  private DataHolder(DataHolder.Builder paramBuilder, int paramInt, Bundle paramBundle)
  {
    this(DataHolder.Builder.zza(paramBuilder), zza(paramBuilder, -1), paramInt, paramBundle);
    AppMethodBeat.i(61091);
    AppMethodBeat.o(61091);
  }

  private DataHolder(DataHolder.Builder paramBuilder, int paramInt1, Bundle paramBundle, int paramInt2)
  {
    this(DataHolder.Builder.zza(paramBuilder), zza(paramBuilder, paramInt2), paramInt1, paramBundle);
    AppMethodBeat.i(61092);
    AppMethodBeat.o(61092);
  }

  public DataHolder(CursorWrapper paramCursorWrapper, int paramInt, Bundle paramBundle)
  {
    this(paramCursorWrapper.getColumnNames(), zza(paramCursorWrapper), paramInt, paramBundle);
    AppMethodBeat.i(61089);
    AppMethodBeat.o(61089);
  }

  public DataHolder(String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(61088);
    this.mClosed = false;
    this.zzns = true;
    this.zzal = 1;
    this.zznm = ((String[])Preconditions.checkNotNull(paramArrayOfString));
    this.zzno = ((CursorWindow[])Preconditions.checkNotNull(paramArrayOfCursorWindow));
    this.zzam = paramInt;
    this.zznp = paramBundle;
    validateContents();
    AppMethodBeat.o(61088);
  }

  public static DataHolder.Builder builder(String[] paramArrayOfString)
  {
    AppMethodBeat.i(61118);
    paramArrayOfString = new DataHolder.Builder(paramArrayOfString, null, null);
    AppMethodBeat.o(61118);
    return paramArrayOfString;
  }

  public static DataHolder.Builder builder(String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(61119);
    Preconditions.checkNotNull(paramString);
    paramArrayOfString = new DataHolder.Builder(paramArrayOfString, paramString, null);
    AppMethodBeat.o(61119);
    return paramArrayOfString;
  }

  public static DataHolder empty(int paramInt)
  {
    AppMethodBeat.i(61120);
    DataHolder localDataHolder = empty(paramInt, null);
    AppMethodBeat.o(61120);
    return localDataHolder;
  }

  public static DataHolder empty(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(61121);
    paramBundle = new DataHolder(zznt, paramInt, paramBundle);
    AppMethodBeat.o(61121);
    return paramBundle;
  }

  private final void zza(String paramString, int paramInt)
  {
    AppMethodBeat.i(61098);
    if ((this.zznn == null) || (!this.zznn.containsKey(paramString)))
    {
      paramString = String.valueOf(paramString);
      if (paramString.length() != 0);
      for (paramString = "No such column: ".concat(paramString); ; paramString = new String("No such column: "))
      {
        paramString = new IllegalArgumentException(paramString);
        AppMethodBeat.o(61098);
        throw paramString;
      }
    }
    if (isClosed())
    {
      paramString = new IllegalArgumentException("Buffer is closed.");
      AppMethodBeat.o(61098);
      throw paramString;
    }
    if ((paramInt < 0) || (paramInt >= this.zznr))
    {
      paramString = new CursorIndexOutOfBoundsException(paramInt, this.zznr);
      AppMethodBeat.o(61098);
      throw paramString;
    }
    AppMethodBeat.o(61098);
  }

  private static CursorWindow[] zza(DataHolder.Builder paramBuilder, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(61097);
    if (DataHolder.Builder.zza(paramBuilder).length == 0)
    {
      paramBuilder = new CursorWindow[0];
      AppMethodBeat.o(61097);
    }
    while (true)
    {
      return paramBuilder;
      Object localObject1;
      label47: Object localObject2;
      ArrayList localArrayList;
      int k;
      Object localObject3;
      if ((paramInt < 0) || (paramInt >= DataHolder.Builder.zzb(paramBuilder).size()))
      {
        localObject1 = DataHolder.Builder.zzb(paramBuilder);
        int j = ((List)localObject1).size();
        localObject2 = new CursorWindow(false);
        localArrayList = new ArrayList();
        localArrayList.add(localObject2);
        ((CursorWindow)localObject2).setNumColumns(DataHolder.Builder.zza(paramBuilder).length);
        paramInt = 0;
        k = 0;
        if (paramInt < j)
          localObject3 = localObject2;
      }
      else
      {
        try
        {
          if (!((CursorWindow)localObject2).allocRow())
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>(72);
            ((StringBuilder)localObject3).append("Allocating additional cursor window for large data set (row ").append(paramInt).append(")");
            localObject2 = new android/database/CursorWindow;
            ((CursorWindow)localObject2).<init>(false);
            ((CursorWindow)localObject2).setStartPosition(paramInt);
            ((CursorWindow)localObject2).setNumColumns(DataHolder.Builder.zza(paramBuilder).length);
            localArrayList.add(localObject2);
            localObject3 = localObject2;
            if (!((CursorWindow)localObject2).allocRow())
            {
              localArrayList.remove(localObject2);
              paramBuilder = (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
              AppMethodBeat.o(61097);
              continue;
              localObject1 = DataHolder.Builder.zzb(paramBuilder).subList(0, paramInt);
              break label47;
            }
          }
          Map localMap = (Map)((List)localObject1).get(paramInt);
          m = 0;
          bool = true;
          if ((m < DataHolder.Builder.zza(paramBuilder).length) && (bool))
          {
            localObject2 = DataHolder.Builder.zza(paramBuilder)[m];
            Object localObject4 = localMap.get(localObject2);
            if (localObject4 == null)
              bool = ((CursorWindow)localObject3).putNull(paramInt, m);
            while (true)
            {
              m++;
              break;
              if ((localObject4 instanceof String))
              {
                bool = ((CursorWindow)localObject3).putString((String)localObject4, paramInt, m);
              }
              else if ((localObject4 instanceof Long))
              {
                bool = ((CursorWindow)localObject3).putLong(((Long)localObject4).longValue(), paramInt, m);
              }
              else if ((localObject4 instanceof Integer))
              {
                bool = ((CursorWindow)localObject3).putLong(((Integer)localObject4).intValue(), paramInt, m);
              }
              else
              {
                if ((localObject4 instanceof Boolean))
                {
                  if (((Boolean)localObject4).booleanValue());
                  for (long l = 1L; ; l = 0L)
                  {
                    bool = ((CursorWindow)localObject3).putLong(l, paramInt, m);
                    break;
                  }
                }
                if ((localObject4 instanceof byte[]))
                {
                  bool = ((CursorWindow)localObject3).putBlob((byte[])localObject4, paramInt, m);
                }
                else if ((localObject4 instanceof Double))
                {
                  bool = ((CursorWindow)localObject3).putDouble(((Double)localObject4).doubleValue(), paramInt, m);
                }
                else
                {
                  if (!(localObject4 instanceof Float))
                    break label526;
                  bool = ((CursorWindow)localObject3).putDouble(((Float)localObject4).floatValue(), paramInt, m);
                }
              }
            }
            label526: paramBuilder = new java/lang/IllegalArgumentException;
            localObject1 = String.valueOf(localObject4);
            paramInt = String.valueOf(localObject2).length();
            k = String.valueOf(localObject1).length();
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>(paramInt + 32 + k);
            paramBuilder.<init>("Unsupported object for column " + (String)localObject2 + ": " + (String)localObject1);
            AppMethodBeat.o(61097);
            throw paramBuilder;
          }
        }
        catch (RuntimeException paramBuilder)
        {
          int m;
          boolean bool;
          k = localArrayList.size();
          paramInt = i;
          while (paramInt < k)
          {
            ((CursorWindow)localArrayList.get(paramInt)).close();
            paramInt++;
            continue;
            if (!bool)
            {
              if (k != 0)
              {
                paramBuilder = new com/google/android/gms/common/data/DataHolder$DataHolderException;
                paramBuilder.<init>("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                AppMethodBeat.o(61097);
                throw paramBuilder;
              }
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>(74);
              ((StringBuilder)localObject2).append("Couldn't populate window data for row ").append(paramInt).append(" - allocating new window.");
              ((CursorWindow)localObject3).freeLastRow();
              localObject3 = new android/database/CursorWindow;
              ((CursorWindow)localObject3).<init>(false);
              ((CursorWindow)localObject3).setStartPosition(paramInt);
              ((CursorWindow)localObject3).setNumColumns(DataHolder.Builder.zza(paramBuilder).length);
              localArrayList.add(localObject3);
              k = paramInt - 1;
            }
            for (paramInt = 1; ; paramInt = m)
            {
              m = k + 1;
              k = paramInt;
              paramInt = m;
              localObject2 = localObject3;
              break;
              m = 0;
              k = paramInt;
            }
          }
          AppMethodBeat.o(61097);
          throw paramBuilder;
        }
      }
      paramBuilder = (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
      AppMethodBeat.o(61097);
    }
  }

  private static CursorWindow[] zza(CursorWrapper paramCursorWrapper)
  {
    AppMethodBeat.i(61096);
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      try
      {
        int i = paramCursorWrapper.getCount();
        CursorWindow localCursorWindow = paramCursorWrapper.getWindow();
        if ((localCursorWindow == null) || (localCursorWindow.getStartPosition() != 0))
          break label185;
        localCursorWindow.acquireReference();
        paramCursorWrapper.setWindow(null);
        localArrayList.add(localCursorWindow);
        j = localCursorWindow.getNumRows();
        if ((j < i) && (paramCursorWrapper.moveToPosition(j)))
        {
          localCursorWindow = paramCursorWrapper.getWindow();
          if (localCursorWindow != null)
          {
            localCursorWindow.acquireReference();
            paramCursorWrapper.setWindow(null);
            if (localCursorWindow.getNumRows() == 0)
              break label158;
            localArrayList.add(localCursorWindow);
            j = localCursorWindow.getStartPosition();
            j = localCursorWindow.getNumRows() + j;
            continue;
          }
          localCursorWindow = new android/database/CursorWindow;
          localCursorWindow.<init>(false);
          localCursorWindow.setStartPosition(j);
          paramCursorWrapper.fillWindow(j, localCursorWindow);
          continue;
        }
      }
      finally
      {
        paramCursorWrapper.close();
        AppMethodBeat.o(61096);
      }
      label158: paramCursorWrapper.close();
      paramCursorWrapper = (CursorWindow[])localArrayList.toArray(new CursorWindow[localArrayList.size()]);
      AppMethodBeat.o(61096);
      return paramCursorWrapper;
      label185: int j = 0;
    }
  }

  public final void clearColumn(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61110);
    zza(paramString, paramInt1);
    this.zzno[paramInt2].putNull(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61110);
  }

  public final void close()
  {
    AppMethodBeat.i(61116);
    try
    {
      if (!this.mClosed)
      {
        this.mClosed = true;
        for (int i = 0; i < this.zzno.length; i++)
          this.zzno[i].close();
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(61116);
    }
  }

  public final void copyToBuffer(String paramString, int paramInt1, int paramInt2, CharArrayBuffer paramCharArrayBuffer)
  {
    AppMethodBeat.i(61108);
    zza(paramString, paramInt1);
    this.zzno[paramInt2].copyStringToBuffer(paramInt1, this.zznn.getInt(paramString), paramCharArrayBuffer);
    AppMethodBeat.o(61108);
  }

  public final void disableLeakDetection()
  {
    this.zzns = false;
  }

  protected final void finalize()
  {
    AppMethodBeat.i(61117);
    try
    {
      if ((this.zzns) && (this.zzno.length > 0) && (!isClosed()))
      {
        close();
        String str = toString();
        int i = String.valueOf(str).length();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(i + 178);
        localStringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(str).append(")");
      }
      return;
    }
    finally
    {
      super.finalize();
      AppMethodBeat.o(61117);
    }
  }

  public final boolean getBoolean(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61103);
    zza(paramString, paramInt1);
    boolean bool;
    if (this.zzno[paramInt2].getLong(paramInt1, this.zznn.getInt(paramString)) == 1L)
    {
      bool = true;
      AppMethodBeat.o(61103);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(61103);
    }
  }

  public final byte[] getByteArray(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61106);
    zza(paramString, paramInt1);
    paramString = this.zzno[paramInt2].getBlob(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61106);
    return paramString;
  }

  public final int getCount()
  {
    return this.zznr;
  }

  public final double getDouble(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61105);
    zza(paramString, paramInt1);
    double d = this.zzno[paramInt2].getDouble(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61105);
    return d;
  }

  public final float getFloat(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61104);
    zza(paramString, paramInt1);
    float f = this.zzno[paramInt2].getFloat(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61104);
    return f;
  }

  public final int getInteger(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61101);
    zza(paramString, paramInt1);
    paramInt1 = this.zzno[paramInt2].getInt(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61101);
    return paramInt1;
  }

  public final long getLong(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61100);
    zza(paramString, paramInt1);
    long l = this.zzno[paramInt2].getLong(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61100);
    return l;
  }

  public final Bundle getMetadata()
  {
    return this.zznp;
  }

  public final int getStatusCode()
  {
    return this.zzam;
  }

  public final String getString(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61102);
    zza(paramString, paramInt1);
    paramString = this.zzno[paramInt2].getString(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61102);
    return paramString;
  }

  public final int getWindowIndex(int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(61115);
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.zznr))
    {
      bool = true;
      Preconditions.checkState(bool);
    }
    while (true)
    {
      int j = i;
      if (i < this.zznq.length)
      {
        if (paramInt < this.zznq[i])
          j = i - 1;
      }
      else
      {
        paramInt = j;
        if (j == this.zznq.length)
          paramInt = j - 1;
        AppMethodBeat.o(61115);
        return paramInt;
        bool = false;
        break;
      }
      i++;
    }
  }

  public final boolean hasColumn(String paramString)
  {
    AppMethodBeat.i(61099);
    boolean bool = this.zznn.containsKey(paramString);
    AppMethodBeat.o(61099);
    return bool;
  }

  public final boolean hasNull(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61109);
    zza(paramString, paramInt1);
    boolean bool = this.zzno[paramInt2].isNull(paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61109);
    return bool;
  }

  public final boolean isClosed()
  {
    try
    {
      boolean bool = this.mClosed;
      return bool;
    }
    finally
    {
    }
  }

  public final void logCursorMetadataForDebugging()
  {
    AppMethodBeat.i(61095);
    int i = this.zzno.length;
    new StringBuilder(32).append("num cursor windows : ").append(i);
    i = this.zznr;
    new StringBuilder(46).append("total number of objects in holder: ").append(i);
    i = this.zznq.length;
    new StringBuilder(42).append("total mumber of windowOffsets: ").append(i);
    for (i = 0; i < this.zznq.length; i++)
    {
      int j = this.zznq[i];
      new StringBuilder(43).append("offset for window ").append(i).append(" : ").append(j);
      j = this.zzno[i].getNumRows();
      new StringBuilder(45).append("num rows for window ").append(i).append(" : ").append(j);
      j = this.zzno[i].getStartPosition();
      new StringBuilder(46).append("start pos for window ").append(i).append(" : ").append(j);
    }
    AppMethodBeat.o(61095);
  }

  public final Uri parseUri(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(61107);
    paramString = getString(paramString, paramInt1, paramInt2);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(61107);
    }
    while (true)
    {
      return paramString;
      paramString = Uri.parse(paramString);
      AppMethodBeat.o(61107);
    }
  }

  public final void replaceValue(String paramString, int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(61112);
    zza(paramString, paramInt1);
    this.zzno[paramInt2].putDouble(paramDouble, paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61112);
  }

  public final void replaceValue(String paramString, int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(61113);
    zza(paramString, paramInt1);
    this.zzno[paramInt2].putLong(paramLong, paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61113);
  }

  public final void replaceValue(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(61111);
    zza(paramString1, paramInt1);
    this.zzno[paramInt2].putString(paramString2, paramInt1, this.zznn.getInt(paramString1));
    AppMethodBeat.o(61111);
  }

  public final void replaceValue(String paramString, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(61114);
    zza(paramString, paramInt1);
    this.zzno[paramInt2].putBlob(paramArrayOfByte, paramInt1, this.zznn.getInt(paramString));
    AppMethodBeat.o(61114);
  }

  public final void validateContents()
  {
    AppMethodBeat.i(61093);
    this.zznn = new Bundle();
    for (int i = 0; i < this.zznm.length; i++)
      this.zznn.putInt(this.zznm[i], i);
    this.zznq = new int[this.zzno.length];
    i = 0;
    int j = 0;
    while (i < this.zzno.length)
    {
      this.zznq[i] = j;
      int k = this.zzno[i].getStartPosition();
      j += this.zzno[i].getNumRows() - (j - k);
      i++;
    }
    this.zznr = j;
    AppMethodBeat.o(61093);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(61094);
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeStringArray(paramParcel, 1, this.zznm, false);
    SafeParcelWriter.writeTypedArray(paramParcel, 2, this.zzno, paramInt, false);
    SafeParcelWriter.writeInt(paramParcel, 3, getStatusCode());
    SafeParcelWriter.writeBundle(paramParcel, 4, getMetadata(), false);
    SafeParcelWriter.writeInt(paramParcel, 1000, this.zzal);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
    if ((paramInt & 0x1) != 0)
      close();
    AppMethodBeat.o(61094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder
 * JD-Core Version:    0.6.2
 */