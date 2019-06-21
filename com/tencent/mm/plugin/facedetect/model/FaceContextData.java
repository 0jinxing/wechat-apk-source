package com.tencent.mm.plugin.facedetect.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import junit.framework.Assert;

public class FaceContextData
  implements Parcelable
{
  public static final Parcelable.Creator<FaceContextData> CREATOR;
  private static volatile FaceContextData lTG;
  public long lTH;

  static
  {
    AppMethodBeat.i(187);
    lTG = null;
    CREATOR = new FaceContextData.1();
    AppMethodBeat.o(187);
  }

  public FaceContextData()
  {
    this.lTH = -1L;
  }

  protected FaceContextData(Parcel paramParcel)
  {
    AppMethodBeat.i(185);
    this.lTH = -1L;
    this.lTH = paramParcel.readLong();
    AppMethodBeat.o(185);
  }

  public static void a(FaceContextData paramFaceContextData)
  {
    AppMethodBeat.i(183);
    if (paramFaceContextData == null)
    {
      lTG = null;
      AppMethodBeat.o(183);
    }
    while (true)
    {
      return;
      if (lTG != null)
      {
        b(paramFaceContextData);
        AppMethodBeat.o(183);
      }
      else
      {
        try
        {
          if (lTG != null)
          {
            b(paramFaceContextData);
            AppMethodBeat.o(183);
          }
          else
          {
            lTG = paramFaceContextData;
            AppMethodBeat.o(183);
          }
        }
        finally
        {
          AppMethodBeat.o(183);
        }
      }
    }
    throw paramFaceContextData;
  }

  private static void b(FaceContextData paramFaceContextData)
  {
    AppMethodBeat.i(184);
    if ((lTG != null) && (paramFaceContextData != null));
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      lTG.lTH = paramFaceContextData.lTH;
      AppMethodBeat.o(184);
      return;
    }
  }

  public static FaceContextData bss()
  {
    try
    {
      FaceContextData localFaceContextData = lTG;
      return localFaceContextData;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(186);
    paramParcel.writeLong(this.lTH);
    AppMethodBeat.o(186);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.FaceContextData
 * JD-Core Version:    0.6.2
 */