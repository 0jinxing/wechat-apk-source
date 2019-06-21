package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class avu extends bsr
{
  public String fKh;
  public LinkedList<String> wzD;
  public int wzE;
  public int wzF;
  public cxh wzG;

  public avu()
  {
    AppMethodBeat.i(96252);
    this.wzD = new LinkedList();
    AppMethodBeat.o(96252);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96253);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      paramArrayOfObject.e(3, 1, this.wzD);
      paramArrayOfObject.iz(4, this.wzE);
      paramArrayOfObject.iz(5, this.wzF);
      if (this.wzG != null)
      {
        paramArrayOfObject.iy(6, this.wzG.computeSize());
        this.wzG.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(96253);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label699;
    label699: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      i = i + e.a.a.a.c(3, 1, this.wzD) + e.a.a.b.b.a.bs(4, this.wzE) + e.a.a.b.b.a.bs(5, this.wzF);
      paramInt = i;
      if (this.wzG != null)
        paramInt = i + e.a.a.a.ix(6, this.wzG.computeSize());
      AppMethodBeat.o(96253);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wzD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96253);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avu localavu = (avu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96253);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavu.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96253);
          paramInt = i;
          break;
        case 2:
          localavu.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96253);
          paramInt = i;
          break;
        case 3:
          localavu.wzD.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(96253);
          paramInt = i;
          break;
        case 4:
          localavu.wzE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96253);
          paramInt = i;
          break;
        case 5:
          localavu.wzF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96253);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavu.wzG = paramArrayOfObject;
          }
          AppMethodBeat.o(96253);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96253);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avu
 * JD-Core Version:    0.6.2
 */