package com.tencent.mm.cj;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class b
  implements SharedPreferences, SharedPreferences.Editor
{
  as AiE;

  public b(as paramas)
  {
    this.AiE = paramas;
  }

  public void apply()
  {
    AppMethodBeat.i(80406);
    this.AiE.apply();
    AppMethodBeat.o(80406);
  }

  public SharedPreferences.Editor clear()
  {
    AppMethodBeat.i(80404);
    SharedPreferences.Editor localEditor = this.AiE.clear();
    AppMethodBeat.o(80404);
    return localEditor;
  }

  public boolean commit()
  {
    AppMethodBeat.i(80405);
    boolean bool = this.AiE.commit();
    AppMethodBeat.o(80405);
    return bool;
  }

  public boolean contains(String paramString)
  {
    AppMethodBeat.i(80393);
    boolean bool = this.AiE.contains(paramString);
    AppMethodBeat.o(80393);
    return bool;
  }

  public SharedPreferences.Editor edit()
  {
    AppMethodBeat.i(80394);
    SharedPreferences.Editor localEditor = this.AiE.edit();
    AppMethodBeat.o(80394);
    return localEditor;
  }

  public Map<String, ?> getAll()
  {
    AppMethodBeat.i(80386);
    HashMap localHashMap = new HashMap();
    String[] arrayOfString = this.AiE.allKeys();
    if (arrayOfString == null)
      AppMethodBeat.o(80386);
    while (true)
    {
      return localHashMap;
      int i = arrayOfString.length;
      for (int j = 0; j < i; j++)
        localHashMap.put(arrayOfString[j], "");
      AppMethodBeat.o(80386);
    }
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(80392);
    paramBoolean = this.AiE.getBoolean(paramString, paramBoolean);
    AppMethodBeat.o(80392);
    return paramBoolean;
  }

  public float getFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(80391);
    paramFloat = this.AiE.getFloat(paramString, paramFloat);
    AppMethodBeat.o(80391);
    return paramFloat;
  }

  public int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(80389);
    paramInt = this.AiE.getInt(paramString, paramInt);
    AppMethodBeat.o(80389);
    return paramInt;
  }

  public long getLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(80390);
    paramLong = this.AiE.getLong(paramString, paramLong);
    AppMethodBeat.o(80390);
    return paramLong;
  }

  public String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80387);
    paramString1 = this.AiE.getString(paramString1, paramString2);
    AppMethodBeat.o(80387);
    return paramString1;
  }

  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(80388);
    paramString = this.AiE.getStringSet(paramString, paramSet);
    AppMethodBeat.o(80388);
    return paramString;
  }

  public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(80402);
    paramString = this.AiE.putBoolean(paramString, paramBoolean);
    AppMethodBeat.o(80402);
    return paramString;
  }

  public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(80401);
    paramString = this.AiE.putFloat(paramString, paramFloat);
    AppMethodBeat.o(80401);
    return paramString;
  }

  public SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(80399);
    paramString = this.AiE.putInt(paramString, paramInt);
    AppMethodBeat.o(80399);
    return paramString;
  }

  public SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(80400);
    paramString = this.AiE.putLong(paramString, paramLong);
    AppMethodBeat.o(80400);
    return paramString;
  }

  public SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80397);
    paramString1 = this.AiE.putString(paramString1, paramString2);
    AppMethodBeat.o(80397);
    return paramString1;
  }

  public SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(80398);
    paramString = this.AiE.putStringSet(paramString, paramSet);
    AppMethodBeat.o(80398);
    return paramString;
  }

  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(80395);
    this.AiE.registerOnSharedPreferenceChangeListener(paramOnSharedPreferenceChangeListener);
    AppMethodBeat.o(80395);
  }

  public SharedPreferences.Editor remove(String paramString)
  {
    AppMethodBeat.i(80403);
    paramString = this.AiE.remove(paramString);
    AppMethodBeat.o(80403);
    return paramString;
  }

  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(80396);
    this.AiE.unregisterOnSharedPreferenceChangeListener(paramOnSharedPreferenceChangeListener);
    AppMethodBeat.o(80396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cj.b
 * JD-Core Version:    0.6.2
 */