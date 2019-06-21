package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

@SafeParcelable.Class(creator="PasswordSpecificationCreator")
@SafeParcelable.Reserved({1000})
public final class PasswordSpecification extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<PasswordSpecification> CREATOR;
  public static final PasswordSpecification zzdg;
  private static final PasswordSpecification zzdh;

  @SafeParcelable.Field(id=1)
  private final String zzdi;

  @SafeParcelable.Field(id=2)
  private final List<String> zzdj;

  @SafeParcelable.Field(id=3)
  private final List<Integer> zzdk;

  @SafeParcelable.Field(id=4)
  private final int zzdl;

  @SafeParcelable.Field(id=5)
  private final int zzdm;
  private final int[] zzdn;
  private final Random zzdo;

  static
  {
    AppMethodBeat.i(50365);
    CREATOR = new zzm();
    zzdg = new zzd().zzd(12, 16).zze("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").zzd("abcdefghijkmnopqrstxyz", 1).zzd("ABCDEFGHJKLMNPQRSTXY", 1).zzd("3456789", 1).zzj();
    zzdh = new zzd().zzd(12, 16).zze("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").zzd("abcdefghijklmnopqrstuvwxyz", 1).zzd("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).zzd("1234567890", 1).zzj();
    AppMethodBeat.o(50365);
  }

  @SafeParcelable.Constructor
  PasswordSpecification(@SafeParcelable.Param(id=1) String paramString, @SafeParcelable.Param(id=2) List<String> paramList, @SafeParcelable.Param(id=3) List<Integer> paramList1, @SafeParcelable.Param(id=4) int paramInt1, @SafeParcelable.Param(id=5) int paramInt2)
  {
    AppMethodBeat.i(50360);
    this.zzdi = paramString;
    this.zzdj = Collections.unmodifiableList(paramList);
    this.zzdk = Collections.unmodifiableList(paramList1);
    this.zzdl = paramInt1;
    this.zzdm = paramInt2;
    paramString = new int[95];
    Arrays.fill(paramString, -1);
    paramList1 = this.zzdj.iterator();
    for (paramInt1 = 0; paramList1.hasNext(); paramInt1++)
    {
      paramList = ((String)paramList1.next()).toCharArray();
      int i = paramList.length;
      for (paramInt2 = 0; paramInt2 < i; paramInt2++)
        paramString[(paramList[paramInt2] - ' ')] = paramInt1;
    }
    this.zzdn = paramString;
    this.zzdo = new SecureRandom();
    AppMethodBeat.o(50360);
  }

  private static String zzd(Collection<Character> paramCollection)
  {
    AppMethodBeat.i(50362);
    char[] arrayOfChar = new char[paramCollection.size()];
    paramCollection = paramCollection.iterator();
    for (int i = 0; paramCollection.hasNext(); i++)
      arrayOfChar[i] = ((Character)paramCollection.next()).charValue();
    paramCollection = new String(arrayOfChar);
    AppMethodBeat.o(50362);
    return paramCollection;
  }

  private static boolean zzd(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 < 32) || (paramInt1 > 126));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(50361);
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 1, this.zzdi, false);
    SafeParcelWriter.writeStringList(paramParcel, 2, this.zzdj, false);
    SafeParcelWriter.writeIntegerList(paramParcel, 3, this.zzdk, false);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zzdl);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzdm);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
    AppMethodBeat.o(50361);
  }

  public static final class zzd
  {
    private final List<String> zzdj;
    private final List<Integer> zzdk;
    private int zzdl;
    private int zzdm;
    private final TreeSet<Character> zzdp;

    public zzd()
    {
      AppMethodBeat.i(50355);
      this.zzdp = new TreeSet();
      this.zzdj = new ArrayList();
      this.zzdk = new ArrayList();
      this.zzdl = 12;
      this.zzdm = 16;
      AppMethodBeat.o(50355);
    }

    private static TreeSet<Character> zzd(String paramString1, String paramString2)
    {
      AppMethodBeat.i(50359);
      if (TextUtils.isEmpty(paramString1))
      {
        paramString1 = new PasswordSpecification.zze(String.valueOf(paramString2).concat(" cannot be null or empty"));
        AppMethodBeat.o(50359);
        throw paramString1;
      }
      TreeSet localTreeSet = new TreeSet();
      for (char c : paramString1.toCharArray())
      {
        if (PasswordSpecification.zze(c, 32, 126))
        {
          paramString1 = new PasswordSpecification.zze(String.valueOf(paramString2).concat(" must only contain ASCII printable characters"));
          AppMethodBeat.o(50359);
          throw paramString1;
        }
        localTreeSet.add(Character.valueOf(c));
      }
      AppMethodBeat.o(50359);
      return localTreeSet;
    }

    public final zzd zzd(int paramInt1, int paramInt2)
    {
      this.zzdl = 12;
      this.zzdm = 16;
      return this;
    }

    public final zzd zzd(String paramString, int paramInt)
    {
      AppMethodBeat.i(50357);
      paramString = zzd(paramString, "requiredChars");
      this.zzdj.add(PasswordSpecification.zze(paramString));
      this.zzdk.add(Integer.valueOf(1));
      AppMethodBeat.o(50357);
      return this;
    }

    public final zzd zze(String paramString)
    {
      AppMethodBeat.i(50356);
      this.zzdp.addAll(zzd(paramString, "allowedChars"));
      AppMethodBeat.o(50356);
      return this;
    }

    public final PasswordSpecification zzj()
    {
      AppMethodBeat.i(50358);
      if (this.zzdp.isEmpty())
      {
        localObject = new PasswordSpecification.zze("no allowed characters specified");
        AppMethodBeat.o(50358);
        throw ((Throwable)localObject);
      }
      Object localObject = this.zzdk.iterator();
      for (int i = 0; ((Iterator)localObject).hasNext(); i = ((Integer)((Iterator)localObject).next()).intValue() + i);
      if (i > this.zzdm)
      {
        localObject = new PasswordSpecification.zze("required character count cannot be greater than the max password size");
        AppMethodBeat.o(50358);
        throw ((Throwable)localObject);
      }
      boolean[] arrayOfBoolean = new boolean[95];
      Iterator localIterator = this.zzdj.iterator();
      while (localIterator.hasNext())
        for (char c : ((String)localIterator.next()).toCharArray())
        {
          if (arrayOfBoolean[(c - ' ')] != 0)
          {
            localObject = new PasswordSpecification.zze(58 + "character " + c + " occurs in more than one required character set");
            AppMethodBeat.o(50358);
            throw ((Throwable)localObject);
          }
          arrayOfBoolean[(c - ' ')] = true;
        }
      localObject = new PasswordSpecification(PasswordSpecification.zze(this.zzdp), this.zzdj, this.zzdk, this.zzdl, this.zzdm);
      AppMethodBeat.o(50358);
      return localObject;
    }
  }

  public static final class zze extends Error
  {
    public zze(String paramString)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.PasswordSpecification
 * JD-Core Version:    0.6.2
 */