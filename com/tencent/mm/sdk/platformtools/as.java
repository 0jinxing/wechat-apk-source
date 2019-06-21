package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.report.e;
import com.tencent.mmkv.MMKV;
import com.tencent.mmkv.a;
import com.tencent.mmkv.c;
import com.tencent.mmkv.d;
import java.util.Map;
import java.util.Set;

public class as
  implements SharedPreferences, SharedPreferences.Editor
{
  private static ArrayMap<String, as> xAo;
  private String name;
  private MMKV xAn;

  static
  {
    AppMethodBeat.i(93541);
    k.a("mmkv", MMKV.class.getClassLoader());
    MMKV.initialize(ah.getContext());
    xAo = new ArrayMap();
    MMKV.registerHandler(new a()
    {
      public final c amJ(String paramAnonymousString)
      {
        AppMethodBeat.i(93460);
        ab.i("MicroMsg.MultiProcessMMKV", "onMMKVCRCCheckFail:%s", new Object[] { paramAnonymousString });
        e.pXa.a(941L, 3L, 1L, true);
        paramAnonymousString = c.AiN;
        AppMethodBeat.o(93460);
        return paramAnonymousString;
      }

      public final c amK(String paramAnonymousString)
      {
        AppMethodBeat.i(93461);
        ab.i("MicroMsg.MultiProcessMMKV", "onMMKVFileLengthError:%s", new Object[] { paramAnonymousString });
        e.pXa.a(941L, 4L, 1L, true);
        paramAnonymousString = c.AiN;
        AppMethodBeat.o(93461);
        return paramAnonymousString;
      }

      public final void h(String paramAnonymousString1, int paramAnonymousInt, String paramAnonymousString2, String paramAnonymousString3)
      {
        AppMethodBeat.i(93462);
        ab.i("MMKV", "[%s][%d][%s] %s", new Object[] { paramAnonymousString1, Integer.valueOf(paramAnonymousInt), paramAnonymousString2, paramAnonymousString3 });
        AppMethodBeat.o(93462);
      }
    });
    AppMethodBeat.o(93541);
  }

  private as(String paramString)
  {
    this.name = paramString;
  }

  private as(String paramString, MMKV paramMMKV)
  {
    this.xAn = paramMMKV;
    this.name = paramString;
  }

  public static int a(SharedPreferences paramSharedPreferences, as paramas)
  {
    int i = 0;
    AppMethodBeat.i(93496);
    if ((paramSharedPreferences == null) || (paramas == null))
      AppMethodBeat.o(93496);
    while (true)
    {
      return i;
      String str = paramas.name;
      if (bo.isNullOrNil(str))
      {
        AppMethodBeat.o(93496);
      }
      else
      {
        as localas = eh("MULTIPROCESSMMKV_PERSERVED_NAME", 2);
        ab.i("MicroMsg.MultiProcessMMKV", "transport2MMKV, name : %s", new Object[] { str });
        try
        {
          bool = localas.decodeBool(str, false);
          if (bool)
          {
            ab.i("MicroMsg.MultiProcessMMKV", "transport2MMKV has Done");
            AppMethodBeat.o(93496);
          }
        }
        catch (Throwable localThrowable)
        {
          while (true)
          {
            doZ();
            boolean bool = localas.decodeBool(str, false);
          }
          localas.encode(str, true);
          e.pXa.a(941L, 2L, 1L, true);
          i = paramas.importFromSharedPreferences(paramSharedPreferences);
          AppMethodBeat.o(93496);
        }
      }
    }
  }

  public static as amF(String paramString)
  {
    AppMethodBeat.i(93497);
    paramString = eg(paramString, 2);
    AppMethodBeat.o(93497);
    return paramString;
  }

  public static as amG(String paramString)
  {
    AppMethodBeat.i(93500);
    as localas = eg(paramString, 2);
    a(ah.getContext().getSharedPreferences(paramString, 4), localas);
    AppMethodBeat.o(93500);
    return localas;
  }

  public static d createNativeBuffer(int paramInt)
  {
    AppMethodBeat.i(93508);
    d locald = MMKV.createNativeBuffer(paramInt);
    AppMethodBeat.o(93508);
    return locald;
  }

  public static void destroyNativeBuffer(d paramd)
  {
    AppMethodBeat.i(93509);
    MMKV.destroyNativeBuffer(paramd);
    AppMethodBeat.o(93509);
  }

  static void doZ()
  {
    AppMethodBeat.i(93538);
    k.a("mmkv", MMKV.class.getClassLoader());
    AppMethodBeat.o(93538);
  }

  private static boolean dpa()
  {
    boolean bool = false;
    AppMethodBeat.i(93539);
    String str = Build.MODEL;
    if (str == null)
      AppMethodBeat.o(93539);
    while (true)
    {
      return bool;
      if ((bo.isEqual(str, "vivo Y66i")) || (bo.isEqual(str, "vivo Y66i A")))
      {
        bool = true;
        AppMethodBeat.o(93539);
      }
      else
      {
        AppMethodBeat.o(93539);
      }
    }
  }

  public static as eg(String paramString, int paramInt)
  {
    a locala = null;
    AppMethodBeat.i(93498);
    if (!isSupported())
      if ((bo.isNullOrNil(paramString)) || (bo.isEqual(paramString, "MULTIPROCESSMMKV_PERSERVED_NAME")))
      {
        ab.i("MicroMsg.MultiProcessMMKV", "getMMKV name is illegal");
        AppMethodBeat.o(93498);
        paramString = locala;
      }
    while (true)
    {
      return paramString;
      locala = new a(paramString, (byte)0);
      paramString = eh(paramString, paramInt);
      a(locala, paramString);
      AppMethodBeat.o(93498);
      continue;
      if ((bo.isNullOrNil(paramString)) || (bo.isEqual(paramString, "MULTIPROCESSMMKV_PERSERVED_NAME")))
      {
        ab.i("MicroMsg.MultiProcessMMKV", "getMMKV name is illegal");
        AppMethodBeat.o(93498);
        paramString = locala;
      }
      else
      {
        paramString = eh(paramString, paramInt);
        AppMethodBeat.o(93498);
      }
    }
  }

  private static as eh(String paramString, int paramInt)
  {
    AppMethodBeat.i(93499);
    try
    {
      as localas = (as)xAo.get(paramString);
      if (localas == null)
      {
        localas = new com/tencent/mm/sdk/platformtools/as;
        localas.<init>(paramString, MMKV.mmkvWithID(paramString, paramInt));
        xAo.put(paramString, localas);
        AppMethodBeat.o(93499);
      }
      for (paramString = localas; ; paramString = localas)
      {
        return paramString;
        AppMethodBeat.o(93499);
      }
    }
    finally
    {
      AppMethodBeat.o(93499);
    }
    throw paramString;
  }

  private static boolean isSupported()
  {
    AppMethodBeat.i(93540);
    boolean bool;
    if (dpa())
    {
      bool = false;
      AppMethodBeat.o(93540);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(93540);
    }
  }

  private boolean s(String paramString, Object paramObject)
  {
    AppMethodBeat.i(93537);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (paramObject == null) || (bo.isNullOrNil(this.name)))
    {
      bool = false;
      AppMethodBeat.o(93537);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(93537);
    }
  }

  public String[] allKeys()
  {
    AppMethodBeat.i(93519);
    try
    {
      String[] arrayOfString1 = this.xAn.allKeys();
      AppMethodBeat.o(93519);
      return arrayOfString1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        String[] arrayOfString2 = this.xAn.allKeys();
      }
    }
  }

  public String amH(String paramString)
  {
    AppMethodBeat.i(93511);
    paramString = this.xAn.decodeString(paramString, null);
    AppMethodBeat.o(93511);
    return paramString;
  }

  public long amI(String paramString)
  {
    AppMethodBeat.i(93513);
    long l = this.xAn.decodeLong(paramString, 0L);
    AppMethodBeat.o(93513);
    return l;
  }

  public void apply()
  {
    AppMethodBeat.i(93536);
    this.xAn.apply();
    AppMethodBeat.o(93536);
  }

  public SharedPreferences.Editor clear()
  {
    AppMethodBeat.i(93534);
    try
    {
      SharedPreferences.Editor localEditor1 = this.xAn.clear();
      AppMethodBeat.o(93534);
      return localEditor1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        SharedPreferences.Editor localEditor2 = this.xAn.clear();
      }
    }
  }

  public boolean commit()
  {
    AppMethodBeat.i(93535);
    try
    {
      bool = this.xAn.commit();
      AppMethodBeat.o(93535);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        boolean bool = this.xAn.commit();
      }
    }
  }

  public boolean contains(String paramString)
  {
    AppMethodBeat.i(93526);
    try
    {
      bool = this.xAn.contains(paramString);
      AppMethodBeat.o(93526);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        boolean bool = this.xAn.contains(paramString);
      }
    }
  }

  public boolean containsKey(String paramString)
  {
    AppMethodBeat.i(93516);
    boolean bool = this.xAn.containsKey(paramString);
    AppMethodBeat.o(93516);
    return bool;
  }

  public boolean decodeBool(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93514);
    paramBoolean = this.xAn.decodeBool(paramString, paramBoolean);
    AppMethodBeat.o(93514);
    return paramBoolean;
  }

  public byte[] decodeBytes(String paramString)
  {
    AppMethodBeat.i(93515);
    paramString = this.xAn.decodeBytes(paramString);
    AppMethodBeat.o(93515);
    return paramString;
  }

  public int decodeInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(93512);
    paramInt = this.xAn.decodeInt(paramString, paramInt);
    AppMethodBeat.o(93512);
    return paramInt;
  }

  public SharedPreferences.Editor edit()
  {
    return this;
  }

  public boolean encode(String paramString, int paramInt)
  {
    AppMethodBeat.i(93503);
    boolean bool;
    if (!s(paramString, Integer.valueOf(paramInt)))
    {
      bool = false;
      AppMethodBeat.o(93503);
    }
    while (true)
    {
      return bool;
      bool = this.xAn.encode(paramString, paramInt);
      AppMethodBeat.o(93503);
    }
  }

  public boolean encode(String paramString, long paramLong)
  {
    AppMethodBeat.i(93504);
    boolean bool;
    if (!s(paramString, Long.valueOf(paramLong)))
    {
      bool = false;
      AppMethodBeat.o(93504);
    }
    while (true)
    {
      return bool;
      bool = this.xAn.encode(paramString, paramLong);
      AppMethodBeat.o(93504);
    }
  }

  public boolean encode(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93502);
    boolean bool;
    if (!s(paramString1, paramString2))
    {
      bool = false;
      AppMethodBeat.o(93502);
    }
    while (true)
    {
      return bool;
      bool = this.xAn.encode(paramString1, paramString2);
      AppMethodBeat.o(93502);
    }
  }

  public boolean encode(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93505);
    if (!s(paramString, Boolean.valueOf(paramBoolean)))
    {
      paramBoolean = false;
      AppMethodBeat.o(93505);
    }
    while (true)
    {
      return paramBoolean;
      try
      {
        boolean bool = this.xAn.encode(paramString, paramBoolean);
        paramBoolean = bool;
        AppMethodBeat.o(93505);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          doZ();
          paramBoolean = this.xAn.encode(paramString, paramBoolean);
        }
      }
    }
  }

  public boolean encode(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93506);
    boolean bool;
    if (!s(paramString, paramArrayOfByte))
    {
      bool = false;
      AppMethodBeat.o(93506);
    }
    while (true)
    {
      return bool;
      bool = this.xAn.encode(paramString, paramArrayOfByte);
      AppMethodBeat.o(93506);
    }
  }

  public Map<String, ?> getAll()
  {
    AppMethodBeat.i(93518);
    Map localMap = this.xAn.getAll();
    AppMethodBeat.o(93518);
    return localMap;
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93525);
    try
    {
      boolean bool = this.xAn.getBoolean(paramString, paramBoolean);
      paramBoolean = bool;
      AppMethodBeat.o(93525);
      return paramBoolean;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        paramBoolean = this.xAn.getBoolean(paramString, paramBoolean);
      }
    }
  }

  public float getFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(93524);
    try
    {
      float f = this.xAn.getFloat(paramString, paramFloat);
      paramFloat = f;
      AppMethodBeat.o(93524);
      return paramFloat;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        paramFloat = this.xAn.getFloat(paramString, paramFloat);
      }
    }
  }

  public int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(93522);
    try
    {
      int i = this.xAn.getInt(paramString, paramInt);
      paramInt = i;
      AppMethodBeat.o(93522);
      return paramInt;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        paramInt = this.xAn.getInt(paramString, paramInt);
      }
    }
  }

  public long getLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(93523);
    try
    {
      long l = this.xAn.getLong(paramString, paramLong);
      paramLong = l;
      AppMethodBeat.o(93523);
      return paramLong;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        paramLong = this.xAn.getLong(paramString, paramLong);
      }
    }
  }

  public String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93520);
    try
    {
      String str = this.xAn.getString(paramString1, paramString2);
      paramString1 = str;
      AppMethodBeat.o(93520);
      return paramString1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        paramString1 = this.xAn.getString(paramString1, paramString2);
      }
    }
  }

  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(93521);
    try
    {
      Set localSet = this.xAn.getStringSet(paramString, paramSet);
      paramString = localSet;
      AppMethodBeat.o(93521);
      return paramString;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        paramString = this.xAn.getStringSet(paramString, paramSet);
      }
    }
  }

  public final int getValueActualSize(String paramString)
  {
    AppMethodBeat.i(93501);
    int i = this.xAn.getValueActualSize(paramString);
    AppMethodBeat.o(93501);
    return i;
  }

  public int importFromSharedPreferences(SharedPreferences paramSharedPreferences)
  {
    AppMethodBeat.i(93507);
    try
    {
      i = this.xAn.importFromSharedPreferences(paramSharedPreferences);
      AppMethodBeat.o(93507);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        int i = this.xAn.importFromSharedPreferences(paramSharedPreferences);
      }
    }
  }

  public SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93532);
    if (!s(paramString, Boolean.valueOf(paramBoolean)))
    {
      paramString = edit();
      AppMethodBeat.o(93532);
    }
    while (true)
    {
      return paramString;
      try
      {
        SharedPreferences.Editor localEditor = this.xAn.putBoolean(paramString, paramBoolean);
        paramString = localEditor;
        AppMethodBeat.o(93532);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          doZ();
          paramString = this.xAn.putBoolean(paramString, paramBoolean);
        }
      }
    }
  }

  public SharedPreferences.Editor putFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(93531);
    if (!s(paramString, Float.valueOf(paramFloat)))
    {
      paramString = edit();
      AppMethodBeat.o(93531);
    }
    while (true)
    {
      return paramString;
      try
      {
        SharedPreferences.Editor localEditor = this.xAn.putFloat(paramString, paramFloat);
        paramString = localEditor;
        AppMethodBeat.o(93531);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          doZ();
          paramString = this.xAn.putFloat(paramString, paramFloat);
        }
      }
    }
  }

  public SharedPreferences.Editor putInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(93529);
    if (!s(paramString, Integer.valueOf(paramInt)))
    {
      paramString = edit();
      AppMethodBeat.o(93529);
    }
    while (true)
    {
      return paramString;
      try
      {
        SharedPreferences.Editor localEditor = this.xAn.putInt(paramString, paramInt);
        paramString = localEditor;
        AppMethodBeat.o(93529);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          doZ();
          paramString = this.xAn.putInt(paramString, paramInt);
        }
      }
    }
  }

  public SharedPreferences.Editor putLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(93530);
    if (!s(paramString, Long.valueOf(paramLong)))
    {
      paramString = edit();
      AppMethodBeat.o(93530);
    }
    while (true)
    {
      return paramString;
      try
      {
        SharedPreferences.Editor localEditor = this.xAn.putLong(paramString, paramLong);
        paramString = localEditor;
        AppMethodBeat.o(93530);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          doZ();
          paramString = this.xAn.putLong(paramString, paramLong);
        }
      }
    }
  }

  public SharedPreferences.Editor putString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93527);
    if (!s(paramString1, paramString2))
    {
      paramString1 = edit();
      AppMethodBeat.o(93527);
    }
    while (true)
    {
      return paramString1;
      try
      {
        SharedPreferences.Editor localEditor = this.xAn.putString(paramString1, paramString2);
        paramString1 = localEditor;
        AppMethodBeat.o(93527);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          doZ();
          paramString1 = this.xAn.putString(paramString1, paramString2);
        }
      }
    }
  }

  public SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(93528);
    if (!s(paramString, paramSet))
    {
      paramString = edit();
      AppMethodBeat.o(93528);
    }
    while (true)
    {
      return paramString;
      try
      {
        SharedPreferences.Editor localEditor = this.xAn.putStringSet(paramString, paramSet);
        paramString = localEditor;
        AppMethodBeat.o(93528);
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          doZ();
          paramString = this.xAn.putStringSet(paramString, paramSet);
        }
      }
    }
  }

  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
  }

  public SharedPreferences.Editor remove(String paramString)
  {
    AppMethodBeat.i(93533);
    try
    {
      SharedPreferences.Editor localEditor1 = this.xAn.remove(paramString);
      paramString = localEditor1.remove(paramString);
      AppMethodBeat.o(93533);
      return paramString;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        doZ();
        SharedPreferences.Editor localEditor2 = this.xAn.remove(paramString);
      }
    }
  }

  public void removeValueForKey(String paramString)
  {
    AppMethodBeat.i(93517);
    this.xAn.removeValueForKey(paramString);
    AppMethodBeat.o(93517);
  }

  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
  }

  public final int writeValueToNativeBuffer(String paramString, d paramd)
  {
    AppMethodBeat.i(93510);
    int i = this.xAn.writeValueToNativeBuffer(paramString, paramd);
    AppMethodBeat.o(93510);
    return i;
  }

  static final class a extends as
    implements SharedPreferences, SharedPreferences.Editor
  {
    private SharedPreferences ehZ;

    private a(String paramString)
    {
      super((byte)0);
      AppMethodBeat.i(93463);
      this.ehZ = ah.getContext().getSharedPreferences(paramString, 4);
      AppMethodBeat.o(93463);
    }

    public final String[] allKeys()
    {
      AppMethodBeat.i(93465);
      String[] arrayOfString = (String[])this.ehZ.getAll().keySet().toArray(new String[0]);
      AppMethodBeat.o(93465);
      return arrayOfString;
    }

    public final String amH(String paramString)
    {
      AppMethodBeat.i(93489);
      paramString = this.ehZ.getString(paramString, null);
      AppMethodBeat.o(93489);
      return paramString;
    }

    public final long amI(String paramString)
    {
      AppMethodBeat.i(93491);
      long l = this.ehZ.getLong(paramString, 0L);
      AppMethodBeat.o(93491);
      return l;
    }

    public final void apply()
    {
      AppMethodBeat.i(93482);
      this.ehZ.edit().apply();
      AppMethodBeat.o(93482);
    }

    public final SharedPreferences.Editor clear()
    {
      AppMethodBeat.i(93480);
      SharedPreferences.Editor localEditor = this.ehZ.edit().clear();
      localEditor.apply();
      AppMethodBeat.o(93480);
      return localEditor;
    }

    public final boolean commit()
    {
      AppMethodBeat.i(93481);
      boolean bool = this.ehZ.edit().commit();
      AppMethodBeat.o(93481);
      return bool;
    }

    public final boolean contains(String paramString)
    {
      AppMethodBeat.i(93472);
      boolean bool = this.ehZ.contains(paramString);
      AppMethodBeat.o(93472);
      return bool;
    }

    public final boolean containsKey(String paramString)
    {
      AppMethodBeat.i(93494);
      boolean bool = this.ehZ.contains(paramString);
      AppMethodBeat.o(93494);
      return bool;
    }

    public final boolean decodeBool(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(93492);
      paramBoolean = this.ehZ.getBoolean(paramString, paramBoolean);
      AppMethodBeat.o(93492);
      return paramBoolean;
    }

    public final byte[] decodeBytes(String paramString)
    {
      AppMethodBeat.i(93493);
      paramString = this.ehZ.getString(paramString, "");
      try
      {
        paramString = Base64.decode(paramString, 0);
        AppMethodBeat.o(93493);
        return paramString;
      }
      catch (Exception paramString)
      {
        while (true)
        {
          paramString = null;
          AppMethodBeat.o(93493);
        }
      }
    }

    public final int decodeInt(String paramString, int paramInt)
    {
      AppMethodBeat.i(93490);
      paramInt = this.ehZ.getInt(paramString, paramInt);
      AppMethodBeat.o(93490);
      return paramInt;
    }

    public final SharedPreferences.Editor edit()
    {
      return this;
    }

    public final boolean encode(String paramString, int paramInt)
    {
      AppMethodBeat.i(93484);
      this.ehZ.edit().putInt(paramString, paramInt).apply();
      AppMethodBeat.o(93484);
      return true;
    }

    public final boolean encode(String paramString, long paramLong)
    {
      AppMethodBeat.i(93485);
      this.ehZ.edit().putLong(paramString, paramLong).apply();
      AppMethodBeat.o(93485);
      return true;
    }

    public final boolean encode(String paramString1, String paramString2)
    {
      AppMethodBeat.i(93483);
      this.ehZ.edit().putString(paramString1, paramString2).apply();
      AppMethodBeat.o(93483);
      return true;
    }

    public final boolean encode(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(93486);
      this.ehZ.edit().putBoolean(paramString, paramBoolean).apply();
      AppMethodBeat.o(93486);
      return true;
    }

    public final boolean encode(String paramString, byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(93487);
      paramArrayOfByte = Base64.encodeToString(paramArrayOfByte, 0);
      this.ehZ.edit().putString(paramString, paramArrayOfByte).apply();
      AppMethodBeat.o(93487);
      return true;
    }

    public final Map<String, ?> getAll()
    {
      AppMethodBeat.i(93464);
      Map localMap = this.ehZ.getAll();
      AppMethodBeat.o(93464);
      return localMap;
    }

    public final boolean getBoolean(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(93471);
      paramBoolean = this.ehZ.getBoolean(paramString, paramBoolean);
      AppMethodBeat.o(93471);
      return paramBoolean;
    }

    public final float getFloat(String paramString, float paramFloat)
    {
      AppMethodBeat.i(93470);
      paramFloat = this.ehZ.getFloat(paramString, paramFloat);
      AppMethodBeat.o(93470);
      return paramFloat;
    }

    public final int getInt(String paramString, int paramInt)
    {
      AppMethodBeat.i(93468);
      try
      {
        int i = this.ehZ.getInt(paramString, paramInt);
        paramInt = i;
        AppMethodBeat.o(93468);
        return paramInt;
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          as.doZ();
          paramInt = this.ehZ.getInt(paramString, paramInt);
        }
      }
    }

    public final long getLong(String paramString, long paramLong)
    {
      AppMethodBeat.i(93469);
      paramLong = this.ehZ.getLong(paramString, paramLong);
      AppMethodBeat.o(93469);
      return paramLong;
    }

    public final String getString(String paramString1, String paramString2)
    {
      AppMethodBeat.i(93466);
      paramString1 = this.ehZ.getString(paramString1, paramString2);
      AppMethodBeat.o(93466);
      return paramString1;
    }

    public final Set<String> getStringSet(String paramString, Set<String> paramSet)
    {
      AppMethodBeat.i(93467);
      paramString = this.ehZ.getStringSet(paramString, paramSet);
      AppMethodBeat.o(93467);
      return paramString;
    }

    public final int importFromSharedPreferences(SharedPreferences paramSharedPreferences)
    {
      AppMethodBeat.i(93488);
      int i = paramSharedPreferences.getAll().size();
      AppMethodBeat.o(93488);
      return i;
    }

    public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(93478);
      paramString = this.ehZ.edit().putBoolean(paramString, paramBoolean);
      paramString.apply();
      AppMethodBeat.o(93478);
      return paramString;
    }

    public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      AppMethodBeat.i(93477);
      paramString = this.ehZ.edit().putFloat(paramString, paramFloat);
      paramString.apply();
      AppMethodBeat.o(93477);
      return paramString;
    }

    public final SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      AppMethodBeat.i(93475);
      paramString = this.ehZ.edit().putInt(paramString, paramInt);
      paramString.apply();
      AppMethodBeat.o(93475);
      return paramString;
    }

    public final SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      AppMethodBeat.i(93476);
      paramString = this.ehZ.edit().putLong(paramString, paramLong);
      paramString.apply();
      AppMethodBeat.o(93476);
      return paramString;
    }

    public final SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      AppMethodBeat.i(93473);
      paramString1 = this.ehZ.edit().putString(paramString1, paramString2);
      paramString1.apply();
      AppMethodBeat.o(93473);
      return paramString1;
    }

    public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
    {
      AppMethodBeat.i(93474);
      paramString = this.ehZ.edit().putStringSet(paramString, paramSet);
      paramString.apply();
      AppMethodBeat.o(93474);
      return paramString;
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
    {
    }

    public final SharedPreferences.Editor remove(String paramString)
    {
      AppMethodBeat.i(93479);
      SharedPreferences.Editor localEditor = this.ehZ.edit().remove(paramString);
      localEditor.apply();
      paramString = localEditor.remove(paramString);
      AppMethodBeat.o(93479);
      return paramString;
    }

    public final void removeValueForKey(String paramString)
    {
      AppMethodBeat.i(93495);
      this.ehZ.edit().remove(paramString).apply();
      AppMethodBeat.o(93495);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.as
 * JD-Core Version:    0.6.2
 */