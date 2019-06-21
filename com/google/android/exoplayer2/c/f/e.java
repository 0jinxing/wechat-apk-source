package com.google.android.exoplayer2.c.f;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class e
  implements v.c
{
  private final List<Format> bbD;
  private final int flags;

  public e()
  {
    this(0);
  }

  public e(int paramInt)
  {
    this(paramInt, Collections.emptyList());
    AppMethodBeat.i(95098);
    AppMethodBeat.o(95098);
  }

  public e(int paramInt, List<Format> paramList)
  {
    AppMethodBeat.i(95099);
    this.flags = paramInt;
    Object localObject = paramList;
    if (!isSet(32))
    {
      localObject = paramList;
      if (paramList.isEmpty())
        localObject = Collections.singletonList(Format.as("application/cea-608"));
    }
    this.bbD = ((List)localObject);
    AppMethodBeat.o(95099);
  }

  private s a(v.b paramb)
  {
    AppMethodBeat.i(95102);
    if (isSet(32))
    {
      paramb = new s(this.bbD);
      AppMethodBeat.o(95102);
    }
    while (true)
    {
      return paramb;
      com.google.android.exoplayer2.i.l locall = new com.google.android.exoplayer2.i.l(paramb.bdK);
      paramb = this.bbD;
      while (locall.tB() > 0)
      {
        int i = locall.readUnsignedByte();
        int j = locall.readUnsignedByte();
        int k = locall.position;
        if (i == 134)
        {
          ArrayList localArrayList = new ArrayList();
          int m = locall.readUnsignedByte();
          i = 0;
          if (i < (m & 0x1F))
          {
            String str = locall.readString(3);
            int n = locall.readUnsignedByte();
            if ((n & 0x80) != 0)
            {
              i1 = 1;
              label132: if (i1 == 0)
                break label182;
              paramb = "application/cea-708";
            }
            for (int i1 = n & 0x3F; ; i1 = 1)
            {
              localArrayList.add(Format.a(null, paramb, 0, str, i1));
              locall.eM(2);
              i++;
              break;
              i1 = 0;
              break label132;
              label182: paramb = "application/cea-608";
            }
          }
          paramb = localArrayList;
        }
        locall.setPosition(k + j);
      }
      paramb = new s(paramb);
      AppMethodBeat.o(95102);
    }
  }

  private boolean isSet(int paramInt)
  {
    if ((this.flags & paramInt) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final v a(int paramInt, v.b paramb)
  {
    Object localObject = null;
    AppMethodBeat.i(95101);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(95101);
      paramb = localObject;
    case 3:
    case 4:
    case 15:
    case 129:
    case 135:
    case 130:
    case 138:
    case 2:
    case 27:
    case 36:
    case 134:
    case 21:
    case 89:
    }
    while (true)
    {
      return paramb;
      paramb = new o(new m(paramb.aOt));
      AppMethodBeat.o(95101);
      continue;
      if (isSet(2))
      {
        AppMethodBeat.o(95101);
        paramb = localObject;
      }
      else
      {
        paramb = new o(new d(false, paramb.aOt));
        AppMethodBeat.o(95101);
        continue;
        paramb = new o(new b(paramb.aOt));
        AppMethodBeat.o(95101);
        continue;
        paramb = new o(new f(paramb.aOt));
        AppMethodBeat.o(95101);
        continue;
        paramb = new o(new i());
        AppMethodBeat.o(95101);
        continue;
        if (isSet(4))
        {
          AppMethodBeat.o(95101);
          paramb = localObject;
        }
        else
        {
          paramb = new o(new j(a(paramb), isSet(1), isSet(8)));
          AppMethodBeat.o(95101);
          continue;
          paramb = new o(new k(a(paramb)));
          AppMethodBeat.o(95101);
          continue;
          if (isSet(16))
          {
            AppMethodBeat.o(95101);
            paramb = localObject;
          }
          else
          {
            paramb = new r(new t());
            AppMethodBeat.o(95101);
            continue;
            paramb = new o(new l());
            AppMethodBeat.o(95101);
            continue;
            paramb = new o(new g(paramb.bdJ));
            AppMethodBeat.o(95101);
          }
        }
      }
    }
  }

  public final SparseArray<v> rv()
  {
    AppMethodBeat.i(95100);
    SparseArray localSparseArray = new SparseArray();
    AppMethodBeat.o(95100);
    return localSparseArray;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.e
 * JD-Core Version:    0.6.2
 */