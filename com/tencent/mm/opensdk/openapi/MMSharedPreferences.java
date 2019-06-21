package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.c.a;
import com.tencent.mm.opensdk.utils.c.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MMSharedPreferences
  implements SharedPreferences
{
  private static final String TAG = "MicroMsg.SDK.SharedPreferences";
  private final String[] columns;
  private final ContentResolver cr;
  private MMSharedPreferences.REditor editor;
  private final HashMap<String, Object> values;

  public MMSharedPreferences(Context paramContext)
  {
    AppMethodBeat.i(128080);
    this.columns = new String[] { "_id", "key", "type", "value" };
    this.values = new HashMap();
    this.editor = null;
    this.cr = paramContext.getContentResolver();
    AppMethodBeat.o(128080);
  }

  private Object getValue(String paramString)
  {
    AppMethodBeat.i(128081);
    try
    {
      Cursor localCursor = this.cr.query(c.b.CONTENT_URI, this.columns, "key = ?", new String[] { paramString }, null);
      if (localCursor == null)
      {
        AppMethodBeat.o(128081);
        paramString = null;
      }
      while (true)
      {
        return paramString;
        int i = localCursor.getColumnIndex("type");
        int j = localCursor.getColumnIndex("value");
        if (!localCursor.moveToFirst())
          break;
        paramString = c.a.a(localCursor.getInt(i), localCursor.getString(j));
        localCursor.close();
        AppMethodBeat.o(128081);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Log.e("MicroMsg.SDK.SharedPreferences", "getValue exception:" + paramString.getMessage());
        AppMethodBeat.o(128081);
        paramString = null;
        continue;
        paramString = null;
      }
    }
  }

  public boolean contains(String paramString)
  {
    AppMethodBeat.i(128088);
    boolean bool;
    if (getValue(paramString) != null)
    {
      bool = true;
      AppMethodBeat.o(128088);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(128088);
    }
  }

  public SharedPreferences.Editor edit()
  {
    AppMethodBeat.i(128089);
    if (this.editor == null)
      this.editor = new MMSharedPreferences.REditor(this.cr);
    MMSharedPreferences.REditor localREditor = this.editor;
    AppMethodBeat.o(128089);
    return localREditor;
  }

  public Map<String, ?> getAll()
  {
    AppMethodBeat.i(128082);
    try
    {
      localCursor = this.cr.query(c.b.CONTENT_URI, this.columns, null, null, null);
      Object localObject;
      if (localCursor == null)
      {
        AppMethodBeat.o(128082);
        localObject = null;
        return localObject;
      }
      int i = localCursor.getColumnIndex("key");
      int j = localCursor.getColumnIndex("type");
      int k = localCursor.getColumnIndex("value");
      while (localCursor.moveToNext())
      {
        localObject = c.a.a(localCursor.getInt(j), localCursor.getString(k));
        this.values.put(localCursor.getString(i), localObject);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Cursor localCursor;
        Log.e("MicroMsg.SDK.SharedPreferences", "getAll exception:" + localException.getMessage());
        HashMap localHashMap = this.values;
        AppMethodBeat.o(128082);
        continue;
        localCursor.close();
        localHashMap = this.values;
        AppMethodBeat.o(128082);
      }
    }
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(128087);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Boolean)))
    {
      paramBoolean = ((Boolean)paramString).booleanValue();
      AppMethodBeat.o(128087);
    }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(128087);
    }
  }

  public float getFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(128086);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Float)))
    {
      paramFloat = ((Float)paramString).floatValue();
      AppMethodBeat.o(128086);
    }
    while (true)
    {
      return paramFloat;
      AppMethodBeat.o(128086);
    }
  }

  public int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(128084);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Integer)))
    {
      paramInt = ((Integer)paramString).intValue();
      AppMethodBeat.o(128084);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(128084);
    }
  }

  public long getLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(128085);
    paramString = getValue(paramString);
    if ((paramString != null) && ((paramString instanceof Long)))
    {
      paramLong = ((Long)paramString).longValue();
      AppMethodBeat.o(128085);
    }
    while (true)
    {
      return paramLong;
      AppMethodBeat.o(128085);
    }
  }

  public String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(128083);
    paramString1 = getValue(paramString1);
    if ((paramString1 != null) && ((paramString1 instanceof String)))
    {
      paramString2 = (String)paramString1;
      AppMethodBeat.o(128083);
    }
    while (true)
    {
      return paramString2;
      AppMethodBeat.o(128083);
    }
  }

  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    return null;
  }

  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
  }

  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.openapi.MMSharedPreferences
 * JD-Core Version:    0.6.2
 */