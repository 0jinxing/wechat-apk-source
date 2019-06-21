package com.google.android.flexbox;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FlexboxLayoutManager$LayoutParams extends RecyclerView.LayoutParams
  implements FlexItem
{
  public static final Parcelable.Creator<LayoutParams> CREATOR;
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
    AppMethodBeat.i(54786);
    CREATOR = new FlexboxLayoutManager.LayoutParams.1();
    AppMethodBeat.o(54786);
  }

  public FlexboxLayoutManager$LayoutParams()
  {
    super(-2, -2);
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
  }

  public FlexboxLayoutManager$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
  }

  protected FlexboxLayoutManager$LayoutParams(Parcel paramParcel)
  {
    super(-2, -2);
    AppMethodBeat.i(54785);
    this.btR = 0.0F;
    this.btS = 1.0F;
    this.btT = -1;
    this.btU = -1.0F;
    this.di = 16777215;
    this.dj = 16777215;
    this.btR = paramParcel.readFloat();
    this.btS = paramParcel.readFloat();
    this.btT = paramParcel.readInt();
    this.btU = paramParcel.readFloat();
    this.dg = paramParcel.readInt();
    this.dh = paramParcel.readInt();
    this.di = paramParcel.readInt();
    this.dj = paramParcel.readInt();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.btV = bool;
      this.bottomMargin = paramParcel.readInt();
      this.leftMargin = paramParcel.readInt();
      this.rightMargin = paramParcel.readInt();
      this.topMargin = paramParcel.readInt();
      this.height = paramParcel.readInt();
      this.width = paramParcel.readInt();
      AppMethodBeat.o(54785);
      return;
    }
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
    return 1;
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
    AppMethodBeat.i(54784);
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
      AppMethodBeat.o(54784);
      return;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.flexbox.FlexboxLayoutManager.LayoutParams
 * JD-Core Version:    0.6.2
 */