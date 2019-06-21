package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.c.b.j;
import e.a.a.b;
import java.util.LinkedList;

public final class d extends com.tencent.mm.bt.a
{
  public j kKr;
  public e kKs;
  public c kKt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35511);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kKr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: app_info");
        AppMethodBeat.o(35511);
        throw paramArrayOfObject;
      }
      if (this.kKr != null)
      {
        paramArrayOfObject.iy(1, this.kKr.computeSize());
        this.kKr.writeFields(paramArrayOfObject);
      }
      if (this.kKs != null)
      {
        paramArrayOfObject.iy(2, this.kKs.computeSize());
        this.kKs.writeFields(paramArrayOfObject);
      }
      if (this.kKt != null)
      {
        paramArrayOfObject.iy(3, this.kKt.computeSize());
        this.kKt.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(35511);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kKr == null)
        break label691;
    label691: for (i = e.a.a.a.ix(1, this.kKr.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kKs != null)
        paramInt = i + e.a.a.a.ix(2, this.kKs.computeSize());
      i = paramInt;
      if (this.kKt != null)
        i = paramInt + e.a.a.a.ix(3, this.kKt.computeSize());
      AppMethodBeat.o(35511);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.kKr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: app_info");
          AppMethodBeat.o(35511);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(35511);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        d locald = (d)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35511);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new j();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.kKr = paramArrayOfObject;
          }
          AppMethodBeat.o(35511);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.kKs = ((e)localObject1);
          }
          AppMethodBeat.o(35511);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new c();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((c)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locald.kKt = ((c)localObject1);
          }
          AppMethodBeat.o(35511);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35511);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.a.a.d
 * JD-Core Version:    0.6.2
 */