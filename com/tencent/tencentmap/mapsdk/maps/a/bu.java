package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bu
{
  public int a = -1;
  public int b = -1;
  private String c = "";
  private int d = -1;
  private byte e;
  private byte f = (byte)1;
  private String[] g;

  public bu()
  {
  }

  public bu(String paramString, int paramInt)
  {
    this.c = paramString;
    this.d = paramInt;
  }

  public final String a()
  {
    return this.c;
  }

  public final void a(byte paramByte)
  {
    this.e = ((byte)3);
  }

  public final boolean a(bu parambu)
  {
    AppMethodBeat.i(98584);
    boolean bool;
    if ((parambu != null) && (this.c.equals(parambu.c)) && (this.d == parambu.d))
    {
      bool = true;
      AppMethodBeat.o(98584);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(98584);
    }
  }

  public final boolean a(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(98582);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(98582);
    while (true)
    {
      return bool;
      this.g = paramString.split(":");
      if (this.g.length != 2)
      {
        AppMethodBeat.o(98582);
      }
      else
      {
        this.c = this.g[0];
        if (!eu.d(this.c))
        {
          AppMethodBeat.o(98582);
        }
        else
        {
          try
          {
            this.d = Integer.parseInt(this.g[1]);
            if (this.d >= 0)
            {
              int i = this.d;
              if (i <= 65535)
                break label124;
            }
            AppMethodBeat.o(98582);
          }
          catch (NumberFormatException paramString)
          {
            AppMethodBeat.o(98582);
          }
          continue;
          label124: AppMethodBeat.o(98582);
          bool = true;
        }
      }
    }
  }

  public final byte b()
  {
    return this.e;
  }

  public final int c()
  {
    return this.d;
  }

  public final String d()
  {
    AppMethodBeat.i(98581);
    String str = this.c + ":" + this.d;
    AppMethodBeat.o(98581);
    return str;
  }

  public final boolean e()
  {
    if (this.e == 3);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final String toString()
  {
    AppMethodBeat.i(98583);
    String str = this.c + ":" + this.d + ",protocalType:" + this.f + ",ipType:" + this.e;
    AppMethodBeat.o(98583);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bu
 * JD-Core Version:    0.6.2
 */