package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.wearable.CapabilityInfo;
import com.google.android.gms.wearable.Node;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

@SafeParcelable.Class(creator="CapabilityInfoParcelableCreator")
@SafeParcelable.Reserved({1})
public final class zzah extends AbstractSafeParcelable
  implements CapabilityInfo
{
  public static final Parcelable.Creator<zzah> CREATOR;
  private final Object lock;

  @SafeParcelable.Field(getter="getName", id=2)
  private final String name;

  @GuardedBy("lock")
  private Set<Node> zzbt;

  @SafeParcelable.Field(getter="getNodeParcelables", id=3)
  private final List<zzfo> zzca;

  static
  {
    AppMethodBeat.i(70995);
    CREATOR = new zzai();
    AppMethodBeat.o(70995);
  }

  @SafeParcelable.Constructor
  public zzah(@SafeParcelable.Param(id=2) String paramString, @SafeParcelable.Param(id=3) List<zzfo> paramList)
  {
    AppMethodBeat.i(70989);
    this.lock = new Object();
    this.name = paramString;
    this.zzca = paramList;
    this.zzbt = null;
    Preconditions.checkNotNull(this.name);
    Preconditions.checkNotNull(this.zzca);
    AppMethodBeat.o(70989);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    AppMethodBeat.i(70993);
    if (this == paramObject)
      AppMethodBeat.o(70993);
    while (true)
    {
      return bool;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
      {
        AppMethodBeat.o(70993);
        bool = false;
      }
      else
      {
        paramObject = (zzah)paramObject;
        if (this.name != null)
        {
          if (this.name.equals(paramObject.name));
        }
        else
          while (paramObject.name != null)
          {
            AppMethodBeat.o(70993);
            bool = false;
            break;
          }
        if (this.zzca != null)
        {
          if (this.zzca.equals(paramObject.zzca));
        }
        else
          while (paramObject.zzca != null)
          {
            AppMethodBeat.o(70993);
            bool = false;
            break;
          }
        AppMethodBeat.o(70993);
      }
    }
  }

  public final String getName()
  {
    return this.name;
  }

  public final Set<Node> getNodes()
  {
    AppMethodBeat.i(70990);
    synchronized (this.lock)
    {
      if (this.zzbt == null)
      {
        localObject2 = new java/util/HashSet;
        ((HashSet)localObject2).<init>(this.zzca);
        this.zzbt = ((Set)localObject2);
      }
      Object localObject2 = this.zzbt;
      AppMethodBeat.o(70990);
      return localObject2;
    }
  }

  public final int hashCode()
  {
    int i = 0;
    AppMethodBeat.i(70994);
    if (this.name != null);
    for (int j = this.name.hashCode(); ; j = 0)
    {
      if (this.zzca != null)
        i = this.zzca.hashCode();
      AppMethodBeat.o(70994);
      return (j + 31) * 31 + i;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(70992);
    String str1 = this.name;
    String str2 = String.valueOf(this.zzca);
    str1 = String.valueOf(str1).length() + 18 + String.valueOf(str2).length() + "CapabilityInfo{" + str1 + ", " + str2 + "}";
    AppMethodBeat.o(70992);
    return str1;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(70991);
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, getName(), false);
    SafeParcelWriter.writeTypedList(paramParcel, 3, this.zzca, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
    AppMethodBeat.o(70991);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzah
 * JD-Core Version:    0.6.2
 */