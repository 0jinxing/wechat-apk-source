package com.bumptech.glide.c;

import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.d.a.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;
import java.util.List;

public final class g
{
  public static f.a a(List<f> paramList, InputStream paramInputStream, b paramb)
  {
    AppMethodBeat.i(91677);
    if (paramInputStream == null)
    {
      paramList = f.a.ayZ;
      AppMethodBeat.o(91677);
    }
    while (true)
    {
      return paramList;
      Object localObject = paramInputStream;
      if (!paramInputStream.markSupported())
        localObject = new m(paramInputStream, paramb);
      ((InputStream)localObject).mark(5242880);
      int i = paramList.size();
      int j = 0;
      if (j < i)
        paramInputStream = (f)paramList.get(j);
      try
      {
        paramInputStream = paramInputStream.c((InputStream)localObject);
        paramb = f.a.ayZ;
        if (paramInputStream != paramb)
        {
          ((InputStream)localObject).reset();
          AppMethodBeat.o(91677);
          paramList = paramInputStream;
        }
        else
        {
          ((InputStream)localObject).reset();
          j++;
        }
      }
      finally
      {
        ((InputStream)localObject).reset();
        AppMethodBeat.o(91677);
      }
    }
  }

  public static int b(List<f> paramList, InputStream paramInputStream, b paramb)
  {
    AppMethodBeat.i(91678);
    int i;
    if (paramInputStream == null)
    {
      AppMethodBeat.o(91678);
      i = -1;
    }
    while (true)
    {
      return i;
      Object localObject = paramInputStream;
      if (!paramInputStream.markSupported())
        localObject = new m(paramInputStream, paramb);
      ((InputStream)localObject).mark(5242880);
      int j = paramList.size();
      i = 0;
      if (i < j)
        paramInputStream = (f)paramList.get(i);
      try
      {
        int k = paramInputStream.a((InputStream)localObject, paramb);
        if (k != -1)
        {
          ((InputStream)localObject).reset();
          AppMethodBeat.o(91678);
          i = k;
        }
        else
        {
          ((InputStream)localObject).reset();
          i++;
        }
      }
      finally
      {
        ((InputStream)localObject).reset();
        AppMethodBeat.o(91678);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.g
 * JD-Core Version:    0.6.2
 */