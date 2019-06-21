package com.google.android.gms.internal.wearable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public final class zzj extends zzn<zzj>
{
  public byte[] zzgd;
  public String zzge;
  public double zzgf;
  public float zzgg;
  public long zzgh;
  public int zzgi;
  public int zzgj;
  public boolean zzgk;
  public zzh[] zzgl;
  public zzi[] zzgm;
  public String[] zzgn;
  public long[] zzgo;
  public float[] zzgp;
  public long zzgq;

  public zzj()
  {
    AppMethodBeat.i(70698);
    this.zzgd = zzw.zzhy;
    this.zzge = "";
    this.zzgf = 0.0D;
    this.zzgg = 0.0F;
    this.zzgh = 0L;
    this.zzgi = 0;
    this.zzgj = 0;
    this.zzgk = false;
    this.zzgl = zzh.zzh();
    this.zzgm = zzi.zzi();
    this.zzgn = zzw.zzhw;
    this.zzgo = zzw.zzhs;
    this.zzgp = zzw.zzht;
    this.zzgq = 0L;
    this.zzhc = null;
    this.zzhl = -1;
    AppMethodBeat.o(70698);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70699);
    if (paramObject == this)
      AppMethodBeat.o(70699);
    while (true)
    {
      return bool;
      if (!(paramObject instanceof zzj))
      {
        AppMethodBeat.o(70699);
        bool = false;
      }
      else
      {
        paramObject = (zzj)paramObject;
        if (!Arrays.equals(this.zzgd, paramObject.zzgd))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (this.zzge == null)
        {
          if (paramObject.zzge != null)
          {
            AppMethodBeat.o(70699);
            bool = false;
          }
        }
        else if (!this.zzge.equals(paramObject.zzge))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (Double.doubleToLongBits(this.zzgf) != Double.doubleToLongBits(paramObject.zzgf))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (Float.floatToIntBits(this.zzgg) != Float.floatToIntBits(paramObject.zzgg))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (this.zzgh != paramObject.zzgh)
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (this.zzgi != paramObject.zzgi)
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (this.zzgj != paramObject.zzgj)
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (this.zzgk != paramObject.zzgk)
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (!zzr.equals(this.zzgl, paramObject.zzgl))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (!zzr.equals(this.zzgm, paramObject.zzgm))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (!zzr.equals(this.zzgn, paramObject.zzgn))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (!zzr.equals(this.zzgo, paramObject.zzgo))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (!zzr.equals(this.zzgp, paramObject.zzgp))
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if (this.zzgq != paramObject.zzgq)
        {
          AppMethodBeat.o(70699);
          bool = false;
        }
        else if ((this.zzhc == null) || (this.zzhc.isEmpty()))
        {
          if ((paramObject.zzhc == null) || (paramObject.zzhc.isEmpty()))
          {
            AppMethodBeat.o(70699);
          }
          else
          {
            AppMethodBeat.o(70699);
            bool = false;
          }
        }
        else
        {
          bool = this.zzhc.equals(paramObject.zzhc);
          AppMethodBeat.o(70699);
        }
      }
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(70700);
    int j = getClass().getName().hashCode();
    int k = Arrays.hashCode(this.zzgd);
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    label104: int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    if (this.zzge == null)
    {
      m = 0;
      long l = Double.doubleToLongBits(this.zzgf);
      n = (int)(l ^ l >>> 32);
      i1 = Float.floatToIntBits(this.zzgg);
      i2 = (int)(this.zzgh ^ this.zzgh >>> 32);
      i3 = this.zzgi;
      i4 = this.zzgj;
      if (!this.zzgk)
        break label299;
      i5 = 1231;
      i6 = zzr.hashCode(this.zzgl);
      i7 = zzr.hashCode(this.zzgm);
      i8 = zzr.hashCode(this.zzgn);
      i9 = zzr.hashCode(this.zzgo);
      i10 = zzr.hashCode(this.zzgp);
      i11 = (int)(this.zzgq ^ this.zzgq >>> 32);
      i12 = i;
      if (this.zzhc != null)
        if (!this.zzhc.isEmpty())
          break label307;
    }
    label299: label307: for (int i12 = i; ; i12 = this.zzhc.hashCode())
    {
      AppMethodBeat.o(70700);
      return (((((((i5 + ((((((m + ((j + 527) * 31 + k) * 31) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31 + i11) * 31 + i12;
      m = this.zzge.hashCode();
      break;
      i5 = 1237;
      break label104;
    }
  }

  public final void zza(zzl paramzzl)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(70701);
    Object localObject;
    if (!Arrays.equals(this.zzgd, zzw.zzhy))
    {
      localObject = this.zzgd;
      paramzzl.zzf(1, 2);
      paramzzl.zzl(localObject.length);
      paramzzl.zzc((byte[])localObject);
    }
    if ((this.zzge != null) && (!this.zzge.equals("")))
      paramzzl.zza(2, this.zzge);
    if (Double.doubleToLongBits(this.zzgf) != Double.doubleToLongBits(0.0D))
    {
      double d = this.zzgf;
      paramzzl.zzf(3, 1);
      paramzzl.zzb(Double.doubleToLongBits(d));
    }
    if (Float.floatToIntBits(this.zzgg) != Float.floatToIntBits(0.0F))
      paramzzl.zza(4, this.zzgg);
    if (this.zzgh != 0L)
      paramzzl.zza(5, this.zzgh);
    if (this.zzgi != 0)
      paramzzl.zzd(6, this.zzgi);
    if (this.zzgj != 0)
    {
      int k = this.zzgj;
      paramzzl.zzf(7, 0);
      paramzzl.zzl(zzl.zzn(k));
    }
    if (this.zzgk)
    {
      boolean bool = this.zzgk;
      paramzzl.zzf(8, 0);
      if (!bool)
        break label282;
    }
    while (true)
    {
      paramzzl.zza((byte)i);
      if ((this.zzgl == null) || (this.zzgl.length <= 0))
        break;
      for (i = 0; i < this.zzgl.length; i++)
      {
        localObject = this.zzgl[i];
        if (localObject != null)
          paramzzl.zza(9, (zzt)localObject);
      }
      label282: i = 0;
    }
    if ((this.zzgm != null) && (this.zzgm.length > 0))
      for (i = 0; i < this.zzgm.length; i++)
      {
        localObject = this.zzgm[i];
        if (localObject != null)
          paramzzl.zza(10, (zzt)localObject);
      }
    if ((this.zzgn != null) && (this.zzgn.length > 0))
      for (i = 0; i < this.zzgn.length; i++)
      {
        localObject = this.zzgn[i];
        if (localObject != null)
          paramzzl.zza(11, (String)localObject);
      }
    if ((this.zzgo != null) && (this.zzgo.length > 0))
      for (i = 0; i < this.zzgo.length; i++)
        paramzzl.zza(12, this.zzgo[i]);
    if (this.zzgq != 0L)
      paramzzl.zza(13, this.zzgq);
    if ((this.zzgp != null) && (this.zzgp.length > 0))
      for (i = j; i < this.zzgp.length; i++)
        paramzzl.zza(14, this.zzgp[i]);
    super.zza(paramzzl);
    AppMethodBeat.o(70701);
  }

  protected final int zzg()
  {
    AppMethodBeat.i(70702);
    int i = super.zzg();
    int j = i;
    Object localObject;
    if (!Arrays.equals(this.zzgd, zzw.zzhy))
    {
      localObject = this.zzgd;
      k = zzl.zzk(1);
      j = zzl.zzm(localObject.length);
      j = i + (localObject.length + j + k);
    }
    i = j;
    if (this.zzge != null)
    {
      i = j;
      if (!this.zzge.equals(""))
        i = j + zzl.zzb(2, this.zzge);
    }
    j = i;
    if (Double.doubleToLongBits(this.zzgf) != Double.doubleToLongBits(0.0D))
      j = i + (zzl.zzk(3) + 8);
    i = j;
    if (Float.floatToIntBits(this.zzgg) != Float.floatToIntBits(0.0F))
      i = j + (zzl.zzk(4) + 4);
    int k = i;
    if (this.zzgh != 0L)
      k = i + zzl.zzb(5, this.zzgh);
    j = k;
    if (this.zzgi != 0)
      j = k + zzl.zze(6, this.zzgi);
    i = j;
    if (this.zzgj != 0)
    {
      k = this.zzgj;
      i = zzl.zzk(7);
      i = j + (zzl.zzm(zzl.zzn(k)) + i);
    }
    j = i;
    if (this.zzgk)
      j = i + (zzl.zzk(8) + 1);
    i = j;
    if (this.zzgl != null)
    {
      i = j;
      if (this.zzgl.length > 0)
      {
        i = 0;
        while (i < this.zzgl.length)
        {
          localObject = this.zzgl[i];
          k = j;
          if (localObject != null)
            k = j + zzl.zzb(9, (zzt)localObject);
          i++;
          j = k;
        }
        i = j;
      }
    }
    j = i;
    if (this.zzgm != null)
    {
      j = i;
      if (this.zzgm.length > 0)
      {
        k = 0;
        j = i;
        i = k;
        while (i < this.zzgm.length)
        {
          localObject = this.zzgm[i];
          k = j;
          if (localObject != null)
            k = j + zzl.zzb(10, (zzt)localObject);
          i++;
          j = k;
        }
      }
    }
    i = j;
    int n;
    if (this.zzgn != null)
    {
      i = j;
      if (this.zzgn.length > 0)
      {
        k = 0;
        int m = 0;
        for (n = 0; k < this.zzgn.length; n = i)
        {
          localObject = this.zzgn[k];
          int i1 = m;
          i = n;
          if (localObject != null)
          {
            i = n + 1;
            i1 = m + zzl.zzg((String)localObject);
          }
          k++;
          m = i1;
        }
        i = j + m + n * 1;
      }
    }
    k = i;
    if (this.zzgo != null)
    {
      k = i;
      if (this.zzgo.length > 0)
      {
        n = 0;
        k = 0;
        if (n < this.zzgo.length)
        {
          long l = this.zzgo[n];
          if ((0xFFFFFF80 & l) == 0L)
            j = 1;
          while (true)
          {
            k += j;
            n++;
            break;
            if ((0xFFFFC000 & l) == 0L)
              j = 2;
            else if ((0xFFE00000 & l) == 0L)
              j = 3;
            else if ((0xF0000000 & l) == 0L)
              j = 4;
            else if ((0x0 & l) == 0L)
              j = 5;
            else if ((0x0 & l) == 0L)
              j = 6;
            else if ((0x0 & l) == 0L)
              j = 7;
            else if ((0x0 & l) == 0L)
              j = 8;
            else if ((l & 0x0) == 0L)
              j = 9;
            else
              j = 10;
          }
        }
        k = i + k + this.zzgo.length * 1;
      }
    }
    j = k;
    if (this.zzgq != 0L)
      j = k + zzl.zzb(13, this.zzgq);
    i = j;
    if (this.zzgp != null)
    {
      i = j;
      if (this.zzgp.length > 0)
        i = j + this.zzgp.length * 4 + this.zzgp.length * 1;
    }
    AppMethodBeat.o(70702);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.wearable.zzj
 * JD-Core Version:    0.6.2
 */