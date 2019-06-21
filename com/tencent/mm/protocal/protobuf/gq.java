package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class gq extends bsr
{
  public int Scene;
  public long jBP;
  public int vIN;
  public LinkedList<ua> vIO;
  public String vIP;
  public String vIQ;
  public String vIR;
  public String vIS;

  public gq()
  {
    AppMethodBeat.i(28327);
    this.vIO = new LinkedList();
    AppMethodBeat.o(28327);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28328);
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
      if (this.vIS != null)
        paramArrayOfObject.e(9, this.vIS);
      AppMethodBeat.o(28328);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label882;
    label882: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
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
      i = paramInt;
      if (this.vIS != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vIS);
      AppMethodBeat.o(28328);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vIO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28328);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gq localgq = (gq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28328);
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
            localgq.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        case 2:
          localgq.vIN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28328);
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
            localgq.vIO.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        case 4:
          localgq.vIP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        case 5:
          localgq.vIQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        case 6:
          localgq.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        case 7:
          localgq.jBP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        case 8:
          localgq.vIR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        case 9:
          localgq.vIS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28328);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28328);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gq
 * JD-Core Version:    0.6.2
 */