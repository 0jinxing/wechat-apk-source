package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class axq extends bsr
{
  public String fKh;
  public cwf wBB;
  public cxm wBC;
  public cxe wBD;
  public cyb wBE;
  public cxj wBF;
  public cxn wBG;
  public int wBH;
  public int wsv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96273);
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
      if (this.wBB != null)
      {
        paramArrayOfObject.iy(3, this.wBB.computeSize());
        this.wBB.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(4, this.wsv);
      if (this.wBC != null)
      {
        paramArrayOfObject.iy(5, this.wBC.computeSize());
        this.wBC.writeFields(paramArrayOfObject);
      }
      if (this.wBD != null)
      {
        paramArrayOfObject.iy(6, this.wBD.computeSize());
        this.wBD.writeFields(paramArrayOfObject);
      }
      if (this.wBE != null)
      {
        paramArrayOfObject.iy(7, this.wBE.computeSize());
        this.wBE.writeFields(paramArrayOfObject);
      }
      if (this.wBF != null)
      {
        paramArrayOfObject.iy(8, this.wBF.computeSize());
        this.wBF.writeFields(paramArrayOfObject);
      }
      if (this.wBG != null)
      {
        paramArrayOfObject.iy(9, this.wBG.computeSize());
        this.wBG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.wBH);
      AppMethodBeat.o(96273);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1436;
    label1436: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
      i = paramInt;
      if (this.wBB != null)
        i = paramInt + e.a.a.a.ix(3, this.wBB.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(4, this.wsv);
      i = paramInt;
      if (this.wBC != null)
        i = paramInt + e.a.a.a.ix(5, this.wBC.computeSize());
      paramInt = i;
      if (this.wBD != null)
        paramInt = i + e.a.a.a.ix(6, this.wBD.computeSize());
      i = paramInt;
      if (this.wBE != null)
        i = paramInt + e.a.a.a.ix(7, this.wBE.computeSize());
      paramInt = i;
      if (this.wBF != null)
        paramInt = i + e.a.a.a.ix(8, this.wBF.computeSize());
      i = paramInt;
      if (this.wBG != null)
        i = paramInt + e.a.a.a.ix(9, this.wBG.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(10, this.wBH);
      AppMethodBeat.o(96273);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96273);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        axq localaxq = (axq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96273);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxq.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 2:
          localaxq.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cwf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cwf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxq.wBB = ((cwf)localObject1);
          }
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 4:
          localaxq.wsv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxq.wBC = paramArrayOfObject;
          }
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxe();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxq.wBD = paramArrayOfObject;
          }
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cyb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxq.wBE = paramArrayOfObject;
          }
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxq.wBF = ((cxj)localObject1);
          }
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cxn();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaxq.wBG = paramArrayOfObject;
          }
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        case 10:
          localaxq.wBH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96273);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96273);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axq
 * JD-Core Version:    0.6.2
 */