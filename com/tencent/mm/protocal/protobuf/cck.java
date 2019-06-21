package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cck extends btd
{
  public int jCt;
  public String ptv;
  public int ptw;
  public int ptx;
  public long vQE;
  public int wFB;
  public LinkedList<caq> wFC;
  public caq xbP;

  public cck()
  {
    AppMethodBeat.i(94621);
    this.wFC = new LinkedList();
    AppMethodBeat.o(94621);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94622);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(94622);
        throw paramArrayOfObject;
      }
      if (this.xbP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BufferUrl");
        AppMethodBeat.o(94622);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.ptw);
      if (this.ptv != null)
        paramArrayOfObject.e(4, this.ptv);
      if (this.xbP != null)
      {
        paramArrayOfObject.iy(5, this.xbP.computeSize());
        this.xbP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.wFB);
      paramArrayOfObject.e(7, 8, this.wFC);
      paramArrayOfObject.ai(8, this.vQE);
      paramArrayOfObject.iz(9, this.jCt);
      AppMethodBeat.o(94622);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1019;
    label1019: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptx) + e.a.a.b.b.a.bs(3, this.ptw);
      paramInt = i;
      if (this.ptv != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ptv);
      i = paramInt;
      if (this.xbP != null)
        i = paramInt + e.a.a.a.ix(5, this.xbP.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(6, this.wFB) + e.a.a.a.c(7, 8, this.wFC) + e.a.a.b.b.a.o(8, this.vQE) + e.a.a.b.b.a.bs(9, this.jCt);
      AppMethodBeat.o(94622);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wFC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(94622);
          throw paramArrayOfObject;
        }
        if (this.xbP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BufferUrl");
          AppMethodBeat.o(94622);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94622);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cck localcck = (cck)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94622);
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
            localcck.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 2:
          localcck.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 3:
          localcck.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 4:
          localcck.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new caq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcck.xbP = paramArrayOfObject;
          }
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 6:
          localcck.wFB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new caq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcck.wFC.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 8:
          localcck.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        case 9:
          localcck.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94622);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94622);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cck
 * JD-Core Version:    0.6.2
 */