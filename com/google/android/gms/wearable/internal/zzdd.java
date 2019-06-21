package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SafeParcelable.Class(creator="DataItemParcelableCreator")
@SafeParcelable.Reserved({1})
@VisibleForTesting
public final class zzdd extends AbstractSafeParcelable
  implements DataItem
{
  public static final Parcelable.Creator<zzdd> CREATOR;

  @SafeParcelable.Field(getter="getData", id=5)
  private byte[] data;

  @SafeParcelable.Field(getter="getUri", id=2)
  private final Uri uri;

  @SafeParcelable.Field(getter="getAssetsInternal", id=4, type="android.os.Bundle")
  private final Map<String, DataItemAsset> zzdo;

  static
  {
    AppMethodBeat.i(71197);
    CREATOR = new zzde();
    AppMethodBeat.o(71197);
  }

  @SafeParcelable.Constructor
  zzdd(@SafeParcelable.Param(id=2) Uri paramUri, @SafeParcelable.Param(id=4) Bundle paramBundle, @SafeParcelable.Param(id=5) byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(71194);
    this.uri = paramUri;
    HashMap localHashMap = new HashMap();
    paramBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    paramUri = paramBundle.keySet().iterator();
    while (paramUri.hasNext())
    {
      String str = (String)paramUri.next();
      localHashMap.put(str, (DataItemAssetParcelable)paramBundle.getParcelable(str));
    }
    this.zzdo = localHashMap;
    this.data = paramArrayOfByte;
    AppMethodBeat.o(71194);
  }

  public final Map<String, DataItemAsset> getAssets()
  {
    return this.zzdo;
  }

  @VisibleForTesting
  public final byte[] getData()
  {
    return this.data;
  }

  public final Uri getUri()
  {
    return this.uri;
  }

  public final boolean isDataValid()
  {
    return true;
  }

  public final String toString()
  {
    AppMethodBeat.i(71196);
    boolean bool = Log.isLoggable("DataItem", 3);
    StringBuilder localStringBuilder = new StringBuilder("DataItemParcelable[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    Object localObject;
    if (this.data == null)
    {
      localObject = "null";
      localObject = String.valueOf(localObject);
      localStringBuilder.append(String.valueOf(localObject).length() + 8 + ",dataSz=" + (String)localObject);
      int i = this.zzdo.size();
      localStringBuilder.append(23 + ", numAssets=" + i);
      localObject = String.valueOf(this.uri);
      localStringBuilder.append(String.valueOf(localObject).length() + 6 + ", uri=" + (String)localObject);
      if (bool)
        break label205;
      localStringBuilder.append("]");
      localObject = localStringBuilder.toString();
      AppMethodBeat.o(71196);
    }
    while (true)
    {
      return localObject;
      localObject = Integer.valueOf(this.data.length);
      break;
      label205: localStringBuilder.append("]\n  assets: ");
      Iterator localIterator = this.zzdo.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localObject = String.valueOf(this.zzdo.get(str));
        localStringBuilder.append(String.valueOf(str).length() + 7 + String.valueOf(localObject).length() + "\n    " + str + ": " + (String)localObject);
      }
      localStringBuilder.append("\n  ]");
      localObject = localStringBuilder.toString();
      AppMethodBeat.o(71196);
    }
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(71195);
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, getUri(), paramInt, false);
    Bundle localBundle = new Bundle();
    localBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    Iterator localIterator = this.zzdo.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localBundle.putParcelable((String)localEntry.getKey(), new DataItemAssetParcelable((DataItemAsset)localEntry.getValue()));
    }
    SafeParcelWriter.writeBundle(paramParcel, 4, localBundle, false);
    SafeParcelWriter.writeByteArray(paramParcel, 5, getData(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
    AppMethodBeat.o(71195);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.zzdd
 * JD-Core Version:    0.6.2
 */