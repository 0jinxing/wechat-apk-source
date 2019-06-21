package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.UriMatcher;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@Deprecated
public class MultiProcessSharedPreferences extends ContentProvider
  implements SharedPreferences
{
  private static String AUTHORITY;
  private static volatile Uri AUTHORITY_URI;
  private BroadcastReceiver jIA;
  private Context mContext;
  private int mMode;
  private String mName;
  private List<SoftReference<SharedPreferences.OnSharedPreferenceChangeListener>> mq;
  private boolean xAp;
  private UriMatcher xAq;
  private Map<String, Integer> xAr;

  public MultiProcessSharedPreferences()
  {
  }

  private MultiProcessSharedPreferences(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(93560);
    this.mContext = paramContext;
    this.mName = paramString;
    this.mMode = paramInt;
    this.xAp = paramContext.getPackageManager().isSafeMode();
    AppMethodBeat.o(93560);
  }

  private static String amL(String paramString)
  {
    AppMethodBeat.i(93573);
    paramString = String.format("%1$s_%2$s", new Object[] { MultiProcessSharedPreferences.class.getName(), paramString });
    AppMethodBeat.o(93573);
    return paramString;
  }

  private Object c(String paramString1, String paramString2, Object paramObject)
  {
    Object localObject1 = null;
    Bundle localBundle = null;
    Object localObject2 = null;
    Object localObject3 = null;
    AppMethodBeat.i(93572);
    if (this.xAp)
    {
      AppMethodBeat.o(93572);
      paramString1 = (String)localObject3;
    }
    while (true)
    {
      return paramString1;
      gy(this.mContext);
      localObject3 = Uri.withAppendedPath(Uri.withAppendedPath(AUTHORITY_URI, this.mName), paramString1);
      int i = this.mMode;
      if (paramObject == null)
      {
        paramString1 = null;
        label70: localObject3 = this.mContext.getContentResolver().query((Uri)localObject3, null, null, new String[] { String.valueOf(i), paramString2, paramString1 }, null);
        paramString1 = localBundle;
        if (localObject3 != null)
          paramString1 = localObject2;
      }
      try
      {
        localBundle = ((Cursor)localObject3).getExtras();
        paramString1 = localObject1;
        if (localBundle != null)
        {
          paramString1 = localObject2;
          paramString2 = localBundle.get("value");
          paramString1 = paramString2;
          localBundle.clear();
          paramString1 = paramString2;
        }
        label155: ((Cursor)localObject3).close();
        if (paramString1 != null)
        {
          AppMethodBeat.o(93572);
          continue;
          paramString1 = String.valueOf(paramObject);
          break label70;
        }
        AppMethodBeat.o(93572);
        paramString1 = paramObject;
      }
      catch (Exception paramString2)
      {
        break label155;
      }
    }
  }

  private void dpb()
  {
    AppMethodBeat.i(93582);
    if (this.xAr == null)
      this.xAr = new HashMap();
    AppMethodBeat.o(93582);
  }

  public static SharedPreferences getSharedPreferences(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(93559);
    as localas = as.amF(paramString);
    as.a(new MultiProcessSharedPreferences(paramContext, paramString, paramInt), localas);
    AppMethodBeat.o(93559);
    return localas;
  }

  private void gy(Context paramContext)
  {
    AppMethodBeat.i(93557);
    if (AUTHORITY_URI == null)
    {
      String str = null;
      Uri localUri1 = AUTHORITY_URI;
      Uri localUri2 = localUri1;
      if (localUri1 == null);
      try
      {
        str = gz(paramContext);
        localUri2 = Uri.parse("content://".concat(String.valueOf(str)));
        if (str == null)
        {
          paramContext = new java/lang/IllegalArgumentException;
          paramContext.<init>("'AUTHORITY' initialize failed.");
          AppMethodBeat.o(93557);
          throw paramContext;
        }
      }
      finally
      {
        AppMethodBeat.o(93557);
      }
      AUTHORITY = str;
      AUTHORITY_URI = localUri2;
    }
    AppMethodBeat.o(93557);
  }

  private static String gz(Context paramContext)
  {
    Object localObject1 = null;
    AppMethodBeat.i(93558);
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 8);
      if ((paramContext != null) && (paramContext.providers != null))
      {
        paramContext = paramContext.providers;
        int i = paramContext.length;
        j = 0;
        if (j < i)
        {
          Object localObject2 = paramContext[j];
          if (localObject2.name.equals(MultiProcessSharedPreferences.class.getName()))
          {
            paramContext = localObject2.authority;
            AppMethodBeat.o(93558);
            return paramContext;
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        int j;
        paramContext = null;
        continue;
        j++;
        continue;
        AppMethodBeat.o(93558);
        paramContext = localObject1;
      }
    }
  }

  private void l(String paramString, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(93583);
    if ((paramArrayList != null) && (!paramArrayList.isEmpty()))
    {
      Intent localIntent = new Intent();
      localIntent.setAction(amL(paramString));
      localIntent.setPackage(getContext().getPackageName());
      localIntent.putExtra("name", paramString);
      localIntent.putExtra("value", paramArrayList);
      getContext().sendBroadcast(localIntent);
    }
    AppMethodBeat.o(93583);
  }

  public boolean contains(String paramString)
  {
    AppMethodBeat.i(93568);
    paramString = (Boolean)c("contains", paramString, null);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.booleanValue();
      AppMethodBeat.o(93568);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(93568);
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(93578);
    paramUri = new UnsupportedOperationException("No external delete");
    AppMethodBeat.o(93578);
    throw paramUri;
  }

  public SharedPreferences.Editor edit()
  {
    AppMethodBeat.i(93569);
    b localb = new b();
    AppMethodBeat.o(93569);
    return localb;
  }

  public Map<String, ?> getAll()
  {
    AppMethodBeat.i(93561);
    Map localMap = (Map)c("getAll", null, null);
    AppMethodBeat.o(93561);
    return localMap;
  }

  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(93567);
    paramString = (Boolean)c("getBoolean", paramString, Boolean.valueOf(paramBoolean));
    if (paramString != null)
    {
      paramBoolean = paramString.booleanValue();
      AppMethodBeat.o(93567);
    }
    while (true)
    {
      return paramBoolean;
      AppMethodBeat.o(93567);
    }
  }

  public float getFloat(String paramString, float paramFloat)
  {
    AppMethodBeat.i(93566);
    paramString = (Float)c("getFloat", paramString, Float.valueOf(paramFloat));
    if (paramString != null)
    {
      paramFloat = paramString.floatValue();
      AppMethodBeat.o(93566);
    }
    while (true)
    {
      return paramFloat;
      AppMethodBeat.o(93566);
    }
  }

  public int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(93564);
    paramString = (Integer)c("getInt", paramString, Integer.valueOf(paramInt));
    if (paramString != null)
    {
      paramInt = paramString.intValue();
      AppMethodBeat.o(93564);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(93564);
    }
  }

  public long getLong(String paramString, long paramLong)
  {
    AppMethodBeat.i(93565);
    paramString = (Long)c("getLong", paramString, Long.valueOf(paramLong));
    if (paramString != null)
    {
      paramLong = paramString.longValue();
      AppMethodBeat.o(93565);
    }
    while (true)
    {
      return paramLong;
      AppMethodBeat.o(93565);
    }
  }

  public String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93562);
    paramString1 = (String)c("getString", paramString1, paramString2);
    if (paramString1 != null)
      AppMethodBeat.o(93562);
    while (true)
    {
      return paramString1;
      AppMethodBeat.o(93562);
      paramString1 = paramString2;
    }
  }

  public Set<String> getStringSet(String paramString, Set<String> paramSet)
  {
    AppMethodBeat.i(93563);
    try
    {
      paramString = (Set)c("getString", paramString, paramSet);
      if (paramString != null);
      while (true)
      {
        return paramString;
        paramString = paramSet;
      }
    }
    finally
    {
      AppMethodBeat.o(93563);
    }
    throw paramString;
  }

  public String getType(Uri paramUri)
  {
    AppMethodBeat.i(93576);
    paramUri = new UnsupportedOperationException("No external call");
    AppMethodBeat.o(93576);
    throw paramUri;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    AppMethodBeat.i(93577);
    paramUri = new UnsupportedOperationException("No external insert");
    AppMethodBeat.o(93577);
    throw paramUri;
  }

  public boolean onCreate()
  {
    AppMethodBeat.i(93574);
    gy(getContext());
    this.xAq = new UriMatcher(-1);
    this.xAq.addURI(AUTHORITY, "*/getAll", 1);
    this.xAq.addURI(AUTHORITY, "*/getString", 2);
    this.xAq.addURI(AUTHORITY, "*/getInt", 3);
    this.xAq.addURI(AUTHORITY, "*/getLong", 4);
    this.xAq.addURI(AUTHORITY, "*/getFloat", 5);
    this.xAq.addURI(AUTHORITY, "*/getBoolean", 6);
    this.xAq.addURI(AUTHORITY, "*/contains", 7);
    this.xAq.addURI(AUTHORITY, "*/apply", 8);
    this.xAq.addURI(AUTHORITY, "*/commit", 9);
    this.xAq.addURI(AUTHORITY, "*/registerOnSharedPreferenceChangeListener", 10);
    this.xAq.addURI(AUTHORITY, "*/unregisterOnSharedPreferenceChangeListener", 11);
    AppMethodBeat.o(93574);
    return true;
  }

  public void onLowMemory()
  {
    AppMethodBeat.i(93580);
    if (this.xAr != null)
      this.xAr.clear();
    super.onLowMemory();
    AppMethodBeat.o(93580);
  }

  public void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(93581);
    if (this.xAr != null)
      this.xAr.clear();
    super.onTrimMemory(paramInt);
    AppMethodBeat.o(93581);
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    AppMethodBeat.i(93575);
    paramString1 = (String)paramUri.getPathSegments().get(0);
    int i = Integer.parseInt(paramArrayOfString2[0]);
    paramString2 = paramArrayOfString2[1];
    paramArrayOfString2 = paramArrayOfString2[2];
    paramArrayOfString1 = new Bundle();
    label386: int j;
    switch (this.xAq.match(paramUri))
    {
    case 8:
    case 9:
    default:
      paramUri = new IllegalArgumentException("This is Unknown Uri：".concat(String.valueOf(paramUri)));
      AppMethodBeat.o(93575);
      throw paramUri;
    case 1:
      paramArrayOfString1.putSerializable("value", (HashMap)getContext().getSharedPreferences(paramString1, i).getAll());
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
      while (true)
      {
        paramUri = new a(paramArrayOfString1);
        AppMethodBeat.o(93575);
        return paramUri;
        paramArrayOfString1.putString("value", getContext().getSharedPreferences(paramString1, i).getString(paramString2, paramArrayOfString2));
        continue;
        paramArrayOfString1.putInt("value", getContext().getSharedPreferences(paramString1, i).getInt(paramString2, Integer.parseInt(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putLong("value", getContext().getSharedPreferences(paramString1, i).getLong(paramString2, Long.parseLong(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putFloat("value", getContext().getSharedPreferences(paramString1, i).getFloat(paramString2, Float.parseFloat(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putBoolean("value", getContext().getSharedPreferences(paramString1, i).getBoolean(paramString2, Boolean.parseBoolean(paramArrayOfString2)));
        continue;
        paramArrayOfString1.putBoolean("value", getContext().getSharedPreferences(paramString1, i).contains(paramString2));
      }
    case 10:
      dpb();
      paramUri = (Integer)this.xAr.get(paramString1);
      if (paramUri == null)
      {
        i = 0;
        j = i + 1;
        this.xAr.put(paramString1, Integer.valueOf(j));
        paramUri = (Integer)this.xAr.get(paramString1);
        if (paramUri != null)
          break label459;
        i = 0;
        label429: if (j != i)
          break label468;
      }
      label459: label468: for (bool = true; ; bool = false)
      {
        paramArrayOfString1.putBoolean("value", bool);
        break;
        i = paramUri.intValue();
        break label386;
        i = paramUri.intValue();
        break label429;
      }
    case 11:
    }
    dpb();
    paramUri = (Integer)this.xAr.get(paramString1);
    if (paramUri == null)
    {
      i = 0;
      label499: j = i - 1;
      if (j > 0)
        break label563;
      this.xAr.remove(paramString1);
      if (this.xAr.containsKey(paramString1))
        break label557;
    }
    label557: for (boolean bool = true; ; bool = false)
    {
      paramArrayOfString1.putBoolean("value", bool);
      break;
      i = paramUri.intValue();
      break label499;
    }
    label563: this.xAr.put(paramString1, Integer.valueOf(j));
    paramUri = (Integer)this.xAr.get(paramString1);
    if (paramUri == null)
    {
      i = 0;
      label600: if (j != i)
        break label630;
    }
    label630: for (bool = true; ; bool = false)
    {
      paramArrayOfString1.putBoolean("value", bool);
      break;
      i = paramUri.intValue();
      break label600;
    }
  }

  public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(93570);
    try
    {
      if (this.mq == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.mq = ((List)localObject1);
      }
      Object localObject1 = (Boolean)c("registerOnSharedPreferenceChangeListener", null, Boolean.FALSE);
      if ((localObject1 != null) && (((Boolean)localObject1).booleanValue()))
      {
        localObject1 = this.mq;
        Object localObject2 = new java/lang/ref/SoftReference;
        ((SoftReference)localObject2).<init>(paramOnSharedPreferenceChangeListener);
        ((List)localObject1).add(localObject2);
        if (this.jIA == null)
        {
          paramOnSharedPreferenceChangeListener = new com/tencent/mm/sdk/platformtools/MultiProcessSharedPreferences$1;
          paramOnSharedPreferenceChangeListener.<init>(this);
          this.jIA = paramOnSharedPreferenceChangeListener;
          localObject2 = this.mContext;
          paramOnSharedPreferenceChangeListener = this.jIA;
          localObject1 = new android/content/IntentFilter;
          ((IntentFilter)localObject1).<init>(amL(this.mName));
          ((Context)localObject2).registerReceiver(paramOnSharedPreferenceChangeListener, (IntentFilter)localObject1);
        }
      }
      return;
    }
    finally
    {
      AppMethodBeat.o(93570);
    }
    throw paramOnSharedPreferenceChangeListener;
  }

  public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener paramOnSharedPreferenceChangeListener)
  {
    AppMethodBeat.i(93571);
    ArrayList localArrayList;
    try
    {
      c("unregisterOnSharedPreferenceChangeListener", null, Boolean.FALSE);
      if (this.mq == null)
        break label195;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = this.mq.iterator();
      while (localIterator.hasNext())
      {
        localObject = (SoftReference)localIterator.next();
        SharedPreferences.OnSharedPreferenceChangeListener localOnSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener)((SoftReference)localObject).get();
        if ((localOnSharedPreferenceChangeListener != null) && (localOnSharedPreferenceChangeListener.equals(paramOnSharedPreferenceChangeListener)))
          localArrayList.add(localObject);
      }
    }
    finally
    {
      AppMethodBeat.o(93571);
    }
    Object localObject = localArrayList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramOnSharedPreferenceChangeListener = (SoftReference)((Iterator)localObject).next();
      this.mq.remove(paramOnSharedPreferenceChangeListener);
    }
    if ((this.mq.isEmpty()) && (this.jIA != null))
    {
      this.mContext.unregisterReceiver(this.jIA);
      this.jIA = null;
      this.mq = null;
    }
    label195: AppMethodBeat.o(93571);
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(93579);
    String str1 = (String)paramUri.getPathSegments().get(0);
    int i = Integer.parseInt(paramArrayOfString[0]);
    Object localObject1 = getContext().getSharedPreferences(str1, i);
    int j = this.xAq.match(paramUri);
    switch (j)
    {
    default:
      paramUri = new IllegalArgumentException("This is Unknown Uri：".concat(String.valueOf(paramUri)));
      AppMethodBeat.o(93579);
      throw paramUri;
    case 8:
    case 9:
    }
    if ((this.xAr != null) && (this.xAr.get(str1) != null) && (((Integer)this.xAr.get(str1)).intValue() > 0))
    {
      i = 1;
      paramUri = new HashMap();
      if (i == 0)
        break label791;
      paramString = new ArrayList();
      paramUri = ((SharedPreferences)localObject1).getAll();
    }
    while (true)
    {
      localObject1 = ((SharedPreferences)localObject1).edit();
      if (Boolean.parseBoolean(paramArrayOfString[1]))
      {
        if ((i != 0) && (paramUri != null) && (!paramUri.isEmpty()))
        {
          paramArrayOfString = paramUri.entrySet().iterator();
          while (true)
            if (paramArrayOfString.hasNext())
            {
              paramString.add(((Map.Entry)paramArrayOfString.next()).getKey());
              continue;
              i = 0;
              break;
            }
        }
        ((SharedPreferences.Editor)localObject1).clear();
      }
      paramArrayOfString = paramContentValues.valueSet().iterator();
      while (paramArrayOfString.hasNext())
      {
        Object localObject2 = (Map.Entry)paramArrayOfString.next();
        String str2 = (String)((Map.Entry)localObject2).getKey();
        localObject2 = ((Map.Entry)localObject2).getValue();
        if (((localObject2 instanceof b)) || (localObject2 == null))
        {
          ((SharedPreferences.Editor)localObject1).remove(str2);
          if ((i != 0) && (paramUri != null) && (paramUri.containsKey(str2)))
            paramString.add(str2);
        }
        while (true)
        {
          if (!(localObject2 instanceof String))
            break label459;
          ((SharedPreferences.Editor)localObject1).putString(str2, (String)localObject2);
          break;
          if ((i != 0) && (paramUri != null) && ((!paramUri.containsKey(str2)) || ((paramUri.containsKey(str2)) && (!localObject2.equals(paramUri.get(str2))))))
            paramString.add(str2);
        }
        label459: if ((localObject2 instanceof Set))
          c.a((SharedPreferences.Editor)localObject1, str2, (Set)localObject2);
        else if ((localObject2 instanceof Integer))
          ((SharedPreferences.Editor)localObject1).putInt(str2, ((Integer)localObject2).intValue());
        else if ((localObject2 instanceof Long))
          ((SharedPreferences.Editor)localObject1).putLong(str2, ((Long)localObject2).longValue());
        else if ((localObject2 instanceof Float))
          ((SharedPreferences.Editor)localObject1).putFloat(str2, ((Float)localObject2).floatValue());
        else if ((localObject2 instanceof Boolean))
          ((SharedPreferences.Editor)localObject1).putBoolean(str2, ((Boolean)localObject2).booleanValue());
      }
      if ((i != 0) && (paramString.isEmpty()))
        i = 1;
      while (true)
      {
        paramContentValues.clear();
        AppMethodBeat.o(93579);
        return i;
        switch (j)
        {
        default:
        case 8:
        case 9:
        }
        do
          while (true)
          {
            i = 0;
            break;
            try
            {
              localObject1.getClass().getDeclaredMethod("apply", new Class[0]).invoke(localObject1, new Object[0]);
              l(str1, paramString);
              i = 1;
            }
            catch (IllegalArgumentException paramUri)
            {
              paramUri = new RuntimeException(paramUri);
              AppMethodBeat.o(93579);
              throw paramUri;
            }
            catch (IllegalAccessException paramUri)
            {
              paramUri = new RuntimeException(paramUri);
              AppMethodBeat.o(93579);
              throw paramUri;
            }
            catch (InvocationTargetException paramUri)
            {
              paramUri = new RuntimeException(paramUri);
              AppMethodBeat.o(93579);
              throw paramUri;
            }
            catch (NoSuchMethodException paramUri)
            {
              paramUri = new RuntimeException(paramUri);
              AppMethodBeat.o(93579);
              throw paramUri;
            }
          }
        while (!((SharedPreferences.Editor)localObject1).commit());
        l(str1, paramString);
        i = 1;
      }
      label791: paramString = null;
    }
  }

  static final class a extends MatrixCursor
  {
    private Bundle mBundle;

    public a(Bundle paramBundle)
    {
      super(0);
      AppMethodBeat.i(93543);
      this.mBundle = paramBundle;
      AppMethodBeat.o(93543);
    }

    public final Bundle getExtras()
    {
      return this.mBundle;
    }

    public final Bundle respond(Bundle paramBundle)
    {
      this.mBundle = paramBundle;
      return this.mBundle;
    }
  }

  public final class b
    implements SharedPreferences.Editor
  {
    private final Map<String, Object> xAc;
    private boolean xAd;

    public b()
    {
      AppMethodBeat.i(93544);
      this.xAc = new HashMap();
      this.xAd = false;
      AppMethodBeat.o(93544);
    }

    private boolean setValue(String paramString)
    {
      AppMethodBeat.i(93554);
      boolean bool;
      if (MultiProcessSharedPreferences.c(MultiProcessSharedPreferences.this))
      {
        AppMethodBeat.o(93554);
        bool = false;
      }
      while (true)
      {
        return bool;
        synchronized (MultiProcessSharedPreferences.this)
        {
          MultiProcessSharedPreferences.a(MultiProcessSharedPreferences.this, MultiProcessSharedPreferences.d(MultiProcessSharedPreferences.this));
          int i = MultiProcessSharedPreferences.e(MultiProcessSharedPreferences.this);
          bool = this.xAd;
          try
          {
            Uri localUri = Uri.withAppendedPath(Uri.withAppendedPath(MultiProcessSharedPreferences.dpc(), MultiProcessSharedPreferences.a(MultiProcessSharedPreferences.this)), paramString);
            paramString = MultiProcessSharedPreferences.c.r((HashMap)this.xAc);
            if (MultiProcessSharedPreferences.d(MultiProcessSharedPreferences.this).getContentResolver().update(localUri, paramString, null, new String[] { String.valueOf(i), String.valueOf(bool) }) > 0);
            for (bool = true; ; bool = false)
            {
              AppMethodBeat.o(93554);
              break;
            }
          }
          finally
          {
            AppMethodBeat.o(93554);
          }
        }
      }
    }

    public final void apply()
    {
      AppMethodBeat.i(93552);
      setValue("apply");
      AppMethodBeat.o(93552);
    }

    public final SharedPreferences.Editor clear()
    {
      try
      {
        this.xAd = true;
        return this;
      }
      finally
      {
      }
    }

    public final boolean commit()
    {
      AppMethodBeat.i(93553);
      boolean bool = setValue("commit");
      AppMethodBeat.o(93553);
      return bool;
    }

    public final SharedPreferences.Editor putBoolean(String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(93550);
      try
      {
        this.xAc.put(paramString, Boolean.valueOf(paramBoolean));
        return this;
      }
      finally
      {
        AppMethodBeat.o(93550);
      }
      throw paramString;
    }

    public final SharedPreferences.Editor putFloat(String paramString, float paramFloat)
    {
      AppMethodBeat.i(93549);
      try
      {
        this.xAc.put(paramString, Float.valueOf(paramFloat));
        return this;
      }
      finally
      {
        AppMethodBeat.o(93549);
      }
      throw paramString;
    }

    public final SharedPreferences.Editor putInt(String paramString, int paramInt)
    {
      AppMethodBeat.i(93547);
      try
      {
        this.xAc.put(paramString, Integer.valueOf(paramInt));
        return this;
      }
      finally
      {
        AppMethodBeat.o(93547);
      }
      throw paramString;
    }

    public final SharedPreferences.Editor putLong(String paramString, long paramLong)
    {
      AppMethodBeat.i(93548);
      try
      {
        this.xAc.put(paramString, Long.valueOf(paramLong));
        return this;
      }
      finally
      {
        AppMethodBeat.o(93548);
      }
      throw paramString;
    }

    public final SharedPreferences.Editor putString(String paramString1, String paramString2)
    {
      AppMethodBeat.i(93545);
      try
      {
        this.xAc.put(paramString1, paramString2);
        return this;
      }
      finally
      {
        AppMethodBeat.o(93545);
      }
      throw paramString1;
    }

    public final SharedPreferences.Editor putStringSet(String paramString, Set<String> paramSet)
    {
      AppMethodBeat.i(93546);
      try
      {
        Map localMap = this.xAc;
        if (paramSet == null);
        for (paramSet = null; ; paramSet = new HashSet(paramSet))
        {
          localMap.put(paramString, paramSet);
          return this;
        }
      }
      finally
      {
        AppMethodBeat.o(93546);
      }
      throw paramString;
    }

    public final SharedPreferences.Editor remove(String paramString)
    {
      AppMethodBeat.i(93551);
      try
      {
        this.xAc.put(paramString, null);
        return this;
      }
      finally
      {
        AppMethodBeat.o(93551);
      }
      throw paramString;
    }
  }

  static final class c
  {
    public static SharedPreferences.Editor a(SharedPreferences.Editor paramEditor, String paramString, Set<String> paramSet)
    {
      AppMethodBeat.i(93556);
      try
      {
        paramEditor = (SharedPreferences.Editor)paramEditor.getClass().getDeclaredMethod("putStringSet", new Class[] { String.class, Set.class }).invoke(paramEditor, new Object[] { paramString, paramSet });
        AppMethodBeat.o(93556);
        return paramEditor;
      }
      catch (IllegalArgumentException paramEditor)
      {
        paramEditor = new RuntimeException(paramEditor);
        AppMethodBeat.o(93556);
        throw paramEditor;
      }
      catch (IllegalAccessException paramEditor)
      {
        paramEditor = new RuntimeException(paramEditor);
        AppMethodBeat.o(93556);
        throw paramEditor;
      }
      catch (InvocationTargetException paramEditor)
      {
        paramEditor = new RuntimeException(paramEditor);
        AppMethodBeat.o(93556);
        throw paramEditor;
      }
      catch (NoSuchMethodException paramEditor)
      {
        paramEditor = new RuntimeException(paramEditor);
        AppMethodBeat.o(93556);
      }
      throw paramEditor;
    }

    public static ContentValues r(HashMap<String, Object> paramHashMap)
    {
      AppMethodBeat.i(93555);
      try
      {
        Constructor localConstructor = ContentValues.class.getDeclaredConstructor(new Class[] { HashMap.class });
        localConstructor.setAccessible(true);
        paramHashMap = (ContentValues)localConstructor.newInstance(new Object[] { paramHashMap });
        AppMethodBeat.o(93555);
        return paramHashMap;
      }
      catch (IllegalArgumentException paramHashMap)
      {
        paramHashMap = new RuntimeException(paramHashMap);
        AppMethodBeat.o(93555);
        throw paramHashMap;
      }
      catch (IllegalAccessException paramHashMap)
      {
        paramHashMap = new RuntimeException(paramHashMap);
        AppMethodBeat.o(93555);
        throw paramHashMap;
      }
      catch (InvocationTargetException paramHashMap)
      {
        paramHashMap = new RuntimeException(paramHashMap);
        AppMethodBeat.o(93555);
        throw paramHashMap;
      }
      catch (NoSuchMethodException paramHashMap)
      {
        paramHashMap = new RuntimeException(paramHashMap);
        AppMethodBeat.o(93555);
        throw paramHashMap;
      }
      catch (InstantiationException paramHashMap)
      {
        paramHashMap = new RuntimeException(paramHashMap);
        AppMethodBeat.o(93555);
      }
      throw paramHashMap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences
 * JD-Core Version:    0.6.2
 */