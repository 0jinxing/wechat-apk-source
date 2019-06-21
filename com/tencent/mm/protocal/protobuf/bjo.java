package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bjo extends bsr
{
  public int vAM;
  public int vRK;
  public aw vRP;
  public String wMV;
  public String wMW;
  public b wMX;
  public int wMY;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56903);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wMV != null)
        paramArrayOfObject.e(2, this.wMV);
      if (this.wMW != null)
        paramArrayOfObject.e(3, this.wMW);
      if (this.wMX != null)
        paramArrayOfObject.c(4, this.wMX);
      paramArrayOfObject.iz(5, this.vRK);
      paramArrayOfObject.iz(6, this.vAM);
      paramArrayOfObject.iz(7, this.wMY);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(8, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56903);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label812;
    label812: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wMV != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wMV);
      i = paramInt;
      if (this.wMW != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wMW);
      paramInt = i;
      if (this.wMX != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.wMX);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vRK) + e.a.a.b.b.a.bs(6, this.vAM) + e.a.a.b.b.a.bs(7, this.wMY);
      paramInt = i;
      if (this.vRP != null)
        paramInt = i + e.a.a.a.ix(8, this.vRP.computeSize());
      AppMethodBeat.o(56903);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56903);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjo localbjo = (bjo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56903);
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
            localbjo.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        case 2:
          localbjo.wMV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        case 3:
          localbjo.wMW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        case 4:
          localbjo.wMX = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        case 5:
          localbjo.vRK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        case 6:
          localbjo.vAM = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        case 7:
          localbjo.wMY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbjo.vRP = paramArrayOfObject;
          }
          AppMethodBeat.o(56903);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56903);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjo
 * JD-Core Version:    0.6.2
 */