package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class d
{
  static boolean deepEquals(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(94311);
    boolean bool;
    if ((paramObject1 == null) || (paramObject2 == null))
      if (paramObject1 == paramObject2)
      {
        bool = true;
        AppMethodBeat.o(94311);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94311);
      continue;
      if (((paramObject1 instanceof Object[])) && ((paramObject2 instanceof Object[])))
      {
        bool = Arrays.deepEquals((Object[])paramObject1, (Object[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof boolean[])) && ((paramObject2 instanceof boolean[])))
      {
        bool = Arrays.equals((boolean[])paramObject1, (boolean[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof byte[])) && ((paramObject2 instanceof byte[])))
      {
        bool = Arrays.equals((byte[])paramObject1, (byte[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof char[])) && ((paramObject2 instanceof char[])))
      {
        bool = Arrays.equals((char[])paramObject1, (char[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof double[])) && ((paramObject2 instanceof double[])))
      {
        bool = Arrays.equals((double[])paramObject1, (double[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof float[])) && ((paramObject2 instanceof float[])))
      {
        bool = Arrays.equals((float[])paramObject1, (float[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof int[])) && ((paramObject2 instanceof int[])))
      {
        bool = Arrays.equals((int[])paramObject1, (int[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof long[])) && ((paramObject2 instanceof long[])))
      {
        bool = Arrays.equals((long[])paramObject1, (long[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else if (((paramObject1 instanceof short[])) && ((paramObject2 instanceof short[])))
      {
        bool = Arrays.equals((short[])paramObject1, (short[])paramObject2);
        AppMethodBeat.o(94311);
      }
      else
      {
        bool = paramObject1.equals(paramObject2);
        AppMethodBeat.o(94311);
      }
    }
  }

  static boolean equals(Object paramObject1, Object paramObject2)
  {
    AppMethodBeat.i(94310);
    boolean bool;
    if (paramObject1 == null)
      if (paramObject2 == null)
      {
        bool = true;
        AppMethodBeat.o(94310);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94310);
      continue;
      bool = paramObject1.equals(paramObject2);
      AppMethodBeat.o(94310);
    }
  }

  static String toString(Object paramObject)
  {
    AppMethodBeat.i(94309);
    if (paramObject == null)
    {
      paramObject = "null";
      AppMethodBeat.o(94309);
    }
    while (true)
    {
      return paramObject;
      paramObject = paramObject.toString();
      AppMethodBeat.o(94309);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.d
 * JD-Core Version:    0.6.2
 */