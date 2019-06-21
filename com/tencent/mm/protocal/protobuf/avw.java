package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class avw extends bsr
{
  public String fKh;
  public LinkedList<String> wzD;
  public int wzF;
  public cxh wzG;
  public String wzI;

  public avw()
  {
    AppMethodBeat.i(96255);
    this.wzD = new LinkedList();
    AppMethodBeat.o(96255);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96256);
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
      paramArrayOfObject.e(3, 1, this.wzD);
      paramArrayOfObject.iz(4, this.wzF);
      if (this.wzG != null)
      {
        paramArrayOfObject.iy(5, this.wzG.computeSize());
        this.wzG.writeFields(paramArrayOfObject);
      }
      if (this.wzI != null)
        paramArrayOfObject.e(6, this.wzI);
      AppMethodBeat.o(96256);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label719;
    label719: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      i = i + e.a.a.a.c(3, 1, this.wzD) + e.a.a.b.b.a.bs(4, this.wzF);
      paramInt = i;
      if (this.wzG != null)
        paramInt = i + e.a.a.a.ix(5, this.wzG.computeSize());
      i = paramInt;
      if (this.wzI != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wzI);
      AppMethodBeat.o(96256);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wzD.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96256);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        avw localavw = (avw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96256);
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
            localavw.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(96256);
          paramInt = i;
          break;
        case 2:
          localavw.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96256);
          paramInt = i;
          break;
        case 3:
          localavw.wzD.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(96256);
          paramInt = i;
          break;
        case 4:
          localavw.wzF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96256);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cxh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cxh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localavw.wzG = ((cxh)localObject1);
          }
          AppMethodBeat.o(96256);
          paramInt = i;
          break;
        case 6:
          localavw.wzI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96256);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96256);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.avw
 * JD-Core Version:    0.6.2
 */