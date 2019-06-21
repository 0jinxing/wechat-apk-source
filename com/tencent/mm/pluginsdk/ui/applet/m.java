package com.tencent.mm.pluginsdk.ui.applet;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
{
  public int backgroundColor;
  public Object data;
  public int end;
  public String hcl;
  public int linkColor;
  public int start;
  public int type;
  public String url;
  public String username;

  @Deprecated
  public m(int paramInt1, int paramInt2)
  {
    this.start = paramInt1;
    this.end = paramInt2;
    this.url = null;
    this.type = 0;
    this.data = null;
  }

  public m(String paramString, int paramInt, Object paramObject)
  {
    this.url = paramString;
    this.data = paramObject;
    this.type = paramInt;
  }

  public final <T> T au(Class<T> paramClass)
  {
    AppMethodBeat.i(79785);
    if (paramClass.isInstance(this.data))
    {
      paramClass = paramClass.cast(this.data);
      AppMethodBeat.o(79785);
    }
    while (true)
    {
      return paramClass;
      paramClass = null;
      AppMethodBeat.o(79785);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(79787);
    boolean bool;
    if ((paramObject instanceof m))
      if (hashCode() == ((m)paramObject).hashCode())
      {
        bool = true;
        AppMethodBeat.o(79787);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(79787);
      continue;
      bool = super.equals(paramObject);
      AppMethodBeat.o(79787);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(79786);
    int i = super.hashCode();
    int j = i;
    if (!bo.isNullOrNil(this.url))
      j = i + this.url.hashCode();
    i = j + this.type + this.end + this.start;
    j = i;
    if (this.data != null)
      j = i + this.data.hashCode();
    AppMethodBeat.o(79786);
    return j;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.m
 * JD-Core Version:    0.6.2
 */