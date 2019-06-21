package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cn extends com.tencent.mm.bt.a
{
  public int nao;
  public int pcX;
  public long ptF;
  public int vEI;
  public bts vEJ;
  public int vEK;
  public bts vEL;
  public int vEM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58885);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vEJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ChatRoomId");
        AppMethodBeat.o(58885);
        throw paramArrayOfObject;
      }
      if (this.vEL == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DigestContent");
        AppMethodBeat.o(58885);
        throw paramArrayOfObject;
      }
      if (this.vEJ != null)
      {
        paramArrayOfObject.iy(1, this.vEJ.computeSize());
        this.vEJ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.ptF);
      paramArrayOfObject.iz(3, this.vEI);
      paramArrayOfObject.iz(4, this.pcX);
      paramArrayOfObject.iz(5, this.vEK);
      if (this.vEL != null)
      {
        paramArrayOfObject.iy(6, this.vEL.computeSize());
        this.vEL.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.vEM);
      paramArrayOfObject.iz(8, this.nao);
      AppMethodBeat.o(58885);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vEJ == null)
        break label857;
    label857: for (paramInt = e.a.a.a.ix(1, this.vEJ.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.ptF) + e.a.a.b.b.a.bs(3, this.vEI) + e.a.a.b.b.a.bs(4, this.pcX) + e.a.a.b.b.a.bs(5, this.vEK);
      paramInt = i;
      if (this.vEL != null)
        paramInt = i + e.a.a.a.ix(6, this.vEL.computeSize());
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.vEM) + e.a.a.b.b.a.bs(8, this.nao);
      AppMethodBeat.o(58885);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vEJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ChatRoomId");
          AppMethodBeat.o(58885);
          throw paramArrayOfObject;
        }
        if (this.vEL == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DigestContent");
          AppMethodBeat.o(58885);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58885);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cn localcn = (cn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58885);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcn.vEJ = ((bts)localObject1);
          }
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        case 2:
          localcn.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        case 3:
          localcn.vEI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        case 4:
          localcn.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        case 5:
          localcn.vEK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcn.vEL = paramArrayOfObject;
          }
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        case 7:
          localcn.vEM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        case 8:
          localcn.nao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58885);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58885);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cn
 * JD-Core Version:    0.6.2
 */