package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Indicator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzbs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SafeParcelable.Class(creator="AccountTransferMsgCreator")
public final class zzo extends zzbs
{
  public static final Parcelable.Creator<zzo> CREATOR;
  private static final HashMap<String, FastJsonResponse.Field<?, ?>> zzbk;

  @SafeParcelable.Indicator
  private final Set<Integer> zzbl;

  @SafeParcelable.Field(getter="getAuthenticatorDatas", id=2)
  private ArrayList<zzu> zzbm;

  @SafeParcelable.Field(getter="getRequestType", id=3)
  private int zzbn;

  @SafeParcelable.Field(getter="getProgress", id=4)
  private zzr zzbo;

  @SafeParcelable.VersionField(id=1)
  private final int zzy;

  static
  {
    AppMethodBeat.i(77009);
    CREATOR = new zzp();
    HashMap localHashMap = new HashMap();
    zzbk = localHashMap;
    localHashMap.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzu.class));
    zzbk.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzr.class));
    AppMethodBeat.o(77009);
  }

  public zzo()
  {
    AppMethodBeat.i(77003);
    this.zzbl = new HashSet(1);
    this.zzy = 1;
    AppMethodBeat.o(77003);
  }

  @SafeParcelable.Constructor
  zzo(@SafeParcelable.Indicator Set<Integer> paramSet, @SafeParcelable.Param(id=1) int paramInt1, @SafeParcelable.Param(id=2) ArrayList<zzu> paramArrayList, @SafeParcelable.Param(id=3) int paramInt2, @SafeParcelable.Param(id=4) zzr paramzzr)
  {
    this.zzbl = paramSet;
    this.zzy = paramInt1;
    this.zzbm = paramArrayList;
    this.zzbn = paramInt2;
    this.zzbo = paramzzr;
  }

  public final <T extends FastJsonResponse> void addConcreteTypeArrayInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, ArrayList<T> paramArrayList)
  {
    AppMethodBeat.i(77007);
    int i = paramField.getSafeParcelableFieldId();
    switch (i)
    {
    default:
      paramField = new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[] { Integer.valueOf(i), paramArrayList.getClass().getCanonicalName() }));
      AppMethodBeat.o(77007);
      throw paramField;
    case 2:
    }
    this.zzbm = paramArrayList;
    this.zzbl.add(Integer.valueOf(i));
    AppMethodBeat.o(77007);
  }

  public final <T extends FastJsonResponse> void addConcreteTypeInternal(FastJsonResponse.Field<?, ?> paramField, String paramString, T paramT)
  {
    AppMethodBeat.i(77008);
    int i = paramField.getSafeParcelableFieldId();
    switch (i)
    {
    default:
      paramField = new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[] { Integer.valueOf(i), paramT.getClass().getCanonicalName() }));
      AppMethodBeat.o(77008);
      throw paramField;
    case 4:
    }
    this.zzbo = ((zzr)paramT);
    this.zzbl.add(Integer.valueOf(i));
    AppMethodBeat.o(77008);
  }

  public final Object getFieldValue(FastJsonResponse.Field paramField)
  {
    AppMethodBeat.i(77006);
    switch (paramField.getSafeParcelableFieldId())
    {
    case 3:
    default:
      int i = paramField.getSafeParcelableFieldId();
      paramField = new IllegalStateException(37 + "Unknown SafeParcelable id=" + i);
      AppMethodBeat.o(77006);
      throw paramField;
    case 1:
      paramField = Integer.valueOf(this.zzy);
      AppMethodBeat.o(77006);
    case 2:
    case 4:
    }
    while (true)
    {
      return paramField;
      paramField = this.zzbm;
      AppMethodBeat.o(77006);
      continue;
      paramField = this.zzbo;
      AppMethodBeat.o(77006);
    }
  }

  public final boolean isFieldSet(FastJsonResponse.Field paramField)
  {
    AppMethodBeat.i(77005);
    boolean bool = this.zzbl.contains(Integer.valueOf(paramField.getSafeParcelableFieldId()));
    AppMethodBeat.o(77005);
    return bool;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(77004);
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    Set localSet = this.zzbl;
    if (localSet.contains(Integer.valueOf(1)))
      SafeParcelWriter.writeInt(paramParcel, 1, this.zzy);
    if (localSet.contains(Integer.valueOf(2)))
      SafeParcelWriter.writeTypedList(paramParcel, 2, this.zzbm, true);
    if (localSet.contains(Integer.valueOf(3)))
      SafeParcelWriter.writeInt(paramParcel, 3, this.zzbn);
    if (localSet.contains(Integer.valueOf(4)))
      SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzbo, paramInt, true);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
    AppMethodBeat.o(77004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.accounttransfer.zzo
 * JD-Core Version:    0.6.2
 */