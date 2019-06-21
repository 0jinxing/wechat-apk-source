package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.basemap.data.a;
import com.tencent.map.lib.basemap.data.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class lm
{
  private int a = 0;
  private int b = 0;
  private String c = "default";
  private String d = "";
  private String e = "";
  private String f;

  public lm(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.d = paramString1;
    this.e = paramString2;
    this.f = paramString3;
    this.c = paramString4;
  }

  private boolean b(a parama)
  {
    AppMethodBeat.i(100440);
    boolean bool;
    if ("default".equals(this.c))
    {
      bool = true;
      AppMethodBeat.o(100440);
    }
    while (true)
    {
      return bool;
      if (parama == null)
      {
        bool = false;
        AppMethodBeat.o(100440);
      }
      else
      {
        bool = ln.a(parama.a(), ln.a().c(this.c));
        AppMethodBeat.o(100440);
      }
    }
  }

  private boolean c(a parama)
  {
    boolean bool = true;
    AppMethodBeat.i(100441);
    if ("default".equals(this.c))
      AppMethodBeat.o(100441);
    while (true)
    {
      return bool;
      if (parama == null)
      {
        bool = false;
        AppMethodBeat.o(100441);
      }
      else
      {
        b[] arrayOfb = ln.a().c(this.c);
        parama = parama.b();
        if ((parama == null) || (arrayOfb == null))
        {
          AppMethodBeat.o(100441);
        }
        else
        {
          bool = ln.a(parama, arrayOfb);
          AppMethodBeat.o(100441);
        }
      }
    }
  }

  public int a()
  {
    return this.a * 10 + this.b;
  }

  public boolean a(a parama)
  {
    AppMethodBeat.i(100439);
    boolean bool;
    switch (this.a)
    {
    default:
      bool = false;
      AppMethodBeat.o(100439);
    case 0:
    case 1:
    }
    while (true)
    {
      return bool;
      bool = b(parama);
      AppMethodBeat.o(100439);
      continue;
      bool = c(parama);
      AppMethodBeat.o(100439);
    }
  }

  public String b()
  {
    return this.d;
  }

  public String c()
  {
    return this.e;
  }

  public String d()
  {
    return this.f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lm
 * JD-Core Version:    0.6.2
 */