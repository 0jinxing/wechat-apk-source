package com.tencent.mm.plugin.appbrand.report.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.iz;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.r;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.regex.Pattern;

public final class kv_14609
  implements Parcelable
{
  public static final Parcelable.Creator<kv_14609> CREATOR;
  public final String appId;
  public int cBc;
  private int cyE;
  public final int gTP;
  public String gTy;
  public long iCh;
  public final boolean iCi;
  public boolean iCj;
  public boolean iCk;
  public int iCl;
  public int iCm;
  public long iCn;
  private long iCo;
  public long iCp;
  public long iCq;
  public String igT;
  public final int ihB;

  static
  {
    AppMethodBeat.i(132659);
    CREATOR = new kv_14609.1();
    AppMethodBeat.o(132659);
  }

  protected kv_14609(Parcel paramParcel)
  {
    AppMethodBeat.i(132658);
    this.appId = paramParcel.readString();
    this.gTy = paramParcel.readString();
    this.gTP = paramParcel.readInt();
    this.ihB = paramParcel.readInt();
    this.iCh = paramParcel.readLong();
    if (paramParcel.readByte() != 0)
    {
      bool2 = true;
      this.iCi = bool2;
      if (paramParcel.readByte() == 0)
        break label176;
      bool2 = true;
      label74: this.iCj = bool2;
      if (paramParcel.readByte() == 0)
        break label181;
    }
    label176: label181: for (boolean bool2 = bool1; ; bool2 = false)
    {
      this.iCk = bool2;
      this.iCl = paramParcel.readInt();
      this.iCm = paramParcel.readInt();
      this.cyE = paramParcel.readInt();
      this.iCn = paramParcel.readLong();
      this.iCo = paramParcel.readLong();
      this.igT = paramParcel.readString();
      this.iCp = paramParcel.readLong();
      this.iCq = paramParcel.readLong();
      this.cBc = paramParcel.readInt();
      AppMethodBeat.o(132658);
      return;
      bool2 = false;
      break;
      bool2 = false;
      break label74;
    }
  }

  public kv_14609(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(132653);
    ab.i("MicroMsg.AppBrand.Report.kv_14609", "appid:%s,oldVersion:%s,targetVersion:%s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ("@LibraryAppId".equals(paramString))
    {
      this.appId = "publiclib";
      this.gTy = null;
      this.iCi = r.avE();
      this.gTP = paramInt1;
      this.ihB = paramInt2;
      AppMethodBeat.o(132653);
      return;
    }
    if (paramString.contains("$"))
    {
      paramString = paramString.split(Pattern.quote("$"));
      this.appId = paramString[0];
      if (paramString != null);
      switch (paramString.length)
      {
      default:
        label136: ab.i("MicroMsg.AppBrand.Report.kv_14609", "getModuleName modulename:%s,appid:%s,pkgtype:%s", new Object[] { this.gTy, this.appId, Integer.valueOf(this.cBc) });
      case 2:
      case 3:
      }
    }
    while (true)
    {
      this.iCi = r.avD();
      break;
      paramString = paramString[1];
      if (!bo.isNullOrNil(paramString))
      {
        if (paramString.equals("__WITHOUT_CODELIB__"))
        {
          this.cBc = 12;
          this.gTy = null;
          break label136;
        }
        if (paramString.equals("__CODELIB__"))
        {
          this.cBc = 14;
          this.gTy = null;
          break label136;
        }
        this.gTy = paramString;
        break label136;
        this.gTy = paramString[1];
        if ((bo.isNullOrNil(paramString[2])) || (!paramString[2].equals("__WITHOUT_CODELIB__")))
          break label136;
        this.cBc = 13;
        break label136;
        this.appId = paramString;
        this.gTy = null;
      }
    }
  }

  public final void IF()
  {
    int i = 1;
    AppMethodBeat.i(132656);
    if (((h)g.RM().Rn()).SG())
    {
      localObject = new iz();
      ((iz)localObject).cEe.cEf = this;
      a.xxA.m((b)localObject);
      ab.d("MicroMsg.AppBrand.Report.kv_14609", "report in mm process, publish event");
      AppMethodBeat.o(132656);
      return;
    }
    ab.i("MicroMsg.AppBrand.Report.kv_14609", "report %s", new Object[] { toString() });
    Object localObject = e.pXa;
    String str1 = this.appId;
    String str2 = c.cV(ah.getContext());
    int j = this.gTP;
    int k = this.ihB;
    long l = this.iCh;
    int m;
    label122: int n;
    if (this.iCi)
    {
      m = 1;
      if (!this.iCj)
        break label335;
      n = 1;
      label132: if (!this.iCk)
        break label341;
    }
    while (true)
    {
      ((e)localObject).e(14609, new Object[] { str1, Integer.valueOf(1), str2, Integer.valueOf(j), Integer.valueOf(k), Long.valueOf(l), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(this.iCl), Integer.valueOf(this.iCm), Integer.valueOf(this.cyE), this.gTy, Long.valueOf(this.iCn), Long.valueOf(this.iCo), this.igT, Long.valueOf(this.iCp), Long.valueOf(this.iCq), Integer.valueOf(this.cBc) });
      AppMethodBeat.o(132656);
      break;
      m = 0;
      break label122;
      label335: n = 0;
      break label132;
      label341: i = 0;
    }
  }

  public final void aLx()
  {
    AppMethodBeat.i(132654);
    long l = bo.anU();
    this.iCo = l;
    this.iCh = (l - this.iCn);
    AppMethodBeat.o(132654);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void pL(int paramInt)
  {
    if (!this.iCi);
    while (true)
    {
      return;
      this.cyE = paramInt;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(132655);
    String str = "kv_14609{appId='" + this.appId + '\'' + ", oldVersion=" + this.gTP + ", targetVersion=" + this.ihB + ", spendTime=" + this.iCh + ", canUsePatchUpdate=" + this.iCi + ", isUpdateComplete=" + this.iCj + ", isUpdateCompleteWithPatch=" + this.iCk + ", fullPkgSize=" + this.iCl + ", patchSize=" + this.iCm + ", errcode=" + this.cyE + ", pkgType=" + this.cBc + '}';
    AppMethodBeat.o(132655);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(132657);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.gTy);
    paramParcel.writeInt(this.gTP);
    paramParcel.writeInt(this.ihB);
    paramParcel.writeLong(this.iCh);
    int i;
    if (this.iCi)
    {
      i = 1;
      byte b = i;
      paramParcel.writeByte(b);
      if (!this.iCj)
        break label187;
      i = 1;
      b = i;
      label78: paramParcel.writeByte(b);
      if (!this.iCk)
        break label195;
    }
    label187: label195: int k;
    for (int j = paramInt; ; k = paramInt)
    {
      paramParcel.writeByte(j);
      paramParcel.writeInt(this.iCl);
      paramParcel.writeInt(this.iCm);
      paramParcel.writeInt(this.cyE);
      paramParcel.writeLong(this.iCn);
      paramParcel.writeLong(this.iCo);
      paramParcel.writeString(this.igT);
      paramParcel.writeLong(this.iCp);
      paramParcel.writeLong(this.iCq);
      paramParcel.writeInt(this.cBc);
      AppMethodBeat.o(132657);
      return;
      i = 0;
      j = i;
      break;
      i = 0;
      j = i;
      break label78;
      paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.kv_14609
 * JD-Core Version:    0.6.2
 */