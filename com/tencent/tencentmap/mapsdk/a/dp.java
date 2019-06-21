package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public class dp
  implements dn
{
  private ArrayList<dn> a;

  public dp()
  {
    AppMethodBeat.i(101092);
    this.a = new ArrayList();
    AppMethodBeat.o(101092);
  }

  public void a()
  {
    try
    {
      AppMethodBeat.i(101102);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).a();
      AppMethodBeat.o(101102);
      return;
    }
    finally
    {
    }
  }

  public void a(dn paramdn)
  {
    try
    {
      AppMethodBeat.i(101093);
      if ((paramdn != null) && (!this.a.contains(paramdn)))
        this.a.add(paramdn);
      AppMethodBeat.o(101093);
      return;
    }
    finally
    {
    }
    throw paramdn;
  }

  public boolean a(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(101095);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).a(paramFloat1, paramFloat2);
      AppMethodBeat.o(101095);
      return false;
    }
    finally
    {
    }
  }

  public void b(dn paramdn)
  {
    try
    {
      AppMethodBeat.i(101094);
      this.a.remove(paramdn);
      AppMethodBeat.o(101094);
      return;
    }
    finally
    {
      paramdn = finally;
    }
    throw paramdn;
  }

  public boolean b(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(101096);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).b(paramFloat1, paramFloat2);
      AppMethodBeat.o(101096);
      return false;
    }
    finally
    {
    }
  }

  public boolean c(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(101097);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).c(paramFloat1, paramFloat2);
      AppMethodBeat.o(101097);
      return false;
    }
    finally
    {
    }
  }

  public boolean d(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(101098);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).d(paramFloat1, paramFloat2);
      AppMethodBeat.o(101098);
      return false;
    }
    finally
    {
    }
  }

  public boolean e(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(101099);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).e(paramFloat1, paramFloat2);
      AppMethodBeat.o(101099);
      return false;
    }
    finally
    {
    }
  }

  public boolean f(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(101100);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).f(paramFloat1, paramFloat2);
      AppMethodBeat.o(101100);
      return false;
    }
    finally
    {
    }
  }

  public boolean g(float paramFloat1, float paramFloat2)
  {
    try
    {
      AppMethodBeat.i(101101);
      for (int i = this.a.size() - 1; i >= 0; i--)
        ((dn)this.a.get(i)).g(paramFloat1, paramFloat2);
      AppMethodBeat.o(101101);
      return false;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.dp
 * JD-Core Version:    0.6.2
 */