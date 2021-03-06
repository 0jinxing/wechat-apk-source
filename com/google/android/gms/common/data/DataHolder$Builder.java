package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DataHolder$Builder
{
  private final String[] zznm;
  private final ArrayList<HashMap<String, Object>> zznu;
  private final String zznv;
  private final HashMap<Object, Integer> zznw;
  private boolean zznx;
  private String zzny;

  private DataHolder$Builder(String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(61073);
    this.zznm = ((String[])Preconditions.checkNotNull(paramArrayOfString));
    this.zznu = new ArrayList();
    this.zznv = paramString;
    this.zznw = new HashMap();
    this.zznx = false;
    this.zzny = null;
    AppMethodBeat.o(61073);
  }

  private final boolean zzg(String paramString)
  {
    AppMethodBeat.i(61081);
    Asserts.checkNotNull(paramString);
    boolean bool;
    if ((this.zznx) && (paramString.equals(this.zzny)))
    {
      bool = true;
      AppMethodBeat.o(61081);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(61081);
    }
  }

  public DataHolder build(int paramInt)
  {
    AppMethodBeat.i(61083);
    DataHolder localDataHolder = new DataHolder(this, paramInt, null, null);
    AppMethodBeat.o(61083);
    return localDataHolder;
  }

  public DataHolder build(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(61084);
    paramBundle = new DataHolder(this, paramInt, paramBundle, -1, null);
    AppMethodBeat.o(61084);
    return paramBundle;
  }

  public DataHolder build(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    AppMethodBeat.i(61085);
    paramBundle = new DataHolder(this, paramInt1, paramBundle, paramInt2, null);
    AppMethodBeat.o(61085);
    return paramBundle;
  }

  public boolean containsRowWithValue(String paramString, Object paramObject)
  {
    AppMethodBeat.i(61077);
    int i = this.zznu.size();
    int j = 0;
    boolean bool;
    if (j < i)
      if (Objects.equal(((HashMap)this.zznu.get(j)).get(paramString), paramObject))
      {
        bool = true;
        AppMethodBeat.o(61077);
      }
    while (true)
    {
      return bool;
      j++;
      break;
      AppMethodBeat.o(61077);
      bool = false;
    }
  }

  public Builder descendingSort(String paramString)
  {
    AppMethodBeat.i(61080);
    if (zzg(paramString))
      AppMethodBeat.o(61080);
    while (true)
    {
      return this;
      sort(paramString);
      Collections.reverse(this.zznu);
      AppMethodBeat.o(61080);
    }
  }

  public int getCount()
  {
    AppMethodBeat.i(61082);
    int i = this.zznu.size();
    AppMethodBeat.o(61082);
    return i;
  }

  public void modifyUniqueRowValue(Object paramObject1, String paramString, Object paramObject2)
  {
    AppMethodBeat.i(61075);
    if (this.zznv == null)
      AppMethodBeat.o(61075);
    while (true)
    {
      return;
      paramObject1 = (Integer)this.zznw.get(paramObject1);
      if (paramObject1 == null)
      {
        AppMethodBeat.o(61075);
      }
      else
      {
        ((HashMap)this.zznu.get(paramObject1.intValue())).put(paramString, paramObject2);
        AppMethodBeat.o(61075);
      }
    }
  }

  public Builder removeRowsWithValue(String paramString, Object paramObject)
  {
    AppMethodBeat.i(61078);
    for (int i = this.zznu.size() - 1; i >= 0; i--)
      if (Objects.equal(((HashMap)this.zznu.get(i)).get(paramString), paramObject))
        this.zznu.remove(i);
    AppMethodBeat.o(61078);
    return this;
  }

  public Builder sort(String paramString)
  {
    AppMethodBeat.i(61079);
    if (zzg(paramString))
      AppMethodBeat.o(61079);
    while (true)
    {
      return this;
      Collections.sort(this.zznu, new DataHolder.zza(paramString));
      if (this.zznv != null)
      {
        this.zznw.clear();
        int i = this.zznu.size();
        for (int j = 0; j < i; j++)
        {
          Object localObject = ((HashMap)this.zznu.get(j)).get(this.zznv);
          if (localObject != null)
            this.zznw.put(localObject, Integer.valueOf(j));
        }
      }
      this.zznx = true;
      this.zzny = paramString;
      AppMethodBeat.o(61079);
    }
  }

  public Builder withRow(ContentValues paramContentValues)
  {
    AppMethodBeat.i(61076);
    Asserts.checkNotNull(paramContentValues);
    HashMap localHashMap = new HashMap(paramContentValues.size());
    paramContentValues = paramContentValues.valueSet().iterator();
    while (paramContentValues.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramContentValues.next();
      localHashMap.put((String)localEntry.getKey(), localEntry.getValue());
    }
    paramContentValues = withRow(localHashMap);
    AppMethodBeat.o(61076);
    return paramContentValues;
  }

  public Builder withRow(HashMap<String, Object> paramHashMap)
  {
    AppMethodBeat.i(61074);
    Asserts.checkNotNull(paramHashMap);
    int i;
    if (this.zznv == null)
    {
      i = -1;
      if (i != -1)
        break label113;
      this.zznu.add(paramHashMap);
    }
    while (true)
    {
      this.zznx = false;
      AppMethodBeat.o(61074);
      return this;
      Object localObject = paramHashMap.get(this.zznv);
      if (localObject == null)
      {
        i = -1;
        break;
      }
      Integer localInteger = (Integer)this.zznw.get(localObject);
      if (localInteger == null)
      {
        this.zznw.put(localObject, Integer.valueOf(this.zznu.size()));
        i = -1;
        break;
      }
      i = localInteger.intValue();
      break;
      label113: this.zznu.remove(i);
      this.zznu.add(i, paramHashMap);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataHolder.Builder
 * JD-Core Version:    0.6.2
 */