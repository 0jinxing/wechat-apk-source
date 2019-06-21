package com.tencent.mm.plugin.webview.modeltools;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.j;
import com.tencent.mm.g.a.j.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class NFCIPCHelper
{
  public static void cYy()
  {
    AppMethodBeat.i(6951);
    ab.e("MicroMsg.NFCIPCHelper", "alvinluo nfcInvokeAsResult error");
    h.pYm.k(968L, 0L, 1L);
    AppMethodBeat.o(6951);
  }

  public static class NFCEventTransfer
    implements Parcelable
  {
    public static final Parcelable.Creator<NFCEventTransfer> CREATOR;
    public int actionCode;
    public String csd;
    public boolean cse;
    public boolean csf;
    public Bundle csg;

    static
    {
      AppMethodBeat.i(6949);
      CREATOR = new Parcelable.Creator()
      {
      };
      AppMethodBeat.o(6949);
    }

    protected NFCEventTransfer(Parcel paramParcel)
    {
      AppMethodBeat.i(6947);
      this.actionCode = paramParcel.readInt();
      this.csd = paramParcel.readString();
      if (paramParcel.readByte() != 0)
      {
        bool2 = true;
        this.cse = bool2;
        if (paramParcel.readByte() == 0)
          break label83;
      }
      label83: for (boolean bool2 = bool1; ; bool2 = false)
      {
        this.csf = bool2;
        this.csg = paramParcel.readBundle(getClass().getClassLoader());
        AppMethodBeat.o(6947);
        return;
        bool2 = false;
        break;
      }
    }

    public NFCEventTransfer(j paramj)
    {
      this.actionCode = paramj.csb.actionCode;
      this.csd = paramj.csb.csd;
      this.cse = paramj.csb.cse;
      this.csf = paramj.csb.csf;
    }

    public int describeContents()
    {
      return 0;
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramInt = 1;
      AppMethodBeat.i(6948);
      paramParcel.writeInt(this.actionCode);
      paramParcel.writeString(this.csd);
      int i;
      if (this.cse)
      {
        i = 1;
        byte b = i;
        paramParcel.writeByte(b);
        if (!this.csf)
          break label81;
      }
      label81: int k;
      for (int j = paramInt; ; k = paramInt)
      {
        paramParcel.writeByte(j);
        paramParcel.writeBundle(this.csg);
        AppMethodBeat.o(6948);
        return;
        i = 0;
        j = i;
        break;
        paramInt = 0;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.NFCIPCHelper
 * JD-Core Version:    0.6.2
 */