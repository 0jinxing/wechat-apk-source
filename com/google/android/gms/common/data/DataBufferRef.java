package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class DataBufferRef
{
  protected final DataHolder mDataHolder;
  protected int mDataRow;
  private int zznj;

  public DataBufferRef(DataHolder paramDataHolder, int paramInt)
  {
    AppMethodBeat.i(61049);
    this.mDataHolder = ((DataHolder)Preconditions.checkNotNull(paramDataHolder));
    setDataRow(paramInt);
    AppMethodBeat.o(61049);
  }

  protected void copyToBuffer(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    AppMethodBeat.i(61061);
    this.mDataHolder.copyToBuffer(paramString, this.mDataRow, this.zznj, paramCharArrayBuffer);
    AppMethodBeat.o(61061);
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(61064);
    if ((paramObject instanceof DataBufferRef))
    {
      paramObject = (DataBufferRef)paramObject;
      if ((Objects.equal(Integer.valueOf(paramObject.mDataRow), Integer.valueOf(this.mDataRow))) && (Objects.equal(Integer.valueOf(paramObject.zznj), Integer.valueOf(this.zznj))) && (paramObject.mDataHolder == this.mDataHolder))
      {
        bool = true;
        AppMethodBeat.o(61064);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(61064);
      continue;
      AppMethodBeat.o(61064);
    }
  }

  protected boolean getBoolean(String paramString)
  {
    AppMethodBeat.i(61055);
    boolean bool = this.mDataHolder.getBoolean(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61055);
    return bool;
  }

  protected byte[] getByteArray(String paramString)
  {
    AppMethodBeat.i(61059);
    paramString = this.mDataHolder.getByteArray(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61059);
    return paramString;
  }

  protected int getDataRow()
  {
    return this.mDataRow;
  }

  protected double getDouble(String paramString)
  {
    AppMethodBeat.i(61058);
    double d = this.mDataHolder.getDouble(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61058);
    return d;
  }

  protected float getFloat(String paramString)
  {
    AppMethodBeat.i(61057);
    float f = this.mDataHolder.getFloat(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61057);
    return f;
  }

  protected int getInteger(String paramString)
  {
    AppMethodBeat.i(61054);
    int i = this.mDataHolder.getInteger(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61054);
    return i;
  }

  protected long getLong(String paramString)
  {
    AppMethodBeat.i(61053);
    long l = this.mDataHolder.getLong(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61053);
    return l;
  }

  protected String getString(String paramString)
  {
    AppMethodBeat.i(61056);
    paramString = this.mDataHolder.getString(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61056);
    return paramString;
  }

  public boolean hasColumn(String paramString)
  {
    AppMethodBeat.i(61052);
    boolean bool = this.mDataHolder.hasColumn(paramString);
    AppMethodBeat.o(61052);
    return bool;
  }

  protected boolean hasNull(String paramString)
  {
    AppMethodBeat.i(61062);
    boolean bool = this.mDataHolder.hasNull(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61062);
    return bool;
  }

  public int hashCode()
  {
    AppMethodBeat.i(61063);
    int i = Objects.hashCode(new Object[] { Integer.valueOf(this.mDataRow), Integer.valueOf(this.zznj), this.mDataHolder });
    AppMethodBeat.o(61063);
    return i;
  }

  public boolean isDataValid()
  {
    AppMethodBeat.i(61051);
    boolean bool;
    if (!this.mDataHolder.isClosed())
    {
      bool = true;
      AppMethodBeat.o(61051);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(61051);
    }
  }

  protected Uri parseUri(String paramString)
  {
    AppMethodBeat.i(61060);
    paramString = this.mDataHolder.parseUri(paramString, this.mDataRow, this.zznj);
    AppMethodBeat.o(61060);
    return paramString;
  }

  protected void setDataRow(int paramInt)
  {
    AppMethodBeat.i(61050);
    if ((paramInt >= 0) && (paramInt < this.mDataHolder.getCount()));
    for (boolean bool = true; ; bool = false)
    {
      Preconditions.checkState(bool);
      this.mDataRow = paramInt;
      this.zznj = this.mDataHolder.getWindowIndex(this.mDataRow);
      AppMethodBeat.o(61050);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBufferRef
 * JD-Core Version:    0.6.2
 */