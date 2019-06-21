package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends ShareOpenGraphValueContainer.Builder>
  implements ShareModel
{
  private final Bundle bundle;

  ShareOpenGraphValueContainer(Parcel paramParcel)
  {
    this.bundle = paramParcel.readBundle(ShareOpenGraphValueContainer.Builder.class.getClassLoader());
  }

  protected ShareOpenGraphValueContainer(ShareOpenGraphValueContainer.Builder<P, E> paramBuilder)
  {
    this.bundle = ((Bundle)ShareOpenGraphValueContainer.Builder.access$000(paramBuilder).clone());
  }

  public int describeContents()
  {
    return 0;
  }

  public Object get(String paramString)
  {
    return this.bundle.get(paramString);
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    return this.bundle.getBoolean(paramString, paramBoolean);
  }

  public boolean[] getBooleanArray(String paramString)
  {
    return this.bundle.getBooleanArray(paramString);
  }

  public Bundle getBundle()
  {
    return (Bundle)this.bundle.clone();
  }

  public double getDouble(String paramString, double paramDouble)
  {
    return this.bundle.getDouble(paramString, paramDouble);
  }

  public double[] getDoubleArray(String paramString)
  {
    return this.bundle.getDoubleArray(paramString);
  }

  public int getInt(String paramString, int paramInt)
  {
    return this.bundle.getInt(paramString, paramInt);
  }

  public int[] getIntArray(String paramString)
  {
    return this.bundle.getIntArray(paramString);
  }

  public long getLong(String paramString, long paramLong)
  {
    return this.bundle.getLong(paramString, paramLong);
  }

  public long[] getLongArray(String paramString)
  {
    return this.bundle.getLongArray(paramString);
  }

  public ShareOpenGraphObject getObject(String paramString)
  {
    paramString = this.bundle.get(paramString);
    if ((paramString instanceof ShareOpenGraphObject));
    for (paramString = (ShareOpenGraphObject)paramString; ; paramString = null)
      return paramString;
  }

  public ArrayList<ShareOpenGraphObject> getObjectArrayList(String paramString)
  {
    Object localObject = this.bundle.getParcelableArrayList(paramString);
    if (localObject == null)
      paramString = null;
    while (true)
    {
      return paramString;
      paramString = new ArrayList();
      localObject = ((ArrayList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Parcelable localParcelable = (Parcelable)((Iterator)localObject).next();
        if ((localParcelable instanceof ShareOpenGraphObject))
          paramString.add((ShareOpenGraphObject)localParcelable);
      }
    }
  }

  public SharePhoto getPhoto(String paramString)
  {
    paramString = this.bundle.getParcelable(paramString);
    if ((paramString instanceof SharePhoto));
    for (paramString = (SharePhoto)paramString; ; paramString = null)
      return paramString;
  }

  public ArrayList<SharePhoto> getPhotoArrayList(String paramString)
  {
    Object localObject = this.bundle.getParcelableArrayList(paramString);
    if (localObject == null)
      paramString = null;
    while (true)
    {
      return paramString;
      paramString = new ArrayList();
      Iterator localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (Parcelable)localIterator.next();
        if ((localObject instanceof SharePhoto))
          paramString.add((SharePhoto)localObject);
      }
    }
  }

  public String getString(String paramString)
  {
    return this.bundle.getString(paramString);
  }

  public ArrayList<String> getStringArrayList(String paramString)
  {
    return this.bundle.getStringArrayList(paramString);
  }

  public Set<String> keySet()
  {
    return this.bundle.keySet();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.bundle);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.ShareOpenGraphValueContainer
 * JD-Core Version:    0.6.2
 */