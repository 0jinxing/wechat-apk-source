package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bee extends bsr
{
  public int Scene;
  public int vOs;
  public int wHN;
  public b wHO;
  public int wHP;
  public b wHQ;
  public String wHR;
  public String wHS;
  public String wHT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(81502);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vOs);
      paramArrayOfObject.iz(3, this.wHN);
      if (this.wHO != null)
        paramArrayOfObject.c(4, this.wHO);
      paramArrayOfObject.iz(5, this.wHP);
      if (this.wHQ != null)
        paramArrayOfObject.c(6, this.wHQ);
      if (this.wHR != null)
        paramArrayOfObject.e(7, this.wHR);
      if (this.wHS != null)
        paramArrayOfObject.e(8, this.wHS);
      if (this.wHT != null)
        paramArrayOfObject.e(9, this.wHT);
      paramArrayOfObject.iz(10, this.Scene);
      AppMethodBeat.o(81502);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label834;
    label834: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOs) + e.a.a.b.b.a.bs(3, this.wHN);
      paramInt = i;
      if (this.wHO != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.wHO);
      i = paramInt + e.a.a.b.b.a.bs(5, this.wHP);
      paramInt = i;
      if (this.wHQ != null)
        paramInt = i + e.a.a.b.b.a.b(6, this.wHQ);
      i = paramInt;
      if (this.wHR != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wHR);
      paramInt = i;
      if (this.wHS != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wHS);
      i = paramInt;
      if (this.wHT != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wHT);
      paramInt = i + e.a.a.b.b.a.bs(10, this.Scene);
      AppMethodBeat.o(81502);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(81502);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bee localbee = (bee)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(81502);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbee.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 2:
          localbee.vOs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 3:
          localbee.wHN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 4:
          localbee.wHO = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 5:
          localbee.wHP = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 6:
          localbee.wHQ = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 7:
          localbee.wHR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 8:
          localbee.wHS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 9:
          localbee.wHT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        case 10:
          localbee.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(81502);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(81502);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bee
 * JD-Core Version:    0.6.2
 */