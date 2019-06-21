package com.tencent.mm.ipcinvoker.extension;

import android.os.Parcel;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static List<a> eGw;
  private static Map<String, a> eGx;

  static
  {
    AppMethodBeat.i(114085);
    eGw = new LinkedList();
    eGx = new HashMap();
    AppMethodBeat.o(114085);
  }

  public static Object a(String paramString, Parcel paramParcel)
  {
    AppMethodBeat.i(114083);
    paramString = (a)eGx.get(paramString);
    if (paramString != null)
    {
      paramString = paramString.d(paramParcel);
      AppMethodBeat.o(114083);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(114083);
    }
  }

  public static void a(a parama)
  {
    AppMethodBeat.i(114084);
    if ((parama == null) || (eGw.contains(parama)))
      AppMethodBeat.o(114084);
    while (true)
    {
      return;
      eGx.put(parama.getClass().getName(), parama);
      eGw.add(parama);
      AppMethodBeat.o(114084);
    }
  }

  public static void a(Object paramObject, Parcel paramParcel)
  {
    AppMethodBeat.i(114082);
    a locala = ar(paramObject);
    if (locala != null)
      locala.a(paramObject, paramParcel);
    AppMethodBeat.o(114082);
  }

  public static a ar(Object paramObject)
  {
    AppMethodBeat.i(114081);
    Iterator localIterator = eGw.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.aq(paramObject))
      {
        AppMethodBeat.o(114081);
        paramObject = locala;
      }
    }
    while (true)
    {
      return paramObject;
      paramObject = null;
      AppMethodBeat.o(114081);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.extension.c
 * JD-Core Version:    0.6.2
 */