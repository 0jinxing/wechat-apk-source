package com.tencent.mm.by;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$b
{
  public static boolean LR(int paramInt)
  {
    AppMethodBeat.i(62590);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key", paramInt);
    boolean bool = a.call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/userinfo/"), "ConfigStorage.getBoolean", null, localBundle).getBoolean("key", false);
    AppMethodBeat.o(62590);
    return bool;
  }

  public static void alW(String paramString)
  {
    AppMethodBeat.i(62592);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("type", Integer.valueOf(-29414086));
    localContentValues.put("value", paramString);
    a.a(Uri.parse("content://com.tencent.mm.storage.provider.emotion/userinfo/"), localContentValues);
    AppMethodBeat.o(62592);
  }

  public static String bJ(int paramInt, String paramString)
  {
    AppMethodBeat.i(62591);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key", paramInt);
    paramString = a.call(Uri.parse("content://com.tencent.mm.storage.provider.emotion/userinfo/"), "ConfigStorage.getString", null, localBundle).getString("key", paramString);
    AppMethodBeat.o(62591);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.by.a.b
 * JD-Core Version:    0.6.2
 */