package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse
  implements SafeParcelable
{
  public final int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject)
      bool = true;
    while (true)
    {
      return bool;
      if (!getClass().isInstance(paramObject))
      {
        bool = false;
      }
      else
      {
        paramObject = (FastJsonResponse)paramObject;
        Iterator localIterator = getFieldMappings().values().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
            if (isFieldSet(localField))
            {
              if (paramObject.isFieldSet(localField))
              {
                if (getFieldValue(localField).equals(paramObject.getFieldValue(localField)))
                  continue;
                bool = false;
                break;
              }
              bool = false;
              break;
            }
            if (paramObject.isFieldSet(localField))
            {
              bool = false;
              break;
            }
          }
        bool = true;
      }
    }
  }

  @VisibleForTesting
  public Object getValueObject(String paramString)
  {
    return null;
  }

  public int hashCode()
  {
    Iterator localIterator = getFieldMappings().values().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      FastJsonResponse.Field localField = (FastJsonResponse.Field)localIterator.next();
      if (!isFieldSet(localField))
        break label63;
      i = getFieldValue(localField).hashCode() + i * 31;
    }
    label63: 
    while (true)
    {
      break;
      return i;
    }
  }

  @VisibleForTesting
  public boolean isPrimitiveFieldSet(String paramString)
  {
    return false;
  }

  public byte[] toByteArray()
  {
    Parcel localParcel = Parcel.obtain();
    writeToParcel(localParcel, 0);
    byte[] arrayOfByte = localParcel.marshall();
    localParcel.recycle();
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
 * JD-Core Version:    0.6.2
 */