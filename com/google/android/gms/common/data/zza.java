package com.google.android.gms.common.data;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;

final class zza extends DataHolder.Builder
{
  zza(String[] paramArrayOfString, String paramString)
  {
    super(paramArrayOfString, null, null);
  }

  public final DataHolder.Builder withRow(ContentValues paramContentValues)
  {
    AppMethodBeat.i(61198);
    paramContentValues = new UnsupportedOperationException("Cannot add data to empty builder");
    AppMethodBeat.o(61198);
    throw paramContentValues;
  }

  public final DataHolder.Builder withRow(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(61197);
    paramHashMap = new UnsupportedOperationException("Cannot add data to empty builder");
    AppMethodBeat.o(61197);
    throw paramHashMap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.zza
 * JD-Core Version:    0.6.2
 */