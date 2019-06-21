package com.tencent.wcdb;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BulkCursorDescriptor$1
  implements Parcelable.Creator<BulkCursorDescriptor>
{
  public final BulkCursorDescriptor createFromParcel(Parcel paramParcel)
  {
    AppMethodBeat.i(11960);
    BulkCursorDescriptor localBulkCursorDescriptor = new BulkCursorDescriptor();
    localBulkCursorDescriptor.readFromParcel(paramParcel);
    AppMethodBeat.o(11960);
    return localBulkCursorDescriptor;
  }

  public final BulkCursorDescriptor[] newArray(int paramInt)
  {
    return new BulkCursorDescriptor[paramInt];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.wcdb.BulkCursorDescriptor.1
 * JD-Core Version:    0.6.2
 */