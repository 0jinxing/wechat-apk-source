package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;

public class fe
{
  int a;
  fd b;
  fd c;
  Interpolator d;
  ArrayList<fd> e;
  fi f;

  public fe(fd[] paramArrayOffd)
  {
    AppMethodBeat.i(98869);
    this.a = paramArrayOffd.length;
    this.e = new ArrayList();
    this.e.addAll(Arrays.asList(paramArrayOffd));
    this.b = ((fd)this.e.get(0));
    this.c = ((fd)this.e.get(this.a - 1));
    this.d = this.c.c();
    AppMethodBeat.o(98869);
  }

  public static fe a(double[] paramArrayOfDouble)
  {
    int i = 1;
    AppMethodBeat.i(98870);
    int j = paramArrayOfDouble.length;
    fd.a[] arrayOfa = new fd.a[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfa[0] = ((fd.a)fd.a(0.0F));
      arrayOfa[1] = ((fd.a)fd.a(1.0F, paramArrayOfDouble[0]));
    }
    while (true)
    {
      paramArrayOfDouble = new fa(arrayOfa);
      AppMethodBeat.o(98870);
      return paramArrayOfDouble;
      arrayOfa[0] = ((fd.a)fd.a(0.0F, paramArrayOfDouble[0]));
      while (i < j)
      {
        arrayOfa[i] = ((fd.a)fd.a(i / (j - 1), paramArrayOfDouble[i]));
        i++;
      }
    }
  }

  public static fe a(Object[] paramArrayOfObject)
  {
    int i = 1;
    AppMethodBeat.i(98871);
    int j = paramArrayOfObject.length;
    fd.b[] arrayOfb = new fd.b[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfb[0] = ((fd.b)fd.b(0.0F));
      arrayOfb[1] = ((fd.b)fd.a(1.0F, paramArrayOfObject[0]));
    }
    while (true)
    {
      paramArrayOfObject = new fe(arrayOfb);
      AppMethodBeat.o(98871);
      return paramArrayOfObject;
      arrayOfb[0] = ((fd.b)fd.a(0.0F, paramArrayOfObject[0]));
      while (i < j)
      {
        arrayOfb[i] = ((fd.b)fd.a(i / (j - 1), paramArrayOfObject[i]));
        i++;
      }
    }
  }

  public void a(fi paramfi)
  {
    this.f = paramfi;
  }

  public fe b()
  {
    AppMethodBeat.i(98872);
    Object localObject = this.e;
    int i = this.e.size();
    fd[] arrayOffd = new fd[i];
    for (int j = 0; j < i; j++)
      arrayOffd[j] = ((fd)((ArrayList)localObject).get(j)).d();
    localObject = new fe(arrayOffd);
    AppMethodBeat.o(98872);
    return localObject;
  }

  public String toString()
  {
    AppMethodBeat.i(98873);
    String str = " ";
    for (int i = 0; i < this.a; i++)
      str = str + ((fd)this.e.get(i)).a() + "  ";
    AppMethodBeat.o(98873);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.fe
 * JD-Core Version:    0.6.2
 */