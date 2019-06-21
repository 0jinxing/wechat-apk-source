package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cve extends btd
{
  public int vOq;
  public String vOy;
  public int wCB;
  public bpy xrg;
  public bpw xrh;
  public int xri;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124381);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wCB);
      paramArrayOfObject.iz(3, this.vOq);
      if (this.vOy != null)
        paramArrayOfObject.e(4, this.vOy);
      if (this.xrg != null)
      {
        paramArrayOfObject.iy(5, this.xrg.computeSize());
        this.xrg.writeFields(paramArrayOfObject);
      }
      if (this.xrh != null)
      {
        paramArrayOfObject.iy(6, this.xrh.computeSize());
        this.xrh.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.xri);
      AppMethodBeat.o(124381);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label845;
    label845: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wCB) + e.a.a.b.b.a.bs(3, this.vOq);
      i = paramInt;
      if (this.vOy != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vOy);
      paramInt = i;
      if (this.xrg != null)
        paramInt = i + e.a.a.a.ix(5, this.xrg.computeSize());
      i = paramInt;
      if (this.xrh != null)
        i = paramInt + e.a.a.a.ix(6, this.xrh.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(7, this.xri);
      AppMethodBeat.o(124381);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124381);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cve localcve = (cve)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124381);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcve.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(124381);
          paramInt = i;
          break;
        case 2:
          localcve.wCB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124381);
          paramInt = i;
          break;
        case 3:
          localcve.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124381);
          paramInt = i;
          break;
        case 4:
          localcve.vOy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124381);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bpy();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcve.xrg = paramArrayOfObject;
          }
          AppMethodBeat.o(124381);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bpw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcve.xrh = paramArrayOfObject;
          }
          AppMethodBeat.o(124381);
          paramInt = i;
          break;
        case 7:
          localcve.xri = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124381);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124381);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cve
 * JD-Core Version:    0.6.2
 */