package com.tencent.mm.sdk.platformtools;

import android.util.ArrayMap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s
{
  public ArrayMap<String, Object> xyn;
  public boolean xyo;

  public s()
  {
    AppMethodBeat.i(115188);
    this.xyn = null;
    this.xyo = false;
    this.xyn = new ArrayMap();
    AppMethodBeat.o(115188);
  }

  private static void a(String paramString1, Object paramObject1, String paramString2, Object paramObject2, ClassCastException paramClassCastException)
  {
    AppMethodBeat.i(115189);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Key ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" expected ");
    localStringBuilder.append(paramString2);
    localStringBuilder.append(" but value was a ");
    localStringBuilder.append(paramObject1.getClass().getName());
    localStringBuilder.append(".  The default value ");
    localStringBuilder.append(paramObject2);
    localStringBuilder.append(" was returned.");
    ab.w("MicroMsg.ImmutableBundle", localStringBuilder.toString());
    ab.w("MicroMsg.ImmutableBundle", "Attempt to cast generated internal exception:", new Object[] { paramClassCastException });
    AppMethodBeat.o(115189);
  }

  public final boolean amr(String paramString)
  {
    AppMethodBeat.i(115190);
    Object localObject = this.xyn.get(paramString);
    boolean bool;
    if (localObject == null)
    {
      AppMethodBeat.o(115190);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        bool = ((Boolean)localObject).booleanValue();
        AppMethodBeat.o(115190);
      }
      catch (ClassCastException localClassCastException)
      {
        a(paramString, localObject, "Boolean", Boolean.FALSE, localClassCastException);
        AppMethodBeat.o(115190);
        bool = false;
      }
    }
  }

  public final String getString(String paramString)
  {
    AppMethodBeat.i(115191);
    Object localObject = this.xyn.get(paramString);
    try
    {
      String str = (String)localObject;
      AppMethodBeat.o(115191);
      paramString = str;
      return paramString;
    }
    catch (ClassCastException localClassCastException)
    {
      while (true)
      {
        a(paramString, localObject, "String", "<null>", localClassCastException);
        paramString = null;
        AppMethodBeat.o(115191);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.s
 * JD-Core Version:    0.6.2
 */