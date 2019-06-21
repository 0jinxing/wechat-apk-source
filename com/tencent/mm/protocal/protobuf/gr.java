package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class gr extends bsr
{
  public int Scene;
  public long jBP;
  public int vIN;
  public LinkedList<ua> vIO;
  public String vIP;
  public String vIQ;
  public String vIR;

  public gr()
  {
    AppMethodBeat.i(28329);
    this.vIO = new LinkedList();
    AppMethodBeat.o(28329);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28330);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vIN);
      paramArrayOfObject.e(3, 8, this.vIO);
      if (this.vIP != null)
        paramArrayOfObject.e(4, this.vIP);
      if (this.vIQ != null)
        paramArrayOfObject.e(5, this.vIQ);
      paramArrayOfObject.iz(6, this.Scene);
      paramArrayOfObject.ai(7, this.jBP);
      if (this.vIR != null)
        paramArrayOfObject.e(8, this.vIR);
      AppMethodBeat.o(28330);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label815;
    label815: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vIN) + e.a.a.a.c(3, 8, this.vIO);
      paramInt = i;
      if (this.vIP != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vIP);
      i = paramInt;
      if (this.vIQ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vIQ);
      i = i + e.a.a.b.b.a.bs(6, this.Scene) + e.a.a.b.b.a.o(7, this.jBP);
      paramInt = i;
      if (this.vIR != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vIR);
      AppMethodBeat.o(28330);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vIO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28330);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gr localgr = (gr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28330);
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
            localgr.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        case 2:
          localgr.vIN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ua();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgr.vIO.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        case 4:
          localgr.vIP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        case 5:
          localgr.vIQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        case 6:
          localgr.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        case 7:
          localgr.jBP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        case 8:
          localgr.vIR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28330);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28330);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gr
 * JD-Core Version:    0.6.2
 */