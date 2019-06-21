package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData
  implements Parcelable, Comparator<DrmInitData.SchemeData>
{
  public static final Parcelable.Creator<DrmInitData> CREATOR;
  private int aBR;
  public final DrmInitData.SchemeData[] aSw;
  public final int aSx;

  static
  {
    AppMethodBeat.i(94770);
    CREATOR = new DrmInitData.1();
    AppMethodBeat.o(94770);
  }

  DrmInitData(Parcel paramParcel)
  {
    AppMethodBeat.i(94764);
    this.aSw = ((DrmInitData.SchemeData[])paramParcel.createTypedArray(DrmInitData.SchemeData.CREATOR));
    this.aSx = this.aSw.length;
    AppMethodBeat.o(94764);
  }

  public DrmInitData(List<DrmInitData.SchemeData> paramList)
  {
    this(false, (DrmInitData.SchemeData[])paramList.toArray(new DrmInitData.SchemeData[paramList.size()]));
    AppMethodBeat.i(94762);
    AppMethodBeat.o(94762);
  }

  private DrmInitData(boolean paramBoolean, DrmInitData.SchemeData[] paramArrayOfSchemeData)
  {
    AppMethodBeat.i(94763);
    if (paramBoolean)
      paramArrayOfSchemeData = (DrmInitData.SchemeData[])paramArrayOfSchemeData.clone();
    while (true)
    {
      Arrays.sort(paramArrayOfSchemeData, this);
      for (int i = 1; i < paramArrayOfSchemeData.length; i++)
        if (DrmInitData.SchemeData.a(paramArrayOfSchemeData[(i - 1)]).equals(DrmInitData.SchemeData.a(paramArrayOfSchemeData[i])))
        {
          paramArrayOfSchemeData = new IllegalArgumentException("Duplicate data for uuid: " + DrmInitData.SchemeData.a(paramArrayOfSchemeData[i]));
          AppMethodBeat.o(94763);
          throw paramArrayOfSchemeData;
        }
      this.aSw = paramArrayOfSchemeData;
      this.aSx = paramArrayOfSchemeData.length;
      AppMethodBeat.o(94763);
      return;
    }
  }

  public DrmInitData(DrmInitData.SchemeData[] paramArrayOfSchemeData)
  {
    this(true, paramArrayOfSchemeData);
  }

  public final DrmInitData aw(String paramString)
  {
    AppMethodBeat.i(94765);
    Object localObject = this.aSw;
    int i = localObject.length;
    int j = 0;
    if (j < i)
      if (v.j(localObject[j].type, paramString));
    for (j = 1; ; j = 0)
    {
      if (j != 0)
      {
        DrmInitData.SchemeData[] arrayOfSchemeData = new DrmInitData.SchemeData[this.aSw.length];
        j = 0;
        label57: if (j < arrayOfSchemeData.length)
        {
          localObject = this.aSw[j];
          if (v.j(((DrmInitData.SchemeData)localObject).type, paramString));
          while (true)
          {
            arrayOfSchemeData[j] = localObject;
            j++;
            break label57;
            j++;
            break;
            localObject = new DrmInitData.SchemeData(((DrmInitData.SchemeData)localObject).uuid, paramString, ((DrmInitData.SchemeData)localObject).mimeType, ((DrmInitData.SchemeData)localObject).data, ((DrmInitData.SchemeData)localObject).aSy);
          }
        }
        paramString = new DrmInitData(arrayOfSchemeData);
        AppMethodBeat.o(94765);
      }
      while (true)
      {
        return paramString;
        AppMethodBeat.o(94765);
        paramString = this;
      }
    }
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(94767);
    boolean bool;
    if (this == paramObject)
    {
      bool = true;
      AppMethodBeat.o(94767);
    }
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        bool = false;
        AppMethodBeat.o(94767);
      }
      else
      {
        bool = Arrays.equals(this.aSw, ((DrmInitData)paramObject).aSw);
        AppMethodBeat.o(94767);
      }
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(94766);
    if (this.aBR == 0)
      this.aBR = Arrays.hashCode(this.aSw);
    int i = this.aBR;
    AppMethodBeat.o(94766);
    return i;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(94768);
    paramParcel.writeTypedArray(this.aSw, 0);
    AppMethodBeat.o(94768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.drm.DrmInitData
 * JD-Core Version:    0.6.2
 */