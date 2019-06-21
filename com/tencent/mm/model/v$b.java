package com.tencent.mm.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.Set;

public final class v$b
{
  private Map<String, Object> flc;

  public v$b()
  {
    AppMethodBeat.i(115076);
    this.flc = new v.a((byte)0);
    AppMethodBeat.o(115076);
  }

  public final b ae(String paramString1, String paramString2)
  {
    AppMethodBeat.i(115081);
    if (!TextUtils.isEmpty(paramString1))
      this.flc.put(paramString1, paramString2);
    AppMethodBeat.o(115081);
    return this;
  }

  public final boolean containsKey(String paramString)
  {
    AppMethodBeat.i(115078);
    boolean bool = this.flc.containsKey(paramString);
    AppMethodBeat.o(115078);
    return bool;
  }

  public final Object get(String paramString)
  {
    AppMethodBeat.i(115083);
    paramString = this.flc.get(paramString);
    AppMethodBeat.o(115083);
    return paramString;
  }

  public final <T> T get(String paramString, T paramT)
  {
    AppMethodBeat.i(115087);
    paramString = get(paramString);
    if (paramString != null)
    {
      AppMethodBeat.o(115087);
      paramT = paramString;
    }
    while (true)
    {
      return paramT;
      AppMethodBeat.o(115087);
    }
  }

  public final boolean getBoolean(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(115085);
    boolean bool = paramBoolean;
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = this.flc.get(paramString);
      bool = paramBoolean;
      if ((paramString instanceof Boolean))
        bool = ((Boolean)paramString).booleanValue();
    }
    AppMethodBeat.o(115085);
    return bool;
  }

  public final int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(115084);
    int i = paramInt;
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = this.flc.get(paramString);
      i = paramInt;
      if ((paramString instanceof Integer))
        i = ((Integer)paramString).intValue();
    }
    AppMethodBeat.o(115084);
    return i;
  }

  public final Set<String> getKeySet()
  {
    AppMethodBeat.i(115077);
    Set localSet = this.flc.keySet();
    AppMethodBeat.o(115077);
    return localSet;
  }

  public final String getString(String paramString1, String paramString2)
  {
    AppMethodBeat.i(115086);
    String str = paramString2;
    if (!TextUtils.isEmpty(paramString1))
    {
      paramString1 = this.flc.get(paramString1);
      str = paramString2;
      if ((paramString1 instanceof String))
        str = (String)paramString1;
    }
    AppMethodBeat.o(115086);
    return str;
  }

  public final b j(String paramString, Object paramObject)
  {
    AppMethodBeat.i(115079);
    if (!TextUtils.isEmpty(paramString))
      this.flc.put(paramString, paramObject);
    AppMethodBeat.o(115079);
    return this;
  }

  public final boolean nX(String paramString)
  {
    AppMethodBeat.i(115082);
    if (!TextUtils.isEmpty(paramString))
    {
      paramString = this.flc.get(paramString);
      if (!(paramString instanceof Boolean));
    }
    for (boolean bool = ((Boolean)paramString).booleanValue(); ; bool = false)
    {
      AppMethodBeat.o(115082);
      return bool;
    }
  }

  public final void recycle()
  {
    AppMethodBeat.i(115088);
    this.flc.clear();
    AppMethodBeat.o(115088);
  }

  public final b z(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(115080);
    if (!TextUtils.isEmpty(paramString))
      this.flc.put(paramString, Boolean.valueOf(paramBoolean));
    AppMethodBeat.o(115080);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.v.b
 * JD-Core Version:    0.6.2
 */