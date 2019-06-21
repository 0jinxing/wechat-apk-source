package com.tencent.mm.lib.riskscanner;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.d.a.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class RiskScannerReqBufferProvider extends ContentProvider
{
  public static final Uri CONTENT_URI;

  static
  {
    AppMethodBeat.i(114462);
    CONTENT_URI = Uri.parse("content://com.tencent.mm.lib.riskscanner.RiskScannerReqBufferProvider");
    AppMethodBeat.o(114462);
  }

  private Bundle bN(Context paramContext)
  {
    AppMethodBeat.i(114461);
    Bundle[] arrayOfBundle = new Bundle[1];
    arrayOfBundle[0] = null;
    try
    {
      a.SZ();
      RiskScannerReqBufferProvider.1 local1 = new com/tencent/mm/lib/riskscanner/RiskScannerReqBufferProvider$1;
      local1.<init>(this, arrayOfBundle);
      c.a(paramContext, local1);
      paramContext = arrayOfBundle[0];
      AppMethodBeat.o(114461);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      while (true)
        a.g(paramContext);
    }
  }

  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(114460);
    if ("prepareReqBuffer".equals(paramString1))
    {
      ab.i("MicroMsg.RiskScannerReqBufferProvider", "invoke method: %s, with arg: %s, extras: %s", new Object[] { paramString1, paramString2, paramBundle });
      paramString1 = bN(getContext());
      AppMethodBeat.o(114460);
    }
    while (true)
    {
      return paramString1;
      ab.w("MicroMsg.RiskScannerReqBufferProvider", "unknown method: %s", new Object[] { paramString1 });
      paramString1 = new Bundle[] { null }[0];
      AppMethodBeat.o(114460);
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    AppMethodBeat.i(114459);
    ab.i("MicroMsg.RiskScannerReqBufferProvider", "onCreate called.");
    AppMethodBeat.o(114459);
    return true;
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    return null;
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.lib.riskscanner.RiskScannerReqBufferProvider
 * JD-Core Version:    0.6.2
 */