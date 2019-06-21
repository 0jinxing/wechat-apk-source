package com.tencent.faceBeauty;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FaceParam
  implements Parcelable
{
  public static final Parcelable.Creator<FaceParam> CREATOR;
  private static final String TAG;
  public Rect bJk;
  public Rect bJl;
  public Rect bJm;
  public Point bJn;
  public Point bJo;
  public Rect bJp;
  public Rect bJq;
  public int[][] bJr;
  public int height;
  public int width;

  static
  {
    AppMethodBeat.i(86279);
    TAG = FaceParam.class.getSimpleName();
    CREATOR = new FaceParam.1();
    AppMethodBeat.o(86279);
  }

  public FaceParam()
  {
    this.width = 0;
    this.height = 0;
    this.bJk = null;
    this.bJl = null;
    this.bJm = null;
    this.bJn = null;
    this.bJo = null;
    this.bJp = null;
    this.bJq = null;
    this.bJr = null;
  }

  private FaceParam(Parcel paramParcel)
  {
    AppMethodBeat.i(86278);
    this.width = 0;
    this.height = 0;
    this.bJk = null;
    this.bJl = null;
    this.bJm = null;
    this.bJn = null;
    this.bJo = null;
    this.bJp = null;
    this.bJq = null;
    this.bJr = null;
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    this.bJn = new Point(paramParcel.readInt(), paramParcel.readInt());
    this.bJo = new Point(paramParcel.readInt(), paramParcel.readInt());
    ClassLoader localClassLoader = Rect.class.getClassLoader();
    this.bJk = ((Rect)paramParcel.readParcelable(localClassLoader));
    this.bJl = ((Rect)paramParcel.readParcelable(localClassLoader));
    this.bJm = ((Rect)paramParcel.readParcelable(localClassLoader));
    this.bJp = ((Rect)paramParcel.readParcelable(localClassLoader));
    this.bJq = ((Rect)paramParcel.readParcelable(localClassLoader));
    if (paramParcel.readInt() == 1)
    {
      paramParcel = paramParcel.createIntArray();
      if ((paramParcel != null) && (paramParcel.length >= 2))
      {
        int i = paramParcel.length / 2;
        this.bJr = new int[i][2];
        for (i = 0; i < paramParcel.length / 2; i++)
        {
          this.bJr[i][0] = paramParcel[(i * 2)];
          this.bJr[i][1] = paramParcel[(i * 2 + 1)];
        }
      }
    }
    AppMethodBeat.o(86278);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(86277);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    paramParcel.writeInt(this.bJn.x);
    paramParcel.writeInt(this.bJn.y);
    paramParcel.writeInt(this.bJo.x);
    paramParcel.writeInt(this.bJo.y);
    paramParcel.writeParcelable(this.bJk, 1);
    paramParcel.writeParcelable(this.bJl, 1);
    paramParcel.writeParcelable(this.bJm, 1);
    paramParcel.writeParcelable(this.bJp, 1);
    paramParcel.writeParcelable(this.bJq, 1);
    if (this.bJr != null)
    {
      paramParcel.writeInt(1);
      int[] arrayOfInt = new int[this.bJr.length * 2];
      for (paramInt = 0; paramInt < this.bJr.length; paramInt++)
      {
        arrayOfInt[(paramInt * 2)] = this.bJr[paramInt][0];
        arrayOfInt[(paramInt * 2 + 1)] = this.bJr[paramInt][1];
      }
      paramParcel.writeIntArray(arrayOfInt);
      AppMethodBeat.o(86277);
    }
    while (true)
    {
      return;
      paramParcel.writeInt(0);
      AppMethodBeat.o(86277);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.faceBeauty.FaceParam
 * JD-Core Version:    0.6.2
 */