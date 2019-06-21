package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class h extends com.tencent.mm.bt.a
{
  public d kKy;
  public String kKz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35516);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kKy == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: app_info");
        AppMethodBeat.o(35516);
        throw paramArrayOfObject;
      }
      if (this.kKy != null)
      {
        paramArrayOfObject.iy(1, this.kKy.computeSize());
        this.kKy.writeFields(paramArrayOfObject);
      }
      if (this.kKz != null)
        paramArrayOfObject.e(2, this.kKz);
      AppMethodBeat.o(35516);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kKy == null)
        break label435;
    label435: for (i = e.a.a.a.ix(1, this.kKy.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kKz != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.kKz);
      AppMethodBeat.o(35516);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.kKy == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: app_info");
          AppMethodBeat.o(35516);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(35516);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        h localh = (h)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(35516);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((d)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localh.kKy = ((d)localObject1);
          }
          AppMethodBeat.o(35516);
          paramInt = i;
          break;
        case 2:
          localh.kKz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(35516);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(35516);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.a.a.h
 * JD-Core Version:    0.6.2
 */