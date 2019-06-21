package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FlexboxLayout$LayoutParams extends ViewGroup.MarginLayoutParams
  implements FlexItem
{
  public static final Parcelable.Creator<LayoutParams> CREATOR;
  private int btQ;
  private float btR;
  private float btS;
  private int btT;
  private float btU;
  private boolean btV;
  private int dg;
  private int dh;
  private int di;
  private int dj;

  static
  {
    AppMethodBeat.i(54732);
    CREATOR = new FlexboxLayout.LayoutParams.1();
    AppMethodBeat.o(54732);
  }

  public FlexboxLayout$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(54729);
    this.btQ = 1;
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, d.a.FlexboxLayout_Layout);
    this.btQ = paramContext.getInt(0, 1);
    this.btR = paramContext.getFloat(1, 0.0F);
    this.btS = paramContext.getFloat(2, 1.0F);
    this.btT = paramContext.getInt(4, -1);
    this.btU = paramContext.getFraction(3, 1, 1, -1.0F);
    this.dg = paramContext.getDimensionPixelSize(5, 0);
    this.dh = paramContext.getDimensionPixelSize(6, 0);
    this.di = paramContext.getDimensionPixelSize(7, 16777215);
    this.dj = paramContext.getDimensionPixelSize(8, 16777215);
    this.btV = paramContext.getBoolean(9, false);
    paramContext.recycle();
    AppMethodBeat.o(54729);
  }

  protected FlexboxLayout$LayoutParams(Parcel paramParcel)
  {
    super(0, 0);
    AppMethodBeat.i(54731);
    this.btQ = 1;
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
    this.btQ = paramParcel.readInt();
    this.btR = paramParcel.readFloat();
    this.btS = paramParcel.readFloat();
    this.btT = paramParcel.readInt();
    this.btU = paramParcel.readFloat();
    this.dg = paramParcel.readInt();
    this.dh = paramParcel.readInt();
    this.di = paramParcel.readInt();
    this.dj = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    while (true)
    {
      this.btV = bool;
      this.bottomMargin = paramParcel.readInt();
      this.leftMargin = paramParcel.readInt();
      this.rightMargin = paramParcel.readInt();
      this.topMargin = paramParcel.readInt();
      this.height = paramParcel.readInt();
      this.width = paramParcel.readInt();
      AppMethodBeat.o(54731);
      return;
      bool = false;
    }
  }

  public FlexboxLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.btQ = 1;
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
  }

  public FlexboxLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
    this.btQ = 1;
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
  }

  public FlexboxLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
    this.btQ = 1;
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
    this.btQ = paramLayoutParams.btQ;
    this.btR = paramLayoutParams.btR;
    this.btS = paramLayoutParams.btS;
    this.btT = paramLayoutParams.btT;
    this.btU = paramLayoutParams.btU;
    this.dg = paramLayoutParams.dg;
    this.dh = paramLayoutParams.dh;
    this.di = paramLayoutParams.di;
    this.dj = paramLayoutParams.dj;
    this.btV = paramLayoutParams.btV;
  }

  public int describeContents()
  {
    return 0;
  }

  public final int getHeight()
  {
    return this.height;
  }

  public final int getMaxHeight()
  {
    return this.dj;
  }

  public final int getMaxWidth()
  {
    return this.di;
  }

  public final int getMinHeight()
  {
    return this.dh;
  }

  public final int getMinWidth()
  {
    return this.dg;
  }

  public final int getOrder()
  {
    return this.btQ;
  }

  public final int getWidth()
  {
    return this.width;
  }

  public final float ub()
  {
    return this.btR;
  }

  public final float uc()
  {
    return this.btS;
  }

  public final int ud()
  {
    return this.btT;
  }

  public final boolean ue()
  {
    return this.btV;
  }

  public final float uf()
  {
    return this.btU;
  }

  public final int ug()
  {
    return this.leftMargin;
  }

  public final int uh()
  {
    return this.topMargin;
  }

  public final int ui()
  {
    return this.rightMargin;
  }

  public final int uj()
  {
    return this.bottomMargin;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(54730);
    paramParcel.writeInt(this.btQ);
    paramParcel.writeFloat(this.btR);
    paramParcel.writeFloat(this.btS);
    paramParcel.writeInt(this.btT);
    paramParcel.writeFloat(this.btU);
    paramParcel.writeInt(this.dg);
    paramParcel.writeInt(this.dh);
    paramParcel.writeInt(this.di);
    paramParcel.writeInt(this.dj);
    if (this.btV)
      paramInt = 1;
    int j;
    for (int i = paramInt; ; j = paramInt)
    {
      paramParcel.writeByte(i);
      paramParcel.writeInt(this.bottomMargin);
      paramParcel.writeInt(this.leftMargin);
      paramParcel.writeInt(this.rightMargin);
      paramParcel.writeInt(this.topMargin);
      paramParcel.writeInt(this.height);
      paramParcel.writeInt(this.width);
      AppMethodBeat.o(54730);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.FlexboxLayout.LayoutParams
 * JD-Core Version:    0.6.2
 */