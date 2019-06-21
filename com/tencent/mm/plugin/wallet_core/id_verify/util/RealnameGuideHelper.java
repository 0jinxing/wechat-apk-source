package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c.a;

public class RealnameGuideHelper
  implements Parcelable
{
  public static final Parcelable.Creator<RealnameGuideHelper> CREATOR;
  private int gwj;
  private String nYZ;
  private String nZa;
  private String nZb;
  private String nZc;
  private String nZd;
  private SetPwdInfo tvP;
  private boolean tvQ;

  static
  {
    AppMethodBeat.i(46665);
    CREATOR = new RealnameGuideHelper.1();
    AppMethodBeat.o(46665);
  }

  public RealnameGuideHelper()
  {
    this.nZb = "";
    this.nZc = "";
    this.nZd = "";
    this.tvQ = false;
  }

  protected RealnameGuideHelper(Parcel paramParcel)
  {
    AppMethodBeat.i(46659);
    this.nZb = "";
    this.nZc = "";
    this.nZd = "";
    this.tvQ = false;
    this.tvP = ((SetPwdInfo)paramParcel.readParcelable(SetPwdInfo.class.getClassLoader()));
    this.nYZ = paramParcel.readString();
    this.nZa = paramParcel.readString();
    this.nZb = paramParcel.readString();
    this.nZc = paramParcel.readString();
    this.nZd = paramParcel.readString();
    if (paramParcel.readByte() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.tvQ = bool;
      this.gwj = paramParcel.readInt();
      AppMethodBeat.o(46659);
      return;
    }
  }

  public final void a(String paramString1, SetPwdInfo paramSetPwdInfo, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    this.tvP = paramSetPwdInfo;
    this.nYZ = paramString1;
    this.nZa = paramString2;
    this.nZb = paramString3;
    this.nZc = paramString4;
    this.nZd = paramString5;
    this.gwj = paramInt;
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    AppMethodBeat.i(46661);
    a(paramString1, null, paramString2, paramString3, paramString4, paramString5, paramInt);
    AppMethodBeat.o(46661);
  }

  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    boolean bool = false;
    AppMethodBeat.i(46662);
    ab.d("MicroMsg.RealnameGuideHelper", "doIfNeedSetPwd sendPwdMsg %s mEntryScene %s guide_wording %s upload_credit_url %s left_button_wording %s right_button_wording %s hadShow %s guide_flag %s", new Object[] { this.tvP, Integer.valueOf(this.gwj), this.nZa, this.nZd, this.nZb, this.nZc, Boolean.valueOf(this.tvQ), this.nYZ });
    if (this.tvQ)
      AppMethodBeat.o(46662);
    while (true)
    {
      return bool;
      if ((this.tvP != null) && (this.tvP.twa == 1))
      {
        bool = a.a(paramMMActivity, paramBundle, this.gwj, this.tvP.nZa, this.tvP.nZb, this.tvP.nZc, paramOnClickListener);
        if ((bool) && (!this.tvQ))
          this.tvQ = true;
        AppMethodBeat.o(46662);
      }
      else
      {
        AppMethodBeat.o(46662);
      }
    }
  }

  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener, c.a parama, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(46664);
    if (this.tvQ)
    {
      AppMethodBeat.o(46664);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if ("1".equals(this.nYZ))
      {
        if (!this.tvQ)
          this.tvQ = true;
        paramBoolean = a.a(paramMMActivity, paramBundle, parama, this.gwj);
        AppMethodBeat.o(46664);
      }
      else if (("2".equals(this.nYZ)) && (!bo.isNullOrNil(this.nZd)))
      {
        if (!this.tvQ)
          this.tvQ = true;
        paramBoolean = a.a(paramMMActivity, this.nZa, this.nZd, this.nZb, this.nZc, paramBoolean, paramOnClickListener);
        AppMethodBeat.o(46664);
      }
      else
      {
        AppMethodBeat.o(46664);
        paramBoolean = bool;
      }
    }
  }

  public final boolean b(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(46663);
    boolean bool = a(paramMMActivity, paramBundle, paramOnClickListener, null, false);
    AppMethodBeat.o(46663);
    return bool;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(46660);
    paramParcel.writeParcelable(this.tvP, paramInt);
    paramParcel.writeString(this.nYZ);
    paramParcel.writeString(this.nZa);
    paramParcel.writeString(this.nZb);
    paramParcel.writeString(this.nZc);
    paramParcel.writeString(this.nZd);
    if (this.tvQ);
    for (paramInt = 1; ; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.gwj);
      AppMethodBeat.o(46660);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper
 * JD-Core Version:    0.6.2
 */