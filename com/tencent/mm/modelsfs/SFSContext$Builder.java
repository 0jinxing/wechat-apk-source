package com.tencent.mm.modelsfs;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class SFSContext$Builder
  implements Parcelable
{
  public static final Parcelable.Creator<Builder> CREATOR;
  HashMap<Integer, Object> mConf;
  String mName;

  static
  {
    AppMethodBeat.i(93229);
    CREATOR = new SFSContext.Builder.1();
    AppMethodBeat.o(93229);
  }

  public SFSContext$Builder()
  {
    AppMethodBeat.i(93225);
    this.mName = null;
    this.mConf = new HashMap();
    AppMethodBeat.o(93225);
  }

  private SFSContext$Builder(Parcel paramParcel)
  {
    AppMethodBeat.i(93228);
    this.mName = paramParcel.readString();
    this.mConf = new HashMap();
    paramParcel = paramParcel.readArray(Builder.class.getClassLoader());
    if (paramParcel != null)
      for (int i = 0; i < paramParcel.length; i++)
        if (paramParcel[i] != null)
          this.mConf.put(Integer.valueOf(i), paramParcel[i]);
    AppMethodBeat.o(93228);
  }

  public SFSContext create()
  {
    AppMethodBeat.i(93226);
    SFSContext localSFSContext = new SFSContext(this, (byte)0);
    AppMethodBeat.o(93226);
    return localSFSContext;
  }

  public int describeContents()
  {
    return 0;
  }

  public Builder setBlockFileMaxSize(int paramInt)
  {
    AppMethodBeat.i(93219);
    this.mConf.put(Integer.valueOf(4), Integer.valueOf(paramInt));
    AppMethodBeat.o(93219);
    return this;
  }

  public Builder setBlockFilePrefix(String paramString)
  {
    AppMethodBeat.i(93215);
    this.mConf.put(Integer.valueOf(2), paramString);
    AppMethodBeat.o(93215);
    return this;
  }

  public Builder setBlockSizeArray(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(93218);
    this.mConf.put(Integer.valueOf(5), paramArrayOfInt);
    AppMethodBeat.o(93218);
    return this;
  }

  public Builder setConnectionPool(int paramInt)
  {
    AppMethodBeat.i(93220);
    this.mConf.put(Integer.valueOf(7), Integer.valueOf(paramInt));
    AppMethodBeat.o(93220);
    return this;
  }

  public Builder setDBDirectory(String paramString)
  {
    AppMethodBeat.i(93224);
    String str = paramString;
    if (paramString.endsWith("/"))
      str = paramString.substring(0, paramString.length() - 1);
    this.mConf.put(Integer.valueOf(1), str + "/%s.index");
    AppMethodBeat.o(93224);
    return this;
  }

  public Builder setIOMode(int paramInt)
  {
    AppMethodBeat.i(93217);
    this.mConf.put(Integer.valueOf(9), Integer.valueOf(paramInt));
    AppMethodBeat.o(93217);
    return this;
  }

  public Builder setIndexDBPath(String paramString)
  {
    AppMethodBeat.i(93214);
    this.mConf.put(Integer.valueOf(1), paramString);
    AppMethodBeat.o(93214);
    return this;
  }

  public Builder setMaxConcurrentIO(int paramInt)
  {
    AppMethodBeat.i(93221);
    this.mConf.put(Integer.valueOf(10), Integer.valueOf(paramInt));
    AppMethodBeat.o(93221);
    return this;
  }

  public Builder setName(String paramString)
  {
    this.mName = paramString;
    return this;
  }

  public Builder setOverflowPrefix(String paramString)
  {
    AppMethodBeat.i(93216);
    this.mConf.put(Integer.valueOf(3), paramString);
    AppMethodBeat.o(93216);
    return this;
  }

  public Builder setStoragePath(String paramString)
  {
    AppMethodBeat.i(93223);
    String str = paramString;
    if (paramString.endsWith("/"))
      str = paramString.substring(0, paramString.length() - 1);
    this.mConf.put(Integer.valueOf(2), str + "/%s.block");
    this.mConf.put(Integer.valueOf(3), str + "/%s/");
    AppMethodBeat.o(93223);
    return this;
  }

  public Builder setSyncMode(int paramInt)
  {
    AppMethodBeat.i(93222);
    this.mConf.put(Integer.valueOf(11), Integer.valueOf(paramInt));
    AppMethodBeat.o(93222);
    return this;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(93227);
    paramParcel.writeString(this.mName);
    Object[] arrayOfObject = new Object[12];
    Iterator localIterator = this.mConf.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramInt = ((Integer)localEntry.getKey()).intValue();
      if ((paramInt < 12) && (paramInt >= 0))
        arrayOfObject[paramInt] = localEntry.getValue();
    }
    paramParcel.writeArray(arrayOfObject);
    AppMethodBeat.o(93227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsfs.SFSContext.Builder
 * JD-Core Version:    0.6.2
 */