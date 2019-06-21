package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format
  implements Parcelable
{
  public static final Parcelable.Creator<Format> CREATOR;
  private int aBR;
  public final String aOa;
  public final Metadata aOb;
  public final String aOc;
  public final String aOd;
  public final int aOe;
  public final List<byte[]> aOf;
  public final DrmInitData aOg;
  public final float aOh;
  public final int aOi;
  public final float aOj;
  public final int aOk;
  public final byte[] aOl;
  public final ColorInfo aOm;
  public final int aOn;
  public final int aOo;
  public final int aOp;
  public final int aOq;
  public final long aOr;
  public final int aOs;
  public final String aOt;
  public final int aOu;
  public final int bitrate;
  public final int height;
  public final String id;
  public final int sampleRate;
  public final int width;

  static
  {
    AppMethodBeat.i(95226);
    CREATOR = new Format.1();
    AppMethodBeat.o(95226);
  }

  Format(Parcel paramParcel)
  {
    AppMethodBeat.i(95212);
    this.id = paramParcel.readString();
    this.aOc = paramParcel.readString();
    this.aOd = paramParcel.readString();
    this.aOa = paramParcel.readString();
    this.bitrate = paramParcel.readInt();
    this.aOe = paramParcel.readInt();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    this.aOh = paramParcel.readFloat();
    this.aOi = paramParcel.readInt();
    this.aOj = paramParcel.readFloat();
    int i;
    if (paramParcel.readInt() != 0)
    {
      i = 1;
      if (i == 0)
        break label268;
    }
    label268: for (byte[] arrayOfByte = paramParcel.createByteArray(); ; arrayOfByte = null)
    {
      this.aOl = arrayOfByte;
      this.aOk = paramParcel.readInt();
      this.aOm = ((ColorInfo)paramParcel.readParcelable(ColorInfo.class.getClassLoader()));
      this.aOn = paramParcel.readInt();
      this.sampleRate = paramParcel.readInt();
      this.aOo = paramParcel.readInt();
      this.aOp = paramParcel.readInt();
      this.aOq = paramParcel.readInt();
      this.aOs = paramParcel.readInt();
      this.aOt = paramParcel.readString();
      this.aOu = paramParcel.readInt();
      this.aOr = paramParcel.readLong();
      int j = paramParcel.readInt();
      this.aOf = new ArrayList(j);
      for (i = 0; i < j; i++)
        this.aOf.add(paramParcel.createByteArray());
      i = 0;
      break;
    }
    this.aOg = ((DrmInitData)paramParcel.readParcelable(DrmInitData.class.getClassLoader()));
    this.aOb = ((Metadata)paramParcel.readParcelable(Metadata.class.getClassLoader()));
    AppMethodBeat.o(95212);
  }

  private Format(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, int paramInt5, float paramFloat2, byte[] paramArrayOfByte, int paramInt6, ColorInfo paramColorInfo, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, String paramString5, int paramInt13, long paramLong, List<byte[]> paramList, DrmInitData paramDrmInitData, Metadata paramMetadata)
  {
    AppMethodBeat.i(95211);
    this.id = paramString1;
    this.aOc = paramString2;
    this.aOd = paramString3;
    this.aOa = paramString4;
    this.bitrate = paramInt1;
    this.aOe = paramInt2;
    this.width = paramInt3;
    this.height = paramInt4;
    this.aOh = paramFloat1;
    this.aOi = paramInt5;
    this.aOj = paramFloat2;
    this.aOl = paramArrayOfByte;
    this.aOk = paramInt6;
    this.aOm = paramColorInfo;
    this.aOn = paramInt7;
    this.sampleRate = paramInt8;
    this.aOo = paramInt9;
    this.aOp = paramInt10;
    this.aOq = paramInt11;
    this.aOs = paramInt12;
    this.aOt = paramString5;
    this.aOu = paramInt13;
    this.aOr = paramLong;
    paramString1 = paramList;
    if (paramList == null)
      paramString1 = Collections.emptyList();
    this.aOf = paramString1;
    this.aOg = paramDrmInitData;
    this.aOb = paramMetadata;
    AppMethodBeat.o(95211);
  }

  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, List<byte[]> paramList, DrmInitData paramDrmInitData, int paramInt8, String paramString3, Metadata paramMetadata)
  {
    AppMethodBeat.i(95199);
    paramString1 = new Format(paramString1, null, paramString2, null, paramInt1, paramInt2, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramString3, -1, 9223372036854775807L, paramList, paramDrmInitData, paramMetadata);
    AppMethodBeat.o(95199);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, List<byte[]> paramList, DrmInitData paramDrmInitData, int paramInt6, String paramString3)
  {
    AppMethodBeat.i(95198);
    paramString1 = a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, -1, -1, paramList, paramDrmInitData, paramInt6, paramString3, null);
    AppMethodBeat.o(95198);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, List<byte[]> paramList, DrmInitData paramDrmInitData, String paramString3)
  {
    AppMethodBeat.i(95197);
    paramString1 = a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramList, paramDrmInitData, 0, paramString3);
    AppMethodBeat.o(95197);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, List<byte[]> paramList, int paramInt4, float paramFloat, byte[] paramArrayOfByte, int paramInt5, ColorInfo paramColorInfo, DrmInitData paramDrmInitData)
  {
    AppMethodBeat.i(95195);
    paramString1 = new Format(paramString1, null, paramString2, null, -1, paramInt1, paramInt2, paramInt3, -1.0F, paramInt4, paramFloat, paramArrayOfByte, paramInt5, paramColorInfo, -1, -1, -1, -1, -1, 0, null, -1, 9223372036854775807L, paramList, paramDrmInitData, null);
    AppMethodBeat.o(95195);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, List<byte[]> paramList, float paramFloat)
  {
    AppMethodBeat.i(95194);
    paramString1 = a(paramString1, paramString2, -1, paramInt1, paramInt2, paramList, -1, paramFloat, null, -1, null, null);
    AppMethodBeat.o(95194);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(95196);
    paramString1 = new Format(paramString1, paramString2, null, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt, paramString3, -1, 9223372036854775807L, null, null, null);
    AppMethodBeat.o(95196);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(95204);
    paramString1 = a(paramString1, paramString2, paramInt1, paramString3, paramInt2, null, 9223372036854775807L, Collections.emptyList());
    AppMethodBeat.o(95204);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2, DrmInitData paramDrmInitData, long paramLong, List<byte[]> paramList)
  {
    AppMethodBeat.i(95206);
    paramString1 = new Format(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt1, paramString3, paramInt2, paramLong, paramList, paramDrmInitData, null);
    AppMethodBeat.o(95206);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, int paramInt, String paramString3, DrmInitData paramDrmInitData)
  {
    AppMethodBeat.i(95203);
    paramString1 = a(paramString1, paramString2, paramInt, paramString3, -1, paramDrmInitData, 9223372036854775807L, Collections.emptyList());
    AppMethodBeat.o(95203);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(95205);
    paramString1 = a(null, paramString1, 0, paramString2, -1, null, paramLong, Collections.emptyList());
    AppMethodBeat.o(95205);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(95193);
    paramString1 = new Format(paramString1, paramString2, null, paramString3, paramInt1, -1, paramInt2, paramInt3, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, 9223372036854775807L, null, null, null);
    AppMethodBeat.o(95193);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    AppMethodBeat.i(95200);
    paramString1 = a(paramString1, paramString2, paramString3, paramInt, paramString4, -1);
    AppMethodBeat.o(95200);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, String paramString3, int paramInt1, String paramString4, int paramInt2)
  {
    AppMethodBeat.i(95201);
    paramString1 = new Format(paramString1, paramString2, paramString3, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt1, paramString4, paramInt2, 9223372036854775807L, null, null, null);
    AppMethodBeat.o(95201);
    return paramString1;
  }

  public static Format a(String paramString1, String paramString2, List<byte[]> paramList, String paramString3, DrmInitData paramDrmInitData)
  {
    AppMethodBeat.i(95207);
    paramString1 = new Format(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, paramString3, -1, 9223372036854775807L, paramList, paramDrmInitData, null);
    AppMethodBeat.o(95207);
    return paramString1;
  }

  public static String a(Format paramFormat)
  {
    AppMethodBeat.i(95224);
    if (paramFormat == null)
    {
      paramFormat = "null";
      AppMethodBeat.o(95224);
    }
    while (true)
    {
      return paramFormat;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("id=").append(paramFormat.id).append(", mimeType=").append(paramFormat.aOd);
      if (paramFormat.bitrate != -1)
        localStringBuilder.append(", bitrate=").append(paramFormat.bitrate);
      if ((paramFormat.width != -1) && (paramFormat.height != -1))
        localStringBuilder.append(", res=").append(paramFormat.width).append("x").append(paramFormat.height);
      if (paramFormat.aOh != -1.0F)
        localStringBuilder.append(", fps=").append(paramFormat.aOh);
      if (paramFormat.aOn != -1)
        localStringBuilder.append(", channels=").append(paramFormat.aOn);
      if (paramFormat.sampleRate != -1)
        localStringBuilder.append(", sample_rate=").append(paramFormat.sampleRate);
      if (paramFormat.aOt != null)
        localStringBuilder.append(", language=").append(paramFormat.aOt);
      paramFormat = localStringBuilder.toString();
      AppMethodBeat.o(95224);
    }
  }

  @TargetApi(16)
  private static void a(MediaFormat paramMediaFormat, String paramString, int paramInt)
  {
    AppMethodBeat.i(95223);
    if (paramInt != -1)
      paramMediaFormat.setInteger(paramString, paramInt);
    AppMethodBeat.o(95223);
  }

  public static Format as(String paramString)
  {
    AppMethodBeat.i(95202);
    paramString = a(null, paramString, 0, null, null);
    AppMethodBeat.o(95202);
    return paramString;
  }

  public static Format c(String paramString, long paramLong)
  {
    AppMethodBeat.i(95209);
    paramString = new Format(null, null, paramString, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, paramLong, null, null, null);
    AppMethodBeat.o(95209);
    return paramString;
  }

  public static Format j(String paramString1, String paramString2)
  {
    AppMethodBeat.i(95208);
    paramString1 = new Format(paramString1, paramString2, null, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, 9223372036854775807L, null, null, null);
    AppMethodBeat.o(95208);
    return paramString1;
  }

  public static Format k(String paramString1, String paramString2)
  {
    AppMethodBeat.i(95210);
    paramString1 = new Format(paramString1, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, 9223372036854775807L, null, null, null);
    AppMethodBeat.o(95210);
    return paramString1;
  }

  public final Format E(long paramLong)
  {
    AppMethodBeat.i(95214);
    Format localFormat = new Format(this.id, this.aOc, this.aOd, this.aOa, this.bitrate, this.aOe, this.width, this.height, this.aOh, this.aOi, this.aOj, this.aOl, this.aOk, this.aOm, this.aOn, this.sampleRate, this.aOo, this.aOp, this.aOq, this.aOs, this.aOt, this.aOu, paramLong, this.aOf, this.aOg, this.aOb);
    AppMethodBeat.o(95214);
    return localFormat;
  }

  public final Format a(DrmInitData paramDrmInitData)
  {
    AppMethodBeat.i(95217);
    paramDrmInitData = new Format(this.id, this.aOc, this.aOd, this.aOa, this.bitrate, this.aOe, this.width, this.height, this.aOh, this.aOi, this.aOj, this.aOl, this.aOk, this.aOm, this.aOn, this.sampleRate, this.aOo, this.aOp, this.aOq, this.aOs, this.aOt, this.aOu, this.aOr, this.aOf, paramDrmInitData, this.aOb);
    AppMethodBeat.o(95217);
    return paramDrmInitData;
  }

  public final Format a(Metadata paramMetadata)
  {
    AppMethodBeat.i(95218);
    paramMetadata = new Format(this.id, this.aOc, this.aOd, this.aOa, this.bitrate, this.aOe, this.width, this.height, this.aOh, this.aOi, this.aOj, this.aOl, this.aOk, this.aOm, this.aOn, this.sampleRate, this.aOo, this.aOp, this.aOq, this.aOs, this.aOt, this.aOu, this.aOr, this.aOf, this.aOg, paramMetadata);
    AppMethodBeat.o(95218);
    return paramMetadata;
  }

  public final Format a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString3)
  {
    AppMethodBeat.i(95215);
    paramString1 = new Format(paramString1, this.aOc, this.aOd, paramString2, paramInt1, this.aOe, paramInt2, paramInt3, this.aOh, this.aOi, this.aOj, this.aOl, this.aOk, this.aOm, this.aOn, this.sampleRate, this.aOo, this.aOp, this.aOq, paramInt4, paramString3, this.aOu, this.aOr, this.aOf, this.aOg, this.aOb);
    AppMethodBeat.o(95215);
    return paramString1;
  }

  public final Format aY(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95216);
    Format localFormat = new Format(this.id, this.aOc, this.aOd, this.aOa, this.bitrate, this.aOe, this.width, this.height, this.aOh, this.aOi, this.aOj, this.aOl, this.aOk, this.aOm, this.aOn, this.sampleRate, this.aOo, paramInt1, paramInt2, this.aOs, this.aOt, this.aOu, this.aOr, this.aOf, this.aOg, this.aOb);
    AppMethodBeat.o(95216);
    return localFormat;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final Format dw(int paramInt)
  {
    AppMethodBeat.i(95213);
    Format localFormat = new Format(this.id, this.aOc, this.aOd, this.aOa, this.bitrate, paramInt, this.width, this.height, this.aOh, this.aOi, this.aOj, this.aOl, this.aOk, this.aOm, this.aOn, this.sampleRate, this.aOo, this.aOp, this.aOq, this.aOs, this.aOt, this.aOu, this.aOr, this.aOf, this.aOg, this.aOb);
    AppMethodBeat.o(95213);
    return localFormat;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(95222);
    if (this == paramObject)
    {
      AppMethodBeat.o(95222);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(95222);
      }
      else
      {
        paramObject = (Format)paramObject;
        if ((this.bitrate != paramObject.bitrate) || (this.aOe != paramObject.aOe) || (this.width != paramObject.width) || (this.height != paramObject.height) || (this.aOh != paramObject.aOh) || (this.aOi != paramObject.aOi) || (this.aOj != paramObject.aOj) || (this.aOk != paramObject.aOk) || (this.aOn != paramObject.aOn) || (this.sampleRate != paramObject.sampleRate) || (this.aOo != paramObject.aOo) || (this.aOp != paramObject.aOp) || (this.aOq != paramObject.aOq) || (this.aOr != paramObject.aOr) || (this.aOs != paramObject.aOs) || (!v.j(this.id, paramObject.id)) || (!v.j(this.aOt, paramObject.aOt)) || (this.aOu != paramObject.aOu) || (!v.j(this.aOc, paramObject.aOc)) || (!v.j(this.aOd, paramObject.aOd)) || (!v.j(this.aOa, paramObject.aOa)) || (!v.j(this.aOg, paramObject.aOg)) || (!v.j(this.aOb, paramObject.aOb)) || (!v.j(this.aOm, paramObject.aOm)) || (!Arrays.equals(this.aOl, paramObject.aOl)) || (this.aOf.size() != paramObject.aOf.size()))
        {
          AppMethodBeat.o(95222);
        }
        else
        {
          for (int i = 0; ; i++)
          {
            if (i >= this.aOf.size())
              break label449;
            if (!Arrays.equals((byte[])this.aOf.get(i), (byte[])paramObject.aOf.get(i)))
            {
              AppMethodBeat.o(95222);
              break;
            }
          }
          label449: AppMethodBeat.o(95222);
          bool = true;
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(95221);
    int j;
    int k;
    label33: int m;
    label43: int n;
    label53: int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i6;
    label93: int i7;
    int i8;
    if (this.aBR == 0)
    {
      if (this.id != null)
        break label208;
      j = 0;
      if (this.aOc != null)
        break label219;
      k = 0;
      if (this.aOd != null)
        break label230;
      m = 0;
      if (this.aOa != null)
        break label242;
      n = 0;
      i1 = this.bitrate;
      i2 = this.width;
      i3 = this.height;
      i4 = this.aOn;
      i5 = this.sampleRate;
      if (this.aOt != null)
        break label254;
      i6 = 0;
      i7 = this.aOu;
      if (this.aOg != null)
        break label266;
      i8 = 0;
      label109: if (this.aOb != null)
        break label278;
    }
    while (true)
    {
      this.aBR = ((i8 + ((i6 + ((((((n + (m + (k + (j + 527) * 31) * 31) * 31) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31) * 31 + i7) * 31) * 31 + i);
      j = this.aBR;
      AppMethodBeat.o(95221);
      return j;
      label208: j = this.id.hashCode();
      break;
      label219: k = this.aOc.hashCode();
      break label33;
      label230: m = this.aOd.hashCode();
      break label43;
      label242: n = this.aOa.hashCode();
      break label53;
      label254: i6 = this.aOt.hashCode();
      break label93;
      label266: i8 = this.aOg.hashCode();
      break label109;
      label278: i = this.aOb.hashCode();
    }
  }

  public final int qb()
  {
    int i = -1;
    int j = i;
    if (this.width != -1)
      if (this.height != -1)
        break label24;
    label24: for (j = i; ; j = this.width * this.height)
      return j;
  }

  @SuppressLint({"InlinedApi"})
  @TargetApi(16)
  public final MediaFormat qc()
  {
    AppMethodBeat.i(95219);
    MediaFormat localMediaFormat = new MediaFormat();
    localMediaFormat.setString("mime", this.aOd);
    Object localObject = this.aOt;
    if (localObject != null)
      localMediaFormat.setString("language", (String)localObject);
    a(localMediaFormat, "max-input-size", this.aOe);
    a(localMediaFormat, "width", this.width);
    a(localMediaFormat, "height", this.height);
    float f = this.aOh;
    if (f != -1.0F)
      localMediaFormat.setFloat("frame-rate", f);
    a(localMediaFormat, "rotation-degrees", this.aOi);
    a(localMediaFormat, "channel-count", this.aOn);
    a(localMediaFormat, "sample-rate", this.sampleRate);
    a(localMediaFormat, "encoder-delay", this.aOp);
    a(localMediaFormat, "encoder-padding", this.aOq);
    for (int i = 0; i < this.aOf.size(); i++)
      localMediaFormat.setByteBuffer("csd-".concat(String.valueOf(i)), ByteBuffer.wrap((byte[])this.aOf.get(i)));
    localObject = this.aOm;
    if (localObject != null)
    {
      a(localMediaFormat, "color-transfer", ((ColorInfo)localObject).aUV);
      a(localMediaFormat, "color-standard", ((ColorInfo)localObject).aUU);
      a(localMediaFormat, "color-range", ((ColorInfo)localObject).aUW);
      localObject = ((ColorInfo)localObject).brS;
      if (localObject != null)
        localMediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap((byte[])localObject));
    }
    AppMethodBeat.o(95219);
    return localMediaFormat;
  }

  public final String toString()
  {
    AppMethodBeat.i(95220);
    String str = "Format(" + this.id + ", " + this.aOc + ", " + this.aOd + ", " + this.bitrate + ", " + this.aOt + ", [" + this.width + ", " + this.height + ", " + this.aOh + "], [" + this.aOn + ", " + this.sampleRate + "])";
    AppMethodBeat.o(95220);
    return str;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(95225);
    paramParcel.writeString(this.id);
    paramParcel.writeString(this.aOc);
    paramParcel.writeString(this.aOd);
    paramParcel.writeString(this.aOa);
    paramParcel.writeInt(this.bitrate);
    paramParcel.writeInt(this.aOe);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    paramParcel.writeFloat(this.aOh);
    paramParcel.writeInt(this.aOi);
    paramParcel.writeFloat(this.aOj);
    if (this.aOl != null);
    for (int i = 1; ; i = 0)
    {
      paramParcel.writeInt(i);
      if (this.aOl != null)
        paramParcel.writeByteArray(this.aOl);
      paramParcel.writeInt(this.aOk);
      paramParcel.writeParcelable(this.aOm, paramInt);
      paramParcel.writeInt(this.aOn);
      paramParcel.writeInt(this.sampleRate);
      paramParcel.writeInt(this.aOo);
      paramParcel.writeInt(this.aOp);
      paramParcel.writeInt(this.aOq);
      paramParcel.writeInt(this.aOs);
      paramParcel.writeString(this.aOt);
      paramParcel.writeInt(this.aOu);
      paramParcel.writeLong(this.aOr);
      i = this.aOf.size();
      paramParcel.writeInt(i);
      for (paramInt = 0; paramInt < i; paramInt++)
        paramParcel.writeByteArray((byte[])this.aOf.get(paramInt));
    }
    paramParcel.writeParcelable(this.aOg, 0);
    paramParcel.writeParcelable(this.aOb, 0);
    AppMethodBeat.o(95225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.Format
 * JD-Core Version:    0.6.2
 */