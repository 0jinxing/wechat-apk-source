package com.tencent.mm.protocal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.protocal.protobuf.adl;
import com.tencent.mm.sdk.platformtools.ab;

public class GeneralControlWrapper
  implements Parcelable
{
  public static final Parcelable.Creator<GeneralControlWrapper> CREATOR;
  public static final GeneralControlWrapper vxE;
  public static final GeneralControlWrapper vxF;
  private static Boolean vxH;
  public int vxG;

  static
  {
    AppMethodBeat.i(79976);
    vxE = new GeneralControlWrapper(10);
    vxF = new GeneralControlWrapper(1);
    vxH = null;
    CREATOR = new GeneralControlWrapper.1();
    AppMethodBeat.o(79976);
  }

  public GeneralControlWrapper(int paramInt)
  {
    AppMethodBeat.i(79966);
    this.vxG = paramInt;
    ab.d("MicroMsg.GeneralControlWrapper", "edw <init>, ".concat(String.valueOf(this)));
    AppMethodBeat.o(79966);
  }

  private GeneralControlWrapper(Parcel paramParcel)
  {
    AppMethodBeat.i(79975);
    this.vxG = paramParcel.readInt();
    AppMethodBeat.o(79975);
  }

  public GeneralControlWrapper(adl paramadl)
  {
    AppMethodBeat.i(79965);
    if (paramadl == null);
    for (this.vxG = 0; ; this.vxG = paramadl.wli)
    {
      ab.d("MicroMsg.GeneralControlWrapper", "edw <init>, ".concat(String.valueOf(this)));
      AppMethodBeat.o(79965);
      return;
    }
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean dmj()
  {
    boolean bool1 = false;
    AppMethodBeat.i(79967);
    boolean bool3;
    if ((this.vxG & 0x40000) != 0)
    {
      bool2 = true;
      if (vxH == null)
      {
        if (1 != ((a)g.K(a.class)).a(a.a.lIg, 0))
          break label106;
        bool3 = true;
        label48: vxH = Boolean.valueOf(bool3);
      }
      ab.d("MicroMsg.GeneralControlWrapper", "canCallJsApiBeforeLoad, ret = %b, canCallJsApiBeforeLoaded = %b", new Object[] { Boolean.valueOf(bool2), vxH });
      if ((!bool2) && (!vxH.booleanValue()))
        break label111;
      AppMethodBeat.o(79967);
    }
    for (boolean bool2 = true; ; bool2 = bool1)
    {
      return bool2;
      bool2 = false;
      break;
      label106: bool3 = false;
      break label48;
      label111: AppMethodBeat.o(79967);
    }
  }

  public final boolean dmk()
  {
    AppMethodBeat.i(79968);
    if ((this.vxG & 0x2) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.GeneralControlWrapper", "allowInnerOpenUrl, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(79968);
      return bool;
    }
  }

  public final boolean dml()
  {
    AppMethodBeat.i(79969);
    if ((this.vxG & 0x40) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.GeneralControlWrapper", "allowScanQRCode, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(79969);
      return bool;
    }
  }

  public final boolean dmm()
  {
    AppMethodBeat.i(79970);
    if ((this.vxG & 0x800) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.GeneralControlWrapper", "allowReportPageEvent, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(79970);
      return bool;
    }
  }

  public final boolean dmn()
  {
    AppMethodBeat.i(79971);
    if ((this.vxG & 0x4000) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.GeneralControlWrapper", "allowReportPageEvent, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(79971);
      return bool;
    }
  }

  public final boolean dmo()
  {
    AppMethodBeat.i(79972);
    if ((this.vxG & 0x8000) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.GeneralControlWrapper", "allowFavImage, ret = ".concat(String.valueOf(bool)));
      AppMethodBeat.o(79972);
      return bool;
    }
  }

  public String toString()
  {
    AppMethodBeat.i(79973);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("[bitset=0x");
    ((StringBuilder)localObject).append(Integer.toHexString(this.vxG));
    ((StringBuilder)localObject).append("]");
    localObject = ((StringBuilder)localObject).toString();
    AppMethodBeat.o(79973);
    return localObject;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(79974);
    paramParcel.writeInt(this.vxG);
    AppMethodBeat.o(79974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.GeneralControlWrapper
 * JD-Core Version:    0.6.2
 */