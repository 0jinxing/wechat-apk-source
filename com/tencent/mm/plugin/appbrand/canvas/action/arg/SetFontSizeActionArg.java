package com.tencent.mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.g;
import java.util.Objects;
import org.json.JSONObject;

public class SetFontSizeActionArg extends BaseDrawActionArg
{
  public static final Parcelable.Creator<SetFontSizeActionArg> CREATOR;
  public int size;

  static
  {
    AppMethodBeat.i(103477);
    CREATOR = new SetFontSizeActionArg.1();
    AppMethodBeat.o(103477);
  }

  public SetFontSizeActionArg()
  {
  }

  public SetFontSizeActionArg(Parcel paramParcel)
  {
    super(paramParcel, (byte)0);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(103475);
    if (this == paramObject)
      AppMethodBeat.o(103475);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof SetFontSizeActionArg))
      {
        AppMethodBeat.o(103475);
        bool = false;
      }
      else if (!super.equals(paramObject))
      {
        AppMethodBeat.o(103475);
        bool = false;
      }
      else
      {
        paramObject = (SetFontSizeActionArg)paramObject;
        if (this.size == paramObject.size)
        {
          AppMethodBeat.o(103475);
        }
        else
        {
          AppMethodBeat.o(103475);
          bool = false;
        }
      }
    }
  }

  public int hashCode()
  {
    AppMethodBeat.i(103476);
    int i = Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), Integer.valueOf(this.size) });
    AppMethodBeat.o(103476);
    return i;
  }

  public final void i(Parcel paramParcel)
  {
    AppMethodBeat.i(103472);
    super.i(paramParcel);
    this.size = paramParcel.readInt();
    AppMethodBeat.o(103472);
  }

  public final void j(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103473);
    super.j(paramJSONObject);
    this.size = g.a(paramJSONObject.optJSONArray("data"), 0);
    AppMethodBeat.o(103473);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(103474);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.size);
    AppMethodBeat.o(103474);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontSizeActionArg
 * JD-Core Version:    0.6.2
 */