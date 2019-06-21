package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.wearable.zze;
import com.google.android.gms.internal.wearable.zzf;
import com.google.android.gms.internal.wearable.zzg;
import com.google.android.gms.internal.wearable.zzs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@VisibleForTesting
public class DataMapItem
{
  private final Uri uri;
  private final DataMap zzr;

  private DataMapItem(DataItem paramDataItem)
  {
    AppMethodBeat.i(70863);
    this.uri = paramDataItem.getUri();
    this.zzr = zza((DataItem)paramDataItem.freeze());
    AppMethodBeat.o(70863);
  }

  public static DataMapItem fromDataItem(DataItem paramDataItem)
  {
    AppMethodBeat.i(70862);
    Asserts.checkNotNull(paramDataItem, "dataItem must not be null");
    paramDataItem = new DataMapItem(paramDataItem);
    AppMethodBeat.o(70862);
    return paramDataItem;
  }

  private static DataMap zza(DataItem paramDataItem)
  {
    AppMethodBeat.i(70864);
    if ((paramDataItem.getData() == null) && (paramDataItem.getAssets().size() > 0))
    {
      paramDataItem = new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
      AppMethodBeat.o(70864);
      throw paramDataItem;
    }
    if (paramDataItem.getData() == null)
    {
      paramDataItem = new DataMap();
      AppMethodBeat.o(70864);
    }
    while (true)
    {
      return paramDataItem;
      try
      {
        Object localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        int i = paramDataItem.getAssets().size();
        j = 0;
        if (j < i)
        {
          localObject2 = (DataItemAsset)paramDataItem.getAssets().get(Integer.toString(j));
          if (localObject2 == null)
          {
            localObject1 = new java/lang/IllegalStateException;
            localObject3 = String.valueOf(paramDataItem);
            i = String.valueOf(localObject3).length();
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>(i + 64);
            ((IllegalStateException)localObject1).<init>("Cannot find DataItemAsset referenced in data at " + j + " for " + (String)localObject3);
            AppMethodBeat.o(70864);
            throw ((Throwable)localObject1);
          }
        }
      }
      catch (zzs localzzs)
      {
        while (true)
        {
          int j;
          localObject3 = String.valueOf(paramDataItem.getUri());
          localObject2 = Base64.encodeToString(paramDataItem.getData(), 0);
          new StringBuilder(String.valueOf(localObject3).length() + 50 + String.valueOf(localObject2).length()).append("Unable to parse datamap from dataItem. uri=").append((String)localObject3).append(", data=").append((String)localObject2);
          paramDataItem = String.valueOf(paramDataItem.getUri());
          paramDataItem = new IllegalStateException(String.valueOf(paramDataItem).length() + 44 + "Unable to parse datamap from dataItem.  uri=" + paramDataItem, localzzs);
          AppMethodBeat.o(70864);
          throw paramDataItem;
          localzzs.add(Asset.createFromRef(((DataItemAsset)localObject2).getId()));
          j++;
        }
        Object localObject2 = zzg.zza(paramDataItem.getData());
        Object localObject3 = new com/google/android/gms/internal/wearable/zzf;
        ((zzf)localObject3).<init>((zzg)localObject2, localzzs);
        DataMap localDataMap = zze.zza((zzf)localObject3);
        paramDataItem = localDataMap;
        AppMethodBeat.o(70864);
      }
      catch (NullPointerException localNullPointerException)
      {
        label190: break label190;
      }
    }
  }

  public DataMap getDataMap()
  {
    return this.zzr;
  }

  public Uri getUri()
  {
    return this.uri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataMapItem
 * JD-Core Version:    0.6.2
 */