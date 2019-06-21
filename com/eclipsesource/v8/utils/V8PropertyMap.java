package com.eclipsesource.v8.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class V8PropertyMap<V>
  implements Map<String, V>
{
  private Hashtable<String, V> map;
  private Set<String> nulls;

  V8PropertyMap()
  {
    AppMethodBeat.i(75145);
    this.map = new Hashtable();
    this.nulls = new HashSet();
    AppMethodBeat.o(75145);
  }

  public void clear()
  {
    AppMethodBeat.i(75154);
    this.map.clear();
    this.nulls.clear();
    AppMethodBeat.o(75154);
  }

  public boolean containsKey(Object paramObject)
  {
    AppMethodBeat.i(75148);
    boolean bool;
    if ((this.map.containsKey(paramObject)) || (this.nulls.contains(paramObject)))
    {
      bool = true;
      AppMethodBeat.o(75148);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(75148);
    }
  }

  public boolean containsValue(Object paramObject)
  {
    AppMethodBeat.i(75149);
    boolean bool;
    if ((paramObject == null) && (!this.nulls.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(75149);
    }
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
        AppMethodBeat.o(75149);
      }
      else
      {
        bool = this.map.containsValue(paramObject);
        AppMethodBeat.o(75149);
      }
    }
  }

  public Set<Map.Entry<String, V>> entrySet()
  {
    AppMethodBeat.i(75157);
    HashSet localHashSet = new HashSet(this.map.entrySet());
    Iterator localIterator = this.nulls.iterator();
    while (localIterator.hasNext())
      localHashSet.add(new AbstractMap.SimpleEntry((String)localIterator.next(), null));
    AppMethodBeat.o(75157);
    return localHashSet;
  }

  public V get(Object paramObject)
  {
    AppMethodBeat.i(75150);
    if (this.nulls.contains(paramObject))
    {
      paramObject = null;
      AppMethodBeat.o(75150);
    }
    while (true)
    {
      return paramObject;
      paramObject = this.map.get(paramObject);
      AppMethodBeat.o(75150);
    }
  }

  public boolean isEmpty()
  {
    AppMethodBeat.i(75147);
    boolean bool;
    if ((this.map.isEmpty()) && (this.nulls.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(75147);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(75147);
    }
  }

  public Set<String> keySet()
  {
    AppMethodBeat.i(75155);
    HashSet localHashSet = new HashSet(this.map.keySet());
    localHashSet.addAll(this.nulls);
    AppMethodBeat.o(75155);
    return localHashSet;
  }

  public V put(String paramString, V paramV)
  {
    AppMethodBeat.i(75151);
    if (paramV == null)
    {
      if (this.map.containsKey(paramString))
        this.map.remove(paramString);
      this.nulls.add(paramString);
      paramString = null;
      AppMethodBeat.o(75151);
    }
    while (true)
    {
      return paramString;
      if (this.nulls.contains(paramString))
        this.nulls.remove(paramString);
      paramString = this.map.put(paramString, paramV);
      AppMethodBeat.o(75151);
    }
  }

  public void putAll(Map<? extends String, ? extends V> paramMap)
  {
    AppMethodBeat.i(75153);
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put((String)localEntry.getKey(), localEntry.getValue());
    }
    AppMethodBeat.o(75153);
  }

  public V remove(Object paramObject)
  {
    AppMethodBeat.i(75152);
    if (this.nulls.contains(paramObject))
    {
      this.nulls.remove(paramObject);
      paramObject = null;
      AppMethodBeat.o(75152);
    }
    while (true)
    {
      return paramObject;
      paramObject = this.map.remove(paramObject);
      AppMethodBeat.o(75152);
    }
  }

  public int size()
  {
    AppMethodBeat.i(75146);
    int i = this.map.size();
    int j = this.nulls.size();
    AppMethodBeat.o(75146);
    return i + j;
  }

  public Collection<V> values()
  {
    AppMethodBeat.i(75156);
    ArrayList localArrayList = new ArrayList(this.map.values());
    for (int i = 0; i < this.nulls.size(); i++)
      localArrayList.add(null);
    AppMethodBeat.o(75156);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.eclipsesource.v8.utils.V8PropertyMap
 * JD-Core Version:    0.6.2
 */