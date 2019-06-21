package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class sf extends bsr
{
  public int Scene;
  public String ndF;
  public String ndG;
  public int ptD;
  public long ptF;
  public int ptw;
  public String vZx;
  public coa vZy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28362);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vZx != null)
        paramArrayOfObject.e(2, this.vZx);
      paramArrayOfObject.iz(3, this.ptw);
      paramArrayOfObject.iz(4, this.ptD);
      if (this.vZy != null)
      {
        paramArrayOfObject.iy(5, this.vZy.computeSize());
        this.vZy.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.ptF);
      paramArrayOfObject.iz(7, this.Scene);
      if (this.ndG != null)
        paramArrayOfObject.e(8, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(9, this.ndF);
      AppMethodBeat.o(28362);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label879;
    label879: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vZx != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vZx);
      i = i + e.a.a.b.b.a.bs(3, this.ptw) + e.a.a.b.b.a.bs(4, this.ptD);
      paramInt = i;
      if (this.vZy != null)
        paramInt = i + e.a.a.a.ix(5, this.vZy.computeSize());
      i = paramInt + e.a.a.b.b.a.o(6, this.ptF) + e.a.a.b.b.a.bs(7, this.Scene);
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.ndG);
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.ndF);
      AppMethodBeat.o(28362);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28362);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        sf localsf = (sf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28362);
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
            localsf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 2:
          localsf.vZx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 3:
          localsf.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 4:
          localsf.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new coa();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((coa)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localsf.vZy = ((coa)localObject1);
          }
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 6:
          localsf.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 7:
          localsf.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 8:
          localsf.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        case 9:
          localsf.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28362);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28362);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.sf
 * JD-Core Version:    0.6.2
 */