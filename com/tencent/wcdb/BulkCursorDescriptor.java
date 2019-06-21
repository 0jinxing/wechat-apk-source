package com.tencent.wcdb;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class BulkCursorDescriptor
  implements Parcelable
{
  public static final Parcelable.Creator<BulkCursorDescriptor> CREATOR;
  public String[] columnNames;
  public int count;
  public IBulkCursor cursor;
  public boolean wantsAllOnMoveCalls;
  public CursorWindow window;

  static
  {
    AppMethodBeat.i(11966);
    CREATOR = new BulkCursorDescriptor.1();
    AppMethodBeat.o(11966);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final void readFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(11965);
    this.cursor = BulkCursorNative.asInterface(paramParcel.readStrongBinder());
    this.columnNames = readStringArray(paramParcel);
    if (paramParcel.readInt() != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.wantsAllOnMoveCalls = bool;
      this.count = paramParcel.readInt();
      if (paramParcel.readInt() != 0)
        this.window = ((CursorWindow)CursorWindow.CREATOR.createFromParcel(paramParcel));
      AppMethodBeat.o(11965);
      return;
    }
  }

  public final String[] readStringArray(Parcel paramParcel)
  {
    AppMethodBeat.i(11964);
    Object localObject = null;
    int i = paramParcel.readInt();
    if (i >= 0)
    {
      String[] arrayOfString = new String[i];
      for (int j = 0; ; j++)
      {
        localObject = arrayOfString;
        if (j >= i)
          break;
        arrayOfString[j] = paramParcel.readString();
      }
    }
    AppMethodBeat.o(11964);
    return localObject;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(11963);
    paramParcel.writeStrongBinder(this.cursor.asBinder());
    paramParcel.writeStringArray(this.columnNames);
    int i;
    if (this.wantsAllOnMoveCalls)
    {
      i = 1;
      paramParcel.writeInt(i);
      paramParcel.writeInt(this.count);
      if (this.window == null)
        break label82;
      paramParcel.writeInt(1);
      this.window.writeToParcel(paramParcel, paramInt);
      AppMethodBeat.o(11963);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label82: paramParcel.writeInt(0);
      AppMethodBeat.o(11963);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.BulkCursorDescriptor
 * JD-Core Version:    0.6.2
 */