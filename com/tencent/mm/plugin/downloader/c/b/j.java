package com.tencent.mm.plugin.downloader.c.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class j extends com.tencent.mm.bt.a
{
  public a kLA;
  public c kLw;
  public d kLx;
  public f kLy;
  public k kLz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35536);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kLw == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: base_info");
        AppMethodBeat.o(35536);
        throw paramArrayOfObject;
      }
      if (this.kLw != null)
      {
        paramArrayOfObject.iy(1, this.kLw.computeSize());
        this.kLw.writeFields(paramArrayOfObject);
      }
      if (this.kLx != null)
      {
        paramArrayOfObject.iy(2, this.kLx.computeSize());
        this.kLx.writeFields(paramArrayOfObject);
      }
      if (this.kLy != null)
      {
        paramArrayOfObject.iy(3, this.kLy.computeSize());
        this.kLy.writeFields(paramArrayOfObject);
      }
      if (this.kLz != null)
      {
        paramArrayOfObject.iy(4, this.kLz.computeSize());
        this.kLz.writeFields(paramArrayOfObject);
      }
      if (this.kLA != null)
      {
        paramArrayOfObject.iy(5, this.kLA.computeSize());
        this.kLA.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(35536);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kLw == null)
        break label1004;
    label1004: for (i = e.a.a.a.ix(1, this.kLw.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.kLx != null)
        paramInt = i + e.a.a.a.ix(2, this.kLx.computeSize());
      i = paramInt;
      if (this.kLy != null)
        i = paramInt + e.a.a.a.ix(3, this.kLy.computeSize());
      paramInt = i;
      if (this.kLz != null)
        paramInt = i + e.a.a.a.ix(4, this.kLz.computeSize());
      i = paramInt;
      if (this.kLA != null)
        i = paramInt + e.a.a.a.ix(5, this.kLA.computeSize());
      AppMethodBeat.o(35536);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.kLw == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: base_info");
          AppMethodBeat.o(35536);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(35536);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        j localj = (j)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35536);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new c();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.kLw = paramArrayOfObject;
          }
          AppMethodBeat.o(35536);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.kLx = paramArrayOfObject;
          }
          AppMethodBeat.o(35536);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new f();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.kLy = paramArrayOfObject;
          }
          AppMethodBeat.o(35536);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new k();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((k)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.kLz = ((k)localObject1);
          }
          AppMethodBeat.o(35536);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localj.kLA = paramArrayOfObject;
          }
          AppMethodBeat.o(35536);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35536);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.b.j
 * JD-Core Version:    0.6.2
 */