package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class akp extends bsr
{
  public int Scene;
  public int nbk;
  public String wdO;
  public int wqg;
  public LinkedList<bbl> wqh;
  public int wqi;
  public LinkedList<azc> wqj;

  public akp()
  {
    AppMethodBeat.i(73707);
    this.wqh = new LinkedList();
    this.wqj = new LinkedList();
    AppMethodBeat.o(73707);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73708);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.nbk);
      if (this.wdO != null)
        paramArrayOfObject.e(3, this.wdO);
      paramArrayOfObject.iz(4, this.wqg);
      paramArrayOfObject.e(5, 8, this.wqh);
      paramArrayOfObject.iz(6, this.wqi);
      paramArrayOfObject.e(7, 8, this.wqj);
      paramArrayOfObject.iz(8, this.Scene);
      AppMethodBeat.o(73708);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label861;
    label861: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.nbk);
      paramInt = i;
      if (this.wdO != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wdO);
      paramInt = paramInt + e.a.a.b.b.a.bs(4, this.wqg) + e.a.a.a.c(5, 8, this.wqh) + e.a.a.b.b.a.bs(6, this.wqi) + e.a.a.a.c(7, 8, this.wqj) + e.a.a.b.b.a.bs(8, this.Scene);
      AppMethodBeat.o(73708);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wqh.clear();
        this.wqj.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73708);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        akp localakp = (akp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73708);
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
            localakp.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        case 2:
          localakp.nbk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        case 3:
          localakp.wdO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        case 4:
          localakp.wqg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bbl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakp.wqh.add(paramArrayOfObject);
          }
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        case 6:
          localakp.wqi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new azc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localakp.wqj.add(paramArrayOfObject);
          }
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        case 8:
          localakp.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73708);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73708);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.akp
 * JD-Core Version:    0.6.2
 */