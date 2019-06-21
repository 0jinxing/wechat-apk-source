package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public class bf
{
  private List<String> a;
  private List<String> b;
  private final int c;

  public bf()
  {
    AppMethodBeat.i(100782);
    this.a = new ArrayList();
    this.b = new ArrayList();
    this.c = 300;
    AppMethodBeat.o(100782);
  }

  private void a(List<String> paramList)
  {
    AppMethodBeat.i(100784);
    if (paramList == null)
      AppMethodBeat.o(100784);
    while (true)
    {
      return;
      if (paramList.size() <= 300)
      {
        AppMethodBeat.o(100784);
      }
      else
      {
        paramList.remove(0);
        AppMethodBeat.o(100784);
      }
    }
  }

  public boolean a(String paramString)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(100783);
        if ((paramString == null) || (paramString.trim().length() == 0))
        {
          AppMethodBeat.o(100783);
          return bool;
        }
        if (this.b.contains(paramString))
        {
          AppMethodBeat.o(100783);
          continue;
        }
      }
      finally
      {
      }
      bool = true;
      AppMethodBeat.o(100783);
    }
  }

  public void b(String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(100785);
        if ((paramString == null) || (paramString.trim().length() == 0))
        {
          AppMethodBeat.o(100785);
          return;
        }
        if (this.b.contains(paramString))
        {
          this.b.remove(paramString);
          this.b.add(paramString);
          AppMethodBeat.o(100785);
          continue;
        }
      }
      finally
      {
      }
      if (this.a.contains(paramString))
      {
        a(this.b);
        this.b.add(paramString);
        this.a.remove(paramString);
        AppMethodBeat.o(100785);
      }
      else
      {
        a(this.a);
        this.a.add(paramString);
        AppMethodBeat.o(100785);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bf
 * JD-Core Version:    0.6.2
 */