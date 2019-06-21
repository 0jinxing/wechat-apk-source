package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bwb extends bsr
{
  public String Md5;
  public String guQ;
  public int vHo;
  public int vRy;
  public dv wWQ;
  public String wWR;
  public String wWS;
  public int wWT;
  public int wdW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28629);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wWQ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Msg");
        AppMethodBeat.o(28629);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wWQ != null)
      {
        paramArrayOfObject.iy(2, this.wWQ.computeSize());
        this.wWQ.writeFields(paramArrayOfObject);
      }
      if (this.wWR != null)
        paramArrayOfObject.e(3, this.wWR);
      paramArrayOfObject.iz(4, this.wdW);
      if (this.Md5 != null)
        paramArrayOfObject.e(5, this.Md5);
      paramArrayOfObject.iz(6, this.vHo);
      if (this.guQ != null)
        paramArrayOfObject.e(7, this.guQ);
      if (this.wWS != null)
        paramArrayOfObject.e(8, this.wWS);
      paramArrayOfObject.iz(9, this.wWT);
      paramArrayOfObject.iz(10, this.vRy);
      AppMethodBeat.o(28629);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label996;
    label996: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wWQ != null)
        paramInt = i + e.a.a.a.ix(2, this.wWQ.computeSize());
      i = paramInt;
      if (this.wWR != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wWR);
      i += e.a.a.b.b.a.bs(4, this.wdW);
      paramInt = i;
      if (this.Md5 != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.Md5);
      i = paramInt + e.a.a.b.b.a.bs(6, this.vHo);
      paramInt = i;
      if (this.guQ != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.guQ);
      i = paramInt;
      if (this.wWS != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wWS);
      paramInt = i + e.a.a.b.b.a.bs(9, this.wWT) + e.a.a.b.b.a.bs(10, this.vRy);
      AppMethodBeat.o(28629);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wWQ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Msg");
          AppMethodBeat.o(28629);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28629);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwb localbwb = (bwb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28629);
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
            localbwb.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new dv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((dv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbwb.wWQ = ((dv)localObject1);
          }
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 3:
          localbwb.wWR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 4:
          localbwb.wdW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 5:
          localbwb.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 6:
          localbwb.vHo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 7:
          localbwb.guQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 8:
          localbwb.wWS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 9:
          localbwb.wWT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        case 10:
          localbwb.vRy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28629);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28629);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwb
 * JD-Core Version:    0.6.2
 */