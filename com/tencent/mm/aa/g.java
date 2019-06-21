package com.tencent.mm.aa;

import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;

public final class g extends JSONException
{
  public g(String paramString)
  {
    super(paramString);
  }

  public g(Throwable paramThrowable)
  {
    super(Log.getStackTraceString(paramThrowable));
    AppMethodBeat.i(117624);
    AppMethodBeat.o(117624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.g
 * JD-Core Version:    0.6.2
 */